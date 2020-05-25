package com.p683ss.android.ugc.aweme.services.video;

import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.vesdk.C50711k;
import com.p683ss.android.vesdk.C50720o;
import p064c.p065a.C2204x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.video.ImVideoCompileService$compileVideo$1$onCompileInfoCallback$1 */
final class ImVideoCompileService$compileVideo$1$onCompileInfoCallback$1 implements C50711k {
    final /* synthetic */ C50720o $editor;
    final /* synthetic */ C2204x $it;
    final /* synthetic */ ImVideoCompileService$compileVideo$1 this$0;

    ImVideoCompileService$compileVideo$1$onCompileInfoCallback$1(ImVideoCompileService$compileVideo$1 imVideoCompileService$compileVideo$1, C50720o oVar, C2204x xVar) {
        this.this$0 = imVideoCompileService$compileVideo$1;
        this.$editor = oVar;
        this.$it = xVar;
    }

    public final void onCallback(int i, int i2, float f, String str) {
        if (i == 4103) {
            this.$editor.mo99389m();
            StringBuilder sb = new StringBuilder("ImVideoCompileService compile success: ");
            C2204x xVar = this.$it;
            C52711k.m112236a((Object) xVar, "it");
            sb.append(xVar.isDisposed());
            C32458a.m75144a(sb.toString());
            ImVideoCompileService imVideoCompileService = this.this$0.this$0;
            C2204x xVar2 = this.$it;
            C52711k.m112236a((Object) xVar2, "it");
            imVideoCompileService.safeOnSingleNext(xVar2, Boolean.valueOf(true));
        }
    }
}
