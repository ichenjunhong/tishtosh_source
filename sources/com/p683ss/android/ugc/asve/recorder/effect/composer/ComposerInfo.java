package com.p683ss.android.ugc.asve.recorder.effect.composer;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo */
public final class ComposerInfo implements Parcelable {
    public static final C20495a CREATOR = new C20495a(null);

    /* renamed from: a */
    public String f56151a;

    /* renamed from: b */
    public final String f56152b;

    /* renamed from: c */
    public final String f56153c;

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo$a */
    public static final class C20495a implements Creator<ComposerInfo> {
        private C20495a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ComposerInfo[i];
        }

        public /* synthetic */ C20495a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new ComposerInfo(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        String str = this.f56151a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f56152b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f56153c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComposerInfo(nodePath=");
        sb.append(this.f56151a);
        sb.append(", extra=");
        sb.append(this.f56152b);
        sb.append(", effectId=");
        sb.append(this.f56153c);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final ComposerInfo mo43541a() {
        return new ComposerInfo(this.f56151a, this.f56152b, this.f56153c);
    }

    /* renamed from: a */
    public final void mo43542a(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f56151a = str;
    }

    public ComposerInfo(Parcel parcel) {
        C52711k.m112240b(parcel, "parcel");
        String readString = parcel.readString();
        C52711k.m112236a((Object) readString, "parcel.readString()");
        String readString2 = parcel.readString();
        C52711k.m112236a((Object) readString2, "parcel.readString()");
        String readString3 = parcel.readString();
        C52711k.m112236a((Object) readString3, "parcel.readString()");
        this(readString, readString2, readString3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposerInfo)) {
            return false;
        }
        ComposerInfo composerInfo = (ComposerInfo) obj;
        if (C52711k.m112239a((Object) this.f56151a, (Object) composerInfo.f56151a)) {
            return true;
        }
        List b = C52830p.m112452b(this.f56151a, new String[]{":"}, false, 0, 6, (Object) null);
        List b2 = C52830p.m112452b(composerInfo.f56151a, new String[]{":"}, false, 0, 6, (Object) null);
        if (b.size() < 2 || b2.size() < 2 || !C52711k.m112239a((Object) (String) b.get(0), (Object) (String) b2.get(0)) || !C52711k.m112239a((Object) (String) b.get(1), (Object) (String) b2.get(1))) {
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeString(this.f56151a);
        parcel.writeString(this.f56152b);
        parcel.writeString(this.f56153c);
    }

    public ComposerInfo(String str, String str2, String str3) {
        C52711k.m112240b(str, "nodePath");
        C52711k.m112240b(str2, "extra");
        C52711k.m112240b(str3, "effectId");
        this.f56151a = str;
        this.f56152b = str2;
        this.f56153c = str3;
    }

    public /* synthetic */ ComposerInfo(String str, String str2, String str3, int i, C52707g gVar) {
        this(str, str2, "");
    }
}
