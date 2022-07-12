package com.newcore.electronic.commerce.atom.persistence.generate;

import com.newcore.electronic.commerce.base.model.generate.CommodityPlanType;
import com.newcore.electronic.commerce.base.model.generate.CommodityPlanTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityPlanTypeMapper {
    /**
     * countByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int countByExample(CommodityPlanTypeExample example);

    /**
     * deleteByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByExample(CommodityPlanTypeExample example);

    /**
     * deleteByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByPrimaryKey(Integer commodityPlanTypeId);

    /**
     * insert 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insert(CommodityPlanType record);

    /**
     * insertSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insertSelective(CommodityPlanType record);

    /**
     * selectByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    List<CommodityPlanType> selectByExample(CommodityPlanTypeExample example);

    /**
     * selectByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    CommodityPlanType selectByPrimaryKey(Integer commodityPlanTypeId);

    /**
     * updateByExampleSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExampleSelective(@Param("record") CommodityPlanType record, @Param("example") CommodityPlanTypeExample example);

    /**
     * updateByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExample(@Param("record") CommodityPlanType record, @Param("example") CommodityPlanTypeExample example);

    /**
     * updateByPrimaryKeySelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKeySelective(CommodityPlanType record);

    /**
     * updateByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKey(CommodityPlanType record);
}