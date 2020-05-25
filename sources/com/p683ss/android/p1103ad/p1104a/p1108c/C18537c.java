package com.p683ss.android.p1103ad.p1104a.p1108c;

import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.ss.android.ad.a.c.c */
public final class C18537c {
    /* renamed from: a */
    private static String m44855a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                byteArrayOutputStream.close();
                return byteArrayOutputStream2;
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x00da */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d4 A[SYNTHETIC, Splitter:B:48:0x00d4] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f5 A[SYNTHETIC, Splitter:B:68:0x00f5] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p683ss.android.p1103ad.p1104a.p1105a.p1106a.C18515a m44854a(java.lang.String r6, java.util.HashMap<java.lang.String, java.lang.String> r7, java.lang.String r8, int r9) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.net.URL r0 = new java.net.URL     // Catch:{ SocketTimeoutException -> 0x00d8, IOException -> 0x00cb, all -> 0x00c8 }
            r0.<init>(r6)     // Catch:{ SocketTimeoutException -> 0x00d8, IOException -> 0x00cb, all -> 0x00c8 }
            java.net.URLConnection r6 = r0.openConnection()     // Catch:{ SocketTimeoutException -> 0x00d8, IOException -> 0x00cb, all -> 0x00c8 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ SocketTimeoutException -> 0x00d8, IOException -> 0x00cb, all -> 0x00c8 }
            java.lang.String r0 = "POST"
            r6.setRequestMethod(r0)     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
            double r2 = (double) r9
            r4 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            java.lang.Double.isNaN(r2)
            double r4 = r4 * r2
            long r4 = java.lang.Math.round(r4)     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
            int r9 = (int) r4
            r4 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            java.lang.Double.isNaN(r2)
            double r2 = r2 * r4
            long r2 = java.lang.Math.round(r2)     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
            int r0 = (int) r2     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
            r6.setReadTimeout(r9)     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
            r6.setConnectTimeout(r0)     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
            r9 = 1
            r6.setDoOutput(r9)     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
            java.util.Set r7 = r7.entrySet()     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
        L_0x0049:
            boolean r9 = r7.hasNext()     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
            if (r9 == 0) goto L_0x0077
            java.lang.Object r9 = r7.next()     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
            java.lang.Object r0 = r9.getKey()     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
            java.lang.Object r9 = r9.getValue()     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
            r2 = r6
            java.net.URLConnection r2 = (java.net.URLConnection) r2     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
            boolean r3 = com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g.m46160a(r2)     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
            if (r3 == 0) goto L_0x0073
            java.net.URL r2 = r2.getURL()     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
            java.lang.String r3 = ""
            com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b.m46151a(r2, r0, r9, r3)     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
        L_0x0073:
            r6.setRequestProperty(r0, r9)     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
            goto L_0x0049
        L_0x0077:
            java.io.OutputStream r7 = r6.getOutputStream()     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
            byte[] r8 = r8.getBytes()     // Catch:{ SocketTimeoutException -> 0x00da, IOException -> 0x00c0 }
            r7.write(r8)     // Catch:{ SocketTimeoutException -> 0x00da, IOException -> 0x00c0 }
            r7.flush()     // Catch:{ SocketTimeoutException -> 0x00da, IOException -> 0x00c0 }
            r7.close()     // Catch:{ SocketTimeoutException -> 0x00da, IOException -> 0x00c0 }
            int r7 = r6.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
            int r8 = r6.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
            r9 = 400(0x190, float:5.6E-43)
            if (r8 < r9) goto L_0x0099
            java.io.InputStream r8 = r6.getErrorStream()     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
            goto L_0x00b1
        L_0x0099:
            r8 = r6
            java.net.URLConnection r8 = (java.net.URLConnection) r8     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
            boolean r9 = com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g.m46160a(r8)     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
            if (r9 == 0) goto L_0x00ad
            java.net.URL r9 = r8.getURL()     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
            java.lang.String r8 = r8.getContentType()     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
            com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b.m46151a(r9, r1, r1, r8)     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
        L_0x00ad:
            java.io.InputStream r8 = r6.getInputStream()     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
        L_0x00b1:
            java.lang.String r8 = m44855a(r8)     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
            com.ss.android.ad.a.a.a.a r9 = new com.ss.android.ad.a.a.a.a     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
            r9.<init>(r8, r7)     // Catch:{ SocketTimeoutException -> 0x00c6, IOException -> 0x00c4, all -> 0x00c2 }
            if (r6 == 0) goto L_0x00bf
            r6.disconnect()
        L_0x00bf:
            return r9
        L_0x00c0:
            goto L_0x00cd
        L_0x00c2:
            r7 = move-exception
            goto L_0x00ee
        L_0x00c4:
            r7 = r1
            goto L_0x00cd
        L_0x00c6:
            r7 = r1
            goto L_0x00da
        L_0x00c8:
            r7 = move-exception
            r6 = r1
            goto L_0x00ee
        L_0x00cb:
            r6 = r1
            r7 = r6
        L_0x00cd:
            if (r6 == 0) goto L_0x00d2
            r6.disconnect()
        L_0x00d2:
            if (r7 == 0) goto L_0x00d7
            r7.close()     // Catch:{ Exception -> 0x00d7 }
        L_0x00d7:
            return r1
        L_0x00d8:
            r6 = r1
            r7 = r6
        L_0x00da:
            com.ss.android.ad.a.a.a.a r8 = new com.ss.android.ad.a.a.a.a     // Catch:{ all -> 0x00eb }
            r9 = -1
            r8.<init>(r1, r9)     // Catch:{ all -> 0x00eb }
            if (r6 == 0) goto L_0x00e5
            r6.disconnect()
        L_0x00e5:
            if (r7 == 0) goto L_0x00ea
            r7.close()     // Catch:{ Exception -> 0x00ea }
        L_0x00ea:
            return r8
        L_0x00eb:
            r8 = move-exception
            r1 = r7
            r7 = r8
        L_0x00ee:
            if (r6 == 0) goto L_0x00f3
            r6.disconnect()
        L_0x00f3:
            if (r1 == 0) goto L_0x00f8
            r1.close()     // Catch:{ Exception -> 0x00f8 }
        L_0x00f8:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.p1103ad.p1104a.p1108c.C18537c.m44854a(java.lang.String, java.util.HashMap, java.lang.String, int):com.ss.android.ad.a.a.a.a");
    }
}
