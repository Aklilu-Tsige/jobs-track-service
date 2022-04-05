package org.aklilu.testlab4tech.repository;

import org.aklilu.testlab4tech.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
