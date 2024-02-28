public class Main {
    public static void main(String[] args) {
        Post post = new Post("This is a test message.", "KARABUK", "ISTANBUL");
        PostOffice office = new PostOffice("User");
        office.send(post);
        office.receive(post);
    }
}