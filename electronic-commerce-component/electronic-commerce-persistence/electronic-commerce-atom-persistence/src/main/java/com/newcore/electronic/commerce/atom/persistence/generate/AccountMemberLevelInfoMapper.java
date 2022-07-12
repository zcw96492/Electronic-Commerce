package com.newcore.electronic.commerce.atom.persistence.generate;

import com.newcore.electronic.commerce.base.model.generate.AccountMemberLevelInfo;
import com.newcore.electronic.commerce.base.model.generate.AccountMemberLevelInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountMemberLevelInfoMapper {
    /**
     * countByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int countByExample(AccountMemberLevelInfoExample example);

    /**
     * deleteByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByExample(AccountMemberLevelInfoExample example);

    /**
     * deleteByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByPrimaryKey(Integer accountMemberLevelInfoId);

    /**
     * insert 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insert(AccountMemberLevelInfo record);

    /**
     * insertSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insertSelective(AccountMemberLevelInfo record);

    /**
     * selectByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    List<AccountMemberLevelInfo> selectByExample(AccountMemberLevelInfoExample example);

    /**
     * selectByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    AccountMemberLevelInfo selectByPrimaryKey(Integer accountMemberLevelInfoId);

    /**
     * updateByExampleSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExampleSelective(@Param("record") AccountMemberLevelInfo record, @Param("example") AccountMemberLevelInfoExample example);

    /**
     * updateByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExample(@Param("record") AccountMemberLevelInfo record, @Param("example") AccountMemberLevelInfoExample example);

    /**
     * updateByPrimaryKeySelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKeySelective(AccountMemberLevelInfo record);

    /**
     * updateByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKey(AccountMemberLevelInfo record);
}