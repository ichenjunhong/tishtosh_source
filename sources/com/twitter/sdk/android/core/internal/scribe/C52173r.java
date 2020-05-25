package com.twitter.sdk.android.core.internal.scribe;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.r */
public class C52173r implements Closeable {

    /* renamed from: c */
    private static final Logger f129854c = Logger.getLogger(C52173r.class.getName());

    /* renamed from: a */
    public final RandomAccessFile f129855a;

    /* renamed from: b */
    int f129856b;

    /* renamed from: d */
    private int f129857d;

    /* renamed from: e */
    private C52175a f129858e;

    /* renamed from: f */
    private C52175a f129859f;

    /* renamed from: g */
    private final byte[] f129860g = new byte[16];

    /* renamed from: com.twitter.sdk.android.core.internal.scribe.r$a */
    static class C52175a {

        /* renamed from: a */
        static final C52175a f129864a = new C52175a(0, 0);

        /* renamed from: b */
        final int f129865b;

        /* renamed from: c */
        final int f129866c;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append("[position = ");
            sb.append(this.f129865b);
            sb.append(", length = ");
            sb.append(this.f129866c);
            sb.append("]");
            return sb.toString();
        }

        C52175a(int i, int i2) {
            this.f129865b = i;
            this.f129866c = i2;
        }
    }

    /* renamed from: com.twitter.sdk.android.core.internal.scribe.r$b */
    final class C52176b extends InputStream {

        /* renamed from: b */
        private int f129868b;

        /* renamed from: c */
        private int f129869c;

        public final int read() throws IOException {
            if (this.f129869c == 0) {
                return -1;
            }
            C52173r.this.f129855a.seek((long) this.f129868b);
            int read = C52173r.this.f129855a.read();
            this.f129868b = C52173r.this.mo108904a(this.f129868b + 1);
            this.f129869c--;
            return read;
        }

        private C52176b(C52175a aVar) {
            this.f129868b = C52173r.this.mo108904a(aVar.f129865b + 4);
            this.f129869c = aVar.f129866c;
        }

        public final int read(byte[] bArr, int i, int i2) throws IOException {
            C52173r.m111583a(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            } else if (this.f129869c <= 0) {
                return -1;
            } else {
                if (i2 > this.f129869c) {
                    i2 = this.f129869c;
                }
                C52173r rVar = C52173r.this;
                int a = rVar.mo108904a(this.f129868b);
                if (a + i2 <= rVar.f129856b) {
                    rVar.f129855a.seek((long) a);
                    rVar.f129855a.readFully(bArr, i, i2);
                } else {
                    int i3 = rVar.f129856b - a;
                    rVar.f129855a.seek((long) a);
                    rVar.f129855a.readFully(bArr, i, i3);
                    rVar.f129855a.seek(16);
                    rVar.f129855a.readFully(bArr, i + i3, i2 - i3);
                }
                this.f129868b = C52173r.this.mo108904a(this.f129868b + i2);
                this.f129869c -= i2;
                return i2;
            }
        }
    }

    /* renamed from: com.twitter.sdk.android.core.internal.scribe.r$c */
    public interface C52177c {
        /* renamed from: a */
        void mo108910a(InputStream inputStream, int i) throws IOException;
    }

    /* renamed from: a */
    public final synchronized void mo108906a(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        m111583a((T) bArr, "buffer");
        if ((i2 | 0) < 0 || i2 > bArr.length - 0) {
            throw new IndexOutOfBoundsException();
        }
        m111589c(i2);
        boolean b = mo108907b();
        if (b) {
            i3 = 16;
        } else {
            i3 = mo108904a(this.f129859f.f129865b + 4 + this.f129859f.f129866c);
        }
        C52175a aVar = new C52175a(i3, i2);
        m111588b(this.f129860g, 0, i2);
        m111585a(aVar.f129865b, this.f129860g, 0, 4);
        m111585a(aVar.f129865b + 4, bArr, 0, i2);
        m111584a(this.f129856b, this.f129857d + 1, b ? aVar.f129865b : this.f129858e.f129865b, aVar.f129865b);
        this.f129859f = aVar;
        this.f129857d++;
        if (b) {
            this.f129858e = this.f129859f;
        }
    }

    /* renamed from: b */
    public final synchronized boolean mo108907b() {
        boolean z;
        if (this.f129857d == 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public synchronized void close() throws IOException {
        this.f129855a.close();
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f129856b);
        sb.append(", size=");
        sb.append(this.f129857d);
        sb.append(", first=");
        sb.append(this.f129858e);
        sb.append(", last=");
        sb.append(this.f129859f);
        sb.append(", element lengths=[");
        try {
            mo108905a((C52177c) new C52177c() {

                /* renamed from: a */
                boolean f129861a = true;

                /* renamed from: a */
                public final void mo108910a(InputStream inputStream, int i) throws IOException {
                    if (this.f129861a) {
                        this.f129861a = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(i);
                }
            });
        } catch (IOException e) {
            f129854c.log(Level.WARNING, "read error", e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* renamed from: a */
    public final int mo108903a() {
        if (this.f129857d == 0) {
            return 16;
        }
        if (this.f129859f.f129865b >= this.f129858e.f129865b) {
            return (this.f129859f.f129865b - this.f129858e.f129865b) + 4 + this.f129859f.f129866c + 16;
        }
        return (((this.f129859f.f129865b + 4) + this.f129859f.f129866c) + this.f129856b) - this.f129858e.f129865b;
    }

    /* renamed from: a */
    private static RandomAccessFile m111582a(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    /* renamed from: b */
    private C52175a m111587b(int i) throws IOException {
        if (i == 0) {
            return C52175a.f129864a;
        }
        this.f129855a.seek((long) i);
        return new C52175a(i, this.f129855a.readInt());
    }

    /* JADX INFO: finally extract failed */
    public C52173r(File file) throws IOException {
        if (!file.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append(file.getPath());
            sb.append(".tmp");
            File file2 = new File(sb.toString());
            RandomAccessFile a = m111582a(file2);
            try {
                a.setLength(4096);
                a.seek(0);
                byte[] bArr = new byte[16];
                m111586a(bArr, 4096, 0, 0, 0);
                a.write(bArr);
                a.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                a.close();
                throw th;
            }
        }
        this.f129855a = m111582a(file);
        this.f129855a.seek(0);
        this.f129855a.readFully(this.f129860g);
        this.f129856b = m111581a(this.f129860g, 0);
        if (((long) this.f129856b) <= this.f129855a.length()) {
            this.f129857d = m111581a(this.f129860g, 4);
            int a2 = m111581a(this.f129860g, 8);
            int a3 = m111581a(this.f129860g, 12);
            this.f129858e = m111587b(a2);
            this.f129859f = m111587b(a3);
            return;
        }
        StringBuilder sb2 = new StringBuilder("File is truncated. Expected length: ");
        sb2.append(this.f129856b);
        sb2.append(", Actual length: ");
        sb2.append(this.f129855a.length());
        throw new IOException(sb2.toString());
    }

    /* renamed from: c */
    private void m111589c(int i) throws IOException {
        int i2 = i + 4;
        int a = this.f129856b - mo108903a();
        if (a < i2) {
            int i3 = this.f129856b;
            do {
                a += i3;
                i3 <<= 1;
            } while (a < i2);
            this.f129855a.setLength((long) i3);
            this.f129855a.getChannel().force(true);
            int a2 = mo108904a(this.f129859f.f129865b + 4 + this.f129859f.f129866c);
            if (a2 < this.f129858e.f129865b) {
                FileChannel channel = this.f129855a.getChannel();
                channel.position((long) this.f129856b);
                long j = (long) (a2 - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            if (this.f129859f.f129865b < this.f129858e.f129865b) {
                int i4 = (this.f129856b + this.f129859f.f129865b) - 16;
                m111584a(i3, this.f129857d, this.f129858e.f129865b, i4);
                this.f129859f = new C52175a(i4, this.f129859f.f129866c);
            } else {
                m111584a(i3, this.f129857d, this.f129858e.f129865b, this.f129859f.f129865b);
            }
            this.f129856b = i3;
        }
    }

    /* renamed from: a */
    public final int mo108904a(int i) {
        if (i < this.f129856b) {
            return i;
        }
        return (i + 16) - this.f129856b;
    }

    /* renamed from: a */
    public final synchronized void mo108905a(C52177c cVar) throws IOException {
        int i = this.f129858e.f129865b;
        for (int i2 = 0; i2 < this.f129857d; i2++) {
            C52175a b = m111587b(i);
            cVar.mo108910a(new C52176b(b), b.f129866c);
            i = mo108904a(b.f129865b + 4 + b.f129866c);
        }
    }

    /* renamed from: a */
    public static <T> T m111583a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    private static int m111581a(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: a */
    private static void m111586a(byte[] bArr, int... iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            m111588b(bArr, i, iArr[i2]);
            i += 4;
        }
    }

    /* renamed from: b */
    private static void m111588b(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: a */
    private void m111584a(int i, int i2, int i3, int i4) throws IOException {
        m111586a(this.f129860g, i, i2, i3, i4);
        this.f129855a.seek(0);
        this.f129855a.write(this.f129860g);
    }

    /* renamed from: a */
    private void m111585a(int i, byte[] bArr, int i2, int i3) throws IOException {
        int a = mo108904a(i);
        if (a + i3 <= this.f129856b) {
            this.f129855a.seek((long) a);
            this.f129855a.write(bArr, i2, i3);
            return;
        }
        int i4 = this.f129856b - a;
        this.f129855a.seek((long) a);
        this.f129855a.write(bArr, i2, i4);
        this.f129855a.seek(16);
        this.f129855a.write(bArr, i2 + i4, i3 - i4);
    }
}
