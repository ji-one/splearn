package jionespring.splearn.domain;

// record - 불변 오브젝트를 만들 때 뛰어남
public record MemberCreateRequest(String email, String nickname, String password) {
}
