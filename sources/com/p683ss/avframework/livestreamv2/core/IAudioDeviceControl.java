package com.p683ss.avframework.livestreamv2.core;

import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.core.IAudioDeviceControl */
public interface IAudioDeviceControl {

    /* renamed from: com.ss.avframework.livestreamv2.core.IAudioDeviceControl$IAudioTrack */
    public interface IAudioTrack {
        void dispose();

        void enableAGC(boolean z, boolean z2);

        int getChannel();

        int getSampleHz();

        float getVolume();

        boolean isEnableAGC();

        boolean isMute();

        String name();

        void onData(ByteBuffer byteBuffer, int i, int i2, int i3, long j);

        void onData(ByteBuffer byteBuffer, int i, long j);

        boolean setMute(boolean z);

        void setVolume(float f);
    }

    IAudioTrack createTrack(String str, int i, int i2, int i3);

    boolean enableAEC(boolean z);

    boolean enableEcho(boolean z);

    IAudioTrack getTrack(String str);

    IAudioTrack[] getTracks();

    float getVolume();

    boolean isEnableAEC();

    boolean isEnableEcho();

    void setOriginTriggering(String str);

    void setVolume(float f);
}
