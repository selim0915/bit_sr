<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/modules/exporting.js"></script>
<script src="https://code.highcharts.com/modules/export-data.js"></script>
<script type="text/javascript">
	$(function(){
			var data1 = new Array();
			$.getJSON("EmpChartService.do", function (data) {
				console.log(data.emplist);
				 
				 Highcharts.chart('container', {
					    chart: {
					        type: 'column'
					    },
					    title: {
					        text: '사원 입사월별 통계 그래프'
					    },
					    subtitle: {
					        text: '1980.01~2019.04'
					    },
					    xAxis: {
					        categories: [
					            '1월',
					            '2월',
					            '3월',
					            '4월',
					            '5월',
					            '6월',
					            '7월',
					            '8월',
					            '9월',
					            '10월',
					            '11월',
					            '12월'
					        ],
					        crosshair: true
					    },
					    yAxis: {
					        min: 0,
					        title: {
					            text: '사원 (명)'
					        }
					    },
					    tooltip: {
					        headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
					        pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
					            '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
					        footerFormat: '</table>',
					        shared: true,
					        useHTML: true
					    },
					    plotOptions: {
					        column: {
					            pointPadding: 0.2,
					            borderWidth: 0
					        }
					    },
					    series: [
					    	{
					    		name: 'ANALYST',
					        	data: [0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0]
					    	},
					    	{
					    		name: 'CLERK',
					        	data: [1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0]
					    	},
							{
					    		name: 'MANAGER',
					        	data: [1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
					    	},
							{
					    		name: 'PRESIDENT',
					        	data: [0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1]	
					    	},
							{
					    		name: 'SALESMAN',
					        	data: [0, 0, 1, 0, 0, 0, 0, 2, 0, 0, 0, 0]
					    	},
					    ]
					});
			});
		
	});
</script>
</head>
<body>
	<div id="container" style="min-width: 310px; height: 400px; margin: 0 auto">
	</div>
</body>
</html>