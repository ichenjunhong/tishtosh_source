package com.p683ss.android.ugc.aweme.commercialize.p1572im;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.router.route.BaseRoute;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.location.C36255b.C36256a;
import com.p683ss.android.ugc.aweme.location.C36272l;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35464a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35465b;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.poi.C39054d;
import com.p683ss.android.ugc.aweme.profile.api.C39792e;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41288m;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.im.a */
public final class C25938a extends BaseRoute implements C41288m {

    /* renamed from: a */
    public static final C25938a f68488a = new C25938a();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.im.a$a */
    public static final class C25939a {

        /* renamed from: a */
        public final IIMService f68489a = C33194e.m76277a(false);

        /* renamed from: b */
        public IMUser f68490b;

        /* renamed from: c */
        public C39054d f68491c;

        /* renamed from: d */
        public boolean f68492d;

        /* renamed from: e */
        public final Context f68493e;

        /* renamed from: f */
        public final String f68494f;

        /* renamed from: g */
        public final String f68495g;

        /* renamed from: h */
        public final C35464a f68496h;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.im.a$a$a */
        static final class C25940a<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C25939a f68497a;

            C25940a(C25939a aVar) {
                this.f68497a = aVar;
            }

            public final /* synthetic */ Object call() {
                this.f68497a.mo53284a(C36272l.m81897a(this.f68497a.f68493e).mo75072a());
                return null;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.im.a$a$b */
        public static final class C25941b extends Handler {

            /* renamed from: a */
            final /* synthetic */ C25939a f68498a;

            public final void handleMessage(Message message) {
                if (message != null) {
                    Object obj = message.obj;
                    if (obj != null && !(obj instanceof Exception) && (obj instanceof User)) {
                        this.f68498a.mo53283a(IMUser.fromUser((User) obj));
                    }
                }
            }

            C25941b(C25939a aVar, Looper looper) {
                this.f68498a = aVar;
                super(looper);
            }
        }

        /* renamed from: b */
        private final void m62902b() {
            C39792e.m88511a().mo80873a(new C25941b(this, Looper.getMainLooper()), this.f68494f, 0);
        }

        /* renamed from: c */
        private final void m62903c() {
            if (!C36256a.m81866a()) {
                mo53284a((C39054d) null);
            } else {
                C0013i.m18a((Callable<TResult>) new C25940a<TResult>(this), (Executor) C0013i.f24a);
            }
        }

        /* renamed from: a */
        public final void mo53282a() {
            boolean z;
            if (this.f68489a != null) {
                CharSequence charSequence = this.f68494f;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    m62902b();
                    m62903c();
                }
            }
        }

        /* renamed from: d */
        private final void m62904d() {
            if (this.f68490b != null && this.f68492d) {
                C35465b bVar = new C35465b();
                bVar.ext = this.f68495g;
                bVar.setLoc(this.f68491c);
                IIMService iIMService = this.f68489a;
                if (iIMService != null) {
                    iIMService.startChatWithAdLog(this.f68493e, this.f68490b, this.f68496h, bVar);
                }
            }
        }

        /* renamed from: a */
        public final synchronized void mo53283a(IMUser iMUser) {
            this.f68490b = iMUser;
            m62904d();
        }

        /* renamed from: a */
        public final synchronized void mo53284a(C39054d dVar) {
            this.f68491c = dVar;
            this.f68492d = true;
            m62904d();
        }

        public C25939a(Context context, String str, String str2, C35464a aVar) {
            C52711k.m112240b(context, "ctx");
            this.f68493e = context;
            this.f68494f = str;
            this.f68495g = str2;
            this.f68496h = aVar;
        }
    }

    private C25938a() {
    }

    /* renamed from: a */
    public final boolean mo47182a(String str) {
        return mo47180a((Activity) null, str);
    }

    public final void open(Context context) {
        if (context != null) {
            mo47180a((Activity) context, getUrl());
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.app.Activity");
    }

    /* renamed from: b */
    public static final boolean m62898b(String str) {
        String str2;
        if (str == null) {
            return false;
        }
        Uri parse = Uri.parse(str);
        String str3 = "chatting";
        String str4 = null;
        if (parse != null) {
            str2 = parse.getHost();
        } else {
            str2 = null;
        }
        if (C52830p.m112406a(str3, str2, true)) {
            String str5 = "/message";
            if (parse != null) {
                str4 = parse.getPath();
            }
            if (C52830p.m112406a(str5, str4, true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m62897a(android.content.Context r7, android.net.Uri r8) {
        /*
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            java.lang.String r0 = "uri"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            java.lang.String r0 = "chatting"
            r1 = 0
            if (r8 == 0) goto L_0x0014
            java.lang.String r2 = r8.getHost()
            goto L_0x0015
        L_0x0014:
            r2 = r1
        L_0x0015:
            r3 = 1
            boolean r0 = p2628d.p2650m.C52830p.m112406a(r0, r2, r3)
            r2 = 0
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = "/message"
            if (r8 == 0) goto L_0x0026
            java.lang.String r4 = r8.getPath()
            goto L_0x0027
        L_0x0026:
            r4 = r1
        L_0x0027:
            boolean r0 = p2628d.p2650m.C52830p.m112406a(r0, r4, r3)
            if (r0 == 0) goto L_0x002f
            r0 = 1
            goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            if (r0 != 0) goto L_0x0033
            return r2
        L_0x0033:
            java.lang.String r0 = "uid"
            java.lang.String r0 = r8.getQueryParameter(r0)
            java.lang.String r4 = "ext"
            java.lang.String r4 = r8.getQueryParameter(r4)
            java.lang.String r5 = "cid"
            java.lang.String r5 = r8.getQueryParameter(r5)
            java.lang.String r6 = "log_extra"
            java.lang.String r8 = r8.getQueryParameter(r6)
            r6 = r5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x0056
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0057
        L_0x0056:
            r2 = 1
        L_0x0057:
            if (r2 == 0) goto L_0x005a
            goto L_0x005f
        L_0x005a:
            com.ss.android.ugc.aweme.im.service.model.a r1 = new com.ss.android.ugc.aweme.im.service.model.a
            r1.<init>(r8, r5)
        L_0x005f:
            m62896a(r7, r0, r4, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.p1572im.C25938a.m62897a(android.content.Context, android.net.Uri):boolean");
    }

    /* renamed from: a */
    public final boolean mo47180a(Activity activity, String str) {
        boolean z;
        Context context;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (activity != null) {
            context = activity;
        } else {
            context = C11010c.m22280a();
        }
        C52711k.m112236a((Object) parse, "uri");
        return m62897a(context, parse);
    }

    /* renamed from: a */
    public final boolean mo47181a(Activity activity, String str, View view) {
        return mo47180a(activity, str);
    }

    /* renamed from: a */
    public static final void m62896a(Context context, String str, String str2, C35464a aVar) {
        C52711k.m112240b(context, "context");
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        if (g.isLogin()) {
            new C25939a(context, str, str2, aVar).mo53282a();
            return;
        }
        Intent intent = new Intent(context, ChatCheckLoginActivity.class);
        intent.putExtra("extra_uid", str);
        intent.putExtra("extra_ext", str2);
        intent.putExtra("extra_imadlog", aVar);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }
}
