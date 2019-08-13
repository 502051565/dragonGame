package com.rt.modules.sys.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.rt.modules.sys.entity.Version;

import java.util.Map;

/**
 * Created by Administrator on 2018/2/26.
 */

public interface VersionService extends IService<Version> {
    IPage page(Map<String, Object> paraMap);
    Version getById(Long id);
    void update(Version version);
}
