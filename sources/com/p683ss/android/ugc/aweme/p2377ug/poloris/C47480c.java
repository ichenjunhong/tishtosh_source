package com.p683ss.android.ugc.aweme.p2377ug.poloris;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.polaris.p821a.C12561g;
import com.bytedance.polaris.p821a.C12563i;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.legoImp.task.PolarisInitTask;
import com.p683ss.android.ugc.aweme.money.growth.C37164d;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29909o;
import com.p683ss.android.ugc.aweme.share.improve.C42044a.C42045a;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.C42315c;
import com.p683ss.android.ugc.aweme.sharer.C42318f;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42356f;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.ug.poloris.c */
public final class C47480c implements C12561g {

    /* renamed from: a */
    public static final C52668f f119753a = C52732g.m112286a(C52757k.SYNCHRONIZED, C47482b.f119756a);

    /* renamed from: b */
    public static final C47481a f119754b = new C47481a(null);

    /* renamed from: com.ss.android.ugc.aweme.ug.poloris.c$a */
    public static final class C47481a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f119755a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C47481a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/ug/poloris/PolarisShareImpl;"))};

        private C47481a() {
        }

        /* renamed from: a */
        public static C47480c m102878a() {
            return (C47480c) C47480c.f119753a.getValue();
        }

        public /* synthetic */ C47481a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.poloris.c$b */
    static final class C47482b extends C52712l implements C52670a<C47480c> {

        /* renamed from: a */
        public static final C47482b f119756a = new C47482b();

        C47482b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C47480c(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.poloris.c$c */
    public static final class C47483c extends C42315c {

        /* renamed from: a */
        final /* synthetic */ String f119757a;

        /* renamed from: b */
        final /* synthetic */ Activity f119758b;

        /* renamed from: c */
        final /* synthetic */ SharePackage f119759c;

        /* renamed from: a */
        public final boolean mo49947a(C42318f fVar, Context context) {
            C52711k.m112240b(fVar, C42311c.f106865i);
            C52711k.m112240b(context, "context");
            if (!TextUtils.isEmpty(this.f119757a)) {
                return C29909o.m70062a(this.f119758b, this.f119759c, this.f119757a);
            }
            return C29909o.m70062a(this.f119758b, this.f119759c, this.f119759c.f106899h);
        }

        C47483c(String str, Activity activity, SharePackage sharePackage, C42307b bVar) {
            this.f119757a = str;
            this.f119758b = activity;
            this.f119759c = sharePackage;
            super(bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.poloris.c$d */
    public static final class C47484d extends C42356f {

        /* renamed from: a */
        final /* synthetic */ C47480c f119760a;

        /* renamed from: b */
        final /* synthetic */ String f119761b;

        C47484d(C47480c cVar, String str) {
            this.f119760a = cVar;
            this.f119761b = str;
        }

        /* renamed from: a */
        public final void mo49959a(C42307b bVar, boolean z, SharePackage sharePackage, Context context) {
            C52711k.m112240b(bVar, "channel");
            C52711k.m112240b(context, "context");
            Map hashMap = new HashMap();
            hashMap.put("enter_from", "h5_page");
            hashMap.put("platform", bVar.mo86136b());
            hashMap.put("webview_type", "luckycata");
            C26890h.m65011a("h5_share", hashMap);
            this.f119760a.mo94756a(this.f119761b);
        }
    }

    private C47480c() {
    }

    /* renamed from: b */
    private static void m102875b(String str) {
        C37164d.m83388b(str);
    }

    public /* synthetic */ C47480c(C52707g gVar) {
        this();
    }

    /* renamed from: a */
    public final void mo94756a(String str) {
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder("完成分享任务 getAwardByTaskId ");
            sb.append(str);
            m102875b(sb.toString());
            PolarisInitTask.ensuareInit();
            C12563i.m25217a(str, null, (JSONObject) null);
            return;
        }
        m102875b("完成分享任务 taskId 为空，不需要上报");
    }

    /* renamed from: a */
    private final void m102874a(Activity activity, String str, SharePackage sharePackage, String str2) {
        Context context;
        C42307b a = C42045a.m92010a(str, activity);
        if (a != null) {
            C42318f a2 = sharePackage.mo73884a(a);
            if (activity != null) {
                context = activity;
            } else {
                context = C11010c.m22280a();
            }
            a.mo49947a(a2, context);
        }
        mo94756a(str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0134  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo23624a(android.app.Activity r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, org.json.JSONObject r21, java.lang.String r22) {
        /*
            r13 = this;
            r0 = r13
            r1 = r14
            r2 = r15
            r4 = r21
            if (r4 == 0) goto L_0x0018
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "extra:"
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            m102875b(r5)
        L_0x0018:
            r5 = 0
            if (r4 == 0) goto L_0x0022
            java.lang.String r6 = "task_id"
            java.lang.String r6 = r4.getString(r6)     // Catch:{ Exception -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r6 = r5
        L_0x0023:
            if (r4 == 0) goto L_0x002c
            java.lang.String r7 = "origin_url"
            java.lang.String r4 = r4.getString(r7)     // Catch:{ Exception -> 0x002c }
            goto L_0x002d
        L_0x002c:
            r4 = r5
        L_0x002d:
            if (r4 != 0) goto L_0x0031
            r4 = r20
        L_0x0031:
            com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r5 = new com.ss.android.ugc.aweme.sharer.ui.SharePackage$a
            r5.<init>()
            java.lang.String r7 = "web"
            com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r5 = r5.mo86236a(r7)
            if (r18 != 0) goto L_0x0041
            java.lang.String r7 = ""
            goto L_0x0043
        L_0x0041:
            r7 = r18
        L_0x0043:
            com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r5 = r5.mo86240c(r7)
            if (r19 != 0) goto L_0x004c
            java.lang.String r7 = " "
            goto L_0x004e
        L_0x004c:
            r7 = r19
        L_0x004e:
            com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r5 = r5.mo86241d(r7)
            if (r20 != 0) goto L_0x0057
            java.lang.String r7 = ""
            goto L_0x0059
        L_0x0057:
            r7 = r20
        L_0x0059:
            com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r5 = r5.mo86242e(r7)
            java.lang.String r7 = "web"
            com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r5 = r5.mo86239b(r7)
            if (r18 != 0) goto L_0x0068
            java.lang.String r3 = ""
            goto L_0x006a
        L_0x0068:
            r3 = r18
        L_0x006a:
            com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r3 = r5.mo86240c(r3)
            com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage r5 = new com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage
            r5.<init>(r3)
            android.os.Bundle r3 = r5.f106900i
            java.lang.String r7 = "user_origin_link"
            r8 = 1
            r3.putBoolean(r7, r8)
            java.lang.String r7 = "thumb_url"
            r9 = r22
            r3.putString(r7, r9)
            java.lang.String r7 = "url_for_im_share"
            r3.putString(r7, r4)
            r3 = r2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0134
            java.lang.String r2 = "system"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3 = r16
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x00a7
            java.lang.String r2 = "more"
            com.ss.android.ugc.aweme.sharer.ui.SharePackage r5 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage) r5
            r13.m102874a(r14, r2, r5, r6)
            goto L_0x0139
        L_0x00a7:
            java.lang.String r2 = "sdk"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x0139
            r2 = r5
            com.ss.android.ugc.aweme.sharer.ui.SharePackage r2 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage) r2
            if (r1 == 0) goto L_0x0139
            com.ss.android.ugc.aweme.sharer.ui.d$b r3 = new com.ss.android.ugc.aweme.sharer.ui.d$b
            r3.<init>()
            com.ss.android.ugc.aweme.ug.poloris.c$c r5 = new com.ss.android.ugc.aweme.ug.poloris.c$c
            com.ss.android.ugc.aweme.share.improve.b.d r7 = new com.ss.android.ugc.aweme.share.improve.b.d
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            r15 = r7
            r16 = r2
            r17 = r9
            r18 = r10
            r19 = r11
            r20 = r12
            r15.<init>(r16, r17, r18, r19, r20)
            com.ss.android.ugc.aweme.sharer.b r7 = (com.p683ss.android.ugc.aweme.sharer.C42307b) r7
            r5.<init>(r4, r14, r2, r7)
            com.ss.android.ugc.aweme.sharer.b r5 = (com.p683ss.android.ugc.aweme.sharer.C42307b) r5
            com.ss.android.ugc.aweme.sharer.ui.d$b r3 = r3.mo86258a(r5)
            com.ss.android.ugc.aweme.share.ShareService r4 = com.p683ss.android.ugc.aweme.share.C41979aq.m91946a()
            r5 = 0
            r7 = 4
            r15 = r4
            r16 = r3
            r17 = r14
            r18 = r5
            r19 = r7
            r20 = r9
            r15.injectUniversalConfig(r16, r17, true)
            com.ss.android.ugc.aweme.sharer.ui.d$b r2 = r3.mo86259a(r2)
            com.ss.android.ugc.aweme.share.improve.a.d r3 = new com.ss.android.ugc.aweme.share.improve.a.d
            r4 = 0
            r7 = 0
            r9 = 7
            r10 = 0
            r15 = r3
            r16 = r4
            r17 = r5
            r18 = r7
            r19 = r9
            r20 = r10
            r15.<init>(r16, r17, r18, r19, r20)
            com.ss.android.ugc.aweme.sharer.ui.g r3 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g) r3
            com.ss.android.ugc.aweme.sharer.ui.d$b r2 = r2.mo86262a(r3)
            com.ss.android.ugc.aweme.ug.poloris.c$d r3 = new com.ss.android.ugc.aweme.ug.poloris.c$d
            r3.<init>(r13, r6)
            com.ss.android.ugc.aweme.sharer.ui.e r3 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.C42354e) r3
            com.ss.android.ugc.aweme.sharer.ui.d$b r2 = r2.mo86261a(r3)
            com.ss.android.ugc.aweme.sharer.ui.d r2 = r2.mo86266a()
            com.ss.android.ugc.aweme.share.improve.b r3 = new com.ss.android.ugc.aweme.share.improve.b
            r4 = 0
            r5 = 4
            r6 = 0
            r15 = r3
            r16 = r14
            r17 = r2
            r18 = r4
            r19 = r5
            r20 = r6
            r15.<init>(r16, r17, r18, r19, r20)
            r3.show()
            goto L_0x0139
        L_0x0134:
            com.ss.android.ugc.aweme.sharer.ui.SharePackage r5 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage) r5
            r13.m102874a(r14, r15, r5, r6)
        L_0x0139:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p2377ug.poloris.C47480c.mo23624a(android.app.Activity, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.json.JSONObject, java.lang.String):boolean");
    }
}
