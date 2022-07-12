package com.newcore.electronic.commerce.atom.persistence.generate;

import com.newcore.electronic.commerce.base.model.generate.DictContrast;
import com.newcore.electronic.commerce.base.model.generate.DictContrastExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictContrastMapper {
    /**
     * countByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int countByExample(DictContrastExample example);

    /**
     * deleteByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByExample(DictContrastExample example);

    /**
     * insert 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insert(DictContrast record);

    /**
     * insertSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insertSelective(DictContrast record);

    /**
     * selectByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    List<DictContrast> selectByExample(DictContrastExample example);

    /**
     * updateByExampleSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExampleSelective(@Param("record") DictContrast record, @Param("example") DictContrastExample example);

    /**
     * updateByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExample(@Param("record") DictContrast record, @Param("example") DictContrastExample example);
}