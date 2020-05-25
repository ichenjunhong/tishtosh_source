package com.bytedance.android.live.core.setting;

import com.bytedance.android.live.base.model.LoginGuideConfig;
import com.bytedance.android.live.base.model.feed.C2976b;
import com.bytedance.android.live.base.model.p187a.C2962a;

public interface CoreSettingKeys {
    public static final C4097p<Boolean> APPLOG_CORE_V3_ONLY = new C4097p<>("applog_core_v3_only", Boolean.valueOf(false), "推荐用核心埋点只发V3", "false:双发", "true:只发V3");
    public static final C4097p<C2962a[]> COUNTRY_CODE_LIST = new C4097p<>("country_code_maps", C2962a[].class, "国家码下发");
    public static final C4097p<Integer> ENABLE_ALOG = new C4097p<>("enable_alog", Integer.valueOf(0), "是否开启ALOG回捞", "0:不开启", "1:开启");
    public static final C4097p<Integer> ENABLE_CUSTOM_TTPLAYER = new C4097p<>("enable_custom_ttplayer", Integer.valueOf(1), "选择礼物播放器的实现方式", "0:使用TTVideoEngine", "1:使用自定义的TTMediaPlayer");
    public static final C4097p<Boolean> ENABLE_IMAGE_DEFAULT_565 = new C4097p<>("enable_image_default_565", Boolean.valueOf(true), "是否默认开启565");
    public static final C4097p<Integer> ENABLE_MONITOR_TO_ALOG = new C4097p<>("enable_monitor_to_alog", Integer.valueOf(0), "是否开启monitor日志输出到ALog", "0:默认开启", "1:不开启");
    public static final C4097p<Integer> ENABLE_NEW_CHAT_NAME = new C4097p<>("enable_im_new_name", Integer.valueOf(0), "私信改名为聊天", "0:私信", "1:聊天");
    public static final C4097p<Integer> IMAGE_DOWNLOAD_THREAD_SIZE = new C4097p<>("image_download_thread_size", Integer.valueOf(8));
    public static final C4097p<Boolean> LIFT_CHAT_RESTRICTION = new C4097p<>("ichat_restrict_range", Boolean.valueOf(false), "是否放开私信开关", "true:表示放开限制，关注就能发私信", "false:表示互关才能发私信");
    public static final C4097p<C2976b> LIVE_FEED_PRELOAD = new C4097p<>("live_feed_preload", "feed load more配置", new C2976b(), new C2976b());
    public static final C4097p<LoginGuideConfig> LOGIN_GUIDE = new C4097p<>("login_guide_config", LoginGuideConfig.class);
    public static final C4097p<Integer> MAX_CACHE_ASHM_ENTRIES = new C4097p<>("MAX_CACHE_ASHM_ENTRIES", Integer.valueOf(128));
    public static final C4097p<Integer> MAX_CACHE_ENTRIES = new C4097p<>("MAX_CACHE_ENTRIES", Integer.valueOf(2000));
    public static final C4097p<Integer> MAX_CACHE_EVICTION_ENTRIES = new C4097p<>("fresco_mem", Integer.valueOf(100));
    public static final C4097p<Integer> PROFILE_DOWNLOAD_STYLE = new C4097p<>("profile_download_style", Integer.valueOf(0), "我的 tab 是否显示下载任务", "0: 不显示", "1: 显示");
    public static final C4097p<String> REGION = new C4097p<>("region", "");
    public static final C4097p<String> SHARE_DESC_SUFFIX = new C4097p<>("share_desc_suffix", "");
    public static final C4097p<String> SHARE_DESC_SUFFIX_URL = new C4097p<>("share_desc_suffix_url", "");
    public static final C4097p<Integer> TEST_FAKE_REGION = new C4097p<>("fake_regions", Integer.valueOf(0), "local_test fake国家", "0:中国", "1:摩洛哥", "2:沙特阿拉伯", "3:法国", "4:阿联酋");
    public static final C4097p<String> TRACKING_CUSTOM_UA = new C4097p<>("tracking_custom_ua_format", "", "自定义 UA");
}
