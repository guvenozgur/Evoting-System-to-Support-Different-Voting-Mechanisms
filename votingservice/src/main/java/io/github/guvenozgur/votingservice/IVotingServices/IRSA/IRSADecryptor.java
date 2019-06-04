package io.github.guvenozgur.votingservice.IVotingServices.IRSA;

import io.github.guvenozgur.votingservice.VotingModels.RSAVotingModel;

public interface IRSADecryptor {

    public String decrypt(String data, RSAVotingModel rsaVotingModel);

}
