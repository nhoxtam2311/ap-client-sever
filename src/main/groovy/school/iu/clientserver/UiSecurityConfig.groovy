package school.iu.clientserver

import java.security.Principal

import org.springframework.context.annotation.Configuration
import org.springframework.core.annotation.Order
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Configuration
@Order(101)
class UiSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	void configure(HttpSecurity http) throws Exception {
		http.cors().and().csrf().disable().antMatcher("/**")
		.authorizeRequests().anyRequest().authenticated()
	}
}

@RestController
class UserController {
	@RequestMapping("/user/me")
	Principal user(Principal principal) {
		principal
	}
}