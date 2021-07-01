package academy.mindswap.user.services;

import academy.mindswap.user.models.User;

import java.util.Optional;

public interface AuthenticationServices {

      Optional<User> authenticate(String username, String password);
}
