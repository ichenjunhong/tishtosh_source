package com.p683ss.android.ugc.aweme.anchor.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p1076a.C17952c;
import java.util.ArrayList;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.anchor.api.model.AnchorIcon */
public final class AnchorIcon implements Parcelable {
    public static final Creator CREATOR = new C22597a();
    @C17952c(mo34828a = "uri")

    /* renamed from: a */
    public String f60745a;
    @C17952c(mo34828a = "url_list")

    /* renamed from: b */
    public ArrayList<String> f60746b;

    /* renamed from: com.ss.android.ugc.aweme.anchor.api.model.AnchorIcon$a */
    public static class C22597a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C52711k.m112240b(parcel, "in");
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(parcel.readString());
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            return new AnchorIcon(readString, arrayList);
        }

        public final Object[] newArray(int i) {
            return new AnchorIcon[i];
        }
    }

    public AnchorIcon() {
        this(null, null, 3, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeString(this.f60745a);
        ArrayList<String> arrayList = this.f60746b;
        if (arrayList != null) {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            for (String writeString : arrayList) {
                parcel.writeString(writeString);
            }
            return;
        }
        parcel.writeInt(0);
    }

    public AnchorIcon(String str, ArrayList<String> arrayList) {
        this.f60745a = str;
        this.f60746b = arrayList;
    }

    private /* synthetic */ AnchorIcon(String str, ArrayList arrayList, int i, C52707g gVar) {
        this(null, null);
    }
}
