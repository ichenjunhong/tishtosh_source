package com.bytedance.android.p160b;

import android.content.Context;

/* renamed from: com.bytedance.android.b.a */
public interface C2831a {

    /* renamed from: com.bytedance.android.b.a$a */
    public interface C2832a {
        /* renamed from: a */
        void mo7451a(int i, int i2);

        /* renamed from: a */
        void mo7452a(int i, String str);

        /* renamed from: a */
        void mo7453a(Exception exc);

        /* renamed from: a */
        void mo7454a(Object obj);

        /* renamed from: j */
        void mo7455j();

        /* renamed from: k */
        void mo7456k();

        /* renamed from: l */
        void mo7457l();

        /* renamed from: m */
        void mo7458m();

        /* renamed from: n */
        void mo7459n();
    }

    long getAudioLostFocusTime();

    int getDecodeStatus();

    String getMediaErrorMessage();

    long getPlayerFirstFrameTime();

    long getPlayerStartTime();

    long getStartTime();

    void getVideoSize(int[] iArr);

    boolean hasWarmedUp();

    boolean isVideoHorizontal();

    void onBackground();

    void onForeground();

    void recycle();

    void setAnchorInteractMode(boolean z);

    void setMute(boolean z);

    void setScreenOrientation(boolean z);

    void setSeiOpen(boolean z);

    boolean start();

    boolean startWithNewLivePlayer();

    void stop(boolean z);

    void stopWhenJoinInteract(Context context);

    void stopWhenPlayingOther(Context context);

    void switchResolution(String str);

    boolean tryResumePlay();
}
