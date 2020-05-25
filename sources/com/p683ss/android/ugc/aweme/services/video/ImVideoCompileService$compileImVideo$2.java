package com.p683ss.android.ugc.aweme.services.video;

import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService.CompileParam;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService.CompileResult;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p071d.C1711f;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52726d;

/* renamed from: com.ss.android.ugc.aweme.services.video.ImVideoCompileService$compileImVideo$2 */
final class ImVideoCompileService$compileImVideo$2<T, R> implements C1711f<T, C2206z<? extends R>> {
    final /* synthetic */ CompileParam $compileParam;
    final /* synthetic */ C52726d $costTime;
    final /* synthetic */ C52726d $currentTime;
    final /* synthetic */ CompileResult $result;
    final /* synthetic */ C52726d $startTime;
    final /* synthetic */ ImVideoCompileService this$0;

    ImVideoCompileService$compileImVideo$2(ImVideoCompileService imVideoCompileService, C52726d dVar, C52726d dVar2, C52726d dVar3, CompileParam compileParam, CompileResult compileResult) {
        this.this$0 = imVideoCompileService;
        this.$currentTime = dVar;
        this.$costTime = dVar2;
        this.$startTime = dVar3;
        this.$compileParam = compileParam;
        this.$result = compileResult;
    }

    public final C2201v<Boolean> apply(Boolean bool) {
        C52711k.m112240b(bool, "it");
        this.$currentTime.element = System.currentTimeMillis();
        this.$costTime.element = this.$currentTime.element - this.$startTime.element;
        this.$startTime.element = this.$currentTime.element;
        StringBuilder sb = new StringBuilder("ImVideoCompileService compileImVideo step 2: compileParam=");
        sb.append(this.$compileParam);
        sb.append(", result=");
        sb.append(this.$result);
        sb.append(", costTime=");
        sb.append(this.$costTime.element);
        C32458a.m75144a(sb.toString());
        return this.this$0.compileVideo(this.$compileParam, this.$result);
    }
}
