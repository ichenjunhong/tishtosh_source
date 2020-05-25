package com.facebook.common.p927k;

import android.net.Uri;
import android.net.Uri.Builder;
import android.provider.ContactsContract;
import android.provider.MediaStore.Images.Media;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: com.facebook.common.k.f */
public final class C13731f {

    /* renamed from: a */
    public static final Uri f35721a = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo");

    /* renamed from: c */
    public static boolean m27779c(Uri uri) {
        return "file".equals(m27784h(uri));
    }

    /* renamed from: d */
    public static boolean m27780d(Uri uri) {
        return C42311c.f106865i.equals(m27784h(uri));
    }

    /* renamed from: f */
    public static boolean m27782f(Uri uri) {
        return "asset".equals(m27784h(uri));
    }

    /* renamed from: g */
    public static boolean m27783g(Uri uri) {
        return "res".equals(m27784h(uri));
    }

    /* renamed from: h */
    public static String m27784h(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    /* renamed from: a */
    public static Uri m27775a(int i) {
        return new Builder().scheme("res").path(String.valueOf(i)).build();
    }

    /* renamed from: b */
    public static boolean m27778b(Uri uri) {
        String h = m27784h(uri);
        if (WebKitApi.SCHEME_HTTPS.equals(h) || WebKitApi.SCHEME_HTTP.equals(h)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static URL m27777a(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: e */
    public static boolean m27781e(Uri uri) {
        String uri2 = uri.toString();
        if (uri2.startsWith(Media.EXTERNAL_CONTENT_URI.toString()) || uri2.startsWith(Media.INTERNAL_CONTENT_URI.toString())) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m27776a(android.content.ContentResolver r8, android.net.Uri r9) {
        /*
            boolean r0 = m27780d(r9)
            r1 = 0
            if (r0 == 0) goto L_0x0038
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0030 }
            if (r8 == 0) goto L_0x002a
            boolean r9 = r8.moveToFirst()     // Catch:{ all -> 0x0028 }
            if (r9 == 0) goto L_0x002a
            java.lang.String r9 = "_data"
            int r9 = r8.getColumnIndex(r9)     // Catch:{ all -> 0x0028 }
            r0 = -1
            if (r9 == r0) goto L_0x002a
            java.lang.String r9 = r8.getString(r9)     // Catch:{ all -> 0x0028 }
            r1 = r9
            goto L_0x002a
        L_0x0028:
            r9 = move-exception
            goto L_0x0032
        L_0x002a:
            if (r8 == 0) goto L_0x0042
            r8.close()
            goto L_0x0042
        L_0x0030:
            r9 = move-exception
            r8 = r1
        L_0x0032:
            if (r8 == 0) goto L_0x0037
            r8.close()
        L_0x0037:
            throw r9
        L_0x0038:
            boolean r8 = m27779c(r9)
            if (r8 == 0) goto L_0x0042
            java.lang.String r1 = r9.getPath()
        L_0x0042:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.p927k.C13731f.m27776a(android.content.ContentResolver, android.net.Uri):java.lang.String");
    }
}
