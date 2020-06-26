package school.iu.clientserver

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@SpringBootApplication
@EnableOAuth2Sso
@EnableZuulProxy
class ClientServerApplication {

	static void main(String[] args) {
		SpringApplication.run(ClientServerApplication, args)
	}

}
