package com.p683ss.android.ugc.effectmanager;

import android.text.TextUtils;
import android.util.Pair;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.effectmanager.common.C48643f;
import com.p683ss.android.ugc.effectmanager.common.C48681i;
import com.p683ss.android.ugc.effectmanager.common.C48681i.C48684a;
import com.p683ss.android.ugc.effectmanager.common.p2433a.C48593c.C48594a;
import com.p683ss.android.ugc.effectmanager.common.p2434b.C48618b;
import com.p683ss.android.ugc.effectmanager.common.p2434b.C48620c;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48652g;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48661b;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48667e;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i;
import com.p683ss.android.ugc.effectmanager.effect.model.DownloadEffectExtra;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p683ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48696a;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48697b;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48701f;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48702g;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48703h;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48704i;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48706k;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48707l;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48708m;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48709n;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48710o;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48711p;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48714s;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48715t;
import com.p683ss.android.ugc.effectmanager.effect.p2445d.C48717a;
import com.p683ss.android.ugc.effectmanager.effect.p2445d.C48732b;
import com.p683ss.android.ugc.effectmanager.effect.p2445d.C48743c;
import com.p683ss.android.ugc.effectmanager.effect.p2445d.C48744d;
import com.p683ss.android.ugc.effectmanager.effect.p2445d.p2446a.C48718a;
import com.p683ss.android.ugc.effectmanager.effect.p2445d.p2446a.C48719b;
import com.p683ss.android.ugc.effectmanager.effect.p2445d.p2446a.C48720c;
import com.p683ss.android.ugc.effectmanager.effect.p2445d.p2446a.C48723d;
import com.p683ss.android.ugc.effectmanager.effect.p2445d.p2446a.C48724e;
import com.p683ss.android.ugc.effectmanager.effect.p2445d.p2446a.C48726f;
import com.p683ss.android.ugc.effectmanager.effect.p2445d.p2447b.C48733a;
import com.p683ss.android.ugc.effectmanager.effect.p2445d.p2447b.C48733a.C48734a;
import com.p683ss.android.ugc.effectmanager.effect.p2445d.p2447b.C48735b;
import com.p683ss.android.ugc.effectmanager.effect.p2445d.p2447b.C48736c;
import com.p683ss.android.ugc.effectmanager.effect.p2445d.p2447b.C48736c.C48737a;
import com.p683ss.android.ugc.effectmanager.effect.p2445d.p2447b.C48738d;
import com.p683ss.android.ugc.effectmanager.effect.p2445d.p2447b.C48739e;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a.C48766a.C48767a;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* renamed from: com.ss.android.ugc.effectmanager.h */
public final class C48893h {

    /* renamed from: a */
    protected C48732b f123010a;

    /* renamed from: b */
    public C48735b f123011b;

    /* renamed from: c */
    public C48719b f123012c;

    /* renamed from: d */
    public C48620c f123013d;

    /* renamed from: e */
    public boolean f123014e;

    /* renamed from: f */
    protected C48565a f123015f;

    /* renamed from: g */
    private C48717a f123016g;

    /* renamed from: h */
    private C48743c f123017h;

    /* renamed from: i */
    private C48744d f123018i;

    /* renamed from: a */
    public final void mo96681a(String str, final boolean z, final C48702g gVar) {
        if (this.f123015f == null || this.f123016g == null) {
            if (gVar != null) {
                gVar.mo8637a(new C48649d((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        C488963 r0 = new C48702g() {
            /* renamed from: a */
            public final void mo8637a(C48649d dVar) {
                if (gVar != null) {
                    gVar.mo8637a(dVar);
                }
            }

            /* renamed from: a */
            public final /* synthetic */ void mo8638a(Object obj) {
                final EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
                if (C48893h.this.f123012c != null && C48893h.this.f123014e) {
                    C48893h.this.f123012c.f122364a = effectChannelResponse;
                }
                if (z) {
                    final String a = C48667e.m105298a(C48893h.this.f123015f.f122047a.f122960f, effectChannelResponse.getPanel());
                    final String c_ = C48893h.this.f123013d.mo96154c_(a);
                    C48893h.this.f123013d.mo96153c(a);
                    C48893h.this.mo96683a(C48893h.this.mo96663a(effectChannelResponse.getAllCategoryEffects()), (C48704i) new C48704i() {
                        /* renamed from: a */
                        public final void mo77143a(C48649d dVar) {
                            if (gVar != null) {
                                gVar.mo8637a(dVar);
                            }
                        }

                        /* renamed from: a */
                        public final /* synthetic */ void mo8638a(Object obj) {
                            List list = (List) obj;
                            EffectChannelResponse effectChannelResponse = effectChannelResponse;
                            effectChannelResponse.setAllCategoryEffects(list);
                            for (EffectCategoryResponse effectCategoryResponse : effectChannelResponse.getCategoryResponseList()) {
                                ArrayList arrayList = new ArrayList();
                                for (Effect effect : effectCategoryResponse.getTotalEffects()) {
                                    if (list.contains(effect)) {
                                        arrayList.add(effect);
                                    }
                                }
                                effectCategoryResponse.setTotalEffects(arrayList);
                            }
                            if (gVar != null) {
                                gVar.mo8638a(effectChannelResponse);
                            }
                            C48893h.this.f123013d.mo96148a(a, c_);
                        }
                    });
                    return;
                }
                if (gVar != null) {
                    gVar.mo8638a(effectChannelResponse);
                }
            }
        };
        if (!TextUtils.isEmpty(str)) {
            this.f123016g.mo96294a(str, false, r0);
        } else {
            this.f123016g.mo96294a("default", false, r0);
        }
    }

    /* renamed from: a */
    public final void mo96682a(String str, boolean z, String str2, int i, int i2, C48707l lVar) {
        if (this.f123015f == null || this.f123016g == null) {
            if (lVar != null) {
                lVar.mo59192a(new C48649d((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        this.f123016g.mo96295a(str, z, str2, i, i2, false, lVar);
    }

    /* renamed from: a */
    public final void mo96677a(String str, String str2, Map<String, String> map, C48696a aVar) {
        mo96674a(str, str2, C48767a.m105504a(), map, aVar);
    }

    /* renamed from: a */
    public void mo96674a(String str, String str2, int i, Map<String, String> map, C48696a aVar) {
        if (this.f123015f == null || this.f123016g == null) {
            if (aVar != null) {
                aVar.mo8639a(new C48649d((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        this.f123016g.mo96293a(str, str2, i, map, aVar);
    }

    /* renamed from: a */
    public final void mo96679a(String str, Map<String, String> map, final C48705j jVar) {
        if (this.f123015f == null) {
            if (jVar != null) {
                jVar.mo8644a(null, new C48649d((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        C488995 r0 = new C48704i() {
            /* renamed from: a */
            public final void mo77143a(C48649d dVar) {
                jVar.mo8644a(null, dVar);
            }

            /* renamed from: a */
            public final /* synthetic */ void mo8638a(Object obj) {
                List list = (List) obj;
                if (!list.isEmpty()) {
                    jVar.mo8638a(list.get(0));
                } else {
                    jVar.mo8644a(null, new C48649d(1));
                }
            }
        };
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        mo96685a((List<String>) arrayList, true, map, (C48704i) r0);
    }

    /* renamed from: a */
    public final void mo96685a(List<String> list, final boolean z, Map<String, String> map, final C48704i iVar) {
        if (this.f123015f == null || this.f123010a == null) {
            if (iVar != null) {
                iVar.mo77143a(new C48649d((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        this.f123010a.mo96308a(list, map, (C48704i) new C48704i() {
            /* renamed from: a */
            public final void mo77143a(C48649d dVar) {
                iVar.mo77143a(dVar);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo8638a(Object obj) {
                List list = (List) obj;
                if (z) {
                    C48893h.this.mo96683a(list, iVar);
                } else {
                    iVar.mo8638a(list);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo96684a(List<String> list, Map<String, String> map, C48703h hVar) {
        if (this.f123015f == null || this.f123010a == null) {
            if (hVar != null) {
                hVar.mo89462a(new C48649d((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        this.f123010a.mo96311b(list, map, hVar);
    }

    /* renamed from: a */
    public final void mo96672a(String str, String str2, int i, int i2, Map<String, String> map, C48714s sVar) {
        if (this.f123015f == null || this.f123016g == null) {
            if (sVar != null) {
                sVar.mo59196a(new C48649d((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        this.f123010a.mo96305a(str, str2, i, i2, map, sVar);
    }

    /* renamed from: a */
    public final boolean mo96687a(Effect effect) {
        boolean z;
        this.f123010a.mo96310b(effect, null);
        if (this.f123015f.f122047a.f122952E == null) {
            return false;
        }
        C48718a aVar = this.f123015f.f122047a.f122952E;
        if (effect != null && !aVar.mo96300a(effect.getEffectId())) {
            z = C48671i.m105324a(effect.getUnzipPath());
        } else {
            z = false;
        }
        if (!z || !C48669g.m105312a(effect)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo96676a(String str, String str2, C48715t tVar) {
        if (this.f123018i == null) {
            if (tVar != null) {
                tVar.mo8708a();
            }
            return;
        }
        this.f123018i.mo96315a(str, str2, tVar);
    }

    /* renamed from: a */
    public final void mo96675a(String str, String str2, C48710o oVar) {
        if (this.f123018i == null) {
            oVar.mo8642b();
        } else {
            this.f123018i.mo96314a(str, str2, oVar);
        }
    }

    /* renamed from: a */
    public final void mo96678a(String str, List<String> list, Boolean bool, C48711p pVar) {
        if (this.f123015f == null || this.f123017h == null) {
            if (pVar != null) {
                pVar.mo92558a(new C48649d((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        this.f123017h.mo96313a(str, list, bool.booleanValue(), pVar);
    }

    /* renamed from: a */
    public final void mo96680a(String str, boolean z, int i, int i2, C48708m mVar) {
        if (this.f123015f == null || this.f123016g == null) {
            if (mVar != null) {
                mVar.mo73920a(new C48649d((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        this.f123016g.mo96290a(str, i, i2, mVar);
    }

    /* renamed from: a */
    public final void mo96673a(String str, String str2, int i, int i2, boolean z, C48708m mVar) {
        if (this.f123015f == null || this.f123016g == null) {
            if (mVar != null) {
                mVar.mo73920a(new C48649d((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        this.f123016g.mo96292a(str, str2, i, i2, mVar);
    }

    /* renamed from: a */
    public final boolean mo96688a(C48890g gVar) {
        ExecutorService executorService;
        if (!((gVar == null || gVar.f122951D == null || gVar.f122951D.isEmpty() || gVar.f122976v == null || gVar.f122977w == null || gVar.f122964j == null || !gVar.f122964j.exists()) ? false : true)) {
            return false;
        }
        this.f123015f = new C48565a(gVar);
        ExecutorService executorService2 = gVar.f122979y;
        C48681i iVar = new C48681i();
        C48684a aVar = new C48684a();
        if (executorService2 == null) {
            executorService = Executors.newCachedThreadPool(new C48643f("EffectManager", true));
        } else {
            executorService = executorService2;
        }
        aVar.f122340a = executorService;
        iVar.f122331b = aVar.f122340a;
        iVar.f122332c = aVar.f122341b;
        iVar.f122333d = new ConcurrentHashMap();
        iVar.f122330a = true;
        this.f123015f.f122047a.f122971q = iVar;
        String absolutePath = this.f123015f.f122047a.f122964j.getAbsolutePath();
        if (this.f123015f.f122047a.f122972r == null) {
            if (C48594a.m105132a().mo96146a(absolutePath) == null) {
                C48594a.m105132a().mo96147a(absolutePath, new C48618b(this.f123015f.f122047a.f122964j.getAbsolutePath()));
            }
            this.f123013d = C48594a.m105132a().mo96146a(absolutePath);
            this.f123015f.f122047a.f122972r = this.f123013d;
        } else {
            this.f123013d = this.f123015f.f122047a.f122972r;
            C48594a.m105132a().mo96147a(absolutePath, this.f123013d);
        }
        this.f123011b = new C48735b(this.f123015f.f122047a);
        this.f123014e = this.f123015f.f122047a.f122954G;
        if (this.f123014e) {
            this.f123016g = new C48720c(this.f123015f);
            this.f123010a = new C48723d(this.f123015f);
            this.f123017h = new C48724e(this.f123015f);
            this.f123018i = new C48726f(this.f123015f);
            this.f123012c = new C48719b();
        } else {
            this.f123016g = new C48733a(this.f123015f);
            this.f123010a = new C48736c(this.f123015f);
            this.f123017h = new C48738d(this.f123015f);
            this.f123018i = new C48739e(this.f123015f);
        }
        if (!this.f123014e && (this.f123016g instanceof C48733a)) {
            ((C48733a) this.f123016g).f122391a = new C48734a() {
                /* renamed from: a */
                public final void mo96318a(String str, EffectChannelResponse effectChannelResponse, int i, C48649d dVar) {
                    C48735b bVar = C48893h.this.f123011b;
                    switch (i) {
                        case 23:
                            bVar.f122395a = effectChannelResponse;
                            C48702g c = bVar.f122396b.f122948A.mo96704c(str);
                            if (c != null) {
                                c.mo8638a(effectChannelResponse);
                                return;
                            }
                            break;
                        case 24:
                            return;
                        case 25:
                            return;
                        case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                            C48702g c2 = bVar.f122396b.f122948A.mo96704c(str);
                            if (c2 != null) {
                                c2.mo8637a(dVar);
                                break;
                            }
                            break;
                    }
                }
            };
        }
        if (!this.f123014e && (this.f123010a instanceof C48736c)) {
            ((C48736c) this.f123010a).f122397a = new C48737a() {
                /* renamed from: a */
                public final void mo96320a(String str, List<Effect> list, C48649d dVar) {
                    C48735b bVar = C48893h.this.f123011b;
                    C48903k kVar = bVar.f122396b.f122948A;
                    if (kVar.f123039c == null) {
                        kVar.f123039c = new HashMap();
                    }
                    C48704i iVar = (C48704i) kVar.f123039c.get(str);
                    if (iVar != null) {
                        if (dVar == null) {
                            iVar.mo8638a(list);
                        } else {
                            iVar.mo77143a(dVar);
                        }
                        C48903k kVar2 = bVar.f122396b.f122948A;
                        if (kVar2.f123037a != null) {
                            kVar2.f123037a.remove(str);
                        }
                    }
                }

                /* renamed from: a */
                public final void mo96319a(String str, Effect effect, int i, C48649d dVar) {
                    C48735b bVar = C48893h.this.f123011b;
                    if (i != 26) {
                        switch (i) {
                            case 20:
                                C48705j a = bVar.f122396b.f122948A.mo96695a(str);
                                if (a != null) {
                                    a.mo8638a(effect);
                                    bVar.f122396b.f122948A.mo96703b(str);
                                    return;
                                }
                                break;
                            case 21:
                                return;
                            case 22:
                                return;
                        }
                    } else {
                        C48705j a2 = bVar.f122396b.f122948A.mo96695a(str);
                        if (a2 != null) {
                            a2.mo8644a(effect, dVar);
                            bVar.f122396b.f122948A.mo96703b(str);
                        }
                    }
                }
            };
        }
        return true;
    }

    /* renamed from: a */
    public final void mo96683a(List<Effect> list, C48704i iVar) {
        if (this.f123015f == null || this.f123010a == null) {
            if (iVar != null) {
                iVar.mo77143a(new C48649d((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        this.f123010a.mo96306a(list, (DownloadEffectExtra) null, iVar);
    }

    /* renamed from: a */
    public final void mo96664a() {
        if (this.f123015f != null) {
            this.f123015f.f122047a.f122948A.mo96697a();
        }
    }

    /* renamed from: b */
    public final void mo96689b() {
        if (this.f123015f != null && this.f123015f.f122047a != null) {
            if (this.f123015f.f122047a.f122971q != null) {
                C48681i iVar = this.f123015f.f122047a.f122971q;
                if (!C48661b.m105289a(iVar.f122334e)) {
                    for (Pair pair : iVar.f122334e.values()) {
                        ((C48652g) pair.first).mo96234g();
                        ((Future) pair.second).cancel(true);
                    }
                    iVar.f122334e.clear();
                }
                if (iVar.f122332c) {
                    iVar.f122331b.shutdown();
                }
                C48681i iVar2 = this.f123015f.f122047a.f122971q;
                if (iVar2.f122332c) {
                    iVar2.f122331b.shutdown();
                }
            }
            if (this.f123015f.f122047a.f122948A != null) {
                this.f123015f.f122047a.f122948A.mo96697a();
            }
            if (this.f123015f.f122047a.f122952E != null) {
                C48718a aVar = this.f123015f.f122047a.f122952E;
                aVar.f122363b.clear();
                aVar.f122362a.clear();
            }
        }
    }

    /* renamed from: a */
    public final void mo96667a(String str) {
        this.f123013d.mo96151a(C48667e.m105301b(str));
    }

    /* renamed from: a */
    public final List<Effect> mo96663a(List<Effect> list) {
        ArrayList arrayList = new ArrayList();
        if (this.f123015f.f122047a.f122952E == null) {
            return list;
        }
        List a = this.f123015f.f122047a.f122952E.mo96296a();
        for (Effect effect : list) {
            if (!a.contains(effect)) {
                arrayList.add(effect);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final boolean mo96693b(Effect effect) {
        if (this.f123015f.f122047a.f122952E == null || !C48669g.m105312a(effect) || !this.f123015f.f122047a.f122952E.mo96300a(effect.getEffectId())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo96686a(Map<String, String> map, C48709n nVar) {
        this.f123010a.mo96309a(map, nVar);
    }

    /* renamed from: a */
    public final void mo96665a(Effect effect, C48705j jVar) {
        if (this.f123015f == null || this.f123010a == null) {
            if (jVar != null) {
                jVar.mo8644a(effect, new C48649d((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        this.f123010a.mo96303a(effect, jVar);
    }

    /* renamed from: a */
    public final void mo96666a(ProviderEffect providerEffect, C48697b bVar) {
        if (this.f123015f == null || this.f123016g == null) {
            if (bVar != null) {
                bVar.mo73922a(providerEffect, new C48649d((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        this.f123010a.mo96304a(providerEffect, bVar);
    }

    /* renamed from: a */
    public final void mo96668a(String str, C48696a aVar) {
        mo96674a(str, (String) null, 0, null, aVar);
    }

    /* renamed from: a */
    public final void mo96669a(String str, final C48702g gVar) {
        if (this.f123015f == null || this.f123016g == null) {
            if (gVar != null) {
                gVar.mo8637a(new C48649d((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        C488984 r0 = new C48702g() {
            /* renamed from: a */
            public final void mo8637a(C48649d dVar) {
                gVar.mo8637a(dVar);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo8638a(Object obj) {
                EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
                if (C48893h.this.f123012c != null && C48893h.this.f123014e) {
                    C48893h.this.f123012c.f122364a = effectChannelResponse;
                }
                gVar.mo8638a(effectChannelResponse);
            }
        };
        if (!TextUtils.isEmpty(str)) {
            this.f123016g.mo96294a(str, true, r0);
        } else {
            this.f123016g.mo96294a("default", true, r0);
        }
    }

    /* renamed from: a */
    public final void mo96670a(String str, C48706k kVar) {
        if (this.f123015f == null || this.f123017h == null) {
            if (kVar != null) {
                kVar.mo92557a(new C48649d((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        this.f123017h.mo96312a(str, kVar);
    }

    /* renamed from: b */
    public final void mo96692b(List<String> list, Map<String, String> map, C48703h hVar) {
        if (this.f123015f == null || this.f123010a == null) {
            if (hVar != null) {
                hVar.mo89462a(new C48649d((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        this.f123010a.mo96307a(list, map, hVar);
    }

    /* renamed from: b */
    public final void mo96691b(String str, boolean z, String str2, int i, int i2, C48707l lVar) {
        if (this.f123015f == null || this.f123016g == null) {
            if (lVar != null) {
                lVar.mo59192a(new C48649d((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        this.f123016g.mo96295a(str, z, str2, i, i2, true, lVar);
    }

    /* renamed from: b */
    public final void mo96690b(String str, String str2, int i, int i2, int i3, String str3, C48701f fVar) {
        if (this.f123015f == null || this.f123016g == null) {
            fVar.mo59186a(new C48649d((Exception) new IllegalStateException("请先初始化")));
            return;
        }
        this.f123016g.mo96291a(str, str2, i, i2, i3, str3, true, fVar);
    }

    /* renamed from: a */
    public final void mo96671a(String str, String str2, int i, int i2, int i3, String str3, C48701f fVar) {
        C48701f fVar2 = fVar;
        if (this.f123015f == null || this.f123016g == null) {
            if (fVar2 != null) {
                fVar2.mo59186a(new C48649d((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        this.f123016g.mo96291a(str, str2, i, i2, i3, str3, false, fVar);
    }
}
