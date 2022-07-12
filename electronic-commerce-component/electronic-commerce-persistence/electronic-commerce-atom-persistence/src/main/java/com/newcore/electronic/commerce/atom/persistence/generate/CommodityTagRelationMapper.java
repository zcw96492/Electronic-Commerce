package com.newcore.electronic.commerce.atom.persistence.generate;

import com.newcore.electronic.commerce.base.model.generate.CommodityTagRelation;
import com.newcore.electronic.commerce.base.model.generate.CommodityTagRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityTagRelationMapper {
    /**
     * countByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int countByExample(CommodityTagRelationExample example);

    /**
     * deleteByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByExample(CommodityTagRelationExample example);

    /**
     * deleteByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByPrimaryKey(Integer commodityTagRelationId);

    /**
     * insert 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insert(CommodityTagRelation record);

    /**
     * insertSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insertSelective(CommodityTagRelation record);

    /**
     * selectByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    List<CommodityTagRelation> selectByExample(CommodityTagRelationExample example);

    /**
     * selectByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    CommodityTagRelation selectByPrimaryKey(Integer commodityTagRelationId);

    /**
     * updateByExampleSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExampleSelective(@Param("record") CommodityTagRelation record, @Param("example") CommodityTagRelationExample example);

    /**
     * updateByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExample(@Param("record") CommodityTagRelation record, @Param("example") CommodityTagRelationExample example);

    /**
     * updateByPrimaryKeySelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKeySelective(CommodityTagRelation record);

    /**
     * updateByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKey(CommodityTagRelation record);
}