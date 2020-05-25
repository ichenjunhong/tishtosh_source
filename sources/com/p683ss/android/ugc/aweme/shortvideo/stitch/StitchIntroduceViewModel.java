package com.p683ss.android.ugc.aweme.shortvideo.stitch;

import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.gamora.jedi.BaseJediViewModel;
import com.p683ss.android.ugc.gamora.jedi.C49561h;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.StitchIntroduceViewModel */
public final class StitchIntroduceViewModel extends BaseJediViewModel<StitchState> {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.StitchIntroduceViewModel$a */
    static final class C44719a extends C52712l implements C52671b<StitchState, StitchState> {

        /* renamed from: a */
        public static final C44719a f113207a = new C44719a();

        C44719a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            StitchState stitchState = (StitchState) obj;
            C52711k.m112240b(stitchState, "$receiver");
            return StitchState.copy$default(stitchState, null, new C49561h(), null, null, null, 29, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.StitchIntroduceViewModel$b */
    static final class C44720b extends C52712l implements C52671b<StitchState, StitchState> {

        /* renamed from: a */
        public static final C44720b f113208a = new C44720b();

        C44720b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            StitchState stitchState = (StitchState) obj;
            C52711k.m112240b(stitchState, "$receiver");
            return StitchState.copy$default(stitchState, new C49561h(), null, null, null, null, 30, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.StitchIntroduceViewModel$c */
    static final class C44721c extends C52712l implements C52671b<StitchState, StitchState> {

        /* renamed from: a */
        public static final C44721c f113209a = new C44721c();

        C44721c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            StitchState stitchState = (StitchState) obj;
            C52711k.m112240b(stitchState, "$receiver");
            return StitchState.copy$default(stitchState, null, null, null, new C49561h(), null, 23, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.StitchIntroduceViewModel$d */
    static final class C44722d extends C52712l implements C52671b<StitchState, StitchState> {

        /* renamed from: a */
        public static final C44722d f113210a = new C44722d();

        C44722d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            StitchState stitchState = (StitchState) obj;
            C52711k.m112240b(stitchState, "$receiver");
            return StitchState.copy$default(stitchState, null, null, new C49561h(), null, null, 27, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        StitchState stitchState = new StitchState(null, null, null, null, null, 31, null);
        return stitchState;
    }

    /* renamed from: e */
    public final void mo90764e() {
        if (C44730c.m97858a() && !C44730c.f113238a.getBoolean("stitch_trimming_view_guide", false)) {
            C44730c.f113238a.edit().putBoolean("stitch_trimming_view_guide", true).apply();
            mo22530c(C44722d.f113210a);
        }
    }
}
