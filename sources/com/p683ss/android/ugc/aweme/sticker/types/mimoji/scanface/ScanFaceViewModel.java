package com.p683ss.android.ugc.aweme.sticker.types.mimoji.scanface;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.util.Pair;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.mimoji.scanface.ScanFaceViewModel */
public final class ScanFaceViewModel extends C0209x {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f117533a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ScanFaceViewModel.class), "scanResult", "getScanResult()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: b */
    private final C52668f f117534b = C52732g.m112285a(C46586a.f117535a);

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.mimoji.scanface.ScanFaceViewModel$a */
    static final class C46586a extends C52712l implements C52670a<C0198r<Pair<Integer, String>>> {

        /* renamed from: a */
        public static final C46586a f117535a = new C46586a();

        C46586a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: a */
    public final C0198r<Pair<Integer, String>> mo93380a() {
        return (C0198r) this.f117534b.getValue();
    }
}
