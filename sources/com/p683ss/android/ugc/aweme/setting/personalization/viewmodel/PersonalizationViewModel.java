package com.p683ss.android.ugc.aweme.setting.personalization.viewmodel;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.content.Context;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.compliance.C27012a;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.protection.C40869c;
import com.p683ss.android.ugc.aweme.protection.p2099b.C40868c;
import com.ss.android.ugc.trill.R;
import org.json.JSONArray;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52722v.C52727e;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.setting.personalization.viewmodel.PersonalizationViewModel */
public final class PersonalizationViewModel extends C0209x {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f105432a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(PersonalizationViewModel.class), "personalityMainMode", "getPersonalityMainMode()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(PersonalizationViewModel.class), "thirdAdMode", "getThirdAdMode()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(PersonalizationViewModel.class), "partnerAdMode", "getPartnerAdMode()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: b */
    public boolean f105433b;

    /* renamed from: c */
    private final C52668f f105434c = C52732g.m112285a(new C41675b(this));

    /* renamed from: d */
    private final C52668f f105435d = C52732g.m112285a(new C41677d(this));

    /* renamed from: e */
    private final C52668f f105436e = C52732g.m112285a(new C41674a(this));

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.viewmodel.PersonalizationViewModel$a */
    static final class C41674a extends C52712l implements C52670a<C0198r<Integer>> {

        /* renamed from: a */
        final /* synthetic */ PersonalizationViewModel f105437a;

        C41674a(PersonalizationViewModel personalizationViewModel) {
            this.f105437a = personalizationViewModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Integer num;
            C0198r rVar = new C0198r();
            if (!this.f105437a.f105433b) {
                num = Integer.valueOf(C40869c.m90385p());
            } else {
                num = Integer.valueOf(0);
            }
            rVar.setValue(num);
            return rVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.viewmodel.PersonalizationViewModel$b */
    static final class C41675b extends C52712l implements C52670a<C0198r<Integer>> {

        /* renamed from: a */
        final /* synthetic */ PersonalizationViewModel f105438a;

        C41675b(PersonalizationViewModel personalizationViewModel) {
            this.f105438a = personalizationViewModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Integer num;
            C0198r rVar = new C0198r();
            if (!this.f105438a.f105433b) {
                num = Integer.valueOf(C40869c.m90383n());
            } else {
                num = Integer.valueOf(0);
            }
            rVar.setValue(num);
            return rVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.viewmodel.PersonalizationViewModel$c */
    public static final class C41676c implements C40868c {

        /* renamed from: a */
        final /* synthetic */ PersonalizationViewModel f105439a;

        /* renamed from: b */
        final /* synthetic */ Integer f105440b;

        /* renamed from: c */
        final /* synthetic */ Integer f105441c;

        /* renamed from: d */
        final /* synthetic */ Integer f105442d;

        /* renamed from: e */
        final /* synthetic */ C52727e f105443e;

        /* renamed from: f */
        final /* synthetic */ C52727e f105444f;

        /* renamed from: g */
        final /* synthetic */ C52727e f105445g;

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
            if (((Integer) this.f105443e.element) != null) {
                this.f105439a.mo85512a().setValue((Integer) this.f105443e.element);
            }
            if (((Integer) this.f105444f.element) != null) {
                this.f105439a.mo85514b().setValue((Integer) this.f105444f.element);
            }
            if (((Integer) this.f105445g.element) != null) {
                this.f105439a.mo85515c().setValue((Integer) this.f105445g.element);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
            if (r1.intValue() != 0) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ae, code lost:
            if (r1 == null) goto L_0x00b0;
         */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00eb  */
        /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo83201a() {
            /*
                r31 = this;
                r0 = r31
                java.lang.Integer r1 = r0.f105440b
                if (r1 != 0) goto L_0x0007
                goto L_0x000d
            L_0x0007:
                int r1 = r1.intValue()
                if (r1 == 0) goto L_0x0023
            L_0x000d:
                java.lang.Integer r1 = r0.f105441c
                if (r1 != 0) goto L_0x0012
                goto L_0x0018
            L_0x0012:
                int r1 = r1.intValue()
                if (r1 == 0) goto L_0x0023
            L_0x0018:
                java.lang.Integer r1 = r0.f105442d
                if (r1 != 0) goto L_0x001d
                goto L_0x002c
            L_0x001d:
                int r1 = r1.intValue()
                if (r1 != 0) goto L_0x002c
            L_0x0023:
                com.ss.android.ugc.aweme.ah.a r1 = new com.ss.android.ugc.aweme.ah.a
                r2 = 0
                r1.<init>(r2)
                com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r1)
            L_0x002c:
                com.ss.android.ugc.aweme.protection.model.AdPersonalitySettings r1 = com.p683ss.android.ugc.aweme.protection.C40869c.m90386q()
                com.ss.android.ugc.aweme.protection.model.AdPersonalitySettings r2 = com.p683ss.android.ugc.aweme.protection.C40869c.m90386q()
                r3 = 0
                if (r2 == 0) goto L_0x0076
                java.lang.Integer r4 = r0.f105440b
                if (r4 != 0) goto L_0x0043
                if (r1 == 0) goto L_0x0042
                java.lang.Integer r4 = r1.getMode()
                goto L_0x0043
            L_0x0042:
                r4 = r3
            L_0x0043:
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                java.lang.Integer r10 = r0.f105441c
                if (r10 != 0) goto L_0x0054
                if (r1 == 0) goto L_0x0053
                java.lang.Integer r10 = r1.getThirdAdMode()
                goto L_0x0054
            L_0x0053:
                r10 = r3
            L_0x0054:
                java.lang.Integer r11 = r0.f105442d
                if (r11 != 0) goto L_0x0061
                if (r1 == 0) goto L_0x005f
                java.lang.Integer r1 = r1.getPartnerAdMode()
                goto L_0x0062
            L_0x005f:
                r1 = r3
                goto L_0x0062
            L_0x0061:
                r1 = r11
            L_0x0062:
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 3902(0xf3e, float:5.468E-42)
                r16 = 0
                r3 = r4
                r4 = r5
                r5 = r6
                r6 = r7
                r7 = r8
                r8 = r9
                r9 = r10
                r10 = r1
                com.ss.android.ugc.aweme.protection.model.AdPersonalitySettings r3 = com.p683ss.android.ugc.aweme.protection.model.AdPersonalitySettings.copy$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            L_0x0076:
                com.ss.android.ugc.aweme.protection.a.a r1 = com.p683ss.android.ugc.aweme.protection.C40869c.m90371a()
                com.ss.android.ugc.aweme.protection.model.ComplianceSetting r4 = r1.mo83162a()
                if (r4 == 0) goto L_0x00b0
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
                r29 = 16775167(0xfff7ff, float:2.3507016E-38)
                r30 = 0
                r16 = r3
                com.ss.android.ugc.aweme.protection.model.ComplianceSetting r1 = com.p683ss.android.ugc.aweme.protection.model.ComplianceSetting.copy$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
                if (r1 != 0) goto L_0x00e0
            L_0x00b0:
                com.ss.android.ugc.aweme.protection.model.ComplianceSetting r1 = new com.ss.android.ugc.aweme.protection.model.ComplianceSetting
                r4 = r1
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
                r29 = 16775167(0xfff7ff, float:2.3507016E-38)
                r30 = 0
                r16 = r3
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            L_0x00e0:
                com.p683ss.android.ugc.aweme.protection.C40869c.m90373a(r1)
                android.app.Activity r1 = com.bytedance.ies.ugc.p694a.C11016e.m22312g()
                boolean r1 = r1 instanceof com.p683ss.android.ugc.aweme.main.MainActivity
                if (r1 == 0) goto L_0x00fd
                android.app.Activity r1 = com.bytedance.ies.ugc.p694a.C11016e.m22312g()
                android.content.Context r1 = (android.content.Context) r1
                r2 = 2132547787(0x7f1c18cb, float:2.074883E38)
                r3 = 1
                r4 = 2
                com.bytedance.ies.dmt.ui.d.a r1 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21550c(r1, r2, r3, r4)
                r1.mo19066a()
            L_0x00fd:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.setting.personalization.viewmodel.PersonalizationViewModel.C41676c.mo83201a():void");
        }

        C41676c(PersonalizationViewModel personalizationViewModel, Integer num, Integer num2, Integer num3, C52727e eVar, C52727e eVar2, C52727e eVar3) {
            this.f105439a = personalizationViewModel;
            this.f105440b = num;
            this.f105441c = num2;
            this.f105442d = num3;
            this.f105443e = eVar;
            this.f105444f = eVar2;
            this.f105445g = eVar3;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.viewmodel.PersonalizationViewModel$d */
    static final class C41677d extends C52712l implements C52670a<C0198r<Integer>> {

        /* renamed from: a */
        final /* synthetic */ PersonalizationViewModel f105446a;

        C41677d(PersonalizationViewModel personalizationViewModel) {
            this.f105446a = personalizationViewModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Integer num;
            C0198r rVar = new C0198r();
            if (!this.f105446a.f105433b) {
                num = Integer.valueOf(C40869c.m90384o());
            } else {
                num = Integer.valueOf(0);
            }
            rVar.setValue(num);
            return rVar;
        }
    }

    /* renamed from: a */
    public final C0198r<Integer> mo85512a() {
        return (C0198r) this.f105434c.getValue();
    }

    /* renamed from: b */
    public final C0198r<Integer> mo85514b() {
        return (C0198r) this.f105435d.getValue();
    }

    /* renamed from: c */
    public final C0198r<Integer> mo85515c() {
        return (C0198r) this.f105436e.getValue();
    }

    /* renamed from: a */
    public final void mo85513a(Integer num, Integer num2, Integer num3) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C52727e eVar = new C52727e();
        eVar.element = null;
        C52727e eVar2 = new C52727e();
        eVar2.element = null;
        C52727e eVar3 = new C52727e();
        eVar3.element = null;
        JSONArray jSONArray = new JSONArray();
        if (num != null) {
            jSONArray.put(new JSONObject().put("field", "pers_ad_main_mode").put("value", String.valueOf(num.intValue())));
            eVar.element = (Integer) mo85512a().getValue();
            mo85512a().setValue(num);
            String str7 = "change_personalization_status";
            C23089d dVar = new C23089d();
            String str8 = "initial_status";
            if (num.intValue() != 1) {
                str5 = "on";
            } else {
                str5 = "off";
            }
            C23089d a = dVar.mo47829a(str8, str5);
            String str9 = "final_status";
            if (num.intValue() == 1) {
                str6 = "on";
            } else {
                str6 = "off";
            }
            C26890h.m65011a(str7, a.mo47829a(str9, str6).f61491a);
        }
        if (num2 != null) {
            jSONArray.put(new JSONObject().put("field", "pers_ad_third_party_networks_mode").put("value", String.valueOf(num2.intValue())));
            eVar2.element = (Integer) mo85514b().getValue();
            mo85514b().setValue(num2);
            String str10 = "change_ad_third_party_network_status";
            C23089d dVar2 = new C23089d();
            String str11 = "initial_status";
            if (num2.intValue() != 1) {
                str3 = "on";
            } else {
                str3 = "off";
            }
            C23089d a2 = dVar2.mo47829a(str11, str3);
            String str12 = "final_status";
            if (num2.intValue() == 1) {
                str4 = "on";
            } else {
                str4 = "off";
            }
            C26890h.m65011a(str10, a2.mo47829a(str12, str4).f61491a);
        }
        if (num3 != null) {
            jSONArray.put(new JSONObject().put("field", "pers_ad_data_received_partner_mode").put("value", String.valueOf(num3.intValue())));
            eVar3.element = (Integer) mo85515c().getValue();
            mo85515c().setValue(num3);
            String str13 = "change_ad_data_from_partner_status";
            C23089d dVar3 = new C23089d();
            String str14 = "initial_status";
            if (num != null && num.intValue() == 1) {
                str = "off";
            } else {
                str = "on";
            }
            C23089d a3 = dVar3.mo47829a(str14, str);
            String str15 = "final_status";
            if (num != null && num.intValue() == 1) {
                str2 = "on";
            } else {
                str2 = "off";
            }
            C26890h.m65011a(str13, a3.mo47829a(str15, str2).f61491a);
        }
        C27012a.m65225a(num, mo85514b(), mo85515c());
        String jSONArray2 = jSONArray.toString();
        C52711k.m112236a((Object) jSONArray2, "json.toString()");
        C41676c cVar = new C41676c(this, num, num2, num3, eVar, eVar2, eVar3);
        C40869c.m90374a(jSONArray2, (C40868c) cVar);
    }

    /* renamed from: a */
    public static /* synthetic */ void m91530a(PersonalizationViewModel personalizationViewModel, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        personalizationViewModel.mo85513a(null, num2, num3);
    }
}
