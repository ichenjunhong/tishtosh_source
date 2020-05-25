package com.facebook.imagepipeline.p974n;

import com.facebook.imagepipeline.common.C13951c;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14229b.C14231b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.imagepipeline.n.d */
public class C14177d implements C14140an {

    /* renamed from: a */
    private final C14229b f37004a;

    /* renamed from: b */
    private final String f37005b;

    /* renamed from: c */
    private final C14142ap f37006c;

    /* renamed from: d */
    private final Object f37007d;

    /* renamed from: e */
    private final C14231b f37008e;

    /* renamed from: f */
    private boolean f37009f;

    /* renamed from: g */
    private C13951c f37010g;

    /* renamed from: h */
    private boolean f37011h;

    /* renamed from: i */
    private boolean f37012i;

    /* renamed from: j */
    private final List<C14141ao> f37013j = new ArrayList();

    /* renamed from: a */
    public final C14229b mo26384a() {
        return this.f37004a;
    }

    /* renamed from: b */
    public final String mo26386b() {
        return this.f37005b;
    }

    /* renamed from: c */
    public final C14142ap mo26387c() {
        return this.f37006c;
    }

    /* renamed from: d */
    public final Object mo26388d() {
        return this.f37007d;
    }

    /* renamed from: e */
    public final C14231b mo26389e() {
        return this.f37008e;
    }

    /* renamed from: f */
    public final synchronized boolean mo26390f() {
        return this.f37009f;
    }

    /* renamed from: g */
    public final synchronized C13951c mo26391g() {
        return this.f37010g;
    }

    /* renamed from: h */
    public final synchronized boolean mo26392h() {
        return this.f37011h;
    }

    /* renamed from: i */
    public final void mo26410i() {
        m29057d(m29058j());
    }

    /* renamed from: j */
    private synchronized List<C14141ao> m29058j() {
        if (this.f37012i) {
            return null;
        }
        this.f37012i = true;
        return new ArrayList(this.f37013j);
    }

    /* renamed from: a */
    public static void m29054a(List<C14141ao> list) {
        if (list != null) {
            for (C14141ao b : list) {
                b.mo26366b();
            }
        }
    }

    /* renamed from: b */
    public static void m29055b(List<C14141ao> list) {
        if (list != null) {
            for (C14141ao c : list) {
                c.mo26367c();
            }
        }
    }

    /* renamed from: c */
    public static void m29056c(List<C14141ao> list) {
        if (list != null) {
            for (C14141ao d : list) {
                d.mo26368d();
            }
        }
    }

    /* renamed from: d */
    private static void m29057d(List<C14141ao> list) {
        if (list != null) {
            for (C14141ao a : list) {
                a.mo23173a();
            }
        }
    }

    /* renamed from: a */
    public final synchronized List<C14141ao> mo26407a(C13951c cVar) {
        if (cVar == this.f37010g) {
            return null;
        }
        this.f37010g = cVar;
        return new ArrayList(this.f37013j);
    }

    /* renamed from: b */
    public final synchronized List<C14141ao> mo26409b(boolean z) {
        if (z == this.f37011h) {
            return null;
        }
        this.f37011h = z;
        return new ArrayList(this.f37013j);
    }

    /* renamed from: a */
    public final synchronized List<C14141ao> mo26408a(boolean z) {
        if (z == this.f37009f) {
            return null;
        }
        this.f37009f = z;
        return new ArrayList(this.f37013j);
    }

    /* renamed from: a */
    public final void mo26385a(C14141ao aoVar) {
        boolean z;
        synchronized (this) {
            this.f37013j.add(aoVar);
            z = this.f37012i;
        }
        if (z) {
            aoVar.mo23173a();
        }
    }

    public C14177d(C14229b bVar, String str, C14142ap apVar, Object obj, C14231b bVar2, boolean z, boolean z2, C13951c cVar) {
        this.f37004a = bVar;
        this.f37005b = str;
        this.f37006c = apVar;
        this.f37007d = obj;
        this.f37008e = bVar2;
        this.f37009f = z;
        this.f37010g = cVar;
        this.f37011h = z2;
    }
}
