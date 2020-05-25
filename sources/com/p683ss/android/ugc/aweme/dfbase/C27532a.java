package com.p683ss.android.ugc.aweme.dfbase;

import android.os.Build.VERSION;
import com.bytedance.p763l.C12152c;
import com.bytedance.p763l.p765b.C12150a;
import com.p683ss.android.ugc.aweme.dfbase.p1630b.C27538a;
import com.p683ss.android.ugc.aweme.dfbase.p1630b.C27538a.C27540a;
import com.p683ss.android.ugc.aweme.dfbase.p1631c.C27547c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;

/* renamed from: com.ss.android.ugc.aweme.dfbase.a */
public class C27532a {

    /* renamed from: a */
    protected C27538a f72377a;

    /* renamed from: b */
    protected C27562q f72378b;

    /* renamed from: c */
    protected boolean f72379c;

    static {
        C27560o.m66233c();
    }

    /* renamed from: c */
    public static boolean m66172c() {
        if (VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo55968a() {
        this.f72379c = true;
        return mo55969b();
    }

    /* renamed from: b */
    public boolean mo55969b() {
        String str = this.f72377a.f72398b;
        C27559n nVar = this.f72377a.f72412p;
        C12150a a = C12152c.m24593a(str);
        if (a != null) {
            C27547c.m66215a(this.f72377a, a.f32071c, this.f72379c);
            if (a.f32071c == 5 && this.f72377a.mo55985c()) {
                if (nVar != null) {
                    nVar.mo50033a(this.f72377a.f72403g);
                }
                return true;
            } else if (a.f32071c == 2 || a.f32071c == 4) {
                C27562q b = C27536b.m66176a().mo55975b(this.f72377a.f72397a);
                if (b != null) {
                    b.mo56010b(this.f72377a);
                    b.mo56012d();
                }
                return false;
            } else {
                if (this.f72378b != null) {
                    C27536b.m66176a().mo55974a(this.f72377a.f72397a, this.f72378b);
                }
                C27536b.m66176a().mo55971a(this.f72377a);
                return false;
            }
        } else {
            StringBuilder sb = new StringBuilder("The state of ");
            sb.append(str);
            sb.append("was not found");
            C32458a.m75144a(sb.toString());
            if (nVar != null) {
                nVar.mo50034b(this.f72377a.f72403g);
            }
            return false;
        }
    }

    /* renamed from: a */
    public final void mo55967a(C27559n nVar) {
        this.f72377a.f72412p = nVar;
    }

    public C27532a(C27540a aVar) {
        this(aVar, new C27562q());
    }

    public C27532a(String str) {
        this(new C27540a().mo55989a(str), new C27562q());
    }

    public C27532a(C27540a aVar, C27562q qVar) {
        if (aVar.f72414a != null) {
            if (aVar.f72414a.startsWith("df_language")) {
                aVar.f72415b = "com.ss.android.ugc.aweme.dflanguage";
            } else {
                aVar.f72415b = C27558m.m66228c(aVar.f72414a);
            }
        }
        this.f72377a = new C27538a(aVar);
        qVar.f72451f = this.f72377a.f72397a;
        this.f72378b = qVar;
    }

    public C27532a(String str, C27562q qVar) {
        this(new C27540a().mo55989a(str), qVar);
    }
}
