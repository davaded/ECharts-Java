package com.alchiguru.alchigurueducationplatform.echarts.axis;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author dya
 * @version 1.0
 * @project AlchiguruEducationPlatform
 * @description 极坐标
 * @date 2023/7/19 13:07:14
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AngleAxis extends Axis<AngleAxis> {

    private static final long serialVersionUID = -7486014114670118509L;

    /**
     * 组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。
     */
    private String id;

    /**
     * 角度轴所在的极坐标系的索引，默认使用第一个极坐标系。
     */
    private Integer polarIndex;

    /**
     * 起始刻度的角度，默认为 90 度，即圆心的正上方。0 度为圆心的正右方
     */
    private Integer  startAngle;


    /**
     * 坐标轴的分割段数，需要注意的是这个分割段数只是个预估值
     */
    private Integer splitNumber;




}
