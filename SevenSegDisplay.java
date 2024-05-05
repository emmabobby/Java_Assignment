public class SevenSegDisplay {
    private static int[][] segment = new int[5][4];

    public static void fillA() {
        segment[0][0] = 1;
        segment[0][1] = 1;
        segment[0][2] = 1;
        segment[0][3] = 1;
    }

    public static void fillB() {
        segment[0][3] = 1;
        segment[1][3] = 1;
        segment[2][3] = 1;
    }

    public static void fillC() {
        segment[2][3] = 1;
        segment[3][3] = 1;
        segment[4][3] = 1;
    }

    public static void fillD() {
        segment[4][0] = 1;
        segment[4][1] = 1;
        segment[4][2] = 1;
        segment[4][3] = 1;
    }

    public static void fillE() {
        segment[2][0] = 1;
        segment[3][0] = 1;
        segment[4][0] = 1;
    }

    public static void fillF() {
        segment[0][0] = 1;
        segment[1][0] = 1;
        segment[2][0] = 1;
    }

    public static void fillG() {
        segment[2][0] = 1;
        segment[2][1] = 1;
        segment[2][2] = 1;
        segment[2][3] = 1;
    }

    public static void display() {
        for (int[] row : segment) {
            for (int col : row) {
                if (col == 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void inputValue(String value) {
        if (value.length() > 9) {
            throw new IllegalArgumentException("Input length must be less than or equal to 9");
        }

        for (char c : value.toCharArray()) {
            if (c != '0' && c != '1') {
                throw new IllegalArgumentException("Input must contain only 0s and 1s");
            }
        }

        for (int i = 0; i < value.length(); i++) {
            char bit = value.charAt(i);
            if (bit == '1') {
                switch (i) {
                    case 0:
                        fillA();
                        break;
                    case 1:
                        fillB();
                        break;
                    case 2:
                        fillC();
                        break;
                    case 3:
                        fillD();
                        break;
                    case 4:
                        fillE();
                        break;
                    case 5:
                        fillF();
                        break;
                    case 6:
                        fillG();
                        break;
                }
            }
        }
    }

    public static void main(String[] args) {
        SevenSegDisplay display = new SevenSegDisplay();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter binary Number: ");
        String value = scanner.next();
        scanner.close();

        try {
            display.inputValue(value);
            display.display();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}