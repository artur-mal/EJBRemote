package com.example.remoteBean;

import jakarta.ejb.Remote;

@Remote
public interface BeanRemoteTest {
    String getMessage();
}
