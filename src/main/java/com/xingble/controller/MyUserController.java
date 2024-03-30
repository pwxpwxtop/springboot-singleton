package com.xingble.controller;



import com.xingble.service.MyUserService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class MyUserController extends MyUserService {



}
