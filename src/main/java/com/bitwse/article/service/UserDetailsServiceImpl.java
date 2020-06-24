package com.bitwse.article.service;

import com.bitwse.article.dao.UserRepository;
import com.bitwse.article.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

//@Service
//public class UserDetailsServiceImpl implements UserDetailsService {
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//        return userRepository.findByUsername(username)
//                .map(CustomUser::new)
//                .orElseThrow(() -> new UsernameNotFoundException(username));
//      }
//
//    private static class CustomUser extends User implements UserDetails {
//
//        public CustomUser(User user) {
//            super(user);
//        }
//
//        @Override
//        public Collection<? extends GrantedAuthority> getAuthorities() {
//            return super.getUserAuthorities().stream()
//                    .map(userAuthority -> new SimpleGrantedAuthority(userAuthority.getAuthority()))
//                    .collect(Collectors.toList());
//        }
//
//        @Override
//        public String getUsername() {
//            return super.getUsername();
//        }
//
//        @Override
//        public boolean isAccountNonExpired() {
//            return true;
//        }
//
//        @Override
//        public boolean isAccountNonLocked() {
//            return true;
//        }
//
//        @Override
//        public boolean isCredentialsNonExpired() {
//            return true;
//        }
//
//        @Override
//        public boolean isEnabled() {
//            return true;
//        }
//    }
//}
