package com.rustam.ci_cd_github_actions.dao.repository;

import com.rustam.ci_cd_github_actions.dao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
