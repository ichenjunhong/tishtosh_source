package com.p683ss.android.ugc.aweme.services.video;

import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService.CompileParam;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService.CompileResult;
import com.p683ss.android.vesdk.C50711k;
import com.p683ss.android.vesdk.C50720o;
import com.p683ss.android.vesdk.C50751p;
import com.p683ss.android.vesdk.VESize;
import com.p683ss.android.vesdk.VEVideoEncodeSettings;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.video.ImVideoCompileService$compileVideo$1 */
final class ImVideoCompileService$compileVideo$1<T> implements C2205y<T> {
    final /* synthetic */ CompileParam $compileParam;
    final /* synthetic */ CompileResult $result;
    final /* synthetic */ ImVideoCompileService this$0;

    ImVideoCompileService$compileVideo$1(ImVideoCompileService imVideoCompileService, CompileParam compileParam, CompileResult compileResult) {
        this.this$0 = imVideoCompileService;
        this.$compileParam = compileParam;
        this.$result = compileResult;
    }

    public final void subscribe(C2204x<Boolean> xVar) {
        C52711k.m112240b(xVar, "it");
        C50720o createVEEditor = this.this$0.createVEEditor();
        C50711k imVideoCompileService$compileVideo$1$onCompileErrorCallback$1 = new ImVideoCompileService$compileVideo$1$onCompileErrorCallback$1(this, createVEEditor, xVar);
        C50711k imVideoCompileService$compileVideo$1$onCompileInfoCallback$1 = new ImVideoCompileService$compileVideo$1$onCompileInfoCallback$1(this, createVEEditor, xVar);
        try {
            int initVEEditor = this.this$0.initVEEditor(createVEEditor, this.$compileParam.getRawVideoPath());
            if (initVEEditor != 0) {
                StringBuilder sb = new StringBuilder("ImVideoCompileService VEEditor init error: ");
                sb.append(initVEEditor);
                C32458a.m75144a(sb.toString());
                ImVideoCompileService imVideoCompileService = this.this$0;
                StringBuilder sb2 = new StringBuilder("VEEditor init error: ");
                sb2.append(initVEEditor);
                imVideoCompileService.safeOnError(xVar, new IllegalStateException(sb2.toString()));
                return;
            }
            createVEEditor.mo99332a(imVideoCompileService$compileVideo$1$onCompileErrorCallback$1);
            createVEEditor.mo99351b(imVideoCompileService$compileVideo$1$onCompileInfoCallback$1);
            VEVideoEncodeSettings createEncodeSettings = this.this$0.createEncodeSettings(this.$compileParam);
            VESize videoRes = createEncodeSettings.getVideoRes();
            this.$result.setVideoWidth(videoRes.width);
            this.$result.setVideoHeight(videoRes.height);
            this.$result.setVideoPath(this.this$0.getOutputVideoFilePath());
            createVEEditor.mo99335a(this.$result.getVideoPath(), (String) null, createEncodeSettings);
        } catch (C50751p e) {
            Throwable th = e;
            C32458a.m75148a(th);
            this.this$0.safeOnError(xVar, new IllegalStateException("VEEditor init error", th));
        }
    }
}
