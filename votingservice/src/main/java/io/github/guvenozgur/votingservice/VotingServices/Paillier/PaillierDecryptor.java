package io.github.guvenozgur.votingservice.VotingServices.Paillier;

import io.github.guvenozgur.votingservice.IVotingServices.IPaillier.IPaillierDecryptor;
import io.github.guvenozgur.votingservice.VotingModels.PaillierVotingModel;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class PaillierDecryptor implements IPaillierDecryptor {

    @Override
    public String decrypt(String vote, PaillierVotingModel votingModel) {

        BigInteger decryptedResult;

        decryptedResult = new BigInteger(vote).modPow(votingModel.getCarmichaelValue(), votingModel.getnSquare()).
                subtract(BigInteger.ONE).divide(votingModel.getN()).multiply(votingModel.getCarmichaelValue()).
                mod(votingModel.getN());


        return new String(decryptedResult.toByteArray());
    }
}
