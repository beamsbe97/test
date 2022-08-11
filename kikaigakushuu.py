import numpy as np
import matplotlib.pyplot as plt
import random
np.random.seed(2)

x = np.random.normal(3, 0.5, 10)
y = np.random.normal(15, 0.5, 10) / x
ogInput = plt.scatter(x,y)
#plt.show()

x_test = np.random.normal(3, 1, 20)
y_test = np.random.normal(150, 40, 20) / x_test
test_output = plt.scatter(x_test,y_test)
#plt.show()

weights = random.uniform(-1, 1)
bias = random.uniform(-1,1)


dot_product_1 = np.dot(x, weights)
dot_product_2 = np.dot(y, weights)

input = plt.scatter(dot_product_1, dot_product_2)
#plt.show()
class Layer:
    def __init__(self, n_inputs, n_neurons):
        self.weights = 0.10*np.random.randn(n_inputs, n_neurons)
        self.bias = np.random.randn * n_inputs
    
    def forward(self, inputs):
        self.output = np.dot(input, self.weights) + self.bias
        
class Activation:
    def reLu(x):
        return max(0.0, x)

Activation.reLu(Layer.forward(ogInput))