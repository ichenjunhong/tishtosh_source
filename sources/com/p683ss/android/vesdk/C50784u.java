package com.p683ss.android.vesdk;

import com.p683ss.android.vesdk.VEImageDetectUtils.IDetectImageResultListener;
import java.util.List;

/* renamed from: com.ss.android.vesdk.u */
public final class C50784u {

    /* renamed from: a */
    private VEImageDetectUtils f127598a;

    /* renamed from: a */
    public final void mo99486a() {
        if (this.f127598a != null) {
            this.f127598a.stopDetectImagesContentIfNeed();
        }
    }

    /* renamed from: a */
    public final synchronized void mo99488a(String str, List<String> list, List<String> list2, IDetectImageResultListener iDetectImageResultListener) {
        this.f127598a = new VEImageDetectUtils();
        this.f127598a.init();
        this.f127598a.setDetectImageContentListener(iDetectImageResultListener);
        this.f127598a.detectImagesContent(str, list, list2);
        this.f127598a.destroy();
    }

    /* renamed from: a */
    public final synchronized void mo99487a(String str, String str2, List<String> list, IDetectImageResultListener iDetectImageResultListener, int i, int i2) {
        this.f127598a = new VEImageDetectUtils();
        this.f127598a.init();
        this.f127598a.setDetectImageContentListener(iDetectImageResultListener);
        this.f127598a.detectImageContent(str, str2, list, 1280, 1280);
        this.f127598a.destroy();
    }
}
