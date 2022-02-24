import pytest

def test_addition():
    num1 = 10
    num2 = 15
    sum = num1 + num2
    assert sum == 25

def test_subtraction():
    num1 = 50
    num2 = 35
    diff = num1 - num2
    assert diff == 15


def test_multiplication():
    num1 = 5
    num2 = 20
    product = num1 * num2
    assert product == 100

def test_division():
    num1 = 100
    num2 = 5
    quotient = num1 / num2
    assert quotient == 20
