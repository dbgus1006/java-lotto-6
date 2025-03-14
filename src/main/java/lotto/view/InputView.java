package lotto.view;


import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class InputView {
    private static final String INPUT_LOTTO_AMOUNT = "구입금액을 입력해 주세요.";
    private static final String INPUT_WINNING_NUMBER = "당첨 번호를 입력해 주세요.";
    private static final String INPUT_BONUS_NUMBER = "보너스 번호를 입력해 주세요.";

    private static List<Integer> winningNumberList;
    public static String inputPlayerAmount() {
        System.out.println(INPUT_LOTTO_AMOUNT);
        return Console.readLine();
    }

    public static List<Integer> inputWinningNumbers() {
        System.out.println(INPUT_WINNING_NUMBER);
        return numberList(Console.readLine());
    }

    private static List<Integer> numberList(String winningNumbers) {
        String[] result = winningNumbers.split(",");
        winningNumberList = new ArrayList<>();
        for (int i = 0; i < result.length; i++) {
            winningNumberList.add(conventToInt(result[i]));
        }
        return winningNumberList;
    }

    private static int conventToInt(String inputNumber) {
        try {
            return Integer.parseInt(inputNumber);
        } catch (NumberFormatException e) {
            ExceptionMessage.wrongValueException();
            throw new IllegalArgumentException();
        }
    }

    public static int inputBonusNumber() {
        System.out.println(INPUT_BONUS_NUMBER);
        return Integer.parseInt(Console.readLine());
    }
}
