package com.p683ss.android.ugc.aweme.poi.p2074ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9431p;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.ugc.aweme.analysis.Analysis;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1912k.C35802a;
import com.p683ss.android.ugc.aweme.poi.model.C39128l;
import com.p683ss.android.ugc.aweme.poi.model.C39129m;
import com.p683ss.android.ugc.aweme.poi.p2059b.C39046f;
import com.p683ss.android.ugc.aweme.poi.p2074ui.detail.p2076a.C39321b;
import com.p683ss.android.ugc.aweme.poi.utils.C39441b;
import com.p683ss.android.ugc.aweme.poi.utils.C39452l;
import com.p683ss.android.ugc.aweme.poi.utils.C39454n;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import org.greenrobot.eventbus.C53771m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity */
public class PoiDetailActivity extends AmeSlideSSActivity {

    /* renamed from: b */
    C39128l f100337b;

    /* renamed from: c */
    private long f100338c;

    /* renamed from: d */
    private String f100339d;

    /* renamed from: e */
    private String f100340e;

    /* renamed from: f */
    private String f100341f;

    /* renamed from: b */
    public final boolean mo48562b() {
        return false;
    }

    /* renamed from: c */
    public final int mo48563c() {
        return 0;
    }

    public Analysis getAnalysis() {
        return null;
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    private void m87275a() {
        this.f100338c = System.currentTimeMillis();
    }

    public void onPause() {
        super.onPause();
        m87277d();
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
        C47718bf.m103291d(this);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity", "onResume", true);
        super.onResume();
        m87275a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity", "onResume", false);
    }

    public void finish() {
        super.finish();
        if (!TextUtils.isEmpty(getIntent().getStringExtra("backurl"))) {
            C39454n nVar = C39454n.f100872a;
            C52711k.m112240b(this, "activity");
            C39454n.m87738a().onDeepLinkFinished(this);
            return;
        }
        if (isTaskRoot()) {
            C41302w.m91042a().mo83858a((Activity) this, "aweme://main");
        }
    }

    /* renamed from: d */
    private void m87277d() {
        String str;
        String str2;
        String str3;
        if (this.f100338c != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f100338c;
            if (currentTimeMillis > 0) {
                C18898c.m46010a(this, "stay_time", "poi_page", currentTimeMillis, 0);
                C39128l lVar = this.f100337b;
                String str4 = "stay_time";
                C23089d a = C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("city_info", C23198ae.m56845a()).mo47829a("enter_method", this.f100341f).mo47827a("duration", currentTimeMillis).mo47829a("poi_id", this.f100339d);
                String str5 = "poi_type";
                if (this.f100337b != null) {
                    str = this.f100337b.poiType;
                } else {
                    str = "";
                }
                C23089d a2 = a.mo47829a(str5, str);
                String str6 = "group_id";
                if (this.f100337b != null) {
                    str2 = this.f100337b.awemeid;
                } else {
                    str2 = "";
                }
                C23089d a3 = a2.mo47829a(str6, str2);
                String str7 = "author_id";
                if (this.f100337b != null) {
                    str3 = this.f100337b.authorId;
                } else {
                    str3 = "";
                }
                C39452l.m87733a(lVar, str4, a3.mo47829a(str7, str3).mo47829a("poi_channel", this.f100340e).mo47829a("page_type", "list").mo47829a("previous_page", this.f100341f));
            }
            this.f100338c = -1;
        }
    }

    @C53771m
    public void onEvent(C39046f fVar) {
        if (fVar != null && !TextUtils.isEmpty(fVar.f99541b) && isActive() && fVar.f99541b.equalsIgnoreCase(this.f100339d)) {
            if (fVar.f99540a.booleanValue()) {
                m87275a();
                C39321b a = C39321b.m87415a();
                if (a.f100523b != null) {
                    a.f100523b.mo80158i();
                }
                return;
            }
            m87277d();
            C39321b a2 = C39321b.m87415a();
            if (a2.f100523b != null) {
                a2.f100523b.mo80157h();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        int i;
        String str13;
        String str14;
        String str15;
        HashMap hashMap;
        String str16;
        String str17;
        String str18;
        String str19;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bks);
        findViewById(R.id.yw).setBackgroundColor(getResources().getColor(R.color.a0_));
        C39454n nVar = C39454n.f100872a;
        C52711k.m112240b(this, "activity");
        C39454n.m87738a().disableStartActivityIfNeeded(this);
        C39454n nVar2 = C39454n.f100872a;
        C39454n.m87738a().tryLoadAwemeMapPlugin();
        this.f100337b = (C39128l) getIntent().getSerializableExtra("poi_bundle");
        if (this.f100337b == null) {
            String stringExtra = getIntent().getStringExtra("id");
            String stringExtra2 = getIntent().getStringExtra("enter_from");
            String stringExtra3 = getIntent().getStringExtra("content_source");
            C39129m h = new C39129m().mo79718a(stringExtra).mo79726h(stringExtra2);
            h.f99836b = stringExtra3;
            this.f100337b = h.mo79713a();
        }
        C39128l lVar = this.f100337b;
        if (lVar != null) {
            str = lVar.from;
        } else {
            str = "";
        }
        if (lVar != null) {
            str2 = lVar.cityCode;
        } else {
            str2 = "";
        }
        if (lVar != null) {
            str3 = lVar.poiChannel;
        } else {
            str3 = "";
        }
        C23089d a = C23089d.m56640a();
        C23089d a2 = a.mo47829a("enter_from", str);
        String str20 = "group_id";
        if (lVar != null) {
            str4 = lVar.awemeid;
        } else {
            str4 = "";
        }
        C23089d a3 = a2.mo47829a(str20, str4);
        String str21 = "poi_type";
        if (lVar != null) {
            str5 = lVar.poiType;
        } else {
            str5 = "";
        }
        C23089d a4 = a3.mo47829a(str21, str5);
        String str22 = "poi_id";
        if (lVar != null) {
            str6 = lVar.poiId;
        } else {
            str6 = "";
        }
        C23089d a5 = a4.mo47829a(str22, str6);
        String str23 = "to_user_id";
        if (lVar != null) {
            str7 = lVar.toUserId;
        } else {
            str7 = "";
        }
        C23089d a6 = a5.mo47829a(str23, str7);
        String str24 = "from_user_id";
        if (lVar != null) {
            str8 = lVar.fromUserId;
        } else {
            str8 = "";
        }
        C23089d a7 = a6.mo47829a(str24, str8);
        String str25 = "poi_channel";
        if (TextUtils.isEmpty(str3)) {
            str3 = C23198ae.m56852b();
        }
        C23089d a8 = a7.mo47829a(str25, str3);
        String str26 = "enter_method";
        if (lVar != null) {
            str9 = lVar.clickMethod;
        } else {
            str9 = "";
        }
        C23089d a9 = a8.mo47829a(str26, str9);
        String str27 = "author_id";
        if (lVar != null) {
            str10 = lVar.authorId;
        } else {
            str10 = "";
        }
        C23089d a10 = a9.mo47829a(str27, str10);
        String str28 = "city_info";
        if (TextUtils.isEmpty(str2)) {
            str2 = C23198ae.m56845a();
        }
        C23089d a11 = a10.mo47829a(str28, str2);
        String str29 = "is_coupon";
        if (lVar != null) {
            str11 = lVar.isCoupon;
        } else {
            str11 = "";
        }
        C23089d a12 = a11.mo47829a(str29, str11);
        String str30 = "distance_info";
        if (lVar != null) {
            str12 = lVar.distanceInfo;
        } else {
            str12 = "";
        }
        C23089d a13 = a12.mo47829a(str30, str12);
        String str31 = "order";
        if (lVar != null) {
            i = lVar.order;
        } else {
            i = -1;
        }
        C23089d a14 = a13.mo47826a(str31, i);
        String str32 = "search_keyword";
        if (lVar != null) {
            str13 = lVar.searchKeyWord;
        } else {
            str13 = "";
        }
        C23089d a15 = a14.mo47829a(str32, str13);
        String str33 = "content_type";
        if (lVar != null) {
            str14 = lVar.contentType;
        } else {
            str14 = "";
        }
        C23089d a16 = a15.mo47829a(str33, str14);
        String str34 = "previous_page";
        if (lVar != null) {
            str15 = lVar.previousPage;
        } else {
            str15 = "";
        }
        C23089d a17 = a16.mo47829a(str34, str15);
        String str35 = null;
        if (lVar != null) {
            hashMap = lVar.forwardTypeV3Params;
        } else {
            hashMap = null;
        }
        a17.mo47830a(hashMap);
        if (lVar != null) {
            if (!TextUtils.isEmpty(lVar.bannerId)) {
                a.mo47829a("banner_id", lVar.bannerId);
            }
            if (!TextUtils.isEmpty(lVar.fromPoiId)) {
                a.mo47829a("from_poi_id", lVar.fromPoiId);
            }
            if (!TextUtils.isEmpty(lVar.poiLabelType)) {
                a.mo47829a("poi_label_type", lVar.poiLabelType);
            }
            if (!TextUtils.isEmpty(lVar.activityId)) {
                a.mo47829a("from_activity_id", lVar.activityId);
            }
            if (!TextUtils.isEmpty(lVar.couponId)) {
                a.mo47829a("from_coupon_id", lVar.couponId);
            }
            if (!TextUtils.isEmpty(lVar.rankIndex)) {
                a.mo47829a("rank_index", lVar.rankIndex);
            }
            if (!TextUtils.isEmpty(lVar.subClass)) {
                a.mo47829a("sub_class", lVar.subClass);
            }
            if (!TextUtils.isEmpty(lVar.districtCode)) {
                a.mo47829a("district_code", lVar.districtCode);
            }
            if (!TextUtils.isEmpty(lVar.tabName)) {
                a.mo47829a("tab_name", lVar.tabName);
            }
            if (!TextUtils.isEmpty(lVar.contentSource)) {
                a.mo47829a("content_source", lVar.contentSource);
            }
            if (!TextUtils.isEmpty(lVar.pagePoiId)) {
                a.mo47829a("page_poi_id", lVar.pagePoiId);
            }
            if (!TextUtils.isEmpty(lVar.anchorId)) {
                a.mo47829a("anchor_id", lVar.anchorId);
            }
            if (!TextUtils.isEmpty(lVar.roomId)) {
                a.mo47829a("room_id", lVar.roomId);
            }
            if (!TextUtils.isEmpty(lVar.distanceKm)) {
                a.mo47829a("distance_km", lVar.distanceKm);
            }
        }
        if ((TextUtils.equals(str, "homepage_fresh") || TextUtils.equals(str, "homepage_channel")) && C35802a.m80931b()) {
            a.mo47829a("tab_name", C35802a.m80930a());
        }
        if (C23198ae.m56860d(str) && !TextUtils.isEmpty(str)) {
            if (lVar != null) {
                str19 = lVar.logPb;
            } else {
                str19 = "";
            }
            if (TextUtils.isEmpty(str19)) {
                C29981aa a18 = C29981aa.m70153a();
                if (lVar != null) {
                    str35 = lVar.requestId;
                }
                str19 = a18.mo60161a(str35);
            }
            a.mo47829a("log_pb", str19);
            String str36 = "enter_poi_detail";
            if (lVar != null) {
                if (!TextUtils.isEmpty(lVar.backendType)) {
                    a.mo47829a("poi_backend_type", lVar.backendType);
                }
                C39452l.m87734a(lVar.cityCode, a);
            }
            C26890h.m65012a(str36, C23198ae.m56851a(a.f61491a));
        } else if (!TextUtils.isEmpty(str)) {
            C39452l.m87733a(lVar, "enter_poi_detail", a);
        }
        if (this.f100337b != null) {
            str16 = this.f100337b.poiId;
        } else {
            str16 = "";
        }
        this.f100339d = str16;
        if (this.f100337b != null) {
            str17 = this.f100337b.from;
        } else {
            str17 = "";
        }
        this.f100341f = str17;
        if (this.f100337b != null) {
            str18 = this.f100337b.poiChannel;
        } else {
            str18 = "";
        }
        this.f100340e = str18;
        if (C9431p.m18664a(this.f100339d)) {
            finish();
        } else {
            C0679r a19 = getSupportFragmentManager().mo2225a();
            Fragment a20 = C39407s.m87631a(this.f100337b);
            if (a20 == null) {
                finish();
            } else {
                a20.setUserVisibleHint(true);
                a19.mo2192b(R.id.yw, a20, "poi_detail_fragment_tag");
                a19.mo2195c();
            }
        }
        C39441b.m87689b(ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a8w));
        C47718bf.m103290c(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m87276a(Context context, C39128l lVar) {
        Intent intent = new Intent(context, PoiDetailActivity.class);
        intent.putExtra("poi_bundle", lVar);
        context.startActivity(intent);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47937a.m103720a((Activity) this, i, strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }
}
