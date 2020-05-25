package com.p683ss.android.ttvecamera;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.p683ss.android.ttvecamera.C20275l.C20276a;
import com.p683ss.android.ttvecamera.C20275l.C20281f;
import com.p683ss.android.ttvecamera.C20275l.C20283h;
import com.p683ss.android.ttvecamera.C20275l.C20284i;
import com.p683ss.android.ttvecamera.p1232g.C20217c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ttvecamera.f */
public abstract class C20201f {

    /* renamed from: g */
    public boolean f55519g;

    /* renamed from: h */
    public C20275l f55520h;

    /* renamed from: i */
    protected boolean f55521i;

    /* renamed from: j */
    public C20202a f55522j;

    /* renamed from: k */
    public Handler f55523k;

    /* renamed from: l */
    public Context f55524l;

    /* renamed from: m */
    float[] f55525m = new float[16];

    /* renamed from: n */
    public C20217c f55526n;

    /* renamed from: o */
    public int f55527o;

    /* renamed from: p */
    protected int f55528p;

    /* renamed from: q */
    protected int f55529q;

    /* renamed from: r */
    protected float f55530r;

    /* renamed from: s */
    protected C20203b f55531s;

    /* renamed from: t */
    protected C20204c f55532t;

    /* renamed from: u */
    AtomicBoolean f55533u = new AtomicBoolean(false);

    /* renamed from: v */
    public Map<String, Bundle> f55534v = new HashMap();

    /* renamed from: com.ss.android.ttvecamera.f$a */
    public interface C20202a {
        /* renamed from: a */
        void mo42781a(int i, int i2, C20201f fVar);

        /* renamed from: a */
        void mo42782a(int i, int i2, String str);

        /* renamed from: a */
        void mo42783a(C20201f fVar);

        /* renamed from: b */
        void mo42784b(int i, int i2, String str);
    }

    /* renamed from: com.ss.android.ttvecamera.f$b */
    public interface C20203b {
        /* renamed from: a */
        TEFrameSizei mo42785a(List<TEFrameSizei> list, List<TEFrameSizei> list2);
    }

    /* renamed from: com.ss.android.ttvecamera.f$c */
    public interface C20204c {
        /* renamed from: a */
        void mo42786a(int i, float f);
    }

    /* renamed from: a */
    public abstract int mo42713a(C20275l lVar);

    /* renamed from: a */
    public abstract TEFrameSizei mo42714a(float f, TEFrameSizei tEFrameSizei);

    /* renamed from: a */
    public abstract void mo42715a();

    /* renamed from: a */
    public abstract void mo42716a(float f);

    /* renamed from: a */
    public abstract void mo42717a(float f, C20284i iVar);

    /* renamed from: a */
    public abstract void mo42718a(int i);

    /* renamed from: a */
    public abstract void mo42719a(int i, int i2, float f, int i3, int i4);

    /* renamed from: a */
    public abstract void mo42720a(int i, int i2, C20281f fVar);

    /* renamed from: a */
    public void mo42665a(Bundle bundle) {
    }

    /* renamed from: a */
    public void mo42778a(C20204c cVar) {
    }

    /* renamed from: a */
    public abstract void mo42721a(C20281f fVar);

    /* renamed from: a */
    public abstract void mo42722a(C20283h hVar);

    /* renamed from: a */
    public abstract void mo42723a(C20284i iVar);

    /* renamed from: a */
    public abstract void mo42724a(C20294n nVar);

    /* renamed from: a */
    public abstract void mo42725a(boolean z);

    /* renamed from: a */
    public abstract void mo42726a(boolean z, String str);

    /* renamed from: b */
    public abstract void mo42727b();

    /* renamed from: b */
    public abstract void mo42728b(int i);

    /* renamed from: b */
    public abstract void mo42729b(C20284i iVar);

    /* renamed from: c */
    public void mo42730c() {
    }

    /* renamed from: c */
    public abstract void mo42731c(int i);

    /* renamed from: d */
    public void mo42732d() {
    }

    /* renamed from: f */
    public abstract int mo42734f();

    /* renamed from: g */
    public abstract int mo42735g();

    /* renamed from: h */
    public abstract float[] mo42736h();

    /* renamed from: i */
    public abstract void mo42737i();

    /* renamed from: j */
    public abstract boolean mo42738j();

    /* renamed from: k */
    public abstract boolean mo42739k();

    /* renamed from: e */
    public void mo42733e() {
        C20296p.m50061b("TECameraBase", "close...");
    }

    /* renamed from: s */
    public final C20276a mo42780s() {
        return this.f55520h.f55742x;
    }

    /* renamed from: r */
    public final int mo42779r() {
        if (this.f55533u.getAndSet(false)) {
            mo42735g();
        }
        return this.f55529q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Bundle mo42667l() {
        Bundle bundle;
        if (this.f55534v.containsKey(this.f55520h.f55740v)) {
            bundle = (Bundle) this.f55534v.get(this.f55520h.f55740v);
        } else {
            bundle = new Bundle();
            this.f55534v.put(this.f55520h.f55740v, bundle);
        }
        bundle.putInt("facing", this.f55520h.f55723e);
        return bundle;
    }

    public C20201f(Context context, C20202a aVar, Handler handler, C20203b bVar) {
        this.f55524l = context;
        this.f55522j = aVar;
        this.f55523k = handler;
        this.f55531s = bVar;
    }
}
