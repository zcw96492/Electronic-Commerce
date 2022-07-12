package com.newcore.electronic.commerce.atom.persistence.generate;

import com.newcore.electronic.commerce.base.model.generate.AccountLoginInfo;
import com.newcore.electronic.commerce.base.model.generate.AccountLoginInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountLoginInfoMapper {
    /**
     * countByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int countByExample(AccountLoginInfoExample example);

    /**
     * deleteByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByExample(AccountLoginInfoExample example);

    /**
     * deleteByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * insert 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insert(AccountLoginInfo record);

    /**
     * insertSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insertSelective(AccountLoginInfo record);

    /**
     * selectByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    List<AccountLoginInfo> selectByExample(AccountLoginInfoExample example);

    /**
     * selectByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    AccountLoginInfo selectByPrimaryKey(Integer userId);

    /**
     * updateByExampleSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExampleSelective(@Param("record") AccountLoginInfo record, @Param("example") AccountLoginInfoExample example);

    /**
     * updateByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExample(@Param("record") AccountLoginInfo record, @Param("example") AccountLoginInfoExample example);

    /**
     * updateByPrimaryKeySelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKeySelective(AccountLoginInfo record);

    /**
     * updateByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKey(AccountLoginInfo record);
}