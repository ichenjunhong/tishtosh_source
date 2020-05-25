package com.p683ss.ugc.live.sdk.message.data;

/* renamed from: com.ss.ugc.live.sdk.message.data.IMessage */
public interface IMessage {
    int getIntType();

    long getMessageId();

    int getPriority();

    boolean needMonitor();
}
