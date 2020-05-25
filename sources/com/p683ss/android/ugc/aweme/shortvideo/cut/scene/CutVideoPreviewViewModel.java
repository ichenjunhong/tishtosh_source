package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import android.arch.lifecycle.C0198r;
import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.gamora.jedi.BaseJediViewModel;
import com.p683ss.android.ugc.gamora.jedi.C49558e;
import com.p683ss.android.ugc.gamora.jedi.C49559f;
import com.p683ss.android.ugc.gamora.jedi.C49561h;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel */
public final class CutVideoPreviewViewModel extends BaseJediViewModel<CutVideoPreviewState> {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f108024d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CutVideoPreviewViewModel.class), "animationStart", "getAnimationStart()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CutVideoPreviewViewModel.class), "animationEnd", "getAnimationEnd()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: e */
    private final C52668f f108025e = C52732g.m112285a(C42708b.f108028a);

    /* renamed from: f */
    private final C52668f f108026f = C52732g.m112285a(C42707a.f108027a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel$a */
    static final class C42707a extends C52712l implements C52670a<C0198r<Boolean>> {

        /* renamed from: a */
        public static final C42707a f108027a = new C42707a();

        C42707a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel$b */
    static final class C42708b extends C52712l implements C52670a<C0198r<Boolean>> {

        /* renamed from: a */
        public static final C42708b f108028a = new C42708b();

        C42708b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel$c */
    static final class C42709c extends C52712l implements C52671b<CutVideoPreviewState, CutVideoPreviewState> {

        /* renamed from: a */
        final /* synthetic */ int f108029a;

        /* renamed from: b */
        final /* synthetic */ int f108030b;

        C42709c(int i, int i2) {
            this.f108029a = i;
            this.f108030b = i2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            CutVideoPreviewState cutVideoPreviewState = (CutVideoPreviewState) obj;
            C52711k.m112240b(cutVideoPreviewState, "$receiver");
            return CutVideoPreviewState.copy$default(cutVideoPreviewState, null, null, new C49559f(new C52847n(Integer.valueOf(this.f108029a), Integer.valueOf(this.f108030b))), null, null, 27, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel$d */
    static final class C42710d extends C52712l implements C52671b<CutVideoPreviewState, CutVideoPreviewState> {

        /* renamed from: a */
        public static final C42710d f108031a = new C42710d();

        C42710d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            CutVideoPreviewState cutVideoPreviewState = (CutVideoPreviewState) obj;
            C52711k.m112240b(cutVideoPreviewState, "$receiver");
            return CutVideoPreviewState.copy$default(cutVideoPreviewState, new C49561h(), null, null, null, null, 30, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel$e */
    static final class C42711e extends C52712l implements C52671b<CutVideoPreviewState, CutVideoPreviewState> {

        /* renamed from: a */
        final /* synthetic */ boolean f108032a;

        C42711e(boolean z) {
            this.f108032a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            CutVideoPreviewState cutVideoPreviewState = (CutVideoPreviewState) obj;
            C52711k.m112240b(cutVideoPreviewState, "$receiver");
            return CutVideoPreviewState.copy$default(cutVideoPreviewState, null, Boolean.valueOf(this.f108032a), null, null, null, 29, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel$f */
    static final class C42712f extends C52712l implements C52671b<CutVideoPreviewState, CutVideoPreviewState> {

        /* renamed from: a */
        final /* synthetic */ int f108033a;

        C42712f(int i) {
            this.f108033a = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            CutVideoPreviewState cutVideoPreviewState = (CutVideoPreviewState) obj;
            C52711k.m112240b(cutVideoPreviewState, "$receiver");
            return CutVideoPreviewState.copy$default(cutVideoPreviewState, null, null, null, new C49558e(this.f108033a), null, 23, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel$g */
    static final class C42713g extends C52712l implements C52671b<CutVideoPreviewState, CutVideoPreviewState> {

        /* renamed from: a */
        public static final C42713g f108034a = new C42713g();

        C42713g() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            CutVideoPreviewState cutVideoPreviewState = (CutVideoPreviewState) obj;
            C52711k.m112240b(cutVideoPreviewState, "$receiver");
            return CutVideoPreviewState.copy$default(cutVideoPreviewState, null, null, null, null, new C49561h(), 15, null);
        }
    }

    /* renamed from: f */
    public final C0198r<Boolean> mo87115f() {
        return (C0198r) this.f108025e.getValue();
    }

    /* renamed from: g */
    public final C0198r<Boolean> mo87116g() {
        return (C0198r) this.f108026f.getValue();
    }

    /* renamed from: e */
    public final void mo87114e() {
        mo22530c(C42713g.f108034a);
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        CutVideoPreviewState cutVideoPreviewState = new CutVideoPreviewState(null, null, null, null, null, 31, null);
        return cutVideoPreviewState;
    }

    /* renamed from: a */
    public final void mo87111a(int i) {
        mo22530c(new C42712f(i));
    }

    /* renamed from: a */
    public final void mo87113a(boolean z) {
        mo22530c(new C42711e(z));
    }

    /* renamed from: a */
    public final void mo87112a(int i, int i2) {
        mo22530c(new C42709c(i, i2));
    }
}
