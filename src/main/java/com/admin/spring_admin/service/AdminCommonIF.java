package com.admin.spring_admin.service;

import com.admin.spring_admin.domain.AdminVO;
import com.admin.spring_admin.domain.LoginDTO;

public interface AdminCommonIF {

    // 로그인 처리
    AdminVO login(LoginDTO loginDTO) throws Exception;

}
