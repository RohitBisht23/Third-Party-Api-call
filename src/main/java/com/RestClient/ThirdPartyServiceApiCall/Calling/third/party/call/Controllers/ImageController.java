package com.RestClient.ThirdPartyServiceApiCall.Calling.third.party.call.Controllers;

import com.RestClient.ThirdPartyServiceApiCall.Calling.third.party.call.Clients.ImageClient;
import com.RestClient.ThirdPartyServiceApiCall.Calling.third.party.call.DTO.ImageDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/images")  // Base path for your image API
@RequiredArgsConstructor
public class ImageController {

    private ImageClient imageClient;

    public ImageController(ImageClient imageClient) {
        this.imageClient = imageClient;
    }

    @GetMapping("/all")  // Endpoint path to fetch all images
    public ResponseEntity<List<ImageDTO>> getAllImages() {
        return ResponseEntity.ok(imageClient.getAllImages());
    }
}