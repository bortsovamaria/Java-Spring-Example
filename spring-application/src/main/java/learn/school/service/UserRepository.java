package learn.school.service;

import learn.school.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    
    List<User> findByLastName(String lastName);
    
    @Query("SELECT u FROM User u WHERE u.email = ?1")
    User findByEmail(String email);
    
    Page<User> findByAgeGreaterThan(int age, Pageable pageable);
}