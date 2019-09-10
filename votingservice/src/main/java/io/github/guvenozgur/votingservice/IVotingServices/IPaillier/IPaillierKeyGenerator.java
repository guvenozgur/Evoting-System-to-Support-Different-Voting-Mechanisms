package io.github.guvenozgur.votingservice.IVotingServices.IPaillier;

import io.github.guvenozgur.votingservice.VotingModels.PaillierVotingModel;

import java.util.List;
import java.util.Map;

public interface IPaillierKeyGenerator {

    PaillierVotingModel generateKeyPairs();
}
