package com.p683ss.android.ttvecamera.p1227b;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CaptureRequest.Builder;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ttvecamera.b.a */
public interface C20159a {

    /* renamed from: com.ss.android.ttvecamera.b.a$a */
    public interface C20160a {
        /* renamed from: f */
        int mo42688f();

        /* renamed from: g */
        int mo42689g();
    }

    /* renamed from: a */
    int mo42697a();

    /* renamed from: a */
    int mo42698a(Builder builder, Rect rect);

    /* renamed from: a */
    CaptureCallback mo42699a(Builder builder);

    /* renamed from: a */
    CaptureCallback mo42700a(Builder builder, AtomicBoolean atomicBoolean);

    /* renamed from: b */
    int mo42701b(Builder builder, Rect rect);
}
