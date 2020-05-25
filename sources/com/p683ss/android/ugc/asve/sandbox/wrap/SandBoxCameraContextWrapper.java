package com.p683ss.android.ugc.asve.sandbox.wrap;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.ugc.asve.context.C20355c;
import com.p683ss.android.ugc.asve.p1238b.C20318a;
import com.p683ss.android.ugc.asve.p1238b.C20323e;
import com.p683ss.android.ugc.asve.p1238b.C20331k;

/* renamed from: com.ss.android.ugc.asve.sandbox.wrap.SandBoxCameraContextWrapper */
public class SandBoxCameraContextWrapper implements Parcelable {
    public static final Creator<SandBoxCameraContextWrapper> CREATOR = new Creator<SandBoxCameraContextWrapper>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SandBoxCameraContextWrapper[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new SandBoxCameraContextWrapper(parcel);
        }
    };

    /* renamed from: a */
    public int f56730a;

    /* renamed from: b */
    public int f56731b;

    /* renamed from: c */
    public int f56732c;

    /* renamed from: d */
    public boolean f56733d;

    /* renamed from: e */
    public int f56734e;

    /* renamed from: f */
    public boolean f56735f;

    /* renamed from: g */
    public int[] f56736g;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SandBoxCameraContextWrapper{defaultCameraFacing=");
        sb.append(this.f56730a);
        sb.append(", cameraType=");
        sb.append(this.f56731b);
        sb.append(", cameraHardwareSupportLevel=");
        sb.append(this.f56732c);
        sb.append(", enableFallBackIfV2OpenFailed=");
        sb.append(this.f56733d);
        sb.append(", optionFlag=");
        sb.append(this.f56734e);
        sb.append(", cameraAutoOpenOrCloseByLifecycle=");
        sb.append(this.f56735f);
        sb.append('}');
        return sb.toString();
    }

    protected SandBoxCameraContextWrapper(Parcel parcel) {
        boolean z;
        this.f56730a = parcel.readInt();
        this.f56731b = parcel.readInt();
        this.f56732c = parcel.readInt();
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f56733d = z;
        this.f56734e = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        }
        this.f56735f = z2;
        this.f56736g = parcel.createIntArray();
    }

    public SandBoxCameraContextWrapper(C20355c cVar) {
        this.f56730a = C20331k.toIntValue(cVar.mo43109a());
        this.f56731b = C20323e.toIntValue(cVar.mo43110b());
        this.f56732c = C20318a.toIntValue(cVar.mo43111c());
        this.f56733d = cVar.mo43112d();
        this.f56734e = cVar.mo43113e();
        this.f56735f = cVar.mo43114f();
        this.f56736g = cVar.mo43116h();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f56730a);
        parcel.writeInt(this.f56731b);
        parcel.writeInt(this.f56732c);
        parcel.writeByte(this.f56733d ? (byte) 1 : 0);
        parcel.writeInt(this.f56734e);
        parcel.writeByte(this.f56735f ? (byte) 1 : 0);
        parcel.writeIntArray(this.f56736g);
    }
}
