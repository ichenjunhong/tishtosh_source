package com.p683ss.android.ugc.aweme.shortvideo.duet;

import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.gamora.jedi.BaseJediViewModel;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutViewModel */
public final class ChangeDuetLayoutViewModel extends BaseJediViewModel<ChangeDuetLayoutState> {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutViewModel$a */
    static final class C43230a extends C52712l implements C52671b<ChangeDuetLayoutState, ChangeDuetLayoutState> {

        /* renamed from: a */
        final /* synthetic */ int f109326a;

        C43230a(int i) {
            this.f109326a = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ChangeDuetLayoutState changeDuetLayoutState = (ChangeDuetLayoutState) obj;
            C52711k.m112240b(changeDuetLayoutState, "$receiver");
            return ChangeDuetLayoutState.copy$default(changeDuetLayoutState, null, new C49555b(Integer.valueOf(this.f109326a)), 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutViewModel$b */
    static final class C43231b extends C52712l implements C52671b<ChangeDuetLayoutState, ChangeDuetLayoutState> {

        /* renamed from: a */
        final /* synthetic */ Effect f109327a;

        C43231b(Effect effect) {
            this.f109327a = effect;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ChangeDuetLayoutState changeDuetLayoutState = (ChangeDuetLayoutState) obj;
            C52711k.m112240b(changeDuetLayoutState, "$receiver");
            return ChangeDuetLayoutState.copy$default(changeDuetLayoutState, new C49555b(this.f109327a), null, 2, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new ChangeDuetLayoutState(null, null, 3, null);
    }

    /* renamed from: a */
    public final void mo87897a(Effect effect) {
        C52711k.m112240b(effect, "value");
        mo22530c(new C43231b(effect));
    }
}
