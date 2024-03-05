def SumOfDigitOfANumberUsingRecursion(number):
    if number == 0:
        return 0
    a = int(number%10)
    b = int(number/10)
    return a+SumOfDigitOfANumberUsingRecursion(b)

if __name__ == '__main__':
    input1 = 12345
    input2 = 234
    print(SumOfDigitOfANumberUsingRecursion(input1))
    print(SumOfDigitOfANumberUsingRecursion(input2))