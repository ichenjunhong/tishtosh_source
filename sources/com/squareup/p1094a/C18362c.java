package com.squareup.p1094a;

import android.graphics.Bitmap;
import com.squareup.p1094a.C18343aa.C18344a;
import com.squareup.p1094a.C18382l.C18384b;
import com.squareup.p1094a.C18396v.C18402d;
import com.squareup.p1094a.C18396v.C18403e;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.squareup.a.c */
final class C18362c implements Runnable {

    /* renamed from: t */
    private static final Object f50705t = new Object();

    /* renamed from: u */
    private static final ThreadLocal<StringBuilder> f50706u = new ThreadLocal<StringBuilder>() {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return new StringBuilder("Picasso-");
        }
    };

    /* renamed from: v */
    private static final AtomicInteger f50707v = new AtomicInteger();

    /* renamed from: w */
    private static final C18343aa f50708w = new C18343aa() {
        /* renamed from: a */
        public final boolean mo36788a(C18409y yVar) {
            return true;
        }

        /* renamed from: a */
        public final C18344a mo36787a(C18409y yVar, int i) throws IOException {
            StringBuilder sb = new StringBuilder("Unrecognized type of request: ");
            sb.append(yVar);
            throw new IllegalStateException(sb.toString());
        }
    };

    /* renamed from: a */
    final int f50709a = f50707v.incrementAndGet();

    /* renamed from: b */
    public final C18396v f50710b;

    /* renamed from: c */
    final C18375i f50711c;

    /* renamed from: d */
    final C18369d f50712d;

    /* renamed from: e */
    final C18346ac f50713e;

    /* renamed from: f */
    public final String f50714f;

    /* renamed from: g */
    public final C18409y f50715g;

    /* renamed from: h */
    public final int f50716h;

    /* renamed from: i */
    int f50717i;

    /* renamed from: j */
    final C18343aa f50718j;

    /* renamed from: k */
    public C18341a f50719k;

    /* renamed from: l */
    public List<C18341a> f50720l;

    /* renamed from: m */
    public Bitmap f50721m;

    /* renamed from: n */
    Future<?> f50722n;

    /* renamed from: o */
    public C18402d f50723o;

    /* renamed from: p */
    public Exception f50724p;

    /* renamed from: q */
    int f50725q;

    /* renamed from: r */
    int f50726r;

    /* renamed from: s */
    public C18403e f50727s;

    /* renamed from: a */
    private static boolean m44610a(boolean z, int i, int i2, int i3, int i4) {
        return !z || i > i3 || i2 > i4;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo36808b() {
        if (this.f50722n == null || !this.f50722n.isCancelled()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo36806a() {
        if (this.f50719k != null || ((this.f50720l != null && !this.f50720l.isEmpty()) || this.f50722n == null || !this.f50722n.cancel(false))) {
            return false;
        }
        return true;
    }

    public final void run() {
        String str;
        try {
            C18409y yVar = this.f50715g;
            if (yVar.f50842d != null) {
                str = String.valueOf(yVar.f50842d.getPath());
            } else {
                str = Integer.toHexString(yVar.f50843e);
            }
            StringBuilder sb = (StringBuilder) f50706u.get();
            sb.ensureCapacity(str.length() + 8);
            sb.replace(8, sb.length(), str);
            Thread.currentThread().setName(sb.toString());
            if (this.f50710b.f50806m) {
                C18356aj.m44593a(this);
            }
            this.f50721m = m44611c();
            if (this.f50721m == null) {
                this.f50711c.mo36830b(this);
            } else {
                C18375i iVar = this.f50711c;
                iVar.f50748i.sendMessage(iVar.f50748i.obtainMessage(4, this));
            }
        } catch (C18384b e) {
            if (!e.f50764a || e.f50765b != 504) {
                this.f50724p = e;
            }
            this.f50711c.mo36830b(this);
        } catch (C18394a e2) {
            this.f50724p = e2;
            this.f50711c.mo36827a(this);
        } catch (IOException e3) {
            this.f50724p = e3;
            this.f50711c.mo36827a(this);
        } catch (OutOfMemoryError e4) {
            StringWriter stringWriter = new StringWriter();
            C18346ac acVar = this.f50713e;
            int b = acVar.f50668b.mo36818b();
            int a = acVar.f50668b.mo36815a();
            long j = acVar.f50670d;
            long j2 = acVar.f50671e;
            long j3 = acVar.f50672f;
            long j4 = acVar.f50673g;
            OutOfMemoryError outOfMemoryError = e4;
            long j5 = acVar.f50674h;
            long j6 = acVar.f50675i;
            long j7 = acVar.f50676j;
            long j8 = acVar.f50677k;
            int i = acVar.f50678l;
            StringWriter stringWriter2 = stringWriter;
            int i2 = acVar.f50679m;
            C18349ad adVar = r4;
            long j9 = j5;
            long j10 = j6;
            long j11 = j7;
            long j12 = j8;
            C18349ad adVar2 = new C18349ad(b, a, j, j2, j3, j4, j9, j10, j11, j12, i, i2, acVar.f50680n, System.currentTimeMillis());
            StringWriter stringWriter3 = stringWriter2;
            PrintWriter printWriter = new PrintWriter(stringWriter3);
            printWriter.println("===============BEGIN PICASSO STATS ===============");
            printWriter.println("Memory Cache Stats");
            printWriter.print("  Max Cache Size: ");
            C18349ad adVar3 = adVar;
            printWriter.println(adVar3.f50684a);
            printWriter.print("  Cache Size: ");
            printWriter.println(adVar3.f50685b);
            printWriter.print("  Cache % Full: ");
            printWriter.println((int) Math.ceil((double) ((((float) adVar3.f50685b) / ((float) adVar3.f50684a)) * 100.0f)));
            printWriter.print("  Cache Hits: ");
            printWriter.println(adVar3.f50686c);
            printWriter.print("  Cache Misses: ");
            printWriter.println(adVar3.f50687d);
            printWriter.println("Network Stats");
            printWriter.print("  Download Count: ");
            printWriter.println(adVar3.f50694k);
            printWriter.print("  Total Download Size: ");
            printWriter.println(adVar3.f50688e);
            printWriter.print("  Average Download Size: ");
            printWriter.println(adVar3.f50691h);
            printWriter.println("Bitmap Stats");
            printWriter.print("  Total Bitmaps Decoded: ");
            printWriter.println(adVar3.f50695l);
            printWriter.print("  Total Bitmap Size: ");
            printWriter.println(adVar3.f50689f);
            printWriter.print("  Total Transformed Bitmaps: ");
            printWriter.println(adVar3.f50696m);
            printWriter.print("  Total Transformed Bitmap Size: ");
            printWriter.println(adVar3.f50690g);
            printWriter.print("  Average Bitmap Size: ");
            printWriter.println(adVar3.f50692i);
            printWriter.print("  Average Transformed Bitmap Size: ");
            printWriter.println(adVar3.f50693j);
            printWriter.println("===============END PICASSO STATS ===============");
            printWriter.flush();
            RuntimeException runtimeException = new RuntimeException(stringWriter3.toString(), outOfMemoryError);
            this.f50724p = runtimeException;
            this.f50711c.mo36830b(this);
        } catch (Exception e5) {
            this.f50724p = e5;
            this.f50711c.mo36830b(this);
        } catch (Throwable th) {
            th = th;
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
        Thread.currentThread().setName("Picasso-Idle");
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01f1  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap m44611c() throws java.io.IOException {
        /*
            r19 = this;
            r1 = r19
            int r0 = r1.f50716h
            boolean r0 = com.squareup.p1094a.C18391r.shouldReadFromMemoryCache(r0)
            r2 = 0
            if (r0 == 0) goto L_0x002a
            com.squareup.a.d r0 = r1.f50712d
            java.lang.String r3 = r1.f50714f
            android.graphics.Bitmap r0 = r0.mo36816a(r3)
            if (r0 == 0) goto L_0x002b
            com.squareup.a.ac r2 = r1.f50713e
            r2.mo36791a()
            com.squareup.a.v$d r2 = com.squareup.p1094a.C18396v.C18402d.MEMORY
            r1.f50723o = r2
            com.squareup.a.v r2 = r1.f50710b
            boolean r2 = r2.f50806m
            if (r2 == 0) goto L_0x0029
            com.squareup.a.y r2 = r1.f50715g
            r2.mo36869a()
        L_0x0029:
            return r0
        L_0x002a:
            r0 = r2
        L_0x002b:
            com.squareup.a.y r3 = r1.f50715g
            int r4 = r1.f50726r
            if (r4 != 0) goto L_0x0036
            com.squareup.a.s r4 = com.squareup.p1094a.C18392s.OFFLINE
            int r4 = r4.f50790a
            goto L_0x0038
        L_0x0036:
            int r4 = r1.f50717i
        L_0x0038:
            r3.f50841c = r4
            com.squareup.a.aa r3 = r1.f50718j
            com.squareup.a.y r4 = r1.f50715g
            int r5 = r1.f50717i
            com.squareup.a.aa$a r3 = r3.mo36787a(r4, r5)
            r5 = 0
            if (r3 == 0) goto L_0x00da
            com.squareup.a.v$d r0 = r3.f50662a
            r1.f50723o = r0
            int r0 = r3.f50665d
            r1.f50725q = r0
            android.graphics.Bitmap r0 = r3.f50663b
            if (r0 != 0) goto L_0x00da
            java.io.InputStream r3 = r3.f50664c
            com.squareup.a.y r0 = r1.f50715g     // Catch:{ all -> 0x00d5 }
            com.squareup.a.p r6 = new com.squareup.a.p     // Catch:{ all -> 0x00d5 }
            r6.<init>(r3)     // Catch:{ all -> 0x00d5 }
            r7 = 65536(0x10000, float:9.18355E-41)
            long r7 = r6.mo36836a(r7)     // Catch:{ all -> 0x00d5 }
            android.graphics.BitmapFactory$Options r9 = com.squareup.p1094a.C18343aa.m44566c(r0)     // Catch:{ all -> 0x00d5 }
            boolean r10 = com.squareup.p1094a.C18343aa.m44565a(r9)     // Catch:{ all -> 0x00d5 }
            r11 = 12
            byte[] r12 = new byte[r11]     // Catch:{ all -> 0x00d5 }
            int r13 = r6.read(r12, r5, r11)     // Catch:{ all -> 0x00d5 }
            if (r13 != r11) goto L_0x0097
            java.lang.String r11 = "RIFF"
            java.lang.String r13 = new java.lang.String     // Catch:{ all -> 0x00d5 }
            java.lang.String r14 = "US-ASCII"
            r15 = 4
            r13.<init>(r12, r5, r15, r14)     // Catch:{ all -> 0x00d5 }
            boolean r11 = r11.equals(r13)     // Catch:{ all -> 0x00d5 }
            if (r11 == 0) goto L_0x0097
            java.lang.String r11 = "WEBP"
            java.lang.String r13 = new java.lang.String     // Catch:{ all -> 0x00d5 }
            r14 = 8
            java.lang.String r4 = "US-ASCII"
            r13.<init>(r12, r14, r15, r4)     // Catch:{ all -> 0x00d5 }
            boolean r4 = r11.equals(r13)     // Catch:{ all -> 0x00d5 }
            if (r4 == 0) goto L_0x0097
            r4 = 1
            goto L_0x0098
        L_0x0097:
            r4 = 0
        L_0x0098:
            r6.mo36837a(r7)     // Catch:{ all -> 0x00d5 }
            if (r4 == 0) goto L_0x00b4
            byte[] r2 = com.squareup.p1094a.C18356aj.m44603b(r6)     // Catch:{ all -> 0x00d5 }
            if (r10 == 0) goto L_0x00ae
            int r4 = r2.length     // Catch:{ all -> 0x00d5 }
            android.graphics.BitmapFactory.decodeByteArray(r2, r5, r4, r9)     // Catch:{ all -> 0x00d5 }
            int r4 = r0.f50846h     // Catch:{ all -> 0x00d5 }
            int r6 = r0.f50847i     // Catch:{ all -> 0x00d5 }
            com.squareup.p1094a.C18343aa.m44564a(r4, r6, r9, r0)     // Catch:{ all -> 0x00d5 }
        L_0x00ae:
            int r0 = r2.length     // Catch:{ all -> 0x00d5 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r2, r5, r0, r9)     // Catch:{ all -> 0x00d5 }
            goto L_0x00c9
        L_0x00b4:
            if (r10 == 0) goto L_0x00c3
            android.graphics.BitmapFactory.decodeStream(r6, r2, r9)     // Catch:{ all -> 0x00d5 }
            int r4 = r0.f50846h     // Catch:{ all -> 0x00d5 }
            int r10 = r0.f50847i     // Catch:{ all -> 0x00d5 }
            com.squareup.p1094a.C18343aa.m44564a(r4, r10, r9, r0)     // Catch:{ all -> 0x00d5 }
            r6.mo36837a(r7)     // Catch:{ all -> 0x00d5 }
        L_0x00c3:
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r6, r2, r9)     // Catch:{ all -> 0x00d5 }
            if (r0 == 0) goto L_0x00cd
        L_0x00c9:
            com.squareup.p1094a.C18356aj.m44599a(r3)
            goto L_0x00da
        L_0x00cd:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00d5 }
            java.lang.String r2 = "Failed to decode stream."
            r0.<init>(r2)     // Catch:{ all -> 0x00d5 }
            throw r0     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r0 = move-exception
            com.squareup.p1094a.C18356aj.m44599a(r3)
            throw r0
        L_0x00da:
            if (r0 == 0) goto L_0x021e
            com.squareup.a.v r2 = r1.f50710b
            boolean r2 = r2.f50806m
            if (r2 == 0) goto L_0x00e7
            com.squareup.a.y r2 = r1.f50715g
            r2.mo36869a()
        L_0x00e7:
            com.squareup.a.ac r2 = r1.f50713e
            r3 = 2
            r2.mo36792a(r0, r3)
            com.squareup.a.y r2 = r1.f50715g
            boolean r4 = r2.mo36872d()
            if (r4 != 0) goto L_0x00ff
            boolean r2 = r2.mo36873e()
            if (r2 == 0) goto L_0x00fc
            goto L_0x00ff
        L_0x00fc:
            r16 = 0
            goto L_0x0101
        L_0x00ff:
            r16 = 1
        L_0x0101:
            if (r16 != 0) goto L_0x0107
            int r2 = r1.f50725q
            if (r2 == 0) goto L_0x021e
        L_0x0107:
            java.lang.Object r2 = f50705t
            monitor-enter(r2)
            com.squareup.a.y r4 = r1.f50715g     // Catch:{ all -> 0x021b }
            boolean r4 = r4.mo36872d()     // Catch:{ all -> 0x021b }
            if (r4 != 0) goto L_0x0116
            int r4 = r1.f50725q     // Catch:{ all -> 0x021b }
            if (r4 == 0) goto L_0x01f6
        L_0x0116:
            com.squareup.a.y r4 = r1.f50715g     // Catch:{ all -> 0x021b }
            int r6 = r1.f50725q     // Catch:{ all -> 0x021b }
            int r7 = r0.getWidth()     // Catch:{ all -> 0x021b }
            int r8 = r0.getHeight()     // Catch:{ all -> 0x021b }
            boolean r9 = r4.f50850l     // Catch:{ all -> 0x021b }
            android.graphics.Matrix r10 = new android.graphics.Matrix     // Catch:{ all -> 0x021b }
            r10.<init>()     // Catch:{ all -> 0x021b }
            boolean r11 = r4.mo36872d()     // Catch:{ all -> 0x021b }
            if (r11 == 0) goto L_0x01d2
            int r11 = r4.f50846h     // Catch:{ all -> 0x021b }
            int r12 = r4.f50847i     // Catch:{ all -> 0x021b }
            float r13 = r4.f50851m     // Catch:{ all -> 0x021b }
            r14 = 0
            int r14 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r14 == 0) goto L_0x0149
            boolean r14 = r4.f50854p     // Catch:{ all -> 0x021b }
            if (r14 == 0) goto L_0x0146
            float r14 = r4.f50852n     // Catch:{ all -> 0x021b }
            float r15 = r4.f50853o     // Catch:{ all -> 0x021b }
            r10.setRotate(r13, r14, r15)     // Catch:{ all -> 0x021b }
            goto L_0x0149
        L_0x0146:
            r10.setRotate(r13)     // Catch:{ all -> 0x021b }
        L_0x0149:
            boolean r13 = r4.f50848j     // Catch:{ all -> 0x021b }
            if (r13 == 0) goto L_0x0195
            float r4 = (float) r11     // Catch:{ all -> 0x021b }
            float r13 = (float) r7     // Catch:{ all -> 0x021b }
            float r14 = r4 / r13
            float r15 = (float) r12     // Catch:{ all -> 0x021b }
            float r5 = (float) r8     // Catch:{ all -> 0x021b }
            float r16 = r15 / r5
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x0171
            float r16 = r16 / r14
            float r5 = r5 * r16
            double r4 = (double) r5     // Catch:{ all -> 0x021b }
            double r4 = java.lang.Math.ceil(r4)     // Catch:{ all -> 0x021b }
            int r4 = (int) r4     // Catch:{ all -> 0x021b }
            int r5 = r8 - r4
            int r5 = r5 / r3
            float r3 = (float) r4     // Catch:{ all -> 0x021b }
            float r16 = r15 / r3
            r13 = r4
            r17 = r5
            r4 = r7
            r3 = r16
            r5 = 0
            goto L_0x0189
        L_0x0171:
            float r14 = r14 / r16
            float r13 = r13 * r14
            double r13 = (double) r13     // Catch:{ all -> 0x021b }
            double r13 = java.lang.Math.ceil(r13)     // Catch:{ all -> 0x021b }
            int r5 = (int) r13     // Catch:{ all -> 0x021b }
            int r13 = r7 - r5
            int r3 = r13 / 2
            float r13 = (float) r5     // Catch:{ all -> 0x021b }
            float r14 = r4 / r13
            r4 = r5
            r13 = r8
            r17 = 0
            r5 = r3
            r3 = r16
        L_0x0189:
            boolean r7 = m44610a(r9, r7, r8, r11, r12)     // Catch:{ all -> 0x021b }
            if (r7 == 0) goto L_0x0192
            r10.preScale(r14, r3)     // Catch:{ all -> 0x021b }
        L_0x0192:
            r7 = r4
            r8 = r13
            goto L_0x01d5
        L_0x0195:
            boolean r3 = r4.f50849k     // Catch:{ all -> 0x021b }
            if (r3 == 0) goto L_0x01af
            float r3 = (float) r11     // Catch:{ all -> 0x021b }
            float r4 = (float) r7     // Catch:{ all -> 0x021b }
            float r3 = r3 / r4
            float r4 = (float) r12     // Catch:{ all -> 0x021b }
            float r5 = (float) r8     // Catch:{ all -> 0x021b }
            float r4 = r4 / r5
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x01a4
            goto L_0x01a5
        L_0x01a4:
            r3 = r4
        L_0x01a5:
            boolean r4 = m44610a(r9, r7, r8, r11, r12)     // Catch:{ all -> 0x021b }
            if (r4 == 0) goto L_0x01d2
            r10.preScale(r3, r3)     // Catch:{ all -> 0x021b }
            goto L_0x01d2
        L_0x01af:
            if (r11 != 0) goto L_0x01b3
            if (r12 == 0) goto L_0x01d2
        L_0x01b3:
            if (r11 != r7) goto L_0x01b7
            if (r12 == r8) goto L_0x01d2
        L_0x01b7:
            if (r11 == 0) goto L_0x01bd
            float r3 = (float) r11     // Catch:{ all -> 0x021b }
            float r4 = (float) r7     // Catch:{ all -> 0x021b }
        L_0x01bb:
            float r3 = r3 / r4
            goto L_0x01c0
        L_0x01bd:
            float r3 = (float) r12     // Catch:{ all -> 0x021b }
            float r4 = (float) r8     // Catch:{ all -> 0x021b }
            goto L_0x01bb
        L_0x01c0:
            if (r12 == 0) goto L_0x01c6
            float r4 = (float) r12     // Catch:{ all -> 0x021b }
            float r5 = (float) r8     // Catch:{ all -> 0x021b }
        L_0x01c4:
            float r4 = r4 / r5
            goto L_0x01c9
        L_0x01c6:
            float r4 = (float) r11     // Catch:{ all -> 0x021b }
            float r5 = (float) r7     // Catch:{ all -> 0x021b }
            goto L_0x01c4
        L_0x01c9:
            boolean r5 = m44610a(r9, r7, r8, r11, r12)     // Catch:{ all -> 0x021b }
            if (r5 == 0) goto L_0x01d2
            r10.preScale(r3, r4)     // Catch:{ all -> 0x021b }
        L_0x01d2:
            r5 = 0
            r17 = 0
        L_0x01d5:
            if (r6 == 0) goto L_0x01db
            float r3 = (float) r6     // Catch:{ all -> 0x021b }
            r10.preRotate(r3)     // Catch:{ all -> 0x021b }
        L_0x01db:
            r3 = 1
            r4 = r0
            r6 = r17
            r9 = r10
            r10 = r3
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x021b }
            if (r3 == r0) goto L_0x01eb
            r0.recycle()     // Catch:{ all -> 0x021b }
            r0 = r3
        L_0x01eb:
            com.squareup.a.v r3 = r1.f50710b     // Catch:{ all -> 0x021b }
            boolean r3 = r3.f50806m     // Catch:{ all -> 0x021b }
            if (r3 == 0) goto L_0x01f6
            com.squareup.a.y r3 = r1.f50715g     // Catch:{ all -> 0x021b }
            r3.mo36869a()     // Catch:{ all -> 0x021b }
        L_0x01f6:
            com.squareup.a.y r3 = r1.f50715g     // Catch:{ all -> 0x021b }
            boolean r3 = r3.mo36873e()     // Catch:{ all -> 0x021b }
            if (r3 == 0) goto L_0x0211
            com.squareup.a.y r3 = r1.f50715g     // Catch:{ all -> 0x021b }
            java.util.List<com.squareup.a.ag> r3 = r3.f50845g     // Catch:{ all -> 0x021b }
            android.graphics.Bitmap r0 = m44608a(r3, r0)     // Catch:{ all -> 0x021b }
            com.squareup.a.v r3 = r1.f50710b     // Catch:{ all -> 0x021b }
            boolean r3 = r3.f50806m     // Catch:{ all -> 0x021b }
            if (r3 == 0) goto L_0x0211
            com.squareup.a.y r3 = r1.f50715g     // Catch:{ all -> 0x021b }
            r3.mo36869a()     // Catch:{ all -> 0x021b }
        L_0x0211:
            monitor-exit(r2)     // Catch:{ all -> 0x021b }
            if (r0 == 0) goto L_0x021e
            com.squareup.a.ac r2 = r1.f50713e
            r3 = 3
            r2.mo36792a(r0, r3)
            goto L_0x021e
        L_0x021b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x021b }
            throw r0
        L_0x021e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.p1094a.C18362c.m44611c():android.graphics.Bitmap");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo36805a(C18341a aVar) {
        boolean z = this.f50710b.f50806m;
        C18409y yVar = aVar.f50650b;
        if (this.f50719k == null) {
            this.f50719k = aVar;
            if (z) {
                if (this.f50720l == null || this.f50720l.isEmpty()) {
                    yVar.mo36869a();
                    return;
                } else {
                    yVar.mo36869a();
                    C18356aj.m44594a(this, "to ");
                }
            }
            return;
        }
        if (this.f50720l == null) {
            this.f50720l = new ArrayList(3);
        }
        this.f50720l.add(aVar);
        if (z) {
            yVar.mo36869a();
            C18356aj.m44594a(this, "to ");
        }
        C18403e d = aVar.mo36785d();
        if (d.ordinal() > this.f50727s.ordinal()) {
            this.f50727s = d;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo36807b(C18341a aVar) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (this.f50719k == aVar) {
            this.f50719k = null;
            z = true;
        } else if (this.f50720l != null) {
            z = this.f50720l.remove(aVar);
        } else {
            z = false;
        }
        if (z && aVar.mo36785d() == this.f50727s) {
            C18403e eVar = C18403e.LOW;
            if (this.f50720l == null || this.f50720l.isEmpty()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.f50719k == null && !z2) {
                z3 = false;
            }
            if (z3) {
                if (this.f50719k != null) {
                    eVar = this.f50719k.mo36785d();
                }
                if (z2) {
                    int size = this.f50720l.size();
                    for (int i = 0; i < size; i++) {
                        C18403e d = ((C18341a) this.f50720l.get(i)).mo36785d();
                        if (d.ordinal() > eVar.ordinal()) {
                            eVar = d;
                        }
                    }
                }
            }
            this.f50727s = eVar;
        }
        if (this.f50710b.f50806m) {
            aVar.f50650b.mo36869a();
            C18356aj.m44594a(this, "from ");
        }
    }

    /* renamed from: a */
    private static Bitmap m44608a(List<C18352ag> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            final C18352ag agVar = (C18352ag) list.get(i);
            try {
                Bitmap a = agVar.mo36798a(bitmap);
                if (a == null) {
                    final StringBuilder sb = new StringBuilder("Transformation ");
                    sb.append(agVar.mo36799a());
                    sb.append(" returned null after ");
                    sb.append(i);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (C18352ag a2 : list) {
                        sb.append(a2.mo36799a());
                        sb.append(10);
                    }
                    C18396v.f50794a.post(new Runnable() {
                        public final void run() {
                            throw new NullPointerException(sb.toString());
                        }
                    });
                    return null;
                } else if (a == bitmap && bitmap.isRecycled()) {
                    C18396v.f50794a.post(new Runnable() {
                        public final void run() {
                            StringBuilder sb = new StringBuilder("Transformation ");
                            sb.append(agVar.mo36799a());
                            sb.append(" returned input Bitmap but recycled it.");
                            throw new IllegalStateException(sb.toString());
                        }
                    });
                    return null;
                } else if (a == bitmap || bitmap.isRecycled()) {
                    i++;
                    bitmap = a;
                } else {
                    C18396v.f50794a.post(new Runnable() {
                        public final void run() {
                            StringBuilder sb = new StringBuilder("Transformation ");
                            sb.append(agVar.mo36799a());
                            sb.append(" mutated input Bitmap but failed to recycle the original.");
                            throw new IllegalStateException(sb.toString());
                        }
                    });
                    return null;
                }
            } catch (RuntimeException e) {
                C18396v.f50794a.post(new Runnable() {
                    public final void run() {
                        StringBuilder sb = new StringBuilder("Transformation ");
                        sb.append(agVar.mo36799a());
                        sb.append(" crashed with exception.");
                        throw new RuntimeException(sb.toString(), e);
                    }
                });
                return null;
            }
        }
        return bitmap;
    }

    /* renamed from: a */
    static C18362c m44609a(C18396v vVar, C18375i iVar, C18369d dVar, C18346ac acVar, C18341a aVar) {
        C18409y yVar = aVar.f50650b;
        List<C18343aa> list = vVar.f50796c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C18343aa aaVar = (C18343aa) list.get(i);
            if (aaVar.mo36788a(yVar)) {
                C18362c cVar = new C18362c(vVar, iVar, dVar, acVar, aVar, aaVar);
                return cVar;
            }
        }
        C18362c cVar2 = new C18362c(vVar, iVar, dVar, acVar, aVar, f50708w);
        return cVar2;
    }

    private C18362c(C18396v vVar, C18375i iVar, C18369d dVar, C18346ac acVar, C18341a aVar, C18343aa aaVar) {
        this.f50710b = vVar;
        this.f50711c = iVar;
        this.f50712d = dVar;
        this.f50713e = acVar;
        this.f50719k = aVar;
        this.f50714f = aVar.f50657i;
        this.f50715g = aVar.f50650b;
        this.f50727s = aVar.mo36785d();
        this.f50716h = aVar.f50653e;
        this.f50717i = aVar.f50654f;
        this.f50718j = aaVar;
        this.f50726r = aaVar.mo36786a();
    }
}
