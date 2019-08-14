package com.rt.modules.dragon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rt.modules.dragon.entity.TbCoreApp;
import com.rt.modules.dragon.mapper.TbCoreAppMapper;
import com.rt.modules.dragon.service.ITbCoreAppService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 应用（游戏）表 一个游戏作为一个应用 服务实现类
 * </p>
 *
 * @author lwy
 * @since 2019-08-14
 */
@Service
public class TbCoreAppServiceImpl extends ServiceImpl<TbCoreAppMapper, TbCoreApp> implements ITbCoreAppService {

}
