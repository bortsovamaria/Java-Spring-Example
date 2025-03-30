package learn.school.service;

import learn.school.repository.MyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MyServiceImpl implements MyService {

    private final MyRepository repository;

    @Autowired // в новых версиях уже так не пишут, вместо конструктора используют @RequiredArgsContructor
    public MyServiceImpl(MyRepository repository) {
        this.repository = repository;
    }


    @Override
    public void test() {
        long count = repository.count();
        log.info("some logic with count = {}...", count);
    }
}