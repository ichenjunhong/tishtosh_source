package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.recommend;

import android.os.Handler;
import android.os.Message;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.a */
public final class C34651a<TTaskResult> implements C0011g<TTaskResult, Object> {

    /* renamed from: a */
    private Handler f89266a;

    /* renamed from: b */
    private int f89267b = 0;

    public final Object then(C0013i<TTaskResult> iVar) {
        if (this.f89266a == null) {
            return null;
        }
        Message obtainMessage = this.f89266a.obtainMessage(this.f89267b);
        if (iVar.mo31c()) {
            obtainMessage.obj = null;
        } else if (iVar.mo33d()) {
            obtainMessage.obj = iVar.mo35f();
        } else {
            obtainMessage.obj = iVar.mo34e();
        }
        this.f89266a.sendMessage(obtainMessage);
        return null;
    }

    public C34651a(Handler handler, int i) {
        this.f89266a = handler;
    }
}
