package com.example.remoteBean;

import jakarta.ejb.Remote;
import jakarta.ejb.Stateless;
@Stateless(mappedName = "BeanRemote",name = "BeanRemote")
//@Remote
public class BeanRemote implements BeanRemoteTest {
    @Override
    public String getMessage() {
        return "This is from remote bean";
    }
}