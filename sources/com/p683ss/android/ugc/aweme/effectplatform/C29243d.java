package com.p683ss.android.ugc.aweme.effectplatform;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.services.IFoundationAVService;
import com.p683ss.android.ugc.effectmanager.C48580c;
import com.p683ss.android.ugc.effectmanager.C48893h;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
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
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a.C48766a;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;
import com.p683ss.android.ugc.tools.utils.C50203g;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.d */
public final class C29243d {

    /* renamed from: a */
    boolean f76576a;

    /* renamed from: b */
    public C48893h f76577b;

    /* renamed from: a */
    public final void mo59175a(String str, boolean z, C48702g gVar) {
        C29271t a = C29271t.m68981a(str, gVar);
        if (!this.f76576a) {
            a.mo8637a(m68871a());
        } else {
            this.f76577b.mo96681a(str, z, (C48702g) a);
        }
    }

    /* renamed from: a */
    public final void mo59176a(String str, boolean z, String str2, int i, int i2, C48707l lVar) {
        if (!this.f76576a) {
            lVar.mo59192a(m68871a());
        } else {
            this.f76577b.mo96691b(str, z, str2, i, i2, lVar);
        }
    }

    /* renamed from: a */
    public final void mo59165a(String str, String str2, int i, int i2, int i3, String str3, C48701f fVar) {
        String str4 = str;
        C48701f fVar2 = fVar;
        if (!this.f76576a) {
            fVar2.mo59186a(m68871a());
            return;
        }
        final int i4 = i;
        final int i5 = i2;
        final C29269s a = C29269s.m68977a(str, i, i5, fVar2);
        final String str5 = str;
        final String str6 = str2;
        final int i6 = i3;
        final String str7 = str3;
        C292452 r0 = new C48696a() {
            /* renamed from: a */
            public final void mo8639a(C48649d dVar) {
                C29243d.this.mo59166a(str5, str6, i4, i5, i6, str7, true, (C48701f) a);
            }

            /* renamed from: a */
            public final void mo8640a(boolean z) {
                if (z) {
                    C29243d.this.mo59166a(str5, str6, i4, i5, i6, str7, false, (C48701f) a);
                    return;
                }
                C29243d.this.mo59166a(str5, str6, i4, i5, i6, str7, true, (C48701f) a);
            }
        };
        String str8 = str2;
        m68875a(str, str2, (C48696a) r0);
    }

    /* renamed from: a */
    public final void mo59174a(String str, boolean z, int i, int i2, C48708m mVar) {
        if (!this.f76576a) {
            mVar.mo73920a(m68871a());
        } else {
            this.f76577b.mo96680a(str, z, i, i2, mVar);
        }
    }

    /* renamed from: a */
    public final void mo59171a(String str, String str2, boolean z, int i, int i2, int i3, String str3, C48701f fVar) {
        C48701f fVar2 = fVar;
        if (!this.f76576a) {
            fVar2.mo59186a(m68871a());
            return;
        }
        mo59166a(str, str2, i, i2, i3, str3, z, (C48701f) C29269s.m68977a(str, i, i2, fVar2));
    }

    /* renamed from: a */
    public final void mo59166a(String str, String str2, int i, int i2, int i3, String str3, boolean z, C48701f fVar) {
        if (!this.f76576a) {
            fVar.mo59186a(m68871a());
            return;
        }
        C48701f fVar2 = fVar;
        if (z) {
            C48893h hVar = this.f76577b;
            final C48701f fVar3 = fVar;
            final String str4 = str;
            final String str5 = str2;
            final int i4 = i;
            final int i5 = i2;
            final int i6 = i3;
            final String str6 = str3;
            C292505 r0 = new C48701f() {
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo8638a(Object obj) {
                    fVar3.mo8638a((CategoryPageModel) obj);
                }

                /* renamed from: a */
                public final void mo59186a(C48649d dVar) {
                    C29243d.this.f76577b.mo96671a(str4, str5, i4, i5, i6, str6, fVar3);
                }
            };
            hVar.mo96690b(str, str2, i, i2, i3, str3, r0);
            return;
        }
        this.f76577b.mo96671a(str, str2, i, i2, i3, str3, fVar);
    }

    /* renamed from: a */
    public final void mo59167a(String str, String str2, int i, int i2, C48708m mVar) {
        if (!this.f76576a) {
            mVar.mo73920a(m68871a());
        } else {
            this.f76577b.mo96673a(str, str2, i, i2, false, mVar);
        }
    }

    /* renamed from: a */
    public final void mo59169a(String str, String str2, C48705j jVar) {
        if (!this.f76576a) {
            jVar.mo8644a(null, m68871a());
        } else {
            this.f76577b.mo96679a(str, m68876b(str2), jVar);
        }
    }

    /* renamed from: a */
    public final void mo59178a(List<String> list, Map<String, String> map, boolean z, C48704i iVar) {
        if (!this.f76576a) {
            iVar.mo77143a(m68871a());
        } else {
            this.f76577b.mo96685a(list, z, map, iVar);
        }
    }

    /* renamed from: a */
    public final void mo59164a(String str, C48709n nVar) {
        if (!this.f76576a) {
            nVar.mo92994a(m68871a());
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id_map", str);
        this.f76577b.mo96686a((Map<String, String>) hashMap, nVar);
    }

    /* renamed from: a */
    public final void mo59177a(List<String> list, Map<String, String> map, C48703h hVar) {
        if (!this.f76576a) {
            hVar.mo89462a(m68871a());
        } else {
            this.f76577b.mo96684a(list, map, hVar);
        }
    }

    /* renamed from: a */
    public final void mo59168a(String str, String str2, int i, int i2, Map<String, String> map, C48714s sVar) {
        if (!this.f76576a) {
            sVar.mo59196a(m68871a());
            return;
        }
        this.f76577b.mo96672a(str, str2, i, i2, map, (C48714s) C29266q.m68970a(str, str2, i, i2, sVar));
    }

    /* renamed from: a */
    public final void mo59170a(String str, String str2, C48715t tVar) {
        if (str != null && str2 != null) {
            if (!this.f76576a) {
                tVar.mo8708a();
            } else {
                this.f76577b.mo96676a(str, str2, tVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo59173a(String str, List<String> list, String str2, C48710o oVar) {
        if (str != null && !C9376b.m18558a((Collection<T>) list)) {
            if (!this.f76576a) {
                oVar.mo8642b();
            } else {
                this.f76577b.mo96675a(str, str2, oVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo59172a(String str, List<String> list, Boolean bool, C48711p pVar) {
        if (!this.f76576a) {
            pVar.mo92558a(m68871a());
        } else {
            this.f76577b.mo96678a(str, list, bool, pVar);
        }
    }

    /* renamed from: a */
    public final void mo59163a(String str, C48706k kVar) {
        if (!this.f76576a) {
            kVar.mo92557a(m68871a());
        } else {
            this.f76577b.mo96670a(str, kVar);
        }
    }

    /* renamed from: a */
    public final boolean mo59179a(Effect effect) {
        if (effect == null || this.f76577b == null) {
            return false;
        }
        return C48580c.m105110b().mo96134a(this.f76577b, effect);
    }

    /* renamed from: d */
    private static Map<String, String> m68878d() {
        return m68879e().effectService().getPoiLastMap();
    }

    /* renamed from: b */
    public final void mo59180b() {
        if (this.f76577b != null) {
            this.f76577b.mo96689b();
            this.f76577b = null;
        }
        this.f76576a = false;
    }

    /* renamed from: c */
    public final void mo59184c() {
        if (this.f76576a) {
            this.f76577b.mo96664a();
        }
    }

    /* renamed from: a */
    static C48649d m68871a() {
        C48649d dVar = new C48649d((Exception) new RuntimeException());
        dVar.f122279a = -1;
        dVar.f122280b = "effect sdk manager init failed";
        return dVar;
    }

    /* renamed from: e */
    private static IFoundationAVService m68879e() {
        Object a = C27991b.m66756a(IFoundationAVService.class);
        if (a != null) {
            return (IFoundationAVService) a;
        }
        return (IFoundationAVService) C20302a.m50070a(IFoundationAVService.class).mo42947a(new C20310d()).mo42946a().mo42948b();
    }

    /* renamed from: a */
    private C48696a m68873a(C48696a aVar) {
        return new C29268r(aVar) {
            /* renamed from: a */
            public final void mo59185a() {
                IFoundationAVService iFoundationAVService;
                Object a = C27991b.m66756a(IFoundationAVService.class);
                if (a != null) {
                    iFoundationAVService = (IFoundationAVService) a;
                } else {
                    iFoundationAVService = (IFoundationAVService) C20302a.m50070a(IFoundationAVService.class).mo42947a(new C20310d()).mo42946a().mo42948b();
                }
                iFoundationAVService.effectService().setPoiLastSP();
            }
        };
    }

    /* renamed from: b */
    private static Map<String, String> m68876b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("scene", str);
        return hashMap;
    }

    /* renamed from: a */
    public final void mo59161a(String str) {
        if (this.f76576a) {
            this.f76577b.mo96667a(str);
        }
    }

    /* renamed from: a */
    private static C48649d m68872a(int i, String str) {
        C48649d dVar = new C48649d((Exception) new RuntimeException());
        dVar.f122279a = -1;
        dVar.f122280b = str;
        return dVar;
    }

    /* renamed from: a */
    private void m68874a(String str, C48696a aVar) {
        if (!this.f76576a) {
            aVar.mo8639a(m68871a());
            return;
        }
        this.f76577b.mo96674a(str, (String) null, 0, m68878d(), m68873a(aVar));
    }

    /* renamed from: b */
    private void m68877b(String str, C48696a aVar) {
        if (!this.f76576a) {
            aVar.mo8639a(m68871a());
            return;
        }
        String str2 = str;
        this.f76577b.mo96674a(str2, (String) null, C48766a.f122482e, m68878d(), m68873a(aVar));
    }

    /* renamed from: a */
    public final void mo59159a(Effect effect, C48705j jVar) {
        if (!this.f76576a) {
            jVar.mo8644a(effect, m68871a());
        } else if (effect == null) {
            jVar.mo8644a(null, m68872a(-1, "effect is null."));
        } else {
            StringBuilder sb = new StringBuilder("fetchEffect ");
            sb.append(effect.getName());
            sb.append(" requirements = ");
            sb.append(effect.getRequirements());
            C50203g.m108358a(sb.toString());
            this.f76577b.mo96665a(effect, jVar);
        }
    }

    /* renamed from: a */
    public final void mo59160a(ProviderEffect providerEffect, C48697b bVar) {
        if (!this.f76576a) {
            bVar.mo73922a(providerEffect, m68871a());
        } else {
            this.f76577b.mo96666a(providerEffect, bVar);
        }
    }

    /* renamed from: a */
    public final void mo59162a(String str, C48702g gVar) {
        if (!this.f76576a) {
            gVar.mo8637a(m68871a());
        } else {
            this.f76577b.mo96669a(str, gVar);
        }
    }

    /* renamed from: a */
    private void m68875a(String str, String str2, C48696a aVar) {
        if (!this.f76576a) {
            aVar.mo8639a(m68871a());
        } else {
            this.f76577b.mo96677a(str, str2, m68878d(), m68873a(aVar));
        }
    }

    /* renamed from: b */
    public final void mo59181b(final String str, final boolean z, final C48702g gVar) {
        if (!this.f76576a) {
            gVar.mo8637a(m68871a());
        } else {
            m68874a(str, (C48696a) new C48696a() {
                /* renamed from: a */
                public final void mo8640a(boolean z) {
                    if (z) {
                        C29243d.this.mo59175a(str, z, gVar);
                    } else {
                        C29243d.this.mo59162a(str, (C48702g) new C48702g() {
                            /* renamed from: a */
                            public final void mo8637a(C48649d dVar) {
                                StringBuilder sb = new StringBuilder("fetchListFromCache fail : ");
                                sb.append(dVar.toString());
                                C39629l.m88232a().mo58567E().mo49428a("EffectPlatform", sb.toString());
                                C29243d.this.mo59175a(str, z, gVar);
                            }

                            /* renamed from: a */
                            public final /* synthetic */ void mo8638a(Object obj) {
                                EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
                                if (effectChannelResponse.getAllCategoryEffects().size() == 0) {
                                    C29243d.this.mo59175a(str, z, gVar);
                                } else {
                                    gVar.mo8638a(effectChannelResponse);
                                }
                            }
                        });
                    }
                }

                /* renamed from: a */
                public final void mo8639a(C48649d dVar) {
                    StringBuilder sb = new StringBuilder("checkChannel fail : ");
                    sb.append(dVar.toString());
                    C39629l.m88232a().mo58567E().mo49428a("EffectPlatform", sb.toString());
                    C29243d.this.mo59162a(str, (C48702g) new C48702g() {
                        /* renamed from: a */
                        public final void mo8637a(C48649d dVar) {
                            StringBuilder sb = new StringBuilder("fetchListFromCache fail : ");
                            sb.append(dVar.toString());
                            C39629l.m88232a().mo58567E().mo49428a("EffectPlatform", sb.toString());
                            C29243d.this.mo59175a(str, z, gVar);
                        }

                        /* renamed from: a */
                        public final /* synthetic */ void mo8638a(Object obj) {
                            EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
                            if (effectChannelResponse.getAllCategoryEffects().size() == 0) {
                                C29243d.this.mo59175a(str, z, gVar);
                            } else {
                                gVar.mo8638a(effectChannelResponse);
                            }
                        }
                    });
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo59183b(List<String> list, Map<String, String> map, C48703h hVar) {
        if (!this.f76576a) {
            hVar.mo89462a(m68871a());
        } else {
            this.f76577b.mo96692b(list, map, hVar);
        }
    }

    /* renamed from: b */
    public final void mo59182b(String str, boolean z, String str2, int i, int i2, C48707l lVar) {
        if (!this.f76576a) {
            lVar.mo59192a(m68871a());
            return;
        }
        final C29274w a = C29274w.m68993a(str, lVar);
        final String str3 = str;
        final boolean z2 = z;
        final String str4 = str2;
        final int i3 = i;
        final int i4 = i2;
        C292441 r0 = new C48696a() {
            /* renamed from: a */
            public final void mo8639a(C48649d dVar) {
                C29243d.this.mo59176a(str3, z2, str4, i3, i4, a);
            }

            /* renamed from: a */
            public final void mo8640a(boolean z) {
                if (z) {
                    C29243d dVar = C29243d.this;
                    String str = str3;
                    boolean z2 = z2;
                    String str2 = str4;
                    int i = i3;
                    int i2 = i4;
                    C48707l lVar = a;
                    if (!dVar.f76576a) {
                        lVar.mo59192a(C29243d.m68871a());
                    } else {
                        dVar.f76577b.mo96682a(str, z2, str2, i, i2, lVar);
                    }
                } else {
                    C29243d.this.mo59176a(str3, z2, str4, i3, i4, a);
                }
            }
        };
        m68877b(str, r0);
    }
}
