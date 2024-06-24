//Q2
object Q2 extends App{
    var a: Int=2
    var b: Int=3
    var c: Int=4
    var d: Int=5
    var k: Float=4.3f

    val A=(b*a+c*d) // double -- will be cancelled
    println(A)

    val B = a
    a += 1
    println(B)

    var g=0.0f // assigning a value for g since it was not assigned
    val C = -2*(g-k)+c
    println(C)

    val D = c
    c=c+1
    println(D)

    c+=1
    val E=c*a
    a+=1
    println(E)
}