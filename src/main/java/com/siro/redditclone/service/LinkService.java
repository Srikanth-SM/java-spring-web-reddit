package com.siro.redditclone.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siro.redditclone.model.Link;
import com.siro.redditclone.repository.LinkRepository;

@Service
public class LinkService {

	private LinkRepository linkRepository;

	@Autowired
	public LinkService(LinkRepository linkRepository) {
		super();
		this.linkRepository = linkRepository;
	}

	// get all links
	public List<Link> getAllLinks() {
		return linkRepository.findAll();
	}

	// add a Link
	public Link addLink(String name, String url) {
		Link link = new Link(name, url);
		return linkRepository.save(link);
	}

	public Link addLink(Link link) {
		return linkRepository.save(link);
	}

	// get a link by id
	public Optional<Link> getLinkById(Long id) {
		return linkRepository.findById(id);

	}

}
