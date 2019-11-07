


window.chartColors = {
	      yellow: 'rgb(255, 204, 106)',
	      magenta: 'rgb(255, 58, 103)',
	      cyan: 'rgb(40, 164, 229)'
	    };

var config = {
	type: 'pie',
	data: {
		datasets: [{
			data: [
				15,
				30,
				10,
			],
			backgroundColor: [
				window.chartColors.magenta,
				window.chartColors.yellow,
				window.chartColors.cyan
			],
			label: 'Remuneracion'
		}],
		labels: [
			'Garantizada',
			'Variable',
			'Beneficios'
		]
	},
	options: {
		responsive: true,
		legend: {
			display:false,
			position: 'bottom',
            labels: {
                boxWidth: 20,
                padding: 20
            }
        }
	}
};

window.onload = function() {
	var ctx = document.getElementById('chart-area').getContext('2d');
	window.myPie = new Chart(ctx, config);
};