package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public final class bnv implements bmv {

    /* renamed from: b */
    public long f43145b;

    /* renamed from: c */
    public long f43146c;

    /* renamed from: d */
    private int f43147d = -1;

    /* renamed from: e */
    private int f43148e = -1;

    /* renamed from: f */
    private bnu f43149f;

    /* renamed from: g */
    private float f43150g = 1.0f;

    /* renamed from: h */
    private float f43151h = 1.0f;

    /* renamed from: i */
    private ByteBuffer f43152i = f43002a;

    /* renamed from: j */
    private ShortBuffer f43153j = this.f43152i.asShortBuffer();

    /* renamed from: k */
    private ByteBuffer f43154k = f43002a;

    /* renamed from: l */
    private boolean f43155l;

    /* renamed from: a */
    public final float mo30476a(float f) {
        this.f43150g = btw.m36753a(f, 0.1f, 8.0f);
        return this.f43150g;
    }

    /* renamed from: b */
    public final float mo30477b(float f) {
        this.f43151h = btw.m36753a(f, 0.1f, 8.0f);
        return f;
    }

    /* renamed from: a */
    public final boolean mo30422a(int i, int i2, int i3) throws bmw {
        if (i3 != 2) {
            throw new bmw(i, i2, i3);
        } else if (this.f43148e == i && this.f43147d == i2) {
            return false;
        } else {
            this.f43148e = i;
            this.f43147d = i2;
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo30421a() {
        return Math.abs(this.f43150g - 1.0f) >= 0.01f || Math.abs(this.f43151h - 1.0f) >= 0.01f;
    }

    /* renamed from: b */
    public final int mo30423b() {
        return this.f43147d;
    }

    /* renamed from: a */
    public final void mo30420a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f43145b += (long) remaining;
            bnu bnu = this.f43149f;
            int remaining2 = asShortBuffer.remaining() / bnu.f43121a;
            int i = (bnu.f43121a * remaining2) << 1;
            bnu.mo30475a(remaining2);
            asShortBuffer.get(bnu.f43123c, bnu.f43127g * bnu.f43121a, i / 2);
            bnu.f43127g += remaining2;
            bnu.mo30474a();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int i2 = (this.f43149f.f43128h * this.f43147d) << 1;
        if (i2 > 0) {
            if (this.f43152i.capacity() < i2) {
                this.f43152i = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
                this.f43153j = this.f43152i.asShortBuffer();
            } else {
                this.f43152i.clear();
                this.f43153j.clear();
            }
            bnu bnu2 = this.f43149f;
            ShortBuffer shortBuffer = this.f43153j;
            int min = Math.min(shortBuffer.remaining() / bnu2.f43121a, bnu2.f43128h);
            shortBuffer.put(bnu2.f43124d, 0, bnu2.f43121a * min);
            bnu2.f43128h -= min;
            System.arraycopy(bnu2.f43124d, min * bnu2.f43121a, bnu2.f43124d, 0, bnu2.f43128h * bnu2.f43121a);
            this.f43146c += (long) i2;
            this.f43152i.limit(i2);
            this.f43154k = this.f43152i;
        }
    }

    /* renamed from: c */
    public final void mo30424c() {
        bnu bnu = this.f43149f;
        int i = bnu.f43127g;
        int i2 = bnu.f43128h + ((int) ((((((float) i) / (bnu.f43125e / bnu.f43126f)) + ((float) bnu.f43129i)) / bnu.f43126f) + 0.5f));
        bnu.mo30475a((bnu.f43122b * 2) + i);
        for (int i3 = 0; i3 < bnu.f43122b * 2 * bnu.f43121a; i3++) {
            bnu.f43123c[(bnu.f43121a * i) + i3] = 0;
        }
        bnu.f43127g += bnu.f43122b * 2;
        bnu.mo30474a();
        if (bnu.f43128h > i2) {
            bnu.f43128h = i2;
        }
        bnu.f43127g = 0;
        bnu.f43130j = 0;
        bnu.f43129i = 0;
        this.f43155l = true;
    }

    /* renamed from: d */
    public final ByteBuffer mo30425d() {
        ByteBuffer byteBuffer = this.f43154k;
        this.f43154k = f43002a;
        return byteBuffer;
    }

    /* renamed from: e */
    public final boolean mo30426e() {
        return this.f43155l && (this.f43149f == null || this.f43149f.f43128h == 0);
    }

    /* renamed from: f */
    public final void mo30427f() {
        this.f43149f = new bnu(this.f43148e, this.f43147d);
        this.f43149f.f43125e = this.f43150g;
        this.f43149f.f43126f = this.f43151h;
        this.f43154k = f43002a;
        this.f43145b = 0;
        this.f43146c = 0;
        this.f43155l = false;
    }

    /* renamed from: g */
    public final void mo30428g() {
        this.f43149f = null;
        this.f43152i = f43002a;
        this.f43153j = this.f43152i.asShortBuffer();
        this.f43154k = f43002a;
        this.f43147d = -1;
        this.f43148e = -1;
        this.f43145b = 0;
        this.f43146c = 0;
        this.f43155l = false;
    }
}
