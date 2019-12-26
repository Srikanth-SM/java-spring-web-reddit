package com.siro.redditclone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siro.redditclone.model.Comment;
import com.siro.redditclone.model.Link;
import com.siro.redditclone.service.CommentService;
import com.siro.redditclone.service.LinkService;

@RestController
@RequestMapping(path = "/api/v1/link")
public class LinkController {
	@Autowired
	private LinkService linkService;

	@Autowired
	private CommentService commentService;

	@GetMapping("/")
	public List<Link> getAllLinks() {
		return linkService.getAllLinks();
	}

	@PostMapping("/")
	public Link postLink(@RequestBody Link link) {
		System.out.println(link);
		return linkService.addLink(link);
	}

	@GetMapping("/{id}/comment")
	public List<Comment> getAllCommentsByLinkId(@PathVariable("id") Long linkId) {
		return commentService.getAllCommentsByLinkId(linkId);
	}

	@PostMapping("/{id}/comment")
	public Comment postCommentForLink(@PathVariable("id") Long linkId, @RequestBody Comment comment) {
		System.out.println(linkId + " " + comment);
		return commentService.postCommentForLink(linkId, comment);
	}

}
