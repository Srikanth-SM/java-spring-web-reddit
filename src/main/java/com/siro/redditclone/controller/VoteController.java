package com.siro.redditclone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siro.redditclone.service.VoteService;

@RestController
@RequestMapping("/api/v1/link")
public class VoteController {
	@Autowired
	private VoteService voteService;

	@PostMapping("/{linkId}/vote/{direction}")
	public int vote(@PathVariable("linkId") Long linkId, @PathVariable("direction") short direction) {
		return voteService.vote(linkId, direction);

	}

}
