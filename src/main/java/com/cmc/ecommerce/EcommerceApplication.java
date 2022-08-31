package com.cmc.ecommerce;

import com.cmc.ecommerce.dao.UserMapper;
import com.cmc.ecommerce.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class EcommerceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceApplication.class, args);
    }

//    @Autowired
//    private UserMapper userMapper;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
//        User user = new User();
//        user.setName("Nguyễn Văn Mạnh");
//        user.setEmail("manhnv@cmcglobal.vn");
//        user.setPassword(passwordEncoder.encode("123456"));
//        userMapper.insert(user);
        System.out.println("123123");
    }
}
