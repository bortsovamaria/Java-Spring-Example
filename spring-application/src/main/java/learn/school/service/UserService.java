package learn.school.service;

import learn.school.dto.UserDto;

public interface UserService {

    UserDto findById(long id);
}
