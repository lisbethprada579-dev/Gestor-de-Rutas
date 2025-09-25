package com.bolsadeideas.springboot.web.project.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class Security extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private UserDetailsServiceImpl userDatailsService;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDatailsService).passwordEncoder(passwordEncoder());
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/","/index","/listarPuntoRecarga","/listarRuta","/consultante","/public/**","/js/**","/css/**","/img/**").permitAll().anyRequest().authenticated()
		.and()
			.formLogin().loginPage("/login").defaultSuccessUrl("/admin/index",true).failureUrl("/login?error=true")
			.loginProcessingUrl("/admin/login-post").permitAll()
		.and()
			.logout().logoutUrl("/logout").logoutSuccessUrl("/index?logout");
		
		
	}
	
	

}
