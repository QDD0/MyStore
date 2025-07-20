package org.example.mystore.enity;

import org.example.mystore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class AdminInitializer implements ApplicationRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (userRepository.count() == 0) {
            Users admin = Users.createAdmin();
            admin.setPassword(passwordEncoder.encode(admin.getPassword()));
            userRepository.save(admin);
            System.out.println("Admin created with encoded password: " + admin.getPassword());
        }
    }
}
