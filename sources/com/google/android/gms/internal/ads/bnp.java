package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

final class bnp implements bmv {

    /* renamed from: b */
    public int[] f43097b;

    /* renamed from: c */
    private int f43098c = -1;

    /* renamed from: d */
    private int f43099d = -1;

    /* renamed from: e */
    private boolean f43100e;

    /* renamed from: f */
    private int[] f43101f;

    /* renamed from: g */
    private ByteBuffer f43102g = f43002a;

    /* renamed from: h */
    private ByteBuffer f43103h = f43002a;

    /* renamed from: i */
    private boolean f43104i;

    /* renamed from: a */
    public final boolean mo30422a(int i, int i2, int i3) throws bmw {
        boolean z = !Arrays.equals(this.f43097b, this.f43101f);
        this.f43101f = this.f43097b;
        if (this.f43101f == null) {
            this.f43100e = false;
            return z;
        } else if (i3 != 2) {
            throw new bmw(i, i2, i3);
        } else if (!z && this.f43099d == i && this.f43098c == i2) {
            return false;
        } else {
            this.f43099d = i;
            this.f43098c = i2;
            this.f43100e = i2 != this.f43101f.length;
            int i4 = 0;
            while (i4 < this.f43101f.length) {
                int i5 = this.f43101f[i4];
                if (i5 < i2) {
                    this.f43100e = (i5 != i4) | this.f43100e;
                    i4++;
                } else {
                    throw new bmw(i, i2, i3);
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo30421a() {
        return this.f43100e;
    }

    /* renamed from: b */
    public final int mo30423b() {
        return this.f43101f == null ? this.f43098c : this.f43101f.length;
    }

    /* renamed from: a */
    public final void mo30420a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = (((limit - position) / (this.f43098c * 2)) * this.f43101f.length) << 1;
        if (this.f43102g.capacity() < length) {
            this.f43102g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f43102g.clear();
        }
        while (position < limit) {
            for (int i : this.f43101f) {
                this.f43102g.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f43098c << 1;
        }
        byteBuffer.position(limit);
        this.f43102g.flip();
        this.f43103h = this.f43102g;
    }

    /* renamed from: c */
    public final void mo30424c() {
        this.f43104i = true;
    }

    /* renamed from: d */
    public final ByteBuffer mo30425d() {
        ByteBuffer byteBuffer = this.f43103h;
        this.f43103h = f43002a;
        return byteBuffer;
    }

    /* renamed from: e */
    public final boolean mo30426e() {
        return this.f43104i && this.f43103h == f43002a;
    }

    /* renamed from: f */
    public final void mo30427f() {
        this.f43103h = f43002a;
        this.f43104i = false;
    }

    /* renamed from: g */
    public final void mo30428g() {
        mo30427f();
        this.f43102g = f43002a;
        this.f43098c = -1;
        this.f43099d = -1;
        this.f43101f = null;
        this.f43100e = false;
    }
}
