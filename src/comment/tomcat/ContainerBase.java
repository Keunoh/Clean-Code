package comment.tomcat;

import javax.management.MBeanRegistration;
import javax.naming.directory.DirContext;
import java.io.Serializable;
import java.util.ArrayList;

public abstract class ContainerBase implements Container, Lifecycle, Pipeline,
        MBeanRegistration, Serializable {

    /**
     * 이 컴포넌트의 프로세서 지연값
     */
    protected int backgroundProcessorDelay = -1;

    /**
     * 이 컴포넌트를 지원하기 위한 생명주기 이벤트
     */
    protected LifecycleSupport lifecycle = new LifecycleSupport(this);

    /**
     * 이 컴포넌트를 위한 컨테이너 이벤트 Listener
     */
    protected ArrayList listeners = new ArrayList();

    /**
     * 컨테이너와 관련된 Loader 구현
     */
    protected Loader loader = null;

    /**
     * 컨테이너와 관련된 Logger 구현
     */
    protected Log logger = null;

    /**
     * 관련된 logger이름
     */
    protected String logName = null;

    /**
     * 컨테이너와 관련된 Manager 구현
     */
    protected Manager manager = null;

    /**
     * 컨테이너와 관련된 Cluster
     */
    protected Cluster cluster = null;

    /**
     * 사람이 읽을 수 있는 컨테이너 이름
     */
    protected String name = null;

    /**
     * 컨테이너의 부모 컨테이너
     */
    protected Container parent = null;

    /**
     * Loader를 설치할 때 구성이 끝나야 할 부모 클래스 로더
     */
    protected ClassLoader parentClassLoader = null;

    /**
     * 컨테이너와 관련된 Pipeline 객체
     */
    protected Pipeline pipeline = new StandardPipeline(this);

    /**
     * 컨테이너와 관련된 Realm
     */
    protected Realm realm = null;

    /**
     * 컨테이너와 관련된 DirContect 객체
     */
    protected DirContext resources = null;
}

