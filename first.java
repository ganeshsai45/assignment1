class Hello {
    public static void main(String[] args) {
        int i;
        System.out.println("*********\t\t********");
        for (i = 1; i <= 6; i++) {
            if (i % 3 == 0) {
                System.out.println("*\t\t\t*******");
            } else {
                System.out.println("*\t\t\t*");
            }
        }

    }
}