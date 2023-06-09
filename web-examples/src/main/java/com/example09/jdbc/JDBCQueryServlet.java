package com.example09.jdbc;

import com.example09.jdbc.entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/jdbc/query")
public class JDBCQueryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = null;
        String sql = "SELECT * FROM user WHERE id=?";
        try (Connection conn = DataSourceUtils.getConnection();
             PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, req.getParameter("userid"));
            try (ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    user = new User();
                    user.setId(rs.getInt("id"));
                    user.setName(rs.getString("name"));
                    user.setInsertTime(rs.getTimestamp("inserttime"));
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        req.setAttribute("user", user);
        req.getRequestDispatcher("/WEB-INF/jdbc/query.jsp")
                .forward(req, resp);
    }
}
