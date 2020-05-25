package com.p683ss.android.ugc.aweme.utils;

import android.content.Context;
import com.p683ss.android.ttplatformsdk.p1224c.C20061b;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.utils.AwemeSSOPlatformUtils */
public class AwemeSSOPlatformUtils {

    /* renamed from: a */
    public static final Map<String, String> f120116a;

    /* renamed from: b */
    private static final String f120117b = "AwemeSSOPlatformUtils";

    /* renamed from: com.ss.android.ugc.aweme.utils.AwemeSSOPlatformUtils$AccountStatusChangedTask */
    static class AccountStatusChangedTask implements LegoTask {
        private AccountStatusChangedTask() {
        }

        public C35896f process() {
            return C35894d.m81063a(this);
        }

        public C35898h type() {
            return C35898h.BACKGROUND;
        }

        public void run(Context context) {
            String str;
            C32458a.m75144a("AccountStatusChangedTask");
            User curUser = C20902b.m53242a().getCurUser();
            UrlModel avatarThumb = curUser.getAvatarThumb();
            if (avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() <= 0) {
                str = "";
            } else {
                str = (String) avatarThumb.getUrlList().get(0);
            }
            C20061b.m49546a(context).mo42111a(curUser.getNickname(), str, C20902b.m53242a().isLogin());
        }
    }

    /* renamed from: a */
    public static void m103144a() {
        C35857a.m81001b().mo74526a(new AccountStatusChangedTask()).mo74527a();
    }

    static {
        HashMap hashMap = new HashMap();
        f120116a = hashMap;
        hashMap.put("qzone_sns", "qq");
        f120116a.put("weixin", "weixin");
        f120116a.put("sina_weibo", "weibo");
        f120116a.put("mobile", "phone");
        f120116a.put("toutiao", "toutiao");
    }
}
