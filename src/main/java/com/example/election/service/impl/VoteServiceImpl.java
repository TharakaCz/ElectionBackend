package com.example.election.service.impl;

import com.example.election.helper.VoteDTO;
import com.example.election.model.Vote;
import com.example.election.repository.VoteRepository;
import com.example.election.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VoteServiceImpl implements VoteService {

    @Autowired
    private VoteRepository voteRepository;

    @Override
    public Object save(VoteDTO voteDTO) throws Exception {
        Vote vote = new Vote();
        vote.setvName(voteDTO.getvName());
        vote.setvNic(voteDTO.getvNic());

        if (voteRepository.save(vote) != null){
            return "Vote Add Succsessfully";
        }else {
            return null;
        }
    }

    @Override
    public Object edit(Long vId) throws Exception {
        return null;
    }

    @Override
    public Object getAll() throws Exception {

        List<Vote>votes = voteRepository.findAll();
        ArrayList<VoteDTO>voteDTOS = new ArrayList<>();

        votes.forEach(each->{
            try {
                voteDTOS.add(getVotes(each));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        return voteDTOS;
    }

    private VoteDTO getVotes(Vote vote)throws Exception{
        VoteDTO voteDTO = new VoteDTO();
        voteDTO.setvId(vote.getvId());
        voteDTO.setvName(vote.getvName());
        voteDTO.setvNic(vote.getvNic());

        return voteDTO;
    }
}
