package com.ingsha.application.app.mysql.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 系统用户表
 * </p>
 *
 * @author Martin Yi 001
 * @since 2023-08-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("oauth_user")
//@ApiModel(value = "OauthUserPo对象", description = "系统用户表")
public class OauthUserPo implements Serializable {

    private static final long serialVersionUID = 1L;

//    @ApiModelProperty(value = "主键")
    private Long id;

//    @ApiModelProperty(value = "樱夏id")
    private String identifyId;

//    @ApiModelProperty(value = "昵称")
    private String nickname;

//    @ApiModelProperty(value = "手机号")
    private String phoneNumber;

//    @ApiModelProperty(value = "年龄")
    private Integer age;

//    @ApiModelProperty(value = "性别")
    private Integer sex;

//    @ApiModelProperty(value = "头像")
    private String avatar;

//    @ApiModelProperty(value = "背景图片")
    private String backgroundImage;

//    @ApiModelProperty(value = "网站")
    private String website;

//    @ApiModelProperty(value = "地址")
    private String address;

//    @ApiModelProperty(value = "个性签名")
    private String signature;

    @TableField("`password`")
//    @ApiModelProperty(value = "加密密码")
    private String password;

//    @ApiModelProperty(value = "关注数量")
    private Integer followingCount;

//    @ApiModelProperty(value = "被关注数量")
    private Integer followerCount;

//    @ApiModelProperty(value = "最后一次修改樱夏id时间")
    private Date lastModifyIdentifyId;

//    @ApiModelProperty(value = "在线状态 0下线 1在线")
    private Integer onlineStatus;

//    @ApiModelProperty(value = "冻结状态")
    private Integer lockStatus;

//    @ApiModelProperty(value = "不可调用权限")
    private String unAccessPermission;

//    @ApiModelProperty(value = "创建时间")
    private Date createTime;

//    @ApiModelProperty(value = "创建用户ID")
    private Long createUserId;

//    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

//    @ApiModelProperty(value = "更新用户ID")
    private Long updateUserId;

//    @ApiModelProperty(value = "删除状态")
    private Integer deleteStatus;

//    @ApiModelProperty(value = "删除时间")
    private Date deleteTime;

//    @ApiModelProperty(value = "删除用户ID")
    private Long deleteUserId;

//    @ApiModelProperty(value = "备注")
    private String remark;


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
