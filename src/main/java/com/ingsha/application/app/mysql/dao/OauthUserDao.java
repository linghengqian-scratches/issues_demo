package com.ingsha.application.app.mysql.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.ingsha.application.app.mysql.entity.OauthUserPo;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 系统用户表 Mapper 接口
 * </p>
 *
 * @author Martin Yi 001
 * @since 2023-08-09
 */

public interface OauthUserDao extends BaseMapper<OauthUserPo> {


    int softDeleteOneById(@Param("id") Long id);

}
