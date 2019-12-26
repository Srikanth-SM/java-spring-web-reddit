package com.siro.redditclone.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siro.redditclone.model.Audit;
import com.siro.redditclone.model.Link;
import com.siro.redditclone.model.Vote;
import com.siro.redditclone.repository.VoteRepository;

@Service
public class VoteService extends Audit {

	@Autowired
	private VoteRepository voteRepository;

	@Autowired
	private LinkService linkService;

	// link upvote /api/v1/link/{linkId}/vote/{direction}/
	public int vote(Long linkId, short direction) {
		Optional<Link> optionalLink = linkService.getLinkById(linkId);
		if (optionalLink.isPresent()) {
			Link link = optionalLink.get();
			int votes = link.getVote();
			votes += direction;
			link.setVotes(votes);
			Vote vote = new Vote();
			vote.setDirection(direction);
			vote.setLink(link);
			voteRepository.save(vote);
			linkService.addLink(link);
			return votes;
		}
		return 0;
	}

}
