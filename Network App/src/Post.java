public abstract class Post {
  private String username;
  private int likes;

  public Post(String username) {
    this.username = username;
    this.likes = 0;
  }

  public String getUsername() {
    return username;
  }

  public int getLikes() {
    return likes;
  }

  public void addLike() {
    likes++;
  }

  public abstract void display();
}