package com.p683ss.android.socialbase.downloader.p1216f.p1217a;

import com.p683ss.android.socialbase.downloader.model.HttpHeader;
import com.p683ss.android.socialbase.downloader.p1221j.C19994e;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.socialbase.downloader.f.a.a */
public final class C19916a {

    /* renamed from: a */
    public int f54724a;

    /* renamed from: b */
    private final Map<String, C19921c> f54725b;

    /* renamed from: c */
    private final Map<String, C19922d> f54726c;

    /* renamed from: com.ss.android.socialbase.downloader.f.a.a$a */
    static final class C19918a {

        /* renamed from: a */
        public static final C19916a f54727a = new C19916a();
    }

    /* renamed from: a */
    public static C19916a m48893a() {
        return C19918a.f54727a;
    }

    private C19916a() {
        this.f54725b = new HashMap();
        this.f54726c = new LinkedHashMap(3);
        this.f54724a = 3;
    }

    /* renamed from: a */
    public final C19921c mo41644a(String str, List<HttpHeader> list) {
        C19921c cVar;
        boolean z;
        synchronized (this.f54725b) {
            cVar = (C19921c) this.f54725b.remove(str);
        }
        if (cVar != null) {
            if (C19994e.m49358a(cVar.f54733a, list)) {
                try {
                    cVar.mo41647a();
                } catch (InterruptedException unused) {
                }
                if (System.currentTimeMillis() - cVar.f54734b < C19919b.f54730c) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && cVar.f54736d) {
                    return cVar;
                }
            }
            try {
                cVar.mo13394c();
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public final C19922d mo41645b(String str, List<HttpHeader> list) {
        C19922d dVar;
        boolean z;
        synchronized (this.f54726c) {
            dVar = (C19922d) this.f54726c.remove(str);
        }
        if (dVar != null) {
            if (C19994e.m49358a(dVar.f54742b, list)) {
                try {
                    dVar.mo41648e();
                } catch (InterruptedException unused) {
                }
                if (System.currentTimeMillis() - dVar.f54743c < C19919b.f54729b) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && dVar.mo41649f()) {
                    return dVar;
                }
            }
            try {
                dVar.mo13395d();
            } catch (Throwable unused2) {
            }
        }
        return null;
    }
}
