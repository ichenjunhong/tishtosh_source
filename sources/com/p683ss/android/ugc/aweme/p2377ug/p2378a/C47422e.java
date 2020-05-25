package com.p683ss.android.ugc.aweme.p2377ug.p2378a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.experiment.FeedbackHostExperiment;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.FeedbackConf;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.i18n.language.p1805a.C33102c;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.Locale;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ug.a.e */
public final class C47422e extends C47409a {

    /* renamed from: c */
    public final Context f119643c;

    /* renamed from: c */
    public final String mo94698c() {
        String string = this.f119643c.getString(R.string.cc4);
        C52711k.m112236a((Object) string, "context.getString(R.string.mus_report_problem)");
        return string;
    }

    /* renamed from: a */
    public final void mo94688a() {
        C18922i iVar;
        String str;
        Map<String, String> map = new C23089d().mo47829a("enter_from", "praise_dialog").f61491a;
        C26890h.m65011a("FAQ", map);
        C26890h.m65011a("click_feedback_entrance", map);
        Intent intent = new Intent(this.f119643c, CrossPlatformActivity.class);
        if (C35837h.m80977b() || !C47915gg.m103651b()) {
            try {
                IAccountUserService g = C20854a.m53167g();
                C52711k.m112236a((Object) g, "AccountProxyService.userService()");
                if (g.isLogin()) {
                    C41302w a = C41302w.m91042a();
                    IESSettingsProxy b = C32816h.m75716b();
                    C52711k.m112236a((Object) b, "SettingsReader.get()");
                    FeedbackConf feedbackConf = b.getFeedbackConf();
                    C52711k.m112236a((Object) feedbackConf, "SettingsReader.get().feedbackConf");
                    a.mo83861a(feedbackConf.getNormalEntry());
                    return;
                }
                C41302w a2 = C41302w.m91042a();
                IESSettingsProxy b2 = C32816h.m75716b();
                C52711k.m112236a((Object) b2, "SettingsReader.get()");
                FeedbackConf feedbackConf2 = b2.getFeedbackConf();
                C52711k.m112236a((Object) feedbackConf2, "SettingsReader.get().feedbackConf");
                a2.mo83861a(feedbackConf2.getNotLoggedIn());
            } catch (Exception unused) {
                if (!C35837h.m80977b()) {
                    String a3 = C10181b.m20511a().mo18171a(FeedbackHostExperiment.class, true, "feedback_host", 31744, "");
                    if (TextUtils.isEmpty(a3)) {
                        a3 = "www.tiktok.com";
                    }
                    StringBuilder sb = new StringBuilder("https://");
                    sb.append(a3);
                    sb.append("/falcon/tiktok_rn_web/feedback/");
                    str = sb.toString();
                } else {
                    str = "https://www.tiktok.com/falcon/tiktok_rn_web/feedback/";
                }
                iVar = new C18922i(str);
                Locale a4 = C33102c.m76088a(this.f119643c);
                C52711k.m112236a((Object) a4, "Locales.getFrom(context)");
                iVar.mo38778a("locale", a4.getLanguage());
            }
        } else {
            iVar = new C18922i("https://www.tiktok.com/aweme/inapp/v2/c_feedback");
            iVar.mo38778a("enter_from", "praise_dialog");
            intent.setData(Uri.parse(iVar.toString()));
            intent.putExtra("hide_nav_bar", true);
            this.f119643c.startActivity(intent);
        }
    }

    /* renamed from: b */
    public final void mo94689b() {
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            StringBuilder sb = new StringBuilder("market://details?id=");
            sb.append(this.f119643c.getPackageName());
            intent.setData(Uri.parse(sb.toString()));
            if (intent.resolveActivity(this.f119643c.getPackageManager()) != null) {
                this.f119643c.startActivity(intent);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://play.google.com/store/apps/details?id=");
            sb2.append(this.f119643c.getPackageName());
            intent.setData(Uri.parse(sb2.toString()));
            if (intent.resolveActivity(this.f119643c.getPackageManager()) != null) {
                this.f119643c.startActivity(intent);
            }
        } catch (Exception unused) {
            StringBuilder sb3 = new StringBuilder("https://play.google.com/store/apps/details?id=");
            sb3.append(this.f119643c.getPackageName());
            intent.setData(Uri.parse(sb3.toString()));
            if (intent.resolveActivity(this.f119643c.getPackageManager()) != null) {
                this.f119643c.startActivity(intent);
            }
        }
    }

    public C47422e(Context context) {
        C52711k.m112240b(context, "context");
        this.f119643c = context;
    }
}
