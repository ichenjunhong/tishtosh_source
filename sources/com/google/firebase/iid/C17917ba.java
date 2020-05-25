package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.internal.p1044e.C16484b;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

/* renamed from: com.google.firebase.iid.ba */
final class C17917ba {
    C17917ba() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C17918bb mo34758a(Context context, String str) {
        C17918bb bbVar = new C17918bb(C17919c.m43927a(), System.currentTimeMillis());
        C17918bb a = m43907a(context, str, bbVar, true);
        if (a != null && !a.equals(bbVar)) {
            return a;
        }
        m43913a(context, str, bbVar);
        return bbVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C17918bb mo34759b(Context context, String str) throws C17920d {
        try {
            C17918bb c = m43918c(context, str);
            if (c != null) {
                m43913a(context, str, c);
                return c;
            }
            e = null;
            try {
                C17918bb a = m43908a(C35807d.m80935a(context, "com.google.android.gms.appid", 0), str);
                if (a != null) {
                    m43907a(context, str, a, false);
                    return a;
                }
            } catch (C17920d e) {
                e = e;
            }
            if (e == null) {
                return null;
            }
            throw e;
        } catch (C17920d e2) {
            e = e2;
        }
    }

    /* renamed from: a */
    private static KeyPair m43912a(String str, String str2) throws C17920d {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory instance = KeyFactory.getInstance("RSA");
                return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                throw new C17920d((Exception) e);
            }
        } catch (IllegalArgumentException e2) {
            throw new C17920d((Exception) e2);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        throw new com.google.firebase.iid.C17920d((java.lang.Exception) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return m43909a(r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.firebase.iid.C17918bb m43918c(android.content.Context r1, java.lang.String r2) throws com.google.firebase.iid.C17920d {
        /*
            r0 = this;
            java.io.File r1 = m43919d(r1, r2)
            boolean r2 = r1.exists()
            if (r2 != 0) goto L_0x000c
            r1 = 0
            return r1
        L_0x000c:
            com.google.firebase.iid.bb r2 = m43909a(r1)     // Catch:{ d | IOException -> 0x0011 }
            return r2
        L_0x0011:
            com.google.firebase.iid.bb r1 = m43909a(r1)     // Catch:{ IOException -> 0x0016 }
            return r1
        L_0x0016:
            r1 = move-exception
            com.google.firebase.iid.d r2 = new com.google.firebase.iid.d
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C17917ba.m43918c(android.content.Context, java.lang.String):com.google.firebase.iid.bb");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:19|20|(2:22|23)|24|25|26) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0056 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056 A[SYNTHETIC, Splitter:B:19:0x0056] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:45:0x0081=Splitter:B:45:0x0081, B:16:0x0052=Splitter:B:16:0x0052, B:24:0x0065=Splitter:B:24:0x0065} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.firebase.iid.C17918bb m43907a(android.content.Context r7, java.lang.String r8, com.google.firebase.iid.C17918bb r9, boolean r10) {
        /*
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            java.lang.String r1 = "pub"
            java.lang.String r2 = r9.m43922a()
            r0.setProperty(r1, r2)
            java.lang.String r1 = "pri"
            java.lang.String r2 = r9.m43924b()
            r0.setProperty(r1, r2)
            java.lang.String r1 = "cre"
            long r2 = r9.f49776b
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.setProperty(r1, r2)
            java.io.File r7 = m43919d(r7, r8)
            r8 = 0
            r7.createNewFile()     // Catch:{ IOException -> 0x0085 }
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0085 }
            java.lang.String r2 = "rw"
            r1.<init>(r7, r2)     // Catch:{ IOException -> 0x0085 }
            java.nio.channels.FileChannel r7 = r1.getChannel()     // Catch:{ Throwable -> 0x007b, all -> 0x0078 }
            r7.lock()     // Catch:{ Throwable -> 0x006c, all -> 0x0069 }
            r2 = 0
            if (r10 == 0) goto L_0x0056
            long r4 = r7.size()     // Catch:{ Throwable -> 0x006c, all -> 0x0069 }
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r10 <= 0) goto L_0x0056
            r7.position(r2)     // Catch:{ d | IOException -> 0x0056 }
            com.google.firebase.iid.bb r10 = m43910a(r7)     // Catch:{ d | IOException -> 0x0056 }
            if (r7 == 0) goto L_0x0052
            m43916a(r8, r7)     // Catch:{ Throwable -> 0x007b, all -> 0x0078 }
        L_0x0052:
            m43915a(r8, r1)     // Catch:{ IOException -> 0x0085 }
            return r10
        L_0x0056:
            r7.position(r2)     // Catch:{ Throwable -> 0x006c, all -> 0x0069 }
            java.io.OutputStream r10 = java.nio.channels.Channels.newOutputStream(r7)     // Catch:{ Throwable -> 0x006c, all -> 0x0069 }
            r0.store(r10, r8)     // Catch:{ Throwable -> 0x006c, all -> 0x0069 }
            if (r7 == 0) goto L_0x0065
            m43916a(r8, r7)     // Catch:{ Throwable -> 0x007b, all -> 0x0078 }
        L_0x0065:
            m43915a(r8, r1)     // Catch:{ IOException -> 0x0085 }
            return r9
        L_0x0069:
            r9 = move-exception
            r10 = r8
            goto L_0x0072
        L_0x006c:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x006e }
        L_0x006e:
            r10 = move-exception
            r6 = r10
            r10 = r9
            r9 = r6
        L_0x0072:
            if (r7 == 0) goto L_0x0077
            m43916a(r10, r7)     // Catch:{ Throwable -> 0x007b, all -> 0x0078 }
        L_0x0077:
            throw r9     // Catch:{ Throwable -> 0x007b, all -> 0x0078 }
        L_0x0078:
            r7 = move-exception
            r9 = r8
            goto L_0x0081
        L_0x007b:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x007d }
        L_0x007d:
            r9 = move-exception
            r6 = r9
            r9 = r7
            r7 = r6
        L_0x0081:
            m43915a(r9, r1)     // Catch:{ IOException -> 0x0085 }
            throw r7     // Catch:{ IOException -> 0x0085 }
        L_0x0085:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C17917ba.m43907a(android.content.Context, java.lang.String, com.google.firebase.iid.bb, boolean):com.google.firebase.iid.bb");
    }

    /* renamed from: a */
    static File m43911a(Context context) {
        File a = C0726c.m2092a(context);
        if (a == null || !a.isDirectory()) {
            return context.getFilesDir();
        }
        return a;
    }

    /* renamed from: d */
    private static File m43919d(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 33);
                sb.append("com.google.InstanceId_");
                sb.append(encodeToString);
                sb.append(".properties");
                str2 = sb.toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        return new File(m43911a(context), str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0032, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0036, code lost:
        m43914a(r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0039, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.firebase.iid.C17918bb m43909a(java.io.File r9) throws com.google.firebase.iid.C17920d, java.io.IOException {
        /*
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r9)
            r9 = 0
            java.nio.channels.FileChannel r7 = r0.getChannel()     // Catch:{ Throwable -> 0x0034 }
            r2 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 1
            r1 = r7
            r1.lock(r2, r4, r6)     // Catch:{ Throwable -> 0x0026, all -> 0x0023 }
            com.google.firebase.iid.bb r1 = m43910a(r7)     // Catch:{ Throwable -> 0x0026, all -> 0x0023 }
            if (r7 == 0) goto L_0x001f
            m43916a(r9, r7)     // Catch:{ Throwable -> 0x0034 }
        L_0x001f:
            m43914a(r9, r0)
            return r1
        L_0x0023:
            r1 = move-exception
            r2 = r9
            goto L_0x002c
        L_0x0026:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r2 = move-exception
            r8 = r2
            r2 = r1
            r1 = r8
        L_0x002c:
            if (r7 == 0) goto L_0x0031
            m43916a(r2, r7)     // Catch:{ Throwable -> 0x0034 }
        L_0x0031:
            throw r1     // Catch:{ Throwable -> 0x0034 }
        L_0x0032:
            r1 = move-exception
            goto L_0x0036
        L_0x0034:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0032 }
        L_0x0036:
            m43914a(r9, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C17917ba.m43909a(java.io.File):com.google.firebase.iid.bb");
    }

    /* renamed from: a */
    private static C17918bb m43910a(FileChannel fileChannel) throws C17920d, IOException {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        String property = properties.getProperty("pub");
        String property2 = properties.getProperty("pri");
        if (property == null || property2 == null) {
            throw new C17920d("Invalid properties file");
        }
        try {
            return new C17918bb(m43912a(property, property2), Long.parseLong(properties.getProperty("cre")));
        } catch (NumberFormatException e) {
            throw new C17920d((Exception) e);
        }
    }

    /* renamed from: a */
    private static C17918bb m43908a(SharedPreferences sharedPreferences, String str) throws C17920d {
        String string = sharedPreferences.getString(C17942z.m43973a(str, "|P|"), null);
        String string2 = sharedPreferences.getString(C17942z.m43973a(str, "|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        return new C17918bb(m43912a(string, string2), m43917b(sharedPreferences, str));
    }

    /* renamed from: a */
    private static void m43913a(Context context, String str, C17918bb bbVar) {
        SharedPreferences a = C35807d.m80935a(context, "com.google.android.gms.appid", 0);
        try {
            if (bbVar.equals(m43908a(a, str))) {
                return;
            }
        } catch (C17920d unused) {
        }
        Editor edit = a.edit();
        edit.putString(C17942z.m43973a(str, "|P|"), bbVar.m43922a());
        edit.putString(C17942z.m43973a(str, "|K|"), bbVar.m43924b());
        edit.putString(C17942z.m43973a(str, "cre"), String.valueOf(bbVar.f49776b));
        edit.commit();
    }

    /* renamed from: b */
    private static long m43917b(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(C17942z.m43973a(str, "cre"), null);
        if (string != null) {
            try {
                return Long.parseLong(string);
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    /* renamed from: a */
    private static /* synthetic */ void m43916a(Throwable th, FileChannel fileChannel) {
        if (th != null) {
            try {
                fileChannel.close();
            } catch (Throwable th2) {
                C16484b.m39352a(th, th2);
            }
        } else {
            fileChannel.close();
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m43915a(Throwable th, RandomAccessFile randomAccessFile) {
        if (th != null) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                C16484b.m39352a(th, th2);
            }
        } else {
            randomAccessFile.close();
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m43914a(Throwable th, FileInputStream fileInputStream) {
        if (th != null) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                C16484b.m39352a(th, th2);
            }
        } else {
            fileInputStream.close();
        }
    }
}
