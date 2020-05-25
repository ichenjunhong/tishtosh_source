package org.apache.commons.logging;

public interface Log {
    void debug(Object obj);

    void debug(Object obj, Throwable th);

    boolean isDebugEnabled();
}
