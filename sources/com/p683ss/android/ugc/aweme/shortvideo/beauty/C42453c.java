package com.p683ss.android.ugc.aweme.shortvideo.beauty;

import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.als.C2759d;
import com.bytedance.als.C2764h;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p780m.C12356a;
import com.bytedance.p780m.C12361b;
import com.p683ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.beauty.C23777a;
import com.p683ss.android.ugc.aweme.beauty.C23779c;
import com.p683ss.android.ugc.aweme.beauty.C23780d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31501n;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31487c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43872b;
import com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43906h;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44885g;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.tools.beauty.C46814a;
import com.p683ss.android.ugc.aweme.tools.beauty.C46821b;
import com.p683ss.android.ugc.aweme.tools.beauty.p2351c.C46867g;
import com.p683ss.android.ugc.aweme.tools.beauty.service.C46876a;
import com.p683ss.android.ugc.aweme.tools.beauty.service.C46896d;
import com.p683ss.android.ugc.aweme.tools.beauty.service.p2352a.C46881a;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.gamora.recorder.filter.p2470a.C49683a;
import com.p683ss.android.ugc.gamora.recorder.filter.p2472c.C49717b;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.beauty.c */
public final class C42453c extends C2764h<C42451a> implements C12356a, C42451a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f107356a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C42453c.class), "shortVideoContextViewMode", "getShortVideoContextViewMode()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContextViewModel;"))};

    /* renamed from: b */
    public final C42451a f107357b = this;

    /* renamed from: c */
    public final C43872b f107358c;

    /* renamed from: d */
    private boolean f107359d = true;

    /* renamed from: e */
    private C46881a f107360e;

    /* renamed from: f */
    private C46876a f107361f;

    /* renamed from: g */
    private C46896d f107362g;

    /* renamed from: h */
    private final C52668f f107363h = C52732g.m112285a(new C42459f(this));

    /* renamed from: i */
    private final C12361b f107364i;

    /* renamed from: j */
    private final boolean f107365j = false;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.beauty.c$a */
    static final class C42454a extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C42453c f107366a;

        C42454a(C42453c cVar) {
            this.f107366a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(this.f107366a.f107358c.mo89423a(((C45004a) this.f107366a.mo23370j().mo23372a(C45004a.class)).mo91315U()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.beauty.c$b */
    static final class C42455b<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C42453c f107367a;

        C42455b(C42453c cVar) {
            this.f107367a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            this.f107367a.mo86582h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.beauty.c$c */
    static final class C42456c<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C42453c f107368a;

        C42456c(C42453c cVar) {
            this.f107368a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            this.f107368a.mo86582h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.beauty.c$d */
    static final class C42457d<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C42453c f107369a;

        C42457d(C42453c cVar) {
            this.f107369a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null && bool.booleanValue() && !C23780d.m58365a()) {
                this.f107369a.mo86556a(((ShortVideoContext) this.f107369a.mo23370j().mo23372a(ShortVideoContext.class)).f107128u);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.beauty.c$e */
    static final class C42458e<T> implements C0199s<Effect> {

        /* renamed from: a */
        final /* synthetic */ C42453c f107370a;

        C42458e(C42453c cVar) {
            this.f107370a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Effect effect = (Effect) obj;
            if (effect == null || !C46059g.m100077b("FaceMakeupV2", effect)) {
                this.f107370a.mo86575c(false);
            } else {
                this.f107370a.mo86575c(true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.beauty.c$f */
    static final class C42459f extends C52712l implements C52670a<ShortVideoContextViewModel> {

        /* renamed from: a */
        final /* synthetic */ C42453c f107371a;

        C42459f(C42453c cVar) {
            this.f107371a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ShortVideoContextViewModel) C0214z.m440a((FragmentActivity) this.f107371a.mo23370j().mo23372a(FragmentActivity.class)).mo359a(ShortVideoContextViewModel.class);
        }
    }

    /* renamed from: s */
    private final ShortVideoContextViewModel m93252s() {
        return (ShortVideoContextViewModel) this.f107363h.getValue();
    }

    /* renamed from: j */
    public final C12361b mo23370j() {
        return this.f107364i;
    }

    /* renamed from: a */
    public final int[] mo86570a(String str, String str2) {
        C52711k.m112240b(str, "nodePath");
        C52711k.m112240b(str2, "nodeKey");
        C46896d dVar = this.f107362g;
        if (dVar == null) {
            C52711k.m112237a("beautyModule");
        }
        return dVar.mo86570a(str, str2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2759d mo7353a() {
        return this.f107357b;
    }

    public final void bL_() {
        C46876a aVar = this.f107361f;
        if (aVar == null) {
            C52711k.m112237a("beautyManager");
        }
        aVar.mo94157c();
    }

    /* renamed from: d */
    public final C46867g mo86562d() {
        C46876a aVar = this.f107361f;
        if (aVar == null) {
            C52711k.m112237a("beautyManager");
        }
        return aVar.mo94160f();
    }

    /* renamed from: i */
    public final int mo86584i() {
        C46896d dVar = this.f107362g;
        if (dVar == null) {
            C52711k.m112237a("beautyModule");
        }
        return dVar.mo86584i();
    }

    /* renamed from: k */
    public final int mo86585k() {
        C46896d dVar = this.f107362g;
        if (dVar == null) {
            C52711k.m112237a("beautyModule");
        }
        return dVar.mo86585k();
    }

    /* renamed from: l */
    public final int mo86586l() {
        C46896d dVar = this.f107362g;
        if (dVar == null) {
            C52711k.m112237a("beautyModule");
        }
        return dVar.mo86586l();
    }

    /* renamed from: m */
    public final int mo86587m() {
        C46896d dVar = this.f107362g;
        if (dVar == null) {
            C52711k.m112237a("beautyModule");
        }
        return dVar.mo86587m();
    }

    /* renamed from: n */
    public final int mo86588n() {
        C46896d dVar = this.f107362g;
        if (dVar == null) {
            C52711k.m112237a("beautyModule");
        }
        return dVar.mo86588n();
    }

    /* renamed from: o */
    public final int mo86589o() {
        C46896d dVar = this.f107362g;
        if (dVar == null) {
            C52711k.m112237a("beautyModule");
        }
        return dVar.mo86589o();
    }

    /* renamed from: p */
    public final boolean mo86590p() {
        C46896d dVar = this.f107362g;
        if (dVar == null) {
            C52711k.m112237a("beautyModule");
        }
        return dVar.mo86590p();
    }

    /* renamed from: q */
    public final boolean mo86591q() {
        C46896d dVar = this.f107362g;
        if (dVar == null) {
            C52711k.m112237a("beautyModule");
        }
        return dVar.mo86591q();
    }

    /* renamed from: r */
    public final void mo86592r() {
        C46896d dVar = this.f107362g;
        if (dVar == null) {
            C52711k.m112237a("beautyModule");
        }
        dVar.mo86592r();
    }

    /* renamed from: c */
    public final Serializable mo86561c() {
        C46881a aVar = this.f107360e;
        if (aVar == null) {
            C52711k.m112237a("beautyPresenter");
        }
        BeautyMetadata a = aVar.mo94161a();
        C52711k.m112236a((Object) a, "beautyPresenter.beautyMetadata");
        return a;
    }

    /* renamed from: f */
    public final boolean mo86563f() {
        C46876a aVar = this.f107361f;
        if (aVar == null) {
            C52711k.m112237a("beautyManager");
        }
        if (!aVar.mo94155a() || aVar.f118424b.mo94127b() >= 3) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final void mo86582h() {
        ShortVideoContextViewModel s = m93252s();
        C52711k.m112236a((Object) s, "shortVideoContextViewMode");
        LiveData g = s.mo86398g();
        C52711k.m112236a((Object) g, "shortVideoContextViewMode.isNativeInit");
        Boolean bool = (Boolean) g.getValue();
        ShortVideoContextViewModel s2 = m93252s();
        C52711k.m112236a((Object) s2, "shortVideoContextViewMode");
        LiveData h = s2.mo86399h();
        C52711k.m112236a((Object) h, "shortVideoContextViewMode.isInitFilterSwitch");
        Boolean bool2 = (Boolean) h.getValue();
        if (bool != null && bool.booleanValue() && bool2 != null && bool2.booleanValue()) {
            C46881a aVar = this.f107360e;
            if (aVar == null) {
                C52711k.m112237a("beautyPresenter");
            }
            aVar.mo94163a(this, this.f107365j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x016b, code lost:
        if (r1.f96126b == com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a.ERROR) goto L_0x016d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bO_() {
        /*
            r15 = this;
            super.bO_()
            com.bytedance.m.b r0 = r15.mo23370j()
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContext> r1 = com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext.class
            java.lang.Object r0 = r0.mo23372a(r1)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = (com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext) r0
            boolean r3 = r0.f107128u
            com.ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig r0 = new com.ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig
            com.ss.android.ugc.aweme.port.in.u r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.ss.android.ugc.aweme.property.h r1 = r1.mo58583n()
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.StudioBeautyEffectComposerGroup
            com.ss.android.ugc.aweme.property.aa$a r2 = (com.p683ss.android.ugc.aweme.property.C40761aa.C40762a) r2
            int r1 = r1.mo83104b(r2)
            java.lang.String r2 = ""
            boolean r4 = com.p683ss.android.ugc.aweme.beauty.C23780d.m58368d()
            r0.<init>(r1, r2, r4)
            r1 = 1
            r0.setULike2ComposerTagValueConvert(r1)
            java.lang.String r2 = "record"
            com.ss.android.ugc.aweme.tools.beauty.c.f r4 = new com.ss.android.ugc.aweme.tools.beauty.c.f
            java.lang.String r5 = ""
            r4.<init>(r5)
            com.ss.android.ugc.aweme.tools.beauty.service.e r4 = (com.p683ss.android.ugc.aweme.tools.beauty.service.C46897e) r4
            java.lang.String r5 = "key"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r5)
            java.lang.String r5 = "beautyFilterConfig"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r5)
            java.lang.String r5 = "manager"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r5)
            com.ss.android.ugc.aweme.tools.beauty.service.a$a r5 = new com.ss.android.ugc.aweme.tools.beauty.service.a$a
            r5.<init>()
            java.lang.String r6 = "key"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r6)
            r5.f118429b = r2
            java.lang.String r2 = "config"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r2)
            r5.f118430c = r0
            java.lang.String r0 = "manager"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            r5.f118428a = r4
            com.ss.android.ugc.aweme.port.in.u r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.google.gson.f r0 = r0.mo58566D()
            java.lang.String r2 = "gson"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r2)
            r5.f118431d = r0
            com.ss.android.ugc.aweme.tools.beauty.service.e r0 = r5.f118428a
            if (r0 != 0) goto L_0x008f
            com.ss.android.ugc.aweme.tools.beauty.c.f r0 = new com.ss.android.ugc.aweme.tools.beauty.c.f
            java.lang.String r2 = r5.f118429b
            java.lang.String r4 = "record"
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r4)
            if (r2 == 0) goto L_0x0086
            java.lang.String r2 = ""
            goto L_0x0088
        L_0x0086:
            java.lang.String r2 = r5.f118429b
        L_0x0088:
            r0.<init>(r2)
            com.ss.android.ugc.aweme.tools.beauty.service.e r0 = (com.p683ss.android.ugc.aweme.tools.beauty.service.C46897e) r0
            r5.f118428a = r0
        L_0x008f:
            com.ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig r0 = r5.f118430c
            if (r0 == 0) goto L_0x02aa
            com.google.gson.f r0 = r5.f118431d
            if (r0 == 0) goto L_0x029c
            com.ss.android.ugc.aweme.tools.beauty.c.e r0 = new com.ss.android.ugc.aweme.tools.beauty.c.e
            com.ss.android.ugc.aweme.tools.beauty.service.e r2 = r5.f118428a
            if (r2 != 0) goto L_0x00a0
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00a0:
            com.ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig r4 = r5.f118430c
            if (r4 != 0) goto L_0x00a7
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00a7:
            com.google.gson.f r6 = r5.f118431d
            if (r6 != 0) goto L_0x00ae
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00ae:
            com.ss.android.ugc.aweme.tools.beauty.service.a$a$a r7 = new com.ss.android.ugc.aweme.tools.beauty.service.a$a$a
            r7.<init>(r5)
            d.f.a.a r7 = (p2628d.p2639f.p2640a.C52670a) r7
            r0.<init>(r2, r4, r6, r7)
            com.ss.android.ugc.aweme.tools.beauty.service.a r2 = new com.ss.android.ugc.aweme.tools.beauty.service.a
            java.lang.String r4 = r5.f118429b
            com.ss.android.ugc.aweme.tools.beauty.c.g r0 = (com.p683ss.android.ugc.aweme.tools.beauty.p2351c.C46867g) r0
            com.ss.android.ugc.aweme.tools.beauty.service.e r5 = r5.f118428a
            if (r5 != 0) goto L_0x00c5
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00c5:
            r2.<init>(r4, r0, r5)
            r15.f107361f = r2
            com.bytedance.keva.Keva r0 = com.p683ss.android.ugc.aweme.beauty.C23780d.f63371a
            java.lang.String r2 = "key_beauty_guarantee_strategy"
            boolean r0 = r0.getBoolean(r2, r1)
            com.p683ss.android.ugc.aweme.beauty.C23780d.f63372b = r0
            com.p683ss.android.ugc.aweme.beauty.C23780d.f63373c = r1
            boolean r0 = com.p683ss.android.ugc.aweme.beauty.C23780d.m58365a()
            r7 = 0
            if (r0 == 0) goto L_0x0102
            com.ss.android.ugc.aweme.tools.beauty.service.a r0 = r15.f107361f
            if (r0 != 0) goto L_0x00e6
            java.lang.String r2 = "beautyManager"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x00e6:
            boolean r2 = com.p683ss.android.ugc.aweme.beauty.C23780d.m58368d()
            java.lang.String r2 = com.p683ss.android.ugc.aweme.tools.beauty.C46828c.m101680a(r2)
            com.ss.android.ugc.aweme.shortvideo.beauty.b r4 = new com.ss.android.ugc.aweme.shortvideo.beauty.b
            r4.<init>()
            com.ss.android.ugc.aweme.tools.beauty.service.c$a r4 = (com.p683ss.android.ugc.aweme.tools.beauty.service.C46894c.C46895a) r4
            java.lang.String r5 = "panel"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r5)
            r0.mo94153a(r1)
            r0.mo94152a(r2, r4)
            goto L_0x01ab
        L_0x0102:
            com.ss.android.ugc.aweme.tools.beauty.service.a r0 = r15.f107361f
            if (r0 != 0) goto L_0x010b
            java.lang.String r1 = "beautyManager"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x010b:
            com.bytedance.m.b r1 = r15.mo23370j()
            java.lang.Class<android.support.v4.app.FragmentActivity> r2 = android.support.p030v4.app.FragmentActivity.class
            java.lang.Object r1 = r1.mo23372a(r2)
            java.lang.String r2 = "diContainer.get(FragmentActivity::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            android.content.Context r1 = (android.content.Context) r1
            r2 = r15
            android.arch.lifecycle.k r2 = (android.arch.lifecycle.C0184k) r2
            java.lang.String r4 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r4)
            java.lang.String r4 = "lifecycleOwner"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r4)
            r4 = 0
            r0.mo94153a(r4)
            com.ss.android.ugc.aweme.tools.beauty.service.a.f r0 = new com.ss.android.ugc.aweme.tools.beauty.service.a.f
            com.ss.android.ugc.aweme.infoSticker.InfoStickerRepository r4 = new com.ss.android.ugc.aweme.infoSticker.InfoStickerRepository
            r4.<init>(r1)
            r0.<init>(r4)
            java.lang.String r1 = "lifecycleOwner"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r1)
            com.ss.android.ugc.aweme.port.in.u r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.ss.android.ugc.aweme.property.l r1 = r1.mo58574e()
            com.ss.android.ugc.aweme.property.l$a r4 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.UlikeBeautyDownloadEnable
            boolean r1 = r1.mo83117a(r4)
            if (r1 == 0) goto L_0x018a
            java.lang.String r9 = "beautify"
            java.lang.String r10 = "all"
            java.lang.String r14 = ""
            android.arch.lifecycle.LiveData<com.ss.android.ugc.aweme.mvp.b.a<com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel>> r1 = r0.f118465a
            if (r1 == 0) goto L_0x016d
            android.arch.lifecycle.LiveData<com.ss.android.ugc.aweme.mvp.b.a<com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel>> r1 = r0.f118465a
            if (r1 == 0) goto L_0x0161
            java.lang.Object r1 = r1.getValue()
            com.ss.android.ugc.aweme.mvp.b.a r1 = (com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a) r1
            goto L_0x0162
        L_0x0161:
            r1 = r7
        L_0x0162:
            if (r1 != 0) goto L_0x0167
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0167:
            com.ss.android.ugc.aweme.mvp.b.a$a r1 = r1.f96126b
            com.ss.android.ugc.aweme.mvp.b.a$a r4 = com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a.ERROR
            if (r1 != r4) goto L_0x0179
        L_0x016d:
            com.ss.android.ugc.aweme.infoSticker.InfoStickerRepository r8 = r0.f118466b
            r11 = 75
            r12 = 0
            r13 = 0
            android.arch.lifecycle.LiveData r1 = r8.mo73915a(r9, r10, r11, r12, r13, r14)
            r0.f118465a = r1
        L_0x0179:
            android.arch.lifecycle.LiveData<com.ss.android.ugc.aweme.mvp.b.a<com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel>> r1 = r0.f118465a
            if (r1 != 0) goto L_0x0180
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0180:
            com.ss.android.ugc.aweme.tools.beauty.service.a.f$a r4 = new com.ss.android.ugc.aweme.tools.beauty.service.a.f$a
            r4.<init>(r0)
            android.arch.lifecycle.s r4 = (android.arch.lifecycle.C0199s) r4
            r1.observe(r2, r4)
        L_0x018a:
            boolean r0 = com.p683ss.android.ugc.aweme.beauty.C23780d.m58366b()
            if (r0 == 0) goto L_0x01ab
            com.ss.android.ugc.aweme.tools.beauty.service.a r0 = r15.f107361f
            if (r0 != 0) goto L_0x0199
            java.lang.String r1 = "beautyManager"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0199:
            boolean r1 = com.p683ss.android.ugc.aweme.beauty.C23780d.m58368d()
            java.lang.String r1 = com.p683ss.android.ugc.aweme.tools.beauty.C46828c.m101680a(r1)
            com.ss.android.ugc.aweme.shortvideo.beauty.b r2 = new com.ss.android.ugc.aweme.shortvideo.beauty.b
            r2.<init>()
            com.ss.android.ugc.aweme.tools.beauty.service.c$a r2 = (com.p683ss.android.ugc.aweme.tools.beauty.service.C46894c.C46895a) r2
            r0.mo94152a(r1, r2)
        L_0x01ab:
            com.bytedance.m.b r0 = r15.mo23370j()
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ui.b.a> r1 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a.class
            java.lang.Object r0 = r0.mo23372a(r1)
            com.ss.android.ugc.aweme.shortvideo.ui.b.a r0 = (com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a) r0
            com.ss.android.ugc.aweme.shortvideo.t.g r0 = r0.mo91305K()
            r1 = r0
            com.ss.android.ugc.aweme.shortvideo.t.e r1 = (com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44882e) r1
            com.ss.android.ugc.asve.recorder.effect.b r0 = r0.f113586a
            java.lang.String r2 = "videoRecorder.presenter"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            java.lang.String r2 = "videoRecorder"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            java.lang.String r2 = "effectController"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r2)
            java.lang.String r2 = "2"
            java.lang.String r4 = "3"
            boolean r2 = com.p683ss.android.ugc.aweme.beauty.C23785h.m58373a(r2, r4)
            com.ss.android.ugc.aweme.tools.beauty.service.a.d r4 = new com.ss.android.ugc.aweme.tools.beauty.service.a.d
            r4.<init>(r1, r0, r2)
            r2 = r4
            com.ss.android.ugc.aweme.tools.beauty.service.d r2 = (com.p683ss.android.ugc.aweme.tools.beauty.service.C46896d) r2
            com.bytedance.m.b r0 = r15.mo23370j()
            java.lang.Class<com.ss.android.ugc.gamora.recorder.filter.a.a> r1 = com.p683ss.android.ugc.gamora.recorder.filter.p2470a.C49683a.class
            java.lang.Object r0 = r0.mo23372a(r1)
            java.lang.String r1 = "diContainer.get(FilterApiComponent::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.gamora.recorder.filter.a.a r0 = (com.p683ss.android.ugc.gamora.recorder.filter.p2470a.C49683a) r0
            com.ss.android.ugc.aweme.shortvideo.j.a r0 = r0.mo89445c()
            r4 = r0
            com.ss.android.ugc.aweme.shortvideo.j.h r4 = (com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43906h) r4
            com.ss.android.ugc.aweme.tools.beauty.service.a r0 = r15.f107361f
            if (r0 != 0) goto L_0x0200
            java.lang.String r1 = "beautyManager"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0200:
            r6 = r0
            com.ss.android.ugc.aweme.tools.beauty.service.c r6 = (com.p683ss.android.ugc.aweme.tools.beauty.service.C46894c) r6
            com.ss.android.ugc.aweme.shortvideo.beauty.c$a r0 = new com.ss.android.ugc.aweme.shortvideo.beauty.c$a
            r0.<init>(r15)
            r5 = r0
            d.f.a.a r5 = (p2628d.p2639f.p2640a.C52670a) r5
            java.lang.String r0 = "module"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r0)
            java.lang.String r0 = "beautyManager"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            com.ss.android.ugc.aweme.tools.beauty.service.a.e r0 = new com.ss.android.ugc.aweme.tools.beauty.service.a.e
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.tools.beauty.service.a.a r0 = (com.p683ss.android.ugc.aweme.tools.beauty.service.p2352a.C46881a) r0
            r15.f107360e = r0
            com.bytedance.m.b r0 = r15.mo23370j()
            java.lang.Class<com.ss.android.ugc.gamora.recorder.sticker.a.n> r1 = com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n.class
            java.lang.Object r0 = r0.mo23373a(r1, r7)
            com.ss.android.ugc.gamora.recorder.sticker.a.n r0 = (com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n) r0
            com.ss.android.ugc.aweme.sticker.presenter.l r0 = r0.mo93023h()
            com.ss.android.ugc.aweme.sticker.presenter.g r0 = r0.mo92989g()
            android.arch.lifecycle.LiveData r0 = r0.mo93014b()
            r1 = r15
            android.arch.lifecycle.k r1 = (android.arch.lifecycle.C0184k) r1
            com.ss.android.ugc.aweme.shortvideo.beauty.c$e r2 = new com.ss.android.ugc.aweme.shortvideo.beauty.c$e
            r2.<init>(r15)
            android.arch.lifecycle.s r2 = (android.arch.lifecycle.C0199s) r2
            r0.observe(r1, r2)
            com.ss.android.ugc.aweme.tools.beauty.service.a.a r0 = r15.f107360e
            if (r0 != 0) goto L_0x024d
            java.lang.String r2 = "beautyPresenter"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x024d:
            com.ss.android.ugc.aweme.tools.beauty.service.d r0 = r0.f118435a
            java.lang.String r2 = "beautyPresenter.beautyModule"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            r15.f107362g = r0
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r0 = r15.m93252s()
            java.lang.String r2 = "shortVideoContextViewMode"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            android.arch.lifecycle.LiveData r0 = r0.mo86398g()
            com.ss.android.ugc.aweme.shortvideo.beauty.c$b r2 = new com.ss.android.ugc.aweme.shortvideo.beauty.c$b
            r2.<init>(r15)
            android.arch.lifecycle.s r2 = (android.arch.lifecycle.C0199s) r2
            r0.observe(r1, r2)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r0 = r15.m93252s()
            java.lang.String r2 = "shortVideoContextViewMode"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            android.arch.lifecycle.LiveData r0 = r0.mo86399h()
            com.ss.android.ugc.aweme.shortvideo.beauty.c$c r2 = new com.ss.android.ugc.aweme.shortvideo.beauty.c$c
            r2.<init>(r15)
            android.arch.lifecycle.s r2 = (android.arch.lifecycle.C0199s) r2
            r0.observe(r1, r2)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r0 = r15.m93252s()
            java.lang.String r2 = "shortVideoContextViewMode"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            android.arch.lifecycle.LiveData r0 = r0.mo86398g()
            com.ss.android.ugc.aweme.shortvideo.beauty.c$d r2 = new com.ss.android.ugc.aweme.shortvideo.beauty.c$d
            r2.<init>(r15)
            android.arch.lifecycle.s r2 = (android.arch.lifecycle.C0199s) r2
            r0.observe(r1, r2)
            return
        L_0x029c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "gson must be set"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x02aa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "beautyFilterConfig must be set"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.beauty.C42453c.bO_():void");
    }

    /* renamed from: a */
    public final void mo86566a(int i) {
        C46896d dVar = this.f107362g;
        if (dVar == null) {
            C52711k.m112237a("beautyModule");
        }
        dVar.mo86566a(i);
    }

    /* renamed from: b */
    public final void mo86571b(int i) {
        C46896d dVar = this.f107362g;
        if (dVar == null) {
            C52711k.m112237a("beautyModule");
        }
        dVar.mo86571b(i);
    }

    /* renamed from: c */
    public final void mo86573c(int i) {
        C46896d dVar = this.f107362g;
        if (dVar == null) {
            C52711k.m112237a("beautyModule");
        }
        dVar.mo86573c(i);
    }

    /* renamed from: e */
    public final void mo86578e(int i) {
        C46896d dVar = this.f107362g;
        if (dVar == null) {
            C52711k.m112237a("beautyModule");
        }
        dVar.mo86578e(i);
    }

    /* renamed from: f */
    public final void mo86580f(boolean z) {
        C46896d dVar = this.f107362g;
        if (dVar == null) {
            C52711k.m112237a("beautyModule");
        }
        dVar.mo86580f(z);
    }

    /* renamed from: g */
    public final void mo86581g(boolean z) {
        C46896d dVar = this.f107362g;
        if (dVar == null) {
            C52711k.m112237a("beautyModule");
        }
        dVar.mo86581g(z);
    }

    /* renamed from: h */
    public final void mo86583h(boolean z) {
        C46896d dVar = this.f107362g;
        if (dVar == null) {
            C52711k.m112237a("beautyModule");
        }
        dVar.mo86583h(z);
    }

    /* renamed from: d */
    public final void mo86576d(int i) {
        C46896d dVar = this.f107362g;
        if (dVar == null) {
            C52711k.m112237a("beautyModule");
        }
        dVar.mo86576d(i);
    }

    /* renamed from: e */
    public final void mo86579e(boolean z) {
        C46896d dVar = this.f107362g;
        if (dVar == null) {
            C52711k.m112237a("beautyModule");
        }
        dVar.mo86579e(z);
    }

    /* renamed from: a */
    public final void mo86555a(String str) {
        C52711k.m112240b(str, "value");
        C46876a aVar = this.f107361f;
        if (aVar == null) {
            C52711k.m112237a("beautyManager");
        }
        C52711k.m112240b(str, "<set-?>");
        aVar.f118423a = str;
    }

    /* renamed from: d */
    public final void mo86577d(boolean z) {
        C46896d dVar = this.f107362g;
        if (dVar == null) {
            C52711k.m112237a("beautyModule");
        }
        dVar.mo86577d(z);
    }

    /* renamed from: c */
    public final void mo86575c(boolean z) {
        if (!C23780d.m58365a()) {
            C46896d dVar = this.f107362g;
            if (dVar == null) {
                C52711k.m112237a("beautyModule");
            }
            dVar.mo86581g(z);
        }
    }

    /* renamed from: b */
    public final void mo86559b(boolean z) {
        int i;
        int i2;
        String str;
        Object a = mo23370j().mo23372a(ShortVideoContext.class);
        C52711k.m112236a(a, "diContainer.get(ShortVideoContext::class.java)");
        ShortVideoContext shortVideoContext = (ShortVideoContext) a;
        Object a2 = mo23370j().mo23372a(FragmentActivity.class);
        C52711k.m112236a(a2, "diContainer.get(FragmentActivity::class.java)");
        Context context = (FragmentActivity) a2;
        if (z) {
            i = R.string.r2;
        } else {
            i = R.string.qx;
        }
        C10691a.m21548c(context, i).mo19066a();
        C40795l lVar = C39618d.f101151O;
        C40796a aVar = C40796a.BeautificationMode;
        if (z) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        lVar.mo83113a(aVar, i2);
        if (z) {
            mo86556a(true);
        } else {
            mo86556a(false);
        }
        String str2 = "click_beautify_entrance";
        C23089d a3 = C23089d.m56640a().mo47829a("creation_id", shortVideoContext.f107131x).mo47829a("shoot_way", shortVideoContext.f107132y).mo47829a("content_source", shortVideoContext.mo86370k().getContentSource()).mo47829a("content_type", shortVideoContext.mo86370k().getContentType()).mo47829a("enter_from", "video_shoot_page");
        String str3 = "to_status";
        if (shortVideoContext.f107128u) {
            str = "on";
        } else {
            str = "off";
        }
        C26890h.m65011a(str2, a3.mo47829a(str3, str).f61491a);
    }

    /* renamed from: a */
    public final void mo86556a(boolean z) {
        float f;
        ShortVideoContext shortVideoContext = (ShortVideoContext) mo23370j().mo23372a(ShortVideoContext.class);
        C44885g K = ((C45004a) mo23370j().mo23372a(C45004a.class)).mo91305K();
        C45004a aVar = (C45004a) mo23370j().mo23372a(C45004a.class);
        C49683a aVar2 = (C49683a) mo23370j().mo23372a(C49683a.class);
        if (C23780d.m58365a()) {
            shortVideoContext.f107128u = z;
        } else if (z && C23777a.m58348a() && C39618d.f101151O.mo83118b(C40796a.BeautificationMode) == 2) {
        } else {
            if (!this.f107359d) {
                C10691a.m21542b(C11010c.m22280a(), (int) R.string.x3).mo19066a();
                return;
            }
            shortVideoContext.f107128u = z;
            K.mo91033c(z);
            if (z) {
                float d = C39618d.f101151O.mo83120d(C40796a.UlikeSmoothDefaultValue);
                if (C39618d.f101151O.mo83117a(C40796a.UlikeBeautyDownloadEnable)) {
                    float a = C23779c.m58358a(5, "0");
                    if (a != -1.0f) {
                        K.mo91000a(a);
                    }
                    float a2 = C23779c.m58358a(0, "0");
                    if (a2 != -1.0f) {
                        d = a2;
                    }
                }
                C31501n d2 = C39618d.m88215d();
                C52711k.m112236a((Object) d2, "AVEnv.getFilterSources()");
                C52711k.m112236a((Object) aVar2, "filterApiComponent");
                C43906h hVar = (C43906h) aVar2.mo89445c();
                C52711k.m112236a((Object) hVar, "filterApiComponent.filterFunc");
                if (C31487c.m73323a(d2, hVar.mo89440e()) == 0) {
                    f = 0.35f;
                } else {
                    f = 0.0f;
                }
                if (C23777a.m58348a()) {
                    f = 0.0f;
                }
                K.mo91001a(d, f);
                shortVideoContext.f107129v = K.f113589d;
            } else {
                shortVideoContext.f107129v = -1;
            }
            if (!((C49717b) mo23370j().mo23372a(C49717b.class)).mo97605d()) {
                C31459g a3 = C39618d.f101144H.mo58584o().mo64333c().mo64344a(this.f107358c.mo89423a(aVar.mo91315U()));
                if (a3 != null) {
                    C52711k.m112236a((Object) aVar2, "filterApiComponent");
                    ((C43906h) aVar2.mo89445c()).mo89438a(a3);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo86554a(C46821b bVar, boolean z) {
        C52711k.m112240b(bVar, "beautySequence");
        C46876a aVar = this.f107361f;
        if (aVar == null) {
            C52711k.m112237a("beautyManager");
        }
        C52711k.m112240b(bVar, "beautySequence");
        aVar.mo94160f().mo94088a(bVar);
    }

    /* renamed from: b */
    public final void mo86572b(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "nodes");
        C46896d dVar = this.f107362g;
        if (dVar == null) {
            C52711k.m112237a("beautyModule");
        }
        dVar.mo86572b(list, i);
    }

    /* renamed from: c */
    public final void mo86574c(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "nodes");
        C46896d dVar = this.f107362g;
        if (dVar == null) {
            C52711k.m112237a("beautyModule");
        }
        dVar.mo86574c(list, i);
    }

    /* renamed from: a */
    public final void mo86568a(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "nodes");
        C46896d dVar = this.f107362g;
        if (dVar == null) {
            C52711k.m112237a("beautyModule");
        }
        dVar.mo86568a(list, i);
    }

    /* renamed from: a */
    public final void mo86557a(boolean z, C46814a aVar) {
        C52711k.m112240b(aVar, "gender");
        C46876a aVar2 = this.f107361f;
        if (aVar2 == null) {
            C52711k.m112237a("beautyManager");
        }
        aVar2.mo94154a(true, aVar);
    }

    /* renamed from: a */
    public final void mo86558a(boolean z, boolean z2) {
        this.f107359d = z2;
        mo86556a(z);
    }

    public C42453c(C12361b bVar, C43872b bVar2, boolean z) {
        C52711k.m112240b(bVar, "diContainer");
        C52711k.m112240b(bVar2, "cameraFilterStrategy");
        this.f107364i = bVar;
        this.f107358c = bVar2;
    }

    /* renamed from: a */
    public final void mo86567a(String str, String str2, float f) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        C52711k.m112240b(str2, "nodeTag");
        C46896d dVar = this.f107362g;
        if (dVar == null) {
            C52711k.m112237a("beautyModule");
        }
        dVar.mo86567a(str, str2, f);
    }

    /* renamed from: a */
    public final void mo86569a(List<ComposerInfo> list, List<ComposerInfo> list2, int i) {
        C52711k.m112240b(list, "oldNodes");
        C52711k.m112240b(list2, "newNodes");
        C46896d dVar = this.f107362g;
        if (dVar == null) {
            C52711k.m112237a("beautyModule");
        }
        dVar.mo86569a(list, list2, i);
    }
}
