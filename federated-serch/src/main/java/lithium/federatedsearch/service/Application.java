package lithium.federatedsearch.service;

import lithium.federatedsearch.constant.FederatedSearchConstants;
import lithium.federatedsearch.vo.ContentDetailsResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @author Baban Sinha
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }

    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();

		//Retrieve a single KMS solution by Published ID
		ResponseEntity<ContentDetailsResponse> response = getJSONResponse(FederatedSearchConstants.KMS_CONTENT_URL_BY_PUBLISHED_ID);
		ContentDetailsResponse responseBody = response.getBody();
		System.out.println("\n\nresponseBody :: " + responseBody);

		//Retrieve a single KMS solution by Published ID
		/*ResponseEntity<ContentDetailsResponse> response1 = getJSONResponse(FederatedSearchConstants.KMS_CONTENT_URL_BY_PUBLISHED_ID);
		ContentDetailsResponse responseBody1 = response1.getBody();
		System.out.println("responseBody1 :: " + responseBody1);*/
    }

	private ResponseEntity<ContentDetailsResponse> getJSONResponse(String url) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		//headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		ResponseEntity<ContentDetailsResponse> response = restTemplate.exchange(url, HttpMethod.GET, entity, ContentDetailsResponse.class);
		return response;
	}
}