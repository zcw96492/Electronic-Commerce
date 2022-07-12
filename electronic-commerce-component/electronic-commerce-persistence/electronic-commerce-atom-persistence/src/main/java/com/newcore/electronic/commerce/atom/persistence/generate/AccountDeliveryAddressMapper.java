package com.newcore.electronic.commerce.atom.persistence.generate;

import com.newcore.electronic.commerce.base.model.generate.AccountDeliveryAddress;
import com.newcore.electronic.commerce.base.model.generate.AccountDeliveryAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountDeliveryAddressMapper {
    /**
     * countByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int countByExample(AccountDeliveryAddressExample example);

    /**
     * deleteByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByExample(AccountDeliveryAddressExample example);

    /**
     * deleteByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByPrimaryKey(Integer deliveryAddressId);

    /**
     * insert 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insert(AccountDeliveryAddress record);

    /**
     * insertSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insertSelective(AccountDeliveryAddress record);

    /**
     * selectByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    List<AccountDeliveryAddress> selectByExample(AccountDeliveryAddressExample example);

    /**
     * selectByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    AccountDeliveryAddress selectByPrimaryKey(Integer deliveryAddressId);

    /**
     * updateByExampleSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExampleSelective(@Param("record") AccountDeliveryAddress record, @Param("example") AccountDeliveryAddressExample example);

    /**
     * updateByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExample(@Param("record") AccountDeliveryAddress record, @Param("example") AccountDeliveryAddressExample example);

    /**
     * updateByPrimaryKeySelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKeySelective(AccountDeliveryAddress record);

    /**
     * updateByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKey(AccountDeliveryAddress record);
}