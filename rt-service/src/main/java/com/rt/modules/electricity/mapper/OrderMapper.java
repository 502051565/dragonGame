package com.rt.modules.electricity.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rt.modules.electricity.entity.Order;
import com.rt.modules.electricity.vo.OrderVO;
import com.rt.modules.electricity.vo.query.OrderQueryVO;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author sh
 * @since 2019-02-24
 */
public interface OrderMapper extends BaseMapper<Order> {

    IPage<OrderVO> pageOrders(IPage<OrderVO> page, @Param("queryVo") OrderQueryVO queryVO);

}
