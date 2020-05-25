package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.RoomType */
public final class RoomType implements Serializable {
    @C17952c(mo34828a = "cover_url")
    private final UrlModel coverUrl;
    @C17952c(mo34828a = "detail_url")
    private final String detailUrl;
    @C17952c(mo34828a = "hotel_id")
    private final long homeStayId;
    @C17952c(mo34828a = "hotel_name")
    private final String homeStayName;
    @C17952c(mo34828a = "price")
    private final long price;
    @C17952c(mo34828a = "roomtype_id")
    private final long roomTypeId;
    @C17952c(mo34828a = "roomtype_name")
    private final String roomTypeName;

    public static /* synthetic */ RoomType copy$default(RoomType roomType, long j, String str, long j2, String str2, UrlModel urlModel, String str3, long j3, int i, Object obj) {
        RoomType roomType2 = roomType;
        return roomType.copy((i & 1) != 0 ? roomType2.homeStayId : j, (i & 2) != 0 ? roomType2.homeStayName : str, (i & 4) != 0 ? roomType2.roomTypeId : j2, (i & 8) != 0 ? roomType2.roomTypeName : str2, (i & 16) != 0 ? roomType2.coverUrl : urlModel, (i & 32) != 0 ? roomType2.detailUrl : str3, (i & 64) != 0 ? roomType2.price : j3);
    }

    public final long component1() {
        return this.homeStayId;
    }

    public final String component2() {
        return this.homeStayName;
    }

    public final long component3() {
        return this.roomTypeId;
    }

    public final String component4() {
        return this.roomTypeName;
    }

    public final UrlModel component5() {
        return this.coverUrl;
    }

    public final String component6() {
        return this.detailUrl;
    }

    public final long component7() {
        return this.price;
    }

    public final RoomType copy(long j, String str, long j2, String str2, UrlModel urlModel, String str3, long j3) {
        String str4 = str;
        C52711k.m112240b(str, "homeStayName");
        String str5 = str2;
        C52711k.m112240b(str5, "roomTypeName");
        String str6 = str3;
        C52711k.m112240b(str6, "detailUrl");
        RoomType roomType = new RoomType(j, str4, j2, str5, urlModel, str6, j3);
        return roomType;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RoomType) {
                RoomType roomType = (RoomType) obj;
                if ((this.homeStayId == roomType.homeStayId) && C52711k.m112239a((Object) this.homeStayName, (Object) roomType.homeStayName)) {
                    if ((this.roomTypeId == roomType.roomTypeId) && C52711k.m112239a((Object) this.roomTypeName, (Object) roomType.roomTypeName) && C52711k.m112239a((Object) this.coverUrl, (Object) roomType.coverUrl) && C52711k.m112239a((Object) this.detailUrl, (Object) roomType.detailUrl)) {
                        if (this.price == roomType.price) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final UrlModel getCoverUrl() {
        return this.coverUrl;
    }

    public final String getDetailUrl() {
        return this.detailUrl;
    }

    public final long getHomeStayId() {
        return this.homeStayId;
    }

    public final String getHomeStayName() {
        return this.homeStayName;
    }

    public final long getPrice() {
        return this.price;
    }

    public final long getRoomTypeId() {
        return this.roomTypeId;
    }

    public final String getRoomTypeName() {
        return this.roomTypeName;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.homeStayId) * 31;
        String str = this.homeStayName;
        int i = 0;
        int hashCode2 = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + Long.hashCode(this.roomTypeId)) * 31;
        String str2 = this.roomTypeName;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        UrlModel urlModel = this.coverUrl;
        int hashCode4 = (hashCode3 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str3 = this.detailUrl;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode4 + i) * 31) + Long.hashCode(this.price);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoomType(homeStayId=");
        sb.append(this.homeStayId);
        sb.append(", homeStayName=");
        sb.append(this.homeStayName);
        sb.append(", roomTypeId=");
        sb.append(this.roomTypeId);
        sb.append(", roomTypeName=");
        sb.append(this.roomTypeName);
        sb.append(", coverUrl=");
        sb.append(this.coverUrl);
        sb.append(", detailUrl=");
        sb.append(this.detailUrl);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(")");
        return sb.toString();
    }

    public RoomType(long j, String str, long j2, String str2, UrlModel urlModel, String str3, long j3) {
        C52711k.m112240b(str, "homeStayName");
        C52711k.m112240b(str2, "roomTypeName");
        C52711k.m112240b(str3, "detailUrl");
        this.homeStayId = j;
        this.homeStayName = str;
        this.roomTypeId = j2;
        this.roomTypeName = str2;
        this.coverUrl = urlModel;
        this.detailUrl = str3;
        this.price = j3;
    }
}
