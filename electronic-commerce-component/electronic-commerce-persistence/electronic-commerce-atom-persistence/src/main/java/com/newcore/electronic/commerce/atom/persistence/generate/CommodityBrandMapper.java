package com.newcore.electronic.commerce.atom.persistence.generate;

import com.newcore.electronic.commerce.base.model.generate.CommodityBrand;
import com.newcore.electronic.commerce.base.model.generate.CommodityBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityBrandMapper {
    /**
     * countByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int countByExample(CommodityBrandExample example);

    /**
     * deleteByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByExample(CommodityBrandExample example);

    /**
     * deleteByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByPrimaryKey(Integer commodityBrandId);

    /**
     * insert 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insert(CommodityBrand record);

    /**
     * insertSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insertSelective(CommodityBrand record);

    /**
     * selectByExampleWithBLOBs 方法
     *
     * @date 2022-07-12 23:52:08
     */
    List<CommodityBrand> selectByExampleWithBLOBs(CommodityBrandExample example);

    /**
     * selectByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    List<CommodityBrand> selectByExample(CommodityBrandExample example);

    /**
     * selectByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    CommodityBrand selectByPrimaryKey(Integer commodityBrandId);

    /**
     * updateByExampleSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExampleSelective(@Param("record") CommodityBrand record, @Param("example") CommodityBrandExample example);

    /**
     * updateByExampleWithBLOBs 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExampleWithBLOBs(@Param("record") CommodityBrand record, @Param("example") CommodityBrandExample example);

    /**
     * updateByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExample(@Param("record") CommodityBrand record, @Param("example") CommodityBrandExample example);

    /**
     * updateByPrimaryKeySelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKeySelective(CommodityBrand record);

    /**
     * updateByPrimaryKeyWithBLOBs 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKeyWithBLOBs(CommodityBrand record);

    /**
     * updateByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKey(CommodityBrand record);
}