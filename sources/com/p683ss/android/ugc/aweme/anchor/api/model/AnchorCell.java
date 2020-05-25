package com.p683ss.android.ugc.aweme.anchor.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.anchor.api.model.AnchorCell */
public final class AnchorCell implements Parcelable {
    public static final Creator CREATOR = new C22596a();
    @C17952c(mo34828a = "id")

    /* renamed from: a */
    public String f60738a;
    @C17952c(mo34828a = "icon")

    /* renamed from: b */
    public AnchorIcon f60739b;
    @C17952c(mo34828a = "title")

    /* renamed from: c */
    public String f60740c;
    @C17952c(mo34828a = "sub_title")

    /* renamed from: d */
    public String f60741d;
    @C17952c(mo34828a = "schema_url")

    /* renamed from: e */
    public String f60742e;
    @C17952c(mo34828a = "extra")

    /* renamed from: f */
    public String f60743f;

    /* renamed from: g */
    public boolean f60744g;

    /* renamed from: com.ss.android.ugc.aweme.anchor.api.model.AnchorCell$a */
    public static class C22596a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "in");
            AnchorCell anchorCell = new AnchorCell(parcel.readString(), parcel.readInt() != 0 ? (AnchorIcon) AnchorIcon.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            return anchorCell;
        }

        public final Object[] newArray(int i) {
            return new AnchorCell[i];
        }
    }

    public AnchorCell() {
        this(null, null, null, null, null, null, false, 127, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeString(this.f60738a);
        AnchorIcon anchorIcon = this.f60739b;
        if (anchorIcon != null) {
            parcel.writeInt(1);
            anchorIcon.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f60740c);
        parcel.writeString(this.f60741d);
        parcel.writeString(this.f60742e);
        parcel.writeString(this.f60743f);
        parcel.writeInt(this.f60744g ? 1 : 0);
    }

    public final int hashCode() {
        String str = this.f60738a;
        if (str == null) {
            str = "";
        }
        return Integer.hashCode(Integer.valueOf(str).intValue());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AnchorCell) {
            return TextUtils.equals(this.f60738a, ((AnchorCell) obj).f60738a);
        }
        return false;
    }

    public AnchorCell(String str, AnchorIcon anchorIcon, String str2, String str3, String str4, String str5, boolean z) {
        this.f60738a = str;
        this.f60739b = anchorIcon;
        this.f60740c = str2;
        this.f60741d = str3;
        this.f60742e = str4;
        this.f60743f = str5;
        this.f60744g = z;
    }

    private /* synthetic */ AnchorCell(String str, AnchorIcon anchorIcon, String str2, String str3, String str4, String str5, boolean z, int i, C52707g gVar) {
        this(null, null, null, null, null, null, false);
    }
}
