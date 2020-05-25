package com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b;

import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23905c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bp.e.b.a */
public final class C23900a {

    /* renamed from: a */
    private final AtomicBoolean f63566a = new AtomicBoolean(false);

    /* renamed from: b */
    private final List<C23905c> f63567b = new ArrayList();

    /* renamed from: a */
    private boolean m58626a() {
        return this.f63566a.get();
    }

    /* renamed from: b */
    private final void m58627b() {
        this.f63566a.set(true);
    }

    /* renamed from: c */
    private final void m58628c() {
        this.f63566a.set(false);
    }

    /* renamed from: a */
    public final void mo49505a(C23905c cVar) {
        C52711k.m112240b(cVar, "pipeline");
        if (!this.f63567b.contains(cVar)) {
            this.f63567b.add(cVar);
        }
    }

    /* renamed from: a */
    public final void mo49507a(String str) {
        if (str != null) {
            mo49506a(C39629l.m88232a().mo58577h().mo49489c().mo49496b(str));
        }
    }

    /* renamed from: a */
    public final void mo49506a(File file) {
        boolean z;
        if (!m58626a() && file != null && file.exists()) {
            m58627b();
            for (C23905c a : this.f63567b) {
                a.mo49508a(file, true);
            }
            if (!file.isDirectory()) {
                m58628c();
                return;
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(file);
            while (!linkedList.isEmpty() && m58626a()) {
                File file2 = (File) linkedList.remove();
                if (file2.exists()) {
                    File[] listFiles = file2.listFiles();
                    if (listFiles != null) {
                        if (listFiles.length == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            for (File file3 : listFiles) {
                                if (file3 != null && file3.exists()) {
                                    for (C23905c a2 : this.f63567b) {
                                        a2.mo49508a(file3, false);
                                    }
                                    if (file3.isDirectory()) {
                                        linkedList.add(file3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            m58628c();
        }
    }
}
