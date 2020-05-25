package com.p683ss.android.ugc.effectmanager;

import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p683ss.android.ugc.effectmanager.common.p2433a.C48600g;
import com.p683ss.android.ugc.effectmanager.p2431b.C48570a;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.ss.android.ugc.effectmanager.f */
public final class C48887f implements C48600g {

    /* renamed from: a */
    final C48570a f122944a;

    /* renamed from: b */
    public final String f122945b;

    /* renamed from: com.ss.android.ugc.effectmanager.f$1 */
    static /* synthetic */ class C488881 {

        /* renamed from: a */
        static final /* synthetic */ int[] f122946a = new int[C48901i.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.ss.android.ugc.effectmanager.i[] r0 = com.p683ss.android.ugc.effectmanager.C48901i.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f122946a = r0
                int[] r0 = f122946a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.android.ugc.effectmanager.i r1 = com.p683ss.android.ugc.effectmanager.C48901i.ZIP     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f122946a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.android.ugc.effectmanager.i r1 = com.p683ss.android.ugc.effectmanager.C48901i.ORIGIN     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.C48887f.C488881.<clinit>():void");
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.f$a */
    static class C48889a extends FilterOutputStream {

        /* renamed from: a */
        long f122947a;

        public C48889a(OutputStream outputStream) {
            super(outputStream);
        }

        public final void write(int i) throws IOException {
            this.out.write(i);
            this.f122947a++;
        }

        public final void write(byte[] bArr, int i, int i2) throws IOException {
            this.out.write(bArr, i, i2);
            this.f122947a += (long) i2;
        }
    }

    /* renamed from: a */
    public final String mo96160a() {
        return this.f122945b;
    }

    /* renamed from: c */
    private static String m105631c(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (!(c == '_' || c == '-' || ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')))) {
                charArray[i] = '_';
            }
        }
        return new String(charArray);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.effectmanager.model.LocalModelInfo mo96144a(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r6 = m105631c(r6)
            r0 = 0
            com.ss.android.ugc.effectmanager.b.a r1 = r5.f122944a     // Catch:{ IOException -> 0x005e }
            java.util.Set r1 = r1.mo96113f()     // Catch:{ IOException -> 0x005e }
            java.util.Iterator r1 = r1.iterator()
        L_0x000f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0026
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = com.p683ss.android.ugc.effectmanager.common.C48633d.m105242a(r2)
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x000f
            goto L_0x0027
        L_0x0026:
            r2 = r0
        L_0x0027:
            if (r2 != 0) goto L_0x002a
            return r0
        L_0x002a:
            com.ss.android.ugc.effectmanager.b.a r6 = r5.f122944a     // Catch:{ IOException -> 0x0057, all -> 0x004d }
            com.ss.android.ugc.effectmanager.b.a$c r6 = r6.mo96103a(r2)     // Catch:{ IOException -> 0x0057, all -> 0x004d }
            if (r6 != 0) goto L_0x0038
            if (r6 == 0) goto L_0x0037
            r6.close()
        L_0x0037:
            return r0
        L_0x0038:
            java.io.File[] r1 = r6.f122116a     // Catch:{ IOException -> 0x0058, all -> 0x004b }
            r2 = 0
            r1 = r1[r2]     // Catch:{ IOException -> 0x0058, all -> 0x004b }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x0058, all -> 0x004b }
            com.ss.android.ugc.effectmanager.model.LocalModelInfo r1 = com.p683ss.android.ugc.effectmanager.model.LocalModelInfo.fromFile(r1)     // Catch:{ IOException -> 0x0058, all -> 0x004b }
            if (r6 == 0) goto L_0x004a
            r6.close()
        L_0x004a:
            return r1
        L_0x004b:
            r0 = move-exception
            goto L_0x0051
        L_0x004d:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L_0x0051:
            if (r6 == 0) goto L_0x0056
            r6.close()
        L_0x0056:
            throw r0
        L_0x0057:
            r6 = r0
        L_0x0058:
            if (r6 == 0) goto L_0x005d
            r6.close()
        L_0x005d:
            return r0
        L_0x005e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.C48887f.mo96144a(java.lang.String):com.ss.android.ugc.effectmanager.model.LocalModelInfo");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0013 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<java.lang.String> mo96658b(java.lang.String r6) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r6 = m105631c(r6)
            com.ss.android.ugc.effectmanager.b.a r1 = r5.f122944a     // Catch:{ IOException -> 0x0051 }
            java.util.Set r1 = r1.mo96113f()     // Catch:{ IOException -> 0x0051 }
            java.util.Iterator r1 = r1.iterator()
        L_0x0013:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0050
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = com.p683ss.android.ugc.effectmanager.common.C48633d.m105242a(r2)
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x0013
            r3 = 0
            com.ss.android.ugc.effectmanager.b.a r4 = r5.f122944a     // Catch:{ IOException -> 0x004a, all -> 0x0043 }
            com.ss.android.ugc.effectmanager.b.a$c r4 = r4.mo96103a(r2)     // Catch:{ IOException -> 0x004a, all -> 0x0043 }
            if (r4 != 0) goto L_0x0038
            if (r4 == 0) goto L_0x0013
        L_0x0034:
            r4.close()
            goto L_0x0013
        L_0x0038:
            r0.add(r2)     // Catch:{ IOException -> 0x0041, all -> 0x003e }
            if (r4 == 0) goto L_0x0013
            goto L_0x0034
        L_0x003e:
            r6 = move-exception
            r3 = r4
            goto L_0x0044
        L_0x0041:
            r3 = r4
            goto L_0x004a
        L_0x0043:
            r6 = move-exception
        L_0x0044:
            if (r3 == 0) goto L_0x0049
            r3.close()
        L_0x0049:
            throw r6
        L_0x004a:
            if (r3 == 0) goto L_0x0013
            r3.close()
            goto L_0x0013
        L_0x0050:
            return r0
        L_0x0051:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.C48887f.mo96658b(java.lang.String):java.util.ArrayList");
    }

    /* renamed from: a */
    private static long m105630a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    C48887f(String str, String str2) {
        try {
            this.f122944a = C48570a.m105071a(new File(str), str2.hashCode(), 1, Long.MAX_VALUE);
            this.f122945b = str;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo96657b(java.lang.String r4, java.io.InputStream r5, java.security.MessageDigest r6, java.lang.String r7) {
        /*
            r3 = this;
            java.lang.String r4 = m105631c(r4)
            r0 = 0
            com.ss.android.ugc.effectmanager.b.a r1 = r3.f122944a     // Catch:{ IOException -> 0x004c }
            com.ss.android.ugc.effectmanager.b.a$a r4 = r1.mo96106b(r4)     // Catch:{ IOException -> 0x004c }
            com.ss.android.ugc.effectmanager.f$a r0 = new com.ss.android.ugc.effectmanager.f$a     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            java.security.DigestOutputStream r1 = new java.security.DigestOutputStream     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            r2 = 0
            java.io.OutputStream r2 = r4.mo96116a(r2)     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            r1.<init>(r2, r6)     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            m105630a(r5, r0)     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            r0.close()     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            byte[] r5 = r6.digest()     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            java.lang.String r5 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48675k.m105343a(r5)     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            boolean r5 = r5.equals(r7)     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            if (r5 == 0) goto L_0x0039
            r4.mo96117a()     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            long r5 = r0.f122947a     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            if (r4 == 0) goto L_0x0038
            r4.mo96119c()
        L_0x0038:
            return r5
        L_0x0039:
            r4.mo96118b()     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            if (r4 == 0) goto L_0x0041
            r4.mo96119c()
        L_0x0041:
            r4 = -1
            return r4
        L_0x0044:
            r5 = move-exception
            goto L_0x0053
        L_0x0046:
            r5 = move-exception
            r0 = r4
            goto L_0x004d
        L_0x0049:
            r5 = move-exception
            r4 = r0
            goto L_0x0053
        L_0x004c:
            r5 = move-exception
        L_0x004d:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x0049 }
            r4.<init>(r5)     // Catch:{ all -> 0x0049 }
            throw r4     // Catch:{ all -> 0x0049 }
        L_0x0053:
            if (r4 == 0) goto L_0x0058
            r4.mo96119c()
        L_0x0058:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.C48887f.mo96657b(java.lang.String, java.io.InputStream, java.security.MessageDigest, java.lang.String):long");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b9 A[SYNTHETIC, Splitter:B:50:0x00b9] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00be A[Catch:{ IOException -> 0x00c1 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo96656a(java.lang.String r4, java.io.InputStream r5, java.security.MessageDigest r6, java.lang.String r7) {
        /*
            r3 = this;
            java.lang.String r4 = m105631c(r4)
            r0 = 0
            com.ss.android.ugc.effectmanager.b.a r1 = r3.f122944a     // Catch:{ Exception -> 0x00ad, all -> 0x00a9 }
            com.ss.android.ugc.effectmanager.b.a$a r4 = r1.mo96106b(r4)     // Catch:{ Exception -> 0x00ad, all -> 0x00a9 }
            java.util.zip.ZipInputStream r1 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x00a5, all -> 0x00a2 }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00a5, all -> 0x00a2 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x00a5, all -> 0x00a2 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x00a5, all -> 0x00a2 }
            java.util.zip.ZipEntry r5 = r1.getNextEntry()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            java.lang.String r5 = r5.getName()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            java.lang.String r2 = ".."
            r0.<init>(r2)     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            java.lang.String r2 = java.io.File.separator     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            r0.append(r2)     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            boolean r0 = r5.contains(r0)     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            if (r0 != 0) goto L_0x008a
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            java.lang.String r2 = r3.f122945b     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            r0.<init>(r2, r5)     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            boolean r5 = r0.exists()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            if (r5 == 0) goto L_0x0044
            r0.delete()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            goto L_0x004b
        L_0x0044:
            java.io.File r5 = r0.getParentFile()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            r5.mkdirs()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
        L_0x004b:
            com.ss.android.ugc.effectmanager.f$a r5 = new com.ss.android.ugc.effectmanager.f$a     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            java.security.DigestOutputStream r0 = new java.security.DigestOutputStream     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            r2 = 0
            java.io.OutputStream r2 = r4.mo96116a(r2)     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            r0.<init>(r2, r6)     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            r5.<init>(r0)     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            m105630a(r1, r5)     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            r5.close()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            byte[] r6 = r6.digest()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            java.lang.String r6 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48675k.m105343a(r6)     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            boolean r6 = r6.equals(r7)     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            if (r6 == 0) goto L_0x007c
            r4.mo96117a()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            long r5 = r5.f122947a     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            r1.close()     // Catch:{ IOException -> 0x007b }
            if (r4 == 0) goto L_0x007b
            r4.mo96119c()     // Catch:{ IOException -> 0x007b }
        L_0x007b:
            return r5
        L_0x007c:
            r4.mo96118b()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            r1.close()     // Catch:{ IOException -> 0x0087 }
            if (r4 == 0) goto L_0x0087
            r4.mo96119c()     // Catch:{ IOException -> 0x0087 }
        L_0x0087:
            r4 = -1
            return r4
        L_0x008a:
            com.ss.android.ugc.effectmanager.common.d.d r6 = new com.ss.android.ugc.effectmanager.common.d.d     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            java.lang.String r0 = "Entry is outside dir"
            r7.<init>(r0)     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            r7.append(r5)     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            java.lang.String r5 = r7.toString()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            r6.<init>(r5)     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            throw r6     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
        L_0x009e:
            r5 = move-exception
            goto L_0x00b7
        L_0x00a0:
            r5 = move-exception
            goto L_0x00a7
        L_0x00a2:
            r5 = move-exception
            r1 = r0
            goto L_0x00b7
        L_0x00a5:
            r5 = move-exception
            r1 = r0
        L_0x00a7:
            r0 = r4
            goto L_0x00af
        L_0x00a9:
            r5 = move-exception
            r4 = r0
            r1 = r4
            goto L_0x00b7
        L_0x00ad:
            r5 = move-exception
            r1 = r0
        L_0x00af:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x00b5 }
            r4.<init>(r5)     // Catch:{ all -> 0x00b5 }
            throw r4     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r5 = move-exception
            r4 = r0
        L_0x00b7:
            if (r1 == 0) goto L_0x00bc
            r1.close()     // Catch:{ IOException -> 0x00c1 }
        L_0x00bc:
            if (r4 == 0) goto L_0x00c1
            r4.mo96119c()     // Catch:{ IOException -> 0x00c1 }
        L_0x00c1:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.C48887f.mo96656a(java.lang.String, java.io.InputStream, java.security.MessageDigest, java.lang.String):long");
    }
}
