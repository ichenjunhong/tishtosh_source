package com.p683ss.android.ugc.aweme.services.video;

import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService.CompileParam;
import com.p683ss.android.ugc.aweme.tools.p2348b.C46813b;
import com.p683ss.android.vesdk.VEUtils.C50574e;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.video.ImVideoCompileService$getVideoWidthHeight$1 */
final class ImVideoCompileService$getVideoWidthHeight$1<T> implements C2205y<T> {
    final /* synthetic */ CompileParam $compileParam;
    final /* synthetic */ ImVideoCompileService this$0;

    ImVideoCompileService$getVideoWidthHeight$1(ImVideoCompileService imVideoCompileService, CompileParam compileParam) {
        this.this$0 = imVideoCompileService;
        this.$compileParam = compileParam;
    }

    public final void subscribe(C2204x<Boolean> xVar) {
        C52711k.m112240b(xVar, "emitter");
        if (this.$compileParam.getVideoWidth() <= 0 || this.$compileParam.getVideoHeight() <= 0) {
            AVExternalServiceImpl.getAVServiceImpl_Monster();
            int[] iArr = new int[11];
            C50574e a = C46813b.m101657a(this.$compileParam.getRawVideoPath());
            if (a != null) {
                iArr[0] = a.f126801a;
                iArr[1] = a.f126802b;
                iArr[2] = a.f126803c;
                iArr[3] = a.f126803c;
                iArr[4] = a.f126805e;
                iArr[5] = a.f126806f;
                iArr[6] = a.f126807g;
                iArr[7] = a.f126808h;
                iArr[8] = a.f126809i;
                iArr[9] = a.f126810j;
                iArr[10] = a.f126811k;
            }
            this.$compileParam.setVideoWidth(iArr[0]);
            this.$compileParam.setVideoHeight(iArr[1]);
            StringBuilder sb = new StringBuilder("ImVideoCompileService resize compileParam success: ");
            sb.append(this.$compileParam.getVideoWidth());
            sb.append(", ");
            sb.append(this.$compileParam.getVideoHeight());
            C32458a.m75144a(sb.toString());
        }
        this.this$0.safeOnSingleNext(xVar, Boolean.valueOf(true));
    }
}
