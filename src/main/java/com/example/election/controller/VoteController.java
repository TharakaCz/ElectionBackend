package com.example.election.controller;

import com.example.election.helper.VoteDTO;
import com.example.election.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:8081")
@RequestMapping(value = "/app/vote")
public class VoteController {

    @Autowired
    private VoteService voteService;

    @PostMapping(value = "/save")
    protected ResponseEntity<Object>save(@RequestBody VoteDTO voteDTO){
        try {
            return new ResponseEntity<Object>(voteService.save(voteDTO), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Object>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/getAllVotes")
    protected ResponseEntity<Object>getAll(){
        try {
            return new ResponseEntity<Object>(voteService.getAll(),HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Object>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
