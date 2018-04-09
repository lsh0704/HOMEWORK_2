#include <stdio.h>

double integ(double(*f)(double), double a, double b, int n) {
	double sum, x, x1, delta, area;
	int i;
	delta = (b - a) / n;
	for (i = 0, sum = 0.0; i < n; i++) {
		x = a + i * delta;
		x1 = x + delta;
		area = delta * (f(x) + f(x1)) / 2;
		sum += area;
	}
	return sum;
}