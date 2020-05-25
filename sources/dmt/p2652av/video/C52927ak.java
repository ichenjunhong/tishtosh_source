package dmt.p2652av.video;

import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.vesdk.C50711k;

/* renamed from: dmt.av.video.ak */
final /* synthetic */ class C52927ak implements C50711k {

    /* renamed from: a */
    private final C529091 f131300a;

    C52927ak(C529091 r1) {
        this.f131300a = r1;
    }

    public final void onCallback(int i, int i2, float f, String str) {
        C529091 r2 = this.f131300a;
        if (i == 4116) {
            C32458a.m75144a("receive prepare done event persist");
            C52908ad.this.f131280z.postValue(null);
        }
    }
}
