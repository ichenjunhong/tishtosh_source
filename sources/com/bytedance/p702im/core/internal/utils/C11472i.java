package com.bytedance.p702im.core.internal.utils;

import android.text.TextUtils;
import com.bytedance.p702im.core.internal.p718b.C11324a;
import com.bytedance.p702im.core.internal.p718b.p719a.C11386i;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11199h;
import com.bytedance.p702im.core.p706c.C11200i;
import com.bytedance.p702im.core.p706c.C11201j;
import com.bytedance.p702im.core.p706c.C11202k;
import com.bytedance.p702im.core.p706c.C11203l;
import com.bytedance.p702im.core.p706c.C11205n;
import com.bytedance.p702im.core.p706c.C11206o;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.p706c.C11238s;
import com.bytedance.p702im.core.p706c.C11241u;
import com.bytedance.p702im.core.p708d.C11248a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.im.core.internal.utils.i */
public class C11472i implements C11199h, C11200i, C11201j, C11203l {

    /* renamed from: f */
    private static C11472i f30776f;

    /* renamed from: a */
    public C11203l f30777a;

    /* renamed from: b */
    public C11200i f30778b;

    /* renamed from: c */
    public C11201j f30779c;

    /* renamed from: d */
    public Map<String, List<C11200i>> f30780d = new ConcurrentHashMap();

    /* renamed from: e */
    public Map<String, List<C11199h>> f30781e = new ConcurrentHashMap();

    /* renamed from: g */
    private Map<String, List<C11203l>> f30782g = new ConcurrentHashMap();

    /* renamed from: com.bytedance.im.core.internal.utils.i$a */
    interface C11496a<T> {
        /* renamed from: a */
        void mo21118a(T t);
    }

    /* renamed from: a */
    public final void mo20727a(boolean z) {
    }

    /* renamed from: c */
    public final void mo20730c(List<C11207p> list) {
    }

    /* renamed from: d */
    public final void mo20731d(List<C11207p> list) {
    }

    /* renamed from: a */
    public final void mo21113a(String str, C11203l lVar) {
        List list = (List) this.f30782g.get(str);
        if (list == null) {
            list = new ArrayList();
        }
        if (!list.contains(lVar)) {
            list.add(lVar);
        }
        this.f30782g.put(str, list);
    }

    /* renamed from: a */
    public final void mo20665a(final List<C11206o> list) {
        if (list != null && !list.isEmpty()) {
            m23484b(((C11206o) list.get(0)).getConversationId(), (C11496a<C11200i>) new C11496a<C11200i>() {
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo21118a(Object obj) {
                    ((C11200i) obj).mo20665a(list);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo20726a(final List<C11207p> list, final int i) {
        if (list != null && !list.isEmpty()) {
            mo21114a(((C11207p) list.get(0)).getConversationId(), (C11496a<C11203l>) new C11496a<C11203l>() {
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo21118a(Object obj) {
                    ((C11203l) obj).mo20726a(list, i);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo20725a(final C11207p pVar, final Map<String, List<C11205n>> map, final Map<String, List<C11205n>> map2) {
        if (pVar != null && !TextUtils.isEmpty(pVar.getConversationId())) {
            mo21114a(pVar.getConversationId(), (C11496a<C11203l>) new C11496a<C11203l>() {
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo21118a(Object obj) {
                    ((C11203l) obj).mo20725a(pVar, map, map2);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo21114a(String str, C11496a<C11203l> aVar) {
        List<C11203l> list = (List) this.f30782g.get(str);
        if (list != null) {
            for (C11203l a : list) {
                aVar.mo21118a(a);
            }
        }
        if (this.f30777a != null) {
            aVar.mo21118a(this.f30777a);
        }
    }

    private C11472i() {
    }

    /* renamed from: a */
    public static C11472i m23483a() {
        if (f30776f == null) {
            synchronized (C11472i.class) {
                if (f30776f == null) {
                    f30776f = new C11472i();
                }
            }
        }
        return f30776f;
    }

    /* renamed from: c */
    public final void mo20673c(final C11180b bVar) {
        if (bVar != null && !TextUtils.isEmpty(bVar.getConversationId())) {
            m23484b(bVar.getConversationId(), (C11496a<C11200i>) new C11496a<C11200i>() {
                /* renamed from: a */
                public final /* synthetic */ void mo21118a(Object obj) {
                    ((C11200i) obj).mo20673c(bVar);
                }
            });
        }
    }

    /* renamed from: d */
    public final void mo20676d(final C11180b bVar) {
        if (bVar != null && !TextUtils.isEmpty(bVar.getConversationId())) {
            m23484b(bVar.getConversationId(), (C11496a<C11200i>) new C11496a<C11200i>() {
                /* renamed from: a */
                public final /* synthetic */ void mo21118a(Object obj) {
                    ((C11200i) obj).mo20676d(bVar);
                }
            });
        }
    }

    /* renamed from: e */
    public final void mo20679e(final C11180b bVar) {
        if (bVar != null && !TextUtils.isEmpty(bVar.getConversationId())) {
            m23484b(bVar.getConversationId(), (C11496a<C11200i>) new C11496a<C11200i>() {
                /* renamed from: a */
                public final /* synthetic */ void mo21118a(Object obj) {
                    ((C11200i) obj).mo20679e(bVar);
                }
            });
        }
    }

    /* renamed from: f */
    public final void mo20719f(final C11180b bVar) {
        if (bVar != null && !TextUtils.isEmpty(bVar.getConversationId())) {
            m23485c(bVar.getConversationId(), new C11496a<C11199h>() {
                /* renamed from: a */
                public final /* synthetic */ void mo21118a(Object obj) {
                    ((C11199h) obj).mo20719f(bVar);
                }
            });
        }
    }

    /* renamed from: g */
    public final void mo20720g(final List<C11206o> list) {
        if (list != null && !list.isEmpty()) {
            C1147915 r0 = new C11496a<C11201j>() {
                /* renamed from: a */
                public final /* synthetic */ void mo21118a(Object obj) {
                    ((C11201j) obj).mo20720g(list);
                }
            };
            if (this.f30779c != null) {
                r0.mo21118a(this.f30779c);
            }
        }
    }

    /* renamed from: a */
    public final void mo21112a(int i) {
        StringBuilder sb = new StringBuilder("handleInitMessageEnd:");
        sb.append(i);
        C11467e.m23467b(sb.toString());
        C11324a.f30479i.add(Integer.valueOf(i));
        if (!C11324a.m23140f(i)) {
            mo21115b(i);
        }
        if (C11463b.m23446b() == C11324a.f30479i.size()) {
            C11467e.m23467b("all inbox message init end");
        }
    }

    /* renamed from: e */
    public final void mo20732e(final List<C11207p> list) {
        if (list != null && !list.isEmpty()) {
            mo21114a(((C11207p) list.get(0)).getConversationId(), (C11496a<C11203l>) new C11496a<C11203l>() {
                /* renamed from: a */
                public final /* synthetic */ void mo21118a(Object obj) {
                    ((C11203l) obj).mo20732e(list);
                }
            });
        }
    }

    /* renamed from: f */
    public final void mo20733f(final List<C11241u> list) {
        if (list != null && !list.isEmpty()) {
            C11241u uVar = (C11241u) list.get(0);
            if (uVar != null && !TextUtils.isEmpty(uVar.getConversationId())) {
                mo21114a(uVar.getConversationId(), (C11496a<C11203l>) new C11496a<C11203l>() {
                    /* renamed from: a */
                    public final /* synthetic */ void mo21118a(Object obj) {
                        ((C11203l) obj).mo20733f(list);
                    }
                });
            }
        }
    }

    /* renamed from: b */
    public final void mo21115b(int i) {
        StringBuilder sb = new StringBuilder("onInitEnd:");
        sb.append(i);
        C11467e.m23467b(sb.toString());
        C11324a.f30480j.add(Integer.valueOf(i));
        if (C11463b.m23446b() == C11324a.f30480j.size()) {
            C11467e.m23467b("all inbox init end");
            new C11386i(new C11162b<Void>() {
                /* renamed from: a */
                public final void mo20508a(C11202k kVar) {
                    C11248a.m22844b();
                }

                /* renamed from: a */
                public final /* synthetic */ void mo20506a(Object obj) {
                    Void voidR = (Void) obj;
                    C11248a.m22844b();
                }
            }).mo21048b();
        }
    }

    /* renamed from: b */
    public final void mo20668b(final C11180b bVar) {
        if (bVar != null && !TextUtils.isEmpty(bVar.getConversationId())) {
            m23484b(bVar.getConversationId(), (C11496a<C11200i>) new C11496a<C11200i>() {
                /* renamed from: a */
                public final /* synthetic */ void mo21118a(Object obj) {
                    ((C11200i) obj).mo20668b(bVar);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo20729b(final C11207p pVar) {
        if (pVar != null && !TextUtils.isEmpty(pVar.getConversationId())) {
            mo21114a(pVar.getConversationId(), (C11496a<C11203l>) new C11496a<C11203l>() {
                /* renamed from: a */
                public final /* synthetic */ void mo21118a(Object obj) {
                    ((C11203l) obj).mo20729b(pVar);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo20662a(final C11180b bVar) {
        if (bVar != null && !TextUtils.isEmpty(bVar.getConversationId())) {
            m23484b(bVar.getConversationId(), (C11496a<C11200i>) new C11496a<C11200i>() {
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo21118a(Object obj) {
                    ((C11200i) obj).mo20662a(bVar);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo20724a(final C11207p pVar) {
        if (pVar != null && !TextUtils.isEmpty(pVar.getConversationId())) {
            mo21114a(pVar.getConversationId(), (C11496a<C11203l>) new C11496a<C11203l>() {
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo21118a(Object obj) {
                    ((C11203l) obj).mo20724a(pVar);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo20670b(final List<C11206o> list) {
        if (list != null && !list.isEmpty()) {
            m23484b(((C11206o) list.get(0)).getConversationId(), (C11496a<C11200i>) new C11496a<C11200i>() {
                /* renamed from: a */
                public final /* synthetic */ void mo21118a(Object obj) {
                    ((C11200i) obj).mo20670b(list);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo20664a(final String str, final List<C11206o> list) {
        if (!TextUtils.isEmpty(str)) {
            m23484b(str, (C11496a<C11200i>) new C11496a<C11200i>() {
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo21118a(Object obj) {
                    ((C11200i) obj).mo20664a(str, list);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo21117b(String str, final List<C11207p> list) {
        if (!TextUtils.isEmpty(str)) {
            mo21114a(str, (C11496a<C11203l>) new C11496a<C11203l>() {
                /* renamed from: a */
                public final /* synthetic */ void mo21118a(Object obj) {
                    ((C11203l) obj).mo20731d(list);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo20728b(final int i, final C11207p pVar) {
        if (pVar != null && !TextUtils.isEmpty(pVar.getConversationId())) {
            mo21114a(pVar.getConversationId(), (C11496a<C11203l>) new C11496a<C11203l>() {
                /* renamed from: a */
                public final /* synthetic */ void mo21118a(Object obj) {
                    ((C11203l) obj).mo20728b(i, pVar);
                }
            });
        }
    }

    /* renamed from: b */
    private void m23484b(String str, C11496a<C11200i> aVar) {
        List list = (List) this.f30780d.get(str);
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                aVar.mo21118a(list.get(i));
            }
        }
        if (this.f30778b != null) {
            aVar.mo21118a(this.f30778b);
        }
    }

    /* renamed from: c */
    private void m23485c(String str, C11496a<C11199h> aVar) {
        List list = (List) this.f30781e.get(str);
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                C11199h hVar = (C11199h) list.get(i);
                if (hVar != null) {
                    aVar.mo21118a(hVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo20721a(final int i, final C11207p pVar) {
        if (pVar != null && !TextUtils.isEmpty(pVar.getConversationId())) {
            mo21114a(pVar.getConversationId(), (C11496a<C11203l>) new C11496a<C11203l>() {
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo21118a(Object obj) {
                    ((C11203l) obj).mo20721a(i, pVar);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo20722a(final int i, final C11238s sVar) {
        if (sVar != null && !TextUtils.isEmpty(sVar.getConversationId())) {
            mo21114a(sVar.getConversationId(), (C11496a<C11203l>) new C11496a<C11203l>() {
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo21118a(Object obj) {
                    ((C11203l) obj).mo20722a(i, sVar);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo20723a(final int i, final C11241u uVar) {
        if (uVar != null && !TextUtils.isEmpty(uVar.getConversationId())) {
            mo21114a(uVar.getConversationId(), (C11496a<C11203l>) new C11496a<C11203l>() {
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo21118a(Object obj) {
                    ((C11203l) obj).mo20723a(i, uVar);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo21116b(String str, C11203l lVar) {
        List list = (List) this.f30782g.get(str);
        list.remove(lVar);
        this.f30782g.put(str, list);
    }
}
