package jionespring.splearn.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class EmailTest {

    @Test
    void equality() {
        var email1 = new Email("jione@splear.app");
        var email2 = new Email("jione@splearn.app");

        assertThat(email1).isNotEqualTo(email2);
    }
}
