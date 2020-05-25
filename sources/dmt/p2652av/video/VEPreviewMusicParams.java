package dmt.p2652av.video;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: dmt.av.video.VEPreviewMusicParams */
public class VEPreviewMusicParams implements Parcelable {
    public static final Creator<VEPreviewMusicParams> CREATOR = new Creator<VEPreviewMusicParams>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VEPreviewMusicParams[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VEPreviewMusicParams(parcel);
        }
    };

    /* renamed from: a */
    public String f131134a;

    /* renamed from: b */
    public int f131135b;

    /* renamed from: c */
    public int f131136c;

    /* renamed from: d */
    public int f131137d;

    /* renamed from: e */
    public float f131138e;

    /* renamed from: f */
    public String f131139f;

    /* renamed from: g */
    public float f131140g;

    /* renamed from: h */
    public int f131141h;

    /* renamed from: i */
    public boolean f131142i;

    /* renamed from: j */
    public int f131143j;

    /* renamed from: k */
    public int f131144k;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final boolean mo110444a() {
        if (this.f131141h == 1) {
            return true;
        }
        return false;
    }

    public VEPreviewMusicParams() {
        this.f131141h = 1;
        this.f131138e = 1.0f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VEPreviewMusicParams{mPath='");
        sb.append(this.f131134a);
        sb.append('\'');
        sb.append(", mInPoint=");
        sb.append(this.f131135b);
        sb.append(", mDuration=");
        sb.append(this.f131136c);
        sb.append(", mVolume=");
        sb.append(this.f131138e);
        sb.append("previewStartTime=");
        sb.append(this.f131140g);
        sb.append('}');
        return sb.toString();
    }

    protected VEPreviewMusicParams(Parcel parcel) {
        boolean z = true;
        this.f131141h = 1;
        this.f131134a = parcel.readString();
        this.f131135b = parcel.readInt();
        this.f131136c = parcel.readInt();
        this.f131138e = parcel.readFloat();
        this.f131139f = parcel.readString();
        this.f131141h = parcel.readInt();
        this.f131140g = parcel.readFloat();
        if (parcel.readByte() != 1) {
            z = false;
        }
        this.f131142i = z;
        this.f131143j = parcel.readInt();
        this.f131144k = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f131134a);
        parcel.writeInt(this.f131135b);
        parcel.writeInt(this.f131136c);
        parcel.writeFloat(this.f131138e);
        parcel.writeString(this.f131139f);
        parcel.writeInt(this.f131141h);
        parcel.writeFloat(this.f131140g);
        parcel.writeInt(this.f131142i ? 1 : 0);
        parcel.writeInt(this.f131143j);
        parcel.writeInt(this.f131144k);
    }
}
