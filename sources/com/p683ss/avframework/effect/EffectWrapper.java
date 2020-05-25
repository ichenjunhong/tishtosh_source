package com.p683ss.avframework.effect;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bef.effectsdk.C2590a;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.avframework.buffer.VideoFrame.IExtraData;
import com.p683ss.avframework.buffer.VideoFrame.stRoiInfo;
import com.p683ss.avframework.capture.audio.AudioCapturer;
import com.p683ss.avframework.effect.IVideoEffectProcessor.EffectMsgListener;
import com.p683ss.avframework.effect.IVideoEffectProcessor.FaceDetectListener;
import com.p683ss.avframework.effect.IVideoEffectProcessor.IEffectInfoChangeListener;
import com.p683ss.avframework.effect.IVideoEffectProcessor.MicrophoneDetectListener;
import com.p683ss.avframework.engine.NativeObject;
import com.p683ss.avframework.utils.JNINamespace;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.effect.EffectWrapper */
public class EffectWrapper extends NativeObject implements IVideoEffectProcessor {
    public Long mDetectFlag;
    private EffectAudioSource mEffectAudioSource;
    private EffectMsgListener mEffectMsgListener;
    private FaceDetectListener mFaceListener;
    private boolean mFromExtern;
    private IEffectInfoChangeListener mIEffectInfoChangeListener;
    private MicrophoneDetectListener mMicrophoneListener;
    private String mStrlicense;
    private boolean mValid;

    /* renamed from: com.ss.avframework.effect.EffectWrapper$AlgorithmResult */
    public static class AlgorithmResult extends NativeObject implements IExtraData {
        public long mFlags;
        public long mMiniGameResult;
        public long mStRoiInfo;

        public long getMiniGameResult() {
            return this.mMiniGameResult;
        }

        public long mStRoiInfo() {
            return this.mStRoiInfo;
        }

        public int peekParcelSize() {
            return EffectWrapper.nativePeekParcelSize();
        }

        private void setMiniGmeResult(long j) {
            this.mMiniGameResult = j;
        }

        private void setStRoiInfo(long j) {
            this.mStRoiInfo = j;
        }

        public void releaseExtraData(Object obj) {
            release();
        }

        public AlgorithmResult(long j) {
            setNativeObj(j);
        }

        public static String checkGameSize(long j) {
            return EffectWrapper.nativeAlgorithmResultGameSizeCheck(j);
        }

        public int readParcel(ByteBuffer byteBuffer) {
            return EffectWrapper.nativeReadParcel(this.mNativeObj, byteBuffer);
        }

        public static int buildBufferFromString(String str, ByteBuffer byteBuffer) {
            return EffectWrapper.nativeBuildBufferFromString(0, str, byteBuffer);
        }

        public static String parseStringFromByteBuffer(int i, ByteBuffer byteBuffer) {
            return EffectWrapper.nativeParseStringFromByteBuffer(i, byteBuffer);
        }

        public static AlgorithmResult parseParcel(int i, int i2, ByteBuffer byteBuffer, AlgorithmResult algorithmResult) {
            long j;
            if (algorithmResult == null) {
                j = 0;
            } else {
                j = algorithmResult.mNativeObj;
            }
            return EffectWrapper.nativeParseParcelBuffer(algorithmResult, j, byteBuffer, i, i2);
        }
    }

    private static String NonNull(String str) {
        return str == null ? "" : str;
    }

    public static native String nativeAlgorithmResultGameSizeCheck(long j);

    public static native int nativeBuildBufferFromString(int i, String str, ByteBuffer byteBuffer);

    private native int nativeComposerAppendNodes(String[] strArr, int i);

    private native int nativeComposerAppendNodesWithTags(String[] strArr, int i, String[] strArr2);

    private native int nativeComposerReloadNodes(String[] strArr, int i);

    private native int nativeComposerReloadNodesWithTags(String[] strArr, int i, String[] strArr2);

    private native int nativeComposerRemoveNodes(String[] strArr, int i);

    private native int nativeComposerReplaceNodesWithTags(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3);

    private native int nativeComposerSetMode(int i, int i2);

    private native int nativeComposerSetNodes(String[] strArr, int i);

    private native int nativeComposerSetNodesWithTags(String[] strArr, int i, String[] strArr2);

    private native int nativeComposerUpdateNode(String str, String str2, float f);

    private native int nativeConfigABBooleanValue(String str, boolean z);

    private native int nativeConfigABFloatValue(String str, float f);

    private native int nativeConfigABIntValue(String str, int i);

    private native int nativeConfigABStringValue(String str, String str2);

    private native int nativeConfigEffect(int i, int i2, String str, String str2, boolean z, boolean z2, String str3);

    private native AlgorithmResult nativeCreateAlgorithmResult();

    private native void nativeCreateEffectWrapper();

    private native int nativeDetectFaceFromBitMap(Bitmap bitmap);

    private native long nativeGetAlgorithmRequirment();

    private native long nativeGetAlgorithmResult(AlgorithmResult algorithmResult, long j);

    private static native String nativeGetEffectVersion();

    private native String nativeName();

    public static native AlgorithmResult nativeParseParcelBuffer(AlgorithmResult algorithmResult, long j, ByteBuffer byteBuffer, int i, int i2);

    public static native String nativeParseStringFromByteBuffer(int i, ByteBuffer byteBuffer);

    private native int nativePauseEffect();

    public static native int nativePeekParcelSize();

    private native int nativeProcess(int i, int i2, int i3, int i4, long j, Long l, stRoiInfo stroiinfo, boolean z, int i5, long j2);

    private native void nativeProcessDoubleClickEvent(float f, float f2);

    private native void nativeProcessLongPressEvent(float f, float f2);

    private native void nativeProcessPanEvent(float f, float f2, float f3, float f4, float f5);

    private native void nativeProcessRotationEvent(float f, float f2);

    private native void nativeProcessScaleEvent(float f, float f2);

    private native void nativeProcessTouchDownEvent(float f, float f2, int i);

    private native void nativeProcessTouchEvent(float f, float f2);

    private native void nativeProcessTouchUpEvent(float f, float f2, int i);

    public static native int nativeReadParcel(long j, ByteBuffer byteBuffer);

    private native void nativeReleaseContetDetector();

    private native int nativeResumeEffect();

    private native int nativeSendEffectMsg(int i, int i2, int i3, String str);

    private native int nativeSetABLicense(String str);

    private native void nativeSetAlgorithmAB(boolean z);

    private native int nativeSetAlgorithmRequirment(long j);

    private native int nativeSetAssetManager(AssetManager assetManager);

    private native int nativeSetAudioRecognizeDict(String str);

    private native int nativeSetBeautify(String str, float f, float f2);

    private native int nativeSetBeautifyWithSharp(String str, float f, float f2, float f3);

    private native int nativeSetCustomEffect(String str, String str2);

    private native int nativeSetCustomEffectOrientation(String str, int i);

    private native int nativeSetEffect(String str);

    private native int nativeSetFaceAttribute(boolean z);

    private native int nativeSetFilter(String str, float f);

    private native int nativeSetMusicNodeFilePath(String str);

    private native int nativeSetReshape(String str, float f, float f2);

    private native int nativeSetResourceFinder(Object obj);

    private native int nativeSetTwoFilters(String str, String str2, float f);

    private native int nativeStartAudioRecognize(ByteBuffer byteBuffer, int i, int i2, int i3);

    public int enableMockFace(boolean z) {
        return 0;
    }

    public AudioCapturer getEffectAudioSource() {
        return this.mEffectAudioSource;
    }

    public int setEffect(String str, boolean z) {
        return 0;
    }

    public int startEffectAudio() {
        return 0;
    }

    public int stopEffectAudio() {
        return 0;
    }

    public boolean valid() {
        return this.mValid;
    }

    public long getAlgorithmRequirment() {
        return nativeGetAlgorithmRequirment();
    }

    public String getEffectVersion() {
        return nativeGetEffectVersion();
    }

    public String name() {
        if (!this.mValid) {
            return "Dummy Effect";
        }
        return nativeName();
    }

    public int pauseEffect() {
        if (!this.mValid) {
            return 0;
        }
        return nativePauseEffect();
    }

    public void releaseContetDetector() {
        if (this.mValid) {
            nativeReleaseContetDetector();
        }
    }

    public int resumeEffect() {
        if (!this.mValid) {
            return 0;
        }
        return nativeResumeEffect();
    }

    public EffectWrapper() {
        this.mDetectFlag = new Long(0);
        this.mStrlicense = CustomActionPushReceiver.f104061f;
        if (checkVersion()) {
            nativeCreateEffectWrapper();
            createEffectAudioSource();
        }
        this.mFromExtern = false;
    }

    private boolean checkVersion() {
        try {
            this.mValid = !TextUtils.isEmpty(getEffectVersion());
        } catch (Throwable unused) {
            this.mValid = false;
        }
        return this.mValid;
    }

    public void createEffectAudioSource() {
        if (this.mNativeObj != 0) {
            this.mEffectAudioSource = new EffectAudioSource(this.mNativeObj);
        }
    }

    public synchronized void release() {
        if (this.mEffectMsgListener != null) {
            VideoEffectUtilsWrapper.removeMessageCenterListener(this.mEffectMsgListener);
            this.mEffectMsgListener = null;
        }
        this.mFaceListener = null;
        if (!this.mFromExtern) {
            super.release();
        }
        if (this.mEffectAudioSource != null) {
            this.mEffectAudioSource.release();
            this.mEffectAudioSource = null;
        }
    }

    public void setEffectInfoChangeListener(IEffectInfoChangeListener iEffectInfoChangeListener) {
        this.mIEffectInfoChangeListener = iEffectInfoChangeListener;
    }

    public void setNativeObj(long j) {
        super.setNativeObj(j);
    }

    public String getEffectABInfo(String str) {
        return C2590a.m7541a(str);
    }

    public int setAlgorithmRequirment(long j) {
        return nativeSetAlgorithmRequirment(j);
    }

    public int setAssetManager(AssetManager assetManager) {
        return nativeSetAssetManager(assetManager);
    }

    public void setFaceDetectListener(FaceDetectListener faceDetectListener) {
        if (this.mValid) {
            this.mFaceListener = faceDetectListener;
        }
    }

    public void setMicrophoneDetectListener(MicrophoneDetectListener microphoneDetectListener) {
        if (this.mValid) {
            this.mMicrophoneListener = microphoneDetectListener;
        }
    }

    public int setResourceFinder(Object obj) {
        return nativeSetResourceFinder(obj);
    }

    public boolean detectFaceFromBitMap(Bitmap bitmap) {
        if (this.mValid && nativeDetectFaceFromBitMap(bitmap) == 0) {
            return true;
        }
        return false;
    }

    public AlgorithmResult getAlgorithmResult(long j) {
        AlgorithmResult nativeCreateAlgorithmResult = nativeCreateAlgorithmResult();
        nativeCreateAlgorithmResult.mFlags = nativeGetAlgorithmResult(nativeCreateAlgorithmResult, j);
        return nativeCreateAlgorithmResult;
    }

    public void onFaceDetectResultCallback(int i) {
        if (this.mValid && this.mFaceListener != null) {
            this.mFaceListener.onFaceDetectResultCallback(i);
        }
    }

    public void onMicrophoneDetectResultCallback(float f) {
        if (this.mValid && this.mMicrophoneListener != null) {
            this.mMicrophoneListener.onMicrophoneDetectResultCallback(f);
        }
    }

    public void setAlgorithmAB(boolean z) {
        if (this.mValid) {
            nativeSetAlgorithmAB(z);
        }
    }

    public int setEffect(String str) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetEffect(NonNull(str));
    }

    public int setFaceAttribute(boolean z) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetFaceAttribute(z);
    }

    public void setMusicNodeFilePath(String str) {
        if (this.mValid) {
            nativeSetMusicNodeFilePath(str);
        }
    }

    public int setEffectLicense(String str) {
        if (str != null) {
            int nativeSetABLicense = nativeSetABLicense(str);
            if (nativeSetABLicense == 0) {
                this.mStrlicense = str;
            }
            if (this.mIEffectInfoChangeListener != null) {
                this.mIEffectInfoChangeListener.onLicenseInfoChange(str, nativeSetABLicense);
            }
        }
        return 0;
    }

    public void setEffectMsgListener(EffectMsgListener effectMsgListener) {
        if (this.mValid) {
            if (this.mEffectMsgListener != null) {
                VideoEffectUtilsWrapper.removeMessageCenterListener(this.mEffectMsgListener);
                this.mEffectMsgListener = null;
            }
            if (effectMsgListener != null) {
                this.mEffectMsgListener = effectMsgListener;
                VideoEffectUtilsWrapper.addMessageCenterListener(this.mEffectMsgListener);
            }
        }
    }

    public EffectWrapper(long j) {
        this.mDetectFlag = new Long(0);
        this.mNativeObj = j;
        this.mFromExtern = true;
        if (checkVersion()) {
            createEffectAudioSource();
        }
    }

    public int setAudioRecognizeDict(Map<String, String[]> map) {
        String[] strArr;
        String str;
        if (!this.mValid) {
            return 0;
        }
        String str2 = "";
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                String str3 = str2;
                for (String str4 : (String[]) entry.getValue()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    if (str3.isEmpty()) {
                        str = "";
                    } else {
                        str = ",";
                    }
                    sb.append(str);
                    sb.append((String) entry.getKey());
                    sb.append(":");
                    sb.append(str4);
                    str3 = sb.toString();
                }
                str2 = str3;
            }
        }
        return nativeSetAudioRecognizeDict(str2);
    }

    public int setEffectABInfo(JSONObject jSONObject) {
        String str;
        try {
            JSONArray jSONArray = new JSONArray(C2590a.m7541a(this.mStrlicense));
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString("key");
                if (jSONObject.has(string)) {
                    switch (jSONObject2.getInt("dataType")) {
                        case 0:
                            int nativeConfigABBooleanValue = nativeConfigABBooleanValue(string, jSONObject.getBoolean(string));
                            if (this.mIEffectInfoChangeListener == null) {
                                break;
                            } else {
                                IEffectInfoChangeListener iEffectInfoChangeListener = this.mIEffectInfoChangeListener;
                                if (jSONObject.getBoolean(string)) {
                                    str = "TRUE";
                                } else {
                                    str = "FALSE";
                                }
                                iEffectInfoChangeListener.onEffectInfoChange(string, str, 0, nativeConfigABBooleanValue);
                                break;
                            }
                        case 1:
                            int i2 = jSONObject.getInt(string);
                            int nativeConfigABIntValue = nativeConfigABIntValue(string, i2);
                            if (this.mIEffectInfoChangeListener == null) {
                                break;
                            } else {
                                IEffectInfoChangeListener iEffectInfoChangeListener2 = this.mIEffectInfoChangeListener;
                                StringBuilder sb = new StringBuilder();
                                sb.append(i2);
                                iEffectInfoChangeListener2.onEffectInfoChange(string, sb.toString(), 1, nativeConfigABIntValue);
                                break;
                            }
                        case 2:
                            float f = (float) jSONObject.getDouble(string);
                            int nativeConfigABFloatValue = nativeConfigABFloatValue(string, f);
                            if (this.mIEffectInfoChangeListener == null) {
                                break;
                            } else {
                                IEffectInfoChangeListener iEffectInfoChangeListener3 = this.mIEffectInfoChangeListener;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(f);
                                iEffectInfoChangeListener3.onEffectInfoChange(string, sb2.toString(), 2, nativeConfigABFloatValue);
                                break;
                            }
                        case 3:
                            String string2 = jSONObject.getString(string);
                            int nativeConfigABStringValue = nativeConfigABStringValue(string, string2);
                            if (this.mIEffectInfoChangeListener == null) {
                                break;
                            } else {
                                this.mIEffectInfoChangeListener.onEffectInfoChange(string, string2, 2, nativeConfigABStringValue);
                                break;
                            }
                    }
                }
            }
            return 0;
        } catch (JSONException unused) {
            return -1;
        }
    }

    public void getAlgorithmResult(AlgorithmResult algorithmResult, long j) {
        algorithmResult.mFlags = nativeGetAlgorithmResult(algorithmResult, j);
    }

    private static <T> boolean CheckCount(T[] tArr, int i) {
        int i2;
        if (tArr == null) {
            i2 = 0;
        } else {
            i2 = tArr.length;
        }
        if (i == i2) {
            return true;
        }
        return false;
    }

    public int composerSetMode(int i, int i2) {
        if (!this.mValid) {
            return 0;
        }
        return nativeComposerSetMode(i, i2);
    }

    public void processDoubleClickEvent(float f, float f2) {
        if (this.mValid) {
            nativeProcessDoubleClickEvent(f, f2);
        }
    }

    public void processLongPressEvent(float f, float f2) {
        if (this.mValid) {
            nativeProcessLongPressEvent(f, f2);
        }
    }

    public void processRotationEvent(float f, float f2) {
        if (this.mValid) {
            nativeProcessRotationEvent(f, f2);
        }
    }

    public void processScaleEvent(float f, float f2) {
        if (this.mValid) {
            nativeProcessScaleEvent(f, f2);
        }
    }

    public void processTouchEvent(float f, float f2) {
        if (this.mValid) {
            nativeProcessTouchEvent(f, f2);
        }
    }

    public int setCustomEffectOrientation(String str, int i) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetCustomEffectOrientation(NonNull(str), i);
    }

    public int setFilter(String str, float f) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetFilter(NonNull(str), f);
    }

    public int composerAppendNodes(String[] strArr, int i) {
        if (!this.mValid) {
            return 0;
        }
        if (!CheckCount(strArr, i)) {
            return -1;
        }
        return nativeComposerAppendNodes(strArr, i);
    }

    public int composerReloadNodes(String[] strArr, int i) {
        if (!this.mValid) {
            return 0;
        }
        if (!CheckCount(strArr, i)) {
            return -1;
        }
        return nativeComposerReloadNodes(strArr, i);
    }

    public int composerRemoveNodes(String[] strArr, int i) {
        if (!this.mValid) {
            return 0;
        }
        if (!CheckCount(strArr, i)) {
            return -1;
        }
        return nativeComposerRemoveNodes(strArr, i);
    }

    public int composerSetNodes(String[] strArr, int i) {
        if (!this.mValid) {
            return 0;
        }
        if (!CheckCount(strArr, i)) {
            return -1;
        }
        return nativeComposerSetNodes(strArr, i);
    }

    public int setCustomEffect(String str, String str2) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetCustomEffect(NonNull(str), NonNull(str2));
    }

    public void processTouchDownEvent(float f, float f2, int i) {
        if (this.mValid) {
            nativeProcessTouchDownEvent(f, f2, i);
        }
    }

    public void processTouchUpEvent(float f, float f2, int i) {
        if (this.mValid) {
            nativeProcessTouchUpEvent(f, f2, i);
        }
    }

    public int setBeautify(String str, float f, float f2) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetBeautify(NonNull(str), f, f2);
    }

    public int setReshape(String str, float f, float f2) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetReshape(NonNull(str), f, f2);
    }

    public int composerAppendNodesWithTags(String[] strArr, int i, String[] strArr2) {
        if (!this.mValid) {
            return 0;
        }
        if (!CheckCount(strArr, i) || !CheckCount(strArr2, i)) {
            return -1;
        }
        return nativeComposerAppendNodesWithTags(strArr, i, strArr2);
    }

    public int composerReloadNodesWithTags(String[] strArr, int i, String[] strArr2) {
        if (!this.mValid) {
            return 0;
        }
        if (!CheckCount(strArr, i) || !CheckCount(strArr2, i)) {
            return -1;
        }
        return nativeComposerReloadNodesWithTags(strArr, i, strArr2);
    }

    public int composerSetNodesWithTags(String[] strArr, int i, String[] strArr2) {
        if (!this.mValid) {
            return 0;
        }
        if (!CheckCount(strArr, i) || !CheckCount(strArr2, i)) {
            return -1;
        }
        return nativeComposerSetNodesWithTags(strArr, i, strArr2);
    }

    public int composerUpdateNode(String str, String str2, float f) {
        if (!this.mValid) {
            return 0;
        }
        return nativeComposerUpdateNode(NonNull(str), NonNull(str2), f);
    }

    public int setFilter(String str, String str2, float f) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetTwoFilters(NonNull(str), NonNull(str2), f);
    }

    public int onReceiveEffectMessage(int i, int i2, int i3, String str) {
        if (!this.mValid) {
            return -1;
        }
        return 0;
    }

    public int sendEffectMsg(int i, int i2, int i3, String str) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSendEffectMsg(i, i2, i3, NonNull(str));
    }

    public int startAudioRecognize(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (!this.mValid) {
            return 0;
        }
        return nativeStartAudioRecognize(byteBuffer, i, i2, i3);
    }

    public int setBeautify(String str, float f, float f2, float f3) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetBeautifyWithSharp(NonNull(str), f, f2, f3);
    }

    public void processPanEvent(float f, float f2, float f3, float f4, float f5) {
        if (this.mValid) {
            nativeProcessPanEvent(f, f2, f3, f4, f5);
        }
    }

    public int composerReplaceNodesWithTags(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3) {
        if (!this.mValid) {
            return 0;
        }
        if (!CheckCount(strArr, i) || !CheckCount(strArr2, i2) || !CheckCount(strArr3, i2)) {
            return -1;
        }
        return nativeComposerReplaceNodesWithTags(strArr, i, strArr2, i2, strArr3);
    }

    public int process(int i, int i2, int i3, int i4, long j, boolean z) {
        if (!this.mValid) {
            return 0;
        }
        return nativeProcess(i, i2, i3, i4, j, null, null, z, 0, 0);
    }

    public void configEffect(int i, int i2, String str, String str2, boolean z, boolean z2, String str3) {
        if (this.mValid) {
            nativeConfigEffect(i, i2, NonNull(str), NonNull(str2), z, z2, NonNull(str3));
        }
    }

    public int process(int i, int i2, int i3, int i4, int i5, long j, boolean z) {
        if (!this.mValid) {
            return 0;
        }
        return nativeProcess(i, i2, i3, i4, j, null, null, z, i5, 0);
    }

    public int process(int i, int i2, int i3, int i4, long j, boolean z, long j2) {
        if (!this.mValid) {
            return 0;
        }
        return nativeProcess(i, i2, i3, i4, j, null, null, z, 0, 0);
    }

    public int process(int i, int i2, int i3, int i4, int i5, stRoiInfo stroiinfo, long j, boolean z, long j2) {
        if (!this.mValid) {
            return 0;
        }
        return nativeProcess(i, i2, i3, i4, j, null, stroiinfo, z, i5, j2);
    }
}
