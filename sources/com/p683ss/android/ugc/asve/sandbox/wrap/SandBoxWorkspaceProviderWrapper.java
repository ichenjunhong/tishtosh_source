package com.p683ss.android.ugc.asve.sandbox.wrap;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.ugc.asve.recorder.C20504f;

/* renamed from: com.ss.android.ugc.asve.sandbox.wrap.SandBoxWorkspaceProviderWrapper */
public class SandBoxWorkspaceProviderWrapper implements Parcelable {
    public static final Creator<SandBoxWorkspaceProviderWrapper> CREATOR = new Creator<SandBoxWorkspaceProviderWrapper>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SandBoxWorkspaceProviderWrapper[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new SandBoxWorkspaceProviderWrapper(parcel);
        }
    };

    /* renamed from: a */
    public String f56757a;

    /* renamed from: b */
    public String f56758b;

    /* renamed from: c */
    public String f56759c;

    /* renamed from: d */
    public String f56760d;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SandBoxWorkspaceProviderWrapper{workspace='");
        sb.append(this.f56757a);
        sb.append('\'');
        sb.append(", segmentPath='");
        sb.append(this.f56758b);
        sb.append('\'');
        sb.append(", concatSegmentVideoPath='");
        sb.append(this.f56759c);
        sb.append('\'');
        sb.append(", concatSegmentAudioPath='");
        sb.append(this.f56760d);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    protected SandBoxWorkspaceProviderWrapper(Parcel parcel) {
        this.f56757a = parcel.readString();
        this.f56758b = parcel.readString();
        this.f56759c = parcel.readString();
        this.f56760d = parcel.readString();
    }

    public SandBoxWorkspaceProviderWrapper(C20504f fVar) {
        this.f56757a = fVar.mo43186a().getAbsolutePath();
        this.f56758b = fVar.mo43188b().getAbsolutePath();
        this.f56759c = fVar.mo43190c().getAbsolutePath();
        this.f56760d = fVar.mo43191d().getAbsolutePath();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f56757a);
        parcel.writeString(this.f56758b);
        parcel.writeString(this.f56759c);
        parcel.writeString(this.f56760d);
    }
}
