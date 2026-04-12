package week1_java_revision;

import java.util.*;

public class UserRepository {
    private final Map<Long, User> userMap = new HashMap<>();
    private final List<User> userList = new ArrayList<>();

    public void saveUser(User user) {
        userMap.put(user.getId(), user);
        userList.add(user);
    }

    public Optional<User> findById(Long id) {
        return Optional.ofNullable(userMap.get(id));
    }

    public Map<Long, User> findAllUsers() {
        return Collections.unmodifiableMap(userMap);
    }

    public boolean existsByEmail(String email) {
        return userList.stream().anyMatch(u -> u.getEmail().equals(email));
    }
}
