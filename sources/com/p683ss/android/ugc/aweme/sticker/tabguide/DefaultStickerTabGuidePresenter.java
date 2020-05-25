package com.p683ss.android.ugc.aweme.sticker.tabguide;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0200t;
import android.os.Handler;
import android.os.Looper;
import android.support.p030v4.p038f.C0794k;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46318d;
import com.p683ss.android.ugc.aweme.sticker.tabguide.p2318a.C46415a;
import com.p683ss.android.ugc.aweme.sticker.tabguide.p2318a.C46417b;
import com.p683ss.android.ugc.aweme.sticker.tabguide.p2319b.C46418a;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.sticker.tabguide.DefaultStickerTabGuidePresenter */
public final class DefaultStickerTabGuidePresenter implements IStickerTabGuidePresenter<C0794k<EffectCategoryModel, Object>> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f117091a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DefaultStickerTabGuidePresenter.class), "mMainHandler", "getMMainHandler()Landroid/os/Handler;"))};

    /* renamed from: c */
    public static final C46412a f117092c = new C46412a(null);

    /* renamed from: b */
    public final ViewGroup f117093b;

    /* renamed from: d */
    private C0794k<EffectCategoryModel, Object> f117094d;

    /* renamed from: e */
    private C46418a f117095e;

    /* renamed from: f */
    private boolean f117096f;

    /* renamed from: g */
    private final C52668f f117097g;

    /* renamed from: h */
    private final C46417b<C0794k<EffectCategoryModel, Object>> f117098h;

    /* renamed from: com.ss.android.ugc.aweme.sticker.tabguide.DefaultStickerTabGuidePresenter$a */
    public static final class C46412a {
        private C46412a() {
        }

        public /* synthetic */ C46412a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.tabguide.DefaultStickerTabGuidePresenter$b */
    static final class C46413b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C46418a f117099a;

        C46413b(C46418a aVar) {
            this.f117099a = aVar;
        }

        public final void run() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.tabguide.DefaultStickerTabGuidePresenter$c */
    static final class C46414c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DefaultStickerTabGuidePresenter f117100a;

        /* renamed from: b */
        final /* synthetic */ C46418a f117101b;

        C46414c(DefaultStickerTabGuidePresenter defaultStickerTabGuidePresenter, C46418a aVar) {
            this.f117100a = defaultStickerTabGuidePresenter;
            this.f117101b = aVar;
        }

        public final void run() {
            this.f117101b.mo93137a(this.f117100a.f117093b);
        }
    }

    /* renamed from: a */
    private final Handler m100771a() {
        return (Handler) this.f117097g.getValue();
    }

    /* renamed from: a */
    public final void mo92763a(FaceStickerBean faceStickerBean, String str) {
    }

    /* renamed from: a */
    public final void mo91208a(C46315a aVar) {
        C52711k.m112240b(aVar, "session");
    }

    /* renamed from: a */
    public final void mo91209a(C46318d dVar) {
        C52711k.m112240b(dVar, "session");
    }

    /* renamed from: b */
    public final void mo92764b(FaceStickerBean faceStickerBean, String str) {
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo93131a(Object obj) {
        boolean z;
        C0794k<EffectCategoryModel, Object> kVar = (C0794k) obj;
        C46418a aVar = this.f117095e;
        if (aVar != null) {
            m100772a(aVar.mo93139b(), (Runnable) new C46413b(aVar));
        }
        boolean a = C52711k.m112239a((Object) kVar, (Object) this.f117094d);
        C46418a aVar2 = this.f117095e;
        if (aVar2 != null) {
            z = aVar2.mo93138a();
        } else {
            z = false;
        }
        if (!a || !z) {
            this.f117095e = this.f117098h.mo93136a(kVar);
            this.f117094d = kVar;
        }
        C46418a aVar3 = this.f117095e;
        if (aVar3 != null) {
            m100772a(aVar3.mo93139b(), (Runnable) new C46414c(this, aVar3));
        }
    }

    /* renamed from: a */
    public final void mo93132a(boolean z) {
        this.f117096f = true;
    }

    private DefaultStickerTabGuidePresenter(ViewGroup viewGroup, C46417b<C0794k<EffectCategoryModel, Object>> bVar) {
        C52711k.m112240b(viewGroup, "root");
        C52711k.m112240b(bVar, "factory");
        this.f117093b = viewGroup;
        this.f117098h = bVar;
        this.f117097g = C52732g.m112306a(new Handler(Looper.getMainLooper()));
    }

    /* renamed from: a */
    private final void m100772a(int i, Runnable runnable) {
        switch (i) {
            case 0:
                Looper mainLooper = Looper.getMainLooper();
                C52711k.m112236a((Object) mainLooper, "Looper.getMainLooper()");
                if (mainLooper.getThread() == Thread.currentThread()) {
                    runnable.run();
                    return;
                } else {
                    m100771a().post(runnable);
                    return;
                }
            case 1:
                m100771a().post(runnable);
                break;
            case 2:
                runnable.run();
                return;
        }
    }

    public /* synthetic */ DefaultStickerTabGuidePresenter(ViewGroup viewGroup, C46417b bVar, int i, C52707g gVar) {
        this(viewGroup, new C46415a(null));
    }
}
