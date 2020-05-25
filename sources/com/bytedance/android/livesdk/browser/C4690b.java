package com.bytedance.android.livesdk.browser;

import com.bytedance.android.live.core.setting.C4097p;
import com.bytedance.android.live.core.setting.C4103s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.browser.b */
public interface C4690b {

    /* renamed from: a */
    public static final C4097p<List<String>> f12768a = new C4103s("live_safe_domain_list", new ArrayList());

    /* renamed from: b */
    public static final C4097p<List<String>> f12769b = new C4097p<>("hotsoon_safe_host_list", new ArrayList());

    /* renamed from: c */
    public static final C4097p<Integer> f12770c = new C4097p<>("force_js_permission", Integer.valueOf(-1));

    /* renamed from: d */
    public static final C4097p<Boolean> f12771d = new C4097p<>("allow_html_video", Boolean.valueOf(true));

    /* renamed from: e */
    public static final C4097p<Long> f12772e = new C4097p<>("wap_load_time_limit_wifi", Long.valueOf(-1));

    /* renamed from: f */
    public static final C4097p<Long> f12773f = new C4097p<>("wap_load_time_limit_mobile", Long.valueOf(-1));

    /* renamed from: g */
    public static final C4097p<Integer> f12774g = new C4097p<>("webview_destroy_mode", Integer.valueOf(-1));

    /* renamed from: h */
    public static final C4097p<String> f12775h = new C4103s("js_actlog_url", "");

    /* renamed from: i */
    public static final C4097p<Boolean> f12776i = new C4097p<>("enable_webview_debugging", Boolean.valueOf(false), "webview debug");

    /* renamed from: j */
    public static final C4097p<String> f12777j = new C4097p<>("advert_cooperation_url", "https://www.chengzijianzhan.com/tetris/page/1614465171474436/");
}
