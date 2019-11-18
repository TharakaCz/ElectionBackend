package com.example.election.helper;

public class VoteDTO {

    private Long vId;
    private String vName;
    private String vNic;

    public VoteDTO() {
    }

    public Long getvId() {
        return vId;
    }

    public void setvId(Long vId) {
        this.vId = vId;
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }

    public String getvNic() {
        return vNic;
    }

    public void setvNic(String vNic) {
        this.vNic = vNic;
    }
}
