package school.iu.clientserver

import java.security.Principal

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Configuration
@EnableOAuth2Sso
class UiSecurityConfig extends WebSecurityConfigurerAdapter {
	
	
	
	@Override
	void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
        	.antMatcher("/**")
            .authorizeRequests()
            .anyRequest()
            .authenticated()
		  
		
	}
}

@RestController
class UserController {
	@RequestMapping("/user/me")
	Principal user(Principal principal) {
		principal
	}
}

@Controller
class RoutingHandle {
	@RequestMapping(["/project/**","/task/**","/employee/**"])
	public String index() {
		return "forward:/index.html";
		}
}