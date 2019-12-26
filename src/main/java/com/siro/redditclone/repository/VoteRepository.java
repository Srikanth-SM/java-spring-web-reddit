package com.siro.redditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siro.redditclone.model.Vote;

public interface VoteRepository extends JpaRepository<Vote, Long> {

}
