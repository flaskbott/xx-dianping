package com.xxdp.service;

import com.xxdp.dto.Result;
import com.xxdp.entity.VoucherOrder;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *

 */
public interface IVoucherOrderService extends IService<VoucherOrder> {

    Result seckillVoucher(Long voucherId);
}
