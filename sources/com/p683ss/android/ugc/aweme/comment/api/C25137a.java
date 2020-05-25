package com.p683ss.android.ugc.aweme.comment.api;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.common.utility.C9415i;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.api.a */
public final class C25137a {

    /* renamed from: a */
    public static final C25137a f66580a = new C25137a();

    /* renamed from: com.ss.android.ugc.aweme.comment.api.a$a */
    static final class C25138a implements OnClickListener {

        /* renamed from: a */
        public static final C25138a f66581a = new C25138a();

        C25138a() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    private C25137a() {
    }

    /* renamed from: a */
    public static final boolean m61051a(Context context, Exception exc, int i) {
        return m61052a(context, exc, i, false);
    }

    /* renamed from: a */
    private void m61049a(Context context, int i) {
        C52711k.m112240b(context, "context");
        if (i != 0) {
            String string = context.getResources().getString(i);
            C52711k.m112236a((Object) string, "msg");
            m61050a(context, string);
        }
    }

    /* renamed from: a */
    private static void m61050a(Context context, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "msg");
        try {
            C10691a.m21545b(context, str).mo19066a();
        } catch (Exception e) {
            C9415i.m18634a((Throwable) e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ef, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fa, code lost:
        if (android.text.TextUtils.isEmpty(r0.getPrompt()) != false) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fc, code lost:
        r5 = r0.getPrompt();
        p2628d.p2639f.p2641b.C52711k.m112236a((java.lang.Object) r5, "exception.prompt");
        m61050a(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0113, code lost:
        if (android.text.TextUtils.isEmpty(r0.getErrorMsg()) != false) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0115, code lost:
        r5 = r0.getErrorMsg();
        p2628d.p2639f.p2641b.C52711k.m112236a((java.lang.Object) r5, "exception.errorMsg");
        m61050a(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0122, code lost:
        f66580a.m61049a(r4, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0127, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0159, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m61052a(android.content.Context r4, java.lang.Exception r5, int r6, boolean r7) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x004c }
            r0.<init>()     // Catch:{ Exception -> 0x004c }
            java.lang.String r1 = "url"
            java.lang.String r2 = "comment/publish"
            r0.put(r1, r2)     // Catch:{ Exception -> 0x004c }
            java.lang.String r1 = "errorCode"
            boolean r2 = r5 instanceof com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a     // Catch:{ Exception -> 0x004c }
            if (r2 != 0) goto L_0x0014
            r2 = 0
            goto L_0x0015
        L_0x0014:
            r2 = r5
        L_0x0015:
            com.ss.android.ugc.aweme.base.api.a.b.a r2 = (com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a) r2     // Catch:{ Exception -> 0x004c }
            if (r2 == 0) goto L_0x0022
            int r2 = r2.getErrorCode()     // Catch:{ Exception -> 0x004c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x004c }
            goto L_0x0026
        L_0x0022:
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x004c }
        L_0x0026:
            r0.put(r1, r2)     // Catch:{ Exception -> 0x004c }
            boolean r1 = r5 instanceof com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a     // Catch:{ Exception -> 0x004c }
            if (r1 == 0) goto L_0x0045
            java.lang.String r1 = "prompt"
            r2 = r5
            com.ss.android.ugc.aweme.base.api.a.b.a r2 = (com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a) r2     // Catch:{ Exception -> 0x004c }
            java.lang.String r2 = r2.getPrompt()     // Catch:{ Exception -> 0x004c }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x004c }
            java.lang.String r1 = "errorDesc"
            r2 = r5
            com.ss.android.ugc.aweme.base.api.a.b.a r2 = (com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a) r2     // Catch:{ Exception -> 0x004c }
            java.lang.String r2 = r2.getErrorMsg()     // Catch:{ Exception -> 0x004c }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x004c }
        L_0x0045:
            java.lang.String r1 = "api_error_web_return_log"
            java.lang.String r2 = ""
            com.p683ss.android.ugc.aweme.base.C23569o.m57783b(r1, r2, r0)     // Catch:{ Exception -> 0x004c }
        L_0x004c:
            if (r4 != 0) goto L_0x0052
            android.content.Context r4 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
        L_0x0052:
            boolean r0 = r5 instanceof com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a
            r1 = 0
            if (r0 != 0) goto L_0x005d
            com.ss.android.ugc.aweme.comment.api.a r5 = f66580a
            r5.m61049a(r4, r6)
            return r1
        L_0x005d:
            r0 = r5
            com.ss.android.ugc.aweme.base.api.a.b.a r0 = (com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a) r0
            int r2 = r0.getErrorCode()
            r3 = 1
            switch(r2) {
                case 8: goto L_0x0128;
                case 9: goto L_0x00f0;
                default: goto L_0x0068;
            }
        L_0x0068:
            switch(r2) {
                case 2055: goto L_0x00f0;
                case 2056: goto L_0x00f0;
                default: goto L_0x006b;
            }
        L_0x006b:
            switch(r2) {
                case 2146: goto L_0x00f0;
                case 2147: goto L_0x00f0;
                case 2148: goto L_0x00f0;
                default: goto L_0x006e;
            }
        L_0x006e:
            switch(r2) {
                case 3055: goto L_0x00f0;
                case 3056: goto L_0x00f0;
                case 3057: goto L_0x00f0;
                case 3058: goto L_0x00ef;
                case 3059: goto L_0x00ef;
                default: goto L_0x0071;
            }
        L_0x0071:
            switch(r2) {
                case 5051: goto L_0x00f0;
                case 5052: goto L_0x00f0;
                case 5053: goto L_0x00f0;
                case 5054: goto L_0x00f0;
                case 5055: goto L_0x00f0;
                case 5056: goto L_0x00f0;
                case 5057: goto L_0x00f0;
                default: goto L_0x0074;
            }
        L_0x0074:
            switch(r2) {
                case 5: goto L_0x00f0;
                case 13: goto L_0x00f0;
                case 19: goto L_0x00f0;
                case 22: goto L_0x00f0;
                case 100: goto L_0x00f0;
                case 1001: goto L_0x00b4;
                case 2053: goto L_0x00f0;
                case 2084: goto L_0x00f0;
                case 2152: goto L_0x00f0;
                case 2155: goto L_0x00ef;
                case 2209: goto L_0x00f0;
                case 2554: goto L_0x00f0;
                case 3050: goto L_0x00f0;
                case 3220: goto L_0x00f0;
                case 5049: goto L_0x00f0;
                default: goto L_0x0077;
            }
        L_0x0077:
            if (r7 == 0) goto L_0x0159
            java.lang.String r5 = r0.getPrompt()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0093
            java.lang.String r5 = r0.getPrompt()
            java.lang.String r6 = "exception.prompt"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            m61050a(r4, r5)
            goto L_0x0159
        L_0x0093:
            java.lang.String r5 = r0.getErrorMsg()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x00ad
            java.lang.String r5 = r0.getErrorMsg()
            java.lang.String r6 = "exception.errorMsg"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            m61050a(r4, r5)
            goto L_0x0159
        L_0x00ad:
            com.ss.android.ugc.aweme.comment.api.a r5 = f66580a
            r5.m61049a(r4, r6)
            goto L_0x0159
        L_0x00b4:
            com.bytedance.ies.uikit.dialog.b$a r6 = new com.bytedance.ies.uikit.dialog.b$a     // Catch:{ Exception -> 0x00ee }
            r6.<init>(r4)     // Catch:{ Exception -> 0x00ee }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ee }
            r7.<init>()     // Catch:{ Exception -> 0x00ee }
            com.ss.android.ugc.aweme.base.api.a.b.a r5 = (com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a) r5     // Catch:{ Exception -> 0x00ee }
            java.lang.String r5 = r5.getErrorMsg()     // Catch:{ Exception -> 0x00ee }
            r7.append(r5)     // Catch:{ Exception -> 0x00ee }
            java.lang.String r5 = ","
            r7.append(r5)     // Catch:{ Exception -> 0x00ee }
            r5 = 2132546579(0x7f1c1413, float:2.074638E38)
            java.lang.String r4 = r4.getString(r5)     // Catch:{ Exception -> 0x00ee }
            r7.append(r4)     // Catch:{ Exception -> 0x00ee }
            java.lang.String r4 = r7.toString()     // Catch:{ Exception -> 0x00ee }
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ Exception -> 0x00ee }
            com.bytedance.ies.uikit.dialog.b$a r4 = r6.mo20146b(r4)     // Catch:{ Exception -> 0x00ee }
            r5 = 2132547199(0x7f1c167f, float:2.0747637E38)
            com.ss.android.ugc.aweme.comment.api.a$a r6 = com.p683ss.android.ugc.aweme.comment.api.C25137a.C25138a.f66581a     // Catch:{ Exception -> 0x00ee }
            android.content.DialogInterface$OnClickListener r6 = (android.content.DialogInterface.OnClickListener) r6     // Catch:{ Exception -> 0x00ee }
            com.bytedance.ies.uikit.dialog.b$a r4 = r4.mo20136a(r5, r6)     // Catch:{ Exception -> 0x00ee }
            r4.mo20148b()     // Catch:{ Exception -> 0x00ee }
        L_0x00ee:
            return r3
        L_0x00ef:
            return r1
        L_0x00f0:
            java.lang.String r5 = r0.getPrompt()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0109
            java.lang.String r5 = r0.getPrompt()
            java.lang.String r6 = "exception.prompt"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            m61050a(r4, r5)
            goto L_0x0127
        L_0x0109:
            java.lang.String r5 = r0.getErrorMsg()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0122
            java.lang.String r5 = r0.getErrorMsg()
            java.lang.String r6 = "exception.errorMsg"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            m61050a(r4, r5)
            goto L_0x0127
        L_0x0122:
            com.ss.android.ugc.aweme.comment.api.a r5 = f66580a
            r5.m61049a(r4, r6)
        L_0x0127:
            return r3
        L_0x0128:
            android.app.Activity r5 = com.bytedance.ies.ugc.p694a.C11016e.m22312g()
            if (r5 == 0) goto L_0x0151
            android.content.Context r4 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r5 = 2132542996(0x7f1c0614, float:2.0739113E38)
            java.lang.String r4 = r4.getString(r5)
            android.app.Activity r5 = com.bytedance.ies.ugc.p694a.C11016e.m22312g()
            java.lang.String r6 = "comment_net_exception"
            java.lang.String r7 = "system_auto"
            com.ss.android.ugc.aweme.utils.ab r0 = com.p683ss.android.ugc.aweme.utils.C47661ab.m103163a()
            java.lang.String r2 = "login_title"
            com.ss.android.ugc.aweme.utils.ab r4 = r0.mo94972a(r2, r4)
            android.os.Bundle r4 = r4.f120139a
            com.p683ss.android.ugc.aweme.login.C27965f.m66720a(r5, r6, r7, r4)
            goto L_0x0159
        L_0x0151:
            com.ss.android.ugc.aweme.comment.api.a r5 = f66580a
            r6 = 2132551731(0x7f1c2833, float:2.075683E38)
            r5.m61049a(r4, r6)
        L_0x0159:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.api.C25137a.m61052a(android.content.Context, java.lang.Exception, int, boolean):boolean");
    }
}
