package com.p683ss.android.ugc.asve.sandbox.wrap;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.ugc.asve.context.C20363h;

/* renamed from: com.ss.android.ugc.asve.sandbox.wrap.ASSandBoxRecorderContextWrapper */
public class ASSandBoxRecorderContextWrapper implements Parcelable {
    public static final Creator<ASSandBoxRecorderContextWrapper> CREATOR = new Creator<ASSandBoxRecorderContextWrapper>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ASSandBoxRecorderContextWrapper[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ASSandBoxRecorderContextWrapper(parcel);
        }
    };

    /* renamed from: a */
    public SandBoxCameraContextWrapper f56692a;

    /* renamed from: b */
    public SandBoxCodecContextWrapper f56693b;

    /* renamed from: c */
    public SandBoxWorkspaceProviderWrapper f56694c;

    /* renamed from: d */
    public SandBoxReactionContextWrapper f56695d;

    /* renamed from: e */
    public SandBoxDuetContextWrapper f56696e;

    /* renamed from: f */
    public boolean f56697f;

    /* renamed from: g */
    public int f56698g;

    /* renamed from: h */
    public int f56699h;

    /* renamed from: i */
    public boolean f56700i;

    /* renamed from: j */
    public boolean f56701j;

    /* renamed from: k */
    public boolean f56702k;

    /* renamed from: l */
    public boolean f56703l;

    /* renamed from: m */
    public boolean f56704m;

    /* renamed from: n */
    public boolean f56705n;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ASSandBoxRecorderContextWrapper{sandBoxCameraContextWrapper=");
        sb.append(this.f56692a);
        sb.append(", sandBoxCodecContextWrapper=");
        sb.append(this.f56693b);
        sb.append(", sandBoxWorkspaceProviderWrapper=");
        sb.append(this.f56694c);
        sb.append(", sandBoxReactionContextWrapper=");
        sb.append(this.f56695d);
        sb.append(", sandBoxDuetContextWrapper=");
        sb.append(this.f56696e);
        sb.append(", isUseVERecorder=");
        sb.append(this.f56697f);
        sb.append(", outputWidth=");
        sb.append(this.f56698g);
        sb.append(", outputHeight=");
        sb.append(this.f56699h);
        sb.append(", enableEffectAmazing=");
        sb.append(this.f56700i);
        sb.append(", enableAbandonFirstFrame=");
        sb.append(this.f56701j);
        sb.append(", enableThreeBuffer=");
        sb.append(this.f56702k);
        sb.append(", enableAsyncDetection=");
        sb.append(this.f56703l);
        sb.append(", faceBeautyPlayUseMusic=");
        sb.append(this.f56704m);
        sb.append(", enableAudioRecord=");
        sb.append(this.f56705n);
        sb.append('}');
        return sb.toString();
    }

    protected ASSandBoxRecorderContextWrapper(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        this.f56692a = (SandBoxCameraContextWrapper) parcel.readParcelable(SandBoxCameraContextWrapper.class.getClassLoader());
        this.f56693b = (SandBoxCodecContextWrapper) parcel.readParcelable(SandBoxCodecContextWrapper.class.getClassLoader());
        this.f56694c = (SandBoxWorkspaceProviderWrapper) parcel.readParcelable(SandBoxWorkspaceProviderWrapper.class.getClassLoader());
        this.f56695d = (SandBoxReactionContextWrapper) parcel.readParcelable(SandBoxReactionContextWrapper.class.getClassLoader());
        this.f56696e = (SandBoxDuetContextWrapper) parcel.readParcelable(SandBoxDuetContextWrapper.class.getClassLoader());
        boolean z7 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f56697f = z;
        this.f56698g = parcel.readInt();
        this.f56699h = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f56700i = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f56701j = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f56702k = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f56703l = z5;
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f56704m = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        }
        this.f56705n = z7;
    }

    public ASSandBoxRecorderContextWrapper(C20363h hVar) {
        boolean z;
        this.f56692a = new SandBoxCameraContextWrapper(hVar.mo43129m());
        this.f56693b = new SandBoxCodecContextWrapper(hVar.mo43128l());
        this.f56694c = new SandBoxWorkspaceProviderWrapper(hVar.mo43120d());
        this.f56695d = new SandBoxReactionContextWrapper(hVar.mo43127k());
        this.f56696e = new SandBoxDuetContextWrapper(hVar.mo43126j());
        if (hVar.mo43117a() == null) {
            z = false;
        } else {
            z = hVar.mo43117a().booleanValue();
        }
        this.f56697f = z;
        this.f56698g = ((Integer) hVar.mo43121e().getFirst()).intValue();
        this.f56699h = ((Integer) hVar.mo43121e().getSecond()).intValue();
        this.f56700i = hVar.mo43122f();
        this.f56701j = hVar.mo43123g();
        this.f56702k = hVar.mo43132p();
        this.f56703l = hVar.mo43124h();
        this.f56704m = hVar.mo43125i();
        this.f56705n = hVar.mo43133q();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f56692a, i);
        parcel.writeParcelable(this.f56693b, i);
        parcel.writeParcelable(this.f56694c, i);
        parcel.writeParcelable(this.f56695d, i);
        parcel.writeParcelable(this.f56696e, i);
        parcel.writeByte(this.f56697f ? (byte) 1 : 0);
        parcel.writeInt(this.f56698g);
        parcel.writeInt(this.f56699h);
        parcel.writeByte(this.f56700i ? (byte) 1 : 0);
        parcel.writeByte(this.f56701j ? (byte) 1 : 0);
        parcel.writeByte(this.f56702k ? (byte) 1 : 0);
        parcel.writeByte(this.f56703l ? (byte) 1 : 0);
        parcel.writeByte(this.f56704m ? (byte) 1 : 0);
        parcel.writeByte(this.f56705n ? (byte) 1 : 0);
    }
}
