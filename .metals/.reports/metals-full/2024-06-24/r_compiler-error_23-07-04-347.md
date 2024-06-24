file:///C:/Users/ASUS/Desktop/Scala/Practical%202/practical2.scala
### dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition m is defined in
  C:/Users/ASUS/Desktop/Scala/Practical 2/practical2.scala
and also in
  C:/Users/ASUS/Desktop/Scala/Practical 2/practical2.scala
One of these files should be removed from the classpath.

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.3\scala3-library_3-3.3.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 14
uri: file:///C:/Users/ASUS/Desktop/Scala/Practical%202/practical2.scala
text:
```scala
//1)
object Q@@ extends App{
var i, j, k = 2;
var m, n = 5;
var f=12.0f;
var g=4.0f;
var c='X';

val r1=k+12*m;
println(r1);
val r2=m/j;
println(r2);
val r3=n%j;
println(r3);
val r4=m/j*j;
println(r4);
val r5=f + 10*5 + g;
println(r5);
i += 1;
println(i);
val r6=i*n;
println(r6);
}

//
```



#### Error stacktrace:

```

```
#### Short summary: 

dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition m is defined in
  C:/Users/ASUS/Desktop/Scala/Practical 2/practical2.scala
and also in
  C:/Users/ASUS/Desktop/Scala/Practical 2/practical2.scala
One of these files should be removed from the classpath.