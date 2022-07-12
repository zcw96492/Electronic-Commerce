package com.newcore.electronic.commerce.atom.persistence.generate;

import com.newcore.electronic.commerce.base.model.generate.LogisticsCompany;
import com.newcore.electronic.commerce.base.model.generate.LogisticsCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogisticsCompanyMapper {
    /**
     * countByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int countByExample(LogisticsCompanyExample example);

    /**
     * deleteByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByExample(LogisticsCompanyExample example);

    /**
     * deleteByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByPrimaryKey(Integer logisticsCompanyId);

    /**
     * insert 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insert(LogisticsCompany record);

    /**
     * insertSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insertSelective(LogisticsCompany record);

    /**
     * selectByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    List<LogisticsCompany> selectByExample(LogisticsCompanyExample example);

    /**
     * selectByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    LogisticsCompany selectByPrimaryKey(Integer logisticsCompanyId);

    /**
     * updateByExampleSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExampleSelective(@Param("record") LogisticsCompany record, @Param("example") LogisticsCompanyExample example);

    /**
     * updateByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExample(@Param("record") LogisticsCompany record, @Param("example") LogisticsCompanyExample example);

    /**
     * updateByPrimaryKeySelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKeySelective(LogisticsCompany record);

    /**
     * updateByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKey(LogisticsCompany record);
}