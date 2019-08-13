package com.rt.modules.sys.vo;

import com.google.common.base.Converter;
import com.rt.modules.sys.entity.Role;
import com.rt.modules.sys.entity.User;
import org.springframework.beans.BeanUtils;

import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.List;

/**
 * @Auther: edeis
 * @Date: 2019/1/22 16:01
 * @Description:
 */
public class UserVO {

    /**
     * 主键
     */
    private Long id;
    /**
     * 用户名
     */
    @NotEmpty(message = "用户名不能为空")
    private String username;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 是否锁定:0 否，1是
     */
    private Integer locked;
    /**
     * 密码
     */
    private String password;
    /**
     * 性别:0女 1男
     */
    private Integer sex;
    /**
     * 电话
     */
    private String telephone;

    private String avatar;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 创建时间
     */
    private Date createTime;

    private List<Role> roles;

    private List<Long> roleIds;



    /**
     * 学校地址
     */
    private String address;
    /**
     * 用户类型 0:后台用户 1:学校用户
     */
    private Integer type;
    /**
     *学校购买最大人数
     */
    private Integer maxNum;
    /**
     *学校已绑定使用的人数
     */
    private Integer useNum;



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    public Integer getUseNum() {
        return useNum;
    }

    public void setUseNum(Integer useNum) {
        this.useNum = useNum;
    }

    public Long getSysSchId() {
        return sysSchId;
    }

    public void setSysSchId(Long sysSchId) {
        this.sysSchId = sysSchId;
    }

    public String getSchName() {
        return schName;
    }

    public void setSchName(String schName) {
        this.schName = schName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 学校ID
     */
    private Long  sysSchId;

    /**
     * 学校名称
     */
    private String  schName;
    /**
     * 学校所在省
     */
    private String province;

    /**
     * 学校所在省ID
     */
    private Long provinceId;


    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public List<Long> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<Long> roleIds) {
        this.roleIds = roleIds;
    }

    public User convertTo(){
        UserConvert convert = new UserConvert();
        User o = convert.convert(this);
        return o;
    }

    public UserVO convertFor(User o) {
        UserConvert convert = new UserConvert();
        UserVO vo = convert.reverse().convert(o);
        return vo;
    }


    private static class UserConvert extends Converter<UserVO, User> {

        @Override
        protected User doForward(UserVO vo) {
            User o = new User();
            BeanUtils.copyProperties(vo,o);
            return o;
        }

        @Override
        protected UserVO doBackward(User o) {
            UserVO vo = new UserVO();
            BeanUtils.copyProperties(o,vo);
            return vo;
        }


    }
}
