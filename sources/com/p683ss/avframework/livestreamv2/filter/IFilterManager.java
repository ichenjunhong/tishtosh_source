package com.p683ss.avframework.livestreamv2.filter;

import android.graphics.Bitmap;
import com.p683ss.avframework.effect.IVideoEffectProcessor.IEffectInfoChangeListener;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.filter.IFilterManager */
public interface IFilterManager {

    /* renamed from: com.ss.avframework.livestreamv2.filter.IFilterManager$EffectMsgListener */
    public interface EffectMsgListener extends com.p683ss.avframework.effect.IVideoEffectProcessor.EffectMsgListener {
    }

    /* renamed from: com.ss.avframework.livestreamv2.filter.IFilterManager$ErrorListener */
    public interface ErrorListener {
        void onError(int i, String str);
    }

    /* renamed from: com.ss.avframework.livestreamv2.filter.IFilterManager$FaceDetectListener */
    public interface FaceDetectListener extends com.p683ss.avframework.effect.IVideoEffectProcessor.FaceDetectListener {
    }

    /* renamed from: com.ss.avframework.livestreamv2.filter.IFilterManager$MicrophoneDetectListener */
    public interface MicrophoneDetectListener extends com.p683ss.avframework.effect.IVideoEffectProcessor.MicrophoneDetectListener {
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

    boolean detectFaceFromBitMap(Bitmap bitmap);

    void enable(boolean z);

    int enableMockFace(boolean z);

    void forceOutput2DTex(boolean z);

    String getABDefaultInfoFromEffect(String str);

    String getEffectVersion();

    String getVersion();

    boolean isEnable();

    boolean isValid();

    String name();

    int pauseEffect();

    void processDoubleClickEvent(float f, float f2);

    void processLongPressEvent(float f, float f2);

    void processPanEvent(float f, float f2, float f3, float f4, float f5);

    void processRotationEvent(float f, float f2);

    void processScaleEvent(float f, float f2);

    void processTouchDownEvent(float f, float f2, int i);

    void processTouchEvent(float f, float f2);

    void processTouchUpEvent(float f, float f2, int i);

    void releaseContetDetector();

    int resumeEffect();

    int sendEffectMsg(int i, int i2, int i3, String str);

    void setABInfoToEffect(JSONObject jSONObject);

    int setAudioRecognizeDict(Map<String, String[]> map);

    int setBeautify(String str, float f, float f2);

    int setBeautify(String str, float f, float f2, float f3);

    int setCustomEffect(String str, String str2);

    int setCustomEffectOrientation(String str, int i);

    int setEffect(String str);

    int setEffect(String str, boolean z);

    void setEffectInfoChangeListener(IEffectInfoChangeListener iEffectInfoChangeListener);

    void setEffectMsgListener(EffectMsgListener effectMsgListener);

    void setErrorListener(ErrorListener errorListener);

    int setFaceAttribute(boolean z);

    void setFaceDetectListener(FaceDetectListener faceDetectListener);

    int setFilter(String str, float f);

    int setFilter(String str, String str2, float f);

    void setLicenseToEffect(String str);

    void setMicrophoneDetectListener(MicrophoneDetectListener microphoneDetectListener);

    void setMusicNodeFilePath(String str);

    int setReshape(String str, float f, float f2);

    int startAudioRecognize();

    int startEffectAudio();

    int stopAudioRecognize();

    int stopEffectAudio();

    void updateEffAudioTimestampMs(long j);
}
