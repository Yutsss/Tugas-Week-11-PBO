import java.util.ArrayList;
import java.util.List;

public class User {
  private String username;
  private List<Post> posts;
  private List<Post> likedPosts;

  public User(String username) {
    this.username = username;
    this.posts = new ArrayList<>();
    this.likedPosts = new ArrayList<>();
  }

  public String getUsername() {
    return username;
  }

  public void addPost(Post post) {
    posts.add(post);
  }

  public void likePost(Post post) {
    likedPosts.add(post);
    post.addLike();
  }

  public List<Post> getPosts() {
    return posts;
  }

  public List<Post> getLikedPosts() {
    return likedPosts;
  }
}