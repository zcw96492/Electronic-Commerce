package com.newcore.electronic.commerce.atom.persistence.generate;

import com.newcore.electronic.commerce.base.model.generate.OrderCommodityInfo;
import com.newcore.electronic.commerce.base.model.generate.OrderCommodityInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderCommodityInfoMapper {
    /**
     * countByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int countByExample(OrderCommodityInfoExample example);

    /**
     * deleteByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByExample(OrderCommodityInfoExample example);

    /**
     * deleteByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByPrimaryKey(Integer orderCommodityInfoId);

    /**
     * insert 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insert(OrderCommodityInfo record);

    /**
     * insertSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insertSelective(OrderCommodityInfo record);

    /**
     * selectByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    List<OrderCommodityInfo> selectByExample(OrderCommodityInfoExample example);

    /**
     * selectByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    OrderCommodityInfo selectByPrimaryKey(Integer orderCommodityInfoId);

    /**
     * updateByExampleSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExampleSelective(@Param("record") OrderCommodityInfo record, @Param("example") OrderCommodityInfoExample example);

    /**
     * updateByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExample(@Param("record") OrderCommodityInfo record, @Param("example") OrderCommodityInfoExample example);

    /**
     * updateByPrimaryKeySelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKeySelective(OrderCommodityInfo record);

    /**
     * updateByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKey(OrderCommodityInfo record);
}