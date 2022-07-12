package com.newcore.electronic.commerce.atom.persistence.generate;

import com.newcore.electronic.commerce.base.model.generate.ShopCommodityRegister;
import com.newcore.electronic.commerce.base.model.generate.ShopCommodityRegisterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopCommodityRegisterMapper {
    /**
     * countByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int countByExample(ShopCommodityRegisterExample example);

    /**
     * deleteByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByExample(ShopCommodityRegisterExample example);

    /**
     * deleteByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByPrimaryKey(Integer shopCommodityRegisterId);

    /**
     * insert 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insert(ShopCommodityRegister record);

    /**
     * insertSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insertSelective(ShopCommodityRegister record);

    /**
     * selectByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    List<ShopCommodityRegister> selectByExample(ShopCommodityRegisterExample example);

    /**
     * selectByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    ShopCommodityRegister selectByPrimaryKey(Integer shopCommodityRegisterId);

    /**
     * updateByExampleSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExampleSelective(@Param("record") ShopCommodityRegister record, @Param("example") ShopCommodityRegisterExample example);

    /**
     * updateByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExample(@Param("record") ShopCommodityRegister record, @Param("example") ShopCommodityRegisterExample example);

    /**
     * updateByPrimaryKeySelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKeySelective(ShopCommodityRegister record);

    /**
     * updateByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKey(ShopCommodityRegister record);
}