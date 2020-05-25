package com.p683ss.android.ugc.aweme.emoji.utils.p1694a;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipException;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.a.w */
public final class C29461w implements Closeable {

    /* renamed from: m */
    private static final long f77136m = C29468x.m69516a(C29469y.f77169h);

    /* renamed from: a */
    public final List<C29459u> f77137a;

    /* renamed from: b */
    public final String f77138b;

    /* renamed from: c */
    public final RandomAccessFile f77139c;

    /* renamed from: d */
    private final Map<String, LinkedList<C29459u>> f77140d;

    /* renamed from: e */
    private final C29456s f77141e;

    /* renamed from: f */
    private final String f77142f;

    /* renamed from: g */
    private final boolean f77143g;

    /* renamed from: h */
    private volatile boolean f77144h;

    /* renamed from: i */
    private final byte[] f77145i;

    /* renamed from: j */
    private final byte[] f77146j;

    /* renamed from: k */
    private final byte[] f77147k;

    /* renamed from: l */
    private final byte[] f77148l;

    /* renamed from: n */
    private final Comparator<C29459u> f77149n;

    /* renamed from: com.ss.android.ugc.aweme.emoji.utils.a.w$a */
    public class C29464a extends InputStream {

        /* renamed from: a */
        public boolean f77153a;

        /* renamed from: c */
        private long f77155c;

        /* renamed from: d */
        private long f77156d;

        public final int read() throws IOException {
            int read;
            long j = this.f77155c;
            this.f77155c = j - 1;
            if (j > 0) {
                synchronized (C29461w.this.f77139c) {
                    RandomAccessFile randomAccessFile = C29461w.this.f77139c;
                    long j2 = this.f77156d;
                    this.f77156d = 1 + j2;
                    randomAccessFile.seek(j2);
                    read = C29461w.this.f77139c.read();
                }
                return read;
            } else if (!this.f77153a) {
                return -1;
            } else {
                this.f77153a = false;
                return 0;
            }
        }

        public C29464a(long j, long j2) {
            this.f77155c = j2;
            this.f77156d = j;
        }

        public final int read(byte[] bArr, int i, int i2) throws IOException {
            int read;
            if (this.f77155c <= 0) {
                if (!this.f77153a) {
                    return -1;
                }
                this.f77153a = false;
                bArr[i] = 0;
                return 1;
            } else if (i2 <= 0) {
                return 0;
            } else {
                if (((long) i2) > this.f77155c) {
                    i2 = (int) this.f77155c;
                }
                synchronized (C29461w.this.f77139c) {
                    C29461w.this.f77139c.seek(this.f77156d);
                    read = C29461w.this.f77139c.read(bArr, i, i2);
                }
                if (read > 0) {
                    long j = (long) read;
                    this.f77156d += j;
                    this.f77155c -= j;
                }
                return read;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.utils.a.w$b */
    public static class C29465b extends C29459u {

        /* renamed from: f */
        public final C29467d f77157f;

        public final int hashCode() {
            return (super.hashCode() * 3) + ((int) (this.f77157f.f77160a % 2147483647L));
        }

        C29465b(C29467d dVar) {
            this.f77157f = dVar;
        }

        public final boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            C29465b bVar = (C29465b) obj;
            if (this.f77157f.f77160a == bVar.f77157f.f77160a && this.f77157f.f77161b == bVar.f77157f.f77161b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.utils.a.w$c */
    static final class C29466c {

        /* renamed from: a */
        public final byte[] f77158a;

        /* renamed from: b */
        public final byte[] f77159b;

        private C29466c(byte[] bArr, byte[] bArr2) {
            this.f77158a = bArr;
            this.f77159b = bArr2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.utils.a.w$d */
    public static final class C29467d {

        /* renamed from: a */
        public long f77160a;

        /* renamed from: b */
        public long f77161b;

        private C29467d() {
            this.f77160a = -1;
            this.f77161b = -1;
        }
    }

    public final void close() throws IOException {
        this.f77144h = true;
        this.f77139c.close();
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            if (!this.f77144h) {
                System.err.printf("Cleaning up unclosed %s for archive %s%n", new Object[]{getClass().getSimpleName(), this.f77142f});
                close();
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: a */
    private Map<C29459u, C29466c> m69512a() throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C29456s sVar;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C29461w wVar = this;
        HashMap hashMap = new HashMap();
        if (m69515a(22, 65557, C29469y.f77170i)) {
            boolean z11 = true;
            int i6 = 0;
            if (wVar.f77139c.getFilePointer() > 20) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                wVar.f77139c.seek(wVar.f77139c.getFilePointer() - 20);
                wVar.f77139c.readFully(wVar.f77146j);
                z2 = Arrays.equals(C29469y.f77172k, wVar.f77146j);
            } else {
                z2 = false;
            }
            int i7 = 4;
            int i8 = 16;
            if (!z2) {
                if (z) {
                    wVar.m69513a(16);
                }
                wVar.m69513a(16);
                wVar.f77139c.readFully(wVar.f77146j);
                wVar.f77139c.seek(C29468x.m69516a(wVar.f77146j));
            } else {
                wVar.m69513a(4);
                wVar.f77139c.readFully(wVar.f77145i);
                wVar.f77139c.seek(C29455r.m69475a(wVar.f77145i));
                wVar.f77139c.readFully(wVar.f77146j);
                if (Arrays.equals(wVar.f77146j, C29469y.f77171j)) {
                    wVar.m69513a(44);
                    wVar.f77139c.readFully(wVar.f77145i);
                    wVar.f77139c.seek(C29455r.m69475a(wVar.f77145i));
                } else {
                    C29461w wVar2 = wVar;
                    throw new ZipException("archive's ZIP64 end of central directory locator is corrupt.");
                }
            }
            wVar.f77139c.readFully(wVar.f77146j);
            long a = C29468x.m69516a(wVar.f77146j);
            if (a != f77136m) {
                wVar.f77139c.seek(0);
                wVar.f77139c.readFully(wVar.f77146j);
                if (Arrays.equals(wVar.f77146j, C29469y.f77167f)) {
                    throw new IOException("central directory is empty, can't expand corrupt archive.");
                }
            }
            while (a == f77136m) {
                wVar.f77139c.readFully(wVar.f77147k);
                C29467d dVar = new C29467d();
                C29465b bVar = new C29465b(dVar);
                bVar.f77127b = (C29471z.m69536a(wVar.f77147k, i6) >> 8) & 15;
                int a2 = C29471z.m69536a(wVar.f77147k, i7);
                C29441f fVar = new C29441f();
                if ((a2 & 8) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                fVar.f77086b = z3;
                if ((a2 & 2048) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                fVar.f77085a = z4;
                if ((a2 & 64) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                fVar.f77088d = z5;
                if (z5) {
                    fVar.f77087c = z11;
                }
                if ((a2 & 1) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                fVar.f77087c = z6;
                boolean z12 = fVar.f77085a;
                if (z12) {
                    sVar = C29457t.f77119a;
                } else {
                    sVar = wVar.f77141e;
                }
                bVar.f77130e = fVar;
                bVar.setMethod(C29471z.m69536a(wVar.f77147k, 6));
                long b = C29468x.m69519b(wVar.f77147k, 8);
                Calendar instance = Calendar.getInstance();
                instance.set(z11 ? 1 : 0, ((int) ((b >> 25) & 127)) + 1980);
                instance.set(2, ((int) ((b >> 21) & 15)) - z11);
                instance.set(5, ((int) (b >> i8)) & 31);
                instance.set(11, ((int) (b >> 11)) & 31);
                instance.set(12, ((int) (b >> 5)) & 63);
                instance.set(13, ((int) (b << (z11 ? 1 : 0))) & 62);
                instance.set(14, 0);
                bVar.setTime(instance.getTime().getTime());
                bVar.setCrc(C29468x.m69519b(this.f77147k, 12));
                bVar.setCompressedSize(C29468x.m69519b(this.f77147k, i8));
                bVar.setSize(C29468x.m69519b(this.f77147k, 20));
                int a3 = C29471z.m69536a(this.f77147k, 24);
                int a4 = C29471z.m69536a(this.f77147k, 26);
                int a5 = C29471z.m69536a(this.f77147k, 28);
                int a6 = C29471z.m69536a(this.f77147k, 30);
                bVar.f77126a = C29471z.m69536a(this.f77147k, 32);
                bVar.f77128c = C29468x.m69519b(this.f77147k, 34);
                byte[] bArr = new byte[a3];
                this.f77139c.readFully(bArr);
                bVar.mo59537a(sVar.mo59514a(bArr), bArr);
                dVar.f77160a = C29468x.m69519b(this.f77147k, 38);
                this.f77137a.add(bVar);
                byte[] bArr2 = new byte[a4];
                this.f77139c.readFully(bArr2);
                bVar.mo59538a(bArr2);
                C29452o oVar = (C29452o) bVar.mo59539b(C29452o.f77109a);
                if (oVar != null) {
                    if (bVar.getSize() == 4294967295L) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (bVar.getCompressedSize() == 4294967295L) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (dVar.f77160a == 4294967295L) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (a6 == 65535) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (oVar.f77115f != null) {
                        if (z7) {
                            i = 8;
                        } else {
                            i = 0;
                        }
                        if (z8) {
                            i2 = 8;
                        } else {
                            i2 = 0;
                        }
                        int i9 = i + i2;
                        if (z9) {
                            i3 = 8;
                        } else {
                            i3 = 0;
                        }
                        int i10 = i9 + i3;
                        if (z10) {
                            i4 = 4;
                        } else {
                            i4 = 0;
                        }
                        int i11 = i10 + i4;
                        if (oVar.f77115f.length >= i11) {
                            if (z7) {
                                oVar.f77111b = new C29455r(oVar.f77115f, 0);
                                i5 = 8;
                            } else {
                                i5 = 0;
                            }
                            if (z8) {
                                oVar.f77112c = new C29455r(oVar.f77115f, i5);
                                i5 += 8;
                            }
                            if (z9) {
                                oVar.f77113d = new C29455r(oVar.f77115f, i5);
                                i5 += 8;
                            }
                            if (z10) {
                                oVar.f77114e = new C29468x(oVar.f77115f, i5);
                            }
                        } else {
                            StringBuilder sb = new StringBuilder("central directory zip64 extended information extra field's length doesn't match central directory data.  Expected length ");
                            sb.append(i11);
                            sb.append(" but is ");
                            sb.append(oVar.f77115f.length);
                            throw new ZipException(sb.toString());
                        }
                    }
                    if (z7) {
                        bVar.setSize(oVar.f77111b.mo59528b());
                    } else if (z8) {
                        oVar.f77111b = new C29455r(bVar.getSize());
                    }
                    if (z8) {
                        bVar.setCompressedSize(oVar.f77112c.mo59528b());
                    } else if (z7) {
                        oVar.f77112c = new C29455r(bVar.getCompressedSize());
                    }
                    if (z9) {
                        dVar.f77160a = oVar.f77113d.mo59528b();
                    }
                }
                byte[] bArr3 = new byte[a5];
                this.f77139c.readFully(bArr3);
                bVar.setComment(sVar.mo59514a(bArr3));
                if (!z12 && this.f77143g) {
                    hashMap.put(bVar, new C29466c(bArr, bArr3));
                }
                this.f77139c.readFully(this.f77146j);
                wVar = this;
                a = C29468x.m69516a(this.f77146j);
                i7 = 4;
                i8 = 16;
                z11 = true;
                i6 = 0;
            }
            C29461w wVar3 = wVar;
            return hashMap;
        }
        C29461w wVar4 = wVar;
        throw new ZipException("archive is not a ZIP archive");
    }

    public C29461w(String str) throws IOException {
        this(new File(str), null);
    }

    /* renamed from: a */
    private void m69513a(int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int skipBytes = this.f77139c.skipBytes(i - i2);
            if (skipBytes > 0) {
                i2 += skipBytes;
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: a */
    private void m69514a(Map<C29459u, C29466c> map) throws IOException {
        for (C29459u uVar : this.f77137a) {
            C29465b bVar = (C29465b) uVar;
            C29467d dVar = bVar.f77157f;
            long j = dVar.f77160a + 26;
            this.f77139c.seek(j);
            this.f77139c.readFully(this.f77148l);
            int a = C29471z.m69535a(this.f77148l);
            this.f77139c.readFully(this.f77148l);
            int a2 = C29471z.m69535a(this.f77148l);
            int i = a;
            while (i > 0) {
                int skipBytes = this.f77139c.skipBytes(i);
                if (skipBytes > 0) {
                    i -= skipBytes;
                } else {
                    throw new IOException("failed to skip file name in local file header");
                }
            }
            byte[] bArr = new byte[a2];
            this.f77139c.readFully(bArr);
            bVar.setExtra(bArr);
            dVar.f77161b = j + 2 + 2 + ((long) a) + ((long) a2);
            if (map.containsKey(bVar)) {
                C29466c cVar = (C29466c) map.get(bVar);
                C29435aa.m69417a(bVar, cVar.f77158a, cVar.f77159b);
            }
            String name = bVar.getName();
            LinkedList linkedList = (LinkedList) this.f77140d.get(name);
            if (linkedList == null) {
                linkedList = new LinkedList();
                this.f77140d.put(name, linkedList);
            }
            linkedList.addLast(bVar);
        }
    }

    private C29461w(File file, String str) throws IOException {
        this(file, null, true);
    }

    private C29461w(File file, String str, boolean z) throws IOException {
        this.f77137a = new LinkedList();
        this.f77140d = new HashMap(509);
        this.f77145i = new byte[8];
        this.f77146j = new byte[4];
        this.f77147k = new byte[42];
        this.f77148l = new byte[2];
        this.f77149n = new Comparator<C29459u>() {
            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                C29465b bVar;
                C29459u uVar = (C29459u) obj;
                C29459u uVar2 = (C29459u) obj2;
                if (uVar == uVar2) {
                    return 0;
                }
                C29465b bVar2 = null;
                if (uVar instanceof C29465b) {
                    bVar = (C29465b) uVar;
                } else {
                    bVar = null;
                }
                if (uVar2 instanceof C29465b) {
                    bVar2 = (C29465b) uVar2;
                }
                if (bVar != null) {
                    if (bVar2 == null) {
                        return -1;
                    }
                    long j = bVar.f77157f.f77160a - bVar2.f77157f.f77160a;
                    if (j == 0) {
                        return 0;
                    }
                    if (j < 0) {
                        return -1;
                    }
                }
                return 1;
            }
        };
        this.f77142f = file.getAbsolutePath();
        this.f77138b = str;
        this.f77141e = C29457t.m69484a(str);
        boolean z2 = true;
        this.f77143g = z2;
        this.f77139c = new RandomAccessFile(file, "r");
        try {
            m69514a(m69512a());
            z2 = false;
        } finally {
            this.f77144h = z2;
            try {
                this.f77139c.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    private boolean m69515a(long j, long j2, byte[] bArr) throws IOException {
        long length = this.f77139c.length() - 22;
        long max = Math.max(0, this.f77139c.length() - 65557);
        boolean z = false;
        if (length >= 0) {
            while (true) {
                if (length < max) {
                    break;
                }
                this.f77139c.seek(length);
                int read = this.f77139c.read();
                if (read != -1) {
                    if (read == bArr[0] && this.f77139c.read() == bArr[1] && this.f77139c.read() == bArr[2] && this.f77139c.read() == bArr[3]) {
                        z = true;
                        break;
                    }
                    length--;
                } else {
                    break;
                }
            }
        }
        if (z) {
            this.f77139c.seek(length);
        }
        return z;
    }
}
