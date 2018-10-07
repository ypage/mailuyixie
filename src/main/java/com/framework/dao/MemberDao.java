package com.framework.dao;

import com.framework.entity.MemberEntity;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * 
 * @author Yuan
 * @email 496080373@qq.com
 * @date 2018-04-19 11:16:22
 */
public interface MemberDao extends BaseDao<MemberEntity> {

    public MemberEntity login(@Param("username") String username, @Param("password") String password);
}
