package com.p683ss.android.ttvecamera.p1227b;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.params.MeteringRectangle;
import com.p683ss.android.ttvecamera.p1227b.C20159a.C20160a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ttvecamera.b.c */
public class C20162c implements C20159a {

    /* renamed from: a */
    protected C20160a f55434a;

    /* renamed from: a */
    public CaptureCallback mo42699a(Builder builder) {
        return null;
    }

    /* renamed from: a */
    public CaptureCallback mo42700a(Builder builder, AtomicBoolean atomicBoolean) {
        return null;
    }

    /* renamed from: b */
    public int mo42701b(Builder builder, Rect rect) {
        return 0;
    }

    /* renamed from: a */
    public final int mo42697a() {
        return this.f55434a.mo42688f();
    }

    public C20162c(C20160a aVar) {
        this.f55434a = aVar;
    }

    /* renamed from: a */
    public int mo42698a(Builder builder, Rect rect) {
        builder.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(0));
        builder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
        builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
        builder.set(CaptureRequest.CONTROL_MODE, Integer.valueOf(1));
        builder.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(1));
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
        builder.setTag("FOCUS_TAG");
        return 0;
    }
}
