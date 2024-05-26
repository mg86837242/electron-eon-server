package dev.by.user.dao;

import dev.by.user.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserDao {

    List<User> selectAllUsers();

    Optional<User> selectUserById(UUID userId);

    Optional<User> selectUserByEmail(String email);

    boolean existsUserById(UUID userId);

    boolean existsUserByEmail(String email);

    void insertUser(User user);

    void updateUser(User update);

    void deleteUserById(UUID userId);
}
