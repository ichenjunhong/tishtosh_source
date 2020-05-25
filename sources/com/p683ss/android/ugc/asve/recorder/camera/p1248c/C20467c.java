package com.p683ss.android.ugc.asve.recorder.camera.p1248c;

import android.content.Context;
import com.p683ss.android.medialib.camera.C19263c;
import com.p683ss.android.ugc.asve.recorder.camera.C20457b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.c.c */
public final class C20467c extends C20464a {

    /* renamed from: e */
    private final C20457b f56115e;

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.c.c$a */
    public static final class C20468a implements C19263c {

        /* renamed from: a */
        final /* synthetic */ C19263c f56116a;

        C20468a(C19263c cVar) {
            this.f56116a = cVar;
        }

        /* renamed from: a */
        public final void mo39670a(int i) {
            C19263c cVar = this.f56116a;
            if (cVar != null) {
                cVar.mo39670a(i);
            }
        }

        /* renamed from: a */
        public final void mo39671a(int i, int i2, String str) {
            C52711k.m112240b(str, "info");
            C19263c cVar = this.f56116a;
            if (cVar != null) {
                cVar.mo39671a(i, i2, str);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo43422b(boolean z) {
        return !z;
    }

    /* renamed from: c */
    public final boolean mo43423c() {
        return true;
    }

    /* renamed from: a */
    public final int mo43417a() {
        if (this.f56110c) {
            return 2;
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo43419a(boolean z) {
        this.f56109b = true;
        this.f56110c = z;
    }

    public C20467c(C20457b bVar, C20476i iVar) {
        C52711k.m112240b(bVar, "mCameraService");
        C52711k.m112240b(iVar, "wideCameraComponent");
        super(iVar);
        this.f56115e = bVar;
    }

    /* renamed from: a */
    public final void mo43418a(Context context, C19263c cVar) {
        int i;
        C52711k.m112240b(context, "context");
        C20457b bVar = this.f56115e;
        if (this.f56110c) {
            i = 0;
        } else {
            i = 2;
        }
        bVar.mo43341a(i, (C19263c) new C20468a(cVar));
        this.f56110c = !this.f56110c;
        this.f56115e.mo43372i().mo43428a(this.f56110c);
    }
}
