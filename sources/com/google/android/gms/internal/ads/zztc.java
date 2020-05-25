package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

public final class zztc extends Surface {

    /* renamed from: a */
    private static boolean f46301a;

    /* renamed from: b */
    private static boolean f46302b;

    /* renamed from: c */
    private final boolean f46303c;

    /* renamed from: d */
    private final buc f46304d;

    /* renamed from: e */
    private boolean f46305e;

    /* renamed from: a */
    public static synchronized boolean m39294a(Context context) {
        boolean z;
        synchronized (zztc.class) {
            if (!f46302b) {
                if (btw.f43878a >= 17) {
                    boolean z2 = false;
                    String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                        if (!(btw.f43878a == 24 && (btw.f43881d.startsWith("SM-G950") || btw.f43881d.startsWith("SM-G955")) && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) {
                            z2 = true;
                        }
                    }
                    f46301a = z2;
                }
                f46302b = true;
            }
            z = f46301a;
        }
        return z;
    }

    /* renamed from: a */
    public static zztc m39293a(Context context, boolean z) {
        if (btw.f43878a >= 17) {
            bti.m36701b(!z || m39294a(context));
            return new buc().mo30722a(z);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    private zztc(buc buc, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f46304d = buc;
        this.f46303c = z;
    }

    public final void release() {
        super.release();
        synchronized (this.f46304d) {
            if (!this.f46305e) {
                this.f46304d.f43901a.sendEmptyMessage(3);
                this.f46305e = true;
            }
        }
    }
}
