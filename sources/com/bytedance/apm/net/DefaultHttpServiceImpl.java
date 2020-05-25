package com.bytedance.apm.net;

import com.bytedance.apm.p501q.C9182d;
import com.bytedance.services.apm.api.C13219b;
import com.bytedance.services.apm.api.IHttpService;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class DefaultHttpServiceImpl implements IHttpService {
    private static String METHOD_GET = "GET";
    private static String METHOD_POST = "POST";

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        if (inputStream != null) {
            inputStream.close();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public C13219b doGet(String str, Map<String, String> map) throws Exception {
        return doRequest(str, null, METHOD_GET, map);
    }

    public C13219b doPost(String str, byte[] bArr, Map<String, String> map) throws Exception {
        return doRequest(str, bArr, METHOD_POST, map);
    }

    public C13219b uploadFiles(String str, List<File> list, Map<String, String> map) throws Exception {
        return C9182d.m18227a(str, list, map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ee A[SYNTHETIC, Splitter:B:67:0x00ee] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00f5 A[SYNTHETIC, Splitter:B:71:0x00f5] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00fd A[SYNTHETIC, Splitter:B:78:0x00fd] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0104 A[SYNTHETIC, Splitter:B:82:0x0104] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bytedance.services.apm.api.C13219b doRequest(java.lang.String r6, byte[] r7, java.lang.String r8, java.util.Map<java.lang.String, java.lang.String> r9) throws java.lang.Exception {
        /*
            r5 = this;
            if (r8 == 0) goto L_0x0108
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ Throwable -> 0x00f9, all -> 0x00ea }
            r1.<init>(r6)     // Catch:{ Throwable -> 0x00f9, all -> 0x00ea }
            java.net.URLConnection r6 = r1.openConnection()     // Catch:{ Throwable -> 0x00f9, all -> 0x00ea }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ Throwable -> 0x00f9, all -> 0x00ea }
            r1 = 5000(0x1388, float:7.006E-42)
            r6.setConnectTimeout(r1)     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            r6.setReadTimeout(r1)     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            if (r9 == 0) goto L_0x0056
            boolean r1 = r9.isEmpty()     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            if (r1 != 0) goto L_0x0056
            java.util.Set r9 = r9.entrySet()     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
        L_0x0026:
            boolean r1 = r9.hasNext()     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            if (r1 == 0) goto L_0x0056
            java.lang.Object r1 = r9.next()     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            if (r1 == 0) goto L_0x0026
            java.lang.Object r2 = r1.getKey()     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            r3 = r6
            java.net.URLConnection r3 = (java.net.URLConnection) r3     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            boolean r4 = com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g.m46160a(r3)     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            if (r4 == 0) goto L_0x0052
            java.net.URL r3 = r3.getURL()     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            java.lang.String r4 = ""
            com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b.m46151a(r3, r2, r1, r4)     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
        L_0x0052:
            r6.setRequestProperty(r2, r1)     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            goto L_0x0026
        L_0x0056:
            java.lang.String r9 = METHOD_POST     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            boolean r9 = android.text.TextUtils.equals(r8, r9)     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            if (r9 == 0) goto L_0x0063
            r9 = 1
            r6.setDoOutput(r9)     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            goto L_0x0067
        L_0x0063:
            r9 = 0
            r6.setDoOutput(r9)     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
        L_0x0067:
            r6.setRequestMethod(r8)     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            if (r7 == 0) goto L_0x0081
            int r8 = r7.length     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            if (r8 <= 0) goto L_0x0081
            java.io.DataOutputStream r8 = new java.io.DataOutputStream     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            java.io.OutputStream r9 = r6.getOutputStream()     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            r8.<init>(r9)     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            r8.write(r7)     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            r8.flush()     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            r8.close()     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
        L_0x0081:
            int r7 = r6.getResponseCode()     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            r8 = 200(0xc8, float:2.8E-43)
            if (r7 != r8) goto L_0x00db
            r8 = r6
            java.net.URLConnection r8 = (java.net.URLConnection) r8     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            boolean r9 = com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g.m46160a(r8)     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            if (r9 == 0) goto L_0x009d
            java.net.URL r9 = r8.getURL()     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            java.lang.String r8 = r8.getContentType()     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b.m46151a(r9, r0, r0, r8)     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
        L_0x009d:
            java.io.InputStream r8 = r6.getInputStream()     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            java.lang.String r9 = r6.getContentEncoding()     // Catch:{ Throwable -> 0x00d9, all -> 0x00d6 }
            boolean r1 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x00d9, all -> 0x00d6 }
            if (r1 != 0) goto L_0x00c0
            java.lang.String r1 = "gzip"
            boolean r9 = r9.equalsIgnoreCase(r1)     // Catch:{ Throwable -> 0x00d9, all -> 0x00d6 }
            if (r9 == 0) goto L_0x00c0
            java.util.zip.GZIPInputStream r9 = new java.util.zip.GZIPInputStream     // Catch:{ Throwable -> 0x00d9, all -> 0x00d6 }
            r9.<init>(r8)     // Catch:{ Throwable -> 0x00d9, all -> 0x00d6 }
            byte[] r1 = toByteArray(r9)     // Catch:{ Throwable -> 0x00d9, all -> 0x00d6 }
            r9.close()     // Catch:{ Throwable -> 0x00d9, all -> 0x00d6 }
            goto L_0x00c4
        L_0x00c0:
            byte[] r1 = toByteArray(r8)     // Catch:{ Throwable -> 0x00d9, all -> 0x00d6 }
        L_0x00c4:
            com.bytedance.services.apm.api.b r9 = new com.bytedance.services.apm.api.b     // Catch:{ Throwable -> 0x00d9, all -> 0x00d6 }
            r9.<init>(r7, r1)     // Catch:{ Throwable -> 0x00d9, all -> 0x00d6 }
            if (r8 == 0) goto L_0x00d0
            r8.close()     // Catch:{ Exception -> 0x00cf }
            goto L_0x00d0
        L_0x00cf:
        L_0x00d0:
            if (r6 == 0) goto L_0x00d5
            r6.disconnect()     // Catch:{ Exception -> 0x00d5 }
        L_0x00d5:
            return r9
        L_0x00d6:
            r7 = move-exception
            r0 = r8
            goto L_0x00ec
        L_0x00d9:
            goto L_0x00fb
        L_0x00db:
            com.bytedance.services.apm.api.b r8 = new com.bytedance.services.apm.api.b     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            r8.<init>(r7, r0)     // Catch:{ Throwable -> 0x00e8, all -> 0x00e6 }
            if (r6 == 0) goto L_0x00e5
            r6.disconnect()     // Catch:{ Exception -> 0x00e5 }
        L_0x00e5:
            return r8
        L_0x00e6:
            r7 = move-exception
            goto L_0x00ec
        L_0x00e8:
            r8 = r0
            goto L_0x00fb
        L_0x00ea:
            r7 = move-exception
            r6 = r0
        L_0x00ec:
            if (r0 == 0) goto L_0x00f3
            r0.close()     // Catch:{ Exception -> 0x00f2 }
            goto L_0x00f3
        L_0x00f2:
        L_0x00f3:
            if (r6 == 0) goto L_0x00f8
            r6.disconnect()     // Catch:{ Exception -> 0x00f8 }
        L_0x00f8:
            throw r7
        L_0x00f9:
            r6 = r0
            r8 = r6
        L_0x00fb:
            if (r8 == 0) goto L_0x0102
            r8.close()     // Catch:{ Exception -> 0x0101 }
            goto L_0x0102
        L_0x0101:
        L_0x0102:
            if (r6 == 0) goto L_0x0107
            r6.disconnect()     // Catch:{ Exception -> 0x0107 }
        L_0x0107:
            return r0
        L_0x0108:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "request method is not null"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.net.DefaultHttpServiceImpl.doRequest(java.lang.String, byte[], java.lang.String, java.util.Map):com.bytedance.services.apm.api.b");
    }
}
