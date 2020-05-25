package org.msgpack.p2696b;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/* renamed from: org.msgpack.b.f */
public final class C53794f extends C53789a {

    /* renamed from: b */
    public LinkedList<ByteBuffer> f133399b = new LinkedList<>();

    /* renamed from: c */
    public int f133400c = -1;

    /* renamed from: d */
    private int f133401d;

    /* renamed from: e */
    private byte[] f133402e = new byte[8];

    /* renamed from: f */
    private ByteBuffer f133403f = ByteBuffer.wrap(this.f133402e);

    /* renamed from: g */
    private final int f133404g;

    public final void close() {
    }

    /* renamed from: c */
    public final byte mo113085c() throws EOFException {
        ByteBuffer b = m114409b(1);
        return b.get(b.position());
    }

    /* renamed from: d */
    public final short mo113086d() throws EOFException {
        ByteBuffer b = m114409b(2);
        return b.getShort(b.position());
    }

    /* renamed from: e */
    public final int mo113087e() throws EOFException {
        ByteBuffer b = m114409b(4);
        return b.getInt(b.position());
    }

    /* renamed from: f */
    public final long mo113088f() throws EOFException {
        ByteBuffer b = m114409b(8);
        return b.getLong(b.position());
    }

    /* renamed from: g */
    public final float mo113089g() throws EOFException {
        ByteBuffer b = m114409b(4);
        return b.getFloat(b.position());
    }

    /* renamed from: h */
    public final double mo113090h() throws EOFException {
        ByteBuffer b = m114409b(8);
        return b.getDouble(b.position());
    }

    /* renamed from: a */
    public final byte mo113081a() throws EOFException {
        ByteBuffer byteBuffer;
        try {
            byteBuffer = (ByteBuffer) this.f133399b.getFirst();
        } catch (NoSuchElementException unused) {
            byteBuffer = null;
        }
        if (byteBuffer == null || byteBuffer.remaining() == 0) {
            throw new C53792d();
        }
        byte b = byteBuffer.get();
        this.f133394a++;
        if (byteBuffer.remaining() == 0) {
            m114408a(byteBuffer);
        }
        return b;
    }

    /* renamed from: b */
    public final void mo113084b() {
        if (!this.f133399b.isEmpty()) {
            int i = this.f133401d;
            while (true) {
                ByteBuffer byteBuffer = (ByteBuffer) this.f133399b.getFirst();
                if (i >= byteBuffer.remaining()) {
                    i -= byteBuffer.remaining();
                    byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
                    if (!m114408a(byteBuffer)) {
                        break;
                    }
                } else {
                    byteBuffer.position(byteBuffer.position() + i);
                    break;
                }
            }
            mo113068a(this.f133401d);
            this.f133401d = 0;
        }
    }

    public C53794f(int i) {
        this.f133404g = i;
    }

    /* renamed from: a */
    private boolean m114408a(ByteBuffer byteBuffer) {
        if (this.f133399b.size() != 1) {
            this.f133399b.removeFirst();
            return true;
        } else if (this.f133400c >= 0) {
            byteBuffer.position(0);
            byteBuffer.limit(0);
            this.f133400c = byteBuffer.capacity();
            return false;
        } else {
            this.f133399b.removeFirst();
            return false;
        }
    }

    /* renamed from: b */
    private ByteBuffer m114409b(int i) throws EOFException {
        ByteBuffer byteBuffer;
        try {
            byteBuffer = (ByteBuffer) this.f133399b.getFirst();
        } catch (NoSuchElementException unused) {
            byteBuffer = null;
        }
        if (byteBuffer == null) {
            throw new C53792d();
        } else if (i <= byteBuffer.remaining()) {
            this.f133401d = i;
            return byteBuffer;
        } else {
            Iterator it = this.f133399b.iterator();
            int i2 = i;
            int i3 = 0;
            while (it.hasNext()) {
                ByteBuffer byteBuffer2 = (ByteBuffer) it.next();
                if (i2 <= byteBuffer2.remaining()) {
                    int position = byteBuffer2.position();
                    byteBuffer2.get(this.f133402e, i3, i2);
                    byteBuffer2.position(position);
                    this.f133401d = i;
                    return this.f133403f;
                }
                int remaining = byteBuffer2.remaining();
                int position2 = byteBuffer2.position();
                byteBuffer2.get(this.f133402e, i3, remaining);
                byteBuffer2.position(position2);
                i2 -= remaining;
                i3 += remaining;
            }
            throw new C53792d();
        }
    }

    /* renamed from: a */
    public final boolean mo113083a(C53790b bVar, int i) throws IOException {
        ByteBuffer byteBuffer;
        try {
            byteBuffer = (ByteBuffer) this.f133399b.getFirst();
        } catch (NoSuchElementException unused) {
            byteBuffer = null;
        }
        if (byteBuffer == null) {
            throw new C53792d();
        } else if (byteBuffer.remaining() < i) {
            return false;
        } else {
            int position = byteBuffer.position();
            int limit = byteBuffer.limit();
            position += i;
            try {
                byteBuffer.limit(position);
                bVar.refer(byteBuffer, true);
                mo113068a(i);
                return true;
            } finally {
                byteBuffer.limit(limit);
                byteBuffer.position(position);
                if (byteBuffer.remaining() == 0) {
                    m114408a(byteBuffer);
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo113082a(byte[] bArr, int i, int i2) throws EOFException {
        ByteBuffer byteBuffer;
        if (this.f133399b.isEmpty()) {
            return 0;
        }
        int i3 = i;
        int i4 = i2;
        do {
            byteBuffer = (ByteBuffer) this.f133399b.getFirst();
            if (i4 < byteBuffer.remaining()) {
                byteBuffer.get(bArr, i3, i4);
                mo113068a(i4);
                return i2;
            }
            int remaining = byteBuffer.remaining();
            byteBuffer.get(bArr, i3, remaining);
            mo113068a(remaining);
            i4 -= remaining;
            i3 += remaining;
        } while (m114408a(byteBuffer));
        return i2 - i4;
    }
}
