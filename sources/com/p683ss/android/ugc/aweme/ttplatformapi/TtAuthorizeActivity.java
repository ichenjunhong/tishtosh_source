package com.p683ss.android.ugc.aweme.ttplatformapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ttplatformsdk.p1223b.C20057a;
import com.p683ss.android.ttplatformsdk.p1223b.C20057a.C20059a;
import com.p683ss.android.ttplatformsdk.view.TtBaseAuthorizeActivity;
import com.p683ss.android.ugc.aweme.IAccountService.C20837d;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1411c.C23484c;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.AwemeSSOPlatformUtils;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.ttplatformapi.TtAuthorizeActivity */
public class TtAuthorizeActivity extends TtBaseAuthorizeActivity {

    /* renamed from: e */
    private static final String f119533e = "TtAuthorizeActivity";

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.ttplatformapi.TtAuthorizeActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.ttplatformapi.TtAuthorizeActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.ttplatformapi.TtAuthorizeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: c */
    public final boolean mo42124c() {
        return C47365a.m102733a(this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C47718bf.m103291d(this);
    }

    /* renamed from: b */
    public final boolean mo42121b() {
        try {
            return C20902b.m53242a().isLogin();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    public final void mo42125d() {
        C20854a.m53162b().showLoginAndRegisterView(new C20837d().mo44381a((Activity) this).mo44385a("toutiao").mo44380a());
    }

    /* renamed from: a */
    public final C20057a mo42118a() {
        String str;
        String str2;
        String str3 = "";
        CookieManager instance = CookieManager.getInstance();
        if (instance == null) {
            str = "";
        } else {
            str = instance.getCookie(C18845b.f52036a);
        }
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(";");
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String[] split2 = split[i].split("=");
                if (split2.length >= 2 && split2[0].trim().equals("sessionid")) {
                    str3 = split2[1];
                    break;
                }
                i++;
            }
        }
        String str4 = "";
        String str5 = "";
        String str6 = "";
        User curUser = C20902b.m53242a().getCurUser();
        if (curUser != null) {
            str4 = String.valueOf(curUser.getUid());
            str5 = curUser.getNickname();
            UrlModel avatarMedium = curUser.getAvatarMedium();
            if (avatarMedium == null || avatarMedium.getUrlList() == null || avatarMedium.getUrlList().size() <= 0) {
                str2 = "";
            } else {
                str2 = (String) avatarMedium.getUrlList().get(0);
            }
            str6 = str2;
        }
        C20059a aVar = new C20059a();
        aVar.f55134a.f55128f = Uri.encode(str3);
        aVar.f55134a.f55129g = Uri.encode(str4);
        aVar.f55134a.f55130h = Uri.encode(str5);
        aVar.f55134a.f55131i = Uri.encode(str6);
        String string = getString(R.string.dpo);
        if (!TextUtils.isEmpty(string)) {
            aVar.f55134a.f55124b = string;
            return aVar.f55134a;
        }
        throw new IllegalArgumentException("titleBarTitleText is empty");
    }

    @C53771m
    public void onUpdateUserEvent(C23484c cVar) {
        AwemeSSOPlatformUtils.m103144a();
    }

    /* renamed from: c */
    public final void mo42123c(String str) {
        C10691a.m21542b((Context) this, (int) R.string.md).mo19066a();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.ttplatformapi.TtAuthorizeActivity", "onCreate", true);
        C47718bf.m103290c(this);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.ttplatformapi.TtAuthorizeActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo42119a(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            C10691a.m21545b((Context) this, str).mo19066a();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }
}
