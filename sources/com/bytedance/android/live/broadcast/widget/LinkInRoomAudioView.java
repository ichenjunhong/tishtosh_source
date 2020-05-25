package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.Surface;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.broadcast.api.p196c.C3048a;
import com.bytedance.android.live.broadcast.api.p197d.C3053c;
import com.bytedance.android.live.broadcast.p202d.C3164c;
import com.bytedance.android.live.broadcast.p202d.C3165d;
import com.bytedance.android.live.broadcast.p202d.C3166e;
import com.bytedance.android.live.broadcast.p213h.C3430b;
import com.bytedance.android.live.broadcast.p213h.C3441c.C3442a;
import com.bytedance.android.live.broadcast.p213h.p214a.C3424f;
import com.bytedance.android.live.broadcast.p213h.p214a.C3425g;
import com.bytedance.android.live.broadcast.p213h.p214a.C3425g.C3427a;
import com.bytedance.android.live.broadcast.p213h.p216b.C3439a;
import com.bytedance.android.live.broadcast.p213h.p216b.C3440b;
import com.bytedance.android.live.broadcast.p213h.p217c.C3443a;
import com.bytedance.android.live.broadcast.utils.C3629a;
import com.bytedance.android.live.broadcast.utils.C3629a.C3631a;
import com.bytedance.android.live.livepullstream.p249a.C4139d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.chatroom.interact.C5280an;
import com.bytedance.android.livesdk.chatroom.interact.C5281ao;
import com.bytedance.android.livesdk.user.C8333e;
import com.p683ss.avframework.livestreamv2.core.Client;
import com.p683ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p683ss.avframework.livestreamv2.effectcamera.display.CameraDisplay.FrameListener;
import java.util.List;
import javax.microedition.khronos.egl.EGLContext;

public class LinkInRoomAudioView extends GLSurfaceView implements C3053c, C3424f, C3427a, C5280an, C5281ao, FrameListener {

    /* renamed from: a */
    C3425g f10399a;

    /* renamed from: b */
    C3629a f10400b;

    /* renamed from: c */
    private final C3048a f10401c;

    /* renamed from: d */
    private EGLContext f10402d;

    /* renamed from: a */
    public final void mo9037a() {
        onPause();
    }

    /* renamed from: b */
    public final void mo9038b() {
        onResume();
    }

    /* renamed from: d */
    public final void mo9040d() {
        if (this.f10400b != null) {
            this.f10400b.quitSafely();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10401c.mo8303b();
        this.f10401c.mo8306e();
    }

    /* renamed from: c */
    public final void mo9039c() {
        if (this.f10400b != null) {
            C3629a aVar = this.f10400b;
            if (aVar.f10340b != null) {
                aVar.f10340b.sendEmptyMessage(234);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f10401c.mo8307f();
        this.f10401c.mo8304c();
        this.f10401c.mo8305d();
        super.onDetachedFromWindow();
    }

    public LinkInRoomAudioView(Context context) {
        this(context, null);
    }

    public void setOutputFormat(int i) {
        this.f10399a.mo8800a(i);
    }

    /* renamed from: a */
    public final void mo8809a(Surface surface) {
        C8333e eVar;
        C3009i iVar;
        ImageModel imageModel;
        String str;
        C3631a aVar = new C3631a();
        C4282a aVar2 = (C4282a) C4116c.m10249a(C4282a.class);
        List list = null;
        if (aVar2 != null) {
            eVar = aVar2.user();
        } else {
            eVar = null;
        }
        if (eVar != null) {
            iVar = eVar.mo14521a();
        } else {
            iVar = null;
        }
        if (iVar != null) {
            imageModel = iVar.getAvatarThumb();
        } else {
            imageModel = null;
        }
        if (imageModel != null) {
            list = imageModel.getUrls();
        }
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = (String) list.get(0);
        }
        aVar.f10356a = str;
        aVar.f10358c = getHeight();
        aVar.f10357b = getWidth();
        this.f10400b = new C3629a(surface, aVar);
        this.f10400b.start();
    }

    /* renamed from: a */
    public final Client mo9036a(InteractConfig interactConfig, Boolean bool) {
        return this.f10401c.mo8292a(interactConfig, bool);
    }

    public LinkInRoomAudioView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10399a = new C3425g(this);
        this.f10399a.f9737b = this;
        this.f10399a.mo8801a((C3424f) this);
        this.f10401c = new C3430b(new C3442a(getContext()).mo8827a(((C4139d) C4116c.m10249a(C4139d.class)).getProjectKey()).mo8823a((C3439a) new C3165d()).mo8824a((C3440b) new C3166e()).mo8825a((C3443a) new C3164c()).mo8821a(240, 320).mo8837g(320).mo8836f(240).mo8840j(4).mo8829a());
    }

    public void onFrameAvailable(EGLContext eGLContext, int i, int i2, int i3, int i4, long j) {
        EGLContext eGLContext2 = eGLContext;
        if (this.f10401c != null) {
            if (this.f10402d != null) {
                this.f10402d.equals(eGLContext);
            }
            this.f10402d = eGLContext2;
            this.f10401c.mo8301a(eGLContext, i, i2, i3, i4, j);
        }
    }
}
