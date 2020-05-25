package com.p683ss.android.medialib;

import android.media.Image.Plane;
import com.p683ss.android.medialib.camera.C19306j;
import com.p683ss.android.medialib.camera.ImageFrame;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.medialib.i */
public final class C19321i {

    /* renamed from: a */
    ImageFrame f53370a;

    public C19321i(ImageFrame imageFrame) {
        this.f53370a = imageFrame;
    }

    /* renamed from: a */
    public final boolean mo39814a(int[][] iArr, ByteBuffer[] byteBufferArr) {
        C19306j plane = this.f53370a.getPlane();
        if (plane == null) {
            return false;
        }
        Plane[] planeArr = plane.f53341a;
        if (planeArr == null) {
            return false;
        }
        for (int i = 0; i < planeArr.length; i++) {
            byteBufferArr[i] = planeArr[i].getBuffer();
            iArr[i] = new int[]{byteBufferArr[i].remaining(), planeArr[i].getRowStride(), planeArr[i].getPixelStride()};
        }
        return true;
    }
}
