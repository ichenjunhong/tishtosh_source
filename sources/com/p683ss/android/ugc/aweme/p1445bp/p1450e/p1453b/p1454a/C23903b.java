package com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import p2628d.p2629a.C52555ag;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.bp.e.b.a.b */
public final class C23903b implements C23905c {

    /* renamed from: b */
    public static final C23904a f63570b = new C23904a(null);

    /* renamed from: a */
    public long f63571a;

    /* renamed from: c */
    private final Set<String> f63572c;

    /* renamed from: d */
    private final Set<String> f63573d;

    /* renamed from: com.ss.android.ugc.aweme.bp.e.b.a.b$a */
    public static final class C23904a {
        private C23904a() {
        }

        public /* synthetic */ C23904a(C52707g gVar) {
            this();
        }
    }

    public C23903b() {
        this(null, null, 3, null);
    }

    /* renamed from: a */
    public final void mo49509a() {
        this.f63571a = 0;
    }

    public C23903b(Set<String> set, Set<String> set2) {
        C52711k.m112240b(set, "prefixWhiteList");
        C52711k.m112240b(set2, "inclusionWhiteList");
        this.f63572c = set;
        this.f63573d = set2;
    }

    /* renamed from: a */
    public final void mo49508a(File file, boolean z) {
        C52711k.m112240b(file, "file");
        boolean z2 = false;
        if (file.isFile()) {
            Iterator it = this.f63572c.iterator();
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
                Iterator it2 = this.f63573d.iterator();
                int i2 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    Object next2 = it2.next();
                    if (i2 < 0) {
                        C52575l.m112100b();
                    }
                    String str2 = (String) next2;
                    String path2 = file.getPath();
                    C52711k.m112236a((Object) path2, "file.path");
                    if (C52830p.m112456b((CharSequence) path2, (CharSequence) str2, false, 2, (Object) null)) {
                        break;
                    }
                    i2++;
                }
                if (i2 == -1) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            this.f63571a += file.length();
        }
    }

    public /* synthetic */ C23903b(Set set, Set set2, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            set = C52555ag.m112062a();
        }
        if ((i & 2) != 0) {
            set2 = C52555ag.m112062a();
        }
        this(set, set2);
    }
}
