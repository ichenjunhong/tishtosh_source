package com.bytedance.android.live.broadcast.p213h.p214a;

import android.content.Context;
import android.view.SurfaceView;
import com.bytedance.android.live.broadcast.api.p196c.C3048a;
import com.bytedance.android.live.broadcast.p213h.p214a.C3420c.C3421a;
import com.bytedance.android.live.broadcast.p213h.p214a.p215a.C3414a;
import com.bytedance.android.live.broadcast.p213h.p214a.p215a.C3416c;
import com.p683ss.avframework.livestreamv2.ILiveStream.ILiveStreamErrorListener;
import com.p683ss.avframework.livestreamv2.ILiveStream.ITextureFrameAvailableListener;
import com.p683ss.avframework.livestreamv2.effectcamera.render.EffectRender.OnRefreshFaceDataListener;
import com.p683ss.avframework.livestreamv2.filter.IFilterManager;
import com.p683ss.avframework.livestreamv2.filter.IFilterManager.EffectMsgListener;
import com.p683ss.avframework.livestreamv2.filter.IFilterManager.FaceDetectListener;
import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.bytedance.android.live.broadcast.h.a.b */
public final class C3419b extends C3413a implements ILiveStreamErrorListener, ITextureFrameAvailableListener, EffectMsgListener, FaceDetectListener {

    /* renamed from: d */
    private C3416c f9730d;

    /* renamed from: e */
    private Context f9731e;

    /* renamed from: f */
    private C3421a f9732f;

    /* renamed from: g */
    private C3048a f9733g;

    /* renamed from: b */
    public final void mo8762b() {
        this.f9733g.mo8310i();
    }

    /* renamed from: c */
    public final void mo8764c() {
        this.f9733g.mo8309h();
    }

    /* renamed from: d */
    public final int mo8765d() {
        return this.f9733g.mo8308g().startEffectAudio();
    }

    /* renamed from: e */
    public final int mo8766e() {
        return this.f9733g.mo8308g().stopEffectAudio();
    }

    /* renamed from: a */
    public final void mo8757a() {
        this.f9726c = null;
        this.f9730d.mo8774a();
        this.f9733g.mo8307f();
    }

    /* renamed from: a */
    public final void mo8759a(C3421a aVar) {
        this.f9732f = aVar;
    }

    public final void onFaceDetectResultCallback(int i) {
        if (this.f9724a != null) {
            for (int size = this.f9724a.size() - 1; size >= 0; size--) {
                ((OnRefreshFaceDataListener) this.f9724a.get(size)).onRefreshFaceData(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo8758a(C3414a aVar) {
        Context context = this.f9731e;
        C3416c cVar = this.f9730d;
        aVar.f9728b = context;
        aVar.f9727a = cVar;
    }

    public C3419b(SurfaceView surfaceView, C3048a aVar) {
        this.f9733g = aVar;
        this.f9731e = surfaceView.getContext();
        this.f9733g.mo8295a(surfaceView);
        this.f9733g.mo8298a((ITextureFrameAvailableListener) this);
        aVar.mo8297a((ILiveStreamErrorListener) this);
        IFilterManager g = this.f9733g.mo8308g();
        g.enable(true);
        g.setFaceDetectListener(this);
        g.setEffectMsgListener(this);
        this.f9730d = new C3422d(g);
        this.f9733g.mo8306e();
    }

    public final void onError(int i, int i2, Exception exc) {
        if (this.f9732f != null) {
            this.f9732f.mo8798a(i, i2, null);
        }
    }

    /* renamed from: a */
    public final int mo8756a(int i, int i2, int i3, String str) {
        return this.f9733g.mo8308g().sendEffectMsg(i, i2, i3, str);
    }

    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 2139095041 && this.f9732f != null) {
            this.f9732f.mo8799b(1, i2, str);
        }
    }

    public final void onTextureFrameAvailable(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, ByteBuffer byteBuffer) {
        if (this.f9726c != null) {
            this.f9726c.onFrameAvailable(eGLContext, i, z ? 1 : 0, i2, i3, j);
        }
    }
}
