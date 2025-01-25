package com.RestClient.ThirdPartyServiceApiCall.Calling.third.party.call.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ImageDTO {

    private String author;
    private Long width;
    private Long height;
    private String url;
    private String download_url;
}
