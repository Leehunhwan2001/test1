class MultiDimArrayDemonstrator {
    public static void main(String[] args) {
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Mark Zuckerberg", "Barack Obama", "Bergoglio Sivori", "Angela Merkel", "Donald Trump", "Greta Thunberg", "Joseph Biden", "Kamala Harris"},
            {"1984-05-14", "1961-08-04", "1936-12-17", "1954-07-17", "1946-06-14", "2003-01-03", "1942-11-20", "1964-10-20"}
        };

        // 각각의 이름과 생년월일을 출력
        for (int i = 0; i < names[1].length; i++) {
            System.out.println(names[0][0] + names[1][i] + " " + names[2][i]);
        }
    }
}

