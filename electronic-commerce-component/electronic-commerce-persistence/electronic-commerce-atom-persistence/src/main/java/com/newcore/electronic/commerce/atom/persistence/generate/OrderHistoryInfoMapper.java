package com.newcore.electronic.commerce.atom.persistence.generate;

import com.newcore.electronic.commerce.base.model.generate.OrderHistoryInfo;
import com.newcore.electronic.commerce.base.model.generate.OrderHistoryInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderHistoryInfoMapper {
    /**
     * countByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int countByExample(OrderHistoryInfoExample example);

    /**
     * deleteByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByExample(OrderHistoryInfoExample example);

    /**
     * deleteByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByPrimaryKey(Integer orderHistoryInfoId);

    /**
     * insert 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insert(OrderHistoryInfo record);

    /**
     * insertSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insertSelective(OrderHistoryInfo record);

    /**
     * selectByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    List<OrderHistoryInfo> selectByExample(OrderHistoryInfoExample example);

    /**
     * selectByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    OrderHistoryInfo selectByPrimaryKey(Integer orderHistoryInfoId);

    /**
     * updateByExampleSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExampleSelective(@Param("record") OrderHistoryInfo record, @Param("example") OrderHistoryInfoExample example);

    /**
     * updateByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExample(@Param("record") OrderHistoryInfo record, @Param("example") OrderHistoryInfoExample example);

    /**
     * updateByPrimaryKeySelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKeySelective(OrderHistoryInfo record);

    /**
     * updateByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKey(OrderHistoryInfo record);
}