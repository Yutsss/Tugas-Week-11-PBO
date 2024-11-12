public class MessagePost extends Post {
  private String message;

  public MessagePost(String username, String message) {
    super(username);
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  @Override
  public void display() {
    System.out.println("User: " + getUsername());
    System.out.println("Message: " + message);
    System.out.println("Likes: " + getLikes());
  }
}