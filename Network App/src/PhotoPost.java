public class PhotoPost extends Post {
  private String imageUrl;
  private String caption;

  public PhotoPost(String username, String imageUrl, String caption) {
    super(username);
    this.imageUrl = imageUrl;
    this.caption = caption;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public String getCaption() {
    return caption;
  }

  @Override
  public void display() {
    System.out.println("User: " + getUsername());
    System.out.println("Image URL: " + imageUrl);
    System.out.println("Caption: " + caption);
    System.out.println("Likes: " + getLikes());
  }
}