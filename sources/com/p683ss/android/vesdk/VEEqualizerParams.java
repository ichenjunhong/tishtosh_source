package com.p683ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.ss.android.vesdk.VEEqualizerParams */
public class VEEqualizerParams implements Parcelable {
    public static final Creator<VEEqualizerParams> CREATOR = new Creator<VEEqualizerParams>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VEEqualizerParams[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VEEqualizerParams(parcel);
        }
    };

    /* renamed from: a */
    public String f126743a = "";

    /* renamed from: b */
    public float f126744b = 12.0f;

    /* renamed from: c */
    public float f126745c = 1.0f;

    /* renamed from: d */
    public float f126746d = 1.0f;

    /* renamed from: e */
    public float f126747e = 1.0f;

    /* renamed from: f */
    public float f126748f = 1.0f;

    /* renamed from: g */
    public float f126749g = 1.0f;

    /* renamed from: h */
    public float f126750h = 1.0f;

    /* renamed from: i */
    public float f126751i = 1.0f;

    /* renamed from: j */
    public float f126752j = 1.0f;

    /* renamed from: k */
    public float f126753k = 1.0f;

    /* renamed from: l */
    public float f126754l = 1.0f;

    /* renamed from: m */
    public float f126755m;

    /* renamed from: n */
    public float f126756n;

    /* renamed from: o */
    public float f126757o;

    /* renamed from: p */
    public float f126758p;

    /* renamed from: q */
    public float f126759q;

    /* renamed from: r */
    public float f126760r;

    /* renamed from: s */
    public float f126761s;

    /* renamed from: t */
    public float f126762t;

    /* renamed from: u */
    public float f126763u;

    /* renamed from: v */
    public float f126764v;

    public int describeContents() {
        return 0;
    }

    public VEEqualizerParams() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VEEqualizerParams{name='");
        sb.append(this.f126743a);
        sb.append('\'');
        sb.append(", preamp=");
        sb.append(this.f126744b);
        sb.append(", amp31=");
        sb.append(this.f126755m);
        sb.append(", amp63=");
        sb.append(this.f126756n);
        sb.append(", amp125=");
        sb.append(this.f126757o);
        sb.append(", amp250=");
        sb.append(this.f126758p);
        sb.append(", amp500=");
        sb.append(this.f126759q);
        sb.append(", amp1000=");
        sb.append(this.f126760r);
        sb.append(", amp2000=");
        sb.append(this.f126761s);
        sb.append(", amp4000=");
        sb.append(this.f126762t);
        sb.append(", amp8000=");
        sb.append(this.f126763u);
        sb.append(", amp16000=");
        sb.append(this.f126764v);
        sb.append(", freqWidth31=");
        sb.append(this.f126745c);
        sb.append(", freqWidth63=");
        sb.append(this.f126746d);
        sb.append(", freqWidth125=");
        sb.append(this.f126747e);
        sb.append(", freqWidth250=");
        sb.append(this.f126748f);
        sb.append(", freqWidth500=");
        sb.append(this.f126749g);
        sb.append(", freqWidth1000=");
        sb.append(this.f126750h);
        sb.append(", freqWidth2000=");
        sb.append(this.f126751i);
        sb.append(", freqWidth4000=");
        sb.append(this.f126752j);
        sb.append(", freqWidth8000=");
        sb.append(this.f126753k);
        sb.append(", freqWidth16000=");
        sb.append(this.f126754l);
        sb.append('}');
        return sb.toString();
    }

    protected VEEqualizerParams(Parcel parcel) {
        this.f126743a = parcel.readString();
        this.f126744b = parcel.readFloat();
        this.f126745c = parcel.readFloat();
        this.f126746d = parcel.readFloat();
        this.f126747e = parcel.readFloat();
        this.f126748f = parcel.readFloat();
        this.f126749g = parcel.readFloat();
        this.f126750h = parcel.readFloat();
        this.f126751i = parcel.readFloat();
        this.f126752j = parcel.readFloat();
        this.f126753k = parcel.readFloat();
        this.f126754l = parcel.readFloat();
        this.f126755m = parcel.readFloat();
        this.f126756n = parcel.readFloat();
        this.f126757o = parcel.readFloat();
        this.f126758p = parcel.readFloat();
        this.f126759q = parcel.readFloat();
        this.f126760r = parcel.readFloat();
        this.f126761s = parcel.readFloat();
        this.f126762t = parcel.readFloat();
        this.f126763u = parcel.readFloat();
        this.f126764v = parcel.readFloat();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f126743a);
        parcel.writeFloat(this.f126744b);
        parcel.writeFloat(this.f126745c);
        parcel.writeFloat(this.f126746d);
        parcel.writeFloat(this.f126747e);
        parcel.writeFloat(this.f126748f);
        parcel.writeFloat(this.f126749g);
        parcel.writeFloat(this.f126750h);
        parcel.writeFloat(this.f126751i);
        parcel.writeFloat(this.f126752j);
        parcel.writeFloat(this.f126753k);
        parcel.writeFloat(this.f126754l);
        parcel.writeFloat(this.f126755m);
        parcel.writeFloat(this.f126756n);
        parcel.writeFloat(this.f126757o);
        parcel.writeFloat(this.f126758p);
        parcel.writeFloat(this.f126759q);
        parcel.writeFloat(this.f126760r);
        parcel.writeFloat(this.f126761s);
        parcel.writeFloat(this.f126762t);
        parcel.writeFloat(this.f126763u);
        parcel.writeFloat(this.f126764v);
    }
}
