class UserLogin {
    private String username;
    private String password;

    public UserLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void login() {
        System.out.println("User " + username + " logged in.");
    }

    public void logout() {
        System.out.println("User " + username + " logged out.");
    }
}