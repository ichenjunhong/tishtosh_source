package com.p683ss.android.ugc.aweme.net;

import android.os.Handler;
import android.os.Message;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.net.h */
public final class C37776h<TTaskResult> implements C0011g<TTaskResult, Object> {

    /* renamed from: a */
    private Handler f96242a;

    /* renamed from: b */
    private int f96243b;

    public final Object then(C0013i<TTaskResult> iVar) {
        if (this.f96242a == null) {
            return null;
        }
        Message obtainMessage = this.f96242a.obtainMessage(this.f96243b);
        if (iVar.mo31c()) {
            obtainMessage.obj = null;
        } else if (iVar.mo33d()) {
            obtainMessage.obj = iVar.mo35f();
        } else {
            obtainMessage.obj = iVar.mo34e();
        }
        this.f96242a.sendMessage(obtainMessage);
        return null;
    }

    public C37776h(Handler handler, int i) {
        this.f96242a = handler;
        this.f96243b = i;
    }
}
