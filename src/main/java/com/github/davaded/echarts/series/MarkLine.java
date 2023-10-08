/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2015 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.alchiguru.alchigurueducationplatform.echarts.series;

import com.alchiguru.alchigurueducationplatform.echarts.AbstractData;
import com.alchiguru.alchigurueducationplatform.echarts.Tooltip;
import com.alchiguru.alchigurueducationplatform.echarts.code.Symbol;
import com.alchiguru.alchigurueducationplatform.echarts.style.ItemStyle;
import com.alchiguru.alchigurueducationplatform.echarts.style.LineStyle;

import lombok.*;

/**
 * Description: MarkLine
 *
 * @author liuzh
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MarkLine extends AbstractData<MarkLine> {
    /**
     * 标线起始和结束的symbol介绍类型，如果都一样，可以直接传string，同series中的symbol
     *
     * @see Symbol
     */
    private Object symbol;
    /**
     * 标线起始和结束的symbol大小，半宽（半径）参数，如果都一样，可以直接传number或function，同series中的symbolSize
     *
     */
    private Object symbolSize;
    /**
     * 标线起始和结束的symbol旋转控制，同series中的symbolRotate
     *
     */
    private Object symbolRoate;
    /**
     * 标线图形炫光特效
     *
     * @see Effect
     */
    private Effect effect;
    /**
     * 标线图形样式属性
     *
     * @see ItemStyle
     */
    private ItemStyle itemStyle;
    /**
     * 地图特有，标线图形定位坐标
     *
     */
    private GeoCoord geoCoord;
    /**
     * 平滑曲线
     */
    private Boolean smooth;
    /**
     * 平滑度，默认0.2
     *
     * @since 2.2.0
     */
    private Double smoothness;
    /**
     * 小数精度，默认2
     *
     * @since 2.2.0
     */
    private Integer precision;
    /**
     * 边捆绑
     *
     * @since 2.2.0
     */
    private Bundling bundling;

    private LineStyle lineStyle;

    private Tooltip tooltip;

    /**
     * 提示
     */
    public MarkLine tooltip(Tooltip tooltip) {

        this.tooltip = tooltip;

        return this;
    }

    /**
     * set lineStyle
     */
    public MarkLine lineStyle(LineStyle lineStyle) {

        this.lineStyle = lineStyle;

        return this;
    }

    /**
     * 获取边捆绑
     */
    public Bundling bundling() {
        if (this.bundling == null) {
            this.bundling = new Bundling();
        }
        return this.bundling;
    }

    /**
     * 设置边捆绑
     *
     * @param bundling
     */
    public MarkLine bundling(Bundling bundling) {
        this.bundling = bundling;
        return this;
    }

    /**
     * 获取平滑度
     */
    public Double smoothness() {
        return this.smoothness;
    }

    /**
     * 设置平滑度
     *
     * @param smoothness
     */
    public MarkLine smoothness(Double smoothness) {
        this.smoothness = smoothness;
        return this;
    }

    /**
     * 获取小数精度
     */
    public Integer precision() {
        return this.precision;
    }

    /**
     * 设置小数精度
     *
     * @param precision
     */
    public MarkLine precision(Integer precision) {
        this.precision = precision;
        return this;
    }

    /**
     * 设置effect值
     *
     * @param effect
     */
    public MarkLine effect(Effect effect) {
        this.effect = effect;
        return this;
    }

    /**
     * 设置itemStyle值
     *
     * @param itemStyle
     */
    public MarkLine itemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }

    /**
     * 获取symbol值
     */
    public Object symbol() {
        return this.symbol;
    }

    /**
     * 设置symbol值
     *
     * @param symbol
     */
    public MarkLine symbol(Object symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * 获取symbolSize值
     */
    public Object symbolSize() {
        return this.symbolSize;
    }

    /**
     * 设置symbolSize值
     *
     * @param symbolSize
     */
    public MarkLine symbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    /**
     * 获取symbolRoate值
     */
    public Object symbolRoate() {
        return this.symbolRoate;
    }

    /**
     * 设置symbolRoate值
     *
     * @param symbolRoate
     */
    public MarkLine symbolRoate(Object symbolRoate) {
        this.symbolRoate = symbolRoate;
        return this;
    }

    /**
     * 标线图形炫光特效
     *
     * @see Effect
     */
    public Effect effect() {
        if (this.effect == null) {
            this.effect = new Effect();
        }
        return this.effect;
    }

    /**
     * 标线图形样式属性
     *
     * @see ItemStyle
     */
    public ItemStyle itemStyle() {
        if (this.itemStyle == null) {
            this.itemStyle = new ItemStyle();
        }
        return this.itemStyle;
    }

    /**
     * 获取geoCoord值
     */
    public GeoCoord geoCoord() {
        if (this.geoCoord == null) {
            this.geoCoord = new GeoCoord();
        }
        return this.geoCoord;
    }

    /**
     * 设置name,x,y值
     *
     * @param name
     * @param x
     * @param y
     */
    public MarkLine geoCoord(String name, String x, String y) {
        this.geoCoord().put(name, x, y);
        return this;
    }

    /**
     * 获取smooth值
     */
    public Boolean smooth() {
        return this.smooth;
    }

    /**
     * 设置smooth值
     *
     * @param smooth
     */
    public MarkLine smooth(Boolean smooth) {
        this.smooth = smooth;
        return this;
    }

    /**
     * 边捆绑
     *
     * @since 2.2.0
     */
    @Getter
    @Setter
    public static class Bundling {
        private Boolean enable;
        private Integer maxTurningAngle;

        /**
         * 获取enable值
         */
        public Boolean enable() {
            return this.enable;
        }

        /**
         * 设置enable值
         *
         * @param enable
         */
        public Bundling enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * 获取maxTurningAngle值
         */
        public Integer maxTurningAngle() {
            return this.maxTurningAngle;
        }

        /**
         * 设置maxTurningAngle值
         *
         * @param maxTurningAngle
         */
        public Bundling maxTurningAngle(Integer maxTurningAngle) {
            this.maxTurningAngle = maxTurningAngle;
            return this;
        }
    }
}
