package com.xingyun.policy.api.service;

import com.xingyun.policy.api.dto.request.CheckRequest;
import com.xingyun.policy.api.dto.request.ListDetailRequest;
import com.xingyun.policy.api.dto.request.ListRequest;
import com.xingyun.policy.api.dto.response.PolicyResponse;

/**
 * 政策服务
 *
 * @author haohao
 */
public interface PolicyService {
  /**
   * 政策规则检查
   *
   * @param request
   * @return
   */
  PolicyResponse check(CheckRequest request);

  /**
   * 查规则列表
   *
   * @param request
   * @return
   */
  PolicyResponse listPolicy(ListRequest request);

  /**
   * 查规则明细
   *
   * @param request
   * @return
   */
  PolicyResponse listDetail(ListDetailRequest request);
}
