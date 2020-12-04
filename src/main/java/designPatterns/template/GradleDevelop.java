package designPatterns.template;

public class GradleDevelop extends Develop{

    @Override
    protected void build() {
        System.out.println("그레이들로 빌드합니다.");
    }
}
