package com.p683ss.android.ugc.gamora.recorder.sticker.p2484a;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y;
import android.arch.lifecycle.C0214z;
import android.arch.lifecycle.LiveData;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bef.effectsdk.message.MessageCenter.C2593a;
import com.bytedance.als.C2759d;
import com.bytedance.als.C2762f;
import com.bytedance.als.C2764h;
import com.bytedance.als.C2765i;
import com.bytedance.p780m.C12356a;
import com.bytedance.p780m.C12361b;
import com.google.p1057b.p1058a.C17432q;
import com.p683ss.android.medialib.presenter.C19378e;
import com.p683ss.android.ugc.asve.recorder.camera.C20457b;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.asve.recorder.p1245b.C20426a;
import com.p683ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p683ss.android.ugc.aweme.account.model.C22055c;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.aweme.p2345t.C46776g;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44975am;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44976an;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.shortvideo.senor.ISenorPresenter;
import com.p683ss.android.ugc.aweme.shortvideo.senor.defult.DefaultSenorPresenter;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.C44518a;
import com.p683ss.android.ugc.aweme.sticker.C45805a;
import com.p683ss.android.ugc.aweme.sticker.C45893i;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45806a;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45814b;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2276a.C45809a;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2276a.C45812b;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2276a.C45813c;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45815a;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45816b;
import com.p683ss.android.ugc.aweme.sticker.p2279c.C45846a;
import com.p683ss.android.ugc.aweme.sticker.p2279c.C45847b;
import com.p683ss.android.ugc.aweme.sticker.p2279c.C45847b.C45848a;
import com.p683ss.android.ugc.aweme.sticker.p2279c.C45847b.C45851b;
import com.p683ss.android.ugc.aweme.sticker.p2279c.C45847b.C45854c;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45858a;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45859b;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45861d;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45872c.C45874b;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45872c.C45875c;
import com.p683ss.android.ugc.aweme.sticker.p2283g.C45889c;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2286a.C45909g;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2286a.C45914l;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2286a.C45919q;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2288c.C45928a;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2297f.p2298a.C46024a;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2297f.p2299b.C46030a;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2297f.p2299b.C46031b;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2297f.p2299b.C46032c;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2297f.p2299b.C46033d;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2297f.p2299b.C46034e;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2297f.p2299b.C46035f;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2297f.p2299b.C46037h;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46057f;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.panel.C46254o;
import com.p683ss.android.ugc.aweme.sticker.panel.C46255p;
import com.p683ss.android.ugc.aweme.sticker.panel.C46256q;
import com.p683ss.android.ugc.aweme.sticker.panel.C46256q.C46257a;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46282a;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46296e;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46297f;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46299h;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46352j;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46355m;
import com.p683ss.android.ugc.aweme.sticker.presenter.DefaultStickerDataManager;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.ARStickerHandler;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46304a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46314c;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46319d;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46320e;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46321f;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46323g;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46324h;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46338i;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46339j;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46340k;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46343m;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46346o;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46350p;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.LockStickerHandler;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2310b.p2311a.C46308a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2310b.p2311a.C46309b;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2310b.p2311a.C46310c;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2310b.p2311a.C46311d;
import com.p683ss.android.ugc.aweme.sticker.presenter.p2308a.C46288a;
import com.p683ss.android.ugc.aweme.sticker.presenter.p2308a.C46291c;
import com.p683ss.android.ugc.aweme.sticker.types.p2320a.C46421a;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.backgroundvideo.BackgroundVideoStickerPresenter;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.backgroundvideo.C46456e;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.backgroundvideo.C46457f;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.p2322a.C46436a;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.PixaloopARPresenter;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2326d.C46501a;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.senor.LandmarkARPresenter;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.text.C46541n.C46543b;
import com.p683ss.android.ugc.aweme.sticker.viewmodel.EffectConfigViewModel;
import com.p683ss.android.ugc.aweme.sticker.viewmodel.EffectStickerViewModel;
import com.p683ss.android.ugc.aweme.tools.extract.C47038j;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50051q.C50052a;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50051q.C50053b;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50051q.C50054c;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50051q.C50055d;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.p2485a.C49975a;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.p2485a.C49979d;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.p2485a.C49990g;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.p2485a.C49991h;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.p2485a.C49995j;
import com.p683ss.android.vesdk.C50790w;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k */
public final class C50012k extends C2764h<C50048n> implements C12356a, C50048n {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f125307a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C50012k.class), "stickerDataManager", "getStickerDataManager()Lcom/ss/android/ugc/aweme/sticker/presenter/StickerDataManager;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C50012k.class), "stickerSelectedController", "getStickerSelectedController()Lcom/ss/android/ugc/aweme/sticker/dispatcher/StickerSelectedController;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C50012k.class), "stickerLoader", "getStickerLoader()Lcom/ss/android/ugc/aweme/sticker/presenter/loader/StickerLoader;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C50012k.class), "backgroundVideoProcessor", "getBackgroundVideoProcessor()Lcom/ss/android/ugc/aweme/sticker/types/ar/backgroundvideo/IBackgroundVideoProcessor;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C50012k.class), "stickerChallengeAndReuseResolver", "getStickerChallengeAndReuseResolver()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/IStickerChallengeAndReuseResolver;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C50012k.class), "stickerMusicChangeHandler", "getStickerMusicChangeHandler()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/IStickerMusicChangeHandler;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C50012k.class), "greenScreenEffectHandler", "getGreenScreenEffectHandler()Lcom/ss/android/ugc/aweme/sticker/types/ar/greenscreen/GreenScreenEffectHandler;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C50012k.class), "stickerInteractor", "getStickerInteractor()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/IStickerInteractor;"))};

    /* renamed from: A */
    private final C52668f f125308A;

    /* renamed from: B */
    private final C2765i<C52860x> f125309B;

    /* renamed from: C */
    private final C2765i<Boolean> f125310C;

    /* renamed from: D */
    private final C50046l f125311D;

    /* renamed from: E */
    private boolean f125312E;

    /* renamed from: F */
    private final C49991h f125313F;

    /* renamed from: G */
    private final C52668f f125314G;

    /* renamed from: H */
    private final C52668f f125315H;

    /* renamed from: I */
    private final C52668f f125316I;

    /* renamed from: J */
    private final C52668f f125317J;

    /* renamed from: K */
    private final C52668f f125318K;

    /* renamed from: L */
    private final C50790w f125319L;

    /* renamed from: M */
    private final C12361b f125320M;

    /* renamed from: N */
    private final String f125321N;

    /* renamed from: O */
    private final ArrayList<StickerWrapper> f125322O;

    /* renamed from: b */
    public final AppCompatActivity f125323b;

    /* renamed from: c */
    public final C45004a f125324c;

    /* renamed from: d */
    public final ShortVideoContext f125325d;

    /* renamed from: e */
    public final LiveData<Boolean> f125326e;

    /* renamed from: f */
    public final boolean f125327f;

    /* renamed from: g */
    public final C50003i f125328g;

    /* renamed from: h */
    public final C2765i<Boolean> f125329h;

    /* renamed from: i */
    public final C2765i<Effect> f125330i;

    /* renamed from: j */
    public final C50047m f125331j;

    /* renamed from: k */
    public final C2765i<Boolean> f125332k;

    /* renamed from: l */
    public final C2765i<C50051q> f125333l;

    /* renamed from: m */
    boolean f125334m;

    /* renamed from: n */
    public final C46355m f125335n;

    /* renamed from: o */
    private final C45889c f125336o;

    /* renamed from: p */
    private final C50028l f125337p;

    /* renamed from: q */
    private final C45893i f125338q;

    /* renamed from: r */
    private final String f125339r;

    /* renamed from: s */
    private final EffectStickerViewModel f125340s;

    /* renamed from: t */
    private C46350p f125341t;

    /* renamed from: u */
    private C46324h f125342u;

    /* renamed from: v */
    private C46321f f125343v;

    /* renamed from: w */
    private C46346o f125344w;

    /* renamed from: x */
    private C46296e f125345x;

    /* renamed from: y */
    private final C52668f f125346y;

    /* renamed from: z */
    private final C52668f f125347z;

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k$a */
    public static final class C50014a extends C46030a {

        /* renamed from: a */
        final /* synthetic */ C50012k f125349a;

        C50014a(C50012k kVar) {
            this.f125349a = kVar;
        }

        /* renamed from: a */
        public final boolean mo92549a(String str, Effect effect) {
            C52711k.m112240b(str, "category");
            C52711k.m112240b(effect, "sticker");
            if (TextUtils.isEmpty(this.f125349a.f125325d.f107047Z) || !C52711k.m112239a((Object) this.f125349a.f125325d.f107047Z, (Object) effect.getEffectId())) {
                return effect.isBusiness();
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k$aa */
    static final class C50015aa extends C52712l implements C52670a<C44976an> {

        /* renamed from: a */
        final /* synthetic */ C50012k f125350a;

        C50015aa(C50012k kVar) {
            this.f125350a = kVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C44976an anVar = (C44976an) this.f125350a.mo23370j().mo23375b(C44976an.class, (String) null);
            if (anVar == null) {
                return new C44976an(this.f125350a.f125323b, this.f125350a.f125325d);
            }
            return anVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k$ab */
    static final class C50016ab extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C50012k f125351a;

        C50016ab(C50012k kVar) {
            this.f125351a = kVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f125351a.f125329h.mo7350a(Boolean.valueOf(true));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k$ac */
    static final class C50017ac extends C52712l implements C52670a<C45806a> {

        /* renamed from: a */
        final /* synthetic */ C50012k f125352a;

        C50017ac(C50012k kVar) {
            this.f125352a = kVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C45806a(this.f125352a.mo93023h());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k$b */
    static final class C50018b extends C52712l implements C52671b<Effect, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C50012k f125353a;

        C50018b(C50012k kVar) {
            this.f125353a = kVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Effect effect = (Effect) obj;
            C52711k.m112240b(effect, "it");
            this.f125353a.f125330i.mo7350a(effect);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k$c */
    static final class C50019c extends C52712l implements C52671b<C45816b<?>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C45814b f125354a;

        C50019c(C45814b bVar) {
            this.f125354a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C45816b bVar = (C45816b) obj;
            C52711k.m112240b(bVar, "request");
            this.f125354a.mo92249a(bVar);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k$d */
    static final class C50020d extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C50012k f125355a;

        C50020d(C50012k kVar) {
            this.f125355a = kVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f125355a.f125329h.mo7350a(Boolean.valueOf(false));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k$e */
    static final class C50021e<T> implements C17432q<C46456e> {

        /* renamed from: a */
        final /* synthetic */ C50012k f125356a;

        C50021e(C50012k kVar) {
            this.f125356a = kVar;
        }

        public final /* synthetic */ Object get() {
            return this.f125356a.mo97824x();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k$f */
    static final /* synthetic */ class C50022f extends C52710j implements C52682m<String, String, Integer> {
        C50022f(C20489b bVar) {
            super(2, bVar);
        }

        public final String getName() {
            return "animateImageToPreview";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(C20489b.class);
        }

        public final String getSignature() {
            return "animateImageToPreview(Ljava/lang/String;Ljava/lang/String;)I";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            C52711k.m112240b(str, "p1");
            C52711k.m112240b(str2, "p2");
            return Integer.valueOf(((C20489b) this.receiver).mo43486b(str, str2));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k$g */
    static final class C50023g extends C52712l implements C52671b<String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C47038j f125357a;

        C50023g(C47038j jVar) {
            this.f125357a = jVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            C52711k.m112240b(str, "it");
            C47038j jVar = this.f125357a;
            if (jVar != null) {
                jVar.mo94319a(str);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k$h */
    static final class C50024h<T> implements C17432q<C46254o> {

        /* renamed from: a */
        final /* synthetic */ C50012k f125358a;

        C50024h(C50012k kVar) {
            this.f125358a = kVar;
        }

        public final /* synthetic */ Object get() {
            C46254o c = this.f125358a.mo93006c();
            if (c == null) {
                C52711k.m112234a();
            }
            return c;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k$i */
    static final class C50025i extends C52712l implements C52671b<C45816b<?>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C45814b f125359a;

        C50025i(C45814b bVar) {
            this.f125359a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C45816b bVar = (C45816b) obj;
            C52711k.m112240b(bVar, "it");
            this.f125359a.mo92249a(bVar);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k$j */
    public static final class C50026j implements C46256q {

        /* renamed from: a */
        final /* synthetic */ C50012k f125360a;

        public final void cl_() {
            this.f125360a.f125333l.mo7350a(C50053b.f125388a);
        }

        C50026j(C50012k kVar) {
            this.f125360a = kVar;
        }

        /* renamed from: a */
        public final void mo92779a(View view) {
            C52711k.m112240b(view, "stickerView");
            this.f125360a.f125333l.mo7350a(new C50052a(view));
        }

        /* renamed from: a */
        public final void mo92780a(C46257a aVar) {
            C52711k.m112240b(aVar, "state");
            this.f125360a.f125333l.mo7350a(new C50055d(aVar));
            if (aVar == C46257a.BEFORE_ANIMATE) {
                this.f125360a.f125332k.mo7350a(Boolean.valueOf(true));
            }
        }

        /* renamed from: b */
        public final void mo92781b(C46257a aVar) {
            C52711k.m112240b(aVar, "state");
            this.f125360a.f125333l.mo7350a(new C50054c(aVar));
            if (aVar == C46257a.AFTER_ANIMATE) {
                this.f125360a.f125332k.mo7350a(Boolean.valueOf(false));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k$k */
    static final class C50027k extends C52712l implements C52670a<C46457f> {

        /* renamed from: a */
        final /* synthetic */ C50012k f125361a;

        C50027k(C50012k kVar) {
            this.f125361a = kVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C46457f(this.f125361a.f125323b, this.f125361a.f125324c, this.f125361a.mo97812l(), this.f125361a);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k$l */
    public static final class C50028l extends C46282a {

        /* renamed from: f */
        final /* synthetic */ C50012k f125362f;

        /* renamed from: a */
        public final C46291c mo92995a() {
            return this.f125362f.mo97816p();
        }

        /* renamed from: h */
        public final C46354l mo93023h() {
            return this.f125362f.mo93023h();
        }

        /* renamed from: i */
        public final C45814b mo93024i() {
            return this.f125362f.mo93024i();
        }

        C50028l(C50012k kVar, C0184k kVar2) {
            this.f125362f = kVar;
            super(kVar2);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k$m */
    public static final class C50029m implements C45846a {

        /* renamed from: a */
        final /* synthetic */ C50012k f125363a;

        /* renamed from: a */
        public final void mo92275a() {
            this.f125363a.mo97804I();
        }

        C50029m(C50012k kVar) {
            this.f125363a = kVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k$n */
    public static final class C50030n implements C46501a {

        /* renamed from: a */
        final /* synthetic */ C50012k f125364a;

        C50030n(C50012k kVar) {
            this.f125364a = kVar;
        }

        /* renamed from: a */
        public final void mo93243a(String str) {
            C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
            this.f125364a.f125329h.mo7350a(Boolean.valueOf(false));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k$o */
    public static final class C50031o implements C0199s<C37721a<PanelInfoModel>> {

        /* renamed from: a */
        final /* synthetic */ C50012k f125365a;

        /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k$o$a */
        public static final class C50032a implements C0199s<C37721a<CategoryEffectModel>> {

            /* renamed from: a */
            final /* synthetic */ CategoryEffectModel f125366a;

            /* renamed from: b */
            final /* synthetic */ C50031o f125367b;

            public final /* synthetic */ void onChanged(Object obj) {
                C37721a aVar = (C37721a) obj;
                if (aVar != null) {
                    CategoryEffectModel categoryEffectModel = (CategoryEffectModel) aVar.f96125a;
                    if (categoryEffectModel != null) {
                        C45919q i = this.f125367b.f125365a.mo93023h().mo92973a().mo92537i();
                        String categoryKey = this.f125366a.getCategoryKey();
                        C52711k.m112236a((Object) categoryKey, "it.categoryKey");
                        i.mo92538a(categoryKey, true).removeObserver(this);
                        C52711k.m112236a((Object) categoryEffectModel, "model");
                        List effects = categoryEffectModel.getEffects();
                        C52711k.m112236a((Object) effects, "model.effects");
                        Effect effect = (Effect) C52575l.m112140f(effects);
                        if (effect != null) {
                            this.f125367b.f125365a.f125331j.f125386b.mo7350a(effect);
                            C46354l h = this.f125367b.f125365a.mo93023h();
                            StickerWrapper a = h.mo92973a().mo92532d().mo92510a(effect, null);
                            a.f115785g = true;
                            h.mo92271a(a, null);
                        }
                        if (this.f125367b.f125365a.f125327f && C45861d.m99705a(this.f125367b.f125365a) == null) {
                            this.f125367b.f125365a.f125331j.f125385a.mo7350a(C46057f.m100056a(categoryEffectModel.getEffects()));
                        }
                    }
                }
            }

            C50032a(CategoryEffectModel categoryEffectModel, C50031o oVar) {
                this.f125366a = categoryEffectModel;
                this.f125367b = oVar;
            }
        }

        C50031o(C50012k kVar) {
            this.f125365a = kVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            C37721a aVar = (C37721a) obj;
            if (aVar != null) {
                PanelInfoModel panelInfoModel = (PanelInfoModel) aVar.f96125a;
                if (panelInfoModel != null) {
                    C52711k.m112236a((Object) panelInfoModel, "data");
                    CategoryEffectModel categoryEffectModel = panelInfoModel.getCategoryEffectModel();
                    C52711k.m112236a((Object) categoryEffectModel, "it");
                    CharSequence categoryKey = categoryEffectModel.getCategoryKey();
                    if (categoryKey == null || categoryKey.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!(!z)) {
                        categoryEffectModel = null;
                    }
                    if (categoryEffectModel != null) {
                        this.f125365a.mo93023h().mo92973a().mo92537i().mo92542c().removeObserver(this);
                        C45919q i = this.f125365a.mo93023h().mo92973a().mo92537i();
                        String categoryKey2 = categoryEffectModel.getCategoryKey();
                        C52711k.m112236a((Object) categoryKey2, "it.categoryKey");
                        i.mo92538a(categoryKey2, true).observe(this.f125365a.mo97811k(), new C50032a(categoryEffectModel, this));
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k$p */
    static final class C50033p extends C52712l implements C52670a<C46436a> {

        /* renamed from: a */
        final /* synthetic */ C50012k f125368a;

        C50033p(C50012k kVar) {
            this.f125368a = kVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C46436a(this.f125368a.f125323b, new C52682m<String, String, Integer>(this.f125368a.mo97812l()) {
                public final String getName() {
                    return "animateImageToPreview";
                }

                public final C52761d getOwner() {
                    return C52728w.m112245a(C20489b.class);
                }

                public final String getSignature() {
                    return "animateImageToPreview(Ljava/lang/String;Ljava/lang/String;)I";
                }

                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    String str = (String) obj;
                    String str2 = (String) obj2;
                    C52711k.m112240b(str, "p1");
                    C52711k.m112240b(str2, "p2");
                    return Integer.valueOf(((C20489b) this.receiver).mo43486b(str, str2));
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k$q */
    static final class C50035q implements C50790w {

        /* renamed from: a */
        final /* synthetic */ C50012k f125369a;

        C50035q(C50012k kVar) {
            this.f125369a = kVar;
        }

        /* renamed from: a */
        public final void mo43759a(boolean z, boolean z2) {
            if (z && !(this.f125369a.f125328g.f125281a instanceof LandmarkARPresenter)) {
                Boolean bool = (Boolean) this.f125369a.f125326e.getValue();
                if (bool == null) {
                    bool = Boolean.valueOf(false);
                }
                C52711k.m112236a((Object) bool, "nativeInitLiveData.value ?: false");
                boolean booleanValue = bool.booleanValue();
                C50003i iVar = this.f125369a.f125328g;
                LandmarkARPresenter landmarkARPresenter = new LandmarkARPresenter(this.f125369a.f125323b, this.f125369a.mo97811k(), this.f125369a.mo97814n(), this.f125369a.mo97813m(), booleanValue, z2);
                iVar.mo93022a(landmarkARPresenter, true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k$r */
    static final class C50036r<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C50012k f125370a;

        C50036r(C50012k kVar) {
            this.f125370a = kVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            if (C52711k.m112239a((Object) (Boolean) obj, (Object) Boolean.valueOf(true))) {
                C50012k kVar = this.f125370a;
                Effect o = kVar.mo97815o();
                if (o != null) {
                    if (TextUtils.equals(o.getEffectId(), kVar.f125325d.f107047Z)) {
                        boolean isEmpty = TextUtils.isEmpty(kVar.f125325d.f107105bd);
                        boolean isEmpty2 = TextUtils.isEmpty(kVar.f125325d.f107106be);
                        if (!isEmpty || !isEmpty2) {
                            C0209x a = C0214z.m440a((FragmentActivity) kVar.f125323b).mo359a(EffectConfigViewModel.class);
                            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…figViewModel::class.java)");
                            EffectConfigViewModel effectConfigViewModel = (EffectConfigViewModel) a;
                            C45846a mVar = new C50029m(kVar);
                            if (!isEmpty && !isEmpty2) {
                                effectConfigViewModel.mo93413a(mVar);
                                return;
                            } else if (!isEmpty) {
                                effectConfigViewModel.mo93414b(mVar);
                                return;
                            } else {
                                if (!isEmpty2) {
                                    effectConfigViewModel.mo93415c(mVar);
                                }
                                return;
                            }
                        }
                    }
                    kVar.mo97804I();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k$s */
    static final class C50037s<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C50012k f125371a;

        /* renamed from: b */
        final /* synthetic */ EffectStickerViewModel f125372b;

        C50037s(C50012k kVar, EffectStickerViewModel effectStickerViewModel) {
            this.f125371a = kVar;
            this.f125372b = effectStickerViewModel;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            if (C52711k.m112239a((Object) (Boolean) obj, (Object) Boolean.valueOf(true))) {
                C50012k kVar = this.f125371a;
                C45893i a = this.f125372b.mo93416a();
                C52711k.m112236a((Object) a, "viewModel.recordStickerContext");
                kVar.f125328g.mo93022a(new DefaultSenorPresenter(kVar.f125323b, kVar.f125323b, kVar.mo97813m(), a.mo91262b()), true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k$t */
    static final class C50038t implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Effect f125373a;

        /* renamed from: b */
        final /* synthetic */ C50012k f125374b;

        C50038t(Effect effect, C50012k kVar) {
            this.f125373a = effect;
            this.f125374b = kVar;
        }

        public final void run() {
            int i;
            if (C45859b.m99699a(this.f125374b.mo93023h(), this.f125373a)) {
                C46354l h = this.f125374b.mo93023h();
                C52711k.m112240b(h, "$this$currentChildPosition");
                C46299h hVar = (C46299h) h.mo92989g().mo93016c().getValue();
                if (hVar != null) {
                    i = hVar.f116796b;
                } else {
                    i = 0;
                }
            } else {
                i = -1;
            }
            this.f125374b.mo93024i().mo92249a((C45816b<T>) C45858a.m99692a(this.f125373a, i, C45815a.RECOVER, (StickerWrapper) null, (Bundle) null, (C45874b) null, (C45875c) null, 60, (Object) null));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k$u */
    public static final class C50039u implements C45846a {

        /* renamed from: a */
        final /* synthetic */ C50012k f125375a;

        /* renamed from: b */
        final /* synthetic */ C49997c f125376b;

        /* renamed from: a */
        public final void mo92275a() {
            this.f125376b.mo97773a(this.f125375a.f125325d.f107047Z);
            this.f125376b.mo97774b();
        }

        C50039u(C50012k kVar, C49997c cVar) {
            this.f125375a = kVar;
            this.f125376b = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k$v */
    static final class C50040v<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C50012k f125377a;

        C50040v(C50012k kVar) {
            this.f125377a = kVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null && bool.booleanValue()) {
                C50012k kVar = this.f125377a;
                if (kVar.f125334m) {
                    kVar.f125334m = false;
                    C49997c y = kVar.mo97825y();
                    boolean isEmpty = TextUtils.isEmpty(kVar.f125325d.f107105bd);
                    boolean isEmpty2 = TextUtils.isEmpty(kVar.f125325d.f107106be);
                    if (!isEmpty || !isEmpty2) {
                        C0209x a = C0214z.m440a((FragmentActivity) kVar.f125323b).mo359a(EffectConfigViewModel.class);
                        C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…figViewModel::class.java]");
                        EffectConfigViewModel effectConfigViewModel = (EffectConfigViewModel) a;
                        C45846a uVar = new C50039u(kVar, y);
                        if (!isEmpty && !isEmpty2) {
                            effectConfigViewModel.mo93413a(uVar);
                        } else if (!isEmpty) {
                            effectConfigViewModel.mo93414b(uVar);
                        } else if (!isEmpty2) {
                            effectConfigViewModel.mo93415c(uVar);
                        }
                    } else {
                        y.mo97773a(kVar.f125325d.f107047Z);
                        y.mo97774b();
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k$w */
    static final class C50041w extends C52712l implements C52670a<C49997c> {

        /* renamed from: a */
        final /* synthetic */ C50012k f125378a;

        C50041w(C50012k kVar) {
            this.f125378a = kVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C49998d dVar = (C49998d) this.f125378a.mo23370j().mo23375b(C49998d.class, (String) null);
            if (dVar == null) {
                dVar = new C49973a();
            }
            return dVar.mo97771a(this.f125378a);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k$x */
    static final class C50042x extends C52712l implements C52670a<DefaultStickerDataManager> {

        /* renamed from: a */
        final /* synthetic */ C50012k f125379a;

        C50042x(C50012k kVar) {
            this.f125379a = kVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            DefaultStickerDataManager defaultStickerDataManager = new DefaultStickerDataManager(this.f125379a.f125323b, this.f125379a.f125335n, null, 4, null);
            return defaultStickerDataManager;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k$y */
    static final class C50043y extends C52712l implements C52670a<C49990g> {

        /* renamed from: a */
        final /* synthetic */ C50012k f125380a;

        C50043y(C50012k kVar) {
            this.f125380a = kVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C49990g gVar = (C49990g) this.f125380a.mo23370j().mo23375b(C49990g.class, (String) null);
            if (gVar == null) {
                return new C49990g(this.f125380a.f125325d, this.f125380a);
            }
            return gVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.k$z */
    static final class C50044z extends C52712l implements C52670a<C46288a> {

        /* renamed from: a */
        final /* synthetic */ C50012k f125381a;

        C50044z(C50012k kVar) {
            this.f125381a = kVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C46288a(new C52688s<Integer, Integer, String, Effect, Boolean, Integer>(this) {

                /* renamed from: a */
                final /* synthetic */ C50044z f125382a;

                {
                    this.f125382a = r1;
                }

                /* JADX WARNING: Code restructure failed: missing block: B:3:0x002a, code lost:
                    if (r7 == null) goto L_0x002f;
                 */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ java.lang.Object mo58987a(java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
                    /*
                        r6 = this;
                        java.lang.Number r7 = (java.lang.Number) r7
                        int r3 = r7.intValue()
                        java.lang.Number r8 = (java.lang.Number) r8
                        int r2 = r8.intValue()
                        r1 = r9
                        java.lang.String r1 = (java.lang.String) r1
                        com.ss.android.ugc.effectmanager.effect.model.Effect r10 = (com.p683ss.android.ugc.effectmanager.effect.model.Effect) r10
                        java.lang.Boolean r11 = (java.lang.Boolean) r11
                        boolean r5 = r11.booleanValue()
                        java.lang.String r7 = "filPath"
                        p2628d.p2639f.p2641b.C52711k.m112240b(r1, r7)
                        com.ss.android.ugc.gamora.recorder.sticker.a.k$z r7 = r6.f125382a
                        com.ss.android.ugc.gamora.recorder.sticker.a.k r7 = r7.f125381a
                        com.ss.android.ugc.asve.recorder.effect.b r0 = r7.mo97812l()
                        if (r10 == 0) goto L_0x002f
                        java.lang.String r7 = r10.getExtra()
                        if (r7 != 0) goto L_0x002d
                        goto L_0x002f
                    L_0x002d:
                        r4 = r7
                        goto L_0x0032
                    L_0x002f:
                        java.lang.String r7 = ""
                        goto L_0x002d
                    L_0x0032:
                        int r7 = r0.mo43446a(r1, r2, r3, r4, r5)
                        java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50012k.C50044z.C500451.mo58987a(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public C46436a mo97796A() {
        return (C46436a) this.f125317J.getValue();
    }

    /* renamed from: B */
    public final C49999e mo97797B() {
        return (C49999e) this.f125318K.getValue();
    }

    /* renamed from: h */
    public final C46354l mo93023h() {
        return (C46354l) this.f125346y.getValue();
    }

    /* renamed from: i */
    public final C45814b mo93024i() {
        return (C45814b) this.f125347z.getValue();
    }

    /* renamed from: j */
    public final C12361b mo23370j() {
        return this.f125320M;
    }

    /* renamed from: p */
    public final C46291c mo97816p() {
        return (C46291c) this.f125308A.getValue();
    }

    /* renamed from: x */
    public final C46456e mo97824x() {
        return (C46456e) this.f125314G.getValue();
    }

    /* renamed from: y */
    public final C49997c mo97825y() {
        return (C49997c) this.f125315H.getValue();
    }

    /* renamed from: z */
    public final C50000f mo97826z() {
        return (C50000f) this.f125316I.getValue();
    }

    /* renamed from: M */
    private final ASCameraView m107905M() {
        return this.f125324c.mo91307M();
    }

    /* renamed from: O */
    private final C50030n m107907O() {
        return new C50030n(this);
    }

    /* renamed from: F */
    public final void mo97801F() {
        this.f125309B.mo7350a(C52860x.f131107a);
    }

    /* renamed from: H */
    public final void mo97803H() {
        this.f125328g.mo97794b();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2759d mo7353a() {
        return this;
    }

    /* renamed from: c */
    public final C46254o mo93006c() {
        return this.f125337p.mo93006c();
    }

    /* renamed from: d */
    public final SafeHandler mo93007d() {
        return this.f125337p.mo93007d();
    }

    /* renamed from: k */
    public final C0184k mo97811k() {
        return this.f125323b;
    }

    /* renamed from: q */
    public final C2762f<Boolean> mo97817q() {
        return this.f125329h;
    }

    /* renamed from: r */
    public final C2762f<Effect> mo97818r() {
        return this.f125330i;
    }

    /* renamed from: s */
    public final C2762f<C52860x> mo97819s() {
        return this.f125309B;
    }

    /* renamed from: t */
    public final C2762f<Boolean> mo97820t() {
        return this.f125310C;
    }

    /* renamed from: u */
    public final C50050p mo97821u() {
        return this.f125331j;
    }

    /* renamed from: v */
    public final C2762f<Boolean> mo97822v() {
        return this.f125332k;
    }

    /* renamed from: w */
    public final C50049o mo97823w() {
        return this.f125311D;
    }

    /* renamed from: C */
    public final FaceStickerBean mo97798C() {
        return C46057f.m100055a(mo97815o());
    }

    /* renamed from: D */
    public final AVChallenge mo97799D() {
        C46321f fVar = this.f125343v;
        if (fVar != null) {
            return fVar.f116878a;
        }
        return null;
    }

    /* renamed from: J */
    public final void mo97805J() {
        mo97812l().mo43470a((String) null);
    }

    /* renamed from: K */
    public final void mo97806K() {
        C46350p pVar = this.f125341t;
        if (!(pVar == null || pVar.f116942a == null)) {
            pVar.f116943b.mo43286a();
        }
    }

    public final void bN_() {
        super.bN_();
        mo97812l().mo43469a(this.f125319L);
    }

    public final void bO_() {
        super.bO_();
        mo97812l().mo43494b(this.f125319L);
    }

    /* renamed from: l */
    public final C20489b mo97812l() {
        return m107905M().getEffectController();
    }

    /* renamed from: m */
    public final C20457b mo97813m() {
        return m107905M().getCameraController();
    }

    /* renamed from: n */
    public final C20426a mo97814n() {
        return m107905M().getMediaController();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final Effect mo97815o() {
        return (Effect) this.f125313F.f125260a.getValue();
    }

    /* renamed from: t_ */
    public final void mo7358t_() {
        super.mo7358t_();
        m107909e(true);
        this.f125328g.mo97793a();
    }

    /* renamed from: E */
    public final void mo97800E() {
        EffectStickerViewModel effectStickerViewModel = this.f125340s;
        C45893i a = effectStickerViewModel.mo93416a();
        C52711k.m112236a((Object) a, "viewModel\n            .recordStickerContext");
        a.mo91263c().observe(this.f125323b, new C50037s(this, effectStickerViewModel));
    }

    /* renamed from: G */
    public final void mo97802G() {
        mo93023h().mo92973a().mo92537i().mo92542c().observe(mo97811k(), new C50031o(this));
    }

    /* renamed from: I */
    public final void mo97804I() {
        Effect o = mo97815o();
        if (o != null) {
            mo93007d().post(new C50038t(o, this));
        }
    }

    /* renamed from: L */
    public final void mo97807L() {
        C45893i a = this.f125340s.mo93416a();
        C52711k.m112236a((Object) a, "effectStickerViewModel\n …    .recordStickerContext");
        a.mo91260a().observe(this.f125323b, new C50036r(this));
    }

    public final void bM_() {
        super.bM_();
        if (!C46059g.m100080d(C45861d.m99705a(this))) {
            m107909e(false);
        }
    }

    /* renamed from: e */
    public final void mo93008e() {
        C46346o oVar = this.f125344w;
        if (oVar != null && C46059g.m100080d(oVar.f116935a)) {
            C46296e eVar = oVar.f116939e;
            if (eVar != null && !eVar.mo91212c()) {
                oVar.f116937c = true;
            }
        }
    }

    /* renamed from: u_ */
    public final void mo7359u_() {
        super.mo7359u_();
        mo97803H();
        if (C46059g.m100080d(C45861d.m99705a(this))) {
            m107909e(false);
        }
    }

    /* renamed from: a */
    public final void mo92999a(C46296e eVar) {
        this.f125345x = eVar;
    }

    /* renamed from: a */
    private void m107908a(C46340k kVar) {
        C52711k.m112240b(kVar, "handler");
        this.f125337p.mo93001a(kVar);
    }

    /* renamed from: e */
    private final void m107909e(boolean z) {
        C49991h hVar;
        C20489b l = mo97812l();
        if (z) {
            hVar = this.f125313F;
        } else {
            hVar = null;
        }
        l.mo43461a((C2593a) hVar);
    }

    /* renamed from: c */
    public final void mo97809c(boolean z) {
        this.f125310C.mo7350a(Boolean.valueOf(true));
    }

    /* renamed from: a */
    public final C46340k mo92996a(C52671b<? super C46340k, Boolean> bVar) {
        C52711k.m112240b(bVar, "predicate");
        return this.f125337p.mo92996a(bVar);
    }

    /* renamed from: b */
    public final void mo93005b(boolean z) {
        C46346o oVar = this.f125344w;
        if (oVar != null) {
            if (!z) {
                C19378e a = oVar.f116938d.mo43448a();
                if (a != null) {
                    a.mo40427b();
                }
            } else if (oVar.f116936b == 1) {
                C19378e a2 = oVar.f116938d.mo43448a();
                if (a2 != null) {
                    a2.mo40424a();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo92998a(C46254o oVar) {
        C52711k.m112240b(oVar, "stickerView");
        this.f125337p.mo92998a(oVar);
        oVar.mo92773a((C46256q) new C50026j(this));
    }

    /* renamed from: d */
    public final void mo97810d(boolean z) {
        Effect o = mo97815o();
        String str = this.f125325d.f107112e;
        if (o != null && o.getTags() != null && !TextUtils.isEmpty(str) && o.getTags().contains("strong_beat")) {
            String a = C39629l.m88232a().mo58585p().mo80705a(str);
            if (!new File(a).exists()) {
                a = "";
            }
            mo97812l().mo43470a(a);
            if (z) {
                this.f125330i.mo7350a(o);
            }
        }
    }

    /* renamed from: a */
    public final void mo93003a(boolean z) {
        C46346o oVar = this.f125344w;
        if (oVar != null && C46059g.m100080d(oVar.f116935a)) {
            if (z) {
                C19378e a = oVar.f116938d.mo43448a();
                if (a != null) {
                    a.mo40427b();
                }
            }
            oVar.f116937c = false;
            if (oVar.f116936b == 1) {
                C19378e a2 = oVar.f116938d.mo43448a();
                if (a2 != null) {
                    a2.mo40424a();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo93002a(String str, String str2, String str3) {
        C46346o oVar = this.f125344w;
        if (oVar != null && C46059g.m100080d(oVar.f116935a)) {
            oVar.f116937c = false;
            if (oVar.f116936b == 1) {
                C19378e a = oVar.f116938d.mo43448a();
                if (a != null) {
                    a.mo40424a();
                }
            }
            C19378e a2 = oVar.f116938d.mo43448a();
            if (a2 != null) {
                a2.mo40427b();
            }
        }
    }

    /* renamed from: a */
    public final void mo97808a(C46543b bVar, FrameLayout frameLayout, C52670a<? extends ViewGroup> aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C52711k.m112240b(bVar, "onEffectTvShow");
        C52711k.m112240b(frameLayout, "scanModuleContainer");
        C47038j O = this.f125324c.mo91309O();
        C46354l h = mo93023h();
        C45814b i = mo93024i();
        C46254o c = mo93006c();
        if (c != null) {
            C46255p f = c.mo92851f();
            C46324h hVar = new C46324h(this.f125323b, h, this.f125339r, this.f125321N, this.f125322O, frameLayout, mo97812l(), mo97816p(), new C46310c(this.f125325d));
            this.f125342u = hVar;
            C46321f fVar = new C46321f();
            this.f125343v = fVar;
            if (h instanceof DefaultStickerDataManager) {
                ((DefaultStickerDataManager) h).f116749a = this.f125342u;
            }
            m107908a((C46340k) this.f125313F);
            m107908a((C46340k) new C46339j(new C50018b(this)));
            C46324h hVar2 = this.f125342u;
            if (hVar2 != null) {
                m107908a((C46340k) hVar2);
            }
            m107908a((C46340k) fVar);
            m107908a((C46340k) new C46319d(new C46309b(this.f125325d), C46776g.f118133a));
            AppCompatActivity appCompatActivity = this.f125323b;
            C46255p pVar = f;
            C45889c cVar = this.f125336o;
            C45814b bVar2 = i;
            C45805a aVar2 = (C45805a) mo23370j().mo23373a(C45805a.class, (String) null);
            C46354l lVar = h;
            C46320e eVar = new C46320e(appCompatActivity, h, cVar, aVar2, h.mo92992j().f116952d);
            m107908a((C46340k) eVar);
            m107908a((C46340k) new C46421a(this.f125323b, lVar, mo97812l()));
            m107908a((C46340k) new C46323g(this.f125323b, mo97812l()));
            m107908a((C46340k) new C46338i());
            if (pVar.f116708i) {
                m107908a((C46340k) new LockStickerHandler(this.f125323b, lVar, new C50019c(bVar2), new C50020d(this)));
            }
            BackgroundVideoStickerPresenter backgroundVideoStickerPresenter = new BackgroundVideoStickerPresenter(this.f125323b, pVar.f116706g, new C50021e(this), m107907O(), new C46308a(this.f125325d), this.f125325d);
            m107908a((C46340k) backgroundVideoStickerPresenter);
            AppCompatActivity appCompatActivity2 = this.f125323b;
            String str = this.f125339r;
            PixaloopARPresenter pixaloopARPresenter = new PixaloopARPresenter(appCompatActivity2, str, pVar.f116706g, new C50022f(mo97812l()), m107907O(), new C46311d(this.f125325d), new C50023g(O), this.f125325d);
            m107908a((C46340k) pixaloopARPresenter);
            m107908a((C46340k) mo97796A());
            if (aVar != null) {
                C46304a aVar3 = new C46304a(this.f125323b, lVar, this.f125339r, mo97812l(), aVar, bVar);
                m107908a((C46340k) aVar3);
            }
            ARStickerHandler aRStickerHandler = new ARStickerHandler(this.f125323b, mo97811k(), mo97813m(), mo97812l(), this.f125326e, this.f125328g);
            m107908a((C46340k) aRStickerHandler);
            m107908a((C46340k) new C46314c(this.f125323b, mo97813m(), this.f125326e, this.f125328g));
            this.f125344w = new C46346o(mo97812l(), this.f125345x);
            C46346o oVar = this.f125344w;
            if (oVar != null) {
                m107908a((C46340k) oVar);
            }
            C20426a n = mo97814n();
            C0209x a = C0214z.m440a((FragmentActivity) this.f125323b).mo359a(ShortVideoContextViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java]");
            C0198r e = ((ShortVideoContextViewModel) a).mo86394e();
            C52711k.m112236a((Object) e, "ViewModelProviders.of(ac…::class.java].isRecording");
            C46350p pVar2 = new C46350p(n, e);
            this.f125341t = pVar2;
            m107908a((C46340k) pVar2);
            m107908a((C46340k) new C46343m(this.f125325d));
            C22055c e2 = C39629l.m88232a().mo58593x().mo74285e();
            boolean z5 = false;
            if (e2 == null || !e2.mo46166j()) {
                z = false;
            } else {
                z = true;
            }
            C45914l f2 = lVar.mo92973a().mo92534f();
            C46030a hVar3 = new C46037h();
            ShortVideoContext shortVideoContext = this.f125325d;
            if (shortVideoContext.mo86365f() || shortVideoContext.mo86362d()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                f2.mo92517a(hVar3);
            }
            C46030a eVar2 = new C46034e();
            ShortVideoContext shortVideoContext2 = this.f125325d;
            if (!this.f125312E || shortVideoContext2.mo86366g() || shortVideoContext2.mo86367h() || shortVideoContext2.mo86362d()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                f2.mo92517a(eVar2);
            }
            C46030a cVar2 = new C46032c();
            ShortVideoContext shortVideoContext3 = this.f125325d;
            if (shortVideoContext3.mo86366g() || shortVideoContext3.mo86365f() || shortVideoContext3.mo86367h() || shortVideoContext3.f107122o || shortVideoContext3.mo86362d()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                f2.mo92517a(cVar2);
            }
            C46030a bVar3 = new C46031b();
            ShortVideoContext shortVideoContext4 = this.f125325d;
            if (shortVideoContext4.mo86365f() || shortVideoContext4.mo86366g() || shortVideoContext4.f107122o || shortVideoContext4.mo86362d()) {
                z5 = true;
            }
            if (z5) {
                f2.mo92517a(bVar3);
            }
            C46030a dVar = new C46033d();
            if (!z) {
                f2.mo92517a(dVar);
            }
            C46030a aVar4 = C46035f.f116170a;
            if (this.f125325d.f107122o) {
                f2.mo92517a(aVar4);
            }
            C46030a aVar5 = new C45928a();
            if (this.f125325d.mo86362d()) {
                f2.mo92517a(aVar5);
            }
            C46030a aVar6 = new C50014a(this);
            if (C52711k.m112239a((Object) "1", (Object) this.f125325d.f107072aX)) {
                f2.mo92517a(aVar6);
            }
            bVar2.mo92248a((C45812b) new C45809a(this.f125323b, new C50024h(this), this.f125325d, new C50025i(bVar2)));
            bVar2.mo92248a((C45812b) new C45813c(lVar, this.f125336o));
            this.f125337p.mo93004b();
            GameDuetResource gameDuetResource = this.f125340s.mo93416a().mo91264d().f107097aw;
            if (!(gameDuetResource == null || gameDuetResource.gameSticker == null || C44518a.m97421e(gameDuetResource.gameSticker))) {
                C45861d.m99707a((C46297f) this, gameDuetResource.gameSticker);
            }
            C0209x a2 = C0214z.m440a((FragmentActivity) this.f125323b).mo359a(ShortVideoContextViewModel.class);
            C52711k.m112236a((Object) a2, "ViewModelProviders.of(ac…extViewModel::class.java)");
            ((ShortVideoContextViewModel) a2).mo86398g().observe(this, new C50040v(this));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: a */
    public final void mo92997a(int i, int i2, int i3, String str) {
        this.f125337p.mo92997a(i, i2, i3, str);
    }

    private C50012k(C12361b bVar, String str, ArrayList<StickerWrapper> arrayList, C46355m mVar) {
        C52711k.m112240b(bVar, "diContainer");
        C52711k.m112240b(mVar, "configure");
        this.f125320M = bVar;
        this.f125321N = str;
        this.f125322O = arrayList;
        this.f125335n = mVar;
        this.f125323b = (AppCompatActivity) mo23370j().mo23373a(AppCompatActivity.class, (String) null);
        this.f125336o = (C45889c) mo23370j().mo23373a(C45889c.class, (String) null);
        this.f125324c = (C45004a) mo23370j().mo23373a(C45004a.class, (String) null);
        this.f125337p = new C50028l(this, mo97811k());
        C50048n nVar = this;
        this.f125338q = new C44975am(this.f125323b, nVar);
        ShortVideoContext d = this.f125338q.mo91264d();
        C52711k.m112236a((Object) d, "recordStickerContext.shortVideoContext()");
        this.f125325d = d;
        this.f125339r = this.f125335n.f116949a;
        C0209x a = C0214z.m440a((FragmentActivity) this.f125323b).mo359a(EffectStickerViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…kerViewModel::class.java)");
        this.f125340s = (EffectStickerViewModel) a;
        this.f125327f = true;
        this.f125328g = new C50003i();
        this.f125346y = C52732g.m112286a(C52757k.NONE, new C50042x(this));
        this.f125347z = C52732g.m112286a(C52757k.NONE, new C50017ac(this));
        this.f125308A = C52732g.m112286a(C52757k.NONE, new C50044z(this));
        this.f125329h = new C2765i<>();
        this.f125330i = new C2765i<>();
        this.f125309B = new C2765i<>();
        this.f125310C = new C2765i<>();
        this.f125331j = new C50047m();
        this.f125332k = new C2765i<>();
        this.f125333l = new C2765i<>();
        this.f125311D = new C50046l();
        C50001g gVar = (C50001g) mo23370j().mo23375b(C50001g.class, (String) null);
        if (gVar == null) {
            gVar = new C49995j(mo23370j());
        }
        C46352j a2 = gVar.mo97790a(nVar, this.f125311D);
        this.f125337p.f116767b = new C49975a(this.f125323b, this.f125324c, this.f125311D, a2);
        this.f125340s.f117604a = this.f125338q;
        C45893i a3 = this.f125340s.mo93416a();
        C52711k.m112236a((Object) a3, "effectStickerViewModel.recordStickerContext");
        LiveData<Boolean> a4 = a3.mo91260a();
        C52711k.m112236a((Object) a4, "effectStickerViewModel.r…ickerContext.isNativeInit");
        this.f125326e = a4;
        C0210y a5 = C0214z.m440a((FragmentActivity) this.f125323b);
        C52711k.m112236a((Object) a5, "ViewModelProviders.of(activity)");
        this.f125326e.observe(mo97811k(), new C0199s<Boolean>(this) {

            /* renamed from: a */
            final /* synthetic */ C50012k f125348a;

            {
                this.f125348a = r1;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                    C50003i iVar = this.f125348a.f125328g;
                    boolean booleanValue = bool.booleanValue();
                    ISenorPresenter iSenorPresenter = iVar.f125281a;
                    if (iSenorPresenter != null) {
                        iSenorPresenter.mo90411a(booleanValue);
                    }
                }
            }
        });
        C45909g h = mo93023h().mo92973a().mo92536h();
        if (this.f125335n.f116952d) {
            h.mo92506a(new C46024a(mo93023h().mo92973a().mo92533e()));
        }
        if (!TextUtils.isEmpty(this.f125325d.f107105bd) || !TextUtils.isEmpty(this.f125325d.f107106be)) {
            mo93023h().mo92983a(false);
        }
        EffectConfigViewModel effectConfigViewModel = (EffectConfigViewModel) a5.mo359a(EffectConfigViewModel.class);
        FragmentActivity fragmentActivity = this.f125323b;
        ShortVideoContext shortVideoContext = this.f125325d;
        C20489b l = mo97812l();
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(shortVideoContext, "shortVideoContext");
        C52711k.m112240b(l, "effectProcessor");
        C45847b bVar2 = new C45847b(fragmentActivity, shortVideoContext, l, effectConfigViewModel);
        EffectConfigViewModel effectConfigViewModel2 = bVar2.f115865c;
        if (effectConfigViewModel2 != null) {
            LiveData liveData = effectConfigViewModel2.f117601a;
            if (liveData != null) {
                liveData.observe(bVar2.f115863a, new C45848a(bVar2));
            }
        }
        EffectConfigViewModel effectConfigViewModel3 = bVar2.f115865c;
        if (effectConfigViewModel3 != null) {
            LiveData liveData2 = effectConfigViewModel3.f117602b;
            if (liveData2 != null) {
                liveData2.observe(bVar2.f115863a, new C45851b(bVar2));
            }
        }
        EffectConfigViewModel effectConfigViewModel4 = bVar2.f115865c;
        if (effectConfigViewModel4 != null) {
            LiveData liveData3 = effectConfigViewModel4.f117603c;
            if (liveData3 != null) {
                liveData3.observe(bVar2.f115863a, new C45854c(bVar2));
            }
        }
        C49996b bVar3 = (C49996b) mo23370j().mo23375b(C49996b.class, (String) null);
        if (bVar3 == null) {
            bVar3 = new C49979d(mo23370j());
        }
        this.f125312E = true;
        m107908a((C46340k) bVar3.mo97779a(nVar, this.f125311D, mo97816p()));
        m107908a((C46340k) bVar3.mo97780b(nVar, this.f125311D, mo97816p()));
        C49991h hVar = new C49991h(this.f125323b, this.f125325d, nVar, this.f125336o, new C50016ab(this));
        this.f125313F = hVar;
        this.f125314G = C52732g.m112285a(new C50027k(this));
        this.f125315H = C52732g.m112285a(new C50041w(this));
        this.f125316I = C52732g.m112285a(new C50015aa(this));
        this.f125317J = C52732g.m112285a(new C50033p(this));
        this.f125318K = C52732g.m112285a(new C50043y(this));
        this.f125319L = new C50035q(this);
        this.f125334m = true;
    }

    public /* synthetic */ C50012k(C12361b bVar, String str, ArrayList arrayList, C46355m mVar, int i, C52707g gVar) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            arrayList = null;
        }
        if ((i & 8) != 0) {
            mVar = new C46355m("default", true, false, false, 12, null);
        }
        this(bVar, str, arrayList, mVar);
    }
}
