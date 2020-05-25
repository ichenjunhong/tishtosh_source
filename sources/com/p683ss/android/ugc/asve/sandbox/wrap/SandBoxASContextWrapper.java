package com.p683ss.android.ugc.asve.sandbox.wrap;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.ugc.asve.context.C20358e;
import com.p683ss.android.ugc.asve.context.PreviewSize;

/* renamed from: com.ss.android.ugc.asve.sandbox.wrap.SandBoxASContextWrapper */
public class SandBoxASContextWrapper implements Parcelable {
    public static final Creator<SandBoxASContextWrapper> CREATOR = new Creator<SandBoxASContextWrapper>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SandBoxASContextWrapper[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new SandBoxASContextWrapper(parcel);
        }
    };

    /* renamed from: a */
    public boolean f56707a;

    /* renamed from: b */
    public int f56708b;

    /* renamed from: c */
    public boolean f56709c;

    /* renamed from: d */
    public String f56710d;

    /* renamed from: e */
    public int f56711e;

    /* renamed from: f */
    public int f56712f;

    /* renamed from: g */
    public boolean f56713g;

    /* renamed from: h */
    public String f56714h;

    /* renamed from: i */
    public boolean f56715i;

    /* renamed from: j */
    public boolean f56716j;

    /* renamed from: k */
    public int f56717k;

    /* renamed from: l */
    public boolean f56718l;

    /* renamed from: m */
    public String f56719m;

    /* renamed from: n */
    public String f56720n;

    /* renamed from: o */
    public String f56721o;

    /* renamed from: p */
    public String f56722p;

    /* renamed from: q */
    public String f56723q;

    /* renamed from: r */
    public int f56724r;

    /* renamed from: s */
    public int f56725s;

    /* renamed from: t */
    public int f56726t;

    /* renamed from: u */
    public boolean f56727u;

    /* renamed from: v */
    public boolean f56728v;

    /* renamed from: w */
    public boolean f56729w;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SandBoxASContextWrapper{isUseVERecorder=");
        sb.append(this.f56707a);
        sb.append(", monitorServerLocation=");
        sb.append(this.f56708b);
        sb.append(", enableAsyncInitMonitor=");
        sb.append(this.f56709c);
        sb.append(", workspace='");
        sb.append(this.f56710d);
        sb.append('\'');
        sb.append(", importOption=");
        sb.append(this.f56711e);
        sb.append(", minHDH264Side=");
        sb.append(this.f56712f);
        sb.append(", enableTT265Decoder=");
        sb.append(this.f56713g);
        sb.append(", amazingShareDir='");
        sb.append(this.f56714h);
        sb.append('\'');
        sb.append(", useBuiltinAmazing=");
        sb.append(this.f56715i);
        sb.append(", useNewEffectAlgorithmApi=");
        sb.append(this.f56716j);
        sb.append(", wideCameraCloudInfo=");
        sb.append(this.f56717k);
        sb.append(", cloudWideCameraSwitch=");
        sb.append(this.f56718l);
        sb.append(", effectModelDownloadPath='");
        sb.append(this.f56719m);
        sb.append('\'');
        sb.append(", deviceId='");
        sb.append(this.f56720n);
        sb.append('\'');
        sb.append(", sdkVersion='");
        sb.append(this.f56721o);
        sb.append('\'');
        sb.append(", userId='");
        sb.append(this.f56722p);
        sb.append('\'');
        sb.append(", veRuntimeConfig='");
        sb.append(this.f56723q);
        sb.append('\'');
        sb.append(", previewWidth=");
        sb.append(this.f56724r);
        sb.append(", previewHeight=");
        sb.append(this.f56725s);
        sb.append(", recordOutputCategory=");
        sb.append(this.f56726t);
        sb.append(", enableOpengl3=");
        sb.append(this.f56727u);
        sb.append(", enableHDH264HWDecoder=");
        sb.append(this.f56728v);
        sb.append('}');
        return sb.toString();
    }

    protected SandBoxASContextWrapper(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f56707a = z;
        this.f56708b = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f56709c = z2;
        this.f56710d = parcel.readString();
        this.f56711e = parcel.readInt();
        this.f56712f = parcel.readInt();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f56713g = z3;
        this.f56714h = parcel.readString();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f56715i = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f56716j = z5;
        this.f56717k = parcel.readInt();
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f56718l = z6;
        this.f56719m = parcel.readString();
        this.f56720n = parcel.readString();
        this.f56721o = parcel.readString();
        this.f56722p = parcel.readString();
        this.f56723q = parcel.readString();
        this.f56724r = parcel.readInt();
        this.f56725s = parcel.readInt();
        this.f56726t = parcel.readInt();
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f56727u = z7;
        if (parcel.readByte() != 0) {
            z8 = true;
        }
        this.f56728v = z8;
    }

    public SandBoxASContextWrapper(C20358e eVar) {
        this.f56707a = eVar.mo43154h();
        this.f56708b = eVar.mo43155i().getValue();
        this.f56709c = eVar.mo43157k();
        this.f56710d = eVar.mo43158l().getAbsolutePath();
        this.f56711e = eVar.mo43159m();
        this.f56712f = eVar.mo43161o();
        this.f56713g = eVar.mo43162p();
        this.f56714h = eVar.mo43163q().getAbsolutePath();
        this.f56715i = eVar.mo43164r();
        this.f56716j = eVar.mo43165s();
        this.f56717k = eVar.mo43166t();
        this.f56718l = eVar.mo43167u();
        this.f56719m = eVar.mo43153g();
        this.f56720n = eVar.mo43170x().f127241c;
        this.f56722p = eVar.mo43170x().f127240b;
        this.f56721o = eVar.mo43170x().f127239a;
        this.f56727u = eVar.mo43156j();
        this.f56728v = eVar.mo43160n();
        PreviewSize y = eVar.mo43171y();
        if (y != null) {
            this.f56725s = y.getHeight();
            this.f56724r = y.getWidth();
        }
        this.f56723q = eVar.mo43172z();
        this.f56726t = eVar.mo43168v();
        this.f56729w = eVar.mo43145B();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f56707a ? (byte) 1 : 0);
        parcel.writeInt(this.f56708b);
        parcel.writeByte(this.f56709c ? (byte) 1 : 0);
        parcel.writeString(this.f56710d);
        parcel.writeInt(this.f56711e);
        parcel.writeInt(this.f56712f);
        parcel.writeByte(this.f56713g ? (byte) 1 : 0);
        parcel.writeString(this.f56714h);
        parcel.writeByte(this.f56715i ? (byte) 1 : 0);
        parcel.writeByte(this.f56716j ? (byte) 1 : 0);
        parcel.writeInt(this.f56717k);
        parcel.writeByte(this.f56718l ? (byte) 1 : 0);
        parcel.writeString(this.f56719m);
        parcel.writeString(this.f56720n);
        parcel.writeString(this.f56721o);
        parcel.writeString(this.f56722p);
        parcel.writeString(this.f56723q);
        parcel.writeInt(this.f56724r);
        parcel.writeInt(this.f56725s);
        parcel.writeInt(this.f56726t);
        parcel.writeByte(this.f56727u ? (byte) 1 : 0);
        parcel.writeByte(this.f56728v ? (byte) 1 : 0);
    }
}
