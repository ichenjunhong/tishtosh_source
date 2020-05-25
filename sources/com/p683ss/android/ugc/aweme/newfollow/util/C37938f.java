package com.p683ss.android.ugc.aweme.newfollow.util;

import com.p683ss.android.ugc.aweme.video.C48021h;
import com.p683ss.android.ugc.aweme.video.C48121w;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.newfollow.util.f */
public final class C37938f {

    /* renamed from: a */
    private List<C48021h> f96605a = new LinkedList();

    /* renamed from: com.ss.android.ugc.aweme.newfollow.util.f$a */
    static class C37939a {

        /* renamed from: a */
        public static C37938f f96606a = new C37938f();
    }

    /* renamed from: a */
    public static C37938f m84829a() {
        return C37939a.f96606a;
    }

    /* renamed from: b */
    public final C48021h mo77414b() {
        if (this.f96605a.size() >= 8) {
            C48021h hVar = (C48021h) this.f96605a.get(this.f96605a.size() - 1);
            hVar.mo95267D();
            hVar.mo95264A();
            this.f96605a.remove(this.f96605a.size() - 1);
        }
        C48121w wVar = new C48121w();
        this.f96605a.add(wVar);
        return wVar;
    }

    /* renamed from: a */
    public final void mo77413a(C48021h hVar) {
        if (hVar != null) {
            hVar.mo95267D();
            try {
                hVar.mo95264A();
                this.f96605a.remove(hVar);
            } catch (Exception unused) {
            }
        }
    }
}
