package com.p683ss.android.ugc.aweme.profile;

import com.p683ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState;
import com.p683ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.profile.x */
public final class C40730x {

    /* renamed from: a */
    public static boolean f103763a;

    /* renamed from: b */
    public static WeakReference<MyProfileGuideViewModel> f103764b;

    /* renamed from: c */
    public static final C40730x f103765c = new C40730x();

    /* renamed from: com.ss.android.ugc.aweme.profile.x$a */
    static final class C40731a extends C52712l implements C52671b<MyProfileGuideState, MyProfileGuideState> {

        /* renamed from: a */
        final /* synthetic */ boolean f103766a;

        C40731a(boolean z) {
            this.f103766a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
            C52711k.m112240b(myProfileGuideState, "$receiver");
            return MyProfileGuideState.copy$default(myProfileGuideState, false, false, false, false, null, null, null, null, null, false, null, this.f103766a, false, 6143, null);
        }
    }

    private C40730x() {
    }
}
