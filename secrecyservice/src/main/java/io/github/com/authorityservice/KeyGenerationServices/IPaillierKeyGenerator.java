package io.github.com.authorityservice.KeyGenerationServices;

import io.github.com.authorityservice.KeyGenerationModels.PaillierVotingModel;

import java.util.List;
import java.util.Map;

public interface IPaillierKeyGenerator {

    public PaillierVotingModel generateKeyPairs(String electionId);
}

