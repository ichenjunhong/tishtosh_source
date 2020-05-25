package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.gamora.jedi.BaseJediViewModel;
import com.p683ss.android.ugc.gamora.jedi.C49556c;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel */
public final class CutVideoTitleBarViewModel extends BaseJediViewModel<CutVideoTitleBarState> {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel$a */
    static final class C42723a extends C52712l implements C52671b<CutVideoTitleBarState, CutVideoTitleBarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f108047a;

        C42723a(boolean z) {
            this.f108047a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            CutVideoTitleBarState cutVideoTitleBarState = (CutVideoTitleBarState) obj;
            C52711k.m112240b(cutVideoTitleBarState, "$receiver");
            return CutVideoTitleBarState.copy$default(cutVideoTitleBarState, null, null, null, null, new C49556c(this.f108047a), 15, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel$b */
    static final class C42724b extends C52712l implements C52671b<CutVideoTitleBarState, CutVideoTitleBarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f108048a;

        C42724b(boolean z) {
            this.f108048a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            CutVideoTitleBarState cutVideoTitleBarState = (CutVideoTitleBarState) obj;
            C52711k.m112240b(cutVideoTitleBarState, "$receiver");
            return CutVideoTitleBarState.copy$default(cutVideoTitleBarState, null, null, Boolean.valueOf(this.f108048a), null, null, 27, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel$c */
    static final class C42725c extends C52712l implements C52671b<CutVideoTitleBarState, CutVideoTitleBarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f108049a;

        C42725c(boolean z) {
            this.f108049a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            CutVideoTitleBarState cutVideoTitleBarState = (CutVideoTitleBarState) obj;
            C52711k.m112240b(cutVideoTitleBarState, "$receiver");
            return CutVideoTitleBarState.copy$default(cutVideoTitleBarState, Boolean.valueOf(this.f108049a), null, null, null, null, 30, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel$d */
    static final class C42726d extends C52712l implements C52671b<CutVideoTitleBarState, CutVideoTitleBarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f108050a;

        C42726d(boolean z) {
            this.f108050a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            CutVideoTitleBarState cutVideoTitleBarState = (CutVideoTitleBarState) obj;
            C52711k.m112240b(cutVideoTitleBarState, "$receiver");
            return CutVideoTitleBarState.copy$default(cutVideoTitleBarState, null, null, null, Boolean.valueOf(this.f108050a), null, 23, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel$e */
    static final class C42727e extends C52712l implements C52671b<CutVideoTitleBarState, CutVideoTitleBarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f108051a;

        C42727e(boolean z) {
            this.f108051a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            CutVideoTitleBarState cutVideoTitleBarState = (CutVideoTitleBarState) obj;
            C52711k.m112240b(cutVideoTitleBarState, "$receiver");
            return CutVideoTitleBarState.copy$default(cutVideoTitleBarState, null, Boolean.valueOf(this.f108051a), null, null, null, 29, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        CutVideoTitleBarState cutVideoTitleBarState = new CutVideoTitleBarState(null, null, null, null, null, 31, null);
        return cutVideoTitleBarState;
    }

    /* renamed from: a */
    public final void mo87170a(boolean z) {
        mo22530c(new C42725c(z));
    }

    /* renamed from: b */
    public final void mo87171b(boolean z) {
        mo22530c(new C42727e(z));
    }

    /* renamed from: c */
    public final void mo87172c(boolean z) {
        mo22530c(new C42724b(z));
    }

    /* renamed from: d */
    public final void mo87173d(boolean z) {
        mo22530c(new C42726d(z));
    }

    /* renamed from: e */
    public final void mo87174e(boolean z) {
        mo22530c(new C42723a(z));
    }
}
