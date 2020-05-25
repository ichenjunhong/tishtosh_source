package com.p683ss.android.ugc.aweme.shortvideo.edit;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStruct */
public class ShopOrderShareStruct implements Parcelable, Serializable {
    public static final Creator<ShopOrderShareStruct> CREATOR = new Creator<ShopOrderShareStruct>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShopOrderShareStruct[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShopOrderShareStruct(parcel);
        }
    };
    @C17952c(mo34828a = "origin_item_id")
    private String originItemId;
    @C17952c(mo34828a = "origin_user_id")
    private String originUserId;
    @C17952c(mo34828a = "promotion_id")
    private String promotionId;

    public ShopOrderShareStruct() {
    }

    public int describeContents() {
        return 0;
    }

    public String getOriginItemId() {
        return this.originItemId;
    }

    public String getOriginUserId() {
        return this.originUserId;
    }

    public String getPromotionId() {
        return this.promotionId;
    }

    public void setOriginItemId(String str) {
        this.originItemId = str;
    }

    public void setOriginUserId(String str) {
        this.originUserId = str;
    }

    public void setPromotionId(String str) {
        this.promotionId = str;
    }

    protected ShopOrderShareStruct(Parcel parcel) {
        this.originUserId = parcel.readString();
        this.originItemId = parcel.readString();
        this.promotionId = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.originUserId);
        parcel.writeString(this.originItemId);
        parcel.writeString(this.promotionId);
    }
}
