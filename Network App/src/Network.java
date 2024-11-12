import java.util.ArrayList;
import java.util.List;

public class Network {
  private List<User> users;
  private List<Post> posts;

  public Network() {
    this.users = new ArrayList<>();
    this.posts = new ArrayList<>();
  }

  public void addUser(User user) {
    users.add(user);
  }

  public void addPost(Post post) {
    posts.add(post);
  }

  public List<User> getUsers() {
    return users;
  }

  public List<Post> getPosts() {
    return posts;
  }

  public void displayPosts() {
    for (Post post : posts) {
      post.display();
      System.out.println();
    }
  }
}