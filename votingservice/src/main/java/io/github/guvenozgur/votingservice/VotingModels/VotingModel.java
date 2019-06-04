package io.github.guvenozgur.votingservice.VotingModels;

import java.util.Map;

public class VotingModel {

    String electionId;
    Map publicKey;
    Map privateKey;
    String vote;
    String voterKey;


    public String getElectionId() {
        return electionId;
    }

    public void setElectionId(String electionId) {
        this.electionId = electionId;
    }

    public String getVote() {
        return vote;
    }

    public void setVote(String vote) {
        this.vote = vote;
    }

    public String getVoterKey() {
        return voterKey;
    }

    public void setVoterKey(String voterKey) {
        this.voterKey = voterKey;
    }

    public Map getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(Map publicKey) {
        this.publicKey = publicKey;
    }

    public Map getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(Map privateKey) {
        this.privateKey = privateKey;
    }
}
