package com.p683ss.android.ugc.aweme.share;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p829r.C12661b;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45469z;
import com.p683ss.android.ugc.aweme.utils.C47723bk;
import java.io.File;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52727e;

/* renamed from: com.ss.android.ugc.aweme.share.ak */
public final class C41967ak {

    /* renamed from: a */
    public static int f106220a = 500;

    /* renamed from: b */
    public static final C41968a f106221b = new C41968a(null);

    /* renamed from: com.ss.android.ugc.aweme.share.ak$a */
    public static final class C41968a {

        /* renamed from: com.ss.android.ugc.aweme.share.ak$a$a */
        static final class C41969a<V> implements Callable<TResult> {

            /* renamed from: a */
            final /* synthetic */ String f106222a;

            /* renamed from: b */
            final /* synthetic */ Long f106223b;

            /* renamed from: c */
            final /* synthetic */ long f106224c;

            /* renamed from: d */
            final /* synthetic */ String f106225d;

            /* renamed from: e */
            final /* synthetic */ Boolean f106226e;

            /* renamed from: f */
            final /* synthetic */ UrlModel f106227f;

            /* renamed from: g */
            final /* synthetic */ boolean f106228g;

            /* renamed from: h */
            final /* synthetic */ String f106229h;

            /* renamed from: i */
            final /* synthetic */ Integer f106230i;

            /* renamed from: j */
            final /* synthetic */ boolean f106231j;

            C41969a(String str, Long l, long j, String str2, Boolean bool, UrlModel urlModel, boolean z, String str3, Integer num, boolean z2) {
                this.f106222a = str;
                this.f106223b = l;
                this.f106224c = j;
                this.f106225d = str2;
                this.f106226e = bool;
                this.f106227f = urlModel;
                this.f106228g = z;
                this.f106229h = str3;
                this.f106230i = num;
                this.f106231j = z2;
            }

            /* JADX WARNING: Removed duplicated region for block: B:20:0x00d7  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x00dd  */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x00ee  */
            /* JADX WARNING: Removed duplicated region for block: B:25:0x011d  */
            /* JADX WARNING: Removed duplicated region for block: B:35:0x01cd  */
            /* JADX WARNING: Removed duplicated region for block: B:36:0x01fc  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ java.lang.Object call() {
                /*
                    r11 = this;
                    java.lang.String r0 = r11.f106222a
                    r1 = 1
                    r2 = 0
                    r3 = 0
                    if (r0 == 0) goto L_0x0131
                    java.lang.String r0 = r11.f106222a
                    java.lang.String r0 = com.p683ss.android.ugc.aweme.utils.C47723bk.m103316d(r0)
                    java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                    java.lang.String r4 = "20"
                    java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                    boolean r0 = android.text.TextUtils.equals(r0, r4)
                    com.ss.android.ugc.aweme.app.f.c r4 = new com.ss.android.ugc.aweme.app.f.c
                    r4.<init>()
                    java.lang.String r5 = "download_rate"
                    java.lang.Long r6 = r11.f106223b
                    r7 = 0
                    if (r6 == 0) goto L_0x003c
                    java.lang.Long r6 = r11.f106223b
                    if (r6 != 0) goto L_0x0029
                    goto L_0x0032
                L_0x0029:
                    long r9 = r6.longValue()
                    int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                    if (r6 != 0) goto L_0x0032
                    goto L_0x003c
                L_0x0032:
                    long r6 = r11.f106224c
                    java.lang.Long r8 = r11.f106223b
                    long r8 = r8.longValue()
                    long r7 = r6 / r8
                L_0x003c:
                    java.lang.Long r6 = java.lang.Long.valueOf(r7)
                    com.ss.android.ugc.aweme.app.f.c r4 = r4.mo47823a(r5, r6)
                    java.lang.String r5 = "download_duration"
                    java.lang.Long r6 = r11.f106223b
                    com.ss.android.ugc.aweme.app.f.c r4 = r4.mo47823a(r5, r6)
                    java.lang.String r5 = "file_size"
                    long r6 = r11.f106224c
                    java.lang.Long r6 = java.lang.Long.valueOf(r6)
                    com.ss.android.ugc.aweme.app.f.c r4 = r4.mo47823a(r5, r6)
                    java.lang.String r5 = "errorDesc"
                    java.lang.String r6 = "null"
                    com.ss.android.ugc.aweme.app.f.c r4 = r4.mo47824a(r5, r6)
                    java.lang.String r5 = "errorCode"
                    java.lang.String r6 = "null"
                    com.ss.android.ugc.aweme.app.f.c r4 = r4.mo47824a(r5, r6)
                    java.lang.String r5 = "url"
                    java.lang.String r6 = r11.f106225d
                    com.ss.android.ugc.aweme.app.f.c r4 = r4.mo47824a(r5, r6)
                    java.lang.String r5 = "needWaterMark"
                    java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
                    com.ss.android.ugc.aweme.app.f.c r4 = r4.mo47819a(r5, r6)
                    java.lang.String r5 = "muteAudio"
                    java.lang.Boolean r6 = r11.f106226e
                    com.ss.android.ugc.aweme.app.f.c r4 = r4.mo47819a(r5, r6)
                    java.lang.String r5 = "fileMagic"
                    java.lang.String r6 = r11.f106222a
                    java.lang.String r6 = com.p683ss.android.ugc.aweme.utils.C47723bk.m103316d(r6)
                    com.ss.android.ugc.aweme.app.f.c r4 = r4.mo47824a(r5, r6)
                    java.lang.String r5 = "isMp4"
                    java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
                    com.ss.android.ugc.aweme.app.f.c r4 = r4.mo47819a(r5, r6)
                    java.lang.String r5 = "urlNums"
                    com.ss.android.ugc.aweme.base.model.UrlModel r6 = r11.f106227f
                    if (r6 == 0) goto L_0x00ad
                    java.util.List r6 = r6.getUrlList()
                    if (r6 == 0) goto L_0x00ad
                    int r6 = r6.size()
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                    goto L_0x00ae
                L_0x00ad:
                    r6 = r2
                L_0x00ae:
                    com.ss.android.ugc.aweme.app.f.c r4 = r4.mo47822a(r5, r6)
                    java.lang.String r5 = "isPrivateAweme"
                    boolean r6 = r11.f106228g
                    java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                    com.ss.android.ugc.aweme.app.f.c r4 = r4.mo47819a(r5, r6)
                    long r5 = r11.f106224c
                    r7 = 1500(0x5dc, double:7.41E-321)
                    int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                    if (r9 >= 0) goto L_0x00e4
                    if (r0 != 0) goto L_0x00e4
                    java.lang.String r0 = r11.f106222a
                    java.lang.String r0 = com.p683ss.android.ugc.aweme.share.C41967ak.C41968a.m91938a(r0)
                    r5 = r0
                    java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                    boolean r5 = android.text.TextUtils.isEmpty(r5)
                    if (r5 != 0) goto L_0x00dd
                    java.lang.String r5 = "errorFileContent"
                    r4.mo47824a(r5, r0)
                    goto L_0x00e4
                L_0x00dd:
                    java.lang.String r0 = "errorFileContent"
                    java.lang.String r5 = "file is null"
                    r4.mo47824a(r0, r5)
                L_0x00e4:
                    android.content.Context r0 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                    com.bytedance.r.b r0 = com.bytedance.p829r.C12661b.m25446a(r0)
                    if (r0 == 0) goto L_0x011d
                    java.lang.String r5 = "has_remove_sd"
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                    r4.mo47819a(r5, r1)
                    java.lang.String r1 = "sd_state"
                    boolean r5 = r0.mo23793a()
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    r4.mo47819a(r1, r5)
                    java.lang.String r1 = "sd_available_size"
                    long r5 = r0.f33258b
                    java.lang.Long r0 = java.lang.Long.valueOf(r5)
                    r4.mo47823a(r1, r0)
                    java.lang.String r0 = "share_dir"
                    android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                    java.lang.String r1 = com.p683ss.android.ugc.aweme.shortvideo.util.C45469z.m99075a(r1)
                    r4.mo47824a(r0, r1)
                    goto L_0x0126
                L_0x011d:
                    java.lang.String r0 = "has_remove_sd"
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
                    r4.mo47819a(r0, r1)
                L_0x0126:
                    java.lang.String r0 = "save_video_success_rate"
                    org.json.JSONObject r1 = r4.mo47825b()
                    com.p683ss.android.ugc.aweme.app.C23131p.m57776a(r0, r3, r1)
                    goto L_0x020e
                L_0x0131:
                    com.ss.android.ugc.aweme.app.f.c r0 = new com.ss.android.ugc.aweme.app.f.c
                    r0.<init>()
                    java.lang.String r4 = "download_rate"
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
                    com.ss.android.ugc.aweme.app.f.c r0 = r0.mo47822a(r4, r5)
                    java.lang.String r4 = "download_duration"
                    java.lang.Long r5 = r11.f106223b
                    com.ss.android.ugc.aweme.app.f.c r0 = r0.mo47823a(r4, r5)
                    java.lang.String r4 = "file_size"
                    r5 = -1
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                    com.ss.android.ugc.aweme.app.f.c r0 = r0.mo47822a(r4, r5)
                    java.lang.String r4 = "errorDesc"
                    java.lang.String r5 = r11.f106229h
                    com.ss.android.ugc.aweme.app.f.c r0 = r0.mo47824a(r4, r5)
                    java.lang.String r4 = "errorCode"
                    java.lang.Integer r5 = r11.f106230i
                    com.ss.android.ugc.aweme.app.f.c r0 = r0.mo47822a(r4, r5)
                    java.lang.String r4 = "url"
                    java.lang.String r5 = r11.f106225d
                    com.ss.android.ugc.aweme.app.f.c r0 = r0.mo47824a(r4, r5)
                    java.lang.String r4 = "needWaterMark"
                    boolean r5 = r11.f106231j
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    com.ss.android.ugc.aweme.app.f.c r0 = r0.mo47819a(r4, r5)
                    java.lang.String r4 = "fileMagic"
                    java.lang.String r5 = "download_error"
                    com.ss.android.ugc.aweme.app.f.c r0 = r0.mo47824a(r4, r5)
                    java.lang.String r4 = "muteAudio"
                    java.lang.Boolean r5 = r11.f106226e
                    com.ss.android.ugc.aweme.app.f.c r0 = r0.mo47819a(r4, r5)
                    java.lang.String r4 = "strategy_enabled"
                    boolean r5 = com.bytedance.p829r.C12662c.m25456a()
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    com.ss.android.ugc.aweme.app.f.c r0 = r0.mo47819a(r4, r5)
                    java.lang.String r4 = "isMp4"
                    java.lang.String r5 = "notSure"
                    com.ss.android.ugc.aweme.app.f.c r0 = r0.mo47824a(r4, r5)
                    java.lang.String r4 = "urlNums"
                    com.ss.android.ugc.aweme.base.model.UrlModel r5 = r11.f106227f
                    if (r5 == 0) goto L_0x01b2
                    java.util.List r5 = r5.getUrlList()
                    if (r5 == 0) goto L_0x01b2
                    int r5 = r5.size()
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                    goto L_0x01b3
                L_0x01b2:
                    r5 = r2
                L_0x01b3:
                    com.ss.android.ugc.aweme.app.f.c r0 = r0.mo47822a(r4, r5)
                    java.lang.String r4 = "isPrivateAweme"
                    boolean r5 = r11.f106228g
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    com.ss.android.ugc.aweme.app.f.c r0 = r0.mo47819a(r4, r5)
                    android.content.Context r4 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                    com.bytedance.r.b r4 = com.bytedance.p829r.C12661b.m25446a(r4)
                    if (r4 == 0) goto L_0x01fc
                    java.lang.String r3 = "has_remove_sd"
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
                    r0.mo47819a(r3, r5)
                    java.lang.String r3 = "sd_state"
                    boolean r5 = r4.mo23793a()
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    r0.mo47819a(r3, r5)
                    java.lang.String r3 = "sd_available_size"
                    long r4 = r4.f33258b
                    java.lang.Long r4 = java.lang.Long.valueOf(r4)
                    r0.mo47823a(r3, r4)
                    java.lang.String r3 = "share_dir"
                    android.content.Context r4 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                    java.lang.String r4 = com.p683ss.android.ugc.aweme.shortvideo.util.C45469z.m99075a(r4)
                    r0.mo47824a(r3, r4)
                    goto L_0x0205
                L_0x01fc:
                    java.lang.String r4 = "has_remove_sd"
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                    r0.mo47819a(r4, r3)
                L_0x0205:
                    java.lang.String r3 = "save_video_success_rate"
                    org.json.JSONObject r0 = r0.mo47825b()
                    com.p683ss.android.ugc.aweme.app.C23131p.m57776a(r3, r1, r0)
                L_0x020e:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.share.C41967ak.C41968a.C41969a.call():java.lang.Object");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.ak$a$b */
        public static final class C41970b<V> implements Callable<TResult> {

            /* renamed from: a */
            final /* synthetic */ String f106232a;

            /* renamed from: b */
            final /* synthetic */ Long f106233b;

            /* renamed from: c */
            final /* synthetic */ Integer f106234c;

            /* renamed from: d */
            final /* synthetic */ String f106235d;

            /* renamed from: e */
            final /* synthetic */ boolean f106236e;

            public C41970b(String str, Long l, Integer num, String str2, boolean z) {
                this.f106232a = str;
                this.f106233b = l;
                this.f106234c = num;
                this.f106235d = str2;
                this.f106236e = z;
            }

            public final /* synthetic */ Object call() {
                String d = C47723bk.m103316d(this.f106232a);
                long length = new File(this.f106232a).length();
                boolean equals = TextUtils.equals(d, "20");
                C23088c cVar = new C23088c();
                String str = "download_rate";
                long j = 0;
                if (this.f106233b != null) {
                    Long l = this.f106233b;
                    if (l == null || l.longValue() != 0) {
                        j = length / this.f106233b.longValue();
                    }
                }
                C23088c a = cVar.mo47823a(str, Long.valueOf(j)).mo47823a("download_duration", this.f106233b).mo47823a("file_size", Long.valueOf(length)).mo47824a("errorDesc", TEVideoRecorder.FACE_BEAUTY_NULL).mo47822a("errorCode", this.f106234c).mo47824a("url", this.f106235d).mo47819a("muteAudio", Boolean.valueOf(true)).mo47819a("needWaterMark", Boolean.valueOf(this.f106236e)).mo47824a("fileMagic", C47723bk.m103316d(this.f106232a)).mo47819a("isMp4", Boolean.valueOf(equals));
                C12661b a2 = C12661b.m25446a(C11010c.m22280a());
                if (a2 != null) {
                    a.mo47819a("has_remove_sd", Boolean.valueOf(true));
                    a.mo47819a("sd_state", Boolean.valueOf(a2.mo23793a()));
                    a.mo47823a("sd_available_size", Long.valueOf(a2.f33258b));
                    a.mo47824a("share_dir", C45469z.m99075a(C11010c.m22280a()));
                } else {
                    a.mo47819a("has_remove_sd", Boolean.valueOf(false));
                }
                C23131p.m57776a("save_video_success_rate", 3, a.mo47825b());
                return null;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.ak$a$c */
        static final class C41971c<V> implements Callable<TResult> {

            /* renamed from: a */
            final /* synthetic */ Integer f106237a;

            C41971c(Integer num) {
                this.f106237a = num;
            }

            public final /* synthetic */ Object call() {
                C23088c a = new C23088c().mo47824a("form", "publish").mo47822a("errorCode", this.f106237a).mo47819a("muteAudio", Boolean.valueOf(true));
                C12661b a2 = C12661b.m25446a(C11010c.m22280a());
                if (a2 != null) {
                    a.mo47819a("has_remove_sd", Boolean.valueOf(true));
                    a.mo47819a("sd_state", Boolean.valueOf(a2.mo23793a()));
                    a.mo47823a("sd_available_size", Long.valueOf(a2.f33258b));
                    a.mo47824a("share_dir", C45469z.m99075a(C11010c.m22280a()));
                } else {
                    a.mo47819a("has_remove_sd", Boolean.valueOf(false));
                }
                C23131p.m57776a("save_video_success_rate", 3, a.mo47825b());
                return null;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.ak$a$d */
        static final class C41972d<V> implements Callable<TResult> {

            /* renamed from: a */
            final /* synthetic */ String f106238a;

            /* renamed from: b */
            final /* synthetic */ String f106239b;

            /* renamed from: c */
            final /* synthetic */ C52727e f106240c;

            /* renamed from: d */
            final /* synthetic */ C52727e f106241d;

            /* renamed from: e */
            final /* synthetic */ String f106242e;

            /* renamed from: f */
            final /* synthetic */ String f106243f;

            /* renamed from: g */
            final /* synthetic */ int f106244g;

            C41972d(String str, String str2, C52727e eVar, C52727e eVar2, String str3, String str4, int i) {
                this.f106238a = str;
                this.f106239b = str2;
                this.f106240c = eVar;
                this.f106241d = eVar2;
                this.f106242e = str3;
                this.f106243f = str4;
                this.f106244g = i;
            }

            public final /* synthetic */ Object call() {
                C26890h.m65011a("watermark_share_download", new C23089d().mo47829a("group_id", this.f106238a).mo47829a("enter_from", this.f106239b).mo47829a("action_type", (String) this.f106240c.element).mo47829a("platform", (String) this.f106241d.element).mo47829a("is_long", this.f106242e).mo47829a("logo_name", this.f106243f).mo47826a("watermark_type", this.f106244g).f61491a);
                return null;
            }
        }

        private C41968a() {
        }

        public /* synthetic */ C41968a(C52707g gVar) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
            if (r4 != null) goto L_0x0033;
         */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x003f A[SYNTHETIC, Splitter:B:14:0x003f] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.String m91938a(java.lang.String r4) {
            /*
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 0
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0043, all -> 0x003b }
                r2.<init>(r4)     // Catch:{ Throwable -> 0x0043, all -> 0x003b }
                java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0043, all -> 0x003b }
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x0043, all -> 0x003b }
                java.io.InputStream r2 = (java.io.InputStream) r2     // Catch:{ Throwable -> 0x0043, all -> 0x003b }
                r3.<init>(r2)     // Catch:{ Throwable -> 0x0043, all -> 0x003b }
                java.io.Reader r3 = (java.io.Reader) r3     // Catch:{ Throwable -> 0x0043, all -> 0x003b }
                r4.<init>(r3)     // Catch:{ Throwable -> 0x0043, all -> 0x003b }
                java.lang.String r1 = r4.readLine()     // Catch:{ Throwable -> 0x0044, all -> 0x0039 }
                if (r1 == 0) goto L_0x0033
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0044, all -> 0x0039 }
                r2.<init>()     // Catch:{ Throwable -> 0x0044, all -> 0x0039 }
                r2.append(r1)     // Catch:{ Throwable -> 0x0044, all -> 0x0039 }
                java.lang.String r1 = "    "
                r2.append(r1)     // Catch:{ Throwable -> 0x0044, all -> 0x0039 }
                java.lang.String r1 = r2.toString()     // Catch:{ Throwable -> 0x0044, all -> 0x0039 }
                r0.append(r1)     // Catch:{ Throwable -> 0x0044, all -> 0x0039 }
            L_0x0033:
                r4.close()     // Catch:{ IOException -> 0x0037 }
                goto L_0x0047
            L_0x0037:
                goto L_0x0047
            L_0x0039:
                r0 = move-exception
                goto L_0x003d
            L_0x003b:
                r0 = move-exception
                r4 = r1
            L_0x003d:
                if (r4 == 0) goto L_0x0042
                r4.close()     // Catch:{ IOException -> 0x0042 }
            L_0x0042:
                throw r0
            L_0x0043:
                r4 = r1
            L_0x0044:
                if (r4 == 0) goto L_0x0047
                goto L_0x0033
            L_0x0047:
                int r4 = com.p683ss.android.ugc.aweme.share.C41967ak.f106220a
                java.lang.String r1 = r0.toString()
                int r1 = r1.length()
                if (r4 <= r1) goto L_0x005d
                java.lang.String r4 = r0.toString()
                int r4 = r4.length()
                com.p683ss.android.ugc.aweme.share.C41967ak.f106220a = r4
            L_0x005d:
                java.lang.String r4 = r0.toString()
                java.lang.String r0 = "sb.toString()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r0)
                int r0 = com.p683ss.android.ugc.aweme.share.C41967ak.f106220a
                if (r4 == 0) goto L_0x0075
                r1 = 0
                java.lang.String r4 = r4.substring(r1, r0)
                java.lang.String r0 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r0)
                return r4
            L_0x0075:
                d.u r4 = new d.u
                java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.share.C41967ak.C41968a.m91938a(java.lang.String):java.lang.String");
        }

        /* renamed from: a */
        public static void m91939a(String str, String str2, String str3, String str4, String str5, int i) {
            C52711k.m112240b(str4, "isLong");
            C52727e eVar = new C52727e();
            eVar.element = null;
            C52727e eVar2 = new C52727e();
            eVar2.element = str3;
            if (C52711k.m112239a((Object) "download", (Object) str3)) {
                eVar.element = "download";
                eVar2.element = null;
            } else {
                eVar.element = "share";
            }
            C41972d dVar = new C41972d(str, str2, eVar, eVar2, str4, str5, i);
            C0013i.m16a((Callable<TResult>) dVar);
        }
    }

    /* renamed from: a */
    public static final void m91936a(String str, String str2, String str3, String str4, String str5, int i) {
        C41968a.m91939a(str, str2, str3, str4, str5, i);
    }

    /* renamed from: a */
    public static final boolean m91937a(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        return aweme.isPrivate();
    }

    /* renamed from: a */
    public static final String m91934a(UrlModel urlModel) {
        String str = null;
        if (urlModel != null && urlModel.getUrlList() != null) {
            for (String parse : urlModel.getUrlList()) {
                Uri parse2 = Uri.parse(parse);
                C52711k.m112236a((Object) parse2, "Uri.parse(url)");
                if (!parse2.isOpaque()) {
                    str = parse2.getQueryParameter("logo_name");
                    if (!TextUtils.isEmpty(str)) {
                        break;
                    }
                }
            }
        }
        return str;
    }

    /* renamed from: a */
    public static final void m91935a(String str, long j, Long l, String str2, boolean z, Integer num, String str3, Boolean bool, UrlModel urlModel, boolean z2) {
        C41969a aVar = new C41969a(str, l, j, str2, bool, urlModel, z2, str3, num, z);
        C0013i.m16a((Callable<TResult>) aVar);
    }
}
