package com.bytedance.android.livesdk.feed.setting;

import com.bytedance.android.live.core.setting.C4097p;
import com.bytedance.android.livesdk.feed.feed.C6943d;

public interface LiveFeedSettings {
    public static final C4097p<Integer> AUDIENCE_PING_INTERVAL = new C4097p<>("audience_ping_interval", Integer.valueOf(600), "观众ping间隔");
    public static final C4097p<Float> DEFAULT_DURATION_SHOW_PREVIEW_TIP = new C4097p<>("default_duration_show_preview_tip", Float.valueOf(7.0f), "移动网络播流提示间隔时长(单位：天)");
    public static final C4097p<Integer> DOUYIN_LIVE_FEED_TOP_HINT = new C4097p<>("live_squre_sky_window_info", Integer.valueOf(0), "抖音直播广场天窗关注文案AB");
    public static final C4097p<Boolean> ENABLE_LIVE_FEED_DEBUG_MENU;
    public static final C4097p<Integer> FEED_LIVE_BANNER_POSITION = new C4097p<>("feed_live_banner_position", Integer.valueOf(0), "直播 Feed Banner 的位置", "0:顶部", "1:中间");
    public static final C4097p<Integer> FEED_PRELOAD = new C4097p<>("feed_preload", Integer.valueOf(4));
    public static final C4097p<C6943d> FREE_FLOW = new C4097p<>("free_flow", C6943d.class);
    public static final C4097p<Boolean> I18N_ZHIBOZHONG_ANIMATION_TAG = new C4097p<>("i18n_zhibozhong_animation_tag", Boolean.valueOf(true), "I18N 是否在feed页面显示直播中动画", "true:显示", "false:不显示");
    public static final C4097p<Boolean> LIVE_FEED_ENABLE_PREVIEW = new C4097p<>("live_feed_enable_preview", Boolean.valueOf(false), "直播是否显示预览小窗,目前只对小图生效", "true:显示", "false:不显示");
    public static final C4097p<Integer> LIVE_FEED_SHOW_NEARBY_GSP_DIALOG = new C4097p<>("live_show_gps_guide_for_feed_nearby", Integer.valueOf(1), "是否在进入直播附近tab的时候弹请求权限的弹窗", "0:不展示", "1:展示");
    public static final C4097p<Integer> MAIN_REFRESH_TIME_OUT = new C4097p<>("back_refresh_timeout", Integer.valueOf(1800000));
    public static final C4097p<Boolean> REFRESH_SHOW_SANDBOX_ROOM = new C4097p<>("refresh_show_sand_box_room", Boolean.valueOf(false), "下拉刷新展示测试房间");
    public static final C4097p<Integer> START_LIVE_ICON_POSITION = new C4097p<>("live_feed_tab_entrance_enabled", Integer.valueOf(0), "直播开播按钮展示位置", "0:不展示", "1:展示在左下角", "2:展示在中间下方", "3:展示在右下角");
    public static final int SWIPE_ROOM_DISABLE_FOLLOW_MASK = 2;
    public static final int SWIPE_ROOM_DISABLE_LIVE_MASK = 1;
    public static final C4097p<Boolean> VIDEO_PRELOAD_AFTER_COVER = new C4097p<>("video_preload_after_cover", Boolean.valueOf(false), "封面显示后再预加载视频");

    static {
        C4097p pVar = new C4097p("enable_live_feed_debug_menu", "启用直播Feed调试菜单", Boolean.valueOf(false), Boolean.valueOf(false), "true:双指点击打开", "false:禁用");
        ENABLE_LIVE_FEED_DEBUG_MENU = pVar;
    }
}
