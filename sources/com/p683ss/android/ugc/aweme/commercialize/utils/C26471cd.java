package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.util.Base64;
import com.bytedance.ies.C10174a;
import com.bytedance.p879t.C13232b;
import com.bytedance.p879t.C13240c;
import com.bytedance.p879t.p880a.C13230a;
import com.bytedance.p879t.p880a.C13231b;
import com.bytedance.p879t.p881b.C13233a;
import com.bytedance.p879t.p881b.C13234b;
import com.bytedance.p879t.p881b.C13235c;
import com.bytedance.p879t.p881b.C13236d;
import com.bytedance.p879t.p881b.C13237e;
import com.bytedance.p879t.p881b.C13238f;
import com.bytedance.p879t.p881b.C13239g;
import com.bytedance.retrofit2.p830a.C12685b;
import com.p683ss.android.http.p1169a.C19170a;
import com.p683ss.android.http.p1169a.p1170a.C19174b;
import com.p683ss.android.http.p1169a.p1172b.C19176a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.commercialize.log.C26057av;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import com.p683ss.android.ugc.aweme.commercialize.log.C26081f;
import com.p683ss.android.ugc.aweme.commercialize.log.RawURLGetter;
import com.p683ss.android.ugc.aweme.commercialize.log.RawURLGetter.C26027a;
import com.p683ss.android.ugc.aweme.commercialize.model.C26146y;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.model.BitRate;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.C52857u;
import p2628d.p2629a.C52550ab;
import p2628d.p2629a.C52575l;
import p2628d.p2638e.C52647c;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2649l.C52785g;
import p2628d.p2649l.C52786h;
import p2628d.p2650m.C52808d;
import p2628d.p2650m.C52812g;
import p2628d.p2650m.C52815j;
import p2628d.p2650m.C52820l;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cd */
public final class C26471cd {

    /* renamed from: a */
    public static final C26471cd f69762a = new C26471cd();

    /* renamed from: b */
    private static final C52820l f69763b = new C52820l("(\\d+)%");

    /* renamed from: c */
    private static final C52820l f69764c = new C52820l("(\\d{2}):(\\d{2}):(\\d{2})");

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cd$a */
    static final class C26472a implements C13232b {

        /* renamed from: a */
        public static final C26472a f69765a = new C26472a();

        private C26472a() {
        }

        /* renamed from: a */
        public final Document mo24821a(String str) throws C13230a, C13231b {
            boolean z;
            Iterable<C19170a> iterable;
            Closeable byteArrayInputStream;
            Throwable th;
            if (str != null) {
                try {
                    String a = RawURLGetter.m63083a("other");
                    if (a.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        iterable = null;
                    } else {
                        iterable = C52575l.m112101c(new C19176a("User-Agent", a));
                    }
                    ArrayList arrayList = new ArrayList();
                    if (iterable != null) {
                        for (C19170a aVar : iterable) {
                            arrayList.add(new C12685b(aVar.mo39116a(), aVar.mo39117b()));
                        }
                    }
                    String str2 = (String) RawURLGetter.f68768b.mo53488a().doGet(str, arrayList).get();
                    if (str2 == null) {
                        C52711k.m112234a();
                    }
                    try {
                        Charset charset = C52808d.f131043a;
                        if (str2 != null) {
                            byte[] bytes = str2.getBytes(charset);
                            C52711k.m112236a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                            byteArrayInputStream = new ByteArrayInputStream(bytes);
                            Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse((ByteArrayInputStream) byteArrayInputStream);
                            C52711k.m112236a((Object) parse, "DocumentBuilderFactory.n…cumentBuilder().parse(it)");
                            C52647c.m112189a(byteArrayInputStream, null);
                            C52711k.m112236a((Object) parse, "content.byteInputStream(…rse(it)\n                }");
                            return parse;
                        }
                        throw new C52857u("null cannot be cast to non-null type java.lang.String");
                    } catch (Throwable th2) {
                        throw new C13231b(th2);
                    }
                } catch (Exception e) {
                    throw new C13230a(str, e);
                }
            } else {
                throw new NullPointerException("url is null");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cd$aa */
    public static final class C26473aa extends C52712l implements C52671b<C13237e, Boolean> {

        /* renamed from: a */
        final /* synthetic */ long f69766a;

        /* renamed from: b */
        final /* synthetic */ long f69767b;

        /* renamed from: c */
        final /* synthetic */ long f69768c;

        public C26473aa(long j, long j2, long j3) {
            this.f69766a = j;
            this.f69767b = j2;
            this.f69768c = j3;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            C13237e eVar = (C13237e) obj;
            CharSequence charSequence = eVar.offset;
            boolean z2 = false;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !(!C52711k.m112239a((Object) eVar.name, (Object) "progress"))) {
                long j = this.f69766a;
                String str = eVar.offset;
                C52711k.m112236a((Object) str, "it.offset");
                long a = C26471cd.m64005a(j, str);
                long j2 = this.f69767b;
                if (this.f69768c + 1 <= a && j2 >= a) {
                    z2 = true;
                }
            }
            return Boolean.valueOf(z2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cd$ab */
    static final class C26474ab implements C26057av {

        /* renamed from: a */
        final /* synthetic */ String f69769a;

        /* renamed from: b */
        final /* synthetic */ Aweme f69770b;

        C26474ab(String str, Aweme aweme) {
            this.f69769a = str;
            this.f69770b = aweme;
        }

        /* renamed from: a */
        public final void mo52818a(String str, String str2, long j) {
            C26471cd.m64009a(C26471cd.f69762a, str, str2, j, this.f69769a, this.f69770b, null, 32, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cd$b */
    static final class C26475b implements C13240c {

        /* renamed from: a */
        public final Aweme f69771a;

        /* renamed from: b */
        private final long f69772b = C26471cd.m64004a();

        /* renamed from: c */
        private long f69773c;

        /* renamed from: d */
        private int f69774d;

        /* renamed from: e */
        private final C26425bj f69775e = new C26425bj();

        /* renamed from: f */
        private final C26425bj f69776f = new C26425bj();

        /* renamed from: a */
        public final void mo24830a() {
            C26077e.m63190a().mo53590b(this.f69771a).mo53582a("draw_ad").mo53593b("get_inline").mo53581a((Object) C52550ab.m112050a(C52856t.m112465a("duration", Long.valueOf(C26471cd.m64004a() - this.f69773c)), C52856t.m112465a("wrapper_count", Integer.valueOf(this.f69774d - 1)))).mo53597c();
        }

        /* renamed from: a */
        public final void mo24831a(int i) {
            this.f69774d--;
        }

        public C26475b(Aweme aweme) {
            C52711k.m112240b(aweme, "aweme");
            this.f69771a = aweme;
        }

        /* renamed from: a */
        public final void mo24834a(String str) {
            if (this.f69775e.mo54141a()) {
                C26077e.m63190a().mo53590b(this.f69771a).mo53582a("draw_ad").mo53593b("show_fail").mo53581a((Object) C52550ab.m112042a(C52856t.m112465a("error_message", "vast_wrapper_count_unmatch"))).mo53597c();
            }
        }

        /* renamed from: a */
        public final void mo24832a(C13230a aVar) {
            String str = null;
            if (aVar.getCause() instanceof C19174b) {
                C26080b b = C26077e.m63190a().mo53590b(this.f69771a).mo53582a("draw_ad").mo53593b("show_fail");
                C52847n[] nVarArr = new C52847n[2];
                nVarArr[0] = C52856t.m112465a("error_message", "vast_mediafile_bad_response");
                String str2 = "error_detail";
                Throwable cause = aVar.getCause();
                if (cause != null) {
                    str = cause.getMessage();
                }
                nVarArr[1] = C52856t.m112465a(str2, str);
                b.mo53581a((Object) C52550ab.m112050a(nVarArr)).mo53597c();
                return;
            }
            C26080b b2 = C26077e.m63190a().mo53590b(this.f69771a).mo53582a("draw_ad").mo53593b("show_fail");
            C52847n[] nVarArr2 = new C52847n[2];
            nVarArr2[0] = C52856t.m112465a("error_message", "vast_filtered_others");
            String str3 = "error_detail";
            Throwable cause2 = aVar.getCause();
            if (cause2 != null) {
                str = cause2.getMessage();
            }
            nVarArr2[1] = C52856t.m112465a(str3, str);
            b2.mo53581a((Object) C52550ab.m112050a(nVarArr2)).mo53597c();
        }

        /* renamed from: a */
        public final void mo24833a(C13231b bVar) {
            String str;
            C26080b b = C26077e.m63190a().mo53590b(this.f69771a).mo53582a("draw_ad").mo53593b("show_fail");
            C52847n[] nVarArr = new C52847n[2];
            nVarArr[0] = C52856t.m112465a("error_message", "vast_xml_format_error");
            String str2 = "error_detail";
            Throwable cause = bVar.getCause();
            if (cause != null) {
                str = cause.getMessage();
            } else {
                str = null;
            }
            nVarArr[1] = C52856t.m112465a(str2, str);
            b.mo53581a((Object) C52550ab.m112050a(nVarArr)).mo53597c();
        }

        /* renamed from: b */
        public final void mo24836b(String str, int i) {
            this.f69774d++;
            this.f69773c = C26471cd.m64004a();
        }

        /* renamed from: a */
        public final void mo24835a(String str, int i) {
            this.f69774d++;
            this.f69773c = C26471cd.m64004a();
            if (this.f69776f.mo54141a()) {
                C26077e.m63190a().mo53590b(this.f69771a).mo53582a("draw_ad").mo53593b("query_wrapper").mo53581a((Object) C52550ab.m112042a(C52856t.m112465a("duration", Long.valueOf(C26471cd.m64004a() - this.f69772b)))).mo53597c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cd$c */
    public static final class C26476c extends C52712l implements C52671b<C13234b, C52785g<? extends C13239g>> {
        public C26476c() {
            super(1);
        }

        public final C52785g<C13239g> invoke(C13234b bVar) {
            C52785g<C13239g> gVar;
            if (bVar != null) {
                List<C13239g> list = bVar.clickList;
                if (list != null) {
                    gVar = C52575l.m112148k(list);
                } else {
                    gVar = null;
                }
                if (gVar != null) {
                    return gVar;
                }
            }
            return C52786h.m112334a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cd$d */
    public static final class C26477d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f69777a;

        /* renamed from: b */
        final /* synthetic */ Aweme f69778b;

        /* renamed from: c */
        final /* synthetic */ long f69779c;

        /* renamed from: d */
        final /* synthetic */ C26146y f69780d;

        /* renamed from: e */
        final /* synthetic */ int f69781e;

        public C26477d(Runnable runnable, Aweme aweme, long j, C26146y yVar, int i) {
            this.f69777a = runnable;
            this.f69778b = aweme;
            this.f69779c = j;
            this.f69780d = yVar;
            this.f69781e = i;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x006a */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0075 A[DONT_GENERATE] */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0079 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r7 = this;
                com.ss.android.ugc.aweme.commercialize.log.e$b r0 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()     // Catch:{ all -> 0x007a }
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f69778b     // Catch:{ all -> 0x007a }
                com.ss.android.ugc.aweme.commercialize.log.e$b r0 = r0.mo53590b(r1)     // Catch:{ all -> 0x007a }
                java.lang.String r1 = "draw_ad"
                com.ss.android.ugc.aweme.commercialize.log.e$b r0 = r0.mo53582a(r1)     // Catch:{ all -> 0x007a }
                java.lang.String r1 = "parse_vast"
                com.ss.android.ugc.aweme.commercialize.log.e$b r0 = r0.mo53593b(r1)     // Catch:{ all -> 0x007a }
                java.lang.String r1 = "duration"
                long r2 = com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.m64004a()     // Catch:{ all -> 0x007a }
                long r4 = r7.f69779c     // Catch:{ all -> 0x007a }
                r6 = 0
                long r2 = r2 - r4
                java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x007a }
                d.n r1 = p2628d.C52856t.m112465a(r1, r2)     // Catch:{ all -> 0x007a }
                java.util.Map r1 = p2628d.p2629a.C52550ab.m112042a(r1)     // Catch:{ all -> 0x007a }
                com.ss.android.ugc.aweme.commercialize.log.e$b r0 = r0.mo53581a(r1)     // Catch:{ all -> 0x007a }
                r0.mo53597c()     // Catch:{ all -> 0x007a }
                com.ss.android.ugc.aweme.commercialize.model.y r0 = r7.f69780d     // Catch:{ all -> 0x007a }
                r1 = 1
                r0.loaded = r1     // Catch:{ all -> 0x007a }
                com.ss.android.ugc.aweme.commercialize.model.y r0 = r7.f69780d     // Catch:{ all -> 0x007a }
                com.bytedance.t.b.f r2 = new com.bytedance.t.b.f     // Catch:{ all -> 0x007a }
                r2.<init>()     // Catch:{ all -> 0x007a }
                r0.vast = r2     // Catch:{ all -> 0x007a }
                com.ss.android.ugc.aweme.commercialize.model.y r0 = r7.f69780d     // Catch:{ all -> 0x007a }
                java.lang.String r0 = r0.vastUrl     // Catch:{ all -> 0x007a }
                r2 = r0
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ all -> 0x007a }
                if (r2 == 0) goto L_0x0052
                int r2 = r2.length()     // Catch:{ all -> 0x007a }
                if (r2 != 0) goto L_0x0051
                goto L_0x0052
            L_0x0051:
                r1 = 0
            L_0x0052:
                if (r1 != 0) goto L_0x006a
                com.ss.android.ugc.aweme.commercialize.model.y r1 = r7.f69780d     // Catch:{ Exception -> 0x006a }
                com.bytedance.t.b.f r1 = r1.vast     // Catch:{ Exception -> 0x006a }
                int r2 = r7.f69781e     // Catch:{ Exception -> 0x006a }
                com.ss.android.ugc.aweme.commercialize.utils.cd$a r3 = com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.C26472a.f69765a     // Catch:{ Exception -> 0x006a }
                com.bytedance.t.b r3 = (com.bytedance.p879t.C13232b) r3     // Catch:{ Exception -> 0x006a }
                com.ss.android.ugc.aweme.commercialize.utils.cd$b r4 = new com.ss.android.ugc.aweme.commercialize.utils.cd$b     // Catch:{ Exception -> 0x006a }
                com.ss.android.ugc.aweme.feed.model.Aweme r5 = r7.f69778b     // Catch:{ Exception -> 0x006a }
                r4.<init>(r5)     // Catch:{ Exception -> 0x006a }
                com.bytedance.t.c r4 = (com.bytedance.p879t.C13240c) r4     // Catch:{ Exception -> 0x006a }
                r1.parseUri(r0, r2, r3, r4)     // Catch:{ Exception -> 0x006a }
            L_0x006a:
                com.ss.android.ugc.aweme.commercialize.utils.cd r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.f69762a     // Catch:{ all -> 0x007a }
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f69778b     // Catch:{ all -> 0x007a }
                r0.mo54183a(r1)     // Catch:{ all -> 0x007a }
                java.lang.Runnable r0 = r7.f69777a
                if (r0 == 0) goto L_0x0079
                r0.run()
                return
            L_0x0079:
                return
            L_0x007a:
                r0 = move-exception
                java.lang.Runnable r1 = r7.f69777a
                if (r1 == 0) goto L_0x0082
                r1.run()
            L_0x0082:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.C26477d.run():void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cd$e */
    public static final class C26478e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f69782a;

        /* renamed from: b */
        final /* synthetic */ Aweme f69783b;

        /* renamed from: c */
        final /* synthetic */ long f69784c;

        /* renamed from: d */
        final /* synthetic */ C13238f f69785d;

        /* renamed from: e */
        final /* synthetic */ C26146y f69786e;

        /* renamed from: f */
        final /* synthetic */ int f69787f;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cd$e$a */
        static final class C26479a extends C52712l implements C52671b<C13236d, BitRate> {

            /* renamed from: a */
            final /* synthetic */ double f69788a;

            C26479a(double d) {
                this.f69788a = d;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return C26471cd.m64006a((C13236d) obj, this.f69788a);
            }
        }

        public C26478e(Runnable runnable, Aweme aweme, long j, C13238f fVar, C26146y yVar, int i) {
            this.f69782a = runnable;
            this.f69783b = aweme;
            this.f69784c = j;
            this.f69785d = fVar;
            this.f69786e = yVar;
            this.f69787f = i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
            r5 = java.lang.Boolean.valueOf(false);
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x015b */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x0188 A[Catch:{ all -> 0x02a0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:108:0x0189 A[Catch:{ all -> 0x02a0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x018c A[Catch:{ all -> 0x02a0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x018f A[Catch:{ all -> 0x02a0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x019b A[Catch:{ all -> 0x02a0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x01a2 A[Catch:{ all -> 0x02a0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x01af A[Catch:{ all -> 0x02a0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x01cf A[Catch:{ all -> 0x02a0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:130:0x01db A[Catch:{ all -> 0x02a0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0061 A[Catch:{ all -> 0x02a0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:140:0x029b A[DONT_GENERATE] */
        /* JADX WARNING: Removed duplicated region for block: B:142:0x029f A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0089 A[Catch:{ all -> 0x02a0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x008a A[Catch:{ all -> 0x02a0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x008d A[Catch:{ all -> 0x02a0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00a0 A[Catch:{ all -> 0x02a0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00ac A[Catch:{ all -> 0x02a0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00ad A[Catch:{ all -> 0x02a0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00b0 A[Catch:{ all -> 0x02a0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00c5 A[Catch:{ all -> 0x02a0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x00e4 A[Catch:{ all -> 0x02a0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x00e5 A[Catch:{ all -> 0x02a0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x00e8 A[Catch:{ all -> 0x02a0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x00ff A[Catch:{ all -> 0x02a0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x016a A[Catch:{ all -> 0x02a0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x0177 A[Catch:{ all -> 0x02a0 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r8 = this;
                com.ss.android.ugc.aweme.commercialize.log.e$b r0 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.f69783b     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.commercialize.log.e$b r0 = r0.mo53590b(r1)     // Catch:{ all -> 0x02a0 }
                java.lang.String r1 = "draw_ad"
                com.ss.android.ugc.aweme.commercialize.log.e$b r0 = r0.mo53582a(r1)     // Catch:{ all -> 0x02a0 }
                java.lang.String r1 = "parse_vast"
                com.ss.android.ugc.aweme.commercialize.log.e$b r0 = r0.mo53593b(r1)     // Catch:{ all -> 0x02a0 }
                java.lang.String r1 = "duration"
                long r2 = com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.m64004a()     // Catch:{ all -> 0x02a0 }
                long r4 = r8.f69784c     // Catch:{ all -> 0x02a0 }
                r6 = 0
                long r2 = r2 - r4
                java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x02a0 }
                d.n r1 = p2628d.C52856t.m112465a(r1, r2)     // Catch:{ all -> 0x02a0 }
                java.util.Map r1 = p2628d.p2629a.C52550ab.m112042a(r1)     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.commercialize.log.e$b r0 = r0.mo53581a(r1)     // Catch:{ all -> 0x02a0 }
                r0.mo53597c()     // Catch:{ all -> 0x02a0 }
                com.bytedance.t.b.f r0 = r8.f69785d     // Catch:{ Exception -> 0x0296 }
                com.ss.android.ugc.aweme.commercialize.model.y r1 = r8.f69786e     // Catch:{ Exception -> 0x0296 }
                java.lang.String r1 = r1.vastContent     // Catch:{ Exception -> 0x0296 }
                int r2 = r8.f69787f     // Catch:{ Exception -> 0x0296 }
                com.ss.android.ugc.aweme.commercialize.utils.cd$a r3 = com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.C26472a.f69765a     // Catch:{ Exception -> 0x0296 }
                com.bytedance.t.b r3 = (com.bytedance.p879t.C13232b) r3     // Catch:{ Exception -> 0x0296 }
                com.ss.android.ugc.aweme.commercialize.utils.cd$b r4 = new com.ss.android.ugc.aweme.commercialize.utils.cd$b     // Catch:{ Exception -> 0x0296 }
                com.ss.android.ugc.aweme.feed.model.Aweme r5 = r8.f69783b     // Catch:{ Exception -> 0x0296 }
                r4.<init>(r5)     // Catch:{ Exception -> 0x0296 }
                com.bytedance.t.c r4 = (com.bytedance.p879t.C13240c) r4     // Catch:{ Exception -> 0x0296 }
                r0.parseContent(r1, r2, r3, r4)     // Catch:{ Exception -> 0x0296 }
                com.bytedance.t.b.f r0 = r8.f69785d     // Catch:{ all -> 0x02a0 }
                java.lang.String r0 = r0.adTitle     // Catch:{ all -> 0x02a0 }
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ all -> 0x02a0 }
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x005e
                int r0 = r0.length()     // Catch:{ all -> 0x02a0 }
                if (r0 != 0) goto L_0x005c
                goto L_0x005e
            L_0x005c:
                r0 = 0
                goto L_0x005f
            L_0x005e:
                r0 = 1
            L_0x005f:
                if (r0 != 0) goto L_0x0297
                com.ss.android.ugc.aweme.commercialize.model.y r0 = r8.f69786e     // Catch:{ all -> 0x02a0 }
                com.bytedance.t.b.f r3 = r8.f69785d     // Catch:{ all -> 0x02a0 }
                r0.vast = r3     // Catch:{ all -> 0x02a0 }
                com.bytedance.t.b.f r0 = r8.f69785d     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r8.f69783b     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.profile.model.User r3 = r3.getAuthor()     // Catch:{ all -> 0x02a0 }
                r4 = 0
                if (r3 == 0) goto L_0x0077
                java.lang.String r3 = r3.getNickname()     // Catch:{ all -> 0x02a0 }
                goto L_0x0078
            L_0x0077:
                r3 = r4
            L_0x0078:
                r5 = r3
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ all -> 0x02a0 }
                if (r5 == 0) goto L_0x0086
                boolean r5 = p2628d.p2650m.C52830p.m112402a(r5)     // Catch:{ all -> 0x02a0 }
                if (r5 == 0) goto L_0x0084
                goto L_0x0086
            L_0x0084:
                r5 = 0
                goto L_0x0087
            L_0x0086:
                r5 = 1
            L_0x0087:
                if (r5 != 0) goto L_0x008a
                goto L_0x008b
            L_0x008a:
                r3 = r4
            L_0x008b:
                if (r3 != 0) goto L_0x0091
                com.bytedance.t.b.f r3 = r8.f69785d     // Catch:{ all -> 0x02a0 }
                java.lang.String r3 = r3.adTitle     // Catch:{ all -> 0x02a0 }
            L_0x0091:
                r0.adTitle = r3     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f69783b     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r8.f69783b     // Catch:{ all -> 0x02a0 }
                java.lang.String r3 = r3.getDesc()     // Catch:{ all -> 0x02a0 }
                r5 = r3
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ all -> 0x02a0 }
                if (r5 == 0) goto L_0x00a9
                boolean r5 = p2628d.p2650m.C52830p.m112402a(r5)     // Catch:{ all -> 0x02a0 }
                if (r5 == 0) goto L_0x00a7
                goto L_0x00a9
            L_0x00a7:
                r5 = 0
                goto L_0x00aa
            L_0x00a9:
                r5 = 1
            L_0x00aa:
                if (r5 != 0) goto L_0x00ad
                goto L_0x00ae
            L_0x00ad:
                r3 = r4
            L_0x00ae:
                if (r3 != 0) goto L_0x00ba
                com.ss.android.ugc.aweme.commercialize.model.y r3 = r8.f69786e     // Catch:{ all -> 0x02a0 }
                com.bytedance.t.b.f r3 = r3.vast     // Catch:{ all -> 0x02a0 }
                java.lang.String r3 = r3.description     // Catch:{ all -> 0x02a0 }
                if (r3 != 0) goto L_0x00ba
                java.lang.String r3 = ""
            L_0x00ba:
                r0.setDesc(r3)     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f69783b     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()     // Catch:{ all -> 0x02a0 }
                if (r0 == 0) goto L_0x00f9
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r8.f69783b     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()     // Catch:{ all -> 0x02a0 }
                if (r3 == 0) goto L_0x00d2
                java.lang.String r3 = r3.getWebUrl()     // Catch:{ all -> 0x02a0 }
                goto L_0x00d3
            L_0x00d2:
                r3 = r4
            L_0x00d3:
                r5 = r3
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ all -> 0x02a0 }
                if (r5 == 0) goto L_0x00e1
                boolean r5 = p2628d.p2650m.C52830p.m112402a(r5)     // Catch:{ all -> 0x02a0 }
                if (r5 == 0) goto L_0x00df
                goto L_0x00e1
            L_0x00df:
                r5 = 0
                goto L_0x00e2
            L_0x00e1:
                r5 = 1
            L_0x00e2:
                if (r5 != 0) goto L_0x00e5
                goto L_0x00e6
            L_0x00e5:
                r3 = r4
            L_0x00e6:
                if (r3 != 0) goto L_0x00f6
                com.ss.android.ugc.aweme.commercialize.utils.cd r3 = com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.f69762a     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.feed.model.Aweme r5 = r8.f69783b     // Catch:{ all -> 0x02a0 }
                com.bytedance.t.b.g r3 = r3.mo54184h(r5)     // Catch:{ all -> 0x02a0 }
                if (r3 == 0) goto L_0x00f5
                java.lang.String r3 = r3.clickThrough     // Catch:{ all -> 0x02a0 }
                goto L_0x00f6
            L_0x00f5:
                r3 = r4
            L_0x00f6:
                r0.setWebUrl(r3)     // Catch:{ all -> 0x02a0 }
            L_0x00f9:
                com.bytedance.t.b.f r0 = r8.f69785d     // Catch:{ all -> 0x02a0 }
                java.util.List<com.bytedance.t.b.b> r0 = r0.creativeList     // Catch:{ all -> 0x02a0 }
                if (r0 == 0) goto L_0x0297
                java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x02a0 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x02a0 }
            L_0x0105:
                boolean r3 = r0.hasNext()     // Catch:{ all -> 0x02a0 }
                if (r3 == 0) goto L_0x011e
                java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x02a0 }
                r5 = r3
                com.bytedance.t.b.b r5 = (com.bytedance.p879t.p881b.C13234b) r5     // Catch:{ all -> 0x02a0 }
                if (r5 == 0) goto L_0x011a
                boolean r5 = r5.byWrapper     // Catch:{ all -> 0x02a0 }
                if (r5 != 0) goto L_0x011a
                r5 = 1
                goto L_0x011b
            L_0x011a:
                r5 = 0
            L_0x011b:
                if (r5 == 0) goto L_0x0105
                goto L_0x011f
            L_0x011e:
                r3 = r4
            L_0x011f:
                com.bytedance.t.b.b r3 = (com.bytedance.p879t.p881b.C13234b) r3     // Catch:{ all -> 0x02a0 }
                if (r3 != 0) goto L_0x0125
                goto L_0x0297
            L_0x0125:
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f69783b     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()     // Catch:{ all -> 0x02a0 }
                if (r0 == 0) goto L_0x014c
                com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getAvatarThumb()     // Catch:{ all -> 0x02a0 }
                if (r0 == 0) goto L_0x014c
                java.util.List r0 = r0.getUrlList()     // Catch:{ all -> 0x02a0 }
                if (r0 == 0) goto L_0x014c
                java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x02a0 }
                d.l.g r0 = p2628d.p2629a.C52575l.m112148k(r0)     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.commercialize.utils.cd$f r5 = com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.C26480f.f69789a     // Catch:{ all -> 0x02a0 }
                d.f.a.b r5 = (p2628d.p2639f.p2640a.C52671b) r5     // Catch:{ all -> 0x02a0 }
                d.l.g r0 = p2628d.p2649l.C52786h.m112345b(r0, r5)     // Catch:{ all -> 0x02a0 }
                java.util.HashSet r0 = p2628d.p2649l.C52786h.m112352f(r0)     // Catch:{ all -> 0x02a0 }
                goto L_0x014d
            L_0x014c:
                r0 = r4
            L_0x014d:
                com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r5 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ Throwable -> 0x015b }
                java.lang.String r6 = "SettingsReader.get()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)     // Catch:{ Throwable -> 0x015b }
                java.lang.Boolean r5 = r5.getDisallowVastHasAuthor()     // Catch:{ Throwable -> 0x015b }
                goto L_0x015f
            L_0x015b:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x02a0 }
            L_0x015f:
                java.lang.String r6 = "disallowVastHasAuthor"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)     // Catch:{ all -> 0x02a0 }
                boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x02a0 }
                if (r5 == 0) goto L_0x016f
                com.ss.android.ugc.aweme.feed.model.Aweme r5 = r8.f69783b     // Catch:{ all -> 0x02a0 }
                r5.setAuthor(r4)     // Catch:{ all -> 0x02a0 }
            L_0x016f:
                com.ss.android.ugc.aweme.feed.model.Aweme r5 = r8.f69783b     // Catch:{ all -> 0x02a0 }
                com.bytedance.t.b.c r5 = com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc.m64003d(r5)     // Catch:{ all -> 0x02a0 }
                if (r5 == 0) goto L_0x0193
                r6 = r0
                java.util.Collection r6 = (java.util.Collection) r6     // Catch:{ all -> 0x02a0 }
                if (r6 == 0) goto L_0x0185
                boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x02a0 }
                if (r6 == 0) goto L_0x0183
                goto L_0x0185
            L_0x0183:
                r6 = 0
                goto L_0x0186
            L_0x0185:
                r6 = 1
            L_0x0186:
                if (r6 != 0) goto L_0x0189
                goto L_0x018a
            L_0x0189:
                r0 = r4
            L_0x018a:
                if (r0 == 0) goto L_0x018f
                java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x02a0 }
                goto L_0x0191
            L_0x018f:
                java.util.Set<java.lang.String> r0 = r5.staticResource     // Catch:{ all -> 0x02a0 }
            L_0x0191:
                r5.staticResource = r0     // Catch:{ all -> 0x02a0 }
            L_0x0193:
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f69783b     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.commercialize.model.y r5 = r8.f69786e     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.commercialize.model.v r5 = r5.adChoiceIcon     // Catch:{ all -> 0x02a0 }
                if (r5 == 0) goto L_0x01a2
                java.lang.String r6 = "AdChoices"
                com.bytedance.t.b.c r5 = r5.toIcon(r6)     // Catch:{ all -> 0x02a0 }
                goto L_0x01a3
            L_0x01a2:
                r5 = r4
            L_0x01a3:
                com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.m64007a(r3, r0, r5)     // Catch:{ all -> 0x02a0 }
                long r5 = r3.getDurationInMs()     // Catch:{ all -> 0x02a0 }
                double r5 = (double) r5     // Catch:{ all -> 0x02a0 }
                java.util.List<com.bytedance.t.b.d> r0 = r3.mediaFileList     // Catch:{ all -> 0x02a0 }
                if (r0 == 0) goto L_0x01ca
                java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x02a0 }
                d.l.g r0 = p2628d.p2629a.C52575l.m112148k(r0)     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.commercialize.utils.cd$e$a r7 = new com.ss.android.ugc.aweme.commercialize.utils.cd$e$a     // Catch:{ all -> 0x02a0 }
                r7.<init>(r5)     // Catch:{ all -> 0x02a0 }
                d.f.a.b r7 = (p2628d.p2639f.p2640a.C52671b) r7     // Catch:{ all -> 0x02a0 }
                d.l.g r0 = p2628d.p2649l.C52786h.m112348d(r0, r7)     // Catch:{ all -> 0x02a0 }
                d.l.g r0 = p2628d.p2649l.C52786h.m112350e(r0)     // Catch:{ all -> 0x02a0 }
                if (r0 == 0) goto L_0x01ca
                java.util.List r4 = p2628d.p2649l.C52786h.m112353g(r0)     // Catch:{ all -> 0x02a0 }
            L_0x01ca:
                r0 = r4
                java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x02a0 }
                if (r0 == 0) goto L_0x01d8
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x02a0 }
                if (r0 == 0) goto L_0x01d6
                goto L_0x01d8
            L_0x01d6:
                r0 = 0
                goto L_0x01d9
            L_0x01d8:
                r0 = 1
            L_0x01d9:
                if (r0 != 0) goto L_0x0297
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f69783b     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()     // Catch:{ all -> 0x02a0 }
                if (r0 != 0) goto L_0x01ed
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f69783b     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.feed.model.Video r5 = new com.ss.android.ugc.aweme.feed.model.Video     // Catch:{ all -> 0x02a0 }
                r5.<init>()     // Catch:{ all -> 0x02a0 }
                r0.setVideo(r5)     // Catch:{ all -> 0x02a0 }
            L_0x01ed:
                java.lang.Object r0 = r4.get(r2)     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.feed.model.BitRate r0 = (com.p683ss.android.ugc.aweme.feed.model.BitRate) r0     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getPlayAddr()     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r8.f69783b     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.feed.model.Video r2 = r2.getVideo()     // Catch:{ all -> 0x02a0 }
                java.lang.String r5 = "aweme.video"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)     // Catch:{ all -> 0x02a0 }
                java.lang.String r5 = "url"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r5)     // Catch:{ all -> 0x02a0 }
                int r5 = r0.getWidth()     // Catch:{ all -> 0x02a0 }
                r2.setWidth(r5)     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r8.f69783b     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.feed.model.Video r2 = r2.getVideo()     // Catch:{ all -> 0x02a0 }
                java.lang.String r5 = "aweme.video"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)     // Catch:{ all -> 0x02a0 }
                int r5 = r0.getHeight()     // Catch:{ all -> 0x02a0 }
                r2.setHeight(r5)     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r8.f69783b     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.feed.model.Video r2 = r2.getVideo()     // Catch:{ all -> 0x02a0 }
                java.lang.String r5 = "aweme.video"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.feed.model.VideoUrlModel r5 = new com.ss.android.ugc.aweme.feed.model.VideoUrlModel     // Catch:{ all -> 0x02a0 }
                r5.<init>()     // Catch:{ all -> 0x02a0 }
                int r6 = r0.getWidth()     // Catch:{ all -> 0x02a0 }
                r5.setWidth(r6)     // Catch:{ all -> 0x02a0 }
                int r6 = r0.getHeight()     // Catch:{ all -> 0x02a0 }
                r5.setHeight(r6)     // Catch:{ all -> 0x02a0 }
                java.lang.String r6 = r0.getUri()     // Catch:{ all -> 0x02a0 }
                r5.setUri(r6)     // Catch:{ all -> 0x02a0 }
                java.lang.String r6 = r0.getUrlKey()     // Catch:{ all -> 0x02a0 }
                r5.setUrlKey(r6)     // Catch:{ all -> 0x02a0 }
                java.util.List r0 = r0.getUrlList()     // Catch:{ all -> 0x02a0 }
                r5.setUrlList(r0)     // Catch:{ all -> 0x02a0 }
                long r6 = r3.getDurationInMs()     // Catch:{ all -> 0x02a0 }
                double r6 = (double) r6     // Catch:{ all -> 0x02a0 }
                r5.setDuration(r6)     // Catch:{ all -> 0x02a0 }
                r2.setPlayAddr(r5)     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r0 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ all -> 0x02a0 }
                java.lang.String r2 = "SettingsReader.get()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)     // Catch:{ all -> 0x02a0 }
                java.lang.Boolean r0 = r0.getDisableVastBitrate()     // Catch:{ all -> 0x02a0 }
                boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x02a0 }
                if (r0 != 0) goto L_0x027f
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f69783b     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()     // Catch:{ all -> 0x02a0 }
                java.lang.String r2 = "aweme.video"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)     // Catch:{ all -> 0x02a0 }
                r0.setBitRate(r4)     // Catch:{ all -> 0x02a0 }
            L_0x027f:
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f69783b     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.commercialize.model.y r2 = r8.f69786e     // Catch:{ all -> 0x02a0 }
                com.bytedance.t.b.f r2 = r2.vast     // Catch:{ all -> 0x02a0 }
                java.lang.String r2 = r2.adTitle     // Catch:{ all -> 0x02a0 }
                r0.setTitle(r2)     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.commercialize.model.y r0 = r8.f69786e     // Catch:{ all -> 0x02a0 }
                r0.loaded = r1     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.commercialize.utils.cd r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.f69762a     // Catch:{ all -> 0x02a0 }
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.f69783b     // Catch:{ all -> 0x02a0 }
                r0.mo54183a(r1)     // Catch:{ all -> 0x02a0 }
                goto L_0x0297
            L_0x0296:
            L_0x0297:
                java.lang.Runnable r0 = r8.f69782a
                if (r0 == 0) goto L_0x029f
                r0.run()
                return
            L_0x029f:
                return
            L_0x02a0:
                r0 = move-exception
                java.lang.Runnable r1 = r8.f69782a
                if (r1 == 0) goto L_0x02a8
                r1.run()
            L_0x02a8:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.C26478e.run():void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cd$f */
    static final class C26480f extends C52712l implements C52671b<String, Boolean> {

        /* renamed from: a */
        public static final C26480f f69789a = new C26480f();

        C26480f() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            CharSequence charSequence = (String) obj;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cd$g */
    static final class C26481g extends C52712l implements C52671b<C13236d, BitRate> {

        /* renamed from: a */
        final /* synthetic */ double f69790a;

        C26481g(double d) {
            this.f69790a = d;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return C26471cd.m64006a((C13236d) obj, this.f69790a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cd$h */
    static final class C26482h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Aweme f69791a;

        /* renamed from: b */
        final /* synthetic */ Runnable f69792b;

        C26482h(Aweme aweme, Runnable runnable) {
            this.f69791a = aweme;
            this.f69792b = runnable;
        }

        public final void run() {
            Aweme aweme = this.f69791a;
            if (aweme != null) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null) {
                    C26146y omVast = awemeRawAd.getOmVast();
                    if (omVast != null) {
                        omVast.loading = false;
                    }
                }
            }
            Runnable runnable = this.f69792b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cd$i */
    static final class C26483i extends C52712l implements C52671b<C13234b, C52785g<? extends C13239g>> {

        /* renamed from: a */
        public static final C26483i f69793a = new C26483i();

        C26483i() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C13234b bVar = (C13234b) obj;
            C52711k.m112240b(bVar, "it");
            List<C13239g> list = bVar.clickList;
            if (list != null) {
                return C52575l.m112148k(list);
            }
            return C52786h.m112334a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cd$j */
    static final class C26484j extends C52712l implements C52671b<C13239g, String> {

        /* renamed from: a */
        public static final C26484j f69794a = new C26484j();

        C26484j() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            C13239g gVar = (C13239g) obj;
            if (gVar != null) {
                return gVar.clickThrough;
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cd$k */
    static final class C26485k extends C52712l implements C52671b<C13239g, C52785g<? extends String>> {

        /* renamed from: a */
        public static final C26485k f69795a = new C26485k();

        C26485k() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C13239g gVar = (C13239g) obj;
            C52711k.m112240b(gVar, "it");
            Set<String> set = gVar.clickTracking;
            if (set != null) {
                return C52575l.m112148k(set);
            }
            return C52786h.m112334a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cd$l */
    static final class C26486l extends C52712l implements C52671b<String, Boolean> {

        /* renamed from: a */
        public static final C26486l f69796a = new C26486l();

        C26486l() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            CharSequence charSequence = (String) obj;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(!z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cd$m */
    static final class C26487m extends C52712l implements C52671b<String, Boolean> {

        /* renamed from: a */
        public static final C26487m f69797a = new C26487m();

        C26487m() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            CharSequence charSequence = (String) obj;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(!z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cd$n */
    static final class C26488n extends C52712l implements C52671b<String, String> {

        /* renamed from: a */
        public static final C26488n f69798a = new C26488n();

        C26488n() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            C52711k.m112240b(str, "it");
            return C52830p.m112401a(str, "[ERRORCODE]", "0", false, 4, (Object) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cd$o */
    public static final class C26489o implements C26027a {

        /* renamed from: a */
        final /* synthetic */ String f69799a;

        /* renamed from: b */
        final /* synthetic */ long f69800b;

        /* renamed from: c */
        final /* synthetic */ AwemeRawAd f69801c;

        public C26489o(String str, long j, AwemeRawAd awemeRawAd) {
            this.f69799a = str;
            this.f69800b = j;
            this.f69801c = awemeRawAd;
        }

        /* renamed from: a */
        public final void mo53492a(int i, boolean z, Exception exc) {
            String str;
            if (!z) {
                C26080b b = C26077e.m63190a().mo53591b(this.f69801c).mo53582a("draw_ad").mo53593b("load_failed");
                C52847n[] nVarArr = new C52847n[3];
                nVarArr[0] = C52856t.m112465a("error_message", "vast_click_tracker_bad_response");
                nVarArr[1] = C52856t.m112465a("error_code", Integer.valueOf(i));
                String str2 = "error_detail";
                if (exc != null) {
                    str = exc.getMessage();
                } else {
                    str = null;
                }
                nVarArr[2] = C52856t.m112465a(str2, str);
                b.mo53581a((Object) C52550ab.m112050a(nVarArr)).mo53597c();
            }
            C26471cd.m64009a(C26471cd.f69762a, this.f69799a, String.valueOf(i), this.f69800b, "click", null, this.f69801c, 16, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cd$p */
    public static final class C26490p implements C26027a {

        /* renamed from: a */
        final /* synthetic */ AwemeRawAd f69802a;

        public C26490p(AwemeRawAd awemeRawAd) {
            this.f69802a = awemeRawAd;
        }

        /* renamed from: a */
        public final void mo53492a(int i, boolean z, Exception exc) {
            String str;
            if (!z) {
                C26080b b = C26077e.m63190a().mo53591b(this.f69802a).mo53582a("draw_ad").mo53593b("load_failed");
                C52847n[] nVarArr = new C52847n[3];
                nVarArr[0] = C52856t.m112465a("error_message", "vast_clickthru_bad_response");
                nVarArr[1] = C52856t.m112465a("error_code", Integer.valueOf(i));
                String str2 = "error_detail";
                if (exc != null) {
                    str = exc.getMessage();
                } else {
                    str = null;
                }
                nVarArr[2] = C52856t.m112465a(str2, str);
                b.mo53581a((Object) C52550ab.m112050a(nVarArr)).mo53597c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cd$q */
    static final class C26491q extends C52712l implements C52671b<String, Boolean> {

        /* renamed from: a */
        public static final C26491q f69803a = new C26491q();

        C26491q() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            CharSequence charSequence = (String) obj;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(!z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cd$r */
    public static final class C26492r extends C52712l implements C52671b<C13234b, C52785g<? extends C13237e>> {
        public C26492r() {
            super(1);
        }

        public final C52785g<C13237e> invoke(C13234b bVar) {
            C52785g<C13237e> gVar;
            if (bVar != null) {
                List<C13237e> list = bVar.trackingEventList;
                if (list != null) {
                    gVar = C52575l.m112148k(list);
                } else {
                    gVar = null;
                }
                if (gVar != null) {
                    return gVar;
                }
            }
            return C52786h.m112334a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cd$s */
    static final class C26493s extends C52712l implements C52671b<C13237e, Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f69804a;

        C26493s(String str) {
            this.f69804a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            C13237e eVar = (C13237e) obj;
            if (eVar != null) {
                str = eVar.name;
            } else {
                str = null;
            }
            return Boolean.valueOf(C52711k.m112239a((Object) str, (Object) this.f69804a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cd$t */
    static final class C26494t extends C52712l implements C52671b<C13237e, String> {

        /* renamed from: a */
        public static final C26494t f69805a = new C26494t();

        C26494t() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return ((C13237e) obj).url;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cd$u */
    static final class C26495u extends C52712l implements C52671b<C13239g, C52785g<? extends String>> {

        /* renamed from: a */
        public static final C26495u f69806a = new C26495u();

        C26495u() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Set<String> set = ((C13239g) obj).clickTracking;
            if (set != null) {
                return C52575l.m112148k(set);
            }
            return C52786h.m112334a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cd$v */
    static final class C26496v extends C52712l implements C52671b<String, Boolean> {

        /* renamed from: a */
        public static final C26496v f69807a = new C26496v();

        C26496v() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            CharSequence charSequence = (String) obj;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cd$w */
    static final class C26497w extends C52712l implements C52671b<String, Boolean> {

        /* renamed from: a */
        public static final C26497w f69808a = new C26497w();

        C26497w() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            CharSequence charSequence = (String) obj;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cd$x */
    public static final class C26498x implements C26027a {

        /* renamed from: a */
        final /* synthetic */ String f69809a;

        /* renamed from: b */
        final /* synthetic */ long f69810b;

        /* renamed from: c */
        final /* synthetic */ Aweme f69811c;

        public C26498x(String str, long j, Aweme aweme) {
            this.f69809a = str;
            this.f69810b = j;
            this.f69811c = aweme;
        }

        /* renamed from: a */
        public final void mo53492a(int i, boolean z, Exception exc) {
            String str;
            if (!z) {
                C26080b b = C26077e.m63190a().mo53590b(this.f69811c).mo53582a("draw_ad").mo53593b("load_failed");
                C52847n[] nVarArr = new C52847n[3];
                nVarArr[0] = C52856t.m112465a("error_message", "vast_imp_tracker_bad_response");
                nVarArr[1] = C52856t.m112465a("error_code", Integer.valueOf(i));
                String str2 = "error_detail";
                if (exc != null) {
                    str = exc.getMessage();
                } else {
                    str = null;
                }
                nVarArr[2] = C52856t.m112465a(str2, str);
                b.mo53581a((Object) C52550ab.m112050a(nVarArr)).mo53597c();
            }
            C26471cd.m64009a(C26471cd.f69762a, this.f69809a, String.valueOf(i), this.f69810b, "show", this.f69811c, null, 32, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cd$y */
    static final class C26499y extends C52712l implements C52671b<String, Boolean> {

        /* renamed from: a */
        public static final C26499y f69812a = new C26499y();

        C26499y() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            CharSequence charSequence = (String) obj;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(!z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cd$z */
    public static final class C26500z extends C52712l implements C52671b<C13234b, C52785g<? extends C13237e>> {
        public C26500z() {
            super(1);
        }

        public final C52785g<C13237e> invoke(C13234b bVar) {
            C52785g<C13237e> gVar;
            if (bVar != null) {
                List<C13237e> list = bVar.trackingEventList;
                if (list != null) {
                    gVar = C52575l.m112148k(list);
                } else {
                    gVar = null;
                }
                if (gVar != null) {
                    return gVar;
                }
            }
            return C52786h.m112334a();
        }
    }

    private C26471cd() {
    }

    /* renamed from: a */
    public static final void m64014a(String str, Aweme aweme) {
        m64015a(str, aweme, (String) null);
    }

    /* renamed from: a */
    public final void mo54183a(Aweme aweme) {
    }

    /* renamed from: a */
    private static final void m64012a(C52785g<String> gVar, C26057av avVar) {
        C26081f.m63237a(avVar, (Collection<String>) C52786h.m112354h(C52786h.m112348d(C52786h.m112350e(gVar), C26488n.f69798a)), false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m64015a(java.lang.String r2, com.p683ss.android.ugc.aweme.feed.model.Aweme r3, java.lang.String r4) {
        /*
            if (r2 != 0) goto L_0x0003
            return
        L_0x0003:
            r0 = 3
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc.m63997a(r3, r0)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            if (r3 == 0) goto L_0x001c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r3.getAwemeRawAd()
            if (r0 == 0) goto L_0x001c
            com.ss.android.ugc.aweme.commercialize.model.y r0 = r0.getOmVast()
            if (r0 == 0) goto L_0x001c
            com.bytedance.t.b.f r0 = r0.vast
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r0 == 0) goto L_0x0035
            java.util.List<com.bytedance.t.b.b> r0 = r0.creativeList
            if (r0 == 0) goto L_0x0035
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            d.l.g r0 = p2628d.p2629a.C52575l.m112148k(r0)
            com.ss.android.ugc.aweme.commercialize.utils.cd$r r1 = new com.ss.android.ugc.aweme.commercialize.utils.cd$r
            r1.<init>()
            d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
            d.l.g r0 = p2628d.p2649l.C52786h.m112346c(r0, r1)
            goto L_0x0039
        L_0x0035:
            d.l.g r0 = p2628d.p2649l.C52786h.m112334a()
        L_0x0039:
            com.ss.android.ugc.aweme.commercialize.utils.cd$s r1 = new com.ss.android.ugc.aweme.commercialize.utils.cd$s
            r1.<init>(r2)
            d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
            d.l.g r2 = p2628d.p2649l.C52786h.m112340a(r0, r1)
            com.ss.android.ugc.aweme.commercialize.utils.cd$t r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.C26494t.f69805a
            d.f.a.b r0 = (p2628d.p2639f.p2640a.C52671b) r0
            d.l.g r2 = p2628d.p2649l.C52786h.m112348d(r2, r0)
            m64013a(r2, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.m64015a(java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }

    /* renamed from: a */
    public static long m64004a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    private static boolean m64021b() {
        Boolean bool;
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            bool = b.getDisableOmSdk();
            C52711k.m112236a((Object) bool, "SettingsReader.get().disableOmSdk");
        } catch (C10174a unused) {
            bool = Boolean.valueOf(true);
        }
        return bool.booleanValue();
    }

    /* renamed from: h */
    public final C13239g mo54184h(Aweme aweme) {
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                return m64017b(awemeRawAd);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final void m64018b(C13235c cVar) {
        if (cVar != null) {
            Set<String> set = cVar.viewTracking;
            if (set != null) {
                m64012a(C52786h.m112345b(C52575l.m112148k(set), C26497w.f69808a), (C26057av) null);
            }
        }
    }

    /* renamed from: a */
    public static final void m64008a(C13235c cVar) {
        if (cVar != null) {
            List<C13239g> list = cVar.clickList;
            if (list != null) {
                m64012a(C52786h.m112345b(C52786h.m112346c(C52575l.m112148k(list), C26495u.f69806a), C26496v.f69807a), (C26057av) null);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x000e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.bytedance.p879t.p881b.C13239g m64017b(com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x000b
            com.ss.android.ugc.aweme.commercialize.model.y r2 = r2.getOmVast()
            if (r2 == 0) goto L_0x000b
            com.bytedance.t.b.f r2 = r2.vast
            goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            if (r2 == 0) goto L_0x0024
            java.util.List<com.bytedance.t.b.b> r2 = r2.creativeList
            if (r2 == 0) goto L_0x0024
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            d.l.g r2 = p2628d.p2629a.C52575l.m112148k(r2)
            com.ss.android.ugc.aweme.commercialize.utils.cd$c r0 = new com.ss.android.ugc.aweme.commercialize.utils.cd$c
            r0.<init>()
            d.f.a.b r0 = (p2628d.p2639f.p2640a.C52671b) r0
            d.l.g r2 = p2628d.p2649l.C52786h.m112346c(r2, r0)
            goto L_0x0028
        L_0x0024:
            d.l.g r2 = p2628d.p2649l.C52786h.m112334a()
        L_0x0028:
            java.lang.Object r2 = p2628d.p2649l.C52786h.m112349d(r2)
            com.bytedance.t.b.g r2 = (com.bytedance.p879t.p881b.C13239g) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.m64017b(com.ss.android.ugc.aweme.feed.model.AwemeRawAd):com.bytedance.t.b.g");
    }

    /* renamed from: c */
    public static final boolean m64022c(Aweme aweme) {
        C26146y yVar;
        if (aweme != null && aweme.isAd()) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                yVar = awemeRawAd.getOmVast();
            } else {
                yVar = null;
            }
            if (yVar != null && (m64025f(aweme) == null || m64021b())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m64023d(Aweme aweme) {
        C26146y yVar;
        if (aweme != null && aweme.isAd()) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                yVar = awemeRawAd.getOmVast();
            } else {
                yVar = null;
            }
            if (!(yVar == null || m64025f(aweme) == null || m64021b())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final void m64019b(Aweme aweme) {
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                C26146y omVast = awemeRawAd.getOmVast();
                if (omVast != null) {
                    C13238f fVar = omVast.vast;
                    if (fVar != null) {
                        Set<String> set = fVar.impressionSet;
                        if (set != null) {
                            Iterator a = C52786h.m112340a(C52575l.m112148k(set), (C52671b<? super T, Boolean>) C26499y.f69812a).mo110157a();
                            while (a.hasNext()) {
                                String str = (String) a.next();
                                long currentTimeMillis = System.currentTimeMillis();
                                C52711k.m112236a((Object) str, "it");
                                RawURLGetter.m63086a(str, (C26027a) new C26498x(str, currentTimeMillis, aweme));
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public static final C13233a m64025f(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && !aweme.isAd()) {
            return null;
        }
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        if (awemeRawAd != null) {
            C26146y omVast = awemeRawAd.getOmVast();
            if (omVast != null && omVast.providerType == 3) {
                C26146y omVast2 = awemeRawAd.getOmVast();
                if (omVast2 != null) {
                    C13238f fVar = omVast2.vast;
                    if (fVar != null) {
                        List<C13233a> list = fVar.adVerificationList;
                        if (list != null) {
                            return (C13233a) C52575l.m112140f(list);
                        }
                    }
                }
                return null;
            }
        }
        if (awemeRawAd != null) {
            C26146y omVast3 = awemeRawAd.getOmVast();
            if (omVast3 != null) {
                List<C13233a> list2 = omVast3.adVerificationList;
                if (list2 != null) {
                    return (C13233a) C52575l.m112140f(list2);
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    public static final String m64026g(Aweme aweme) {
        boolean z;
        if (aweme != null) {
            C13239g h = f69762a.mo54184h(aweme);
            if (h != null) {
                CharSequence charSequence = h.clickThrough;
                boolean z2 = false;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return h.clickThrough;
                }
                Collection collection = h.clickTracking;
                if (collection == null || collection.isEmpty()) {
                    z2 = true;
                }
                if (z2) {
                    return null;
                }
                Set<String> set = h.clickTracking;
                C52711k.m112236a((Object) set, "click.clickTracking");
                return (String) C52786h.m112349d(C52786h.m112350e(C52575l.m112148k(set)));
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r0 == null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00aa, code lost:
        if (r0 == null) goto L_0x00ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x008f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m64024e(com.p683ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            boolean r0 = m64022c(r5)
            if (r0 != 0) goto L_0x000c
            boolean r0 = m64023d(r5)
            if (r0 == 0) goto L_0x0137
        L_0x000c:
            if (r5 == 0) goto L_0x002e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r5.getAwemeRawAd()
            if (r0 == 0) goto L_0x002e
            com.ss.android.ugc.aweme.commercialize.model.y r0 = r0.getOmVast()
            if (r0 == 0) goto L_0x002e
            com.bytedance.t.b.f r0 = r0.vast
            if (r0 == 0) goto L_0x002e
            java.util.List<com.bytedance.t.b.b> r0 = r0.creativeList
            if (r0 == 0) goto L_0x002e
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            d.l.g r0 = p2628d.p2629a.C52575l.m112148k(r0)
            d.l.g r0 = p2628d.p2649l.C52786h.m112350e(r0)
            if (r0 != 0) goto L_0x0032
        L_0x002e:
            d.l.g r0 = p2628d.p2649l.C52786h.m112334a()
        L_0x0032:
            if (r5 == 0) goto L_0x0057
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r5.getAwemeRawAd()
            if (r1 == 0) goto L_0x0057
            com.ss.android.ugc.aweme.commercialize.model.y r1 = r1.getOmVast()
            if (r1 == 0) goto L_0x0057
            com.bytedance.t.b.f r1 = r1.vast
            if (r1 == 0) goto L_0x0057
            java.util.Set<java.lang.String> r1 = r1.impressionSet
            if (r1 == 0) goto L_0x0057
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            d.l.g r1 = p2628d.p2629a.C52575l.m112148k(r1)
            com.ss.android.ugc.aweme.commercialize.utils.cd$m r2 = com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.C26487m.f69797a
            d.f.a.b r2 = (p2628d.p2639f.p2640a.C52671b) r2
            d.l.g r1 = p2628d.p2649l.C52786h.m112340a(r1, r2)
            goto L_0x005b
        L_0x0057:
            d.l.g r1 = p2628d.p2649l.C52786h.m112334a()
        L_0x005b:
            com.ss.android.ugc.aweme.commercialize.utils.cd$i r2 = com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.C26483i.f69793a
            d.f.a.b r2 = (p2628d.p2639f.p2640a.C52671b) r2
            d.l.g r2 = p2628d.p2649l.C52786h.m112346c(r0, r2)
            d.l.g r2 = p2628d.p2649l.C52786h.m112350e(r2)
            com.ss.android.ugc.aweme.commercialize.utils.cd$k r3 = com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.C26485k.f69795a
            d.f.a.b r3 = (p2628d.p2639f.p2640a.C52671b) r3
            d.l.g r2 = p2628d.p2649l.C52786h.m112346c(r2, r3)
            com.ss.android.ugc.aweme.commercialize.utils.cd$l r3 = com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.C26486l.f69796a
            d.f.a.b r3 = (p2628d.p2639f.p2640a.C52671b) r3
            d.l.g r2 = p2628d.p2649l.C52786h.m112340a(r2, r3)
            java.util.Iterator r0 = r0.mo110157a()
        L_0x007b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x008f
            java.lang.Object r3 = r0.next()
            r4 = r3
            com.bytedance.t.b.b r4 = (com.bytedance.p879t.p881b.C13234b) r4
            boolean r4 = r4.byWrapper
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x007b
            goto L_0x0090
        L_0x008f:
            r3 = 0
        L_0x0090:
            com.bytedance.t.b.b r3 = (com.bytedance.p879t.p881b.C13234b) r3
            if (r3 == 0) goto L_0x00ac
            java.util.List<com.bytedance.t.b.g> r0 = r3.clickList
            if (r0 == 0) goto L_0x00ac
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            d.l.g r0 = p2628d.p2629a.C52575l.m112148k(r0)
            com.ss.android.ugc.aweme.commercialize.utils.cd$j r3 = com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.C26484j.f69794a
            d.f.a.b r3 = (p2628d.p2639f.p2640a.C52671b) r3
            d.l.g r0 = p2628d.p2649l.C52786h.m112348d(r0, r3)
            d.l.g r0 = p2628d.p2649l.C52786h.m112350e(r0)
            if (r0 != 0) goto L_0x00b0
        L_0x00ac:
            d.l.g r0 = p2628d.p2649l.C52786h.m112334a()
        L_0x00b0:
            boolean r1 = p2628d.p2649l.C52786h.m112355i(r1)
            if (r1 != 0) goto L_0x00dd
            com.ss.android.ugc.aweme.commercialize.log.e$b r1 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()
            com.ss.android.ugc.aweme.commercialize.log.e$b r1 = r1.mo53590b(r5)
            java.lang.String r3 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.e$b r1 = r1.mo53582a(r3)
            java.lang.String r3 = "load_failed"
            com.ss.android.ugc.aweme.commercialize.log.e$b r1 = r1.mo53593b(r3)
            java.lang.String r3 = "error_message"
            java.lang.String r4 = "vast_imp_tracker_missing"
            d.n r3 = p2628d.C52856t.m112465a(r3, r4)
            java.util.Map r3 = p2628d.p2629a.C52550ab.m112042a(r3)
            com.ss.android.ugc.aweme.commercialize.log.e$b r1 = r1.mo53581a(r3)
            r1.mo53597c()
        L_0x00dd:
            boolean r0 = p2628d.p2649l.C52786h.m112355i(r0)
            if (r0 != 0) goto L_0x010a
            com.ss.android.ugc.aweme.commercialize.log.e$b r0 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()
            com.ss.android.ugc.aweme.commercialize.log.e$b r0 = r0.mo53590b(r5)
            java.lang.String r1 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.e$b r0 = r0.mo53582a(r1)
            java.lang.String r1 = "load_failed"
            com.ss.android.ugc.aweme.commercialize.log.e$b r0 = r0.mo53593b(r1)
            java.lang.String r1 = "error_message"
            java.lang.String r3 = "vast_clickthru_missing"
            d.n r1 = p2628d.C52856t.m112465a(r1, r3)
            java.util.Map r1 = p2628d.p2629a.C52550ab.m112042a(r1)
            com.ss.android.ugc.aweme.commercialize.log.e$b r0 = r0.mo53581a(r1)
            r0.mo53597c()
        L_0x010a:
            boolean r0 = p2628d.p2649l.C52786h.m112355i(r2)
            if (r0 != 0) goto L_0x0137
            com.ss.android.ugc.aweme.commercialize.log.e$b r0 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()
            com.ss.android.ugc.aweme.commercialize.log.e$b r5 = r0.mo53590b(r5)
            java.lang.String r0 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.e$b r5 = r5.mo53582a(r0)
            java.lang.String r0 = "load_failed"
            com.ss.android.ugc.aweme.commercialize.log.e$b r5 = r5.mo53593b(r0)
            java.lang.String r0 = "error_message"
            java.lang.String r1 = "vast_click_tracker_missing"
            d.n r0 = p2628d.C52856t.m112465a(r0, r1)
            java.util.Map r0 = p2628d.p2629a.C52550ab.m112042a(r0)
            com.ss.android.ugc.aweme.commercialize.log.e$b r5 = r5.mo53581a(r0)
            r5.mo53597c()
        L_0x0137:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.m64024e(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* renamed from: a */
    public static final void m64011a(AwemeRawAd awemeRawAd) {
        boolean z;
        if (awemeRawAd != null) {
            C13239g b = f69762a.m64017b(awemeRawAd);
            if (b != null) {
                Collection collection = b.clickTracking;
                boolean z2 = false;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Set<String> set = b.clickTracking;
                    C52711k.m112236a((Object) set, "it.clickTracking");
                    Iterator a = C52786h.m112340a(C52575l.m112148k(set), (C52671b<? super T, Boolean>) C26491q.f69803a).mo110157a();
                    while (a.hasNext()) {
                        String str = (String) a.next();
                        long currentTimeMillis = System.currentTimeMillis();
                        C52711k.m112236a((Object) str, "url");
                        RawURLGetter.m63086a(str, (C26027a) new C26489o(str, currentTimeMillis, awemeRawAd));
                    }
                } else {
                    C26146y omVast = awemeRawAd.getOmVast();
                    if (omVast != null && omVast.providerType == 2) {
                        CharSequence charSequence = b.clickThrough;
                        if (charSequence == null || charSequence.length() == 0) {
                            z2 = true;
                        }
                        if (!z2) {
                            String str2 = b.clickThrough;
                            C52711k.m112236a((Object) str2, "it.clickThrough");
                            RawURLGetter.m63086a(str2, (C26027a) new C26490p(awemeRawAd));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static long m64005a(long j, String str) {
        CharSequence charSequence = str;
        C52815j matchEntire = f69763b.matchEntire(charSequence);
        if (matchEntire != null) {
            long j2 = j * 100;
            C52812g a = matchEntire.mo110378c().mo110375a(1);
            if (a == null) {
                C52711k.m112234a();
            }
            return j2 / ((long) Integer.parseInt(a.f131060a));
        }
        C52815j matchEntire2 = f69764c.matchEntire(charSequence);
        if (matchEntire2 == null) {
            return -1;
        }
        TimeUnit timeUnit = TimeUnit.HOURS;
        C52812g a2 = matchEntire2.mo110378c().mo110375a(1);
        if (a2 == null) {
            C52711k.m112234a();
        }
        long millis = timeUnit.toMillis(Long.parseLong(a2.f131060a));
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        C52812g a3 = matchEntire2.mo110378c().mo110375a(2);
        if (a3 == null) {
            C52711k.m112234a();
        }
        long millis2 = millis + timeUnit2.toMillis(Long.parseLong(a3.f131060a));
        TimeUnit timeUnit3 = TimeUnit.SECONDS;
        C52812g a4 = matchEntire2.mo110378c().mo110375a(3);
        if (a4 == null) {
            C52711k.m112234a();
        }
        return millis2 + timeUnit3.toMillis(Long.parseLong(a4.f131060a));
    }

    /* renamed from: a */
    public static BitRate m64006a(C13236d dVar, double d) {
        boolean z;
        String str;
        int i;
        int i2;
        int i3;
        if (dVar != null && !(!C52711k.m112239a((Object) dVar.type, (Object) "video/mp4")) && dVar.width > 0 && dVar.height > 0) {
            CharSequence charSequence = dVar.url;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                BitRate bitRate = new BitRate();
                bitRate.setH265(0);
                int i4 = dVar.width;
                if (i4 >= 0 && 540 > i4) {
                    str = "480p";
                    bitRate.setGearName("noraml_480");
                    bitRate.setQualityType(301);
                    if (dVar.bitRate > 0) {
                        i3 = dVar.bitRate * PreloadTask.BYTE_UNIT_NUMBER;
                    } else {
                        i3 = 600000;
                    }
                    bitRate.setBitRate(i3);
                } else if (540 <= i4 && 720 > i4) {
                    str = "540p";
                    bitRate.setGearName("normal_540");
                    bitRate.setQualityType(201);
                    if (dVar.bitRate > 0) {
                        i2 = dVar.bitRate * PreloadTask.BYTE_UNIT_NUMBER;
                    } else {
                        i2 = 1350000;
                    }
                    bitRate.setBitRate(i2);
                } else {
                    str = "720p";
                    bitRate.setGearName("normal_720");
                    bitRate.setQualityType(BaseNotice.HASHTAG);
                    if (dVar.bitRate > 0) {
                        i = dVar.bitRate * PreloadTask.BYTE_UNIT_NUMBER;
                    } else {
                        i = 2000000;
                    }
                    bitRate.setBitRate(i);
                }
                UrlModel urlModel = new UrlModel();
                urlModel.setWidth(dVar.width);
                urlModel.setHeight(dVar.height);
                String str2 = dVar.url;
                C52711k.m112236a((Object) str2, "m.url");
                Charset charset = C52808d.f131043a;
                if (str2 != null) {
                    byte[] bytes = str2.getBytes(charset);
                    C52711k.m112236a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                    urlModel.setUri(Base64.encodeToString(bytes, 2));
                    StringBuilder sb = new StringBuilder();
                    sb.append(urlModel.getUri());
                    sb.append("_h264_");
                    sb.append(str);
                    sb.append('_');
                    sb.append(bitRate.getBitRate());
                    urlModel.setUrlKey(sb.toString());
                    urlModel.setUrlList(C52575l.m112101c(dVar.url));
                    bitRate.setPlayAddr(urlModel);
                    return bitRate;
                }
                throw new C52857u("null cannot be cast to non-null type java.lang.String");
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final void m64013a(C52785g<String> gVar, String str, Aweme aweme) {
        C52711k.m112240b(gVar, "url");
        m64012a(gVar, (C26057av) new C26474ab(str, aweme));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        if (r5 == null) goto L_0x003f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m64007a(com.bytedance.p879t.p881b.C13234b r5, com.p683ss.android.ugc.aweme.feed.model.Aweme r6, com.bytedance.p879t.p881b.C13235c r7) {
        /*
            if (r7 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.String r0 = r7.program
            java.lang.String r1 = "nativeIcon.program"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.bytedance.t.b.c r6 = com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc.m63995a(r6, r0)
            if (r6 != 0) goto L_0x0023
            java.util.List<com.bytedance.t.b.c> r6 = r5.iconList
            if (r6 != 0) goto L_0x001d
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            java.util.List r6 = (java.util.List) r6
            r5.iconList = r6
        L_0x001d:
            java.util.List<com.bytedance.t.b.c> r5 = r5.iconList
            r5.add(r7)
            return
        L_0x0023:
            java.util.Set<java.lang.String> r5 = r7.staticResource
            r0 = 0
            r1 = 1
            r2 = 0
            if (r5 == 0) goto L_0x003f
            r3 = r5
            java.util.Collection r3 = (java.util.Collection) r3
            if (r3 == 0) goto L_0x0038
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r3 = 0
            goto L_0x0039
        L_0x0038:
            r3 = 1
        L_0x0039:
            if (r3 != 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r5 = r0
        L_0x003d:
            if (r5 != 0) goto L_0x0041
        L_0x003f:
            java.util.Set<java.lang.String> r5 = r6.staticResource
        L_0x0041:
            r6.staticResource = r5
            java.util.Set<java.lang.String> r5 = r7.viewTracking
            if (r5 == 0) goto L_0x0077
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r5 = r5.iterator()
        L_0x0054:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x0075
            java.lang.Object r3 = r5.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L_0x006e
            int r4 = r4.length()
            if (r4 != 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r4 = 0
            goto L_0x006f
        L_0x006e:
            r4 = 1
        L_0x006f:
            if (r4 != 0) goto L_0x0054
            r0.add(r3)
            goto L_0x0054
        L_0x0075:
            java.util.List r0 = (java.util.List) r0
        L_0x0077:
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x0084
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L_0x0082
            goto L_0x0084
        L_0x0082:
            r5 = 0
            goto L_0x0085
        L_0x0084:
            r5 = 1
        L_0x0085:
            if (r5 != 0) goto L_0x0099
            java.util.Set<java.lang.String> r5 = r6.viewTracking
            if (r5 != 0) goto L_0x0094
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.Set r5 = (java.util.Set) r5
            r6.viewTracking = r5
        L_0x0094:
            java.util.Set<java.lang.String> r5 = r6.viewTracking
            r5.addAll(r0)
        L_0x0099:
            java.util.List<com.bytedance.t.b.g> r5 = r7.clickList
            java.util.Collection r5 = (java.util.Collection) r5
            if (r5 == 0) goto L_0x00a7
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            r1 = 0
        L_0x00a7:
            if (r1 != 0) goto L_0x00c4
            java.util.List<com.bytedance.t.b.g> r5 = r6.clickList
            if (r5 != 0) goto L_0x00b6
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            java.util.List r5 = (java.util.List) r5
            r6.clickList = r5
        L_0x00b6:
            java.util.List<com.bytedance.t.b.g> r5 = r6.clickList
            java.util.List<com.bytedance.t.b.g> r6 = r7.clickList
            java.lang.String r7 = "nativeIcon.clickList"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            java.util.Collection r6 = (java.util.Collection) r6
            r5.addAll(r2, r6)
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.m64007a(com.bytedance.t.b.b, com.ss.android.ugc.aweme.feed.model.Aweme, com.bytedance.t.b.c):void");
    }

    /* renamed from: a */
    public static final void m64010a(Aweme aweme, Executor executor, Runnable runnable, boolean z) {
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                C26146y omVast = awemeRawAd.getOmVast();
                if (omVast != null) {
                    omVast.loading = true;
                }
            }
        }
        f69762a.m64020b(aweme, executor, new C26482h(aweme, runnable), z);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:157|158) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:37|38|(1:42)|(2:44|45)|46|47|48) */
    /* JADX WARNING: Code restructure failed: missing block: B:158:?, code lost:
        r6 = java.lang.Boolean.valueOf(false);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:157:0x022c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00bd */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0189 A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x018a A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x018d A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x019e A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01bb A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01bc A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01bf A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01d2 A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x023b A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0244 A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0255 A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0256 A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0259 A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x025c A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0264 A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x026b A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0278 A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0298 A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x02a4 A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x014d A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x016c A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x016d A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0170 A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x017d A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m64020b(com.p683ss.android.ugc.aweme.feed.model.Aweme r15, java.util.concurrent.Executor r16, java.lang.Runnable r17, boolean r18) {
        /*
            r14 = this;
            r0 = r15
            r9 = r16
            r1 = 0
            if (r0 == 0) goto L_0x0012
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r15.getAwemeRawAd()
            if (r2 == 0) goto L_0x0012
            com.ss.android.ugc.aweme.commercialize.model.y r2 = r2.getOmVast()
            r7 = r2
            goto L_0x0013
        L_0x0012:
            r7 = r1
        L_0x0013:
            if (r7 != 0) goto L_0x0019
            r17.run()
            return
        L_0x0019:
            java.util.List<com.bytedance.t.b.a> r2 = r7.adVerificationList
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x002a
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            r5 = 2
            if (r2 == 0) goto L_0x0051
            java.lang.String r2 = r7.vastContent
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L_0x003d
            int r2 = r2.length()
            if (r2 != 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r2 = 0
            goto L_0x003e
        L_0x003d:
            r2 = 1
        L_0x003e:
            if (r2 == 0) goto L_0x0051
            int r2 = r7.providerType
            if (r2 != r5) goto L_0x0051
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r15.getAwemeRawAd()
            if (r0 == 0) goto L_0x004d
            r0.setOmVast(r1)
        L_0x004d:
            r17.run()
            return
        L_0x0051:
            if (r18 == 0) goto L_0x0055
            r8 = 0
            goto L_0x0058
        L_0x0055:
            int r2 = r7.vastWrapperCount
            r8 = r2
        L_0x0058:
            long r10 = m64004a()
            r7.loaded = r4
            int r2 = r7.providerType
            if (r2 != r5) goto L_0x00de
            if (r9 != 0) goto L_0x00cc
            com.ss.android.ugc.aweme.commercialize.log.e$b r1 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()     // Catch:{ all -> 0x00c7 }
            com.ss.android.ugc.aweme.commercialize.log.e$b r1 = r1.mo53590b(r15)     // Catch:{ all -> 0x00c7 }
            java.lang.String r2 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.e$b r1 = r1.mo53582a(r2)     // Catch:{ all -> 0x00c7 }
            java.lang.String r2 = "parse_vast"
            com.ss.android.ugc.aweme.commercialize.log.e$b r1 = r1.mo53593b(r2)     // Catch:{ all -> 0x00c7 }
            java.lang.String r2 = "duration"
            long r5 = m64004a()     // Catch:{ all -> 0x00c7 }
            r9 = 0
            long r5 = r5 - r10
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x00c7 }
            d.n r2 = p2628d.C52856t.m112465a(r2, r5)     // Catch:{ all -> 0x00c7 }
            java.util.Map r2 = p2628d.p2629a.C52550ab.m112042a(r2)     // Catch:{ all -> 0x00c7 }
            com.ss.android.ugc.aweme.commercialize.log.e$b r1 = r1.mo53581a(r2)     // Catch:{ all -> 0x00c7 }
            r1.mo53597c()     // Catch:{ all -> 0x00c7 }
            r7.loaded = r3     // Catch:{ all -> 0x00c7 }
            com.bytedance.t.b.f r1 = new com.bytedance.t.b.f     // Catch:{ all -> 0x00c7 }
            r1.<init>()     // Catch:{ all -> 0x00c7 }
            r7.vast = r1     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = r7.vastUrl     // Catch:{ all -> 0x00c7 }
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ all -> 0x00c7 }
            if (r2 == 0) goto L_0x00ab
            int r2 = r2.length()     // Catch:{ all -> 0x00c7 }
            if (r2 != 0) goto L_0x00aa
            goto L_0x00ab
        L_0x00aa:
            r3 = 0
        L_0x00ab:
            if (r3 != 0) goto L_0x00bd
            com.bytedance.t.b.f r2 = r7.vast     // Catch:{ Exception -> 0x00bd }
            com.ss.android.ugc.aweme.commercialize.utils.cd$a r3 = com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.C26472a.f69765a     // Catch:{ Exception -> 0x00bd }
            com.bytedance.t.b r3 = (com.bytedance.p879t.C13232b) r3     // Catch:{ Exception -> 0x00bd }
            com.ss.android.ugc.aweme.commercialize.utils.cd$b r4 = new com.ss.android.ugc.aweme.commercialize.utils.cd$b     // Catch:{ Exception -> 0x00bd }
            r4.<init>(r15)     // Catch:{ Exception -> 0x00bd }
            com.bytedance.t.c r4 = (com.bytedance.p879t.C13240c) r4     // Catch:{ Exception -> 0x00bd }
            r2.parseUri(r1, r8, r3, r4)     // Catch:{ Exception -> 0x00bd }
        L_0x00bd:
            com.ss.android.ugc.aweme.commercialize.utils.cd r1 = f69762a     // Catch:{ all -> 0x00c7 }
            r1.mo54183a(r15)     // Catch:{ all -> 0x00c7 }
            r17.run()
            goto L_0x0369
        L_0x00c7:
            r0 = move-exception
            r17.run()
            throw r0
        L_0x00cc:
            com.ss.android.ugc.aweme.commercialize.utils.cd$d r12 = new com.ss.android.ugc.aweme.commercialize.utils.cd$d
            r1 = r12
            r2 = r17
            r3 = r15
            r4 = r10
            r6 = r7
            r7 = r8
            r1.<init>(r2, r3, r4, r6, r7)
            java.lang.Runnable r12 = (java.lang.Runnable) r12
            r9.execute(r12)
            return
        L_0x00de:
            int r2 = r7.providerType
            r5 = 3
            if (r2 != r5) goto L_0x0363
            java.lang.String r2 = r7.vastContent
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L_0x00f2
            int r2 = r2.length()
            if (r2 != 0) goto L_0x00f0
            goto L_0x00f2
        L_0x00f0:
            r2 = 0
            goto L_0x00f3
        L_0x00f2:
            r2 = 1
        L_0x00f3:
            if (r2 != 0) goto L_0x0363
            com.bytedance.t.b.f r6 = new com.bytedance.t.b.f
            r6.<init>()
            if (r9 != 0) goto L_0x0353
            com.ss.android.ugc.aweme.commercialize.log.e$b r2 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()     // Catch:{ all -> 0x034e }
            com.ss.android.ugc.aweme.commercialize.log.e$b r2 = r2.mo53590b(r15)     // Catch:{ all -> 0x034e }
            java.lang.String r5 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.e$b r2 = r2.mo53582a(r5)     // Catch:{ all -> 0x034e }
            java.lang.String r5 = "parse_vast"
            com.ss.android.ugc.aweme.commercialize.log.e$b r2 = r2.mo53593b(r5)     // Catch:{ all -> 0x034e }
            java.lang.String r5 = "duration"
            long r12 = m64004a()     // Catch:{ all -> 0x034e }
            r9 = 0
            long r12 = r12 - r10
            java.lang.Long r9 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x034e }
            d.n r5 = p2628d.C52856t.m112465a(r5, r9)     // Catch:{ all -> 0x034e }
            java.util.Map r5 = p2628d.p2629a.C52550ab.m112042a(r5)     // Catch:{ all -> 0x034e }
            com.ss.android.ugc.aweme.commercialize.log.e$b r2 = r2.mo53581a(r5)     // Catch:{ all -> 0x034e }
            r2.mo53597c()     // Catch:{ all -> 0x034e }
            java.lang.String r2 = r7.vastContent     // Catch:{ Exception -> 0x034a }
            com.ss.android.ugc.aweme.commercialize.utils.cd$a r5 = com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.C26472a.f69765a     // Catch:{ Exception -> 0x034a }
            com.bytedance.t.b r5 = (com.bytedance.p879t.C13232b) r5     // Catch:{ Exception -> 0x034a }
            com.ss.android.ugc.aweme.commercialize.utils.cd$b r9 = new com.ss.android.ugc.aweme.commercialize.utils.cd$b     // Catch:{ Exception -> 0x034a }
            r9.<init>(r15)     // Catch:{ Exception -> 0x034a }
            com.bytedance.t.c r9 = (com.bytedance.p879t.C13240c) r9     // Catch:{ Exception -> 0x034a }
            r6.parseContent(r2, r8, r5, r9)     // Catch:{ Exception -> 0x034a }
            java.lang.String r2 = r6.adTitle     // Catch:{ all -> 0x034e }
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ all -> 0x034e }
            if (r2 == 0) goto L_0x014a
            int r2 = r2.length()     // Catch:{ all -> 0x034e }
            if (r2 != 0) goto L_0x0148
            goto L_0x014a
        L_0x0148:
            r2 = 0
            goto L_0x014b
        L_0x014a:
            r2 = 1
        L_0x014b:
            if (r2 != 0) goto L_0x034a
            r7.vast = r6     // Catch:{ all -> 0x034e }
            com.ss.android.ugc.aweme.profile.model.User r2 = r15.getAuthor()     // Catch:{ all -> 0x034e }
            if (r2 == 0) goto L_0x015a
            java.lang.String r2 = r2.getNickname()     // Catch:{ all -> 0x034e }
            goto L_0x015b
        L_0x015a:
            r2 = r1
        L_0x015b:
            r5 = r2
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ all -> 0x034e }
            if (r5 == 0) goto L_0x0169
            boolean r5 = p2628d.p2650m.C52830p.m112402a(r5)     // Catch:{ all -> 0x034e }
            if (r5 == 0) goto L_0x0167
            goto L_0x0169
        L_0x0167:
            r5 = 0
            goto L_0x016a
        L_0x0169:
            r5 = 1
        L_0x016a:
            if (r5 != 0) goto L_0x016d
            goto L_0x016e
        L_0x016d:
            r2 = r1
        L_0x016e:
            if (r2 != 0) goto L_0x0172
            java.lang.String r2 = r6.adTitle     // Catch:{ all -> 0x034e }
        L_0x0172:
            r6.adTitle = r2     // Catch:{ all -> 0x034e }
            java.lang.String r2 = r15.getDesc()     // Catch:{ all -> 0x034e }
            r5 = r2
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ all -> 0x034e }
            if (r5 == 0) goto L_0x0186
            boolean r5 = p2628d.p2650m.C52830p.m112402a(r5)     // Catch:{ all -> 0x034e }
            if (r5 == 0) goto L_0x0184
            goto L_0x0186
        L_0x0184:
            r5 = 0
            goto L_0x0187
        L_0x0186:
            r5 = 1
        L_0x0187:
            if (r5 != 0) goto L_0x018a
            goto L_0x018b
        L_0x018a:
            r2 = r1
        L_0x018b:
            if (r2 != 0) goto L_0x0195
            com.bytedance.t.b.f r2 = r7.vast     // Catch:{ all -> 0x034e }
            java.lang.String r2 = r2.description     // Catch:{ all -> 0x034e }
            if (r2 != 0) goto L_0x0195
            java.lang.String r2 = ""
        L_0x0195:
            r15.setDesc(r2)     // Catch:{ all -> 0x034e }
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r15.getAwemeRawAd()     // Catch:{ all -> 0x034e }
            if (r2 == 0) goto L_0x01ce
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r15.getAwemeRawAd()     // Catch:{ all -> 0x034e }
            if (r5 == 0) goto L_0x01a9
            java.lang.String r5 = r5.getWebUrl()     // Catch:{ all -> 0x034e }
            goto L_0x01aa
        L_0x01a9:
            r5 = r1
        L_0x01aa:
            r8 = r5
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ all -> 0x034e }
            if (r8 == 0) goto L_0x01b8
            boolean r8 = p2628d.p2650m.C52830p.m112402a(r8)     // Catch:{ all -> 0x034e }
            if (r8 == 0) goto L_0x01b6
            goto L_0x01b8
        L_0x01b6:
            r8 = 0
            goto L_0x01b9
        L_0x01b8:
            r8 = 1
        L_0x01b9:
            if (r8 != 0) goto L_0x01bc
            goto L_0x01bd
        L_0x01bc:
            r5 = r1
        L_0x01bd:
            if (r5 != 0) goto L_0x01cb
            com.ss.android.ugc.aweme.commercialize.utils.cd r5 = f69762a     // Catch:{ all -> 0x034e }
            com.bytedance.t.b.g r5 = r5.mo54184h(r15)     // Catch:{ all -> 0x034e }
            if (r5 == 0) goto L_0x01ca
            java.lang.String r5 = r5.clickThrough     // Catch:{ all -> 0x034e }
            goto L_0x01cb
        L_0x01ca:
            r5 = r1
        L_0x01cb:
            r2.setWebUrl(r5)     // Catch:{ all -> 0x034e }
        L_0x01ce:
            java.util.List<com.bytedance.t.b.b> r2 = r6.creativeList     // Catch:{ all -> 0x034e }
            if (r2 == 0) goto L_0x034a
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ all -> 0x034e }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x034e }
        L_0x01d8:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x034e }
            if (r5 == 0) goto L_0x01f1
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x034e }
            r6 = r5
            com.bytedance.t.b.b r6 = (com.bytedance.p879t.p881b.C13234b) r6     // Catch:{ all -> 0x034e }
            if (r6 == 0) goto L_0x01ed
            boolean r6 = r6.byWrapper     // Catch:{ all -> 0x034e }
            if (r6 != 0) goto L_0x01ed
            r6 = 1
            goto L_0x01ee
        L_0x01ed:
            r6 = 0
        L_0x01ee:
            if (r6 == 0) goto L_0x01d8
            goto L_0x01f2
        L_0x01f1:
            r5 = r1
        L_0x01f2:
            com.bytedance.t.b.b r5 = (com.bytedance.p879t.p881b.C13234b) r5     // Catch:{ all -> 0x034e }
            if (r5 != 0) goto L_0x01f8
            goto L_0x034a
        L_0x01f8:
            com.ss.android.ugc.aweme.profile.model.User r2 = r15.getAuthor()     // Catch:{ all -> 0x034e }
            if (r2 == 0) goto L_0x021d
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.getAvatarThumb()     // Catch:{ all -> 0x034e }
            if (r2 == 0) goto L_0x021d
            java.util.List r2 = r2.getUrlList()     // Catch:{ all -> 0x034e }
            if (r2 == 0) goto L_0x021d
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ all -> 0x034e }
            d.l.g r2 = p2628d.p2629a.C52575l.m112148k(r2)     // Catch:{ all -> 0x034e }
            com.ss.android.ugc.aweme.commercialize.utils.cd$f r6 = com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.C26480f.f69789a     // Catch:{ all -> 0x034e }
            d.f.a.b r6 = (p2628d.p2639f.p2640a.C52671b) r6     // Catch:{ all -> 0x034e }
            d.l.g r2 = p2628d.p2649l.C52786h.m112345b(r2, r6)     // Catch:{ all -> 0x034e }
            java.util.HashSet r2 = p2628d.p2649l.C52786h.m112352f(r2)     // Catch:{ all -> 0x034e }
            goto L_0x021e
        L_0x021d:
            r2 = r1
        L_0x021e:
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r6 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ Throwable -> 0x022c }
            java.lang.String r8 = "SettingsReader.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r8)     // Catch:{ Throwable -> 0x022c }
            java.lang.Boolean r6 = r6.getDisallowVastHasAuthor()     // Catch:{ Throwable -> 0x022c }
            goto L_0x0230
        L_0x022c:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x034e }
        L_0x0230:
            java.lang.String r8 = "disallowVastHasAuthor"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r8)     // Catch:{ all -> 0x034e }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x034e }
            if (r6 == 0) goto L_0x023e
            r15.setAuthor(r1)     // Catch:{ all -> 0x034e }
        L_0x023e:
            com.bytedance.t.b.c r6 = com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc.m64003d(r15)     // Catch:{ all -> 0x034e }
            if (r6 == 0) goto L_0x0260
            r8 = r2
            java.util.Collection r8 = (java.util.Collection) r8     // Catch:{ all -> 0x034e }
            if (r8 == 0) goto L_0x0252
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x034e }
            if (r8 == 0) goto L_0x0250
            goto L_0x0252
        L_0x0250:
            r8 = 0
            goto L_0x0253
        L_0x0252:
            r8 = 1
        L_0x0253:
            if (r8 != 0) goto L_0x0256
            goto L_0x0257
        L_0x0256:
            r2 = r1
        L_0x0257:
            if (r2 == 0) goto L_0x025c
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ all -> 0x034e }
            goto L_0x025e
        L_0x025c:
            java.util.Set<java.lang.String> r2 = r6.staticResource     // Catch:{ all -> 0x034e }
        L_0x025e:
            r6.staticResource = r2     // Catch:{ all -> 0x034e }
        L_0x0260:
            com.ss.android.ugc.aweme.commercialize.model.v r2 = r7.adChoiceIcon     // Catch:{ all -> 0x034e }
            if (r2 == 0) goto L_0x026b
            java.lang.String r6 = "AdChoices"
            com.bytedance.t.b.c r2 = r2.toIcon(r6)     // Catch:{ all -> 0x034e }
            goto L_0x026c
        L_0x026b:
            r2 = r1
        L_0x026c:
            m64007a(r5, r15, r2)     // Catch:{ all -> 0x034e }
            long r8 = r5.getDurationInMs()     // Catch:{ all -> 0x034e }
            double r8 = (double) r8     // Catch:{ all -> 0x034e }
            java.util.List<com.bytedance.t.b.d> r2 = r5.mediaFileList     // Catch:{ all -> 0x034e }
            if (r2 == 0) goto L_0x0293
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ all -> 0x034e }
            d.l.g r2 = p2628d.p2629a.C52575l.m112148k(r2)     // Catch:{ all -> 0x034e }
            com.ss.android.ugc.aweme.commercialize.utils.cd$g r6 = new com.ss.android.ugc.aweme.commercialize.utils.cd$g     // Catch:{ all -> 0x034e }
            r6.<init>(r8)     // Catch:{ all -> 0x034e }
            d.f.a.b r6 = (p2628d.p2639f.p2640a.C52671b) r6     // Catch:{ all -> 0x034e }
            d.l.g r2 = p2628d.p2649l.C52786h.m112348d(r2, r6)     // Catch:{ all -> 0x034e }
            d.l.g r2 = p2628d.p2649l.C52786h.m112350e(r2)     // Catch:{ all -> 0x034e }
            if (r2 == 0) goto L_0x0293
            java.util.List r1 = p2628d.p2649l.C52786h.m112353g(r2)     // Catch:{ all -> 0x034e }
        L_0x0293:
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ all -> 0x034e }
            if (r2 == 0) goto L_0x02a1
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x034e }
            if (r2 == 0) goto L_0x029f
            goto L_0x02a1
        L_0x029f:
            r2 = 0
            goto L_0x02a2
        L_0x02a1:
            r2 = 1
        L_0x02a2:
            if (r2 != 0) goto L_0x034a
            com.ss.android.ugc.aweme.feed.model.Video r2 = r15.getVideo()     // Catch:{ all -> 0x034e }
            if (r2 != 0) goto L_0x02b2
            com.ss.android.ugc.aweme.feed.model.Video r2 = new com.ss.android.ugc.aweme.feed.model.Video     // Catch:{ all -> 0x034e }
            r2.<init>()     // Catch:{ all -> 0x034e }
            r15.setVideo(r2)     // Catch:{ all -> 0x034e }
        L_0x02b2:
            java.lang.Object r2 = r1.get(r4)     // Catch:{ all -> 0x034e }
            com.ss.android.ugc.aweme.feed.model.BitRate r2 = (com.p683ss.android.ugc.aweme.feed.model.BitRate) r2     // Catch:{ all -> 0x034e }
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.getPlayAddr()     // Catch:{ all -> 0x034e }
            com.ss.android.ugc.aweme.feed.model.Video r4 = r15.getVideo()     // Catch:{ all -> 0x034e }
            java.lang.String r6 = "aweme.video"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)     // Catch:{ all -> 0x034e }
            java.lang.String r6 = "url"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r6)     // Catch:{ all -> 0x034e }
            int r6 = r2.getWidth()     // Catch:{ all -> 0x034e }
            r4.setWidth(r6)     // Catch:{ all -> 0x034e }
            com.ss.android.ugc.aweme.feed.model.Video r4 = r15.getVideo()     // Catch:{ all -> 0x034e }
            java.lang.String r6 = "aweme.video"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)     // Catch:{ all -> 0x034e }
            int r6 = r2.getHeight()     // Catch:{ all -> 0x034e }
            r4.setHeight(r6)     // Catch:{ all -> 0x034e }
            com.ss.android.ugc.aweme.feed.model.Video r4 = r15.getVideo()     // Catch:{ all -> 0x034e }
            java.lang.String r6 = "aweme.video"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)     // Catch:{ all -> 0x034e }
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r6 = new com.ss.android.ugc.aweme.feed.model.VideoUrlModel     // Catch:{ all -> 0x034e }
            r6.<init>()     // Catch:{ all -> 0x034e }
            int r8 = r2.getWidth()     // Catch:{ all -> 0x034e }
            r6.setWidth(r8)     // Catch:{ all -> 0x034e }
            int r8 = r2.getHeight()     // Catch:{ all -> 0x034e }
            r6.setHeight(r8)     // Catch:{ all -> 0x034e }
            java.lang.String r8 = r2.getUri()     // Catch:{ all -> 0x034e }
            r6.setUri(r8)     // Catch:{ all -> 0x034e }
            java.lang.String r8 = r2.getUrlKey()     // Catch:{ all -> 0x034e }
            r6.setUrlKey(r8)     // Catch:{ all -> 0x034e }
            java.util.List r2 = r2.getUrlList()     // Catch:{ all -> 0x034e }
            r6.setUrlList(r2)     // Catch:{ all -> 0x034e }
            long r8 = r5.getDurationInMs()     // Catch:{ all -> 0x034e }
            double r8 = (double) r8     // Catch:{ all -> 0x034e }
            r6.setDuration(r8)     // Catch:{ all -> 0x034e }
            r4.setPlayAddr(r6)     // Catch:{ all -> 0x034e }
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r2 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ all -> 0x034e }
            java.lang.String r4 = "SettingsReader.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)     // Catch:{ all -> 0x034e }
            java.lang.Boolean r2 = r2.getDisableVastBitrate()     // Catch:{ all -> 0x034e }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x034e }
            if (r2 != 0) goto L_0x033c
            com.ss.android.ugc.aweme.feed.model.Video r2 = r15.getVideo()     // Catch:{ all -> 0x034e }
            java.lang.String r4 = "aweme.video"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)     // Catch:{ all -> 0x034e }
            r2.setBitRate(r1)     // Catch:{ all -> 0x034e }
        L_0x033c:
            com.bytedance.t.b.f r1 = r7.vast     // Catch:{ all -> 0x034e }
            java.lang.String r1 = r1.adTitle     // Catch:{ all -> 0x034e }
            r15.setTitle(r1)     // Catch:{ all -> 0x034e }
            r7.loaded = r3     // Catch:{ all -> 0x034e }
            com.ss.android.ugc.aweme.commercialize.utils.cd r1 = f69762a     // Catch:{ all -> 0x034e }
            r1.mo54183a(r15)     // Catch:{ all -> 0x034e }
        L_0x034a:
            r17.run()
            goto L_0x0369
        L_0x034e:
            r0 = move-exception
            r17.run()
            throw r0
        L_0x0353:
            com.ss.android.ugc.aweme.commercialize.utils.cd$e r12 = new com.ss.android.ugc.aweme.commercialize.utils.cd$e
            r1 = r12
            r2 = r17
            r3 = r15
            r4 = r10
            r1.<init>(r2, r3, r4, r6, r7, r8)
            java.lang.Runnable r12 = (java.lang.Runnable) r12
            r9.execute(r12)
            return
        L_0x0363:
            r14.mo54183a(r15)
            r17.run()
        L_0x0369:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.m64020b(com.ss.android.ugc.aweme.feed.model.Aweme, java.util.concurrent.Executor, java.lang.Runnable, boolean):void");
    }

    /* renamed from: a */
    static /* synthetic */ void m64009a(C26471cd cdVar, String str, String str2, long j, String str3, Aweme aweme, AwemeRawAd awemeRawAd, int i, Object obj) {
        if ((i & 16) != 0) {
            aweme = null;
        }
        if ((i & 32) != 0) {
            awemeRawAd = null;
        }
        if (str3 != null) {
            C26077e.m63191a(str, str2, j).mo53605j("track_url").mo53582a("track_ad").mo53603h(str3).mo53590b(aweme).mo53591b(awemeRawAd).mo53599d();
        }
    }
}
