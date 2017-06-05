package com.unityhealth.auth.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by shanefox on 10/10/2016.
 */
@Service
public class CustomPasswordEncoder implements PasswordEncoder {

    private static final Logger log = LoggerFactory.getLogger(CustomPasswordEncoder.class);

//    private StringEncrypter stringEncrypter;

    private Pattern saltPattern = Pattern.compile("\\w*\\{(?<salt>[\\[@\\w]*)\\}");

//    @Autowired
    public CustomPasswordEncoder() {
    }

    @Override
    public String encode(CharSequence rawPassword) {
        return null;
//        String encPwd = get_SHA_SecurePassword(rawPassword.toString(), getSalt());
//        log.debug("Encrypted pwd: " + this.stringEncrypter.encrypt(rawPassword.toString()));
//        return this.stringEncrypter.encrypt(rawPassword.toString());
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        log.debug("Checking for match of {} and {}", rawPassword.toString(), encodedPassword);


        String salt = extractSalt(encodedPassword);

        log.debug("salt: {}", salt);

        String rawEncodedPassword = getShaSecurePassword(rawPassword.toString(), salt);

        log.debug("rawEncodedPassword: {}", rawEncodedPassword);

        return (rawEncodedPassword + "{" + salt + "}").equals(encodedPassword);
    }

    private String extractSalt(String encodedPassword) {
        try {
            Matcher matcher = saltPattern.matcher(encodedPassword);
            if (matcher.find()) {
                return matcher.group("salt");
            }
            return "";
        } catch (Exception e){
            log.error("An error occurred when extracting a salt. {}", encodedPassword, e);
            throw e;
        }
    }


    private String getShaSecurePassword(String passwordToHash, String salt) {
        String generatedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(salt.getBytes());
            byte[] bytes = md.digest(passwordToHash.getBytes());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            generatedPassword = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            log.error("An encryption error occurred.", e);
        }
        return generatedPassword;
    }

    private String getSalt() {
        try {
            SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
            byte[] salt = new byte[16];
            sr.nextBytes(salt);
            return Arrays.toString(salt);
        } catch (NoSuchAlgorithmException e) {
            log.error("An encryption error occurred.", e);
        }
        return null;
    }

}
