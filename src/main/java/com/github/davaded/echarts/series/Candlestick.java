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

package com.alchiguru.alchigurueducationplatform.echarts.series;


import com.alchiguru.alchigurueducationplatform.echarts.code.Orient;
import com.alchiguru.alchigurueducationplatform.echarts.code.SeriesType;

import lombok.Getter;
import lombok.Setter;

/**
 * Description: K
 *
 * @author liuzh
 */
@Getter
@Setter
public class Candlestick extends Series<Candlestick> {
    /**
     * 柱条（K线蜡烛）宽度，不设时自适应
     */
    private Integer barWidth;
    /**
     * 柱条（K线蜡烛）最大宽度，不设时自适应
     */
    private Integer barMaxWidth;
    /**
     * 布局方式
     */
    private Orient layout;

    /**
     * 构造函数
     */
    public Candlestick() {
        this.type(SeriesType.candlestick);
    }

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public Candlestick(String name) {
        super(name);
        this.type(SeriesType.candlestick);
    }

    /**
     * 设置open,close,min,max值
     *
     * @param open
     * @param close
     * @param min
     * @param max
     */
    public Candlestick data(Double open, Double close, Double min, Double max) {
        Object[] kData = new Object[]{open, close, min, max};
        super.data(kData);
        return this;
    }

    /**
     * 获取barWidth值
     */
    public Integer barWidth() {
        return this.barWidth;
    }

    /**
     * 设置barWidth值
     *
     * @param barWidth
     */
    public Candlestick barWidth(Integer barWidth) {
        this.barWidth = barWidth;
        return this;
    }

    /**
     * 获取barMaxWidth值
     */
    public Integer barMaxWidth() {
        return this.barMaxWidth;
    }

    /**
     * 设置barMaxWidth值
     *
     * @param barMaxWidth
     */
    public Candlestick barMaxWidth(Integer barMaxWidth) {
        this.barMaxWidth = barMaxWidth;
        return this;
    }

    public Orient layout() {
        return this.layout;
    }

    public Candlestick layout(Orient layout) {
        this.layout = layout;
        return this;
    }
}
