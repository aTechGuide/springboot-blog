package in.kamranali.jwt.security;

import in.kamranali.jwt.model.JwtUser;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Component;

/**
 * Created by bornshrewd on 11/12/17
 */
@Component
public class JwtValidator {

    static public String SECRET = "bornShrewd";

    public JwtUser validate(String token) {

        JwtUser user = null;
        try {
            Claims body = Jwts.parser()
                    .setSigningKey(SECRET)
                    .parseClaimsJwt(token)
                    .getBody();

            user = new JwtUser();
            user.setUsername(body.getSubject());
            user.setId(Long.parseLong((String)body.get("userId")));
            user.setRole((String)body.get("role"));

        }catch (Exception e){
            System.out.println(e);
        }

        return user;
    }
}
