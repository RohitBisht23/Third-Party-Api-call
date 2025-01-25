package com.RestClient.ThirdPartyServiceApiCall.Calling.third.party.call.Clients;

import com.RestClient.ThirdPartyServiceApiCall.Calling.third.party.call.DTO.ImageDTO;

import java.util.List;

public interface ImageClient {
    List<ImageDTO> getAllImages();
}
