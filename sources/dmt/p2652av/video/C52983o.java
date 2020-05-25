package dmt.p2652av.video;

import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.shortvideo.C43809fd;
import com.p683ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p683ss.android.vesdk.C50711k;

/* renamed from: dmt.av.video.o */
final /* synthetic */ class C52983o implements C50711k {

    /* renamed from: a */
    private final C529801 f131408a;

    /* renamed from: b */
    private final SynthetiseResult f131409b;

    /* renamed from: c */
    private final C52908ad f131410c;

    C52983o(C529801 r1, SynthetiseResult synthetiseResult, C52908ad adVar) {
        this.f131408a = r1;
        this.f131409b = synthetiseResult;
        this.f131410c = adVar;
    }

    public final void onCallback(int i, int i2, float f, String str) {
        C529801 r0 = this.f131408a;
        SynthetiseResult synthetiseResult = this.f131409b;
        C52908ad adVar = this.f131410c;
        SynthetiseResult clone = synthetiseResult.clone();
        clone.ret = i;
        StringBuilder sb = new StringBuilder("VECompiler failed. type = ");
        sb.append(i);
        sb.append(" ext = ");
        sb.append(i2);
        sb.append(" f = ");
        sb.append(f);
        sb.append(" msg = ");
        sb.append(str);
        if (r0.mo34623a((Throwable) new C43809fd(sb.toString(), clone))) {
            if (i2 == -214) {
                C40797m.m90246b(true);
            }
            adVar.f131275u.mo43082p();
        }
    }
}
