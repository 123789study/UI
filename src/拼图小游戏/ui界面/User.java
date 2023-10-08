package 拼图小游戏.ui界面;

public class User {
    private String Username;
    private String password;

    public User() {
    }

    public User(String Username, String password) {
        this.Username = Username;
        this.password = password;
    }

    /**
     * 获取
     * @return name
     */
    public String getUsername() {
        return Username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.Username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "User{name = " + Username + ", password = " + password + "}";
    }
}
