package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

final class awp extends awr {

    /* renamed from: a */
    private int f41470a;

    /* renamed from: b */
    private final int f41471b = this.f41472c.size();

    /* renamed from: c */
    private final /* synthetic */ awo f41472c;

    awp(awo awo) {
        this.f41472c = awo;
    }

    public final boolean hasNext() {
        return this.f41470a < this.f41471b;
    }

    /* renamed from: a */
    public final byte mo29625a() {
        int i = this.f41470a;
        if (i < this.f41471b) {
            this.f41470a = i + 1;
            return this.f41472c.mo29609a(i);
        }
        throw new NoSuchElementException();
    }
}
