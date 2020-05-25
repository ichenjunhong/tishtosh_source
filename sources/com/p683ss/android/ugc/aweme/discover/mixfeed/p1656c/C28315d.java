package com.p683ss.android.ugc.aweme.discover.mixfeed.p1656c;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.adapter.C27797ad;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import p2628d.C52860x;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.c.d */
public final class C28315d {

    /* renamed from: a */
    public static final C28315d f74257a = new C28315d();

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.c.d$a */
    public static final class C28316a<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ String f74258a;

        /* renamed from: b */
        final /* synthetic */ String f74259b;

        /* renamed from: c */
        final /* synthetic */ String f74260c;

        /* renamed from: d */
        final /* synthetic */ String f74261d;

        /* renamed from: e */
        final /* synthetic */ String f74262e;

        /* renamed from: f */
        final /* synthetic */ C27797ad f74263f;

        /* renamed from: g */
        final /* synthetic */ Map f74264g;

        public C28316a(String str, String str2, String str3, String str4, String str5, C27797ad adVar, Map map) {
            this.f74258a = str;
            this.f74259b = str2;
            this.f74260c = str3;
            this.f74261d = str4;
            this.f74262e = str5;
            this.f74263f = adVar;
            this.f74264g = map;
        }

        public final /* synthetic */ Object call() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f74258a);
            sb.append('_');
            sb.append(this.f74263f.mo56237d());
            C23089d a = C23089d.m56640a().mo47829a("search_id", this.f74258a).mo47829a("search_keyword", this.f74259b).mo47829a("log_pb", this.f74260c).mo47829a("impr_id", this.f74261d).mo47829a("enter_from", this.f74262e).mo47826a("is_aladdin", 1).mo47826a("rank", this.f74263f.mo56237d()).mo47829a("search_result_id", sb.toString());
            Map map = this.f74264g;
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    a.mo47829a((String) entry.getKey(), (String) entry.getValue());
                }
            }
            C26890h.m65011a("search_result_click", a.f61491a);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.c.d$b */
    public static final class C28317b<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ String f74265a;

        /* renamed from: b */
        final /* synthetic */ String f74266b;

        /* renamed from: c */
        final /* synthetic */ String f74267c;

        /* renamed from: d */
        final /* synthetic */ String f74268d;

        /* renamed from: e */
        final /* synthetic */ String f74269e;

        /* renamed from: f */
        final /* synthetic */ C27797ad f74270f;

        /* renamed from: g */
        final /* synthetic */ Map f74271g;

        public C28317b(String str, String str2, String str3, String str4, String str5, C27797ad adVar, Map map) {
            this.f74265a = str;
            this.f74266b = str2;
            this.f74267c = str3;
            this.f74268d = str4;
            this.f74269e = str5;
            this.f74270f = adVar;
            this.f74271g = map;
        }

        public final /* synthetic */ Object call() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f74265a);
            sb.append('_');
            sb.append(this.f74270f.mo56237d());
            C23089d a = C23089d.m56640a().mo47829a("enter_from", "general_search").mo47829a("search_id", this.f74265a).mo47829a("search_keyword", this.f74266b).mo47829a("log_pb", this.f74267c).mo47829a("impr_id", this.f74268d).mo47829a("enter_from", this.f74269e).mo47826a("is_aladdin", 1).mo47826a("rank", this.f74270f.mo56237d()).mo47829a("search_result_id", sb.toString());
            Map map = this.f74271g;
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    a.mo47829a((String) entry.getKey(), (String) entry.getValue());
                }
            }
            C26890h.m65011a("search_result_show", a.f61491a);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.c.d$c */
    public static final class C28318c<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ String f74272a;

        /* renamed from: b */
        final /* synthetic */ String f74273b;

        /* renamed from: c */
        final /* synthetic */ String f74274c;

        /* renamed from: d */
        final /* synthetic */ String f74275d;

        /* renamed from: e */
        final /* synthetic */ String f74276e;

        /* renamed from: f */
        final /* synthetic */ C27797ad f74277f;

        /* renamed from: g */
        final /* synthetic */ int f74278g;

        /* renamed from: h */
        final /* synthetic */ Map f74279h;

        public C28318c(String str, String str2, String str3, String str4, String str5, C27797ad adVar, int i, Map map) {
            this.f74272a = str;
            this.f74273b = str2;
            this.f74274c = str3;
            this.f74275d = str4;
            this.f74276e = str5;
            this.f74277f = adVar;
            this.f74278g = i;
            this.f74279h = map;
        }

        public final /* synthetic */ Object call() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f74272a);
            sb.append('_');
            sb.append(this.f74277f.mo56237d());
            C23089d a = C23089d.m56640a().mo47829a("search_id", this.f74272a).mo47829a("search_keyword", this.f74273b).mo47829a("log_pb", this.f74274c).mo47829a("impr_id", this.f74275d).mo47829a("enter_from", this.f74276e).mo47826a("is_aladdin", 1).mo47826a("rank", this.f74277f.mo56237d()).mo47829a("search_result_id", sb.toString());
            if (this.f74278g >= 0) {
                a.mo47829a("aladdin_rank", String.valueOf(this.f74278g));
            }
            Map map = this.f74279h;
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    a.mo47829a((String) entry.getKey(), (String) entry.getValue());
                }
            }
            C26890h.m65011a("search_result_click", a.f61491a);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.c.d$d */
    public static final class C28319d<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ String f74280a;

        /* renamed from: b */
        final /* synthetic */ String f74281b;

        /* renamed from: c */
        final /* synthetic */ String f74282c;

        /* renamed from: d */
        final /* synthetic */ String f74283d;

        /* renamed from: e */
        final /* synthetic */ String f74284e;

        /* renamed from: f */
        final /* synthetic */ C27797ad f74285f;

        /* renamed from: g */
        final /* synthetic */ int f74286g;

        /* renamed from: h */
        final /* synthetic */ Map f74287h;

        public C28319d(String str, String str2, String str3, String str4, String str5, C27797ad adVar, int i, Map map) {
            this.f74280a = str;
            this.f74281b = str2;
            this.f74282c = str3;
            this.f74283d = str4;
            this.f74284e = str5;
            this.f74285f = adVar;
            this.f74286g = i;
            this.f74287h = map;
        }

        public final /* synthetic */ Object call() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f74280a);
            sb.append('_');
            sb.append(this.f74285f.mo56237d());
            C23089d a = C23089d.m56640a().mo47829a("search_id", this.f74280a).mo47829a("search_keyword", this.f74281b).mo47829a("log_pb", this.f74282c).mo47829a("impr_id", this.f74283d).mo47829a("enter_from", this.f74284e).mo47826a("is_aladdin", 1).mo47826a("rank", this.f74285f.mo56237d()).mo47829a("search_result_id", sb.toString());
            if (this.f74286g >= 0) {
                a.mo47829a("aladdin_rank", String.valueOf(this.f74286g));
            }
            Map map = this.f74287h;
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    a.mo47829a((String) entry.getKey(), (String) entry.getValue());
                }
            }
            C26890h.m65011a("search_result_show", a.f61491a);
            return C52860x.f131107a;
        }
    }

    private C28315d() {
    }
}
