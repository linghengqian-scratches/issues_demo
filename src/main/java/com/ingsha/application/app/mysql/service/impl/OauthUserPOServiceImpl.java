package com.ingsha.application.app.mysql.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ingsha.application.app.mysql.dao.OauthUserDao;
import com.ingsha.application.app.mysql.entity.OauthUserPo;
import com.ingsha.application.app.mysql.service.OauthUserPOService;
import org.springframework.stereotype.Service;

@Service
public class OauthUserPOServiceImpl extends ServiceImpl<OauthUserDao, OauthUserPo> implements OauthUserPOService {
}
