package com.bytedance.android.live.broadcast.p213h.p214a;

import com.bytedance.android.live.broadcast.p213h.p214a.C3420c.C3421a;
import com.bytedance.android.live.broadcast.p213h.p214a.p215a.C3414a;
import com.p683ss.avframework.livestreamv2.effectcamera.render.EffectRender.OnRefreshFaceDataListener;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.h.a.a */
public abstract class C3413a {

    /* renamed from: a */
    protected List<OnRefreshFaceDataListener> f9724a;

    /* renamed from: b */
    public C3423e f9725b;

    /* renamed from: c */
    protected C3424f f9726c;

    /* renamed from: a */
    public abstract int mo8756a(int i, int i2, int i3, String str);

    /* renamed from: a */
    public abstract void mo8757a();

    /* renamed from: a */
    public abstract void mo8758a(C3414a aVar);

    /* renamed from: a */
    public abstract void mo8759a(C3421a aVar);

    /* renamed from: b */
    public abstract void mo8762b();

    /* renamed from: c */
    public abstract void mo8764c();

    /* renamed from: d */
    public abstract int mo8765d();

    /* renamed from: e */
    public abstract int mo8766e();

    /* renamed from: a */
    public final synchronized void mo8760a(C3424f fVar) {
        this.f9726c = fVar;
    }

    /* renamed from: b */
    public final synchronized void mo8763b(OnRefreshFaceDataListener onRefreshFaceDataListener) {
        if (this.f9724a != null) {
            for (int size = this.f9724a.size() - 1; size > 0; size--) {
                if (this.f9724a.get(size) == onRefreshFaceDataListener) {
                    this.f9724a.remove(size);
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo8761a(OnRefreshFaceDataListener onRefreshFaceDataListener) {
        if (this.f9724a == null) {
            this.f9724a = new ArrayList();
        }
        this.f9724a.add(onRefreshFaceDataListener);
    }
}
