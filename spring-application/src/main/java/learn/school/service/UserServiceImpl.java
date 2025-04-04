package learn.school.service;

import jakarta.persistence.EntityNotFoundException;
import learn.school.entity.User;
import learn.school.dto.UserDto;
import learn.school.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserDto findById(long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(String.format(
                "User with id = %d not found", id
        )));
        return new UserDto(user.getId(), user.getUsername(), user.getPassword()); // или использовать mapstruct
    }
}
