package com.rt.modules.electricity.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.rt.modules.electricity.entity.Order;
import com.rt.modules.electricity.vo.OrderVO;
import com.rt.modules.electricity.vo.query.OrderQueryVO;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author sh
 * @since 2019-02-24
 */
public interface IOrderService extends IService<Order> {

    IPage<OrderVO> page(Integer pageNumber, Integer pageSize, OrderQueryVO params);


}
