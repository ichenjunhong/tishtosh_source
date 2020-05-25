package com.p683ss.android.ugc.aweme.services.video;

import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService.CompileResult;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p071d.C1711f;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52726d;

/* renamed from: com.ss.android.ugc.aweme.services.video.ImVideoCompileService$compileImVideo$3 */
final class ImVideoCompileService$compileImVideo$3<T, R> implements C1711f<T, C2206z<? extends R>> {
    final /* synthetic */ C52726d $costTime;
    final /* synthetic */ C52726d $currentTime;
    final /* synthetic */ CompileResult $result;
    final /* synthetic */ C52726d $startTime;
    final /* synthetic */ ImVideoCompileService this$0;

    ImVideoCompileService$compileImVideo$3(ImVideoCompileService imVideoCompileService, CompileResult compileResult, C52726d dVar, C52726d dVar2, C52726d dVar3) {
        this.this$0 = imVideoCompileService;
        this.$result = compileResult;
        this.$currentTime = dVar;
        this.$costTime = dVar2;
        this.$startTime = dVar3;
    }

    public final C2201v<String> apply(Boolean bool) {
        C52711k.m112240b(bool, "it");
        CompileResult compileResult = this.$result;
        ImVideoCompileService imVideoCompileService = this.this$0;
        String videoPath = this.$result.getVideoPath();
        if (videoPath == null) {
            C52711k.m112234a();
        }
        compileResult.setVideoMd5(imVideoCompileService.getVideoFileMD5(videoPath));
        this.$currentTime.element = System.currentTimeMillis();
        this.$costTime.element = this.$currentTime.element - this.$startTime.element;
        this.$startTime.element = this.$currentTime.element;
        StringBuilder sb = new StringBuilder("ImVideoCompileService compileImVideo step 3: result=");
        sb.append(this.$result);
        sb.append(", costTime=");
        sb.append(this.$costTime.element);
        C32458a.m75144a(sb.toString());
        ImVideoCompileService imVideoCompileService2 = this.this$0;
        String videoPath2 = this.$result.getVideoPath();
        if (videoPath2 == null) {
            C52711k.m112234a();
        }
        return ImVideoCompileService.getVideoCover$default(imVideoCompileService2, videoPath2, 0, 0, 6, null);
    }
}
