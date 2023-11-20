/**
 * A class that represents the number Luke.
 */
public class LukeNumber {

    private long value;
		/**
    * A constructor that initializes the number Luke based on its position.
    * @param position The position of the number Luke.
    */
    public LukeNumber(int position) {
      this.value = calculateLuke(position);
    }
		/**
    * A recursive function that calculates Luke's number based on his position.
    */
    private long calculateLuke(int n) {
      if (n == 1) return 1;
      if (n == 2) return 3;
      return calculateLuke(n - 1) + calculateLuke(n - 2);
    }
 		/**
    * @return The number Luke.
    */
		public long getValue() {
      return value;
    }
 		/**
    * @return The square of the number Luke.
    */
		public long getSquare() {
      return value * value;
    }
}
