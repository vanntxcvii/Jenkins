def getSum() {
    def script4 = loadScript("script4.groovy")
    def a = script4.multiplyNumbers(2, 3)
    def b = script4.multiplyNumbers(4, 5)
    return a + b
}
