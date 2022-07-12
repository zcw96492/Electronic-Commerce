package com.newcore.electronic.commerce.atom.persistence.generate;

import com.newcore.electronic.commerce.base.model.generate.CommodityType;
import com.newcore.electronic.commerce.base.model.generate.CommodityTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityTypeMapper {
    /**
     * countByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int countByExample(CommodityTypeExample example);

    /**
     * deleteByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByExample(CommodityTypeExample example);

    /**
     * deleteByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByPrimaryKey(Integer commodityTypeId);

    /**
     * insert 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insert(CommodityType record);

    /**
     * insertSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insertSelective(CommodityType record);

    /**
     * selectByExampleWithBLOBs 方法
     *
     * @date 2022-07-12 23:52:08
     */
    List<CommodityType> selectByExampleWithBLOBs(CommodityTypeExample example);

    /**
     * selectByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    List<CommodityType> selectByExample(CommodityTypeExample example);

    /**
     * selectByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    CommodityType selectByPrimaryKey(Integer commodityTypeId);

    /**
     * updateByExampleSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExampleSelective(@Param("record") CommodityType record, @Param("example") CommodityTypeExample example);

    /**
     * updateByExampleWithBLOBs 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExampleWithBLOBs(@Param("record") CommodityType record, @Param("example") CommodityTypeExample example);

    /**
     * updateByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExample(@Param("record") CommodityType record, @Param("example") CommodityTypeExample example);

    /**
     * updateByPrimaryKeySelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKeySelective(CommodityType record);

    /**
     * updateByPrimaryKeyWithBLOBs 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKeyWithBLOBs(CommodityType record);

    /**
     * updateByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKey(CommodityType record);
}