package com.p683ss.android.ugc.aweme.infosticker;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52731z;

/* renamed from: com.ss.android.ugc.aweme.infosticker.StickerChallenge */
public final class StickerChallenge implements Parcelable, Serializable {
    public static final C35643a CREATOR = new C35643a(null);

    /* renamed from: a */
    private List<String> f91602a;

    /* renamed from: b */
    private HashMap<String, AVChallenge> f91603b;

    /* renamed from: c */
    private List<AVChallenge> f91604c;

    /* renamed from: com.ss.android.ugc.aweme.infosticker.StickerChallenge$a */
    public static final class C35643a implements Creator<StickerChallenge> {
        private C35643a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new StickerChallenge[i];
        }

        public /* synthetic */ C35643a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new StickerChallenge(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final List<AVChallenge> getRecordStickerChallengeList() {
        return this.f91604c;
    }

    public final List<String> getStickerList() {
        return this.f91602a;
    }

    public final HashMap<String, AVChallenge> getStickerToChallenge() {
        return this.f91603b;
    }

    public final Collection<AVChallenge> infoStickerChallenges() {
        Collection<AVChallenge> values = this.f91603b.values();
        C52711k.m112236a((Object) values, "stickerToChallenge.values");
        return values;
    }

    public StickerChallenge() {
        this.f91602a = new ArrayList();
        this.f91603b = new HashMap<>();
        this.f91604c = new ArrayList();
    }

    public final void setRecordStickerChallengeList(List<AVChallenge> list) {
        C52711k.m112240b(list, "<set-?>");
        this.f91604c = list;
    }

    public final void setStickerList(List<String> list) {
        C52711k.m112240b(list, "<set-?>");
        this.f91602a = list;
    }

    public final void setStickerToChallenge(HashMap<String, AVChallenge> hashMap) {
        C52711k.m112240b(hashMap, "<set-?>");
        this.f91603b = hashMap;
    }

    public StickerChallenge(Parcel parcel) {
        C52711k.m112240b(parcel, "parcel");
        this();
        parcel.readStringList(this.f91602a);
        Serializable readSerializable = parcel.readSerializable();
        if (readSerializable != null) {
            this.f91603b = (HashMap) readSerializable;
            ArrayList readArrayList = parcel.readArrayList(AVChallenge.class.getClassLoader());
            if (readArrayList != null) {
                this.f91604c = C52731z.m112268d(readArrayList);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.collections.MutableList<com.ss.android.ugc.aweme.shortvideo.AVChallenge>");
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, com.ss.android.ugc.aweme.shortvideo.AVChallenge> /* = java.util.HashMap<kotlin.String, com.ss.android.ugc.aweme.shortvideo.AVChallenge> */");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "dest");
        parcel.writeStringList(this.f91602a);
        parcel.writeSerializable(this.f91603b);
        parcel.writeList(this.f91604c);
    }
}
