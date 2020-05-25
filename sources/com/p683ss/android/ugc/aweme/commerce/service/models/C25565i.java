package com.p683ss.android.ugc.aweme.commerce.service.models;

import android.os.SystemClock;
import com.p683ss.android.ugc.aweme.commerce.service.models.C25554b.C25556b;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.i */
public final class C25565i implements Serializable {
    public static final C25566a Companion = new C25566a(null);

    /* renamed from: A */
    private long f67607A;

    /* renamed from: B */
    private C25553a f67608B;

    /* renamed from: C */
    private boolean f67609C;

    /* renamed from: D */
    private String f67610D;

    /* renamed from: E */
    private String f67611E;

    /* renamed from: F */
    private String f67612F;

    /* renamed from: G */
    private String f67613G;

    /* renamed from: H */
    private long f67614H;

    /* renamed from: a */
    private String f67615a;

    /* renamed from: b */
    private String f67616b;

    /* renamed from: c */
    private String f67617c;

    /* renamed from: d */
    private boolean f67618d;

    /* renamed from: e */
    private boolean f67619e;

    /* renamed from: f */
    private String f67620f;

    /* renamed from: g */
    private String f67621g;

    /* renamed from: h */
    private CommerceUser f67622h;

    /* renamed from: i */
    private String f67623i;

    /* renamed from: j */
    private String f67624j;

    /* renamed from: k */
    private String f67625k;

    /* renamed from: l */
    private String f67626l;

    /* renamed from: m */
    private Boolean f67627m;

    /* renamed from: n */
    private String f67628n;

    /* renamed from: o */
    private String f67629o;

    /* renamed from: p */
    private String f67630p;

    /* renamed from: q */
    private boolean f67631q;

    /* renamed from: r */
    private String f67632r;

    /* renamed from: s */
    private String f67633s;

    /* renamed from: t */
    private String f67634t;

    /* renamed from: u */
    private String f67635u;

    /* renamed from: v */
    private String f67636v;

    /* renamed from: w */
    private String f67637w;

    /* renamed from: x */
    private boolean f67638x;

    /* renamed from: y */
    private String f67639y;

    /* renamed from: z */
    private long f67640z;

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.models.i$a */
    public static final class C25566a {
        private C25566a() {
        }

        public /* synthetic */ C25566a(C52707g gVar) {
            this();
        }
    }

    public static /* synthetic */ void newSourceType$annotations() {
    }

    public final String getAction() {
        return this.f67625k;
    }

    public final String getActivityId() {
        return this.f67628n;
    }

    public final String getAdItemId() {
        return this.f67637w;
    }

    public final C25553a getAdLogExtra() {
        return this.f67608B;
    }

    public final CommerceUser getAuthor() {
        return this.f67622h;
    }

    public final String getAwemeId() {
        return this.f67615a;
    }

    public final String getBackUrl() {
        return this.f67634t;
    }

    public final String getBusinessType() {
        return this.f67611E;
    }

    public final String getCarrierType() {
        return this.f67621g;
    }

    public final long getCurrentPosition() {
        return this.f67607A;
    }

    public final String getEnterFrom() {
        return this.f67612F;
    }

    public final String getEnterMethod() {
        return this.f67613G;
    }

    public final String getEntranceInfo() {
        return this.f67610D;
    }

    public final String getLogPb() {
        return this.f67633s;
    }

    public final String getMetaParam() {
        return this.f67626l;
    }

    public final String getNewSourceId() {
        return this.f67630p;
    }

    public final String getNewSourceType() {
        return this.f67629o;
    }

    public final boolean getNoCache() {
        return this.f67638x;
    }

    public final String getOrderType() {
        return this.f67620f;
    }

    public final String getOriginUserId() {
        return this.f67623i;
    }

    public final String getPreviousPage() {
        return this.f67639y;
    }

    public final String getProductId() {
        return this.f67617c;
    }

    public final String getPromotionId() {
        return this.f67616b;
    }

    public final long getPromotionSource() {
        return this.f67640z;
    }

    public final String getReferSeedId() {
        return this.f67635u;
    }

    public final String getReferSeedName() {
        return this.f67636v;
    }

    public final boolean getReplay() {
        return this.f67618d;
    }

    public final String getSearchKeyword() {
        return this.f67632r;
    }

    public final String getSecOriginUserId() {
        return this.f67624j;
    }

    public final boolean getShowOthers() {
        return this.f67619e;
    }

    public final long getStartPreviewTime() {
        return this.f67614H;
    }

    public final Boolean isAppoint() {
        return this.f67627m;
    }

    public final boolean isFromOthers() {
        return this.f67631q;
    }

    public final boolean isV1Ad() {
        return this.f67609C;
    }

    public final void setAction(String str) {
        this.f67625k = str;
    }

    public final void setActivityId(String str) {
        this.f67628n = str;
    }

    public final void setAdItemId(String str) {
        this.f67637w = str;
    }

    public final void setAdLogExtra(C25553a aVar) {
        this.f67608B = aVar;
    }

    public final void setAppoint(Boolean bool) {
        this.f67627m = bool;
    }

    public final void setAuthor(CommerceUser commerceUser) {
        this.f67622h = commerceUser;
    }

    public final void setAwemeId(String str) {
        this.f67615a = str;
    }

    public final void setBackUrl(String str) {
        this.f67634t = str;
    }

    public final void setBusinessType(String str) {
        this.f67611E = str;
    }

    public final void setCarrierType(String str) {
        this.f67621g = str;
    }

    public final void setCurrentPosition(long j) {
        this.f67607A = j;
    }

    public final void setEntranceInfo(String str) {
        this.f67610D = str;
    }

    public final void setFromOthers(boolean z) {
        this.f67631q = z;
    }

    public final void setLogPb(String str) {
        this.f67633s = str;
    }

    public final void setMetaParam(String str) {
        this.f67626l = str;
    }

    public final void setNewSourceId(String str) {
        this.f67630p = str;
    }

    public final void setNewSourceType(String str) {
        this.f67629o = str;
    }

    public final void setNoCache(boolean z) {
        this.f67638x = z;
    }

    public final void setOrderType(String str) {
        this.f67620f = str;
    }

    public final void setOriginUserId(String str) {
        this.f67623i = str;
    }

    public final void setPreviousPage(String str) {
        this.f67639y = str;
    }

    public final void setProductId(String str) {
        this.f67617c = str;
    }

    public final void setPromotionId(String str) {
        this.f67616b = str;
    }

    public final void setPromotionSource(long j) {
        this.f67640z = j;
    }

    public final void setReferSeedId(String str) {
        this.f67635u = str;
    }

    public final void setReferSeedName(String str) {
        this.f67636v = str;
    }

    public final void setReplay(boolean z) {
        this.f67618d = z;
    }

    public final void setSearchKeyword(String str) {
        this.f67632r = str;
    }

    public final void setSecOriginUserId(String str) {
        this.f67624j = str;
    }

    public final void setShowOthers(boolean z) {
        this.f67619e = z;
    }

    public final void setStartPreviewTime(long j) {
        this.f67614H = j;
    }

    public final void setV1Ad(boolean z) {
        this.f67609C = z;
    }

    public final void setEnterFrom(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f67612F = str;
    }

    public final void setEnterMethod(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f67613G = str;
    }

    public C25565i(String str, String str2, long j) {
        C52711k.m112240b(str, "enterFrom");
        C52711k.m112240b(str2, "enterMethod");
        this.f67612F = str;
        this.f67613G = str2;
        this.f67614H = j;
        this.f67619e = true;
        this.f67640z = C25556b.UNKNOWN.getType();
    }

    public /* synthetic */ C25565i(String str, String str2, long j, int i, C52707g gVar) {
        if ((i & 4) != 0) {
            j = SystemClock.uptimeMillis();
        }
        this(str, str2, j);
    }
}
