public class SocialNetworkApp {
    public static void main(String[] args) {
        Network network = new Network();

        User john = new User("John");
        User emily = new User("Emily");
        User michael = new User("Michael");

        network.addUser(john);
        network.addUser(emily);
        network.addUser(michael);

        MessagePost johnMessage = new MessagePost("John", "Just cooked a delicious meal!");
        MessagePost emilyMessage = new MessagePost("Emily", "Reading a great book on leadership!");

        PhotoPost michaelPhoto = new PhotoPost("Michael", "https://example.com/sunset.jpg",
                "Beautiful sunset from my balcony!");

        john.addPost(johnMessage);
        emily.addPost(emilyMessage);
        michael.addPost(michaelPhoto);

        network.addPost(johnMessage);
        network.addPost(emilyMessage);
        network.addPost(michaelPhoto);

        emily.likePost(johnMessage);
        michael.likePost(emilyMessage);
        john.likePost(michaelPhoto);

        network.displayPosts();
    }
}
