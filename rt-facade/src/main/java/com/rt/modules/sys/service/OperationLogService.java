package com.rt.modules.sys.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.rt.modules.sys.entity.OperationLog;
import com.rt.modules.sys.vo.query.OperatorLogQueryVO;

/**
 * <p>
 * 操作日志 服务类
 * </p>
 *
 * @author edeis
 * @since 2017-12-19
 */
public interface OperationLogService extends IService<OperationLog> {

    IPage<OperationLog> page(Integer pageNumber, Integer pageSize,OperatorLogQueryVO params);

    void removeBatchIds(Long[] logIds);

    void removeById(Long logId);
}
