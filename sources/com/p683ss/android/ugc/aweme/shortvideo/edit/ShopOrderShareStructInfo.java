package com.p683ss.android.ugc.aweme.shortvideo.edit;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStructInfo */
public class ShopOrderShareStructInfo implements Parcelable, Serializable {
    public static final Creator<ShopOrderShareStructInfo> CREATOR = new Creator<ShopOrderShareStructInfo>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShopOrderShareStructInfo[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShopOrderShareStructInfo(parcel);
        }
    };

    /* renamed from: a */
    ShopOrderShareStruct f109534a;

    /* renamed from: b */
    String f109535b;

    public ShopOrderShareStructInfo() {
    }

    public int describeContents() {
        return 0;
    }

    public ShopOrderShareStruct getShopOrderShareStruct() {
        return this.f109534a;
    }

    public String getTitle() {
        return this.f109535b;
    }

    public void setShopOrderShareStruct(ShopOrderShareStruct shopOrderShareStruct) {
        this.f109534a = shopOrderShareStruct;
    }

    public void setTitle(String str) {
        this.f109535b = str;
    }

    protected ShopOrderShareStructInfo(Parcel parcel) {
        this.f109534a = (ShopOrderShareStruct) parcel.readParcelable(ShopOrderShareStruct.class.getClassLoader());
        this.f109535b = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f109534a, i);
        parcel.writeString(this.f109535b);
    }
}
