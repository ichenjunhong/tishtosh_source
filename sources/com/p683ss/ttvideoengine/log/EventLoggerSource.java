package com.p683ss.ttvideoengine.log;

import java.util.Map;

/* renamed from: com.ss.ttvideoengine.log.EventLoggerSource */
public interface EventLoggerSource {
    Map bytesInfo();

    int getLogValueInt(int i);

    long getLogValueLong(int i);

    String getLogValueStr(int i);

    String getMediaLoaderInfo();

    Map versionInfo();
}
