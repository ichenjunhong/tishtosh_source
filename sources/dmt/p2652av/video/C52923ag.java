package dmt.p2652av.video;

import android.arch.lifecycle.C0199s;

/* renamed from: dmt.av.video.ag */
final /* synthetic */ class C52923ag implements C0199s {

    /* renamed from: a */
    private final C52908ad f131296a;

    C52923ag(C52908ad adVar) {
        this.f131296a = adVar;
    }

    public final void onChanged(Object obj) {
        C52908ad adVar = this.f131296a;
        Boolean bool = (Boolean) obj;
        if (adVar.f131274t != null) {
            adVar.f131274t.f131124c = bool != null ? bool.booleanValue() : false;
        }
    }
}
