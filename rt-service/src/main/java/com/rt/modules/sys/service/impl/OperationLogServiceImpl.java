package com.rt.modules.sys.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rt.modules.sys.entity.OperationLog;
import com.rt.modules.sys.mapper.OperationLogMapper;
import com.rt.modules.sys.service.OperationLogService;
import com.rt.modules.sys.vo.query.OperatorLogQueryVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

/**
 * <p>
 * 操作日志 服务实现类
 * </p>
 *
 * @author edeis
 * @since 2017-12-19
 */
@Service
public class OperationLogServiceImpl extends ServiceImpl<OperationLogMapper, OperationLog> implements OperationLogService {


    @Override
    public IPage<OperationLog> page(Integer pageNumber,Integer pageSize,OperatorLogQueryVO params){
        return super.page(new Page<OperationLog>(pageNumber, pageSize),null);
    }

    @Transactional
    @Override
    public void removeBatchIds(Long[] logIds) {
        super.removeByIds(Arrays.asList(logIds));
    }

    @Transactional
    @Override
    public void removeById(Long logId) {
        this.baseMapper.deleteById(logId);
    }
}
