package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import android.arch.lifecycle.C0198r;
import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.gamora.jedi.BaseJediViewModel;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiBottomViewModel */
public final class CutVideoMultiBottomViewModel extends BaseJediViewModel<CutVideoMultiBottomState> {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f108017d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CutVideoMultiBottomViewModel.class), "animationProgress", "getAnimationProgress()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: e */
    private final C52668f f108018e = C52732g.m112285a(C42704a.f108019a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiBottomViewModel$a */
    static final class C42704a extends C52712l implements C52670a<C0198r<C52847n<? extends Boolean, ? extends Float>>> {

        /* renamed from: a */
        public static final C42704a f108019a = new C42704a();

        C42704a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: e */
    public final C0198r<C52847n<Boolean, Float>> mo87081e() {
        return (C0198r) this.f108018e.getValue();
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new CutVideoMultiBottomState(null, 1, null);
    }
}
