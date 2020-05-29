package pznuBackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pznuBackend.model.LoggedUser;
import pznuBackend.repositories.LoggedUserRepository;

@Service
public class LoggedUserService {
    @Autowired
    private LoggedUserRepository loggedUserRepository;

    public LoggedUser userByIdNoPassword(int id) {
        return loggedUserRepository.userByIdNoPassword(id);
    }
}
