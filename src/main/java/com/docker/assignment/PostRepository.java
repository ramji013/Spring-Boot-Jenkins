package com.docker.assignment;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docker.assignment.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
