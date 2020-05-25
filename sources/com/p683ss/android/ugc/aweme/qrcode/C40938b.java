package com.p683ss.android.ugc.aweme.qrcode;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.qrcode.b */
public final class C40938b {
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m90529a(java.lang.String r10) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = -1
            int r2 = r10.hashCode()
            r3 = 8
            r4 = 7
            r5 = 5
            r6 = 3
            r7 = 1
            r8 = 2
            r9 = 4
            switch(r2) {
                case -677145915: goto L_0x0069;
                case -400675352: goto L_0x005f;
                case -186119313: goto L_0x0055;
                case 3322092: goto L_0x004b;
                case 3599307: goto L_0x0041;
                case 104263205: goto L_0x0037;
                case 112202875: goto L_0x002d;
                case 1402633315: goto L_0x0023;
                case 1948294547: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x0074
        L_0x0019:
            java.lang.String r2 = "sticker_detail"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x0074
            r10 = 7
            goto L_0x0075
        L_0x0023:
            java.lang.String r2 = "challenge"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x0074
            r10 = 1
            goto L_0x0075
        L_0x002d:
            java.lang.String r2 = "video"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x0074
            r10 = 2
            goto L_0x0075
        L_0x0037:
            java.lang.String r2 = "music"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x0074
            r10 = 3
            goto L_0x0075
        L_0x0041:
            java.lang.String r2 = "user"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x0074
            r10 = 0
            goto L_0x0075
        L_0x004b:
            java.lang.String r2 = "live"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x0074
            r10 = 4
            goto L_0x0075
        L_0x0055:
            java.lang.String r2 = "bodydancelist"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x0074
            r10 = 6
            goto L_0x0075
        L_0x005f:
            java.lang.String r2 = "poilist"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x0074
            r10 = 5
            goto L_0x0075
        L_0x0069:
            java.lang.String r2 = "forward"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x0074
            r10 = 8
            goto L_0x0075
        L_0x0074:
            r10 = -1
        L_0x0075:
            switch(r10) {
                case 0: goto L_0x0085;
                case 1: goto L_0x0084;
                case 2: goto L_0x0083;
                case 3: goto L_0x0082;
                case 4: goto L_0x0081;
                case 5: goto L_0x0080;
                case 6: goto L_0x007f;
                case 7: goto L_0x007c;
                case 8: goto L_0x0079;
                default: goto L_0x0078;
            }
        L_0x0078:
            return r1
        L_0x0079:
            r10 = 19
            return r10
        L_0x007c:
            r10 = 17
            return r10
        L_0x007f:
            return r3
        L_0x0080:
            return r4
        L_0x0081:
            return r5
        L_0x0082:
            return r6
        L_0x0083:
            return r7
        L_0x0084:
            return r8
        L_0x0085:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.qrcode.C40938b.m90529a(java.lang.String):int");
    }

    /* renamed from: a */
    public static String m90530a(int i, String str) {
        if (i == 17) {
            return "sticker_detail";
        }
        if (i != 23) {
            switch (i) {
                case 1:
                    return "video";
                case 2:
                    break;
                case 3:
                    return "music";
                case 4:
                    if (TextUtils.equals(C20902b.m53242a().getCurUserId(), str)) {
                        return "personal_homepage";
                    }
                    return "others_homepage";
                case 5:
                    return CustomActionPushReceiver.f104061f;
                default:
                    switch (i) {
                        case 7:
                            return "poi_page";
                        case 8:
                            return "bodydance_detail";
                        case 9:
                            return "shoot";
                        default:
                            return "text";
                    }
            }
        }
        return "challenge";
    }

    /* renamed from: a */
    public static int m90528a(int i, String str, String str2) {
        if (i == 4 && TextUtils.equals(C20902b.m53242a().getCurUserId(), str)) {
            return R.string.cfd;
        }
        return R.string.d2_;
    }
}
