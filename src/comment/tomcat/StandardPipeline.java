package comment.tomcat;

public class StandardPipeline implements Pipeline {
    public StandardPipeline(ContainerBase containerBase) {
        System.out.println("StandardPipeline.StandardPipeline");
    }
}
