object Problem_04_ {
  def isPalindrome(x: Int): Boolean =
    x.toString.reverse equals x.toString          //> isPalindrome: (x: Int)Boolean
  val xs = (100 to 999) flatMap (x => (100 to 999) map (y => (x, y)))
                                                  //> xs  : scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((100,100), 
                                                  //| (100,101), (100,102), (100,103), (100,104), (100,105), (100,106), (100,107),
                                                  //|  (100,108), (100,109), (100,110), (100,111), (100,112), (100,113), (100,114)
                                                  //| , (100,115), (100,116), (100,117), (100,118), (100,119), (100,120), (100,121
                                                  //| ), (100,122), (100,123), (100,124), (100,125), (100,126), (100,127), (100,12
                                                  //| 8), (100,129), (100,130), (100,131), (100,132), (100,133), (100,134), (100,1
                                                  //| 35), (100,136), (100,137), (100,138), (100,139), (100,140), (100,141), (100,
                                                  //| 142), (100,143), (100,144), (100,145), (100,146), (100,147), (100,148), (100
                                                  //| ,149), (100,150), (100,151), (100,152), (100,153), (100,154), (100,155), (10
                                                  //| 0,156), (100,157), (100,158), (100,159), (100,160), (100,161), (100,162), (1
                                                  //| 00,163), (100,164), (100,165), (100,166), (100,167), (100,168), (100,169), (
                                                  //| 100,170), (100,171), (100,172), (100,173), (100,174), (100,175), (100,176), 
                                                  //| (100,177), (100,178), (1
                                                  //| Output exceeds cutoff limit.
  val palindromeSet = (xs.map { case (a, b) => a * b }).filter(isPalindrome(_)).toSet
                                                  //> palindromeSet  : scala.collection.immutable.Set[Int] = Set(886688, 301103, 1
                                                  //| 05501, 16261, 83538, 46664, 545545, 68486, 649946, 11211, 53535, 81718, 2787
                                                  //| 2, 234432, 302203, 42024, 21012, 551155, 30003, 602206, 443344, 357753, 5212
                                                  //| 5, 604406, 345543, 249942, 25452, 51815, 39693, 729927, 18981, 510015, 58685
                                                  //| , 30603, 543345, 61516, 68286, 297792, 26562, 79897, 575575, 90109, 459954, 
                                                  //| 52925, 58185, 12221, 308803, 391193, 14241, 59295, 81618, 85358, 21812, 1388
                                                  //| 31, 528825, 19291, 40304, 17871, 80908, 15651, 92629, 201102, 60606, 102201,
                                                  //|  72927, 147741, 612216, 321123, 189981, 95259, 589985, 29392, 27772, 39093, 
                                                  //| 45154, 286682, 24442, 28482, 89798, 37373, 44844, 99999, 88888, 618816, 2979
                                                  //| 2, 421124, 70307, 43134, 88288, 92229, 23532, 650056, 723327, 456654, 64546,
                                                  //|  99199, 198891, 853358, 98889, 63536, 642246, 32623, 57875, 55255, 79597, 53
                                                  //| 235, 221122, 592295, 372273, 66466, 154451, 630036, 180081, 63736, 85158, 42
                                                  //| 6624, 371173, 99699, 577
                                                  //| Output exceeds cutoff limit.
  val sortedList = palindromeSet.toList.sortWith(_ > _)
                                                  //> sortedList  : List[Int] = List(906609, 888888, 886688, 861168, 855558, 85335
                                                  //| 8, 840048, 828828, 824428, 821128, 819918, 809908, 807708, 804408, 802208, 8
                                                  //| 01108, 793397, 780087, 770077, 749947, 747747, 737737, 729927, 723327, 69889
                                                  //| 6, 696696, 693396, 689986, 678876, 675576, 672276, 666666, 663366, 661166, 6
                                                  //| 60066, 657756, 656656, 654456, 653356, 652256, 650056, 649946, 648846, 64224
                                                  //| 6, 639936, 636636, 631136, 630036, 623326, 619916, 618816, 616616, 612216, 6
                                                  //| 11116, 606606, 604406, 603306, 602206, 601106, 595595, 592295, 589985, 58888
                                                  //| 5, 585585, 580085, 579975, 577775, 576675, 575575, 573375, 571175, 570075, 5
                                                  //| 65565, 564465, 561165, 560065, 555555, 554455, 551155, 550055, 549945, 54884
                                                  //| 5, 545545, 543345, 536635, 535535, 534435, 531135, 528825, 525525, 523325, 5
                                                  //| 22225, 520025, 519915, 515515, 514415, 513315, 512215, 510015, 509905, 50880
                                                  //| 5, 507705, 506605, 505505, 493394, 491194, 489984, 488884, 487784, 485584, 4
                                                  //| 84484, 477774, 476674, 4
                                                  //| Output exceeds cutoff limit.
                                                  
  println(sortedList(0))                          //> 906609
}