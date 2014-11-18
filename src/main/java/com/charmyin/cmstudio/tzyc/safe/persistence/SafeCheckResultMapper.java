package com.charmyin.cmstudio.tzyc.safe.persistence;

import java.util.List;

import com.charmyin.cmstudio.basic.initial.SQLMapper;
import com.charmyin.cmstudio.tzyc.safe.vo.SafeCheckResult;
import com.charmyin.cmstudio.tzyc.safe.vo.SafeTaskDetail;

@SQLMapper
public interface SafeCheckResultMapper {
	public List<SafeCheckResult> findAll(SafeCheckResult safeCheckResult);
}
