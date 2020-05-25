package com.p683ss.android.ugc.aweme.qrcode.p2105c;

import android.app.Activity;
import android.content.Intent;
import android.os.Vibrator;
import com.p683ss.android.ugc.aweme.common.C26874f;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.net.C37809s;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.qrcode.p2104b.C40948g;
import com.p683ss.android.ugc.aweme.qrcode.p2105c.C40997p.C40998a;
import com.p683ss.android.ugc.aweme.qrcode.p2105c.C40997p.C40999b;
import com.p683ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback;
import com.p683ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48702g;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0011g;
import p001a.C0013i;
import p001a.C0027j;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.qrcode.c.a */
public final class C40955a implements C40999b {

    /* renamed from: j */
    public static final C40956a f104178j = new C40956a(null);

    /* renamed from: a */
    public Effect f104179a;

    /* renamed from: b */
    public List<? extends Effect> f104180b;

    /* renamed from: c */
    public Effect f104181c;

    /* renamed from: d */
    public HashMap<String, Effect> f104182d;

    /* renamed from: e */
    public int f104183e;

    /* renamed from: f */
    public IQRCodeScanner f104184f;

    /* renamed from: g */
    public final C40948g f104185g = new C40948g();

    /* renamed from: h */
    public final Activity f104186h;

    /* renamed from: i */
    public C40998a f104187i;

    /* renamed from: k */
    private C29252f f104188k;

    /* renamed from: com.ss.android.ugc.aweme.qrcode.c.a$a */
    public static final class C40956a {
        private C40956a() {
        }

        public /* synthetic */ C40956a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qrcode.c.a$b */
    static final class C40957b<V> implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ C40955a f104189a;

        C40957b(C40955a aVar) {
            this.f104189a = aVar;
        }

        public final /* synthetic */ Object call() {
            C40998a aVar = this.f104189a.f104187i;
            if (aVar != null) {
                aVar.mo83496f();
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qrcode.c.a$c */
    static final class C40958c<TTaskResult, TContinuationResult> implements C0011g<Void, Void> {

        /* renamed from: a */
        final /* synthetic */ C40955a f104190a;

        /* renamed from: b */
        final /* synthetic */ Effect f104191b;

        /* renamed from: c */
        final /* synthetic */ C0027j f104192c;

        C40958c(C40955a aVar, Effect effect, C0027j jVar) {
            this.f104190a = aVar;
            this.f104191b = effect;
            this.f104192c = jVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C29252f d = this.f104190a.mo83459d();
            if (d == null) {
                C52711k.m112234a();
            }
            d.mo59123a(this.f104191b, (C48705j) new C48705j(this) {

                /* renamed from: a */
                final /* synthetic */ C40958c f104193a;

                /* renamed from: a */
                public final void mo8643a(Effect effect) {
                    C52711k.m112240b(effect, "effect");
                }

                {
                    this.f104193a = r1;
                }

                /* renamed from: a */
                public final /* synthetic */ void mo8638a(Object obj) {
                    Effect effect = (Effect) obj;
                    C52711k.m112240b(effect, "effect");
                    if (effect != this.f104193a.f104190a.f104179a) {
                        this.f104193a.f104192c.mo45b();
                    } else if (this.f104193a.f104190a.f104184f == null) {
                        this.f104193a.f104192c.mo46b(new Exception());
                    } else {
                        IQRCodeScanner iQRCodeScanner = this.f104193a.f104190a.f104184f;
                        if (iQRCodeScanner == null) {
                            C52711k.m112234a();
                        }
                        String unzipPath = effect.getUnzipPath();
                        C52711k.m112236a((Object) unzipPath, "effect.unzipPath");
                        String effectId = effect.getEffectId();
                        C52711k.m112236a((Object) effectId, "effect.effectId");
                        iQRCodeScanner.switchEffectWithTag(unzipPath, Integer.parseInt(effectId), this.f104193a.f104190a.f104183e, "");
                        this.f104193a.f104192c.mo47b(null);
                    }
                }

                /* renamed from: a */
                public final void mo8644a(Effect effect, C48649d dVar) {
                    C52711k.m112240b(dVar, "e");
                    this.f104193a.f104192c.mo46b(dVar.f122281c);
                }
            });
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qrcode.c.a$d */
    static final class C40960d<TTaskResult, TContinuationResult> implements C0011g<Void, Void> {

        /* renamed from: a */
        final /* synthetic */ C40955a f104194a;

        C40960d(C40955a aVar) {
            this.f104194a = aVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C40998a aVar = this.f104194a.f104187i;
            if (aVar != null) {
                aVar.mo83498g();
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qrcode.c.a$e */
    public static final class C40961e implements C48702g {

        /* renamed from: a */
        final /* synthetic */ C40955a f104195a;

        /* renamed from: b */
        final /* synthetic */ C0027j f104196b;

        /* renamed from: com.ss.android.ugc.aweme.qrcode.c.a$e$a */
        public static final class C40962a implements C48705j {

            /* renamed from: a */
            final /* synthetic */ C40961e f104197a;

            /* renamed from: a */
            public final void mo8643a(Effect effect) {
                C52711k.m112240b(effect, "effect");
            }

            C40962a(C40961e eVar) {
                this.f104197a = eVar;
            }

            /* renamed from: a */
            public final /* synthetic */ void mo8638a(Object obj) {
                Effect effect = (Effect) obj;
                C52711k.m112240b(effect, "effect");
                IQRCodeScanner iQRCodeScanner = this.f104197a.f104195a.f104184f;
                if (iQRCodeScanner != null) {
                    String unzipPath = effect.getUnzipPath();
                    C52711k.m112236a((Object) unzipPath, "effect.unzipPath");
                    String effectId = effect.getEffectId();
                    C52711k.m112236a((Object) effectId, "effect.effectId");
                    iQRCodeScanner.switchEffectWithTag(unzipPath, Integer.parseInt(effectId), this.f104197a.f104195a.f104183e, "");
                }
                this.f104197a.f104196b.mo47b(null);
            }

            /* renamed from: a */
            public final void mo8644a(Effect effect, C48649d dVar) {
                C52711k.m112240b(dVar, "e");
                this.f104197a.f104196b.mo46b(dVar.f122281c);
            }
        }

        /* renamed from: a */
        public final void mo8637a(C48649d dVar) {
            C52711k.m112240b(dVar, "e");
            this.f104196b.mo46b(dVar.f122281c);
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
            C52711k.m112240b(effectChannelResponse, "response");
            this.f104195a.f104180b = effectChannelResponse.getAllCategoryEffects();
            C40955a aVar = this.f104195a;
            List<? extends Effect> list = this.f104195a.f104180b;
            if (list != null && !list.isEmpty()) {
                if (aVar.f104182d == null) {
                    aVar.f104182d = new HashMap<>();
                } else {
                    HashMap<String, Effect> hashMap = aVar.f104182d;
                    if (hashMap == null) {
                        C52711k.m112234a();
                    }
                    hashMap.clear();
                }
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (i == 0) {
                        aVar.f104181c = (Effect) list.get(i);
                    }
                    HashMap<String, Effect> hashMap2 = aVar.f104182d;
                    if (hashMap2 == null) {
                        C52711k.m112234a();
                    }
                    Map map = hashMap2;
                    String effectId = ((Effect) list.get(i)).getEffectId();
                    C52711k.m112236a((Object) effectId, "effectList[i].effectId");
                    map.put(effectId, list.get(i));
                }
            }
            C29252f d = this.f104195a.mo83459d();
            if (d != null) {
                d.mo59123a(this.f104195a.f104181c, (C48705j) new C40962a(this));
            }
        }

        C40961e(C40955a aVar, C0027j jVar) {
            this.f104195a = aVar;
            this.f104196b = jVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qrcode.c.a$f */
    static final class C40963f<TTaskResult, TContinuationResult> implements C0011g<Void, Void> {

        /* renamed from: a */
        final /* synthetic */ C40955a f104198a;

        /* renamed from: b */
        final /* synthetic */ C52671b f104199b;

        C40963f(C40955a aVar, C52671b bVar) {
            this.f104198a = aVar;
            this.f104199b = bVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C40998a aVar = this.f104198a.f104187i;
            if (aVar != null) {
                aVar.mo83498g();
            }
            C52671b bVar = this.f104199b;
            C52711k.m112236a((Object) iVar, "task");
            bVar.invoke(Boolean.valueOf(iVar.mo33d()));
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qrcode.c.a$g */
    public static final class C40964g implements IAVEffectReadyCallback<C29252f> {

        /* renamed from: a */
        final /* synthetic */ C0027j f104200a;

        C40964g(C0027j jVar) {
            this.f104200a = jVar;
        }

        public final /* synthetic */ void finish(Object obj) {
            this.f104200a.mo44a((C29252f) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qrcode.c.a$h */
    static final class C40965h extends C52712l implements C52671b<EffectPlatformBuilder, C52860x> {

        /* renamed from: a */
        public static final C40965h f104201a = new C40965h();

        C40965h() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EffectPlatformBuilder effectPlatformBuilder = (EffectPlatformBuilder) obj;
            C52711k.m112240b(effectPlatformBuilder, "$receiver");
            effectPlatformBuilder.setRegion(C35837h.m80980e());
            C37809s a = C37809s.m84409a();
            C52711k.m112236a((Object) a, "OkHttpManager.getSingleton()");
            effectPlatformBuilder.setOkHttpClient(a.mo77268b());
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qrcode.c.a$i */
    static final class C40966i<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C40955a f104202a;

        /* renamed from: b */
        final /* synthetic */ String f104203b;

        C40966i(C40955a aVar, String str) {
            this.f104202a = aVar;
            this.f104203b = str;
        }

        public final /* synthetic */ Object call() {
            C40998a aVar = this.f104202a.f104187i;
            if (aVar != null) {
                aVar.mo83496f();
            }
            this.f104202a.f104185g.addNotifyListener(new C26874f(this) {

                /* renamed from: a */
                final /* synthetic */ C40966i f104204a;

                /* JADX WARNING: Removed duplicated region for block: B:54:0x0103  */
                /* JADX WARNING: Removed duplicated region for block: B:55:0x010a  */
                /* renamed from: b */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void mo44838b() {
                    /*
                        r6 = this;
                        com.ss.android.ugc.aweme.qrcode.c.a$i r0 = r6.f104204a
                        com.ss.android.ugc.aweme.qrcode.c.a r0 = r0.f104202a
                        com.ss.android.ugc.aweme.qrcode.c.p$a r0 = r0.f104187i
                        if (r0 == 0) goto L_0x000b
                        r0.mo83498g()
                    L_0x000b:
                        java.util.HashMap r0 = new java.util.HashMap
                        r0.<init>()
                        com.ss.android.ugc.aweme.qrcode.c.a$i r1 = r6.f104204a
                        com.ss.android.ugc.aweme.qrcode.c.a r1 = r1.f104202a
                        com.ss.android.ugc.aweme.qrcode.b.g r1 = r1.f104185g
                        T r1 = r1.mData
                        if (r1 == 0) goto L_0x00e1
                        com.ss.android.ugc.aweme.qrcode.c.a$i r1 = r6.f104204a
                        com.ss.android.ugc.aweme.qrcode.c.a r1 = r1.f104202a
                        com.ss.android.ugc.aweme.qrcode.b.g r1 = r1.f104185g
                        T r1 = r1.mData
                        com.ss.android.ugc.aweme.qrcode.b.h r1 = (com.p683ss.android.ugc.aweme.qrcode.p2104b.C40950h) r1
                        if (r1 != 0) goto L_0x0029
                        p2628d.p2639f.p2641b.C52711k.m112234a()
                    L_0x0029:
                        com.ss.android.ugc.aweme.commercialize.model.q r1 = r1.getEasterEgg()
                        if (r1 == 0) goto L_0x00e1
                        com.ss.android.ugc.aweme.qrcode.c.a$i r1 = r6.f104204a
                        com.ss.android.ugc.aweme.qrcode.c.a r1 = r1.f104202a
                        com.ss.android.ugc.aweme.qrcode.b.g r1 = r1.f104185g
                        T r1 = r1.mData
                        com.ss.android.ugc.aweme.qrcode.b.h r1 = (com.p683ss.android.ugc.aweme.qrcode.p2104b.C40950h) r1
                        if (r1 != 0) goto L_0x003e
                        p2628d.p2639f.p2641b.C52711k.m112234a()
                    L_0x003e:
                        int r1 = r1.status_code
                        if (r1 != 0) goto L_0x00e1
                        com.ss.android.ugc.aweme.qrcode.c.a$i r1 = r6.f104204a
                        com.ss.android.ugc.aweme.qrcode.c.a r1 = r1.f104202a
                        com.ss.android.ugc.aweme.qrcode.c.a$i r2 = r6.f104204a
                        com.ss.android.ugc.aweme.qrcode.c.a r2 = r2.f104202a
                        com.ss.android.ugc.aweme.qrcode.b.g r2 = r2.f104185g
                        T r2 = r2.mData
                        com.ss.android.ugc.aweme.qrcode.b.h r2 = (com.p683ss.android.ugc.aweme.qrcode.p2104b.C40950h) r2
                        if (r2 != 0) goto L_0x0055
                        p2628d.p2639f.p2641b.C52711k.m112234a()
                    L_0x0055:
                        com.ss.android.ugc.aweme.commercialize.model.q r2 = r2.getEasterEgg()
                        if (r2 != 0) goto L_0x005e
                        p2628d.p2639f.p2641b.C52711k.m112234a()
                    L_0x005e:
                        boolean r3 = r2.isH5()
                        if (r3 == 0) goto L_0x0091
                        android.app.Activity r3 = r1.f104186h
                        android.content.Context r3 = (android.content.Context) r3
                        java.lang.String r4 = r2.getOpenUrl()
                        r5 = 0
                        boolean r3 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64226a(r3, r4, r5)
                        if (r3 != 0) goto L_0x0082
                        android.app.Activity r3 = r1.f104186h
                        android.content.Context r3 = (android.content.Context) r3
                        java.lang.String r4 = r2.getWebUrl()
                        java.lang.String r2 = r2.getWebTitle()
                        com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64222a(r3, r4, r2)
                    L_0x0082:
                        com.ss.android.ugc.aweme.qrcode.c.p$a r2 = r1.f104187i
                        if (r2 == 0) goto L_0x0089
                        r2.mo83493c()
                    L_0x0089:
                        com.ss.android.ugc.aweme.qrcode.c.p$a r1 = r1.f104187i
                        if (r1 == 0) goto L_0x00b5
                        r1.finish()
                        goto L_0x00b5
                    L_0x0091:
                        com.ss.android.ugc.aweme.commercialize.g r3 = new com.ss.android.ugc.aweme.commercialize.g
                        r3.<init>()
                        r3.setEasterEggInfo(r2)
                        java.lang.String r2 = "qr_code_scan"
                        r3.setEnterFrom(r2)
                        android.app.Activity r2 = r1.f104186h
                        android.content.Context r2 = (android.content.Context) r2
                        r4 = 101(0x65, float:1.42E-43)
                        com.p683ss.android.ugc.aweme.commercialize.utils.C26386al.m63838a(r2, r3, r4)
                        com.ss.android.ugc.aweme.qrcode.c.p$a r2 = r1.f104187i
                        if (r2 == 0) goto L_0x00ae
                        r2.mo83493c()
                    L_0x00ae:
                        com.ss.android.ugc.aweme.qrcode.c.p$a r1 = r1.f104187i
                        if (r1 == 0) goto L_0x00b5
                        r1.mo83495e()
                    L_0x00b5:
                        r1 = r0
                        java.util.Map r1 = (java.util.Map) r1
                        java.lang.String r2 = "next_page"
                        com.ss.android.ugc.aweme.qrcode.c.a$i r3 = r6.f104204a
                        com.ss.android.ugc.aweme.qrcode.c.a r3 = r3.f104202a
                        com.ss.android.ugc.aweme.qrcode.b.g r3 = r3.f104185g
                        T r3 = r3.mData
                        com.ss.android.ugc.aweme.qrcode.b.h r3 = (com.p683ss.android.ugc.aweme.qrcode.p2104b.C40950h) r3
                        if (r3 != 0) goto L_0x00c9
                        p2628d.p2639f.p2641b.C52711k.m112234a()
                    L_0x00c9:
                        com.ss.android.ugc.aweme.commercialize.model.q r3 = r3.getEasterEgg()
                        if (r3 != 0) goto L_0x00d2
                        p2628d.p2639f.p2641b.C52711k.m112234a()
                    L_0x00d2:
                        boolean r3 = r3.isH5()
                        if (r3 == 0) goto L_0x00db
                        java.lang.String r3 = "direct"
                        goto L_0x00dd
                    L_0x00db:
                        java.lang.String r3 = "egg_ad"
                    L_0x00dd:
                        r1.put(r2, r3)
                        goto L_0x00ec
                    L_0x00e1:
                        com.ss.android.ugc.aweme.qrcode.c.a$i r1 = r6.f104204a
                        com.ss.android.ugc.aweme.qrcode.c.a r1 = r1.f104202a
                        com.ss.android.ugc.aweme.qrcode.c.p$a r1 = r1.f104187i
                        if (r1 == 0) goto L_0x00ec
                        r1.bI_()
                    L_0x00ec:
                        java.util.Map r0 = (java.util.Map) r0
                        java.lang.String r1 = "enter_from"
                        java.lang.String r2 = "qr_code_scan"
                        r0.put(r1, r2)
                        java.lang.String r1 = "fail_code"
                        com.ss.android.ugc.aweme.qrcode.c.a$i r2 = r6.f104204a
                        com.ss.android.ugc.aweme.qrcode.c.a r2 = r2.f104202a
                        com.ss.android.ugc.aweme.qrcode.b.g r2 = r2.f104185g
                        T r2 = r2.mData
                        com.ss.android.ugc.aweme.qrcode.b.h r2 = (com.p683ss.android.ugc.aweme.qrcode.p2104b.C40950h) r2
                        if (r2 == 0) goto L_0x010a
                        int r2 = r2.status_code
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                        goto L_0x010b
                    L_0x010a:
                        r2 = 0
                    L_0x010b:
                        java.lang.String r2 = java.lang.String.valueOf(r2)
                        r0.put(r1, r2)
                        java.lang.String r1 = "recognation_status"
                        com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r1, r0)
                        com.ss.android.ugc.aweme.qrcode.c.a$i r0 = r6.f104204a
                        com.ss.android.ugc.aweme.qrcode.c.a r0 = r0.f104202a
                        com.ss.android.ugc.aweme.qrcode.b.g r0 = r0.f104185g
                        r1 = r6
                        com.ss.android.ugc.aweme.common.f r1 = (com.p683ss.android.ugc.aweme.common.C26874f) r1
                        r0.clearNotifyListener(r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.qrcode.p2105c.C40955a.C40966i.C409671.mo44838b():void");
                }

                {
                    this.f104204a = r1;
                }

                /* renamed from: c_ */
                public final void mo44840c_(Exception exc) {
                    C40998a aVar = this.f104204a.f104202a.f104187i;
                    if (aVar != null) {
                        aVar.mo83498g();
                    }
                    C40998a aVar2 = this.f104204a.f104202a.f104187i;
                    if (aVar2 != null) {
                        aVar2.bI_();
                    }
                    this.f104204a.f104202a.f104185g.clearNotifyListener(this);
                }
            });
            this.f104202a.f104185g.mo83436a(this.f104203b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final long mo83450a() {
        return 0;
    }

    /* renamed from: a */
    public final void mo83455a(boolean z, int i, int i2) {
    }

    /* renamed from: b */
    public final void mo83457b() {
        this.f104187i = null;
    }

    /* renamed from: c */
    public final void mo83458c() {
        C40998a aVar = this.f104187i;
        if (aVar != null) {
            aVar.mo83491a(true);
        }
    }

    /* renamed from: d */
    public final C29252f mo83459d() {
        if (this.f104188k == null) {
            C0027j jVar = new C0027j();
            AVExternalServiceImpl.getAVServiceImpl_Monster().abilityService().effectService().buildEffectPlatform(this.f104186h, new C40964g(jVar), C40965h.f104201a);
            C0013i<TResult> iVar = jVar.f77a;
            iVar.mo36g();
            C52711k.m112236a((Object) iVar, "task");
            this.f104188k = (C29252f) iVar.mo34e();
        }
        return this.f104188k;
    }

    /* renamed from: a */
    public final void mo83452a(IQRCodeScanner iQRCodeScanner) {
        C52711k.m112240b(iQRCodeScanner, "codeScanner");
        this.f104184f = iQRCodeScanner;
    }

    /* renamed from: a */
    public final void mo83453a(Effect effect) {
        if (effect != null && effect != this.f104179a) {
            this.f104179a = effect;
            C0027j jVar = new C0027j();
            C0013i.m18a((Callable<TResult>) new C40957b<TResult>(this), C0013i.f25b).mo20a((C0011g<TResult, TContinuationResult>) new C40958c<TResult,TContinuationResult>(this, effect, jVar), (Executor) C0013i.f24a);
            jVar.f77a.mo20a((C0011g<TResult, TContinuationResult>) new C40960d<TResult,TContinuationResult>(this), C0013i.f25b);
        }
    }

    /* renamed from: a */
    public final void mo83454a(C52671b<? super Boolean, C52860x> bVar) {
        C52711k.m112240b(bVar, "callback");
        Map hashMap = new HashMap();
        hashMap.put("enter_from", "qr_code_scan");
        C26890h.m65011a("click_variable_entrance", hashMap);
        C0027j jVar = new C0027j();
        C40998a aVar = this.f104187i;
        if (aVar != null) {
            aVar.mo83496f();
        }
        C29252f d = mo83459d();
        if (d != null) {
            d.mo59138a("arscan", false, (C48702g) new C40961e(this, jVar));
        }
        jVar.f77a.mo20a((C0011g<TResult, TContinuationResult>) new C40963f<TResult,TContinuationResult>(this, bVar), C0013i.f25b);
    }

    public C40955a(Activity activity, C40998a aVar) {
        C52711k.m112240b(activity, "activity");
        this.f104186h = activity;
        this.f104187i = aVar;
    }

    /* renamed from: a */
    public final void mo83451a(int i, int i2, Intent intent) {
        if (i == 101) {
            if (i2 != 1002) {
                C40998a aVar = this.f104187i;
                if (aVar != null) {
                    aVar.finish();
                }
            } else {
                C40998a aVar2 = this.f104187i;
                if (aVar2 != null) {
                    aVar2.bI_();
                }
                C40998a aVar3 = this.f104187i;
                if (aVar3 != null) {
                    aVar3.mo83494d();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo83456a(boolean z, int i, String str, int i2) {
        C52711k.m112240b(str, "result");
        C0013i.m18a((Callable<TResult>) new C40966i<TResult>(this, str), C0013i.f25b);
        Vibrator vibrator = (Vibrator) this.f104186h.getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200);
        }
    }
}
