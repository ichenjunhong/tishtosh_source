package com.p683ss.android.ugc.aweme.app;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.share.p2150b.C41992b;

/* renamed from: com.ss.android.ugc.aweme.app.be */
public final class C23050be extends C23138r {
    public C23050be(Context context) {
        super(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m56566c(android.net.Uri r5) {
        /*
            java.lang.String r0 = r5.getHost()
            java.lang.String r1 = r5.toString()
            java.lang.String r2 = "schema_type"
            java.lang.String r1 = com.p683ss.android.ugc.aweme.router.C41312z.m91072b(r1, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x001d
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x001d }
            r2 = r1
            r1 = 1
            goto L_0x001f
        L_0x001d:
            r1 = 0
            r2 = 0
        L_0x001f:
            if (r1 != 0) goto L_0x0076
            java.lang.String r1 = "amemv.com"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x0049
            java.lang.String r1 = "douyin.com"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x0049
            java.lang.String r1 = "tiktok.com"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x0049
            java.lang.String r1 = "tiktokv.com"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x0049
            java.lang.String r1 = "musical.ly"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0076
        L_0x0049:
            java.util.List r5 = r5.getPathSegments()
            boolean r0 = com.bytedance.common.utility.p522b.C9376b.m18558a(r5)
            if (r0 != 0) goto L_0x0076
            int r0 = r5.size()
            r1 = 3
            if (r0 < r1) goto L_0x0076
            java.lang.Object r0 = r5.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "share"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x0076
            java.lang.Object r0 = r5.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 2
            r5.get(r1)
            int r2 = com.p683ss.android.ugc.aweme.qrcode.C40938b.m90529a(r0)
        L_0x0076:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.app.C23050be.m56566c(android.net.Uri):int");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Uri mo47771a(Uri uri) {
        Uri uri2 = null;
        if (uri.toString().contains("microapp") || uri.toString().contains("microgame")) {
            String b = C41992b.m91957b(uri.toString());
            if (TextUtils.isEmpty(b) || TextUtils.equals(uri.toString(), b)) {
                return m56565b(uri);
            }
            uri2 = Uri.parse(b);
            if (uri.getBooleanQueryParameter("backurl", false)) {
                Builder buildUpon = uri2.buildUpon();
                buildUpon.appendQueryParameter("backurl", uri.getQueryParameter("backurl"));
                uri2 = buildUpon.build();
            }
        } else if (TextUtils.isEmpty(uri.getQueryParameter("redirect_url"))) {
            return m56565b(uri);
        } else {
            try {
                return Uri.parse(uri.getQueryParameter("redirect_url"));
            } catch (Exception unused) {
            }
        }
        return uri2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009c, code lost:
        if (m56566c(r10) == 16) goto L_0x0139;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.net.Uri m56565b(android.net.Uri r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.getPath()
            r10.getQueryParameterNames()
            java.lang.String r1 = "/h5/share/"
            boolean r1 = r0.startsWith(r1)     // Catch:{ Exception -> 0x0047 }
            if (r1 == 0) goto L_0x0016
            java.lang.String r1 = "/h5/share/"
            java.lang.String r1 = m56564a(r10, r1)     // Catch:{ Exception -> 0x0047 }
            goto L_0x0048
        L_0x0016:
            java.lang.String r1 = "/share/"
            boolean r1 = r0.startsWith(r1)     // Catch:{ Exception -> 0x0047 }
            if (r1 == 0) goto L_0x0025
            java.lang.String r1 = "/share/"
            java.lang.String r1 = m56564a(r10, r1)     // Catch:{ Exception -> 0x0047 }
            goto L_0x0048
        L_0x0025:
            java.lang.String r1 = "/i18n/share/"
            boolean r1 = r0.startsWith(r1)     // Catch:{ Exception -> 0x0047 }
            if (r1 == 0) goto L_0x0034
            java.lang.String r1 = "/i18n/share/"
            java.lang.String r1 = m56564a(r10, r1)     // Catch:{ Exception -> 0x0047 }
            goto L_0x0048
        L_0x0034:
            java.lang.String r1 = "/redirect"
            boolean r1 = r0.startsWith(r1)     // Catch:{ Exception -> 0x0047 }
            if (r1 == 0) goto L_0x0047
            java.lang.String r1 = "redirect_url"
            java.lang.String r1 = r10.getQueryParameter(r1)     // Catch:{ Exception -> 0x0047 }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x0047 }
            return r1
        L_0x0047:
            r1 = 0
        L_0x0048:
            r2 = -1
            java.util.List r3 = r10.getPathSegments()
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0075
            int r6 = r3.size()
            if (r6 <= r5) goto L_0x0075
            int r6 = r3.size()
            int r6 = r6 - r5
            java.lang.Object r3 = r3.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r6 = "."
            int r6 = r3.indexOf(r6)
            if (r6 <= 0) goto L_0x0077
            java.lang.String r6 = "."
            int r6 = r3.indexOf(r6)
            java.lang.String r3 = r3.substring(r4, r6)
            goto L_0x0077
        L_0x0075:
            java.lang.String r3 = ""
        L_0x0077:
            r6 = 9
            r7 = 16
            r8 = 6
            if (r1 == 0) goto L_0x013b
            java.lang.String r0 = "usr"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0139
            java.lang.String r0 = "user"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x0090
            goto L_0x0139
        L_0x0090:
            java.lang.String r0 = "invite"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a0
            int r0 = m56566c(r10)
            if (r0 != r7) goto L_0x016a
            goto L_0x0139
        L_0x00a0:
            java.lang.String r0 = "video"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ab
            r2 = 0
            goto L_0x016a
        L_0x00ab:
            java.lang.String r0 = "tag"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b7
            r2 = 8
            goto L_0x016a
        L_0x00b7:
            java.lang.String r0 = "poilist"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00d7
            r2 = 11
            java.lang.String r0 = r10.toString()
            java.lang.String r1 = "object_id"
            java.lang.String r0 = com.p683ss.android.ugc.aweme.router.C41312z.m91072b(r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x00d4
        L_0x00d1:
            r3 = r0
            goto L_0x016a
        L_0x00d4:
            java.lang.String r0 = ""
            goto L_0x00d1
        L_0x00d7:
            java.lang.String r0 = "billboard"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e3
            r2 = 12
            goto L_0x016a
        L_0x00e3:
            java.lang.String r0 = "challenge"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ee
            r2 = 3
            goto L_0x016a
        L_0x00ee:
            java.lang.String r0 = "music"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00f9
            r2 = 4
            goto L_0x016a
        L_0x00f9:
            java.lang.String r0 = "stickers"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0104
            r2 = 5
            goto L_0x016a
        L_0x0104:
            java.lang.String r0 = "live"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x010e
            r2 = 1
            goto L_0x016a
        L_0x010e:
            java.lang.String r0 = "game"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0119
            r2 = 9
            goto L_0x016a
        L_0x0119:
            java.lang.String r0 = "mix"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0124
            r2 = 10
            goto L_0x016a
        L_0x0124:
            java.lang.String r0 = "commerce"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x016a
            int r0 = m56566c(r10)
            r1 = 23
            if (r0 != r1) goto L_0x016a
            r0 = 13
            r2 = 13
            goto L_0x016a
        L_0x0139:
            r2 = 6
            goto L_0x016a
        L_0x013b:
            java.lang.String r1 = "/v/"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x0145
            r2 = 7
            goto L_0x016a
        L_0x0145:
            java.lang.String r0 = r10.toString()
            java.lang.String r1 = "/falcon/rn/guardian_child"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0154
            r2 = 17
            goto L_0x016a
        L_0x0154:
            int r0 = m56566c(r10)
            r1 = 20
            if (r0 != r1) goto L_0x015f
            r2 = 14
            goto L_0x016a
        L_0x015f:
            r1 = 21
            if (r0 != r1) goto L_0x0166
            r2 = 15
            goto L_0x016a
        L_0x0166:
            if (r0 != r6) goto L_0x016a
            r2 = 16
        L_0x016a:
            android.net.Uri r10 = r9.mo47856a(r10, r2, r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.app.C23050be.m56565b(android.net.Uri):android.net.Uri");
    }

    /* renamed from: a */
    private static String m56564a(Uri uri, String str) {
        String path = uri.getPath();
        int indexOf = path.indexOf(str) + str.length();
        return path.substring(indexOf, path.indexOf("/", indexOf));
    }
}
