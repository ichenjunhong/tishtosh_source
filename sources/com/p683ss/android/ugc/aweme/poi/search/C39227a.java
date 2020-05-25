package com.p683ss.android.ugc.aweme.poi.search;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.support.p030v4.app.C0636b;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.dmt.p664ui.widget.C10720a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.location.C36265i;
import com.p683ss.android.ugc.aweme.location.C36272l;
import com.p683ss.android.ugc.aweme.location.C36282r;
import com.p683ss.android.ugc.aweme.location.C36285u;
import com.p683ss.android.ugc.aweme.location.C36285u.C36286a;
import com.p683ss.android.ugc.aweme.poi.C39054d;
import com.p683ss.android.ugc.aweme.poi.model.C39116av;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.poi.p2074ui.C39394p;
import com.p683ss.android.ugc.aweme.poi.utils.C39440a;
import com.p683ss.android.ugc.aweme.poi.utils.C39445f;
import com.p683ss.android.ugc.aweme.poi.utils.C39454n;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a.C47939a;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.poi.search.a */
public class C39227a extends FrameLayout implements C26846a, C26877c<PoiStruct>, C36265i {

    /* renamed from: a */
    public String f100170a;

    /* renamed from: b */
    protected boolean f100171b;

    /* renamed from: c */
    protected boolean f100172c;

    /* renamed from: d */
    private RecyclerView f100173d;

    /* renamed from: e */
    private C26840g f100174e;

    /* renamed from: f */
    private DmtStatusView f100175f;

    /* renamed from: g */
    private C39246p f100176g;

    /* renamed from: h */
    private C39249s f100177h;

    /* renamed from: i */
    private boolean f100178i;

    /* renamed from: j */
    private String f100179j;

    /* renamed from: k */
    private String f100180k;

    /* renamed from: l */
    private String f100181l;

    /* renamed from: m */
    private C39116av f100182m;

    /* renamed from: n */
    private C39230a f100183n;

    /* renamed from: o */
    private C1689b f100184o;

    /* renamed from: p */
    private boolean f100185p;

    /* renamed from: q */
    private long f100186q;

    /* renamed from: r */
    private boolean f100187r;

    /* renamed from: s */
    private boolean f100188s;

    /* renamed from: t */
    private boolean f100189t;

    /* renamed from: com.ss.android.ugc.aweme.poi.search.a$a */
    public interface C39230a {
        /* renamed from: a */
        void mo79979a();
    }

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    /* renamed from: c */
    public final void mo47029c(List<PoiStruct> list, boolean z) {
    }

    public String getPoiSearchRegionType() {
        return "domestic";
    }

    /* access modifiers changed from: protected */
    public int getSearchType() {
        return 0;
    }

    /* renamed from: e */
    public final void mo47031e() {
        this.f100174e.am_();
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
        this.f100173d.setVisibility(4);
        this.f100175f.mo19212f();
    }

    /* renamed from: d */
    public final void mo79972d() {
        if (this.f100183n != null) {
            this.f100183n.mo79979a();
        }
    }

    private String getCreationId() {
        Map b = C39454n.f100872a.mo80415b(getContext());
        String str = "";
        if (b == null || !b.containsKey("creation_id")) {
            return str;
        }
        return (String) b.get("creation_id");
    }

    public final void ar_() {
        this.f100176g.mo44934a_(Integer.valueOf(4));
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C36286a.m81925a().mo75119a((C36265i) this);
        if (this.f100184o != null && !this.f100184o.isDisposed()) {
            this.f100184o.dispose();
        }
        super.onDetachedFromWindow();
    }

    public final void aJ_() {
        if (this.f100174e.f70699x) {
            this.f100174e.mo54798c(false);
            this.f100174e.notifyDataSetChanged();
            this.f100174e.an_();
        }
        this.f100173d.setVisibility(4);
        this.f100175f.mo19213g();
        m87169j();
        m87165a(false);
    }

    /* renamed from: b */
    public final void mo79970b() {
        String str;
        C39246p pVar = this.f100176g;
        Object[] objArr = new Object[6];
        objArr[0] = Integer.valueOf(1);
        objArr[1] = this.f100170a;
        objArr[2] = this.f100179j;
        objArr[3] = this.f100180k;
        objArr[4] = Integer.valueOf(getSearchType());
        if (TextUtils.isEmpty(this.f100181l)) {
            str = "";
        } else {
            str = this.f100181l;
        }
        objArr[5] = str;
        pVar.mo44934a_(objArr);
        m87167h();
    }

    /* renamed from: c */
    public final void mo79971c() {
        this.f100187r = true;
        C36286a.m81925a();
        if (!C36285u.m81919a(getContext())) {
            C36286a.m81925a();
            C36285u.m81918a((Activity) getContext(), new C47939a() {
                /* renamed from: a */
                public final void mo60068a() {
                    C39227a.this.getLocation();
                }

                /* renamed from: b */
                public final void mo60069b() {
                    boolean z;
                    Boolean bool;
                    String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
                    if (!C0636b.m1719a((Activity) C39227a.this.getContext(), strArr[0]) || !C0636b.m1719a((Activity) C39227a.this.getContext(), strArr[1])) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        C39394p a = C39394p.m87622a();
                        if (a.f100771a == null) {
                            bool = Boolean.valueOf(true);
                        } else {
                            bool = Boolean.valueOf(a.f100771a.getBoolean("poi_is_first_not_ask_again", true));
                        }
                        if (!bool.booleanValue()) {
                            Context context = C39227a.this.getContext();
                            C39235f fVar = new C39235f(this);
                            Builder builder = new Builder(context, R.style.s8);
                            builder.setTitle(R.string.c11);
                            builder.setMessage(R.string.c0y);
                            builder.setPositiveButton(R.string.c10, fVar);
                            builder.setNegativeButton(R.string.c0x, C39445f.f100864a);
                            builder.show();
                        }
                        C39394p a2 = C39394p.m87622a();
                        Boolean valueOf = Boolean.valueOf(false);
                        if (a2.f100771a != null) {
                            a2.f100771a.storeBoolean("poi_is_first_not_ask_again", valueOf.booleanValue());
                        }
                    }
                    if (TextUtils.isEmpty(C39227a.this.f100170a)) {
                        C39227a.this.aJ_();
                    } else {
                        C39227a.this.mo79970b();
                    }
                }
            });
            return;
        }
        getLocation();
    }

    private int getLocationAccuracy() {
        C39054d dVar;
        C36282r a = C36286a.m81925a().mo75118a();
        if (a != null) {
            dVar = new C39054d();
            dVar.time = a.getTime();
            dVar.isGaode = a.isGaode();
            dVar.latitude = a.getLatitude();
            dVar.longitude = a.getLongitude();
            dVar.country = a.getCountry();
            dVar.province = a.getProvince();
            dVar.city = a.getCity();
            dVar.district = a.getDistrict();
            dVar.address = a.getAddress();
            dVar.accuracy = a.getAccuracy();
        } else {
            dVar = null;
        }
        if (dVar == null) {
            return 0;
        }
        float f = dVar.accuracy;
        if (f > 5000.0f) {
            return 0;
        }
        if (f > 1000.0f) {
            return 1;
        }
        if (f > 100.0f) {
            return 2;
        }
        if (f > 15.0f) {
            return 3;
        }
        if (f > 5.0f) {
            return 4;
        }
        return 5;
    }

    /* renamed from: i */
    private boolean m87168i() {
        String str;
        String a = C39454n.f100872a.mo80407a(getContext());
        if (TextUtils.isEmpty(a)) {
            return false;
        }
        String str2 = "search_poi";
        C23089d a2 = C23089d.m56640a().mo47829a("creation_id", getCreationId()).mo47829a("enter_from", a);
        String str3 = "enter_method";
        if (TextUtils.isEmpty(this.f100170a)) {
            str = "default_search_poi";
        } else {
            str = "search_poi";
        }
        C26890h.m65011a(str2, a2.mo47829a(str3, str).mo47829a("key_word", this.f100170a).mo47828a("has_gps", (Object) Boolean.valueOf(this.f100178i)).mo47826a("location_accuracy", getLocationAccuracy()).mo47829a("search_region_type", getPoiSearchRegionType()).f61491a);
        return true;
    }

    /* renamed from: j */
    private void m87169j() {
        C23131p.m56692a("location_log", "", C23088c.m56631a().mo47824a("service", "search_location").mo47824a("errorDesc", "no available locations near by").mo47824a("action", this.f100170a).mo47824a("longitude", this.f100179j).mo47824a("latitude", this.f100180k).mo47824a("type", String.valueOf(getSearchType())).mo47825b());
    }

    public final void bF_() {
        if (!this.f100185p) {
            this.f100185p = true;
            C23131p.m56692a("location_log", "gps_duration", C23088c.m56631a().mo47823a("wait_duration", Long.valueOf(System.currentTimeMillis() - this.f100186q)).mo47825b());
        }
        if (!this.f100189t) {
            C39054d a = C36272l.m81897a(getContext()).mo75072a();
            this.f100188s = true;
            if (a != null) {
                m87164a(a);
            }
            mo79969a(true, this.f100170a);
        }
    }

    public void getLocation() {
        C39054d a = C36272l.m81897a(getContext()).mo75073a((C36265i) this);
        this.f100186q = System.currentTimeMillis();
        if (a != null) {
            m87164a(a);
            mo79970b();
            return;
        }
        if (!this.f100175f.mo19215i()) {
            mo47017R_();
        }
        this.f100188s = false;
        this.f100189t = false;
        this.f100184o.mo6181a(C2201v.m6592a(2, TimeUnit.SECONDS).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C39232c<Object>(this)));
    }

    /* renamed from: h */
    private void m87167h() {
        String str;
        if (!m87168i()) {
            C26890h.onEvent(new MobClick().setLabelName("video_publish_page").setEventName("search_poi").setJsonObject(new C26898j().mo54849a("key_word", this.f100170a).mo54850a()));
            String str2 = "video_publish_page";
            if (this.f100171b) {
                if (this.f100172c) {
                    str2 = "live_take_detail";
                } else {
                    str2 = "live_take_entrance";
                }
            }
            String str3 = "search_poi";
            C23089d a = C23089d.m56640a().mo47829a("enter_from", str2);
            String str4 = "enter_method";
            if (TextUtils.isEmpty(this.f100170a)) {
                str = "default_search_poi";
            } else {
                str = "search_poi";
            }
            C26890h.m65011a(str3, a.mo47829a(str4, str).mo47829a("key_word", this.f100170a).mo47828a("has_gps", (Object) Boolean.valueOf(this.f100178i)).mo47826a("location_accuracy", getLocationAccuracy()).mo47829a("search_region_type", getPoiSearchRegionType()).f61491a);
        }
    }

    public void setHideImmListener(C39230a aVar) {
        this.f100183n = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo79967a(View view) {
        mo79969a(true, this.f100170a);
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        this.f100174e.co_();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo79968a(Long l) throws Exception {
        this.f100189t = true;
        if (!this.f100188s) {
            mo79970b();
        }
    }

    public void setNotShowNoMyLocation(boolean z) {
        if (this.f100174e instanceof C39240k) {
            ((C39240k) this.f100174e).f100197a = z;
        }
    }

    /* renamed from: a */
    private void m87164a(C39054d dVar) {
        this.f100178i = dVar.isValid();
        String[] a = C39440a.m87683a(dVar);
        this.f100180k = a[0];
        this.f100179j = a[1];
    }

    /* renamed from: a */
    private C10722c m87163a(String str) {
        return new C10723a(getContext()).mo19280b((int) R.string.f5o).mo19281b(str).mo19278a(C10720a.BORDER, R.string.f5u, new C39233d(this)).f28711a;
    }

    /* renamed from: a */
    private void m87165a(boolean z) {
        String str;
        if (!m87166b(z)) {
            String str2 = "video_publish_page";
            if (this.f100171b) {
                if (this.f100172c) {
                    str2 = "live_take_detail";
                } else {
                    str2 = "live_take_entrance";
                }
            }
            String str3 = "search_poi_result";
            C23089d a = C23089d.m56640a().mo47829a("enter_from", str2);
            String str4 = "enter_method";
            if (TextUtils.isEmpty(this.f100170a)) {
                str = "default_search_poi";
            } else {
                str = "search_poi";
            }
            C26890h.m65011a(str3, a.mo47829a(str4, str).mo47829a("key_word", this.f100170a).mo47826a("is_success", z ? 1 : 0).mo47829a("log_pb", this.f100176g.mo80001e()).mo47829a("search_region_type", getPoiSearchRegionType()).f61491a);
        }
    }

    /* renamed from: b */
    private boolean m87166b(boolean z) {
        String str;
        String a = C39454n.f100872a.mo80407a(getContext());
        if (TextUtils.isEmpty(a)) {
            return false;
        }
        String str2 = "search_poi_result";
        C23089d a2 = C23089d.m56640a().mo47829a("creation_id", getCreationId()).mo47829a("enter_from", a);
        String str3 = "enter_method";
        if (TextUtils.isEmpty(this.f100170a)) {
            str = "default_search_poi";
        } else {
            str = "search_poi";
        }
        C26890h.m65011a(str2, a2.mo47829a(str3, str).mo47829a("key_word", this.f100170a).mo47826a("is_success", z ? 1 : 0).mo47829a("log_pb", this.f100176g.mo80001e()).mo47829a("search_region_type", getPoiSearchRegionType()).f61491a);
        return true;
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        this.f100173d.setVisibility(4);
        if (this.f100174e.f70699x) {
            this.f100174e.mo54798c(false);
            this.f100174e.notifyDataSetChanged();
        }
        if (exc instanceof C23459a) {
            this.f100175f.setBuilder(this.f100175f.mo19207c().mo19232b(m87163a(((C23459a) exc).getErrorMsg())));
            for (int i = 0; i < this.f100175f.getChildCount(); i++) {
                this.f100175f.getChildAt(i).setOnClickListener(new C39234e(this));
            }
        }
        this.f100175f.mo19214h();
        m87165a(false);
        m87169j();
    }

    public C39227a(Context context, String str) {
        this(context, null, str);
    }

    /* renamed from: a */
    public final void mo47018a(List<PoiStruct> list, boolean z) {
        this.f100174e.mo54798c(true);
        if (!z) {
            this.f100174e.an_();
        } else {
            this.f100174e.ao_();
        }
        if (this.f100177h != null) {
            ((C39238i) this.f100174e).mo79984a(this.f100177h.mo80006a());
        }
        if (TextUtils.isEmpty(this.f100170a)) {
            if (this.f100182m == null) {
                this.f100182m = C39116av.m86940a((C39116av) this.f100177h.getData());
            } else {
                mo79972d();
                this.f100173d.mo4814b(0);
            }
        }
        this.f100174e.mo50303a(list);
        this.f100173d.setVisibility(0);
        this.f100175f.mo19209d();
        m87165a(true);
    }

    /* renamed from: a */
    public final void mo79969a(boolean z, String str) {
        if (this.f100174e instanceof C39238i) {
            ((C39238i) this.f100174e).mo79985a(str);
        }
        if (TextUtils.isEmpty(str)) {
            C36286a.m81925a();
            if (!C36285u.m81919a(getContext())) {
                aJ_();
                return;
            }
        }
        if (TextUtils.isEmpty(str) && this.f100182m != null) {
            this.f100177h.mData = this.f100182m;
            this.f100177h.f100253a = str;
            this.f100170a = "";
            mo47018a(this.f100182m.f99784a, this.f100182m.f99785b);
        } else if (TextUtils.isEmpty(str) || !TextUtils.equals(this.f100170a, str) || this.f100175f.mo19217k()) {
            this.f100170a = str;
            if (C9431p.m18664a(this.f100179j) || C9431p.m18664a(this.f100180k)) {
                if (!this.f100187r) {
                    mo79971c();
                }
                if (!z) {
                    return;
                }
            }
            mo79970b();
        }
    }

    /* renamed from: b */
    public final void mo47026b(List<PoiStruct> list, boolean z) {
        if (list == null || list.isEmpty()) {
            z = false;
        }
        if (!z) {
            this.f100174e.an_();
        } else {
            this.f100174e.ao_();
        }
        if (TextUtils.isEmpty(this.f100170a)) {
            this.f100182m = C39116av.m86940a((C39116av) this.f100177h.getData());
        }
        this.f100174e.mo50304b(list);
    }

    public C39227a(Context context, AttributeSet attributeSet, String str) {
        this(context, null, 0, str);
    }

    private C39227a(Context context, AttributeSet attributeSet, int i, String str) {
        super(context, attributeSet, 0);
        this.f100170a = "";
        this.f100181l = str;
        LayoutInflater.from(getContext()).inflate(R.layout.bmy, this, true);
        this.f100173d = (RecyclerView) findViewById(R.id.c2n);
        this.f100175f = (DmtStatusView) findViewById(R.id.csv);
        DmtStatusView dmtStatusView = this.f100175f;
        C10719a a = C10719a.m21676a(getContext());
        C39231b bVar = new C39231b(this);
        a.mo19229a(new C10723a(a.f28648a).mo19280b((int) R.string.f5w).mo19282c(R.string.f5x).f28711a);
        a.f28650c.setOnClickListener(bVar);
        dmtStatusView.setBuilder(a.mo19232b(m87163a(getContext().getString(R.string.f5k))));
        this.f100174e = new C39240k();
        ((C39240k) this.f100174e).f100198b = getSearchType();
        this.f100173d.setLayoutManager(new WrapLinearLayoutManager(getContext()));
        this.f100174e.mo54788a((C26846a) this);
        this.f100174e.an_();
        this.f100174e.mo54798c(true);
        this.f100173d.setAdapter(this.f100174e);
        this.f100173d.mo4801a((C1340m) new C1340m() {
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                C39227a.this.mo79972d();
            }
        });
        this.f100176g = new C39246p();
        this.f100177h = new C39249s();
        this.f100176g.mo54800a(this);
        this.f100176g.mo54799a(this.f100177h);
        this.f100175f.mo19212f();
        this.f100184o = new C1689b();
    }
}
