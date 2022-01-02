package com.admin.spring_admin.service.commonImpl;

import com.admin.spring_admin.domain.AdminVO;
import com.admin.spring_admin.domain.LoginDTO;
import com.admin.spring_admin.service.AdminCommonIF;
//import org.springframework.security.authentication.AnonymousAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//
//public class AdminCommonServiceImpl implements AdminCommonIF {
//
//    public boolean isAuthenticated() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        if (authentication == null || AnonymousAuthenticationToken.class.
//                isAssignableFrom(authentication.getClass())) {
//            return false;
//        }
//        return authentication.isAuthenticated();
//    }
//
//    @Override
//    public AdminVO login(LoginDTO loginDTO) throws Exception {
//        return new AdminVO();
////        return sqlSession.selectOne("login", loginDTO);
//    }
//}
