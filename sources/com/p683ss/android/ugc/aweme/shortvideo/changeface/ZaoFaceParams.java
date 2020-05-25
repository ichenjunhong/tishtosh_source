package com.p683ss.android.ugc.aweme.shortvideo.changeface;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.changeface.ZaoFaceParams */
public final class ZaoFaceParams implements Parcelable, Serializable {
    public static final C42493a CREATOR = new C42493a(null);
    @C17952c(mo34828a = "footage_id")

    /* renamed from: a */
    private String f107461a;
    @C17952c(mo34828a = "footage_name")

    /* renamed from: b */
    private String f107462b;
    @C17952c(mo34828a = "zaorole_cnt")

    /* renamed from: c */
    private int f107463c;
    @C17952c(mo34828a = "zaorole_id")

    /* renamed from: d */
    private String f107464d;
    @C17952c(mo34828a = "music_id")

    /* renamed from: e */
    private String f107465e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.changeface.ZaoFaceParams$a */
    public static final class C42493a implements Creator<ZaoFaceParams> {
        private C42493a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ZaoFaceParams[i];
        }

        public /* synthetic */ C42493a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new ZaoFaceParams(parcel);
        }
    }

    public ZaoFaceParams() {
    }

    public final int describeContents() {
        return 0;
    }

    public final String getFootageId() {
        return this.f107461a;
    }

    public final String getFootageName() {
        return this.f107462b;
    }

    public final String getMusicId() {
        return this.f107465e;
    }

    public final int getZaoRoleCnt() {
        return this.f107463c;
    }

    public final String getZaoRoleId() {
        return this.f107464d;
    }

    public final void setFootageId(String str) {
        this.f107461a = str;
    }

    public final void setFootageName(String str) {
        this.f107462b = str;
    }

    public final void setMusicId(String str) {
        this.f107465e = str;
    }

    public final void setZaoRoleCnt(int i) {
        this.f107463c = i;
    }

    public final void setZaoRoleId(String str) {
        this.f107464d = str;
    }

    public ZaoFaceParams(Parcel parcel) {
        C52711k.m112240b(parcel, "parcel");
        this();
        this.f107461a = parcel.readString();
        this.f107462b = parcel.readString();
        this.f107463c = parcel.readInt();
        this.f107464d = parcel.readString();
        this.f107465e = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeString(this.f107461a);
        parcel.writeString(this.f107462b);
        parcel.writeInt(this.f107463c);
        parcel.writeString(this.f107464d);
        parcel.writeString(this.f107465e);
    }
}
