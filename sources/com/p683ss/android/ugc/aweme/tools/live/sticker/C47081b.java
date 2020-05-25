package com.p683ss.android.ugc.aweme.tools.live.sticker;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.C0199s;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p043v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.p780m.C12361b;
import com.bytedance.p780m.C12366c;
import com.bytedance.p780m.C12372e;
import com.google.p1057b.p1058a.C17432q;
import com.p683ss.android.ugc.aweme.effectplatform.C29242c;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.framework.services.IStickerService.FaceSticker;
import com.p683ss.android.ugc.aweme.framework.services.StickerTagChangeData;
import com.p683ss.android.ugc.aweme.p2345t.C46776g;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.sticker.C45805a;
import com.p683ss.android.ugc.aweme.sticker.IStickerViewService.C45803a;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45806a;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45814b;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45819c;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45860c;
import com.p683ss.android.ugc.aweme.sticker.p2283g.C45888b;
import com.p683ss.android.ugc.aweme.sticker.p2284h.C45892a;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2297f.p2298a.C46024a;
import com.p683ss.android.ugc.aweme.sticker.panel.C46196n;
import com.p683ss.android.ugc.aweme.sticker.panel.C46254o;
import com.p683ss.android.ugc.aweme.sticker.panel.C46255p;
import com.p683ss.android.ugc.aweme.sticker.panel.C46256q;
import com.p683ss.android.ugc.aweme.sticker.panel.C46256q.C46257a;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46282a;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46355m;
import com.p683ss.android.ugc.aweme.sticker.presenter.DefaultStickerDataManager;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46340k;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2310b.C46307a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46318d;
import com.p683ss.android.ugc.aweme.sticker.presenter.p2308a.C46290b;
import com.p683ss.android.ugc.aweme.sticker.presenter.p2308a.C46291c;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.PixaloopARPresenter;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2326d.C46501a;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.tools.view.p2508a.C50206a;
import com.p683ss.android.ugc.tools.view.p2508a.C50207b;
import com.ss.android.ugc.trill.R;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.b */
public final class C47081b extends C46282a {

    /* renamed from: f */
    static final /* synthetic */ C52767h[] f118880f = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C47081b.class), "stickerViewConfigure", "getStickerViewConfigure()Lcom/ss/android/ugc/aweme/sticker/panel/StickerViewConfigure;"))};

    /* renamed from: o */
    public static final C47082a f118881o = new C47082a(null);

    /* renamed from: g */
    public final C50206a f118882g = new C47090i(this);

    /* renamed from: h */
    public volatile boolean f118883h = true;

    /* renamed from: i */
    public Effect f118884i;

    /* renamed from: j */
    public AppCompatActivity f118885j;

    /* renamed from: k */
    public FrameLayout f118886k;

    /* renamed from: l */
    public String f118887l;

    /* renamed from: m */
    public C0654k f118888m;

    /* renamed from: n */
    public C45803a f118889n;

    /* renamed from: p */
    private final C46354l f118890p;

    /* renamed from: q */
    private final C46291c f118891q = C46290b.f116788a;

    /* renamed from: r */
    private final C45814b f118892r = new C45806a(mo93023h());

    /* renamed from: s */
    private final C52668f<C29252f> f118893s = C52732g.m112285a(C47086e.f118895a);

    /* renamed from: t */
    private final C52668f f118894t = C52732g.m112285a(C47092k.f118901a);

    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.b$a */
    public static final class C47082a {
        private C47082a() {
        }

        public /* synthetic */ C47082a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.b$b */
    static final /* synthetic */ class C47083b extends C52710j implements C52682m<String, String, Integer> {
        C47083b(C45892a aVar) {
            super(2, aVar);
        }

        public final String getName() {
            return "animateImageToPreview";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(C45892a.class);
        }

        public final String getSignature() {
            return "animateImageToPreview(Ljava/lang/String;Ljava/lang/String;)I";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            C52711k.m112240b(str, "p1");
            C52711k.m112240b(str2, "p2");
            return Integer.valueOf(((C45892a) this.receiver).mo74856a(str, str2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.b$c */
    public static final class C47084c implements C46501a {
        C47084c() {
        }

        /* renamed from: a */
        public final void mo93243a(String str) {
            C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.b$d */
    public static final class C47085d implements C46307a {
        C47085d() {
        }

        /* renamed from: a */
        public final void mo93037a(Effect effect, String str, String str2, String str3) {
            C52711k.m112240b(effect, "effect");
            C52711k.m112240b(str, "videoSource");
            C52711k.m112240b(str3, "clickContent");
        }

        /* renamed from: b */
        public final void mo93038b(Effect effect, String str, String str2, String str3) {
            C52711k.m112240b(effect, "effect");
            C52711k.m112240b(str, "videoSource");
            C52711k.m112240b(str3, "clickContent");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.b$e */
    static final class C47086e extends C52712l implements C52670a<C29252f> {

        /* renamed from: a */
        public static final C47086e f118895a = new C47086e();

        C47086e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Application b = C39629l.m88233b();
            C52711k.m112236a((Object) b, "CameraClient.getApplication()");
            return C29242c.m68869a(b, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.b$f */
    public static final class C47087f implements C46256q {

        /* renamed from: a */
        final /* synthetic */ C47081b f118896a;

        /* renamed from: b */
        private final C50207b f118897b;

        /* renamed from: a */
        public final void mo92779a(View view) {
            C52711k.m112240b(view, "stickerView");
        }

        public final void cl_() {
        }

        C47087f(C47081b bVar) {
            this.f118896a = bVar;
            this.f118897b = C39629l.m88232a().mo58564B().mo74265a((Activity) bVar.f118885j);
        }

        /* renamed from: b */
        public final void mo92781b(C46257a aVar) {
            C52711k.m112240b(aVar, "state");
            if (aVar == C46257a.AFTER_ANIMATE) {
                if (this.f118896a.f118889n != null) {
                    C45860c.m99702a(this.f118896a.mo93023h().mo92985c());
                }
                if (C52711k.m112239a((Object) "livestreaming", (Object) this.f118896a.f118887l)) {
                    String name = this.f118896a.f118885j.getClass().getName();
                    C52711k.m112236a((Object) name, "activity.javaClass.name");
                    if (C52830p.m112456b((CharSequence) name, (CharSequence) "VideoRecordNewActivity", false, 2, (Object) null)) {
                        C50207b bVar = this.f118897b;
                        if (bVar != null) {
                            bVar.mo94978b(this.f118896a.f118882g);
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo92780a(C46257a aVar) {
            C52711k.m112240b(aVar, "state");
            if (aVar == C46257a.BEFORE_ANIMATE) {
                if (this.f118896a.f118883h && this.f118896a.mo93023h().mo92985c() != null && (!C52711k.m112239a((Object) this.f118896a.mo93023h().mo92985c(), (Object) this.f118896a.f118884i))) {
                    this.f118896a.f118883h = false;
                    this.f118896a.f118884i = this.f118896a.mo93023h().mo92985c();
                    Effect c = this.f118896a.mo93023h().mo92985c();
                    if (c != null) {
                        FaceSticker a = C45860c.m99702a(c);
                        if (a != null) {
                            C45803a aVar2 = this.f118896a.f118889n;
                            if (aVar2 != null) {
                                aVar2.mo74857a(a);
                            }
                        }
                    }
                }
                if (this.f118896a.f118889n != null) {
                    C45860c.m99702a(this.f118896a.mo93023h().mo92985c());
                }
                if (C52711k.m112239a((Object) "livestreaming", (Object) this.f118896a.f118887l)) {
                    String name = this.f118896a.f118885j.getClass().getName();
                    C52711k.m112236a((Object) name, "activity.javaClass.name");
                    if (C52830p.m112456b((CharSequence) name, (CharSequence) "VideoRecordNewActivity", false, 2, (Object) null)) {
                        C50207b bVar = this.f118897b;
                        if (bVar != null) {
                            bVar.mo94977a(this.f118896a.f118882g);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.b$g */
    static final class C47088g<T> implements C0199s<StickerTagChangeData> {

        /* renamed from: a */
        final /* synthetic */ C47081b f118898a;

        C47088g(C47081b bVar) {
            this.f118898a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            StickerTagChangeData stickerTagChangeData = (StickerTagChangeData) obj;
            if (!(stickerTagChangeData == null || this.f118898a.f118889n == null)) {
                stickerTagChangeData.getTabName();
                stickerTagChangeData.getTabKey();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.b$h */
    public static final class C47089h implements C45819c {

        /* renamed from: a */
        final /* synthetic */ C47081b f118899a;

        C47089h(C47081b bVar) {
            this.f118899a = bVar;
        }

        /* renamed from: a */
        public final void mo91208a(C46315a aVar) {
            boolean z;
            C52711k.m112240b(aVar, "session");
            this.f118899a.f118884i = aVar.f116852a;
            FaceSticker a = C45860c.m99702a(aVar.f116852a);
            if (a != null) {
                Bundle bundle = aVar.f116856e;
                if (bundle != null) {
                    z = bundle.getBoolean("is_video_used_sticker");
                } else {
                    z = false;
                }
                a.isVideoUsedSticker = z;
                C45803a aVar2 = this.f118899a.f118889n;
                if (aVar2 != null) {
                    aVar2.mo74857a(a);
                }
            }
        }

        /* renamed from: a */
        public final void mo91209a(C46318d dVar) {
            boolean z;
            C52711k.m112240b(dVar, "session");
            FaceSticker faceSticker = null;
            this.f118899a.f118884i = null;
            C45803a aVar = this.f118899a.f118889n;
            if (aVar != null) {
                FaceSticker a = C45860c.m99702a(dVar.f116858a);
                if (a != null) {
                    Bundle bundle = dVar.f116862e;
                    if (bundle != null) {
                        z = bundle.getBoolean("is_video_used_sticker");
                    } else {
                        z = false;
                    }
                    a.isVideoUsedSticker = z;
                    faceSticker = a;
                }
                aVar.mo74858b(faceSticker);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.b$i */
    static final class C47090i implements C50206a {

        /* renamed from: a */
        final /* synthetic */ C47081b f118900a;

        C47090i(C47081b bVar) {
            this.f118900a = bVar;
        }

        /* renamed from: a */
        public final boolean mo58985a(int i, KeyEvent keyEvent) {
            if (i == 4) {
                C46254o c = this.f118900a.mo93006c();
                if (c != null && c.mo92776c()) {
                    C46254o c2 = this.f118900a.mo93006c();
                    if (c2 != null) {
                        c2.mo92778e();
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.b$j */
    public static final class C47091j extends C12372e<C45805a> {
        C47091j() {
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return C46776g.m101581a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.b$k */
    static final class C47092k extends C52712l implements C52670a<C46255p> {

        /* renamed from: a */
        public static final C47092k f118901a = new C47092k();

        C47092k() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C46255p pVar = new C46255p(R.drawable.bdn, R.drawable.rx, null, 0, 0, R.color.gc, false, false, false, 476, null);
            return pVar;
        }
    }

    /* renamed from: a */
    public final C46291c mo92995a() {
        return this.f118891q;
    }

    /* renamed from: h */
    public final C46354l mo93023h() {
        return this.f118890p;
    }

    /* renamed from: i */
    public final C45814b mo93024i() {
        return this.f118892r;
    }

    /* renamed from: f */
    public final void mo94372f() {
        mo93023h().mo92991i();
        if (this.f118893s.isInitialized()) {
            ((C29252f) this.f118893s.getValue()).mo59146d();
        }
    }

    /* renamed from: a */
    public final void mo94371a(C17432q<C45892a> qVar) {
        C52711k.m112240b(qVar, "processorSupplier");
        PixaloopARPresenter pixaloopARPresenter = new PixaloopARPresenter(this.f118885j, this.f118887l, false, new C47083b((C45892a) qVar.get()), new C47084c(), new C47085d(), null, null, 192, null);
        mo93001a((C46340k) pixaloopARPresenter);
    }

    public C47081b(AppCompatActivity appCompatActivity, FrameLayout frameLayout, String str, C0654k kVar, C45803a aVar) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(frameLayout, "root");
        C52711k.m112240b(str, "panel");
        C52711k.m112240b(kVar, "fragmentManager");
        super(appCompatActivity);
        this.f118885j = appCompatActivity;
        this.f118886k = frameLayout;
        this.f118887l = str;
        this.f118888m = kVar;
        this.f118889n = aVar;
        DefaultStickerDataManager defaultStickerDataManager = new DefaultStickerDataManager(this.f118885j, new C46355m("livestreaming", true, false, true), null, 4, null);
        this.f118890p = defaultStickerDataManager;
        C12366c cVar = new C12366c();
        cVar.mo23377a(C45805a.class, (C12372e<T>) new C47091j<T>());
        C12361b a = cVar.mo23376a();
        C52711k.m112236a((Object) a, "ObjectContainerBuilder()…     })\n        }.build()");
        mo93023h().mo92973a().mo92536h().mo92506a(new C46024a(mo93023h().mo92973a().mo92533e()));
        C46254o a2 = C46196n.m100338a(this.f118885j, this.f118886k, this.f118885j, mo93023h(), (C46255p) this.f118894t.getValue(), mo93024i(), C45888b.f115906a, a, this.f118888m);
        C52668f<C29252f> fVar = this.f118893s;
        C52711k.m112240b(a2, "stickerView");
        C52711k.m112240b(fVar, "effectPlatform");
        a2.mo92773a((C46256q) new C47087f(this));
        a2.mo92771a((C0199s<StickerTagChangeData>) new C47088g<StickerTagChangeData>(this));
        a2.mo92772a((C45819c) new C47089h(this));
        C47080a aVar2 = new C47080a(this.f118885j, mo93023h(), C45888b.f115906a, true, (C45805a) a.mo23375b(C45805a.class, (String) null));
        mo93001a((C46340k) aVar2);
        mo93004b();
        mo92998a(a2);
    }
}
