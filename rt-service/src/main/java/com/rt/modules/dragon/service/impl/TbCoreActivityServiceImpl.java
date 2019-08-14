package com.rt.modules.dragon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rt.modules.dragon.entity.TbCoreActivity;
import com.rt.modules.dragon.mapper.TbCoreActivityMapper;
import com.rt.modules.dragon.service.ITbCoreActivityService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 活动信息 主要记录活动标识、key、是否有效、开始结束时间等 服务实现类
 * </p>
 *
 * @author lwy
 * @since 2019-08-14
 */
@Service
public class TbCoreActivityServiceImpl extends ServiceImpl<TbCoreActivityMapper, TbCoreActivity> implements ITbCoreActivityService {

}
