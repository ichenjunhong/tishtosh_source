package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.google.android.gms.common.C15369c;
import com.google.android.gms.common.C15384g;
import com.google.android.gms.internal.measurement.C16674fb;
import com.google.android.gms.internal.measurement.C16675fc;
import com.google.android.gms.internal.measurement.C16676fd;
import com.google.android.gms.internal.measurement.C16677fe;
import com.google.android.gms.internal.measurement.C16678ff;
import com.google.android.gms.internal.measurement.C16679fg;
import com.google.android.gms.internal.measurement.C16680fh;
import com.google.android.gms.internal.measurement.C16681fi;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.h */
public final class C17122h {

    /* renamed from: A */
    public static C17123a<Long> f48337A = C17123a.m41878a("measurement.upload.backoff_period", 43200000, 43200000);

    /* renamed from: B */
    public static C17123a<Long> f48338B = C17123a.m41878a("measurement.upload.window_interval", 3600000, 3600000);

    /* renamed from: C */
    public static C17123a<Long> f48339C = C17123a.m41878a("measurement.upload.interval", 3600000, 3600000);

    /* renamed from: D */
    public static C17123a<Long> f48340D = C17123a.m41878a("measurement.upload.realtime_upload_interval", 10000, 10000);

    /* renamed from: E */
    public static C17123a<Long> f48341E = C17123a.m41878a("measurement.upload.debug_upload_interval", 1000, 1000);

    /* renamed from: F */
    public static C17123a<Long> f48342F = C17123a.m41878a("measurement.upload.minimum_delay", 500, 500);

    /* renamed from: G */
    public static C17123a<Long> f48343G = C17123a.m41878a("measurement.alarm_manager.minimum_interval", 60000, 60000);

    /* renamed from: H */
    public static C17123a<Long> f48344H = C17123a.m41878a("measurement.upload.stale_data_deletion_interval", (long) FbUploadTokenTime.group0, (long) FbUploadTokenTime.group0);

    /* renamed from: I */
    public static C17123a<Long> f48345I = C17123a.m41878a("measurement.upload.refresh_blacklisted_config_interval", 604800000, 604800000);

    /* renamed from: J */
    public static C17123a<Long> f48346J = C17123a.m41878a("measurement.upload.initial_upload_delay_time", 15000, 15000);

    /* renamed from: K */
    public static C17123a<Long> f48347K = C17123a.m41878a("measurement.upload.retry_time", 1800000, 1800000);

    /* renamed from: L */
    public static C17123a<Integer> f48348L = C17123a.m41877a("measurement.upload.retry_count", 6, 6);

    /* renamed from: M */
    public static C17123a<Long> f48349M = C17123a.m41878a("measurement.upload.max_queue_time", 2419200000L, 2419200000L);

    /* renamed from: N */
    public static C17123a<Integer> f48350N = C17123a.m41877a("measurement.lifetimevalue.max_currency_tracked", 4, 4);

    /* renamed from: O */
    public static C17123a<Integer> f48351O = C17123a.m41877a("measurement.audience.filter_result_max_count", 200, 200);

    /* renamed from: P */
    public static C17123a<Long> f48352P = C17123a.m41878a("measurement.service_client.idle_disconnect_millis", 5000, 5000);

    /* renamed from: Q */
    public static C17123a<Boolean> f48353Q = C17123a.m41880a("measurement.test.boolean_flag", false, false);

    /* renamed from: R */
    public static C17123a<String> f48354R;

    /* renamed from: S */
    public static C17123a<Long> f48355S = C17123a.m41878a("measurement.test.long_flag", -1, -1);

    /* renamed from: T */
    public static C17123a<Integer> f48356T = C17123a.m41877a("measurement.test.int_flag", -2, -2);

    /* renamed from: U */
    public static C17123a<Double> f48357U;

    /* renamed from: V */
    public static C17123a<Integer> f48358V = C17123a.m41877a("measurement.experiment.max_ids", 50, 50);

    /* renamed from: W */
    public static C17123a<Boolean> f48359W = C17123a.m41880a("measurement.lifetimevalue.user_engagement_tracking_enabled", true, true);

    /* renamed from: X */
    public static C17123a<Boolean> f48360X = C17123a.m41880a("measurement.audience.complex_param_evaluation", true, true);

    /* renamed from: Y */
    public static C17123a<Boolean> f48361Y = C17123a.m41880a("measurement.validation.internal_limits_internal_event_params", false, false);

    /* renamed from: Z */
    public static C17123a<Boolean> f48362Z = C17123a.m41880a("measurement.quality.unsuccessful_update_retry_counter", true, true);

    /* renamed from: a */
    static C17108es f48363a;

    /* renamed from: aA */
    private static C17123a<Boolean> f48364aA = C17123a.m41880a("measurement.log_upgrades_enabled", false, false);

    /* renamed from: aa */
    public static C17123a<Boolean> f48365aa = C17123a.m41880a("measurement.iid.disable_on_collection_disabled", true, true);

    /* renamed from: ab */
    public static C17123a<Boolean> f48366ab = C17123a.m41880a("measurement.app_launch.call_only_when_enabled", true, true);

    /* renamed from: ac */
    public static C17123a<Boolean> f48367ac = C17123a.m41880a("measurement.run_on_worker_inline", true, false);

    /* renamed from: ad */
    public static C17123a<Boolean> f48368ad = C17123a.m41880a("measurement.audience.dynamic_filters", true, true);

    /* renamed from: ae */
    public static C17123a<Boolean> f48369ae = C17123a.m41880a("measurement.reset_analytics.persist_time", false, false);

    /* renamed from: af */
    public static C17123a<Boolean> f48370af = C17123a.m41880a("measurement.validation.value_and_currency_params", false, false);

    /* renamed from: ag */
    public static C17123a<Boolean> f48371ag = C17123a.m41880a("measurement.sampling.time_zone_offset_enabled", false, false);

    /* renamed from: ah */
    public static C17123a<Boolean> f48372ah = C17123a.m41880a("measurement.referrer.enable_logging_install_referrer_cmp_from_apk", false, false);

    /* renamed from: ai */
    public static C17123a<Boolean> f48373ai = C17123a.m41880a("measurement.fetch_config_with_admob_app_id", true, true);

    /* renamed from: aj */
    public static C17123a<Boolean> f48374aj = C17123a.m41880a("measurement.sessions.session_id_enabled", false, false);

    /* renamed from: ak */
    public static C17123a<Boolean> f48375ak = C17123a.m41880a("measurement.sessions.session_number_enabled", false, false);

    /* renamed from: al */
    public static C17123a<Boolean> f48376al = C17123a.m41880a("measurement.sessions.immediate_start_enabled", false, false);

    /* renamed from: am */
    public static C17123a<Boolean> f48377am = C17123a.m41880a("measurement.sessions.background_sessions_enabled", false, false);

    /* renamed from: an */
    public static C17123a<Boolean> f48378an = C17123a.m41880a("measurement.collection.firebase_global_collection_flag_enabled", true, true);

    /* renamed from: ao */
    public static C17123a<Boolean> f48379ao = C17123a.m41880a("measurement.collection.efficient_engagement_reporting_enabled", false, false);

    /* renamed from: ap */
    public static C17123a<Boolean> f48380ap = C17123a.m41880a("measurement.collection.redundant_engagement_removal_enabled", false, false);

    /* renamed from: aq */
    public static C17123a<Boolean> f48381aq = C17123a.m41880a("measurement.remove_app_instance_id_cache_enabled", true, true);

    /* renamed from: ar */
    public static C17123a<Boolean> f48382ar = C17123a.m41880a("measurement.collection.init_params_control_enabled", true, true);

    /* renamed from: as */
    public static C17123a<Boolean> f48383as = C17123a.m41880a("measurement.upload.disable_is_uploader", false, false);

    /* renamed from: at */
    public static C17123a<Boolean> f48384at = C17123a.m41880a("measurement.experiment.enable_experiment_reporting", false, false);

    /* renamed from: au */
    public static C17123a<Boolean> f48385au = C17123a.m41880a("measurement.collection.log_event_and_bundle_v2", true, true);

    /* renamed from: av */
    public static C17123a<Boolean> f48386av = C17123a.m41880a("measurement.collection.null_empty_event_name_fix", true, true);
    /* access modifiers changed from: private */

    /* renamed from: aw */
    public static final C16681fi f48387aw = new C16681fi(C16674fb.m39831a("com.google.android.gms.measurement"));

    /* renamed from: ax */
    private static Boolean f48388ax;

    /* renamed from: ay */
    private static C17123a<Boolean> f48389ay = C17123a.m41880a("measurement.log_third_party_store_events_enabled", false, false);

    /* renamed from: az */
    private static C17123a<Boolean> f48390az = C17123a.m41880a("measurement.log_installs_enabled", false, false);

    /* renamed from: b */
    static List<C17123a<Integer>> f48391b = new ArrayList();

    /* renamed from: c */
    static List<C17123a<Long>> f48392c = new ArrayList();

    /* renamed from: d */
    static List<C17123a<Boolean>> f48393d = new ArrayList();

    /* renamed from: e */
    static List<C17123a<String>> f48394e = new ArrayList();

    /* renamed from: f */
    static List<C17123a<Double>> f48395f = new ArrayList();

    /* renamed from: g */
    static volatile C17005ay f48396g;

    /* renamed from: h */
    public static C17123a<Boolean> f48397h = C17123a.m41880a("measurement.log_androidId_enabled", false, false);

    /* renamed from: i */
    public static C17123a<Boolean> f48398i = C17123a.m41880a("measurement.upload_dsid_enabled", false, false);

    /* renamed from: j */
    public static C17123a<String> f48399j = C17123a.m41879a("measurement.log_tag", "FA", "FA-SVC");

    /* renamed from: k */
    public static C17123a<Long> f48400k = C17123a.m41878a("measurement.ad_id_cache_time", 10000, 10000);

    /* renamed from: l */
    public static C17123a<Long> f48401l = C17123a.m41878a("measurement.monitoring.sample_period_millis", (long) FbUploadTokenTime.group0, (long) FbUploadTokenTime.group0);

    /* renamed from: m */
    public static C17123a<Long> f48402m = C17123a.m41878a("measurement.config.cache_time", (long) FbUploadTokenTime.group0, 3600000);

    /* renamed from: n */
    public static C17123a<String> f48403n;

    /* renamed from: o */
    public static C17123a<String> f48404o;

    /* renamed from: p */
    public static C17123a<Integer> f48405p = C17123a.m41877a("measurement.upload.max_bundles", 100, 100);

    /* renamed from: q */
    public static C17123a<Integer> f48406q = C17123a.m41877a("measurement.upload.max_batch_size", 65536, 65536);

    /* renamed from: r */
    public static C17123a<Integer> f48407r = C17123a.m41877a("measurement.upload.max_bundle_size", 65536, 65536);

    /* renamed from: s */
    public static C17123a<Integer> f48408s = C17123a.m41877a("measurement.upload.max_events_per_bundle", 1000, 1000);

    /* renamed from: t */
    public static C17123a<Integer> f48409t = C17123a.m41877a("measurement.upload.max_events_per_day", 100000, 100000);

    /* renamed from: u */
    public static C17123a<Integer> f48410u = C17123a.m41877a("measurement.upload.max_error_events_per_day", 1000, 1000);

    /* renamed from: v */
    public static C17123a<Integer> f48411v = C17123a.m41877a("measurement.upload.max_public_events_per_day", 50000, 50000);

    /* renamed from: w */
    public static C17123a<Integer> f48412w = C17123a.m41877a("measurement.upload.max_conversions_per_day", 500, 500);

    /* renamed from: x */
    public static C17123a<Integer> f48413x = C17123a.m41877a("measurement.upload.max_realtime_events_per_day", 10, 10);

    /* renamed from: y */
    public static C17123a<Integer> f48414y = C17123a.m41877a("measurement.store.max_stored_events_per_app", 100000, 100000);

    /* renamed from: z */
    public static C17123a<String> f48415z;

    /* renamed from: com.google.android.gms.measurement.internal.h$a */
    public static final class C17123a<V> {

        /* renamed from: a */
        public final String f48416a;

        /* renamed from: b */
        private C16675fc<V> f48417b;

        /* renamed from: c */
        private final V f48418c;

        /* renamed from: d */
        private final V f48419d;

        /* renamed from: e */
        private volatile V f48420e;

        C17123a(String str, V v, V v2) {
            this.f48416a = str;
            this.f48419d = v;
            this.f48418c = v2;
        }

        /* renamed from: a */
        static C17123a<Boolean> m41880a(String str, boolean z, boolean z2) {
            C17123a<Boolean> aVar = new C17123a<>(str, Boolean.valueOf(z), Boolean.valueOf(z2));
            C17122h.f48393d.add(aVar);
            return aVar;
        }

        /* renamed from: a */
        static C17123a<String> m41879a(String str, String str2, String str3) {
            C17123a<String> aVar = new C17123a<>(str, str2, str3);
            C17122h.f48394e.add(aVar);
            return aVar;
        }

        /* renamed from: a */
        static C17123a<Long> m41878a(String str, long j, long j2) {
            C17123a<Long> aVar = new C17123a<>(str, Long.valueOf(j), Long.valueOf(j2));
            C17122h.f48392c.add(aVar);
            return aVar;
        }

        /* renamed from: a */
        static C17123a<Integer> m41877a(String str, int i, int i2) {
            C17123a<Integer> aVar = new C17123a<>(str, Integer.valueOf(i), Integer.valueOf(i2));
            C17122h.f48391b.add(aVar);
            return aVar;
        }

        /* renamed from: a */
        static void m41881a() {
            synchronized (C17123a.class) {
                for (C17123a aVar : C17122h.f48393d) {
                    aVar.f48417b = new C16678ff(C17122h.f48387aw, aVar.f48416a, Boolean.valueOf(((Boolean) aVar.f48419d).booleanValue()));
                }
                for (C17123a aVar2 : C17122h.f48394e) {
                    aVar2.f48417b = new C16680fh(C17122h.f48387aw, aVar2.f48416a, (String) aVar2.f48419d);
                }
                for (C17123a aVar3 : C17122h.f48392c) {
                    aVar3.f48417b = new C16676fd(C17122h.f48387aw, aVar3.f48416a, Long.valueOf(((Long) aVar3.f48419d).longValue()));
                }
                for (C17123a aVar4 : C17122h.f48391b) {
                    aVar4.f48417b = new C16677fe(C17122h.f48387aw, aVar4.f48416a, Integer.valueOf(((Integer) aVar4.f48419d).intValue()));
                }
                for (C17123a aVar5 : C17122h.f48395f) {
                    aVar5.f48417b = new C16679fg(C17122h.f48387aw, aVar5.f48416a, Double.valueOf(((Double) aVar5.f48419d).doubleValue()));
                }
            }
        }

        /* renamed from: c */
        private static void m41882c() {
            synchronized (C17123a.class) {
                if (!C17108es.m41769a()) {
                    try {
                        for (C17123a aVar : C17122h.f48393d) {
                            aVar.f48420e = aVar.f48417b.mo31984b();
                        }
                        for (C17123a aVar2 : C17122h.f48394e) {
                            aVar2.f48420e = aVar2.f48417b.mo31984b();
                        }
                        for (C17123a aVar3 : C17122h.f48392c) {
                            aVar3.f48420e = aVar3.f48417b.mo31984b();
                        }
                        for (C17123a aVar4 : C17122h.f48391b) {
                            aVar4.f48420e = aVar4.f48417b.mo31984b();
                        }
                        for (C17123a aVar5 : C17122h.f48395f) {
                            aVar5.f48420e = aVar5.f48417b.mo31984b();
                        }
                    } catch (SecurityException e) {
                        C17122h.m41876a(e);
                    }
                } else {
                    throw new IllegalStateException("Tried to refresh flag cache on main thread or on package side.");
                }
            }
        }

        /* renamed from: b */
        public final V mo33351b() {
            if (C17122h.f48363a == null) {
                return this.f48419d;
            }
            if (C17108es.m41769a()) {
                return this.f48420e == null ? this.f48419d : this.f48420e;
            }
            m41882c();
            try {
                return this.f48417b.mo31984b();
            } catch (SecurityException e) {
                C17122h.m41876a(e);
                return this.f48417b.f46913c;
            }
        }

        /* renamed from: a */
        public final V mo33350a(V v) {
            if (v != null) {
                return v;
            }
            if (C17122h.f48363a == null) {
                return this.f48419d;
            }
            if (C17108es.m41769a()) {
                return this.f48420e == null ? this.f48419d : this.f48420e;
            }
            m41882c();
            try {
                return this.f48417b.mo31984b();
            } catch (SecurityException e) {
                C17122h.m41876a(e);
                return this.f48417b.f46913c;
            }
        }
    }

    /* renamed from: a */
    static void m41876a(Exception exc) {
        if (f48396g != null) {
            Context m = f48396g.mo32850m();
            if (f48388ax == null) {
                f48388ax = Boolean.valueOf(C15369c.getInstance().isGooglePlayServicesAvailable(m, C15384g.f39685b) == 0);
            }
            if (f48388ax.booleanValue()) {
                f48396g.mo32854q().f48445b.mo33377a("Got Exception on PhenotypeFlag.get on Play device", exc);
            }
        }
    }

    static {
        String str = WebKitApi.SCHEME_HTTPS;
        f48403n = C17123a.m41879a("measurement.config.url_scheme", str, str);
        String str2 = "app-measurement.com";
        f48404o = C17123a.m41879a("measurement.config.url_authority", str2, str2);
        String str3 = "https://app-measurement.com/a";
        f48415z = C17123a.m41879a("measurement.upload.url", str3, str3);
        String str4 = "---";
        f48354R = C17123a.m41879a("measurement.test.string_flag", str4, str4);
        C17123a<Double> aVar = new C17123a<>("measurement.test.double_flag", Double.valueOf(-3.0d), Double.valueOf(-3.0d));
        f48395f.add(aVar);
        f48357U = aVar;
    }
}
