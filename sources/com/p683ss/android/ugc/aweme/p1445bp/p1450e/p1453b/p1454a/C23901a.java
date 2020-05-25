package com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2629a.C52555ag;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.bp.e.b.a.a */
public final class C23901a implements C23905c {

    /* renamed from: a */
    public static final C23902a f63568a = new C23902a(null);

    /* renamed from: b */
    private final Set<String> f63569b;

    /* renamed from: com.ss.android.ugc.aweme.bp.e.b.a.a$a */
    public static final class C23902a {
        private C23902a() {
        }

        public /* synthetic */ C23902a(C52707g gVar) {
            this();
        }
    }

    public C23901a() {
        this(null, 1, null);
    }

    public C23901a(Set<String> set) {
        C52711k.m112240b(set, "prefixWhiteList");
        this.f63569b = set;
    }

    /* renamed from: a */
    public final void mo49508a(File file, boolean z) {
        C52711k.m112240b(file, "file");
        if (!z && file.isFile()) {
            boolean z2 = false;
            if (file.isFile()) {
                String name = file.getName();
                Iterator it = this.f63569b.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    Object next = it.next();
                    if (i < 0) {
                        C52575l.m112100b();
                    }
                    String str = (String) next;
                    String path = file.getPath();
                    C52711k.m112236a((Object) path, "file.path");
                    if (C52830p.m112411b(path, str, false, 2, null)) {
                        break;
                    }
                    i++;
                }
                if (i == -1) {
                    C52711k.m112236a((Object) name, LeakCanaryFileProvider.f132049i);
                    if (C52830p.m112413c(name, "mp4", false, 2, null) || (C52830p.m112411b(name, "temp_", false, 2, null) && C52830p.m112413c(name, "wav", false, 2, null))) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                file.delete();
            }
        }
    }

    private /* synthetic */ C23901a(Set set, int i, C52707g gVar) {
        this(C52555ag.m112062a());
    }
}
