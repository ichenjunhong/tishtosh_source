package com.p683ss.avframework.livestreamv2.core;

import android.opengl.EGLContext;
import android.os.Handler;
import android.view.View;
import com.p683ss.avframework.effect.IVideoEffectProcessor;
import com.p683ss.avframework.engine.AudioDeviceModule;
import com.p683ss.avframework.engine.VideoSink;
import com.p683ss.avframework.engine.VsyncModule;
import com.p683ss.avframework.livestreamv2.ILiveStream;
import com.p683ss.avframework.livestreamv2.ILiveStream.IAudioFrameAvailableListener;
import com.p683ss.avframework.livestreamv2.ILiveStream.ITextureFrameAvailableListener;
import com.p683ss.avframework.livestreamv2.LiveStreamBuilder;
import com.p683ss.avframework.livestreamv2.log.ILogUploader;
import com.p683ss.avframework.utils.AVLog;
import com.p683ss.video.rtc.interact.controller.AnchorController.StreamMixer;
import com.p683ss.video.rtc.interact.model.Config;
import java.nio.ByteBuffer;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.core.LiveCore */
public abstract class LiveCore implements ILiveStream {
    protected ILiveCoreWarningListener mWarningListener;

    /* renamed from: com.ss.avframework.livestreamv2.core.LiveCore$Builder */
    public static class Builder extends LiveStreamBuilder {
        private boolean enableGameMode;
        private boolean enableRtcExtraDataPeriodSend;
        public ILogMonitor mLogMonitor = new ILogMonitor() {
            public void onLogMonitor(String str, JSONObject jSONObject) {
            }
        };
        private JSONObject mSdkParams;
        private boolean mUsingLiveCoreAudioCaptureOnServerInteractMode;
        private IVideoEffectProcessor mVideoEffectProcessor;
        private boolean usingEffectCamera = true;
        private boolean usingLiveStreamMixer = true;

        /* renamed from: com.ss.avframework.livestreamv2.core.LiveCore$Builder$ILogMonitor */
        public interface ILogMonitor {
            void onLogMonitor(String str, JSONObject jSONObject);
        }

        public ILogMonitor getLogMonitor() {
            return this.mLogMonitor;
        }

        public JSONObject getSdkParams() {
            return this.mSdkParams;
        }

        public IVideoEffectProcessor getVideoEffectProcessor() {
            return this.mVideoEffectProcessor;
        }

        public boolean isEnableGameMode() {
            return this.enableGameMode;
        }

        public boolean isEnableRtcExtraDataPeriodSend() {
            return this.enableRtcExtraDataPeriodSend;
        }

        public boolean isUsingEffectCamera() {
            return this.usingEffectCamera;
        }

        public boolean isUsingExternAudioCaptureOnServerInteractMode() {
            return this.mUsingLiveCoreAudioCaptureOnServerInteractMode;
        }

        public boolean isUsingLiveStreamMixer() {
            return this.usingLiveStreamMixer;
        }

        public Builder setLogUploader(ILogUploader iLogUploader) {
            return this;
        }

        public LiveCore create() {
            return new LiveCoreImpl(this);
        }

        private Builder setEnableRtcExtraDataPeriodSend(boolean z) {
            this.enableRtcExtraDataPeriodSend = z;
            return this;
        }

        public void enableGameMode(boolean z) {
            this.enableGameMode = z;
        }

        public Builder setUsingEffectCamera(boolean z) {
            this.usingEffectCamera = z;
            return this;
        }

        public Builder setUsingExternAudioCaptureOnServerInteractMode(boolean z) {
            this.mUsingLiveCoreAudioCaptureOnServerInteractMode = z;
            return this;
        }

        public Builder setUsingLiveStreamMixer(boolean z) {
            this.usingLiveStreamMixer = z;
            return this;
        }

        public Builder setVideoEffectProcessor(IVideoEffectProcessor iVideoEffectProcessor) {
            this.mVideoEffectProcessor = iVideoEffectProcessor;
            return this;
        }

        public Builder setLogMonitor(ILogMonitor iLogMonitor) {
            this.mLogMonitor = iLogMonitor;
            this.mLogUploader = new ILogUploader() {
                public void uploadLog(JSONObject jSONObject) {
                    Builder.this.mLogMonitor.onLogMonitor("live_client_monitor_log", jSONObject);
                }
            };
            return this;
        }

        public Builder setupSdkParams(String str) {
            super.setupSdkParams(str);
            try {
                this.mSdkParams = new JSONObject(str);
            } catch (Exception unused) {
            }
            return this;
        }

        private void parseJsonConfig(JSONObject jSONObject) throws Exception {
            boolean z;
            boolean z2;
            if (jSONObject.has("logLevel")) {
                AVLog.setLevel(jSONObject.getInt("logLevel"));
            }
            boolean z3 = false;
            if (jSONObject.has("vecameraV2")) {
                if (jSONObject.getInt("vecameraV2") != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                setUsingVECamera2API(z2);
            }
            if (jSONObject.has("audioCaptureDevice")) {
                setAudioCaptureDevice(jSONObject.getInt("audioCaptureDevice"));
            }
            if (jSONObject.has("videoCaptureDevice")) {
                setVideoCaptureDevice(jSONObject.getInt("videoCaptureDevice"));
            }
            if (jSONObject.has("videoCaptureWidth")) {
                setVideoCaptureWidth(jSONObject.getInt("videoCaptureWidth"));
            }
            if (jSONObject.has("videoCaptureHeight")) {
                setVideoCaptureHeight(jSONObject.getInt("videoCaptureHeight"));
            }
            if (jSONObject.has("videoCaptureFps")) {
                setVideoCaptureFps(jSONObject.getInt("videoCaptureFps"));
            }
            if (jSONObject.has("encodeWidth")) {
                setVideoWidth(jSONObject.getInt("encodeWidth"));
            }
            if (jSONObject.has("encodeHeight")) {
                setVideoHeight(jSONObject.getInt("encodeHeight"));
            }
            if (jSONObject.has("encodeFps")) {
                setVideoFps(jSONObject.getInt("encodeFps"));
            }
            if (jSONObject.has("bgMode")) {
                setBgMode(jSONObject.getInt("bgMode"));
            }
            if (jSONObject.has("audioCaptureChannel")) {
                setAudioCaptureChannel(jSONObject.getInt("audioCaptureChannel"));
            }
            if (jSONObject.has("audioChannel")) {
                setAudioChannel(jSONObject.getInt("audioChannel"));
            }
            if (jSONObject.has("audioCaptureSampleHz")) {
                setAudioCaptureSampleHZ(jSONObject.getInt("audioCaptureSampleHz"));
            }
            if (jSONObject.has("audioSampleHz")) {
                setAudioSampleHZ(jSONObject.getInt("audioSampleHz"));
            }
            if (jSONObject.has("videoHardwareEncode")) {
                if (jSONObject.getInt("videoHardwareEncode") != 1) {
                    z = true;
                } else {
                    z = false;
                }
                setEnableVideoEncodeAccelera(z);
            }
            if (jSONObject.has("videoEncodeMaxKbps")) {
                setVideoMaxBitrate(jSONObject.getInt("videoEncodeMaxKps") * 1000);
            }
            if (jSONObject.has("videoEncodeMinKbps")) {
                setVideoMinBitrate(jSONObject.getInt("videoEncodeMinKbps") * 1000);
            }
            if (jSONObject.has("videoEncodeInitKbps")) {
                setVideoBitrate(jSONObject.getInt("videoEncodeInitKbps") * 1000);
            }
            if (jSONObject.has("roi") && jSONObject.has("roi_asset_dir")) {
                setRoiOn(jSONObject.getInt("roi"), isEnableVideoEncodeAccelera());
                setRoiAssetDir(jSONObject.getString("roi_asset_dir"));
            }
            if (jSONObject.has("enableBFrame")) {
                if (jSONObject.getInt("enableBFrame") != 0) {
                    z3 = true;
                }
                setEnableVideoBFrame(z3);
            }
            if (jSONObject.has("videoProfile")) {
                setVideoProfile(jSONObject.getInt("videoProfile"));
            }
            if (jSONObject.has("audioProfile")) {
                setAudioProfile(jSONObject.getInt("audioProfile"));
            }
            StringBuilder sb = new StringBuilder("Using local json config:");
            sb.append(jSONObject.toString());
            AVLog.ioi("LiveCore", sb.toString());
        }

        /* access modifiers changed from: protected */
        public ILiveStream createLiveStream(Handler handler, Handler handler2) {
            return super.create(handler, handler2);
        }

        /* access modifiers changed from: protected */
        public ILiveStream createLiveStream(Handler handler, Handler handler2, AudioDeviceModule audioDeviceModule) {
            return super.create(handler, handler2, audioDeviceModule);
        }

        /* access modifiers changed from: protected */
        public ILiveStream createLiveStream(Handler handler, Handler handler2, AudioDeviceModule audioDeviceModule, IVideoEffectProcessor iVideoEffectProcessor) {
            return super.create(handler, handler2, audioDeviceModule, iVideoEffectProcessor);
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.LiveCore$ILiveCoreTextureFrameAvailableListener */
    public interface ILiveCoreTextureFrameAvailableListener extends ITextureFrameAvailableListener {
        void onTextureFrameAvailable(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, ByteBuffer byteBuffer);
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.LiveCore$ILiveCoreWarningListener */
    public interface ILiveCoreWarningListener {
        void onWarning(int i, int i2, Exception exc);
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.LiveCore$InteractConfig */
    public static class InteractConfig extends Config {
        private String mBackgroundColor;
        private String mMixStreamUrl;
        private StreamMixer mMixer;

        public String getBackgroundColor() {
            return this.mBackgroundColor;
        }

        public String getMixStreamRtmpUrl() {
            return this.mMixStreamUrl;
        }

        public StreamMixer getStreamMixer() {
            return this.mMixer;
        }

        public InteractConfig setBackgroundColor(String str) {
            this.mBackgroundColor = str;
            return this;
        }

        public InteractConfig setMixStreamRtmpUrl(String str) {
            this.mMixStreamUrl = str;
            return this;
        }

        public InteractConfig setStreamMixer(StreamMixer streamMixer) {
            this.mMixer = streamMixer;
            return this;
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.LiveCore$RtcExtraDataListener */
    public interface RtcExtraDataListener {
        void onRtcData(String str, String str2);

        void onRtcData(String str, ByteBuffer byteBuffer);
    }

    public abstract void addAudioFrameAvailableListener(IAudioFrameAvailableListener iAudioFrameAvailableListener);

    public abstract void addTextureFrameAvailableListener(ITextureFrameAvailableListener iTextureFrameAvailableListener);

    public abstract Client create(InteractConfig interactConfig, boolean z);

    public abstract AudioDeviceModule getADM();

    public abstract IAudioDeviceControl getAudioDeviceControl();

    public abstract IGameEngine getGameEngine();

    /* access modifiers changed from: protected */
    public abstract Builder getInternalBuilder();

    public abstract ILayerControl getLayerControl();

    public abstract boolean getPreviewFitMode();

    public abstract boolean getPreviewMirror(boolean z);

    public abstract List<String> getUrls();

    public abstract VsyncModule getVsyncModule();

    public abstract void removeAudioFrameAvailableListener(IAudioFrameAvailableListener iAudioFrameAvailableListener);

    public abstract void removeTextureFrameAvailableListener(ITextureFrameAvailableListener iTextureFrameAvailableListener);

    public void setAudioFrameAvailableListener(IAudioFrameAvailableListener iAudioFrameAvailableListener) {
    }

    public abstract void setDisplay(View view);

    public abstract void setPreviewFitMode(boolean z);

    public abstract void setPreviewMirror(boolean z, boolean z2);

    public void setRenderSink(VideoSink videoSink) {
    }

    public void setRtcExtraDataListener(RtcExtraDataListener rtcExtraDataListener) {
    }

    public void setTextureFrameAvailableListener(ITextureFrameAvailableListener iTextureFrameAvailableListener) {
    }

    public abstract int startAudioPlayer();

    public abstract void startInternal(List<String> list);

    public abstract void startInternalAudioCapture();

    public abstract int stopAudioPlayer();

    public abstract void stopInternal();

    public abstract void stopInternalAudioCapture();

    public abstract void switchAudioMode(int i);

    public final Builder getBuilder() {
        return getInternalBuilder();
    }

    public void setWarningListener(ILiveCoreWarningListener iLiveCoreWarningListener) {
        this.mWarningListener = iLiveCoreWarningListener;
    }

    /* access modifiers changed from: protected */
    public void onWarning(int i, int i2, Exception exc) {
        if (this.mWarningListener != null) {
            this.mWarningListener.onWarning(i, i2, exc);
        }
    }
}
