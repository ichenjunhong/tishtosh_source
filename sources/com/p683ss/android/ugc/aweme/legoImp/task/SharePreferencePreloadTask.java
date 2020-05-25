package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.preference.PreferenceManager;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.feed.C30578o;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.SharePreferencePreloadTask */
public class SharePreferencePreloadTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    private void preloadKeva(Context context) {
        preloadKeva(context, "money_growth", 0);
        preloadKeva(context, "money_growth_read_task", 0);
        preloadKeva(context, "SelectOldCities", 0);
        preloadKeva(context, "ug_coupon_repo", 0);
        preloadKeva(context, "TTSettingData", 0);
        preloadKeva(context, "USER_RETAIN", 0);
        preloadKeva(context, "first_install_version", 0);
        preloadKeva(context, "repo_mapping_url", 0);
        preloadKevaFromSp(context, "music_sp", 0);
        preloadKevaFromSp(context, "test_sp", 0);
        preloadKevaFromSp(context, "HateFulPreferences", 0);
        preloadKevaFromSp(context, "setting_repo_sp", 0);
        if (C30578o.m71565a().booleanValue()) {
            preloadKeva(context, "new_user_journey", 0);
        }
    }

    public void run(Context context) {
        preloadSharedPreferences(context, "sp_symphony", 0);
        preloadSharedPreferences(context, "key_language_sp_key", 0);
        preloadSharedPreferences(context, "KEY_NEED_UPLOAD_LAUNCHLOG", 0);
        preloadSharedPreferences(context, "pref_language_key", 0);
        preloadSharedPreferences(context, "preinsatll_appflyer", 0);
        preloadSharedPreferences(context, "appsflyer-data", 0);
        preloadSharedPreferences(context, "ab_test_model", 0);
        preloadSharedPreferences(context, "push_setting", 0);
        preloadSharedPreferences(context, "app_setting", 0);
        preloadSharedPreferences(context, "default_config", 0);
        preloadSharedPreferences(context, "applog_stats", 0);
        preloadSharedPreferences(context, "custom_channels", 0);
        preloadSharedPreferences(context, "aweme-app", 0);
        preloadSharedPreferences(context, "aweme_user", 0);
        preloadSharedPreferences(context, "av_ab.xml", 0);
        preloadSharedPreferences(context, "av_settings.xml", 0);
        preloadSharedPreferences(context, "x2c_error", 0);
        preloadSharedPreferences(context, "current_foreground_uid", 0);
        preloadSharedPreferences(context, "USER_PROFILE", 0);
        preloadSharedPreferences(context, "MainTabPreferences", 0);
        preloadSharedPreferences(context, "share_theme_data", 0);
        preloadSharedPreferences(context, "prefs_feed_check", 0);
        PreferenceManager.getDefaultSharedPreferences(context).getAll();
        preloadSharedPreferences(context, "guide", 0);
        preloadSharedPreferences(context, "main_swipere_fresh", 0);
        preloadSharedPreferences(context, "VideoRecord", 0);
        preloadSharedPreferences(context, "long_video_mock", 0);
        preloadSharedPreferences(context, "last_version_code", 0);
        preloadSharedPreferences(context, "appsflyer-data", 0);
        preloadSharedPreferences(context, "app_bundle_session_ids", 0);
        preloadSharedPreferences(context, "sp_show_share_guide_cache", 0);
        preloadSharedPreferences(context, "umeng_general_config", 0);
        preloadSharedPreferences(context, "apps_flyer_cache", 0);
        preloadSharedPreferences(context, "com.google.android.gms.measurement.prefs", 0);
        preloadSharedPreferences(context, "com.google.firebase.common.prefs", 0);
        preloadSharedPreferences(context, "google_ads_flags", 0);
        preloadSharedPreferences(context, "InitialChooseLanguagePreferences", 0);
        preloadSharedPreferences(context, "share_setting_preference", 0);
        preloadSharedPreferences(context, "TabStatus", 0);
        preloadSharedPreferences(context, "ttnet_tnc_config", 0);
        preloadSharedPreferences(context, "ai_music", 0);
        preloadSharedPreferences(context, "com.zhiliaoapp.musically", 0);
        preloadSharedPreferences(context, "DeviceSettingSp", 0);
        preloadSharedPreferences(context, "settings", 0);
        preloadSharedPreferences(context, "new_sp_ad_config", 0);
        preloadSharedPreferences(context, "imbase_0", 0);
        preloadKeva(context);
    }

    private void preloadKeva(Context context, String str, int i) {
        Keva.getRepoSync(str, i);
    }

    private void preloadKevaFromSp(Context context, String str, int i) {
        Keva.getRepoFromSpSync(context, str, i);
    }

    private void preloadSharedPreferences(Context context, String str, int i) {
        C35807d.m80935a(context, str, i).getInt("tiktok", 0);
    }
}
