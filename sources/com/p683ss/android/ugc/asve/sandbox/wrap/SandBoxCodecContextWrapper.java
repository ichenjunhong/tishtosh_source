package com.p683ss.android.ugc.asve.sandbox.wrap;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.ugc.asve.context.C20357d;
import com.p683ss.android.ugc.asve.p1238b.C20337p;

/* renamed from: com.ss.android.ugc.asve.sandbox.wrap.SandBoxCodecContextWrapper */
public class SandBoxCodecContextWrapper implements Parcelable {
    public static final Creator<SandBoxCodecContextWrapper> CREATOR = new Creator<SandBoxCodecContextWrapper>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SandBoxCodecContextWrapper[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new SandBoxCodecContextWrapper(parcel);
        }
    };

    /* renamed from: a */
    public float f56737a;

    /* renamed from: b */
    public boolean f56738b;

    /* renamed from: c */
    public float f56739c;

    /* renamed from: d */
    public boolean f56740d;

    /* renamed from: e */
    public int f56741e;

    /* renamed from: f */
    public int f56742f;

    /* renamed from: g */
    public boolean f56743g;

    /* renamed from: h */
    public String f56744h;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SandBoxCodecContextWrapper{bgmPlayVolume=");
        sb.append(this.f56737a);
        sb.append(", enableEnhanceVolume=");
        sb.append(this.f56738b);
        sb.append(", recordBitrate=");
        sb.append(this.f56739c);
        sb.append(", useHardwareEncode=");
        sb.append(this.f56740d);
        sb.append(", softEncodeQP=");
        sb.append(this.f56741e);
        sb.append(", encodeProfile=");
        sb.append(this.f56742f);
        sb.append(", remuxWithCopying=");
        sb.append(this.f56743g);
        sb.append(", videoMetadataDescription='");
        sb.append(this.f56744h);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public SandBoxCodecContextWrapper(C20357d dVar) {
        this.f56737a = dVar.mo43136a();
        this.f56738b = dVar.mo43137b();
        this.f56739c = dVar.mo43138c();
        this.f56740d = dVar.mo43139d();
        this.f56741e = dVar.mo43140e();
        this.f56742f = C20337p.toIntValue(dVar.mo43141f());
        this.f56743g = dVar.mo43142g();
        this.f56744h = dVar.mo43143h();
    }

    protected SandBoxCodecContextWrapper(Parcel parcel) {
        boolean z;
        boolean z2;
        this.f56737a = parcel.readFloat();
        boolean z3 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f56738b = z;
        this.f56739c = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f56740d = z2;
        this.f56741e = parcel.readInt();
        this.f56742f = parcel.readInt();
        if (parcel.readByte() != 0) {
            z3 = true;
        }
        this.f56743g = z3;
        this.f56744h = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f56737a);
        parcel.writeByte(this.f56738b ? (byte) 1 : 0);
        parcel.writeFloat(this.f56739c);
        parcel.writeByte(this.f56740d ? (byte) 1 : 0);
        parcel.writeInt(this.f56741e);
        parcel.writeInt(this.f56742f);
        parcel.writeByte(this.f56743g ? (byte) 1 : 0);
        parcel.writeString(this.f56744h);
    }
}
