package org.sarsandi.rajeev.validationdemo.repository;

import org.sarsandi.rajeev.validationdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserId(int userId);
}
