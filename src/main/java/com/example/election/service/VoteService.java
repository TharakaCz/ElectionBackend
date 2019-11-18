package com.example.election.service;

import com.example.election.helper.VoteDTO;

public interface VoteService {

    public Object save(VoteDTO voteDTO)throws Exception;
    public Object edit(Long vId)throws Exception;
    public Object getAll()throws Exception;
}
