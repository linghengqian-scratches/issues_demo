package com.ingsha.application.app.mysql.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ingsha.application.app.mysql.entity.OauthUserPo;
import org.apache.ibatis.annotations.Param;

public interface OauthUserDao extends BaseMapper<OauthUserPo> {
    int softDeleteOneById(@Param("id") Long id);
}
