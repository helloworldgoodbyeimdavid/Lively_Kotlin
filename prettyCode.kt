fun main() {
    val sum: (Int, 
    		        Int, 
              Int,
              Int,
              Int,
              Int,
              Int) -> Int = fun(a, 
              				              b, 
                                c,
                                d,
                                e,
                                f,
                                g): Int { return a +
                                			              b +
                                                 c +
                                                 d +
                                                 e +
                                                 f +
                                                 g }
                                                 
    println(sum(8,
    			         6,
                7,
                5,
                3,
                0,
                9))
  
}    