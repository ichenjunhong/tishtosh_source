package com.p683ss.android.ugc.effectmanager.effect.p2445d.p2447b;

import android.os.Handler;
import android.os.Message;
import com.p683ss.android.ugc.effectmanager.C48903k;
import com.p683ss.android.ugc.effectmanager.common.C48681i;
import com.p683ss.android.ugc.effectmanager.common.C48685j;
import com.p683ss.android.ugc.effectmanager.common.C48685j.C48686a;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48679o;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48680p;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48710o;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48712q;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48715t;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48716u;
import com.p683ss.android.ugc.effectmanager.effect.p2445d.C48744d;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48758n;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48761q;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b.C48878s;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b.C48881v;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.effectmanager.effect.d.b.e */
public final class C48739e implements C48686a, C48744d {

    /* renamed from: a */
    private final String f122405a = "OldUpdateTagRepository";

    /* renamed from: b */
    private HashMap<String, String> f122406b;

    /* renamed from: c */
    private C48565a f122407c;

    /* renamed from: d */
    private Handler f122408d;

    public C48739e(C48565a aVar) {
        this.f122407c = aVar;
        this.f122408d = new C48685j(this);
    }

    /* renamed from: a */
    public final void mo96274a(Message message) {
        switch (message.what) {
            case 51:
                if (message.obj instanceof C48761q) {
                    C48761q qVar = (C48761q) message.obj;
                    if (this.f122407c != null) {
                        C48903k kVar = this.f122407c.f122047a.f122948A;
                        String str = qVar.f122278a;
                        if (kVar.f123043g == null) {
                            kVar.f123043g = new HashMap();
                        }
                        C48716u uVar = (C48716u) kVar.f123043g.get(str);
                        if (uVar != null) {
                            uVar.mo96289a();
                        }
                        C48903k kVar2 = this.f122407c.f122047a.f122948A;
                        String str2 = qVar.f122278a;
                        if (kVar2.f123043g != null) {
                            kVar2.f123043g.remove(str2);
                            break;
                        }
                    } else {
                        return;
                    }
                }
                break;
            case 52:
                if (message.obj instanceof C48758n) {
                    C48758n nVar = (C48758n) message.obj;
                    if (this.f122407c != null) {
                        C48903k kVar3 = this.f122407c.f122047a.f122948A;
                        String str3 = nVar.f122278a;
                        if (kVar3.f123044h == null) {
                            kVar3.f123044h = new HashMap();
                        }
                        C48712q qVar2 = (C48712q) kVar3.f123044h.get(str3);
                        if (this.f122406b == null) {
                            this.f122406b = new HashMap<>();
                        }
                        if (nVar.f122452c == null) {
                            this.f122406b.putAll(nVar.f122451b);
                            if (qVar2 != null) {
                                qVar2.mo8638a(this.f122406b);
                            }
                        } else if (qVar2 != null) {
                            qVar2.mo96288a(nVar.f122452c);
                        }
                        C48903k kVar4 = this.f122407c.f122047a.f122948A;
                        String str4 = nVar.f122278a;
                        if (kVar4.f123044h != null) {
                            kVar4.f123044h.remove(str4);
                        }
                        return;
                    }
                    return;
                }
                break;
        }
    }

    /* renamed from: a */
    public final String mo96314a(final String str, final String str2, final C48710o oVar) {
        String a = C48679o.m105350a();
        if (this.f122406b != null) {
            mo96322b(str, str2, oVar);
        } else if (this.f122407c == null) {
            if (oVar != null) {
                oVar.mo8642b();
            }
            return a;
        } else {
            this.f122407c.f122047a.f122948A.mo96702a(a, (C48712q) new C48712q() {
                /* renamed from: a */
                public final void mo96288a(C48649d dVar) {
                    if (oVar != null) {
                        oVar.mo8641a();
                    }
                }

                /* renamed from: a */
                public final /* synthetic */ void mo8638a(Object obj) {
                    HashMap hashMap = (HashMap) obj;
                    C48739e.this.mo96322b(str, str2, oVar);
                }
            });
            C48681i iVar = this.f122407c.f122047a.f122971q;
            C48878s sVar = new C48878s(this.f122408d, this.f122407c, a, str, str2);
            iVar.mo96269a(sVar);
        }
        return a;
    }

    /* renamed from: b */
    public final void mo96322b(String str, String str2, C48710o oVar) {
        if (oVar != null && this.f122406b != null) {
            if (!this.f122406b.containsKey(str) || C48680p.m105351a(str2, -1) > C48680p.m105351a((String) this.f122406b.get(str), -1)) {
                oVar.mo8641a();
            } else {
                oVar.mo8642b();
            }
        }
    }

    /* renamed from: a */
    public final String mo96315a(String str, String str2, C48715t tVar) {
        String a = C48679o.m105350a();
        if (this.f122406b != null) {
            mo96321a(a, str, str2, tVar);
        } else if (this.f122407c == null) {
            if (tVar != null) {
                tVar.mo8708a();
            }
            return a;
        } else {
            C48903k kVar = this.f122407c.f122047a.f122948A;
            final String str3 = a;
            final String str4 = str;
            final String str5 = str2;
            final C48715t tVar2 = tVar;
            C487412 r0 = new C48712q() {
                /* renamed from: a */
                public final void mo96288a(C48649d dVar) {
                }

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo8638a(Object obj) {
                    HashMap hashMap = (HashMap) obj;
                    C48739e.this.mo96321a(str3, str4, str5, tVar2);
                }
            };
            kVar.mo96702a(a, (C48712q) r0);
            C48681i iVar = this.f122407c.f122047a.f122971q;
            C48878s sVar = new C48878s(this.f122408d, this.f122407c, a, str, str2);
            iVar.mo96269a(sVar);
        }
        return a;
    }

    /* renamed from: a */
    public final void mo96321a(String str, String str2, String str3, final C48715t tVar) {
        if (this.f122407c == null) {
            if (tVar != null) {
                tVar.mo8708a();
            }
            return;
        }
        if (this.f122406b == null) {
            tVar.mo8708a();
        }
        this.f122406b.put(str2, str3);
        C48903k kVar = this.f122407c.f122047a.f122948A;
        C487401 r5 = new C48716u() {
            /* renamed from: a */
            public final void mo96289a() {
                if (tVar != null) {
                    tVar.mo8708a();
                }
            }
        };
        if (kVar.f123043g == null) {
            kVar.f123043g = new HashMap();
        }
        kVar.f123043g.put(str, r5);
        this.f122407c.f122047a.f122971q.mo96269a(new C48881v(this.f122408d, this.f122407c, str, this.f122406b));
    }
}
