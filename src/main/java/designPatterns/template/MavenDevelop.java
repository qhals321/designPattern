package designPatterns.template;

public class MavenDevelop extends Develop{

    @Override
    protected void build() {
        System.out.println("메이븐으로 빌드합니다.");
    }
}
