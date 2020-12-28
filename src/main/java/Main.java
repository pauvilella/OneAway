import java.util.*;

public class Main {
    String originalInput = "pale";
    String badInput = "pela";
    String[] goodInputs = { "ple", "psale", "bale" };

    boolean oneEditAway(String a, String b) {
        if (b.length() > a.length() + 1 || b.length() < a.length() - 1) {
            return false;
        }
        int edits = 0;
        if(a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                if(a.charAt(i) != b.charAt(i)) {
                    edits++;
                    if (edits > 1) {
                        return false;
                    }
                }
            }
        }

        if (b.length() > a.length()) {
            int offset = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i + offset)) {
                    offset++;
                    edits++;
                    i--;
                    if (edits > 1) {
                        return false;
                    }
                }
            }
        } else if(b.length() < a.length()) {
            int offset = 0;
            for (int i = 0; i < b.length(); i++) {
                if (a.charAt(i + offset) != b.charAt(i)) {
                    offset++;
                    edits++;
                    i--;
                    if (edits > 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Main program = new Main();
        boolean result = program.oneEditAway(program.originalInput, program.goodInputs[0]);
        System.out.println(result);
    }
}
