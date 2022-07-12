package com.newcore.electronic.commerce.atom.persistence.generate;

import com.newcore.electronic.commerce.base.model.generate.CouponReceiveRecord;
import com.newcore.electronic.commerce.base.model.generate.CouponReceiveRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CouponReceiveRecordMapper {
    /**
     * countByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int countByExample(CouponReceiveRecordExample example);

    /**
     * deleteByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByExample(CouponReceiveRecordExample example);

    /**
     * deleteByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByPrimaryKey(Integer couponReceiveRecordId);

    /**
     * insert 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insert(CouponReceiveRecord record);

    /**
     * insertSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insertSelective(CouponReceiveRecord record);

    /**
     * selectByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    List<CouponReceiveRecord> selectByExample(CouponReceiveRecordExample example);

    /**
     * selectByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    CouponReceiveRecord selectByPrimaryKey(Integer couponReceiveRecordId);

    /**
     * updateByExampleSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExampleSelective(@Param("record") CouponReceiveRecord record, @Param("example") CouponReceiveRecordExample example);

    /**
     * updateByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExample(@Param("record") CouponReceiveRecord record, @Param("example") CouponReceiveRecordExample example);

    /**
     * updateByPrimaryKeySelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKeySelective(CouponReceiveRecord record);

    /**
     * updateByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKey(CouponReceiveRecord record);
}