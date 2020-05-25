package dmt.p2652av.video;

import com.p683ss.android.vesdk.C50711k;

/* renamed from: dmt.av.video.ai */
final /* synthetic */ class C52925ai implements C50711k {

    /* renamed from: a */
    private final C52908ad f131298a;

    C52925ai(C52908ad adVar) {
        this.f131298a = adVar;
    }

    public final void onCallback(int i, int i2, float f, String str) {
        C52908ad adVar = this.f131298a;
        if (i == 4119 && !adVar.f131251F) {
            adVar.mo110528a(i2 == 1, true);
        }
    }
}
