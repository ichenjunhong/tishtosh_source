package com.p683ss.android.ugc.aweme.freeflowcard.data.p1786b;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.freeflowcard.data.b.b */
public final class C32489b implements Serializable {
    public int changeType;
    public long dayOpenResetTime;

    /* renamed from: id */
    public int f84581id;
    public boolean isDayOpen;
    public boolean isOpen;
    public int monthlyState;
    public long resetTime;

    public C32489b(boolean z, int i, long j, int i2, boolean z2, long j2) {
        this.isOpen = z;
        this.changeType = i;
        this.resetTime = j;
        this.monthlyState = i2;
        this.isDayOpen = z2;
        this.dayOpenResetTime = j2;
    }
}
