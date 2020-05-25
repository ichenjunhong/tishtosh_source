package com.p683ss.android.ugc.aweme.compliance.businesses.commentfilter.p1605c;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.compliance.businesses.commentfilter.p1607ui.CommentFilterActivity;
import com.p683ss.android.ugc.aweme.p1706fe.utils.C29973d;
import com.p683ss.android.ugc.aweme.setting.serverpush.C41683a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.compliance.businesses.commentfilter.c.a */
public final class C27037a implements C41683a {

    /* renamed from: a */
    public static final C27037a f71357a = new C27037a();

    /* renamed from: com.ss.android.ugc.aweme.compliance.businesses.commentfilter.c.a$a */
    public static final class C27038a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C29973d f71358a;

        /* renamed from: b */
        final /* synthetic */ String f71359b;

        /* renamed from: c */
        final /* synthetic */ Activity f71360c;

        public C27038a(C29973d dVar, String str, Activity activity) {
            this.f71358a = dVar;
            this.f71359b = str;
            this.f71360c = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C29973d dVar = this.f71358a;
            StringBuilder sb = new StringBuilder("settings_times_");
            sb.append(this.f71359b);
            String sb2 = sb.toString();
            C29973d dVar2 = this.f71358a;
            StringBuilder sb3 = new StringBuilder("settings_times_");
            sb3.append(this.f71359b);
            String a = dVar2.mo60150a(sb3.toString(), "0");
            C52711k.m112236a((Object) a, "storage.get(SETTING_TIMES_KEY + uid, \"0\")");
            dVar.mo60154b(sb2, String.valueOf(Integer.parseInt(a) + 1));
            this.f71360c.startActivity(new Intent(this.f71360c, CommentFilterActivity.class));
            C26890h.m65011a("enter_filter_comment", new C23089d().mo47829a("enter_from", "comment_panel").f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.businesses.commentfilter.c.a$b */
    public static final class C27039b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C29973d f71361a;

        /* renamed from: b */
        final /* synthetic */ String f71362b;

        public C27039b(C29973d dVar, String str) {
            this.f71361a = dVar;
            this.f71362b = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C29973d dVar = this.f71361a;
            StringBuilder sb = new StringBuilder("not_now_times_");
            sb.append(this.f71362b);
            String sb2 = sb.toString();
            C29973d dVar2 = this.f71361a;
            StringBuilder sb3 = new StringBuilder("not_now_times_");
            sb3.append(this.f71362b);
            String a = dVar2.mo60150a(sb3.toString(), "0");
            C52711k.m112236a((Object) a, "storage.get(NOT_NOW_TIMES_KEY + uid, \"0\")");
            dVar.mo60154b(sb2, String.valueOf(Integer.parseInt(a) + 1));
            dialogInterface.dismiss();
        }
    }

    private C27037a() {
    }

    /* renamed from: a */
    public final void mo47083a(Exception exc) {
        C52711k.m112240b(exc, "e");
    }

    /* renamed from: a */
    public final boolean mo47084a() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0081, code lost:
        if (r0.mo60148a(r2.toString(), java.lang.Boolean.valueOf(false)).booleanValue() == false) goto L_0x0083;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47082a(com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c r6) {
        /*
            r5 = this;
            java.lang.String r0 = "settings"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            com.ss.android.ugc.aweme.fe.utils.d r0 = com.p683ss.android.ugc.aweme.p1706fe.utils.C29973d.m70118a()
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r2 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.String r1 = r1.getCurUserId()
            com.ss.android.ugc.aweme.IAccountUserService r2 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r3 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            boolean r2 = r2.isLogin()
            if (r2 == 0) goto L_0x0157
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0157
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "settings_times_"
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = ""
            java.lang.String r2 = r0.mo60150a(r2, r3)
            java.lang.String r3 = ""
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r3)
            r3 = 0
            if (r2 != 0) goto L_0x0083
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "not_now_times_"
            r2.<init>(r4)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = ""
            java.lang.String r2 = r0.mo60150a(r2, r4)
            java.lang.String r4 = ""
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r4)
            if (r2 != 0) goto L_0x0083
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "comment_filter_function_open_"
            r2.<init>(r4)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            java.lang.Boolean r2 = r0.mo60148a(r2, r4)
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x00bf
        L_0x0083:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "settings_times_"
            r2.<init>(r4)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "0"
            r0.mo60154b(r2, r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "not_now_times_"
            r2.<init>(r4)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "0"
            r0.mo60154b(r2, r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "comment_filter_function_open_"
            r2.<init>(r4)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            r4 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.mo60152b(r2, r4)
        L_0x00bf:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "comment_filter_function_open_"
            r2.<init>(r4)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            java.lang.Boolean r2 = r0.mo60148a(r2, r4)
            java.lang.String r4 = "storage.get(COMMENT_FILT…_OPEN + \"_\" + uid, false)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0140
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "comment_filter_status_"
            r2.<init>(r4)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r2 = r0.mo60149a(r2, r3)
            if (r2 != 0) goto L_0x00f9
            goto L_0x0140
        L_0x00f9:
            int r2 = r2.intValue()
            if (r2 != 0) goto L_0x0140
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "comment_filter_status_"
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            int r3 = r6.f105469L
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.mo60153b(r2, r3)
            int r2 = r6.f105469L
            if (r2 <= 0) goto L_0x0140
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "settings_times_"
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "1"
            r0.mo60154b(r2, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "not_now_times_"
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "2"
            r0.mo60154b(r2, r3)
        L_0x0140:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "comment_offensive_filter_"
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            int r6 = r6.f105470M
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.mo60153b(r1, r6)
        L_0x0157:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.compliance.businesses.commentfilter.p1605c.C27037a.mo47082a(com.ss.android.ugc.aweme.setting.serverpush.a.c):void");
    }
}
