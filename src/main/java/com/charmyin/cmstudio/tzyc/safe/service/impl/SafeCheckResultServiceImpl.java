package com.charmyin.cmstudio.tzyc.safe.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.charmyin.cmstudio.tzyc.safe.persistence.SafeCheckResultMapper;
import com.charmyin.cmstudio.tzyc.safe.service.SafeCheckResultService;
import com.charmyin.cmstudio.tzyc.safe.vo.SafeCheckResult;
@Service
public class SafeCheckResultServiceImpl implements SafeCheckResultService {

	@Resource
SafeCheckResultMapper safeCheckResultMapper;
	@Override
	public List<com.charmyin.cmstudio.tzyc.safe.vo.SafeCheckResult> findAll(SafeCheckResult safeCheckResult) {
		// TODO Auto-generated method stub
		return safeCheckResultMapper.findAll(safeCheckResult);
	}

}
