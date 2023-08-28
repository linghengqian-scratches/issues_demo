package com.ingsha.application.app.mysql.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@TableName("oauth_user")
public class OauthUserPo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;

    private String identifyId;

    private Integer deleteStatus;

    public static final String ID = "id";

    public static final String IDENTIFY_ID = "identify_id";

    public static final String NICKNAME = "nickname";

    public static final String PHONE_NUMBER = "phone_number";

    public static final String AGE = "age";

    public static final String SEX = "sex";

    public static final String AVATAR = "avatar";

    public static final String BACKGROUND_IMAGE = "background_image";

    public static final String WEBSITE = "website";

    public static final String ADDRESS = "address";

    public static final String SIGNATURE = "signature";

    public static final String PASSWORD = "password";

    public static final String FOLLOWING_COUNT = "following_count";

    public static final String FOLLOWER_COUNT = "follower_count";

    public static final String LAST_MODIFY_IDENTIFY_ID = "last_modify_identify_id";

    public static final String ONLINE_STATUS = "online_status";

    public static final String LOCK_STATUS = "lock_status";

    public static final String UN_ACCESS_PERMISSION = "un_access_permission";

    public static final String CREATE_TIME = "create_time";

    public static final String CREATE_USER_ID = "create_user_id";

    public static final String UPDATE_TIME = "update_time";

    public static final String UPDATE_USER_ID = "update_user_id";

    public static final String DELETE_STATUS = "delete_status";

    public static final String DELETE_TIME = "delete_time";

    public static final String DELETE_USER_ID = "delete_user_id";

    public static final String REMARK = "remark";
}
