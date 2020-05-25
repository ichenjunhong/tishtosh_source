package com.p683ss.android.ugc.aweme.emoji.utils.p1694a;

import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.a.y */
public final class C29469y extends FilterOutputStream {

    /* renamed from: f */
    protected static final byte[] f77167f = C29468x.f77163c.mo59558a();

    /* renamed from: g */
    protected static final byte[] f77168g = C29468x.f77164d.mo59558a();

    /* renamed from: h */
    protected static final byte[] f77169h = C29468x.f77162b.mo59558a();

    /* renamed from: i */
    protected static final byte[] f77170i = C29468x.m69518a(101010256);

    /* renamed from: j */
    static final byte[] f77171j = C29468x.m69518a(101075792);

    /* renamed from: k */
    static final byte[] f77172k = C29468x.m69518a(117853008);

    /* renamed from: m */
    private static final byte[] f77173m = new byte[0];

    /* renamed from: t */
    private static final byte[] f77174t = {0, 0};

    /* renamed from: u */
    private static final byte[] f77175u = {0, 0, 0, 0};

    /* renamed from: v */
    private static final byte[] f77176v = C29468x.m69518a(1);

    /* renamed from: A */
    private boolean f77177A;

    /* renamed from: B */
    private final Calendar f77178B;

    /* renamed from: a */
    public String f77179a;

    /* renamed from: b */
    protected final Deflater f77180b;

    /* renamed from: c */
    protected byte[] f77181c;

    /* renamed from: d */
    public boolean f77182d;

    /* renamed from: e */
    public C29453p f77183e;

    /* renamed from: l */
    private boolean f77184l;

    /* renamed from: n */
    private C29470a f77185n;

    /* renamed from: o */
    private final List<C29459u> f77186o;

    /* renamed from: p */
    private final CRC32 f77187p;

    /* renamed from: q */
    private long f77188q;

    /* renamed from: r */
    private long f77189r;

    /* renamed from: s */
    private long f77190s;

    /* renamed from: w */
    private final Map<C29459u, Long> f77191w;

    /* renamed from: x */
    private C29456s f77192x;

    /* renamed from: y */
    private final RandomAccessFile f77193y;

    /* renamed from: z */
    private boolean f77194z;

    /* renamed from: com.ss.android.ugc.aweme.emoji.utils.a.y$a */
    static final class C29470a {

        /* renamed from: a */
        public final C29459u f77195a;

        /* renamed from: b */
        public long f77196b;

        /* renamed from: c */
        public long f77197c;

        /* renamed from: d */
        public long f77198d;

        /* renamed from: e */
        public boolean f77199e;

        /* renamed from: f */
        public boolean f77200f;
    }

    /* renamed from: d */
    private void m69534d() throws IOException {
        while (!this.f77180b.needsInput()) {
            m69532c();
        }
    }

    public final void flush() throws IOException {
        if (this.out != null) {
            this.out.flush();
        }
    }

    /* renamed from: c */
    private void m69532c() throws IOException {
        int deflate = this.f77180b.deflate(this.f77181c, 0, this.f77181c.length);
        if (deflate > 0) {
            m69524a(this.f77181c, 0, deflate);
        }
    }

    /* renamed from: b */
    private void m69528b() throws IOException {
        if (this.f77185n.f77195a.getMethod() == 8) {
            this.f77180b.finish();
            while (!this.f77180b.finished()) {
                m69532c();
            }
        }
    }

    /* renamed from: a */
    private void m69522a() throws IOException {
        boolean z;
        int i;
        int i2;
        boolean z2;
        boolean z3;
        char c;
        char c2;
        char c3;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(70000);
        Iterator it = this.f77186o.iterator();
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            C29459u uVar = (C29459u) it.next();
            long longValue = ((Long) this.f77191w.get(uVar)).longValue();
            if (m69526a(uVar) || uVar.getCompressedSize() >= 4294967295L || uVar.getSize() >= 4294967295L || longValue >= 4294967295L) {
                z = true;
            } else {
                z = false;
            }
            if (!z || this.f77183e != C29453p.Never) {
                if (z) {
                    if (this.f77185n != null) {
                        this.f77185n.f77199e = !this.f77177A;
                    }
                    this.f77177A = true;
                    C29452o oVar = (C29452o) uVar.mo59539b(C29452o.f77109a);
                    if (oVar == null) {
                        oVar = new C29452o();
                    }
                    uVar.mo59534a((C29460v) oVar);
                    if (uVar.getCompressedSize() >= 4294967295L || uVar.getSize() >= 4294967295L) {
                        oVar.f77112c = new C29455r(uVar.getCompressedSize());
                        oVar.f77111b = new C29455r(uVar.getSize());
                    } else {
                        oVar.f77112c = null;
                        oVar.f77111b = null;
                    }
                    if (longValue >= 4294967295L) {
                        oVar.f77113d = new C29455r(longValue);
                    }
                    uVar.mo59533a();
                }
                ByteBuffer c4 = m69531c(uVar);
                byte[] b = uVar.mo59540b();
                String comment = uVar.getComment();
                if (comment == null) {
                    comment = "";
                }
                ByteBuffer b2 = m69527b(uVar).mo59516b(comment);
                int limit = c4.limit() - c4.position();
                int limit2 = b2.limit() - b2.position();
                int i5 = limit + 46;
                byte[] bArr = new byte[(b.length + i5 + limit2)];
                Iterator it2 = it;
                int i6 = i4;
                System.arraycopy(f77169h, i3, bArr, i3, 4);
                int i7 = uVar.f77127b << 8;
                if (!this.f77177A) {
                    i = 20;
                } else {
                    i = 45;
                }
                C29471z.m69537a(i7 | i, bArr, 4);
                int method = uVar.getMethod();
                boolean a = this.f77192x.mo59515a(uVar.getName());
                if (z) {
                    i2 = 45;
                } else if (m69525a(method)) {
                    i2 = 20;
                } else {
                    i2 = 10;
                }
                C29471z.m69537a(i2, bArr, 6);
                if (a || !this.f77182d) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                C29441f fVar = new C29441f();
                if (this.f77194z || z2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                fVar.f77085a = z3;
                if (m69525a(method)) {
                    fVar.f77086b = true;
                }
                if (fVar.f77086b) {
                    c = 8;
                } else {
                    c = 0;
                }
                if (fVar.f77085a) {
                    c2 = 2048;
                } else {
                    c2 = 0;
                }
                boolean z4 = c | c2 | fVar.f77087c;
                if (fVar.f77088d) {
                    c3 = '@';
                } else {
                    c3 = 0;
                }
                C29471z.m69537a(z4 | c3 ? 1 : 0, bArr, 8);
                C29471z.m69537a(method, bArr, 10);
                Calendar calendar = this.f77178B;
                calendar.setTimeInMillis(uVar.getTime());
                int i8 = calendar.get(1);
                if (i8 < 1980) {
                    System.arraycopy(C29435aa.f77071a, 0, bArr, 12, C29435aa.f77071a.length);
                } else {
                    C29468x.m69517a((long) ((calendar.get(13) >> 1) | ((i8 - 1980) << 25) | ((calendar.get(2) + 1) << 21) | (calendar.get(5) << 16) | (calendar.get(11) << 11) | (calendar.get(12) << 5)), bArr, 12);
                }
                C29468x.m69517a(uVar.getCrc(), bArr, 16);
                if (uVar.getCompressedSize() >= 4294967295L || uVar.getSize() >= 4294967295L) {
                    C29468x.f77165e.mo59557a(bArr, 20);
                    C29468x.f77165e.mo59557a(bArr, 24);
                } else {
                    C29468x.m69517a(uVar.getCompressedSize(), bArr, 20);
                    C29468x.m69517a(uVar.getSize(), bArr, 24);
                }
                C29471z.m69537a(limit, bArr, 28);
                C29471z.m69537a(b.length, bArr, 30);
                C29471z.m69537a(limit2, bArr, 32);
                System.arraycopy(f77174t, 0, bArr, 34, 2);
                C29471z.m69537a(uVar.f77126a, bArr, 36);
                C29468x.m69517a(uVar.f77128c, bArr, 38);
                C29468x.m69517a(Math.min(longValue, 4294967295L), bArr, 42);
                System.arraycopy(c4.array(), c4.arrayOffset(), bArr, 46, limit);
                i3 = 0;
                System.arraycopy(b, 0, bArr, i5, b.length);
                System.arraycopy(b2.array(), b2.arrayOffset(), bArr, i5 + b.length, limit2);
                byteArrayOutputStream.write(bArr);
                i4 = i6 + 1;
                if (i4 > 1000) {
                    m69523a(byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.reset();
                    i4 = 0;
                }
                it = it2;
            } else {
                throw new C29454q("archive's size exceeds the limit of 4GByte.");
            }
        }
        m69523a(byteArrayOutputStream.toByteArray());
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x028c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() throws java.io.IOException {
        /*
            r15 = this;
            r0 = r15
            boolean r1 = r0.f77184l
            if (r1 != 0) goto L_0x03ff
            boolean r1 = r0.f77184l
            if (r1 != 0) goto L_0x03f7
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r1 = r0.f77185n
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r1 == 0) goto L_0x02b6
            boolean r1 = r0.f77184l
            if (r1 != 0) goto L_0x02ae
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r1 = r0.f77185n
            if (r1 == 0) goto L_0x02a6
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r1 = r0.f77185n
            boolean r1 = r1.f77200f
            r5 = 0
            if (r1 != 0) goto L_0x0026
            byte[] r1 = f77173m
            r15.write(r1, r5, r5)
        L_0x0026:
            r15.m69528b()
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r1 = r0.f77185n
            com.ss.android.ugc.aweme.emoji.utils.a.u r1 = r1.f77195a
            com.ss.android.ugc.aweme.emoji.utils.a.p r6 = r0.f77183e
            com.ss.android.ugc.aweme.emoji.utils.a.p r7 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29453p.AsNeeded
            r8 = 8
            if (r6 != r7) goto L_0x004d
            java.io.RandomAccessFile r6 = r0.f77193y
            if (r6 != 0) goto L_0x004d
            int r6 = r1.getMethod()
            if (r6 != r8) goto L_0x004d
            long r6 = r1.getSize()
            r9 = -1
            int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x004a
            goto L_0x004d
        L_0x004a:
            com.ss.android.ugc.aweme.emoji.utils.a.p r1 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29453p.Never
            goto L_0x004f
        L_0x004d:
            com.ss.android.ugc.aweme.emoji.utils.a.p r1 = r0.f77183e
        L_0x004f:
            long r6 = r0.f77188q
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r9 = r0.f77185n
            long r9 = r9.f77197c
            long r6 = r6 - r9
            java.util.zip.CRC32 r9 = r0.f77187p
            long r9 = r9.getValue()
            java.util.zip.CRC32 r11 = r0.f77187p
            r11.reset()
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r11 = r0.f77185n
            com.ss.android.ugc.aweme.emoji.utils.a.u r11 = r11.f77195a
            int r11 = r11.getMethod()
            if (r11 != r8) goto L_0x008b
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r11 = r0.f77185n
            com.ss.android.ugc.aweme.emoji.utils.a.u r11 = r11.f77195a
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r12 = r0.f77185n
            long r12 = r12.f77198d
            r11.setSize(r12)
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r11 = r0.f77185n
            com.ss.android.ugc.aweme.emoji.utils.a.u r11 = r11.f77195a
            r11.setCompressedSize(r6)
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r6 = r0.f77185n
            com.ss.android.ugc.aweme.emoji.utils.a.u r6 = r6.f77195a
            r6.setCrc(r9)
            java.util.zip.Deflater r6 = r0.f77180b
            r6.reset()
            goto L_0x012e
        L_0x008b:
            java.io.RandomAccessFile r11 = r0.f77193y
            if (r11 != 0) goto L_0x0119
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r11 = r0.f77185n
            com.ss.android.ugc.aweme.emoji.utils.a.u r11 = r11.f77195a
            long r11 = r11.getCrc()
            int r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r13 != 0) goto L_0x00dd
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r9 = r0.f77185n
            com.ss.android.ugc.aweme.emoji.utils.a.u r9 = r9.f77195a
            long r9 = r9.getSize()
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 != 0) goto L_0x00a9
            goto L_0x012e
        L_0x00a9:
            java.util.zip.ZipException r1 = new java.util.zip.ZipException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "bad size for entry "
            r2.<init>(r3)
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r3 = r0.f77185n
            com.ss.android.ugc.aweme.emoji.utils.a.u r3 = r3.f77195a
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = ": "
            r2.append(r3)
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r3 = r0.f77185n
            com.ss.android.ugc.aweme.emoji.utils.a.u r3 = r3.f77195a
            long r3 = r3.getSize()
            r2.append(r3)
            java.lang.String r3 = " instead of "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00dd:
            java.util.zip.ZipException r1 = new java.util.zip.ZipException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "bad CRC checksum for entry "
            r2.<init>(r3)
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r3 = r0.f77185n
            com.ss.android.ugc.aweme.emoji.utils.a.u r3 = r3.f77195a
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = ": "
            r2.append(r3)
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r3 = r0.f77185n
            com.ss.android.ugc.aweme.emoji.utils.a.u r3 = r3.f77195a
            long r3 = r3.getCrc()
            java.lang.String r3 = java.lang.Long.toHexString(r3)
            r2.append(r3)
            java.lang.String r3 = " instead of "
            r2.append(r3)
            java.lang.String r3 = java.lang.Long.toHexString(r9)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0119:
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r11 = r0.f77185n
            com.ss.android.ugc.aweme.emoji.utils.a.u r11 = r11.f77195a
            r11.setSize(r6)
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r11 = r0.f77185n
            com.ss.android.ugc.aweme.emoji.utils.a.u r11 = r11.f77195a
            r11.setCompressedSize(r6)
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r6 = r0.f77185n
            com.ss.android.ugc.aweme.emoji.utils.a.u r6 = r6.f77195a
            r6.setCrc(r9)
        L_0x012e:
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r6 = r0.f77185n
            com.ss.android.ugc.aweme.emoji.utils.a.u r6 = r6.f77195a
            com.ss.android.ugc.aweme.emoji.utils.a.p r7 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29453p.Always
            if (r1 == r7) goto L_0x014f
            long r9 = r6.getSize()
            int r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0149
            long r6 = r6.getCompressedSize()
            int r9 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r9 < 0) goto L_0x0147
            goto L_0x0149
        L_0x0147:
            r6 = 0
            goto L_0x014a
        L_0x0149:
            r6 = 1
        L_0x014a:
            if (r6 == 0) goto L_0x014d
            goto L_0x014f
        L_0x014d:
            r6 = 0
            goto L_0x0150
        L_0x014f:
            r6 = 1
        L_0x0150:
            if (r6 == 0) goto L_0x0176
            com.ss.android.ugc.aweme.emoji.utils.a.p r7 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29453p.Never
            if (r1 == r7) goto L_0x0157
            goto L_0x0176
        L_0x0157:
            com.ss.android.ugc.aweme.emoji.utils.a.q r1 = new com.ss.android.ugc.aweme.emoji.utils.a.q
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r2 = r0.f77185n
            com.ss.android.ugc.aweme.emoji.utils.a.u r2 = r2.f77195a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = r2.getName()
            r3.append(r2)
            java.lang.String r2 = "'s size exceeds the limit of 4GByte."
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x0176:
            java.io.RandomAccessFile r1 = r0.f77193y
            if (r1 == 0) goto L_0x0250
            java.io.RandomAccessFile r1 = r0.f77193y
            long r9 = r1.getFilePointer()
            java.io.RandomAccessFile r1 = r0.f77193y
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r7 = r0.f77185n
            long r11 = r7.f77196b
            r1.seek(r11)
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r1 = r0.f77185n
            com.ss.android.ugc.aweme.emoji.utils.a.u r1 = r1.f77195a
            long r11 = r1.getCrc()
            byte[] r1 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29468x.m69518a(r11)
            r15.m69529b(r1)
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r1 = r0.f77185n
            com.ss.android.ugc.aweme.emoji.utils.a.u r1 = r1.f77195a
            boolean r1 = m69526a(r1)
            if (r1 == 0) goto L_0x01b8
            if (r6 != 0) goto L_0x01a5
            goto L_0x01b8
        L_0x01a5:
            com.ss.android.ugc.aweme.emoji.utils.a.x r1 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29468x.f77165e
            byte[] r1 = r1.mo59558a()
            r15.m69529b(r1)
            com.ss.android.ugc.aweme.emoji.utils.a.x r1 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29468x.f77165e
            byte[] r1 = r1.mo59558a()
            r15.m69529b(r1)
            goto L_0x01d6
        L_0x01b8:
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r1 = r0.f77185n
            com.ss.android.ugc.aweme.emoji.utils.a.u r1 = r1.f77195a
            long r11 = r1.getCompressedSize()
            byte[] r1 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29468x.m69518a(r11)
            r15.m69529b(r1)
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r1 = r0.f77185n
            com.ss.android.ugc.aweme.emoji.utils.a.u r1 = r1.f77195a
            long r11 = r1.getSize()
            byte[] r1 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29468x.m69518a(r11)
            r15.m69529b(r1)
        L_0x01d6:
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r1 = r0.f77185n
            com.ss.android.ugc.aweme.emoji.utils.a.u r1 = r1.f77195a
            boolean r1 = m69526a(r1)
            if (r1 == 0) goto L_0x024b
            java.io.RandomAccessFile r1 = r0.f77193y
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r7 = r0.f77185n
            long r11 = r7.f77196b
            r13 = 12
            long r11 = r11 + r13
            r13 = 4
            long r11 = r11 + r13
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r7 = r0.f77185n
            com.ss.android.ugc.aweme.emoji.utils.a.u r7 = r7.f77195a
            java.nio.ByteBuffer r7 = r15.m69531c(r7)
            int r7 = r7.limit()
            long r2 = (long) r7
            long r11 = r11 + r2
            long r11 = r11 + r13
            r1.seek(r11)
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r1 = r0.f77185n
            com.ss.android.ugc.aweme.emoji.utils.a.u r1 = r1.f77195a
            long r1 = r1.getSize()
            byte[] r1 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29455r.m69477a(r1)
            r15.m69529b(r1)
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r1 = r0.f77185n
            com.ss.android.ugc.aweme.emoji.utils.a.u r1 = r1.f77195a
            long r1 = r1.getCompressedSize()
            byte[] r1 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29455r.m69477a(r1)
            r15.m69529b(r1)
            if (r6 != 0) goto L_0x024b
            java.io.RandomAccessFile r1 = r0.f77193y
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r2 = r0.f77185n
            long r2 = r2.f77196b
            r6 = 10
            long r2 = r2 - r6
            r1.seek(r2)
            r1 = 10
            byte[] r1 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29471z.m69538a(r1)
            r15.m69529b(r1)
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r1 = r0.f77185n
            com.ss.android.ugc.aweme.emoji.utils.a.u r1 = r1.f77195a
            com.ss.android.ugc.aweme.emoji.utils.a.z r2 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29452o.f77109a
            r1.mo59535a(r2)
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r1 = r0.f77185n
            com.ss.android.ugc.aweme.emoji.utils.a.u r1 = r1.f77195a
            r1.mo59533a()
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r1 = r0.f77185n
            boolean r1 = r1.f77199e
            if (r1 == 0) goto L_0x024b
            r0.f77177A = r5
        L_0x024b:
            java.io.RandomAccessFile r1 = r0.f77193y
            r1.seek(r9)
        L_0x0250:
            com.ss.android.ugc.aweme.emoji.utils.a.y$a r1 = r0.f77185n
            com.ss.android.ugc.aweme.emoji.utils.a.u r1 = r1.f77195a
            int r2 = r1.getMethod()
            if (r2 != r8) goto L_0x02a2
            java.io.RandomAccessFile r2 = r0.f77193y
            if (r2 == 0) goto L_0x025f
            goto L_0x02a2
        L_0x025f:
            byte[] r2 = f77168g
            r15.m69523a(r2)
            long r2 = r1.getCrc()
            byte[] r2 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29468x.m69518a(r2)
            r15.m69523a(r2)
            boolean r2 = m69526a(r1)
            if (r2 != 0) goto L_0x028c
            long r2 = r1.getCompressedSize()
            byte[] r2 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29468x.m69518a(r2)
            r15.m69523a(r2)
            long r1 = r1.getSize()
            byte[] r1 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29468x.m69518a(r1)
            r15.m69523a(r1)
            goto L_0x02a2
        L_0x028c:
            long r2 = r1.getCompressedSize()
            byte[] r2 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29455r.m69477a(r2)
            r15.m69523a(r2)
            long r1 = r1.getSize()
            byte[] r1 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29455r.m69477a(r1)
            r15.m69523a(r1)
        L_0x02a2:
            r1 = 0
            r0.f77185n = r1
            goto L_0x02b6
        L_0x02a6:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "No current entry to close"
            r1.<init>(r2)
            throw r1
        L_0x02ae:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Stream has already been finished"
            r1.<init>(r2)
            throw r1
        L_0x02b6:
            long r1 = r0.f77188q
            r0.f77189r = r1
            r15.m69522a()
            long r1 = r0.f77188q
            long r3 = r0.f77189r
            long r1 = r1 - r3
            r0.f77190s = r1
            com.ss.android.ugc.aweme.emoji.utils.a.p r1 = r0.f77183e
            com.ss.android.ugc.aweme.emoji.utils.a.p r2 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29453p.Never
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r1 == r2) goto L_0x0354
            boolean r1 = r0.f77177A
            if (r1 != 0) goto L_0x02ed
            long r1 = r0.f77189r
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x02ea
            long r1 = r0.f77190s
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x02ea
            java.util.List<com.ss.android.ugc.aweme.emoji.utils.a.u> r1 = r0.f77186o
            int r1 = r1.size()
            if (r1 < r3) goto L_0x02ed
        L_0x02ea:
            r1 = 1
            r0.f77177A = r1
        L_0x02ed:
            boolean r1 = r0.f77177A
            if (r1 == 0) goto L_0x0354
            long r1 = r0.f77188q
            byte[] r4 = f77171j
            r15.m69529b(r4)
            r4 = 44
            byte[] r4 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29455r.m69477a(r4)
            r15.m69529b(r4)
            r4 = 45
            byte[] r5 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29471z.m69538a(r4)
            r15.m69529b(r5)
            byte[] r4 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29471z.m69538a(r4)
            r15.m69529b(r4)
            byte[] r4 = f77175u
            r15.m69529b(r4)
            byte[] r4 = f77175u
            r15.m69529b(r4)
            java.util.List<com.ss.android.ugc.aweme.emoji.utils.a.u> r4 = r0.f77186o
            int r4 = r4.size()
            long r4 = (long) r4
            byte[] r4 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29455r.m69477a(r4)
            r15.m69529b(r4)
            r15.m69529b(r4)
            long r4 = r0.f77190s
            byte[] r4 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29455r.m69477a(r4)
            r15.m69529b(r4)
            long r4 = r0.f77189r
            byte[] r4 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29455r.m69477a(r4)
            r15.m69529b(r4)
            byte[] r4 = f77172k
            r15.m69529b(r4)
            byte[] r4 = f77175u
            r15.m69529b(r4)
            byte[] r1 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29455r.m69477a(r1)
            r15.m69529b(r1)
            byte[] r1 = f77176v
            r15.m69529b(r1)
        L_0x0354:
            byte[] r1 = f77170i
            r15.m69523a(r1)
            byte[] r1 = f77174t
            r15.m69523a(r1)
            byte[] r1 = f77174t
            r15.m69523a(r1)
            java.util.List<com.ss.android.ugc.aweme.emoji.utils.a.u> r1 = r0.f77186o
            int r1 = r1.size()
            if (r1 <= r3) goto L_0x037a
            com.ss.android.ugc.aweme.emoji.utils.a.p r2 = r0.f77183e
            com.ss.android.ugc.aweme.emoji.utils.a.p r4 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29453p.Never
            if (r2 == r4) goto L_0x0372
            goto L_0x037a
        L_0x0372:
            com.ss.android.ugc.aweme.emoji.utils.a.q r1 = new com.ss.android.ugc.aweme.emoji.utils.a.q
            java.lang.String r2 = "archive contains more than 65535 entries."
            r1.<init>(r2)
            throw r1
        L_0x037a:
            long r4 = r0.f77189r
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0394
            com.ss.android.ugc.aweme.emoji.utils.a.p r2 = r0.f77183e
            com.ss.android.ugc.aweme.emoji.utils.a.p r4 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29453p.Never
            if (r2 == r4) goto L_0x038c
            goto L_0x0394
        L_0x038c:
            com.ss.android.ugc.aweme.emoji.utils.a.q r1 = new com.ss.android.ugc.aweme.emoji.utils.a.q
            java.lang.String r2 = "archive's size exceeds the limit of 4GByte."
            r1.<init>(r2)
            throw r1
        L_0x0394:
            int r1 = java.lang.Math.min(r1, r3)
            byte[] r1 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29471z.m69538a(r1)
            r15.m69523a(r1)
            r15.m69523a(r1)
            long r1 = r0.f77190s
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = java.lang.Math.min(r1, r3)
            byte[] r1 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29468x.m69518a(r1)
            r15.m69523a(r1)
            long r1 = r0.f77189r
            long r1 = java.lang.Math.min(r1, r3)
            byte[] r1 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29468x.m69518a(r1)
            r15.m69523a(r1)
            com.ss.android.ugc.aweme.emoji.utils.a.s r1 = r0.f77192x
            java.lang.String r2 = r0.f77179a
            java.nio.ByteBuffer r1 = r1.mo59516b(r2)
            int r2 = r1.limit()
            int r3 = r1.position()
            int r2 = r2 - r3
            byte[] r3 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29471z.m69538a(r2)
            r15.m69523a(r3)
            byte[] r3 = r1.array()
            int r1 = r1.arrayOffset()
            r15.m69524a(r3, r1, r2)
            java.util.Map<com.ss.android.ugc.aweme.emoji.utils.a.u, java.lang.Long> r1 = r0.f77191w
            r1.clear()
            java.util.List<com.ss.android.ugc.aweme.emoji.utils.a.u> r1 = r0.f77186o
            r1.clear()
            java.util.zip.Deflater r1 = r0.f77180b
            r1.end()
            r1 = 1
            r0.f77184l = r1
            goto L_0x03ff
        L_0x03f7:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "This archive has already been finished"
            r1.<init>(r2)
            throw r1
        L_0x03ff:
            java.io.RandomAccessFile r1 = r0.f77193y
            if (r1 == 0) goto L_0x0408
            java.io.RandomAccessFile r1 = r0.f77193y
            r1.close()
        L_0x0408:
            java.io.OutputStream r1 = r0.out
            if (r1 == 0) goto L_0x0411
            java.io.OutputStream r1 = r0.out
            r1.close()
        L_0x0411:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29469y.close():void");
    }

    /* renamed from: a */
    private void m69523a(byte[] bArr) throws IOException {
        m69524a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    private void m69529b(byte[] bArr) throws IOException {
        m69533c(bArr, 0, bArr.length);
    }

    /* renamed from: c */
    private ByteBuffer m69531c(C29459u uVar) throws IOException {
        return m69527b(uVar).mo59516b(uVar.getName());
    }

    /* renamed from: a */
    private boolean m69525a(int i) {
        if (i == 8 && this.f77193y == null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private C29456s m69527b(C29459u uVar) {
        if (this.f77192x.mo59515a(uVar.getName()) || !this.f77182d) {
            return this.f77192x;
        }
        return C29457t.f77119a;
    }

    /* renamed from: a */
    private static boolean m69526a(C29459u uVar) {
        if (uVar.mo59539b(C29452o.f77109a) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m69524a(byte[] bArr, int i, int i2) throws IOException {
        m69533c(bArr, i, i2);
        this.f77188q += (long) i2;
    }

    /* renamed from: c */
    private void m69533c(byte[] bArr, int i, int i2) throws IOException {
        if (this.f77193y != null) {
            this.f77193y.write(bArr, i, i2);
        } else {
            this.out.write(bArr, i, i2);
        }
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f77185n != null) {
            C29435aa.m69416a(this.f77185n.f77195a);
            this.f77185n.f77200f = true;
            if (this.f77185n.f77195a.getMethod() == 8) {
                m69530b(bArr, i, i2);
            } else {
                m69524a(bArr, i, i2);
            }
            this.f77187p.update(bArr, i, i2);
            return;
        }
        throw new IllegalStateException("No current entry");
    }

    /* renamed from: b */
    private void m69530b(byte[] bArr, int i, int i2) throws IOException {
        if (i2 > 0 && !this.f77180b.finished()) {
            this.f77185n.f77198d += (long) i2;
            if (i2 <= 8192) {
                this.f77180b.setInput(bArr, i, i2);
                m69534d();
                return;
            }
            int i3 = i2 / VideoCacheReadBuffersizeExperiment.DEFAULT;
            for (int i4 = 0; i4 < i3; i4++) {
                this.f77180b.setInput(bArr, (i4 * VideoCacheReadBuffersizeExperiment.DEFAULT) + i, VideoCacheReadBuffersizeExperiment.DEFAULT);
                m69534d();
            }
            int i5 = i3 * VideoCacheReadBuffersizeExperiment.DEFAULT;
            if (i5 < i2) {
                this.f77180b.setInput(bArr, i + i5, i2 - i5);
                m69534d();
            }
        }
    }
}
