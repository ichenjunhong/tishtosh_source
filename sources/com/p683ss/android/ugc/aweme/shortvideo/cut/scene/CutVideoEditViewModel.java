package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import android.arch.lifecycle.C0198r;
import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.gamora.jedi.BaseJediViewModel;
import com.p683ss.android.ugc.gamora.jedi.C49556c;
import com.p683ss.android.ugc.gamora.jedi.C49561h;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditViewModel */
public final class CutVideoEditViewModel extends BaseJediViewModel<CutVideoEditState> {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f107991d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CutVideoEditViewModel.class), "slideHintAlpha", "getSlideHintAlpha()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: e */
    public int f107992e;

    /* renamed from: f */
    private final C52668f f107993f = C52732g.m112285a(C42690e.f107998a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditViewModel$a */
    static final class C42686a extends C52712l implements C52671b<CutVideoEditState, CutVideoEditState> {

        /* renamed from: a */
        final /* synthetic */ boolean f107994a;

        C42686a(boolean z) {
            this.f107994a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            CutVideoEditState cutVideoEditState = (CutVideoEditState) obj;
            C52711k.m112240b(cutVideoEditState, "$receiver");
            return CutVideoEditState.copy$default(cutVideoEditState, null, null, new C49556c(this.f107994a), null, null, 27, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditViewModel$b */
    static final class C42687b extends C52712l implements C52671b<CutVideoEditState, CutVideoEditState> {

        /* renamed from: a */
        public static final C42687b f107995a = new C42687b();

        C42687b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            CutVideoEditState cutVideoEditState = (CutVideoEditState) obj;
            C52711k.m112240b(cutVideoEditState, "$receiver");
            return CutVideoEditState.copy$default(cutVideoEditState, null, null, null, new C49561h(), null, 23, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditViewModel$c */
    static final class C42688c extends C52712l implements C52671b<CutVideoEditState, CutVideoEditState> {

        /* renamed from: a */
        final /* synthetic */ boolean f107996a;

        C42688c(boolean z) {
            this.f107996a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            CutVideoEditState cutVideoEditState = (CutVideoEditState) obj;
            C52711k.m112240b(cutVideoEditState, "$receiver");
            return CutVideoEditState.copy$default(cutVideoEditState, null, null, null, null, Boolean.valueOf(this.f107996a), 15, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditViewModel$d */
    static final class C42689d extends C52712l implements C52671b<CutVideoEditState, CutVideoEditState> {

        /* renamed from: a */
        final /* synthetic */ boolean f107997a;

        C42689d(boolean z) {
            this.f107997a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            CutVideoEditState cutVideoEditState = (CutVideoEditState) obj;
            C52711k.m112240b(cutVideoEditState, "$receiver");
            return CutVideoEditState.copy$default(cutVideoEditState, null, Boolean.valueOf(this.f107997a), null, null, null, 29, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditViewModel$e */
    static final class C42690e extends C52712l implements C52670a<C0198r<Float>> {

        /* renamed from: a */
        public static final C42690e f107998a = new C42690e();

        C42690e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditViewModel$f */
    static final class C42691f extends C52712l implements C52671b<CutVideoEditState, CutVideoEditState> {

        /* renamed from: a */
        public static final C42691f f107999a = new C42691f();

        C42691f() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            CutVideoEditState cutVideoEditState = (CutVideoEditState) obj;
            C52711k.m112240b(cutVideoEditState, "$receiver");
            return CutVideoEditState.copy$default(cutVideoEditState, new C49561h(), null, null, null, null, 30, null);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final C0198r<Float> mo87042f() {
        return (C0198r) this.f107993f.getValue();
    }

    /* renamed from: e */
    public final void mo87041e() {
        mo22530c(C42687b.f107995a);
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        CutVideoEditState cutVideoEditState = new CutVideoEditState(null, null, null, null, null, 31, null);
        return cutVideoEditState;
    }

    /* renamed from: a */
    public final void mo87037a(float f) {
        mo87042f().setValue(Float.valueOf(f));
    }

    /* renamed from: b */
    public final void mo87039b(boolean z) {
        mo22530c(new C42686a(z));
    }

    /* renamed from: c */
    public final void mo87040c(boolean z) {
        mo22530c(new C42688c(z));
    }

    /* renamed from: a */
    public final void mo87038a(boolean z) {
        mo22530c(new C42689d(z));
    }
}
