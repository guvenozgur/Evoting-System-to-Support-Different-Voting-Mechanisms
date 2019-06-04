package io.github.guvenozgur.votingservice.IVotingServices.IPaillier;

import io.github.guvenozgur.votingservice.VotingModels.PaillierVotingModel;

public interface IPaillierDecryptor {

    public String decrypt(String data, PaillierVotingModel paillierVotingModel);

}
