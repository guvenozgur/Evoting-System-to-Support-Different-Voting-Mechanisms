package io.github.com.authorityservice.KeyGenerationModels;

import java.util.Map;

public class VotingModel {

    String electionId;
    Map asymmetricKeys;
    String symmetricKey;
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

    public Map getAsymmetricKeys() {
        return asymmetricKeys;
    }

    public void setAsymmetricKeys(Map asymmetricKeys) {
        this.asymmetricKeys = asymmetricKeys;
    }

    public String getSymmetricKey() {
        return symmetricKey;
    }

    public void setSymmetricKey(String symmetricKey) {
        this.symmetricKey = symmetricKey;
    }


}
