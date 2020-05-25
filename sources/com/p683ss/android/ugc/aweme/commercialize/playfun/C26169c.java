package com.p683ss.android.ugc.aweme.commercialize.playfun;

import android.graphics.Point;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.commercialize.log.C26063b;
import com.p683ss.android.ugc.aweme.commercialize.log.C26072c;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.c */
public final class C26169c {

    /* renamed from: a */
    public static final C26169c f69100a = new C26169c();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.c$a */
    static final class C26170a<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ boolean f69101a;

        /* renamed from: b */
        final /* synthetic */ AwemePlayFunModel f69102b;

        /* renamed from: c */
        final /* synthetic */ AwemeRawAd f69103c;

        /* renamed from: d */
        final /* synthetic */ Aweme f69104d;

        /* renamed from: e */
        final /* synthetic */ String f69105e;

        C26170a(boolean z, AwemePlayFunModel awemePlayFunModel, AwemeRawAd awemeRawAd, Aweme aweme, String str) {
            this.f69101a = z;
            this.f69102b = awemePlayFunModel;
            this.f69103c = awemeRawAd;
            this.f69104d = aweme;
            this.f69105e = str;
        }

        public final /* synthetic */ Object call() {
            List list;
            try {
                boolean z = true;
                boolean z2 = !this.f69101a;
                JSONObject jSONObject = new JSONObject();
                UrlModel imageInfo = this.f69102b.getImageInfo();
                if (imageInfo != null) {
                    list = imageInfo.getUrlList();
                } else {
                    list = null;
                }
                Collection collection = list;
                if (collection != null) {
                    if (!collection.isEmpty()) {
                        z = false;
                    }
                }
                if (!z) {
                    jSONObject.put("material_url", list.get(0));
                }
                Long creativeId = this.f69103c.getCreativeId();
                C52711k.m112236a((Object) creativeId, "rawAd.creativeId");
                jSONObject.put("creative_id", creativeId.longValue());
                jSONObject.put("log_extra", this.f69103c.getLogExtra());
                jSONObject.put("aweme_id", this.f69104d.getAid());
                C23569o.m57776a(this.f69105e, z2 ? 1 : 0, jSONObject);
            } catch (Exception unused) {
            }
            return C52860x.f131107a;
        }
    }

    private C26169c() {
    }

    /* renamed from: a */
    public static boolean m63443a() {
        if (!AdPlayFunMonitorLogSetting.get()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo53794a(List<? extends Aweme> list) {
        String str;
        if (!m63443a() && list != null) {
            Iterable iterable = list;
            Collection arrayList = new ArrayList();
            for (Object next : iterable) {
                if (C26512f.m64109K((Aweme) next)) {
                    arrayList.add(next);
                }
            }
            for (Aweme aweme : (List) arrayList) {
                C26063b bVar = new C26063b("playfun", "data_received", 0, 4, null);
                C26063b a = bVar.mo53548a(aweme.getAid());
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                String str2 = null;
                if (awemeRawAd != null) {
                    str = awemeRawAd.getCreativeIdStr();
                } else {
                    str = null;
                }
                C26063b b = a.mo53549b(str);
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 != null) {
                    str2 = awemeRawAd2.getLogExtra();
                }
                C26072c.f68845b.mo53559a(b.mo53550c(str2));
            }
        }
    }

    /* renamed from: a */
    private static void m63442a(String str, Aweme aweme, boolean z) {
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                C52711k.m112236a((Object) awemeRawAd, "aweme?.awemeRawAd ?: return");
                AwemePlayFunModel playFunModel = awemeRawAd.getPlayFunModel();
                if (playFunModel != null) {
                    C26170a aVar = new C26170a(z, playFunModel, awemeRawAd, aweme, str);
                    C0013i.m18a((Callable<TResult>) aVar, (Executor) C26890h.m65003a());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo53792a(Aweme aweme, boolean z, String str) {
        if (!m63443a() && aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                C26072c.f68845b.mo53559a(new C26063b("playfun", "preload_result", z ^ true ? 1 : 0).mo53548a(aweme.getAid()).mo53549b(awemeRawAd.getCreativeIdStr()).mo53550c(awemeRawAd.getLogExtra()).mo53551d(str));
                m63442a("aweme_ad_play_fun_preload_error_rate", aweme, z);
            }
        }
    }

    /* renamed from: a */
    public final void mo53793a(Aweme aweme, boolean z, String str, Point point, Point point2) {
        C52711k.m112240b(str, "state");
        if (!m63443a() && aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                boolean z2 = !z;
                HashMap<String, String> hashMap = new HashMap<>();
                Map map = hashMap;
                map.put("state", str);
                if (point != null) {
                    map.put("egg_coordinate_x", String.valueOf(point.x));
                    map.put("egg_coordinate_y", String.valueOf(point.y));
                }
                if (point2 != null) {
                    map.put("text_coordinate_x", String.valueOf(point2.x));
                    map.put("text_coordinate_y", String.valueOf(point2.y));
                }
                C26063b c = new C26063b("playfun", "show_result", z2 ? 1 : 0).mo53548a(aweme.getAid()).mo53549b(awemeRawAd.getCreativeIdStr()).mo53550c(awemeRawAd.getLogExtra());
                c.f68830g = hashMap;
                C26072c.f68845b.mo53559a(c);
                if (C52711k.m112239a((Object) str, (Object) "display")) {
                    m63442a("aweme_ad_play_fun_show_error_rate", aweme, z);
                }
            }
        }
    }
}
