package com.p683ss.android.ugc.aweme.feed.model.poi;

import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.app.api.C22982e;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.utils.C23722i;
import com.p683ss.android.ugc.aweme.discover.model.Position;
import com.p683ss.android.ugc.aweme.discover.model.SearchPoiPosition;
import com.p683ss.android.ugc.aweme.poi.model.C39110ap;
import com.p683ss.android.ugc.aweme.poi.model.C39122f;
import com.p683ss.android.ugc.aweme.poi.model.C39127k;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct */
public class SimplePoiInfoStruct implements C22982e, Serializable {
    @C17952c(mo34828a = "business_area_name")
    private String businessAreaName;
    @C17952c(mo34828a = "collect_count")
    private long collectCount;
    @C17952c(mo34828a = "collect_status")
    private long collectStatus;
    @C17952c(mo34828a = "cost")
    private double cost;
    @C17952c(mo34828a = "cover")
    private UrlModel cover;
    private int index;
    @C17952c(mo34828a = "latitude")
    private String latitude;
    @C17952c(mo34828a = "longitude")
    private String longitude;
    @C17952c(mo34828a = "option_name")
    private String optionName;
    @C17952c(mo34828a = "address_info")
    private C39122f poiAddress;
    @C17952c(mo34828a = "poi_backend_type")
    private C39127k poiBackendType;
    @C17952c(mo34828a = "poi_id")
    private String poiId;
    @C17952c(mo34828a = "poi_name")
    private String poiName;
    @C17952c(mo34828a = "poi_rank_desc")
    private String poiRankDesc;
    @C17952c(mo34828a = "icon_service_type_list")
    private List<C39110ap> poiServiceFlags;
    private int poiSpuOverDate;
    private String poiSpuStatusDesc;
    @C17952c(mo34828a = "poi_voucher")
    private String poiVoucher;
    private List<SearchPoiPosition> position;
    @C17952c(mo34828a = "rank_score")
    private long rankScore;
    @C17952c(mo34828a = "rating")
    private double rating;
    private String requestId;
    @C17952c(mo34828a = "voucher_release_areas")
    List<String> voucherReleaseAreas;

    public String getBusinessAreaName() {
        return this.businessAreaName;
    }

    public long getCollectCount() {
        return this.collectCount;
    }

    public long getCollectStatus() {
        return this.collectStatus;
    }

    public double getCost() {
        return this.cost;
    }

    public UrlModel getCover() {
        return this.cover;
    }

    public int getIndex() {
        return this.index;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public String getOptionName() {
        return this.optionName;
    }

    public C39122f getPoiAddress() {
        return this.poiAddress;
    }

    public String getPoiId() {
        return this.poiId;
    }

    public String getPoiName() {
        return this.poiName;
    }

    public String getPoiRankDesc() {
        return this.poiRankDesc;
    }

    public List<C39110ap> getPoiServiceFlags() {
        return this.poiServiceFlags;
    }

    public String getPoiSpuStatusDesc() {
        return this.poiSpuStatusDesc;
    }

    public String getPoiVoucher() {
        return this.poiVoucher;
    }

    public List<SearchPoiPosition> getPosition() {
        return this.position;
    }

    public long getRankScore() {
        return this.rankScore;
    }

    public double getRating() {
        return this.rating;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public List<String> getVoucherReleaseAreas() {
        return this.voucherReleaseAreas;
    }

    public boolean isPoiSpuOverDate() {
        if (this.poiSpuOverDate == 1) {
            return true;
        }
        return false;
    }

    public String getCity() {
        if (this.poiAddress != null) {
            return this.poiAddress.city;
        }
        return "";
    }

    public String getCityCode() {
        if (this.poiAddress != null) {
            return this.poiAddress.cityCode;
        }
        return "";
    }

    public String getPoiBackEndTypeName() {
        if (this.poiBackendType != null) {
            return this.poiBackendType.getName();
        }
        return "";
    }

    public String getPoiBackendType() {
        if (this.poiBackendType != null) {
            return this.poiBackendType.getCode();
        }
        return "";
    }

    public int hashCode() {
        if (this.poiId != null) {
            return this.poiId.hashCode();
        }
        return 0;
    }

    public boolean isValid() {
        if (!TextUtils.isEmpty(this.poiId)) {
            return true;
        }
        return false;
    }

    public List<Position> getPositionInAddress() {
        if (this.position == null) {
            return null;
        }
        for (SearchPoiPosition searchPoiPosition : this.position) {
            if (searchPoiPosition.isPoiAddress()) {
                return searchPoiPosition.position;
            }
        }
        return null;
    }

    public List<Position> getPositionInName() {
        if (this.position == null) {
            return null;
        }
        for (SearchPoiPosition searchPoiPosition : this.position) {
            if (searchPoiPosition.isPoiName()) {
                return searchPoiPosition.position;
            }
        }
        return null;
    }

    public void setBusinessAreaName(String str) {
        this.businessAreaName = str;
    }

    public void setCollectCount(long j) {
        this.collectCount = j;
    }

    public void setCollectStatus(long j) {
        this.collectStatus = j;
    }

    public void setCost(double d) {
        this.cost = d;
    }

    public void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public SimplePoiInfoStruct setIndex(int i) {
        this.index = i;
        return this;
    }

    public void setLatitude(String str) {
        this.latitude = str;
    }

    public void setLongitude(String str) {
        this.longitude = str;
    }

    public void setOptionName(String str) {
        this.optionName = str;
    }

    public void setPoiAddress(C39122f fVar) {
        this.poiAddress = fVar;
    }

    public void setPoiBackendType(C39127k kVar) {
        this.poiBackendType = kVar;
    }

    public void setPoiId(String str) {
        this.poiId = str;
    }

    public void setPoiName(String str) {
        this.poiName = str;
    }

    public void setPoiRankDesc(String str) {
        this.poiRankDesc = str;
    }

    public void setPoiServiceFlags(List<C39110ap> list) {
        this.poiServiceFlags = list;
    }

    public void setPoiSpuOverDate(int i) {
        this.poiSpuOverDate = i;
    }

    public void setPoiSpuStatusDesc(String str) {
        this.poiSpuStatusDesc = str;
    }

    public void setPoiVoucher(String str) {
        this.poiVoucher = str;
    }

    public void setPosition(List<SearchPoiPosition> list) {
        this.position = list;
    }

    public void setRankScore(long j) {
        this.rankScore = j;
    }

    public void setRating(double d) {
        this.rating = d;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setVoucherReleaseAreas(List<String> list) {
        this.voucherReleaseAreas = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimplePoiInfoStruct)) {
            return false;
        }
        return C23722i.m58215a(this.poiId, ((SimplePoiInfoStruct) obj).poiId);
    }
}
