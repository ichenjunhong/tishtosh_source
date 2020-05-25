package com.bytedance.android.livesdk.player;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.ViewGroup;
import com.bytedance.android.live.livepullstream.p249a.C4136b.C4137a;
import com.bytedance.ies.p672e.C10753b;

/* renamed from: com.bytedance.android.livesdk.player.e */
final /* synthetic */ class C8084e implements Runnable {

    /* renamed from: a */
    private final C80811 f22072a;

    /* renamed from: b */
    private final String f22073b;

    /* renamed from: c */
    private final GLSurfaceView f22074c;

    C8084e(C80811 r1, String str, GLSurfaceView gLSurfaceView) {
        this.f22072a = r1;
        this.f22073b = str;
        this.f22074c = gLSurfaceView;
    }

    public final void run() {
        C80811 r0 = this.f22072a;
        String str = this.f22073b;
        GLSurfaceView gLSurfaceView = this.f22074c;
        try {
            Context context = C8080d.this.f22067b == null ? null : (Activity) C8080d.this.f22067b.get();
            if (context != null) {
                if (str != null) {
                    C8080d.f22066a = str;
                    C10753b.m21793a(context).mo19441a("hardware_info_gpu_name", (Object) str).mo19443a();
                    C8080d.m16028a(C8080d.this.f22069d == null ? null : (C4137a) C8080d.this.f22069d.get(), C8080d.f22066a);
                }
                ViewGroup viewGroup = C8080d.this.f22068c == null ? null : (ViewGroup) C8080d.this.f22068c.get();
                if (viewGroup != null) {
                    viewGroup.removeView(gLSurfaceView);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            C8080d.this.f22067b = null;
            C8080d.this.f22068c = null;
            C8080d.this.f22069d = null;
            throw th;
        }
        C8080d.this.f22067b = null;
        C8080d.this.f22068c = null;
        C8080d.this.f22069d = null;
    }
}
