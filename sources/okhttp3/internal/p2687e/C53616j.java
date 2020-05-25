package okhttp3.internal.p2687e;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.C53559c;
import okio.Buffer;
import okio.BufferedSink;

/* renamed from: okhttp3.internal.e.j */
public final class C53616j implements Closeable {

    /* renamed from: c */
    private static final Logger f132960c = Logger.getLogger(C53591e.class.getName());

    /* renamed from: a */
    public int f132961a = 16384;

    /* renamed from: b */
    final C53590b f132962b = new C53590b(this.f132965f);

    /* renamed from: d */
    private final BufferedSink f132963d;

    /* renamed from: e */
    private final boolean f132964e;

    /* renamed from: f */
    private final Buffer f132965f = new Buffer();

    /* renamed from: g */
    private boolean f132966g;

    /* renamed from: a */
    public final synchronized void mo111480a(boolean z, int i, int i2, List<C53587c> list) throws IOException {
        if (this.f132966g) {
            throw new IOException("closed");
        } else if (!this.f132966g) {
            this.f132962b.mo111436a(list);
            long size = this.f132965f.size();
            int min = (int) Math.min((long) this.f132961a, size);
            long j = (long) min;
            byte b = size == j ? (byte) 4 : 0;
            if (z) {
                b = (byte) (b | 1);
            }
            m113967a(i, min, 1, b);
            this.f132963d.write(this.f132965f, j);
            if (size > j) {
                m113969b(i, size - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void mo111481a(boolean z, int i, Buffer buffer, int i2) throws IOException {
        if (!this.f132966g) {
            m113967a(i, i2, 0, z ? (byte) 1 : 0);
            if (i2 > 0) {
                this.f132963d.write(buffer, (long) i2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void mo111479a(boolean z, int i, int i2) throws IOException {
        if (!this.f132966g) {
            m113967a(0, 8, 6, z ? (byte) 1 : 0);
            this.f132963d.writeInt(i);
            this.f132963d.writeInt(i2);
            this.f132963d.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void close() throws IOException {
        this.f132966g = true;
        this.f132963d.close();
    }

    /* renamed from: b */
    public final synchronized void mo111482b() throws IOException {
        if (!this.f132966g) {
            this.f132963d.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void mo111474a() throws IOException {
        if (this.f132966g) {
            throw new IOException("closed");
        } else if (this.f132964e) {
            if (f132960c.isLoggable(Level.FINE)) {
                f132960c.fine(C53559c.m113798a(">> CONNECTION %s", C53591e.f132838a.hex()));
            }
            this.f132963d.write(C53591e.f132838a.toByteArray());
            this.f132963d.flush();
        }
    }

    /* renamed from: b */
    public final synchronized void mo111483b(C53621m mVar) throws IOException {
        int i;
        if (!this.f132966g) {
            m113967a(0, Integer.bitCount(mVar.f132975a) * 6, 4, 0);
            for (int i2 = 0; i2 < 10; i2++) {
                if (mVar.mo111489a(i2)) {
                    if (i2 == 4) {
                        i = 3;
                    } else if (i2 == 7) {
                        i = 4;
                    } else {
                        i = i2;
                    }
                    this.f132963d.writeShort(i);
                    this.f132963d.writeInt(mVar.mo111491b(i2));
                }
            }
            this.f132963d.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void mo111478a(C53621m mVar) throws IOException {
        if (!this.f132966g) {
            int i = this.f132961a;
            if ((mVar.f132975a & 32) != 0) {
                i = mVar.f132976b[5];
            }
            this.f132961a = i;
            if (mVar.mo111487a() != -1) {
                this.f132962b.mo111435a(mVar.mo111487a());
            }
            m113967a(0, 0, 4, 1);
            this.f132963d.flush();
        } else {
            throw new IOException("closed");
        }
    }

    C53616j(BufferedSink bufferedSink, boolean z) {
        this.f132963d = bufferedSink;
        this.f132964e = z;
    }

    /* renamed from: a */
    private static void m113968a(BufferedSink bufferedSink, int i) throws IOException {
        bufferedSink.writeByte((i >>> 16) & NormalGiftView.ALPHA_255);
        bufferedSink.writeByte((i >>> 8) & NormalGiftView.ALPHA_255);
        bufferedSink.writeByte(i & NormalGiftView.ALPHA_255);
    }

    /* renamed from: b */
    private void m113969b(int i, long j) throws IOException {
        byte b;
        while (j > 0) {
            int min = (int) Math.min((long) this.f132961a, j);
            long j2 = (long) min;
            j -= j2;
            if (j == 0) {
                b = 4;
            } else {
                b = 0;
            }
            m113967a(i, min, 9, b);
            this.f132963d.write(this.f132965f, j2);
        }
    }

    /* renamed from: a */
    public final synchronized void mo111476a(int i, C53586b bVar) throws IOException {
        if (this.f132966g) {
            throw new IOException("closed");
        } else if (bVar.httpCode != -1) {
            m113967a(i, 4, 3, 0);
            this.f132963d.writeInt(bVar.httpCode);
            this.f132963d.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public final synchronized void mo111475a(int i, long j) throws IOException {
        if (this.f132966g) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            throw C53591e.m113890a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        } else {
            m113967a(i, 4, 8, 0);
            this.f132963d.writeInt((int) j);
            this.f132963d.flush();
        }
    }

    /* renamed from: a */
    public final synchronized void mo111477a(int i, C53586b bVar, byte[] bArr) throws IOException {
        if (this.f132966g) {
            throw new IOException("closed");
        } else if (bVar.httpCode != -1) {
            m113967a(0, bArr.length + 8, 7, 0);
            this.f132963d.writeInt(i);
            this.f132963d.writeInt(bVar.httpCode);
            if (bArr.length > 0) {
                this.f132963d.write(bArr);
            }
            this.f132963d.flush();
        } else {
            throw C53591e.m113890a("errorCode.httpCode == -1", new Object[0]);
        }
    }

    /* renamed from: a */
    private void m113967a(int i, int i2, byte b, byte b2) throws IOException {
        if (f132960c.isLoggable(Level.FINE)) {
            f132960c.fine(C53591e.m113891a(false, i, i2, b, b2));
        }
        if (i2 > this.f132961a) {
            throw C53591e.m113890a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(this.f132961a), Integer.valueOf(i2));
        } else if ((Integer.MIN_VALUE & i) == 0) {
            m113968a(this.f132963d, i2);
            this.f132963d.writeByte(b & 255);
            this.f132963d.writeByte(b2 & 255);
            this.f132963d.writeInt(i & Integer.MAX_VALUE);
        } else {
            throw C53591e.m113890a("reserved bit set: %s", Integer.valueOf(i));
        }
    }
}
