package io.github.guvenozgur.votingservice.VotingServices.Paillier;

import io.github.guvenozgur.votingservice.IVotingServices.IPaillier.IPaillierDecryptor;
import io.github.guvenozgur.votingservice.IVotingServices.IPaillier.IPaillierKeyGenerator;
import io.github.guvenozgur.votingservice.VotingModels.PaillierVotingModel;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PaillierKeyGenerator implements IPaillierKeyGenerator {

    @Override
    public List<Map> generateKeyPairs() {
        return paillierKeyGenerator();
    }

    // TODO : big prime number generator

    private List<Map> paillierKeyGenerator() {

        PaillierVotingModel paillierVotingModel = new PaillierVotingModel();
        paillierVotingModel.setP(new BigInteger("93258190053368335360689362753326970901156376714515609683660739891440089168229"));
        paillierVotingModel.setQ(new BigInteger("67179543309668099143277329383413232455356339731457773568178761757060960779963"));
        paillierVotingModel.setN(paillierVotingModel.getP().multiply(paillierVotingModel.getQ()));

        // TODO: g generater (Z n2)
        paillierVotingModel.setG(new BigInteger("11738903305571125623357275755757996486023846696891322291725888051491778958401872825508696108745305238256712612601774764526182946475828957413791020910054354778828028161359453840988595296293067035051332878398563806666838929962328706202876675246266501939283785729475724608589511297160296153098856792187205327542"));
        paillierVotingModel.setnSquare(paillierVotingModel.getN().multiply(paillierVotingModel.getN()));
        paillierVotingModel.setCarmichaelValue(carmichael(paillierVotingModel.getP(), paillierVotingModel.getQ()));

        // gcd(L(g^lambda mod n^2), n) must be equal 1
        //do {
            //g = Math.random(bit_len * 2, n_square);
            paillierVotingModel.setCarmichaelValue(new BigInteger("11738903305571125623357275755757996486023846696891322291725888051491778958401872825508696108745305238256712612601774764526182946475828957413791020910054354778828028161359453840988595296293067035051332878398563806666838929962328706202876675246266501939283785729475724608589511297160296153098856792187205327542"));
            // Until gcd(L(g^lambda mod n^2), n) is equal 1
        //} while (false);

        Map<String, String> privateKeyMap = new HashMap<>();
        privateKeyMap.put("p", new String(paillierVotingModel.getP().toByteArray()));
        privateKeyMap.put("q", new String(paillierVotingModel.getQ().toByteArray()));

        Map<String, String> publicKeyMap = new HashMap<>();

        publicKeyMap.put("n", new String(paillierVotingModel.getN().toByteArray()));
        publicKeyMap.put("g", new String(paillierVotingModel.getG().toByteArray()));

        List<Map> keyPairs = new ArrayList<>();

        keyPairs.add(publicKeyMap);
        keyPairs.add(privateKeyMap);

        return keyPairs;
    }


    // Carmichael function: L(u) = (u-1)/(n)
    public BigInteger L(BigInteger u, BigInteger n) {
        return (u.compareTo(BigInteger.ZERO) > 0 && u.compareTo(BigInteger.ZERO) > 0) ?
                (u.subtract(BigInteger.ONE).divide(n)) : null;
    }

    private static BigInteger carmichael(BigInteger p, BigInteger q) {
        return lcm(eulerPhi(p), eulerPhi(q));
    }

    private static BigInteger lcm(BigInteger p, BigInteger q) {
        return p.multiply(q).divide(p.gcd(q));
    }

    private static BigInteger eulerPhi(BigInteger p) {       // Euler's totient function
        return p.subtract(BigInteger.ONE);
    }


}
