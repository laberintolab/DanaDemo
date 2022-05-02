package ejercicio.dana.demo.controller;

import ejercicio.dana.demo.model.AlbumResponse;
import ejercicio.dana.demo.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired private TestService testService;
    private static final Logger LOGGER = LoggerFactory.getLogger(TestService.class);

    @GetMapping(value="/dana/albums", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AlbumResponse> getAlbums(){
        LOGGER.info("iniciando ApiRest");
        return ResponseEntity.ok().body(testService.getAlbums());
    }
}
