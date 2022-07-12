package com.newcore.electronic.commerce.atom.persistence.generate;

import com.newcore.electronic.commerce.base.model.generate.SupplierCommodityRelation;
import com.newcore.electronic.commerce.base.model.generate.SupplierCommodityRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierCommodityRelationMapper {
    /**
     * countByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int countByExample(SupplierCommodityRelationExample example);

    /**
     * deleteByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByExample(SupplierCommodityRelationExample example);

    /**
     * deleteByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByPrimaryKey(Integer supplierCommodityRelationId);

    /**
     * insert 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insert(SupplierCommodityRelation record);

    /**
     * insertSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insertSelective(SupplierCommodityRelation record);

    /**
     * selectByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    List<SupplierCommodityRelation> selectByExample(SupplierCommodityRelationExample example);

    /**
     * selectByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    SupplierCommodityRelation selectByPrimaryKey(Integer supplierCommodityRelationId);

    /**
     * updateByExampleSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExampleSelective(@Param("record") SupplierCommodityRelation record, @Param("example") SupplierCommodityRelationExample example);

    /**
     * updateByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExample(@Param("record") SupplierCommodityRelation record, @Param("example") SupplierCommodityRelationExample example);

    /**
     * updateByPrimaryKeySelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKeySelective(SupplierCommodityRelation record);

    /**
     * updateByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKey(SupplierCommodityRelation record);
}