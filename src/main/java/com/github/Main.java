package com.alchiguru;

import com.alchiguru.alchigurueducationplatform.echarts.Grid;
import com.alchiguru.alchigurueducationplatform.echarts.Legend;
import com.alchiguru.alchigurueducationplatform.echarts.Option;
import com.alchiguru.alchigurueducationplatform.echarts.Tooltip;
import com.alchiguru.alchigurueducationplatform.echarts.axis.AxisLabel;
import com.alchiguru.alchigurueducationplatform.echarts.axis.AxisLine;
import com.alchiguru.alchigurueducationplatform.echarts.axis.SplitLine;
import com.alchiguru.alchigurueducationplatform.echarts.axis.ValueAxis;
import com.alchiguru.alchigurueducationplatform.echarts.code.AxisType;
import com.alchiguru.alchigurueducationplatform.echarts.code.LineType;
import com.alchiguru.alchigurueducationplatform.echarts.code.SeriesType;
import com.alchiguru.alchigurueducationplatform.echarts.json.GsonOption;
import com.alchiguru.alchigurueducationplatform.echarts.series.MarkLine;
import com.alchiguru.alchigurueducationplatform.echarts.series.Scatter;
import com.alchiguru.alchigurueducationplatform.echarts.style.LineStyle;
import com.alchiguru.alchigurueducationplatform.echarts.style.TextStyle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // 创建Option
        // Option 无需任何依赖; GsonOption 依赖 Gson, FsonOption 依赖 FastJson
        Option option = new GsonOption();
        // Grid grid=Grid.builder().left("3%").right("3%").top("10%").width("94%").height("80%").build();
        Grid grid = new Grid();
        grid.left("3%").right("3%").top("10%").width("94%").height("80%");
        option.grid(grid);
        Grid grid2 = new Grid();
        grid2.left("3%").right("3%").top("10%").width("94%").height("80%");
        option.grid(grid2);

        // 图例
        TextStyle textStyle = new TextStyle();
        textStyle.color("#ffffff").fontSize(15).setLineHeight(20);
        Legend legend = Legend.builder().inactiveColor("#3A464B").build().data("学术学习定制", "假期冲刺")
            .selected("学术学习定制", true).selected("假期冲刺", false).textStyle(textStyle).itemGap(40);
        option.legend(legend);

        // tooltip
//        Tooltip tooltip = new Tooltip();
//        tooltip.formatter(
//            "function (params) { var html = params.name + '日<br/>'   var color = params.color     var name = params.seriesName   var value = params.value.toString().split(',')[1]    if (value === null || value === undefined) { value = '--'}     html +='<span style=\"display:inline-block;width:10px;height:10px;border-radius:50%;background-color:' color ;margin-right:5px; \"    name    ': '    value   return html    }");
//        option.tooltip(tooltip);

        // 设置 x 轴为值轴, y 轴为值轴
        // x轴
        SplitLine splitLine = SplitLine.builder().show(false).build();
        ValueAxis valueAxis = new ValueAxis();
        valueAxis.type(AxisType.category).boundaryGap(false).gridIndex(0).min(1).max(31).splitLine(splitLine).data(0, 1,
            2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
            31);
        option.xAxis(valueAxis);
        ValueAxis valueAxis2 = new ValueAxis();
        valueAxis2.type(AxisType.category).boundaryGap(false).gridIndex(0).min(1).max(31).splitLine(splitLine).data(0,
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
            30, 31);
        option.xAxis(valueAxis2);
        // y轴
        AxisLabel axisLabel = new AxisLabel();
        axisLabel.show(true).interval("auto").formatter("{value}%");
        ValueAxis valueAxis3 = new ValueAxis();
        valueAxis3.gridIndex(0).min(0).max(100).axisLabel(axisLabel).axisLine(AxisLine.builder().show(true).build())
            .splitLine(SplitLine.builder().show(false).build());
        option.yAxis(valueAxis3);
        ValueAxis valueAxis4 = new ValueAxis();
        valueAxis4.gridIndex(0).min(0).max(100).axisLabel(axisLabel).axisLine(AxisLine.builder().show(true).build())
            .splitLine(SplitLine.builder().show(false).build());
        option.yAxis(valueAxis4);

        // 散点图
        Scatter scatter = new Scatter();
        Double[] doubles = new Double[2];
        doubles[0] = 5.0;
        doubles[1] = 61.0;
        Double[] doubles2 = new Double[2];
        doubles2[0] = 5.0;
        doubles2[1] = 61.0;
        Double[] doubles3 = new Double[2];
        doubles3[0] = 5.0;
        doubles3[1] = 61.0;
        Double[] doubles4 = new Double[2];
        doubles4[0] = 5.0;
        doubles4[1] = 61.0;
        Double[] doubles5 = new Double[2];
        doubles5[0] = 5.0;
        doubles5[1] = 61.0;
        Double[] doubles6 = new Double[2];
        doubles6[0] = 5.0;
        doubles6[1] = 61.0;

        List<Object> list = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("coord", new int[] {1, 80});
        map.put("symbol", "none");
        Map<String, Object> map2 = new HashMap<>();
        map2.put("coord", new int[] {31, 80});
        map2.put("symbol", "none");
        list.add(map);
        list.add(map2);
        scatter.name("学术学习定制").type(SeriesType.scatter).xAxisIndex(0).yAxisIndex(0)
            .data(doubles, doubles2, doubles3, doubles4, doubles5, doubles6)
            .markLine(new MarkLine().animation(false).data(new Object[] {list})
                .lineStyle(LineStyle.builder().type(LineType.dashed).build())
                .tooltip(Tooltip.builder().formatter("目标提升线").build()));
        option.series(scatter);

        Scatter scatter2 = new Scatter();
        Double[] doubles7 = new Double[2];
        doubles7[0] = 512.0;
        doubles7[1] = 6111.0;
        Double[] doubles8 = new Double[2];
        doubles8[0] = 52312.0;
        doubles8[1] = 6211.0;
        Double[] doubles9 = new Double[2];
        doubles9[0] = 531.0;
        doubles9[1] = 6331.0;
        Double[] doubles10 = new Double[2];
        doubles10[0] = 5423.0;
        doubles10[1] = 64.0;
        Double[] doubles11 = new Double[2];
        doubles11[0] = 55.0;
        doubles11[1] = 6531.0;
        Double[] doubles12 = new Double[2];
        doubles12[0] = 563.0;
        doubles12[1] = 661.0;

        List<Object> list2 = new ArrayList<>();
        Map<String, Object> map3 = new HashMap<>();
        map3.put("coord", new int[] {1, 80});
        map3.put("symbol", "none");
        Map<String, Object> map4 = new HashMap<>();
        map4.put("coord", new int[] {31, 80});//判断一个月的最后一天
        map4.put("symbol", "none");
        list2.add(map3);
        list2.add(map4);
        scatter2.name("学术学习定制aa").type(SeriesType.scatter).xAxisIndex(0).yAxisIndex(0)
            .data(doubles7, doubles8, doubles9, doubles10, doubles11, doubles12)
            .markLine(new MarkLine().animation(false).data(new Object[] {list2})
                .lineStyle(LineStyle.builder().type(LineType.dashed).build())
                .tooltip(Tooltip.builder().formatter("目标提升线").build()));
        option.series(scatter2);

        // 设置标题与子标题
        // option.title().text("某地区蒸发量和降水量").subtext("纯属虚构").x(X.left).y(Y.top);
        // 设置右上角工具箱
        // option.toolbox().show(true).feature(Tool.mark, Tool.dataView, Tool.restore, Tool.saveAsImage);

        // option.legend().textStyle(textStyle);

        // 气泡提示框
//        option.tooltip().trigger(Trigger.axis);

        // GsonOption 重写了 toString() 方法, 返回 Json（用 Gson 实现的）
        System.out.println(option.toString());
        System.out.println("Hello world!");
    }
}