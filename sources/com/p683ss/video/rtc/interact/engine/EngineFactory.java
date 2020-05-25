package com.p683ss.video.rtc.interact.engine;

import android.util.Log;
import com.p683ss.video.rtc.interact.audio.AudioClientFactory;
import com.p683ss.video.rtc.interact.audio.AudioSinkFactory;
import com.p683ss.video.rtc.interact.callback.EngineCallback;
import com.p683ss.video.rtc.interact.model.Config;
import com.p683ss.video.rtc.interact.model.Config.Vendor;
import com.p683ss.video.rtc.interact.utils.log.LogUtil;
import com.p683ss.video.rtc.interact.video.VideoClientFactory;
import com.p683ss.video.rtc.interact.video.VideoSinkFactory;

/* renamed from: com.ss.video.rtc.interact.engine.EngineFactory */
public class EngineFactory {
    private static EngineFactory sEngineFactory;
    private Class<?> mAgoraEngine;
    private Class<?> mByteEngine;
    private Class<?> mZegoEngine;

    public static boolean supportsIntereact() {
        return get().support();
    }

    public static EngineFactory get() {
        synchronized (EngineFactory.class) {
            if (sEngineFactory == null) {
                sEngineFactory = new EngineFactory();
            }
        }
        return sEngineFactory;
    }

    public boolean support() {
        if (this.mAgoraEngine == null && this.mZegoEngine == null && this.mByteEngine == null) {
            return false;
        }
        return true;
    }

    public EngineFactory() {
        StringBuilder sb = new StringBuilder();
        try {
            this.mAgoraEngine = Class.forName("com.ss.video.rtc.interact.vendor.agora.AgoraEngine");
            sb.append("agora");
        } catch (ClassNotFoundException e) {
            LogUtil.m110874w("EngineFactory", Log.getStackTraceString(e));
        }
        try {
            this.mZegoEngine = Class.forName("com.ss.video.rtc.interact.vendor.zego.ZegoEngine");
            sb.append("|zego");
        } catch (ClassNotFoundException e2) {
            LogUtil.m110874w("EngineFactory", Log.getStackTraceString(e2));
        }
        try {
            this.mByteEngine = Class.forName("com.ss.video.rtc.interact.vendor.bytertc.ByteEngine");
            sb.append("|bytertc");
        } catch (ClassNotFoundException e3) {
            LogUtil.m110874w("EngineFactory", Log.getStackTraceString(e3));
        }
        StringBuilder sb2 = new StringBuilder("Find intereact: ");
        sb2.append(sb.toString());
        LogUtil.m110872i("EngineFactory", sb2.toString());
    }

    public static Engine create(Vendor vendor, Config config, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, VideoSinkFactory videoSinkFactory, AudioSinkFactory audioSinkFactory, EngineCallback engineCallback) {
        Class cls;
        Class<?> cls2;
        Engine engine = null;
        switch (vendor) {
            case AGORA:
                cls2 = get().mAgoraEngine;
                break;
            case BYTE:
                cls2 = get().mByteEngine;
                break;
            case ZEGO:
                cls2 = get().mZegoEngine;
                break;
            default:
                cls = null;
                break;
        }
        cls = cls2;
        if (cls != null) {
            engine = get().createEngine(cls, config, videoClientFactory, audioClientFactory, videoSinkFactory, audioSinkFactory, engineCallback);
        }
        if (engine != null) {
            return engine;
        }
        DummyEngine dummyEngine = new DummyEngine(config, videoClientFactory, audioClientFactory, videoSinkFactory, audioSinkFactory, engineCallback);
        return dummyEngine;
    }

    public Engine createEngine(Class<?> cls, Config config, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, VideoSinkFactory videoSinkFactory, AudioSinkFactory audioSinkFactory, EngineCallback engineCallback) {
        if (cls != null) {
            try {
                return (Engine) cls.getConstructor(new Class[]{Config.class, VideoClientFactory.class, AudioClientFactory.class, VideoSinkFactory.class, AudioSinkFactory.class, EngineCallback.class}).newInstance(new Object[]{config, videoClientFactory, audioClientFactory, videoSinkFactory, audioSinkFactory, engineCallback});
            } catch (Throwable th) {
                LogUtil.m110874w("EngineFactory", Log.getStackTraceString(th));
            }
        }
        return null;
    }
}
