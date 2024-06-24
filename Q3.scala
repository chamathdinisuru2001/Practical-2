//Q3
object Q3 extends App{
    val normalRate: Double=250.00
    val otRate: Double=85.00

    def normalSal(h:Int):Double= h*normalRate

    def otSal(h:Int):Double= h*otRate

    def grossSal(x:Int,y:Int):Double=normalSal(x)+otSal(y)

    def tax(m:Double):Double=m*0.12

    def takeHomeSal(x:Int,y:Int):Double= grossSal(x,y)+tax(grossSal(x,y))

    val hoursNormal = 40
    val hoursOT = 30
    val takeHome = takeHomeSal(hoursNormal, hoursOT)
    println(takeHome)
}