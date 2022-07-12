package com.newcore.electronic.commerce.atom.persistence.generate;

import com.newcore.electronic.commerce.base.model.generate.ShopCommodityCategory;
import com.newcore.electronic.commerce.base.model.generate.ShopCommodityCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopCommodityCategoryMapper {
    /**
     * countByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int countByExample(ShopCommodityCategoryExample example);

    /**
     * deleteByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByExample(ShopCommodityCategoryExample example);

    /**
     * deleteByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByPrimaryKey(Integer shopCommodityCategoryId);

    /**
     * insert 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insert(ShopCommodityCategory record);

    /**
     * insertSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insertSelective(ShopCommodityCategory record);

    /**
     * selectByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    List<ShopCommodityCategory> selectByExample(ShopCommodityCategoryExample example);

    /**
     * selectByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    ShopCommodityCategory selectByPrimaryKey(Integer shopCommodityCategoryId);

    /**
     * updateByExampleSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExampleSelective(@Param("record") ShopCommodityCategory record, @Param("example") ShopCommodityCategoryExample example);

    /**
     * updateByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExample(@Param("record") ShopCommodityCategory record, @Param("example") ShopCommodityCategoryExample example);

    /**
     * updateByPrimaryKeySelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKeySelective(ShopCommodityCategory record);

    /**
     * updateByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKey(ShopCommodityCategory record);
}