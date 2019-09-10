package io.github.com.authorityservice.KeyGenerationServicesImpl;

import io.github.com.authorityservice.KeyGenerationModels.AESVotingModel;
import io.github.com.authorityservice.KeyGenerationServices.IAESKeyGenerator;

import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.security.SecureRandom;

import java.security.NoSuchAlgorithmException;

public class AESKeyGenerator implements IAESKeyGenerator {

    private static SecretKeySpec secretKey;
    private static byte[] key;

    public AESVotingModel generateKeyPairs(String electionId){
        AESVotingModel AESVotingModel = new AESVotingModel();

        try{
            Key key;
            SecureRandom rand = new SecureRandom();
            KeyGenerator generator = KeyGenerator.getInstance("AES");
            generator.init(256, rand);
            key = generator.generateKey();
        }catch (NoSuchAlgorithmException e){
            return null;
        }

        AESVotingModel.setElectionId(electionId);
        AESVotingModel.setSymmetricKey(key.toString());

        return AESVotingModel;
    }
}
