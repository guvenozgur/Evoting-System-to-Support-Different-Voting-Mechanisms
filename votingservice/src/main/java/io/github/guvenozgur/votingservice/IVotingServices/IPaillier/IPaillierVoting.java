package io.github.guvenozgur.votingservice.IVotingServices.IPaillier;

import io.github.guvenozgur.votingservice.VotingModels.PaillierVotingModel;
import io.github.guvenozgur.votingservice.VotingModels.VotingModel;

public interface IPaillierVoting {

    public String vote(String data, PaillierVotingModel paillierVotingModel);
}
