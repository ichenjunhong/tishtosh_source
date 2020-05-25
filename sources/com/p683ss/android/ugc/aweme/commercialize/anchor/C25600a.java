package com.p683ss.android.ugc.aweme.commercialize.anchor;

import com.p683ss.android.ugc.aweme.anchor.C22678i;
import com.p683ss.android.ugc.aweme.anchor.p1342a.C22585a;
import com.p683ss.android.ugc.aweme.anchor.p1342a.C22586b;
import com.p683ss.android.ugc.aweme.anchor.p1342a.C22587c;
import com.p683ss.android.ugc.aweme.anchor.p1342a.C22588d;
import com.p683ss.android.ugc.aweme.anchor.p1342a.C22589e;
import com.p683ss.android.ugc.aweme.anchor.p1351c.C22649b;
import com.p683ss.android.ugc.aweme.anchor.p1351c.C22650c;
import com.p683ss.android.ugc.aweme.anchor.p1351c.C22651d;
import com.p683ss.android.ugc.aweme.anchor.p1351c.C22652e;
import com.p683ss.android.ugc.aweme.anchor.p1351c.C22654g;
import com.p683ss.android.ugc.aweme.anchor.p1352d.C22665a;
import com.p683ss.android.ugc.aweme.anchor.p1352d.C22666b;
import com.p683ss.android.ugc.aweme.anchor.p1352d.C22667c;

/* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.a */
public enum C25600a {
    NO_TYPE(-1),
    WIKIPEDIA(0),
    WIKIHOW(1),
    POI(2),
    SHOP(3),
    ARTICLE(5),
    ANCHOR_SHOP_LINK(6),
    SEEDING(7),
    YELP(8),
    TRIP_ADVISOR(9),
    MEDIUM(11),
    UG(12),
    COUPON(13),
    OPEN_PLATFORM_ANCHOR(15),
    MIXED_VIDEO(16),
    BRAND_WIKI(17),
    ANCHOR_RESSO(23),
    DONATION_STICKER(19),
    CLOUD_GAME(-2);
    

    /* renamed from: b */
    private final int f67780b;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.a$a */
    static final class C25601a extends C25600a {
        public final C22651d anchorInfo() {
            return new C22650c();
        }

        public final C22667c anchorMob() {
            return new C22666b();
        }

        public final C22589e adapterFactory(C22678i iVar) {
            return new C22586b(iVar);
        }

        C25601a(String str, int i) {
            super(str, 11, 10, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.a$b */
    static final class C25602b extends C25600a {
        public final C22651d anchorInfo() {
            return new C22652e();
        }

        public final C22589e adapterFactory(C22678i iVar) {
            return new C22588d(iVar);
        }

        C25602b(String str, int i) {
            super(str, 19, 18, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.a$c */
    static final class C25603c extends C25600a {
        public final C22651d anchorInfo() {
            return new C22654g();
        }

        public final C22589e adapterFactory(C22678i iVar) {
            return new C22587c(iVar);
        }

        C25603c(String str, int i) {
            super(str, 5, 4, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.a$d */
    static final class C25604d extends C25600a {
        public final C22651d anchorInfo() {
            return new C22654g();
        }

        public final C22589e adapterFactory(C22678i iVar) {
            return new C22587c(iVar);
        }

        C25604d(String str, int i) {
            super(str, 15, 14, null);
        }
    }

    public final int getTYPE() {
        return this.f67780b;
    }

    public C22651d anchorInfo() {
        return new C22649b();
    }

    public C22667c anchorMob() {
        return new C22665a();
    }

    public C22589e adapterFactory(C22678i iVar) {
        return new C22585a(iVar);
    }

    private C25600a(int i) {
        this.f67780b = i;
    }
}
