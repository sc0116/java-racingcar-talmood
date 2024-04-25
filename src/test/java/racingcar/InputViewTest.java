package racingcar;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;

public class InputViewTest extends InputTest {

	@EmptySource
	@ParameterizedTest
	void 자동차_이름_입력_시_빈_값을_입력할_수_없다(final String carNames) {
		given(carNames);

		assertThatThrownBy(InputView::inputCarNamesToRace)
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessage("자동차 이름에 빈 값을 입력할 수 없습니다.");
	}
}