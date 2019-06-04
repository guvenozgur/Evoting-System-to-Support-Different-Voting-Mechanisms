package io.github.guvenozgur.votingservice.VotingServices.Paillier;

import io.github.guvenozgur.votingservice.IVotingServices.IPaillier.IPaillierDecryptor;
import io.github.guvenozgur.votingservice.VotingModels.PaillierVotingModel;
import org.springframework.stereotype.Service;

@Service
public class PaillierDecryptor implements IPaillierDecryptor {

    @Override
    public String decrypt(String vote, PaillierVotingModel votingModel) {
        return null;
    }
}
