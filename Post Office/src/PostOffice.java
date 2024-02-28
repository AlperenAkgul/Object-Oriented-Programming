public class PostOffice {
    String name;

    PostOffice(String name){
        this.name = name;
    }

    void send(Post post){
        System.out.println("Send message to " + post.targetAddress + " from " + post.sourceAddress + "\n"
         + post.message);
    }

    void receive(Post post){
        System.out.println("1 Message Received from " + post.sourceAddress + " to " + post.targetAddress + "\n"
                + post.message);
    }
}
