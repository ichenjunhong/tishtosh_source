package com.p683ss.android.ugc.aweme.poi.model;

import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37859b;
import com.p683ss.android.ugc.aweme.poi.model.p2062a.C39092f;
import com.p683ss.android.ugc.aweme.poi.p2058a.C38957b;
import com.p683ss.android.ugc.aweme.poi.p2058a.C38961f;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.taobao.android.dexposed.ClassUtils;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.PoiDetail */
public class PoiDetail extends C37859b implements Serializable {
    @C17952c(mo34828a = "around_hot_poi_count")
    public int aroundHotPoiCount;
    @C17952c(mo34828a = "aweme_list")
    public List<Aweme> awemeList;
    @C17952c(mo34828a = "aweme_type")
    int awemeType;
    @C17952c(mo34828a = "city_window")
    private C39096ab cityWindow;
    @C17952c(mo34828a = "coupon_share_setting")
    public C39138v couponShareSetting;
    long duration;
    private boolean enableLoadMore = true;
    private int feedType;
    @C17952c(mo34828a = "is_local")
    public boolean isLocal;
    @C17952c(mo34828a = "is_school")
    int isSchool;
    @C17952c(mo34828a = "is_show_campus_rank")
    int isShowCampusRank;
    @C17952c(mo34828a = "notice_banner_list")
    public List<C39092f> noticeBannerList;
    private C39105ak poiActivityResponse;
    private C38957b poiActs;
    @C17952c(mo34828a = "poi_aweme_tab")
    public List<Object> poiAwemeTabs;
    @C17952c(mo34828a = "poi_claimer")
    private C39131o poiClaimer;
    @C17952c(mo34828a = "commodity")
    public C39134r poiCommodity;
    @C17952c(mo34828a = "poi_ext")
    public C39139w poiExtension;
    @C17952c(mo34828a = "icon_service_list")
    public List<C39095aa> poiMultiServices;
    @C17952c(mo34828a = "poi_owner")
    public C39100af poiOwner;
    @C17952c(mo34828a = "poi_info")
    public PoiStruct poiStruct;
    @C17952c(mo34828a = "product_info")
    public C39103ai productInfo;
    @C17952c(mo34828a = "discover_poi")
    public C39109ao recommendPoiExplore;
    @C17952c(mo34828a = "food_poi")
    public C39109ao recommendPoiFood;
    @C17952c(mo34828a = "hotel_poi")
    public C39109ao recommendPoiHotel;
    @C17952c(mo34828a = "nearby_poi")
    public C39109ao recommendPoiNearby;
    @C17952c(mo34828a = "tour_poi")
    public C39109ao recommendPoiScene;
    @C17952c(mo34828a = "poi_list")
    public List<PoiStruct> recommendedPoiList;
    @C17952c(mo34828a = "show_detail_type")
    public int showDetailType = 1;
    @C17952c(mo34828a = "icon_service_prompt")
    public String supplierTag;
    @C17952c(mo34828a = "user_list")
    public List<User> userList;

    public int getAwemeType() {
        return this.awemeType;
    }

    public C39096ab getCityWindow() {
        return this.cityWindow;
    }

    public long getDuration() {
        return this.duration;
    }

    public int getFeedType() {
        return this.feedType;
    }

    public int getIsSchool() {
        return this.isSchool;
    }

    public int getIsShowCampusRank() {
        return this.isShowCampusRank;
    }

    public C39105ak getPoiActivityResponse() {
        return this.poiActivityResponse;
    }

    public PoiStruct getPoiStruct() {
        return this.poiStruct;
    }

    public List<User> getUserList() {
        return this.userList;
    }

    public boolean isDestination() {
        return false;
    }

    public boolean isLoadMoreEnable() {
        return this.enableLoadMore;
    }

    public boolean isLocal() {
        return this.isLocal;
    }

    public String getEnterpriseLogo() {
        return this.poiOwner.avatar;
    }

    public List<C39133q> get3rdCommentList() {
        if (this.poiExtension != null) {
            return this.poiExtension.commentList;
        }
        return null;
    }

    public List<C39092f> getActs() {
        if (this.poiActs == null) {
            return null;
        }
        return this.poiActs.getBanners();
    }

    public String getBackendType() {
        if (this.poiStruct == null) {
            return null;
        }
        return this.poiStruct.getBackendTypeCode();
    }

    public String getBookUrl() {
        if (this.poiCommodity != null) {
            return this.poiCommodity.book_url;
        }
        return "";
    }

    public UrlModel getCover() {
        if (this.poiStruct != null) {
            return this.poiStruct.getCoverMedium();
        }
        return null;
    }

    public String getDesc() {
        if (this.poiExtension != null) {
            return this.poiExtension.descTitle;
        }
        return "";
    }

    public String getEnterpriseClaimUrl() {
        if (this.poiOwner == null) {
            return "";
        }
        return this.poiOwner.claimUrl;
    }

    public String getEnterpriseId() {
        if (this.poiOwner != null) {
            return this.poiOwner.f99739id;
        }
        return null;
    }

    public String getEnterpriseSecUid() {
        if (this.poiOwner != null) {
            return this.poiOwner.getUserSecId();
        }
        return null;
    }

    public String getEnterpriseSignature() {
        if (this.poiOwner != null) {
            return this.poiOwner.signature;
        }
        return null;
    }

    public UrlModel getEnterpriseThumb() {
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(this.poiOwner.avatar);
        return urlModel;
    }

    public String getEnterpriseTitle() {
        if (this.poiOwner != null) {
            return this.poiOwner.name;
        }
        return null;
    }

    public String getEnterpriseVerifyReason() {
        if (this.poiOwner != null) {
            return this.poiOwner.enterpriseVerifyReason;
        }
        return null;
    }

    public String getFeedbackUrl() {
        if (this.poiExtension != null) {
            return this.poiExtension.feedbackUrl;
        }
        return "";
    }

    public String getI18nPrice() {
        if (this.poiExtension != null) {
            return this.poiExtension.i18nCost;
        }
        return "";
    }

    public String getLat() {
        if (this.poiStruct != null) {
            return this.poiStruct.getPoiLatitude();
        }
        return "";
    }

    public String getLng() {
        if (this.poiStruct != null) {
            return this.poiStruct.getPoiLongitude();
        }
        return "";
    }

    public C39099ae getOrderInfo() {
        if (this.poiExtension != null) {
            return this.poiExtension.orderInfo;
        }
        return null;
    }

    public String getPhone() {
        if (this.poiExtension == null) {
            return null;
        }
        return this.poiExtension.telephone;
    }

    public C39120d getPoiActivityInfo() {
        if (this.poiExtension != null) {
            return this.poiExtension.poiActivityInfo;
        }
        return null;
    }

    public String[] getPoiCategory() {
        if (this.poiExtension != null) {
            return this.poiExtension.getPoiCategory();
        }
        return null;
    }

    public String getPoiClaimerId() {
        if (this.poiClaimer == null) {
            return "";
        }
        return this.poiClaimer.getClaimerId();
    }

    public List<C39119c> getPoiClassInfoStructList() {
        if (this.poiExtension != null) {
            return this.poiExtension.getPoiClassInfoStructList();
        }
        return null;
    }

    public String getPoiId() {
        if (this.poiStruct == null) {
            return "";
        }
        return this.poiStruct.getPoiId();
    }

    public String getPoiName() {
        if (this.poiStruct == null) {
            return "";
        }
        return this.poiStruct.getPoiName();
    }

    public String getPoiRank() {
        if (this.poiExtension != null) {
            return this.poiExtension.getRankDesc();
        }
        return null;
    }

    public C39132p getPoiRankBundle() {
        if (this.poiExtension != null) {
            return this.poiExtension.poiClassRank;
        }
        return null;
    }

    public long getPoiRankClassCode() {
        if (this.poiExtension != null) {
            return this.poiExtension.getRankClassCode();
        }
        return -1;
    }

    public int getPoiType() {
        if (this.poiStruct == null) {
            return 1;
        }
        return this.poiStruct.iconType;
    }

    public C39106al getQuestion() {
        if (isQuestionShow()) {
            return this.poiExtension.getQuestion();
        }
        return null;
    }

    public String getQueueUrl() {
        if (this.poiCommodity != null) {
            return this.poiCommodity.queue_url;
        }
        return "";
    }

    public List<C39101ag> getRecommendPhoto() {
        if (this.poiExtension == null) {
            return null;
        }
        return this.poiExtension.recommendItems;
    }

    public String getRecommendTitle() {
        if (this.poiExtension != null) {
            return this.poiExtension.recommendTitle;
        }
        return "";
    }

    public String getSubType() {
        if (this.poiExtension == null) {
            return "";
        }
        return this.poiExtension.subType;
    }

    public String getTitle() {
        if (this.poiStruct != null) {
            return this.poiStruct.getPoiName();
        }
        return "";
    }

    public String getTypeCode() {
        if (this.poiStruct == null) {
            return "";
        }
        return this.poiStruct.typeCode;
    }

    public boolean hasMerchantActs() {
        if (!C9376b.m18558a((Collection<T>) this.noticeBannerList)) {
            return true;
        }
        return false;
    }

    public boolean hasRate() {
        if (this.poiExtension == null || this.poiExtension.hasRate != 1) {
            return false;
        }
        return true;
    }

    public boolean hasRecomemndExplorePoi() {
        if (this.recommendPoiExplore == null || !this.recommendPoiExplore.isValid()) {
            return false;
        }
        return true;
    }

    public boolean hasRecomemndFoodPoi() {
        if (this.recommendPoiFood == null || !this.recommendPoiFood.isValid()) {
            return false;
        }
        return true;
    }

    public boolean hasRecomemndHotelPoi() {
        if (this.recommendPoiHotel == null || !this.recommendPoiHotel.isValid()) {
            return false;
        }
        return true;
    }

    public boolean hasRecomemndNearbyPoi() {
        if (this.recommendPoiNearby == null || !this.recommendPoiNearby.isValid()) {
            return false;
        }
        return true;
    }

    public boolean hasRecomemndScenePoi() {
        if (this.recommendPoiScene == null || !this.recommendPoiScene.isValid()) {
            return false;
        }
        return true;
    }

    public boolean isCollected() {
        if (this.poiStruct == null || this.poiStruct.getCollectStatus() != 1) {
            return false;
        }
        return true;
    }

    public boolean isPoiValid() {
        if (this.poiExtension == null) {
            return true;
        }
        return this.poiExtension.valid;
    }

    public boolean isQuestionShow() {
        if (this.poiExtension == null || this.poiExtension.questionInfo == null) {
            return false;
        }
        return true;
    }

    public boolean isUseNewDetailStyle() {
        if (this.poiExtension != null) {
            return this.poiExtension.hasDetailInfo;
        }
        return false;
    }

    public void validatePoiClassInfoStructList() {
        if (this.poiExtension != null) {
            this.poiExtension.validatePoiClassInfoStructList();
        }
    }

    public boolean canClaim() {
        if (this.poiClaimer == null || this.poiClaimer.getCanClaim() == null) {
            return false;
        }
        return this.poiClaimer.getCanClaim().booleanValue();
    }

    public String getAddress() {
        if (this.poiStruct == null || this.poiStruct.address == null) {
            return null;
        }
        return this.poiStruct.address.simpleAddr;
    }

    public List<AwemeRawAd> getAwemeRawAds() {
        if (this.poiExtension == null || this.poiExtension.poiActivityInfo == null) {
            return null;
        }
        return this.poiExtension.poiActivityInfo.getAwemeRawAds();
    }

    public String getCityCode() {
        if (this.poiStruct == null || this.poiStruct.address == null) {
            return null;
        }
        return this.poiStruct.address.cityCode;
    }

    public long getDefaultPoiClassCode() {
        List poiClassInfoStructList = getPoiClassInfoStructList();
        if (!C9376b.m18558a((Collection<T>) poiClassInfoStructList)) {
            return ((C39119c) poiClassInfoStructList.get(0)).code;
        }
        return -1;
    }

    public String getEnterpriseDesc() {
        if (!TextUtils.isEmpty(this.poiOwner.enterpriseVerifyReason)) {
            return this.poiOwner.enterpriseVerifyReason;
        }
        return this.poiOwner.signature;
    }

    public User getEnterpriseModel() {
        User user = new User();
        user.setUid(this.poiOwner.f99739id);
        user.setSecUid(this.poiOwner.getUserSecId());
        user.setCommerceUserLevel(1);
        return user;
    }

    public String[] getLabels() {
        if (this.poiExtension == null || C9431p.m18664a(this.poiExtension.tags)) {
            return null;
        }
        try {
            return this.poiExtension.tags.split(",");
        } catch (Exception unused) {
            return null;
        }
    }

    public C39092f getMerchantAct() {
        if (hasMerchantActs()) {
            return (C39092f) this.noticeBannerList.get(0);
        }
        return null;
    }

    public String getMerchantActId() {
        if (hasMerchantActs()) {
            return ((C39092f) this.noticeBannerList.get(0)).getBid();
        }
        return "";
    }

    public String getMerchantActTitle() {
        if (hasMerchantActs()) {
            return ((C39092f) this.noticeBannerList.get(0)).getTitle();
        }
        return "";
    }

    public List<C39101ag> getPoiTopPhoto() {
        if (this.poiExtension == null || this.poiExtension.photos == null) {
            return null;
        }
        return this.poiExtension.photos;
    }

    public String getPoiTypeStr() {
        if (this.poiStruct == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.poiStruct.iconType);
        return sb.toString();
    }

    public long getQuestionCount() {
        if (isQuestionShow()) {
            return this.poiExtension.questionInfo.getTotalQuestionCount();
        }
        return 0;
    }

    public float getRating() {
        try {
            if (this.poiExtension != null) {
                if (!C9431p.m18664a(this.poiExtension.rating)) {
                    return Float.parseFloat(this.poiExtension.rating);
                }
            }
            return -1.0f;
        } catch (Exception unused) {
            return -1.0f;
        }
    }

    public String getRatingStr() {
        if (this.poiExtension == null || C9431p.m18664a(this.poiExtension.rating)) {
            return "";
        }
        return this.poiExtension.rating;
    }

    public boolean hasValidProduct() {
        if (this.productInfo == null || !this.productInfo.isValidStyle() || C9376b.m18558a((Collection<T>) this.productInfo.products)) {
            return false;
        }
        return true;
    }

    public boolean hasValidSPUProduct() {
        if (this.productInfo == null || !this.productInfo.isSPU() || C9376b.m18558a((Collection<T>) this.productInfo.products)) {
            return false;
        }
        return true;
    }

    public boolean isCertificated() {
        if (this.poiOwner == null || TextUtils.isEmpty(this.poiOwner.f99739id)) {
            return false;
        }
        return true;
    }

    public boolean isEnterprise() {
        if (this.poiOwner == null || C9431p.m18664a(this.poiOwner.f99739id)) {
            return false;
        }
        return true;
    }

    public void parseAdRawData() {
        if (this.poiExtension != null && this.poiExtension.poiActivityInfo != null) {
            this.poiExtension.poiActivityInfo.parseRawData();
        }
    }

    public double[] getLatLng() {
        if (this.poiStruct == null) {
            return null;
        }
        try {
            return new double[]{Double.parseDouble(this.poiStruct.getPoiLatitude()), Double.parseDouble(this.poiStruct.getPoiLongitude())};
        } catch (Exception e) {
            C32458a.m75143a(e);
            return null;
        }
    }

    public String getPrice() {
        String str;
        if (this.poiExtension != null) {
            str = this.poiExtension.cost;
        } else {
            str = "";
        }
        if (!C9431p.m18664a(str) && str.indexOf(ClassUtils.PACKAGE_SEPARATOR) > 0) {
            str = str.substring(0, str.indexOf(ClassUtils.PACKAGE_SEPARATOR));
        }
        try {
            if (Integer.parseInt(str) == 0) {
                return null;
            }
        } catch (Exception unused) {
        }
        return str;
    }

    public List<String> getRecommendFood() {
        if (this.poiExtension == null || C9431p.m18664a(this.poiExtension.specialities)) {
            return null;
        }
        try {
            return Arrays.asList(this.poiExtension.specialities.split(","));
        } catch (Exception e) {
            C32458a.m75143a(e);
            return null;
        }
    }

    public void setActs(C38957b bVar) {
        this.poiActs = bVar;
    }

    public void setAwemeType(int i) {
        this.awemeType = i;
    }

    public void setCityWindow(C39096ab abVar) {
        this.cityWindow = abVar;
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setEnableLoadMore(boolean z) {
        this.enableLoadMore = z;
    }

    public void setFeedType(int i) {
        this.feedType = i;
    }

    public void setIsSchool(int i) {
        this.isSchool = i;
    }

    public void setIsShowCampusRank(int i) {
        this.isShowCampusRank = i;
    }

    public void setPoiActivityResponse(C39105ak akVar) {
        this.poiActivityResponse = akVar;
    }

    public void setPoiStruct(PoiStruct poiStruct2) {
        this.poiStruct = poiStruct2;
    }

    public void setUserList(List<User> list) {
        this.userList = list;
    }

    public C39119c getPoiClassInfoStruct(int i) {
        if (this.poiExtension != null) {
            return this.poiExtension.getPoiClassInfoStruct(i);
        }
        return null;
    }

    public static PoiDetail mapToPoiDetailFromCommonStruct(C38961f fVar) {
        PoiDetail poiDetail = new PoiDetail();
        if (fVar != null) {
            poiDetail.poiStruct = fVar.f99229a;
            poiDetail.poiExtension = fVar.f99230b;
            poiDetail.productInfo = fVar.f99231c;
            poiDetail.poiCommodity = fVar.f99232d;
            poiDetail.poiOwner = fVar.f99233e;
        }
        return poiDetail;
    }

    public PoiStruct getRecommendPoi(int i) {
        if (this.recommendedPoiList == null || i < 0 || i >= this.recommendedPoiList.size()) {
            return null;
        }
        return (PoiStruct) this.recommendedPoiList.get(i);
    }

    public void setAwemeRawAds(List<AwemeRawAd> list) {
        if (this.poiExtension != null && this.poiExtension.poiActivityInfo != null) {
            this.poiExtension.poiActivityInfo.setAwemeRawAds(list);
        }
    }

    public List<String> getRecommendFood(int i) {
        if (this.poiExtension == null || C9431p.m18664a(this.poiExtension.specialities)) {
            return null;
        }
        try {
            String[] split = this.poiExtension.specialities.split(",");
            return Arrays.asList(split).subList(0, Math.min(i, split.length));
        } catch (Exception e) {
            C32458a.m75143a(e);
            return null;
        }
    }

    public String getEnterpriseBusinessTime(String[] strArr, String str) {
        return this.poiOwner.appendBusinessTime(strArr, str);
    }
}
