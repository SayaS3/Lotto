package pl.lotto.domain.numberreciever;

import java.util.Set;

class NumberValidator {
    private static final int MAX_NUMBERS_FROM_USER = 6;
    private static final int MIN_NUMBERS_FROM_USER = 1;
    private static final int MAXIMAL_NUMBERS_FROM_USER = 99;

    boolean areAllNumbersInOfRange(Set<Integer> numbersFromUser) {
        return numbersFromUser.stream()
                .filter(number -> number >= MIN_NUMBERS_FROM_USER)
                .filter(number -> number <= MAXIMAL_NUMBERS_FROM_USER)
                .count() == MAX_NUMBERS_FROM_USER;
    }
}
