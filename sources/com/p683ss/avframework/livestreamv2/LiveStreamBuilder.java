package com.p683ss.avframework.livestreamv2;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.p683ss.avframework.effect.IVideoEffectProcessor;
import com.p683ss.avframework.engine.AudioDeviceModule;
import com.p683ss.avframework.livestreamv2.log.ILogUploader;
import com.p683ss.avframework.opengl.GLThreadManager;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.LiveStreamBuilder */
public class LiveStreamBuilder {
    private Object assetManager;
    private int audioBitrate = 32000;
    private int audioBitwidth = 16;
    private int audioCaptureBitwidth = 16;
    private int audioCaptureChannel = 1;
    private int audioCaptureDevice = 4;
    private int audioCaptureSampleHZ = 44100;
    private int audioChannel = 2;
    private int audioEncoder = 1;
    private int audioProfile = 1;
    private int audioQuantizeGapPeriod;
    private int audioSampleHZ = 44100;
    private int bgMode = 1;
    private int bitrateAdaptStrategy;
    private boolean effectAlgorithmAB;
    private String effectModePath;
    private String effectPlatformConfig;
    private Object effectResourceFinder;
    private boolean enableAudioEncodeAccelera;
    private boolean enableVideoBFrame = true;
    private boolean enableVideoEncodeAccelera = true;
    private boolean enableVideoNtp;
    boolean mAllowMicCaptureOnBackground;
    private Context mContext;
    private JSONObject mKcpParams;
    protected ILogUploader mLogUploader;
    public String mProjectKey;
    private String mQosId = "";
    private JSONObject mQuicParams;
    private String roiAssetDir = "";
    private int roiOnHard;
    private int roiOnSoft;
    private int roiQP = -6;
    private int rtmpReconnectCounts = 10;
    private int rtmpReconnectIntervalSeconds = 3;
    private Intent screenCaptureIntent;
    public long uploadLogInterval = 5000;
    private boolean useNewEffectEngine;
    private boolean useTTFaceDetect;
    private boolean usingLiveStreamAudioCapture;
    private boolean usingVECamera2API;
    private int videoBitrate = 800000;
    private int videoBitrateMode = 2;
    private int videoCaptureDevice = 4;
    private int videoCaptureFps = 25;
    private int videoCaptureHeight = 1280;
    private int videoCaptureWidth = 720;
    private int videoClientMixerBitrate;
    private int videoClientMixerMaxBitrate;
    private int videoClientMixerMinBitrate;
    private int videoEncoder = 1;
    private int videoFps = 25;
    private int videoGop;
    private float videoGopSec;
    private int videoHeight = 1280;
    private int videoLevel = 2;
    private int videoMaxBitrate;
    private int videoMinBitrate;
    private int videoMixerOutHeight;
    private int videoMixerOutWidth;
    private int videoProfile = 1;
    private int videoWidth = 720;
    private int vsyncModuleMaxIntevalOnFrameMs = 3000;
    private int vsyncModuleMaxIntevalOnNowMs = 500;

    static final /* synthetic */ void lambda$releaseHandles$0$LiveStreamBuilder(JSONObject jSONObject) {
    }

    public Object getAssetManager() {
        return this.assetManager;
    }

    public int getAudioBitrate() {
        return this.audioBitrate;
    }

    public int getAudioBitwidth() {
        return this.audioBitwidth;
    }

    public int getAudioCaptureBitwidth() {
        return this.audioCaptureBitwidth;
    }

    public int getAudioCaptureChannel() {
        return this.audioCaptureChannel;
    }

    public int getAudioCaptureDevice() {
        return this.audioCaptureDevice;
    }

    public int getAudioCaptureSampleHZ() {
        return this.audioCaptureSampleHZ;
    }

    public int getAudioChannel() {
        return this.audioChannel;
    }

    public int getAudioEncoder() {
        return this.audioEncoder;
    }

    public int getAudioProfile() {
        return this.audioProfile;
    }

    public int getAudioQuantizeGapPeriod() {
        return this.audioQuantizeGapPeriod;
    }

    public int getAudioSampleHZ() {
        return this.audioSampleHZ;
    }

    public int getBgMode() {
        return this.bgMode;
    }

    public int getBitrateAdaptStrategy() {
        return this.bitrateAdaptStrategy;
    }

    public Context getContext() {
        return this.mContext;
    }

    public boolean getEffectAlgorithmAB() {
        return this.effectAlgorithmAB;
    }

    public String getEffectModePath() {
        return this.effectModePath;
    }

    public String getEffectPlatformConfig() {
        return this.effectPlatformConfig;
    }

    public Object getEffectResourceFinder() {
        return this.effectResourceFinder;
    }

    public JSONObject getKcpParams() {
        return this.mKcpParams;
    }

    public ILogUploader getLogUploader() {
        return this.mLogUploader;
    }

    public String getQosId() {
        return this.mQosId;
    }

    public JSONObject getQuicParams() {
        return this.mQuicParams;
    }

    public String getRoiAssetDir() {
        return this.roiAssetDir;
    }

    public int getRtmpReconnectCounts() {
        return this.rtmpReconnectCounts;
    }

    public int getRtmpReconnectIntervalSeconds() {
        return this.rtmpReconnectIntervalSeconds;
    }

    public Intent getScreenCaptureIntent() {
        return this.screenCaptureIntent;
    }

    public long getUploadLogInterval() {
        return this.uploadLogInterval;
    }

    public int getVideLevel() {
        return this.videoLevel;
    }

    public int getVideoBitrate() {
        return this.videoBitrate;
    }

    public int getVideoBitrateMode() {
        return this.videoBitrateMode;
    }

    public int getVideoCaptureDevice() {
        return this.videoCaptureDevice;
    }

    public int getVideoCaptureFps() {
        return this.videoCaptureFps;
    }

    public int getVideoCaptureHeight() {
        return this.videoCaptureHeight;
    }

    public int getVideoCaptureWidth() {
        return this.videoCaptureWidth;
    }

    public int getVideoClientMixerBitrate() {
        return this.videoClientMixerBitrate;
    }

    public int getVideoClientMixerMaxBitrate() {
        return this.videoClientMixerMaxBitrate;
    }

    public int getVideoClientMixerMinBitrate() {
        return this.videoClientMixerMinBitrate;
    }

    public int getVideoEncoder() {
        return this.videoEncoder;
    }

    public int getVideoFps() {
        return this.videoFps;
    }

    public int getVideoGop() {
        return this.videoGop;
    }

    public float getVideoGopSec() {
        return this.videoGopSec;
    }

    public int getVideoHeight() {
        return this.videoHeight;
    }

    public int getVideoMaxBitrate() {
        return this.videoMaxBitrate;
    }

    public int getVideoMinBitrate() {
        return this.videoMinBitrate;
    }

    public int getVideoProfile() {
        return this.videoProfile;
    }

    public int getVideoWidth() {
        return this.videoWidth;
    }

    public int getVsyncModuleMaxIntevalOnFrameMs() {
        return this.vsyncModuleMaxIntevalOnFrameMs;
    }

    public int getVsyncModuleMaxIntevalOnNowMs() {
        return this.vsyncModuleMaxIntevalOnNowMs;
    }

    public boolean isAllowMicCaptureOnBackground() {
        return this.mAllowMicCaptureOnBackground;
    }

    public boolean isEnableAudioEncodeAccelera() {
        return this.enableAudioEncodeAccelera;
    }

    public boolean isEnableVideoBFrame() {
        return this.enableVideoBFrame;
    }

    public boolean isEnableVideoEncodeAccelera() {
        return this.enableVideoEncodeAccelera;
    }

    public boolean isEnableVideoNtp() {
        return this.enableVideoNtp;
    }

    public boolean isUseNewEffectEngine() {
        return this.useNewEffectEngine;
    }

    public boolean isUseTTFaceDetect() {
        return this.useTTFaceDetect;
    }

    public boolean isUsingLiveStreamAudioCapture() {
        return this.usingLiveStreamAudioCapture;
    }

    public boolean isVECamera2API() {
        return this.usingVECamera2API;
    }

    public ILiveStream create() {
        return new LiveStream(this);
    }

    public boolean isEnableForceGlFinish() {
        return GLThreadManager.isEnableForceGLFinish();
    }

    public int getVideoMixerOutHeight() {
        if (this.videoMixerOutHeight == 0) {
            return this.videoHeight;
        }
        return this.videoMixerOutHeight;
    }

    public int getVideoMixerOutWidth() {
        if (this.videoMixerOutWidth == 0) {
            return this.videoWidth;
        }
        return this.videoMixerOutWidth;
    }

    /* access modifiers changed from: 0000 */
    public void releaseHandles() {
        this.mContext = null;
        this.assetManager = null;
        this.effectResourceFinder = null;
        this.mLogUploader = LiveStreamBuilder$$Lambda$0.$instance;
        this.screenCaptureIntent = null;
    }

    public LiveStreamBuilder setAllowMicCaptureOnBackground(boolean z) {
        this.mAllowMicCaptureOnBackground = z;
        return this;
    }

    public LiveStreamBuilder setAssetManager(Object obj) {
        this.assetManager = obj;
        return this;
    }

    public LiveStreamBuilder setAudioBitrate(int i) {
        this.audioBitrate = i;
        return this;
    }

    public LiveStreamBuilder setAudioBitwidth(int i) {
        this.audioBitwidth = i;
        return this;
    }

    public LiveStreamBuilder setAudioCaptureBitwidth(int i) {
        this.audioCaptureBitwidth = i;
        return this;
    }

    public LiveStreamBuilder setAudioCaptureChannel(int i) {
        this.audioCaptureChannel = i;
        return this;
    }

    public LiveStreamBuilder setAudioCaptureDevice(int i) {
        this.audioCaptureDevice = i;
        return this;
    }

    public LiveStreamBuilder setAudioCaptureSampleHZ(int i) {
        this.audioCaptureSampleHZ = i;
        return this;
    }

    public LiveStreamBuilder setAudioChannel(int i) {
        this.audioChannel = i;
        return this;
    }

    public LiveStreamBuilder setAudioEncoder(int i) {
        this.audioEncoder = i;
        return this;
    }

    public LiveStreamBuilder setAudioProfile(int i) {
        this.audioProfile = i;
        return this;
    }

    public LiveStreamBuilder setAudioQuantizeGapPeriod(int i) {
        this.audioQuantizeGapPeriod = i;
        return this;
    }

    public LiveStreamBuilder setAudioSampleHZ(int i) {
        this.audioSampleHZ = i;
        return this;
    }

    public LiveStreamBuilder setBgMode(int i) {
        this.bgMode = i;
        return this;
    }

    public LiveStreamBuilder setEffectAlgorithmAB(boolean z) {
        this.effectAlgorithmAB = z;
        return this;
    }

    public LiveStreamBuilder setEffectModePath(String str) {
        this.effectModePath = str;
        return this;
    }

    public LiveStreamBuilder setEffectPlatformConfig(String str) {
        this.effectPlatformConfig = str;
        return this;
    }

    public LiveStreamBuilder setEffectResourceFinder(Object obj) {
        this.effectResourceFinder = obj;
        return this;
    }

    public LiveStreamBuilder setEnableAudioEncodeAccelera(boolean z) {
        this.enableAudioEncodeAccelera = z;
        return this;
    }

    public void setEnableForceGlFinish(boolean z) {
        GLThreadManager.enableForceGLFinish(z);
    }

    public LiveStreamBuilder setEnableVideoBFrame(boolean z) {
        this.enableVideoBFrame = z;
        return this;
    }

    public LiveStreamBuilder setEnableVideoEncodeAccelera(boolean z) {
        this.enableVideoEncodeAccelera = z;
        return this;
    }

    public LiveStreamBuilder setEnableVideoNtp(boolean z) {
        this.enableVideoNtp = z;
        return this;
    }

    public LiveStreamBuilder setKcpParams(JSONObject jSONObject) {
        this.mKcpParams = jSONObject;
        return this;
    }

    public LiveStreamBuilder setLogUploader(ILogUploader iLogUploader) {
        this.mLogUploader = iLogUploader;
        return this;
    }

    public LiveStreamBuilder setProjectKey(String str) {
        this.mProjectKey = str;
        return this;
    }

    public LiveStreamBuilder setQuicParams(JSONObject jSONObject) {
        this.mQuicParams = jSONObject;
        return this;
    }

    public LiveStreamBuilder setRoiAssetDir(String str) {
        this.roiAssetDir = str;
        return this;
    }

    public LiveStreamBuilder setRtmpReconnectCounts(int i) {
        this.rtmpReconnectCounts = i;
        return this;
    }

    public LiveStreamBuilder setRtmpReconnectIntervalSeconds(int i) {
        this.rtmpReconnectIntervalSeconds = i;
        return this;
    }

    public LiveStreamBuilder setScreenCaptureIntent(Intent intent) {
        this.screenCaptureIntent = intent;
        return this;
    }

    public LiveStreamBuilder setUploadLogInterval(long j) {
        this.uploadLogInterval = j;
        return this;
    }

    public LiveStreamBuilder setUseNewEffectEngine(boolean z) {
        this.useNewEffectEngine = z;
        return this;
    }

    public LiveStreamBuilder setUseTTFaceDetect(boolean z) {
        this.useTTFaceDetect = z;
        return this;
    }

    public LiveStreamBuilder setUsingLiveStreamAudioCapture(boolean z) {
        this.usingLiveStreamAudioCapture = z;
        return this;
    }

    public void setUsingVECamera2API(boolean z) {
        this.usingVECamera2API = z;
    }

    public LiveStreamBuilder setVideoBitrate(int i) {
        this.videoBitrate = i;
        return this;
    }

    public void setVideoBitrateMode(int i) {
        this.videoBitrateMode = i;
    }

    public LiveStreamBuilder setVideoCaptureDevice(int i) {
        this.videoCaptureDevice = i;
        return this;
    }

    public LiveStreamBuilder setVideoCaptureFps(int i) {
        this.videoCaptureFps = i;
        return this;
    }

    public LiveStreamBuilder setVideoCaptureHeight(int i) {
        this.videoCaptureHeight = i;
        return this;
    }

    public LiveStreamBuilder setVideoCaptureWidth(int i) {
        this.videoCaptureWidth = i;
        return this;
    }

    public LiveStreamBuilder setVideoClientMixerBitrate(int i) {
        this.videoClientMixerBitrate = i;
        return this;
    }

    public LiveStreamBuilder setVideoClientMixerMaxBitrate(int i) {
        this.videoClientMixerMaxBitrate = i;
        return this;
    }

    public LiveStreamBuilder setVideoClientMixerMinBitrate(int i) {
        this.videoClientMixerMinBitrate = i;
        return this;
    }

    public LiveStreamBuilder setVideoEncoder(int i) {
        this.videoEncoder = i;
        return this;
    }

    public LiveStreamBuilder setVideoFps(int i) {
        this.videoFps = i;
        return this;
    }

    public LiveStreamBuilder setVideoGop(int i) {
        this.videoGop = i;
        return this;
    }

    public LiveStreamBuilder setVideoGopSec(float f) {
        this.videoGopSec = f;
        return this;
    }

    public LiveStreamBuilder setVideoHeight(int i) {
        this.videoHeight = i;
        return this;
    }

    public LiveStreamBuilder setVideoLevel(int i) {
        this.videoLevel = i;
        return this;
    }

    public LiveStreamBuilder setVideoMaxBitrate(int i) {
        this.videoMaxBitrate = i;
        return this;
    }

    public LiveStreamBuilder setVideoMinBitrate(int i) {
        this.videoMinBitrate = i;
        return this;
    }

    public LiveStreamBuilder setVideoMixerOutHeight(int i) {
        this.videoMixerOutHeight = i;
        return this;
    }

    public LiveStreamBuilder setVideoMixerOutWidth(int i) {
        this.videoMixerOutWidth = i;
        return this;
    }

    public LiveStreamBuilder setVideoProfile(int i) {
        this.videoProfile = i;
        return this;
    }

    public LiveStreamBuilder setVideoWidth(int i) {
        this.videoWidth = i;
        return this;
    }

    public LiveStreamBuilder setVsyncModuleMaxIntevalOnFrameMs(int i) {
        this.vsyncModuleMaxIntevalOnFrameMs = i;
        return this;
    }

    public LiveStreamBuilder setVsyncModuleMaxIntevalOnNowMs(int i) {
        this.vsyncModuleMaxIntevalOnNowMs = i;
        return this;
    }

    public int getRoiOn(boolean z) {
        if (z) {
            return this.roiOnHard;
        }
        return this.roiOnSoft;
    }

    public LiveStreamBuilder setBitrateAdaptStrategy(int i) {
        if (i == 0 || i == 1 || i == 2) {
            this.bitrateAdaptStrategy = i;
        }
        return this;
    }

    public LiveStreamBuilder setContext(Context context) {
        Context context2;
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.mContext = context2;
        return this;
    }

    public LiveStreamBuilder setupSdkParams(String str) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.isNull("rtmpk")) {
                this.mKcpParams = jSONObject.getJSONObject("rtmpk");
            }
            if (!jSONObject.isNull("rtmpq")) {
                this.mQuicParams = jSONObject.getJSONObject("rtmpq");
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("PushBase");
            if (!jSONObject2.isNull("width") && !jSONObject2.isNull("height")) {
                int i2 = jSONObject2.getInt("width");
                int i3 = jSONObject2.getInt("height");
                if (i2 > 0 && i3 > 0) {
                    if (i2 > i3) {
                        i = i2;
                    } else {
                        i = i3;
                    }
                    if (i2 > i3) {
                        i2 = i3;
                    }
                    if (this.videoWidth > this.videoHeight) {
                        this.videoWidth = i;
                        this.videoHeight = i2;
                    } else {
                        this.videoWidth = i2;
                        this.videoHeight = i;
                    }
                }
            }
            if (!jSONObject2.isNull("defaultBitrate")) {
                int i4 = jSONObject2.getInt("defaultBitrate");
                if (i4 > 10000) {
                    this.videoBitrate = i4;
                }
            }
            if (!jSONObject2.isNull("minBitrate")) {
                int i5 = jSONObject2.getInt("minBitrate");
                if (i5 > 10000) {
                    this.videoMinBitrate = i5;
                }
            }
            if (!jSONObject2.isNull("maxBitrate")) {
                int i6 = jSONObject2.getInt("maxBitrate");
                if (i6 > 10000) {
                    this.videoMaxBitrate = i6;
                }
            }
            if (!jSONObject2.isNull("fps")) {
                int i7 = jSONObject2.getInt("fps");
                if (i7 > 0) {
                    this.videoFps = i7;
                }
            }
            if (!jSONObject2.isNull("enableBFrame")) {
                this.enableVideoBFrame = jSONObject2.getBoolean("enableBFrame");
            }
            if (!jSONObject2.isNull("gopSec")) {
                this.videoGopSec = (float) jSONObject2.getDouble("gopSec");
            }
            if (!jSONObject2.isNull("enableNTP")) {
                this.enableVideoNtp = jSONObject2.getBoolean("enableNTP");
            }
            if (!jSONObject2.isNull("vCodec")) {
                if (jSONObject2.getString("vCodec").equals("h265")) {
                    this.videoEncoder = 2;
                } else {
                    this.videoEncoder = 1;
                }
            }
            if (!jSONObject2.isNull("useHardware")) {
                this.enableVideoEncodeAccelera = jSONObject2.getBoolean("useHardware");
            }
            if (!jSONObject2.isNull("hwBitrateMode")) {
                String string = jSONObject2.getString("hwBitrateMode");
                if (string.equals("CQ")) {
                    this.videoBitrateMode = 0;
                } else if (string.equals("VBR")) {
                    this.videoBitrateMode = 1;
                } else if (string.equals("CBR")) {
                    this.videoBitrateMode = 2;
                }
            }
            if (!jSONObject2.isNull("videoProfile")) {
                String string2 = jSONObject2.getString("videoProfile");
                if (string2.equals("high")) {
                    this.videoProfile = 3;
                } else if (string2.equals("main")) {
                    this.videoProfile = 2;
                } else {
                    this.videoProfile = 1;
                }
            }
            if (!jSONObject2.isNull("audioProfile")) {
                String string3 = jSONObject2.getString("audioProfile");
                if (string3.equals("AAC-HEv2")) {
                    this.audioProfile = 3;
                } else if (string3.equals("AAC-HE")) {
                    this.audioProfile = 2;
                } else {
                    this.audioProfile = 1;
                }
            }
            if (!jSONObject2.isNull("bitrateAdaptStrategy")) {
                int i8 = jSONObject2.getInt("bitrateAdaptStrategy");
                if (i8 == 0 || i8 == 1 || i8 == 2) {
                    this.bitrateAdaptStrategy = i8;
                }
            }
            if (!jSONObject2.isNull("swRoi")) {
                this.roiOnSoft = jSONObject2.getBoolean("swRoi") ? 1 : 0;
            }
            if (!jSONObject2.isNull("qId")) {
                this.mQosId = jSONObject2.getString("qId");
            }
        } catch (Exception unused) {
        }
        return this;
    }

    public LiveStreamBuilder setRoiOn(int i, boolean z) {
        if (z) {
            this.roiOnHard = i;
        } else {
            this.roiOnSoft = i;
        }
        return this;
    }

    public ILiveStream create(Handler handler, Handler handler2) {
        return new LiveStream(this, handler, handler2);
    }

    public ILiveStream create(Handler handler, Handler handler2, AudioDeviceModule audioDeviceModule) {
        return new LiveStream(this, handler, handler2, audioDeviceModule);
    }

    public ILiveStream create(Handler handler, Handler handler2, AudioDeviceModule audioDeviceModule, IVideoEffectProcessor iVideoEffectProcessor) {
        LiveStream liveStream = new LiveStream(this, handler, handler2, audioDeviceModule, iVideoEffectProcessor);
        return liveStream;
    }
}
