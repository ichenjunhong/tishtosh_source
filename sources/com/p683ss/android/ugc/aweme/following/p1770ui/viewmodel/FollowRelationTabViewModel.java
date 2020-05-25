package com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel */
public final class FollowRelationTabViewModel extends JediViewModel<FollowRelationState> {

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel$a */
    public static final class C32309a extends C52712l implements C52671b<FollowRelationState, FollowRelationState> {

        /* renamed from: a */
        final /* synthetic */ int f84145a;

        public C32309a(int i) {
            this.f84145a = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FollowRelationState followRelationState = (FollowRelationState) obj;
            C52711k.m112240b(followRelationState, "$receiver");
            return FollowRelationState.copy$default(followRelationState, false, this.f84145a, 0, false, 13, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel$b */
    static final class C32310b extends C52712l implements C52671b<FollowRelationState, FollowRelationState> {

        /* renamed from: a */
        final /* synthetic */ int f84146a;

        C32310b(int i) {
            this.f84146a = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FollowRelationState followRelationState = (FollowRelationState) obj;
            C52711k.m112240b(followRelationState, "$receiver");
            return FollowRelationState.copy$default(followRelationState, false, 0, this.f84146a, false, 11, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel$c */
    static final class C32311c extends C52712l implements C52671b<FollowRelationState, FollowRelationState> {

        /* renamed from: a */
        final /* synthetic */ boolean f84147a;

        C32311c(boolean z) {
            this.f84147a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FollowRelationState followRelationState = (FollowRelationState) obj;
            C52711k.m112240b(followRelationState, "$receiver");
            return FollowRelationState.copy$default(followRelationState, false, 0, 0, this.f84147a, 7, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel$d */
    static final class C32312d extends C52712l implements C52671b<FollowRelationState, FollowRelationState> {

        /* renamed from: a */
        final /* synthetic */ boolean f84148a;

        C32312d(boolean z) {
            this.f84148a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FollowRelationState followRelationState = (FollowRelationState) obj;
            C52711k.m112240b(followRelationState, "$receiver");
            return FollowRelationState.copy$default(followRelationState, this.f84148a, 0, 0, false, 14, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        FollowRelationState followRelationState = new FollowRelationState(false, 0, 0, false, 15, null);
        return followRelationState;
    }

    /* renamed from: a */
    public final void mo65425a(int i) {
        mo22530c(new C32310b(i));
    }

    /* renamed from: b */
    public final void mo65427b(boolean z) {
        mo22530c(new C32311c(z));
    }

    /* renamed from: a */
    public final void mo65426a(boolean z) {
        mo22530c(new C32312d(z));
    }
}
