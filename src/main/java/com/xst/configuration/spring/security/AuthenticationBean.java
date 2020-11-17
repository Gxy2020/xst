package com.xst.configuration.spring.security;

import lombok.Data;

/**
 * @author GUO
 */

@Data
public class AuthenticationBean {
    private String userName;
    private String password;
    private boolean remember;
}
