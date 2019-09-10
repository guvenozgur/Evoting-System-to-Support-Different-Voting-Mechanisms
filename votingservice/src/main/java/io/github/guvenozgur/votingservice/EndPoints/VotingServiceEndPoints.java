package io.github.guvenozgur.votingservice.EndPoints;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.guvenozgur.votingservice.VotingModels.PaillierVotingModel;
import io.github.guvenozgur.votingservice.VotingServices.Paillier.PaillierKeyGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/votingservice")
public class VotingServiceEndPoints {

    @Autowired
    PaillierKeyGenerator paillierKeyGenerator;


    @RequestMapping("/vote")
    public String vote() {

        return "voting..";
    }

    @RequestMapping("/generatekey")
    public String generateKeys() {

        PaillierVotingModel paillierVotingModel = paillierKeyGenerator.generateKeyPairs();
        ObjectMapper objectMapper = new ObjectMapper();
        String paillierModel;

        try {
            return objectMapper.writeValueAsString(paillierVotingModel);
        }catch (Exception e){
            return "exception";
        }
    }

    @RequestMapping("/decyrpt")
    public String decryrpt() {

        return "decyription..";
    }

}
