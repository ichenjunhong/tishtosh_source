package com.p683ss.android.ugc.aweme.services.external.ability;

import android.content.Context;
import android.view.SurfaceHolder;

/* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVCameraService */
public interface IAVCameraService {

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVCameraService$IAVCameraReadyCallback */
    public interface IAVCameraReadyCallback<T> {
        void finish(T t);
    }

    void getScanner(boolean z, Context context, SurfaceHolder surfaceHolder, IAVCameraReadyCallback<IQRCodeScanner> iAVCameraReadyCallback);
}
