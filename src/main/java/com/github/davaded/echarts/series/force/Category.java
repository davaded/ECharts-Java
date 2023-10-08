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

package com.alchiguru.alchigurueducationplatform.echarts.series.force;

import java.io.Serializable;

import com.alchiguru.alchigurueducationplatform.echarts.code.Symbol;
import com.alchiguru.alchigurueducationplatform.echarts.style.ItemStyle;

import lombok.Getter;
import lombok.Setter;

/**
 * 力导向图中节点的分类
 *
 * @author liuzh
 */
@Getter
@Setter
public class Category implements Serializable {

    private static final long serialVersionUID = 5805816011061262622L;

    /**
     * 类目名称
     */
    private String name;
    /**
     * 所有该类目的节点的形状, 详见 symbolList
     *
     * @see Symbol
     */
    private Object symbol;
    /**
     * 所有该类目的节点的大小
     */
    private Object symbolSize;
    /**
     * 该类目节点标记的旋转角度
     */
    private Integer symbolRotate;
    /**
     * 该类目节点标记相对于原本位置的偏移
     */
    private Object[] symbolOffset;
    /**
     * 所有该类目的节点是否能被拖拽
     */
    private Boolean draggable;
    /**
     * 详见 itemStyle
     *
     * @see ItemStyle
     */
    private ItemStyle itemStyle;
    /**
     * 详见 itemStyle
     *
     * @see ItemStyle
     */
    private ItemStyle label;

    /**
     * 构造函数
     */
    public Category() {
    }

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public Category(String name) {
        this.name = name;
    }

    public Integer symbolRotate() {
        return this.symbolRotate;
    }

    public Category symbolRotate(Integer symbolRotate) {
        this.symbolRotate = symbolRotate;
        return this;
    }

    public Object[] symbolOffset() {
        return this.symbolOffset;
    }

    public Category symbolOffset(Object[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public Category symbolOffset(Object o1, Object o2) {
        this.symbolOffset = new Object[]{o1, o2};
        return this;
    }

    public ItemStyle label() {
        if (this.label == null) {
            this.label = new ItemStyle();
        }
        return this.label;
    }

    public Category label(ItemStyle label) {
        this.label = label;
        return this;
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
    public Category name(String name) {
        this.name = name;
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
    public Category symbol(Object symbol) {
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
    public Category symbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    /**
     * 获取draggable值
     */
    public Boolean draggable() {
        return this.draggable;
    }

    /**
     * 设置draggable值
     *
     * @param draggable
     */
    public Category draggable(Boolean draggable) {
        this.draggable = draggable;
        return this;
    }

    /**
     * 详见 itemStyle
     *
     * @see ItemStyle
     */
    public ItemStyle itemStyle() {
        if (this.itemStyle == null) {
            this.itemStyle = new ItemStyle();
        }
        return this.itemStyle;
    }
}
