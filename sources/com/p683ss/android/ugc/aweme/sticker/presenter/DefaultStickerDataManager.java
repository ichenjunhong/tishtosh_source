package com.p683ss.android.ugc.aweme.sticker.presenter;

import android.app.Application;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.support.p043v7.app.AppCompatActivity;
import com.p683ss.android.ugc.aweme.effectplatform.C29242c;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.aweme.sticker.p2278b.C45841j;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45872c;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45872c.C45874b;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45872c.C45875c;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45878f;
import com.p683ss.android.ugc.aweme.sticker.p2285i.C45894a;
import com.p683ss.android.ugc.aweme.sticker.p2285i.C45894a.C45895a;
import com.p683ss.android.ugc.aweme.sticker.p2285i.C45894a.C45896b;
import com.p683ss.android.ugc.aweme.sticker.p2285i.C45894a.C45897c;
import com.p683ss.android.ugc.aweme.sticker.p2285i.C45894a.C45898d;
import com.p683ss.android.ugc.aweme.sticker.p2285i.C45894a.C45899e;
import com.p683ss.android.ugc.aweme.sticker.p2285i.C45894a.C45900f;
import com.p683ss.android.ugc.aweme.sticker.p2285i.C45894a.C45901g;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2286a.C45918p;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2287b.C45925a;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2289d.p2290a.C45930a;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2289d.p2290a.C45933b;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2289d.p2294e.C45977d;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2289d.p2294e.C45991e;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2296e.C46020a;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2296e.C46021b;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46057f;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46057f.C46058a;
import com.p683ss.android.ugc.aweme.sticker.types.mimoji.C46578b;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.ResourceListModel;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48703h;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48704i;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48709n;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48710o;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48715t;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p064c.p065a.C1687b;
import p064c.p065a.C1705d;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p076d.C1762g;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.DefaultStickerDataManager */
public class DefaultStickerDataManager implements C0183j, C46354l {

    /* renamed from: a */
    public C46578b f116749a;

    /* renamed from: b */
    private final C1689b f116750b;

    /* renamed from: c */
    private final C45918p f116751c;

    /* renamed from: d */
    private int f116752d;

    /* renamed from: e */
    private Effect f116753e;

    /* renamed from: f */
    private long f116754f;

    /* renamed from: g */
    private boolean f116755g;

    /* renamed from: h */
    private final C52668f<C46293b> f116756h;

    /* renamed from: i */
    private boolean f116757i;

    /* renamed from: j */
    private final AppCompatActivity f116758j;

    /* renamed from: k */
    private final C46355m f116759k;

    /* renamed from: l */
    private final String f116760l;

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.DefaultStickerDataManager$a */
    static final /* synthetic */ class C46276a extends C52710j implements C52682m<StickerWrapper, C45874b, C52860x> {
        C46276a(C45872c cVar) {
            super(2, cVar);
        }

        public final String getName() {
            return "fetchEffect";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(C45872c.class);
        }

        public final String getSignature() {
            return "fetchEffect(Lcom/ss/android/ugc/aweme/sticker/StickerWrapper;Lcom/ss/android/ugc/aweme/sticker/fetcher/IStickerFetch$OnStickerDownloadListener;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            ((C45872c) this.receiver).mo92469a((StickerWrapper) obj, (C45874b) obj2);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.DefaultStickerDataManager$b */
    public static final class C46277b implements C45878f {
        C46277b() {
        }

        /* renamed from: a */
        public final boolean mo92475a(Effect effect) {
            C52711k.m112240b(effect, "effect");
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.DefaultStickerDataManager$c */
    static final class C46278c<T> implements C1710e<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C48710o f116761a;

        C46278c(C48710o oVar) {
            this.f116761a = oVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                this.f116761a.mo8641a();
            } else {
                this.f116761a.mo8642b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.DefaultStickerDataManager$d */
    static final class C46279d extends C52712l implements C52670a<C46293b> {

        /* renamed from: a */
        public static final C46279d f116762a = new C46279d();

        C46279d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C46293b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.DefaultStickerDataManager$e */
    public static final class C46280e implements C48709n {

        /* renamed from: a */
        final /* synthetic */ C45875c f116763a;

        /* renamed from: b */
        final /* synthetic */ StickerWrapper f116764b;

        /* renamed from: a */
        public final void mo92994a(C48649d dVar) {
            this.f116763a.mo92256b();
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            ResourceListModel resourceListModel = (ResourceListModel) obj;
            this.f116763a.mo92256b();
        }

        C46280e(C45875c cVar, StickerWrapper stickerWrapper) {
            this.f116763a = cVar;
            this.f116764b = stickerWrapper;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.DefaultStickerDataManager$f */
    static final class C46281f implements C1706a {

        /* renamed from: a */
        final /* synthetic */ C48715t f116765a;

        C46281f(C48715t tVar) {
            this.f116765a = tVar;
        }

        /* renamed from: a */
        public final void mo6199a() {
            this.f116765a.mo8708a();
        }
    }

    /* renamed from: a */
    public final C45918p mo92973a() {
        return this.f116751c;
    }

    /* renamed from: b */
    public final int mo92984b() {
        return this.f116752d;
    }

    /* renamed from: d */
    public final Effect mo92986d() {
        return this.f116753e;
    }

    /* renamed from: e */
    public final long mo92987e() {
        return this.f116754f;
    }

    /* renamed from: f */
    public final boolean mo92988f() {
        return this.f116755g;
    }

    /* renamed from: i */
    public final void mo92991i() {
        onDestroy();
    }

    /* renamed from: j */
    public final C46355m mo92992j() {
        return this.f116759k;
    }

    /* renamed from: a */
    public final void mo92983a(boolean z) {
        this.f116755g = z;
    }

    /* renamed from: a */
    public final void mo92982a(List<String> list, Map<String, String> map, boolean z, C48704i iVar) {
        C52711k.m112240b(list, "effectIds");
        mo92973a().mo92531c().mo92516a(list, z, map, iVar);
    }

    /* renamed from: a */
    public final boolean mo92273a(StickerWrapper stickerWrapper) {
        C52711k.m112240b(stickerWrapper, "stickerWrapper");
        if (stickerWrapper.f115779a == null) {
            return false;
        }
        Effect effect = stickerWrapper.f115779a;
        C52711k.m112236a((Object) effect, "effect");
        Collection types = effect.getTypes();
        boolean z = !(types == null || types.isEmpty()) && effect.getTypes().contains("Adaptive");
        if (C39629l.m88232a().mo58574e().mo83117a(C40796a.EnableUpdateMoji) && z && !stickerWrapper.f115784f) {
            String id = effect.getId();
            C52711k.m112236a((Object) id, "effect.id");
            if (C45841j.m99678b(id)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final Effect mo92985c() {
        return mo92989g().mo93011a();
    }

    /* renamed from: g */
    public final C46298g mo92989g() {
        return (C46298g) this.f116756h.getValue();
    }

    /* renamed from: h */
    public final void mo92990h() {
        C45918p a = mo92973a();
        C46020a aVar = new C46020a("sticker_category:favorite", 0, 0, 0, null, 30, null);
        a.mo92527a(aVar);
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        if (!this.f116757i) {
            this.f116757i = true;
            mo92973a().mo92526a();
            this.f116750b.mo6180a();
        }
    }

    /* renamed from: a */
    public final void mo92974a(int i) {
        this.f116752d = i;
    }

    /* renamed from: a */
    public final void mo92976a(long j) {
        this.f116754f = j;
    }

    /* renamed from: a */
    public final void mo92977a(Effect effect) {
        this.f116753e = effect;
    }

    /* renamed from: a */
    public final void mo92975a(int i, List<? extends Effect> list) {
        C52711k.m112240b(list, "pinStickers");
        C46021b bVar = new C46021b(list, i, 0, null, 12, null);
        mo92973a().mo92535g().mo92521a(bVar);
    }

    /* renamed from: a */
    public final void mo92272a(StickerWrapper stickerWrapper, C45875c cVar) {
        C52711k.m112240b(stickerWrapper, "stickerWrapper");
        C52711k.m112240b(cVar, "onUpdate");
        C46578b bVar = this.f116749a;
        if (bVar != null) {
            cVar.mo92255a();
            FaceStickerBean a = C46057f.m100055a(stickerWrapper.f115779a);
            C52711k.m112236a((Object) a, "StickerConfig.covert(stickerWrapper.effect)");
            bVar.mo93059a(a, new C46280e(cVar, stickerWrapper));
            return;
        }
        cVar.mo92256b();
    }

    /* renamed from: a */
    public final void mo92978a(Effect effect, C48705j jVar) {
        if (effect != null) {
            mo92973a().mo92531c().mo92514a(effect, jVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0084, code lost:
        if (r8.f115782d != false) goto L_0x0087;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo92271a(com.p683ss.android.ugc.aweme.sticker.StickerWrapper r8, com.p683ss.android.ugc.aweme.sticker.p2281e.C45872c.C45874b r9) {
        /*
            r7 = this;
            java.lang.String r0 = "data"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            com.ss.android.ugc.aweme.sticker.i.a.p r0 = r7.mo92973a()
            com.ss.android.ugc.aweme.sticker.i.a.j r0 = r0.mo92530b()
            com.ss.android.ugc.aweme.sticker.presenter.DefaultStickerDataManager$b r1 = new com.ss.android.ugc.aweme.sticker.presenter.DefaultStickerDataManager$b
            r1.<init>()
            com.ss.android.ugc.aweme.sticker.e.f r1 = (com.p683ss.android.ugc.aweme.sticker.p2281e.C45878f) r1
            com.ss.android.ugc.aweme.sticker.e.c r0 = r0.mo92513a(r1)
            if (r9 == 0) goto L_0x0109
            com.ss.android.ugc.aweme.sticker.i.a.p r1 = r7.mo92973a()
            com.ss.android.ugc.aweme.sticker.i.a.i r1 = r1.mo92532d()
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r8.f115779a
            boolean r1 = r1.mo92511a(r2)
            com.ss.android.ugc.aweme.sticker.e.e r2 = new com.ss.android.ugc.aweme.sticker.e.e
            java.lang.String r3 = "effect"
            r2.<init>(r3, r1, r9)
            com.ss.android.ugc.aweme.sticker.b.b r9 = new com.ss.android.ugc.aweme.sticker.b.b
            com.ss.android.ugc.aweme.sticker.i.a.p r1 = r7.mo92973a()
            com.ss.android.ugc.aweme.sticker.presenter.DefaultStickerDataManager$a r3 = new com.ss.android.ugc.aweme.sticker.presenter.DefaultStickerDataManager$a
            r3.<init>(r0)
            d.f.a.m r3 = (p2628d.p2639f.p2640a.C52682m) r3
            r9.<init>(r1, r3)
            com.ss.android.ugc.aweme.sticker.e.c$b r2 = (com.p683ss.android.ugc.aweme.sticker.p2281e.C45872c.C45874b) r2
            java.lang.String r0 = "effect"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            java.lang.String r0 = "onStickerDownloadListener"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r0)
            com.ss.android.ugc.aweme.sticker.b.b$b r0 = new com.ss.android.ugc.aweme.sticker.b.b$b
            r0.<init>(r9, r2, r8)
            r1 = 0
            if (r8 == 0) goto L_0x0086
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r8.f115779a
            if (r3 != 0) goto L_0x0058
            goto L_0x0086
        L_0x0058:
            com.ss.android.ugc.aweme.sticker.i.a.p r3 = r9.f115823c
            com.ss.android.ugc.aweme.sticker.i.a.i r3 = r3.mo92532d()
            com.ss.android.ugc.effectmanager.effect.model.Effect r4 = r8.f115779a
            boolean r3 = r3.mo92511a(r4)
            com.ss.android.ugc.effectmanager.effect.model.Effect r4 = r8.f115779a
            boolean r4 = com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g.m100094r(r4)
            if (r4 == 0) goto L_0x0087
            com.ss.android.ugc.effectmanager.effect.model.Effect r4 = r8.f115779a
            java.lang.String r5 = "effect.effect"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            java.lang.String r4 = r4.getEffectId()
            java.lang.String r5 = "effect.effect.effectId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            com.ss.android.ugc.aweme.shortvideo.c r4 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45183i.m98672a(r4)
            if (r4 != 0) goto L_0x0086
            boolean r4 = r8.f115782d
            if (r4 != 0) goto L_0x0087
        L_0x0086:
            r3 = 0
        L_0x0087:
            r4 = 1
            if (r3 == 0) goto L_0x008c
            r9.f115822b = r4
        L_0x008c:
            com.ss.android.ugc.aweme.sticker.b.b$a r3 = com.p683ss.android.ugc.aweme.sticker.p2278b.C45822b.f115820e
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r8.f115779a
            java.lang.String r5 = "effect.effect"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)
            com.ss.android.ugc.effectmanager.common.model.UrlModel r3 = r3.getHintIcon()
            r5 = 0
            if (r3 != 0) goto L_0x009d
            goto L_0x00bf
        L_0x009d:
            java.lang.String r6 = "effect.hintIcon ?: return null"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r6)
            java.util.List r3 = r3.getUrlList()
            r6 = r3
            java.util.Collection r6 = (java.util.Collection) r6
            if (r6 == 0) goto L_0x00b4
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x00b2
            goto L_0x00b4
        L_0x00b2:
            r6 = 0
            goto L_0x00b5
        L_0x00b4:
            r6 = 1
        L_0x00b5:
            if (r6 == 0) goto L_0x00b8
            goto L_0x00bf
        L_0x00b8:
            java.lang.Object r3 = r3.get(r1)
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
        L_0x00bf:
            r3 = r5
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00d3
            android.net.Uri r3 = android.net.Uri.parse(r5)
            boolean r3 = com.p683ss.android.ugc.tools.p2504a.C50181a.m108298a(r3)
            if (r3 != 0) goto L_0x00d3
            r1 = 1
        L_0x00d3:
            if (r1 != 0) goto L_0x00d7
            r9.f115821a = r4
        L_0x00d7:
            boolean r1 = r0.invoke()
            if (r1 != 0) goto L_0x0108
            boolean r1 = r9.f115822b
            if (r1 != 0) goto L_0x00eb
            d.f.a.m<com.ss.android.ugc.aweme.sticker.StickerWrapper, com.ss.android.ugc.aweme.sticker.e.c$b, d.x> r1 = r9.f115824d
            com.ss.android.ugc.aweme.sticker.b.b$c r3 = new com.ss.android.ugc.aweme.sticker.b.b$c
            r3.<init>(r9, r2, r0)
            r1.invoke(r8, r3)
        L_0x00eb:
            boolean r1 = r9.f115821a
            if (r1 != 0) goto L_0x0108
            com.ss.android.ugc.effectmanager.effect.model.Effect r8 = r8.f115779a
            java.lang.String r1 = "effect.effect"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r1)
            com.ss.android.ugc.effectmanager.common.model.UrlModel r8 = r8.getHintIcon()
            com.ss.android.ugc.aweme.base.model.UrlModel r8 = com.p683ss.android.ugc.aweme.effectplatform.C29240a.m68865a(r8)
            com.ss.android.ugc.aweme.sticker.b.b$d r1 = new com.ss.android.ugc.aweme.sticker.b.b$d
            r1.<init>(r9, r0)
            com.ss.android.ugc.tools.a.a$b r1 = (com.p683ss.android.ugc.tools.p2504a.C50181a.C50185b) r1
            com.p683ss.android.ugc.tools.p2504a.C50181a.m108297a(r8, r1)
        L_0x0108:
            return
        L_0x0109:
            r0.mo92468a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.presenter.DefaultStickerDataManager.mo92271a(com.ss.android.ugc.aweme.sticker.StickerWrapper, com.ss.android.ugc.aweme.sticker.e.c$b):void");
    }

    private DefaultStickerDataManager(AppCompatActivity appCompatActivity, C46355m mVar, String str) {
        AppCompatActivity appCompatActivity2 = appCompatActivity;
        C46355m mVar2 = mVar;
        String str2 = str;
        C52711k.m112240b(appCompatActivity2, "activity");
        C52711k.m112240b(mVar2, "configure");
        C52711k.m112240b(str2, "panel");
        this.f116758j = appCompatActivity2;
        this.f116759k = mVar2;
        this.f116760l = str2;
        this.f116750b = new C1689b();
        List a = C46058a.m100060a(this.f116758j);
        new C45894a();
        String str3 = this.f116760l;
        C52711k.m112236a((Object) a, "defaultCategories");
        C52711k.m112240b(str3, "panel");
        C52711k.m112240b(a, "defaultCategories");
        Application b = C39629l.m88233b();
        C52711k.m112236a((Object) b, "CameraClient.getApplication()");
        C29252f a2 = C29242c.m68869a(b, null);
        C52668f a3 = C52732g.m112285a(new C45900f(a2, new C45925a(0, 1, null)));
        C52668f a4 = C52732g.m112285a(new C45897c(str3, a2));
        C52668f a5 = C52732g.m112285a(C45896b.INSTANCE);
        C52668f a6 = C52732g.m112285a(new C45901g(a5));
        C52668f a7 = C52732g.m112285a(C45898d.INSTANCE);
        C52668f a8 = C52732g.m112285a(new C45899e(a2));
        C45977d dVar = new C45977d(str3, a2, new C45930a(str3, a2, a5), new C45933b(str3, a2), new C45991e(a6, a7, a5, a), a4, a3, C52732g.m112285a(new C45895a(a3, a8)), a8, a6, a7, a5);
        this.f116751c = dVar;
        this.f116758j.getLifecycle().mo324a(this);
        this.f116752d = -1;
        this.f116754f = -1;
        this.f116755g = true;
        this.f116756h = C52732g.m112285a(C46279d.f116762a);
    }

    /* renamed from: a */
    public final void mo92979a(String str, String str2, C48715t tVar) {
        C52711k.m112240b(tVar, "listener");
        C1689b bVar = this.f116750b;
        C1687b a = mo92973a().mo92525a(str, str2);
        C1706a fVar = new C46281f(tVar);
        C1745b.m6050a(fVar, "onComplete is null");
        C1762g gVar = new C1762g(fVar);
        a.mo6175a((C1705d) gVar);
        bVar.mo6181a((C1690c) gVar);
    }

    /* renamed from: a */
    public final void mo92981a(List<String> list, Map<String, String> map, C48703h hVar) {
        C52711k.m112240b(list, "effectIds");
        mo92973a().mo92531c().mo92515a(list, map, hVar);
    }

    /* renamed from: a */
    public final void mo92980a(String str, List<String> list, String str2, C48710o oVar) {
        C52711k.m112240b(oVar, "listener");
        this.f116750b.mo6181a(mo92973a().mo92524a(str, list, str2).mo6162d(new C46278c(oVar)));
    }

    public /* synthetic */ DefaultStickerDataManager(AppCompatActivity appCompatActivity, C46355m mVar, String str, int i, C52707g gVar) {
        this(appCompatActivity, mVar, mVar.f116949a);
    }
}
