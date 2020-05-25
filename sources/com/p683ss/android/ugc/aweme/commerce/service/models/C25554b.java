package com.p683ss.android.ugc.aweme.commerce.service.models;

import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.commerce.model.PromotionVisitor;
import java.io.Serializable;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.b */
public final class C25554b implements Serializable {
    public static final C25555a Companion = new C25555a(null);
    @C17952c(mo34828a = "promotion_id")

    /* renamed from: a */
    private String f67531a = "";
    @C17952c(mo34828a = "product_id")

    /* renamed from: b */
    private String f67532b = "";
    @C17952c(mo34828a = "title")

    /* renamed from: c */
    private String f67533c = "";
    @C17952c(mo34828a = "detail_url")

    /* renamed from: d */
    private String f67534d = "";
    @C17952c(mo34828a = "elastic_title")

    /* renamed from: e */
    private String f67535e = "";
    @C17952c(mo34828a = "elastic_introduction")

    /* renamed from: f */
    private String f67536f = "";
    @C17952c(mo34828a = "status")

    /* renamed from: g */
    private int f67537g = 2;
    @C17952c(mo34828a = "promotion_source")

    /* renamed from: h */
    private long f67538h = C25556b.UNKNOWN.getType();
    @C17952c(mo34828a = "elastic_type")

    /* renamed from: i */
    private int f67539i;
    @C17952c(mo34828a = "market_price")

    /* renamed from: j */
    private Integer f67540j;
    @C17952c(mo34828a = "min_price")

    /* renamed from: k */
    private int f67541k;
    @C17952c(mo34828a = "max_price")

    /* renamed from: l */
    private Integer f67542l;
    @C17952c(mo34828a = "sales")

    /* renamed from: m */
    private int f67543m = -1;
    @C17952c(mo34828a = "images")

    /* renamed from: n */
    private List<? extends UrlModel> f67544n = C52575l.m112097a();
    @C17952c(mo34828a = "elastic_images")

    /* renamed from: o */
    private List<? extends UrlModel> f67545o = C52575l.m112097a();
    @C17952c(mo34828a = "label")

    /* renamed from: p */
    private List<String> f67546p = C52575l.m112097a();
    @C17952c(mo34828a = "taobao")

    /* renamed from: q */
    private C25569l f67547q;
    @C17952c(mo34828a = "toutiao")

    /* renamed from: r */
    private C25567j f67548r;
    @C17952c(mo34828a = "visitor")

    /* renamed from: s */
    private PromotionVisitor f67549s;
    @C17952c(mo34828a = "small_app_url")

    /* renamed from: t */
    private String f67550t;
    @C17952c(mo34828a = "brand_icon")

    /* renamed from: u */
    private UrlModel f67551u;
    @C17952c(mo34828a = "open_app_url")

    /* renamed from: v */
    private String f67552v;
    @C17952c(mo34828a = "goods_source")

    /* renamed from: w */
    private String f67553w = "";
    @C17952c(mo34828a = "buy_button")

    /* renamed from: x */
    private C25559d f67554x;

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.models.b$a */
    public static final class C25555a {
        private C25555a() {
        }

        public /* synthetic */ C25555a(C52707g gVar) {
            this();
        }

        /* renamed from: b */
        public static boolean m62088b(long j) {
            if (j == C25556b.JINGDONG.getType()) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public static boolean m62089c(long j) {
            if (j == C25556b.KAOLA.getType()) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public static boolean m62091e(long j) {
            if (!C25557a.m62092a(Long.valueOf(j))) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public static boolean m62090d(long j) {
            if (j == C25556b.JINGDONG.getType() || j == C25556b.KAOLA.getType()) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public static boolean m62087a(long j) {
            if (j == C25556b.TAOBAO.getType() || j == C25556b.TAOBAO_PHONE.getType() || j == C25556b.TAOBAO_COMMAND.getType()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.models.b$b */
    public enum C25556b {
        TAOBAO(1),
        GAME(2),
        EASY_GO(3),
        EASY_GO_SELECTED(4),
        TAOBAO_PHONE(5),
        XIAO_DIAN(6),
        TAOBAO_COMMAND(7),
        JINGDONG(8),
        KAOLA(9),
        UNKNOWN(-1);
        
        public static final C25557a Companion = null;

        /* renamed from: b */
        private final long f67556b;

        /* renamed from: com.ss.android.ugc.aweme.commerce.service.models.b$b$a */
        public static final class C25557a {
            private C25557a() {
            }

            public /* synthetic */ C25557a(C52707g gVar) {
                this();
            }

            /* renamed from: a */
            public static boolean m62092a(Long l) {
                if (l == null) {
                    return false;
                }
                for (C25556b type : C25556b.values()) {
                    long type2 = type.getType();
                    if (l != null && type2 == l.longValue()) {
                        return true;
                    }
                }
                return false;
            }
        }

        public final long getType() {
            return this.f67556b;
        }

        static {
            Companion = new C25557a(null);
        }

        private C25556b(long j) {
            this.f67556b = j;
        }
    }

    public static final boolean isJDGood(long j) {
        return C25555a.m62088b(j);
    }

    public static final boolean isKaolaGood(long j) {
        return C25555a.m62089c(j);
    }

    public static final boolean isTaobaoGood(long j) {
        return C25555a.m62087a(j);
    }

    public final UrlModel getBrandIcon() {
        return this.f67551u;
    }

    public final C25559d getBuyBtn() {
        return this.f67554x;
    }

    public final long getCommodityType() {
        return this.f67538h;
    }

    public final String getDetailUrl() {
        return this.f67534d;
    }

    public final List<UrlModel> getElasticImages() {
        return this.f67545o;
    }

    public final String getElasticIntroduction() {
        return this.f67536f;
    }

    public final String getElasticTitle() {
        return this.f67535e;
    }

    public final int getElasticType() {
        return this.f67539i;
    }

    public final String getGoodsSource() {
        return this.f67553w;
    }

    public final List<UrlModel> getImages() {
        return this.f67544n;
    }

    public final String getJumpToAppUrl() {
        return this.f67552v;
    }

    public final List<String> getLabels() {
        return this.f67546p;
    }

    public final Integer getMarketPrice() {
        return this.f67540j;
    }

    public final Integer getMaxPrice() {
        return this.f67542l;
    }

    public final int getMinPrice() {
        return this.f67541k;
    }

    public final String getProductId() {
        return this.f67532b;
    }

    public final String getPromotionId() {
        return this.f67531a;
    }

    public final long getPromotionSource() {
        return this.f67538h;
    }

    public final int getSales() {
        return this.f67543m;
    }

    public final String getSmallAppUrl() {
        return this.f67550t;
    }

    public final int getStatus() {
        return this.f67537g;
    }

    public final C25569l getTaobao() {
        return this.f67547q;
    }

    public final String getTitle() {
        return this.f67533c;
    }

    public final C25567j getToutiao() {
        return this.f67548r;
    }

    public final PromotionVisitor getVisitor() {
        return this.f67549s;
    }

    public final boolean isMiniProgramGood() {
        return C25555a.m62090d(this.f67538h);
    }

    public final boolean isOtherTypeGood() {
        return C25555a.m62091e(this.f67538h);
    }

    public final int getFixedSales() {
        if (this.f67543m == -1) {
            return 0;
        }
        return this.f67543m;
    }

    public final boolean isAppointment() {
        PromotionAppointment promotionAppointment;
        C25567j jVar = this.f67548r;
        if (jVar != null) {
            promotionAppointment = jVar.getAppointment();
        } else {
            promotionAppointment = null;
        }
        if (promotionAppointment != null) {
            return true;
        }
        return false;
    }

    public final boolean isJDGood() {
        return C25555a.m62088b(this.f67538h);
    }

    public final boolean isKaolaGood() {
        return C25555a.m62089c(this.f67538h);
    }

    public final boolean isOnSale() {
        if (this.f67537g == 2) {
            return true;
        }
        return false;
    }

    public final boolean isPreSaleGood() {
        PromotionPreSale promotionPreSale;
        C25567j jVar = this.f67548r;
        if (jVar != null) {
            promotionPreSale = jVar.getPreSale();
        } else {
            promotionPreSale = null;
        }
        if (promotionPreSale != null) {
            return true;
        }
        return false;
    }

    public final boolean isTaobaoGood() {
        return C25555a.m62087a(this.f67538h);
    }

    public final boolean hasCoupon() {
        if (hasTaobaoCoupon() || hasToutiaoCoupon()) {
            return true;
        }
        return false;
    }

    public final boolean hasTaobaoCoupon() {
        C25569l lVar = this.f67547q;
        if (lVar != null) {
            C25570m coupon = lVar.getCoupon();
            if (coupon != null && coupon.isValid()) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasToutiaoCoupon() {
        List list;
        C25567j jVar = this.f67548r;
        if (jVar != null) {
            list = jVar.getCouponRule();
        } else {
            list = null;
        }
        if (list == null || !(!list.isEmpty())) {
            return false;
        }
        return true;
    }

    public final boolean isBuyWithoutCheck() {
        Boolean bool;
        C25567j jVar = this.f67548r;
        if (jVar != null) {
            bool = jVar.getNeedCheck();
        } else {
            bool = null;
        }
        return C52711k.m112239a((Object) bool, (Object) Boolean.valueOf(false));
    }

    public final boolean isSecKillGood() {
        if (!isPreSaleGood() && !isAppointment()) {
            C25567j jVar = this.f67548r;
            if (jVar != null) {
                C25568k secKillInfo = jVar.getSecKillInfo();
                if (secKillInfo != null && secKillInfo.canBeShow()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean isThirdParty() {
        C25555a aVar = Companion;
        long j = this.f67538h;
        if (C25555a.m62087a(j) || C25555a.m62090d(j) || C25555a.m62091e(j)) {
            return true;
        }
        return false;
    }

    public final boolean isVirtualGood() {
        C25567j jVar = this.f67548r;
        if (jVar != null) {
            C25572o virtualPromotion = jVar.getVirtualPromotion();
            if (virtualPromotion != null) {
                return virtualPromotion.isVirtualGoods();
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getFirstFullReduction() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.commerce.service.models.j r0 = r4.f67548r
            r1 = 0
            if (r0 == 0) goto L_0x0010
            com.ss.android.ugc.aweme.commerce.service.models.n r0 = r0.getReductionInfo()
            if (r0 == 0) goto L_0x0010
            java.util.List r0 = r0.getFullReduction()
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = 0
            if (r2 == 0) goto L_0x0020
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r2 = 0
            goto L_0x0021
        L_0x0020:
            r2 = 1
        L_0x0021:
            if (r2 != 0) goto L_0x002a
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x002a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commerce.service.models.C25554b.getFirstFullReduction():java.lang.String");
    }

    public final boolean isGoodInAppointment() {
        if (!isAppointment()) {
            return false;
        }
        C25567j jVar = this.f67548r;
        if (jVar != null) {
            PromotionAppointment appointment = jVar.getAppointment();
            if (appointment == null || appointment.getServerTime() >= appointment.getStartTime()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean isGoodInPreSale() {
        if (!isPreSaleGood()) {
            return false;
        }
        C25567j jVar = this.f67548r;
        if (jVar != null) {
            PromotionPreSale preSale = jVar.getPreSale();
            if (preSale == null || preSale.getServerTime() >= preSale.getEndTime()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean isGoodInSecKill() {
        if (!isSecKillGood()) {
            return false;
        }
        C25567j jVar = this.f67548r;
        if (jVar != null) {
            C25568k secKillInfo = jVar.getSecKillInfo();
            if (secKillInfo != null) {
                long beginTime = secKillInfo.getBeginTime();
                long endTime = secKillInfo.getEndTime();
                long currentTime = secKillInfo.getCurrentTime();
                if (beginTime <= currentTime && endTime >= currentTime) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final String longTitle() {
        if (!TextUtils.isEmpty(this.f67533c)) {
            String str = this.f67533c;
            if (str == null) {
                C52711k.m112234a();
            }
            return str;
        } else if (TextUtils.isEmpty(this.f67535e)) {
            return "";
        } else {
            String str2 = this.f67535e;
            if (str2 == null) {
                C52711k.m112234a();
            }
            return str2;
        }
    }

    public final List<UrlModel> preferredImages() {
        List<? extends UrlModel> list = this.f67545o;
        if (list != null && (!list.isEmpty())) {
            return this.f67545o;
        }
        List<? extends UrlModel> list2 = this.f67544n;
        if (list2 == null || !(!list2.isEmpty())) {
            return C52575l.m112097a();
        }
        return this.f67544n;
    }

    public final String shortTitle() {
        if (!TextUtils.isEmpty(this.f67535e)) {
            String str = this.f67535e;
            if (str == null) {
                C52711k.m112234a();
            }
            return str;
        } else if (TextUtils.isEmpty(this.f67533c)) {
            return "";
        } else {
            String str2 = this.f67533c;
            if (str2 == null) {
                C52711k.m112234a();
            }
            return str2;
        }
    }

    public final void setBrandIcon(UrlModel urlModel) {
        this.f67551u = urlModel;
    }

    public final void setBuyBtn(C25559d dVar) {
        this.f67554x = dVar;
    }

    public final void setDetailUrl(String str) {
        this.f67534d = str;
    }

    public final void setElasticImages(List<? extends UrlModel> list) {
        this.f67545o = list;
    }

    public final void setElasticIntroduction(String str) {
        this.f67536f = str;
    }

    public final void setElasticTitle(String str) {
        this.f67535e = str;
    }

    public final void setElasticType(int i) {
        this.f67539i = i;
    }

    public final void setGoodsSource(String str) {
        this.f67553w = str;
    }

    public final void setImages(List<? extends UrlModel> list) {
        this.f67544n = list;
    }

    public final void setJumpToAppUrl(String str) {
        this.f67552v = str;
    }

    public final void setLabels(List<String> list) {
        this.f67546p = list;
    }

    public final void setMarketPrice(Integer num) {
        this.f67540j = num;
    }

    public final void setMaxPrice(Integer num) {
        this.f67542l = num;
    }

    public final void setMinPrice(int i) {
        this.f67541k = i;
    }

    public final void setProductId(String str) {
        this.f67532b = str;
    }

    public final void setPromotionId(String str) {
        this.f67531a = str;
    }

    public final void setPromotionSource(long j) {
        this.f67538h = j;
    }

    public final void setSales(int i) {
        this.f67543m = i;
    }

    public final void setSmallAppUrl(String str) {
        this.f67550t = str;
    }

    public final void setStatus(int i) {
        this.f67537g = i;
    }

    public final void setTaobao(C25569l lVar) {
        this.f67547q = lVar;
    }

    public final void setTitle(String str) {
        this.f67533c = str;
    }

    public final void setToutiao(C25567j jVar) {
        this.f67548r = jVar;
    }

    public final void setVisitor(PromotionVisitor promotionVisitor) {
        this.f67549s = promotionVisitor;
    }

    public static final boolean isSelfGood(long j) {
        if (j == C25556b.GAME.getType() || j == C25556b.EASY_GO.getType() || j == C25556b.EASY_GO_SELECTED.getType() || j == C25556b.XIAO_DIAN.getType()) {
            return true;
        }
        return false;
    }
}
