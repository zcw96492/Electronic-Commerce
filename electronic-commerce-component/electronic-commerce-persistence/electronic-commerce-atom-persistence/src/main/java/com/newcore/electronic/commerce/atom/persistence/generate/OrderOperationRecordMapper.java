package com.newcore.electronic.commerce.atom.persistence.generate;

import com.newcore.electronic.commerce.base.model.generate.OrderOperationRecord;
import com.newcore.electronic.commerce.base.model.generate.OrderOperationRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderOperationRecordMapper {
    /**
     * countByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int countByExample(OrderOperationRecordExample example);

    /**
     * deleteByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByExample(OrderOperationRecordExample example);

    /**
     * deleteByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByPrimaryKey(Integer orderOperationRecordId);

    /**
     * insert 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insert(OrderOperationRecord record);

    /**
     * insertSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insertSelective(OrderOperationRecord record);

    /**
     * selectByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    List<OrderOperationRecord> selectByExample(OrderOperationRecordExample example);

    /**
     * selectByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    OrderOperationRecord selectByPrimaryKey(Integer orderOperationRecordId);

    /**
     * updateByExampleSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExampleSelective(@Param("record") OrderOperationRecord record, @Param("example") OrderOperationRecordExample example);

    /**
     * updateByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExample(@Param("record") OrderOperationRecord record, @Param("example") OrderOperationRecordExample example);

    /**
     * updateByPrimaryKeySelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKeySelective(OrderOperationRecord record);

    /**
     * updateByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKey(OrderOperationRecord record);
}