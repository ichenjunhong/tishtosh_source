package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f;
import com.p683ss.android.ugc.gamora.jedi.BaseJediViewModel;
import com.p683ss.android.ugc.gamora.jedi.C49556c;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiModeViewModel */
public final class CutVideoMultiModeViewModel extends BaseJediViewModel<CutVideoMultiModeState> {

    /* renamed from: d */
    public int f108020d;

    /* renamed from: e */
    public C42874bo f108021e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiModeViewModel$a */
    static final class C42705a extends C52712l implements C52671b<CutVideoMultiModeState, CutVideoMultiModeState> {

        /* renamed from: a */
        final /* synthetic */ boolean f108022a;

        C42705a(boolean z) {
            this.f108022a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            CutVideoMultiModeState cutVideoMultiModeState = (CutVideoMultiModeState) obj;
            C52711k.m112240b(cutVideoMultiModeState, "$receiver");
            return CutVideoMultiModeState.copy$default(cutVideoMultiModeState, null, null, new C49556c(this.f108022a), 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiModeViewModel$b */
    static final class C42706b extends C52712l implements C52671b<CutVideoMultiModeState, CutVideoMultiModeState> {

        /* renamed from: a */
        final /* synthetic */ boolean f108023a;

        C42706b(boolean z) {
            this.f108023a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            CutVideoMultiModeState cutVideoMultiModeState = (CutVideoMultiModeState) obj;
            C52711k.m112240b(cutVideoMultiModeState, "$receiver");
            return CutVideoMultiModeState.copy$default(cutVideoMultiModeState, null, new C49556c(this.f108023a), null, 5, null);
        }
    }

    /* renamed from: e */
    public final boolean mo87096e() {
        if (this.f108020d == 1) {
            return true;
        }
        return false;
    }

    public CutVideoMultiModeViewModel() {
        int i;
        if (C43036f.m94313g()) {
            i = 1;
        } else {
            i = 2;
        }
        this.f108020d = i;
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        CutVideoMultiModeState cutVideoMultiModeState = new CutVideoMultiModeState(null, null, null, 7, null);
        return cutVideoMultiModeState;
    }

    /* renamed from: a */
    public final void mo87093a(boolean z) {
        mo22530c(new C42706b(true));
    }

    /* renamed from: b */
    public final void mo87095b(boolean z) {
        mo22530c(new C42705a(true));
    }

    /* renamed from: a */
    public final void mo87092a(FragmentActivity fragmentActivity, boolean z) {
        C52711k.m112240b(fragmentActivity, "activity");
        C42874bo boVar = this.f108021e;
        if (boVar == null) {
            C52711k.m112237a("stickerPointController");
        }
        boVar.mo87262a(z);
        C10691a.m21537a((Context) fragmentActivity, fragmentActivity.getResources().getString(R.string.ds9)).mo19066a();
        JediViewModel a = C48927d.m105736a(fragmentActivity).mo96760a(CutVideoListViewModel.class);
        C52711k.m112236a((Object) a, "JediViewModelProviders.o…istViewModel::class.java)");
        ((CutVideoListViewModel) a).mo87070d(true);
        JediViewModel a2 = C48927d.m105736a(fragmentActivity).mo96760a(CutVideoEditViewModel.class);
        C52711k.m112236a((Object) a2, "JediViewModelProviders.o…ditViewModel::class.java)");
        CutVideoEditViewModel cutVideoEditViewModel = (CutVideoEditViewModel) a2;
        cutVideoEditViewModel.mo87039b(false);
        C42874bo boVar2 = this.f108021e;
        if (boVar2 == null) {
            C52711k.m112237a("stickerPointController");
        }
        boVar2.mo87274j().mo87321a(false);
        cutVideoEditViewModel.mo87041e();
    }

    /* renamed from: b */
    public final void mo87094b(FragmentActivity fragmentActivity, boolean z) {
        C52711k.m112240b(fragmentActivity, "activity");
        C42874bo boVar = this.f108021e;
        if (boVar == null) {
            C52711k.m112237a("stickerPointController");
        }
        boVar.mo87265b(z);
        JediViewModel a = C48927d.m105736a(fragmentActivity).mo96760a(CutVideoEditViewModel.class);
        C52711k.m112236a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java)");
        CutVideoEditViewModel cutVideoEditViewModel = (CutVideoEditViewModel) a;
        cutVideoEditViewModel.mo87039b(true);
        if (z) {
            cutVideoEditViewModel.mo87041e();
        }
        JediViewModel a2 = C48927d.m105736a(fragmentActivity).mo96760a(CutVideoListViewModel.class);
        C52711k.m112236a((Object) a2, "JediViewModelProviders.o…istViewModel::class.java)");
        ((CutVideoListViewModel) a2).mo87070d(false);
        C42874bo boVar2 = this.f108021e;
        if (boVar2 == null) {
            C52711k.m112237a("stickerPointController");
        }
        boVar2.mo87274j().mo87321a(true);
    }
}
