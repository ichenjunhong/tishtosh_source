package com.p683ss.android.ugc.aweme.setting.model;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.MtcertSettings;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.VerificationBadgeType;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.setting.verification.C41905c;
import com.p683ss.android.ugc.aweme.setting.verification.C41905c.C41906a;
import com.ss.android.ugc.trill.R;
import java.util.Map;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.setting.model.VerifyActionManager */
public final class VerifyActionManager {
    static final /* synthetic */ C52767h[] $$delegatedProperties = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(VerifyActionManager.class), "CACHE", "getCACHE()Lcom/ss/android/ugc/aweme/setting/model/IVerifyActionCache;"))};
    private static final C52668f CACHE$delegate = C52732g.m112285a(VerifyActionManager$CACHE$2.INSTANCE);

    /* renamed from: G */
    private static final C17971f f105371G = new C17971f();
    public static final VerifyActionManager INSTANCE = new VerifyActionManager();

    private VerifyActionManager() {
    }

    private final IVerifyActionCache getCACHE() {
        return (IVerifyActionCache) CACHE$delegate.getValue();
    }

    private final Map<String, VerifyTypeAction> getVerifyAction() {
        String str;
        VerifyTypeSetting verifyTypeSetting;
        IVerifyActionCache cache = getCACHE();
        if (cache != null) {
            str = cache.getVerifyAction();
        } else {
            str = null;
        }
        try {
            verifyTypeSetting = (VerifyTypeSetting) f105371G.mo34884a(str, VerifyTypeSetting.class);
        } catch (Exception unused) {
            verifyTypeSetting = null;
        }
        if (verifyTypeSetting != null) {
            return verifyTypeSetting.action;
        }
        return null;
    }

    public final VerifyTypeAction getVerifyActionByType(String str) {
        C52711k.m112240b(str, "type");
        Map verifyAction = getVerifyAction();
        if (verifyAction != null) {
            return (VerifyTypeAction) verifyAction.get(str);
        }
        return null;
    }

    public final void saveVerifyAction(JSONObject jSONObject) {
        if (jSONObject != null && !TextUtils.isEmpty(jSONObject.toString())) {
            IVerifyActionCache cache = getCACHE();
            if (cache != null) {
                cache.setVerifyAction(jSONObject.toString());
            }
        }
    }

    private final VerificationBadgeType tryGetNewVerificationAction(String str) {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            MtcertSettings mtcertSettings = b.getMtcertSettings();
            C52711k.m112236a((Object) mtcertSettings, "SettingsReader.get().mtcertSettings");
            for (VerificationBadgeType verificationBadgeType : mtcertSettings.getVerificationBadgeType()) {
                C52711k.m112236a((Object) verificationBadgeType, "typeAction");
                if (C52711k.m112239a((Object) str, (Object) String.valueOf(verificationBadgeType.getBadgeType().intValue()))) {
                    return verificationBadgeType;
                }
            }
        } catch (C10174a unused) {
        }
        return null;
    }

    public final VerifyTypeAction getNewVerificationAction(User user) {
        if (user != null) {
            VerificationBadgeType tryGetNewVerificationAction = INSTANCE.tryGetNewVerificationAction(String.valueOf(user.getVerificationBadgeType()));
            if (tryGetNewVerificationAction != null) {
                Integer actionType = tryGetNewVerificationAction.getActionType();
                C52711k.m112236a((Object) actionType, "newType.actionType");
                return new VerifyTypeAction(actionType.intValue(), "", tryGetNewVerificationAction.getLink());
            }
        }
        return null;
    }

    private final boolean handleLink(VerifyTypeAction verifyTypeAction, boolean z) {
        C41302w a = C41302w.m91042a();
        String str = verifyTypeAction.link;
        if (str == null) {
            C52711k.m112234a();
        }
        if (z && C52830p.m112411b(str, WebKitApi.SCHEME_HTTP, false, 2, null)) {
            StringBuilder sb = new StringBuilder("aweme://webview/?url=");
            sb.append(str);
            str = sb.toString();
        }
        return a.mo83861a(str);
    }

    private final void handleToast(boolean z, Context context) {
        if (z) {
            C10691a.m21551c(context, context.getString(R.string.e0k)).mo19066a();
            return;
        }
        C41906a aVar = C41905c.f106057b;
        C52711k.m112240b(context, "context");
        if (C41906a.m91850a()) {
            C41906a.m91849a(context);
        } else {
            C10691a.m21551c(context, context.getString(R.string.e0k)).mo19066a();
        }
    }

    public final void onI18nVerificationViewClick(Context context, User user, String str, String str2) {
        VerifyTypeAction verifyTypeAction;
        String str3;
        String str4;
        C52711k.m112240b(user, "user");
        C52711k.m112240b(str, "type");
        if (context != null) {
            boolean z = true;
            VerifyTypeAction newVerificationAction = getNewVerificationAction(user);
            if (newVerificationAction == null) {
                verifyTypeAction = getVerifyActionByType(str);
                z = false;
            } else {
                verifyTypeAction = newVerificationAction;
            }
            if (verifyTypeAction != null) {
                switch (user.getVerificationType()) {
                    case 1:
                        str3 = "认证号";
                        break;
                    case 2:
                        str3 = "音乐人";
                        break;
                    case 3:
                        str3 = "特效师";
                        break;
                    default:
                        str3 = "";
                        break;
                }
                switch (verifyTypeAction.actionType) {
                    case 1:
                        str4 = "toast";
                        handleToast(z, context);
                        break;
                    case 2:
                        String str5 = "link";
                        if (!TextUtils.isEmpty(verifyTypeAction.link)) {
                            handleLink(verifyTypeAction, z);
                        }
                        str4 = str5;
                        break;
                    default:
                        str4 = "toast";
                        handleToast(z, context);
                        break;
                }
                C26890h.m65011a("click_varified_badge", C23089d.m56640a().mo47829a("enter_from", str2).mo47829a("landing_page", str4).mo47829a("user_type", str3).f61491a);
            }
        }
    }
}
