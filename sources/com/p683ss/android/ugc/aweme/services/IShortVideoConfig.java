package com.p683ss.android.ugc.aweme.services;

/* renamed from: com.ss.android.ugc.aweme.services.IShortVideoConfig */
public interface IShortVideoConfig {

    /* renamed from: com.ss.android.ugc.aweme.services.IShortVideoConfig$MusicWaveDataListener */
    public interface MusicWaveDataListener {
    }

    String cutsameSdkVersion();

    void enableHookLibrary(boolean z);

    boolean getUsingOnline();

    boolean isHookLibrary();

    boolean isRecording();

    long maxDuetVideoTime();

    long maxRecordingTime();

    long maxStitchVideoTime();

    void setUsingOnline(boolean z);
}
