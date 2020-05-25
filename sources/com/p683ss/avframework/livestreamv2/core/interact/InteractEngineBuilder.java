package com.p683ss.avframework.livestreamv2.core.interact;

import android.os.Handler;
import com.p683ss.avframework.livestreamv2.core.InteractEngine;
import com.p683ss.avframework.livestreamv2.core.LiveCore;
import com.p683ss.avframework.livestreamv2.core.LiveCore.Builder;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.InteractEngineBuilder */
public class InteractEngineBuilder {
    private Builder mBuilder;
    private boolean mClientMixer;
    private WeakReference<LiveCore> mLiveCore = new WeakReference<>(null);
    private int mMixBackgroundColor;
    private String mOriginUrl;
    private AtomicInteger mPushAtomic;
    private boolean mSingleViewMode;
    private boolean mStatusLiveStreamIsAudioCaptured;
    private boolean mStatusLiveStreamIsPushed;
    private String mStreamUrl;
    private String mUUID;
    private boolean mUsingLiveCoreCapture = true;
    private boolean mUsingTextureView;
    private Handler mVideoThreadHandler;
    private Handler mWorkThreadHandler;

    public Builder getLiveCoreBuilder() {
        return this.mBuilder;
    }

    public int getMixBackgroundColor() {
        return this.mMixBackgroundColor;
    }

    public String getOriginUrl() {
        return this.mOriginUrl;
    }

    public AtomicInteger getPushAtomic() {
        return this.mPushAtomic;
    }

    public String getStreamUrl() {
        return this.mStreamUrl;
    }

    public String getUUID() {
        return this.mUUID;
    }

    public Handler getVideoThreadHander() {
        return this.mVideoThreadHandler;
    }

    public Handler getWorkThreadHandler() {
        return this.mWorkThreadHandler;
    }

    public boolean isClientMixer() {
        return this.mClientMixer;
    }

    public boolean isSingleViewMode() {
        return this.mSingleViewMode;
    }

    public boolean isStatusLiveStreamIsAudioCaptured() {
        return this.mStatusLiveStreamIsAudioCaptured;
    }

    public boolean isStatusLiveStreamIsPushed() {
        return this.mStatusLiveStreamIsPushed;
    }

    public boolean isUsingLiveCoreCapture() {
        return this.mUsingLiveCoreCapture;
    }

    public boolean isUsingTextureView() {
        return this.mUsingTextureView;
    }

    public InteractEngine create() {
        return new InteractEngineImpl(this);
    }

    public LiveCore getLiveCore() {
        return (LiveCore) this.mLiveCore.get();
    }

    public InteractEngineBuilder setClientMixer(boolean z) {
        this.mClientMixer = z;
        return this;
    }

    public InteractEngineBuilder setLiveCoreBuilder(Builder builder) {
        this.mBuilder = builder;
        return this;
    }

    public InteractEngineBuilder setMixBackgroundColor(int i) {
        this.mMixBackgroundColor = i;
        return this;
    }

    public InteractEngineBuilder setOriginUrl(String str) {
        this.mOriginUrl = str;
        return this;
    }

    public InteractEngineBuilder setPushAtomic(AtomicInteger atomicInteger) {
        this.mPushAtomic = atomicInteger;
        return this;
    }

    public InteractEngineBuilder setSingleView(boolean z) {
        this.mSingleViewMode = z;
        return this;
    }

    public InteractEngineBuilder setStatusLiveStreamIsAudioCaptured(boolean z) {
        this.mStatusLiveStreamIsAudioCaptured = z;
        return this;
    }

    public InteractEngineBuilder setStatusLiveStreamIsPushed(boolean z) {
        this.mStatusLiveStreamIsPushed = z;
        return this;
    }

    public InteractEngineBuilder setStreamUrl(String str) {
        this.mStreamUrl = str;
        return this;
    }

    public InteractEngineBuilder setUUID(String str) {
        this.mUUID = str;
        return this;
    }

    public InteractEngineBuilder setUsingLiveCoreCapture(boolean z) {
        this.mUsingLiveCoreCapture = z;
        return this;
    }

    public InteractEngineBuilder setUsingTextureView(boolean z) {
        this.mUsingTextureView = z;
        return this;
    }

    public InteractEngineBuilder setVideoThreadHandler(Handler handler) {
        this.mVideoThreadHandler = handler;
        return this;
    }

    public InteractEngineBuilder setWorkThreadHandler(Handler handler) {
        this.mWorkThreadHandler = handler;
        return this;
    }

    public InteractEngineBuilder setLiveCore(LiveCore liveCore) {
        this.mLiveCore = new WeakReference<>(liveCore);
        return this;
    }
}
