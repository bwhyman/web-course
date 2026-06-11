package com.controller;

import com.entity.User;
import com.util.DataSourceUtils;

import com.util.JacksonUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tools.jackson.databind.json.JsonMapper;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

@WebServlet("/api/updateuser")
public class UpdateUserServlet extends HttpServlet {
    private static final JsonMapper mapper = JacksonUtils.getMapper();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = mapper.readValue(req.getInputStream(), User.class);
        String sql = "update user set name=? where id=?";
        try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, user.getName());
            st.setInt(2, user.getId());
            st.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        resp.getWriter().write(mapper.writeValueAsString(Map.of("code", 0)));
    }
}
