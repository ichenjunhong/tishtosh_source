package com.bytedance.p560f;

import android.os.SystemClock;
import com.p683ss.android.ttve.nativePort.C20129b.C20133d;
import com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.f.a */
public final class C9751a implements C20133d {

    /* renamed from: a */
    private final C20133d f26543a;

    /* renamed from: b */
    private final ArrayList<String> f26544b = new ArrayList<>();

    /* renamed from: c */
    private final C9753c f26545c;

    /* renamed from: a */
    public final boolean mo17579a(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (!m19525a((String) list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private boolean m19525a(String str) {
        if (this.f26544b.contains(str)) {
            return true;
        }
        String a = this.f26545c.mo17580a(str);
        if (a == null) {
            return this.f26543a.mo17579a(Collections.singletonList(str));
        }
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.load(a);
            C18973a.m46141a(uptimeMillis, a);
            this.f26544b.add(str);
            this.f26545c.mo17581b(str);
            return true;
        } catch (UnsatisfiedLinkError unused) {
            this.f26545c.mo17581b(str);
            return false;
        } catch (Throwable th) {
            this.f26545c.mo17581b(str);
            throw th;
        }
    }

    public C9751a(C20133d dVar, C9753c cVar) {
        this.f26543a = dVar;
        this.f26545c = cVar;
    }
}
