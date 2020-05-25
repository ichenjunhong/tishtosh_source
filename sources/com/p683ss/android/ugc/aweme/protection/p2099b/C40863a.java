package com.p683ss.android.ugc.aweme.protection.p2099b;

import com.p683ss.android.ugc.aweme.C27978o;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.app.C23098h;
import com.p683ss.android.ugc.aweme.base.api.p1406a.C23454a;
import com.p683ss.android.ugc.aweme.compliance.C27012a;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.protection.C40869c;
import com.p683ss.android.ugc.aweme.protection.api.ComplianceApi;
import com.p683ss.android.ugc.aweme.protection.api.ComplianceApi.C40854a;
import com.p683ss.android.ugc.aweme.protection.model.AlgoFreeSettings;
import com.p683ss.android.ugc.aweme.protection.model.CmplRespForEncrypt;
import com.p683ss.android.ugc.aweme.protection.model.ComplianceSetting;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import p064c.p065a.C1674ab;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.protection.b.a */
public final class C40863a {

    /* renamed from: a */
    public final ComplianceApi f104027a = C40854a.m90347a();

    /* renamed from: com.ss.android.ugc.aweme.protection.b.a$a */
    public static final class C40864a implements C1674ab<AlgoFreeSettings> {

        /* renamed from: a */
        final /* synthetic */ C27978o f104028a;

        public final void onComplete() {
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        public C40864a(C27978o oVar) {
            this.f104028a = oVar;
        }

        public final void onError(Throwable th) {
            int i;
            C52711k.m112240b(th, "e");
            C27978o oVar = this.f104028a;
            if (th instanceof C23454a) {
                i = ((C23454a) th).getErrorCode();
            } else {
                i = -1;
            }
            oVar.mo56376a(i);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
            if (r2 == null) goto L_0x0073;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onNext(java.lang.Object r31) {
            /*
                r30 = this;
                r0 = r30
                r1 = r31
                com.ss.android.ugc.aweme.protection.model.AlgoFreeSettings r1 = (com.p683ss.android.ugc.aweme.protection.model.AlgoFreeSettings) r1
                java.lang.String r2 = "t"
                p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
                int r2 = r1.status_code
                if (r2 != 0) goto L_0x00b1
                com.ss.android.ugc.aweme.protection.a.a r2 = com.p683ss.android.ugc.aweme.protection.C40869c.m90371a()
                com.ss.android.ugc.aweme.protection.model.ComplianceSetting r3 = r2.mo83162a()
                if (r3 == 0) goto L_0x0073
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                java.lang.Boolean r2 = r1.getAlgoFreeEnabled()
                r13 = 0
                if (r2 != 0) goto L_0x0039
                com.ss.android.ugc.aweme.protection.a.a r2 = com.p683ss.android.ugc.aweme.protection.C40869c.m90371a()
                com.ss.android.ugc.aweme.protection.model.ComplianceSetting r2 = r2.mo83162a()
                if (r2 == 0) goto L_0x0038
                java.lang.Boolean r2 = r2.getAlgoFreeEnabled()
                goto L_0x0039
            L_0x0038:
                r2 = r13
            L_0x0039:
                com.ss.android.ugc.aweme.AlgoFreeInfo r14 = r1.getAlgoFreeInfo()
                if (r14 != 0) goto L_0x004e
                com.ss.android.ugc.aweme.protection.a.a r14 = com.p683ss.android.ugc.aweme.protection.C40869c.m90371a()
                com.ss.android.ugc.aweme.protection.model.ComplianceSetting r14 = r14.mo83162a()
                if (r14 == 0) goto L_0x004d
                com.ss.android.ugc.aweme.AlgoFreeInfo r13 = r14.getAlgoFreeInfo()
            L_0x004d:
                r14 = r13
            L_0x004e:
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
                r28 = 16775679(0xfff9ff, float:2.3507733E-38)
                r29 = 0
                r13 = r2
                com.ss.android.ugc.aweme.protection.model.ComplianceSetting r2 = com.p683ss.android.ugc.aweme.protection.model.ComplianceSetting.copy$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
                if (r2 != 0) goto L_0x00a8
            L_0x0073:
                com.ss.android.ugc.aweme.protection.model.ComplianceSetting r2 = new com.ss.android.ugc.aweme.protection.model.ComplianceSetting
                r3 = r2
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                java.lang.Boolean r13 = r1.getAlgoFreeEnabled()
                com.ss.android.ugc.aweme.AlgoFreeInfo r14 = r1.getAlgoFreeInfo()
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
                r28 = 16775679(0xfff9ff, float:2.3507733E-38)
                r29 = 0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            L_0x00a8:
                com.p683ss.android.ugc.aweme.protection.C40869c.m90373a(r2)
                com.ss.android.ugc.aweme.o r1 = r0.f104028a
                r1.mo56375a()
                return
            L_0x00b1:
                com.ss.android.ugc.aweme.o r2 = r0.f104028a
                int r1 = r1.status_code
                r2.mo56376a(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.protection.p2099b.C40863a.C40864a.onNext(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.protection.b.a$b */
    public static final class C40865b implements C1674ab<ComplianceSetting> {

        /* renamed from: a */
        final /* synthetic */ C40863a f104029a;

        /* renamed from: b */
        final /* synthetic */ C40867b f104030b;

        public final void onComplete() {
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
            C40867b bVar = this.f104030b;
            if (bVar != null) {
                bVar.mo83197a();
            }
            if (C40869c.m90377b() > 0) {
                C40869c.m90372a(C40869c.m90377b() - 1);
                this.f104029a.mo83200a(this.f104030b);
            }
        }

        public final /* synthetic */ void onNext(Object obj) {
            ComplianceSetting complianceSetting = (ComplianceSetting) obj;
            C52711k.m112240b(complianceSetting, "setting");
            if (complianceSetting.status_code == 0) {
                C40869c.m90373a(complianceSetting);
                C40867b bVar = this.f104030b;
                if (bVar != null) {
                    bVar.mo83198a(complianceSetting);
                }
                C40869c.m90372a(3);
                return;
            }
            C40867b bVar2 = this.f104030b;
            if (bVar2 != null) {
                bVar2.mo83197a();
            }
            if (C40869c.m90377b() > 0) {
                C40869c.m90372a(C40869c.m90377b() - 1);
                this.f104029a.mo83200a(this.f104030b);
            }
        }

        C40865b(C40863a aVar, C40867b bVar) {
            this.f104029a = aVar;
            this.f104030b = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.protection.b.a$c */
    public static final class C40866c implements C1674ab<CmplRespForEncrypt> {

        /* renamed from: a */
        final /* synthetic */ C40868c f104031a;

        public final void onComplete() {
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        public C40866c(C40868c cVar) {
            this.f104031a = cVar;
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
            this.f104031a.mo83202b();
            C27012a.m65226a("/aweme/v1/cmpl/set/settings/", 1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0048, code lost:
            if (r2 == null) goto L_0x004a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onNext(java.lang.Object r31) {
            /*
                r30 = this;
                r0 = r30
                r1 = r31
                com.ss.android.ugc.aweme.protection.model.CmplRespForEncrypt r1 = (com.p683ss.android.ugc.aweme.protection.model.CmplRespForEncrypt) r1
                java.lang.String r2 = "t"
                p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
                int r2 = r1.status_code
                if (r2 != 0) goto L_0x008a
                com.ss.android.ugc.aweme.protection.a.a r2 = com.p683ss.android.ugc.aweme.protection.C40869c.m90371a()
                com.ss.android.ugc.aweme.protection.model.ComplianceSetting r3 = r2.mo83162a()
                if (r3 == 0) goto L_0x004a
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
                java.lang.String r21 = r1.getComplianceEncrypt()
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r28 = 16646143(0xfdffff, float:2.3326215E-38)
                r29 = 0
                com.ss.android.ugc.aweme.protection.model.ComplianceSetting r2 = com.p683ss.android.ugc.aweme.protection.model.ComplianceSetting.copy$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
                if (r2 != 0) goto L_0x007b
            L_0x004a:
                com.ss.android.ugc.aweme.protection.model.ComplianceSetting r2 = new com.ss.android.ugc.aweme.protection.model.ComplianceSetting
                r3 = r2
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
                java.lang.String r21 = r1.getComplianceEncrypt()
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r28 = 16646143(0xfdffff, float:2.3326215E-38)
                r29 = 0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            L_0x007b:
                com.p683ss.android.ugc.aweme.protection.C40869c.m90373a(r2)
                com.ss.android.ugc.aweme.protection.b.c r1 = r0.f104031a
                r1.mo83201a()
                java.lang.String r1 = "/aweme/v1/cmpl/set/settings/"
                r2 = 0
                com.p683ss.android.ugc.aweme.compliance.C27012a.m65226a(r1, r2)
                return
            L_0x008a:
                com.ss.android.ugc.aweme.protection.b.c r1 = r0.f104031a
                r1.mo83202b()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.protection.p2099b.C40863a.C40866c.onNext(java.lang.Object):void");
        }
    }

    /* renamed from: a */
    public final void mo83199a() {
        mo83200a(null);
    }

    /* renamed from: b */
    private static int m90363b() {
        User user;
        IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
        if (baseUserService_Monster != null) {
            user = baseUserService_Monster.getCurrentUser();
        } else {
            user = null;
        }
        if (user != null) {
            return user.getUserMode();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo83200a(C40867b bVar) {
        if (!C23098h.m56662a(C23098h.f61512f, null, 1, null)) {
            this.f104027a.getComplianceSetting(TimeLockRuler.getTeenageModeStatus(), m90363b()).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C40865b<Object>(this, bVar));
        }
    }
}
