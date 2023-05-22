package de.c4u.scms.persistence.service;

import de.c4u.scms.persistence.entity.User;
import de.c4u.scms.persistence.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var optionalUser = this.userRepository.findByUsername(username);
        var user = optionalUser.orElseThrow(() -> new UsernameNotFoundException(username));

        return new UsersDetails(user);
    }

    @Override
    public List<User> getALl() {
        return this.userRepository.findAll();
    }

    @Override
    public User create(String username, String password) {
        var user = new User();
        user.setUsername(username);
        user.setPassword(this.passwordEncoder.encode(password));

        return this.userRepository.save(user);
    }
}
