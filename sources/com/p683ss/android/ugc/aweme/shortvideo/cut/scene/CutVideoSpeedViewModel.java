package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import android.arch.lifecycle.C0198r;
import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.aweme.tools.C47339t;
import com.p683ss.android.ugc.gamora.jedi.BaseJediViewModel;
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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel */
public final class CutVideoSpeedViewModel extends BaseJediViewModel<CutVideoSpeedState> {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f108035d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CutVideoSpeedViewModel.class), "checkedSpeed", "getCheckedSpeed()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CutVideoSpeedViewModel.class), "speedAlpha", "getSpeedAlpha()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: e */
    private final C52668f f108036e = C52732g.m112285a(C42714a.f108038a);

    /* renamed from: f */
    private final C52668f f108037f = C52732g.m112285a(C42717d.f108041a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel$a */
    static final class C42714a extends C52712l implements C52670a<C0198r<C47339t>> {

        /* renamed from: a */
        public static final C42714a f108038a = new C42714a();

        C42714a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel$b */
    static final class C42715b extends C52712l implements C52671b<CutVideoSpeedState, CutVideoSpeedState> {

        /* renamed from: a */
        final /* synthetic */ boolean f108039a;

        C42715b(boolean z) {
            this.f108039a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            CutVideoSpeedState cutVideoSpeedState = (CutVideoSpeedState) obj;
            C52711k.m112240b(cutVideoSpeedState, "$receiver");
            return CutVideoSpeedState.copy$default(cutVideoSpeedState, Boolean.valueOf(this.f108039a), null, 2, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel$c */
    static final class C42716c extends C52712l implements C52671b<CutVideoSpeedState, CutVideoSpeedState> {

        /* renamed from: a */
        final /* synthetic */ boolean f108040a;

        C42716c(boolean z) {
            this.f108040a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            CutVideoSpeedState cutVideoSpeedState = (CutVideoSpeedState) obj;
            C52711k.m112240b(cutVideoSpeedState, "$receiver");
            return CutVideoSpeedState.copy$default(cutVideoSpeedState, null, Boolean.valueOf(this.f108040a), 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel$d */
    static final class C42717d extends C52712l implements C52670a<C0198r<Float>> {

        /* renamed from: a */
        public static final C42717d f108041a = new C42717d();

        C42717d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final C0198r<C47339t> mo87129e() {
        return (C0198r) this.f108036e.getValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final C0198r<Float> mo87130f() {
        return (C0198r) this.f108037f.getValue();
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new CutVideoSpeedState(null, null, 3, null);
    }

    /* renamed from: a */
    public final void mo87125a(float f) {
        mo87130f().setValue(Float.valueOf(f));
    }

    /* renamed from: b */
    public final void mo87128b(boolean z) {
        mo22530c(new C42716c(z));
    }

    /* renamed from: a */
    public final void mo87126a(C47339t tVar) {
        C52711k.m112240b(tVar, "value");
        mo87129e().setValue(tVar);
    }

    /* renamed from: a */
    public final void mo87127a(boolean z) {
        mo22530c(new C42715b(z));
    }
}
