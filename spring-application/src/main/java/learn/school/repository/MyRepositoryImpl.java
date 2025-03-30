package learn.school.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepositoryImpl implements MyRepository {

    public long count() {
        return 1L;
    }
}
