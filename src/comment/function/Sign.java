package comment.function;

import java.util.ArrayList;

public class Sign {
    private SingleModule smodule = new SingleModule();
    private SubSystemMod subSysMod = new SubSystemMod();

    public void method() {
        // 전역 목록 <smodule>에 속하는 모듈이 우리가 속한 하위 시스템에 의존하는가?
        if (smodule.getDependSubsystems().contains(subSysMod.getSubSystem())) {
            System.out.println("Sign.method");
        }
    }

    //버전2
    public void method2() {
        ArrayList moduleDependees = smodule.getDependSubsystems();
        String ourSubSystem = subSysMod.getSubSystem();
        if (moduleDependees.contains(ourSubSystem)) {
            System.out.println("Sign.method2");
        }
    }


}
