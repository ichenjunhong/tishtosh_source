package com.p683ss.android.ugc.aweme.protection;

import android.content.Context;
import android.os.Looper;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.C27987x;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.compliance.business.api.p1601a.C27018a;
import com.p683ss.android.ugc.aweme.compliance.business.api.p1601a.C27019b;
import com.p683ss.android.ugc.aweme.compliance.business.api.services.C27021a;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1807im.disableim.C33193d;
import com.p683ss.android.ugc.aweme.p1807im.disableim.ImUnder16Manger;
import com.p683ss.android.ugc.aweme.protection.gradientpunish.C40878a;
import com.p683ss.android.ugc.aweme.protection.model.AdPersonalitySettings;
import com.p683ss.android.ugc.aweme.protection.model.AgeGateInfo;
import com.p683ss.android.ugc.aweme.protection.model.ComplianceSetting;
import com.p683ss.android.ugc.aweme.protection.model.TermsConsentInfo;
import com.p683ss.android.ugc.aweme.protection.p2093a.C40837a;
import com.p683ss.android.ugc.aweme.protection.p2099b.C40863a;
import com.p683ss.android.ugc.aweme.protection.p2099b.C40863a.C40866c;
import com.p683ss.android.ugc.aweme.protection.p2099b.C40868c;
import com.p683ss.android.ugc.aweme.setting.experiment.ClearRedPointCostExperiment;
import com.p683ss.android.ugc.aweme.setting.personalization.p2143a.C41666a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;
import p001a.C0013i;
import p064c.p065a.C1674ab;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p093k.C2168a;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.protection.c */
public final class C40869c {

    /* renamed from: a */
    static final C40863a f104032a = new C40863a();

    /* renamed from: b */
    public static final C40837a f104033b = new C40837a();

    /* renamed from: c */
    public static boolean f104034c;

    /* renamed from: d */
    public static final C40869c f104035d = new C40869c();

    /* renamed from: e */
    private static int f104036e = 3;

    /* renamed from: f */
    private static boolean f104037f;

    /* renamed from: com.ss.android.ugc.aweme.protection.c$a */
    static final class C40870a<V> implements Callable<C52860x> {

        /* renamed from: a */
        public static final C40870a f104038a = new C40870a();

        C40870a() {
        }

        public final /* synthetic */ Object call() {
            C40869c.f104035d.mo83207h();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.protection.c$b */
    public static final class C40871b implements C40868c {

        /* renamed from: a */
        final /* synthetic */ int f104039a;

        /* renamed from: b */
        public final void mo83202b() {
            int i;
            Context g = C11016e.m22312g();
            if (C11016e.m22312g() instanceof MainActivity) {
                i = 2;
            } else {
                i = 1;
            }
            C10691a.m21550c(g, (int) R.string.b0d, 1, i).mo19066a();
        }

        /* JADX WARNING: type inference failed for: r2v0 */
        /* JADX WARNING: type inference failed for: r2v1 */
        /* JADX WARNING: type inference failed for: r2v3 */
        /* JADX WARNING: type inference failed for: r10v6 */
        /* JADX WARNING: type inference failed for: r2v5, types: [com.ss.android.ugc.aweme.protection.model.AdPersonalitySettings] */
        /* JADX WARNING: type inference failed for: r2v7, types: [java.lang.Integer] */
        /* JADX WARNING: type inference failed for: r2v8 */
        /* JADX WARNING: type inference failed for: r2v9 */
        /* JADX WARNING: type inference failed for: r2v10 */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a6, code lost:
            if (r1 == null) goto L_0x00a8;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 5 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo83201a() {
            /*
                r30 = this;
                r0 = r30
                com.ss.android.ugc.aweme.protection.model.AdPersonalitySettings r1 = com.p683ss.android.ugc.aweme.protection.C40869c.m90386q()
                r15 = 1
                r2 = 0
                if (r1 == 0) goto L_0x006e
                int r3 = r0.f104039a
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                com.ss.android.ugc.aweme.protection.model.AdPersonalitySettings r9 = com.p683ss.android.ugc.aweme.protection.C40869c.m90386q()
                if (r9 == 0) goto L_0x0020
                java.lang.Boolean r9 = r9.getShowThirdAd()
                goto L_0x0021
            L_0x0020:
                r9 = r2
            L_0x0021:
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r15)
                boolean r9 = p2628d.p2639f.p2641b.C52711k.m112239a(r9, r10)
                if (r9 == 0) goto L_0x0032
                int r9 = r0.f104039a
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                goto L_0x0033
            L_0x0032:
                r9 = r2
            L_0x0033:
                com.ss.android.ugc.aweme.protection.model.AdPersonalitySettings r10 = com.p683ss.android.ugc.aweme.protection.C40869c.m90386q()
                if (r10 == 0) goto L_0x003e
                java.lang.Boolean r10 = r10.getShowPartnerAd()
                goto L_0x003f
            L_0x003e:
                r10 = r2
            L_0x003f:
                java.lang.Boolean r11 = java.lang.Boolean.valueOf(r15)
                boolean r10 = p2628d.p2639f.p2641b.C52711k.m112239a(r10, r11)
                if (r10 == 0) goto L_0x004f
                int r2 = r0.f104039a
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            L_0x004f:
                r10 = r2
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r16 = 3902(0xf3e, float:5.468E-42)
                r17 = 0
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                r6 = r7
                r7 = r8
                r8 = r9
                r9 = r10
                r10 = r11
                r11 = r12
                r12 = r13
                r13 = r14
                r14 = r16
                r0 = 1
                r15 = r17
                com.ss.android.ugc.aweme.protection.model.AdPersonalitySettings r2 = com.p683ss.android.ugc.aweme.protection.model.AdPersonalitySettings.copy$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                goto L_0x006f
            L_0x006e:
                r0 = 1
            L_0x006f:
                com.ss.android.ugc.aweme.protection.a.a r1 = com.p683ss.android.ugc.aweme.protection.C40869c.m90371a()
                com.ss.android.ugc.aweme.protection.model.ComplianceSetting r3 = r1.mo83162a()
                if (r3 == 0) goto L_0x00a8
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
                r28 = 16775167(0xfff7ff, float:2.3507016E-38)
                r29 = 0
                r15 = r2
                com.ss.android.ugc.aweme.protection.model.ComplianceSetting r1 = com.p683ss.android.ugc.aweme.protection.model.ComplianceSetting.copy$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
                if (r1 != 0) goto L_0x00d7
            L_0x00a8:
                com.ss.android.ugc.aweme.protection.model.ComplianceSetting r1 = new com.ss.android.ugc.aweme.protection.model.ComplianceSetting
                r3 = r1
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
                r28 = 16775167(0xfff7ff, float:2.3507016E-38)
                r29 = 0
                r15 = r2
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            L_0x00d7:
                com.p683ss.android.ugc.aweme.protection.C40869c.m90373a(r1)
                android.app.Activity r1 = com.bytedance.ies.ugc.p694a.C11016e.m22312g()
                boolean r1 = r1 instanceof com.p683ss.android.ugc.aweme.main.MainActivity
                if (r1 == 0) goto L_0x00f3
                android.app.Activity r1 = com.bytedance.ies.ugc.p694a.C11016e.m22312g()
                android.content.Context r1 = (android.content.Context) r1
                r2 = 2132547787(0x7f1c18cb, float:2.074883E38)
                r3 = 2
                com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21550c(r1, r2, r0, r3)
                r0.mo19066a()
            L_0x00f3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.protection.C40869c.C40871b.mo83201a():void");
        }

        C40871b(int i) {
            this.f104039a = i;
        }
    }

    private C40869c() {
    }

    /* renamed from: a */
    public static C40837a m90371a() {
        return f104033b;
    }

    /* renamed from: b */
    public static int m90377b() {
        return f104036e;
    }

    /* renamed from: c */
    public static void m90378c() {
        f104032a.mo83199a();
    }

    /* renamed from: t */
    public static void m90389t() {
        f104033b.mo83166b(0);
    }

    /* renamed from: q */
    public static AdPersonalitySettings m90386q() {
        ComplianceSetting a = f104033b.mo83162a();
        if (a != null) {
            return a.getAdPersonalitySettings();
        }
        return null;
    }

    /* renamed from: x */
    public static TermsConsentInfo m90393x() {
        ComplianceSetting a = f104033b.mo83162a();
        if (a != null) {
            return a.getTermsConsentInfo();
        }
        return null;
    }

    /* renamed from: d */
    public final void mo83204d() {
        f104033b.mo83164a((ComplianceSetting) null);
        m90376a(true, (C27987x) null);
    }

    /* renamed from: A */
    private static boolean m90370A() {
        if (AVExternalServiceImpl.getAVServiceImpl_Monster().draftService().draftList(true).size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static String m90379e() {
        ComplianceSetting a = m90371a().mo83162a();
        if (a != null) {
            String complianceEncrypt = a.getComplianceEncrypt();
            if (complianceEncrypt != null) {
                return complianceEncrypt;
            }
        }
        return "unknown";
    }

    /* renamed from: j */
    public static boolean m90380j() {
        ComplianceSetting a = f104033b.mo83162a();
        if (a != null) {
            AgeGateInfo ageGateInfo = a.getAgeGateInfo();
            if (ageGateInfo != null && ageGateInfo.getAgeGatePostAction() == 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m90381k() {
        ComplianceSetting a = f104033b.mo83162a();
        if (a != null) {
            Boolean algoFreeEnabled = a.getAlgoFreeEnabled();
            if (algoFreeEnabled != null) {
                return algoFreeEnabled.booleanValue();
            }
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m90382l() {
        ComplianceSetting a = f104033b.mo83162a();
        if (a != null) {
            Boolean enableVpa = a.getEnableVpa();
            if (enableVpa != null) {
                return enableVpa.booleanValue();
            }
        }
        return false;
    }

    /* renamed from: n */
    public static int m90383n() {
        ComplianceSetting a = f104033b.mo83162a();
        if (a != null) {
            AdPersonalitySettings adPersonalitySettings = a.getAdPersonalitySettings();
            if (adPersonalitySettings != null) {
                Integer mode = adPersonalitySettings.getMode();
                if (mode != null) {
                    return mode.intValue();
                }
            }
        }
        return 0;
    }

    /* renamed from: o */
    public static int m90384o() {
        ComplianceSetting a = f104033b.mo83162a();
        if (a != null) {
            AdPersonalitySettings adPersonalitySettings = a.getAdPersonalitySettings();
            if (adPersonalitySettings != null) {
                Integer thirdAdMode = adPersonalitySettings.getThirdAdMode();
                if (thirdAdMode != null) {
                    return thirdAdMode.intValue();
                }
            }
        }
        return 0;
    }

    /* renamed from: p */
    public static int m90385p() {
        ComplianceSetting a = f104033b.mo83162a();
        if (a != null) {
            AdPersonalitySettings adPersonalitySettings = a.getAdPersonalitySettings();
            if (adPersonalitySettings != null) {
                Integer partnerAdMode = adPersonalitySettings.getPartnerAdMode();
                if (partnerAdMode != null) {
                    return partnerAdMode.intValue();
                }
            }
        }
        return 0;
    }

    /* renamed from: r */
    public static String m90387r() {
        ComplianceSetting a = f104033b.mo83162a();
        if (a != null) {
            String impressumUrl = a.getImpressumUrl();
            if (impressumUrl != null) {
                return impressumUrl;
            }
        }
        return "";
    }

    /* renamed from: s */
    public static int m90388s() {
        ComplianceSetting a = f104033b.mo83162a();
        if (a != null) {
            Integer enableDoNotSell = a.getEnableDoNotSell();
            if (enableDoNotSell != null) {
                return enableDoNotSell.intValue();
            }
        }
        return 0;
    }

    /* renamed from: v */
    public static String m90391v() {
        ComplianceSetting a = f104033b.mo83162a();
        if (a != null) {
            TermsConsentInfo termsConsentInfo = a.getTermsConsentInfo();
            if (termsConsentInfo != null) {
                String termsOfUseUrl = termsConsentInfo.getTermsOfUseUrl();
                if (termsOfUseUrl != null) {
                    return termsOfUseUrl;
                }
            }
        }
        return "";
    }

    /* renamed from: w */
    public static String m90392w() {
        ComplianceSetting a = f104033b.mo83162a();
        if (a != null) {
            TermsConsentInfo termsConsentInfo = a.getTermsConsentInfo();
            if (termsConsentInfo != null) {
                String privacyPolicyUrl = termsConsentInfo.getPrivacyPolicyUrl();
                if (privacyPolicyUrl != null) {
                    return privacyPolicyUrl;
                }
            }
        }
        return "";
    }

    /* renamed from: z */
    private static boolean m90395z() {
        if (!C27021a.f71325a.isShowPrivacyAccountSetting()) {
            return false;
        }
        C47718bf.m103288a(new C27019b());
        return true;
    }

    /* renamed from: f */
    public final boolean mo83205f() {
        AdPersonalitySettings q = m90386q();
        if (q != null) {
            Boolean isFollowSysTemConfig = q.isFollowSysTemConfig();
            if (isFollowSysTemConfig != null) {
                return isFollowSysTemConfig.booleanValue();
            }
        }
        return false;
    }

    /* renamed from: i */
    public final int mo83208i() {
        int i;
        ComplianceSetting a = f104033b.mo83162a();
        if (a != null) {
            AgeGateInfo ageGateInfo = a.getAgeGateInfo();
            if (ageGateInfo != null) {
                i = ageGateInfo.getAgeGateAction();
                if (i == 2 || !m90370A()) {
                    return i;
                }
                return 0;
            }
        }
        i = 0;
        if (i == 2) {
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Integer m90390u() {
        /*
            com.ss.android.ugc.aweme.protection.a.a r0 = f104033b
            com.ss.android.ugc.aweme.protection.model.ComplianceSetting r0 = r0.mo83162a()
            r1 = 1
            if (r0 == 0) goto L_0x0014
            java.lang.Integer r0 = r0.getDefaultVpaContentChoice()
            if (r0 == 0) goto L_0x0014
            int r0 = r0.intValue()
            goto L_0x0015
        L_0x0014:
            r0 = 1
        L_0x0015:
            if (r0 != 0) goto L_0x001c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L_0x001c:
            com.ss.android.ugc.aweme.protection.a.a r0 = f104033b
            com.ss.android.ugc.aweme.protection.model.ComplianceSetting r0 = r0.mo83162a()
            if (r0 == 0) goto L_0x0029
            java.lang.Integer r0 = r0.getDefaultVpaContentChoice()
            return r0
        L_0x0029:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.protection.C40869c.m90390u():java.lang.Integer");
    }

    /* renamed from: y */
    private final boolean m90394y() {
        Boolean bool;
        AdPersonalitySettings q = m90386q();
        if (q != null) {
            bool = q.getNeedPopUp();
        } else {
            bool = null;
        }
        if (!C52711k.m112239a((Object) bool, (Object) Boolean.valueOf(true))) {
            return false;
        }
        C47718bf.m103288a(new C41666a());
        return true;
    }

    /* renamed from: g */
    public final void mo83206g() {
        if (!C52711k.m112239a((Object) Looper.getMainLooper(), (Object) Looper.myLooper()) || !C10181b.m20511a().mo18172a(ClearRedPointCostExperiment.class, true, "clear_red_point_cost", 31744, true)) {
            mo83207h();
        } else {
            C0013i.m16a((Callable<TResult>) C40870a.f104038a);
        }
    }

    /* renamed from: m */
    public final void mo83209m() {
        if (mo83205f()) {
            C23183v a = C23183v.m56778a();
            C52711k.m112236a((Object) a, "CommonSharePrefCache.inst()");
            C23051bf z = a.mo47930z();
            C52711k.m112236a((Object) z, "CommonSharePrefCache.ins…tOutGooglePersonalizedAds");
            Object d = z.mo47782d();
            C52711k.m112236a(d, "CommonSharePrefCache.ins…oglePersonalizedAds.cache");
            if (((Boolean) d).booleanValue() && m90383n() == 1) {
                mo83203b(false);
            }
        }
    }

    /* renamed from: h */
    public final void mo83207h() {
        if (f104034c) {
            f104034c = false;
            m90376a(true, (C27987x) null);
        } else if (m90395z() || C40861b.m90360b() || m90394y()) {
        } else {
            if (ImUnder16Manger.m76249b()) {
                C47718bf.m103288a(new C33193d());
            } else if (!C40878a.m90441a()) {
                C47718bf.m103288a(new C27018a(true ^ f104037f));
            }
        }
    }

    /* renamed from: a */
    public static void m90372a(int i) {
        f104036e = i;
    }

    /* renamed from: a */
    public static void m90373a(ComplianceSetting complianceSetting) {
        C52711k.m112240b(complianceSetting, "setting");
        f104033b.mo83164a(complianceSetting);
    }

    /* renamed from: a */
    public static void m90375a(boolean z) {
        f104037f = true;
    }

    /* renamed from: b */
    public final void mo83203b(boolean z) {
        String str;
        String str2;
        Object obj;
        String str3;
        String str4;
        String str5;
        String str6;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(new JSONObject().put("field", "pers_ad_main_mode").put("value", String.valueOf(z ? 1 : 0)));
        String str7 = "change_personalization_status";
        C23089d dVar = new C23089d();
        String str8 = "initial_status";
        if (!z) {
            str = "on";
        } else {
            str = "off";
        }
        C23089d a = dVar.mo47829a(str8, str);
        String str9 = "final_status";
        if (z) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        C26890h.m65011a(str7, a.mo47829a(str9, str2).f61491a);
        AdPersonalitySettings q = m90386q();
        Boolean bool = null;
        if (q != null) {
            obj = q.getShowThirdAd();
        } else {
            obj = null;
        }
        if (C52711k.m112239a(obj, (Object) Boolean.valueOf(true))) {
            jSONArray.put(new JSONObject().put("field", "pers_ad_third_party_networks_mode").put("value", String.valueOf(z)));
            String str10 = "change_ad_third_party_network_status";
            C23089d dVar2 = new C23089d();
            String str11 = "initial_status";
            if (!z) {
                str5 = "on";
            } else {
                str5 = "off";
            }
            C23089d a2 = dVar2.mo47829a(str11, str5);
            String str12 = "final_status";
            if (z) {
                str6 = "on";
            } else {
                str6 = "off";
            }
            C26890h.m65011a(str10, a2.mo47829a(str12, str6).f61491a);
        }
        AdPersonalitySettings q2 = m90386q();
        if (q2 != null) {
            bool = q2.getShowPartnerAd();
        }
        if (C52711k.m112239a((Object) bool, (Object) Boolean.valueOf(true))) {
            jSONArray.put(new JSONObject().put("field", "pers_ad_data_received_partner_mode").put("value", String.valueOf(z)));
            String str13 = "change_ad_data_from_partner_status";
            C23089d dVar3 = new C23089d();
            String str14 = "initial_status";
            if (!z) {
                str3 = "on";
            } else {
                str3 = "off";
            }
            C23089d a3 = dVar3.mo47829a(str14, str3);
            String str15 = "final_status";
            if (z) {
                str4 = "on";
            } else {
                str4 = "off";
            }
            C26890h.m65011a(str13, a3.mo47829a(str15, str4).f61491a);
        }
        String jSONArray2 = jSONArray.toString();
        C52711k.m112236a((Object) jSONArray2, "json.toString()");
        m90374a(jSONArray2, (C40868c) new C40871b(z));
    }

    /* renamed from: a */
    public static void m90374a(String str, C40868c cVar) {
        C52711k.m112240b(str, "settingsJson");
        C52711k.m112240b(cVar, "listener");
        C40863a aVar = f104032a;
        C52711k.m112240b(str, "settingsJson");
        C52711k.m112240b(cVar, "listener");
        aVar.f104027a.setComplianceSettings(str).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C40866c<Object>(cVar));
    }

    /* renamed from: a */
    public static void m90376a(boolean z, C27987x xVar) {
        C40861b.m90359a(z, f104032a, xVar);
    }
}
