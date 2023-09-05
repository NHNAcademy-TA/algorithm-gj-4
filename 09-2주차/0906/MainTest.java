class MainTest {
    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("123", "123", "246"),
                Arguments.of("1000", "1", "2"),
                Arguments.of("456", "789", "1461"),
                Arguments.of( "5", "5", "1"),
                Arguments.of("11112", "54321", "65433"),
                Arguments.of("3829", "1300", "4139")
        );
    }

    @ParameterizedTest(name = "{1} and {2} reverse plus result : {2}")
    @MethodSource("testCases")
    @DisplayName("수 뒤집기 덧셈 테스트")
    void algorithm_test(String first, String second, String answer) {
        int tmpFirst = Integer.parseInt(first);
        int tmpSecond = Integer.parseInt(second);

        Assertions.assertEquals(answer, String.valueOf(Main.solution(tmpFirst, tmpSecond)));
    }
}