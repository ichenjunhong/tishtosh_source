package com.bytedance.android.livesdkapi.host.p454xt;

import android.app.Activity;
import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.livesdkapi.depend.p439g.C8632a;
import com.bytedance.android.livesdkapi.depend.p439g.C8633b;
import com.bytedance.android.livesdkapi.host.p451a.C8786i;

/* renamed from: com.bytedance.android.livesdkapi.host.xt.IHostShareForXT */
public interface IHostShareForXT extends C2952b, C8786i {
    public static final String FACEBOOK = "facebook";
    public static final String FB_LITE = "facebook_lite";
    public static final String INSTAGRAM = "instagram";
    public static final String KAKAO_TALK = "kakao_talk";
    public static final String LINE = "line";
    public static final String MESSENGER = "messenger";

    /* renamed from: QQ */
    public static final String f24041QQ = "qq";
    public static final String QZONE = "qzone";
    public static final String ROCKET = "rocket";
    public static final String ROCKET_TIMELINE = "rocket_timeline";
    public static final String TWITTER = "twitter";

    /* renamed from: VK */
    public static final String f24042VK = "vk";
    public static final String WEIBO = "weibo";
    public static final String WEIXIN = "weixin";
    public static final String WEIXIN_MOMENT = "weixin_moment";
    public static final String WHATS_APP = "whatsapp";

    boolean isShareAvailable(String str, Activity activity);

    void share(Activity activity, C8633b bVar, C8632a aVar);

    void showShareDialog(Activity activity, C8633b bVar, C8632a aVar);
}
