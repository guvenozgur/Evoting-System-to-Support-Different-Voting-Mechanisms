package io.github.com.authorityservice.KeyGenerationServicesImpl;

import io.github.com.authorityservice.KeyGenerationModels.RSAVotingModel;
import io.github.com.authorityservice.KeyGenerationServices.IRSAKeyGenerator;

import javax.crypto.KeyGenerator;
import java.security.*;
import java.util.HashMap;
import java.util.Map;

public class RSAKeyGenerator implements IRSAKeyGenerator {

    public RSAVotingModel generateKeyPairs(String electionId){

        RSAVotingModel rsaVotingModel = new RSAVotingModel();

        KeyPair kp;
        try{
            Key key;
            SecureRandom rand = new SecureRandom();
            KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
            kpg.initialize(2048);
            kp = kpg.generateKeyPair();
        }catch (NoSuchAlgorithmException e){
            return null;
        }

        Map keyPairMap = new HashMap();
        keyPairMap.put("privateKeys", kp.getPrivate().getEncoded());
        keyPairMap.put("publicKeys", kp.getPublic().getEncoded());

        rsaVotingModel.setAsymmetricKeys(keyPairMap);
        rsaVotingModel.setElectionId(electionId);

        return rsaVotingModel;
    }
}
