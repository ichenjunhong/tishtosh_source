package dmt.p2652av.video;

import android.support.p030v4.p040os.C0958a.C0959a;
import com.p683ss.android.ugc.aweme.shortvideo.C43809fd;
import com.p683ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p683ss.android.vesdk.VEWatermarkParam;
import java.io.File;

/* renamed from: dmt.av.video.p */
final /* synthetic */ class C52984p implements C0959a {

    /* renamed from: a */
    private final C529801 f131411a;

    /* renamed from: b */
    private final SynthetiseResult f131412b;

    /* renamed from: c */
    private final C52908ad f131413c;

    /* renamed from: d */
    private final VEWatermarkParam f131414d;

    C52984p(C529801 r1, SynthetiseResult synthetiseResult, C52908ad adVar, VEWatermarkParam vEWatermarkParam) {
        this.f131411a = r1;
        this.f131412b = synthetiseResult;
        this.f131413c = adVar;
        this.f131414d = vEWatermarkParam;
    }

    /* renamed from: a */
    public final void mo2943a() {
        C529801 r0 = this.f131411a;
        SynthetiseResult synthetiseResult = this.f131412b;
        C52908ad adVar = this.f131413c;
        VEWatermarkParam vEWatermarkParam = this.f131414d;
        SynthetiseResult clone = synthetiseResult.clone();
        clone.ret = -66666;
        if (r0.mo34623a((Throwable) new C43809fd("VECompiler canceled.", clone))) {
            adVar.f131275u.mo43082p();
        }
        if (synthetiseResult.outputFile != null) {
            File file = new File(synthetiseResult.outputFile);
            if (file.exists()) {
                file.delete();
            }
            if (vEWatermarkParam != null) {
                File file2 = new File(vEWatermarkParam.extFile);
                if (file2.exists()) {
                    file2.delete();
                }
            }
        }
    }
}
