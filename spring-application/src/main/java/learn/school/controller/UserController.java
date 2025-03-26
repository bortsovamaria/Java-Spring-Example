package learn.school.controller;

import learn.school.repository.UserDto;
import learn.school.repository.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("{id}")
    public UserDto getUserById(@PathVariable long id) {
        return userService.findById(id);
    }
}
