package com.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.entity.User;
import com.service.UserService;
import com.util.DataSourceUtils;

public class UserServiceImpl implements UserService {
    private static Logger logger = Logger.getLogger(UserServiceImpl.class.getName());
    @Override
    public void addUser(String newName) {
        String sql = "INSERT INTO user(name) VALUES(?)";
        try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, newName);
            st.executeUpdate();
        }catch (SQLException e) {
            logger.warning(e.getMessage());
        }
    }

    @Override
    public List<User> listUsers() {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM User";
        try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery()) {
            while (rs.next()) {
                User user = new User(rs.getInt("id"), rs.getString("name"), rs.getTimestamp("inserttime"));
                users.add(user);
            }
        } catch (SQLException e) {
            logger.warning(e.getMessage());
        }
        return users;
    }

    @Override
    public User getUser(int id) {
        User user = null;
        String sql = "SELECT * FROM user WHERE id=?";
        try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql)) {
            st.setInt(1, id);
            try(ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    user = new User(rs.getInt("id"), rs.getString("name"), rs.getTimestamp("inserttime"));
                }
            }
        } catch (SQLException e) {
            logger.warning(e.getMessage());
        }
        return user;
    }

    @Override
    public void updateUser(User user) {
        String sql = "UPDATE user SET name=? WHERE id=?";
        try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, user.getName());
            st.setInt(2,user.getId());
            st.executeUpdate();
        }catch (SQLException e) {
            logger.warning(e.getMessage());
        }
    }
}
