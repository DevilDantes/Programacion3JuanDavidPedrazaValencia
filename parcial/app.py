from flask import Flask, render_template

app = Flask(__name__)


@app.route('/')
def main():
    return render_template('main.html', page='main')

@app.route('/chart')
def chart():
    return render_template('charts-apexcharts.html')

@app.route('/chartjs')
def chartjs():
    return render_template('charts-chartjs.html')

@app.route('/echarts')
def echarts():
    return render_template('charts-echarts.html')

@app.route('/accordion')
def accordion():
    return render_template('components-accordion.html')

@app.route('/alerts')
def alerts():
    return render_template('components-alerts.html')

@app.route('/badges')
def badges():
    return render_template('components-badges.html')

@app.route('/breadcrumbs')
def breadcrumbs():
    return render_template('components-breadcrumbs.html')

@app.route('/buttons')
def buttons():
    return render_template('components-buttons.html')


if __name__ == '__main__':
    app.run(debug=True)
