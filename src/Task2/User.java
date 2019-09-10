package Task2;


class User{
    String username;
    int age;

    public User() {
        this.username = null;
        this.age = 0;
    }

    public User(String username) {
        this.username = username;
    }

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
