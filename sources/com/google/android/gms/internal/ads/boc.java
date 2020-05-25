package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class boc extends bnw {

    /* renamed from: b */
    public final bnx f43181b = new bnx();

    /* renamed from: c */
    public ByteBuffer f43182c;

    /* renamed from: d */
    public long f43183d;

    /* renamed from: e */
    private final int f43184e = 0;

    public boc(int i) {
    }

    /* renamed from: e */
    public final boolean mo30485e() {
        return mo30479a(1073741824);
    }

    /* renamed from: a */
    public final void mo30478a() {
        super.mo30478a();
        if (this.f43182c != null) {
            this.f43182c.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final ByteBuffer mo30484b(int i) {
        int capacity = this.f43182c == null ? 0 : this.f43182c.capacity();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(capacity);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }
}
