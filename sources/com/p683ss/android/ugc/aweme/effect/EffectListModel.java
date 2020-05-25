package com.p683ss.android.ugc.aweme.effect;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.effect.EffectListModel */
public class EffectListModel implements Parcelable {
    public static final Creator<EffectListModel> CREATOR = new Creator<EffectListModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new EffectListModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new EffectListModel(parcel);
        }
    };
    private ArrayList<EffectPointModel> mEffectPointModels;

    public EffectListModel() {
    }

    public int describeContents() {
        return 0;
    }

    public ArrayList<EffectPointModel> getEffectPointModels() {
        if (this.mEffectPointModels == null) {
            return new ArrayList<>();
        }
        return this.mEffectPointModels;
    }

    public void setEffectPointModels(ArrayList<EffectPointModel> arrayList) {
        this.mEffectPointModels = arrayList;
    }

    protected EffectListModel(Parcel parcel) {
        this.mEffectPointModels = new ArrayList<>();
        parcel.readList(this.mEffectPointModels, EffectPointModel.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.mEffectPointModels);
    }
}
