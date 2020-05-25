package com.google.android.gms.internal.measurement;

import com.C2240a;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.gj */
public abstract class C16709gj extends C16690fr {

    /* renamed from: b */
    private static final Logger f46970b = Logger.getLogger(C16709gj.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f46971c = C16819ka.m40687a();

    /* renamed from: a */
    C16716gl f46972a = this;

    /* renamed from: com.google.android.gms.internal.measurement.gj$a */
    static class C16710a extends C16709gj {

        /* renamed from: b */
        final int f46973b;

        /* renamed from: c */
        int f46974c;

        /* renamed from: d */
        private final byte[] f46975d;

        /* renamed from: e */
        private final int f46976e;

        C16710a(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f46975d = bArr;
                    this.f46973b = i;
                    this.f46974c = i;
                    this.f46976e = i3;
                    return;
                }
                throw new IllegalArgumentException(C2240a.m6772a("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: a */
        public void mo32107a() {
        }

        /* renamed from: a */
        public final void mo32114a(int i, int i2) throws IOException {
            mo32129b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo32130b(int i, int i2) throws IOException {
            mo32114a(i, 0);
            mo32111a(i2);
        }

        /* renamed from: c */
        public final void mo32137c(int i, int i2) throws IOException {
            mo32114a(i, 0);
            mo32129b(i2);
        }

        /* renamed from: e */
        public final void mo32143e(int i, int i2) throws IOException {
            mo32114a(i, 5);
            mo32141d(i2);
        }

        /* renamed from: a */
        public final void mo32115a(int i, long j) throws IOException {
            mo32114a(i, 0);
            mo32121a(j);
        }

        /* renamed from: c */
        public final void mo32138c(int i, long j) throws IOException {
            mo32114a(i, 1);
            mo32139c(j);
        }

        /* renamed from: a */
        public final void mo32120a(int i, boolean z) throws IOException {
            mo32114a(i, 0);
            mo32108a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo32119a(int i, String str) throws IOException {
            mo32114a(i, 2);
            mo32125a(str);
        }

        /* renamed from: a */
        public final void mo32116a(int i, C16691fs fsVar) throws IOException {
            mo32114a(i, 2);
            mo32122a(fsVar);
        }

        /* renamed from: a */
        public final void mo32122a(C16691fs fsVar) throws IOException {
            mo32129b(fsVar.size());
            fsVar.mo32017a((C16690fr) this);
        }

        /* renamed from: c */
        public final void mo32140c(byte[] bArr, int i, int i2) throws IOException {
            mo32129b(i2);
            mo32135b(bArr, 0, i2);
        }

        /* renamed from: a */
        public final void mo32117a(int i, C16775ik ikVar) throws IOException {
            mo32114a(i, 2);
            mo32123a(ikVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo32118a(int i, C16775ik ikVar, C16793jb jbVar) throws IOException {
            mo32114a(i, 2);
            C16684fl flVar = (C16684fl) ikVar;
            int d = flVar.mo31988d();
            if (d == -1) {
                d = jbVar.mo32302b(flVar);
                flVar.mo31986a(d);
            }
            mo32129b(d);
            jbVar.mo32300a(ikVar, (C16838kp) this.f46972a);
        }

        /* renamed from: b */
        public final void mo32133b(int i, C16775ik ikVar) throws IOException {
            mo32114a(1, 3);
            mo32137c(2, i);
            mo32117a(3, ikVar);
            mo32114a(1, 4);
        }

        /* renamed from: b */
        public final void mo32132b(int i, C16691fs fsVar) throws IOException {
            mo32114a(1, 3);
            mo32137c(2, i);
            mo32116a(3, fsVar);
            mo32114a(1, 4);
        }

        /* renamed from: a */
        public final void mo32123a(C16775ik ikVar) throws IOException {
            mo32129b(ikVar.mo32230g());
            ikVar.mo32226a(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo32124a(C16775ik ikVar, C16793jb jbVar) throws IOException {
            C16684fl flVar = (C16684fl) ikVar;
            int d = flVar.mo31988d();
            if (d == -1) {
                d = jbVar.mo32302b(flVar);
                flVar.mo31986a(d);
            }
            mo32129b(d);
            jbVar.mo32300a(ikVar, (C16838kp) this.f46972a);
        }

        /* renamed from: a */
        public final void mo32108a(byte b) throws IOException {
            try {
                byte[] bArr = this.f46975d;
                int i = this.f46974c;
                this.f46974c = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C16712c(C2240a.m6772a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f46974c), Integer.valueOf(this.f46976e), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: a */
        public final void mo32111a(int i) throws IOException {
            if (i >= 0) {
                mo32129b(i);
            } else {
                mo32121a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo32129b(int i) throws IOException {
            if (!C16709gj.f46971c || mo32128b() < 10) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f46975d;
                    int i2 = this.f46974c;
                    this.f46974c = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f46975d;
                    int i3 = this.f46974c;
                    this.f46974c = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new C16712c(C2240a.m6772a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f46974c), Integer.valueOf(this.f46976e), Integer.valueOf(1)}), e);
                }
            } else {
                while ((i & -128) != 0) {
                    byte[] bArr3 = this.f46975d;
                    int i4 = this.f46974c;
                    this.f46974c = i4 + 1;
                    C16819ka.m40686a(bArr3, (long) i4, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr4 = this.f46975d;
                int i5 = this.f46974c;
                this.f46974c = i5 + 1;
                C16819ka.m40686a(bArr4, (long) i5, (byte) i);
            }
        }

        /* renamed from: d */
        public final void mo32141d(int i) throws IOException {
            try {
                byte[] bArr = this.f46975d;
                int i2 = this.f46974c;
                this.f46974c = i2 + 1;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.f46975d;
                int i3 = this.f46974c;
                this.f46974c = i3 + 1;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.f46975d;
                int i4 = this.f46974c;
                this.f46974c = i4 + 1;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.f46975d;
                int i5 = this.f46974c;
                this.f46974c = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new C16712c(C2240a.m6772a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f46974c), Integer.valueOf(this.f46976e), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: a */
        public final void mo32121a(long j) throws IOException {
            if (!C16709gj.f46971c || mo32128b() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f46975d;
                    int i = this.f46974c;
                    this.f46974c = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f46975d;
                    int i2 = this.f46974c;
                    this.f46974c = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new C16712c(C2240a.m6772a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f46974c), Integer.valueOf(this.f46976e), Integer.valueOf(1)}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f46975d;
                    int i3 = this.f46974c;
                    this.f46974c = i3 + 1;
                    C16819ka.m40686a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f46975d;
                int i4 = this.f46974c;
                this.f46974c = i4 + 1;
                C16819ka.m40686a(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: c */
        public final void mo32139c(long j) throws IOException {
            try {
                byte[] bArr = this.f46975d;
                int i = this.f46974c;
                this.f46974c = i + 1;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.f46975d;
                int i2 = this.f46974c;
                this.f46974c = i2 + 1;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.f46975d;
                int i3 = this.f46974c;
                this.f46974c = i3 + 1;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.f46975d;
                int i4 = this.f46974c;
                this.f46974c = i4 + 1;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.f46975d;
                int i5 = this.f46974c;
                this.f46974c = i5 + 1;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.f46975d;
                int i6 = this.f46974c;
                this.f46974c = i6 + 1;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.f46975d;
                int i7 = this.f46974c;
                this.f46974c = i7 + 1;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.f46975d;
                int i8 = this.f46974c;
                this.f46974c = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new C16712c(C2240a.m6772a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f46974c), Integer.valueOf(this.f46976e), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: b */
        public final void mo32135b(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f46975d, this.f46974c, i2);
                this.f46974c += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C16712c(C2240a.m6772a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f46974c), Integer.valueOf(this.f46976e), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: a */
        public final void mo32013a(byte[] bArr, int i, int i2) throws IOException {
            mo32135b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo32125a(String str) throws IOException {
            int i = this.f46974c;
            try {
                int g = m40028g(str.length() * 3);
                int g2 = m40028g(str.length());
                if (g2 == g) {
                    this.f46974c = i + g2;
                    int a = C16825kc.m40761a(str, this.f46975d, this.f46974c, mo32128b());
                    this.f46974c = i;
                    mo32129b((a - i) - g2);
                    this.f46974c = a;
                    return;
                }
                mo32129b(C16825kc.m40760a((CharSequence) str));
                this.f46974c = C16825kc.m40761a(str, this.f46975d, this.f46974c, mo32128b());
            } catch (C16829kg e) {
                this.f46974c = i;
                mo32126a(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new C16712c((Throwable) e2);
            }
        }

        /* renamed from: b */
        public final int mo32128b() {
            return this.f46976e - this.f46974c;
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.gj$b */
    static final class C16711b extends C16710a {

        /* renamed from: d */
        private final ByteBuffer f46977d;

        /* renamed from: e */
        private int f46978e;

        C16711b(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f46977d = byteBuffer;
            this.f46978e = byteBuffer.position();
        }

        /* renamed from: a */
        public final void mo32107a() {
            this.f46977d.position(this.f46978e + (this.f46974c - this.f46973b));
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.gj$c */
    public static class C16712c extends IOException {
        C16712c() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        C16712c(String str) {
            String valueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            String valueOf2 = String.valueOf(str);
            super(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        }

        C16712c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        C16712c(String str, Throwable th) {
            String valueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            String valueOf2 = String.valueOf(str);
            super(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), th);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.gj$d */
    static final class C16713d extends C16709gj {

        /* renamed from: b */
        private final ByteBuffer f46979b;

        /* renamed from: c */
        private final ByteBuffer f46980c;

        /* renamed from: d */
        private final int f46981d;

        C16713d(ByteBuffer byteBuffer) {
            super();
            this.f46979b = byteBuffer;
            this.f46980c = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f46981d = byteBuffer.position();
        }

        /* renamed from: a */
        public final void mo32114a(int i, int i2) throws IOException {
            mo32129b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo32130b(int i, int i2) throws IOException {
            mo32114a(i, 0);
            mo32111a(i2);
        }

        /* renamed from: c */
        public final void mo32137c(int i, int i2) throws IOException {
            mo32114a(i, 0);
            mo32129b(i2);
        }

        /* renamed from: e */
        public final void mo32143e(int i, int i2) throws IOException {
            mo32114a(i, 5);
            mo32141d(i2);
        }

        /* renamed from: a */
        public final void mo32115a(int i, long j) throws IOException {
            mo32114a(i, 0);
            mo32121a(j);
        }

        /* renamed from: c */
        public final void mo32138c(int i, long j) throws IOException {
            mo32114a(i, 1);
            mo32139c(j);
        }

        /* renamed from: a */
        public final void mo32120a(int i, boolean z) throws IOException {
            mo32114a(i, 0);
            mo32108a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo32119a(int i, String str) throws IOException {
            mo32114a(i, 2);
            mo32125a(str);
        }

        /* renamed from: a */
        public final void mo32116a(int i, C16691fs fsVar) throws IOException {
            mo32114a(i, 2);
            mo32122a(fsVar);
        }

        /* renamed from: a */
        public final void mo32117a(int i, C16775ik ikVar) throws IOException {
            mo32114a(i, 2);
            mo32123a(ikVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo32118a(int i, C16775ik ikVar, C16793jb jbVar) throws IOException {
            mo32114a(i, 2);
            mo32124a(ikVar, jbVar);
        }

        /* renamed from: b */
        public final void mo32133b(int i, C16775ik ikVar) throws IOException {
            mo32114a(1, 3);
            mo32137c(2, i);
            mo32117a(3, ikVar);
            mo32114a(1, 4);
        }

        /* renamed from: b */
        public final void mo32132b(int i, C16691fs fsVar) throws IOException {
            mo32114a(1, 3);
            mo32137c(2, i);
            mo32116a(3, fsVar);
            mo32114a(1, 4);
        }

        /* renamed from: a */
        public final void mo32123a(C16775ik ikVar) throws IOException {
            mo32129b(ikVar.mo32230g());
            ikVar.mo32226a(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo32124a(C16775ik ikVar, C16793jb jbVar) throws IOException {
            C16684fl flVar = (C16684fl) ikVar;
            int d = flVar.mo31988d();
            if (d == -1) {
                d = jbVar.mo32302b(flVar);
                flVar.mo31986a(d);
            }
            mo32129b(d);
            jbVar.mo32300a(ikVar, (C16838kp) this.f46972a);
        }

        /* renamed from: a */
        public final void mo32108a(byte b) throws IOException {
            try {
                this.f46980c.put(b);
            } catch (BufferOverflowException e) {
                throw new C16712c((Throwable) e);
            }
        }

        /* renamed from: a */
        public final void mo32122a(C16691fs fsVar) throws IOException {
            mo32129b(fsVar.size());
            fsVar.mo32017a((C16690fr) this);
        }

        /* renamed from: c */
        public final void mo32140c(byte[] bArr, int i, int i2) throws IOException {
            mo32129b(i2);
            mo32135b(bArr, 0, i2);
        }

        /* renamed from: a */
        public final void mo32111a(int i) throws IOException {
            if (i >= 0) {
                mo32129b(i);
            } else {
                mo32121a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo32129b(int i) throws IOException {
            while ((i & -128) != 0) {
                this.f46980c.put((byte) ((i & 127) | 128));
                i >>>= 7;
            }
            try {
                this.f46980c.put((byte) i);
            } catch (BufferOverflowException e) {
                throw new C16712c((Throwable) e);
            }
        }

        /* renamed from: d */
        public final void mo32141d(int i) throws IOException {
            try {
                this.f46980c.putInt(i);
            } catch (BufferOverflowException e) {
                throw new C16712c((Throwable) e);
            }
        }

        /* renamed from: a */
        public final void mo32121a(long j) throws IOException {
            while ((-128 & j) != 0) {
                this.f46980c.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            try {
                this.f46980c.put((byte) ((int) j));
            } catch (BufferOverflowException e) {
                throw new C16712c((Throwable) e);
            }
        }

        /* renamed from: c */
        public final void mo32139c(long j) throws IOException {
            try {
                this.f46980c.putLong(j);
            } catch (BufferOverflowException e) {
                throw new C16712c((Throwable) e);
            }
        }

        /* renamed from: b */
        public final void mo32135b(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.f46980c.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new C16712c((Throwable) e);
            } catch (BufferOverflowException e2) {
                throw new C16712c((Throwable) e2);
            }
        }

        /* renamed from: a */
        public final void mo32013a(byte[] bArr, int i, int i2) throws IOException {
            mo32135b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo32125a(String str) throws IOException {
            int position = this.f46980c.position();
            try {
                int g = m40028g(str.length() * 3);
                int g2 = m40028g(str.length());
                if (g2 == g) {
                    int position2 = this.f46980c.position() + g2;
                    this.f46980c.position(position2);
                    m40107c(str);
                    int position3 = this.f46980c.position();
                    this.f46980c.position(position);
                    mo32129b(position3 - position2);
                    this.f46980c.position(position3);
                    return;
                }
                mo32129b(C16825kc.m40760a((CharSequence) str));
                m40107c(str);
            } catch (C16829kg e) {
                this.f46980c.position(position);
                mo32126a(str, e);
            } catch (IllegalArgumentException e2) {
                throw new C16712c((Throwable) e2);
            }
        }

        /* renamed from: a */
        public final void mo32107a() {
            this.f46979b.position(this.f46980c.position());
        }

        /* renamed from: b */
        public final int mo32128b() {
            return this.f46980c.remaining();
        }

        /* renamed from: c */
        private final void m40107c(String str) throws IOException {
            try {
                C16825kc.m40763a((CharSequence) str, this.f46980c);
            } catch (IndexOutOfBoundsException e) {
                throw new C16712c((Throwable) e);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.gj$e */
    static final class C16714e extends C16709gj {

        /* renamed from: b */
        private final ByteBuffer f46982b;

        /* renamed from: c */
        private final ByteBuffer f46983c;

        /* renamed from: d */
        private final long f46984d;

        /* renamed from: e */
        private final long f46985e;

        /* renamed from: f */
        private final long f46986f;

        /* renamed from: g */
        private final long f46987g = (this.f46986f - 10);

        /* renamed from: h */
        private long f46988h = this.f46985e;

        C16714e(ByteBuffer byteBuffer) {
            super();
            this.f46982b = byteBuffer;
            this.f46983c = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f46984d = C16819ka.m40675a(byteBuffer);
            this.f46985e = this.f46984d + ((long) byteBuffer.position());
            this.f46986f = this.f46984d + ((long) byteBuffer.limit());
        }

        /* renamed from: a */
        public final void mo32114a(int i, int i2) throws IOException {
            mo32129b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo32130b(int i, int i2) throws IOException {
            mo32114a(i, 0);
            mo32111a(i2);
        }

        /* renamed from: c */
        public final void mo32137c(int i, int i2) throws IOException {
            mo32114a(i, 0);
            mo32129b(i2);
        }

        /* renamed from: e */
        public final void mo32143e(int i, int i2) throws IOException {
            mo32114a(i, 5);
            mo32141d(i2);
        }

        /* renamed from: a */
        public final void mo32115a(int i, long j) throws IOException {
            mo32114a(i, 0);
            mo32121a(j);
        }

        /* renamed from: c */
        public final void mo32138c(int i, long j) throws IOException {
            mo32114a(i, 1);
            mo32139c(j);
        }

        /* renamed from: a */
        public final void mo32120a(int i, boolean z) throws IOException {
            mo32114a(i, 0);
            mo32108a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo32119a(int i, String str) throws IOException {
            mo32114a(i, 2);
            mo32125a(str);
        }

        /* renamed from: a */
        public final void mo32116a(int i, C16691fs fsVar) throws IOException {
            mo32114a(i, 2);
            mo32122a(fsVar);
        }

        /* renamed from: a */
        public final void mo32117a(int i, C16775ik ikVar) throws IOException {
            mo32114a(i, 2);
            mo32123a(ikVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo32118a(int i, C16775ik ikVar, C16793jb jbVar) throws IOException {
            mo32114a(i, 2);
            mo32124a(ikVar, jbVar);
        }

        /* renamed from: b */
        public final void mo32133b(int i, C16775ik ikVar) throws IOException {
            mo32114a(1, 3);
            mo32137c(2, i);
            mo32117a(3, ikVar);
            mo32114a(1, 4);
        }

        /* renamed from: b */
        public final void mo32132b(int i, C16691fs fsVar) throws IOException {
            mo32114a(1, 3);
            mo32137c(2, i);
            mo32116a(3, fsVar);
            mo32114a(1, 4);
        }

        /* renamed from: a */
        public final void mo32123a(C16775ik ikVar) throws IOException {
            mo32129b(ikVar.mo32230g());
            ikVar.mo32226a(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo32124a(C16775ik ikVar, C16793jb jbVar) throws IOException {
            C16684fl flVar = (C16684fl) ikVar;
            int d = flVar.mo31988d();
            if (d == -1) {
                d = jbVar.mo32302b(flVar);
                flVar.mo31986a(d);
            }
            mo32129b(d);
            jbVar.mo32300a(ikVar, (C16838kp) this.f46972a);
        }

        /* renamed from: a */
        public final void mo32108a(byte b) throws IOException {
            if (this.f46988h < this.f46986f) {
                long j = this.f46988h;
                this.f46988h = 1 + j;
                C16819ka.m40678a(j, b);
                return;
            }
            throw new C16712c(C2240a.m6772a("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f46988h), Long.valueOf(this.f46986f), Integer.valueOf(1)}));
        }

        /* renamed from: a */
        public final void mo32122a(C16691fs fsVar) throws IOException {
            mo32129b(fsVar.size());
            fsVar.mo32017a((C16690fr) this);
        }

        /* renamed from: c */
        public final void mo32140c(byte[] bArr, int i, int i2) throws IOException {
            mo32129b(i2);
            mo32135b(bArr, 0, i2);
        }

        /* renamed from: a */
        public final void mo32111a(int i) throws IOException {
            if (i >= 0) {
                mo32129b(i);
            } else {
                mo32121a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo32129b(int i) throws IOException {
            if (this.f46988h <= this.f46987g) {
                while ((i & -128) != 0) {
                    long j = this.f46988h;
                    this.f46988h = j + 1;
                    C16819ka.m40678a(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                long j2 = this.f46988h;
                this.f46988h = 1 + j2;
                C16819ka.m40678a(j2, (byte) i);
                return;
            }
            while (this.f46988h < this.f46986f) {
                if ((i & -128) == 0) {
                    long j3 = this.f46988h;
                    this.f46988h = 1 + j3;
                    C16819ka.m40678a(j3, (byte) i);
                    return;
                }
                long j4 = this.f46988h;
                this.f46988h = j4 + 1;
                C16819ka.m40678a(j4, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            throw new C16712c(C2240a.m6772a("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f46988h), Long.valueOf(this.f46986f), Integer.valueOf(1)}));
        }

        /* renamed from: d */
        public final void mo32141d(int i) throws IOException {
            this.f46983c.putInt((int) (this.f46988h - this.f46984d), i);
            this.f46988h += 4;
        }

        /* renamed from: a */
        public final void mo32121a(long j) throws IOException {
            if (this.f46988h <= this.f46987g) {
                while ((j & -128) != 0) {
                    long j2 = this.f46988h;
                    this.f46988h = j2 + 1;
                    C16819ka.m40678a(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                long j3 = this.f46988h;
                this.f46988h = 1 + j3;
                C16819ka.m40678a(j3, (byte) ((int) j));
                return;
            }
            while (this.f46988h < this.f46986f) {
                if ((j & -128) == 0) {
                    long j4 = this.f46988h;
                    this.f46988h = 1 + j4;
                    C16819ka.m40678a(j4, (byte) ((int) j));
                    return;
                }
                long j5 = this.f46988h;
                this.f46988h = j5 + 1;
                C16819ka.m40678a(j5, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            throw new C16712c(C2240a.m6772a("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f46988h), Long.valueOf(this.f46986f), Integer.valueOf(1)}));
        }

        /* renamed from: c */
        public final void mo32139c(long j) throws IOException {
            this.f46983c.putLong((int) (this.f46988h - this.f46984d), j);
            this.f46988h += 8;
        }

        /* renamed from: b */
        public final void mo32135b(byte[] bArr, int i, int i2) throws IOException {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = (long) i2;
                if (this.f46986f - j >= this.f46988h) {
                    C16819ka.f47232a.mo32405a(bArr, (long) i, this.f46988h, j);
                    this.f46988h += j;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new C16712c(C2240a.m6772a("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f46988h), Long.valueOf(this.f46986f), Integer.valueOf(i2)}));
        }

        /* renamed from: a */
        public final void mo32013a(byte[] bArr, int i, int i2) throws IOException {
            mo32135b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo32125a(String str) throws IOException {
            long j = this.f46988h;
            try {
                int g = m40028g(str.length() * 3);
                int g2 = m40028g(str.length());
                if (g2 == g) {
                    int i = ((int) (this.f46988h - this.f46984d)) + g2;
                    this.f46983c.position(i);
                    C16825kc.m40763a((CharSequence) str, this.f46983c);
                    int position = this.f46983c.position() - i;
                    mo32129b(position);
                    this.f46988h += (long) position;
                    return;
                }
                int a = C16825kc.m40760a((CharSequence) str);
                mo32129b(a);
                m40136g(this.f46988h);
                C16825kc.m40763a((CharSequence) str, this.f46983c);
                this.f46988h += (long) a;
            } catch (C16829kg e) {
                this.f46988h = j;
                m40136g(this.f46988h);
                mo32126a(str, e);
            } catch (IllegalArgumentException e2) {
                throw new C16712c((Throwable) e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new C16712c((Throwable) e3);
            }
        }

        /* renamed from: a */
        public final void mo32107a() {
            this.f46982b.position((int) (this.f46988h - this.f46984d));
        }

        /* renamed from: b */
        public final int mo32128b() {
            return (int) (this.f46986f - this.f46988h);
        }

        /* renamed from: g */
        private final void m40136g(long j) {
            this.f46983c.position((int) (j - this.f46984d));
        }
    }

    /* renamed from: e */
    public static int m40023e(long j) {
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
    public static int m40028g(int i) {
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
    private static long m40031g(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: k */
    private static int m40039k(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: a */
    public abstract void mo32107a() throws IOException;

    /* renamed from: a */
    public abstract void mo32108a(byte b) throws IOException;

    /* renamed from: a */
    public abstract void mo32111a(int i) throws IOException;

    /* renamed from: a */
    public abstract void mo32114a(int i, int i2) throws IOException;

    /* renamed from: a */
    public abstract void mo32115a(int i, long j) throws IOException;

    /* renamed from: a */
    public abstract void mo32116a(int i, C16691fs fsVar) throws IOException;

    /* renamed from: a */
    public abstract void mo32117a(int i, C16775ik ikVar) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo32118a(int i, C16775ik ikVar, C16793jb jbVar) throws IOException;

    /* renamed from: a */
    public abstract void mo32119a(int i, String str) throws IOException;

    /* renamed from: a */
    public abstract void mo32120a(int i, boolean z) throws IOException;

    /* renamed from: a */
    public abstract void mo32121a(long j) throws IOException;

    /* renamed from: a */
    public abstract void mo32122a(C16691fs fsVar) throws IOException;

    /* renamed from: a */
    public abstract void mo32123a(C16775ik ikVar) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo32124a(C16775ik ikVar, C16793jb jbVar) throws IOException;

    /* renamed from: a */
    public abstract void mo32125a(String str) throws IOException;

    /* renamed from: b */
    public abstract int mo32128b();

    /* renamed from: b */
    public abstract void mo32129b(int i) throws IOException;

    /* renamed from: b */
    public abstract void mo32130b(int i, int i2) throws IOException;

    /* renamed from: b */
    public abstract void mo32132b(int i, C16691fs fsVar) throws IOException;

    /* renamed from: b */
    public abstract void mo32133b(int i, C16775ik ikVar) throws IOException;

    /* renamed from: b */
    public abstract void mo32135b(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: c */
    public abstract void mo32137c(int i, int i2) throws IOException;

    /* renamed from: c */
    public abstract void mo32138c(int i, long j) throws IOException;

    /* renamed from: c */
    public abstract void mo32139c(long j) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract void mo32140c(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: d */
    public abstract void mo32141d(int i) throws IOException;

    /* renamed from: e */
    public abstract void mo32143e(int i, int i2) throws IOException;

    private C16709gj() {
    }

    /* renamed from: d */
    public final void mo32142d(int i, int i2) throws IOException {
        mo32137c(i, m40039k(i2));
    }

    /* renamed from: b */
    public final void mo32131b(int i, long j) throws IOException {
        mo32115a(i, m40031g(j));
    }

    /* renamed from: a */
    public final void mo32113a(int i, float f) throws IOException {
        mo32143e(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public final void mo32112a(int i, double d) throws IOException {
        mo32138c(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: c */
    public final void mo32136c(int i) throws IOException {
        mo32129b(m40039k(i));
    }

    /* renamed from: b */
    public final void mo32134b(long j) throws IOException {
        mo32121a(m40031g(j));
    }

    /* renamed from: a */
    public final void mo32110a(float f) throws IOException {
        mo32141d(Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public final void mo32109a(double d) throws IOException {
        mo32139c(Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void mo32127a(boolean z) throws IOException {
        mo32108a(z ? (byte) 1 : 0);
    }

    /* renamed from: f */
    public static int m40025f(int i, int i2) {
        return m40021e(i) + m40024f(i2);
    }

    /* renamed from: g */
    public static int m40029g(int i, int i2) {
        return m40021e(i) + m40028g(i2);
    }

    /* renamed from: h */
    public static int m40033h(int i, int i2) {
        return m40021e(i) + m40028g(m40039k(i2));
    }

    /* renamed from: i */
    public static int m40036i(int i, int i2) {
        return m40021e(i) + 4;
    }

    /* renamed from: j */
    public static int m40038j(int i, int i2) {
        return m40021e(i) + 4;
    }

    /* renamed from: d */
    public static int m40018d(int i, long j) {
        return m40021e(i) + m40023e(j);
    }

    /* renamed from: e */
    public static int m40022e(int i, long j) {
        return m40021e(i) + m40023e(j);
    }

    /* renamed from: f */
    public static int m40026f(int i, long j) {
        return m40021e(i) + m40023e(m40031g(j));
    }

    /* renamed from: g */
    public static int m40030g(int i, long j) {
        return m40021e(i) + 8;
    }

    /* renamed from: h */
    public static int m40034h(int i, long j) {
        return m40021e(i) + 8;
    }

    /* renamed from: b */
    public static int m40004b(int i, float f) {
        return m40021e(i) + 4;
    }

    /* renamed from: b */
    public static int m40003b(int i, double d) {
        return m40021e(i) + 8;
    }

    /* renamed from: b */
    public static int m40008b(int i, boolean z) {
        return m40021e(i) + 1;
    }

    /* renamed from: k */
    public static int m40040k(int i, int i2) {
        return m40021e(i) + m40024f(i2);
    }

    /* renamed from: b */
    public static int m40007b(int i, String str) {
        return m40021e(i) + m40012b(str);
    }

    /* renamed from: c */
    public static int m40013c(int i, C16691fs fsVar) {
        int e = m40021e(i);
        int size = fsVar.size();
        return e + m40028g(size) + size;
    }

    /* renamed from: a */
    public static int m40000a(int i, C16755hr hrVar) {
        int e = m40021e(i);
        int b = hrVar.mo32257b();
        return e + m40028g(b) + b;
    }

    /* renamed from: c */
    public static int m40014c(int i, C16775ik ikVar) {
        return m40021e(i) + m40010b(ikVar);
    }

    /* renamed from: b */
    static int m40006b(int i, C16775ik ikVar, C16793jb jbVar) {
        return m40021e(i) + m40011b(ikVar, jbVar);
    }

    /* renamed from: d */
    public static int m40019d(int i, C16775ik ikVar) {
        return (m40021e(1) << 1) + m40029g(2, i) + m40014c(3, ikVar);
    }

    /* renamed from: b */
    public static int m40005b(int i, C16755hr hrVar) {
        return (m40021e(1) << 1) + m40029g(2, i) + m40000a(3, hrVar);
    }

    /* renamed from: e */
    public static int m40021e(int i) {
        return m40028g(i << 3);
    }

    /* renamed from: f */
    public static int m40024f(int i) {
        if (i >= 0) {
            return m40028g(i);
        }
        return 10;
    }

    /* renamed from: h */
    public static int m40032h(int i) {
        return m40028g(m40039k(i));
    }

    /* renamed from: d */
    public static int m40020d(long j) {
        return m40023e(j);
    }

    /* renamed from: f */
    public static int m40027f(long j) {
        return m40023e(m40031g(j));
    }

    /* renamed from: i */
    public static int m40035i(int i) {
        return m40024f(i);
    }

    /* renamed from: b */
    public static int m40012b(String str) {
        int i;
        try {
            i = C16825kc.m40760a((CharSequence) str);
        } catch (C16829kg unused) {
            i = str.getBytes(C16743hf.f47107a).length;
        }
        return m40028g(i) + i;
    }

    /* renamed from: a */
    public static int m40001a(C16755hr hrVar) {
        int b = hrVar.mo32257b();
        return m40028g(b) + b;
    }

    /* renamed from: b */
    public static int m40009b(C16691fs fsVar) {
        int size = fsVar.size();
        return m40028g(size) + size;
    }

    /* renamed from: a */
    public static int m40002a(byte[] bArr) {
        int length = bArr.length;
        return m40028g(length) + length;
    }

    /* renamed from: b */
    public static int m40010b(C16775ik ikVar) {
        int g = ikVar.mo32230g();
        return m40028g(g) + g;
    }

    /* renamed from: b */
    static int m40011b(C16775ik ikVar, C16793jb jbVar) {
        C16684fl flVar = (C16684fl) ikVar;
        int d = flVar.mo31988d();
        if (d == -1) {
            d = jbVar.mo32302b(flVar);
            flVar.mo31986a(d);
        }
        return m40028g(d) + d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32126a(String str, C16829kg kgVar) throws IOException {
        f46970b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", kgVar);
        byte[] bytes = str.getBytes(C16743hf.f47107a);
        try {
            mo32129b(bytes.length);
            mo32013a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C16712c((Throwable) e);
        } catch (C16712c e2) {
            throw e2;
        }
    }

    /* renamed from: c */
    static int m40015c(int i, C16775ik ikVar, C16793jb jbVar) {
        int e = m40021e(i) << 1;
        C16684fl flVar = (C16684fl) ikVar;
        int d = flVar.mo31988d();
        if (d == -1) {
            d = jbVar.mo32302b(flVar);
            flVar.mo31986a(d);
        }
        return e + d;
    }

    /* renamed from: c */
    public static int m40016c(C16775ik ikVar) {
        return ikVar.mo32230g();
    }

    /* renamed from: j */
    public static int m40037j(int i) {
        return m40028g(i);
    }
}
