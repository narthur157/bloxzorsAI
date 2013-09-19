package streams

object StreamsNotes {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(168); 
  def streamRange(lo: Int, hi: Int): Stream[Int] =
  	if (lo >= hi) Stream.empty
  	else Stream.cons(lo, streamRange(lo + 1, hi));System.out.println("""streamRange: (lo: Int, hi: Int)Stream[Int]""")}
}