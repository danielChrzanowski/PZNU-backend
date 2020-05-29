package pznuBackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pznuBackend.model.User;
import pznuBackend.repositories.UserRepository;


@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

/*
        public List<User> getAllUsers() {
            List<User> users = new ArrayList<>();
            userRepository.findAll().forEach(users::add);
            return users;
        }
*/

    /*
    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }
*/

    public User userByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        User user = userRepository.findByLogin(login);
        if (user != null) {
            return user;
        }
        throw new UsernameNotFoundException("Nie znaleziono użytkownika: " + login);
    }
}
