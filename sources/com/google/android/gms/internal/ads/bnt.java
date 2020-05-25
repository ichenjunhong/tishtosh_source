package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class bnt implements bmv {

    /* renamed from: b */
    private int f43115b = -1;

    /* renamed from: c */
    private int f43116c = -1;

    /* renamed from: d */
    private int f43117d;

    /* renamed from: e */
    private ByteBuffer f43118e = f43002a;

    /* renamed from: f */
    private ByteBuffer f43119f = f43002a;

    /* renamed from: g */
    private boolean f43120g;

    /* renamed from: a */
    public final boolean mo30422a(int i, int i2, int i3) throws bmw {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new bmw(i, i2, i3);
        } else if (this.f43115b == i && this.f43116c == i2 && this.f43117d == i3) {
            return false;
        } else {
            this.f43115b = i;
            this.f43116c = i2;
            this.f43117d = i3;
            if (i3 == 2) {
                this.f43118e = f43002a;
            }
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo30421a() {
        return (this.f43117d == 0 || this.f43117d == 2) ? false : true;
    }

    /* renamed from: b */
    public final int mo30423b() {
        return this.f43116c;
    }

    /* renamed from: a */
    public final void mo30420a(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.f43117d;
        if (i3 == Integer.MIN_VALUE) {
            i = (i2 / 3) << 1;
        } else if (i3 == 3) {
            i = i2 << 1;
        } else if (i3 == 1073741824) {
            i = i2 / 2;
        } else {
            throw new IllegalStateException();
        }
        if (this.f43118e.capacity() < i) {
            this.f43118e = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f43118e.clear();
        }
        int i4 = this.f43117d;
        if (i4 == Integer.MIN_VALUE) {
            while (position < limit) {
                this.f43118e.put(byteBuffer.get(position + 1));
                this.f43118e.put(byteBuffer.get(position + 2));
                position += 3;
            }
        } else if (i4 == 3) {
            while (position < limit) {
                this.f43118e.put(0);
                this.f43118e.put((byte) ((byteBuffer.get(position) & 255) - 128));
                position++;
            }
        } else if (i4 == 1073741824) {
            while (position < limit) {
                this.f43118e.put(byteBuffer.get(position + 2));
                this.f43118e.put(byteBuffer.get(position + 3));
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        this.f43118e.flip();
        this.f43119f = this.f43118e;
    }

    /* renamed from: c */
    public final void mo30424c() {
        this.f43120g = true;
    }

    /* renamed from: d */
    public final ByteBuffer mo30425d() {
        ByteBuffer byteBuffer = this.f43119f;
        this.f43119f = f43002a;
        return byteBuffer;
    }

    /* renamed from: e */
    public final boolean mo30426e() {
        return this.f43120g && this.f43119f == f43002a;
    }

    /* renamed from: f */
    public final void mo30427f() {
        this.f43119f = f43002a;
        this.f43120g = false;
    }

    /* renamed from: g */
    public final void mo30428g() {
        mo30427f();
        this.f43118e = f43002a;
        this.f43115b = -1;
        this.f43116c = -1;
        this.f43117d = 0;
    }
}
