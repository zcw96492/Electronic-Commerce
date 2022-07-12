package com.newcore.electronic.commerce.atom.persistence.generate;

import com.newcore.electronic.commerce.base.model.generate.OrderDetailHistoryInfo;
import com.newcore.electronic.commerce.base.model.generate.OrderDetailHistoryInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDetailHistoryInfoMapper {
    /**
     * countByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int countByExample(OrderDetailHistoryInfoExample example);

    /**
     * deleteByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByExample(OrderDetailHistoryInfoExample example);

    /**
     * deleteByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByPrimaryKey(Integer orderDetailHistoryInfoId);

    /**
     * insert 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insert(OrderDetailHistoryInfo record);

    /**
     * insertSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insertSelective(OrderDetailHistoryInfo record);

    /**
     * selectByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    List<OrderDetailHistoryInfo> selectByExample(OrderDetailHistoryInfoExample example);

    /**
     * selectByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    OrderDetailHistoryInfo selectByPrimaryKey(Integer orderDetailHistoryInfoId);

    /**
     * updateByExampleSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExampleSelective(@Param("record") OrderDetailHistoryInfo record, @Param("example") OrderDetailHistoryInfoExample example);

    /**
     * updateByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExample(@Param("record") OrderDetailHistoryInfo record, @Param("example") OrderDetailHistoryInfoExample example);

    /**
     * updateByPrimaryKeySelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKeySelective(OrderDetailHistoryInfo record);

    /**
     * updateByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKey(OrderDetailHistoryInfo record);
}