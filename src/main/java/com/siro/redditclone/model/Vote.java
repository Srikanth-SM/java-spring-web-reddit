package com.siro.redditclone.model;

import java.util.Objects;

public class Vote {
	private Long id;
	private int vote;
	
	public Vote() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVote() {
		return vote;
	}

	public void setVote(int vote) {
		this.vote = vote;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, vote);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Vote)) {
			return false;
		}
		Vote other = (Vote) obj;
		return Objects.equals(id, other.id) && vote == other.vote;
	}
	
	@Override
	public String toString() {
		return "Vote [id=" + id + ", vote=" + vote + "]";
	}
	
	
	
	
}
