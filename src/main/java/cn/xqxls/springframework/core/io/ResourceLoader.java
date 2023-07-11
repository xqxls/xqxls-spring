package cn.xqxls.springframework.core.io;

/**
 * @author xqxls
 * @create 2023-07-11 17:41
 * @Description
 */
public interface ResourceLoader {

    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);

}
