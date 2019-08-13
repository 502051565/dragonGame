package com.rt.modules.electricity.service.impl;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rt.modules.electricity.entity.Order;
import com.rt.modules.electricity.mapper.OrderMapper;
import com.rt.modules.electricity.service.IOrderService;
import com.rt.modules.electricity.vo.OrderVO;
import com.rt.modules.electricity.vo.query.OrderQueryVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author sh
 * @since 2019-02-24
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);



    @Override
    public IPage<OrderVO> page(Integer pageNumber, Integer pageSize, OrderQueryVO queryVO) {
        IPage<OrderVO> pageData = this.baseMapper.pageOrders(new Page<>(pageNumber, pageSize), queryVO);
        return pageData;
    }


}
