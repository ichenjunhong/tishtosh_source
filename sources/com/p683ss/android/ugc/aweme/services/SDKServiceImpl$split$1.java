package com.p683ss.android.ugc.aweme.services;

import com.p683ss.android.ugc.aweme.services.ISDKService.SplitCallback;
import com.p683ss.android.vesdk.C50720o;
import com.p683ss.android.vesdk.VEListener.C50547k;

/* renamed from: com.ss.android.ugc.aweme.services.SDKServiceImpl$split$1 */
public final class SDKServiceImpl$split$1 implements C50547k {
    final /* synthetic */ SplitCallback $callback;
    final /* synthetic */ C50720o $editor;
    final /* synthetic */ int $height;
    final /* synthetic */ int $width;

    public final void onCompileProgress(float f) {
    }

    public final void onCompileDone() {
        this.$callback.onSuccess(this.$width, this.$height);
        this.$editor.mo99389m();
    }

    SDKServiceImpl$split$1(SplitCallback splitCallback, int i, int i2, C50720o oVar) {
        this.$callback = splitCallback;
        this.$width = i;
        this.$height = i2;
        this.$editor = oVar;
    }

    public final void onCompileError(int i, int i2, float f, String str) {
        this.$callback.onFail();
        this.$editor.mo99389m();
    }
}
