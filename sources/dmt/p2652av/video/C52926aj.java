package dmt.p2652av.video;

import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.vesdk.C50711k;

/* renamed from: dmt.av.video.aj */
final /* synthetic */ class C52926aj implements C50711k {

    /* renamed from: a */
    private final C529091 f131299a;

    C52926aj(C529091 r1) {
        this.f131299a = r1;
    }

    public final void onCallback(int i, int i2, float f, String str) {
        C529091 r2 = this.f131299a;
        if (i == 4116) {
            C32458a.m75144a("receive prepare done event");
            C52908ad.this.f131279y.postValue(null);
            C52908ad.this.f131275u.mo43048c(C52908ad.this.f131277w);
        }
    }
}
