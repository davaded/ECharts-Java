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

package com.alchiguru.alchigurueducationplatform.echarts.style;

import java.io.Serializable;

import com.alchiguru.alchigurueducationplatform.echarts.style.itemstyle.Emphasis;
import com.alchiguru.alchigurueducationplatform.echarts.style.itemstyle.Normal;



/**
 * Description: ItemStyle
 *
 * @author liuzh
 */
public class ItemStyle implements Serializable {

    private static final long serialVersionUID = 418674375057055357L;

    /**
     * 阳线颜色
     */
    private Object color;
    /**
     * 阴线颜色
     */
    private Object color0;

    /**
     * 默认样式
     */
    private Normal normal;
    /**
     * 强调样式（悬浮时样式）
     */
    private Emphasis emphasis;
    /**
     * 面包屑
     */
    private Breadcrumb breadcrumb;
    /**
     * 二级边框宽度
     */
    private Integer childBorderWidth;
    /**
     * 二级边框颜色
     */
    private Object childBorderColor;

    private Object shadowBlur;
    private Object shadowOffsetX;
    private Object shadowColor;

    public Object shadowBlur() {
        return shadowBlur;
    }

    public ItemStyle shadowBlur(Object shadowBlur) {
        this.shadowBlur = shadowBlur;
        return this;
    }
    public Object shadowOffsetX() {
        return shadowOffsetX;
    }

    public ItemStyle shadowOffsetX(Object shadowOffsetX) {
        this.shadowOffsetX = shadowOffsetX;
        return this;
    }
     public Object shadowColor() {
        return shadowColor;
    }

    public ItemStyle shadowColor(Object shadowColor) {
        this.shadowColor = shadowColor;
        return this;
    }


    /**
     * 获取normal值
     */
    public Normal normal() {
        if (this.normal == null) {
            this.normal = new Normal();
        }
        return this.normal;
    }

    /**
     * 设置normal值
     *
     * @param normal
     */
    public ItemStyle normal(Normal normal) {
        this.normal = normal;
        return this;
    }

    /**
     * 获取emphasis值
     */
    public Emphasis emphasis() {
        if (this.emphasis == null) {
            this.emphasis = new Emphasis();
        }
        return this.emphasis;
    }

    /**
     * 设置emphasis值
     *
     * @param emphasis
     */
    public ItemStyle emphasis(Emphasis emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    /**
     * 获取normal值
     */
    public Normal getNormal() {
        return normal;
    }

    //以下属性是TreeMap特有

    /**
     * 设置normal值
     *
     * @param normal
     */
    public void setNormal(Normal normal) {
        this.normal = normal;
    }

    /**
     * 获取emphasis值
     */
    public Emphasis getEmphasis() {
        return emphasis;
    }

    /**
     * 设置emphasis值
     *
     * @param emphasis
     */
    public void setEmphasis(Emphasis emphasis) {
        this.emphasis = emphasis;
    }

    /**
     * 设置breadcrumb值
     *
     * @param breadcrumb
     */
    public ItemStyle breadcrumb(Breadcrumb breadcrumb) {
        this.breadcrumb = breadcrumb;
        return this;
    }

    /**
     * 获取breadcrumb值
     */
    public Breadcrumb breadcrumb() {
        if (this.breadcrumb == null) {
            this.breadcrumb = new Breadcrumb();
        }
        return this.breadcrumb;
    }

    /**
     * 设置childBorderWidth值
     *
     * @param childBorderWidth
     */
    public ItemStyle childBorderWidth(Integer childBorderWidth) {
        this.childBorderWidth = childBorderWidth;
        return this;
    }

    /**
     * 获取childBorderWidth值
     */
    public Integer childBorderWidth() {
        return this.childBorderWidth;
    }

    /**
     * 设置childBorderColor值
     *
     * @param childBorderColor
     */
    public ItemStyle childBorderColor(Object childBorderColor) {
        this.childBorderColor = childBorderColor;
        return this;
    }

    /**
     * 获取childBorderColor值
     */
    public Object childBorderColor() {
        return this.childBorderColor;
    }

    /**
     * 获取breadcrumb值
     */
    public Breadcrumb getBreadcrumb() {
        return breadcrumb;
    }

    /**
     * 设置breadcrumb值
     *
     * @param breadcrumb
     */
    public void setBreadcrumb(Breadcrumb breadcrumb) {
        this.breadcrumb = breadcrumb;
    }

    /**
     * 获取childBorderWidth值
     */
    public Integer getChildBorderWidth() {
        return childBorderWidth;
    }

    /**
     * 设置childBorderWidth值
     *
     * @param childBorderWidth
     */
    public void setChildBorderWidth(Integer childBorderWidth) {
        this.childBorderWidth = childBorderWidth;
    }

    /**
     * 获取childBorderColor值
     */
    public Object getChildBorderColor() {
        return childBorderColor;
    }

    /**
     * 设置childBorderColor值
     *
     * @param childBorderColor
     */
    public void setChildBorderColor(Object childBorderColor) {
        this.childBorderColor = childBorderColor;
    }

    /**
     * 获取color值
     */
    public Object color() {
        return this.color;
    }

    /**
     * 设置color值
     *
     * @param color
     */
    public ItemStyle color(Object color) {
        this.color = color;
        return this;
    }

    /**
     * 获取color0值
     */
    public Object color0() {
        return this.color0;
    }

    /**
     * 设置color0值
     *
     * @param color0
     */
    public ItemStyle color0(Object color0) {
        this.color0 = color0;
        return this;
    }

    /**
     * 获取color值
     */
    public Object getColor() {
        return color;
    }

    /**
     * 设置color值
     *
     * @param color
     */
    public void setColor(Object color) {
        this.color = color;
    }

    /**
     * 获取color0值
     */
    public Object getColor0() {
        return color0;
    }

    /**
     * 设置color0值
     *
     * @param color0
     */
    public void setColor0(Object color0) {
        this.color0 = color0;
    }
}
