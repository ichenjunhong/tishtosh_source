package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.music.C37372e;
import com.p683ss.android.ugc.aweme.music.service.C37435b;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48699d;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48704i;
import com.p683ss.android.ugc.p2425e.C48545a;
import java.util.List;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p064c.p065a.p094l.C2189f;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.ui.q */
final /* synthetic */ class C37631q {

    /* renamed from: com.ss.android.ugc.aweme.music.ui.q$a */
    static final class C37632a<T> implements C2205y<C37643s> {

        /* renamed from: a */
        final /* synthetic */ String f95963a;

        /* renamed from: b */
        final /* synthetic */ Effect f95964b;

        /* renamed from: c */
        final /* synthetic */ Context f95965c;

        /* renamed from: d */
        final /* synthetic */ C2189f f95966d;

        C37632a(String str, Effect effect, Context context, C2189f fVar) {
            this.f95963a = str;
            this.f95964b = effect;
            this.f95965c = context;
            this.f95966d = fVar;
        }

        public final void subscribe(final C2204x<C37643s> xVar) {
            C52711k.m112240b(xVar, "emitter");
            final C376331 r0 = new C52671b<Effect, C52860x>() {
                public final /* synthetic */ Object invoke(Object obj) {
                    mo77140a((Effect) obj);
                    return C52860x.f131107a;
                }

                /* renamed from: a */
                public final void mo77140a(Effect effect) {
                    C2204x xVar = xVar;
                    C37643s sVar = new C37643s(null, null, null, null, effect, Integer.valueOf(100), null, 79, null);
                    xVar.mo6282a(sVar);
                    xVar.mo6273a();
                }
            };
            final C376342 r1 = new C52682m<Effect, C48649d, C52860x>() {
                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    mo77141a((Effect) obj, (C48649d) obj2);
                    return C52860x.f131107a;
                }

                /* renamed from: a */
                public final void mo77141a(Effect effect, C48649d dVar) {
                    C52711k.m112240b(dVar, "error");
                    C2204x xVar = xVar;
                    C37643s sVar = new C37643s(null, null, null, null, effect, Integer.valueOf(-103), dVar, 15, null);
                    xVar.mo6282a(sVar);
                    xVar.mo6273a();
                }
            };
            if (TextUtils.isEmpty(this.f95963a)) {
                r1.mo77141a(this.f95964b, new C48649d(-1));
                return;
            }
            final IAVEffectService effectService = AVExternalServiceImpl.getAVServiceImpl_Monster().abilityService().effectService();
            final C376353 r2 = new C52671b<Effect, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C37632a f95969a;

                {
                    this.f95969a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    mo77142a((Effect) obj);
                    return C52860x.f131107a;
                }

                /* renamed from: a */
                public final void mo77142a(final Effect effect) {
                    effectService.buildEffectPlatform(this.f95969a.f95965c, new IAVEffectReadyCallback<C29252f>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C376353 f95973a;

                        /* renamed from: com.ss.android.ugc.aweme.music.ui.q$a$3$1$a */
                        public static final class C37637a implements C48699d {

                            /* renamed from: a */
                            final /* synthetic */ C376361 f95975a;

                            C37637a(C376361 r1) {
                                this.f95975a = r1;
                            }

                            /* renamed from: a */
                            public final void mo8643a(Effect effect) {
                                C52711k.m112240b(effect, "effect");
                                C2189f fVar = this.f95975a.f95973a.f95969a.f95966d;
                                C37642r rVar = new C37642r(-101, -102, effect, 0, 8, null);
                                fVar.onNext(rVar);
                            }

                            /* renamed from: a */
                            public final /* synthetic */ void mo8638a(Object obj) {
                                Effect effect = (Effect) obj;
                                C52711k.m112240b(effect, "effect");
                                r0.mo77140a(effect);
                            }

                            /* renamed from: a */
                            public final void mo8644a(Effect effect, C48649d dVar) {
                                C52711k.m112240b(dVar, "e");
                                r1.mo77141a(effect, dVar);
                            }

                            /* renamed from: a */
                            public final void mo59191a(Effect effect, int i, long j) {
                                C52711k.m112240b(effect, "effect");
                                C2189f fVar = this.f95975a.f95973a.f95969a.f95966d;
                                C37642r rVar = new C37642r(-101, i, effect, j);
                                fVar.onNext(rVar);
                            }
                        }

                        public final /* synthetic */ void finish(Object obj) {
                            C29252f fVar = (C29252f) obj;
                            if (fVar == null) {
                                return;
                            }
                            if (fVar.mo59142a(effect)) {
                                r0.mo77140a(effect);
                                return;
                            }
                            C48699d aVar = new C37637a(this);
                            IAVEffectService iAVEffectService = effectService;
                            String str = this.f95973a.f95969a.f95963a;
                            if (str == null) {
                                C52711k.m112234a();
                            }
                            iAVEffectService.fetchEffectResource(str, true, null, null, fVar, aVar);
                        }

                        {
                            this.f95973a = r1;
                        }
                    }, null);
                }
            };
            if (this.f95964b == null) {
                effectService.buildEffectPlatform(this.f95965c, new IAVEffectReadyCallback<C29252f>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C37632a f95976a;

                    /* renamed from: com.ss.android.ugc.aweme.music.ui.q$a$4$a */
                    public static final class C37639a implements C48704i {

                        /* renamed from: a */
                        final /* synthetic */ C376384 f95978a;

                        C37639a(C376384 r1) {
                            this.f95978a = r1;
                        }

                        /* renamed from: a */
                        public final void mo77143a(C48649d dVar) {
                            r2.mo77142a(null);
                        }

                        /* renamed from: a */
                        public final /* synthetic */ void mo8638a(Object obj) {
                            Effect effect;
                            List list = (List) obj;
                            C376353 r0 = r2;
                            if (list != null) {
                                effect = (Effect) list.get(0);
                            } else {
                                effect = null;
                            }
                            r0.mo77142a(effect);
                        }
                    }

                    public final /* synthetic */ void finish(Object obj) {
                        C29252f fVar = (C29252f) obj;
                        if (fVar != null) {
                            fVar.mo59141a(C52575l.m112092a(this.f95976a.f95963a), null, false, (C48704i) new C37639a(this));
                        }
                    }

                    {
                        this.f95976a = r1;
                    }
                }, null);
            } else {
                r2.mo77142a(this.f95964b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.q$b */
    static final class C37640b<T> implements C2205y<T> {

        /* renamed from: a */
        final /* synthetic */ MusicModel f95979a;

        /* renamed from: b */
        final /* synthetic */ C37372e f95980b;

        /* renamed from: c */
        final /* synthetic */ C2189f f95981c;

        C37640b(MusicModel musicModel, C37372e eVar, C2189f fVar) {
            this.f95979a = musicModel;
            this.f95980b = eVar;
            this.f95981c = fVar;
        }

        public final void subscribe(C2204x<C37643s> xVar) {
            final C2204x<C37643s> xVar2 = xVar;
            C52711k.m112240b(xVar2, "emitter");
            if (this.f95979a == null) {
                C37643s sVar = new C37643s(null, null, Integer.valueOf(-103), null, null, null, null, 123, null);
                xVar2.mo6282a(sVar);
                xVar.mo6273a();
                return;
            }
            if (!this.f95980b.mo76656a(this.f95979a, new C37435b(this) {

                /* renamed from: a */
                final /* synthetic */ C37640b f95982a;

                /* renamed from: a */
                public final void mo55350a() {
                }

                /* renamed from: b */
                public final void mo55354b() {
                    C2189f fVar = this.f95982a.f95981c;
                    C37642r rVar = new C37642r(-100, -102, null, 0, 12, null);
                    fVar.onNext(rVar);
                }

                /* renamed from: a */
                public final void mo55351a(int i) {
                    C2189f fVar = this.f95982a.f95981c;
                    C37642r rVar = new C37642r(-100, i, null, 0, 12, null);
                    fVar.onNext(rVar);
                }

                /* renamed from: a */
                public final void mo55352a(C48545a aVar) {
                    C52711k.m112240b(aVar, "error");
                    C2204x xVar = xVar2;
                    C37643s sVar = new C37643s(null, null, Integer.valueOf(-103), aVar, null, null, null, 115, null);
                    xVar.mo6282a(sVar);
                    xVar2.mo6273a();
                }

                {
                    this.f95982a = r1;
                }

                /* renamed from: a */
                public final void mo55353a(String str, MusicWaveBean musicWaveBean) {
                    C52711k.m112240b(str, "musicFile");
                    C2204x xVar = xVar2;
                    C37643s sVar = new C37643s(str, musicWaveBean, Integer.valueOf(100), null, null, null, null, 120, null);
                    xVar.mo6282a(sVar);
                    xVar2.mo6273a();
                }
            }, -1, true)) {
                C37643s sVar2 = new C37643s(null, null, Integer.valueOf(-103), new C48545a(-1, "don`t start download music"), null, null, null, 115, null);
                xVar2.mo6282a(sVar2);
                xVar.mo6273a();
            }
        }
    }
}
