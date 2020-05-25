package com.p683ss.android.ugc.aweme.app.services;

import android.os.Bundle;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.C22475af;
import com.p683ss.android.ugc.aweme.account.experiment.C20966a;
import com.p683ss.android.ugc.aweme.experiment.UseHandlerExperiment;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.friends.service.C32618e;
import com.p683ss.android.ugc.aweme.protection.C40869c;
import com.p683ss.android.ugc.aweme.protection.model.AgeGateInfo;
import com.p683ss.android.ugc.aweme.protection.model.ComplianceSetting;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.services.c */
public final class C23154c implements C22475af {
    /* renamed from: b */
    public final String mo46775b() {
        return C40869c.m90391v();
    }

    /* renamed from: c */
    public final String mo46776c() {
        return C40869c.m90392w();
    }

    /* renamed from: d */
    public final boolean mo46777d() {
        return UseHandlerExperiment.m69633a("Login");
    }

    /* renamed from: e */
    public final boolean mo46778e() {
        return C20966a.m53329a();
    }

    /* renamed from: f */
    public final int mo46779f() {
        ComplianceSetting a = C40869c.f104033b.mo83162a();
        if (a != null) {
            AgeGateInfo ageGateInfo = a.getAgeGateInfo();
            if (ageGateInfo != null) {
                return ageGateInfo.getRegisterAgeGateAction();
            }
        }
        return 0;
    }

    /* renamed from: g */
    public final int mo46780g() {
        ComplianceSetting a = C40869c.f104033b.mo83162a();
        if (a != null) {
            AgeGateInfo ageGateInfo = a.getAgeGateInfo();
            if (ageGateInfo != null) {
                return ageGateInfo.getAgeGatePostAction();
            }
        }
        return 0;
    }

    /* renamed from: h */
    public final long mo46781h() {
        ComplianceSetting a = C40869c.f104033b.mo83162a();
        if (a != null) {
            AgeGateInfo ageGateInfo = a.getAgeGateInfo();
            if (ageGateInfo != null) {
                return ageGateInfo.getAgeGateTime();
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final boolean mo46774a() {
        boolean z;
        ComplianceSetting a = C40869c.f104033b.mo83162a();
        if (a != null) {
            Boolean addTermsConsentForRegister = a.getAddTermsConsentForRegister();
            if (addTermsConsentForRegister != null) {
                z = addTermsConsentForRegister.booleanValue();
                if (z || TextUtils.isEmpty(mo46775b()) || TextUtils.isEmpty(mo46776c())) {
                    return false;
                }
                return true;
            }
        }
        z = false;
        if (z) {
        }
        return false;
    }

    /* renamed from: a */
    public final void mo46773a(Bundle bundle) {
        C52711k.m112240b(bundle, "data");
        C32618e thirdPartyFriendsService = C32616c.f84865a.thirdPartyFriendsService();
        if (thirdPartyFriendsService != null) {
            thirdPartyFriendsService.mo66142a(bundle);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006b, code lost:
        if (r1 == null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r0 == null) goto L_0x001f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo46772a(int r37, int r38) {
        /*
            r36 = this;
            com.ss.android.ugc.aweme.protection.a.a r0 = com.p683ss.android.ugc.aweme.protection.C40869c.m90371a()
            com.ss.android.ugc.aweme.protection.model.ComplianceSetting r0 = r0.mo83162a()
            if (r0 == 0) goto L_0x001f
            com.ss.android.ugc.aweme.protection.model.AgeGateInfo r1 = r0.getAgeGateInfo()
            if (r1 == 0) goto L_0x001f
            r2 = 0
            r3 = 0
            r5 = 0
            r7 = 11
            r8 = 0
            r4 = r37
            com.ss.android.ugc.aweme.protection.model.AgeGateInfo r0 = com.p683ss.android.ugc.aweme.protection.model.AgeGateInfo.copy$default(r1, r2, r3, r4, r5, r7, r8)
            if (r0 != 0) goto L_0x002e
        L_0x001f:
            com.ss.android.ugc.aweme.protection.model.AgeGateInfo r0 = new com.ss.android.ugc.aweme.protection.model.AgeGateInfo
            r2 = 0
            r3 = 0
            r5 = 0
            r7 = 11
            r8 = 0
            r1 = r0
            r4 = r37
            r1.<init>(r2, r3, r4, r5, r7, r8)
        L_0x002e:
            com.ss.android.ugc.aweme.protection.a.a r1 = com.p683ss.android.ugc.aweme.protection.C40869c.m90371a()
            com.ss.android.ugc.aweme.protection.model.ComplianceSetting r9 = r1.mo83162a()
            if (r9 == 0) goto L_0x006d
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
            if (r1 != 0) goto L_0x00a2
        L_0x006d:
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
        L_0x00a2:
            com.p683ss.android.ugc.aweme.protection.C40869c.m90373a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.app.services.C23154c.mo46772a(int, int):void");
    }
}
