package com.p683ss.avframework.livestreamv2.core;

import com.p683ss.avframework.livestreamv2.ILiveStream.IAudioFrameAvailableListener;
import com.p683ss.avframework.livestreamv2.core.LiveCore.ILiveCoreTextureFrameAvailableListener;
import com.p683ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p683ss.avframework.livestreamv2.core.interact.InteractEngineBuilder;
import com.p683ss.avframework.utils.MiscUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.core.InteractEngine */
public interface InteractEngine extends IAudioFrameAvailableListener, ILiveCoreTextureFrameAvailableListener {
    public static final String AUDIO_LAYER_NAME = MiscUtils.getUUID("interact-audio");

    /* renamed from: com.ss.avframework.livestreamv2.core.InteractEngine$SEIListener */
    public interface SEIListener {
        void onReceiveSEI(int i, String str, int i2, int i3, int i4, float[] fArr, int i5, long j, ByteBuffer byteBuffer);
    }

    void addAudioFrameAvailableListener(IAudioFrameAvailableListener iAudioFrameAvailableListener);

    void addTextureFrameAvailableListener(ILiveCoreTextureFrameAvailableListener iLiveCoreTextureFrameAvailableListener);

    Client create(InteractConfig interactConfig, boolean z);

    void dispose();

    void enableGameMode(boolean z, boolean z2);

    InteractEngineBuilder getBuilder();

    boolean isInteracting();

    void needSaveSei(String str, Object obj);

    void onBGMAudioFrameAvailable(Buffer buffer, int i, int i2, int i3, long j);

    void pause();

    int queryRtcId(String str);

    void removeAudioFrameAvailableListener(IAudioFrameAvailableListener iAudioFrameAvailableListener);

    void removeTextureFrameAvailableListener(ILiveCoreTextureFrameAvailableListener iLiveCoreTextureFrameAvailableListener);

    void resume();

    void setSEIProcessor(SEIListener sEIListener);
}
