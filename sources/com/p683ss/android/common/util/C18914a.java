package com.p683ss.android.common.util;

/* renamed from: com.ss.android.common.util.a */
public final class C18914a extends Exception {
    private static final long serialVersionUID = -1098012010869697449L;

    /* renamed from: a */
    final int f52123a;

    /* renamed from: b */
    final long f52124b;

    public final long getLength() {
        return this.f52124b;
    }

    public final int getMaxSize() {
        return this.f52123a;
    }

    public C18914a(int i, long j) {
        StringBuilder sb = new StringBuilder("Download file too large: ");
        sb.append(i);
        sb.append(" ");
        sb.append(j);
        super(sb.toString());
        this.f52123a = i;
        this.f52124b = j;
    }
}
