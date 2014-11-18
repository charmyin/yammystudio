package com.charmyin.cmstudio.tzyc.safe.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.charmyin.cmstudio.tzyc.safe.vo.SafeCheckResult;

@Service
public interface SafeCheckResultService {
	public List<SafeCheckResult> findAll(SafeCheckResult checkResult);
}
