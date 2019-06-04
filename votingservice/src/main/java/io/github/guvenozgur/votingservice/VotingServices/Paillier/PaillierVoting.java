package io.github.guvenozgur.votingservice.VotingServices.Paillier;

import io.github.guvenozgur.votingservice.IVotingServices.IPaillier.IPaillierVoting;
import io.github.guvenozgur.votingservice.VotingModels.PaillierVotingModel;
import org.springframework.stereotype.Service;

@Service
public class PaillierVoting implements IPaillierVoting
{
    @Override
    public String vote(String candidateId, PaillierVotingModel votingModel) {

        return null;
    }
}
