package ir.stdev.attact.authserver.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import ir.stdev.attact.authserver.dto.AuthRequest;
import ir.stdev.attact.authserver.dto.AuthResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final String jwtSecret = "my-secret-key-my-secret-key-my-secret-key";

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthRequest authRequest) {
        if ("user".equals(authRequest.username()) && "pass".equals(authRequest.password())) {
            String token = Jwts.builder()
                    .setSubject(authRequest.username())
                    .claim("role" , "USER")
                    .setIssuedAt(new Date())
                    .setExpiration(new Date(System.currentTimeMillis()+60000))
                    .signWith(Keys.hmacShaKeyFor(jwtSecret.getBytes()))
                    .compact();
            return ResponseEntity.ok(new AuthResponse(token));
        }
        else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
}
