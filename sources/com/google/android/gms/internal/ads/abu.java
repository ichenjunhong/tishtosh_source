package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.p1029b.C14902a;
import com.google.android.gms.common.C15373d;
import com.google.android.gms.common.C15382e;
import java.io.IOException;

final class abu extends C15563abr {

    /* renamed from: a */
    private Context f40212a;

    abu(Context context) {
        this.f40212a = context;
    }

    /* renamed from: x_ */
    public final void mo27697x_() {
    }

    /* renamed from: a */
    public final void mo27696a() {
        boolean z;
        try {
            z = C14902a.m30580b(this.f40212a);
        } catch (C15373d | C15382e | IOException | IllegalStateException e) {
            abv.m32793b("Fail to get isAdIdFakeForDebugLogging", e);
            z = false;
        }
        synchronized (aew.f40385a) {
            aew.f40386b = true;
            aew.f40387c = z;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("Update ad debug logging enablement as ");
        sb.append(z);
        abv.m32798e(sb.toString());
    }
}
