package com.hjs.startdemo.common.utils;

import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.http.*;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * GET POST请求
 */
public class HttpRestTemplateClient {


    public static String post(String url,Map<String,Object> map){

        HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(
                HttpClientBuilder.create().build());
        RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Map<String,Object>> requestEntity = new HttpEntity<>(map,headers);
        ResponseEntity<String> entity =  restTemplate.exchange(url, HttpMethod.POST,requestEntity,String.class);
        String info = entity.getBody();
        return info;
    }

    public static String postFrom(String url,Map<String,Object> map){

        HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(
                HttpClientBuilder.create().build());
        RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        //将HashMap转为MultiValueMap
        MultiValueMap<String,Object> valueMap = new LinkedMultiValueMap<>();
        for (String s : map.keySet()) {
            valueMap.add(s,map.get(s));
        }

        HttpEntity<MultiValueMap<String,Object>> requestEntity = new HttpEntity<>(valueMap,headers);
        ResponseEntity<String> entity =  restTemplate.exchange(url, HttpMethod.POST,requestEntity,String.class);
        String info = entity.getBody();
        return info;
    }


    public static String get(String url){

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Map<String,Object>> requestEntity = new HttpEntity<>(headers);
        ResponseEntity<String> entity =  restTemplate.exchange(url, HttpMethod.GET,requestEntity,String.class);
        String info = entity.getBody();
        return info;

    }

    public static String getInfo(String url,Map<String,Object> map){

        HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(
                HttpClientBuilder.create().build());
        RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Map<String,Object>> requestEntity = new HttpEntity<>(map,headers);
        ResponseEntity<String> entity =  restTemplate.exchange(url, HttpMethod.POST,requestEntity,String.class);
        String info = entity.getBody();

        return info;

    }

    public static String getEntity(String token, String url, HttpMethod method, MultiValueMap<String,String> map){

        HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(
                HttpClientBuilder.create().build());
        RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);
        if(token != null)
            headers.set("token",token);
        if(map == null)
            map = new LinkedMultiValueMap<>();
        HttpEntity<MultiValueMap<String,String>> requestEntity = new HttpEntity<>(map,headers);
        ResponseEntity<String> entity =  restTemplate.exchange(url,method,requestEntity,String.class);
        return entity.getBody();
    }




}
