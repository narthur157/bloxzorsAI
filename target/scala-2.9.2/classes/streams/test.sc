package streams

object test {
	val problem = new Pouring.Pouring(Vector(4, 9))
                                                  //> problem  : streams.Pouring.Pouring = streams.Pouring$Pouring@2e24f4eb
	problem.moves                             //> res0: scala.collection.immutable.IndexedSeq[Product with Serializable with st
                                                  //| reams.test.problem.Move] = Vector(Empty(0), Empty(1), Fill(0), Fill(1), Pour(
                                                  //| 0,1), Pour(1,0))
	problem.solutions(6)                      //> res1: Stream[streams.test.problem.Path] = Stream(Fill(1) Pour(1,0) Empty(0) 
                                                  //| Pour(1,0) Empty(0) Pour(1,0) Fill(1) Pour(1,0)--> Vector(4, 6), ?)
}