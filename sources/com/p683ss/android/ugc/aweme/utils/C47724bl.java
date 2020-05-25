package com.p683ss.android.ugc.aweme.utils;

/* renamed from: com.ss.android.ugc.aweme.utils.bl */
public final class C47724bl {

    /* renamed from: a */
    public int f120233a;

    public C47724bl(int i) {
        this.f120233a = i;
    }

    /* renamed from: a */
    public final C47724bl mo95017a(int i) {
        this.f120233a = i | this.f120233a;
        return this;
    }

    /* renamed from: b */
    public final C47724bl mo95018b(int i) {
        if (mo95019c(i)) {
            this.f120233a = (i ^ -1) & this.f120233a;
        }
        return this;
    }

    /* renamed from: c */
    public final boolean mo95019c(int i) {
        if ((this.f120233a & i) == i) {
            return true;
        }
        return false;
    }
}
