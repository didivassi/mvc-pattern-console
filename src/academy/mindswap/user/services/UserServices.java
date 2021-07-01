package academy.mindswap.user.services;

import academy.mindswap.user.models.User;

import java.util.List;
import java.util.Optional;

public interface UserServices {
    Optional<User> getUser(int id);
    List<User> getUsers();
    boolean editUsername(int id, String username);
    boolean editPassword(int id, String password);
    boolean editEmail(int id, String email);
    boolean deleteUser(int id);
}
