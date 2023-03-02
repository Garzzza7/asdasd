package integration;

import connection.ISimpleHttpClient;
import connection.TqsBasicHttpClient;
import geocoding.Address;
import geocoding.AddressResolver;
import org.apache.http.client.ClientProtocolException;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.exceptions.misusing.PotentialStubbingProblem;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.Mockito.when;

public class AddressResolverIT {

    private ISimpleHttpClient httpClient;
    private AddressResolver resolver;
    @BeforeEach
    public void init(){
        httpClient = new TqsBasicHttpClient();
        resolver = new AddressResolver(httpClient);
    }

    @Test
    public void whenGoodCoordidates_returnAddress() throws IOException, URISyntaxException, ParseException {

        //todo
        // repeat the same tests conditions from AddressResolverTest, without mocks
        Address result = resolver.findAddressForLocation( 30.333472,-81.470448);

        //return
        Address expected = new Address( "802 Arkenstone Dr", "Jacksonville", "FL", "32225", null);
        assertEquals( result,  expected );

    }

    @Test
    public void whenBadCoordidates_thenReturnNoValidAddrress() throws IOException, URISyntaxException, ParseException {

        //todo
        // repeat the same tests conditions from AddressResolverTest, without mocks
        /*
        when(httpClient.doHttpGet(contains("location=-361%2C-361"))).thenThrow(Exception.class);

        assertThrows(Exception.class, () -> resolver.findAddressForLocation(-361,-361));
         */
    }

}
