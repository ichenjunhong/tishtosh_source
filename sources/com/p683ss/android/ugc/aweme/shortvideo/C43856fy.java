package com.p683ss.android.ugc.aweme.shortvideo;

import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fy */
public final class C43856fy extends RuntimeException {

    /* renamed from: a */
    private boolean f111092a;

    /* renamed from: b */
    private boolean f111093b;

    public final boolean isRecover() {
        return this.f111092a;
    }

    public final boolean isUserNetworkBad() {
        return this.f111093b;
    }

    public final boolean isCauseByApiServerException() {
        return getCause() instanceof C23459a;
    }

    public final boolean isCauseByNoSpaceLeft() {
        if (!(getCause() instanceof C43809fd) || ((C43809fd) getCause()).getCode() != 100101) {
            return false;
        }
        return true;
    }

    public C43856fy(Throwable th) {
        super(th);
    }

    public final void setRecover(boolean z) {
        this.f111092a = z;
    }

    public C43856fy(Throwable th, boolean z) {
        super(th);
        this.f111093b = z;
    }
}
