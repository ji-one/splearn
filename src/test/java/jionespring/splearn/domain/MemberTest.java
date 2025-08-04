package jionespring.splearn.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MemberTest {

    @Test
    void createMember() {
        var member = new Member("kirby@splearn.app", "Jiwon", "secret");

        assertThat(member.getStatus()).isEqualTo(MemberStatus.PENDING);
    }
}
