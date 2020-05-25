package com.p683ss.android.ugc.asve.sandbox.wrap;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.ugc.asve.context.C20361f;

/* renamed from: com.ss.android.ugc.asve.sandbox.wrap.SandBoxDuetContextWrapper */
public class SandBoxDuetContextWrapper implements Parcelable {
    public static final Creator<SandBoxDuetContextWrapper> CREATOR = new Creator<SandBoxDuetContextWrapper>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SandBoxDuetContextWrapper[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new SandBoxDuetContextWrapper(parcel);
        }
    };

    /* renamed from: a */
    public boolean f56745a;

    /* renamed from: b */
    public String f56746b;

    /* renamed from: c */
    public String f56747c;

    /* renamed from: d */
    public int f56748d;

    /* renamed from: e */
    public int f56749e;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SandBoxDuetContextWrapper{isGameModeInDuet=");
        sb.append(this.f56745a);
        sb.append(", duetAudioPath='");
        sb.append(this.f56746b);
        sb.append('\'');
        sb.append(", duetVideoPath='");
        sb.append(this.f56747c);
        sb.append('\'');
        sb.append(", duetWidth=");
        sb.append(this.f56748d);
        sb.append(", duetHeight=");
        sb.append(this.f56749e);
        sb.append('}');
        return sb.toString();
    }

    protected SandBoxDuetContextWrapper(Parcel parcel) {
        boolean z;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f56745a = z;
        this.f56746b = parcel.readString();
        this.f56747c = parcel.readString();
        this.f56748d = parcel.readInt();
        this.f56749e = parcel.readInt();
    }

    public SandBoxDuetContextWrapper(C20361f fVar) {
        this.f56745a = fVar.mo43173a();
        this.f56746b = fVar.mo43174b();
        this.f56747c = fVar.mo43175c();
        this.f56748d = fVar.mo43176d();
        this.f56749e = fVar.mo43177e();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f56745a ? (byte) 1 : 0);
        parcel.writeString(this.f56746b);
        parcel.writeString(this.f56747c);
        parcel.writeInt(this.f56748d);
        parcel.writeInt(this.f56749e);
    }
}
