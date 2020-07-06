package school.iu.clientserver

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@SpringBootApplication
@EnableZuulProxy
class ClientServerApplication {

	static void main(String[] args) {
		SpringApplication.run(ClientServerApplication, args)
	}

}
