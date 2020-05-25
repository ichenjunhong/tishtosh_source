package com.p683ss.android.ugc.aweme.shortvideo.upload;

import android.support.p030v4.p040os.C0958a.C0959a;
import com.C2240a;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.ugc.aweme.shortvideo.C42392aa;
import com.p683ss.android.ugc.aweme.shortvideo.C43809fd;
import com.p683ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45284c.C452851;
import com.p683ss.android.ugc.aweme.utils.C47716bd;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.p683ss.android.vesdk.VEWatermarkParam;
import dmt.p2652av.video.C52908ad;
import java.io.File;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.f */
final /* synthetic */ class C45298f implements C0959a {

    /* renamed from: a */
    private final C452851 f114546a;

    /* renamed from: b */
    private final SynthetiseResult f114547b;

    /* renamed from: c */
    private final VideoPublishEditModel f114548c;

    /* renamed from: d */
    private final C52908ad f114549d;

    /* renamed from: e */
    private final VEWatermarkParam f114550e;

    C45298f(C452851 r1, SynthetiseResult synthetiseResult, VideoPublishEditModel videoPublishEditModel, C52908ad adVar, VEWatermarkParam vEWatermarkParam) {
        this.f114546a = r1;
        this.f114547b = synthetiseResult;
        this.f114548c = videoPublishEditModel;
        this.f114549d = adVar;
        this.f114550e = vEWatermarkParam;
    }

    /* renamed from: a */
    public final void mo2943a() {
        C452851 r0 = this.f114546a;
        SynthetiseResult synthetiseResult = this.f114547b;
        VideoPublishEditModel videoPublishEditModel = this.f114548c;
        C52908ad adVar = this.f114549d;
        VEWatermarkParam vEWatermarkParam = this.f114550e;
        SynthetiseResult clone = synthetiseResult.clone();
        clone.ret = -66666;
        String str = "VECompiler canceled";
        if ((C45284c.this.f114501a instanceof C42392aa) && ((C42392aa) C45284c.this.f114501a).f107215m == -1) {
            StringBuilder sb = new StringBuilder("VECompiler stuck; ");
            sb.append(C45284c.this.f114507g);
            str = sb.toString();
            EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
            String a = C2240a.m6773a(Locale.US, "-6666601 videoSize:%d isRecordToEditFrameOptimizeAB:%b", new Object[]{Integer.valueOf(previewInfo != null ? previewInfo.getVideoList().size() : 0), Boolean.valueOf(C47716bd.m103286b())});
            C50203g.m108361b(a);
            C9220a.m18310a(a);
            clone.ret = -6666601;
        }
        if (r0.mo34623a((Throwable) new C43809fd(str, clone))) {
            C50203g.m108358a("ConcurrentUploadCompiler cancelUpload");
            if (C45284c.this.f114501a != null) {
                C45284c.this.f114501a.mo86485b();
            }
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
