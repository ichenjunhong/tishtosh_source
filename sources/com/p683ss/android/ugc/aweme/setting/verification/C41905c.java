package com.p683ss.android.ugc.aweme.setting.verification;

import android.content.Context;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.MtcertSettings;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.setting.verification.VerificationApi.C41902a;
import java.util.HashMap;
import java.util.Map;
import p064c.p065a.C1674ab;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.verification.c */
public final class C41905c {

    /* renamed from: b */
    public static final C41906a f106057b = new C41906a(null);

    /* renamed from: a */
    public final C1689b f106058a = new C1689b();

    /* renamed from: com.ss.android.ugc.aweme.setting.verification.c$a */
    public static final class C41906a {
        private C41906a() {
        }

        /* renamed from: d */
        public final boolean mo85821d() {
            if (m91853e() || m91854f()) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public static boolean m91851b() {
            Boolean bool;
            try {
                IESSettingsProxy b = C32816h.m75716b();
                C52711k.m112236a((Object) b, "SettingsReader.get()");
                MtcertSettings mtcertSettings = b.getMtcertSettings();
                C52711k.m112236a((Object) mtcertSettings, "SettingsReader.get().mtcertSettings");
                bool = mtcertSettings.getEnablePrivateAccountNotice();
                C52711k.m112236a((Object) bool, "SettingsReader.get().mtc…nablePrivateAccountNotice");
            } catch (C10174a unused) {
                bool = Boolean.valueOf(false);
            }
            return bool.booleanValue();
        }

        /* renamed from: c */
        public static boolean m91852c() {
            Boolean bool;
            try {
                IESSettingsProxy b = C32816h.m75716b();
                C52711k.m112236a((Object) b, "SettingsReader.get()");
                MtcertSettings mtcertSettings = b.getMtcertSettings();
                C52711k.m112236a((Object) mtcertSettings, "SettingsReader.get().mtcertSettings");
                bool = mtcertSettings.getEnableChangeMobileNotice();
                C52711k.m112236a((Object) bool, "SettingsReader.get().mtc….enableChangeMobileNotice");
            } catch (C10174a unused) {
                bool = Boolean.valueOf(false);
            }
            return bool.booleanValue();
        }

        /* renamed from: e */
        public static boolean m91853e() {
            Boolean bool;
            try {
                IESSettingsProxy b = C32816h.m75716b();
                C52711k.m112236a((Object) b, "SettingsReader.get()");
                MtcertSettings mtcertSettings = b.getMtcertSettings();
                C52711k.m112236a((Object) mtcertSettings, "SettingsReader.get().mtcertSettings");
                bool = mtcertSettings.getEnableChangeHandleNotice();
                C52711k.m112236a((Object) bool, "SettingsReader.get().mtc….enableChangeHandleNotice");
            } catch (C10174a unused) {
                bool = Boolean.valueOf(false);
            }
            return bool.booleanValue();
        }

        /* renamed from: f */
        public static boolean m91854f() {
            Boolean bool;
            try {
                IESSettingsProxy b = C32816h.m75716b();
                C52711k.m112236a((Object) b, "SettingsReader.get()");
                MtcertSettings mtcertSettings = b.getMtcertSettings();
                C52711k.m112236a((Object) mtcertSettings, "SettingsReader.get().mtcertSettings");
                bool = mtcertSettings.getEnableChangeNicknameNotice();
                C52711k.m112236a((Object) bool, "SettingsReader.get().mtc…nableChangeNicknameNotice");
            } catch (C10174a unused) {
                bool = Boolean.valueOf(false);
            }
            return bool.booleanValue();
        }

        /* renamed from: a */
        public static boolean m91850a() {
            Boolean bool;
            try {
                IESSettingsProxy b = C32816h.m75716b();
                C52711k.m112236a((Object) b, "SettingsReader.get()");
                MtcertSettings mtcertSettings = b.getMtcertSettings();
                C52711k.m112236a((Object) mtcertSettings, "SettingsReader.get().mtcertSettings");
                bool = mtcertSettings.getShowCertEntry();
                C52711k.m112236a((Object) bool, "SettingsReader.get().mtcertSettings.showCertEntry");
            } catch (C10174a unused) {
                bool = Boolean.valueOf(false);
            }
            return bool.booleanValue();
        }

        public /* synthetic */ C41906a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m91849a(Context context) {
            C52711k.m112240b(context, "context");
            C26890h.m65011a("enter_request_verification", (Map<String, String>) new HashMap<String,String>());
            try {
                C41302w a = C41302w.m91042a();
                IESSettingsProxy b = C32816h.m75716b();
                C52711k.m112236a((Object) b, "SettingsReader.get()");
                MtcertSettings mtcertSettings = b.getMtcertSettings();
                C52711k.m112236a((Object) mtcertSettings, "SettingsReader.get().mtcertSettings");
                a.mo83861a(mtcertSettings.getCertUrlSchema());
            } catch (C10174a unused) {
                SmartRouter.buildRoute(C11010c.m22280a(), "aweme://webview/?url=https%3a%2f%2fwww.tiktok.com%2ffalcon%2fmain%2fverification%2f%3fhide_nav_bar%3d1&hide_nav_bar=1").open();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.verification.c$b */
    public static final class C41907b implements C1674ab<VerificationResponse> {

        /* renamed from: a */
        final /* synthetic */ C41905c f106059a;

        /* renamed from: b */
        final /* synthetic */ C41904b f106060b;

        public final void onComplete() {
            this.f106060b.mo85279a();
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
            this.f106060b.mo85279a();
        }

        public final /* synthetic */ void onNext(Object obj) {
            VerificationResponse verificationResponse = (VerificationResponse) obj;
            C52711k.m112240b(verificationResponse, "t");
            this.f106060b.mo82330a(verificationResponse);
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
            this.f106059a.f106058a.mo6181a(cVar);
        }

        C41907b(C41905c cVar, C41904b bVar) {
            this.f106059a = cVar;
            this.f106060b = bVar;
        }
    }

    /* renamed from: a */
    public final void mo85818a() {
        this.f106058a.mo6180a();
    }

    /* renamed from: a */
    public final void mo85819a(User user, C41904b bVar) {
        C52711k.m112240b(user, "user");
        C52711k.m112240b(bVar, "callback");
        mo85820a(f106057b.mo85821d(), user, bVar);
    }

    /* renamed from: a */
    public final void mo85820a(boolean z, User user, C41904b bVar) {
        C52711k.m112240b(user, "user");
        C52711k.m112240b(bVar, "callback");
        if (z) {
            C41902a.m91843a().requestVerification(user.getSecUid()).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C41907b<Object>(this, bVar));
            return;
        }
        VerificationResponse verificationResponse = new VerificationResponse();
        verificationResponse.setMtCertStatusEnum(MtCertStatusEnum.CS_EMPTY);
        verificationResponse.setMtCertingActionEnum(MtCertingActionEnum.CA_EMPTY);
        bVar.mo82330a(verificationResponse);
        bVar.mo85279a();
    }
}
