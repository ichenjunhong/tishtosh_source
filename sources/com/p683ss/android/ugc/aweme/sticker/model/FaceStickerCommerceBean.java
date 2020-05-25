package com.p683ss.android.ugc.aweme.sticker.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean */
public class FaceStickerCommerceBean implements Parcelable {
    public static final Creator<FaceStickerCommerceBean> CREATOR = new Creator<FaceStickerCommerceBean>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FaceStickerCommerceBean[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FaceStickerCommerceBean(parcel);
        }
    };
    @C17952c(mo34828a = "commerce_sticker_web_url")

    /* renamed from: a */
    public String f116235a;
    @C17952c(mo34828a = "commerce_sticker_open_url")

    /* renamed from: b */
    public String f116236b;
    @C17952c(mo34828a = "commerce_sticker_buy_text")

    /* renamed from: c */
    public String f116237c;
    @C17952c(mo34828a = "commerce_sticker_type")

    /* renamed from: d */
    public int f116238d;

    public int describeContents() {
        return 0;
    }

    protected FaceStickerCommerceBean(Parcel parcel) {
        this.f116235a = parcel.readString();
        this.f116236b = parcel.readString();
        this.f116237c = parcel.readString();
        this.f116238d = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f116235a);
        parcel.writeString(this.f116236b);
        parcel.writeString(this.f116237c);
        parcel.writeInt(this.f116238d);
    }
}
