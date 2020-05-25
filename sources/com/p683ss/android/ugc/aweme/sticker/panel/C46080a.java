package com.p683ss.android.ugc.aweme.sticker.panel;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.os.Looper;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0794k;
import android.support.p043v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.p780m.C12356a;
import com.p683ss.android.ugc.aweme.filter.C31417ar;
import com.p683ss.android.ugc.aweme.framework.services.IStickerService.FaceSticker;
import com.p683ss.android.ugc.aweme.framework.services.StickerTagChangeData;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45819c;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45860c;
import com.p683ss.android.ugc.aweme.sticker.panel.C46191k.C46192a;
import com.p683ss.android.ugc.aweme.sticker.panel.C46256q.C46257a;
import com.p683ss.android.ugc.aweme.sticker.panel.p2302a.C46086b;
import com.p683ss.android.ugc.aweme.sticker.panel.p2302a.C46088d;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46318d;
import com.p683ss.android.ugc.aweme.sticker.tabguide.IStickerTabGuidePresenter;
import com.p683ss.android.ugc.aweme.sticker.viewmodel.EffectStickerViewModel;
import com.p683ss.android.ugc.aweme.sticker.viewmodel.UrlPrefixViewModel;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.a */
public abstract class C46080a implements C12356a, C46254o {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f116289a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C46080a.class), "stickerView", "getStickerView()Lcom/ss/android/ugc/aweme/sticker/panel/IStickerView;"))};

    /* renamed from: b */
    public final C0198r<Integer> f116290b = new C0198r<>();

    /* renamed from: c */
    public final C0198r<FaceSticker> f116291c = new C0198r<>();

    /* renamed from: d */
    public final C0198r<StickerTagChangeData> f116292d = new C0198r<>();

    /* renamed from: e */
    public final List<C46256q> f116293e = new ArrayList();

    /* renamed from: f */
    public final List<C45819c> f116294f = new ArrayList();

    /* renamed from: g */
    public final AppCompatActivity f116295g;

    /* renamed from: h */
    public final C0184k f116296h;

    /* renamed from: i */
    public final C46354l f116297i;

    /* renamed from: j */
    private final C46084b f116298j = new C46084b(this);

    /* renamed from: k */
    private final C52668f f116299k = C52732g.m112285a(new C46082a(this));

    /* renamed from: l */
    private final C46086b f116300l = new C46088d();

    /* renamed from: m */
    private final FrameLayout f116301m;

    /* renamed from: n */
    private final C0654k f116302n;

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.a$a */
    static final class C46082a extends C52712l implements C52670a<C46191k> {

        /* renamed from: a */
        final /* synthetic */ C46080a f116304a;

        /* renamed from: com.ss.android.ugc.aweme.sticker.panel.a$a$a */
        public static final class C46083a implements C46256q {

            /* renamed from: a */
            final /* synthetic */ C46082a f116305a;

            public final void cl_() {
                for (C46256q cl_ : this.f116305a.f116304a.f116293e) {
                    cl_.cl_();
                }
            }

            C46083a(C46082a aVar) {
                this.f116305a = aVar;
            }

            /* renamed from: a */
            public final void mo92779a(View view) {
                C52711k.m112240b(view, "stickerView");
                for (C46256q a : this.f116305a.f116304a.f116293e) {
                    a.mo92779a(view);
                }
            }

            /* renamed from: b */
            public final void mo92781b(C46257a aVar) {
                C52711k.m112240b(aVar, "state");
                for (C46256q b : this.f116305a.f116304a.f116293e) {
                    b.mo92781b(aVar);
                }
            }

            /* renamed from: a */
            public final void mo92780a(C46257a aVar) {
                C52711k.m112240b(aVar, "state");
                for (C46256q a : this.f116305a.f116304a.f116293e) {
                    a.mo92780a(aVar);
                }
            }
        }

        C46082a(C46080a aVar) {
            this.f116304a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C46191k a = this.f116304a.mo92770a();
            a.mo92751a((C46256q) new C46083a(this));
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.a$b */
    public static final class C46084b implements C46192a {

        /* renamed from: a */
        final /* synthetic */ C46080a f116306a;

        C46084b(C46080a aVar) {
            this.f116306a = aVar;
        }

        /* renamed from: a */
        public final void mo91208a(C46315a aVar) {
            C52711k.m112240b(aVar, "session");
            for (C45819c a : this.f116306a.f116294f) {
                a.mo91208a(aVar);
            }
            this.f116306a.f116291c.setValue(C45860c.m99702a(aVar.f116852a));
        }

        /* renamed from: a */
        public final void mo91209a(C46318d dVar) {
            C52711k.m112240b(dVar, "session");
            for (C45819c a : this.f116306a.f116294f) {
                a.mo91209a(dVar);
            }
            this.f116306a.f116291c.setValue(null);
        }

        /* renamed from: a */
        public final void mo92763a(FaceStickerBean faceStickerBean, String str) {
            this.f116306a.f116290b.setValue(Integer.valueOf(8));
        }

        /* renamed from: b */
        public final void mo92764b(FaceStickerBean faceStickerBean, String str) {
            this.f116306a.f116290b.setValue(Integer.valueOf(0));
        }

        /* renamed from: a */
        public final void mo92783a(String str, String str2, String str3) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                C0198r<StickerTagChangeData> rVar = this.f116306a.f116292d;
                if (str == null) {
                    C52711k.m112234a();
                }
                if (str2 == null) {
                    C52711k.m112234a();
                }
                if (str3 == null) {
                    C52711k.m112234a();
                }
                rVar.setValue(new StickerTagChangeData(str, str2, str3));
            }
        }
    }

    /* renamed from: g */
    private final C46191k m100158g() {
        return (C46191k) this.f116299k.getValue();
    }

    /* renamed from: a */
    public abstract C46191k mo92770a();

    /* renamed from: b */
    public final C46086b mo92775b() {
        return this.f116300l;
    }

    /* renamed from: e */
    public final void mo92778e() {
        m100158g().mo92745a();
    }

    /* renamed from: c */
    public final boolean mo92776c() {
        return m100158g().mo92756b();
    }

    /* renamed from: d */
    public final void mo92777d() {
        m100158g().mo92748a(this.f116295g, this.f116296h, this.f116302n, this.f116297i.mo92992j().f116949a, this.f116301m, this.f116298j);
    }

    /* renamed from: a */
    public final void mo92774a(IStickerTabGuidePresenter<C0794k<EffectCategoryModel, Object>> iStickerTabGuidePresenter) {
        m100158g().mo92752a(iStickerTabGuidePresenter);
    }

    /* renamed from: a */
    public final void mo92771a(C0199s<StickerTagChangeData> sVar) {
        C52711k.m112240b(sVar, "observer");
        this.f116292d.observe(this.f116296h, sVar);
    }

    /* renamed from: a */
    public final void mo92772a(C45819c cVar) {
        C52711k.m112240b(cVar, "stickerSelectedListener");
        if (!this.f116294f.contains(cVar)) {
            this.f116294f.add(cVar);
        }
    }

    /* renamed from: a */
    public final void mo92750a(C46190j jVar) {
        C52711k.m112240b(jVar, "stickerBarView");
        m100158g().mo92750a(jVar);
    }

    /* renamed from: a */
    public final void mo92773a(C46256q qVar) {
        C52711k.m112240b(qVar, "listener");
        if (!this.f116293e.contains(qVar)) {
            this.f116293e.add(qVar);
        }
    }

    public C46080a(AppCompatActivity appCompatActivity, FrameLayout frameLayout, C0184k kVar, C46354l lVar, C0654k kVar2) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(frameLayout, "rootContainer");
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52711k.m112240b(lVar, "stickerDataManager");
        C52711k.m112240b(kVar2, "fragmentManager");
        this.f116295g = appCompatActivity;
        this.f116301m = frameLayout;
        this.f116296h = kVar;
        this.f116297i = lVar;
        this.f116302n = kVar2;
        this.f116297i.mo92973a().mo92537i().mo92544e().observe(this.f116296h, new C0199s<List<? extends String>>(this) {

            /* renamed from: a */
            final /* synthetic */ C46080a f116303a;

            {
                this.f116303a = r1;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                List list;
                List list2 = (List) obj;
                if (list2 != null) {
                    C52711k.m112236a((Object) list2, "it");
                    if (!list2.isEmpty()) {
                        list = list2;
                    } else {
                        list = null;
                    }
                    if (list != null) {
                        UrlPrefixViewModel urlPrefixViewModel = (UrlPrefixViewModel) C0214z.m440a((FragmentActivity) this.f116303a.f116295g).mo359a(UrlPrefixViewModel.class);
                        String str = this.f116303a.f116297i.mo92992j().f116949a;
                        C52711k.m112240b(str, "key");
                        if (list2 != null) {
                            C31417ar arVar = (C31417ar) urlPrefixViewModel.f117619a.getValue();
                            if (arVar == null) {
                                arVar = C31417ar.m73204c();
                            }
                            C52711k.m112236a((Object) arVar, "mUrlPrefix.value ?: SpecializedMultimap.create()");
                            arVar.removeAll((Object) str);
                            arVar.putAll(str, list2);
                            Looper mainLooper = Looper.getMainLooper();
                            C52711k.m112236a((Object) mainLooper, "Looper.getMainLooper()");
                            if (mainLooper.getThread() == Thread.currentThread()) {
                                urlPrefixViewModel.f117619a.setValue(arVar);
                            } else {
                                urlPrefixViewModel.f117619a.postValue(arVar);
                            }
                        }
                        C0209x a = C0214z.m440a((FragmentActivity) this.f116303a.f116295g).mo359a(EffectStickerViewModel.class);
                        C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…kerViewModel::class.java)");
                        ((EffectStickerViewModel) a).mo93416a().mo91261a(list);
                    }
                }
            }
        });
    }
}
