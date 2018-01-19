package com.example.demo.resource;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Ip;
import com.example.demo.model.User;
import com.example.demo.model.results;
import com.example.demo.repository.UserRepository;

@RestController
@RequestMapping("/rest/users")
public class UserController {

	@Autowired
	UserRepository ur;
	
	@GetMapping("/all")
	public List<User> getAll(){
		return ur.findAll();
	}
	
/*	@GetMapping("/resttemplate")
	public void resttemplate() {
		
		SimpleClientHttpRequestFactory clientHttpReq = new SimpleClientHttpRequestFactory();
		Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy.tcs.com", 8080));
		clientHttpReq.setProxy(proxy);
		 
		RestTemplate rt = new RestTemplate(clientHttpReq);
		HttpHeaders headers=new HttpHeaders();
		//hh.add("apikey", "c6ee6b49dab4478cbec00efa79149879");
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> request = new HttpEntity<String>(headers);
		String url="http://ip.jsontest.com/";
		//RestTemplate rt=new RestTemplate();
		ResponseEntity<Ip> response = rt.exchange(url, HttpMethod.GET, request, Ip.class);
		
		Ip r=rt.getForObject(url, Ip.class);
		
		System.out.println(r);
		
	}*/
	
}
