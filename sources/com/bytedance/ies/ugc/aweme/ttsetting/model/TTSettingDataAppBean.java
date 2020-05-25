package com.bytedance.ies.ugc.aweme.ttsetting.model;

import com.google.gson.p1076a.C17952c;
import java.util.ArrayList;

public final class TTSettingDataAppBean {
    @C17952c(mo34828a = "aweme_live_podcast")
    private C11045b awemeLivePodcast;
    @C17952c(mo34828a = "aweme_music_ailab")
    private C11046c awemeMusicAilab;
    @C17952c(mo34828a = "aweme_push_monitor_config")
    private C11047d awemePushMonitorConfig;
    @C17952c(mo34828a = "aweme_uniqueid_settings")
    private C11048e awemeUniqueidSettings;
    @C17952c(mo34828a = "pre_download_delay_days")
    private Integer preDownloadDelayDays;
    @C17952c(mo34828a = "pre_download_delay_second")
    private Long preDownloadDelaySecond;
    @C17952c(mo34828a = "pre_download_start_time")
    private Integer preDownloadStartTime;
    @C17952c(mo34828a = "pre_download_version")
    private Integer preDownloadVersion;
    @C17952c(mo34828a = "teens_mode_alert_count")
    private Integer teensModeAlertCount;
    @C17952c(mo34828a = "teens_mode_match_alert_switch")
    private Boolean teensModeMatchAlertSwitch;
    @C17952c(mo34828a = "update_sdk")
    private Integer updateSdk;
    @C17952c(mo34828a = "user_badge_click_settings")
    private C11044a userBadgeClickSettings;

    /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingDataAppBean$a */
    public static final class C11044a {
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingDataAppBean$b */
    public static final class C11045b {
        @C17952c(mo34828a = "can_be_obs_live_podcast")

        /* renamed from: a */
        public Boolean f29655a;
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingDataAppBean$c */
    public static final class C11046c {
        @C17952c(mo34828a = "song_url_list")

        /* renamed from: a */
        public ArrayList<String> f29656a;
        @C17952c(mo34828a = "frame_count")

        /* renamed from: b */
        public Integer f29657b;
        @C17952c(mo34828a = "song_uri")

        /* renamed from: c */
        public String f29658c;
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingDataAppBean$d */
    public static final class C11047d {
        @C17952c(mo34828a = "monitor_live_interval_second")

        /* renamed from: a */
        public Integer f29659a;
        @C17952c(mo34828a = "enable_upload_unactive_apps")

        /* renamed from: b */
        public Boolean f29660b;
        @C17952c(mo34828a = "upload_unactive_app_packages")

        /* renamed from: c */
        public ArrayList<String> f29661c;
        @C17952c(mo34828a = "default_send_data_interval")

        /* renamed from: d */
        public Integer f29662d;
        @C17952c(mo34828a = "max_send_start_info_num")

        /* renamed from: e */
        public Integer f29663e;
        @C17952c(mo34828a = "is_monitor_alive_enable")

        /* renamed from: f */
        public Integer f29664f;
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingDataAppBean$e */
    public static final class C11048e {
        @C17952c(mo34828a = "other_info_enable")

        /* renamed from: a */
        public Integer f29665a;
        @C17952c(mo34828a = "get_phone_enable")

        /* renamed from: b */
        public Integer f29666b;
        @C17952c(mo34828a = "tt_get_mobile_retry_times")

        /* renamed from: c */
        public Integer f29667c;
        @C17952c(mo34828a = "enable_al")

        /* renamed from: d */
        public Integer f29668d;
        @C17952c(mo34828a = "get_mobile_delay")

        /* renamed from: e */
        public Integer f29669e;
    }

    public final C11045b getAwemeLivePodcast() {
        return this.awemeLivePodcast;
    }

    public final C11046c getAwemeMusicAilab() {
        return this.awemeMusicAilab;
    }

    public final C11047d getAwemePushMonitorConfig() {
        return this.awemePushMonitorConfig;
    }

    public final C11048e getAwemeUniqueidSettings() {
        return this.awemeUniqueidSettings;
    }

    public final Integer getPreDownloadDelayDays() {
        return this.preDownloadDelayDays;
    }

    public final Long getPreDownloadDelaySecond() {
        return this.preDownloadDelaySecond;
    }

    public final Integer getPreDownloadStartTime() {
        return this.preDownloadStartTime;
    }

    public final Integer getPreDownloadVersion() {
        return this.preDownloadVersion;
    }

    public final Integer getTeensModeAlertCount() {
        return this.teensModeAlertCount;
    }

    public final Boolean getTeensModeMatchAlertSwitch() {
        return this.teensModeMatchAlertSwitch;
    }

    public final Integer getUpdateSdk() {
        return this.updateSdk;
    }

    public final C11044a getUserBadgeClickSettings() {
        return this.userBadgeClickSettings;
    }

    public final void setAwemeLivePodcast(C11045b bVar) {
        this.awemeLivePodcast = bVar;
    }

    public final void setAwemeMusicAilab(C11046c cVar) {
        this.awemeMusicAilab = cVar;
    }

    public final void setAwemePushMonitorConfig(C11047d dVar) {
        this.awemePushMonitorConfig = dVar;
    }

    public final void setAwemeUniqueidSettings(C11048e eVar) {
        this.awemeUniqueidSettings = eVar;
    }

    public final void setPreDownloadDelayDays(Integer num) {
        this.preDownloadDelayDays = num;
    }

    public final void setPreDownloadDelaySecond(Long l) {
        this.preDownloadDelaySecond = l;
    }

    public final void setPreDownloadStartTime(Integer num) {
        this.preDownloadStartTime = num;
    }

    public final void setPreDownloadVersion(Integer num) {
        this.preDownloadVersion = num;
    }

    public final void setTeensModeAlertCount(Integer num) {
        this.teensModeAlertCount = num;
    }

    public final void setTeensModeMatchAlertSwitch(Boolean bool) {
        this.teensModeMatchAlertSwitch = bool;
    }

    public final void setUpdateSdk(Integer num) {
        this.updateSdk = num;
    }

    public final void setUserBadgeClickSettings(C11044a aVar) {
        this.userBadgeClickSettings = aVar;
    }
}
