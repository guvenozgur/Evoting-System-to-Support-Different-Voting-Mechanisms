package io.github.com.authorityservice.KeyGenerationServices;

import io.github.com.authorityservice.KeyGenerationModels.RSAVotingModel;

public interface IRSAKeyGenerator {

    RSAVotingModel generateKeyPairs(String electionId);
}
