<template>
  <div class="flex flex-col">
    <!-- <div class="flex text-xs text-gray-600 mr-10">
      <div
        class="
          p-0.5
          px-4
          rounded-full
          border border-gray-400
          bg-gray-200
          cursor-pointer
          hover:bg-gray-300
        "
      >
        2021-9-30
      </div>

      <div
        class="
          p-0.5
          ml-2
          px-4
          rounded-full
          border border-gray-400
          bg-gray-200
          cursor-pointer
          hover:bg-gray-300
        "
      >
        2021-9-30
      </div>
    </div> -->
    <div ref="chart"></div>
  </div>
</template>

<script>
import * as d3 from "d3";
export default {
  methods: {
    render(e) {
      var width = 960,
        height = 136,
        cellSize = 17;

      var formatPercent = d3.format(".1%");

      var color = d3
        .scaleQuantize()
        .domain([-0.05, 0.05])
        .range([
          "#a50026",
          "#d73027",
          "#f46d43",
          "#fdae61",
          "#fee08b",
          "#ffffbf",
          "#d9ef8b",
          "#a6d96a",
          "#66bd63",
          "#1a9850",
          "#006837",
        ]);

      var svg = d3
        .select(e)
        .selectAll("svg")
        .data(d3.range(2020, 2021))
        .enter()
        .append("svg")
        .attr("width", width)
        .attr("height", height)
        .append("g")
        .attr(
          "transform",
          "translate(" +
            (width - cellSize * 53) / 2 +
            "," +
            (height - cellSize * 7 - 1) +
            ")"
        );

      var rect = svg
        .append("g")
        .attr("fill", "none")
        .attr("stroke", "#ccc")
        .selectAll("rect")
        .data(function (d) {
          return d3.timeDays(new Date(d, 0, 1), new Date(d + 1, 0, 1));
        })
        .enter()
        .append("rect")
        .attr("width", cellSize)
        .attr("height", cellSize)
        .attr("x", function (d) {
          return d3.timeWeek.count(d3.timeYear(d), d) * cellSize;
        })
        .attr("y", function (d) {
          return d.getDay() * cellSize;
        })
        .datum(d3.timeFormat("%Y-%m-%d"));

      svg
        .append("g")
        .attr("fill", "none")
        .attr("stroke", "#ddd")
        .selectAll("path")
        .data(function (d) {
          return d3.timeMonths(new Date(d, 0, 1), new Date(d + 1, 0, 1));
        })
        .enter()
        .append("path")
        .attr("d", pathMonth);

      // d3.csv("dji.csv", function (error, csv) {
      //   if (error) throw error;

      //   var data = d3
      //     .nest()
      //     .key(function (d) {
      //       return d.Date;
      //     })
      //     .rollup(function (d) {
      //       return (d[0].Close - d[0].Open) / d[0].Open;
      //     })
      //     .object(csv);

      //   rect
      //     .filter(function (d) {
      //       return d in data;
      //     })
      //     .attr("fill", function (d) {
      //       return color(data[d]);
      //     })
      //     .append("title")
      //     .text(function (d) {
      //       return d + ": " + formatPercent(data[d]);
      //     });
      // });

      function pathMonth(t0) {
        var t1 = new Date(t0.getFullYear(), t0.getMonth() + 1, 0),
          d0 = t0.getDay(),
          w0 = d3.timeWeek.count(d3.timeYear(t0), t0),
          d1 = t1.getDay(),
          w1 = d3.timeWeek.count(d3.timeYear(t1), t1);
        return (
          "M" +
          (w0 + 1) * cellSize +
          "," +
          d0 * cellSize +
          "H" +
          w0 * cellSize +
          "V" +
          7 * cellSize +
          "H" +
          w1 * cellSize +
          "V" +
          (d1 + 1) * cellSize +
          "H" +
          (w1 + 1) * cellSize +
          "V" +
          0 +
          "H" +
          (w0 + 1) * cellSize +
          "Z"
        );
      }
    },
  },
  mounted() {
    console.log("加载");
    this.render(this.$refs.chart);
  },
};
</script>
