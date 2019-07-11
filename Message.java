public class Message {
  public static void main(String[] args) throws InterruptedException
  {
    System.out.println();
    System.out.println();
    String grinningFace = "\uD83D\uDE00";
    System.out.println("Thank you so much @Garima Ma'am and especially for being so patient ." +
                               "\nThankyou @Rashid Bhaiya, @Eklavya Bhaiya and @Sumera Didi for handling my weird doubts so well ." +
                               "\nIt was a fun filled summer and got to learn alot " + grinningFace + grinningFace + "\n");


    String l1 = " *******    *     *       *      **    *   *   *        *     *  ******  *    *  \t";
    String l2 = "    *       *     *      * *     * *   *   *  *          *   *   *    *  *    *  \t";
    String l3 = "    *       *******     *****    *  *  *   **             * *    *    *  *    *  \t";
    String l4 = "    *       *     *    *     *   *   * *   *  *            *     *    *  *    *  \t";
    String l5 = "    *       *     *   *       *  *    **   *   *           *     ******  ******  \t";

    while (true)
    {
      System.out.println("\r" + l1);
      System.out.println("\r" + l2);
      System.out.println("\r" + l3);
      System.out.println("\r" + l4);
      System.out.println("\r" + l5);

      Thread.sleep(40);

      System.out.print("\033[1F" + "\033[1F" + "\033[1F" + "\033[1F" + "\033[1F");
      l1 = l1.substring(1) + l1.substring(0, 1);
      l2 = l2.substring(1) + l2.substring(0, 1);
      l3 = l3.substring(1) + l3.substring(0, 1);
      l4 = l4.substring(1) + l4.substring(0, 1);
      l5 = l5.substring(1) + l5.substring(0, 1);


    }
  }
}
