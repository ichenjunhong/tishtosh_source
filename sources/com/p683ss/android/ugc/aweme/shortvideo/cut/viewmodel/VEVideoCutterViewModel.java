package com.p683ss.android.ugc.aweme.shortvideo.cut.viewmodel;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel */
public final class VEVideoCutterViewModel extends C0209x {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f109114a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(VEVideoCutterViewModel.class), "videoPlayerControlLiveData", "getVideoPlayerControlLiveData()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: b */
    private final C52668f f109115b = C52732g.m112285a(C43167a.f109116a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel$a */
    static final class C43167a extends C52712l implements C52670a<C0198r<C43168a>> {

        /* renamed from: a */
        public static final C43167a f109116a = new C43167a();

        C43167a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: a */
    public final C0198r<C43168a> mo87730a() {
        return (C0198r) this.f109115b.getValue();
    }

    /* renamed from: a */
    public final void mo87731a(C43168a aVar) {
        C52711k.m112240b(aVar, "value");
        mo87730a().setValue(aVar);
    }
}
