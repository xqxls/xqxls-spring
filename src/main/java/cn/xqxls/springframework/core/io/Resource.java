package cn.xqxls.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author xqxls
 * @create 2023-07-11 17:35
 * @Description
 */
public interface Resource {

    InputStream getInputStream() throws IOException;
}
