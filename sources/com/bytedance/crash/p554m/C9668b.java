package com.bytedance.crash.p554m;

import android.text.TextUtils;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.p555n.C9695g;
import com.bytedance.crash.p555n.C9697i;
import com.bytedance.frameworks.core.p577a.C9925b;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.Deflater;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.m.b */
public class C9668b {

    /* renamed from: a */
    public static boolean f26378a;

    /* renamed from: b */
    private static C9677e f26379b;

    /* renamed from: com.bytedance.crash.m.b$a */
    public enum C9669a {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        

        /* renamed from: a */
        final int f26381a;

        private C9669a(int i) {
            this.f26381a = i;
        }
    }

    /* renamed from: com.bytedance.crash.m.b$b */
    public enum C9670b {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);
        

        /* renamed from: a */
        final int f26383a;

        public final int getValue() {
            return this.f26383a;
        }

        private C9670b(int i) {
            this.f26383a = i;
        }
    }

    /* renamed from: a */
    private static byte[] m19288a(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(VideoCacheReadBuffersizeExperiment.DEFAULT);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            gZIPOutputStream.close();
            throw th;
        }
    }

    /* renamed from: a */
    public static boolean m19286a(String str, String str2, String str3, String str4, List<String> list) {
        try {
            C9679g gVar = new C9679g(str, "UTF-8", false);
            gVar.mo17528a("aid", str2);
            gVar.mo17528a("device_id", str3);
            gVar.mo17528a("os", "Android");
            gVar.mo17528a("process_name", str4);
            for (String file : list) {
                File file2 = new File(file);
                if (file2.exists()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("logtype", "alog");
                    hashMap.put("scene", "崩溃");
                    gVar.mo17527a(file2.getName(), file2, hashMap);
                }
            }
            try {
                if (new JSONObject(gVar.mo17526a()).optInt("errno", -1) == 200) {
                    return true;
                }
            } catch (JSONException unused) {
            }
            return false;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* renamed from: a */
    private static byte[] m19287a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                try {
                    return byteArrayOutputStream.toByteArray();
                } finally {
                    C9697i.m19370a((Closeable) byteArrayOutputStream);
                }
            }
        }
    }

    /* renamed from: a */
    public static String m19283a() {
        return C9616k.m19156h().f26292e;
    }

    /* renamed from: b */
    public static String m19292b(Map map) {
        return m19284a(C9616k.m19156h().f26290c, map);
    }

    /* renamed from: a */
    public static C9683j m19278a(C9681i iVar) {
        if (iVar == null) {
            return new C9683j(201);
        }
        try {
            return m19277a(2097152, iVar.f26398a, iVar.f26402e, C9669a.GZIP, "application/json; charset=utf-8", iVar.f26401d);
        } catch (Throwable th) {
            return new C9683j(207, th);
        }
    }

    /* renamed from: b */
    private static C9683j m19290b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new C9683j(203);
        }
        String str = new String(bArr, Charset.forName("utf-8"));
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.length() > 0) {
                return new C9683j(0, jSONObject);
            }
            return new C9683j(204, str);
        } catch (JSONException unused) {
            return new C9683j(204, str);
        }
    }

    /* renamed from: a */
    public static String m19285a(Map map) {
        return m19284a(C9616k.m19156h().f26289b, map);
    }

    /* renamed from: a */
    public static C9683j m19279a(String str, String str2) {
        return m19281a(str, str2, true);
    }

    /* renamed from: b */
    private static String m19291b(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    private static String m19284a(String str, Map map) {
        if (TextUtils.isDigitsOnly(str) || map == null || map.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (!str.contains("?")) {
            sb.append("?");
        }
        try {
            for (Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    if (!sb.toString().endsWith("?")) {
                        sb.append("&");
                    }
                    sb.append(m19291b(entry.getKey().toString(), "UTF-8"));
                    sb.append("=");
                    sb.append(m19291b(entry.getValue().toString(), "UTF-8"));
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: a */
    public static C9683j m19281a(String str, String str2, boolean z) {
        try {
            if (!TextUtils.isEmpty(str2)) {
                if (!TextUtils.isEmpty(str)) {
                    return m19277a(2097152, str, str2.getBytes(), C9669a.GZIP, "application/json; charset=utf-8", z);
                }
            }
            return new C9683j(201);
        } catch (Throwable th) {
            return new C9683j(207, th);
        }
    }

    /* renamed from: a */
    public static C9683j m19280a(String str, String str2, File file) {
        try {
            C9679g gVar = new C9679g(str, "UTF-8", true);
            gVar.mo17528a("json", str2);
            File parentFile = file.getParentFile();
            String name = parentFile.getName();
            StringBuilder sb = new StringBuilder();
            sb.append("--");
            sb.append(gVar.f26392a);
            sb.append("\r\nContent-Disposition: form-data; name=\"");
            sb.append("file");
            sb.append("\"; filename=\"");
            sb.append(name);
            sb.append("\"\r\n");
            sb.append("Content-Transfer-Encoding: binary\r\n");
            sb.append("\r\n");
            if (gVar.f26393b) {
                gVar.f26395d.write(sb.toString().getBytes());
            } else {
                gVar.f26394c.write(sb.toString().getBytes());
            }
            if (gVar.f26393b) {
                C9695g.m19354a((OutputStream) gVar.f26395d, parentFile);
            } else {
                FileInputStream fileInputStream = new FileInputStream(parentFile);
                byte[] bArr = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    gVar.f26394c.write(bArr, 0, read);
                }
                fileInputStream.close();
            }
            if (gVar.f26393b) {
                gVar.f26395d.write("\r\n".getBytes());
            } else {
                gVar.f26394c.write(sb.toString().getBytes());
                gVar.f26394c.flush();
            }
            try {
                return new C9683j(0, new JSONObject(gVar.mo17526a()));
            } catch (JSONException e) {
                return new C9683j(0, (Throwable) e);
            }
        } catch (IOException unused) {
            return new C9683j(207);
        }
    }

    /* renamed from: a */
    private static C9683j m19277a(long j, String str, byte[] bArr, C9669a aVar, String str2, boolean z) throws IOException {
        String str3;
        byte[] bArr2;
        String str4;
        if (str == null) {
            return new C9683j(201);
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        String str5 = null;
        if (C9669a.GZIP == aVar && length > 128) {
            bArr = m19288a(bArr);
            str5 = "gzip";
        } else if (C9669a.DEFLATER == aVar && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(VideoCacheReadBuffersizeExperiment.DEFAULT);
            Deflater deflater = new Deflater();
            deflater.setInput(bArr);
            deflater.finish();
            byte[] bArr3 = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
            while (!deflater.finished()) {
                byteArrayOutputStream.write(bArr3, 0, deflater.deflate(bArr3));
            }
            deflater.end();
            bArr = byteArrayOutputStream.toByteArray();
            str5 = "deflate";
        }
        byte[] bArr4 = bArr;
        String str6 = str5;
        if (bArr4 == null) {
            return new C9683j(202);
        }
        if (z) {
            byte[] a = C9925b.m19906a(bArr4, bArr4.length);
            if (a != null) {
                if (TextUtils.isEmpty(new URL(str).getQuery())) {
                    if (!str.endsWith("?")) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append("?");
                        str = sb.toString();
                    }
                } else if (!str.endsWith("&")) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append("&");
                    str = sb2.toString();
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append("tt_data=a");
                String sb4 = sb3.toString();
                bArr2 = a;
                str4 = sb4;
                str3 = "application/octet-stream;tt-data=a";
            } else {
                str4 = str;
                str3 = str2;
                bArr2 = bArr4;
            }
            return m19282a(str4, bArr2, str3, str6, "POST", true, true);
        }
        return m19282a(str, bArr4, str2, str6, "POST", true, false);
    }

    /* renamed from: a */
    private static C9683j m19282a(String str, byte[] bArr, String str2, String str3, String str4, boolean z, boolean z2) {
        return m19289b(str, bArr, str2, str3, str4, true, z2);
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r6v12, types: [java.util.zip.GZIPInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r4.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x011d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x011e, code lost:
        r5 = r4;
        r4 = 0;
        r0 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000c */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x012d A[SYNTHETIC, Splitter:B:102:0x012d] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0013 A[Catch:{ Throwable -> 0x0121, all -> 0x011d }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x013a A[SYNTHETIC, Splitter:B:110:0x013a] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001d A[Catch:{ Throwable -> 0x0121, all -> 0x011d }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a A[SYNTHETIC, Splitter:B:14:0x002a] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0059 A[Catch:{ Throwable -> 0x0051, all -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005e A[Catch:{ Throwable -> 0x0051, all -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0064 A[Catch:{ Throwable -> 0x0051, all -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006b A[Catch:{ Throwable -> 0x0051, all -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0079 A[Catch:{ Throwable -> 0x0051, all -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0115 A[SYNTHETIC, Splitter:B:92:0x0115] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x011d A[ExcHandler: all (r4v6 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0001] */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.crash.p554m.C9683j m19289b(java.lang.String r4, byte[] r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9, boolean r10) {
        /*
            r0 = 0
            com.bytedance.crash.m.e r1 = f26379b     // Catch:{ Throwable -> 0x0121, all -> 0x011d }
            if (r1 == 0) goto L_0x000c
            com.bytedance.crash.m.e r1 = f26379b     // Catch:{ Throwable -> 0x000c, all -> 0x011d }
            java.lang.String r1 = r1.mo17524a(r4, r5)     // Catch:{ Throwable -> 0x000c, all -> 0x011d }
            r4 = r1
        L_0x000c:
            java.util.LinkedList r1 = new java.util.LinkedList     // Catch:{ Throwable -> 0x0121, all -> 0x011d }
            r1.<init>()     // Catch:{ Throwable -> 0x0121, all -> 0x011d }
            if (r10 == 0) goto L_0x001d
            java.net.URL r2 = new java.net.URL     // Catch:{ Throwable -> 0x0121, all -> 0x011d }
            java.lang.String r4 = com.bytedance.frameworks.core.p577a.C9923a.m19898a(r4, r1)     // Catch:{ Throwable -> 0x0121, all -> 0x011d }
            r2.<init>(r4)     // Catch:{ Throwable -> 0x0121, all -> 0x011d }
            goto L_0x0022
        L_0x001d:
            java.net.URL r2 = new java.net.URL     // Catch:{ Throwable -> 0x0121, all -> 0x011d }
            r2.<init>(r4)     // Catch:{ Throwable -> 0x0121, all -> 0x011d }
        L_0x0022:
            java.net.URLConnection r4 = r2.openConnection()     // Catch:{ Throwable -> 0x0121, all -> 0x011d }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ Throwable -> 0x0121, all -> 0x011d }
            if (r10 == 0) goto L_0x0057
            boolean r10 = r1.isEmpty()     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            if (r10 != 0) goto L_0x0057
            java.util.Iterator r10 = r1.iterator()     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
        L_0x0034:
            boolean r1 = r10.hasNext()     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            if (r1 == 0) goto L_0x0057
            java.lang.Object r1 = r10.next()     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            if (r1 == 0) goto L_0x0034
            java.lang.Object r2 = r1.first     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            java.lang.Object r1 = r1.second     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            com.bytedance.crash.p554m.C9671c.m19293a(r4, r2, r1)     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            goto L_0x0034
        L_0x004e:
            r5 = move-exception
            goto L_0x0138
        L_0x0051:
            r5 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
            goto L_0x0124
        L_0x0057:
            if (r9 == 0) goto L_0x005e
            r9 = 1
            r4.setDoOutput(r9)     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            goto L_0x0062
        L_0x005e:
            r9 = 0
            r4.setDoOutput(r9)     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
        L_0x0062:
            if (r6 == 0) goto L_0x0069
            java.lang.String r9 = "Content-Type"
            com.bytedance.crash.p554m.C9671c.m19293a(r4, r9, r6)     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
        L_0x0069:
            if (r7 == 0) goto L_0x0070
            java.lang.String r6 = "Content-Encoding"
            com.bytedance.crash.p554m.C9671c.m19293a(r4, r6, r7)     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
        L_0x0070:
            java.lang.String r6 = "Accept-Encoding"
            java.lang.String r7 = "gzip"
            com.bytedance.crash.p554m.C9671c.m19293a(r4, r6, r7)     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            if (r8 == 0) goto L_0x0115
            r4.setRequestMethod(r8)     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            if (r5 == 0) goto L_0x009c
            int r6 = r5.length     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            if (r6 <= 0) goto L_0x009c
            java.io.DataOutputStream r6 = new java.io.DataOutputStream     // Catch:{ all -> 0x0096 }
            java.io.OutputStream r7 = r4.getOutputStream()     // Catch:{ all -> 0x0096 }
            r6.<init>(r7)     // Catch:{ all -> 0x0096 }
            r6.write(r5)     // Catch:{ all -> 0x0094 }
            r6.flush()     // Catch:{ all -> 0x0094 }
            com.bytedance.crash.p555n.C9697i.m19370a(r6)     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            goto L_0x009c
        L_0x0094:
            r5 = move-exception
            goto L_0x0098
        L_0x0096:
            r5 = move-exception
            r6 = r0
        L_0x0098:
            com.bytedance.crash.p555n.C9697i.m19370a(r6)     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            throw r5     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
        L_0x009c:
            int r5 = r4.getResponseCode()     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 != r6) goto L_0x00f7
            r5 = r4
            java.net.URLConnection r5 = (java.net.URLConnection) r5     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            boolean r6 = com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g.m46160a(r5)     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            if (r6 == 0) goto L_0x00b8
            java.net.URL r6 = r5.getURL()     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            java.lang.String r5 = r5.getContentType()     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b.m46151a(r6, r0, r0, r5)     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
        L_0x00b8:
            java.io.InputStream r5 = r4.getInputStream()     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            java.lang.String r6 = r4.getContentEncoding()     // Catch:{ Throwable -> 0x00f2, all -> 0x00ee }
            java.lang.String r7 = "gzip"
            boolean r6 = r7.equalsIgnoreCase(r6)     // Catch:{ Throwable -> 0x00f2, all -> 0x00ee }
            if (r6 == 0) goto L_0x00dd
            java.util.zip.GZIPInputStream r6 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x00d8 }
            r6.<init>(r5)     // Catch:{ all -> 0x00d8 }
            byte[] r7 = m19287a(r6)     // Catch:{ all -> 0x00d5 }
            com.bytedance.crash.p555n.C9697i.m19370a(r6)     // Catch:{ Throwable -> 0x00f2, all -> 0x00ee }
            goto L_0x00e1
        L_0x00d5:
            r7 = move-exception
            r0 = r6
            goto L_0x00d9
        L_0x00d8:
            r7 = move-exception
        L_0x00d9:
            com.bytedance.crash.p555n.C9697i.m19370a(r0)     // Catch:{ Throwable -> 0x00f2, all -> 0x00ee }
            throw r7     // Catch:{ Throwable -> 0x00f2, all -> 0x00ee }
        L_0x00dd:
            byte[] r7 = m19287a(r5)     // Catch:{ Throwable -> 0x00f2, all -> 0x00ee }
        L_0x00e1:
            com.bytedance.crash.m.j r6 = m19290b(r7)     // Catch:{ Throwable -> 0x00f2, all -> 0x00ee }
            if (r4 == 0) goto L_0x00ea
            r4.disconnect()     // Catch:{ Exception -> 0x00ea }
        L_0x00ea:
            com.bytedance.crash.p555n.C9697i.m19370a(r5)
            return r6
        L_0x00ee:
            r6 = move-exception
            r0 = r5
            r5 = r6
            goto L_0x0138
        L_0x00f2:
            r6 = move-exception
            r0 = r4
            r4 = r5
            r5 = r6
            goto L_0x0124
        L_0x00f7:
            com.bytedance.crash.m.j r6 = new com.bytedance.crash.m.j     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            r7 = 206(0xce, float:2.89E-43)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            java.lang.String r9 = "http response code "
            r8.<init>(r9)     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            r8.append(r5)     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            java.lang.String r5 = r8.toString()     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            r6.<init>(r7, r5)     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            if (r4 == 0) goto L_0x0111
            r4.disconnect()     // Catch:{ Exception -> 0x0111 }
        L_0x0111:
            com.bytedance.crash.p555n.C9697i.m19370a(r0)
            return r6
        L_0x0115:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            java.lang.String r6 = "request method is not null"
            r5.<init>(r6)     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            throw r5     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
        L_0x011d:
            r4 = move-exception
            r5 = r4
            r4 = r0
            goto L_0x0138
        L_0x0121:
            r4 = move-exception
            r5 = r4
            r4 = r0
        L_0x0124:
            com.bytedance.crash.m.j r6 = new com.bytedance.crash.m.j     // Catch:{ all -> 0x0134 }
            r7 = 207(0xcf, float:2.9E-43)
            r6.<init>(r7, r5)     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x0130
            r0.disconnect()     // Catch:{ Exception -> 0x0130 }
        L_0x0130:
            com.bytedance.crash.p555n.C9697i.m19370a(r4)
            return r6
        L_0x0134:
            r5 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
        L_0x0138:
            if (r4 == 0) goto L_0x013d
            r4.disconnect()     // Catch:{ Exception -> 0x013d }
        L_0x013d:
            com.bytedance.crash.p555n.C9697i.m19370a(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p554m.C9668b.m19289b(java.lang.String, byte[], java.lang.String, java.lang.String, java.lang.String, boolean, boolean):com.bytedance.crash.m.j");
    }
}
