package week1_java_revision;

import java.util.Objects;

enum AccountStatus {
    ACTIVE
}

public class User {
    private final Long id;
    private final String email;
    private String displayName;
    private AccountStatus status;

    public User(Long id, String displayName, String email) {
        this.id = id;
        this.displayName = displayName;
        this.email = email;
        this.status = AccountStatus.ACTIVE;
    }

    public String getEmail() {
        return email;
    }

    public Long getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return Objects.equals(email, user.email);
    }
}
