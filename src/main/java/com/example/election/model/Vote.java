package com.example.election.model;

import javax.persistence.*;

@Entity
@Table(name = "VOTE")
public class Vote {

    private Long vId;
    private String vName;
    private String vNic;

    public Vote() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PID",length = 100)
    public Long getvId() {
        return vId;
    }

    public void setvId(Long vId) {
        this.vId = vId;
    }

    @Column(name = "VOTE_NAME",nullable = false)
    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }

    @Column(name = "NIC",nullable = false)
    public String getvNic() {
        return vNic;
    }

    public void setvNic(String vNic) {
        this.vNic = vNic;
    }
}
