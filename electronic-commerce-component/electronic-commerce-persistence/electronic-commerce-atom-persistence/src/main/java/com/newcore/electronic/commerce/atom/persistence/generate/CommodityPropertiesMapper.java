package com.newcore.electronic.commerce.atom.persistence.generate;

import com.newcore.electronic.commerce.base.model.generate.CommodityProperties;
import com.newcore.electronic.commerce.base.model.generate.CommodityPropertiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityPropertiesMapper {
    /**
     * countByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int countByExample(CommodityPropertiesExample example);

    /**
     * deleteByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByExample(CommodityPropertiesExample example);

    /**
     * deleteByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByPrimaryKey(Integer commodityPropertiesId);

    /**
     * insert 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insert(CommodityProperties record);

    /**
     * insertSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insertSelective(CommodityProperties record);

    /**
     * selectByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    List<CommodityProperties> selectByExample(CommodityPropertiesExample example);

    /**
     * selectByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    CommodityProperties selectByPrimaryKey(Integer commodityPropertiesId);

    /**
     * updateByExampleSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExampleSelective(@Param("record") CommodityProperties record, @Param("example") CommodityPropertiesExample example);

    /**
     * updateByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExample(@Param("record") CommodityProperties record, @Param("example") CommodityPropertiesExample example);

    /**
     * updateByPrimaryKeySelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKeySelective(CommodityProperties record);

    /**
     * updateByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKey(CommodityProperties record);
}