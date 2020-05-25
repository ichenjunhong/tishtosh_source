package com.p683ss.android.ugc.aweme.poi.p2058a;

import com.p683ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37859b;
import com.p683ss.android.ugc.aweme.poi.model.C39109ao;
import java.io.Serializable;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.a.j */
public final class C38965j extends C37859b implements Serializable {
    public static final C38966a Companion = new C38966a(null);
    public static final int TYPE_EXPLORE = 2;
    public static final int TYPE_FOOD = 3;
    public static final int TYPE_HOTEL = 5;
    public static final int TYPE_NEARBY = 1;
    public static final int TYPE_SCENE = 4;

    /* renamed from: a */
    private boolean f99243a;

    /* renamed from: b */
    private boolean f99244b = true;

    /* renamed from: c */
    private final Integer f99245c;

    /* renamed from: d */
    private final C39109ao f99246d;

    /* renamed from: com.ss.android.ugc.aweme.poi.a.j$a */
    public static final class C38966a implements Serializable {
        private C38966a() {
        }

        public final int getTYPE_EXPLORE() {
            return C38965j.TYPE_EXPLORE;
        }

        public final int getTYPE_FOOD() {
            return C38965j.TYPE_FOOD;
        }

        public final int getTYPE_HOTEL() {
            return C38965j.TYPE_HOTEL;
        }

        public final int getTYPE_NEARBY() {
            return C38965j.TYPE_NEARBY;
        }

        public final int getTYPE_SCENE() {
            return C38965j.TYPE_SCENE;
        }

        public /* synthetic */ C38966a(C52707g gVar) {
            this();
        }
    }

    public final int getFeedType() {
        return 65451;
    }

    public final boolean getHideDivider() {
        return this.f99243a;
    }

    public final boolean getHideTopDivider() {
        return this.f99244b;
    }

    public final Integer getRecommendType() {
        return this.f99245c;
    }

    public final void setFeedType(int i) {
    }

    public final void addNullItem() {
        this.f99246d.addNullItem();
    }

    public final boolean hasMore() {
        return this.f99246d.hasMore();
    }

    public final List<SimplePoiInfoStruct> list() {
        List<SimplePoiInfoStruct> list = this.f99246d.list;
        C52711k.m112236a((Object) list, "recommendPoi.list");
        return list;
    }

    public final String title() {
        String str = this.f99246d.title;
        C52711k.m112236a((Object) str, "recommendPoi.title");
        return str;
    }

    public final void setHideDivider(boolean z) {
        this.f99243a = z;
    }

    public final void setHideTopDivider(boolean z) {
        this.f99244b = z;
    }

    public C38965j(Integer num, C39109ao aoVar) {
        C52711k.m112240b(num, "recommendType");
        C52711k.m112240b(aoVar, "recommendPoi");
        this.f99245c = num;
        this.f99246d = aoVar;
    }
}
