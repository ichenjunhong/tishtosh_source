package com.bytedance.android.live.wallet.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.google.gson.p1076a.C17952c;
import java.util.ArrayList;
import java.util.List;

public class FirstChargeCheck implements Parcelable {
    public static final Creator<FirstChargeCheck> CREATOR = new Creator<FirstChargeCheck>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FirstChargeCheck[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FirstChargeCheck(parcel);
        }
    };
    @C17952c(mo34828a = "is_first_charge")

    /* renamed from: a */
    public boolean f12144a;
    @C17952c(mo34828a = "diamond")

    /* renamed from: b */
    public List<ChargeDeal> f12145b;
    @C17952c(mo34828a = "extra")

    /* renamed from: c */
    public FirstChargeCheckExtra f12146c;
    @C17952c(mo34828a = "first_charge_package")

    /* renamed from: d */
    public List<FirstChargePackage> f12147d;

    public static class FirstChargeCheckExtra implements Parcelable {
        public static final Creator<FirstChargeCheckExtra> CREATOR = new Creator<FirstChargeCheckExtra>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new FirstChargeCheckExtra[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new FirstChargeCheckExtra(parcel);
            }
        };
        @C17952c(mo34828a = "giving_desc")

        /* renamed from: a */
        public String f12148a;
        @C17952c(mo34828a = "gift_img")

        /* renamed from: b */
        public ImageModel f12149b;
        @C17952c(mo34828a = "panel_top_img")

        /* renamed from: c */
        public ImageModel f12150c;
        @C17952c(mo34828a = "rule")

        /* renamed from: d */
        public List<String> f12151d;
        @C17952c(mo34828a = "panel_bottom_desc")

        /* renamed from: e */
        public List<RichTextModel> f12152e;
        @C17952c(mo34828a = "panel_bottom_bg_img")

        /* renamed from: f */
        FlexImageStruct f12153f;
        @C17952c(mo34828a = "panel_top_bg_img")

        /* renamed from: g */
        FlexImageStruct f12154g;
        @C17952c(mo34828a = "panel_top_desc")

        /* renamed from: h */
        public List<RichTextModel> f12155h;

        public static class RichTextModel implements Parcelable {
            public static final Creator<RichTextModel> CREATOR = new Creator<RichTextModel>() {
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new RichTextModel[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return new RichTextModel(parcel);
                }
            };
            @C17952c(mo34828a = "type")

            /* renamed from: a */
            public String f12156a;
            @C17952c(mo34828a = "text")

            /* renamed from: b */
            public String f12157b;
            @C17952c(mo34828a = "img")

            /* renamed from: c */
            public ImageModel f12158c;
            @C17952c(mo34828a = "font_size")

            /* renamed from: d */
            public long f12159d;
            @C17952c(mo34828a = "font_color")

            /* renamed from: e */
            public String f12160e;
            @C17952c(mo34828a = "weight")

            /* renamed from: f */
            public int f12161f;

            public RichTextModel() {
            }

            public int describeContents() {
                return 0;
            }

            protected RichTextModel(Parcel parcel) {
                this.f12156a = parcel.readString();
                this.f12157b = parcel.readString();
                this.f12158c = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
                this.f12159d = parcel.readLong();
                this.f12160e = parcel.readString();
                this.f12161f = parcel.readInt();
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.f12156a);
                parcel.writeString(this.f12157b);
                parcel.writeParcelable(this.f12158c, i);
                parcel.writeLong(this.f12159d);
                parcel.writeString(this.f12160e);
                parcel.writeInt(this.f12161f);
            }
        }

        public FirstChargeCheckExtra() {
        }

        public int describeContents() {
            return 0;
        }

        protected FirstChargeCheckExtra(Parcel parcel) {
            this.f12148a = parcel.readString();
            this.f12149b = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
            this.f12150c = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
            this.f12151d = parcel.createStringArrayList();
            this.f12152e = parcel.createTypedArrayList(RichTextModel.CREATOR);
            this.f12153f = (FlexImageStruct) parcel.readParcelable(FlexImageStruct.class.getClassLoader());
            this.f12154g = (FlexImageStruct) parcel.readParcelable(FlexImageStruct.class.getClassLoader());
            this.f12155h = parcel.createTypedArrayList(RichTextModel.CREATOR);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f12148a);
            parcel.writeParcelable(this.f12149b, i);
            parcel.writeParcelable(this.f12150c, i);
            parcel.writeStringList(this.f12151d);
            parcel.writeTypedList(this.f12152e);
            parcel.writeParcelable(this.f12153f, i);
            parcel.writeParcelable(this.f12154g, i);
            parcel.writeTypedList(this.f12155h);
        }
    }

    public static class FirstChargePackage implements Parcelable {
        public static final Creator<FirstChargePackage> CREATOR = new Creator<FirstChargePackage>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new FirstChargePackage[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new FirstChargePackage(parcel);
            }
        };
        @C17952c(mo34828a = "title")

        /* renamed from: a */
        public String f12162a;
        @C17952c(mo34828a = "diamond_id")

        /* renamed from: b */
        public int f12163b;
        @C17952c(mo34828a = "item")

        /* renamed from: c */
        public List<FirstChargePackageItem> f12164c;

        public FirstChargePackage() {
        }

        public int describeContents() {
            return 0;
        }

        protected FirstChargePackage(Parcel parcel) {
            this.f12162a = parcel.readString();
            this.f12163b = parcel.readInt();
            this.f12164c = parcel.createTypedArrayList(FirstChargePackageItem.CREATOR);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f12162a);
            parcel.writeInt(this.f12163b);
            parcel.writeTypedList(this.f12164c);
        }
    }

    public static class FirstChargePackageItem implements Parcelable {
        public static final Creator<FirstChargePackageItem> CREATOR = new Creator<FirstChargePackageItem>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new FirstChargePackageItem[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new FirstChargePackageItem(parcel);
            }
        };
        @C17952c(mo34828a = "img")

        /* renamed from: a */
        public ImageModel f12165a;
        @C17952c(mo34828a = "desc")

        /* renamed from: b */
        public String f12166b;
        @C17952c(mo34828a = "elide_desc")

        /* renamed from: c */
        public String f12167c;

        public FirstChargePackageItem() {
        }

        public int describeContents() {
            return 0;
        }

        protected FirstChargePackageItem(Parcel parcel) {
            this.f12165a = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
            this.f12166b = parcel.readString();
            this.f12167c = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f12165a, i);
            parcel.writeString(this.f12166b);
            parcel.writeString(this.f12167c);
        }
    }

    public static class FlexImageStruct implements Parcelable {
        public static final Creator<FlexImageStruct> CREATOR = new Creator<FlexImageStruct>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new FlexImageStruct[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new FlexImageStruct(parcel);
            }
        };
        @C17952c(mo34828a = "url_list")

        /* renamed from: a */
        public List<String> f12168a;
        @C17952c(mo34828a = "uri")

        /* renamed from: b */
        public String f12169b;
        @C17952c(mo34828a = "flex_setting")

        /* renamed from: c */
        public List<Long> f12170c;

        public FlexImageStruct() {
        }

        public int describeContents() {
            return 0;
        }

        protected FlexImageStruct(Parcel parcel) {
            this.f12168a = parcel.createStringArrayList();
            this.f12169b = parcel.readString();
            this.f12170c = new ArrayList();
            parcel.readList(this.f12170c, Long.class.getClassLoader());
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeStringList(this.f12168a);
            parcel.writeString(this.f12169b);
            parcel.writeList(this.f12170c);
        }
    }

    public FirstChargeCheck() {
    }

    public int describeContents() {
        return 0;
    }

    protected FirstChargeCheck(Parcel parcel) {
        boolean z;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f12144a = z;
        this.f12145b = parcel.createTypedArrayList(ChargeDeal.CREATOR);
        this.f12146c = (FirstChargeCheckExtra) parcel.readParcelable(FirstChargeCheckExtra.class.getClassLoader());
        this.f12147d = parcel.createTypedArrayList(FirstChargePackage.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f12144a ? (byte) 1 : 0);
        parcel.writeTypedList(this.f12145b);
        parcel.writeParcelable(this.f12146c, i);
        parcel.writeTypedList(this.f12147d);
    }
}
