package com.p683ss.android.ugc.aweme.poi.model;

import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.poi.model.m */
public final class C39129m {

    /* renamed from: A */
    private String f99824A = "click_label";

    /* renamed from: B */
    private String f99825B;

    /* renamed from: C */
    private Aweme f99826C;

    /* renamed from: D */
    private String f99827D;

    /* renamed from: E */
    private String f99828E;

    /* renamed from: F */
    private String f99829F;

    /* renamed from: G */
    private String f99830G;

    /* renamed from: H */
    private String f99831H;

    /* renamed from: I */
    private String f99832I;

    /* renamed from: J */
    private String f99833J;

    /* renamed from: K */
    private int f99834K;

    /* renamed from: a */
    public String f99835a;

    /* renamed from: b */
    public String f99836b;

    /* renamed from: c */
    public boolean f99837c;

    /* renamed from: d */
    public String f99838d;

    /* renamed from: e */
    public String f99839e;

    /* renamed from: f */
    public String f99840f;

    /* renamed from: g */
    public int f99841g;

    /* renamed from: h */
    public String f99842h;

    /* renamed from: i */
    public String f99843i;

    /* renamed from: j */
    public String f99844j;

    /* renamed from: k */
    public String f99845k;

    /* renamed from: l */
    public String f99846l;

    /* renamed from: m */
    public String f99847m;

    /* renamed from: n */
    public String f99848n;

    /* renamed from: o */
    public String f99849o;

    /* renamed from: p */
    public boolean f99850p;

    /* renamed from: q */
    public String f99851q;

    /* renamed from: r */
    public String f99852r;

    /* renamed from: s */
    public String f99853s;

    /* renamed from: t */
    public HashMap<String, String> f99854t;

    /* renamed from: u */
    public String f99855u;

    /* renamed from: v */
    private String f99856v;

    /* renamed from: w */
    private String f99857w;

    /* renamed from: x */
    private String f99858x;

    /* renamed from: y */
    private String f99859y;

    /* renamed from: z */
    private String f99860z;

    /* renamed from: a */
    public final C39128l mo79713a() {
        C39128l lVar = new C39128l();
        lVar.pagePoiId = this.f99835a;
        lVar.poiId = this.f99856v;
        lVar.activityId = this.f99843i;
        lVar.couponId = this.f99844j;
        lVar.rankIndex = this.f99845k;
        lVar.subClass = this.f99846l;
        lVar.districtCode = this.f99847m;
        lVar.poiType = this.f99858x;
        lVar.poiName = this.f99857w;
        lVar.from = this.f99859y;
        lVar.contentSource = this.f99836b;
        lVar.awemeid = this.f99860z;
        lVar.toUserId = this.f99838d;
        lVar.fromUserId = this.f99839e;
        lVar.clickMethod = this.f99824A;
        lVar.isPreviewMode = this.f99837c;
        lVar.pageType = this.f99825B;
        lVar.forwardTypeV3Params = this.f99854t;
        lVar.distanceInfo = m86946e(this.f99826C);
        lVar.requestId = m86945d(this.f99826C);
        lVar.authorId = m86944c(this.f99826C);
        if (!TextUtils.isEmpty(this.f99833J)) {
            lVar.authorId = this.f99833J;
        }
        if (C9431p.m18664a(this.f99860z)) {
            lVar.awemeid = m86943b(this.f99826C);
        } else {
            lVar.awemeid = this.f99860z;
        }
        lVar.poiChannel = this.f99831H;
        lVar.searchKeyWord = this.f99840f;
        lVar.logPb = this.f99832I;
        lVar.order = this.f99841g;
        lVar.isCoupon = this.f99827D;
        lVar.bannerId = this.f99828E;
        lVar.fromPoiId = this.f99829F;
        lVar.poiLabelType = this.f99830G;
        lVar.contentType = this.f99842h;
        lVar.displayStyle = this.f99834K;
        lVar.hasActivity = this.f99850p;
        lVar.challengeId = this.f99851q;
        lVar.sticker = this.f99852r;
        lVar.backendType = this.f99848n;
        lVar.cityCode = this.f99849o;
        lVar.previousPage = this.f99853s;
        lVar.distanceKm = this.f99855u;
        return lVar;
    }

    /* renamed from: a */
    public final C39129m mo79718a(String str) {
        this.f99856v = str;
        return this;
    }

    /* renamed from: b */
    public final C39129m mo79720b(String str) {
        this.f99845k = str;
        return this;
    }

    /* renamed from: c */
    public final C39129m mo79721c(String str) {
        this.f99846l = str;
        return this;
    }

    /* renamed from: d */
    public final C39129m mo79722d(String str) {
        this.f99847m = str;
        return this;
    }

    /* renamed from: e */
    public final C39129m mo79723e(String str) {
        this.f99858x = str;
        return this;
    }

    /* renamed from: f */
    public final C39129m mo79724f(String str) {
        this.f99857w = str;
        return this;
    }

    /* renamed from: g */
    public final C39129m mo79725g(String str) {
        this.f99833J = str;
        return this;
    }

    /* renamed from: h */
    public final C39129m mo79726h(String str) {
        this.f99859y = str;
        return this;
    }

    /* renamed from: i */
    public final C39129m mo79727i(String str) {
        this.f99825B = str;
        return this;
    }

    /* renamed from: j */
    public final C39129m mo79728j(String str) {
        this.f99860z = str;
        return this;
    }

    /* renamed from: k */
    public final C39129m mo79729k(String str) {
        this.f99824A = str;
        return this;
    }

    /* renamed from: l */
    public final C39129m mo79730l(String str) {
        this.f99831H = str;
        return this;
    }

    /* renamed from: m */
    public final C39129m mo79731m(String str) {
        this.f99832I = str;
        return this;
    }

    /* renamed from: n */
    public final C39129m mo79732n(String str) {
        this.f99827D = str;
        return this;
    }

    /* renamed from: o */
    public final C39129m mo79733o(String str) {
        this.f99828E = str;
        return this;
    }

    /* renamed from: p */
    public final C39129m mo79734p(String str) {
        this.f99829F = str;
        return this;
    }

    /* renamed from: q */
    public final C39129m mo79735q(String str) {
        this.f99830G = str;
        return this;
    }

    /* renamed from: r */
    public final C39129m mo79736r(String str) {
        this.f99842h = str;
        return this;
    }

    /* renamed from: s */
    public final C39129m mo79737s(String str) {
        this.f99853s = str;
        return this;
    }

    /* renamed from: t */
    public final C39129m mo79738t(String str) {
        this.f99849o = str;
        return this;
    }

    /* renamed from: a */
    public final C39129m mo79719a(HashMap<String, String> hashMap) {
        this.f99854t = hashMap;
        return this;
    }

    /* renamed from: b */
    private static String m86943b(Aweme aweme) {
        if (aweme != null) {
            return aweme.getAid();
        }
        return "";
    }

    /* renamed from: e */
    private static String m86946e(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        return m86947u(aweme.getDistance());
    }

    /* renamed from: a */
    public final C39129m mo79714a(Aweme aweme) {
        this.f99826C = aweme;
        this.f99860z = m86943b(aweme);
        return this;
    }

    /* renamed from: c */
    private static String m86944c(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getAuthor() != null) {
            return aweme.getAuthor().getUid();
        }
        return "";
    }

    /* renamed from: d */
    private static String m86945d(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getRequestId() != null) {
            return aweme.getRequestId();
        }
        return "";
    }

    /* renamed from: a */
    public final C39129m mo79715a(SimplePoiInfoStruct simplePoiInfoStruct) {
        if (simplePoiInfoStruct != null) {
            this.f99848n = simplePoiInfoStruct.getPoiBackendType();
            if (!TextUtils.isEmpty(simplePoiInfoStruct.getCityCode())) {
                this.f99849o = simplePoiInfoStruct.getCityCode();
            }
        }
        return this;
    }

    /* renamed from: a */
    public final C39129m mo79716a(C39067g gVar) {
        if (gVar != null) {
            this.f99848n = gVar.getBackendType();
            if (!TextUtils.isEmpty(gVar.getPoiCity())) {
                this.f99849o = gVar.getPoiCity();
            }
        }
        return this;
    }

    /* renamed from: u */
    private static String m86947u(String str) {
        float f;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if ("<1km".equalsIgnoreCase(str)) {
            return "type_0_1";
        }
        if (">100km".equalsIgnoreCase(str)) {
            return "type_20+";
        }
        int indexOf = str.indexOf("km");
        if (indexOf == -1) {
            return "";
        }
        try {
            f = Float.parseFloat(str.substring(0, indexOf));
        } catch (Exception unused) {
            f = 0.0f;
        }
        if (f <= 1.0f) {
            return "type_0_1";
        }
        if (f > 1.0f && f <= 3.0f) {
            return "type_1_3";
        }
        if (f > 3.0f && f <= 5.0f) {
            return "type_3_5";
        }
        if (f > 5.0f && f <= 10.0f) {
            return "type_5_10";
        }
        if (f > 10.0f && f <= 20.0f) {
            return "type_10_20";
        }
        if (f > 20.0f) {
            return "type_20+";
        }
        return "";
    }

    /* renamed from: a */
    public final C39129m mo79717a(PoiStruct poiStruct) {
        if (poiStruct != null) {
            this.f99848n = poiStruct.getBackendTypeCode();
            if (poiStruct.getAddress() != null) {
                this.f99849o = poiStruct.getAddress().cityCode;
            }
        }
        return this;
    }
}
