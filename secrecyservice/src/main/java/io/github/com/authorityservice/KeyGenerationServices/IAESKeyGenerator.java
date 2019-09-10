package io.github.com.authorityservice.KeyGenerationServices;

import io.github.com.authorityservice.KeyGenerationModels.AESVotingModel;

public interface IAESKeyGenerator {

    public AESVotingModel generateKeyPairs(String electionId);
}
