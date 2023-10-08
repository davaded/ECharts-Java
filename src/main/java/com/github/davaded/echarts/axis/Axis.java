/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2015 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.alchiguru.alchigurueducationplatform.echarts.axis;

import java.util.ArrayList;
import java.util.Arrays;

import com.alchiguru.alchigurueducationplatform.echarts.AbstractData;
import com.alchiguru.alchigurueducationplatform.echarts.Component;
import com.alchiguru.alchigurueducationplatform.echarts.code.AxisType;
import com.alchiguru.alchigurueducationplatform.echarts.code.X;
import com.alchiguru.alchigurueducationplatform.echarts.code.Y;
import com.alchiguru.alchigurueducationplatform.echarts.style.LineStyle;

import lombok.Getter;
import lombok.Setter;

/**
 * 坐标轴
 *
 * @author liuzh
 */
@Getter
@Setter
public abstract class Axis<T> extends AbstractData<T> implements Component {
    /**
     * 是否显示
     */
    private Boolean show;
    /**
     * 坐标轴类型，横轴默认为类目型'category'，纵轴默认为数值型'value'
     *
     * @see AxisType
     */
    private AxisType type;
    /**
     * 坐标轴类型，横轴默认为类目型 'bottom'，纵轴默认为数值型 'left'，可选为：'bottom' | 'top' | 'left' |
     * 'right'
     *
     * @see X
     * @see Y
     */
    private Object position;
    /**
     * 坐标轴名称，默认为空
     */
    private String name;
    /**
     * 坐标轴线，默认显示，属性show控制显示与否，属性lineStyle（详见lineStyle）控制线条样式
     *
     * @see AxisLine
     * @see LineStyle
     */
    private AxisLine axisLine;
    /**
     * 坐标轴小标记，默认不显示，属性show控制显示与否，属性length控制线长，属性lineStyle（详见lineStyle）控制线条样式
     *
     * @see AxisTick
     * @see LineStyle
     */
    private AxisTick axisTick;
    /**
     * 坐标轴文本标签，详见axis.axisLabel
     *
     * @see AxisLabel
     */
    private AxisLabel axisLabel;
    /**
     * 分隔线，默认显示，属性show控制显示与否，属性lineStyle（详见lineStyle）控制线条样式
     *
     * @see SplitLine
     */
    private SplitLine splitLine;
    /**
     * 分隔区域，默认不显示，属性show控制显示与否，属性areaStyle（详见areaStyle）控制区域样式
     */
    private SplitArea splitArea;
    /**
     * 一级层叠控制
     */
    private Integer zlevel;
    /**
     * 二级层叠控制
     */
    private Integer z;
    /**
     * x 轴所在的 grid 的索引，默认位于第一个 grid
     */
    private Integer gridIndex;
    /**
     * 坐标轴名称与轴线之间的距离
     */
    private Integer nameGap;
    /**
     * 是否是反向坐标轴。ECharts 3 中新加
     */
    private Boolean inverse;
    /**
     * 坐标轴两边留白策略，类目轴和非类目轴的设置和表现不一样
     */
    private Object boundaryGap;
    /**
     * 坐标轴刻度最小值，在类目轴中无效
     */
    private Object min;
    /**
     * 坐标轴刻度最大值，在类目轴中无效
     */
    private Object max;
    /**
     * 只在数值轴中（type: 'value'）有效
     */
    private Boolean scale;
    /**
     * 坐标轴分割间隔
     */
    private Object interval;

    private Number minInterval;

    public Boolean scale() {
        return this.scale;
    }

    public T scale(Boolean scale) {
        this.scale = scale;
        return (T) this;
    }

    public Object interval() {
        return this.interval;
    }

    public T interval(Object interval) {
        this.interval = interval;
        return (T) this;
    }

    public T interval(Double interval) {
        this.interval = interval;
        return (T) this;
    }

    public Integer gridIndex() {
        return this.gridIndex;
    }

    public T gridIndex(Integer gridIndex) {
        this.gridIndex = gridIndex;
        return (T) this;
    }

    public Integer nameGap() {
        return this.nameGap;
    }

    public T nameGap(Integer nameGap) {
        this.nameGap = nameGap;
        return (T) this;
    }

    public Boolean inverse() {
        return this.inverse;
    }

    public T inverse(Boolean inverse) {
        this.inverse = inverse;
        return (T) this;
    }

    public Object boundaryGap() {
        return this.boundaryGap;
    }

    public T boundaryGap(Object boundaryGap) {
        this.boundaryGap = boundaryGap;
        return (T) this;
    }

    public T boundaryGap(Object[] boundaryGap) {
        this.boundaryGap = boundaryGap;
        return (T) this;
    }

    public T boundaryGap(Object o1, Object o2) {
        this.boundaryGap = new Object[]{o1, o2};
        return (T) this;
    }

    public Object min() {
        return this.min;
    }

    public T min(Object min) {
        this.min = min;
        return (T) this;
    }

    public T min(Double min) {
        this.min = min;
        return (T) this;
    }

    public Object max() {
        return this.max;
    }

    public T max(Object max) {
        this.max = max;
        return (T) this;
    }

    public T max(Double max) {
        this.max = max;
        return (T) this;
    }

    /**
     * 设置zlevel值
     *
     * @param zlevel
     */
    public T zlevel(Integer zlevel) {
        this.zlevel = zlevel;
        return (T) this;
    }

    /**
     * 获取zlevel值
     */
    public Integer zlevel() {
        return this.zlevel;
    }

    /**
     * 设置z值
     *
     * @param z
     */
    public T z(Integer z) {
        this.z = z;
        return (T) this;
    }

    /**
     * 获取z值
     */
    public Integer z() {
        return this.z;
    }

    /**
     * 获取show值
     */
    public Boolean show() {
        return this.show;
    }

    /**
     * 设置show值
     *
     * @param show
     */
    public T show(Boolean show) {
        this.show = show;
        return (T) this;
    }

    /**
     * 获取type值
     */
    public AxisType type() {
        return this.type;
    }

    /**
     * 获取type值
     */
    public AxisType getType() {
        return type;
    }

    /**
     * 设置type值
     *
     * @param type
     */
    public void setType(AxisType type) {
        this.type = type;
    }

    /**
     * 获取position值
     */
    public Object getPosition() {
        return position;
    }

    /**
     * 设置position值
     *
     * @param position
     */
    public void setPosition(Object position) {
        this.position = position;
    }

    /**
     * 获取name值
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name值
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 设置type值
     *
     * @param type
     */
    public T type(AxisType type) {
        this.type = type;
        return (T) this;

    }

    /**
     * 获取position值
     */
    public Object position() {
        return this.position;
    }

    /**
     * 设置position值
     *
     * @param position
     */
    public T position(Object position) {
        this.position = position;
        return (T) this;
    }

    /**
     * 设置position值
     *
     * @param position
     */
    public T position(X position) {
        this.position = position;
        return (T) this;
    }

    /**
     * 设置position值
     *
     * @param position
     */
    public T position(Y position) {
        this.position = position;
        return (T) this;
    }

    /**
     * 获取name值
     */
    public String name() {
        return this.name;
    }

    /**
     * 设置name值
     *
     * @param name
     */
    public T name(String name) {
        this.name = name;
        return (T) this;
    }

    /**
     * 坐标轴线，默认显示，属性show控制显示与否，属性lineStyle（详见lineStyle）控制线条样式
     *
     * @see AxisLine
     * @see LineStyle
     */
    public AxisLine axisLine() {
        if (this.axisLine == null) {
            this.axisLine = new AxisLine();
        }
        return this.axisLine;
    }

    /**
     * 设置axisLine值
     *
     * @param axisLine
     */
    public T axisLine(AxisLine axisLine) {
        this.axisLine = axisLine;
        return (T) this;
    }

    /**
     * 坐标轴小标记，默认不显示，属性show控制显示与否，属性length控制线长，属性lineStyle（详见lineStyle）控制线条样式
     *
     * @see AxisTick
     * @see LineStyle
     */
    public AxisTick axisTick() {
        if (this.axisTick == null) {
            this.axisTick = new AxisTick();
        }
        return this.axisTick;
    }

    /**
     * 设置axisTick值
     *
     * @param axisTick
     */
    public T axisTick(AxisTick axisTick) {
        this.axisTick = axisTick;
        return (T) this;
    }

    /**
     * 坐标轴文本标签，详见axis.axisLabel
     *
     * @see AxisLabel
     */
    public AxisLabel axisLabel() {
        if (this.axisLabel == null) {
            this.axisLabel = new AxisLabel();
        }
        return this.axisLabel;
    }

    /**
     * @param label
     * @return
     */
    public T axisLabel(AxisLabel label) {
        this.axisLabel = label;
        return (T) this;
    }

    /**
     * 分隔线，默认显示，属性show控制显示与否，属性lineStyle（详见lineStyle）控制线条样式
     *
     * @see SplitLine
     */
    public SplitLine splitLine() {
        if (this.splitLine == null) {
            this.splitLine = new SplitLine();
        }
        return this.splitLine;
    }

    /**
     * 设置splitLine值
     *
     * @param splitLine
     */
    public T splitLine(SplitLine splitLine) {
        if (this.splitLine == null) {
            this.splitLine = splitLine;
        }
        return (T) this;
    }

    /**
     * 分隔区域，默认不显示，属性show控制显示与否，属性areaStyle（详见areaStyle）控制区域样式
     */
    public SplitArea splitArea() {
        if (this.splitArea == null) {
            this.splitArea = new SplitArea();
        }
        return this.splitArea;
    }

    /**
     * 设置splitArea值
     *
     * @param splitArea
     */
    public T splitArea(SplitArea splitArea) {
        this.splitArea = splitArea;
        return (T) this;
    }

    /**
     * 添加坐标轴的类目属性
     *
     * @param values
     * @return
     */
    @Override
    public T data(Object... values) {
        if (values == null || values.length == 0) {
            return (T) this;
        }
        if (this.data == null) {
            if (this.type == AxisType.category) {
                data = new ArrayList<Object>();
            } else {
                throw new RuntimeException("数据轴不能添加类目信息!");
            }
        }
        this.data.addAll(Arrays.asList(values));
        return (T) this;
    }

    public Number minInterval() {
        return this.minInterval;
    }

    public T minInterval(Number minInterval) {
        this.minInterval = minInterval;
        return (T) this;
    }
}
