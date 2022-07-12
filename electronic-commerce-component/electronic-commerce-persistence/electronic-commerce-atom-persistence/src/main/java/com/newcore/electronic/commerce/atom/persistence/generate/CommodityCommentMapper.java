package com.newcore.electronic.commerce.atom.persistence.generate;

import com.newcore.electronic.commerce.base.model.generate.CommodityComment;
import com.newcore.electronic.commerce.base.model.generate.CommodityCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityCommentMapper {
    /**
     * countByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int countByExample(CommodityCommentExample example);

    /**
     * deleteByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByExample(CommodityCommentExample example);

    /**
     * deleteByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByPrimaryKey(Integer commodityCommentId);

    /**
     * insert 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insert(CommodityComment record);

    /**
     * insertSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insertSelective(CommodityComment record);

    /**
     * selectByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    List<CommodityComment> selectByExample(CommodityCommentExample example);

    /**
     * selectByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    CommodityComment selectByPrimaryKey(Integer commodityCommentId);

    /**
     * updateByExampleSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExampleSelective(@Param("record") CommodityComment record, @Param("example") CommodityCommentExample example);

    /**
     * updateByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExample(@Param("record") CommodityComment record, @Param("example") CommodityCommentExample example);

    /**
     * updateByPrimaryKeySelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKeySelective(CommodityComment record);

    /**
     * updateByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKey(CommodityComment record);
}