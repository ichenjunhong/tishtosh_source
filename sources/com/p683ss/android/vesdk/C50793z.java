package com.p683ss.android.vesdk;

import android.graphics.Bitmap;
import com.p683ss.android.ttve.nativePort.TEVideoUtils;

/* renamed from: com.ss.android.vesdk.z */
public final class C50793z {

    /* renamed from: a */
    private volatile long f127605a;

    /* renamed from: a */
    public final synchronized void mo99490a() {
        TEVideoUtils.releaseGetFrameHandler(this.f127605a);
        this.f127605a = 0;
    }

    /* renamed from: a */
    public final synchronized void mo99491a(String str) {
        this.f127605a = TEVideoUtils.createGetFrameHandler(str);
    }

    /* renamed from: a */
    public final synchronized Bitmap mo99489a(int i, int i2, int i3, boolean z) throws C50751p {
        if (this.f127605a == 0) {
            return null;
        }
        return TEVideoUtils.getFrameWithHandler(this.f127605a, i, -1, i3, z);
    }
}
