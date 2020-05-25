package com.p683ss.avframework.effect;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import com.p683ss.avframework.buffer.VideoFrame.stRoiInfo;
import com.p683ss.avframework.capture.audio.AudioCapturer;
import java.nio.ByteBuffer;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.effect.IVideoEffectProcessor */
public interface IVideoEffectProcessor {

    /* renamed from: com.ss.avframework.effect.IVideoEffectProcessor$EffectMsgListener */
    public interface EffectMsgListener {
        void onMessageReceived(int i, int i2, int i3, String str);
    }

    /* renamed from: com.ss.avframework.effect.IVideoEffectProcessor$FaceDetectListener */
    public interface FaceDetectListener {
        void onFaceDetectResultCallback(int i);
    }

    /* renamed from: com.ss.avframework.effect.IVideoEffectProcessor$IEffectInfoChangeListener */
    public interface IEffectInfoChangeListener {
        void onEffectInfoChange(String str, String str2, int i, int i2);

        void onLicenseInfoChange(String str, int i);
    }

    /* renamed from: com.ss.avframework.effect.IVideoEffectProcessor$MicrophoneDetectListener */
    public interface MicrophoneDetectListener {
        void onMicrophoneDetectResultCallback(float f);
    }

    int composerAppendNodes(String[] strArr, int i);

    int composerAppendNodesWithTags(String[] strArr, int i, String[] strArr2);

    int composerReloadNodes(String[] strArr, int i);

    int composerReloadNodesWithTags(String[] strArr, int i, String[] strArr2);

    int composerRemoveNodes(String[] strArr, int i);

    int composerReplaceNodesWithTags(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3);

    int composerSetMode(int i, int i2);

    int composerSetNodes(String[] strArr, int i);

    int composerSetNodesWithTags(String[] strArr, int i, String[] strArr2);

    int composerUpdateNode(String str, String str2, float f);

    void configEffect(int i, int i2, String str, String str2, boolean z, boolean z2, String str3);

    boolean detectFaceFromBitMap(Bitmap bitmap);

    int enableMockFace(boolean z);

    AudioCapturer getEffectAudioSource();

    String getEffectVersion();

    String name();

    int pauseEffect();

    int process(int i, int i2, int i3, int i4, int i5, long j, boolean z);

    int process(int i, int i2, int i3, int i4, int i5, stRoiInfo stroiinfo, long j, boolean z, long j2);

    void processDoubleClickEvent(float f, float f2);

    void processLongPressEvent(float f, float f2);

    void processPanEvent(float f, float f2, float f3, float f4, float f5);

    void processRotationEvent(float f, float f2);

    void processScaleEvent(float f, float f2);

    void processTouchDownEvent(float f, float f2, int i);

    void processTouchEvent(float f, float f2);

    void processTouchUpEvent(float f, float f2, int i);

    void release();

    void releaseContetDetector();

    int resumeEffect();

    int sendEffectMsg(int i, int i2, int i3, String str);

    void setAlgorithmAB(boolean z);

    int setAssetManager(AssetManager assetManager);

    int setAudioRecognizeDict(Map<String, String[]> map);

    int setBeautify(String str, float f, float f2);

    int setBeautify(String str, float f, float f2, float f3);

    int setCustomEffect(String str, String str2);

    int setCustomEffectOrientation(String str, int i);

    int setEffect(String str);

    int setEffect(String str, boolean z);

    int setEffectABInfo(JSONObject jSONObject);

    int setEffectLicense(String str);

    void setEffectMsgListener(EffectMsgListener effectMsgListener);

    int setFaceAttribute(boolean z);

    void setFaceDetectListener(FaceDetectListener faceDetectListener);

    int setFilter(String str, float f);

    int setFilter(String str, String str2, float f);

    void setMicrophoneDetectListener(MicrophoneDetectListener microphoneDetectListener);

    void setMusicNodeFilePath(String str);

    int setReshape(String str, float f, float f2);

    int setResourceFinder(Object obj);

    int startAudioRecognize(ByteBuffer byteBuffer, int i, int i2, int i3);

    int startEffectAudio();

    int stopEffectAudio();

    boolean valid();
}
