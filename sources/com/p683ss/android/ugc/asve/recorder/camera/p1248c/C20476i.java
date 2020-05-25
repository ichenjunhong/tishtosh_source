package com.p683ss.android.ugc.asve.recorder.camera.p1248c;

import android.content.Context;
import com.p683ss.android.medialib.camera.C19263c;
import com.p683ss.android.ugc.asve.C20315a;
import com.p683ss.android.ugc.asve.p1241e.C20391c;
import com.p683ss.android.ugc.asve.recorder.camera.C20453a;
import com.p683ss.android.ugc.asve.recorder.camera.C20457b;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.c.i */
public final class C20476i implements C20469d {

    /* renamed from: a */
    private final Context f56127a;

    /* renamed from: b */
    private C20464a f56128b;

    /* renamed from: c */
    private int f56129c;

    /* renamed from: a */
    public final int mo43425a() {
        return this.f56129c;
    }

    /* renamed from: d */
    public final int mo43434d() {
        return 1;
    }

    /* renamed from: c */
    public final int mo43432c() {
        return this.f56128b.mo43417a();
    }

    /* renamed from: e */
    public final boolean mo43435e() {
        return this.f56128b.f56109b;
    }

    /* renamed from: g */
    public final boolean mo43437g() {
        return this.f56128b.mo43423c();
    }

    /* renamed from: f */
    public final boolean mo43436f() {
        if (!this.f56128b.f56109b || !mo43430b()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo43430b() {
        int a = C20391c.m50589a(this.f56127a).mo43220a();
        if (a == 0) {
            boolean b = this.f56128b.mo43421b();
            mo43428a(b);
            return b;
        } else if (a == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo43426a(int i) {
        if (this.f56128b.f56111d != null) {
            this.f56128b.f56111d.mo39670a(i);
        }
    }

    /* renamed from: c */
    public final boolean mo43433c(boolean z) {
        return this.f56128b.mo43422b(z);
    }

    /* renamed from: a */
    public final void mo43427a(C19263c cVar) {
        this.f56128b.mo43418a((Context) C20315a.m50093b(), cVar);
    }

    /* renamed from: a */
    public final void mo43428a(boolean z) {
        int i;
        C20391c a = C20391c.m50589a(this.f56127a);
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        a.mo43221a(i);
    }

    /* renamed from: b */
    public final boolean mo43431b(boolean z) {
        if (!this.f56128b.mo43422b(z) || !mo43430b()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final float mo43424a(float f, int i) {
        return this.f56128b.mo43416a(f, i);
    }

    /* renamed from: b */
    public final float mo43429b(float f, int i) {
        return this.f56128b.mo43420b(f, i);
    }

    public C20476i(Context context, C20457b bVar) {
        this.f56127a = context;
        this.f56129c = C20453a.m50910a(context, C20315a.m50092a().mo43166t(), bVar.mo43359b());
        switch (this.f56129c) {
            case 1:
                this.f56128b = new C20465b(bVar, this);
                break;
            case 2:
                this.f56128b = new C20471f(bVar, this);
                break;
            case 3:
                this.f56128b = new C20478k(bVar, this);
                break;
            case 4:
                this.f56128b = new C20467c(bVar, this);
                break;
            case 5:
                this.f56128b = new C20474h(bVar, this);
                break;
            default:
                this.f56128b = new C20464a(this);
                break;
        }
        this.f56128b.mo43419a(mo43430b());
    }
}
