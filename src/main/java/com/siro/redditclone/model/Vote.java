package com.siro.redditclone.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vote extends Audit {
	@Id
	@GeneratedValue
	private Long id;
	private short direction;
	@ManyToOne
	private Link link;

	public Vote() {
		super();
	}

	public Long getId() {
		return id;
	}

	public short getDirection() {
		return direction;
	}

	public void setDirection(short direction) {
		this.direction = direction;
	}

	public Link getLink() {
		return link;
	}

	public void setLink(Link link) {
		this.link = link;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
