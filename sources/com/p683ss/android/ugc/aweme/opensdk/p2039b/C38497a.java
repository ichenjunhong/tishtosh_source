package com.p683ss.android.ugc.aweme.opensdk.p2039b;

import android.content.Context;
import android.net.Uri;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p2628d.p2638e.C52647c;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.opensdk.b.a */
public final class C38497a {

    /* renamed from: a */
    public static final C38497a f97938a = new C38497a();

    private C38497a() {
    }

    /* renamed from: a */
    private static void m85835a(InputStream inputStream, FileOutputStream fileOutputStream) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        C52711k.m112240b(inputStream, "inputStream");
        C52711k.m112240b(fileOutputStream, "outputStream");
        byte[] bArr = new byte[2048];
        Closeable closeable = inputStream;
        try {
            InputStream inputStream2 = (InputStream) closeable;
            Closeable closeable2 = fileOutputStream;
            try {
                FileOutputStream fileOutputStream2 = (FileOutputStream) closeable2;
                while (true) {
                    int read = inputStream2.read(bArr);
                    if (read > 0) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                        C52647c.m112189a(closeable2, null);
                        C52647c.m112189a(closeable, null);
                        inputStream.close();
                        return;
                    }
                }
            } catch (Throwable th4) {
                Throwable th5 = th4;
                th3 = r8;
                th2 = th5;
            }
            C52647c.m112189a(closeable2, th3);
            throw th2;
        } catch (Throwable th6) {
            C52647c.m112189a(closeable, th);
            throw th6;
        }
    }

    /* renamed from: a */
    public final String mo78406a(Context context, Uri uri) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(uri, "uri");
        if (C52830p.m112406a(C42311c.f106865i, uri.getScheme(), true)) {
            return m85833a(context, uri, null, null);
        }
        if (C52830p.m112406a("file", uri.getScheme(), true)) {
            return uri.getPath();
        }
        return null;
    }

    /* renamed from: a */
    private static void m85834a(Context context, Uri uri, File file) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(file, "dstFile");
        if (uri != null) {
            try {
                InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                if (openInputStream != null) {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    m85835a(openInputStream, fileOutputStream);
                    openInputStream.close();
                    fileOutputStream.close();
                }
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b A[SYNTHETIC, Splitter:B:20:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0074 A[Catch:{ all -> 0x0068 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ad  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m85833a(android.content.Context r18, android.net.Uri r19, java.lang.String r20, java.lang.String[] r21) {
        /*
            r17 = this;
            r0 = r19
            java.lang.String r7 = "_data"
            r8 = 1
            java.lang.String[] r3 = new java.lang.String[r8]
            r9 = 0
            r3[r9] = r7
            r10 = 0
            android.content.ContentResolver r1 = r18.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x0038, all -> 0x0034 }
            r4 = 0
            r5 = 0
            r6 = 0
            r2 = r19
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x0038, all -> 0x0034 }
            if (r1 == 0) goto L_0x002e
            boolean r2 = r1.moveToFirst()     // Catch:{ IllegalArgumentException -> 0x0039 }
            if (r2 == 0) goto L_0x002e
            int r2 = r1.getColumnIndexOrThrow(r7)     // Catch:{ IllegalArgumentException -> 0x0039 }
            java.lang.String r2 = r1.getString(r2)     // Catch:{ IllegalArgumentException -> 0x0039 }
            if (r1 == 0) goto L_0x002d
            r1.close()
        L_0x002d:
            return r2
        L_0x002e:
            if (r1 == 0) goto L_0x0033
            r1.close()
        L_0x0033:
            return r10
        L_0x0034:
            r0 = move-exception
            r1 = r10
            goto L_0x00ab
        L_0x0038:
            r1 = r10
        L_0x0039:
            if (r0 == 0) goto L_0x006a
            java.lang.String r2 = r19.getPath()     // Catch:{ all -> 0x0068 }
            if (r2 != 0) goto L_0x0042
            goto L_0x006a
        L_0x0042:
            r11 = r2
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11     // Catch:{ all -> 0x0068 }
            r12 = 47
            r13 = 0
            r14 = 0
            r15 = 6
            r16 = 0
            int r3 = p2628d.p2650m.C52830p.m112444b(r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0068 }
            r4 = -1
            if (r3 == r4) goto L_0x006a
            int r3 = r3 + r8
            if (r2 == 0) goto L_0x0060
            java.lang.String r2 = r2.substring(r3)     // Catch:{ all -> 0x0068 }
            java.lang.String r3 = "(this as java.lang.String).substring(startIndex)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ all -> 0x0068 }
            goto L_0x006b
        L_0x0060:
            d.u r0 = new d.u     // Catch:{ all -> 0x0068 }
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r2)     // Catch:{ all -> 0x0068 }
            throw r0     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r0 = move-exception
            goto L_0x00ab
        L_0x006a:
            r2 = r10
        L_0x006b:
            r3 = r2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x0068 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0068 }
            if (r3 != 0) goto L_0x00a5
            java.lang.String r3 = com.p683ss.android.ugc.aweme.share.p2151c.C41995a.f106294e     // Catch:{ all -> 0x0068 }
            boolean r3 = com.p683ss.android.ugc.aweme.video.C48016e.m103944b(r3)     // Catch:{ all -> 0x0068 }
            if (r3 != 0) goto L_0x0081
            java.lang.String r3 = com.p683ss.android.ugc.aweme.share.p2151c.C41995a.f106294e     // Catch:{ all -> 0x0068 }
            com.p683ss.android.ugc.aweme.video.C48016e.m103935a(r3, r9)     // Catch:{ all -> 0x0068 }
        L_0x0081:
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0068 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0068 }
            r4.<init>()     // Catch:{ all -> 0x0068 }
            java.lang.String r5 = com.p683ss.android.ugc.aweme.share.p2151c.C41995a.f106294e     // Catch:{ all -> 0x0068 }
            r4.append(r5)     // Catch:{ all -> 0x0068 }
            java.lang.String r5 = java.io.File.separator     // Catch:{ all -> 0x0068 }
            r4.append(r5)     // Catch:{ all -> 0x0068 }
            r4.append(r2)     // Catch:{ all -> 0x0068 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0068 }
            r3.<init>(r2)     // Catch:{ all -> 0x0068 }
            r2 = r18
            m85834a(r2, r0, r3)     // Catch:{ all -> 0x0068 }
            java.lang.String r10 = r3.getAbsolutePath()     // Catch:{ all -> 0x0068 }
        L_0x00a5:
            if (r1 == 0) goto L_0x00aa
            r1.close()
        L_0x00aa:
            return r10
        L_0x00ab:
            if (r1 == 0) goto L_0x00b0
            r1.close()
        L_0x00b0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.opensdk.p2039b.C38497a.m85833a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }
}
