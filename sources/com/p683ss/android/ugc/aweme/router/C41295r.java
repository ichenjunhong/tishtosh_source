package com.p683ss.android.ugc.aweme.router;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.miniapp.anchor.C36811b;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.IAVServiceProxy;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.router.r */
public final class C41295r implements IInterceptor {

    /* renamed from: a */
    public static final C41296a f104736a = new C41296a(null);

    /* renamed from: com.ss.android.ugc.aweme.router.r$a */
    public static final class C41296a {
        private C41296a() {
        }

        public /* synthetic */ C41296a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.router.r$b */
    static final class C41297b extends C52712l implements C52682m<Boolean, Long, C52860x> {

        /* renamed from: a */
        final /* synthetic */ Context f104737a;

        /* renamed from: b */
        final /* synthetic */ Class f104738b;

        /* renamed from: c */
        final /* synthetic */ RouteIntent f104739c;

        C41297b(Context context, Class cls, RouteIntent routeIntent) {
            this.f104737a = context;
            this.f104738b = cls;
            this.f104739c = routeIntent;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ((Number) obj2).longValue();
            if (booleanValue) {
                if (this.f104737a instanceof Activity) {
                    this.f104737a.startActivity(C36811b.m82837a(new Intent(this.f104737a, this.f104738b), this.f104739c));
                } else {
                    Context context = this.f104737a;
                    if (context == null) {
                        context = C11010c.m22280a();
                    }
                    Intent intent = new Intent(this.f104737a, this.f104738b);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                }
            }
            return C52860x.f131107a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x000e
            android.net.Uri r1 = r4.getUri()
            if (r1 == 0) goto L_0x000e
            java.lang.String r1 = r1.getHost()
            goto L_0x000f
        L_0x000e:
            r1 = r0
        L_0x000f:
            if (r4 == 0) goto L_0x001c
            android.net.Uri r2 = r4.getUri()
            if (r2 == 0) goto L_0x001c
            java.lang.String r2 = r2.getPath()
            goto L_0x001d
        L_0x001c:
            r2 = r0
        L_0x001d:
            java.lang.String r1 = p2628d.p2639f.p2641b.C52711k.m112231a(r1, r2)
            java.lang.String r2 = "studio/task/create"
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r2)
            if (r1 != 0) goto L_0x0052
            if (r4 == 0) goto L_0x0036
            android.net.Uri r1 = r4.getUri()
            if (r1 == 0) goto L_0x0036
            java.lang.String r1 = r1.getHost()
            goto L_0x0037
        L_0x0036:
            r1 = r0
        L_0x0037:
            if (r4 == 0) goto L_0x0043
            android.net.Uri r4 = r4.getUri()
            if (r4 == 0) goto L_0x0043
            java.lang.String r0 = r4.getPath()
        L_0x0043:
            java.lang.String r4 = p2628d.p2639f.p2641b.C52711k.m112231a(r1, r0)
            java.lang.String r0 = "studio/create"
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r4, r0)
            if (r4 == 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r4 = 0
            return r4
        L_0x0052:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.router.C41295r.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Class videoRecordPermissionActivityClass = AVExternalServiceImpl.getAVServiceImpl_Monster().classnameService().getVideoRecordPermissionActivityClass();
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin();
        C52711k.m112236a((Object) createIAVServiceProxybyMonsterPlugin, "ServiceManager.get().get…ServiceProxy::class.java)");
        createIAVServiceProxybyMonsterPlugin.getDecompressService().mo74198a(true, new C41297b(context, videoRecordPermissionActivityClass, routeIntent));
        return true;
    }
}
