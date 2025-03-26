package learn.school.service;

import learn.school.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

    private final MyRepository repository;

    @Autowired
    public MyServiceImpl(MyRepository repository) {
        this.repository = repository;
    }
}