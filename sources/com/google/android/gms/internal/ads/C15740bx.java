package com.google.android.gms.internal.ads;

import android.content.Context;
import com.p683ss.android.ugc.aweme.commercialize.abtest.NormalSplashDelayExperiment;
import java.util.List;
import java.util.concurrent.TimeUnit;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.bx */
public final class C15740bx {

    /* renamed from: A */
    public static final C15726bl<Long> f44187A = C15726bl.m35986a(1, "gads:video:surface_update_min_spacing_ms", 1000);

    /* renamed from: B */
    public static final C15726bl<Boolean> f44188B = C15726bl.m35987a(1, "gads:video:spinner:enabled", Boolean.valueOf(false));

    /* renamed from: C */
    public static final C15726bl<Integer> f44189C = C15726bl.m35985a(1, "gads:video:spinner:scale", 4);

    /* renamed from: D */
    public static final C15726bl<Long> f44190D = C15726bl.m35986a(1, "gads:video:spinner:jank_threshold_ms", 50);

    /* renamed from: E */
    public static final C15726bl<Boolean> f44191E = C15726bl.m35987a(1, "gads:video:aggressive_media_codec_release", Boolean.valueOf(false));

    /* renamed from: F */
    public static final C15726bl<Boolean> f44192F = C15726bl.m35987a(1, "gads:memory_bundle:debug_info", Boolean.valueOf(false));

    /* renamed from: G */
    public static final C15726bl<String> f44193G = C15726bl.m35988a(1, "gads:video:codec_query_mime_types", "");

    /* renamed from: H */
    public static final C15726bl<Integer> f44194H = C15726bl.m35985a(1, "gads:video:codec_query_minimum_version", 16);

    /* renamed from: I */
    public static final C15726bl<String> f44195I = C15726bl.m35988a(1, "gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");

    /* renamed from: J */
    public static final C15726bl<String> f44196J = C15726bl.m35988a(1, "gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");

    /* renamed from: K */
    public static final C15726bl<String> f44197K = C15726bl.m35988a(1, "gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");

    /* renamed from: L */
    public static final C15726bl<String> f44198L = C15726bl.m35988a(1, "gad:mraid:version", "2.0");

    /* renamed from: M */
    public static final C15726bl<Boolean> f44199M = C15726bl.m35987a(1, "gads:mraid:unload", Boolean.valueOf(false));

    /* renamed from: N */
    public static final C15726bl<Boolean> f44200N = C15726bl.m35987a(0, "gads:enabled_sdk_csi", Boolean.valueOf(false));

    /* renamed from: O */
    public static final C15726bl<String> f44201O = C15726bl.m35988a(0, "gads:sdk_csi_server", "https://csi.gstatic.com/csi");

    /* renamed from: P */
    public static final C15726bl<Boolean> f44202P = C15726bl.m35987a(0, "gads:sdk_csi_write_to_file", Boolean.valueOf(false));

    /* renamed from: Q */
    public static final C15726bl<Boolean> f44203Q = C15726bl.m35987a(0, "gads:enable_content_fetching", Boolean.valueOf(true));

    /* renamed from: R */
    public static final C15726bl<Integer> f44204R = C15726bl.m35985a(0, "gads:content_length_weight", 1);

    /* renamed from: S */
    public static final C15726bl<Integer> f44205S = C15726bl.m35985a(0, "gads:content_age_weight", 1);

    /* renamed from: T */
    public static final C15726bl<Integer> f44206T = C15726bl.m35985a(0, "gads:min_content_len", 11);

    /* renamed from: U */
    public static final C15726bl<Integer> f44207U = C15726bl.m35985a(0, "gads:fingerprint_number", 10);

    /* renamed from: V */
    public static final C15726bl<Integer> f44208V = C15726bl.m35985a(0, "gads:sleep_sec", 10);

    /* renamed from: W */
    public static final C15726bl<Integer> f44209W = C15726bl.m35985a(1, "gads:content_vertical_fingerprint_number", 100);

    /* renamed from: X */
    public static final C15726bl<Integer> f44210X = C15726bl.m35985a(1, "gads:content_vertical_fingerprint_bits", 23);

    /* renamed from: Y */
    public static final C15726bl<Integer> f44211Y = C15726bl.m35985a(1, "gads:content_vertical_fingerprint_ngram", 3);

    /* renamed from: Z */
    public static final C15726bl<String> f44212Z = C15726bl.m35988a(1, "gads:content_fetch_view_tag_id", "googlebot");

    /* renamed from: a */
    public static final C15726bl<String> f44213a = C15726bl.m35988a(0, "gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40-loader.html");

    /* renamed from: aA */
    public static final C15726bl<Boolean> f44214aA = C15726bl.m35987a(1, "gads:rewarded:ad_metadata_enabled", Boolean.valueOf(false));

    /* renamed from: aB */
    public static final C15726bl<Boolean> f44215aB = C15726bl.m35987a(1, "gads:rewarded:ssv_custom_data_enabled", Boolean.valueOf(true));

    /* renamed from: aC */
    public static final C15726bl<Long> f44216aC = C15726bl.m35986a(1, "gads:app_activity_tracker:notify_background_listeners_delay_ms", 500);

    /* renamed from: aD */
    public static final C15726bl<Long> f44217aD = C15726bl.m35986a(1, "gads:app_activity_tracker:app_session_timeout_ms", TimeUnit.MINUTES.toMillis(5));

    /* renamed from: aE */
    public static final C15726bl<Boolean> f44218aE = C15726bl.m35987a(1, "gads:adid_values_in_adrequest:enabled", Boolean.valueOf(false));

    /* renamed from: aF */
    public static final C15726bl<Long> f44219aF = C15726bl.m35986a(1, "gads:adid_values_in_adrequest:timeout", 2000);

    /* renamed from: aG */
    public static final C15726bl<Boolean> f44220aG = C15726bl.m35987a(1, "gads:disable_adid_values_in_ms", Boolean.valueOf(false));

    /* renamed from: aH */
    public static final C15726bl<Long> f44221aH = C15726bl.m35986a(1, "gads:ad_overlay:delay_page_close_timeout_ms", 5000);

    /* renamed from: aI */
    public static final C15726bl<Boolean> f44222aI = C15726bl.m35987a(1, "gads:custom_close_blocking:enabled", Boolean.valueOf(false));

    /* renamed from: aJ */
    public static final C15726bl<Boolean> f44223aJ = C15726bl.m35987a(1, "gads:disabling_closable_area:enabled", Boolean.valueOf(false));

    /* renamed from: aK */
    public static final C15726bl<Boolean> f44224aK = C15726bl.m35987a(1, "gads:use_system_ui_for_fullscreen:enabled", Boolean.valueOf(false));

    /* renamed from: aL */
    public static final C15726bl<Boolean> f44225aL = C15726bl.m35987a(1, "gads:ad_overlay:collect_cutout_info:enabled", Boolean.valueOf(false));

    /* renamed from: aM */
    public static final C15726bl<Boolean> f44226aM = C15726bl.m35987a(1, "gads:interstitial_ad_pool:enabled", Boolean.valueOf(false));

    /* renamed from: aN */
    public static final C15726bl<Boolean> f44227aN = C15726bl.m35987a(1, "gads:interstitial_ad_pool:enabled_for_rewarded", Boolean.valueOf(false));

    /* renamed from: aO */
    public static final C15726bl<String> f44228aO = C15726bl.m35988a(1, "gads:interstitial_ad_pool:schema", "customTargeting");

    /* renamed from: aP */
    public static final C15726bl<String> f44229aP = C15726bl.m35988a(1, "gads:interstitial_ad_pool:request_exclusions", "com.google.ads.mediation.admob.AdMobAdapter/_ad");

    /* renamed from: aQ */
    public static final C15726bl<Integer> f44230aQ = C15726bl.m35985a(1, "gads:interstitial_ad_pool:max_pools", 3);

    /* renamed from: aR */
    public static final C15726bl<Integer> f44231aR = C15726bl.m35985a(1, "gads:interstitial_ad_pool:max_pool_depth", 2);

    /* renamed from: aS */
    public static final C15726bl<Integer> f44232aS = C15726bl.m35985a(1, "gads:interstitial_ad_pool:time_limit_sec", 1200);

    /* renamed from: aT */
    public static final C15726bl<String> f44233aT = C15726bl.m35988a(1, "gads:interstitial_ad_pool:ad_unit_exclusions", "(?!)");

    /* renamed from: aU */
    public static final C15726bl<Integer> f44234aU = C15726bl.m35985a(1, "gads:interstitial_ad_pool:top_off_latency_min_millis", 0);

    /* renamed from: aV */
    public static final C15726bl<Integer> f44235aV = C15726bl.m35985a(1, "gads:interstitial_ad_pool:top_off_latency_range_millis", 0);

    /* renamed from: aW */
    public static final C15726bl<Long> f44236aW = C15726bl.m35986a(1, "gads:interstitial_ad_pool:discard_thresholds", 0);

    /* renamed from: aX */
    public static final C15726bl<Long> f44237aX = C15726bl.m35986a(1, "gads:interstitial_ad_pool:miss_thresholds", 0);

    /* renamed from: aY */
    public static final C15726bl<Float> f44238aY = C15726bl.m35984a(1, "gads:interstitial_ad_pool:discard_asymptote", 0.0f);

    /* renamed from: aZ */
    public static final C15726bl<Float> f44239aZ = C15726bl.m35984a(1, "gads:interstitial_ad_pool:miss_asymptote", 0.0f);

    /* renamed from: aa */
    public static final C15726bl<String> f44240aa = C15726bl.m35988a(1, "gads:content_fetch_exclude_view_tag", "none");

    /* renamed from: ab */
    public static final C15726bl<Boolean> f44241ab = C15726bl.m35987a(1, "gads:content_fetch_disable_get_title_from_webview", Boolean.valueOf(false));

    /* renamed from: ac */
    public static final C15726bl<Boolean> f44242ac = C15726bl.m35987a(0, "gads:app_index:without_content_info_present:enabled", Boolean.valueOf(true));

    /* renamed from: ad */
    public static final C15726bl<Long> f44243ad = C15726bl.m35986a(0, "gads:app_index:timeout_ms", 1000);

    /* renamed from: ae */
    public static final C15726bl<Boolean> f44244ae = C15726bl.m35987a(0, "gads:ad_key_enabled", Boolean.valueOf(false));

    /* renamed from: af */
    public static final C15726bl<Boolean> f44245af = C15726bl.m35987a(1, "gads:sai:enabled", Boolean.valueOf(true));

    /* renamed from: ag */
    public static final C15726bl<String> f44246ag = C15726bl.m35988a(1, "gads:sai:click_ping_schema_v2", "^[^?]*(/aclk\\?|/pcs/click\\?).*");

    /* renamed from: ah */
    public static final C15726bl<String> f44247ah = C15726bl.m35988a(1, "gads:sai:impression_ping_schema_v2", "^[^?]*/adview.*");

    /* renamed from: ai */
    public static final C15726bl<Boolean> f44248ai = C15726bl.m35987a(1, "gads:sai:using_macro:enabled", Boolean.valueOf(false));

    /* renamed from: aj */
    public static final C15726bl<String> f44249aj = C15726bl.m35988a(1, "gads:sai:ad_event_id_macro_name", "[gw_fbsaeid]");

    /* renamed from: ak */
    public static final C15726bl<Long> f44250ak = C15726bl.m35986a(1, "gads:sai:timeout_ms", -1);

    /* renamed from: al */
    public static final C15726bl<Integer> f44251al = C15726bl.m35985a(1, "gads:sai:scion_thread_pool_size", 5);

    /* renamed from: am */
    public static final C15726bl<Boolean> f44252am = C15726bl.m35987a(1, "gads:sai:app_measurement_enabled", Boolean.valueOf(false));

    /* renamed from: an */
    public static final C15726bl<Boolean> f44253an = C15726bl.m35987a(2, "app_measurement_enabled", Boolean.valueOf(false));

    /* renamed from: ao */
    public static final C15726bl<Boolean> f44254ao = C15726bl.m35987a(1, "gads:sai:force_through_reflection", Boolean.valueOf(true));

    /* renamed from: ap */
    public static final C15726bl<Boolean> f44255ap = C15726bl.m35987a(1, "gads:sai:gmscore_availability_check_disabled", Boolean.valueOf(false));

    /* renamed from: aq */
    public static final C15726bl<Boolean> f44256aq = C15726bl.m35987a(1, "gads:sai:logging_disabled_for_drx", Boolean.valueOf(false));

    /* renamed from: ar */
    public static final C15726bl<Boolean> f44257ar = C15726bl.m35987a(1, "gads:interstitial:app_must_be_foreground:enabled", Boolean.valueOf(false));

    /* renamed from: as */
    public static final C15726bl<Boolean> f44258as = C15726bl.m35987a(1, "gads:interstitial:foreground_report:enabled", Boolean.valueOf(false));

    /* renamed from: at */
    public static final C15726bl<Boolean> f44259at = C15726bl.m35987a(0, "gads:corewebview:adwebview_factory:enable", Boolean.valueOf(false));

    /* renamed from: au */
    public static final C15726bl<Boolean> f44260au = C15726bl.m35987a(0, "gads:corewebview:javascript_engine", Boolean.valueOf(false));

    /* renamed from: av */
    public static final C15726bl<Boolean> f44261av = C15726bl.m35987a(1, "gad:webview:inject_scripts", Boolean.valueOf(false));

    /* renamed from: aw */
    public static final C15726bl<Boolean> f44262aw = C15726bl.m35987a(0, "gads:webview:permission:disabled", Boolean.valueOf(false));

    /* renamed from: ax */
    public static final C15726bl<Boolean> f44263ax = C15726bl.m35987a(1, "gads:webview:error_web_response:enabled", Boolean.valueOf(false));

    /* renamed from: ay */
    public static final C15726bl<Boolean> f44264ay = C15726bl.m35987a(1, "gads:rewarded:adapter_initialization_enabled", Boolean.valueOf(false));

    /* renamed from: az */
    public static final C15726bl<Long> f44265az = C15726bl.m35986a(1, "gads:rewarded:adapter_timeout_ms", 20000);

    /* renamed from: b */
    public static final C15726bl<String> f44266b = C15726bl.m35988a(1, "gads:sdk_core_location:client:html", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");

    /* renamed from: bA */
    public static final C15726bl<String> f44267bA = C15726bl.m35988a(1, "gads:gestures:pk", "");

    /* renamed from: bB */
    public static final C15726bl<Boolean> f44268bB = C15726bl.m35987a(1, "gads:gestures:bs:enabled", Boolean.valueOf(true));

    /* renamed from: bC */
    public static final C15726bl<Boolean> f44269bC = C15726bl.m35987a(1, "gads:gestures:check_initialization_thread:enabled", Boolean.valueOf(false));

    /* renamed from: bD */
    public static final C15726bl<Boolean> f44270bD = C15726bl.m35987a(1, "gads:gestures:get_query_in_non_ui_thread:enabled", Boolean.valueOf(true));

    /* renamed from: bE */
    public static final C15726bl<Boolean> f44271bE = C15726bl.m35987a(1, "gads:gestures:pds:enabled", Boolean.valueOf(false));

    /* renamed from: bF */
    public static final C15726bl<Boolean> f44272bF = C15726bl.m35987a(1, "gads:gestures:ns:enabled", Boolean.valueOf(false));

    /* renamed from: bG */
    public static final C15726bl<Boolean> f44273bG = C15726bl.m35987a(1, "gads:gestures:vdd:enabled", Boolean.valueOf(false));

    /* renamed from: bH */
    public static final C15726bl<String> f44274bH = C15726bl.m35988a(1, "gads:sdk_core_constants:caps", "");

    /* renamed from: bI */
    public static final C15726bl<Long> f44275bI = C15726bl.m35986a(0, "gads:js_flags:update_interval", TimeUnit.HOURS.toMillis(12));

    /* renamed from: bJ */
    public static final C15726bl<Boolean> f44276bJ = C15726bl.m35987a(0, "gads:js_flags:mf", Boolean.valueOf(false));

    /* renamed from: bK */
    public static final C15726bl<Boolean> f44277bK = C15726bl.m35987a(0, "gads:custom_render:ping_on_ad_rendered", Boolean.valueOf(false));

    /* renamed from: bL */
    public static final C15726bl<String> f44278bL = C15726bl.m35988a(1, "gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");

    /* renamed from: bM */
    public static final C15726bl<String> f44279bM = C15726bl.m35988a(1, "gads:native:video_url_with_protocol", "https://imasdk.googleapis.com/admob/sdkloader/native_video.html");

    /* renamed from: bN */
    public static final C15726bl<Integer> f44280bN = C15726bl.m35985a(1, "gads:native_video_load_timeout", 10);

    /* renamed from: bO */
    public static final C15726bl<Integer> f44281bO = C15726bl.m35985a(1, "gads:omid:native_webview_load_timeout", 2000);

    /* renamed from: bP */
    public static final C15726bl<Boolean> f44282bP = C15726bl.m35987a(1, "gads:enable_native_media_aspect_ratio", Boolean.valueOf(true));

    /* renamed from: bQ */
    public static final C15726bl<String> f44283bQ = C15726bl.m35988a(1, "gads:ad_choices_content_description", "Ad Choices Icon");

    /* renamed from: bR */
    public static final C15726bl<Boolean> f44284bR = C15726bl.m35987a(1, "gads:enable_store_active_view_state", Boolean.valueOf(false));

    /* renamed from: bS */
    public static final C15726bl<Boolean> f44285bS = C15726bl.m35987a(1, "gads:enable_singleton_broadcast_receiver", Boolean.valueOf(false));

    /* renamed from: bT */
    public static final C15726bl<Boolean> f44286bT = C15726bl.m35987a(1, "gads:native:media_view_match_parent:enabled", Boolean.valueOf(false));

    /* renamed from: bU */
    public static final C15726bl<Boolean> f44287bU = C15726bl.m35987a(1, "gads:native:count_impression_for_assets", Boolean.valueOf(false));

    /* renamed from: bV */
    public static final C15726bl<Boolean> f44288bV = C15726bl.m35987a(1, "gads:instream_ad:enabled", Boolean.valueOf(true));

    /* renamed from: bW */
    public static final C15726bl<Boolean> f44289bW = C15726bl.m35987a(1, "gads:fluid_ad:use_wrap_content_height", Boolean.valueOf(false));

    /* renamed from: bX */
    public static final C15726bl<Long> f44290bX = C15726bl.m35986a(1, "gads:auto_location_timeout", 2000);

    /* renamed from: bY */
    public static final C15726bl<Boolean> f44291bY = C15726bl.m35987a(1, "gads:fetch_app_settings_using_cld:enabled", Boolean.valueOf(false));

    /* renamed from: bZ */
    public static final C15726bl<Long> f44292bZ = C15726bl.m35986a(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms", 7200000);

    /* renamed from: ba */
    public static final C15726bl<Boolean> f44293ba = C15726bl.m35987a(0, "gads:debug_logging_feature:enable", Boolean.valueOf(false));

    /* renamed from: bb */
    public static final C15726bl<Boolean> f44294bb = C15726bl.m35987a(0, "gads:debug_logging_feature:intercept_web_view", Boolean.valueOf(false));

    /* renamed from: bc */
    public static final C15726bl<String> f44295bc = C15726bl.m35988a(1, "gads:spherical_video:vertex_shader", "");

    /* renamed from: bd */
    public static final C15726bl<String> f44296bd = C15726bl.m35988a(1, "gads:spherical_video:fragment_shader", "");

    /* renamed from: be */
    public static final C15726bl<Boolean> f44297be = C15726bl.m35987a(0, "gads:log:verbose_enabled", Boolean.valueOf(false));

    /* renamed from: bf */
    public static final C15726bl<Boolean> f44298bf = C15726bl.m35987a(1, "gads:include_local_global_rectangles", Boolean.valueOf(false));

    /* renamed from: bg */
    public static final C15726bl<Long> f44299bg = C15726bl.m35986a(1, "gads:position_watcher:throttle_ms", 200);

    /* renamed from: bh */
    public static final C15726bl<Long> f44300bh = C15726bl.m35986a(1, "gads:position_watcher:scroll_aware_throttle_ms", 33);

    /* renamed from: bi */
    public static final C15726bl<Boolean> f44301bi = C15726bl.m35987a(1, "gads:position_watcher:enable_scroll_aware_ads", Boolean.valueOf(false));

    /* renamed from: bj */
    public static final C15726bl<Boolean> f44302bj = C15726bl.m35987a(1, "gads:position_watcher:send_scroll_data", Boolean.valueOf(false));

    /* renamed from: bk */
    public static final C15726bl<Long> f44303bk = C15726bl.m35986a(0, "gads:device_info_caching_expiry_ms:expiry", 300000);

    /* renamed from: bl */
    public static final C15726bl<Boolean> f44304bl = C15726bl.m35987a(1, "gads:gen204_signals:enabled", Boolean.valueOf(false));

    /* renamed from: bm */
    public static final C15726bl<Boolean> f44305bm = C15726bl.m35987a(0, "gads:webview:error_reporting_enabled", Boolean.valueOf(false));

    /* renamed from: bn */
    public static final C15726bl<Long> f44306bn = C15726bl.m35986a(0, "gads:resolve_future:default_timeout_ms", 30000);

    /* renamed from: bo */
    public static final C15726bl<Long> f44307bo = C15726bl.m35986a(0, "gads:ad_loader:timeout_ms", 60000);

    /* renamed from: bp */
    public static final C15726bl<Long> f44308bp = C15726bl.m35986a(0, "gads:rendering:timeout_ms", 60000);

    /* renamed from: bq */
    public static final C15726bl<Boolean> f44309bq = C15726bl.m35987a(0, "gads:adshield:enable_adshield_instrumentation", Boolean.valueOf(false));

    /* renamed from: br */
    public static final C15726bl<Boolean> f44310br = C15726bl.m35987a(1, "gads:gestures:errorlogging:enabled", Boolean.valueOf(false));

    /* renamed from: bs */
    public static final C15726bl<Long> f44311bs = C15726bl.m35986a(1, "gads:gestures:task_timeout", 2000);

    /* renamed from: bt */
    public static final C15726bl<Boolean> f44312bt = C15726bl.m35987a(1, "gads:gestures:asig:enabled", Boolean.valueOf(false));

    /* renamed from: bu */
    public static final C15726bl<Boolean> f44313bu = C15726bl.m35987a(1, "gads:gestures:ans:enabled", Boolean.valueOf(false));

    /* renamed from: bv */
    public static final C15726bl<Boolean> f44314bv = C15726bl.m35987a(1, "gads:gestures:tos:enabled", Boolean.valueOf(false));

    /* renamed from: bw */
    public static final C15726bl<Boolean> f44315bw = C15726bl.m35987a(1, "gads:gestures:brt:enabled", Boolean.valueOf(true));

    /* renamed from: bx */
    public static final C15726bl<Boolean> f44316bx = C15726bl.m35987a(1, "gads:signal:app_permissions:disabled", Boolean.valueOf(false));

    /* renamed from: by */
    public static final C15726bl<Boolean> f44317by = C15726bl.m35987a(1, "gads:gestures:inthex:enabled", Boolean.valueOf(false));

    /* renamed from: bz */
    public static final C15726bl<Boolean> f44318bz = C15726bl.m35987a(1, "gads:gestures:hpk:enabled", Boolean.valueOf(true));

    /* renamed from: c */
    public static final C15726bl<String> f44319c = C15726bl.m35988a(1, "gads:active_view_location:html", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");

    /* renamed from: cA */
    public static final C15726bl<Integer> f44320cA = C15726bl.m35985a(1, "gads:drx_debug:timeout_ms", 5000);

    /* renamed from: cB */
    public static final C15726bl<Integer> f44321cB = C15726bl.m35985a(1, "gad:pixel_dp_comparision_multiplier", 1);

    /* renamed from: cC */
    public static final C15726bl<Boolean> f44322cC = C15726bl.m35987a(1, "gad:interstitial_for_multi_window", Boolean.valueOf(false));

    /* renamed from: cD */
    public static final C15726bl<Boolean> f44323cD = C15726bl.m35987a(1, "gad:interstitial_ad_stay_active_in_multi_window", Boolean.valueOf(false));

    /* renamed from: cE */
    public static final C15726bl<Boolean> f44324cE = C15726bl.m35987a(1, "gad:interstitial_multi_window_method", Boolean.valueOf(false));

    /* renamed from: cF */
    public static final C15726bl<Integer> f44325cF = C15726bl.m35985a(1, "gad:interstitial:close_button_padding_dip", 0);

    /* renamed from: cG */
    public static final C15726bl<Boolean> f44326cG = C15726bl.m35987a(1, "gads:clearcut_logging:enabled", Boolean.valueOf(false));

    /* renamed from: cH */
    public static final C15726bl<Boolean> f44327cH = C15726bl.m35987a(1, "gads:clearcut_logging:write_to_file", Boolean.valueOf(false));

    /* renamed from: cI */
    public static final C15726bl<Boolean> f44328cI = C15726bl.m35987a(0, "gad:force_local_ad_request_service:enabled", Boolean.valueOf(false));

    /* renamed from: cJ */
    public static final C15726bl<Boolean> f44329cJ = C15726bl.m35987a(1, "gad:publisher_testing:force_local_request:enabled", Boolean.valueOf(true));

    /* renamed from: cK */
    public static final C15726bl<String> f44330cK = C15726bl.m35988a(1, "gad:publisher_testing:force_local_request:enabled_list", "");

    /* renamed from: cL */
    public static final C15726bl<String> f44331cL = C15726bl.m35988a(1, "gad:publisher_testing:force_local_request:disabled_list", "");

    /* renamed from: cM */
    public static final C15726bl<Boolean> f44332cM = C15726bl.m35987a(0, "gad:force_dynamite_loading_enabled", Boolean.valueOf(false));

    /* renamed from: cN */
    public static final C15726bl<Integer> f44333cN = C15726bl.m35985a(1, "gad:http_redirect_max_count:times", 8);

    /* renamed from: cO */
    public static final C15726bl<Boolean> f44334cO = C15726bl.m35987a(1, "gads:omid:enabled", Boolean.valueOf(false));

    /* renamed from: cP */
    public static final C15726bl<Integer> f44335cP = C15726bl.m35985a(1, "gads:omid:destroy_webview_delay", 1000);

    /* renamed from: cQ */
    public static final C15726bl<Boolean> f44336cQ = C15726bl.m35987a(1, "gads:nonagon:banner:check_dp_size", Boolean.valueOf(false));

    /* renamed from: cR */
    public static final C15726bl<Boolean> f44337cR = C15726bl.m35987a(1, "gads:nonagon:return_last_error_code", Boolean.valueOf(false));

    /* renamed from: cS */
    public static final C15726bl<Boolean> f44338cS = C15726bl.m35987a(1, "gads:nonagon:open_not_loaded_interstitial", Boolean.valueOf(true));

    /* renamed from: cT */
    public static final C15726bl<Boolean> f44339cT = C15726bl.m35987a(1, "gads:signals:doritos:v1:enabled", Boolean.valueOf(false));

    /* renamed from: cU */
    public static final C15726bl<Long> f44340cU = C15726bl.m35986a(1, "gads:mobius_linking:sdk_side_cooldown_time_threshold:ms", 3600000);

    /* renamed from: cV */
    public static final C15726bl<String> f44341cV = C15726bl.m35988a(0, "gads:public_beta:traffic_multiplier", "1.0");

    /* renamed from: cW */
    public static final C15726bl<Integer> f44342cW = C15726bl.m35985a(1, "gads:adoverlay:b68684796:targeting_sdk:lower_bound", 27);

    /* renamed from: cX */
    public static final C15726bl<Integer> f44343cX = C15726bl.m35985a(1, "gads:adoverlay:b68684796:targeting_sdk:upper_bound", 999);

    /* renamed from: cY */
    public static final C15726bl<Integer> f44344cY = C15726bl.m35985a(1, "gads:adoverlay:b68684796:sdk_int:lower_bound", 26);

    /* renamed from: cZ */
    public static final C15726bl<Integer> f44345cZ = C15726bl.m35985a(1, "gads:adoverlay:b68684796:sdk_int:upper_bound", 27);

    /* renamed from: ca */
    public static final C15726bl<String> f44346ca = C15726bl.m35988a(0, "gads:afs:csa_webview_gmsg_ad_failed", "gmsg://noAdLoaded");

    /* renamed from: cb */
    public static final C15726bl<String> f44347cb = C15726bl.m35988a(0, "gads:afs:csa_webview_gmsg_script_load_failed", "gmsg://scriptLoadFailed");

    /* renamed from: cc */
    public static final C15726bl<String> f44348cc = C15726bl.m35988a(0, "gads:afs:csa_webview_gmsg_ad_loaded", "gmsg://adResized");

    /* renamed from: cd */
    public static final C15726bl<String> f44349cd = C15726bl.m35988a(0, "gads:afs:csa_webview_static_file_path", "/afs/ads/i/webview.html");

    /* renamed from: ce */
    public static final C15726bl<String> f44350ce = C15726bl.m35988a(0, "gads:afs:csa_webview_custom_domain_param_key", "csa_customDomain");

    /* renamed from: cf */
    public static final C15726bl<Long> f44351cf = C15726bl.m35986a(0, "gads:afs:csa_webview_adshield_timeout_ms", 1000);

    /* renamed from: cg */
    public static final C15726bl<Long> f44352cg = C15726bl.m35986a(1, "gads:parental_controls:timeout", 2000);

    /* renamed from: ch */
    public static final C15726bl<Boolean> f44353ch = C15726bl.m35987a(0, "gads:safe_browsing:debug", Boolean.valueOf(false));

    /* renamed from: ci */
    public static final C15726bl<Boolean> f44354ci = C15726bl.m35987a(1, "gads:cache:bind_on_foreground", Boolean.valueOf(false));

    /* renamed from: cj */
    public static final C15726bl<Boolean> f44355cj = C15726bl.m35987a(1, "gads:cache:bind_on_init", Boolean.valueOf(false));

    /* renamed from: ck */
    public static final C15726bl<Boolean> f44356ck = C15726bl.m35987a(1, "gads:cache:bind_on_request", Boolean.valueOf(false));

    /* renamed from: cl */
    public static final C15726bl<Long> f44357cl = C15726bl.m35986a(1, "gads:cache:bind_on_request_keep_alive", TimeUnit.SECONDS.toMillis(30));

    /* renamed from: cm */
    public static final C15726bl<Boolean> f44358cm = C15726bl.m35987a(1, "gads:cache:use_cache_data_source", Boolean.valueOf(false));

    /* renamed from: cn */
    public static final C15726bl<Boolean> f44359cn = C15726bl.m35987a(1, "gads:cache:connection_per_read", Boolean.valueOf(false));

    /* renamed from: co */
    public static final C15726bl<Long> f44360co = C15726bl.m35986a(1, "gads:cache:connection_timeout", 5000);

    /* renamed from: cp */
    public static final C15726bl<Long> f44361cp = C15726bl.m35986a(1, "gads:cache:read_only_connection_timeout", 5000);

    /* renamed from: cq */
    public static final C15726bl<Boolean> f44362cq = C15726bl.m35987a(1, "gads:http_assets_cache:enabled", Boolean.valueOf(false));

    /* renamed from: cr */
    public static final C15726bl<String> f44363cr = C15726bl.m35988a(1, "gads:http_assets_cache:regex", "(?i)https:\\/\\/(tpc\\.googlesyndication\\.com\\/(.*)|lh\\d+\\.googleusercontent\\.com\\/(.*))");

    /* renamed from: cs */
    public static final C15726bl<Integer> f44364cs = C15726bl.m35985a(1, "gads:http_assets_cache:time_out", 100);

    /* renamed from: ct */
    public static final C15726bl<Boolean> f44365ct = C15726bl.m35987a(1, "gads:chrome_custom_tabs_browser:enabled", Boolean.valueOf(false));

    /* renamed from: cu */
    public static final C15726bl<Boolean> f44366cu = C15726bl.m35987a(1, "gads:chrome_custom_tabs:disabled", Boolean.valueOf(false));

    /* renamed from: cv */
    public static final C15726bl<Long> f44367cv = C15726bl.m35986a(1, "gads:debug_hold_gesture:time_millis", 2000);

    /* renamed from: cw */
    public static final C15726bl<String> f44368cw = C15726bl.m35988a(1, "gads:drx_debug:debug_device_linking_url", "https://www.google.com/dfp/linkDevice");

    /* renamed from: cx */
    public static final C15726bl<String> f44369cx = C15726bl.m35988a(1, "gads:drx_debug:in_app_preview_status_url", "https://www.google.com/dfp/inAppPreview");

    /* renamed from: cy */
    public static final C15726bl<String> f44370cy = C15726bl.m35988a(1, "gads:drx_debug:debug_signal_status_url", "https://www.google.com/dfp/debugSignals");

    /* renamed from: cz */
    public static final C15726bl<String> f44371cz = C15726bl.m35988a(1, "gads:drx_debug:send_debug_data_url", "https://www.google.com/dfp/sendDebugData");

    /* renamed from: d */
    public static final C15726bl<Boolean> f44372d = C15726bl.m35987a(0, "gads:request_builder:refresh_if_destroyed:enable", Boolean.valueOf(true));

    /* renamed from: dA */
    private static final C15726bl<Boolean> f44373dA = C15726bl.m35987a(1, "gads:new_rewarded_ad:enabled", Boolean.valueOf(true));

    /* renamed from: dB */
    private static final C15726bl<Boolean> f44374dB = C15726bl.m35987a(0, "gads:ad_serving:enabled", Boolean.valueOf(true));

    /* renamed from: dC */
    private static final C15726bl<Boolean> f44375dC = C15726bl.m35987a(1, "gads:impression_optimization_enabled", Boolean.valueOf(false));

    /* renamed from: dD */
    private static final C15726bl<String> f44376dD = C15726bl.m35988a(1, "gads:banner_ad_pool:schema", "customTargeting");

    /* renamed from: dE */
    private static final C15726bl<Integer> f44377dE = C15726bl.m35985a(1, "gads:banner_ad_pool:max_queues", 3);

    /* renamed from: dF */
    private static final C15726bl<Integer> f44378dF = C15726bl.m35985a(1, "gads:banner_ad_pool:max_pools", 3);

    /* renamed from: dG */
    private static final C15726bl<Boolean> f44379dG = C15726bl.m35987a(1, "gads:delay_banner_renderer:enabled", Boolean.valueOf(true));

    /* renamed from: dH */
    private static final C15726bl<Integer> f44380dH = C15726bl.m35985a(1, "gads:heap_wastage:bytes", 0);

    /* renamed from: dI */
    private static final C15726bl<Boolean> f44381dI = C15726bl.m35987a(0, "gads:adid_reporting:enabled", Boolean.valueOf(false));

    /* renamed from: dJ */
    private static final C15726bl<Boolean> f44382dJ = C15726bl.m35987a(0, "gads:ad_settings_page_reporting:enabled", Boolean.valueOf(false));

    /* renamed from: dK */
    private static final C15726bl<Boolean> f44383dK = C15726bl.m35987a(0, "gads:adid_info_gmscore_upgrade_reporting:enabled", Boolean.valueOf(false));

    /* renamed from: dL */
    private static final C15726bl<Long> f44384dL = C15726bl.m35986a(1, "gads:rtb_signal_timeout_ms", 1000);

    /* renamed from: dM */
    private static final C15726bl<Boolean> f44385dM = C15726bl.m35987a(2, "rtb_enabled", Boolean.valueOf(false));

    /* renamed from: dN */
    private static final C15726bl<Boolean> f44386dN = C15726bl.m35987a(1, "gads:rtb_cld:enabled", Boolean.valueOf(false));

    /* renamed from: dO */
    private static final C15726bl<Boolean> f44387dO = C15726bl.m35987a(1, "gads:adapter_initialization:enabled", Boolean.valueOf(false));

    /* renamed from: dP */
    private static final C15726bl<Long> f44388dP = C15726bl.m35986a(1, "gads:adapter_initialization:timeout", 30);

    /* renamed from: dQ */
    private static final C15726bl<Long> f44389dQ = C15726bl.m35986a(1, "gads:adapter_initialization:cld_timeout", 10);

    /* renamed from: dR */
    private static final C15726bl<Boolean> f44390dR = C15726bl.m35987a(0, "gads:adid_notification:first_party_check:enabled", Boolean.valueOf(true));

    /* renamed from: dS */
    private static final C15726bl<Boolean> f44391dS = C15726bl.m35987a(0, "gads:adid_track_reset_count:enabled", Boolean.valueOf(true));

    /* renamed from: dT */
    private static final C15726bl<String> f44392dT = C15726bl.m35983a(1, "gads:sdk_core_constants:experiment_id");

    /* renamed from: dU */
    private static final C15726bl<Boolean> f44393dU = C15726bl.m35987a(1, "gads:js_flags:disable_phenotype", Boolean.valueOf(false));

    /* renamed from: dV */
    private static final C15726bl<String> f44394dV = C15726bl.m35988a(0, "gads:native:engine_js_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/native_ads.js");

    /* renamed from: dW */
    private static final C15726bl<String> f44395dW = C15726bl.m35988a(1, "gads:native:video_url", "//imasdk.googleapis.com/admob/sdkloader/native_video.html");

    /* renamed from: dX */
    private static final C15726bl<Boolean> f44396dX = C15726bl.m35987a(1, "gads:auto_location_for_coarse_permission", Boolean.valueOf(false));

    /* renamed from: dY */
    private static final C15726bl<String> f44397dY = C15726bl.m35989b(1, "gads:auto_location_for_coarse_permission:experiment_id");

    /* renamed from: dZ */
    private static final C15726bl<String> f44398dZ = C15726bl.m35989b(1, "gads:auto_location_timeout:experiment_id");

    /* renamed from: da */
    public static final C15726bl<Boolean> f44399da = C15726bl.m35987a(1, "gads:consent:shared_preference_reading:enabled", Boolean.valueOf(true));

    /* renamed from: db */
    public static final C15726bl<Boolean> f44400db = C15726bl.m35987a(1, "gads:consent:iab_consent_info:enabled", Boolean.valueOf(true));

    /* renamed from: dc */
    public static final C15726bl<Boolean> f44401dc = C15726bl.m35987a(1, "gads:nativeads:overlay_webview:onclick", Boolean.valueOf(false));

    /* renamed from: dd */
    public static final C15726bl<Integer> f44402dd = C15726bl.m35985a(0, "gads:dynamite_load:fail:sample_rate", 10000);

    /* renamed from: de */
    public static final C15726bl<Boolean> f44403de = C15726bl.m35987a(0, "gads:uri_query_to_map_rewrite:enabled", Boolean.valueOf(false));

    /* renamed from: df */
    private static final C15726bl<String> f44404df = C15726bl.m35983a(0, "gads:sdk_core_experiment_id");

    /* renamed from: dg */
    private static final C15726bl<String> f44405dg = C15726bl.m35988a(0, "gads:sdk_core_js_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.js");

    /* renamed from: dh */
    private static final C15726bl<Boolean> f44406dh = C15726bl.m35987a(0, "gads:request_builder:singleton_webview", Boolean.valueOf(false));

    /* renamed from: di */
    private static final C15726bl<String> f44407di = C15726bl.m35983a(0, "gads:request_builder:singleton_webview_experiment_id");

    /* renamed from: dj */
    private static final C15726bl<String> f44408dj = C15726bl.m35983a(0, "gads:request_builder:refresh_if_destroyed:experiment_id");

    /* renamed from: dk */
    private static final C15726bl<Boolean> f44409dk = C15726bl.m35987a(0, "gads:sdk_use_dynamic_module", Boolean.valueOf(true));

    /* renamed from: dl */
    private static final C15726bl<String> f44410dl = C15726bl.m35983a(0, "gads:sdk_use_dynamic_module_experiment_id");

    /* renamed from: dm */
    private static final C15726bl<String> f44411dm = C15726bl.m35983a(0, "gads:block_autoclicks_experiment_id");

    /* renamed from: dn */
    private static final C15726bl<String> f44412dn = C15726bl.m35983a(0, "gads:spam_app_context:experiment_id");

    /* renamed from: do */
    private static final C15726bl<Integer> f44413do = C15726bl.m35985a(1, "gads:http_url_connection_factory:timeout_millis", 10000);

    /* renamed from: dp */
    private static final C15726bl<String> f44414dp = C15726bl.m35983a(0, "gads:video_stream_cache:experiment_id");

    /* renamed from: dq */
    private static final C15726bl<Float> f44415dq = C15726bl.m35984a(0, "gads:ad_id_app_context:ping_ratio", 0.0f);

    /* renamed from: dr */
    private static final C15726bl<String> f44416dr = C15726bl.m35983a(0, "gads:ad_id_use_shared_preference:experiment_id");

    /* renamed from: ds */
    private static final C15726bl<Boolean> f44417ds = C15726bl.m35987a(0, "gads:ad_id_use_shared_preference:enabled", Boolean.valueOf(false));

    /* renamed from: dt */
    private static final C15726bl<Float> f44418dt = C15726bl.m35984a(0, "gads:ad_id_use_shared_preference:ping_ratio", 0.0f);

    /* renamed from: du */
    private static final C15726bl<Boolean> f44419du = C15726bl.m35987a(0, "gads:ad_id_use_persistent_service:enabled", Boolean.valueOf(false));

    /* renamed from: dv */
    private static final C15726bl<Boolean> f44420dv = C15726bl.m35987a(0, "gads:ad_id:use_ipc:enabled", Boolean.valueOf(false));

    /* renamed from: dw */
    private static final C15726bl<String> f44421dw = C15726bl.m35983a(0, "gads:app_index:experiment_id");

    /* renamed from: dx */
    private static final C15726bl<Integer> f44422dx = C15726bl.m35985a(0, "gads:webview_cache_version", 0);

    /* renamed from: dy */
    private static final C15726bl<String> f44423dy = C15726bl.m35983a(0, "gads:corewebview:experiment_id");

    /* renamed from: dz */
    private static final C15726bl<String> f44424dz = C15726bl.m35989b(0, "gads:pan:experiment_id");

    /* renamed from: e */
    public static final C15726bl<Boolean> f44425e = C15726bl.m35987a(0, "gads:sdk_crash_report_enabled", Boolean.valueOf(false));

    /* renamed from: eA */
    private static final C15726bl<Integer> f44426eA = C15726bl.m35985a(1, "gads:nonagon:request_timeout:seconds", 60);

    /* renamed from: eB */
    private static final C15726bl<Boolean> f44427eB = C15726bl.m35987a(0, "gads:nonagon:limit_ad_request_connection", Boolean.valueOf(true));

    /* renamed from: eC */
    private static final C15726bl<Boolean> f44428eC = C15726bl.m35987a(1, "gads:nonagon:javascript_ad_request:enabled", Boolean.valueOf(false));

    /* renamed from: eD */
    private static final C15726bl<Boolean> f44429eD = C15726bl.m35987a(1, "gads:nonagon:banner_recursive_renderer", Boolean.valueOf(false));

    /* renamed from: eE */
    private static final C15726bl<Boolean> f44430eE = C15726bl.m35987a(1, "gads:nonagon:service:enabled", Boolean.valueOf(true));

    /* renamed from: eF */
    private static final C15726bl<Boolean> f44431eF = C15726bl.m35987a(1, "gads:signals:ad_id_info:enabled", Boolean.valueOf(false));

    /* renamed from: eG */
    private static final C15726bl<Boolean> f44432eG = C15726bl.m35987a(1, "gads:signals:app_index:enabled", Boolean.valueOf(false));

    /* renamed from: eH */
    private static final C15726bl<Boolean> f44433eH = C15726bl.m35987a(1, "gads:signals:cache:enabled", Boolean.valueOf(false));

    /* renamed from: eI */
    private static final C15726bl<Boolean> f44434eI = C15726bl.m35987a(1, "gads:signals:doritos:enabled", Boolean.valueOf(false));

    /* renamed from: eJ */
    private static final C15726bl<Boolean> f44435eJ = C15726bl.m35987a(1, "gads:signals:doritos:v2:immediate:enabled", Boolean.valueOf(false));

    /* renamed from: eK */
    private static final C15726bl<Boolean> f44436eK = C15726bl.m35987a(1, "gads:signals:location:enabled", Boolean.valueOf(false));

    /* renamed from: eL */
    private static final C15726bl<Boolean> f44437eL = C15726bl.m35987a(1, "gads:signals:network_prediction:enabled", Boolean.valueOf(false));

    /* renamed from: eM */
    private static final C15726bl<Boolean> f44438eM = C15726bl.m35987a(1, "gads:signals:parental_control:enabled", Boolean.valueOf(false));

    /* renamed from: eN */
    private static final C15726bl<Boolean> f44439eN = C15726bl.m35987a(1, "gads:signals:video_decoder:enabled", Boolean.valueOf(false));

    /* renamed from: eO */
    private static final C15726bl<Boolean> f44440eO = C15726bl.m35987a(1, "gads:signals:signals_on_service:enabled", Boolean.valueOf(false));

    /* renamed from: eP */
    private static final C15726bl<Boolean> f44441eP = C15726bl.m35987a(0, "gads:rewarded_sku:enabled", Boolean.valueOf(true));

    /* renamed from: eQ */
    private static final C15726bl<Boolean> f44442eQ = C15726bl.m35987a(0, "gads:rewarded_sku:override_test:enabled", Boolean.valueOf(false));

    /* renamed from: eR */
    private static final C15726bl<Boolean> f44443eR = C15726bl.m35987a(1, "gads:nativeads:image:sample:enabled", Boolean.valueOf(true));

    /* renamed from: eS */
    private static final C15726bl<Integer> f44444eS = C15726bl.m35985a(1, "gads:nativeads:image:sample:pixels", 1048576);

    /* renamed from: eT */
    private static final C15726bl<Boolean> f44445eT = C15726bl.m35987a(0, "gads:service:webview:enable_directory_suffix", Boolean.valueOf(true));

    /* renamed from: eU */
    private static final C15726bl<Boolean> f44446eU = C15726bl.m35987a(1, "gads:offline_signaling:enabled", Boolean.valueOf(false));

    /* renamed from: eV */
    private static final C15726bl<Integer> f44447eV = C15726bl.m35985a(1, "gads:offline_signaling:log_maximum", 100);

    /* renamed from: eW */
    private static final C15726bl<Boolean> f44448eW = C15726bl.m35987a(1, "gads:nativeads:template_signal:enabled", Boolean.valueOf(true));

    /* renamed from: eX */
    private static byte[] f44449eX;

    /* renamed from: ea */
    private static final C15726bl<Long> f44450ea = C15726bl.m35986a(1, "gads:auto_location_interval", -1);

    /* renamed from: eb */
    private static final C15726bl<String> f44451eb = C15726bl.m35989b(1, "gads:auto_location_interval:experiment_id");

    /* renamed from: ec */
    private static final C15726bl<Boolean> f44452ec = C15726bl.m35987a(0, "gads:auto_location_interval:without_thread", Boolean.valueOf(true));

    /* renamed from: ed */
    private static final C15726bl<String> f44453ed = C15726bl.m35983a(1, "gads:fetch_app_settings_using_cld:enabled:experiment_id");

    /* renamed from: ee */
    private static final C15726bl<Boolean> f44454ee = C15726bl.m35987a(1, "gads:use_manifest_appid_cld:enabled", Boolean.valueOf(false));

    /* renamed from: ef */
    private static final C15726bl<String> f44455ef = C15726bl.m35983a(0, "gads:afs:csa:experiment_id");

    /* renamed from: eg */
    private static final C15726bl<String> f44456eg = C15726bl.m35988a(0, "gads:safe_browsing:api_key", "AIzaSyDRKQ9d6kfsoZT2lUnZcZnBYvH69HExNPE");

    /* renamed from: eh */
    private static final C15726bl<Long> f44457eh = C15726bl.m35986a(0, "gads:safe_browsing:safety_net:delay_ms", 2000);

    /* renamed from: ei */
    private static final C15726bl<Integer> f44458ei = C15726bl.m35985a(1, "gads:cache:ad_request_timeout_millis", (int) NormalSplashDelayExperiment.GROUP1);

    /* renamed from: ej */
    private static final C15726bl<Integer> f44459ej = C15726bl.m35985a(1, "gads:cache:max_concurrent_downloads", 10);

    /* renamed from: ek */
    private static final C15726bl<Long> f44460ek = C15726bl.m35986a(1, "gads:cache:javascript_timeout_millis", 5000);

    /* renamed from: el */
    private static final C15726bl<String> f44461el = C15726bl.m35983a(0, "gad:dynamite_module:experiment_id");

    /* renamed from: em */
    private static final C15726bl<Boolean> f44462em = C15726bl.m35987a(0, "gads:nonagon:red_button", Boolean.valueOf(false));

    /* renamed from: en */
    private static final C15726bl<Boolean> f44463en = C15726bl.m35987a(1, "gads:nonagon:banner:enabled", Boolean.valueOf(false));

    /* renamed from: eo */
    private static final C15726bl<String> f44464eo = C15726bl.m35988a(1, "gads:nonagon:banner:ad_unit_exclusions", "(?!)");

    /* renamed from: ep */
    private static final C15726bl<Boolean> f44465ep = C15726bl.m35987a(1, "gads:nonagon:interstitial:enabled", Boolean.valueOf(false));

    /* renamed from: eq */
    private static final C15726bl<String> f44466eq = C15726bl.m35988a(1, "gads:nonagon:interstitial:ad_unit_exclusions", "(?!)");

    /* renamed from: er */
    private static final C15726bl<Boolean> f44467er = C15726bl.m35987a(1, "gads:nonagon:rewardedvideo:enabled", Boolean.valueOf(false));

    /* renamed from: es */
    private static final C15726bl<Boolean> f44468es = C15726bl.m35987a(1, "gads:nonagon:mobile_ads_setting_manager:enabled", Boolean.valueOf(false));

    /* renamed from: et */
    private static final C15726bl<String> f44469et = C15726bl.m35988a(1, "gads:nonagon:rewardedvideo:ad_unit_exclusions", "(?!)");

    /* renamed from: eu */
    private static final C15726bl<Boolean> f44470eu = C15726bl.m35987a(1, "gads:nonagon:nativead:enabled", Boolean.valueOf(false));

    /* renamed from: ev */
    private static final C15726bl<String> f44471ev = C15726bl.m35988a(1, "gads:nonagon:nativead:app_name", "(?!)");

    /* renamed from: ew */
    private static final C15726bl<Boolean> f44472ew = C15726bl.m35987a(1, "gads:nonagon:rewarded:load_multiple_ads", Boolean.valueOf(true));

    /* renamed from: ex */
    private static final C15726bl<Boolean> f44473ex = C15726bl.m35987a(1, "gads:nonagon:return_no_fill_error_code", Boolean.valueOf(false));

    /* renamed from: ey */
    private static final C15726bl<Boolean> f44474ey = C15726bl.m35987a(1, "gads:nonagon:continue_on_no_fill", Boolean.valueOf(false));

    /* renamed from: ez */
    private static final C15726bl<Boolean> f44475ez = C15726bl.m35987a(1, "gads:nonagon:separate_timeout:enabled", Boolean.valueOf(false));

    /* renamed from: f */
    public static final C15726bl<Boolean> f44476f = C15726bl.m35987a(0, "gads:report_dynamite_crash_in_background_thread", Boolean.valueOf(false));

    /* renamed from: g */
    public static final C15726bl<Boolean> f44477g = C15726bl.m35987a(0, "gads:sdk_crash_report_full_stacktrace", Boolean.valueOf(false));

    /* renamed from: h */
    public static final C15726bl<String> f44478h = C15726bl.m35988a(0, "gads:sdk_crash_report_class_prefix", "com.google.");

    /* renamed from: i */
    public static final C15726bl<Float> f44479i = C15726bl.m35984a(1, "gads:trapped_exception_sample_rate", 0.01f);

    /* renamed from: j */
    public static final C15726bl<String> f44480j = C15726bl.m35988a(1, "gads:video_exo_player:version", "3");

    /* renamed from: k */
    public static final C15726bl<Integer> f44481k = C15726bl.m35985a(1, "gads:video_exo_player:connect_timeout", 8000);

    /* renamed from: l */
    public static final C15726bl<Integer> f44482l = C15726bl.m35985a(1, "gads:video_exo_player:read_timeout", 8000);

    /* renamed from: m */
    public static final C15726bl<Integer> f44483m = C15726bl.m35985a(1, "gads:video_exo_player:loading_check_interval", 1048576);

    /* renamed from: n */
    public static final C15726bl<Integer> f44484n = C15726bl.m35985a(1, "gads:video_exo_player:exo_player_precache_limit", Integer.MAX_VALUE);

    /* renamed from: o */
    public static final C15726bl<Integer> f44485o = C15726bl.m35985a(1, "gads:video_exo_player:byte_buffer_precache_limit", Integer.MAX_VALUE);

    /* renamed from: p */
    public static final C15726bl<Integer> f44486p = C15726bl.m35985a(1, "gads:video_exo_player_socket_receive_buffer_size", 0);

    /* renamed from: q */
    public static final C15726bl<Integer> f44487q = C15726bl.m35985a(1, "gads:video_stream_cache:limit_count", 5);

    /* renamed from: r */
    public static final C15726bl<Integer> f44488r = C15726bl.m35985a(1, "gads:video_stream_cache:limit_space", 8388608);

    /* renamed from: s */
    public static final C15726bl<Integer> f44489s = C15726bl.m35985a(1, "gads:video_stream_exo_cache:buffer_size", 8388608);

    /* renamed from: t */
    public static final C15726bl<Long> f44490t = C15726bl.m35986a(1, "gads:video_stream_cache:limit_time_sec", 300);

    /* renamed from: u */
    public static final C15726bl<Long> f44491u = C15726bl.m35986a(1, "gads:video_stream_cache:notify_interval_millis", 125);

    /* renamed from: v */
    public static final C15726bl<Integer> f44492v = C15726bl.m35985a(1, "gads:video_stream_cache:connect_timeout_millis", 10000);

    /* renamed from: w */
    public static final C15726bl<Boolean> f44493w = C15726bl.m35987a(0, "gads:video:metric_reporting_enabled", Boolean.valueOf(false));

    /* renamed from: x */
    public static final C15726bl<String> f44494x = C15726bl.m35988a(1, "gads:video:metric_frame_hash_times", "");

    /* renamed from: y */
    public static final C15726bl<Long> f44495y = C15726bl.m35986a(1, "gads:video:metric_frame_hash_time_leniency", 500);

    /* renamed from: z */
    public static final C15726bl<Boolean> f44496z = C15726bl.m35987a(1, "gads:video:force_watermark", Boolean.valueOf(false));

    /* renamed from: a */
    public static void m36941a(Context context) {
        aek.m32731a(context, new C15741by(context));
        int intValue = ((Integer) caf.m37099d().mo30717a(f44380dH)).intValue();
        if (intValue > 0 && f44449eX == null) {
            f44449eX = new byte[intValue];
        }
    }

    /* renamed from: a */
    public static List<String> m36940a() {
        return caf.m37098c().mo30649a();
    }

    /* renamed from: b */
    public static List<String> m36942b() {
        return caf.m37098c().mo30651b();
    }
}
