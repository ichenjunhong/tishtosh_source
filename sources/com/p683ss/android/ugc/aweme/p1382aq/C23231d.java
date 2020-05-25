package com.p683ss.android.ugc.aweme.p1382aq;

import android.text.TextUtils;
import com.p683ss.android.common.p1146d.C18894a;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.common.C26883g;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.C30228f;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.HotSearchInfo;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d;
import com.p683ss.android.ugc.aweme.profile.model.HotListStruct;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.aq.d */
public abstract class C23231d<E extends C23231d> {

    /* renamed from: a */
    private final Map<String, String> f61982a = new HashMap();

    /* renamed from: b */
    private Map<String, String> f61983b = new HashMap();

    /* renamed from: f */
    protected final String f61984f;

    /* renamed from: g */
    protected String f61985g;

    /* renamed from: h */
    protected String f61986h;

    /* renamed from: i */
    protected String f61987i;

    /* renamed from: j */
    protected String f61988j;

    /* renamed from: k */
    protected String f61989k;

    /* renamed from: l */
    protected String f61990l;

    /* renamed from: m */
    protected String f61991m;

    /* renamed from: n */
    protected String f61992n;

    /* renamed from: o */
    protected String f61993o;

    /* renamed from: p */
    protected String f61994p;

    /* renamed from: q */
    protected String f61995q;

    /* renamed from: r */
    protected String f61996r;

    /* renamed from: s */
    protected String f61997s;

    /* renamed from: t */
    protected String f61998t;

    /* renamed from: u */
    protected String f61999u;

    /* renamed from: v */
    protected boolean f62000v;

    /* renamed from: w */
    public boolean f62001w = true;

    /* renamed from: x */
    protected String f62002x;

    /* renamed from: y */
    protected String f62003y;

    /* renamed from: z */
    protected String f62004z;

    /* renamed from: com.ss.android.ugc.aweme.aq.d$a */
    public interface C23232a {

        /* renamed from: a */
        public static final C23232a f62005a = new C23232a() {
            /* renamed from: a */
            public final String mo48079a(String str) {
                if (TextUtils.isEmpty(str) || TEVideoRecorder.FACE_BEAUTY_NULL.equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: b */
        public static final C23232a f62006b = new C23232a() {
            /* renamed from: a */
            public final String mo48079a(String str) {
                if (TextUtils.isEmpty(str) || TEVideoRecorder.FACE_BEAUTY_NULL.equals(str) || "0".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: a */
        String mo48079a(String str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo47948a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo47945b() {
    }

    /* renamed from: e */
    public final void mo48076e() {
        mo47945b();
        mo47948a();
        this.f61982a.putAll(this.f61983b);
        C18842a.m45932a(new C23235e(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo48077f() {
        try {
            if (this.f62001w) {
                C18894a.m46006a(this.f61984f, C23198ae.m56851a(this.f61982a));
                return;
            }
            C26883g.m64995a(this.f61984f, this.f61982a);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    public final void mo48075d() {
        String str;
        if (!TextUtils.isEmpty(this.f61986h)) {
            mo48072a("city_info", this.f61986h, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61990l)) {
            mo48072a("distance_info", this.f61990l, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61992n)) {
            mo48072a("poi_city", this.f61992n, C23232a.f62005a);
            String str2 = "poi_device_samecity";
            if (this.f61992n.equalsIgnoreCase(C30228f.m70982f())) {
                str = "1";
            } else {
                str = "0";
            }
            mo48072a(str2, str, C23232a.f62005a);
        }
        mo48072a("poi_type", this.f61988j, C23232a.f62005a);
        mo48072a("poi_channel", this.f61989k, C23232a.f62005a);
        mo48072a("card_type", this.f61997s, C23232a.f62005a);
        mo48072a("object_id", this.f61998t, C23232a.f62005a);
    }

    /* renamed from: c */
    public final void mo48074c() {
        String str;
        if (!TextUtils.isEmpty(this.f61987i)) {
            mo48072a("poi_id", this.f61987i, C23232a.f62006b);
            mo48072a("poi_backend_type", this.f61991m, C23232a.f62005a);
            if (!TextUtils.isEmpty(this.f61992n)) {
                mo48072a("poi_city", this.f61992n, C23232a.f62005a);
                String str2 = "poi_device_samecity";
                if (this.f61992n.equalsIgnoreCase(C30228f.m70982f())) {
                    str = "1";
                } else {
                    str = "0";
                }
                mo48072a(str2, str, C23232a.f62005a);
            }
        }
        if ("poi_page".equalsIgnoreCase(this.f61985g)) {
            if (!TextUtils.isEmpty(this.f61993o)) {
                mo48069a("page_poi_id", this.f61993o);
            }
            if (!TextUtils.isEmpty(this.f61994p)) {
                mo48069a("page_poi_city", this.f61994p);
            }
            if (!TextUtils.isEmpty(this.f61995q)) {
                mo48069a("page_poi_device_samecity", this.f61995q);
            }
            if (!TextUtils.isEmpty(this.f61996r)) {
                mo48069a("page_poi_backend_type", this.f61996r);
            }
        }
        if ("poi_map".equalsIgnoreCase(this.f61985g) && !TextUtils.isEmpty(this.f61993o)) {
            mo48069a("page_poi_id", this.f61993o);
        }
        mo48075d();
    }

    /* renamed from: a */
    public final E mo48070a(Map<String, String> map) {
        this.f61983b.putAll(map);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo48078i(String str) {
        mo48072a("log_pb", C29981aa.m70153a().mo60161a(str), C23232a.f62005a);
    }

    public C23231d(String str) {
        this.f61984f = str;
    }

    /* renamed from: d */
    static String m57044d(Aweme aweme) {
        if (aweme.getAuthor() != null) {
            return aweme.getAuthor().getUid();
        }
        return "";
    }

    /* renamed from: c */
    public void mo48028c(Aweme aweme) {
        if (aweme != null) {
            this.f62004z = m57043b(aweme, 9);
            if (aweme.getVideo() != null && aweme.getVideo().getVideoTag() != null) {
                this.f62003y = aweme.getVideo().getVideoTag().getTitle();
            }
        }
    }

    /* renamed from: b */
    public final void mo48073b(Aweme aweme) {
        if (aweme != null) {
            HotSearchInfo hotSearchInfo = aweme.getHotSearchInfo();
            if (hotSearchInfo == null || hotSearchInfo.getSentence() == null) {
                this.f61999u = aweme.getHotSpot();
            } else {
                this.f61999u = hotSearchInfo.getSentence();
            }
            HotListStruct hotListStruct = aweme.getHotListStruct();
            if (hotListStruct != null && hotListStruct.getType() == 9) {
                this.f62000v = true;
            }
            if (hotListStruct != null && hotListStruct.getType() == 9 && TextUtils.isEmpty(this.f61999u)) {
                this.f61999u = hotListStruct.getTitile();
            }
        }
    }

    /* renamed from: a */
    public final void mo48071a(Aweme aweme) {
        if (aweme != null) {
            this.f61990l = C23198ae.m56856b(aweme.getDistance());
            this.f61986h = C23198ae.m56845a();
            if (aweme.getPoiStruct() != null) {
                this.f61987i = aweme.getPoiStruct().poiId;
                this.f61988j = C23198ae.m56867h(aweme);
                this.f61989k = C23198ae.m56852b();
                this.f61991m = C23198ae.m56863f(aweme);
                this.f61992n = aweme.getPoiStruct().getCityCode();
            } else if (aweme.getSimplePoiInfoStruct() != null) {
                this.f61987i = aweme.getSimplePoiInfoStruct().getPoiId();
                this.f61991m = aweme.getSimplePoiInfoStruct().getPoiBackendType();
                this.f61992n = aweme.getSimplePoiInfoStruct().getCityCode();
            }
            if (aweme.getMobParams() != null) {
                this.f61993o = (String) aweme.getMobParams().get("page_poi_id");
                this.f61994p = (String) aweme.getMobParams().get("page_poi_city");
                this.f61995q = (String) aweme.getMobParams().get("page_poi_device_samecity");
                this.f61996r = (String) aweme.getMobParams().get("page_poi_backend_type");
            }
        }
    }

    /* renamed from: a */
    public final C23231d mo48069a(String str, String str2) {
        mo48072a(str, str2, C23232a.f62005a);
        return this;
    }

    /* renamed from: a */
    static String m57042a(Aweme aweme, int i) {
        JSONObject requestIdAndOrderJsonObject = C23325e.m57379a().getRequestIdAndOrderJsonObject(aweme, i);
        if (requestIdAndOrderJsonObject != null) {
            return requestIdAndOrderJsonObject.optString("request_id");
        }
        return "";
    }

    /* renamed from: b */
    static String m57043b(Aweme aweme, int i) {
        JSONObject requestIdAndOrderJsonObject = C23325e.m57379a().getRequestIdAndOrderJsonObject(aweme, i);
        if (requestIdAndOrderJsonObject != null) {
            return requestIdAndOrderJsonObject.optString("order");
        }
        return "";
    }

    /* renamed from: a */
    public final void mo48072a(String str, String str2, C23232a aVar) {
        this.f61982a.put(str, aVar.mo48079a(str2));
    }
}
