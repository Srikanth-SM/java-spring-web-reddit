package com.siro.redditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siro.redditclone.model.Comment;

public interface CommentRepository  extends JpaRepository<Comment, Long>{

}