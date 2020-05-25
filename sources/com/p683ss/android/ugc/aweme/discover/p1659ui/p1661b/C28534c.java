package com.p683ss.android.ugc.aweme.discover.p1659ui.p1661b;

import android.app.Activity;
import android.content.Context;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.content.C0726c;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.C10722c;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28550bj;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.b.c */
public final class C28534c {

    /* renamed from: b */
    public static final C28535a f74989b = new C28535a(null);

    /* renamed from: a */
    public Context f74990a;

    /* renamed from: c */
    private C28550bj<?> f74991c;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.b.c$a */
    public static final class C28535a {
        private C28535a() {
        }

        public /* synthetic */ C28535a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.b.c$b */
    static final class C28536b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Fragment f74992a;

        /* renamed from: b */
        final /* synthetic */ String f74993b;

        C28536b(Fragment fragment, String str) {
            this.f74992a = fragment;
            this.f74993b = str;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C27965f.m66726a(this.f74992a, this.f74993b, "search_freq_control", (C23505g) C285371.f74994a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.b.c$c */
    public static final class C28538c extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C28534c f74995a;

        /* renamed from: b */
        final /* synthetic */ Activity f74996b;

        public final void updateDrawState(TextPaint textPaint) {
            C52711k.m112240b(textPaint, "ds");
            textPaint.setColor(C0726c.m2098c(this.f74995a.f74990a, R.color.su));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C52711k.m112240b(view, "widget");
            C18922i iVar = new C18922i("https://www.tiktok.com/community-guidelines");
            iVar.mo38778a("lang", C23794bh.m58378D().mo46907a(this.f74996b));
            SmartRouter.buildRoute((Context) this.f74996b, "//webview").withParam("url", iVar.mo38774a()).withParam("title", this.f74996b.getString(R.string.agg)).open();
        }

        C28538c(C28534c cVar, Activity activity) {
            this.f74995a = cVar;
            this.f74996b = activity;
        }
    }

    /* renamed from: a */
    public final C10722c mo58213a() {
        C10722c cVar = new C10723a(this.f74990a).mo19277a((int) R.drawable.ar0).mo19280b((int) R.string.f5w).mo19282c(R.string.f5x).mo19283d(C28531a.EMPTY.getType()).f28711a;
        C52711k.m112236a((Object) cVar, "DmtDefaultStatus.Builder…\n                .build()");
        return cVar;
    }

    public C28534c(Context context, C28550bj<?> bjVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(bjVar, "searchFragment");
        this.f74990a = context;
        this.f74991c = bjVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0136, code lost:
        if (r11 == null) goto L_0x0138;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0081 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x017e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bytedance.ies.dmt.p664ui.widget.C10722c m67701a(com.p683ss.android.ugc.aweme.discover.model.SearchApiResult r11, java.lang.Exception r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a
            if (r0 == 0) goto L_0x0015
            r1 = r12
            com.ss.android.ugc.aweme.base.api.a.b.a r1 = (com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a) r1
            int r1 = r1.getErrorCode()
            switch(r1) {
                case 2483: goto L_0x0012;
                case 2484: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0015
        L_0x000f:
            com.ss.android.ugc.aweme.discover.ui.b.a r1 = com.p683ss.android.ugc.aweme.discover.p1659ui.p1661b.C28531a.LIMIT
            goto L_0x006b
        L_0x0012:
            com.ss.android.ugc.aweme.discover.ui.b.a r1 = com.p683ss.android.ugc.aweme.discover.p1659ui.p1661b.C28531a.NEED_LOGIN
            goto L_0x006b
        L_0x0015:
            if (r12 == 0) goto L_0x0048
            java.lang.Throwable r1 = r12.getCause()
            if (r1 == 0) goto L_0x0048
            java.lang.Throwable r1 = r12.getCause()
            if (r1 != 0) goto L_0x0026
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0026:
            boolean r1 = r1 instanceof com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a
            if (r1 == 0) goto L_0x0048
            java.lang.Throwable r1 = r12.getCause()
            if (r1 == 0) goto L_0x0040
            com.ss.android.ugc.aweme.base.api.a.b.a r1 = (com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a) r1
            int r1 = r1.getErrorCode()
            switch(r1) {
                case 2483: goto L_0x003d;
                case 2484: goto L_0x003a;
                default: goto L_0x0039;
            }
        L_0x0039:
            goto L_0x0048
        L_0x003a:
            com.ss.android.ugc.aweme.discover.ui.b.a r1 = com.p683ss.android.ugc.aweme.discover.p1659ui.p1661b.C28531a.LIMIT
            goto L_0x006b
        L_0x003d:
            com.ss.android.ugc.aweme.discover.ui.b.a r1 = com.p683ss.android.ugc.aweme.discover.p1659ui.p1661b.C28531a.NEED_LOGIN
            goto L_0x006b
        L_0x0040:
            d.u r11 = new d.u
            java.lang.String r12 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException"
            r11.<init>(r12)
            throw r11
        L_0x0048:
            if (r11 == 0) goto L_0x0069
            com.ss.android.ugc.aweme.discover.model.SearchNilInfo r1 = r11.searchNilInfo
            if (r1 == 0) goto L_0x0069
            boolean r2 = r1.isHitCoreTable()
            if (r2 == 0) goto L_0x0057
            com.ss.android.ugc.aweme.discover.ui.b.a r1 = com.p683ss.android.ugc.aweme.discover.p1659ui.p1661b.C28531a.HIT_CORE_TABLE
            goto L_0x006b
        L_0x0057:
            boolean r2 = r1.isSensitive()
            if (r2 == 0) goto L_0x0060
            com.ss.android.ugc.aweme.discover.ui.b.a r1 = com.p683ss.android.ugc.aweme.discover.p1659ui.p1661b.C28531a.SENSITIVE
            goto L_0x006b
        L_0x0060:
            boolean r1 = r1.isHitLimit()
            if (r1 == 0) goto L_0x0069
            com.ss.android.ugc.aweme.discover.ui.b.a r1 = com.p683ss.android.ugc.aweme.discover.p1659ui.p1661b.C28531a.LIMIT
            goto L_0x006b
        L_0x0069:
            com.ss.android.ugc.aweme.discover.ui.b.a r1 = com.p683ss.android.ugc.aweme.discover.p1659ui.p1661b.C28531a.EMPTY
        L_0x006b:
            int[] r2 = com.p683ss.android.ugc.aweme.discover.p1659ui.p1661b.C28539d.f74997a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 2131953802(0x7f13088a, float:1.9544085E38)
            r3 = 1
            r4 = 0
            switch(r1) {
                case 1: goto L_0x017e;
                case 2: goto L_0x012b;
                case 3: goto L_0x0083;
                case 4: goto L_0x0082;
                case 5: goto L_0x0081;
                default: goto L_0x007b;
            }
        L_0x007b:
            d.l r11 = new d.l
            r11.<init>()
            throw r11
        L_0x0081:
            return r4
        L_0x0082:
            return r4
        L_0x0083:
            android.content.Context r12 = r10.f74990a
            if (r12 == 0) goto L_0x0123
            android.app.Activity r12 = (android.app.Activity) r12
            java.lang.String r0 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r0)
            if (r11 == 0) goto L_0x011e
            com.ss.android.ugc.aweme.discover.model.SearchNilText r11 = r11.searchNilText
            if (r11 != 0) goto L_0x0096
            goto L_0x011e
        L_0x0096:
            java.lang.String r0 = r11.getContent()
            java.lang.String r11 = r11.getLink()
            java.lang.String r1 = "guideline"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = "community"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r1)
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r0
            r5 = r11
            int r1 = p2628d.p2650m.C52830p.m112419a(r4, r5, r6, r7, r8, r9)
            int r4 = r11.length()
            int r4 = r4 + r1
            android.text.SpannableString r5 = new android.text.SpannableString
            r5.<init>(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00d8
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x00d8
            if (r1 < 0) goto L_0x00d8
            com.ss.android.ugc.aweme.discover.ui.b.c$c r11 = new com.ss.android.ugc.aweme.discover.ui.b.c$c
            r11.<init>(r10, r12)
            r12 = 34
            r5.setSpan(r11, r1, r4, r12)
        L_0x00d8:
            if (r1 >= 0) goto L_0x00f1
            java.lang.String r11 = "text_highlight_not_match"
            java.lang.String r12 = ""
            com.ss.android.ugc.aweme.app.f.c r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()
            java.lang.String r1 = "enter_from"
            java.lang.String r4 = "community_policy"
            com.ss.android.ugc.aweme.app.f.c r0 = r0.mo47824a(r1, r4)
            org.json.JSONObject r0 = r0.mo47825b()
            com.p683ss.android.ugc.aweme.app.C23131p.m56692a(r11, r12, r0)
        L_0x00f1:
            com.bytedance.ies.dmt.ui.widget.c$a r11 = new com.bytedance.ies.dmt.ui.widget.c$a
            android.content.Context r12 = r10.f74990a
            if (r12 != 0) goto L_0x00fa
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00fa:
            r11.<init>(r12)
            com.bytedance.ies.dmt.ui.widget.c$a r11 = r11.mo19277a(r2)
            r12 = 2132551595(0x7f1c27ab, float:2.0756554E38)
            com.bytedance.ies.dmt.ui.widget.c$a r11 = r11.mo19280b(r12)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            com.bytedance.ies.dmt.ui.widget.c r12 = r11.f28711a
            r12.f28695c = r5
            com.bytedance.ies.dmt.ui.widget.c r12 = r11.f28711a
            r12.f28704l = r3
            com.bytedance.ies.dmt.ui.widget.c r12 = r11.f28711a
            r12.f28705m = r3
            com.bytedance.ies.dmt.ui.widget.c r11 = r11.f28711a
            java.lang.String r12 = "DmtDefaultStatus.Builder…\n                .build()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
            return r11
        L_0x011e:
            com.bytedance.ies.dmt.ui.widget.c r11 = r10.mo58213a()
            return r11
        L_0x0123:
            d.u r11 = new d.u
            java.lang.String r12 = "null cannot be cast to non-null type android.app.Activity"
            r11.<init>(r12)
            throw r11
        L_0x012b:
            if (r0 != 0) goto L_0x012e
            r12 = r4
        L_0x012e:
            com.ss.android.ugc.aweme.base.api.a.b.a r12 = (com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a) r12
            if (r12 == 0) goto L_0x0138
            java.lang.String r11 = r12.getErrorMsg()
            if (r11 != 0) goto L_0x013a
        L_0x0138:
            java.lang.String r11 = ""
        L_0x013a:
            java.lang.String r12 = "msg"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r12)
            com.p683ss.android.ugc.aweme.discover.p1659ui.C28550bj.m67722D()
            r12 = r11
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x0159
            android.content.Context r11 = r10.f74990a
            r12 = 2132551600(0x7f1c27b0, float:2.0756564E38)
            java.lang.String r11 = r11.getString(r12)
            java.lang.String r12 = "context.getString(R.stri…uikit_search_reach_limit)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
        L_0x0159:
            com.bytedance.ies.dmt.ui.widget.c$a r12 = new com.bytedance.ies.dmt.ui.widget.c$a
            android.content.Context r0 = r10.f74990a
            r12.<init>(r0)
            com.bytedance.ies.dmt.ui.widget.c$a r12 = r12.mo19277a(r2)
            com.bytedance.ies.dmt.ui.widget.c$a r11 = r12.mo19279a(r11)
            com.ss.android.ugc.aweme.discover.ui.b.a r12 = com.p683ss.android.ugc.aweme.discover.p1659ui.p1661b.C28531a.LIMIT
            int r12 = r12.getType()
            com.bytedance.ies.dmt.ui.widget.c$a r11 = r11.mo19283d(r12)
            com.bytedance.ies.dmt.ui.widget.c r12 = r11.f28711a
            r12.f28706n = r3
            com.bytedance.ies.dmt.ui.widget.c r11 = r11.f28711a
            java.lang.String r12 = "DmtDefaultStatus.Builder…\n                .build()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
            return r11
        L_0x017e:
            com.ss.android.ugc.aweme.discover.ui.bj<?> r11 = r10.f74991c
            android.support.v4.app.Fragment r11 = (android.support.p030v4.app.Fragment) r11
            com.ss.android.ugc.aweme.discover.ui.bj<?> r12 = r10.f74991c
            java.lang.String r12 = r12.mo56549l()
            java.lang.String r0 = "fragment"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r0)
            java.lang.String r0 = "labelName"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r0)
            com.p683ss.android.ugc.aweme.discover.p1659ui.C28550bj.m67722D()
            com.bytedance.ies.dmt.ui.widget.c$a r0 = new com.bytedance.ies.dmt.ui.widget.c$a
            android.content.Context r1 = r10.f74990a
            r0.<init>(r1)
            r1 = 2131955242(0x7f130e2a, float:1.9547006E38)
            com.bytedance.ies.dmt.ui.widget.c$a r0 = r0.mo19277a(r1)
            r1 = 2132551598(0x7f1c27ae, float:2.075656E38)
            com.bytedance.ies.dmt.ui.widget.c$a r0 = r0.mo19280b(r1)
            r1 = 2132551599(0x7f1c27af, float:2.0756562E38)
            com.bytedance.ies.dmt.ui.widget.c$a r0 = r0.mo19282c(r1)
            com.ss.android.ugc.aweme.discover.ui.b.a r1 = com.p683ss.android.ugc.aweme.discover.p1659ui.p1661b.C28531a.NEED_LOGIN
            int r1 = r1.getType()
            com.bytedance.ies.dmt.ui.widget.c$a r0 = r0.mo19283d(r1)
            com.bytedance.ies.dmt.ui.widget.a r1 = com.bytedance.ies.dmt.p664ui.widget.C10720a.SOLID
            r2 = 2132551597(0x7f1c27ad, float:2.0756558E38)
            com.ss.android.ugc.aweme.discover.ui.b.c$b r3 = new com.ss.android.ugc.aweme.discover.ui.b.c$b
            r3.<init>(r11, r12)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            com.bytedance.ies.dmt.ui.widget.c$a r11 = r0.mo19278a(r1, r2, r3)
            com.bytedance.ies.dmt.ui.widget.c r11 = r11.f28711a
            java.lang.String r12 = "loginStatus"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1659ui.p1661b.C28534c.m67701a(com.ss.android.ugc.aweme.discover.model.SearchApiResult, java.lang.Exception):com.bytedance.ies.dmt.ui.widget.c");
    }

    /* renamed from: a */
    public static /* synthetic */ C10722c m67702a(C28534c cVar, SearchApiResult searchApiResult, Exception exc, int i, Object obj) {
        if ((i & 1) != 0) {
            searchApiResult = null;
        }
        if ((i & 2) != 0) {
            exc = null;
        }
        return cVar.m67701a(searchApiResult, exc);
    }
}
