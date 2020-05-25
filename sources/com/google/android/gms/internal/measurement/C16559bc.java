package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.p1034a.C15209e;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;

/* renamed from: com.google.android.gms.internal.measurement.bc */
public final class C16559bc {

    /* renamed from: A */
    public static C16560bd<Long> f46503A = C16560bd.m39513a("analytics.service_client.idle_disconnect_millis", 10000, 10000);

    /* renamed from: B */
    public static C16560bd<Long> f46504B = C16560bd.m39513a("analytics.service_client.connect_timeout_millis", 5000, 5000);

    /* renamed from: C */
    public static C16560bd<Long> f46505C = C16560bd.m39513a("analytics.service_client.reconnect_throttle_millis", 1800000, 1800000);

    /* renamed from: D */
    public static C16560bd<Long> f46506D = C16560bd.m39513a("analytics.monitoring.sample_period_millis", (long) FbUploadTokenTime.group0, (long) FbUploadTokenTime.group0);

    /* renamed from: E */
    public static C16560bd<Long> f46507E = C16560bd.m39513a("analytics.initialization_warning_threshold", 5000, 5000);

    /* renamed from: F */
    public static C16560bd<Boolean> f46508F = C16560bd.m39515a("analytics.gcm_task_service", false, false);

    /* renamed from: G */
    private static C16560bd<Boolean> f46509G = C16560bd.m39515a("analytics.service_enabled", false, false);

    /* renamed from: H */
    private static C16560bd<Long> f46510H = C16560bd.m39513a("analytics.max_tokens", 60, 60);

    /* renamed from: I */
    private static C16560bd<Float> f46511I = new C16560bd<>(new C15209e("analytics.tokens_per_sec", Float.valueOf(0.5f)), Float.valueOf(0.5f));

    /* renamed from: J */
    private static C16560bd<Integer> f46512J = C16560bd.m39512a("analytics.max_stored_hits_per_app", 2000, 2000);

    /* renamed from: K */
    private static C16560bd<Long> f46513K = C16560bd.m39513a("analytics.min_local_dispatch_millis", 120000, 120000);

    /* renamed from: L */
    private static C16560bd<Long> f46514L = C16560bd.m39513a("analytics.max_local_dispatch_millis", 7200000, 7200000);

    /* renamed from: M */
    private static C16560bd<Integer> f46515M = C16560bd.m39512a("analytics.max_hits_per_request.k", 20, 20);

    /* renamed from: N */
    private static C16560bd<Long> f46516N = C16560bd.m39513a("analytics.service_monitor_interval", (long) FbUploadTokenTime.group0, (long) FbUploadTokenTime.group0);

    /* renamed from: O */
    private static C16560bd<String> f46517O;

    /* renamed from: P */
    private static C16560bd<Integer> f46518P = C16560bd.m39512a("analytics.first_party_experiment_variant", 0, 0);

    /* renamed from: Q */
    private static C16560bd<Long> f46519Q = C16560bd.m39513a("analytics.service_client.second_connect_delay_millis", 5000, 5000);

    /* renamed from: R */
    private static C16560bd<Long> f46520R = C16560bd.m39513a("analytics.service_client.unexpected_reconnect_millis", 60000, 60000);

    /* renamed from: a */
    public static C16560bd<Boolean> f46521a = C16560bd.m39515a("analytics.service_client_enabled", true, true);

    /* renamed from: b */
    public static C16560bd<String> f46522b = C16560bd.m39514a("analytics.log_tag", "GAv4", "GAv4-SVC");

    /* renamed from: c */
    public static C16560bd<Integer> f46523c = C16560bd.m39512a("analytics.max_stored_hits", 2000, 20000);

    /* renamed from: d */
    public static C16560bd<Integer> f46524d = C16560bd.m39512a("analytics.max_stored_properties_per_app", 100, 100);

    /* renamed from: e */
    public static C16560bd<Long> f46525e = C16560bd.m39513a("analytics.local_dispatch_millis", 1800000, 120000);

    /* renamed from: f */
    public static C16560bd<Long> f46526f = C16560bd.m39513a("analytics.initial_local_dispatch_millis", 5000, 5000);

    /* renamed from: g */
    public static C16560bd<Long> f46527g = C16560bd.m39513a("analytics.dispatch_alarm_millis", 7200000, 7200000);

    /* renamed from: h */
    public static C16560bd<Long> f46528h = C16560bd.m39513a("analytics.max_dispatch_alarm_millis", 32400000, 32400000);

    /* renamed from: i */
    public static C16560bd<Integer> f46529i = C16560bd.m39512a("analytics.max_hits_per_dispatch", 20, 20);

    /* renamed from: j */
    public static C16560bd<Integer> f46530j = C16560bd.m39512a("analytics.max_hits_per_batch", 20, 20);

    /* renamed from: k */
    public static C16560bd<String> f46531k;

    /* renamed from: l */
    public static C16560bd<String> f46532l;

    /* renamed from: m */
    public static C16560bd<String> f46533m;

    /* renamed from: n */
    public static C16560bd<String> f46534n;

    /* renamed from: o */
    public static C16560bd<Integer> f46535o = C16560bd.m39512a("analytics.max_get_length", 2036, 2036);

    /* renamed from: p */
    public static C16560bd<String> f46536p = C16560bd.m39514a("analytics.batching_strategy.k", C16541al.BATCH_BY_COUNT.name(), C16541al.BATCH_BY_COUNT.name());

    /* renamed from: q */
    public static C16560bd<String> f46537q;

    /* renamed from: r */
    public static C16560bd<Integer> f46538r = C16560bd.m39512a("analytics.max_hit_length.k", (int) VideoCacheReadBuffersizeExperiment.DEFAULT, (int) VideoCacheReadBuffersizeExperiment.DEFAULT);

    /* renamed from: s */
    public static C16560bd<Integer> f46539s = C16560bd.m39512a("analytics.max_post_length.k", (int) VideoCacheReadBuffersizeExperiment.DEFAULT, (int) VideoCacheReadBuffersizeExperiment.DEFAULT);

    /* renamed from: t */
    public static C16560bd<Integer> f46540t = C16560bd.m39512a("analytics.max_batch_post_length", (int) VideoCacheReadBuffersizeExperiment.DEFAULT, (int) VideoCacheReadBuffersizeExperiment.DEFAULT);

    /* renamed from: u */
    public static C16560bd<String> f46541u;

    /* renamed from: v */
    public static C16560bd<Integer> f46542v = C16560bd.m39512a("analytics.batch_retry_interval.seconds.k", 3600, 3600);

    /* renamed from: w */
    public static C16560bd<Integer> f46543w = C16560bd.m39512a("analytics.http_connection.connect_timeout_millis", 60000, 60000);

    /* renamed from: x */
    public static C16560bd<Integer> f46544x = C16560bd.m39512a("analytics.http_connection.read_timeout_millis", 61000, 61000);

    /* renamed from: y */
    public static C16560bd<Long> f46545y = C16560bd.m39513a("analytics.campaigns.time_limit", (long) FbUploadTokenTime.group0, (long) FbUploadTokenTime.group0);

    /* renamed from: z */
    public static C16560bd<Boolean> f46546z = C16560bd.m39515a("analytics.test.disable_receiver", false, false);

    static {
        String str = "http://www.google-analytics.com";
        f46531k = C16560bd.m39514a("analytics.insecure_host", str, str);
        String str2 = "https://ssl.google-analytics.com";
        f46532l = C16560bd.m39514a("analytics.secure_host", str2, str2);
        String str3 = "/collect";
        f46533m = C16560bd.m39514a("analytics.simple_endpoint", str3, str3);
        String str4 = "/batch";
        f46534n = C16560bd.m39514a("analytics.batching_endpoint", str4, str4);
        String name = C16546aq.GZIP.name();
        f46537q = C16560bd.m39514a("analytics.compression_strategy.k", name, name);
        String str5 = "404,502";
        f46541u = C16560bd.m39514a("analytics.fallback_responses.k", str5, str5);
        String str6 = "";
        f46517O = C16560bd.m39514a("analytics.first_party_experiment_id", str6, str6);
    }
}
