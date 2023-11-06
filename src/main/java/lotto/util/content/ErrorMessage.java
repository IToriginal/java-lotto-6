package lotto.util.content;

public enum ErrorMessage {

    LOTTO_SIZE_ERROR("[ERROR] 로또 번호가 6개의 숫자로 이뤄지지 않았습니다."),
    LOTTO_RANGE_ERROR("[ERROR] 로또 번호는 1 ~ 45 사이의 숫자이어야만 합니다."),
    INPUT_UNIT_ERROR("[ERROR] 로또 구입 비용은 1,000원 단위로 입력해야 합니다."),
    INPUT_SPACE_ERROR("[ERROR] 공백을 허용하지 않습니다."),
    INPUT_NUMERIC_ERROR("[ERROR] 정수형 숫자를 입력해야 합니다.");

    private final String content;

    ErrorMessage(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
