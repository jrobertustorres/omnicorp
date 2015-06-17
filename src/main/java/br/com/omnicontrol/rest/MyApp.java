package br.com.omnicontrol.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")//application do JAX-RS - passamos o caminhdo que está sendo esperado do navegador. Tudo que chegar /api quem analiza é o JAX-RS
public class MyApp extends Application{

}
