package com.p683ss.android.ttvecamera.p1227b;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build.VERSION;
import com.p683ss.android.ttvecamera.C20285m;
import com.p683ss.android.ttvecamera.C20296p;
import com.p683ss.android.ttvecamera.p1227b.C20159a.C20160a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ttvecamera.b.d */
public final class C20163d extends C20162c {

    /* renamed from: b */
    public AtomicBoolean f55435b;

    /* renamed from: c */
    public boolean f55436c = true;

    public C20163d(C20160a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final CaptureCallback mo42699a(Builder builder) {
        return new CaptureCallback() {
            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                StringBuilder sb = new StringBuilder("Manual Metering Failed: ");
                sb.append(captureFailure);
                C20296p.m50063d("Camera2ImageFocus", sb.toString());
            }

            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num == null) {
                    C20296p.m50062c("Camera2ImageFocus", "metering failed.");
                    return;
                }
                if (num.intValue() == 3 || num.intValue() == 2) {
                    C20163d.this.f55434a.mo42689g();
                }
                if (C20163d.this.f55436c) {
                    C20163d.this.f55436c = C20285m.m50052a((Object) totalCaptureResult);
                }
            }
        };
    }

    /* renamed from: a */
    public final CaptureCallback mo42700a(Builder builder, AtomicBoolean atomicBoolean) {
        this.f55435b = atomicBoolean;
        return new CaptureCallback() {
            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                StringBuilder sb = new StringBuilder("Manual Focus Failed: ");
                sb.append(captureFailure);
                C20296p.m50063d("Camera2ImageFocus", sb.toString());
                if (C20163d.this.f55435b != null) {
                    C20163d.this.f55435b.set(false);
                }
            }

            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                if (captureRequest == null || captureRequest.getTag() != "FOCUS_TAG") {
                    C20296p.m50062c("Camera2ImageFocus", "Not focus request!");
                    return;
                }
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num == null) {
                    C20296p.m50062c("Camera2ImageFocus", "Focus failed.");
                    return;
                }
                if (num.intValue() == 4 || num.intValue() == 5) {
                    if (C20163d.this.f55435b != null) {
                        C20163d.this.f55435b.set(false);
                    }
                    C20163d.this.f55434a.mo42688f();
                    C20296p.m50059a("Camera2ImageFocus", "Focus done");
                }
                if (C20163d.this.f55436c) {
                    C20163d.this.f55436c = C20285m.m50052a((Object) totalCaptureResult);
                }
            }
        };
    }

    /* renamed from: a */
    public final int mo42698a(Builder builder, Rect rect) {
        builder.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(0));
        builder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
        builder.set(CaptureRequest.CONTROL_MODE, Integer.valueOf(1));
        builder.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(1));
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
        builder.setTag("FOCUS_TAG");
        return 0;
    }

    /* renamed from: b */
    public final int mo42701b(Builder builder, Rect rect) {
        if (VERSION.SDK_INT >= 23) {
            builder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(2));
        }
        builder.setTag("FOCUS_TAG");
        builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
        return 0;
    }
}
