package com.p683ss.android.ugc.aweme.p1382aq;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a;
import com.p683ss.android.ugc.aweme.p1912k.C35802a;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;

/* renamed from: com.ss.android.ugc.aweme.aq.ar */
public final class C23212ar extends C23231d {

    /* renamed from: A */
    private String f61774A;

    /* renamed from: B */
    private String f61775B;

    /* renamed from: C */
    private String f61776C;

    /* renamed from: D */
    private String f61777D;

    /* renamed from: E */
    private String f61778E;

    /* renamed from: F */
    private String f61779F;

    /* renamed from: G */
    private String f61780G;

    /* renamed from: H */
    private String f61781H;

    /* renamed from: I */
    private String f61782I;

    /* renamed from: J */
    private Aweme f61783J;

    /* renamed from: K */
    private String f61784K;

    /* renamed from: L */
    private String f61785L;

    /* renamed from: M */
    private String f61786M;

    /* renamed from: N */
    private String f61787N;

    /* renamed from: O */
    private String f61788O;

    /* renamed from: a */
    public String f61789a;

    /* renamed from: b */
    public String f61790b;

    /* renamed from: c */
    private String f61791c;

    /* renamed from: d */
    private String f61792d;

    /* renamed from: e */
    private Long f61793e;

    public C23212ar() {
        super("client_show");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47948a() {
        mo48074c();
        if (!TextUtils.isEmpty(this.f61780G)) {
            mo48072a("rank_index", this.f61780G, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61781H)) {
            mo48072a("banner_id", this.f61781H, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61782I)) {
            mo48072a("previous_page", this.f61782I, C23232a.f62005a);
        }
        mo48072a("enter_from", this.f61985g, C23232a.f62005a);
        mo48072a("group_id", this.f61791c, C23232a.f62006b);
        mo48072a("author_id", this.f61792d, C23232a.f62006b);
        if (!TextUtils.isEmpty(this.f61788O)) {
            mo48072a("topic_name", this.f61788O, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61790b)) {
            mo48072a("tab_name", this.f61790b, C23232a.f62005a);
        }
        if (TextUtils.equals(this.f61985g, "homepage_fresh") && C35802a.m80931b()) {
            if (TextUtils.isEmpty(this.f61789a)) {
                this.f61789a = "Nearby";
            }
            mo48072a("tab_name", this.f61789a, C23232a.f62005a);
            if (!(this.f61783J == null || this.f61783J.getStatistics() == null)) {
                mo48072a("like_cnt", C33095b.m76068a(this.f61783J.getStatistics().getDiggCount()), C23232a.f62005a);
            }
        }
        mo48072a("request_id", this.f61778E, C23232a.f62006b);
        mo48072a(C42311c.f106865i, this.f61776C, C23232a.f62005a);
        if ("prop_page".equals(this.f61985g)) {
            mo48072a("prop_id", this.f61774A, C23232a.f62006b);
            mo48072a("log_pb", C29981aa.m70153a().mo60161a(this.f61778E), C23232a.f62006b);
        } else {
            mo48072a("music_id", String.valueOf(this.f61793e), C23232a.f62006b);
            if ("homepage_fresh".equals(this.f61985g) || "categorized_city_poi".equalsIgnoreCase(this.f61985g) || "homepage_channel".equalsIgnoreCase(this.f61985g)) {
                mo48078i(this.f61778E);
            }
        }
        mo48072a("display", this.f61777D, C23232a.f62005a);
        if (!TextUtils.isEmpty(this.f61779F)) {
            mo48072a("distance_km", this.f61779F, C23232a.f62005a);
        }
        String str = this.f61985g;
        String str2 = this.f61784K;
        String str3 = this.f61786M;
        String str4 = this.f61785L;
        if (C23198ae.m56866g(str)) {
            mo48069a("process_id", str2);
            mo48069a("tag_id", str3);
            mo48069a("rank_index", str4);
        }
        if (!TextUtils.isEmpty(this.f61787N)) {
            mo48072a("page_type", this.f61787N, C23232a.f62005a);
        }
    }

    /* renamed from: a */
    public final C23212ar mo47997a(String str) {
        this.f61985g = str;
        return this;
    }

    /* renamed from: b */
    public final C23212ar mo47998b(String str) {
        this.f61784K = str;
        return this;
    }

    /* renamed from: c */
    public final C23212ar mo48000c(String str) {
        this.f61785L = str;
        return this;
    }

    /* renamed from: d */
    public final C23212ar mo48001d(String str) {
        this.f61786M = str;
        return this;
    }

    /* renamed from: e */
    public final C23212ar mo48002e(String str) {
        this.f61777D = str;
        return this;
    }

    /* renamed from: c */
    public final C23212ar mo47999c(Aweme aweme, int i) {
        String str;
        long j;
        mo48071a(aweme);
        this.f61783J = aweme;
        if (aweme != null) {
            this.f61791c = aweme.getAid();
            this.f61792d = m57044d(aweme);
            this.f61778E = m57042a(aweme, i);
            int awemeType = aweme.getAwemeType();
            if (awemeType == 2) {
                str = "photo";
            } else if (awemeType != 101) {
                switch (awemeType) {
                    case 3001:
                        str = "leaderboard";
                        break;
                    case 3002:
                        str = "operation_card";
                        break;
                    default:
                        str = "video";
                        break;
                }
            } else {
                str = CustomActionPushReceiver.f104061f;
            }
            this.f61776C = str;
            if (aweme.getMusic() == null) {
                j = 0;
            } else {
                j = aweme.getMusic().getId();
            }
            this.f61793e = Long.valueOf(j);
            this.f61775B = aweme.getAid();
            this.f61779F = C23198ae.m56849a(aweme.getDistance());
            if (aweme.isPoiRank()) {
                this.f61989k = aweme.getPoiRankCardStruct().getBackendTypeCode();
                this.f61780G = String.valueOf(aweme.getPoiRankCardStruct().getLocationIndex() + 1);
            }
            if (aweme.isPoiOperate()) {
                this.f61781H = aweme.getPoiOpCardStruct().getCardId();
                this.f61780G = String.valueOf(aweme.getPoiOpCardStruct().getLocationIndex() + 1);
            }
            if (aweme.getHotListStruct() != null && aweme.getHotListStruct().getType() == 9) {
                this.f61788O = aweme.getHotListStruct().getTitile();
            }
        }
        return this;
    }
}
