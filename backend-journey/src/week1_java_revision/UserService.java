package week1_java_revision;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeSet;

public class UserService {

    private final UserRepository repository = new UserRepository();

    public void createUser(Long id, String name, String email) {
        if (repository.existsByEmail(email)) {
            throw new DuplicateException("User with email already exists");
        }
        User user = new User(id, name, email);
        repository.saveUser(user);
    }

    public User getUserById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found"));
    }

    public Map<Long, User> findAllUsers() {
        return repository.findAllUsers();
    }

    public TreeSet<User> getSortedUsers() {
        TreeSet<User> set = new TreeSet<>(Comparator.comparing(User::getDisplayName));
        set.addAll(repository.findAllUsers().values());
        return set;
    }
}
