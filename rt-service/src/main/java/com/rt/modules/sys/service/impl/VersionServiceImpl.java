package com.rt.modules.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rt.common.Constant;
import com.rt.modules.sys.entity.Version;
import com.rt.modules.sys.mapper.VersionMapper;
import com.rt.modules.sys.service.VersionService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by Administrator on 2018/2/26.
 */
@Service
public class VersionServiceImpl extends ServiceImpl<VersionMapper,Version> implements VersionService {
    private final String VERSION_CACHE_LIST="VERSION_CACHE_LIST";
    private final String VERSION_CACHE_VERSION="VERSION_CACHE_VERSION";
    @Override
    //@Cacheable(cacheNames = VERSION_CACHE_LIST,key = "'getPageInfo_start'+#start+'_length_'+#length+'_params_'+#paraMap")
    public IPage page(Map<String, Object> params) {
        int pageNum = (int) params.get(Constant.PAGE_NUM);
        int pageSize = (int) params.get(Constant.PAGE_SIZE);
        QueryWrapper<Version> ew = new QueryWrapper<Version>();
        IPage pageData = super.page(new Page<Version>(pageNum, pageSize),null);
        return pageData;
    }

    @Override
    @CacheEvict(cacheNames = {VERSION_CACHE_LIST,VERSION_CACHE_VERSION},allEntries = true)
    public void update(Version version) {
        version.updateById();
    }

    @Override
    //@Cacheable(cacheNames = VERSION_CACHE_VERSION,key = "'getById'+#id")
    public Version getById(Long id) {
        return super.getById(id);
    }
}
