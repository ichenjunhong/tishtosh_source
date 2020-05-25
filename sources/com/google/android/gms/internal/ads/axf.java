package com.google.android.gms.internal.ads;

import com.C2240a;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class axf extends awn {

    /* renamed from: b */
    private static final Logger f41495b = Logger.getLogger(axf.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f41496c = bba.m35157a();

    /* renamed from: a */
    axh f41497a = this;

    /* renamed from: com.google.android.gms.internal.ads.axf$a */
    static class C15665a extends axf {

        /* renamed from: b */
        final int f41498b;

        /* renamed from: c */
        int f41499c;

        /* renamed from: d */
        private final byte[] f41500d;

        /* renamed from: e */
        private final int f41501e;

        C15665a(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f41500d = bArr;
                    this.f41498b = i;
                    this.f41499c = i;
                    this.f41501e = i3;
                    return;
                }
                throw new IllegalArgumentException(C2240a.m6772a("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: a */
        public void mo29701a() {
        }

        /* renamed from: a */
        public final void mo29708a(int i, int i2) throws IOException {
            mo29723b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo29724b(int i, int i2) throws IOException {
            mo29708a(i, 0);
            mo29705a(i2);
        }

        /* renamed from: c */
        public final void mo29732c(int i, int i2) throws IOException {
            mo29708a(i, 0);
            mo29723b(i2);
        }

        /* renamed from: e */
        public final void mo29738e(int i, int i2) throws IOException {
            mo29708a(i, 5);
            mo29736d(i2);
        }

        /* renamed from: a */
        public final void mo29709a(int i, long j) throws IOException {
            mo29708a(i, 0);
            mo29715a(j);
        }

        /* renamed from: c */
        public final void mo29733c(int i, long j) throws IOException {
            mo29708a(i, 1);
            mo29734c(j);
        }

        /* renamed from: a */
        public final void mo29714a(int i, boolean z) throws IOException {
            mo29708a(i, 0);
            mo29702a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo29713a(int i, String str) throws IOException {
            mo29708a(i, 2);
            mo29719a(str);
        }

        /* renamed from: a */
        public final void mo29710a(int i, awo awo) throws IOException {
            mo29708a(i, 2);
            mo29716a(awo);
        }

        /* renamed from: a */
        public final void mo29716a(awo awo) throws IOException {
            mo29723b(awo.size());
            awo.mo29612a((awn) this);
        }

        /* renamed from: c */
        public final void mo29735c(byte[] bArr, int i, int i2) throws IOException {
            mo29723b(i2);
            mo29729b(bArr, 0, i2);
        }

        /* renamed from: a */
        public final void mo29711a(int i, azj azj) throws IOException {
            mo29708a(i, 2);
            mo29717a(azj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo29712a(int i, azj azj, bab bab) throws IOException {
            mo29708a(i, 2);
            awe awe = (awe) azj;
            int g = awe.mo29581g();
            if (g == -1) {
                g = bab.mo29899b(awe);
                awe.mo29578a(g);
            }
            mo29723b(g);
            bab.mo29896a(azj, (bbq) this.f41497a);
        }

        /* renamed from: b */
        public final void mo29727b(int i, azj azj) throws IOException {
            mo29708a(1, 3);
            mo29732c(2, i);
            mo29711a(3, azj);
            mo29708a(1, 4);
        }

        /* renamed from: b */
        public final void mo29726b(int i, awo awo) throws IOException {
            mo29708a(1, 3);
            mo29732c(2, i);
            mo29710a(3, awo);
            mo29708a(1, 4);
        }

        /* renamed from: a */
        public final void mo29717a(azj azj) throws IOException {
            mo29723b(azj.mo29824i());
            azj.mo29820a(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo29718a(azj azj, bab bab) throws IOException {
            awe awe = (awe) azj;
            int g = awe.mo29581g();
            if (g == -1) {
                g = bab.mo29899b(awe);
                awe.mo29578a(g);
            }
            mo29723b(g);
            bab.mo29896a(azj, (bbq) this.f41497a);
        }

        /* renamed from: a */
        public final void mo29702a(byte b) throws IOException {
            try {
                byte[] bArr = this.f41500d;
                int i = this.f41499c;
                this.f41499c = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C15667c(C2240a.m6772a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f41499c), Integer.valueOf(this.f41501e), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: a */
        public final void mo29705a(int i) throws IOException {
            if (i >= 0) {
                mo29723b(i);
            } else {
                mo29715a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo29723b(int i) throws IOException {
            if (!axf.f41496c || mo29722b() < 10) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f41500d;
                    int i2 = this.f41499c;
                    this.f41499c = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f41500d;
                    int i3 = this.f41499c;
                    this.f41499c = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new C15667c(C2240a.m6772a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f41499c), Integer.valueOf(this.f41501e), Integer.valueOf(1)}), e);
                }
            } else {
                while ((i & -128) != 0) {
                    byte[] bArr3 = this.f41500d;
                    int i4 = this.f41499c;
                    this.f41499c = i4 + 1;
                    bba.m35156a(bArr3, (long) i4, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr4 = this.f41500d;
                int i5 = this.f41499c;
                this.f41499c = i5 + 1;
                bba.m35156a(bArr4, (long) i5, (byte) i);
            }
        }

        /* renamed from: d */
        public final void mo29736d(int i) throws IOException {
            try {
                byte[] bArr = this.f41500d;
                int i2 = this.f41499c;
                this.f41499c = i2 + 1;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.f41500d;
                int i3 = this.f41499c;
                this.f41499c = i3 + 1;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.f41500d;
                int i4 = this.f41499c;
                this.f41499c = i4 + 1;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.f41500d;
                int i5 = this.f41499c;
                this.f41499c = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new C15667c(C2240a.m6772a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f41499c), Integer.valueOf(this.f41501e), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: a */
        public final void mo29715a(long j) throws IOException {
            if (!axf.f41496c || mo29722b() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f41500d;
                    int i = this.f41499c;
                    this.f41499c = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f41500d;
                    int i2 = this.f41499c;
                    this.f41499c = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new C15667c(C2240a.m6772a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f41499c), Integer.valueOf(this.f41501e), Integer.valueOf(1)}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f41500d;
                    int i3 = this.f41499c;
                    this.f41499c = i3 + 1;
                    bba.m35156a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f41500d;
                int i4 = this.f41499c;
                this.f41499c = i4 + 1;
                bba.m35156a(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: c */
        public final void mo29734c(long j) throws IOException {
            try {
                byte[] bArr = this.f41500d;
                int i = this.f41499c;
                this.f41499c = i + 1;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.f41500d;
                int i2 = this.f41499c;
                this.f41499c = i2 + 1;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.f41500d;
                int i3 = this.f41499c;
                this.f41499c = i3 + 1;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.f41500d;
                int i4 = this.f41499c;
                this.f41499c = i4 + 1;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.f41500d;
                int i5 = this.f41499c;
                this.f41499c = i5 + 1;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.f41500d;
                int i6 = this.f41499c;
                this.f41499c = i6 + 1;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.f41500d;
                int i7 = this.f41499c;
                this.f41499c = i7 + 1;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.f41500d;
                int i8 = this.f41499c;
                this.f41499c = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new C15667c(C2240a.m6772a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f41499c), Integer.valueOf(this.f41501e), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: b */
        public final void mo29729b(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f41500d, this.f41499c, i2);
                this.f41499c += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C15667c(C2240a.m6772a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f41499c), Integer.valueOf(this.f41501e), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: a */
        public final void mo29608a(byte[] bArr, int i, int i2) throws IOException {
            mo29729b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo29719a(String str) throws IOException {
            int i = this.f41499c;
            try {
                int g = m34457g(str.length() * 3);
                int g2 = m34457g(str.length());
                if (g2 == g) {
                    this.f41499c = i + g2;
                    int a = bbc.m35231a(str, this.f41500d, this.f41499c, mo29722b());
                    this.f41499c = i;
                    mo29723b((a - i) - g2);
                    this.f41499c = a;
                    return;
                }
                mo29723b(bbc.m35230a((CharSequence) str));
                this.f41499c = bbc.m35231a(str, this.f41500d, this.f41499c, mo29722b());
            } catch (bbg e) {
                this.f41499c = i;
                mo29720a(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new C15667c((Throwable) e2);
            }
        }

        /* renamed from: b */
        public final int mo29722b() {
            return this.f41501e - this.f41499c;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.axf$b */
    static final class C15666b extends C15665a {

        /* renamed from: d */
        private final ByteBuffer f41502d;

        /* renamed from: e */
        private int f41503e;

        C15666b(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f41502d = byteBuffer;
            this.f41503e = byteBuffer.position();
        }

        /* renamed from: a */
        public final void mo29701a() {
            this.f41502d.position(this.f41503e + (this.f41499c - this.f41498b));
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.axf$c */
    public static class C15667c extends IOException {
        C15667c() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        C15667c(String str) {
            String valueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            String valueOf2 = String.valueOf(str);
            super(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        }

        C15667c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        C15667c(String str, Throwable th) {
            String valueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            String valueOf2 = String.valueOf(str);
            super(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), th);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.axf$d */
    static final class C15668d extends axf {

        /* renamed from: b */
        private final ByteBuffer f41504b;

        /* renamed from: c */
        private final ByteBuffer f41505c;

        /* renamed from: d */
        private final int f41506d;

        C15668d(ByteBuffer byteBuffer) {
            super();
            this.f41504b = byteBuffer;
            this.f41505c = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f41506d = byteBuffer.position();
        }

        /* renamed from: a */
        public final void mo29708a(int i, int i2) throws IOException {
            mo29723b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo29724b(int i, int i2) throws IOException {
            mo29708a(i, 0);
            mo29705a(i2);
        }

        /* renamed from: c */
        public final void mo29732c(int i, int i2) throws IOException {
            mo29708a(i, 0);
            mo29723b(i2);
        }

        /* renamed from: e */
        public final void mo29738e(int i, int i2) throws IOException {
            mo29708a(i, 5);
            mo29736d(i2);
        }

        /* renamed from: a */
        public final void mo29709a(int i, long j) throws IOException {
            mo29708a(i, 0);
            mo29715a(j);
        }

        /* renamed from: c */
        public final void mo29733c(int i, long j) throws IOException {
            mo29708a(i, 1);
            mo29734c(j);
        }

        /* renamed from: a */
        public final void mo29714a(int i, boolean z) throws IOException {
            mo29708a(i, 0);
            mo29702a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo29713a(int i, String str) throws IOException {
            mo29708a(i, 2);
            mo29719a(str);
        }

        /* renamed from: a */
        public final void mo29710a(int i, awo awo) throws IOException {
            mo29708a(i, 2);
            mo29716a(awo);
        }

        /* renamed from: a */
        public final void mo29711a(int i, azj azj) throws IOException {
            mo29708a(i, 2);
            mo29717a(azj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo29712a(int i, azj azj, bab bab) throws IOException {
            mo29708a(i, 2);
            mo29718a(azj, bab);
        }

        /* renamed from: b */
        public final void mo29727b(int i, azj azj) throws IOException {
            mo29708a(1, 3);
            mo29732c(2, i);
            mo29711a(3, azj);
            mo29708a(1, 4);
        }

        /* renamed from: b */
        public final void mo29726b(int i, awo awo) throws IOException {
            mo29708a(1, 3);
            mo29732c(2, i);
            mo29710a(3, awo);
            mo29708a(1, 4);
        }

        /* renamed from: a */
        public final void mo29717a(azj azj) throws IOException {
            mo29723b(azj.mo29824i());
            azj.mo29820a(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo29718a(azj azj, bab bab) throws IOException {
            awe awe = (awe) azj;
            int g = awe.mo29581g();
            if (g == -1) {
                g = bab.mo29899b(awe);
                awe.mo29578a(g);
            }
            mo29723b(g);
            bab.mo29896a(azj, (bbq) this.f41497a);
        }

        /* renamed from: a */
        public final void mo29702a(byte b) throws IOException {
            try {
                this.f41505c.put(b);
            } catch (BufferOverflowException e) {
                throw new C15667c((Throwable) e);
            }
        }

        /* renamed from: a */
        public final void mo29716a(awo awo) throws IOException {
            mo29723b(awo.size());
            awo.mo29612a((awn) this);
        }

        /* renamed from: c */
        public final void mo29735c(byte[] bArr, int i, int i2) throws IOException {
            mo29723b(i2);
            mo29729b(bArr, 0, i2);
        }

        /* renamed from: a */
        public final void mo29705a(int i) throws IOException {
            if (i >= 0) {
                mo29723b(i);
            } else {
                mo29715a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo29723b(int i) throws IOException {
            while ((i & -128) != 0) {
                this.f41505c.put((byte) ((i & 127) | 128));
                i >>>= 7;
            }
            try {
                this.f41505c.put((byte) i);
            } catch (BufferOverflowException e) {
                throw new C15667c((Throwable) e);
            }
        }

        /* renamed from: d */
        public final void mo29736d(int i) throws IOException {
            try {
                this.f41505c.putInt(i);
            } catch (BufferOverflowException e) {
                throw new C15667c((Throwable) e);
            }
        }

        /* renamed from: a */
        public final void mo29715a(long j) throws IOException {
            while ((-128 & j) != 0) {
                this.f41505c.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            try {
                this.f41505c.put((byte) ((int) j));
            } catch (BufferOverflowException e) {
                throw new C15667c((Throwable) e);
            }
        }

        /* renamed from: c */
        public final void mo29734c(long j) throws IOException {
            try {
                this.f41505c.putLong(j);
            } catch (BufferOverflowException e) {
                throw new C15667c((Throwable) e);
            }
        }

        /* renamed from: b */
        public final void mo29729b(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.f41505c.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new C15667c((Throwable) e);
            } catch (BufferOverflowException e2) {
                throw new C15667c((Throwable) e2);
            }
        }

        /* renamed from: a */
        public final void mo29608a(byte[] bArr, int i, int i2) throws IOException {
            mo29729b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo29719a(String str) throws IOException {
            int position = this.f41505c.position();
            try {
                int g = m34457g(str.length() * 3);
                int g2 = m34457g(str.length());
                if (g2 == g) {
                    int position2 = this.f41505c.position() + g2;
                    this.f41505c.position(position2);
                    m34537c(str);
                    int position3 = this.f41505c.position();
                    this.f41505c.position(position);
                    mo29723b(position3 - position2);
                    this.f41505c.position(position3);
                    return;
                }
                mo29723b(bbc.m35230a((CharSequence) str));
                m34537c(str);
            } catch (bbg e) {
                this.f41505c.position(position);
                mo29720a(str, e);
            } catch (IllegalArgumentException e2) {
                throw new C15667c((Throwable) e2);
            }
        }

        /* renamed from: a */
        public final void mo29701a() {
            this.f41504b.position(this.f41505c.position());
        }

        /* renamed from: b */
        public final int mo29722b() {
            return this.f41505c.remaining();
        }

        /* renamed from: c */
        private final void m34537c(String str) throws IOException {
            try {
                bbc.m35232a((CharSequence) str, this.f41505c);
            } catch (IndexOutOfBoundsException e) {
                throw new C15667c((Throwable) e);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.axf$e */
    static final class C15669e extends axf {

        /* renamed from: b */
        private final ByteBuffer f41507b;

        /* renamed from: c */
        private final ByteBuffer f41508c;

        /* renamed from: d */
        private final long f41509d;

        /* renamed from: e */
        private final long f41510e;

        /* renamed from: f */
        private final long f41511f;

        /* renamed from: g */
        private final long f41512g = (this.f41511f - 10);

        /* renamed from: h */
        private long f41513h = this.f41510e;

        C15669e(ByteBuffer byteBuffer) {
            super();
            this.f41507b = byteBuffer;
            this.f41508c = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f41509d = bba.m35145a(byteBuffer);
            this.f41510e = this.f41509d + ((long) byteBuffer.position());
            this.f41511f = this.f41509d + ((long) byteBuffer.limit());
        }

        /* renamed from: a */
        public final void mo29708a(int i, int i2) throws IOException {
            mo29723b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo29724b(int i, int i2) throws IOException {
            mo29708a(i, 0);
            mo29705a(i2);
        }

        /* renamed from: c */
        public final void mo29732c(int i, int i2) throws IOException {
            mo29708a(i, 0);
            mo29723b(i2);
        }

        /* renamed from: e */
        public final void mo29738e(int i, int i2) throws IOException {
            mo29708a(i, 5);
            mo29736d(i2);
        }

        /* renamed from: a */
        public final void mo29709a(int i, long j) throws IOException {
            mo29708a(i, 0);
            mo29715a(j);
        }

        /* renamed from: c */
        public final void mo29733c(int i, long j) throws IOException {
            mo29708a(i, 1);
            mo29734c(j);
        }

        /* renamed from: a */
        public final void mo29714a(int i, boolean z) throws IOException {
            mo29708a(i, 0);
            mo29702a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo29713a(int i, String str) throws IOException {
            mo29708a(i, 2);
            mo29719a(str);
        }

        /* renamed from: a */
        public final void mo29710a(int i, awo awo) throws IOException {
            mo29708a(i, 2);
            mo29716a(awo);
        }

        /* renamed from: a */
        public final void mo29711a(int i, azj azj) throws IOException {
            mo29708a(i, 2);
            mo29717a(azj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo29712a(int i, azj azj, bab bab) throws IOException {
            mo29708a(i, 2);
            mo29718a(azj, bab);
        }

        /* renamed from: b */
        public final void mo29727b(int i, azj azj) throws IOException {
            mo29708a(1, 3);
            mo29732c(2, i);
            mo29711a(3, azj);
            mo29708a(1, 4);
        }

        /* renamed from: b */
        public final void mo29726b(int i, awo awo) throws IOException {
            mo29708a(1, 3);
            mo29732c(2, i);
            mo29710a(3, awo);
            mo29708a(1, 4);
        }

        /* renamed from: a */
        public final void mo29717a(azj azj) throws IOException {
            mo29723b(azj.mo29824i());
            azj.mo29820a(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo29718a(azj azj, bab bab) throws IOException {
            awe awe = (awe) azj;
            int g = awe.mo29581g();
            if (g == -1) {
                g = bab.mo29899b(awe);
                awe.mo29578a(g);
            }
            mo29723b(g);
            bab.mo29896a(azj, (bbq) this.f41497a);
        }

        /* renamed from: a */
        public final void mo29702a(byte b) throws IOException {
            if (this.f41513h < this.f41511f) {
                long j = this.f41513h;
                this.f41513h = 1 + j;
                bba.m35148a(j, b);
                return;
            }
            throw new C15667c(C2240a.m6772a("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f41513h), Long.valueOf(this.f41511f), Integer.valueOf(1)}));
        }

        /* renamed from: a */
        public final void mo29716a(awo awo) throws IOException {
            mo29723b(awo.size());
            awo.mo29612a((awn) this);
        }

        /* renamed from: c */
        public final void mo29735c(byte[] bArr, int i, int i2) throws IOException {
            mo29723b(i2);
            mo29729b(bArr, 0, i2);
        }

        /* renamed from: a */
        public final void mo29705a(int i) throws IOException {
            if (i >= 0) {
                mo29723b(i);
            } else {
                mo29715a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo29723b(int i) throws IOException {
            if (this.f41513h <= this.f41512g) {
                while ((i & -128) != 0) {
                    long j = this.f41513h;
                    this.f41513h = j + 1;
                    bba.m35148a(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                long j2 = this.f41513h;
                this.f41513h = 1 + j2;
                bba.m35148a(j2, (byte) i);
                return;
            }
            while (this.f41513h < this.f41511f) {
                if ((i & -128) == 0) {
                    long j3 = this.f41513h;
                    this.f41513h = 1 + j3;
                    bba.m35148a(j3, (byte) i);
                    return;
                }
                long j4 = this.f41513h;
                this.f41513h = j4 + 1;
                bba.m35148a(j4, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            throw new C15667c(C2240a.m6772a("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f41513h), Long.valueOf(this.f41511f), Integer.valueOf(1)}));
        }

        /* renamed from: d */
        public final void mo29736d(int i) throws IOException {
            this.f41508c.putInt((int) (this.f41513h - this.f41509d), i);
            this.f41513h += 4;
        }

        /* renamed from: a */
        public final void mo29715a(long j) throws IOException {
            if (this.f41513h <= this.f41512g) {
                while ((j & -128) != 0) {
                    long j2 = this.f41513h;
                    this.f41513h = j2 + 1;
                    bba.m35148a(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                long j3 = this.f41513h;
                this.f41513h = 1 + j3;
                bba.m35148a(j3, (byte) ((int) j));
                return;
            }
            while (this.f41513h < this.f41511f) {
                if ((j & -128) == 0) {
                    long j4 = this.f41513h;
                    this.f41513h = 1 + j4;
                    bba.m35148a(j4, (byte) ((int) j));
                    return;
                }
                long j5 = this.f41513h;
                this.f41513h = j5 + 1;
                bba.m35148a(j5, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            throw new C15667c(C2240a.m6772a("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f41513h), Long.valueOf(this.f41511f), Integer.valueOf(1)}));
        }

        /* renamed from: c */
        public final void mo29734c(long j) throws IOException {
            this.f41508c.putLong((int) (this.f41513h - this.f41509d), j);
            this.f41513h += 8;
        }

        /* renamed from: b */
        public final void mo29729b(byte[] bArr, int i, int i2) throws IOException {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = (long) i2;
                if (this.f41511f - j >= this.f41513h) {
                    bba.f41744a.mo30002a(bArr, (long) i, this.f41513h, j);
                    this.f41513h += j;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new C15667c(C2240a.m6772a("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f41513h), Long.valueOf(this.f41511f), Integer.valueOf(i2)}));
        }

        /* renamed from: a */
        public final void mo29608a(byte[] bArr, int i, int i2) throws IOException {
            mo29729b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo29719a(String str) throws IOException {
            long j = this.f41513h;
            try {
                int g = m34457g(str.length() * 3);
                int g2 = m34457g(str.length());
                if (g2 == g) {
                    int i = ((int) (this.f41513h - this.f41509d)) + g2;
                    this.f41508c.position(i);
                    bbc.m35232a((CharSequence) str, this.f41508c);
                    int position = this.f41508c.position() - i;
                    mo29723b(position);
                    this.f41513h += (long) position;
                    return;
                }
                int a = bbc.m35230a((CharSequence) str);
                mo29723b(a);
                m34566g(this.f41513h);
                bbc.m35232a((CharSequence) str, this.f41508c);
                this.f41513h += (long) a;
            } catch (bbg e) {
                this.f41513h = j;
                m34566g(this.f41513h);
                mo29720a(str, e);
            } catch (IllegalArgumentException e2) {
                throw new C15667c((Throwable) e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new C15667c((Throwable) e3);
            }
        }

        /* renamed from: a */
        public final void mo29701a() {
            this.f41507b.position((int) (this.f41513h - this.f41509d));
        }

        /* renamed from: b */
        public final int mo29722b() {
            return (int) (this.f41511f - this.f41513h);
        }

        /* renamed from: g */
        private final void m34566g(long j) {
            this.f41508c.position((int) (j - this.f41509d));
        }
    }

    /* renamed from: a */
    public static axf m34430a(byte[] bArr) {
        return new C15665a(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    public static int m34452e(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        if ((j & -16384) != 0) {
            i++;
        }
        return i;
    }

    /* renamed from: g */
    public static int m34457g(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: g */
    private static long m34460g(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: k */
    private static int m34468k(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: a */
    public abstract void mo29701a() throws IOException;

    /* renamed from: a */
    public abstract void mo29702a(byte b) throws IOException;

    /* renamed from: a */
    public abstract void mo29705a(int i) throws IOException;

    /* renamed from: a */
    public abstract void mo29708a(int i, int i2) throws IOException;

    /* renamed from: a */
    public abstract void mo29709a(int i, long j) throws IOException;

    /* renamed from: a */
    public abstract void mo29710a(int i, awo awo) throws IOException;

    /* renamed from: a */
    public abstract void mo29711a(int i, azj azj) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo29712a(int i, azj azj, bab bab) throws IOException;

    /* renamed from: a */
    public abstract void mo29713a(int i, String str) throws IOException;

    /* renamed from: a */
    public abstract void mo29714a(int i, boolean z) throws IOException;

    /* renamed from: a */
    public abstract void mo29715a(long j) throws IOException;

    /* renamed from: a */
    public abstract void mo29716a(awo awo) throws IOException;

    /* renamed from: a */
    public abstract void mo29717a(azj azj) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo29718a(azj azj, bab bab) throws IOException;

    /* renamed from: a */
    public abstract void mo29719a(String str) throws IOException;

    /* renamed from: b */
    public abstract int mo29722b();

    /* renamed from: b */
    public abstract void mo29723b(int i) throws IOException;

    /* renamed from: b */
    public abstract void mo29724b(int i, int i2) throws IOException;

    /* renamed from: b */
    public abstract void mo29726b(int i, awo awo) throws IOException;

    /* renamed from: b */
    public abstract void mo29727b(int i, azj azj) throws IOException;

    /* renamed from: b */
    public abstract void mo29729b(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: c */
    public abstract void mo29732c(int i, int i2) throws IOException;

    /* renamed from: c */
    public abstract void mo29733c(int i, long j) throws IOException;

    /* renamed from: c */
    public abstract void mo29734c(long j) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract void mo29735c(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: d */
    public abstract void mo29736d(int i) throws IOException;

    /* renamed from: e */
    public abstract void mo29738e(int i, int i2) throws IOException;

    private axf() {
    }

    /* renamed from: d */
    public final void mo29737d(int i, int i2) throws IOException {
        mo29732c(i, m34468k(i2));
    }

    /* renamed from: b */
    public final void mo29725b(int i, long j) throws IOException {
        mo29709a(i, m34460g(j));
    }

    /* renamed from: a */
    public final void mo29707a(int i, float f) throws IOException {
        mo29738e(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public final void mo29706a(int i, double d) throws IOException {
        mo29733c(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: c */
    public final void mo29731c(int i) throws IOException {
        mo29723b(m34468k(i));
    }

    /* renamed from: b */
    public final void mo29728b(long j) throws IOException {
        mo29715a(m34460g(j));
    }

    /* renamed from: a */
    public final void mo29704a(float f) throws IOException {
        mo29736d(Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public final void mo29703a(double d) throws IOException {
        mo29734c(Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void mo29721a(boolean z) throws IOException {
        mo29702a(z ? (byte) 1 : 0);
    }

    /* renamed from: f */
    public static int m34454f(int i, int i2) {
        return m34450e(i) + m34453f(i2);
    }

    /* renamed from: g */
    public static int m34458g(int i, int i2) {
        return m34450e(i) + m34457g(i2);
    }

    /* renamed from: h */
    public static int m34462h(int i, int i2) {
        return m34450e(i) + m34457g(m34468k(i2));
    }

    /* renamed from: i */
    public static int m34465i(int i, int i2) {
        return m34450e(i) + 4;
    }

    /* renamed from: j */
    public static int m34467j(int i, int i2) {
        return m34450e(i) + 4;
    }

    /* renamed from: d */
    public static int m34446d(int i, long j) {
        return m34450e(i) + m34452e(j);
    }

    /* renamed from: e */
    public static int m34451e(int i, long j) {
        return m34450e(i) + m34452e(j);
    }

    /* renamed from: f */
    public static int m34455f(int i, long j) {
        return m34450e(i) + m34452e(m34460g(j));
    }

    /* renamed from: g */
    public static int m34459g(int i, long j) {
        return m34450e(i) + 8;
    }

    /* renamed from: h */
    public static int m34463h(int i, long j) {
        return m34450e(i) + 8;
    }

    /* renamed from: b */
    public static int m34432b(int i, float f) {
        return m34450e(i) + 4;
    }

    /* renamed from: b */
    public static int m34431b(int i, double d) {
        return m34450e(i) + 8;
    }

    /* renamed from: b */
    public static int m34436b(int i, boolean z) {
        return m34450e(i) + 1;
    }

    /* renamed from: k */
    public static int m34469k(int i, int i2) {
        return m34450e(i) + m34453f(i2);
    }

    /* renamed from: b */
    public static int m34435b(int i, String str) {
        return m34450e(i) + m34440b(str);
    }

    /* renamed from: c */
    public static int m34442c(int i, awo awo) {
        int e = m34450e(i);
        int size = awo.size();
        return e + m34457g(size) + size;
    }

    /* renamed from: a */
    public static int m34428a(int i, ayq ayq) {
        int e = m34450e(i);
        int b = ayq.mo29853b();
        return e + m34457g(b) + b;
    }

    /* renamed from: c */
    public static int m34443c(int i, azj azj) {
        return m34450e(i) + m34438b(azj);
    }

    /* renamed from: b */
    static int m34434b(int i, azj azj, bab bab) {
        return m34450e(i) + m34439b(azj, bab);
    }

    /* renamed from: d */
    public static int m34447d(int i, azj azj) {
        return (m34450e(1) << 1) + m34458g(2, i) + m34443c(3, azj);
    }

    /* renamed from: b */
    public static int m34433b(int i, ayq ayq) {
        return (m34450e(1) << 1) + m34458g(2, i) + m34428a(3, ayq);
    }

    /* renamed from: e */
    public static int m34450e(int i) {
        return m34457g(i << 3);
    }

    /* renamed from: f */
    public static int m34453f(int i) {
        if (i >= 0) {
            return m34457g(i);
        }
        return 10;
    }

    /* renamed from: h */
    public static int m34461h(int i) {
        return m34457g(m34468k(i));
    }

    /* renamed from: d */
    public static int m34448d(long j) {
        return m34452e(j);
    }

    /* renamed from: f */
    public static int m34456f(long j) {
        return m34452e(m34460g(j));
    }

    /* renamed from: i */
    public static int m34464i(int i) {
        return m34453f(i);
    }

    /* renamed from: b */
    public static int m34440b(String str) {
        int i;
        try {
            i = bbc.m35230a((CharSequence) str);
        } catch (bbg unused) {
            i = str.getBytes(ayb.f41627a).length;
        }
        return m34457g(i) + i;
    }

    /* renamed from: a */
    public static int m34429a(ayq ayq) {
        int b = ayq.mo29853b();
        return m34457g(b) + b;
    }

    /* renamed from: b */
    public static int m34437b(awo awo) {
        int size = awo.size();
        return m34457g(size) + size;
    }

    /* renamed from: b */
    public static int m34441b(byte[] bArr) {
        int length = bArr.length;
        return m34457g(length) + length;
    }

    /* renamed from: b */
    public static int m34438b(azj azj) {
        int i = azj.mo29824i();
        return m34457g(i) + i;
    }

    /* renamed from: b */
    static int m34439b(azj azj, bab bab) {
        awe awe = (awe) azj;
        int g = awe.mo29581g();
        if (g == -1) {
            g = bab.mo29899b(awe);
            awe.mo29578a(g);
        }
        return m34457g(g) + g;
    }

    /* renamed from: c */
    public final void mo29730c() {
        if (mo29722b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo29720a(String str, bbg bbg) throws IOException {
        f41495b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", bbg);
        byte[] bytes = str.getBytes(ayb.f41627a);
        try {
            mo29723b(bytes.length);
            mo29608a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C15667c((Throwable) e);
        } catch (C15667c e2) {
            throw e2;
        }
    }

    /* renamed from: c */
    static int m34444c(int i, azj azj, bab bab) {
        int e = m34450e(i) << 1;
        awe awe = (awe) azj;
        int g = awe.mo29581g();
        if (g == -1) {
            g = bab.mo29899b(awe);
            awe.mo29578a(g);
        }
        return e + g;
    }

    /* renamed from: c */
    public static int m34445c(azj azj) {
        return azj.mo29824i();
    }

    /* renamed from: j */
    public static int m34466j(int i) {
        return m34457g(i);
    }
}
