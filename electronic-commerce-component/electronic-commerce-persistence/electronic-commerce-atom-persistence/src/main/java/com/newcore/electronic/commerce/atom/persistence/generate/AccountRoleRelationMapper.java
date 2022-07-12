package com.newcore.electronic.commerce.atom.persistence.generate;

import com.newcore.electronic.commerce.base.model.generate.AccountRoleRelation;
import com.newcore.electronic.commerce.base.model.generate.AccountRoleRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountRoleRelationMapper {
    /**
     * countByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int countByExample(AccountRoleRelationExample example);

    /**
     * deleteByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByExample(AccountRoleRelationExample example);

    /**
     * deleteByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByPrimaryKey(Integer userRoleRelationId);

    /**
     * insert 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insert(AccountRoleRelation record);

    /**
     * insertSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insertSelective(AccountRoleRelation record);

    /**
     * selectByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    List<AccountRoleRelation> selectByExample(AccountRoleRelationExample example);

    /**
     * selectByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    AccountRoleRelation selectByPrimaryKey(Integer userRoleRelationId);

    /**
     * updateByExampleSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExampleSelective(@Param("record") AccountRoleRelation record, @Param("example") AccountRoleRelationExample example);

    /**
     * updateByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExample(@Param("record") AccountRoleRelation record, @Param("example") AccountRoleRelationExample example);

    /**
     * updateByPrimaryKeySelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKeySelective(AccountRoleRelation record);

    /**
     * updateByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKey(AccountRoleRelation record);
}