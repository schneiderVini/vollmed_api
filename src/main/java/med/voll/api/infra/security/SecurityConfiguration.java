package med.voll.api.infra.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
//Desabilitar o processo padrão de autenticação do Spring security
@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean //Notação para expor o retorno do método(devolver para o spring)
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf().disable().sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().build();
    }
}
