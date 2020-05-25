package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode.ThreadPolicy;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.soloader.m */
public abstract class C14689m extends C14669c {

    /* renamed from: a */
    private final Map<String, Object> f38067a = new HashMap();

    /* renamed from: f */
    protected final Context f38068f;

    /* renamed from: g */
    protected String f38069g;

    /* renamed from: h */
    public String[] f38070h;

    /* renamed from: com.facebook.soloader.m$a */
    public static class C14691a {

        /* renamed from: c */
        public final String f38077c;

        /* renamed from: d */
        public final String f38078d;

        public C14691a(String str, String str2) {
            this.f38077c = str;
            this.f38078d = str2;
        }
    }

    /* renamed from: com.facebook.soloader.m$b */
    public static final class C14692b {

        /* renamed from: a */
        public final C14691a[] f38079a;

        public C14692b(C14691a[] aVarArr) {
            this.f38079a = aVarArr;
        }

        /* renamed from: a */
        static final C14692b m30051a(DataInput dataInput) throws IOException {
            if (dataInput.readByte() == 1) {
                int readInt = dataInput.readInt();
                if (readInt >= 0) {
                    C14691a[] aVarArr = new C14691a[readInt];
                    for (int i = 0; i < readInt; i++) {
                        aVarArr[i] = new C14691a(dataInput.readUTF(), dataInput.readUTF());
                    }
                    return new C14692b(aVarArr);
                }
                throw new RuntimeException("illegal number of shared libraries");
            }
            throw new RuntimeException("wrong dso manifest version");
        }

        /* renamed from: a */
        public final void mo26958a(DataOutput dataOutput) throws IOException {
            dataOutput.writeByte(1);
            dataOutput.writeInt(this.f38079a.length);
            for (int i = 0; i < this.f38079a.length; i++) {
                dataOutput.writeUTF(this.f38079a[i].f38077c);
                dataOutput.writeUTF(this.f38079a[i].f38078d);
            }
        }
    }

    /* renamed from: com.facebook.soloader.m$c */
    protected static final class C14693c implements Closeable {

        /* renamed from: a */
        public final C14691a f38080a;

        /* renamed from: b */
        public final InputStream f38081b;

        public final void close() throws IOException {
            this.f38081b.close();
        }

        public C14693c(C14691a aVar, InputStream inputStream) {
            this.f38080a = aVar;
            this.f38081b = inputStream;
        }
    }

    /* renamed from: com.facebook.soloader.m$d */
    protected static abstract class C14694d implements Closeable {
        protected C14694d() {
        }

        /* renamed from: a */
        public abstract boolean mo26950a();

        /* renamed from: b */
        public abstract C14693c mo26951b() throws IOException;

        public void close() throws IOException {
        }
    }

    /* renamed from: com.facebook.soloader.m$e */
    protected static abstract class C14695e implements Closeable {
        protected C14695e() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract C14692b mo26948a() throws IOException;

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract C14694d mo26949b() throws IOException;

        public void close() throws IOException {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C14695e mo26940a() throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public byte[] mo26941b() throws IOException {
        Throwable th;
        Parcel obtain = Parcel.obtain();
        C14695e a = mo26940a();
        try {
            C14691a[] aVarArr = a.mo26948a().f38079a;
            obtain.writeByte(1);
            obtain.writeInt(aVarArr.length);
            for (int i = 0; i < aVarArr.length; i++) {
                obtain.writeString(aVarArr[i].f38077c);
                obtain.writeString(aVarArr[i].f38078d);
            }
            a.close();
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (Throwable th2) {
            C17840a.m43752a(th, th2);
        }
        throw th;
    }

    /* renamed from: b */
    private Object m30045b(String str) {
        Object obj;
        synchronized (this.f38067a) {
            obj = this.f38067a.get(str);
            if (obj == null) {
                obj = new Object();
                this.f38067a.put(str, obj);
            }
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo26956a(String str) throws IOException {
        synchronized (m30045b(str)) {
            this.f38069g = str;
            mo26944a(2);
        }
    }

    /* renamed from: a */
    private void m30043a(C14691a[] aVarArr) throws IOException {
        String[] list = this.f38048b.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
                    boolean z = false;
                    int i = 0;
                    while (!z && i < aVarArr.length) {
                        if (aVarArr[i].f38077c.equals(str)) {
                            z = true;
                        }
                        i++;
                    }
                    if (!z) {
                        C14686k.m30038a(new File(this.f38048b, str));
                    }
                }
            }
            return;
        }
        StringBuilder sb = new StringBuilder("unable to list directory ");
        sb.append(this.f38048b);
        throw new IOException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26944a(int i) throws IOException {
        File file = this.f38048b;
        if (file.mkdirs() || file.isDirectory()) {
            C14681g gVar = new C14681g(new File(this.f38048b, "dso_lock"));
            try {
                if (m30044a(gVar, i, mo26941b())) {
                    gVar = null;
                }
                if (gVar == null) {
                }
            } finally {
                gVar.close();
            }
        } else {
            StringBuilder sb = new StringBuilder("cannot mkdir: ");
            sb.append(file);
            throw new IOException(sb.toString());
        }
    }

    protected C14689m(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getApplicationInfo().dataDir);
        sb.append("/");
        sb.append(str);
        super(new File(sb.toString()), 1);
        this.f38068f = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.m43752a(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r3 != null) goto L_0x0028;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m30042a(java.io.File r3, byte r4) throws java.io.IOException {
        /*
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "rw"
            r0.<init>(r3, r1)
            r1 = 0
            r3 = 0
            r0.seek(r1)     // Catch:{ Throwable -> 0x0024 }
            r0.write(r4)     // Catch:{ Throwable -> 0x0024 }
            long r1 = r0.getFilePointer()     // Catch:{ Throwable -> 0x0024 }
            r0.setLength(r1)     // Catch:{ Throwable -> 0x0024 }
            java.io.FileDescriptor r4 = r0.getFD()     // Catch:{ Throwable -> 0x0024 }
            r4.sync()     // Catch:{ Throwable -> 0x0024 }
            r0.close()
            return
        L_0x0022:
            r4 = move-exception
            goto L_0x0026
        L_0x0024:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0022 }
        L_0x0026:
            if (r3 == 0) goto L_0x0031
            r0.close()     // Catch:{ Throwable -> 0x002c }
            goto L_0x0034
        L_0x002c:
            r0 = move-exception
            com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.m43752a(r3, r0)
            goto L_0x0034
        L_0x0031:
            r0.close()
        L_0x0034:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C14689m.m30042a(java.io.File, byte):void");
    }

    /* renamed from: a */
    public final int mo26943a(String str, int i, ThreadPolicy threadPolicy) throws IOException {
        int a;
        synchronized (m30045b(str)) {
            a = mo26947a(str, i, this.f38048b, threadPolicy);
        }
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r3 != 1) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c6, code lost:
        r12 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c7, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00cb, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00cc, code lost:
        r10 = r13;
        r13 = r12;
        r12 = r10;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c6 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:31:0x0067] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m30044a(com.facebook.soloader.C14681g r12, int r13, byte[] r14) throws java.io.IOException {
        /*
            r11 = this;
            java.io.File r5 = new java.io.File
            java.io.File r0 = r11.f38048b
            java.lang.String r1 = "dso_state"
            r5.<init>(r0, r1)
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "rw"
            r0.<init>(r5, r1)
            r7 = 1
            r1 = 0
            r2 = 0
            byte r3 = r0.readByte()     // Catch:{ EOFException -> 0x002d, Throwable -> 0x001c }
            if (r3 == r7) goto L_0x002e
            goto L_0x002d
        L_0x001a:
            r12 = move-exception
            goto L_0x001e
        L_0x001c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001a }
        L_0x001e:
            if (r1 == 0) goto L_0x0029
            r0.close()     // Catch:{ Throwable -> 0x0024 }
            goto L_0x002c
        L_0x0024:
            r13 = move-exception
            com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.m43752a(r1, r13)
            goto L_0x002c
        L_0x0029:
            r0.close()
        L_0x002c:
            throw r12
        L_0x002d:
            r3 = 0
        L_0x002e:
            r0.close()
            java.io.File r4 = new java.io.File
            java.io.File r0 = r11.f38048b
            java.lang.String r6 = "dso_deps"
            r4.<init>(r0, r6)
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r6 = "rw"
            r0.<init>(r4, r6)
            long r8 = r0.length()     // Catch:{ Throwable -> 0x00e0 }
            int r6 = (int) r8     // Catch:{ Throwable -> 0x00e0 }
            byte[] r6 = new byte[r6]     // Catch:{ Throwable -> 0x00e0 }
            int r8 = r0.read(r6)     // Catch:{ Throwable -> 0x00e0 }
            int r9 = r6.length     // Catch:{ Throwable -> 0x00e0 }
            if (r8 == r9) goto L_0x0050
            r3 = 0
        L_0x0050:
            boolean r6 = java.util.Arrays.equals(r6, r14)     // Catch:{ Throwable -> 0x00e0 }
            if (r6 != 0) goto L_0x0057
            r3 = 0
        L_0x0057:
            if (r3 == 0) goto L_0x0060
            r6 = r13 & 2
            if (r6 == 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r8 = r1
            goto L_0x0078
        L_0x0060:
            m30042a(r5, r2)     // Catch:{ Throwable -> 0x00e0 }
            com.facebook.soloader.m$e r6 = r11.mo26940a()     // Catch:{ Throwable -> 0x00e0 }
            com.facebook.soloader.m$b r8 = r6.mo26948a()     // Catch:{ Throwable -> 0x00c9, all -> 0x00c6 }
            com.facebook.soloader.m$d r9 = r6.mo26949b()     // Catch:{ Throwable -> 0x00c9, all -> 0x00c6 }
            r11.m30041a(r3, r8, r9)     // Catch:{ Throwable -> 0x00b1, all -> 0x00ae }
            r9.close()     // Catch:{ Throwable -> 0x00c9, all -> 0x00c6 }
            r6.close()     // Catch:{ Throwable -> 0x00e0 }
        L_0x0078:
            r0.close()
            if (r8 != 0) goto L_0x007e
            return r2
        L_0x007e:
            com.facebook.soloader.m$1 r9 = new com.facebook.soloader.m$1
            r0 = r9
            r1 = r11
            r2 = r4
            r3 = r14
            r4 = r8
            r6 = r12
            r0.<init>(r2, r3, r4, r5, r6)
            r12 = r13 & 1
            if (r12 == 0) goto L_0x00aa
            java.lang.Thread r12 = new java.lang.Thread
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "SoSync:"
            r13.<init>(r14)
            java.io.File r14 = r11.f38048b
            java.lang.String r14 = r14.getName()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r9, r13)
            r12.start()
            goto L_0x00ad
        L_0x00aa:
            r9.run()
        L_0x00ad:
            return r7
        L_0x00ae:
            r12 = move-exception
            r13 = r1
            goto L_0x00b7
        L_0x00b1:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r13 = move-exception
            r10 = r13
            r13 = r12
            r12 = r10
        L_0x00b7:
            if (r13 == 0) goto L_0x00c2
            r9.close()     // Catch:{ Throwable -> 0x00bd, all -> 0x00c6 }
            goto L_0x00c5
        L_0x00bd:
            r14 = move-exception
            com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.m43752a(r13, r14)     // Catch:{ Throwable -> 0x00c9, all -> 0x00c6 }
            goto L_0x00c5
        L_0x00c2:
            r9.close()     // Catch:{ Throwable -> 0x00c9, all -> 0x00c6 }
        L_0x00c5:
            throw r12     // Catch:{ Throwable -> 0x00c9, all -> 0x00c6 }
        L_0x00c6:
            r12 = move-exception
            r13 = r1
            goto L_0x00cf
        L_0x00c9:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            r13 = move-exception
            r10 = r13
            r13 = r12
            r12 = r10
        L_0x00cf:
            if (r13 == 0) goto L_0x00da
            r6.close()     // Catch:{ Throwable -> 0x00d5 }
            goto L_0x00dd
        L_0x00d5:
            r14 = move-exception
            com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.m43752a(r13, r14)     // Catch:{ Throwable -> 0x00e0 }
            goto L_0x00dd
        L_0x00da:
            r6.close()     // Catch:{ Throwable -> 0x00e0 }
        L_0x00dd:
            throw r12     // Catch:{ Throwable -> 0x00e0 }
        L_0x00de:
            r12 = move-exception
            goto L_0x00e3
        L_0x00e0:
            r12 = move-exception
            r1 = r12
            throw r1     // Catch:{ all -> 0x00de }
        L_0x00e3:
            if (r1 == 0) goto L_0x00ee
            r0.close()     // Catch:{ Throwable -> 0x00e9 }
            goto L_0x00f1
        L_0x00e9:
            r13 = move-exception
            com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.m43752a(r1, r13)
            goto L_0x00f1
        L_0x00ee:
            r0.close()
        L_0x00f1:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C14689m.m30044a(com.facebook.soloader.g, int, byte[]):boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:36|37|38|39|40|41|42|(2:44|(1:46))|47|(3:49|50|92)(3:51|52|53)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x009a */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029 A[SYNTHETIC, Splitter:B:12:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043 A[Catch:{ Throwable -> 0x0021, all -> 0x001c, Throwable -> 0x012c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m30041a(byte r16, com.facebook.soloader.C14689m.C14692b r17, com.facebook.soloader.C14689m.C14694d r18) throws java.io.IOException {
        /*
            r15 = this;
            r1 = r15
            java.io.File r0 = new java.io.File
            java.io.File r2 = r1.f38048b
            java.lang.String r3 = "dso_manifest"
            r0.<init>(r2, r3)
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile
            java.lang.String r3 = "rw"
            r2.<init>(r0, r3)
            r3 = 0
            r0 = 1
            r4 = r16
            if (r4 != r0) goto L_0x0025
            com.facebook.soloader.m$b r4 = com.facebook.soloader.C14689m.C14692b.m30051a(r2)     // Catch:{ Exception -> 0x0025 }
            goto L_0x0026
        L_0x001c:
            r0 = move-exception
            r4 = r3
            r3 = r0
            goto L_0x0126
        L_0x0021:
            r0 = move-exception
            r3 = r0
            goto L_0x0125
        L_0x0025:
            r4 = r3
        L_0x0026:
            r5 = 0
            if (r4 != 0) goto L_0x0030
            com.facebook.soloader.m$b r4 = new com.facebook.soloader.m$b     // Catch:{ Throwable -> 0x0021 }
            com.facebook.soloader.m$a[] r6 = new com.facebook.soloader.C14689m.C14691a[r5]     // Catch:{ Throwable -> 0x0021 }
            r4.<init>(r6)     // Catch:{ Throwable -> 0x0021 }
        L_0x0030:
            r6 = r4
            r4 = r17
            com.facebook.soloader.m$a[] r4 = r4.f38079a     // Catch:{ Throwable -> 0x0021 }
            r15.m30043a(r4)     // Catch:{ Throwable -> 0x0021 }
            r4 = 32768(0x8000, float:4.5918E-41)
            byte[] r4 = new byte[r4]     // Catch:{ Throwable -> 0x0021 }
        L_0x003d:
            boolean r7 = r18.mo26950a()     // Catch:{ Throwable -> 0x0021 }
            if (r7 == 0) goto L_0x0121
            com.facebook.soloader.m$c r7 = r18.mo26951b()     // Catch:{ Throwable -> 0x0021 }
            r8 = 1
            r9 = 0
        L_0x0049:
            if (r8 == 0) goto L_0x007d
            com.facebook.soloader.m$a[] r10 = r6.f38079a     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            int r10 = r10.length     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            if (r9 >= r10) goto L_0x007d
            com.facebook.soloader.m$a[] r10 = r6.f38079a     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            r10 = r10[r9]     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            java.lang.String r10 = r10.f38077c     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            com.facebook.soloader.m$a r11 = r7.f38080a     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            java.lang.String r11 = r11.f38077c     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            boolean r10 = r10.equals(r11)     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            if (r10 == 0) goto L_0x0071
            com.facebook.soloader.m$a[] r10 = r6.f38079a     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            r10 = r10[r9]     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            java.lang.String r10 = r10.f38078d     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            com.facebook.soloader.m$a r11 = r7.f38080a     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            java.lang.String r11 = r11.f38078d     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            boolean r10 = r10.equals(r11)     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            if (r10 == 0) goto L_0x0071
            r8 = 0
        L_0x0071:
            int r9 = r9 + 1
            goto L_0x0049
        L_0x0074:
            r0 = move-exception
            r4 = r0
            r5 = r3
            goto L_0x010c
        L_0x0079:
            r0 = move-exception
            r4 = r0
            goto L_0x0108
        L_0x007d:
            if (r8 == 0) goto L_0x011c
            java.io.File r8 = r1.f38048b     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            boolean r8 = r8.setWritable(r0, r0)     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            if (r8 == 0) goto L_0x00f2
            java.io.File r8 = new java.io.File     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            java.io.File r9 = r1.f38048b     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            com.facebook.soloader.m$a r10 = r7.f38080a     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            java.lang.String r10 = r10.f38077c     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            r8.<init>(r9, r10)     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            java.io.RandomAccessFile r9 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x009a }
            java.lang.String r10 = "rw"
            r9.<init>(r8, r10)     // Catch:{ IOException -> 0x009a }
            goto L_0x00a4
        L_0x009a:
            com.facebook.soloader.C14686k.m30038a(r8)     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            java.io.RandomAccessFile r9 = new java.io.RandomAccessFile     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            java.lang.String r10 = "rw"
            r9.<init>(r8, r10)     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
        L_0x00a4:
            java.io.InputStream r10 = r7.f38081b     // Catch:{ IOException -> 0x00e9 }
            int r10 = r10.available()     // Catch:{ IOException -> 0x00e9 }
            if (r10 <= r0) goto L_0x00ba
            java.io.FileDescriptor r11 = r9.getFD()     // Catch:{ IOException -> 0x00e9 }
            long r12 = (long) r10     // Catch:{ IOException -> 0x00e9 }
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x00e9 }
            r14 = 21
            if (r10 < r14) goto L_0x00ba
            com.facebook.soloader.C14686k.C14687a.fallocateIfSupported(r11, r12)     // Catch:{ IOException -> 0x00e9 }
        L_0x00ba:
            java.io.InputStream r10 = r7.f38081b     // Catch:{ IOException -> 0x00e9 }
            r11 = 2147483647(0x7fffffff, float:NaN)
            com.facebook.soloader.C14686k.m30036a(r9, r10, r11, r4)     // Catch:{ IOException -> 0x00e9 }
            long r10 = r9.getFilePointer()     // Catch:{ IOException -> 0x00e9 }
            r9.setLength(r10)     // Catch:{ IOException -> 0x00e9 }
            boolean r10 = r8.setExecutable(r0, r5)     // Catch:{ IOException -> 0x00e9 }
            if (r10 == 0) goto L_0x00d3
            r9.close()     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            goto L_0x011c
        L_0x00d3:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x00e9 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00e9 }
            java.lang.String r5 = "cannot make file executable: "
            r4.<init>(r5)     // Catch:{ IOException -> 0x00e9 }
            r4.append(r8)     // Catch:{ IOException -> 0x00e9 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x00e9 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x00e9 }
            throw r0     // Catch:{ IOException -> 0x00e9 }
        L_0x00e7:
            r0 = move-exception
            goto L_0x00ee
        L_0x00e9:
            r0 = move-exception
            com.facebook.soloader.C14686k.m30038a(r8)     // Catch:{ all -> 0x00e7 }
            throw r0     // Catch:{ all -> 0x00e7 }
        L_0x00ee:
            r9.close()     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            throw r0     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
        L_0x00f2:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            java.lang.String r5 = "cannot make directory writable for us: "
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            java.io.File r5 = r1.f38048b     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            r4.append(r5)     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            r0.<init>(r4)     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
            throw r0     // Catch:{ Throwable -> 0x0079, all -> 0x0074 }
        L_0x0108:
            throw r4     // Catch:{ all -> 0x0109 }
        L_0x0109:
            r0 = move-exception
            r5 = r4
            r4 = r0
        L_0x010c:
            if (r5 == 0) goto L_0x0118
            r7.close()     // Catch:{ Throwable -> 0x0112 }
            goto L_0x011b
        L_0x0112:
            r0 = move-exception
            r6 = r0
            com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.m43752a(r5, r6)     // Catch:{ Throwable -> 0x0021 }
            goto L_0x011b
        L_0x0118:
            r7.close()     // Catch:{ Throwable -> 0x0021 }
        L_0x011b:
            throw r4     // Catch:{ Throwable -> 0x0021 }
        L_0x011c:
            r7.close()     // Catch:{ Throwable -> 0x0021 }
            goto L_0x003d
        L_0x0121:
            r2.close()
            return
        L_0x0125:
            throw r3     // Catch:{ all -> 0x001c }
        L_0x0126:
            if (r4 == 0) goto L_0x0132
            r2.close()     // Catch:{ Throwable -> 0x012c }
            goto L_0x0135
        L_0x012c:
            r0 = move-exception
            r2 = r0
            com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.m43752a(r4, r2)
            goto L_0x0135
        L_0x0132:
            r2.close()
        L_0x0135:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C14689m.m30041a(byte, com.facebook.soloader.m$b, com.facebook.soloader.m$d):void");
    }
}
