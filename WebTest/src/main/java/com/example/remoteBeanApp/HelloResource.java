package com.example.remoteBeanApp;

import com.example.remoteBean.BeanRemote;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

import javax.naming.InitialContext;
import javax.naming.NamingException;

@Path("/hello-world")
public class HelloResource {

    @GET
    @Produces("text/plain")
    public String hello() throws NamingException {
        InitialContext ctx = null;
        BeanRemote beanRemote ;

            ctx = new InitialContext();
         beanRemote = (BeanRemote) ctx.lookup("BeanRemote");
 //       beanRemote = (BeanRemote) ctx.lookup("java:global/EJBTest-1.0-SNAPSHOT/BeanRemote");

        // beanRemote = (BeanRemote) ctx.lookup("java:global/EJBTest-1.0-SNAPSHOT/BeanRemote!com.example.remoteBean.BeanRemoteTest");
      //  beanRemote = (BeanRemote) ctx.lookup("BeanRemote#com.example.remoteBean.BeanRemoteTest");



        return "HIIIIIIIIIII  World! From remote bean: " + beanRemote.getMessage();
    }
}