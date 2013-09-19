package streams

object StreamsNotes {
  def streamRange(lo: Int, hi: Int): Stream[Int] = 
  	if (lo >= hi) Stream.empty
  	else Stream.cons(lo, streamRange(lo + 1, hi))
}