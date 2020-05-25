package com.p683ss.android.message.p1186a.p1187a;

import android.content.Context;
import com.p683ss.android.message.p1186a.p1188b.C19417a;
import com.p683ss.android.message.p1186a.p1188b.C19447b;
import com.p683ss.android.message.p1186a.p1188b.C19448c;
import com.p683ss.android.message.p1186a.p1188b.C19449d;
import com.p683ss.android.message.p1186a.p1188b.p1189a.C19428e;
import com.p683ss.android.message.p1186a.p1188b.p1189a.p1190a.C19423e;
import com.p683ss.android.message.p1186a.p1188b.p1189a.p1190a.C19423e.C19424a;
import com.p683ss.android.pushmanager.setting.C19710b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.ss.android.message.a.a.d */
public final class C19412d implements C19417a {

    /* renamed from: c */
    public static C19447b f53658c = C19447b.SOCKET_DISCONNECTED;

    /* renamed from: d */
    static final Object f53659d = new Object();

    /* renamed from: a */
    public final Map<Long, C19409a> f53660a = new HashMap();

    /* renamed from: b */
    public C19449d f53661b = null;

    /* renamed from: e */
    public final long f53662e;

    /* renamed from: f */
    private Context f53663f;

    /* renamed from: com.ss.android.message.a.a.d$a */
    public interface C19415a {
        /* renamed from: a */
        void mo40495a();
    }

    /* renamed from: a */
    public final void mo40511a() {
        if (this.f53661b != null) {
            this.f53661b.mo40542b();
            this.f53661b = null;
        }
    }

    /* renamed from: a */
    public final void mo40513a(Context context) {
        if (context != null && C19710b.m48173a().mo41102k()) {
            if (this.f53661b == null || this.f53661b.mo40545d() == C19447b.SOCKET_DISCONNECTED) {
                try {
                    if (this.f53660a != null && !this.f53660a.isEmpty()) {
                        m47519b(context);
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* renamed from: b */
    private void m47519b(final Context context) throws IOException {
        if (C19710b.m48173a().mo41102k()) {
            synchronized (f53659d) {
                if (this.f53661b == null) {
                    this.f53661b = new C19428e(context.getApplicationContext(), this);
                }
            }
            if (this.f53661b.mo40545d() != C19447b.SOCKET_DISCONNECTED || !C19416e.m47529a(context)) {
                if (this.f53661b.mo40545d() == C19447b.HANDSSHAKEED || this.f53661b.mo40545d() == C19447b.REGISTERED) {
                    mo40514a(context, (C19415a) new C19415a() {
                        /* renamed from: a */
                        public final void mo40495a() {
                            C19412d.this.mo40513a(context);
                        }
                    });
                }
                return;
            }
            this.f53661b.mo40535a();
            this.f53661b.mo40543b(C19447b.ALL, this);
            this.f53661b.mo40540a(C19447b.ALL, this);
        }
    }

    /* renamed from: a */
    public final void mo40516a(C19448c cVar) {
        f53658c = cVar.f53767b;
        Iterator it = this.f53660a.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public C19412d(long j, Context context) {
        this.f53662e = j;
        this.f53663f = context.getApplicationContext();
    }

    /* renamed from: a */
    public final void mo40512a(long j, byte[] bArr) {
        C19409a aVar = (C19409a) this.f53660a.get(Long.valueOf(j));
        if (aVar != null) {
            try {
                aVar.mo40504a(this.f53663f, bArr);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo40514a(Context context, C19415a aVar) {
        if (context != null && C19710b.m48173a().mo41102k()) {
            try {
                if (this.f53661b == null || !(this.f53661b.mo40545d() == C19447b.HANDSSHAKEED || this.f53661b.mo40545d() == C19447b.REGISTERED)) {
                    if (aVar != null) {
                        aVar.mo40495a();
                    }
                    return;
                }
                C19423e eVar = new C19423e();
                for (C19409a aVar2 : this.f53660a.values()) {
                    eVar.getClass();
                    C19424a aVar3 = new C19424a();
                    aVar3.f53686a = Long.valueOf(aVar2.mo40507d());
                    aVar3.f53687b = aVar2.mo40506c();
                    aVar3.f53688c = aVar2.mo40508e();
                    eVar.f53685a.add(aVar3);
                }
                this.f53661b.mo40537a(eVar);
            } catch (NullPointerException unused) {
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: a */
    public final void mo40515a(C19409a aVar, Context context) {
        if (aVar != null && C19710b.m48173a().mo41102k()) {
            try {
                this.f53660a.put(Long.valueOf(aVar.mo40507d()), aVar);
                mo40513a(context);
            } catch (Exception unused) {
            }
        }
    }
}
