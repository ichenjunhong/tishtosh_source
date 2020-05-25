package com.p683ss.android.ugc.aweme.account.util;

import android.os.Handler;
import android.os.Message;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.account.util.j */
public final class C22268j<TTaskResult> implements C0011g<TTaskResult, Object> {

    /* renamed from: a */
    Handler f60039a;

    /* renamed from: b */
    int f60040b = 0;

    public final Object then(C0013i<TTaskResult> iVar) {
        if (this.f60039a == null) {
            return null;
        }
        Message obtainMessage = this.f60039a.obtainMessage(this.f60040b);
        if (iVar.mo31c()) {
            obtainMessage.obj = null;
        } else if (iVar.mo33d()) {
            obtainMessage.obj = iVar.mo35f();
        } else {
            obtainMessage.obj = iVar.mo34e();
        }
        this.f60039a.sendMessage(obtainMessage);
        return null;
    }

    public C22268j(Handler handler, int i) {
        this.f60039a = handler;
    }
}
