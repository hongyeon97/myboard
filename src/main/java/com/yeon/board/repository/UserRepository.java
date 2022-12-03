package com.yeon.board.repository;

import com.yeon.board.model.Board;
import com.yeon.board.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
