package com.neu.project3.raft.controller;

import com.neu.project3.raft.requests.VoteRequest;
import com.neu.project3.raft.responses.VoteResponse;
import com.neu.project3.raft.service.RequestVoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/RequestVote")
public class RequestVote {

    private RequestVoteService requestVoteService;

    @Autowired
    RequestVote(RequestVoteService requestVoteService){
        this.requestVoteService = requestVoteService;
    }

    @PostMapping(value = "/request")
    VoteResponse requestVote(VoteRequest request){
        return this.requestVoteService.checkVoteRequest(request);
    }
}
