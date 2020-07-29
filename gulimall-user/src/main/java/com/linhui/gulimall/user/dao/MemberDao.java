package com.linhui.gulimall.user.dao;

import com.linhui.gulimall.user.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author linhui
 * @email 1047043261@qq.com
 * @date 2020-07-29 20:00:24
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
