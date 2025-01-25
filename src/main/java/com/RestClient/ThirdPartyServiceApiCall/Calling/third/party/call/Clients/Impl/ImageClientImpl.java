package com.RestClient.ThirdPartyServiceApiCall.Calling.third.party.call.Clients.Impl;

import com.RestClient.ThirdPartyServiceApiCall.Calling.third.party.call.Clients.ImageClient;
import com.RestClient.ThirdPartyServiceApiCall.Calling.third.party.call.DTO.ImageDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ImageClientImpl implements ImageClient {

    private RestClient restClient;

    public ImageClientImpl(RestClient restClient) {
        this.restClient = restClient;
    }

    @Override
    public List<ImageDTO> getAllImages() { //Get all data in pagination
        try{
            return restClient
                    .get()
                    .uri("?page=2&limit=10")
                    .retrieve()
                    .body(new ParameterizedTypeReference<>() {
                    });


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
