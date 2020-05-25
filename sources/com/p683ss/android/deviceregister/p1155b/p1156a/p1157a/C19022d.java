package com.p683ss.android.deviceregister.p1155b.p1156a.p1157a;

import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p523c.C9393e;
import com.p683ss.android.deviceregister.C19001a;
import com.ss.android.ugc.trill.R;
import java.security.Key;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.deviceregister.b.a.a.d */
public final class C19022d extends C19013b {

    /* renamed from: h */
    private static volatile Pair<byte[], String> f52354h;

    /* renamed from: i */
    private static volatile Pair<String, byte[]> f52355i;

    /* renamed from: a */
    final String f52356a = Environment.getExternalStorageState();

    /* renamed from: b */
    String f52357b;

    /* renamed from: d */
    public volatile Map<String, String> f52358d;

    /* renamed from: e */
    public AtomicBoolean f52359e = new AtomicBoolean(false);

    /* renamed from: f */
    private final Context f52360f;

    /* renamed from: g */
    private final boolean f52361g;

    /* renamed from: com.ss.android.deviceregister.b.a.a.d$a */
    class C19024a implements Runnable {
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0090 */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00a0 A[SYNTHETIC, Splitter:B:44:0x00a0] */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00a5 A[SYNTHETIC, Splitter:B:48:0x00a5] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x00ac A[SYNTHETIC, Splitter:B:56:0x00ac] */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x00b1 A[SYNTHETIC, Splitter:B:60:0x00b1] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
                com.ss.android.deviceregister.b.a.a.d r0 = com.p683ss.android.deviceregister.p1155b.p1156a.p1157a.C19022d.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f52359e
                r1 = 0
                r0.set(r1)
                java.lang.String r0 = ""
                com.ss.android.deviceregister.b.a.a.d r1 = com.p683ss.android.deviceregister.p1155b.p1156a.p1157a.C19022d.this     // Catch:{ Throwable -> 0x0046 }
                java.util.Map<java.lang.String, java.lang.String> r1 = r1.f52358d     // Catch:{ Throwable -> 0x0046 }
                if (r1 == 0) goto L_0x0046
                com.ss.android.deviceregister.b.a.a.d r1 = com.p683ss.android.deviceregister.p1155b.p1156a.p1157a.C19022d.this     // Catch:{ Throwable -> 0x0046 }
                java.util.Map<java.lang.String, java.lang.String> r1 = r1.f52358d     // Catch:{ Throwable -> 0x0046 }
                if (r1 != 0) goto L_0x001a
                java.lang.String r1 = ""
            L_0x0018:
                r0 = r1
                goto L_0x0046
            L_0x001a:
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0046 }
                r2.<init>()     // Catch:{ Throwable -> 0x0046 }
                java.util.Set r1 = r1.entrySet()     // Catch:{ Throwable -> 0x0046 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ Throwable -> 0x0046 }
            L_0x0027:
                boolean r3 = r1.hasNext()     // Catch:{ Throwable -> 0x0046 }
                if (r3 == 0) goto L_0x0041
                java.lang.Object r3 = r1.next()     // Catch:{ Throwable -> 0x0046 }
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ Throwable -> 0x0046 }
                java.lang.Object r4 = r3.getKey()     // Catch:{ Throwable -> 0x0046 }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ Throwable -> 0x0046 }
                java.lang.Object r3 = r3.getValue()     // Catch:{ Throwable -> 0x0046 }
                r2.put(r4, r3)     // Catch:{ Throwable -> 0x0046 }
                goto L_0x0027
            L_0x0041:
                java.lang.String r1 = r2.toString()     // Catch:{ Throwable -> 0x0046 }
                goto L_0x0018
            L_0x0046:
                com.ss.android.deviceregister.b.a.a.d r1 = com.p683ss.android.deviceregister.p1155b.p1156a.p1157a.C19022d.this
                java.lang.String r2 = "mounted"
                java.lang.String r3 = r1.f52356a
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00b7
                r2 = 0
                java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x00a9, all -> 0x009c }
                java.lang.String r4 = r1.f52357b     // Catch:{ Exception -> 0x00a9, all -> 0x009c }
                r3.<init>(r4)     // Catch:{ Exception -> 0x00a9, all -> 0x009c }
                boolean r4 = r3.exists()     // Catch:{ Exception -> 0x00a9, all -> 0x009c }
                if (r4 != 0) goto L_0x0067
                boolean r3 = r3.mkdirs()     // Catch:{ Exception -> 0x00a9, all -> 0x009c }
                if (r3 != 0) goto L_0x0067
                return
            L_0x0067:
                java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x00a9, all -> 0x009c }
                java.lang.String r4 = r1.mo38879a()     // Catch:{ Exception -> 0x00a9, all -> 0x009c }
                r3.<init>(r4)     // Catch:{ Exception -> 0x00a9, all -> 0x009c }
                java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x00a9, all -> 0x009c }
                java.lang.String r5 = "rwd"
                r4.<init>(r3, r5)     // Catch:{ Exception -> 0x00a9, all -> 0x009c }
                java.nio.channels.FileChannel r3 = r4.getChannel()     // Catch:{ Exception -> 0x00aa, all -> 0x009a }
                java.nio.channels.FileLock r3 = r3.lock()     // Catch:{ Exception -> 0x00aa, all -> 0x009a }
                byte[] r0 = r1.mo38880d(r0)     // Catch:{ Exception -> 0x0098, all -> 0x0095 }
                r1 = 0
                r4.setLength(r1)     // Catch:{ Exception -> 0x0098, all -> 0x0095 }
                r4.write(r0)     // Catch:{ Exception -> 0x0098, all -> 0x0095 }
                if (r3 == 0) goto L_0x0090
                r3.release()     // Catch:{ Exception -> 0x0090 }
            L_0x0090:
                r4.close()     // Catch:{ Exception -> 0x0094 }
                return
            L_0x0094:
                return
            L_0x0095:
                r0 = move-exception
                r2 = r3
                goto L_0x009e
            L_0x0098:
                r2 = r3
                goto L_0x00aa
            L_0x009a:
                r0 = move-exception
                goto L_0x009e
            L_0x009c:
                r0 = move-exception
                r4 = r2
            L_0x009e:
                if (r2 == 0) goto L_0x00a3
                r2.release()     // Catch:{ Exception -> 0x00a3 }
            L_0x00a3:
                if (r4 == 0) goto L_0x00a8
                r4.close()     // Catch:{ Exception -> 0x00a8 }
            L_0x00a8:
                throw r0
            L_0x00a9:
                r4 = r2
            L_0x00aa:
                if (r2 == 0) goto L_0x00af
                r2.release()     // Catch:{ Exception -> 0x00af }
            L_0x00af:
                if (r4 == 0) goto L_0x00b6
                r4.close()     // Catch:{ Exception -> 0x00b5 }
                goto L_0x00b6
            L_0x00b5:
                return
            L_0x00b6:
                return
            L_0x00b7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.deviceregister.p1155b.p1156a.p1157a.C19022d.C19024a.run():void");
        }

        private C19024a() {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo38879a() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f52357b);
        sb.append("/device_parameters");
        if (C19001a.f52307a.booleanValue()) {
            str = "_i18n";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(".dat");
        return sb.toString();
    }

    /* renamed from: b */
    private String m46259b() {
        char[] cArr = new char[21];
        StringBuilder sb = new StringBuilder();
        sb.append(this.f52360f.getString(R.string.bud));
        sb.append(C19021c.m46255a());
        String sb2 = sb.toString();
        cArr[5] = sb2.charAt(10);
        cArr[11] = sb2.charAt(13);
        cArr[17] = sb2.charAt(11);
        cArr[2] = sb2.charAt(1);
        cArr[18] = sb2.charAt(4);
        cArr[10] = sb2.charAt(12);
        cArr[0] = sb2.charAt(1);
        cArr[6] = sb2.charAt(8);
        cArr[13] = sb2.charAt(5);
        cArr[8] = sb2.charAt(9);
        cArr[1] = sb2.charAt(3);
        cArr[12] = sb2.charAt(13);
        cArr[4] = sb2.charAt(15);
        cArr[14] = sb2.charAt(18);
        cArr[7] = sb2.charAt(17);
        cArr[16] = sb2.charAt(14);
        cArr[3] = sb2.charAt(11);
        cArr[15] = sb2.charAt(13);
        cArr[19] = sb2.charAt(19);
        cArr[9] = sb2.charAt(9);
        cArr[20] = sb2.charAt(7);
        return new String(cArr).substring(2, 18);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo38861a(String str) {
        return m46260e(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String[] mo38865b(String str) {
        String e = m46260e(str);
        if (TextUtils.isEmpty(e)) {
            return null;
        }
        return e.split("\n");
    }

    /* renamed from: c */
    public final void mo38866c(String str) {
        if (this.f52358d != null && this.f52358d.containsKey(str)) {
            this.f52358d.remove(str);
        }
        m46262g(str, null);
        super.mo38866c(str);
    }

    /* renamed from: f */
    private static Map<String, String> m46261f(String str) throws JSONException {
        if (C9431p.m18664a(str)) {
            return new ConcurrentHashMap();
        }
        JSONObject jSONObject = new JSONObject(str);
        Iterator keys = jSONObject.keys();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            concurrentHashMap.put(str2, (String) jSONObject.get(str2));
        }
        return concurrentHashMap;
    }

    /* renamed from: a */
    private String m46258a(byte[] bArr) {
        if (f52354h != null && Arrays.equals(bArr, (byte[]) f52354h.first)) {
            return (String) f52354h.second;
        }
        if (f52355i != null && Arrays.equals(bArr, (byte[]) f52355i.second)) {
            return (String) f52355i.first;
        }
        String str = null;
        try {
            String b = m46259b();
            byte[] decode = Base64.decode(bArr, 0);
            SecureRandom secureRandom = new SecureRandom();
            Key a = C19021c.m46257a(b.getBytes());
            Cipher instance = Cipher.getInstance("DES");
            instance.init(2, a, secureRandom);
            str = new String(instance.doFinal(decode), "UTF-8");
        } catch (Throwable unused) {
        }
        if (str != null) {
            f52354h = new Pair<>(bArr, str);
        }
        return str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public byte[] mo38880d(String str) {
        if (f52355i != null && C9431p.m18665a(str, (String) f52355i.first)) {
            return (byte[]) f52355i.second;
        }
        if (f52354h != null && C9431p.m18665a(str, (String) f52354h.second)) {
            return (byte[]) f52354h.first;
        }
        byte[] bArr = null;
        try {
            String b = m46259b();
            SecureRandom secureRandom = new SecureRandom();
            Key a = C19021c.m46257a(b.getBytes());
            Cipher instance = Cipher.getInstance("DES");
            instance.init(1, a, secureRandom);
            bArr = Base64.encode(instance.doFinal(str.getBytes("UTF-8")), 0);
        } catch (Throwable unused) {
        }
        if (bArr != null) {
            f52355i = new Pair<>(str, bArr);
        }
        return bArr;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:28|(1:30)|(2:32|33)|34|35|36) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:16|17|18|19|(6:20|21|(2:23|(2:26|(6:28|(1:30)|(2:32|33)|34|35|36)(8:38|39|40|(1:42)|(2:44|45)|46|47|48)))|50|(1:52)|(2:54|55))|56|57|88) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:38|39|40|(1:42)|(2:44|45)|46|47|48) */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x00ee, code lost:
        if (r2 == null) goto L_0x00f1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0087 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00a3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x00b7 */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d3 A[SYNTHETIC, Splitter:B:70:0x00d3] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d8 A[SYNTHETIC, Splitter:B:74:0x00d8] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00eb A[SYNTHETIC, Splitter:B:84:0x00eb] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m46260e(java.lang.String r7) {
        /*
            r6 = this;
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r7)
            if (r0 != 0) goto L_0x0013
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.f52358d
            if (r0 == 0) goto L_0x0013
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.f52358d
            java.lang.Object r7 = r0.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L_0x0013:
            java.lang.String r0 = "mounted"
            java.lang.String r1 = r6.f52356a
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 != 0) goto L_0x001f
            return r1
        L_0x001f:
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x00dc, all -> 0x00c4 }
            java.lang.String r2 = r6.f52357b     // Catch:{ Exception -> 0x00dc, all -> 0x00c4 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x00dc, all -> 0x00c4 }
            boolean r0 = r0.exists()     // Catch:{ Exception -> 0x00dc, all -> 0x00c4 }
            if (r0 != 0) goto L_0x0038
            java.util.Map<java.lang.String, java.lang.String> r7 = r6.f52358d
            if (r7 != 0) goto L_0x0037
            java.util.concurrent.ConcurrentHashMap r7 = new java.util.concurrent.ConcurrentHashMap
            r7.<init>()
            r6.f52358d = r7
        L_0x0037:
            return r1
        L_0x0038:
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x00dc, all -> 0x00c4 }
            java.lang.String r2 = r6.mo38879a()     // Catch:{ Exception -> 0x00dc, all -> 0x00c4 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x00dc, all -> 0x00c4 }
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x00dc, all -> 0x00c4 }
            java.lang.String r3 = "rwd"
            r2.<init>(r0, r3)     // Catch:{ Exception -> 0x00dc, all -> 0x00c4 }
            java.nio.channels.FileChannel r3 = r2.getChannel()     // Catch:{ Exception -> 0x00c2, all -> 0x00c0 }
            java.nio.channels.FileLock r3 = r3.lock()     // Catch:{ Exception -> 0x00c2, all -> 0x00c0 }
            boolean r0 = r0.isFile()     // Catch:{ Exception -> 0x00be, all -> 0x00bb }
            if (r0 == 0) goto L_0x00a7
            r0 = 2049(0x801, float:2.871E-42)
            byte[] r4 = new byte[r0]     // Catch:{ Exception -> 0x00be, all -> 0x00bb }
            r5 = 0
            int r5 = r2.read(r4, r5, r0)     // Catch:{ Exception -> 0x00be, all -> 0x00bb }
            if (r5 <= 0) goto L_0x00a7
            if (r5 >= r0) goto L_0x00a7
            byte[] r0 = java.util.Arrays.copyOf(r4, r5)     // Catch:{ Exception -> 0x00be, all -> 0x00bb }
            java.lang.String r0 = r6.m46258a(r0)     // Catch:{ Exception -> 0x00be, all -> 0x00bb }
            java.util.Map r0 = m46261f(r0)     // Catch:{ Exception -> 0x00be, all -> 0x00bb }
            r6.f52358d = r0     // Catch:{ Exception -> 0x00be, all -> 0x00bb }
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r7)     // Catch:{ Exception -> 0x00be, all -> 0x00bb }
            if (r0 == 0) goto L_0x008b
            java.util.Map<java.lang.String, java.lang.String> r7 = r6.f52358d
            if (r7 != 0) goto L_0x0082
            java.util.concurrent.ConcurrentHashMap r7 = new java.util.concurrent.ConcurrentHashMap
            r7.<init>()
            r6.f52358d = r7
        L_0x0082:
            if (r3 == 0) goto L_0x0087
            r3.release()     // Catch:{ Exception -> 0x0087 }
        L_0x0087:
            r2.close()     // Catch:{ Exception -> 0x008a }
        L_0x008a:
            return r1
        L_0x008b:
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.f52358d     // Catch:{ Exception -> 0x00be, all -> 0x00bb }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ Exception -> 0x00be, all -> 0x00bb }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x00be, all -> 0x00bb }
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.f52358d
            if (r0 != 0) goto L_0x009e
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r6.f52358d = r0
        L_0x009e:
            if (r3 == 0) goto L_0x00a3
            r3.release()     // Catch:{ Exception -> 0x00a3 }
        L_0x00a3:
            r2.close()     // Catch:{ Exception -> 0x00a6 }
        L_0x00a6:
            return r7
        L_0x00a7:
            java.util.Map<java.lang.String, java.lang.String> r7 = r6.f52358d
            if (r7 != 0) goto L_0x00b2
            java.util.concurrent.ConcurrentHashMap r7 = new java.util.concurrent.ConcurrentHashMap
            r7.<init>()
            r6.f52358d = r7
        L_0x00b2:
            if (r3 == 0) goto L_0x00b7
            r3.release()     // Catch:{ Exception -> 0x00b7 }
        L_0x00b7:
            r2.close()     // Catch:{ Exception -> 0x00f1 }
            goto L_0x00f1
        L_0x00bb:
            r7 = move-exception
            r1 = r3
            goto L_0x00c6
        L_0x00be:
            goto L_0x00de
        L_0x00c0:
            r7 = move-exception
            goto L_0x00c6
        L_0x00c2:
            r3 = r1
            goto L_0x00de
        L_0x00c4:
            r7 = move-exception
            r2 = r1
        L_0x00c6:
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.f52358d
            if (r0 != 0) goto L_0x00d1
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r6.f52358d = r0
        L_0x00d1:
            if (r1 == 0) goto L_0x00d6
            r1.release()     // Catch:{ Exception -> 0x00d6 }
        L_0x00d6:
            if (r2 == 0) goto L_0x00db
            r2.close()     // Catch:{ Exception -> 0x00db }
        L_0x00db:
            throw r7
        L_0x00dc:
            r2 = r1
            r3 = r2
        L_0x00de:
            java.util.Map<java.lang.String, java.lang.String> r7 = r6.f52358d
            if (r7 != 0) goto L_0x00e9
            java.util.concurrent.ConcurrentHashMap r7 = new java.util.concurrent.ConcurrentHashMap
            r7.<init>()
            r6.f52358d = r7
        L_0x00e9:
            if (r3 == 0) goto L_0x00ee
            r3.release()     // Catch:{ Exception -> 0x00ee }
        L_0x00ee:
            if (r2 == 0) goto L_0x00f1
            goto L_0x00b7
        L_0x00f1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.deviceregister.p1155b.p1156a.p1157a.C19022d.m46260e(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo38863a(String str, String str2) {
        m46262g(str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo38864a(String str, String[] strArr) {
        if (strArr != null) {
            mo38863a(str, TextUtils.join("\n", strArr));
        }
    }

    /* renamed from: g */
    private void m46262g(String str, String str2) {
        if (this.f52358d == null) {
            m46260e(null);
            if (this.f52358d == null) {
                this.f52358d = new ConcurrentHashMap();
            }
        }
        if (!C9431p.m18665a((String) this.f52358d.get(str), str2)) {
            if (TextUtils.isEmpty(str2) && this.f52358d.containsKey(str)) {
                this.f52358d.remove(str);
            } else if (!TextUtils.isEmpty(str2)) {
                this.f52358d.put(str, str2);
            }
            if (this.f52361g && this.f52359e.compareAndSet(false, true)) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    public final void run() {
                        C9393e.submitRunnable(new C19024a());
                    }
                }, 1000);
            }
        }
    }

    public C19022d(Context context, boolean z, String str) {
        this.f52357b = str;
        this.f52361g = z;
        this.f52360f = context;
    }
}
