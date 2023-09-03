class MainTest {
    private static Stream<Arguments> testcases() {
        return Stream.of(
                Arguments.of( "MANGO", "mango" ),
                Arguments.of( "peach", "PEACH" ),
                Arguments.of( "Apple", "aPPLE" ),
                Arguments.of( "baNANa", "BAnanA" ),
                Arguments.of( "Believe In YourSelF", "bELIEVE iN yOURsELf" ),
                Arguments.of( "THiS is how LIFE is!!", "thIs IS HOW life IS!!" ),
                Arguments.of( "Li^^ve  p$osi&TIVE*", "lI^^VE  P$OSI&tive*" ),
                Arguments.of( "%tiMe~~~~ iS>.< gggggolD ?:)", "%TImE~~~~ Is>.< GGGGGOLd ?:)" )
        );
    }

    @ParameterizedTest(name = "{0} --> {1}")
    @MethodSource("testcases")
    @DisplayName("[1] 대문자 ↔️ 소문자 변환")
    void test(String input, String answer) {
        Assertions.assertEquals(Main.solution(input), answer);
    }
}