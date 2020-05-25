package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

public final class GameRequestContent implements ShareModel {
    public static final Creator<GameRequestContent> CREATOR = new Creator<GameRequestContent>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new GameRequestContent[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new GameRequestContent(parcel);
        }
    };

    /* renamed from: a */
    public final String f37933a;

    /* renamed from: b */
    public final List<String> f37934b;

    /* renamed from: c */
    public final String f37935c;

    /* renamed from: d */
    public final String f37936d;

    /* renamed from: e */
    public final C14631a f37937e;

    /* renamed from: f */
    public final String f37938f;

    /* renamed from: g */
    public final C14632b f37939g;

    /* renamed from: h */
    public final List<String> f37940h;

    /* renamed from: com.facebook.share.model.GameRequestContent$a */
    public enum C14631a {
        SEND,
        ASKFOR,
        TURN
    }

    /* renamed from: com.facebook.share.model.GameRequestContent$b */
    public enum C14632b {
        APP_USERS,
        APP_NON_USERS
    }

    public final int describeContents() {
        return 0;
    }

    GameRequestContent(Parcel parcel) {
        this.f37933a = parcel.readString();
        this.f37934b = parcel.createStringArrayList();
        this.f37935c = parcel.readString();
        this.f37936d = parcel.readString();
        this.f37937e = (C14631a) parcel.readSerializable();
        this.f37938f = parcel.readString();
        this.f37939g = (C14632b) parcel.readSerializable();
        this.f37940h = parcel.createStringArrayList();
        parcel.readStringList(this.f37940h);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f37933a);
        parcel.writeStringList(this.f37934b);
        parcel.writeString(this.f37935c);
        parcel.writeString(this.f37936d);
        parcel.writeSerializable(this.f37937e);
        parcel.writeString(this.f37938f);
        parcel.writeSerializable(this.f37939g);
        parcel.writeStringList(this.f37940h);
    }
}
