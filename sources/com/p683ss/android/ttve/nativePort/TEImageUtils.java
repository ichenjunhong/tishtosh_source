package com.p683ss.android.ttve.nativePort;

import android.graphics.Bitmap;
import com.p683ss.android.medialib.camera.ImageFrame;
import com.p683ss.android.vesdk.C50792y;

/* renamed from: com.ss.android.ttve.nativePort.TEImageUtils */
public class TEImageUtils {
    static {
        C20129b.m49685b();
    }

    public static native void compressToJPEG(Bitmap bitmap, int i, String str);

    public static native void compressToJPEG2(byte[] bArr, int i, int i2, int i3, String str);

    public static native ImageFrame decompressJPEG(String str, int i);

    public static int calBestSampleSize(int i, int i2, int i3, int i4) {
        if (i <= 0 || i2 <= 0 || i3 <= 0 || i4 <= 0) {
            return -1;
        }
        if (i3 <= i4) {
            int i5 = i4;
            i4 = i3;
            i3 = i5;
        }
        if (i <= i2) {
            int i6 = i4;
            i4 = i3;
            i3 = i6;
        }
        int max = Math.max((int) Math.ceil((double) (((float) i) / ((float) i3))), (int) Math.ceil((double) (((float) i2) / ((float) i4))));
        StringBuilder sb = new StringBuilder("calBestSampleSize , decode image, imgW = ");
        sb.append(i);
        sb.append(", imgH = ");
        sb.append(i2);
        sb.append(", setW = ");
        sb.append(i3);
        sb.append(", setH = ");
        sb.append(i4);
        sb.append(", sampleSize = ");
        sb.append(max);
        C50792y.m109909a("TEImageUtils", sb.toString());
        return max;
    }
}
