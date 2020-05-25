package com.p683ss.android.ugc.aweme.infosticker;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.LinkedHashMap;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.infosticker.InfoStickerCategoryParams */
public final class InfoStickerCategoryParams implements Parcelable, Serializable {
    public static final C35641a CREATOR = new C35641a(null);
    @C17952c(mo34828a = "info_sticker_category")
    private LinkedHashMap<String, String> infoStickerCategoryMap;

    /* renamed from: com.ss.android.ugc.aweme.infosticker.InfoStickerCategoryParams$a */
    public static final class C35641a implements Creator<InfoStickerCategoryParams> {
        private C35641a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new InfoStickerCategoryParams[i];
        }

        public /* synthetic */ C35641a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new InfoStickerCategoryParams(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final LinkedHashMap<String, String> getInfoStickerCategoryMap() {
        return this.infoStickerCategoryMap;
    }

    public InfoStickerCategoryParams() {
        this.infoStickerCategoryMap = new LinkedHashMap<>();
    }

    public final void setInfoStickerCategoryMap(LinkedHashMap<String, String> linkedHashMap) {
        C52711k.m112240b(linkedHashMap, "<set-?>");
        this.infoStickerCategoryMap = linkedHashMap;
    }

    public InfoStickerCategoryParams(Parcel parcel) {
        C52711k.m112240b(parcel, "parcel");
        this();
        Serializable readSerializable = parcel.readSerializable();
        if (readSerializable != null) {
            this.infoStickerCategoryMap = (LinkedHashMap) readSerializable;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.collections.LinkedHashMap<kotlin.String, kotlin.String> /* = java.util.LinkedHashMap<kotlin.String, kotlin.String> */");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "dest");
        parcel.writeSerializable(this.infoStickerCategoryMap);
    }
}
