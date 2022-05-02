package ejercicio.dana.demo.service;

import ejercicio.dana.demo.client.RestClient;
import ejercicio.dana.demo.common.ServiceException;
import ejercicio.dana.demo.model.AlbumResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TestService {
    @Autowired private RestClient restClient;
   private static final Logger LOGGER = LoggerFactory.getLogger(TestService.class);

    public AlbumResponse getAlbums(){
        try {
            return restClient.getAlbums().getBody();
        } catch (Exception e){
            LOGGER.error(e.getMessage());
            throw new ServiceException("client error", e.getMessage(), e);
        }
    }
}
