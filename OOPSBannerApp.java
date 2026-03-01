/**
 * OOPSBannerApp UC3 - OOPS Banner Application (Use Case 3)
 * This version uses String.join() for memory efficiency and better readability.
 */
class OOPSBannerApp {
    public static void main(String[] args) {
        
        // Use String.join with a single space " " as the delimiter as per the hint
        // Each segment is adjusted to ensure vertical alignment across all 7 lines
        
        System.out.println(String.join(" ", "  *** ", "   *** ", "  ***** ", " **** "));
        System.out.println(String.join(" ", " *   * ", " *   * ", " *   * ", " * "));
        System.out.println(String.join(" ", " *   * ", " *   * ", " *   * ", " * "));
        System.out.println(String.join(" ", " *   * ", " *   * ", " ***** ", "  *** "));
        System.out.println(String.join(" ", " *   * ", " *   * ", " * ", "        * "));
        System.out.println(String.join(" ", " *   * ", " *   * ", " * ", "        * "));
        System.out.println(String.join(" ", "  *** ", "   *** ", "  * ", "     ****"));
    }
}