package io.github.guvenozgur.votingservice.VotingServices.Paillier;

import io.github.guvenozgur.votingservice.IVotingServices.IPaillier.IPaillierVoting;
import io.github.guvenozgur.votingservice.VotingModels.PaillierVotingModel;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Random;

@Service
public class PaillierVoting implements IPaillierVoting {


    public static void main(String[] args) {

        int bitLen = new BigInteger("4").bitLength();
        System.out.println(bitLen + ":" + new BigInteger(bitLen, new Random()));

    }

    @Override
    public String vote(String candidateId, PaillierVotingModel votingModel) {

        BigInteger random;
        // TODO: find a chiper way to get a randomValue
        do {
            random = new BigInteger(votingModel.getN().bitLength(), new Random());
        } while (random.compareTo(votingModel.getN()) < 0);

        // Encryption:
        // g^candidateId random^n % n^2

        BigInteger encryptedVote = (votingModel.getG().modPow(new BigInteger(candidateId), votingModel.getnSquare()).multiply(random.modPow(votingModel.getN(), votingModel.getnSquare()))).mod(votingModel.getnSquare());

        return new String(encryptedVote.toByteArray());
    }
}
