package com.p683ss.android.ugc.aweme.protection;

import com.p683ss.android.ugc.aweme.AlgoFreeInfo;
import com.p683ss.android.ugc.aweme.C22783ao;
import com.p683ss.android.ugc.aweme.C27978o;
import com.p683ss.android.ugc.aweme.C27987x;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.protection.api.ComplianceApi.C40854a;
import com.p683ss.android.ugc.aweme.protection.gradientpunish.C40878a;
import com.p683ss.android.ugc.aweme.protection.model.AdPersonalitySettings;
import com.p683ss.android.ugc.aweme.protection.model.ComplianceSetting;
import com.p683ss.android.ugc.aweme.protection.p2099b.C40863a;
import com.p683ss.android.ugc.aweme.protection.p2099b.C40863a.C40864a;
import java.util.ArrayList;
import java.util.List;
import p064c.p065a.C1674ab;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p093k.C2168a;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.protection.d */
public final class C40872d implements C22783ao {

    /* renamed from: com.ss.android.ugc.aweme.protection.d$a */
    public static final class C40873a implements C1674ab<BaseResponse> {

        /* renamed from: a */
        final /* synthetic */ C52670a f104040a;

        /* renamed from: b */
        final /* synthetic */ int f104041b;

        /* renamed from: c */
        final /* synthetic */ C52670a f104042c;

        public final void onComplete() {
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
            C40869c.m90371a().mo83166b(this.f104041b);
            C23131p.m56692a("opt_out_failed", "", null);
            this.f104042c.invoke();
        }

        public final /* synthetic */ void onNext(Object obj) {
            BaseResponse baseResponse = (BaseResponse) obj;
            C52711k.m112240b(baseResponse, "t");
            if (baseResponse.error_code == 0) {
                C40869c.m90371a().mo83166b(3);
                this.f104040a.invoke();
                return;
            }
            C40869c.m90371a().mo83166b(this.f104041b);
            C23131p.m56692a("opt_out_failed", "", null);
            this.f104042c.invoke();
        }

        C40873a(C52670a aVar, int i, C52670a aVar2) {
            this.f104040a = aVar;
            this.f104041b = i;
            this.f104042c = aVar2;
        }
    }

    /* renamed from: p */
    public final void mo47255p() {
        C40878a.m90441a();
    }

    /* renamed from: f */
    public final int mo47245f() {
        return C40869c.m90388s();
    }

    /* renamed from: i */
    public final String mo47248i() {
        return C40869c.m90387r();
    }

    /* renamed from: k */
    public final boolean mo47250k() {
        return C40869c.m90382l();
    }

    /* renamed from: q */
    public final int mo47256q() {
        return C40869c.m90383n();
    }

    /* renamed from: r */
    public final String mo47257r() {
        return C40869c.m90379e();
    }

    /* renamed from: t */
    public final int mo47259t() {
        return C40869c.f104035d.mo83208i();
    }

    /* renamed from: s */
    public final String mo47258s() {
        ComplianceSetting a = C40869c.f104033b.mo83162a();
        if (a != null) {
            return a.getFamilyPairing();
        }
        return null;
    }

    /* renamed from: a */
    public final String mo47236a() {
        ComplianceSetting a = C40869c.f104033b.mo83162a();
        if (a != null) {
            String vpaInfoBarUrl = a.getVpaInfoBarUrl();
            if (vpaInfoBarUrl != null) {
                return vpaInfoBarUrl;
            }
        }
        return "";
    }

    /* renamed from: c */
    public final AlgoFreeInfo mo47242c() {
        ComplianceSetting a = C40869c.m90371a().mo83162a();
        if (a != null) {
            return a.getAlgoFreeInfo();
        }
        return null;
    }

    /* renamed from: d */
    public final boolean mo47243d() {
        ComplianceSetting a = C40869c.m90371a().mo83162a();
        if (a != null) {
            Boolean algoFreeEnabled = a.getAlgoFreeEnabled();
            if (algoFreeEnabled != null) {
                return algoFreeEnabled.booleanValue();
            }
        }
        return false;
    }

    /* renamed from: g */
    public final List<String> mo47246g() {
        ComplianceSetting a = C40869c.f104033b.mo83162a();
        if (a != null) {
            List<String> blackSetting = a.getBlackSetting();
            if (blackSetting != null) {
                return blackSetting;
            }
        }
        return new ArrayList<>();
    }

    /* renamed from: j */
    public final String mo47249j() {
        ComplianceSetting a = C40869c.f104033b.mo83162a();
        if (a != null) {
            String privacyPolicyUrl = a.getPrivacyPolicyUrl();
            if (privacyPolicyUrl != null) {
                return privacyPolicyUrl;
            }
        }
        return "";
    }

    /* renamed from: l */
    public final boolean mo47251l() {
        ComplianceSetting a = C40869c.m90371a().mo83162a();
        if (a != null) {
            Boolean forcePrivateAccount = a.getForcePrivateAccount();
            if (forcePrivateAccount != null) {
                return forcePrivateAccount.booleanValue();
            }
        }
        return false;
    }

    /* renamed from: m */
    public final int mo47252m() {
        ComplianceSetting a = C40869c.m90371a().mo83162a();
        if (a != null) {
            Integer notifyPrivateAccount = a.getNotifyPrivateAccount();
            if (notifyPrivateAccount != null) {
                return notifyPrivateAccount.intValue();
            }
        }
        return 0;
    }

    /* renamed from: n */
    public final boolean mo47253n() {
        AdPersonalitySettings q = C40869c.m90386q();
        if (q != null) {
            Boolean isShowSettings = q.isShowSettings();
            if (isShowSettings != null) {
                return isShowSettings.booleanValue();
            }
        }
        return false;
    }

    /* renamed from: b */
    public final int mo47241b() {
        if (C40869c.m90371a().mo83165b() != 0) {
            return C40869c.m90371a().mo83165b();
        }
        ComplianceSetting a = C40869c.m90371a().mo83162a();
        if (a != null) {
            Integer defaultVpaContentChoice = a.getDefaultVpaContentChoice();
            if (defaultVpaContentChoice != null) {
                return defaultVpaContentChoice.intValue();
            }
        }
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r0 == null) goto L_0x0011;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo47247h() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.protection.c r0 = com.p683ss.android.ugc.aweme.protection.C40869c.f104035d
            com.ss.android.ugc.aweme.protection.a.a r0 = com.p683ss.android.ugc.aweme.protection.C40869c.f104033b
            com.ss.android.ugc.aweme.protection.model.ComplianceSetting r0 = r0.mo83162a()
            r1 = 0
            if (r0 == 0) goto L_0x0011
            java.lang.Integer r0 = r0.getEnableImpressum()
            if (r0 != 0) goto L_0x0015
        L_0x0011:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x0015:
            boolean r2 = r0 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x001a
            goto L_0x0020
        L_0x001a:
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x002e
        L_0x0020:
            java.lang.String r0 = com.p683ss.android.ugc.aweme.protection.C40869c.m90387r()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x002e
            r0 = 1
            return r0
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.protection.C40872d.mo47247h():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0039, code lost:
        if (r0 == null) goto L_0x003b;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47244e() {
        /*
            r28 = this;
            com.ss.android.ugc.aweme.protection.a.a r0 = com.p683ss.android.ugc.aweme.protection.C40869c.m90371a()
            com.ss.android.ugc.aweme.protection.model.ComplianceSetting r1 = r0.mo83162a()
            if (r1 == 0) goto L_0x003b
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r0 = 0
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r0)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 16775679(0xfff9ff, float:2.3507733E-38)
            r27 = 0
            com.ss.android.ugc.aweme.protection.model.ComplianceSetting r0 = com.p683ss.android.ugc.aweme.protection.model.ComplianceSetting.copy$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            if (r0 != 0) goto L_0x0068
        L_0x003b:
            com.ss.android.ugc.aweme.protection.model.ComplianceSetting r0 = new com.ss.android.ugc.aweme.protection.model.ComplianceSetting
            r1 = r0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 16777215(0xffffff, float:2.3509886E-38)
            r27 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x0068:
            com.p683ss.android.ugc.aweme.protection.C40869c.m90373a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.protection.C40872d.mo47244e():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0039, code lost:
        if (r1 == null) goto L_0x003b;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47254o() {
        /*
            r29 = this;
            com.ss.android.ugc.aweme.protection.c r0 = com.p683ss.android.ugc.aweme.protection.C40869c.f104035d
            com.ss.android.ugc.aweme.protection.a.a r0 = com.p683ss.android.ugc.aweme.protection.C40869c.f104033b
            com.ss.android.ugc.aweme.protection.model.ComplianceSetting r1 = r0.mo83162a()
            r0 = 0
            if (r1 == 0) goto L_0x003b
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 16773119(0xffefff, float:2.3504146E-38)
            r27 = 0
            com.ss.android.ugc.aweme.protection.model.ComplianceSetting r1 = com.p683ss.android.ugc.aweme.protection.model.ComplianceSetting.copy$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            if (r1 != 0) goto L_0x006e
        L_0x003b:
            com.ss.android.ugc.aweme.protection.model.ComplianceSetting r1 = new com.ss.android.ugc.aweme.protection.model.ComplianceSetting
            r2 = r1
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r0)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 16764927(0xffcfff, float:2.3492666E-38)
            r28 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x006e:
            com.p683ss.android.ugc.aweme.protection.C40869c.m90373a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.protection.C40872d.mo47254o():void");
    }

    /* renamed from: a */
    public final void mo47238a(C27978o oVar) {
        C52711k.m112240b(oVar, "listener");
        C52711k.m112240b(oVar, "listener");
        C40863a aVar = C40869c.f104032a;
        C52711k.m112240b(oVar, "listener");
        aVar.f104027a.getAlgoFreeSettings().mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C40864a<Object>(oVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0070, code lost:
        if (r1 == null) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r0 == null) goto L_0x0024;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47237a(int r37) {
        /*
            r36 = this;
            r0 = -1
            r9 = r37
            if (r9 == r0) goto L_0x00aa
            com.ss.android.ugc.aweme.protection.a.a r0 = com.p683ss.android.ugc.aweme.protection.C40869c.m90371a()
            com.ss.android.ugc.aweme.protection.model.ComplianceSetting r0 = r0.mo83162a()
            if (r0 == 0) goto L_0x0024
            com.ss.android.ugc.aweme.protection.model.AgeGateInfo r1 = r0.getAgeGateInfo()
            if (r1 == 0) goto L_0x0024
            r2 = 0
            r3 = 0
            r5 = 0
            r7 = 9
            r8 = 0
            r4 = r37
            com.ss.android.ugc.aweme.protection.model.AgeGateInfo r0 = com.p683ss.android.ugc.aweme.protection.model.AgeGateInfo.copy$default(r1, r2, r3, r4, r5, r7, r8)
            if (r0 != 0) goto L_0x0033
        L_0x0024:
            com.ss.android.ugc.aweme.protection.model.AgeGateInfo r0 = new com.ss.android.ugc.aweme.protection.model.AgeGateInfo
            r2 = 0
            r3 = 0
            r5 = 0
            r7 = 9
            r8 = 0
            r1 = r0
            r4 = r37
            r1.<init>(r2, r3, r4, r5, r7, r8)
        L_0x0033:
            com.ss.android.ugc.aweme.protection.a.a r1 = com.p683ss.android.ugc.aweme.protection.C40869c.m90371a()
            com.ss.android.ugc.aweme.protection.model.ComplianceSetting r9 = r1.mo83162a()
            if (r9 == 0) goto L_0x0072
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r34 = 8388607(0x7fffff, float:1.1754942E-38)
            r35 = 0
            r33 = r0
            com.ss.android.ugc.aweme.protection.model.ComplianceSetting r1 = com.p683ss.android.ugc.aweme.protection.model.ComplianceSetting.copy$default(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            if (r1 != 0) goto L_0x00a7
        L_0x0072:
            com.ss.android.ugc.aweme.protection.model.ComplianceSetting r1 = new com.ss.android.ugc.aweme.protection.model.ComplianceSetting
            r9 = r1
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r34 = 8388607(0x7fffff, float:1.1754942E-38)
            r35 = 0
            r33 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
        L_0x00a7:
            com.p683ss.android.ugc.aweme.protection.C40869c.m90373a(r1)
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.protection.C40872d.mo47237a(int):void");
    }

    /* renamed from: a */
    public final void mo47239a(C27987x xVar, boolean z) {
        C52711k.m112240b(xVar, "callback");
        C40869c.m90376a(z, xVar);
    }

    /* renamed from: a */
    public final void mo47240a(C52670a<C52860x> aVar, C52670a<C52860x> aVar2) {
        C52711k.m112240b(aVar, "success");
        C52711k.m112240b(aVar2, "failed");
        int b = C40869c.m90371a().mo83165b();
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        if (!g.isLogin()) {
            C40869c.m90371a().mo83166b(3);
            aVar.invoke();
            return;
        }
        C40854a.m90347a().setVPAContentChoice("vpa_content_choice", 3).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C40873a<Object>(aVar, b, aVar2));
    }
}
