package com.p683ss.posterprocessor2;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.p723j.C11511a;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.posterprocessor2.PosterSRProcessor */
public class PosterSRProcessor {

    /* renamed from: a */
    public static String f128455a = "PosterSRProcessor";

    /* renamed from: b */
    public static Lock f128456b = new ReentrantLock(true);

    /* renamed from: c */
    public static boolean f128457c = false;

    /* renamed from: d */
    public static long f128458d = 400;

    /* renamed from: e */
    public static long f128459e = 0;

    /* renamed from: f */
    public static C51370a f128460f = C51370a.NONE;

    /* renamed from: g */
    public static String f128461g;

    /* renamed from: h */
    public static String f128462h;

    /* renamed from: com.ss.posterprocessor2.PosterSRProcessor$a */
    public enum C51370a {
        VASR,
        NN,
        NONE
    }

    /* renamed from: a */
    public static C51370a m110479a() {
        return f128460f;
    }

    public static native long nativeCreatePosterNNSRInstance();

    public static native int nativeInitPosterNNSR(long j, String str, int i, int i2);

    public static native int nativePosterASRProcess(int[] iArr, int[] iArr2, int i, int i2);

    public static native int nativePosterASRProcessWithBMP(Bitmap bitmap, Bitmap bitmap2);

    public static native int nativePosterNNProcess(long j, int[] iArr, int[] iArr2, int i, int i2);

    public static native int nativePosterNNProcessWithBMP(long j, Bitmap bitmap, Bitmap bitmap2);

    public static native void nativeReleasePosterASR();

    public static native void nativeReleasePosterNNSRInstance(long j);

    public static native int nativedoASRSpeedTest();

    public static native int nativedoSpeedTest(long j);

    static {
        C11511a.m23578a("c++_shared");
        C11511a.m23578a("yuv");
        C11511a.m23578a("bytenn");
        C11511a.m23578a("srlib");
    }

    /* renamed from: a */
    public static void m110480a(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(f128461g);
        sb.append("/");
        sb.append(str);
        String sb2 = sb.toString();
        File file = new File(f128461g);
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(sb2);
        if (!file2.exists()) {
            try {
                InputStream open = context.getAssets().open(str);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
                while (true) {
                    int read = open.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        open.close();
                        fileOutputStream.close();
                        return;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
