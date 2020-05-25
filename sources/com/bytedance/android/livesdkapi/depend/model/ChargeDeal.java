package com.bytedance.android.livesdkapi.depend.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p1076a.C17952c;
import java.util.List;

public class ChargeDeal implements Parcelable {
    public static final Creator<ChargeDeal> CREATOR = new Creator<ChargeDeal>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ChargeDeal[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ChargeDeal(parcel);
        }
    };
    @C17952c(mo34828a = "id")

    /* renamed from: a */
    public long f23687a;
    @C17952c(mo34828a = "exchange_price")

    /* renamed from: b */
    public int f23688b;
    @C17952c(mo34828a = "price")

    /* renamed from: c */
    public int f23689c;
    @C17952c(mo34828a = "describe")

    /* renamed from: d */
    public String f23690d = "";
    @C17952c(mo34828a = "diamond_count")

    /* renamed from: e */
    public int f23691e;
    @C17952c(mo34828a = "giving_count")

    /* renamed from: f */
    public int f23692f;
    @C17952c(mo34828a = "iap_id")

    /* renamed from: g */
    public String f23693g;
    @C17952c(mo34828a = "currency_price")

    /* renamed from: h */
    public List<CurrencyPrice> f23694h;

    /* renamed from: i */
    public int f23695i;

    /* renamed from: j */
    public boolean f23696j;

    /* renamed from: k */
    public transient HsSkuDetail f23697k;

    public static class CurrencyPrice implements Parcelable {
        public static final Creator<CurrencyPrice> CREATOR = new Creator<CurrencyPrice>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new CurrencyPrice[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new CurrencyPrice(parcel);
            }
        };
        @C17952c(mo34828a = "currency")

        /* renamed from: a */
        public String f23698a;
        @C17952c(mo34828a = "price")

        /* renamed from: b */
        public String f23699b;
        @C17952c(mo34828a = "price_show_form")

        /* renamed from: c */
        public String f23700c;

        public int describeContents() {
            return 0;
        }

        protected CurrencyPrice(Parcel parcel) {
            this.f23698a = parcel.readString();
            this.f23699b = parcel.readString();
            this.f23700c = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f23698a);
            parcel.writeString(this.f23699b);
            parcel.writeString(this.f23700c);
        }
    }

    public static class HsSkuDetail implements Parcelable {
        public static final Creator<HsSkuDetail> CREATOR = new Creator<HsSkuDetail>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new HsSkuDetail[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new HsSkuDetail(parcel);
            }
        };

        /* renamed from: a */
        public final String f23701a;

        /* renamed from: b */
        public final String f23702b;

        /* renamed from: c */
        public final String f23703c;

        /* renamed from: d */
        public final String f23704d;

        /* renamed from: e */
        public final String f23705e;

        /* renamed from: f */
        public final String f23706f;

        public int describeContents() {
            return 0;
        }

        protected HsSkuDetail(Parcel parcel) {
            this.f23701a = parcel.readString();
            this.f23702b = parcel.readString();
            this.f23703c = parcel.readString();
            this.f23704d = parcel.readString();
            this.f23705e = parcel.readString();
            this.f23706f = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f23701a);
            parcel.writeString(this.f23702b);
            parcel.writeString(this.f23703c);
            parcel.writeString(this.f23704d);
            parcel.writeString(this.f23705e);
            parcel.writeString(this.f23706f);
        }

        public HsSkuDetail(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f23701a = str;
            this.f23702b = str2;
            this.f23703c = str3;
            this.f23704d = str4;
            this.f23705e = str5;
            this.f23706f = str6;
        }
    }

    public int describeContents() {
        return 0;
    }

    public ChargeDeal() {
    }

    protected ChargeDeal(Parcel parcel) {
        boolean z;
        this.f23687a = parcel.readLong();
        this.f23688b = parcel.readInt();
        this.f23689c = parcel.readInt();
        this.f23690d = parcel.readString();
        this.f23691e = parcel.readInt();
        this.f23692f = parcel.readInt();
        this.f23693g = parcel.readString();
        this.f23694h = parcel.createTypedArrayList(CurrencyPrice.CREATOR);
        this.f23695i = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f23696j = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f23687a);
        parcel.writeInt(this.f23688b);
        parcel.writeInt(this.f23689c);
        parcel.writeString(this.f23690d);
        parcel.writeInt(this.f23691e);
        parcel.writeInt(this.f23692f);
        parcel.writeString(this.f23693g);
        parcel.writeTypedList(this.f23694h);
        parcel.writeInt(this.f23695i);
        parcel.writeByte(this.f23696j ? (byte) 1 : 0);
    }
}
