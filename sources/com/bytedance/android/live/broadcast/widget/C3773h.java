package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.Surface;
import com.bytedance.android.live.broadcast.api.p196c.C3048a;
import com.bytedance.android.live.broadcast.api.p197d.C3053c;
import com.bytedance.android.live.broadcast.p213h.p214a.C3424f;
import com.bytedance.android.live.broadcast.p213h.p214a.C3425g;
import com.bytedance.android.live.broadcast.p213h.p214a.C3425g.C3427a;
import com.bytedance.android.live.broadcast.utils.C3633c;
import com.bytedance.android.livesdk.chatroom.interact.C5280an;
import com.bytedance.android.livesdk.chatroom.interact.C5281ao;
import com.p683ss.avframework.livestreamv2.core.Client;
import com.p683ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p683ss.avframework.livestreamv2.effectcamera.display.CameraDisplay.FrameListener;
import com.p683ss.video.rtc.interact.model.CommonType.VideoQuality;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.bytedance.android.live.broadcast.widget.h */
public final class C3773h extends GLSurfaceView implements C3053c, C3424f, C3427a, C5280an, C5281ao, FrameListener {

    /* renamed from: a */
    C3425g f10658a;

    /* renamed from: b */
    C3633c f10659b;

    /* renamed from: c */
    private final C3048a f10660c;

    /* renamed from: d */
    private EGLContext f10661d;

    /* renamed from: a */
    public final void mo9037a() {
        onPause();
    }

    /* renamed from: b */
    public final void mo9038b() {
        onResume();
    }

    /* renamed from: c */
    public final void mo9039c() {
    }

    /* renamed from: d */
    public final void mo9040d() {
        if (this.f10659b != null) {
            this.f10659b.quitSafely();
        }
    }

    public final void setOutputFormat(int i) {
        this.f10658a.mo8800a(i);
    }

    /* renamed from: a */
    public final void mo8809a(Surface surface) {
        this.f10659b = new C3633c(surface, VideoQuality.GUEST_NORMAL.getWidth(), VideoQuality.GUEST_NORMAL.getHeight());
        this.f10659b.start();
    }

    public C3773h(C3048a aVar, Context context) {
        this(aVar, context, null);
    }

    /* renamed from: a */
    public final Client mo9036a(InteractConfig interactConfig, Boolean bool) {
        return this.f10660c.mo8292a(interactConfig, bool);
    }

    private C3773h(C3048a aVar, Context context, AttributeSet attributeSet) {
        super(context, null);
        this.f10660c = aVar;
        this.f10658a = new C3425g(this);
        this.f10658a.f9737b = this;
        this.f10658a.mo8801a((C3424f) this);
    }

    public final void onFrameAvailable(EGLContext eGLContext, int i, int i2, int i3, int i4, long j) {
        EGLContext eGLContext2 = eGLContext;
        if (this.f10660c != null) {
            if (this.f10661d != null) {
                this.f10661d.equals(eGLContext);
            }
            this.f10661d = eGLContext2;
            this.f10660c.mo8301a(eGLContext, i, i2, i3, i4, j);
        }
    }
}
