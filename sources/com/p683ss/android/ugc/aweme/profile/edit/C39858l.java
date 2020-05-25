package com.p683ss.android.ugc.aweme.profile.edit;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Message;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.awemelobby.C9205b.C9206a;
import com.bytedance.awemelobby.C9205b.C9207b;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.C15233f.C15236c;
import com.google.p997a.p998a.p1001b.p1002a.p1003a.C14743a;
import com.google.p997a.p998a.p1004c.p1005a.p1006a.C14746b;
import com.google.p997a.p998a.p1004c.p1005a.p1006a.C14746b.C14747a;
import com.google.p997a.p998a.p1009d.C14769i;
import com.google.p997a.p998a.p1013e.C14774b;
import com.google.p997a.p998a.p1013e.p1014a.C14772a;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1411c.C23484c;
import com.p683ss.android.ugc.aweme.buildconfigdiff.C24095a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.profile.UserResponse;
import com.p683ss.android.ugc.aweme.profile.edit.api.YoutubeApi;
import com.p683ss.android.ugc.aweme.profile.edit.api.YoutubeApi.C39836a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.profile.edit.l */
public final class C39858l implements C9382a, C15236c {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f101698a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C39858l.class), "isGoogleServiceAvailable", "isGoogleServiceAvailable()Z"))};

    /* renamed from: k */
    public static final boolean f101699k = false;

    /* renamed from: l */
    public static final C39859a f101700l = new C39859a(null);

    /* renamed from: b */
    public String f101701b = "";

    /* renamed from: c */
    public String f101702c = "";

    /* renamed from: d */
    public C9381g f101703d = new C9381g(this);

    /* renamed from: e */
    public C14746b f101704e;

    /* renamed from: f */
    public final C14769i f101705f = C14743a.m30124a();

    /* renamed from: g */
    public final C14772a f101706g = new C14772a();

    /* renamed from: h */
    public final C52668f f101707h = C52732g.m112285a(new C39861c(this));

    /* renamed from: i */
    public final FragmentActivity f101708i;

    /* renamed from: j */
    public final C39844d f101709j;

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.l$a */
    public static final class C39859a {
        private C39859a() {
        }

        public /* synthetic */ C39859a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.l$b */
    public static final class C39860b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C39858l f101710a;

        public C39860b(C39858l lVar) {
            this.f101710a = lVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0081 A[Catch:{ Exception -> 0x00f6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00f0 A[Catch:{ Exception -> 0x00f6 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r9 = this;
                net.openid.appauth.i r0 = new net.openid.appauth.i     // Catch:{ Exception -> 0x00f6 }
                java.lang.String r1 = "https://accounts.google.com/o/oauth2/v2/auth"
                android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x00f6 }
                java.lang.String r2 = "https://www.googleapis.com/oauth2/v4/token"
                android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x00f6 }
                r0.<init>(r1, r2)     // Catch:{ Exception -> 0x00f6 }
                com.ss.android.ugc.aweme.profile.edit.l r1 = r9.f101710a     // Catch:{ Exception -> 0x00f6 }
                java.lang.String r1 = r1.f101701b     // Catch:{ Exception -> 0x00f6 }
                android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x00f6 }
                net.openid.appauth.e$a r2 = new net.openid.appauth.e$a     // Catch:{ Exception -> 0x00f6 }
                com.ss.android.ugc.aweme.profile.edit.l r3 = r9.f101710a     // Catch:{ Exception -> 0x00f6 }
                java.lang.String r3 = r3.f101702c     // Catch:{ Exception -> 0x00f6 }
                java.lang.String r4 = "code"
                r2.<init>(r0, r3, r4, r1)     // Catch:{ Exception -> 0x00f6 }
                r0 = 1
                java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ Exception -> 0x00f6 }
                java.lang.String r3 = "https://www.googleapis.com/auth/youtube.readonly"
                r4 = 0
                r1[r4] = r3     // Catch:{ Exception -> 0x00f6 }
                java.util.List r1 = java.util.Arrays.asList(r1)     // Catch:{ Exception -> 0x00f6 }
                r2.mo111217a(r1)     // Catch:{ Exception -> 0x00f6 }
                net.openid.appauth.e r1 = r2.mo111219a()     // Catch:{ Exception -> 0x00f6 }
                java.lang.String r2 = "authRequestBuilder\n     …                 .build()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ Exception -> 0x00f6 }
                net.openid.appauth.g r2 = new net.openid.appauth.g     // Catch:{ Exception -> 0x00f6 }
                com.ss.android.ugc.aweme.profile.edit.l r3 = r9.f101710a     // Catch:{ Exception -> 0x00f6 }
                android.support.v4.app.FragmentActivity r3 = r3.f101708i     // Catch:{ Exception -> 0x00f6 }
                android.content.Context r3 = (android.content.Context) r3     // Catch:{ Exception -> 0x00f6 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x00f6 }
                android.net.Uri[] r3 = new android.net.Uri[r4]     // Catch:{ Exception -> 0x00f6 }
                r2.mo111230a()     // Catch:{ Exception -> 0x00f6 }
                net.openid.appauth.a.e r5 = r2.f132265b     // Catch:{ Exception -> 0x00f6 }
                android.support.customtabs.c$a r6 = new android.support.customtabs.c$a     // Catch:{ Exception -> 0x00f6 }
                android.support.customtabs.b r5 = r5.mo111202a()     // Catch:{ Exception -> 0x00f6 }
                r7 = 0
                if (r5 != 0) goto L_0x0059
            L_0x0057:
                r5 = r7
                goto L_0x0073
            L_0x0059:
                android.support.customtabs.e r5 = r5.mo853a(r7)     // Catch:{ Exception -> 0x00f6 }
                if (r5 != 0) goto L_0x0067
                java.lang.String r3 = "Failed to create custom tabs session through custom tabs client"
                java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00f6 }
                net.openid.appauth.p2682c.C53455a.m113515c(r3, r5)     // Catch:{ Exception -> 0x00f6 }
                goto L_0x0057
            L_0x0067:
                int r8 = r3.length     // Catch:{ Exception -> 0x00f6 }
                if (r8 <= 0) goto L_0x0073
                java.util.List r8 = net.openid.appauth.p2682c.C53458b.m113524a(r3, r0)     // Catch:{ Exception -> 0x00f6 }
                r3 = r3[r4]     // Catch:{ Exception -> 0x00f6 }
                r5.mo868a(r3, r7, r8)     // Catch:{ Exception -> 0x00f6 }
            L_0x0073:
                r6.<init>(r5)     // Catch:{ Exception -> 0x00f6 }
                android.support.customtabs.c r3 = r6.mo865a()     // Catch:{ Exception -> 0x00f6 }
                r2.mo111230a()     // Catch:{ Exception -> 0x00f6 }
                net.openid.appauth.a.b r5 = r2.f132266c     // Catch:{ Exception -> 0x00f6 }
                if (r5 == 0) goto L_0x00f0
                android.net.Uri r5 = r1.mo111214a()     // Catch:{ Exception -> 0x00f6 }
                net.openid.appauth.a.b r6 = r2.f132266c     // Catch:{ Exception -> 0x00f6 }
                java.lang.Boolean r6 = r6.f132169d     // Catch:{ Exception -> 0x00f6 }
                boolean r6 = r6.booleanValue()     // Catch:{ Exception -> 0x00f6 }
                if (r6 == 0) goto L_0x0092
                android.content.Intent r3 = r3.f1250a     // Catch:{ Exception -> 0x00f6 }
                goto L_0x0099
            L_0x0092:
                android.content.Intent r3 = new android.content.Intent     // Catch:{ Exception -> 0x00f6 }
                java.lang.String r6 = "android.intent.action.VIEW"
                r3.<init>(r6)     // Catch:{ Exception -> 0x00f6 }
            L_0x0099:
                net.openid.appauth.a.b r6 = r2.f132266c     // Catch:{ Exception -> 0x00f6 }
                java.lang.String r6 = r6.f132166a     // Catch:{ Exception -> 0x00f6 }
                r3.setPackage(r6)     // Catch:{ Exception -> 0x00f6 }
                r3.setData(r5)     // Catch:{ Exception -> 0x00f6 }
                java.lang.String r5 = "Using %s as browser for auth, custom tab = %s"
                r6 = 2
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x00f6 }
                java.lang.String r8 = r3.getPackage()     // Catch:{ Exception -> 0x00f6 }
                r6[r4] = r8     // Catch:{ Exception -> 0x00f6 }
                net.openid.appauth.a.b r8 = r2.f132266c     // Catch:{ Exception -> 0x00f6 }
                java.lang.Boolean r8 = r8.f132169d     // Catch:{ Exception -> 0x00f6 }
                java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x00f6 }
                r6[r0] = r8     // Catch:{ Exception -> 0x00f6 }
                net.openid.appauth.p2682c.C53455a.m113512a(r5, r6)     // Catch:{ Exception -> 0x00f6 }
                java.lang.String r5 = "Initiating authorization request to %s"
                java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x00f6 }
                net.openid.appauth.i r6 = r1.f132217b     // Catch:{ Exception -> 0x00f6 }
                android.net.Uri r6 = r6.f132274a     // Catch:{ Exception -> 0x00f6 }
                r0[r4] = r6     // Catch:{ Exception -> 0x00f6 }
                net.openid.appauth.p2682c.C53455a.m113512a(r5, r0)     // Catch:{ Exception -> 0x00f6 }
                android.content.Context r0 = r2.f132264a     // Catch:{ Exception -> 0x00f6 }
                android.content.Intent r0 = net.openid.appauth.AuthorizationManagementActivity.m113490a(r0)     // Catch:{ Exception -> 0x00f6 }
                java.lang.String r2 = "authIntent"
                r0.putExtra(r2, r3)     // Catch:{ Exception -> 0x00f6 }
                java.lang.String r2 = "authRequest"
                java.lang.String r1 = r1.mo111216c()     // Catch:{ Exception -> 0x00f6 }
                r0.putExtra(r2, r1)     // Catch:{ Exception -> 0x00f6 }
                java.lang.String r1 = "completeIntent"
                r0.putExtra(r1, r7)     // Catch:{ Exception -> 0x00f6 }
                java.lang.String r1 = "cancelIntent"
                r0.putExtra(r1, r7)     // Catch:{ Exception -> 0x00f6 }
                com.ss.android.ugc.aweme.profile.edit.l r1 = r9.f101710a     // Catch:{ Exception -> 0x00f6 }
                android.support.v4.app.FragmentActivity r1 = r1.f101708i     // Catch:{ Exception -> 0x00f6 }
                r2 = 1001(0x3e9, float:1.403E-42)
                r1.startActivityForResult(r0, r2)     // Catch:{ Exception -> 0x00f6 }
                return
            L_0x00f0:
                android.content.ActivityNotFoundException r0 = new android.content.ActivityNotFoundException     // Catch:{ Exception -> 0x00f6 }
                r0.<init>()     // Catch:{ Exception -> 0x00f6 }
                throw r0     // Catch:{ Exception -> 0x00f6 }
            L_0x00f6:
                r0 = move-exception
                r2 = r0
                com.ss.android.ugc.aweme.profile.edit.l r1 = r9.f101710a
                r3 = 0
                r4 = 0
                r5 = 6
                r6 = 0
                com.p683ss.android.ugc.aweme.profile.edit.C39858l.m88622a(r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.edit.C39858l.C39860b.run():void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.l$c */
    static final class C39861c extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C39858l f101711a;

        C39861c(C39858l lVar) {
            this.f101711a = lVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            boolean z;
            Activity activity = this.f101711a.f101708i;
            GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
            int isGooglePlayServicesAvailable = instance.isGooglePlayServicesAvailable(activity);
            if (isGooglePlayServicesAvailable == 0) {
                z = true;
            } else {
                Dialog errorDialog = instance.getErrorDialog(activity, isGooglePlayServicesAvailable, 9000, new C9207b(activity));
                errorDialog.setOnDismissListener(new C9206a(activity));
                C47700ay.m103235a(errorDialog);
                C32458a.m75148a((Throwable) new IllegalStateException(instance.getErrorString(isGooglePlayServicesAvailable)));
                z = false;
            }
            if (z) {
                C39858l lVar = this.f101711a;
                String o = C24095a.m58958o();
                C52711k.m112236a((Object) o, "BuildConfigDiff.getGoogleYtClientID()");
                lVar.f101702c = o;
                C39858l lVar2 = this.f101711a;
                String str = "com.googleusercontent.apps.1096011445005-qqsj3hcu9s53dv6pbdrl6vs8ls649v01:/oauthredirect";
                C52711k.m112236a((Object) str, "BuildConfigDiff.getGoogleYtRedirectUrl()");
                lVar2.f101701b = str;
                this.f101711a.f101704e = new C14747a().mo27028a(this.f101711a.f101705f).mo27029a((C14774b) this.f101711a.f101706g).mo27034a(this.f101711a.f101702c, null).mo27035a();
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.l$d */
    public static final class C39862d<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C39858l f101712a;

        /* renamed from: b */
        final /* synthetic */ Intent f101713b;

        public C39862d(C39858l lVar, Intent intent) {
            this.f101712a = lVar;
            this.f101713b = intent;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0057  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0069  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
                r10 = this;
                android.content.Intent r0 = r10.f101713b
                net.openid.appauth.f r0 = net.openid.appauth.C53466f.m113534a(r0)
                if (r0 != 0) goto L_0x007a
                android.content.Intent r0 = r10.f101713b
                net.openid.appauth.d r0 = net.openid.appauth.C53459d.fromIntent(r0)
                r1 = 0
                if (r0 == 0) goto L_0x0041
                java.lang.String r2 = r0.getMessage()
                if (r2 == 0) goto L_0x0041
                if (r2 == 0) goto L_0x0039
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                java.lang.CharSequence r2 = p2628d.p2650m.C52830p.m112447b(r2)
                java.lang.String r2 = r2.toString()
                if (r2 == 0) goto L_0x0041
                if (r2 == 0) goto L_0x0031
                java.lang.String r2 = r2.toLowerCase()
                java.lang.String r3 = "(this as java.lang.String).toLowerCase()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                goto L_0x0042
            L_0x0031:
                d.u r0 = new d.u
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                r0.<init>(r1)
                throw r0
            L_0x0039:
                d.u r0 = new d.u
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
                r0.<init>(r1)
                throw r0
            L_0x0041:
                r2 = r1
            L_0x0042:
                r3 = 0
                if (r2 == 0) goto L_0x0052
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                java.lang.String r4 = "cancelled"
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r5 = 2
                boolean r3 = p2628d.p2650m.C52830p.m112456b(r2, r4, r3, r5, r1)
                r5 = r3
                goto L_0x0053
            L_0x0052:
                r5 = 0
            L_0x0053:
                com.ss.android.ugc.aweme.profile.edit.l r4 = r10.f101712a
                if (r0 == 0) goto L_0x005f
                int r2 = r0.code
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r6 = r2
                goto L_0x0060
            L_0x005f:
                r6 = r1
            L_0x0060:
                if (r0 == 0) goto L_0x0066
                java.lang.String r1 = r0.getMessage()
            L_0x0066:
                r7 = r1
                if (r0 == 0) goto L_0x006d
                java.lang.Exception r0 = (java.lang.Exception) r0
            L_0x006b:
                r8 = r0
                goto L_0x0075
            L_0x006d:
                java.lang.Exception r0 = new java.lang.Exception
                java.lang.String r1 = "AuthorizationResponse is null"
                r0.<init>(r1)
                goto L_0x006b
            L_0x0075:
                r9 = 0
                r4.mo80959a(r5, r6, r7, r8, r9)
                goto L_0x00e2
            L_0x007a:
                net.openid.appauth.g r1 = new net.openid.appauth.g
                com.ss.android.ugc.aweme.profile.edit.l r2 = r10.f101712a
                android.support.v4.app.FragmentActivity r2 = r2.f101708i
                android.content.Context r2 = (android.content.Context) r2
                r1.<init>(r2)
                java.util.Map r2 = java.util.Collections.emptyMap()
                java.lang.String r3 = "additionalExchangeParameters cannot be null"
                net.openid.appauth.C53487p.m113585a(r2, r3)
                java.lang.String r3 = r0.f132249e
                if (r3 == 0) goto L_0x00e8
                net.openid.appauth.r$a r3 = new net.openid.appauth.r$a
                net.openid.appauth.e r4 = r0.f132246b
                net.openid.appauth.i r4 = r4.f132217b
                net.openid.appauth.e r5 = r0.f132246b
                java.lang.String r5 = r5.f132218c
                r3.<init>(r4, r5)
                java.lang.String r4 = "authorization_code"
                net.openid.appauth.r$a r3 = r3.mo111239a(r4)
                net.openid.appauth.e r4 = r0.f132246b
                android.net.Uri r4 = r4.f132223h
                if (r4 == 0) goto L_0x00b4
                java.lang.String r5 = r4.getScheme()
                java.lang.String r6 = "redirectUri must have a scheme"
                net.openid.appauth.C53487p.m113585a(r5, r6)
            L_0x00b4:
                r3.f132333a = r4
                net.openid.appauth.e r4 = r0.f132246b
                java.lang.String r4 = r4.f132226k
                if (r4 == 0) goto L_0x00bf
                net.openid.appauth.C53478m.m113565a(r4)
            L_0x00bf:
                r3.f132337e = r4
                java.lang.String r0 = r0.f132249e
                java.lang.String r4 = "authorization code must not be empty"
                net.openid.appauth.C53487p.m113588b(r0, r4)
                r3.f132335c = r0
                java.util.Set<java.lang.String> r0 = net.openid.appauth.C53489r.f132323a
                java.util.Map r0 = net.openid.appauth.C53442a.m113497a(r2, r0)
                r3.f132338f = r0
                net.openid.appauth.r r0 = r3.mo111240a()
                com.ss.android.ugc.aweme.profile.edit.l$d$1 r2 = new com.ss.android.ugc.aweme.profile.edit.l$d$1
                r2.<init>(r10)
                net.openid.appauth.g$b r2 = (net.openid.appauth.C53469g.C53471b) r2
                net.openid.appauth.o r3 = net.openid.appauth.C53486o.f132321a
                r1.mo111231a(r0, r3, r2)
            L_0x00e2:
                r0 = 1
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            L_0x00e8:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "authorizationCode not available for exchange request"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.edit.C39858l.C39862d.call():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.l$e */
    public static final class C39865e<TTaskResult, TContinuationResult> implements C0011g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ C39858l f101717a;

        public C39865e(C39858l lVar) {
            this.f101717a = lVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
            if (((java.lang.Boolean) r8.mo34e()).booleanValue() == false) goto L_0x0017;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(p001a.C0013i r8) {
            /*
                r7 = this;
                boolean r0 = com.p683ss.android.ugc.aweme.utils.C47957v.m103770a(r8)
                if (r0 == 0) goto L_0x0017
                java.lang.String r0 = "task"
                p2628d.p2639f.p2641b.C52711k.m112236a(r8, r0)
                java.lang.Object r0 = r8.mo34e()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 != 0) goto L_0x0030
            L_0x0017:
                com.ss.android.ugc.aweme.profile.edit.l r1 = r7.f101717a
                java.lang.Exception r2 = new java.lang.Exception
                java.lang.String r0 = "task"
                p2628d.p2639f.p2641b.C52711k.m112236a(r8, r0)
                java.lang.Exception r8 = r8.mo35f()
                java.lang.Throwable r8 = (java.lang.Throwable) r8
                r2.<init>(r8)
                r3 = 0
                r4 = 0
                r5 = 6
                r6 = 0
                com.p683ss.android.ugc.aweme.profile.edit.C39858l.m88622a(r1, r2, r3, r4, r5, r6)
            L_0x0030:
                d.x r8 = p2628d.C52860x.f131107a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.edit.C39858l.C39865e.then(a.i):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.l$f */
    public static final class C39866f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C39858l f101718a;

        public C39866f(C39858l lVar) {
            this.f101718a = lVar;
        }

        public final void run() {
            if (YoutubeApi.m88596a()) {
                C20854a.m53167g().queryUser(this.f101718a.f101703d);
                this.f101718a.f101709j.mo80949e(null);
                C26890h.m65011a("social_account_unbind_success", C23089d.m56640a().mo47829a("platform", "youtube").f61491a);
                return;
            }
            this.f101718a.f101709j.mo80948a(false, this.f101718a.f101708i.getString(R.string.f77));
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        C52711k.m112240b(connectionResult, "p0");
    }

    public final void handleMsg(Message message) {
        User user;
        if (!(message == null || (message.obj instanceof Exception) || message.obj == null)) {
            if (message.obj instanceof UserResponse) {
                Object obj = message.obj;
                if (obj != null) {
                    user = ((UserResponse) obj).getUser();
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.UserResponse");
                }
            } else {
                Object obj2 = message.obj;
                if (obj2 != null) {
                    user = (User) obj2;
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                }
            }
            if (message.what == 112 && user != null) {
                C20854a.m53167g().updateCurUser(user);
                IAccountUserService g = C20854a.m53167g();
                C52711k.m112236a((Object) g, "AccountProxyService.userService()");
                C47718bf.m103288a(new C23484c(g.getCurUser()));
            }
        }
    }

    public C39858l(FragmentActivity fragmentActivity, C39844d dVar) {
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(dVar, "youTubeView");
        this.f101708i = fragmentActivity;
        this.f101709j = dVar;
    }

    /* renamed from: a */
    private final void m88623a(Exception exc, String str, C39836a aVar) {
        mo80959a(false, null, str, exc, aVar);
    }

    /* renamed from: a */
    public final void mo80959a(boolean z, Integer num, String str, Exception exc, C39836a aVar) {
        Object obj;
        Object obj2;
        if (f101699k) {
            StringBuilder sb = new StringBuilder("onError ");
            if (aVar != null) {
                obj2 = aVar.f101657c;
            } else {
                obj2 = null;
            }
            sb.append(obj2);
        }
        String a = YoutubeApi.m88595a(this.f101708i, exc, num, aVar);
        String str2 = "social_account_bind_failure";
        C23089d a2 = C23089d.m56640a().mo47829a("platform", "youtube");
        String str3 = "error_code";
        if (aVar != null) {
            obj = aVar.f101655a;
        } else {
            obj = null;
        }
        C26890h.m65011a(str2, a2.mo47829a(str3, String.valueOf(obj)).mo47829a("error_desc", a).f61491a);
        if (z) {
            this.f101709j.mo80949e(null);
        } else {
            this.f101709j.mo80948a(true, str);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m88622a(C39858l lVar, Exception exc, String str, C39836a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            exc = null;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            aVar = null;
        }
        lVar.m88623a(exc, str, aVar);
    }
}
