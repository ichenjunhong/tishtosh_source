package com.p683ss.android.websocket.p2539b.p2543d;

import android.content.Context;
import com.p683ss.android.websocket.p2539b.p2541b.C50825e;

/* renamed from: com.ss.android.websocket.b.d.d */
public final class C50833d extends C50830a {

    /* renamed from: a */
    private int f127714a;

    /* renamed from: b */
    private int f127715b;

    /* renamed from: a */
    public final void mo99525a() {
        super.mo99525a();
        this.f127715b = 0;
    }

    public C50833d(Context context) {
        this(context, 3);
    }

    /* renamed from: a */
    public final long mo99524a(C50825e eVar) {
        long j;
        if (this.f127715b < this.f127714a) {
            j = super.mo99524a(eVar);
        } else {
            j = -1;
        }
        if (j != -1) {
            this.f127715b++;
        }
        return j;
    }

    private C50833d(Context context, int i) {
        super(context);
        this.f127714a = 3;
    }
}
