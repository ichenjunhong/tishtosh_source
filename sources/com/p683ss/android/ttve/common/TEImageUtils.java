package com.p683ss.android.ttve.common;

import com.p683ss.android.ttve.model.VEFrame;
import com.p683ss.android.ttve.model.VEFrame.C20092b;
import com.p683ss.android.ttve.nativePort.C20129b;

/* renamed from: com.ss.android.ttve.common.TEImageUtils */
public class TEImageUtils {

    /* renamed from: a */
    private static final String f55169a = TEImageUtils.class.getSimpleName();

    private static native int nativeConvertFrame(VEFrame vEFrame, VEFrame vEFrame2, int i);

    static {
        C20129b.m49685b();
    }

    /* renamed from: a */
    public static int m49579a(VEFrame vEFrame, VEFrame vEFrame2, C20092b bVar) {
        return nativeConvertFrame(vEFrame, vEFrame2, bVar.ordinal());
    }
}
