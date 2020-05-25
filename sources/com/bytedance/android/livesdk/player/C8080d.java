package com.bytedance.android.livesdk.player;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.opengl.GLSurfaceView.Renderer;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.android.live.livepullstream.p249a.C4136b;
import com.bytedance.android.live.livepullstream.p249a.C4136b.C4137a;
import com.bytedance.android.live.livepullstream.p250b.C4141b.C4144b;
import com.bytedance.android.live.livepullstream.p250b.C4141b.C4144b.C4145a;
import com.bytedance.android.livesdkapi.depend.p436d.C8626b;
import com.bytedance.ies.p672e.C10753b;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.bytedance.android.livesdk.player.d */
public final class C8080d implements C4136b {

    /* renamed from: a */
    public static String f22066a;

    /* renamed from: b */
    public WeakReference<Activity> f22067b;

    /* renamed from: c */
    public WeakReference<ViewGroup> f22068c;

    /* renamed from: d */
    public WeakReference<C4137a> f22069d;

    /* renamed from: com.bytedance.android.livesdk.player.d$a */
    public static final class C8082a implements C4144b<C4136b> {
        /* renamed from: a */
        public final C4145a<C4136b> mo9533a(C4145a<C4136b> aVar) {
            return aVar.mo9535a(new C8080d()).mo9534a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.player.d$b */
    public static class C8083b implements Renderer {
        public void onDrawFrame(GL10 gl10) {
        }

        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        }

        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        }
    }

    /* renamed from: a */
    public final String mo9525a(Context context) {
        if (f22066a != null) {
            return f22066a;
        }
        if (context != null) {
            String a = C10753b.m21793a(context).mo19442a("hardware_info_gpu_name", (String) null);
            if (a != null) {
                f22066a = a;
            }
        }
        return f22066a;
    }

    /* renamed from: a */
    public static void m16028a(C4137a aVar, String str) {
        if (aVar != null) {
            aVar.mo8495a(str);
        }
    }

    /* renamed from: a */
    public final void mo9526a(Activity activity, View view, C4137a aVar) {
        if (f22066a != null) {
            m16028a(aVar, f22066a);
        } else if (activity != null) {
            String a = mo9525a(activity);
            if (a != null) {
                m16028a(aVar, a);
            } else if ((view instanceof ViewGroup) && this.f22067b == null) {
                this.f22067b = new WeakReference<>(activity);
                ViewGroup viewGroup = (ViewGroup) view;
                this.f22068c = new WeakReference<>(viewGroup);
                this.f22069d = new WeakReference<>(aVar);
                final GLSurfaceView gLSurfaceView = new GLSurfaceView(activity);
                gLSurfaceView.setLayoutParams(new LayoutParams(1, 1));
                gLSurfaceView.setRenderer(new C8083b() {
                    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
                        String str;
                        String glGetString = gl10.glGetString(7937);
                        String glGetString2 = gl10.glGetString(7936);
                        if (TextUtils.isEmpty(glGetString) || TextUtils.isEmpty(glGetString2)) {
                            str = null;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append(glGetString2);
                            sb.append(" ");
                            sb.append(glGetString);
                            str = sb.toString();
                        }
                        C8626b.m17014a().mo15105a((Runnable) new C8084e(this, str, gLSurfaceView));
                    }
                });
                viewGroup.addView(gLSurfaceView);
            }
        }
    }
}
