package sg.edu.np.mad.exercise2;

public class User {
    private String Username;
    private String Description;
    private Integer Id;
    private Boolean Followed;

    public User () {}

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Boolean getFollowed() {
        return Followed;
    }

    public void setFollowed(Boolean followed) {
        Followed = followed;
    }
}
