package com.p683ss.android.ugc.aweme.infoSticker.category;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.category.InfoStickerCategoryViewModel */
public final class InfoStickerCategoryViewModel extends C0209x {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f91461a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(InfoStickerCategoryViewModel.class), "categoryVisible", "getCategoryVisible()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(InfoStickerCategoryViewModel.class), "emojiCategoryVisible", "getEmojiCategoryVisible()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(InfoStickerCategoryViewModel.class), "topCategoryVisible", "getTopCategoryVisible()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(InfoStickerCategoryViewModel.class), "isRecyclerViewScroll", "isRecyclerViewScroll()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(InfoStickerCategoryViewModel.class), "categoryResponseList", "getCategoryResponseList()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: b */
    public static final C35589a f91462b = new C35589a(null);

    /* renamed from: c */
    private final C52668f f91463c = C52732g.m112285a(C35591c.f91469a);

    /* renamed from: d */
    private final C52668f f91464d = C52732g.m112285a(C35592d.f91470a);

    /* renamed from: e */
    private final C52668f f91465e = C52732g.m112285a(C35594f.f91472a);

    /* renamed from: f */
    private final C52668f f91466f = C52732g.m112285a(C35593e.f91471a);

    /* renamed from: g */
    private final C52668f f91467g = C52732g.m112285a(C35590b.f91468a);

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.category.InfoStickerCategoryViewModel$a */
    public static final class C35589a {
        private C35589a() {
        }

        /* renamed from: a */
        public static boolean m80398a() {
            return C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableCategorizedInfoStickers);
        }

        public /* synthetic */ C35589a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.category.InfoStickerCategoryViewModel$b */
    static final class C35590b extends C52712l implements C52670a<C0198r<List<? extends EffectCategoryResponse>>> {

        /* renamed from: a */
        public static final C35590b f91468a = new C35590b();

        C35590b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.category.InfoStickerCategoryViewModel$c */
    static final class C35591c extends C52712l implements C52670a<C0198r<Boolean>> {

        /* renamed from: a */
        public static final C35591c f91469a = new C35591c();

        C35591c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.category.InfoStickerCategoryViewModel$d */
    static final class C35592d extends C52712l implements C52670a<C0198r<Boolean>> {

        /* renamed from: a */
        public static final C35592d f91470a = new C35592d();

        C35592d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.category.InfoStickerCategoryViewModel$e */
    static final class C35593e extends C52712l implements C52670a<C0198r<Boolean>> {

        /* renamed from: a */
        public static final C35593e f91471a = new C35593e();

        C35593e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.category.InfoStickerCategoryViewModel$f */
    static final class C35594f extends C52712l implements C52670a<C0198r<Boolean>> {

        /* renamed from: a */
        public static final C35594f f91472a = new C35594f();

        C35594f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: a */
    public final C0198r<Boolean> mo73989a() {
        return (C0198r) this.f91463c.getValue();
    }

    /* renamed from: b */
    public final C0198r<Boolean> mo73990b() {
        return (C0198r) this.f91464d.getValue();
    }

    /* renamed from: c */
    public final C0198r<Boolean> mo73991c() {
        return (C0198r) this.f91465e.getValue();
    }

    /* renamed from: d */
    public final C0198r<Boolean> mo73992d() {
        return (C0198r) this.f91466f.getValue();
    }

    /* renamed from: e */
    public final C0198r<List<EffectCategoryResponse>> mo73993e() {
        return (C0198r) this.f91467g.getValue();
    }
}
