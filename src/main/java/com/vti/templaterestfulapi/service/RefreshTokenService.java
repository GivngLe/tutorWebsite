package com.vti.templaterestfulapi.service;

import com.vti.templaterestfulapi.exception.TokenRefreshException;
import com.vti.templaterestfulapi.models.RefreshToken;
import com.vti.templaterestfulapi.repositories.RefreshTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

@Service
public class RefreshTokenService {

	@Autowired
    private RefreshTokenRepository refreshTokenRepository;
    
    public Optional<RefreshToken> findByToken(String token) {
        return refreshTokenRepository.findByToken(token);
    }

    public RefreshToken save(RefreshToken refreshToken) {
        return refreshTokenRepository.save(refreshToken);
    }
    
    public RefreshToken createRefreshToken() {
        RefreshToken refreshToken = new RefreshToken();//3600000
        refreshToken.setExpiryDate(Instant.now().plusMillis(86400000));//86400000
        refreshToken.setToken(UUID.randomUUID().toString());
        refreshToken.setRefreshCount(0L);
        return refreshToken;
    }

    public void verifyExpiration(RefreshToken token) {
        if (token.getExpiryDate().compareTo(Instant.now()) < 0) {
            throw new TokenRefreshException(token.getToken(), "Expired token. Please issue a new request");
        }
    }

    public void deleteById(Long id) {
        refreshTokenRepository.deleteById(id);
    }

    public void deleteAll()
    {
        refreshTokenRepository.deleteAll();
    }

    public void increaseCount(RefreshToken refreshToken) {
        refreshToken.incrementRefreshCount();
        save(refreshToken);
    }
}