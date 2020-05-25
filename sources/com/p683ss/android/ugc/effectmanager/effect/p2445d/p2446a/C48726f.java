package com.p683ss.android.ugc.effectmanager.effect.p2445d.p2446a;

import android.os.Handler;
import android.os.Message;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.C48681i;
import com.p683ss.android.ugc.effectmanager.common.C48685j;
import com.p683ss.android.ugc.effectmanager.common.C48685j.C48686a;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48650e;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48679o;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48680p;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48710o;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48712q;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48715t;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48716u;
import com.p683ss.android.ugc.effectmanager.effect.p2445d.C48744d;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a.C48842s;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a.C48854v;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.effectmanager.effect.d.a.f */
public final class C48726f implements C48686a, C48744d {

    /* renamed from: a */
    public HashMap<String, String> f122377a;

    /* renamed from: b */
    private final Handler f122378b = new C48685j(this);

    /* renamed from: c */
    private final C48565a f122379c;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.d.a.f$a */
    public static abstract class C48727a implements C48650e<String> {
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.d.a.f$b */
    public static final class C48728b implements C48712q {

        /* renamed from: a */
        final /* synthetic */ C48726f f122380a;

        /* renamed from: b */
        final /* synthetic */ String f122381b;

        /* renamed from: c */
        final /* synthetic */ String f122382c;

        /* renamed from: d */
        final /* synthetic */ C48710o f122383d;

        /* renamed from: a */
        public final void mo96288a(C48649d dVar) {
            C52711k.m112240b(dVar, "e");
            C48710o oVar = this.f122383d;
            if (oVar != null) {
                oVar.mo8641a();
            }
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            HashMap hashMap = (HashMap) obj;
            C52711k.m112240b(hashMap, "response");
            if (this.f122380a.f122377a == null) {
                this.f122380a.f122377a = new HashMap<>();
            }
            HashMap<String, String> hashMap2 = this.f122380a.f122377a;
            if (hashMap2 != null) {
                hashMap2.putAll(hashMap);
            }
            this.f122380a.mo96317b(this.f122381b, this.f122382c, this.f122383d);
        }

        C48728b(C48726f fVar, String str, String str2, C48710o oVar) {
            this.f122380a = fVar;
            this.f122381b = str;
            this.f122382c = str2;
            this.f122383d = oVar;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.d.a.f$c */
    public static final class C48729c extends C48727a {

        /* renamed from: a */
        final /* synthetic */ C48716u f122384a;

        C48729c(C48716u uVar) {
            this.f122384a = uVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            C52711k.m112240b((String) obj, "response");
            this.f122384a.mo96289a();
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.d.a.f$d */
    static final class C48730d implements C48716u {

        /* renamed from: a */
        final /* synthetic */ C48715t f122385a;

        C48730d(C48715t tVar) {
            this.f122385a = tVar;
        }

        /* renamed from: a */
        public final void mo96289a() {
            C48715t tVar = this.f122385a;
            if (tVar != null) {
                tVar.mo8708a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.d.a.f$e */
    public static final class C48731e implements C48712q {

        /* renamed from: a */
        final /* synthetic */ C48726f f122386a;

        /* renamed from: b */
        final /* synthetic */ String f122387b;

        /* renamed from: c */
        final /* synthetic */ String f122388c;

        /* renamed from: d */
        final /* synthetic */ String f122389d;

        /* renamed from: e */
        final /* synthetic */ C48715t f122390e;

        /* renamed from: a */
        public final void mo96288a(C48649d dVar) {
            C52711k.m112240b(dVar, "e");
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            C52711k.m112240b((HashMap) obj, "response");
            this.f122386a.mo96316a(this.f122387b, this.f122388c, this.f122389d, this.f122390e);
        }

        C48731e(C48726f fVar, String str, String str2, String str3, C48715t tVar) {
            this.f122386a = fVar;
            this.f122387b = str;
            this.f122388c = str2;
            this.f122389d = str3;
            this.f122390e = tVar;
        }
    }

    /* renamed from: a */
    public final void mo96274a(Message message) {
        C52711k.m112240b(message, "msg");
    }

    public C48726f(C48565a aVar) {
        this.f122379c = aVar;
    }

    /* renamed from: a */
    public final String mo96314a(String str, String str2, C48710o oVar) {
        C52711k.m112240b(str, "id");
        C52711k.m112240b(str2, "updateTime");
        String a = C48679o.m105350a();
        if (this.f122377a != null) {
            mo96317b(str, str2, oVar);
        } else if (this.f122379c == null) {
            if (oVar != null) {
                oVar.mo8642b();
            }
            return a;
        } else {
            C48728b bVar = new C48728b(this, str, str2, oVar);
            C48890g gVar = this.f122379c.f122047a;
            C52711k.m112236a((Object) gVar, "mEffectContext.effectConfiguration");
            C48681i iVar = gVar.f122971q;
            if (iVar != null) {
                iVar.mo96270a(new C48842s(this.f122378b, this.f122379c, a), bVar);
            }
        }
        return a;
    }

    /* renamed from: b */
    public final void mo96317b(String str, String str2, C48710o oVar) {
        if (this.f122377a != null) {
            HashMap<String, String> hashMap = this.f122377a;
            if (hashMap == null) {
                C52711k.m112234a();
            }
            if (hashMap.containsKey(str)) {
                long a = C48680p.m105351a(str2, -1);
                HashMap<String, String> hashMap2 = this.f122377a;
                if (hashMap2 == null) {
                    C52711k.m112234a();
                }
                if (a > C48680p.m105351a((String) hashMap2.get(str), -1)) {
                    if (oVar != null) {
                        oVar.mo8641a();
                    }
                } else if (oVar != null) {
                    oVar.mo8642b();
                }
            } else if (oVar != null) {
                oVar.mo8641a();
            }
        } else if (oVar != null) {
            oVar.mo8641a();
        }
    }

    /* renamed from: a */
    public final String mo96315a(String str, String str2, C48715t tVar) {
        C52711k.m112240b(str, "id");
        C52711k.m112240b(str2, "updateTime");
        String a = C48679o.m105350a();
        if (this.f122377a != null) {
            mo96316a(a, str, str2, tVar);
        } else if (this.f122379c == null) {
            if (tVar != null) {
                tVar.mo8708a();
            }
            return a;
        } else {
            C48731e eVar = new C48731e(this, a, str, str2, tVar);
            C48890g gVar = this.f122379c.f122047a;
            C52711k.m112236a((Object) gVar, "mEffectContext.effectConfiguration");
            C48681i iVar = gVar.f122971q;
            if (iVar != null) {
                iVar.mo96270a(new C48842s(this.f122378b, this.f122379c, a), eVar);
            }
        }
        return a;
    }

    /* renamed from: a */
    public final void mo96316a(String str, String str2, String str3, C48715t tVar) {
        if (this.f122379c != null) {
            if (this.f122377a == null && tVar != null) {
                tVar.mo8708a();
            }
            HashMap<String, String> hashMap = this.f122377a;
            if (hashMap == null) {
                C52711k.m112234a();
            }
            hashMap.put(str2, str3);
            C48729c cVar = new C48729c(new C48730d(tVar));
            C48890g gVar = this.f122379c.f122047a;
            C52711k.m112236a((Object) gVar, "mEffectContext.effectConfiguration");
            C48681i iVar = gVar.f122971q;
            if (iVar != null) {
                iVar.mo96270a(new C48854v(this.f122378b, this.f122379c, str, this.f122377a), cVar);
            }
        } else if (tVar != null) {
            tVar.mo8708a();
        }
    }
}
