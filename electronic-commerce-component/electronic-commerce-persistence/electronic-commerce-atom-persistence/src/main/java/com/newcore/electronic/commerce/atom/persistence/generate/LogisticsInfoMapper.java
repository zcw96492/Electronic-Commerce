package com.newcore.electronic.commerce.atom.persistence.generate;

import com.newcore.electronic.commerce.base.model.generate.LogisticsInfo;
import com.newcore.electronic.commerce.base.model.generate.LogisticsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogisticsInfoMapper {
    /**
     * countByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int countByExample(LogisticsInfoExample example);

    /**
     * deleteByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByExample(LogisticsInfoExample example);

    /**
     * deleteByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByPrimaryKey(Integer logisticsInfoId);

    /**
     * insert 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insert(LogisticsInfo record);

    /**
     * insertSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insertSelective(LogisticsInfo record);

    /**
     * selectByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    List<LogisticsInfo> selectByExample(LogisticsInfoExample example);

    /**
     * selectByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    LogisticsInfo selectByPrimaryKey(Integer logisticsInfoId);

    /**
     * updateByExampleSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExampleSelective(@Param("record") LogisticsInfo record, @Param("example") LogisticsInfoExample example);

    /**
     * updateByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExample(@Param("record") LogisticsInfo record, @Param("example") LogisticsInfoExample example);

    /**
     * updateByPrimaryKeySelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKeySelective(LogisticsInfo record);

    /**
     * updateByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKey(LogisticsInfo record);
}