package com.p683ss.android.ugc.effectmanager.effect.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse */
public class EffectCategoryResponse implements Parcelable {
    public static final Creator<EffectCategoryResponse> CREATOR = new Creator<EffectCategoryResponse>() {
        public final EffectCategoryResponse[] newArray(int i) {
            return new EffectCategoryResponse[i];
        }

        public final EffectCategoryResponse createFromParcel(Parcel parcel) {
            return new EffectCategoryResponse(parcel);
        }
    };
    private List<Effect> addedEffects;
    private List<Effect> collectionEffect;
    private List<Effect> deletedEffects;
    private String extra;
    private Effect frontEffect;
    private String icon_normal_url;
    private String icon_selected_url;

    /* renamed from: id */
    private String f122941id;
    private boolean is_default;
    private String key;
    private String name;
    private Effect rearEffect;
    private List<String> tags;
    private String tagsUpdateTime;
    private List<Effect> totalEffects;

    public EffectCategoryResponse() {
    }

    public int describeContents() {
        return 0;
    }

    public List<Effect> getAddedEffects() {
        return this.addedEffects;
    }

    public List<Effect> getCollectionEffect() {
        return this.collectionEffect;
    }

    public List<Effect> getDeletedEffects() {
        return this.deletedEffects;
    }

    public String getExtra() {
        return this.extra;
    }

    public Effect getFrontEffect() {
        return this.frontEffect;
    }

    public String getIcon_normal_url() {
        return this.icon_normal_url;
    }

    public String getIcon_selected_url() {
        return this.icon_selected_url;
    }

    public String getId() {
        return this.f122941id;
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public Effect getRearEffect() {
        return this.rearEffect;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public String getTagsUpdateTime() {
        return this.tagsUpdateTime;
    }

    public List<Effect> getTotalEffects() {
        return this.totalEffects;
    }

    public boolean isDefault() {
        return this.is_default;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EffectCategoryResponse{id='");
        sb.append(this.f122941id);
        sb.append('\'');
        sb.append(", name='");
        sb.append(this.name);
        sb.append('\'');
        sb.append(", key='");
        sb.append(this.key);
        sb.append('\'');
        sb.append(", collection='");
        sb.append(this.collectionEffect);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setAddedEffects(List<Effect> list) {
        this.addedEffects = list;
    }

    public void setCollectionEffect(List<Effect> list) {
        this.collectionEffect = list;
    }

    public void setDeletedEffects(List<Effect> list) {
        this.deletedEffects = list;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFrontEffect(Effect effect) {
        this.frontEffect = effect;
    }

    public void setIcon_normal_url(String str) {
        this.icon_normal_url = str;
    }

    public void setIcon_selected_url(String str) {
        this.icon_selected_url = str;
    }

    public void setId(String str) {
        this.f122941id = str;
    }

    public void setIsDefault(boolean z) {
        this.is_default = z;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setRearEffect(Effect effect) {
        this.rearEffect = effect;
    }

    public void setTags(List<String> list) {
        this.tags = list;
    }

    public void setTagsUpdateTime(String str) {
        this.tagsUpdateTime = str;
    }

    public void setTotalEffects(List<Effect> list) {
        this.totalEffects = list;
    }

    protected EffectCategoryResponse(Parcel parcel) {
        this.f122941id = parcel.readString();
        this.name = parcel.readString();
        this.key = parcel.readString();
        this.icon_normal_url = parcel.readString();
        this.icon_selected_url = parcel.readString();
        this.frontEffect = (Effect) parcel.readParcelable(Effect.class.getClassLoader());
        this.rearEffect = (Effect) parcel.readParcelable(Effect.class.getClassLoader());
        this.totalEffects = parcel.createTypedArrayList(Effect.CREATOR);
        this.addedEffects = parcel.createTypedArrayList(Effect.CREATOR);
        this.deletedEffects = parcel.createTypedArrayList(Effect.CREATOR);
        this.tags = parcel.createStringArrayList();
        this.tagsUpdateTime = parcel.readString();
        this.collectionEffect = parcel.createTypedArrayList(Effect.CREATOR);
        boolean z = true;
        if (parcel.readByte() != 1) {
            z = false;
        }
        this.is_default = z;
        this.extra = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f122941id);
        parcel.writeString(this.name);
        parcel.writeString(this.key);
        parcel.writeString(this.icon_normal_url);
        parcel.writeString(this.icon_selected_url);
        parcel.writeParcelable(this.frontEffect, i);
        parcel.writeParcelable(this.rearEffect, i);
        parcel.writeTypedList(this.totalEffects);
        parcel.writeTypedList(this.addedEffects);
        parcel.writeTypedList(this.deletedEffects);
        parcel.writeStringList(this.tags);
        parcel.writeString(this.tagsUpdateTime);
        parcel.writeTypedList(this.collectionEffect);
        parcel.writeByte(this.is_default ? (byte) 1 : 0);
        parcel.writeString(this.extra);
    }

    public EffectCategoryResponse(String str, String str2, String str3, List<Effect> list, List<String> list2, String str4) {
        this.f122941id = str;
        this.name = str2;
        this.key = str3;
        this.totalEffects = list;
    }

    public EffectCategoryResponse(String str, String str2, String str3, List<Effect> list, List<String> list2, String str4, List<Effect> list3) {
        this.f122941id = str;
        this.name = str2;
        this.key = str3;
        this.totalEffects = list;
        this.collectionEffect = list3;
    }
}
