package ejercicio.dana.demo.client;

import ejercicio.dana.demo.model.AlbumResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="album-test" , url="${gateway.mock-server}")
public interface RestClient {

    @GetMapping(
            value="/albums",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<AlbumResponse> getAlbums();
}
