package com.p683ss.android.ugc.aweme.profile.widgets;

import com.p683ss.android.ugc.aweme.p1465bs.C24047a;
import com.p683ss.android.ugc.aweme.profile.survey.C40032d.C40033a;
import com.p683ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState;
import com.p683ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.j */
public final class C40727j implements C40033a {

    /* renamed from: a */
    private final WeakReference<MyProfileGuideViewModel> f103760a;

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.j$a */
    static final class C40728a extends C52712l implements C52671b<MyProfileGuideState, MyProfileGuideState> {

        /* renamed from: a */
        final /* synthetic */ C24047a f103761a;

        C40728a(C24047a aVar) {
            this.f103761a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
            C52711k.m112240b(myProfileGuideState, "$receiver");
            return MyProfileGuideState.copy$default(myProfileGuideState, false, false, false, true, this.f103761a, null, null, null, null, false, null, false, false, 8167, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.j$b */
    static final class C40729b extends C52712l implements C52671b<MyProfileGuideState, MyProfileGuideState> {

        /* renamed from: a */
        public static final C40729b f103762a = new C40729b();

        C40729b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
            C52711k.m112240b(myProfileGuideState, "$receiver");
            return MyProfileGuideState.copy$default(myProfileGuideState, false, false, false, true, null, null, null, null, null, false, null, false, false, 8167, null);
        }
    }

    public C40727j(MyProfileGuideViewModel myProfileGuideViewModel) {
        C52711k.m112240b(myProfileGuideViewModel, "profileGuideViewModel");
        this.f103760a = new WeakReference<>(myProfileGuideViewModel);
    }

    /* renamed from: a */
    public final void mo82063a(C24047a aVar) {
        MyProfileGuideViewModel myProfileGuideViewModel = (MyProfileGuideViewModel) this.f103760a.get();
        if (myProfileGuideViewModel != null) {
            myProfileGuideViewModel.mo82895g(new C40728a(aVar));
        }
    }

    /* renamed from: a */
    public final void mo82064a(Exception exc) {
        MyProfileGuideViewModel myProfileGuideViewModel = (MyProfileGuideViewModel) this.f103760a.get();
        if (myProfileGuideViewModel != null) {
            myProfileGuideViewModel.mo82895g(C40729b.f103762a);
        }
    }
}
