package streams

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(79); 
	val problem = new Pouring.Pouring(Vector(4, 9));System.out.println("""problem  : streams.Pouring.Pouring = """ + $show(problem ));$skip(15); val res$0 = 
	problem.moves;System.out.println("""res0: scala.collection.immutable.IndexedSeq[Product with Serializable with streams.test.problem.Move] = """ + $show(res$0));$skip(22); val res$1 = 
	problem.solutions(6);System.out.println("""res1: Stream[streams.test.problem.Path] = """ + $show(res$1))}
}