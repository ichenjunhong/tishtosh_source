package com.p683ss.android.ugc.aweme.discover.mixfeed;

import android.os.Handler;
import android.os.Message;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.g */
public final class C28324g<TTaskResult> implements C0011g<TTaskResult, Object> {

    /* renamed from: a */
    private Handler f74306a;

    /* renamed from: b */
    private int f74307b = 0;

    public final Object then(C0013i<TTaskResult> iVar) {
        if (!(this.f74306a == null || iVar == null || iVar.mo31c())) {
            Message obtainMessage = this.f74306a.obtainMessage(this.f74307b);
            if (iVar.mo33d()) {
                obtainMessage.obj = iVar.mo35f();
            } else {
                obtainMessage.obj = iVar.mo34e();
                if (obtainMessage.obj == null) {
                    return null;
                }
            }
            this.f74306a.sendMessage(obtainMessage);
        }
        return null;
    }

    public C28324g(Handler handler, int i) {
        this.f74306a = handler;
    }
}
