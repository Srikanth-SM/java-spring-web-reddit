package com.siro.redditclone.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siro.redditclone.model.Comment;
import com.siro.redditclone.model.Link;
import com.siro.redditclone.repository.CommentRepository;

@Service
public class CommentService {

	private CommentRepository commentRepository;
	private LinkService linkService;

	@Autowired
	public CommentService(CommentRepository commentRepository, LinkService linkService) {
		super();
		this.commentRepository = commentRepository;
		this.linkService = linkService;
	}

	public Comment postCommentForLink(Long linkId, Comment comment) {

		Optional<Link> optionalLink = linkService.getLinkById(linkId);
		if (optionalLink.isPresent()) {
			comment.setLink(optionalLink.get());
			return commentRepository.save(comment);
		}
		return null;
	}

	public List<Comment> getAllCommentsByLinkId(Long linkId) {
		Optional<Link> optionalLink = linkService.getLinkById(linkId);
		if (optionalLink.isPresent()) {
			return commentRepository.findByLink(optionalLink.get());
		}
		return null;

	}

	public Comment getCommentById(Long commentId) {
		Optional<Comment> optionalComment = commentRepository.findById(commentId);
		if (optionalComment.isPresent()) {
			return optionalComment.get();
		}
		return null;
	}

}
