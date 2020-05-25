package com.p683ss.android.ugc.aweme.poi.p2074ui.detail.p2078c;

import android.os.Handler;
import android.os.Message;
import com.p683ss.android.ugc.aweme.poi.model.C39126j;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.c.a */
public final class C39337a implements C0011g<C39126j, Void> {

    /* renamed from: a */
    private final Handler f100560a;

    /* renamed from: b */
    private final int f100561b;

    public final /* synthetic */ Object then(C0013i iVar) {
        if (this.f100560a == null || iVar == null) {
            return null;
        }
        Message obtainMessage = this.f100560a.obtainMessage(this.f100561b);
        if (iVar.mo31c()) {
            obtainMessage.obj = null;
        } else if (iVar.mo33d()) {
            obtainMessage.obj = iVar.mo35f();
        } else {
            obtainMessage.obj = iVar.mo34e();
        }
        this.f100560a.sendMessage(obtainMessage);
        return null;
    }

    public C39337a(Handler handler, int i) {
        C52711k.m112240b(handler, "handler");
        this.f100560a = handler;
        this.f100561b = i;
    }
}
