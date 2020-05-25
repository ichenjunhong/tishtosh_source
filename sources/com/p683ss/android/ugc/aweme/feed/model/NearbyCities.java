package com.p683ss.android.ugc.aweme.feed.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.NearbyCities */
public class NearbyCities implements Parcelable {
    public static final Creator<NearbyCities> CREATOR = new Creator<NearbyCities>() {
        public final NearbyCities[] newArray(int i) {
            return new NearbyCities[i];
        }

        public final NearbyCities createFromParcel(Parcel parcel) {
            return new NearbyCities(parcel);
        }
    };
    public List<CityBean> all;
    public CityBean current;
    public List<CityBean> hot;
    public List<CityBean> old;

    /* renamed from: com.ss.android.ugc.aweme.feed.model.NearbyCities$CityBean */
    public static class CityBean implements Parcelable, Comparable<CityBean> {
        public static final Creator<CityBean> CREATOR = new Creator<CityBean>() {
            public final CityBean[] newArray(int i) {
                return new CityBean[i];
            }

            public final CityBean createFromParcel(Parcel parcel) {
                return new CityBean(parcel);
            }
        };
        @C17952c(mo34828a = "ad_code")
        public String adCode;
        @C17952c(mo34828a = "cn_pinyin")
        public String cnPinyin;
        public String code;
        @C17952c(mo34828a = "code_local")
        public String codeLocal;
        @C17952c(mo34828a = "country")
        public String country;
        @C17952c(mo34828a = "country_code")
        public String countryCode;
        @C17952c(mo34828a = "current_position_name")
        public String currentPositionName;
        @C17952c(mo34828a = "districts")
        public List<CityBean> districts;

        /* renamed from: en */
        public String f79730en;
        public boolean isL3;
        public String l2Name = "";
        public String name;
        @C17952c(mo34828a = "name_en")
        public String nameEn;
        @C17952c(mo34828a = "nearby_label_name")
        public String nearbyLabelName;
        @C17952c(mo34828a = "nearby_tab_name")
        public String nearbyTabName;
        @C17952c(mo34828a = "show_name")
        public String showName;
        @C17952c(mo34828a = "show_type")
        public int showType;

        public int describeContents() {
            return 0;
        }

        public CityBean() {
        }

        protected CityBean(Parcel parcel) {
            this.name = parcel.readString();
            this.code = parcel.readString();
            this.f79730en = parcel.readString();
        }

        public int compareTo(CityBean cityBean) {
            if (this.isL3 && !cityBean.isL3) {
                return 1;
            }
            if ((!this.isL3 && cityBean.isL3) || TextUtils.isEmpty(this.cnPinyin)) {
                return -1;
            }
            if (TextUtils.isEmpty(cityBean.cnPinyin)) {
                return 1;
            }
            return this.cnPinyin.compareTo(cityBean.cnPinyin);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.name);
            parcel.writeString(this.code);
            parcel.writeString(this.f79730en);
        }
    }

    public NearbyCities() {
    }

    public int describeContents() {
        return 0;
    }

    protected NearbyCities(Parcel parcel) {
        this.current = (CityBean) parcel.readParcelable(CityBean.class.getClassLoader());
        this.all = parcel.createTypedArrayList(CityBean.CREATOR);
        this.hot = parcel.createTypedArrayList(CityBean.CREATOR);
        this.old = parcel.createTypedArrayList(CityBean.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.current, i);
        parcel.writeTypedList(this.all);
        parcel.writeTypedList(this.hot);
        parcel.writeTypedList(this.old);
    }
}
