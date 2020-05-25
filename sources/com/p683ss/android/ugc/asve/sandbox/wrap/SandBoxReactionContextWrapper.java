package com.p683ss.android.ugc.asve.sandbox.wrap;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.ugc.asve.context.C20362g;

/* renamed from: com.ss.android.ugc.asve.sandbox.wrap.SandBoxReactionContextWrapper */
public class SandBoxReactionContextWrapper implements Parcelable {
    public static final Creator<SandBoxReactionContextWrapper> CREATOR = new Creator<SandBoxReactionContextWrapper>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SandBoxReactionContextWrapper[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new SandBoxReactionContextWrapper(parcel);
        }
    };

    /* renamed from: a */
    public String f56750a;

    /* renamed from: b */
    public String f56751b;

    /* renamed from: c */
    public float f56752c;

    /* renamed from: d */
    public boolean f56753d;

    /* renamed from: e */
    public int f56754e;

    /* renamed from: f */
    public int f56755f;

    /* renamed from: g */
    public int f56756g;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SandBoxReactionContextWrapper{reactionAudioPath='");
        sb.append(this.f56750a);
        sb.append('\'');
        sb.append(", reactionVideoPath='");
        sb.append(this.f56751b);
        sb.append('\'');
        sb.append(", reactionMaskAlpha=");
        sb.append(this.f56752c);
        sb.append(", isRandomWindowPos=");
        sb.append(this.f56753d);
        sb.append(", rectWindowRes=");
        sb.append(this.f56754e);
        sb.append(", circleWindowRes=");
        sb.append(this.f56755f);
        sb.append(", windowBoundaryRes=");
        sb.append(this.f56756g);
        sb.append('}');
        return sb.toString();
    }

    protected SandBoxReactionContextWrapper(Parcel parcel) {
        boolean z;
        this.f56750a = parcel.readString();
        this.f56751b = parcel.readString();
        this.f56752c = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f56753d = z;
        this.f56754e = parcel.readInt();
        this.f56755f = parcel.readInt();
        this.f56756g = parcel.readInt();
    }

    public SandBoxReactionContextWrapper(C20362g gVar) {
        this.f56750a = gVar.mo43179a();
        this.f56751b = gVar.mo43180b();
        this.f56752c = gVar.mo43181c();
        this.f56753d = gVar.mo43182d();
        this.f56754e = gVar.mo43183e();
        this.f56755f = gVar.mo43184f();
        this.f56756g = gVar.mo43185g();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f56750a);
        parcel.writeString(this.f56751b);
        parcel.writeFloat(this.f56752c);
        parcel.writeByte(this.f56753d ? (byte) 1 : 0);
        parcel.writeInt(this.f56754e);
        parcel.writeInt(this.f56755f);
        parcel.writeInt(this.f56756g);
    }
}
