package com.siro.redditclone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siro.redditclone.model.Comment;
import com.siro.redditclone.model.Link;

public interface CommentRepository extends JpaRepository<Comment, Long> {
	List<Comment> findByLink(Link link);

}