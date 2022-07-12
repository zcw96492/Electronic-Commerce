package com.newcore.electronic.commerce.atom.persistence.generate;

import com.newcore.electronic.commerce.base.model.generate.TdBatchTask;
import com.newcore.electronic.commerce.base.model.generate.TdBatchTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdBatchTaskMapper {
    /**
     * countByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int countByExample(TdBatchTaskExample example);

    /**
     * deleteByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByExample(TdBatchTaskExample example);

    /**
     * deleteByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByPrimaryKey(Long batchTaskId);

    /**
     * insert 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insert(TdBatchTask record);

    /**
     * insertSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insertSelective(TdBatchTask record);

    /**
     * selectByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    List<TdBatchTask> selectByExample(TdBatchTaskExample example);

    /**
     * selectByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    TdBatchTask selectByPrimaryKey(Long batchTaskId);

    /**
     * updateByExampleSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExampleSelective(@Param("record") TdBatchTask record, @Param("example") TdBatchTaskExample example);

    /**
     * updateByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExample(@Param("record") TdBatchTask record, @Param("example") TdBatchTaskExample example);

    /**
     * updateByPrimaryKeySelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKeySelective(TdBatchTask record);

    /**
     * updateByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKey(TdBatchTask record);
}