package com.p683ss.android.vesdk;

import android.os.Build;
import com.p683ss.android.ttve.nativePort.C20129b;
import com.p683ss.android.vesdk.runtime.VERuntime;
import java.io.File;
import java.util.List;

/* renamed from: com.ss.android.vesdk.VEImageDetectUtils */
public class VEImageDetectUtils {
    public static final String TAG = "VEImageDetectUtils";
    private IDetectImageResultListener mDetectResultListener;
    private boolean mInterruptDetectImageContent = true;
    private long mNativeHandler;

    /* renamed from: com.ss.android.vesdk.VEImageDetectUtils$IDetectImageResultListener */
    public interface IDetectImageResultListener {
        void onDetectResult(String str, String str2, String str3, boolean z);
    }

    static {
        C20129b.m49685b();
    }

    private native int nativeDestroy(long j);

    private native int nativeDetectImageContent(long j, String str, String str2, String[] strArr, int i, int i2);

    private native long nativeInit(int i, int i2, String str, String str2, boolean z);

    public synchronized void stopDetectImagesContentIfNeed() {
        this.mInterruptDetectImageContent = true;
    }

    public int init() {
        long nativeInit = nativeInit(0, 0, VERuntime.m109853a().f127477e.mo99454a(), Build.DEVICE, false);
        if (nativeInit == 0) {
            return -1;
        }
        this.mNativeHandler = nativeInit;
        return 0;
    }

    public int destroy() {
        if (this.mNativeHandler == 0) {
            C50792y.m109913c(TAG, "invoke destroy() encounter handler == 0. Consider destroy() has been called already?");
            return -1;
        }
        int nativeDestroy = nativeDestroy(this.mNativeHandler);
        if (nativeDestroy == 0) {
            this.mNativeHandler = 0;
            C50792y.m109909a(TAG, "NativeHandler destroy succeed.");
        }
        this.mDetectResultListener = null;
        return nativeDestroy;
    }

    public void setDetectImageContentListener(IDetectImageResultListener iDetectImageResultListener) {
        this.mDetectResultListener = iDetectImageResultListener;
    }

    public void detectImagesContent(String str, List<String> list, List<String> list2) {
        int i;
        synchronized (this) {
            this.mInterruptDetectImageContent = false;
        }
        if (list2.isEmpty()) {
            C50792y.m109913c(TAG, "Unexpected argument. scanAlgorithmList is empty?");
            return;
        }
        String[] strArr = new String[list2.size()];
        list2.toArray(strArr);
        int size = list.size();
        for (i = 0; i < size && !this.mInterruptDetectImageContent; i++) {
            String str2 = (String) list.get(i);
            if (!new File(str2).exists()) {
                String str3 = TAG;
                StringBuilder sb = new StringBuilder("Illegal argument. file: \"");
                sb.append(str2);
                sb.append("\" is not exist.");
                C50792y.m109914d(str3, sb.toString());
            } else {
                nativeDetectImageContent(this.mNativeHandler, str, (String) list.get(i), strArr, -1, -1);
            }
        }
    }

    public void onNativeCallback_onDetectImageContent(String str, String str2, String str3, boolean z) {
        if (this.mDetectResultListener != null) {
            this.mDetectResultListener.onDetectResult(str, str2, str3, z);
        } else {
            C50792y.m109913c(TAG, "Native callback onDetectImageContent encounter no listener handle?");
        }
    }

    public int detectImageContent(String str, String str2, List<String> list, int i, int i2) {
        if (!new File(str2).exists()) {
            String str3 = TAG;
            StringBuilder sb = new StringBuilder("Illegal argument. file: \"");
            sb.append(str2);
            sb.append("\" is not exist.");
            C50792y.m109914d(str3, sb.toString());
            return -100;
        } else if (list.isEmpty()) {
            C50792y.m109913c(TAG, "Unexpected argument. scanAlgorithmList is empty?");
            return -100;
        } else {
            String str4 = TAG;
            StringBuilder sb2 = new StringBuilder("detectImageContent... stickerId:");
            sb2.append(str);
            sb2.append(", imagePath=");
            sb2.append(str2);
            sb2.append(", maxWidth=");
            sb2.append(i);
            sb2.append(", maxHeight=");
            sb2.append(i);
            C50792y.m109913c(str4, sb2.toString());
            String[] strArr = new String[list.size()];
            list.toArray(strArr);
            return nativeDetectImageContent(this.mNativeHandler, str, str2, strArr, i, i2);
        }
    }
}
