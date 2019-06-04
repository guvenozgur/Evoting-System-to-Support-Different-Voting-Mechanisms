package io.github.guvenozgur.votingservice.IVotingServices.IRSA;

import io.github.guvenozgur.votingservice.VotingModels.RSAVotingModel;
import io.github.guvenozgur.votingservice.VotingModels.VotingModel;

public interface IRSAVoting {

    public String vote(String data, RSAVotingModel rsaVotingModel);
}
