package dmt.p2652av.video.p2653a;

import android.content.Context;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.asve.p1239c.C20348d;
import com.p683ss.android.ugc.asve.p1239c.C20349e;
import com.p683ss.android.ugc.asve.p1239c.C20352h;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42669p.C42670a;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.p683ss.android.vesdk.C50657c;
import com.p683ss.android.vesdk.C50720o.C50749j;
import dmt.p2652av.video.VEPreviewParams;

/* renamed from: dmt.av.video.a.j */
public class C52895j extends C52885a {
    /* renamed from: a */
    public final int mo110482a(Context context, C20347c cVar, VEPreviewParams vEPreviewParams) {
        super.mo110482a(context, cVar, vEPreviewParams);
        if (vEPreviewParams.editorHandler > 0 && vEPreviewParams.editorModel != null) {
            int a = cVar.mo42990a((C20348d) new C20352h(vEPreviewParams.editorModel, vEPreviewParams.timelineParams));
            C50203g.m108358a("initVEEditor with editorModel");
            return a;
        } else if (vEPreviewParams.mVTrimIn == null || vEPreviewParams.mVTrimOut == null) {
            C20349e eVar = new C20349e(vEPreviewParams.mVideoPaths);
            eVar.mo43100a(C50749j.VIDEO_OUT_RATIO_ORIGINAL);
            eVar.f55849d = vEPreviewParams.mAudioPaths;
            return this.f131177f.mo42990a((C20348d) eVar);
        } else {
            C50657c[] cVarArr = null;
            if (vEPreviewParams.rotateArray != null) {
                cVarArr = new C50657c[vEPreviewParams.rotateArray.length];
                for (int i = 0; i < cVarArr.length; i++) {
                    cVarArr[i] = C42670a.m93643a(vEPreviewParams.rotateArray[i]);
                }
            }
            C20349e eVar2 = new C20349e(vEPreviewParams.mVideoPaths);
            eVar2.f55846a = vEPreviewParams.mVTrimIn;
            eVar2.f55847b = vEPreviewParams.mVTrimOut;
            eVar2.f55849d = vEPreviewParams.mAudioPaths;
            eVar2.f55852g = vEPreviewParams.speedArray;
            eVar2.f55853h = cVarArr;
            eVar2.mo43100a(C50749j.VIDEO_OUT_RATIO_ORIGINAL);
            return this.f131177f.mo42990a((C20348d) eVar2);
        }
    }
}
