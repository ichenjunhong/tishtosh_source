package com.p683ss.android.ugc.aweme.opensdk.p2040c;

import android.app.Activity;
import android.arch.lifecycle.C0198r;
import com.p683ss.android.ugc.aweme.common.C26855c;
import com.p683ss.android.ugc.aweme.opensdk.C38488b;
import com.p683ss.android.ugc.aweme.opensdk.C38513g;
import com.p683ss.android.ugc.aweme.opensdk.share.C38515a;
import com.p683ss.android.ugc.aweme.opensdk.share.share.Share.Request;
import com.p683ss.android.ugc.aweme.opensdk.share.share.Share.Response;
import kotlinx.coroutines.C53199ae;
import p2628d.C52860x;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.p2633b.p2634a.C52618f;
import p2628d.p2631c.p2633b.p2634a.C52624k;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.opensdk.c.a */
public final class C38499a {

    /* renamed from: f */
    public static final C38500a f97939f = new C38500a(null);

    /* renamed from: a */
    final String f97940a = "aweme.share";

    /* renamed from: b */
    public final C0198r<Response> f97941b = new C0198r<>();

    /* renamed from: c */
    public final C0198r<C26855c> f97942c = new C0198r<>();

    /* renamed from: d */
    public final C0198r<Boolean> f97943d = new C0198r<>();

    /* renamed from: e */
    public final C38513g f97944e;

    /* renamed from: com.ss.android.ugc.aweme.opensdk.c.a$a */
    public static final class C38500a {
        private C38500a() {
        }

        public /* synthetic */ C38500a(C52707g gVar) {
            this();
        }
    }

    @C52618f(mo110254b = "ShareFromSDKActionHelper.kt", mo110255c = {66, 78, 98, 107, 127, 147, 159}, mo110256d = "invokeSuspend", mo110257e = "com.ss.android.ugc.aweme.opensdk.viewmodel.ShareFromSDKActionHelper$dealWithMedia$1")
    /* renamed from: com.ss.android.ugc.aweme.opensdk.c.a$b */
    public static final class C38501b extends C52624k implements C52682m<C53199ae, C52625c<? super C52860x>, Object> {

        /* renamed from: a */
        Object f97945a;

        /* renamed from: b */
        Object f97946b;

        /* renamed from: c */
        Object f97947c;

        /* renamed from: d */
        Object f97948d;

        /* renamed from: e */
        boolean f97949e;

        /* renamed from: f */
        boolean f97950f;

        /* renamed from: g */
        boolean f97951g;

        /* renamed from: h */
        boolean f97952h;

        /* renamed from: i */
        int f97953i;

        /* renamed from: j */
        final /* synthetic */ C38499a f97954j;

        /* renamed from: k */
        final /* synthetic */ C38488b f97955k;

        /* renamed from: l */
        final /* synthetic */ String f97956l;

        /* renamed from: m */
        final /* synthetic */ Activity f97957m;

        /* renamed from: n */
        final /* synthetic */ Request f97958n;

        /* renamed from: o */
        private C53199ae f97959o;

        public C38501b(C38499a aVar, C38488b bVar, String str, Activity activity, Request request, C52625c cVar) {
            this.f97954j = aVar;
            this.f97955k = bVar;
            this.f97956l = str;
            this.f97957m = activity;
            this.f97958n = request;
            super(2, cVar);
        }

        public final C52625c<C52860x> create(Object obj, C52625c<?> cVar) {
            C52711k.m112240b(cVar, "completion");
            C38501b bVar = new C38501b(this.f97954j, this.f97955k, this.f97956l, this.f97957m, this.f97958n, cVar);
            bVar.f97959o = (C53199ae) obj;
            return bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C38501b) create(obj, (C52625c) obj2)).invokeSuspend(C52860x.f131107a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:100:0x0353, code lost:
            r7.f97954j.f97941b.setValue(com.p683ss.android.ugc.aweme.opensdk.p2040c.C38499a.m85838a(r10.f97903b, r10.f97904c, r7.f97958n));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x0366, code lost:
            return p2628d.C52860x.f131107a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x0367, code lost:
            r16 = r1;
            r1 = r0;
            r0 = r5;
            r5 = r2;
            r2 = r16;
            r10 = r7.f97954j.f97942c.getValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x0376, code lost:
            if (r10 != null) goto L_0x037b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x0378, code lost:
            p2628d.p2639f.p2641b.C52711k.m112234a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x037b, code lost:
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, "baseShare.value!!");
            r10 = (com.p683ss.android.ugc.aweme.common.C26855c) r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x0382, code lost:
            if (r5 != null) goto L_0x0389;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x0384, code lost:
            p2628d.p2639f.p2641b.C52711k.m112237a("response");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x0389, code lost:
            r11 = r5.getData();
            p2628d.p2639f.p2641b.C52711k.m112236a((java.lang.Object) r11, "response.data");
            r10.mAppName = r11.getAppName();
            r7.f97954j.f97942c.postValue(r10);
            r11 = r7.f97955k;
            r12 = r7.f97957m;
            r14 = r7.f97954j.f97944e;
            r15 = r7.f97954j.f97942c.getValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x03b0, code lost:
            if (r15 != null) goto L_0x03b5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x03b2, code lost:
            p2628d.p2639f.p2641b.C52711k.m112234a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x03b5, code lost:
            p2628d.p2639f.p2641b.C52711k.m112236a(r15, "baseShare.value!!");
            r9 = (com.p683ss.android.ugc.aweme.common.C26855c) r15;
            r7.f97945a = r4;
            r7.f97949e = r0;
            r7.f97946b = r5;
            r7.f97950f = r3;
            r7.f97951g = r1;
            r7.f97952h = r6;
            r7.f97947c = r2;
            r7.f97948d = r10;
            r7.f97953i = 7;
            r0 = r11.mo78401a(r12, true, r14, r9, r5, r18);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x03db, code lost:
            if (r0 != r8) goto L_0x03de;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x03dd, code lost:
            return r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x03e4, code lost:
            if (((java.lang.Boolean) r0).booleanValue() == false) goto L_0x03f2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:0x03e6, code lost:
            r7.f97954j.f97943d.setValue(p2628d.p2631c.p2633b.p2634a.C52614b.m112161a(true));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x03f4, code lost:
            return p2628d.C52860x.f131107a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x03f5, code lost:
            r7.f97954j.f97941b.setValue(com.p683ss.android.ugc.aweme.opensdk.p2040c.C38499a.m85838a(20006, "TikTok Network error", r7.f97958n));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x0408, code lost:
            return p2628d.C52860x.f131107a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x00ad, code lost:
            r2 = ((java.lang.Boolean) r2).booleanValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x00b3, code lost:
            if (r2 != false) goto L_0x00c9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b5, code lost:
            r7.f97954j.f97941b.setValue(com.p683ss.android.ugc.aweme.opensdk.p2040c.C38499a.m85838a(20004, "User not login", r7.f97958n));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x00c8, code lost:
            return p2628d.C52860x.f131107a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r3 = r7.f97954j.f97942c.getValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d1, code lost:
            if (r3 != null) goto L_0x00d6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d3, code lost:
            p2628d.p2639f.p2641b.C52711k.m112234a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d6, code lost:
            r3 = ((com.p683ss.android.ugc.aweme.common.C26855c) r3).mClientKey;
            p2628d.p2639f.p2641b.C52711k.m112236a((java.lang.Object) r3, "baseShare.value!!.mClientKey");
            r4 = r7.f97954j.f97942c.getValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e7, code lost:
            if (r4 != null) goto L_0x00ec;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e9, code lost:
            p2628d.p2639f.p2641b.C52711k.m112234a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ec, code lost:
            r4 = ((com.p683ss.android.ugc.aweme.common.C26855c) r4).mCallerPackage;
            p2628d.p2639f.p2641b.C52711k.m112236a((java.lang.Object) r4, "baseShare.value!!.mCallerPackage");
            r7.f97945a = r0;
            r7.f97949e = r2;
            r7.f97953i = 2;
            r5 = new p2628d.p2631c.C52635g(p2628d.p2631c.p2632a.C52601b.m112154a(r18));
            r6 = r5;
            r10 = com.p683ss.android.ugc.aweme.services.RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit("https://open-api.tiktok.com").create(com.p683ss.android.ugc.aweme.opensdk.CheckScopeApi.class);
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, "ServiceManager.get().get…heckScopeApi::class.java)");
            ((com.p683ss.android.ugc.aweme.opensdk.CheckScopeApi) r10).checkScopeExist(r3, r4).mo6155b(p064c.p065a.p093k.C2168a.m6521b()).mo6148a(p064c.p065a.p066a.p068b.C1667a.m5940a()).mo6159b((p064c.p065a.C1683ag<? super T>) new com.p683ss.android.ugc.aweme.opensdk.C38488b.C38491c<java.lang.Object>(r6));
            r3 = r5.mo110263a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0147, code lost:
            if (r3 != p2628d.p2631c.p2632a.C52601b.m112157a()) goto L_0x014c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0149, code lost:
            p2628d.p2631c.p2633b.p2634a.C52620h.m112171b(r18);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x014c, code lost:
            if (r3 != r8) goto L_0x014f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x014e, code lost:
            return r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x014f, code lost:
            r4 = r0;
            r0 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0151, code lost:
            r2 = (com.p683ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse) r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0154, code lost:
            r3 = r7.f97954j;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0156, code lost:
            if (r2 != null) goto L_0x015d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0158, code lost:
            p2628d.p2639f.p2641b.C52711k.m112237a("response");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x015d, code lost:
            r5 = r2.getData();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0161, code lost:
            if (r5 == null) goto L_0x0190;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0163, code lost:
            r5 = r5.getScopes();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0167, code lost:
            if (r5 == null) goto L_0x0190;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0169, code lost:
            r5 = r5.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0171, code lost:
            if (r5.hasNext() == false) goto L_0x0190;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x0173, code lost:
            r6 = (com.p683ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse.DataBean.ScopesBean) r5.next();
            p2628d.p2639f.p2641b.C52711k.m112236a((java.lang.Object) r6, "item");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x018c, code lost:
            if (android.text.TextUtils.equals(r6.getName(), r3.f97940a) == false) goto L_0x016d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x018e, code lost:
            r3 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0190, code lost:
            r3 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0191, code lost:
            if (r3 != false) goto L_0x01a7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0193, code lost:
            r7.f97954j.f97941b.setValue(com.p683ss.android.ugc.aweme.opensdk.p2040c.C38499a.m85838a(20003, "Not enough permissions to operation.", r7.f97958n));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x01a6, code lost:
            return p2628d.C52860x.f131107a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x01a7, code lost:
            r3 = com.p683ss.android.ugc.aweme.opensdk.C38488b.m85820a(r7.f97957m);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x01ad, code lost:
            if (r3 == false) goto L_0x01c3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x01af, code lost:
            r7.f97954j.f97941b.setValue(com.p683ss.android.ugc.aweme.opensdk.p2040c.C38499a.m85838a(20010, "Processing photo resources faild", r7.f97958n));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x01c2, code lost:
            return p2628d.C52860x.f131107a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x01c3, code lost:
            r5 = r7.f97957m;
            r7.f97945a = r4;
            r7.f97949e = r0;
            r7.f97946b = r2;
            r7.f97950f = r3;
            r7.f97953i = 3;
            r5 = com.p683ss.android.ugc.aweme.opensdk.C38488b.m85818a(r5, (p2628d.p2631c.C52625c<? super java.lang.Boolean>) r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x01d4, code lost:
            if (r5 != r8) goto L_0x01d7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x01d6, code lost:
            return r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x01d7, code lost:
            r5 = ((java.lang.Boolean) r5).booleanValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x01dd, code lost:
            if (r5 != false) goto L_0x0201;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x01df, code lost:
            com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21543b((android.content.Context) r7.f97957m, (int) com.ss.android.ugc.trill.R.string.co0, 0).mo19066a();
            r7.f97954j.f97941b.setValue(com.p683ss.android.ugc.aweme.opensdk.p2040c.C38499a.m85838a(20005, "TikTok has no album permissions", r7.f97958n));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0200, code lost:
            return p2628d.C52860x.f131107a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0201, code lost:
            r6 = r7.f97957m;
            r7.f97945a = r4;
            r7.f97949e = r0;
            r7.f97946b = r2;
            r7.f97950f = r3;
            r7.f97951g = r5;
            r7.f97953i = 4;
            r6 = com.p683ss.android.ugc.aweme.opensdk.C38488b.m85821b(r6, (p2628d.p2631c.C52625c<? super java.lang.Boolean>) r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0214, code lost:
            if (r6 != r8) goto L_0x0217;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x0216, code lost:
            return r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0217, code lost:
            r16 = r5;
            r5 = r0;
            r0 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x021c, code lost:
            r6 = ((java.lang.Boolean) r6).booleanValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0222, code lost:
            if (r6 != false) goto L_0x0246;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0224, code lost:
            com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21543b((android.content.Context) r7.f97957m, (int) com.ss.android.ugc.trill.R.string.at3, 0).mo19066a();
            r7.f97954j.f97941b.setValue(com.p683ss.android.ugc.aweme.opensdk.p2040c.C38499a.m85838a(20001, "Unknown", r7.f97958n));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0245, code lost:
            return p2628d.C52860x.f131107a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0246, code lost:
            r1 = new com.p683ss.android.ugc.aweme.opensdk.C38505d(r7.f97954j.f97944e, r7.f97957m);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0261, code lost:
            if (r7.f97954j.f97944e.f97992a == com.p683ss.android.ugc.aweme.opensdk.C38513g.C38514a.m85847b()) goto L_0x0307;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x026d, code lost:
            if (r7.f97954j.f97944e.f97992a != com.p683ss.android.ugc.aweme.opensdk.C38513g.C38514a.m85849d()) goto L_0x0271;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x027b, code lost:
            if (r7.f97954j.f97944e.f97992a == com.p683ss.android.ugc.aweme.opensdk.C38513g.C38514a.m85846a()) goto L_0x0289;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x0287, code lost:
            if (r7.f97954j.f97944e.f97992a != com.p683ss.android.ugc.aweme.opensdk.C38513g.C38514a.m85848c()) goto L_0x0367;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x0295, code lost:
            if (com.bytedance.common.utility.p522b.C9376b.m18558a((java.util.Collection<T>) r7.f97954j.f97944e.f97993b) == false) goto L_0x02b7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x0297, code lost:
            com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21548c((android.content.Context) r7.f97957m, (int) com.ss.android.ugc.trill.R.string.dhq).mo19066a();
            r7.f97954j.f97941b.setValue(com.p683ss.android.ugc.aweme.opensdk.p2040c.C38499a.m85838a(20002, "Params parsing error, media resource type difference you pass", r7.f97958n));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x02b6, code lost:
            return p2628d.C52860x.f131107a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x02c1, code lost:
            if (r7.f97954j.f97944e.f97993b.size() <= 12) goto L_0x02d5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x02c3, code lost:
            r7.f97954j.f97941b.setValue(com.p683ss.android.ugc.aweme.opensdk.p2040c.C38499a.m85838a(20002, "Params parsing error, media resource type difference you pass", r7.f97958n));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x02d4, code lost:
            return p2628d.C52860x.f131107a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x02d5, code lost:
            r7.f97945a = r4;
            r7.f97949e = r5;
            r7.f97946b = r2;
            r7.f97950f = r3;
            r7.f97951g = r0;
            r7.f97952h = r6;
            r7.f97947c = r1;
            r7.f97953i = 6;
            r10 = com.p683ss.android.ugc.aweme.opensdk.C38488b.m85822b(r1, (p2628d.p2631c.C52625c<? super com.p683ss.android.ugc.aweme.opensdk.C38483a>) r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x02ea, code lost:
            if (r10 != r8) goto L_0x02ed;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x02ec, code lost:
            return r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x02ed, code lost:
            r10 = (com.p683ss.android.ugc.aweme.opensdk.C38483a) r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x02f1, code lost:
            if (r10.f97902a != false) goto L_0x0367;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x02f3, code lost:
            r7.f97954j.f97941b.setValue(com.p683ss.android.ugc.aweme.opensdk.p2040c.C38499a.m85838a(r10.f97903b, r10.f97904c, r7.f97958n));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x0306, code lost:
            return p2628d.C52860x.f131107a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x0311, code lost:
            if (r7.f97954j.f97944e.f97993b.size() <= 12) goto L_0x0333;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x0313, code lost:
            com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21548c((android.content.Context) r7.f97957m, (int) com.ss.android.ugc.trill.R.string.a2k).mo19066a();
            r7.f97954j.f97941b.setValue(com.p683ss.android.ugc.aweme.opensdk.p2040c.C38499a.m85838a(20002, "Params parsing error, media resource type difference you pass", r7.f97958n));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x0332, code lost:
            return p2628d.C52860x.f131107a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x0333, code lost:
            r10 = r7.f97955k;
            r7.f97945a = r4;
            r7.f97949e = r5;
            r7.f97946b = r2;
            r7.f97950f = r3;
            r7.f97951g = r0;
            r7.f97952h = r6;
            r7.f97947c = r1;
            r7.f97953i = 5;
            r10 = r10.mo78402a(r1, (p2628d.p2631c.C52625c<? super com.p683ss.android.ugc.aweme.opensdk.C38483a>) r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x034a, code lost:
            if (r10 != r8) goto L_0x034d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x034c, code lost:
            return r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x034d, code lost:
            r10 = (com.p683ss.android.ugc.aweme.opensdk.C38483a) r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x0351, code lost:
            if (r10.f97902a != false) goto L_0x0367;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r7 = r18
                java.lang.Object r8 = p2628d.p2631c.p2632a.C52601b.m112157a()
                int r0 = r7.f97953i
                r9 = 1
                r1 = 0
                switch(r0) {
                    case 0: goto L_0x009c;
                    case 1: goto L_0x0095;
                    case 2: goto L_0x008a;
                    case 3: goto L_0x0075;
                    case 4: goto L_0x0059;
                    case 5: goto L_0x0039;
                    case 6: goto L_0x0019;
                    case 7: goto L_0x0015;
                    default: goto L_0x000d;
                }
            L_0x000d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0015:
                r0 = r19
                goto L_0x03de
            L_0x0019:
                java.lang.Object r0 = r7.f97947c
                com.ss.android.ugc.aweme.opensdk.d r0 = (com.p683ss.android.ugc.aweme.opensdk.C38505d) r0
                boolean r1 = r7.f97952h
                boolean r2 = r7.f97951g
                boolean r3 = r7.f97950f
                java.lang.Object r4 = r7.f97946b
                com.ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse r4 = (com.p683ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse) r4
                boolean r5 = r7.f97949e
                java.lang.Object r6 = r7.f97945a
                kotlinx.coroutines.ae r6 = (kotlinx.coroutines.C53199ae) r6
                r10 = r19
                r16 = r1
                r1 = r0
                r0 = r2
                r2 = r4
                r4 = r6
                r6 = r16
                goto L_0x02ed
            L_0x0039:
                java.lang.Object r0 = r7.f97947c
                com.ss.android.ugc.aweme.opensdk.d r0 = (com.p683ss.android.ugc.aweme.opensdk.C38505d) r0
                boolean r1 = r7.f97952h
                boolean r2 = r7.f97951g
                boolean r3 = r7.f97950f
                java.lang.Object r4 = r7.f97946b
                com.ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse r4 = (com.p683ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse) r4
                boolean r5 = r7.f97949e
                java.lang.Object r6 = r7.f97945a
                kotlinx.coroutines.ae r6 = (kotlinx.coroutines.C53199ae) r6
                r10 = r19
                r16 = r1
                r1 = r0
                r0 = r2
                r2 = r4
                r4 = r6
                r6 = r16
                goto L_0x034d
            L_0x0059:
                boolean r0 = r7.f97951g
                boolean r2 = r7.f97950f
                java.lang.Object r3 = r7.f97946b
                com.ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse r3 = (com.p683ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse) r3
                boolean r4 = r7.f97949e
                java.lang.Object r5 = r7.f97945a
                kotlinx.coroutines.ae r5 = (kotlinx.coroutines.C53199ae) r5
                r6 = r19
                r16 = r3
                r3 = r2
                r2 = r16
                r17 = r5
                r5 = r4
                r4 = r17
                goto L_0x021c
            L_0x0075:
                boolean r0 = r7.f97950f
                java.lang.Object r2 = r7.f97946b
                com.ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse r2 = (com.p683ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse) r2
                boolean r3 = r7.f97949e
                java.lang.Object r4 = r7.f97945a
                kotlinx.coroutines.ae r4 = (kotlinx.coroutines.C53199ae) r4
                r5 = r19
                r16 = r3
                r3 = r0
                r0 = r16
                goto L_0x01d7
            L_0x008a:
                boolean r0 = r7.f97949e
                java.lang.Object r2 = r7.f97945a
                kotlinx.coroutines.ae r2 = (kotlinx.coroutines.C53199ae) r2
                r3 = r19
                r4 = r2
                goto L_0x0151
            L_0x0095:
                java.lang.Object r0 = r7.f97945a
                kotlinx.coroutines.ae r0 = (kotlinx.coroutines.C53199ae) r0
                r2 = r19
                goto L_0x00ad
            L_0x009c:
                kotlinx.coroutines.ae r0 = r7.f97959o
                java.lang.String r2 = r7.f97956l
                android.app.Activity r3 = r7.f97957m
                r7.f97945a = r0
                r7.f97953i = r9
                java.lang.Object r2 = com.p683ss.android.ugc.aweme.opensdk.C38488b.m85819a(r2, r3, r7)
                if (r2 != r8) goto L_0x00ad
                return r8
            L_0x00ad:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L_0x00c9
                r0 = 20004(0x4e24, float:2.8032E-41)
                java.lang.String r1 = "User not login"
                com.ss.android.ugc.aweme.opensdk.share.share.Share$Request r2 = r7.f97958n
                com.ss.android.ugc.aweme.opensdk.share.share.Share$Response r0 = com.p683ss.android.ugc.aweme.opensdk.p2040c.C38499a.m85838a(r0, r1, r2)
                com.ss.android.ugc.aweme.opensdk.c.a r1 = r7.f97954j
                android.arch.lifecycle.r<com.ss.android.ugc.aweme.opensdk.share.share.Share$Response> r1 = r1.f97941b
                r1.setValue(r0)
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            L_0x00c9:
                com.ss.android.ugc.aweme.opensdk.c.a r3 = r7.f97954j     // Catch:{ Exception -> 0x03f5 }
                android.arch.lifecycle.r<com.ss.android.ugc.aweme.common.c> r3 = r3.f97942c     // Catch:{ Exception -> 0x03f5 }
                java.lang.Object r3 = r3.getValue()     // Catch:{ Exception -> 0x03f5 }
                if (r3 != 0) goto L_0x00d6
                p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Exception -> 0x03f5 }
            L_0x00d6:
                com.ss.android.ugc.aweme.common.c r3 = (com.p683ss.android.ugc.aweme.common.C26855c) r3     // Catch:{ Exception -> 0x03f5 }
                java.lang.String r3 = r3.mClientKey     // Catch:{ Exception -> 0x03f5 }
                java.lang.String r4 = "baseShare.value!!.mClientKey"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)     // Catch:{ Exception -> 0x03f5 }
                com.ss.android.ugc.aweme.opensdk.c.a r4 = r7.f97954j     // Catch:{ Exception -> 0x03f5 }
                android.arch.lifecycle.r<com.ss.android.ugc.aweme.common.c> r4 = r4.f97942c     // Catch:{ Exception -> 0x03f5 }
                java.lang.Object r4 = r4.getValue()     // Catch:{ Exception -> 0x03f5 }
                if (r4 != 0) goto L_0x00ec
                p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Exception -> 0x03f5 }
            L_0x00ec:
                com.ss.android.ugc.aweme.common.c r4 = (com.p683ss.android.ugc.aweme.common.C26855c) r4     // Catch:{ Exception -> 0x03f5 }
                java.lang.String r4 = r4.mCallerPackage     // Catch:{ Exception -> 0x03f5 }
                java.lang.String r5 = "baseShare.value!!.mCallerPackage"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)     // Catch:{ Exception -> 0x03f5 }
                r7.f97945a = r0     // Catch:{ Exception -> 0x03f5 }
                r7.f97949e = r2     // Catch:{ Exception -> 0x03f5 }
                r5 = 2
                r7.f97953i = r5     // Catch:{ Exception -> 0x03f5 }
                d.c.g r5 = new d.c.g     // Catch:{ Exception -> 0x03f5 }
                d.c.c r6 = p2628d.p2631c.p2632a.C52601b.m112154a(r18)     // Catch:{ Exception -> 0x03f5 }
                r5.<init>(r6)     // Catch:{ Exception -> 0x03f5 }
                r6 = r5
                d.c.c r6 = (p2628d.p2631c.C52625c) r6     // Catch:{ Exception -> 0x03f5 }
                com.ss.android.ugc.aweme.framework.services.IRetrofitService r10 = com.p683ss.android.ugc.aweme.services.RetrofitService.createIRetrofitServicebyMonsterPlugin()     // Catch:{ Exception -> 0x03f5 }
                com.ss.android.ugc.aweme.framework.services.IRetrofitService r10 = (com.p683ss.android.ugc.aweme.framework.services.IRetrofitService) r10     // Catch:{ Exception -> 0x03f5 }
                java.lang.String r11 = "https://open-api.tiktok.com"
                com.ss.android.ugc.aweme.framework.services.IRetrofit r10 = r10.createNewRetrofit(r11)     // Catch:{ Exception -> 0x03f5 }
                java.lang.Class<com.ss.android.ugc.aweme.opensdk.CheckScopeApi> r11 = com.p683ss.android.ugc.aweme.opensdk.CheckScopeApi.class
                java.lang.Object r10 = r10.create(r11)     // Catch:{ Exception -> 0x03f5 }
                java.lang.String r11 = "ServiceManager.get().get…heckScopeApi::class.java)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r10, r11)     // Catch:{ Exception -> 0x03f5 }
                com.ss.android.ugc.aweme.opensdk.CheckScopeApi r10 = (com.p683ss.android.ugc.aweme.opensdk.CheckScopeApi) r10     // Catch:{ Exception -> 0x03f5 }
                c.a.ad r3 = r10.checkScopeExist(r3, r4)     // Catch:{ Exception -> 0x03f5 }
                c.a.ac r4 = p064c.p065a.p093k.C2168a.m6521b()     // Catch:{ Exception -> 0x03f5 }
                c.a.ad r3 = r3.mo6155b(r4)     // Catch:{ Exception -> 0x03f5 }
                c.a.ac r4 = p064c.p065a.p066a.p068b.C1667a.m5940a()     // Catch:{ Exception -> 0x03f5 }
                c.a.ad r3 = r3.mo6148a(r4)     // Catch:{ Exception -> 0x03f5 }
                com.ss.android.ugc.aweme.opensdk.b$c r4 = new com.ss.android.ugc.aweme.opensdk.b$c     // Catch:{ Exception -> 0x03f5 }
                r4.<init>(r6)     // Catch:{ Exception -> 0x03f5 }
                c.a.ag r4 = (p064c.p065a.C1683ag) r4     // Catch:{ Exception -> 0x03f5 }
                r3.mo6159b(r4)     // Catch:{ Exception -> 0x03f5 }
                java.lang.Object r3 = r5.mo110263a()     // Catch:{ Exception -> 0x03f5 }
                java.lang.Object r4 = p2628d.p2631c.p2632a.C52601b.m112157a()     // Catch:{ Exception -> 0x03f5 }
                if (r3 != r4) goto L_0x014c
                p2628d.p2631c.p2633b.p2634a.C52620h.m112171b(r18)     // Catch:{ Exception -> 0x03f5 }
            L_0x014c:
                if (r3 != r8) goto L_0x014f
                return r8
            L_0x014f:
                r4 = r0
                r0 = r2
            L_0x0151:
                r2 = r3
                com.ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse r2 = (com.p683ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse) r2     // Catch:{ Exception -> 0x03f5 }
                com.ss.android.ugc.aweme.opensdk.c.a r3 = r7.f97954j
                if (r2 != 0) goto L_0x015d
                java.lang.String r5 = "response"
                p2628d.p2639f.p2641b.C52711k.m112237a(r5)
            L_0x015d:
                com.ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse$DataBean r5 = r2.getData()
                if (r5 == 0) goto L_0x0190
                java.util.List r5 = r5.getScopes()
                if (r5 == 0) goto L_0x0190
                java.util.Iterator r5 = r5.iterator()
            L_0x016d:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L_0x0190
                java.lang.Object r6 = r5.next()
                com.ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse$DataBean$ScopesBean r6 = (com.p683ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse.DataBean.ScopesBean) r6
                java.lang.String r10 = "item"
                p2628d.p2639f.p2641b.C52711k.m112236a(r6, r10)
                java.lang.String r6 = r6.getName()
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                java.lang.String r10 = r3.f97940a
                java.lang.CharSequence r10 = (java.lang.CharSequence) r10
                boolean r6 = android.text.TextUtils.equals(r6, r10)
                if (r6 == 0) goto L_0x016d
                r3 = 1
                goto L_0x0191
            L_0x0190:
                r3 = 0
            L_0x0191:
                if (r3 != 0) goto L_0x01a7
                r0 = 20003(0x4e23, float:2.803E-41)
                java.lang.String r1 = "Not enough permissions to operation."
                com.ss.android.ugc.aweme.opensdk.share.share.Share$Request r2 = r7.f97958n
                com.ss.android.ugc.aweme.opensdk.share.share.Share$Response r0 = com.p683ss.android.ugc.aweme.opensdk.p2040c.C38499a.m85838a(r0, r1, r2)
                com.ss.android.ugc.aweme.opensdk.c.a r1 = r7.f97954j
                android.arch.lifecycle.r<com.ss.android.ugc.aweme.opensdk.share.share.Share$Response> r1 = r1.f97941b
                r1.setValue(r0)
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            L_0x01a7:
                android.app.Activity r3 = r7.f97957m
                boolean r3 = com.p683ss.android.ugc.aweme.opensdk.C38488b.m85820a(r3)
                if (r3 == 0) goto L_0x01c3
                r0 = 20010(0x4e2a, float:2.804E-41)
                java.lang.String r1 = "Processing photo resources faild"
                com.ss.android.ugc.aweme.opensdk.share.share.Share$Request r2 = r7.f97958n
                com.ss.android.ugc.aweme.opensdk.share.share.Share$Response r0 = com.p683ss.android.ugc.aweme.opensdk.p2040c.C38499a.m85838a(r0, r1, r2)
                com.ss.android.ugc.aweme.opensdk.c.a r1 = r7.f97954j
                android.arch.lifecycle.r<com.ss.android.ugc.aweme.opensdk.share.share.Share$Response> r1 = r1.f97941b
                r1.setValue(r0)
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            L_0x01c3:
                android.app.Activity r5 = r7.f97957m
                r7.f97945a = r4
                r7.f97949e = r0
                r7.f97946b = r2
                r7.f97950f = r3
                r6 = 3
                r7.f97953i = r6
                java.lang.Object r5 = com.p683ss.android.ugc.aweme.opensdk.C38488b.m85818a(r5, r7)
                if (r5 != r8) goto L_0x01d7
                return r8
            L_0x01d7:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 != 0) goto L_0x0201
                android.app.Activity r0 = r7.f97957m
                android.content.Context r0 = (android.content.Context) r0
                r2 = 2132547288(0x7f1c16d8, float:2.0747818E38)
                com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21543b(r0, r2, r1)
                r0.mo19066a()
                r0 = 20005(0x4e25, float:2.8033E-41)
                java.lang.String r1 = "TikTok has no album permissions"
                com.ss.android.ugc.aweme.opensdk.share.share.Share$Request r2 = r7.f97958n
                com.ss.android.ugc.aweme.opensdk.share.share.Share$Response r0 = com.p683ss.android.ugc.aweme.opensdk.p2040c.C38499a.m85838a(r0, r1, r2)
                com.ss.android.ugc.aweme.opensdk.c.a r1 = r7.f97954j
                android.arch.lifecycle.r<com.ss.android.ugc.aweme.opensdk.share.share.Share$Response> r1 = r1.f97941b
                r1.setValue(r0)
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            L_0x0201:
                android.app.Activity r6 = r7.f97957m
                r7.f97945a = r4
                r7.f97949e = r0
                r7.f97946b = r2
                r7.f97950f = r3
                r7.f97951g = r5
                r10 = 4
                r7.f97953i = r10
                java.lang.Object r6 = com.p683ss.android.ugc.aweme.opensdk.C38488b.m85821b(r6, r7)
                if (r6 != r8) goto L_0x0217
                return r8
            L_0x0217:
                r16 = r5
                r5 = r0
                r0 = r16
            L_0x021c:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L_0x0246
                android.app.Activity r0 = r7.f97957m
                android.content.Context r0 = (android.content.Context) r0
                r2 = 2132544190(0x7f1c0abe, float:2.0741534E38)
                com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21543b(r0, r2, r1)
                r0.mo19066a()
                r0 = 20001(0x4e21, float:2.8027E-41)
                java.lang.String r1 = "Unknown"
                com.ss.android.ugc.aweme.opensdk.share.share.Share$Request r2 = r7.f97958n
                com.ss.android.ugc.aweme.opensdk.share.share.Share$Response r0 = com.p683ss.android.ugc.aweme.opensdk.p2040c.C38499a.m85838a(r0, r1, r2)
                com.ss.android.ugc.aweme.opensdk.c.a r1 = r7.f97954j
                android.arch.lifecycle.r<com.ss.android.ugc.aweme.opensdk.share.share.Share$Response> r1 = r1.f97941b
                r1.setValue(r0)
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            L_0x0246:
                com.ss.android.ugc.aweme.opensdk.d r1 = new com.ss.android.ugc.aweme.opensdk.d
                com.ss.android.ugc.aweme.opensdk.c.a r10 = r7.f97954j
                com.ss.android.ugc.aweme.opensdk.g r10 = r10.f97944e
                android.app.Activity r11 = r7.f97957m
                android.content.Context r11 = (android.content.Context) r11
                r1.<init>(r10, r11)
                com.ss.android.ugc.aweme.opensdk.c.a r10 = r7.f97954j
                com.ss.android.ugc.aweme.opensdk.g r10 = r10.f97944e
                int r10 = r10.f97992a
                int r11 = com.p683ss.android.ugc.aweme.opensdk.C38513g.C38514a.m85847b()
                r12 = 12
                r13 = 20002(0x4e22, float:2.8029E-41)
                if (r10 == r11) goto L_0x0307
                com.ss.android.ugc.aweme.opensdk.c.a r10 = r7.f97954j
                com.ss.android.ugc.aweme.opensdk.g r10 = r10.f97944e
                int r10 = r10.f97992a
                int r11 = com.p683ss.android.ugc.aweme.opensdk.C38513g.C38514a.m85849d()
                if (r10 != r11) goto L_0x0271
                goto L_0x0307
            L_0x0271:
                com.ss.android.ugc.aweme.opensdk.c.a r10 = r7.f97954j
                com.ss.android.ugc.aweme.opensdk.g r10 = r10.f97944e
                int r10 = r10.f97992a
                int r11 = com.p683ss.android.ugc.aweme.opensdk.C38513g.C38514a.m85846a()
                if (r10 == r11) goto L_0x0289
                com.ss.android.ugc.aweme.opensdk.c.a r10 = r7.f97954j
                com.ss.android.ugc.aweme.opensdk.g r10 = r10.f97944e
                int r10 = r10.f97992a
                int r11 = com.p683ss.android.ugc.aweme.opensdk.C38513g.C38514a.m85848c()
                if (r10 != r11) goto L_0x0367
            L_0x0289:
                com.ss.android.ugc.aweme.opensdk.c.a r10 = r7.f97954j
                com.ss.android.ugc.aweme.opensdk.g r10 = r10.f97944e
                java.util.List<java.lang.String> r10 = r10.f97993b
                java.util.Collection r10 = (java.util.Collection) r10
                boolean r10 = com.bytedance.common.utility.p522b.C9376b.m18558a(r10)
                if (r10 == 0) goto L_0x02b7
                android.app.Activity r0 = r7.f97957m
                android.content.Context r0 = (android.content.Context) r0
                r1 = 2132549109(0x7f1c1df5, float:2.0751511E38)
                com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21548c(r0, r1)
                r0.mo19066a()
                java.lang.String r0 = "Params parsing error, media resource type difference you pass"
                com.ss.android.ugc.aweme.opensdk.share.share.Share$Request r1 = r7.f97958n
                com.ss.android.ugc.aweme.opensdk.share.share.Share$Response r0 = com.p683ss.android.ugc.aweme.opensdk.p2040c.C38499a.m85838a(r13, r0, r1)
                com.ss.android.ugc.aweme.opensdk.c.a r1 = r7.f97954j
                android.arch.lifecycle.r<com.ss.android.ugc.aweme.opensdk.share.share.Share$Response> r1 = r1.f97941b
                r1.setValue(r0)
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            L_0x02b7:
                com.ss.android.ugc.aweme.opensdk.c.a r10 = r7.f97954j
                com.ss.android.ugc.aweme.opensdk.g r10 = r10.f97944e
                java.util.List<java.lang.String> r10 = r10.f97993b
                int r10 = r10.size()
                if (r10 <= r12) goto L_0x02d5
                java.lang.String r0 = "Params parsing error, media resource type difference you pass"
                com.ss.android.ugc.aweme.opensdk.share.share.Share$Request r1 = r7.f97958n
                com.ss.android.ugc.aweme.opensdk.share.share.Share$Response r0 = com.p683ss.android.ugc.aweme.opensdk.p2040c.C38499a.m85838a(r13, r0, r1)
                com.ss.android.ugc.aweme.opensdk.c.a r1 = r7.f97954j
                android.arch.lifecycle.r<com.ss.android.ugc.aweme.opensdk.share.share.Share$Response> r1 = r1.f97941b
                r1.setValue(r0)
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            L_0x02d5:
                r7.f97945a = r4
                r7.f97949e = r5
                r7.f97946b = r2
                r7.f97950f = r3
                r7.f97951g = r0
                r7.f97952h = r6
                r7.f97947c = r1
                r10 = 6
                r7.f97953i = r10
                java.lang.Object r10 = com.p683ss.android.ugc.aweme.opensdk.C38488b.m85822b(r1, r7)
                if (r10 != r8) goto L_0x02ed
                return r8
            L_0x02ed:
                com.ss.android.ugc.aweme.opensdk.a r10 = (com.p683ss.android.ugc.aweme.opensdk.C38483a) r10
                boolean r11 = r10.f97902a
                if (r11 != 0) goto L_0x0367
                int r0 = r10.f97903b
                java.lang.String r1 = r10.f97904c
                com.ss.android.ugc.aweme.opensdk.share.share.Share$Request r2 = r7.f97958n
                com.ss.android.ugc.aweme.opensdk.share.share.Share$Response r0 = com.p683ss.android.ugc.aweme.opensdk.p2040c.C38499a.m85838a(r0, r1, r2)
                com.ss.android.ugc.aweme.opensdk.c.a r1 = r7.f97954j
                android.arch.lifecycle.r<com.ss.android.ugc.aweme.opensdk.share.share.Share$Response> r1 = r1.f97941b
                r1.setValue(r0)
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            L_0x0307:
                com.ss.android.ugc.aweme.opensdk.c.a r10 = r7.f97954j
                com.ss.android.ugc.aweme.opensdk.g r10 = r10.f97944e
                java.util.List<java.lang.String> r10 = r10.f97993b
                int r10 = r10.size()
                if (r10 <= r12) goto L_0x0333
                android.app.Activity r0 = r7.f97957m
                android.content.Context r0 = (android.content.Context) r0
                r1 = 2132542847(0x7f1c057f, float:2.073881E38)
                com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21548c(r0, r1)
                r0.mo19066a()
                java.lang.String r0 = "Params parsing error, media resource type difference you pass"
                com.ss.android.ugc.aweme.opensdk.share.share.Share$Request r1 = r7.f97958n
                com.ss.android.ugc.aweme.opensdk.share.share.Share$Response r0 = com.p683ss.android.ugc.aweme.opensdk.p2040c.C38499a.m85838a(r13, r0, r1)
                com.ss.android.ugc.aweme.opensdk.c.a r1 = r7.f97954j
                android.arch.lifecycle.r<com.ss.android.ugc.aweme.opensdk.share.share.Share$Response> r1 = r1.f97941b
                r1.setValue(r0)
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            L_0x0333:
                com.ss.android.ugc.aweme.opensdk.b r10 = r7.f97955k
                r7.f97945a = r4
                r7.f97949e = r5
                r7.f97946b = r2
                r7.f97950f = r3
                r7.f97951g = r0
                r7.f97952h = r6
                r7.f97947c = r1
                r11 = 5
                r7.f97953i = r11
                java.lang.Object r10 = r10.mo78402a(r1, r7)
                if (r10 != r8) goto L_0x034d
                return r8
            L_0x034d:
                com.ss.android.ugc.aweme.opensdk.a r10 = (com.p683ss.android.ugc.aweme.opensdk.C38483a) r10
                boolean r11 = r10.f97902a
                if (r11 != 0) goto L_0x0367
                int r0 = r10.f97903b
                java.lang.String r1 = r10.f97904c
                com.ss.android.ugc.aweme.opensdk.share.share.Share$Request r2 = r7.f97958n
                com.ss.android.ugc.aweme.opensdk.share.share.Share$Response r0 = com.p683ss.android.ugc.aweme.opensdk.p2040c.C38499a.m85838a(r0, r1, r2)
                com.ss.android.ugc.aweme.opensdk.c.a r1 = r7.f97954j
                android.arch.lifecycle.r<com.ss.android.ugc.aweme.opensdk.share.share.Share$Response> r1 = r1.f97941b
                r1.setValue(r0)
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            L_0x0367:
                r16 = r1
                r1 = r0
                r0 = r5
                r5 = r2
                r2 = r16
                com.ss.android.ugc.aweme.opensdk.c.a r10 = r7.f97954j
                android.arch.lifecycle.r<com.ss.android.ugc.aweme.common.c> r10 = r10.f97942c
                java.lang.Object r10 = r10.getValue()
                if (r10 != 0) goto L_0x037b
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x037b:
                java.lang.String r11 = "baseShare.value!!"
                p2628d.p2639f.p2641b.C52711k.m112236a(r10, r11)
                com.ss.android.ugc.aweme.common.c r10 = (com.p683ss.android.ugc.aweme.common.C26855c) r10
                if (r5 != 0) goto L_0x0389
                java.lang.String r11 = "response"
                p2628d.p2639f.p2641b.C52711k.m112237a(r11)
            L_0x0389:
                com.ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse$DataBean r11 = r5.getData()
                java.lang.String r12 = "response.data"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
                java.lang.String r11 = r11.getAppName()
                r10.mAppName = r11
                com.ss.android.ugc.aweme.opensdk.c.a r11 = r7.f97954j
                android.arch.lifecycle.r<com.ss.android.ugc.aweme.common.c> r11 = r11.f97942c
                r11.postValue(r10)
                com.ss.android.ugc.aweme.opensdk.b r11 = r7.f97955k
                android.app.Activity r12 = r7.f97957m
                r13 = 1
                com.ss.android.ugc.aweme.opensdk.c.a r14 = r7.f97954j
                com.ss.android.ugc.aweme.opensdk.g r14 = r14.f97944e
                com.ss.android.ugc.aweme.opensdk.c.a r15 = r7.f97954j
                android.arch.lifecycle.r<com.ss.android.ugc.aweme.common.c> r15 = r15.f97942c
                java.lang.Object r15 = r15.getValue()
                if (r15 != 0) goto L_0x03b5
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x03b5:
                java.lang.String r9 = "baseShare.value!!"
                p2628d.p2639f.p2641b.C52711k.m112236a(r15, r9)
                r9 = r15
                com.ss.android.ugc.aweme.common.c r9 = (com.p683ss.android.ugc.aweme.common.C26855c) r9
                r7.f97945a = r4
                r7.f97949e = r0
                r7.f97946b = r5
                r7.f97950f = r3
                r7.f97951g = r1
                r7.f97952h = r6
                r7.f97947c = r2
                r7.f97948d = r10
                r0 = 7
                r7.f97953i = r0
                r0 = r11
                r1 = r12
                r2 = r13
                r3 = r14
                r4 = r9
                r6 = r18
                java.lang.Object r0 = r0.mo78401a(r1, r2, r3, r4, r5, r6)
                if (r0 != r8) goto L_0x03de
                return r8
            L_0x03de:
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x03f2
                com.ss.android.ugc.aweme.opensdk.c.a r0 = r7.f97954j
                android.arch.lifecycle.r<java.lang.Boolean> r0 = r0.f97943d
                r1 = 1
                java.lang.Boolean r1 = p2628d.p2631c.p2633b.p2634a.C52614b.m112161a(r1)
                r0.setValue(r1)
            L_0x03f2:
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            L_0x03f5:
                r0 = 20006(0x4e26, float:2.8034E-41)
                java.lang.String r1 = "TikTok Network error"
                com.ss.android.ugc.aweme.opensdk.share.share.Share$Request r2 = r7.f97958n
                com.ss.android.ugc.aweme.opensdk.share.share.Share$Response r0 = com.p683ss.android.ugc.aweme.opensdk.p2040c.C38499a.m85838a(r0, r1, r2)
                com.ss.android.ugc.aweme.opensdk.c.a r1 = r7.f97954j
                android.arch.lifecycle.r<com.ss.android.ugc.aweme.opensdk.share.share.Share$Response> r1 = r1.f97941b
                r1.setValue(r0)
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.opensdk.p2040c.C38499a.C38501b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C38499a(C38513g gVar) {
        C52711k.m112240b(gVar, "shareDistinctType");
        this.f97944e = gVar;
    }

    /* renamed from: a */
    public static Response m85838a(int i, String str, Request request) {
        Response response = new Response();
        response.errorCode = C38515a.m85850a(i);
        response.errorMsg = str;
        response.subErrorCode = i;
        response.state = request.mState;
        return response;
    }
}
