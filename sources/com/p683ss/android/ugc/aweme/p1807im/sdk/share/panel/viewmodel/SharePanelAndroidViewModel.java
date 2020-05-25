package com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.viewmodel;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.content.Context;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelAndroidViewModel */
public final class SharePanelAndroidViewModel extends C0209x {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f90436a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SharePanelAndroidViewModel.class), "editShowLiveData", "getEditShowLiveData()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: b */
    public static final C35166a f90437b = new C35166a(null);

    /* renamed from: c */
    private final C52668f f90438c = C52732g.m112285a(C35167b.f90439a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelAndroidViewModel$a */
    public static final class C35166a {
        private C35166a() {
        }

        public /* synthetic */ C35166a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static SharePanelAndroidViewModel m79403a(Context context) {
            return (SharePanelAndroidViewModel) C35177b.m79420a(context, SharePanelAndroidViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelAndroidViewModel$b */
    static final class C35167b extends C52712l implements C52670a<C0198r<Boolean>> {

        /* renamed from: a */
        public static final C35167b f90439a = new C35167b();

        C35167b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: a */
    public final C0198r<Boolean> mo73279a() {
        return (C0198r) this.f90438c.getValue();
    }
}
