/**
 * OOPSBannerApp UC4 - Render OOPS as Banner using String Array and Loop
 * Goal: Improve modularity by storing banner lines in an array and using a loop.
 */
class OOPSBannerApp {
    public static void main(String[] args) {
        
        // 1. Create a String array to store all seven lines of the OOPS banner
        String[] bannerLines = new String[7];

        // 2. Array Population: Construct each line using String.join()
        // We maintain the 9-character width for each segment for proper alignment
        bannerLines[0] = String.join(" ", "  *** ", "   *** ", "  ***** ", " **** ");
        bannerLines[1] = String.join(" ", " *   * ", " *   * ", " *   * ", " *    ");
        bannerLines[2] = String.join(" ", " *   * ", " *   * ", " *   * ", " *  ");
        bannerLines[3] = String.join(" ", " *   * ", " *   * ", " ***** ", " **** ");
        bannerLines[4] = String.join(" ", " *   * ", " *   * ", " * ", "        * ");
        bannerLines[5] = String.join(" ", " *   * ", " *   * ", " * ", "        * ");
        bannerLines[6] = String.join(" ", "  *** ", "   *** ", "  * ", "     **** ");

        // 3. Loop Iteration: Use an Enhanced For Loop (for-each) to print
        // This eliminates repetitive print statements and improves readability
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}