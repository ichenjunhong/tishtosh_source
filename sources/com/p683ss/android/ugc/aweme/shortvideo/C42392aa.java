package com.p683ss.android.ugc.aweme.shortvideo;

import com.C2240a;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45244ac;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45302i.C45303a;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45302i.C45304b;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45302i.C45305c;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45306j;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45311o;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45311o.C45312a;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45313p;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45316s;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45319v;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45324z;
import com.p683ss.android.ugc.aweme.shortvideo.upload.p2248c.C45288a;
import com.p683ss.android.ugc.aweme.utils.C47858ep;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.tools.utils.C50203g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.aa */
public final class C42392aa implements C45311o {

    /* renamed from: a */
    public final Lock f107203a = new ReentrantLock();

    /* renamed from: b */
    public final Condition f107204b = this.f107203a.newCondition();

    /* renamed from: c */
    public final Lock f107205c = new ReentrantLock();

    /* renamed from: d */
    public final Condition f107206d = this.f107205c.newCondition();

    /* renamed from: e */
    public C45316s f107207e = new C45316s();

    /* renamed from: f */
    public RandomAccessFile f107208f;

    /* renamed from: g */
    public volatile int f107209g = 0;

    /* renamed from: h */
    public volatile boolean f107210h;

    /* renamed from: i */
    public volatile C45305c f107211i;

    /* renamed from: j */
    public C45312a f107212j;

    /* renamed from: k */
    public LinkedList<C45244ac> f107213k = new LinkedList<>();

    /* renamed from: l */
    public File f107214l;

    /* renamed from: m */
    public int f107215m = 0;

    /* renamed from: n */
    public String f107216n;

    /* renamed from: o */
    private final boolean f107217o;

    /* renamed from: p */
    private C45288a<Long> f107218p = new C45288a<>(Long.valueOf(-1));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.aa$a */
    class C42394a implements C45313p {

        /* renamed from: a */
        public volatile int f107220a;

        /* renamed from: b */
        public Exception f107221b;

        /* renamed from: c */
        public volatile C45303a f107222c;

        /* renamed from: e */
        private int f107224e;

        /* renamed from: f */
        private volatile int f107225f;

        /* renamed from: g */
        private byte[] f107226g;

        /* renamed from: a */
        public final void mo86490a() {
            C45244ac acVar;
            C45244ac acVar2;
            boolean z;
            String str;
            int i;
            Iterator it = C42392aa.this.f107213k.iterator();
            while (true) {
                acVar = null;
                if (!it.hasNext()) {
                    acVar2 = null;
                    break;
                }
                acVar2 = (C45244ac) it.next();
                if (this.f107224e == acVar2.f114434a) {
                    break;
                }
            }
            if (acVar2 != null) {
                acVar = acVar2;
            } else {
                if (C42392aa.this.f107213k.isEmpty()) {
                    C42392aa.this.mo86486b("[SliceConsume] createSliceIfNeed mMp4HeaderSize:%d", Integer.valueOf(C42392aa.this.f107209g));
                    if (C42392aa.this.f107209g > 0) {
                        i = C42392aa.this.f107209g;
                    }
                } else {
                    i = ((C45244ac) C42392aa.this.f107213k.getLast()).mo91531a();
                    if (C42392aa.this.f107210h) {
                        if (this.f107224e == 0) {
                            this.f107225f = C42392aa.this.f107209g;
                        } else if (((long) i) >= C42392aa.this.f107214l.length()) {
                            this.f107225f = 0;
                        }
                        i = 0;
                    }
                }
                acVar = new C45244ac(this.f107224e, i, this.f107225f);
            }
            if (acVar == null) {
                C42392aa.this.mo86486b("[SliceConsume] sliceModel=null consume wait", new Object[0]);
                this.f107222c = C45303a.CONSUME_WAIT_DATA;
                return;
            }
            long length = C42392aa.this.f107214l.length();
            if (length == 0) {
                C42392aa aaVar = C42392aa.this;
                StringBuilder sb = new StringBuilder("parallel_upload_file_delete_on_consume OutputFileLength:");
                sb.append(length);
                sb.append(" UploadStatus:");
                sb.append(C42392aa.this.f107211i);
                aaVar.mo86486b(sb.toString(), new Object[0]);
                String str2 = "parallel_upload_file_delete_on_consume";
                C42437ay a = new C42437ay().mo86520a("OutputFileLength", Long.valueOf(length));
                String str3 = "UploadStatus";
                if (C42392aa.this.f107211i == null) {
                    str = TEVideoRecorder.FACE_BEAUTY_NULL;
                } else {
                    str = C42392aa.this.f107211i.toString();
                }
                C23569o.m57779a(str2, a.mo86521a(str3, str).mo86522b());
            }
            try {
                if (((long) acVar.mo91531a()) > C42392aa.this.f107214l.length()) {
                    if (!C42392aa.this.f107210h) {
                        this.f107222c = C45303a.CONSUME_WAIT_DATA;
                        return;
                    }
                    acVar.f114436c = ((int) C42392aa.this.f107214l.length()) - acVar.f114435b;
                }
                this.f107220a = acVar.f114436c;
                C42392aa.this.f107208f.seek((long) acVar.f114435b);
                if (acVar.f114436c < 0) {
                    StringBuilder sb2 = new StringBuilder("ArrayIndexOutOfBoundsException sliceModel.getOffset():");
                    sb2.append(acVar.f114435b);
                    sb2.append("  mOutputFile.length():");
                    sb2.append(C42392aa.this.f107214l.length());
                    C32458a.m75148a((Throwable) new Exception(sb2.toString()));
                    m93153a(C45303a.CONSUME_FAIL);
                    return;
                }
                C42392aa.this.f107208f.read(this.f107226g, 0, acVar.f114436c);
                C42392aa.this.f107213k.add(acVar);
                if (acVar.f114435b == 0 && acVar.f114436c == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    m93153a(C45303a.CONSUME_END);
                } else {
                    m93153a(C45303a.CONSUME_DONE);
                }
                C42392aa.this.mo86482a("consume execute %d-%d", Integer.valueOf(acVar.f114435b), Integer.valueOf(acVar.mo91531a()));
                C42392aa.this.mo86486b("consume execute %d-%d", Integer.valueOf(acVar.f114435b), Integer.valueOf(acVar.mo91531a()));
            } catch (IOException e) {
                this.f107221b = e;
                m93153a(C45303a.CONSUME_FAIL);
            }
        }

        /* renamed from: a */
        private void m93153a(C45303a aVar) {
            C42392aa.this.f107205c.lock();
            this.f107222c = aVar;
            C42392aa.this.f107206d.signalAll();
            C42392aa.this.f107205c.unlock();
        }

        private C42394a(int i, byte[] bArr, int i2) {
            this.f107224e = i;
            this.f107226g = bArr;
            this.f107225f = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.aa$b */
    class C42395b implements C45313p {

        /* renamed from: b */
        private C45319v f107228b;

        /* renamed from: a */
        public final void mo86490a() {
            C42392aa.this.f107205c.lock();
            C42392aa.this.f107206d.signalAll();
            C42392aa.this.f107205c.unlock();
            if (C42392aa.this.f107212j != null) {
                C42392aa.this.f107212j.mo86504a(this.f107228b);
            }
            C42392aa.this.f107203a.lock();
            C42392aa.this.f107204b.signalAll();
            C42392aa.this.f107203a.unlock();
            try {
                C42392aa.this.f107208f.close();
                C42392aa.this.mo86486b("raf.close();", new Object[0]);
            } catch (IOException e) {
                C42392aa aaVar = C42392aa.this;
                StringBuilder sb = new StringBuilder("raf.close() ");
                sb.append(e.getMessage());
                aaVar.mo86486b(sb.toString(), new Object[0]);
            }
            if (C42392aa.this.f107214l.exists()) {
                C42392aa.this.f107214l.delete();
            }
            C42392aa.this.f107207e.f114571a.quit();
        }

        public C42395b(C45319v vVar) {
            this.f107228b = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.aa$c */
    class C42396c implements C45313p {

        /* renamed from: a */
        public volatile C45304b f107229a;

        /* renamed from: a */
        public final void mo86490a() {
            if (C42392aa.this.f107209g > 0) {
                C45304b bVar = C45304b.GET_HEADER_SIZE_DONE;
                C42392aa.this.f107205c.lock();
                this.f107229a = bVar;
                C42392aa.this.f107206d.signalAll();
                C42392aa.this.f107205c.unlock();
                return;
            }
            this.f107229a = C45304b.GET_HEADER_SIZE_WAIT;
        }

        private C42396c() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.aa$d */
    class C42397d implements C45313p {

        /* renamed from: a */
        public volatile Exception f107231a;

        /* renamed from: c */
        private byte[] f107233c;

        /* renamed from: d */
        private int f107234d;

        /* renamed from: e */
        private int f107235e;

        /* renamed from: a */
        public final void mo86490a() {
            try {
                if (C42392aa.this.f107208f.length() == 0) {
                    C42392aa.this.f107209g = this.f107234d;
                    C42392aa.this.mo86486b("Produce on empty file, mMp4HeaderSize:%d", Integer.valueOf(C42392aa.this.f107209g));
                    if (this.f107234d == 0) {
                        C47858ep.m103508a(C42392aa.this.f107216n, 100102);
                    }
                    C23569o.m57776a("parallel_upload_ve_compile_first_offset", this.f107234d, (JSONObject) null);
                    C42392aa.this.f107208f.write(new byte[this.f107234d], 0, this.f107234d);
                }
                C42392aa.this.f107208f.seek((long) this.f107234d);
                C42392aa.this.f107208f.write(this.f107233c, 0, this.f107235e);
                C42392aa.this.mo86482a("write offset:%d size:%d", Integer.valueOf(this.f107234d), Integer.valueOf(this.f107235e));
            } catch (IOException e) {
                this.f107231a = e;
            }
            C42392aa.this.f107203a.lock();
            C42392aa.this.f107204b.signalAll();
            C42392aa.this.f107203a.unlock();
        }

        public C42397d(byte[] bArr, int i, int i2) {
            this.f107233c = bArr;
            this.f107234d = i;
            this.f107235e = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.aa$e */
    class C42398e implements C45313p {

        /* renamed from: a */
        public volatile int f107236a;

        /* renamed from: b */
        public Exception f107237b;

        /* renamed from: c */
        public volatile C45303a f107238c;

        /* renamed from: e */
        private final long f107240e;

        /* renamed from: f */
        private final byte[] f107241f;

        /* renamed from: g */
        private final long f107242g;

        /* renamed from: h */
        private final long f107243h;

        /* renamed from: a */
        public final void mo86490a() {
            int length = (int) C42392aa.this.f107214l.length();
            if (!C42392aa.this.f107210h) {
                if (this.f107242g > ((long) length)) {
                    this.f107238c = C45303a.CONSUME_WAIT_DATA;
                } else {
                    m93158a(length);
                }
            } else if (this.f107240e < ((long) length)) {
                m93158a(length);
            } else {
                m93159a(C45303a.CONSUME_END);
            }
        }

        /* renamed from: a */
        private void m93159a(C45303a aVar) {
            C42392aa.this.f107205c.lock();
            this.f107238c = aVar;
            C42392aa.this.f107206d.signalAll();
            C42392aa.this.f107205c.unlock();
        }

        /* renamed from: b */
        private int m93160b(int i) {
            long min = Math.min(this.f107243h, (long) i) - this.f107240e;
            if (min > 16) {
                min -= min % 16;
            }
            return (int) min;
        }

        /* renamed from: a */
        private void m93158a(int i) {
            this.f107236a = m93160b(i);
            try {
                C42392aa.this.f107208f.seek(this.f107240e);
                C42392aa.this.f107208f.read(this.f107241f, 0, this.f107236a);
                m93159a(C45303a.CONSUME_DONE);
            } catch (IOException e) {
                this.f107237b = e;
                m93159a(C45303a.CONSUME_FAIL);
            }
        }

        private C42398e(long j, byte[] bArr, int i, int i2) {
            this.f107240e = j;
            this.f107241f = bArr;
            this.f107243h = ((long) i) + j;
            this.f107242g = j + ((long) i2);
        }
    }

    /* renamed from: c */
    public final boolean mo86487c() {
        return this.f107210h;
    }

    /* renamed from: d */
    public final long mo86488d() {
        return ((Long) this.f107218p.f114522a).longValue();
    }

    /* renamed from: e */
    public final long mo86489e() {
        if (this.f107210h) {
            return this.f107214l.length();
        }
        return -1;
    }

    /* renamed from: g */
    private int m93139g() {
        if (C45305c.UPLOAD_FINISH.equals(this.f107211i)) {
            return -1;
        }
        if (C45305c.UPLOAD_CANCEL.equals(this.f107211i)) {
            return -2;
        }
        return 1;
    }

    /* renamed from: a */
    public final int mo86477a() {
        mo86482a("StartGetHeaderSize", new Object[0]);
        int f = m93138f();
        mo86482a("EndGetHeaderSize result:%d", Integer.valueOf(f));
        return f;
    }

    /* renamed from: b */
    public final void mo86485b() {
        StringBuilder sb = new StringBuilder("stop cancelUpload, currentStatus:");
        sb.append(this.f107211i);
        mo86486b(sb.toString(), new Object[0]);
        if (this.f107211i == C45305c.UPLOADING) {
            this.f107211i = C45305c.UPLOAD_CANCEL;
            try {
                this.f107207e.mo91596a(new C42395b(C45319v.CANCEL));
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: f */
    private int m93138f() {
        boolean await;
        boolean z;
        int g = m93139g();
        if (g < 0) {
            return g;
        }
        if (this.f107209g > 0) {
            return this.f107209g;
        }
        C42396c cVar = new C42396c();
        this.f107205c.lock();
        do {
            try {
                this.f107207e.mo91596a(cVar);
                do {
                    await = this.f107206d.await(30, TimeUnit.SECONDS);
                    if (cVar.f107229a != null) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                } while (!z);
                if (await) {
                    int g2 = m93139g();
                    if (g2 < 0) {
                        this.f107205c.unlock();
                        return g2;
                    }
                } else {
                    this.f107215m = -1;
                    throw new C45306j("upload timeout");
                }
            } catch (InterruptedException e) {
                throw new C45306j((Throwable) e);
            } catch (Throwable th) {
                this.f107205c.unlock();
                throw th;
            }
        } while (cVar.f107229a == C45304b.GET_HEADER_SIZE_WAIT);
        this.f107205c.unlock();
        if (this.f107209g <= 0) {
            return -1;
        }
        return this.f107209g;
    }

    /* renamed from: a */
    public final void mo86481a(C45312a aVar) {
        this.f107212j = aVar;
    }

    /* renamed from: a */
    public final void mo86483a(boolean z) {
        C45319v vVar;
        StringBuilder sb = new StringBuilder("stop stopUpload, currentStatus:");
        sb.append(this.f107211i);
        mo86486b(sb.toString(), new Object[0]);
        if (this.f107211i == C45305c.UPLOADING) {
            this.f107211i = C45305c.UPLOAD_FINISH;
            try {
                C45316s sVar = this.f107207e;
                if (z) {
                    vVar = C45319v.SUCCESS;
                } else {
                    vVar = C45319v.FAILED;
                }
                sVar.mo91596a(new C42395b(vVar));
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: c */
    private void m93137c(String str, Object... objArr) {
        m93133a(true, true, str, objArr);
    }

    /* renamed from: a */
    public final void mo86482a(String str, Object... objArr) {
        m93133a(true, false, str, objArr);
    }

    /* renamed from: b */
    public final void mo86486b(String str, Object... objArr) {
        m93133a(false, true, str, objArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x005c A[SYNTHETIC, Splitter:B:26:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0062 A[SYNTHETIC, Splitter:B:32:0x0062] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long m93136b(long r15, long r17) {
        /*
            r14 = this;
            r1 = r14
            r2 = r15
            int r0 = r14.m93139g()
            if (r0 >= 0) goto L_0x000a
            long r2 = (long) r0
            return r2
        L_0x000a:
            java.io.File r0 = r1.f107214l
            long r4 = r0.length()
            int r0 = (int) r4
            long r4 = (long) r0
            long r6 = r2 + r17
            r8 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x001b
            return r8
        L_0x001b:
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            r4 = 0
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0060, all -> 0x0058 }
            java.io.File r6 = r1.f107214l     // Catch:{ IOException -> 0x0060, all -> 0x0058 }
            java.lang.String r7 = "r"
            r5.<init>(r6, r7)     // Catch:{ IOException -> 0x0060, all -> 0x0058 }
            r5.seek(r2)     // Catch:{ IOException -> 0x0056, all -> 0x0054 }
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r3 = new byte[r2]     // Catch:{ IOException -> 0x0056, all -> 0x0054 }
            r6 = 0
            r10 = r6
        L_0x0034:
            int r4 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r4 >= 0) goto L_0x004c
            r5.read(r3)     // Catch:{ IOException -> 0x0056, all -> 0x0054 }
            r12 = 2048(0x800, double:1.0118E-320)
            long r10 = r10 + r12
            r4 = 0
            long r12 = r10 - r17
            long r12 = java.lang.Math.max(r6, r12)     // Catch:{ IOException -> 0x0056, all -> 0x0054 }
            int r12 = (int) r12     // Catch:{ IOException -> 0x0056, all -> 0x0054 }
            int r12 = 2048 - r12
            r0.update(r3, r4, r12)     // Catch:{ IOException -> 0x0056, all -> 0x0054 }
            goto L_0x0034
        L_0x004c:
            long r2 = r0.getValue()     // Catch:{ IOException -> 0x0056, all -> 0x0054 }
            r5.close()     // Catch:{ IOException -> 0x0053 }
        L_0x0053:
            return r2
        L_0x0054:
            r0 = move-exception
            goto L_0x005a
        L_0x0056:
            r4 = r5
            goto L_0x0060
        L_0x0058:
            r0 = move-exception
            r5 = r4
        L_0x005a:
            if (r5 == 0) goto L_0x005f
            r5.close()     // Catch:{ IOException -> 0x005f }
        L_0x005f:
            throw r0
        L_0x0060:
            if (r4 == 0) goto L_0x0065
            r4.close()     // Catch:{ IOException -> 0x0065 }
        L_0x0065:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.C42392aa.m93136b(long, long):long");
    }

    public C42392aa(String str, String str2) {
        this.f107214l = new File(str);
        this.f107216n = str2;
        this.f107211i = C45305c.UPLOADING;
        try {
            C48016e.m103954e(this.f107214l.getParent());
            new File(this.f107214l.getParent()).mkdirs();
            this.f107214l.createNewFile();
            this.f107208f = new RandomAccessFile(this.f107214l, "rw");
            this.f107217o = C39618d.f101152P.mo83103a(C40790a.EnablePublishDetailALog);
        } catch (FileNotFoundException e) {
            throw new C45306j((Throwable) e);
        } catch (IOException e2) {
            throw new C45306j((Throwable) e2);
        }
    }

    /* renamed from: a */
    public final long mo86480a(long j, long j2) {
        long b = m93136b(j, j2);
        mo86482a("GetCrc32 offset:%d length:%d result:%d", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(b));
        return b;
    }

    /* renamed from: a */
    public final int mo86478a(int i, byte[] bArr, int i2) {
        m93137c("StartSliceConsume sliceId:%d size:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (this.f107213k == null || this.f107213k.isEmpty()) {
            this.f107218p.mo91548a(Long.valueOf(0));
        } else {
            this.f107218p.mo91548a(Long.valueOf((long) ((C45244ac) this.f107213k.getLast()).mo91531a()));
        }
        int b = m93134b(i, bArr, i2);
        m93137c("EndSliceConsume sliceId:%d size:%d result:%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(b));
        return b;
    }

    /* renamed from: b */
    private int m93134b(int i, byte[] bArr, int i2) {
        boolean await;
        boolean z;
        int g = m93139g();
        if (g < 0) {
            return g;
        }
        C42394a aVar = new C42394a(i, bArr, i2);
        this.f107205c.lock();
        do {
            try {
                aVar.f107222c = null;
                this.f107207e.mo91596a(aVar);
                do {
                    await = this.f107206d.await(30, TimeUnit.SECONDS);
                    if (aVar.f107222c != null) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                } while (!z);
                if (await) {
                    int g2 = m93139g();
                    if (g2 < 0) {
                        this.f107205c.unlock();
                        return g2;
                    }
                } else {
                    this.f107215m = -1;
                    throw new C45306j("upload timeout");
                }
            } catch (InterruptedException e) {
                throw new C45306j((Throwable) e);
            } catch (Throwable th) {
                this.f107205c.unlock();
                throw th;
            }
        } while (aVar.f107222c == C45303a.CONSUME_WAIT_DATA);
        this.f107205c.unlock();
        switch (aVar.f107222c) {
            case CONSUME_FAIL:
                throw new C45306j((Throwable) aVar.f107221b);
            case CONSUME_END:
                return 0;
            default:
                return aVar.f107220a;
        }
    }

    /* renamed from: a */
    private void m93133a(boolean z, boolean z2, String str, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(C2240a.m6773a(Locale.US, str, objArr));
        sb.append(" hash:");
        sb.append(hashCode());
        String sb2 = sb.toString();
        if (z2) {
            StringBuilder sb3 = new StringBuilder("ConcurrentUploadByFile:");
            sb3.append(sb2);
            C50203g.m108358a(sb3.toString());
        }
        if (z) {
            C45324z.m98803a().mo91602a(sb2);
        }
    }

    /* renamed from: a */
    public final int mo86479a(long j, byte[] bArr, int i, int i2) {
        m93133a(true, this.f107217o, "StartStreamConsume offset:%d maxSize:%d minSize:%d", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2));
        this.f107218p.mo91548a(Long.valueOf(j));
        int b = m93135b(j, bArr, i, i2);
        m93133a(true, this.f107217o, "EndStreamConsume offset:%d maxSize:%d minSize:%d result:%d", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(b));
        return b;
    }

    /* renamed from: b */
    private int m93135b(long j, byte[] bArr, int i, int i2) {
        boolean await;
        boolean z;
        int g = m93139g();
        if (g < 0) {
            return g;
        }
        C42398e eVar = new C42398e(j, bArr, i, i2);
        this.f107205c.lock();
        do {
            try {
                eVar.f107238c = null;
                this.f107207e.mo91596a(eVar);
                do {
                    await = this.f107206d.await(30, TimeUnit.SECONDS);
                    if (eVar.f107238c != null) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                } while (!z);
                if (await) {
                    int g2 = m93139g();
                    if (g2 < 0) {
                        this.f107205c.unlock();
                        return g2;
                    }
                } else {
                    this.f107215m = -1;
                    throw new C45306j("upload timeout");
                }
            } catch (InterruptedException e) {
                throw new C45306j((Throwable) e);
            } catch (Throwable th) {
                this.f107205c.unlock();
                throw th;
            }
        } while (eVar.f107238c == C45303a.CONSUME_WAIT_DATA);
        this.f107205c.unlock();
        switch (eVar.f107238c) {
            case CONSUME_FAIL:
                throw new C45306j((Throwable) eVar.f107237b);
            case CONSUME_END:
                return 0;
            default:
                return eVar.f107236a;
        }
    }

    /* renamed from: a */
    public final void mo86484a(byte[] bArr, int i, int i2, boolean z) {
        mo86482a("produce offset:%d size:%d isFinish:%b", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
        if (m93139g() >= 0) {
            C42397d dVar = new C42397d(bArr, i, i2);
            this.f107203a.lock();
            try {
                this.f107207e.mo91596a(dVar);
                this.f107204b.await();
                if (dVar.f107231a == null) {
                    this.f107203a.unlock();
                    this.f107210h = z;
                    this.f107205c.lock();
                    this.f107206d.signalAll();
                    this.f107205c.unlock();
                    return;
                }
                throw new C45306j((Throwable) dVar.f107231a);
            } catch (InterruptedException e) {
                throw new C45306j((Throwable) e);
            } catch (Throwable th) {
                this.f107203a.unlock();
                throw th;
            }
        }
    }
}
