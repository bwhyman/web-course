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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

@WebServlet("/api/getuser")
public class GetUserServlet extends HttpServlet {
    private static final JsonMapper mapper = JacksonUtils.getMapper();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var uid = req.getParameter("uid");
        User user = null;
        String sql = "select * from user where id=?";
        try (Connection conn = DataSourceUtils.getConnection();
             PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, uid);
            try (ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    user = new User();
                    user.setId(rs.getInt("id"));
                    user.setName(rs.getString("name"));
                    user.setInsertTime(rs.getObject("insert_time", LocalDateTime.class));
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        resp.getWriter().write(mapper.writeValueAsString(user));
    }
}
