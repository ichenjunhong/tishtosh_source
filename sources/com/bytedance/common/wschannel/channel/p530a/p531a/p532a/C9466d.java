package com.bytedance.common.wschannel.channel.p530a.p531a.p532a;

import android.content.Context;

/* renamed from: com.bytedance.common.wschannel.channel.a.a.a.d */
public final class C9466d extends C9463a {

    /* renamed from: a */
    private final int f25757a;

    /* renamed from: b */
    private int f25758b;

    /* renamed from: c */
    public final void mo17152c() {
        super.mo17152c();
        this.f25758b = 0;
    }

    /* renamed from: a */
    public final long mo17149a() {
        long j;
        if (this.f25758b < this.f25757a) {
            j = super.mo17149a();
        } else {
            j = -1;
        }
        if (j != -1) {
            this.f25758b++;
        }
        return j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RetryTimesPolicy{mMaxRetryTime=");
        sb.append(this.f25757a);
        sb.append(", mCurrRetryTime=");
        sb.append(this.f25758b);
        sb.append('}');
        return sb.toString();
    }

    public C9466d(Context context) {
        this(context, 4);
    }

    private C9466d(Context context, int i) {
        super(context);
        this.f25757a = 4;
    }
}
