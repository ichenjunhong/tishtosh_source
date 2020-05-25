package com.bytedance.android.live.core.p230g;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore.Audio;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;

/* renamed from: com.bytedance.android.live.core.g.ag */
public final class C3869ag {
    /* renamed from: a */
    public static String m9803a(Context context, Uri uri) {
        boolean z;
        if (VERSION.SDK_INT >= 19) {
            z = true;
        } else {
            z = false;
        }
        Uri uri2 = null;
        if (!z || !DocumentsContract.isDocumentUri(context, uri)) {
            if (C42311c.f106865i.equalsIgnoreCase(uri.getScheme())) {
                if ("com.google.android.apps.photos.content".equals(uri.getAuthority())) {
                    return uri.getLastPathSegment();
                }
                return m9804a(context, uri, null, null);
            } else if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        } else if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
            String[] split = DocumentsContract.getDocumentId(uri).split(":");
            if ("primary".equalsIgnoreCase(split[0])) {
                StringBuilder sb = new StringBuilder();
                sb.append(Environment.getExternalStorageDirectory());
                sb.append("/");
                sb.append(split[1]);
                return sb.toString();
            }
        } else if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
            return m9804a(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
        } else if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
            String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
            String str = split2[0];
            if ("image".equals(str)) {
                uri2 = Media.EXTERNAL_CONTENT_URI;
            } else if ("video".equals(str)) {
                uri2 = Video.Media.EXTERNAL_CONTENT_URI;
            } else if ("audio".equals(str)) {
                uri2 = Audio.Media.EXTERNAL_CONTENT_URI;
            }
            return m9804a(context, uri2, "_id=?", new String[]{split2[1]});
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m9804a(android.content.Context r7, android.net.Uri r8, java.lang.String r9, java.lang.String[] r10) {
        /*
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r0 = "_data"
            r1 = 0
            r3[r1] = r0
            r0 = 0
            android.content.ContentResolver r1 = r7.getContentResolver()     // Catch:{ all -> 0x0035 }
            r6 = 0
            r2 = r8
            r4 = r9
            r5 = r10
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0035 }
            if (r7 == 0) goto L_0x002f
            boolean r8 = r7.moveToFirst()     // Catch:{ all -> 0x002d }
            if (r8 == 0) goto L_0x002f
            java.lang.String r8 = "_data"
            int r8 = r7.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x002d }
            java.lang.String r8 = r7.getString(r8)     // Catch:{ all -> 0x002d }
            if (r7 == 0) goto L_0x002c
            r7.close()
        L_0x002c:
            return r8
        L_0x002d:
            r8 = move-exception
            goto L_0x0037
        L_0x002f:
            if (r7 == 0) goto L_0x0034
            r7.close()
        L_0x0034:
            return r0
        L_0x0035:
            r8 = move-exception
            r7 = r0
        L_0x0037:
            if (r7 == 0) goto L_0x003c
            r7.close()
        L_0x003c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.p230g.C3869ag.m9804a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }
}
