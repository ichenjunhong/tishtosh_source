package com.p683ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.vesdk.C50720o.C50748i;
import com.p683ss.android.vesdk.C50720o.C50749j;
import com.p683ss.android.vesdk.C50720o.C50750k;
import java.util.Arrays;

/* renamed from: com.ss.android.vesdk.VEEditorModel */
public class VEEditorModel implements Parcelable {
    public static final Creator<VEEditorModel> CREATOR = new Creator<VEEditorModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VEEditorModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VEEditorModel(parcel);
        }
    };

    /* renamed from: A */
    public float f126713A;

    /* renamed from: B */
    public boolean f126714B;

    /* renamed from: C */
    public C50748i f126715C;

    /* renamed from: D */
    public C50750k f126716D;

    /* renamed from: a */
    public String f126717a;

    /* renamed from: b */
    public int f126718b;

    /* renamed from: c */
    public int f126719c;

    /* renamed from: d */
    public boolean f126720d;

    /* renamed from: e */
    public C50749j f126721e;

    /* renamed from: f */
    public boolean f126722f;

    /* renamed from: g */
    public int f126723g;

    /* renamed from: h */
    public int f126724h;

    /* renamed from: i */
    public int f126725i;

    /* renamed from: j */
    public String f126726j;

    /* renamed from: k */
    public int f126727k;

    /* renamed from: l */
    public int f126728l;

    /* renamed from: m */
    public String[] f126729m;

    /* renamed from: n */
    public String[] f126730n;

    /* renamed from: o */
    public String[] f126731o;

    /* renamed from: p */
    public int f126732p;

    /* renamed from: q */
    public int f126733q;

    /* renamed from: r */
    public String f126734r;

    /* renamed from: s */
    public String f126735s;

    /* renamed from: t */
    public double f126736t;

    /* renamed from: u */
    public double f126737u;

    /* renamed from: v */
    public double f126738v;

    /* renamed from: w */
    public double f126739w;

    /* renamed from: x */
    public String f126740x;

    /* renamed from: y */
    public String f126741y;

    /* renamed from: z */
    public float f126742z;

    public VEEditorModel() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("\"projectXML\":\"");
        sb.append(this.f126717a);
        sb.append('\"');
        sb.append(",\"inPoint\":");
        sb.append(this.f126718b);
        sb.append(",\"outputPoint\":");
        sb.append(this.f126719c);
        sb.append(",\"reverseDone\":");
        sb.append(this.f126720d);
        sb.append(",\"videoOutRes\":");
        sb.append(this.f126721e);
        sb.append(",\"separateAV\":");
        sb.append(this.f126722f);
        sb.append(",\"masterTrackIndex\":");
        sb.append(this.f126723g);
        sb.append(",\"hostTrackIndex\":");
        sb.append(this.f126724h);
        sb.append(",\"audioEffectFilterIndex\":");
        sb.append(this.f126725i);
        sb.append(",\"modelDir\":\"");
        sb.append(this.f126726j);
        sb.append('\"');
        sb.append(",\"colorFilterIndex\":");
        sb.append(this.f126727k);
        sb.append(",\"effectHDRFilterIndex\":");
        sb.append(this.f126728l);
        sb.append(",\"videoPaths\":");
        sb.append(Arrays.toString(this.f126729m));
        sb.append(",\"audioPaths\":");
        sb.append(Arrays.toString(this.f126730n));
        sb.append(",\"transitions\":");
        sb.append(Arrays.toString(this.f126731o));
        sb.append(",\"backgroundColor\":");
        sb.append(this.f126732p);
        sb.append(",\"videoBackgroundColor\":");
        sb.append(this.f126733q);
        sb.append(",\"outputFile\":\"");
        sb.append(this.f126734r);
        sb.append('\"');
        sb.append(",\"watermarkFile\":\"");
        sb.append(this.f126735s);
        sb.append('\"');
        sb.append(",\"watermarkWidth\":");
        sb.append(this.f126736t);
        sb.append(",\"watermarkHeight\":");
        sb.append(this.f126737u);
        sb.append(",\"watermarkOffsetX\":");
        sb.append(this.f126738v);
        sb.append(",\"watermarkOffsetY\":");
        sb.append(this.f126739w);
        sb.append(",\"colorFilterLeftPath\":\"");
        sb.append(this.f126740x);
        sb.append('\"');
        sb.append(",\"colorFilterRightPath\":\"");
        sb.append(this.f126741y);
        sb.append('\"');
        sb.append(",\"colorFilterPosition\":");
        sb.append(this.f126742z);
        sb.append(",\"colorFilterIntensity\":");
        sb.append(this.f126713A);
        sb.append(",\"useColorFilterResIntensity\":");
        sb.append(this.f126714B);
        sb.append(",\"videoGravity\":");
        sb.append(this.f126715C);
        sb.append(",\"videoScaleType\":");
        sb.append(this.f126716D);
        sb.append('}');
        return sb.toString();
    }

    protected VEEditorModel(Parcel parcel) {
        boolean z;
        boolean z2;
        this.f126717a = parcel.readString();
        this.f126718b = parcel.readInt();
        this.f126719c = parcel.readInt();
        boolean z3 = false;
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f126720d = z;
        this.f126721e = C50749j.values()[parcel.readInt()];
        if (parcel.readInt() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f126722f = z2;
        this.f126723g = parcel.readInt();
        this.f126724h = parcel.readInt();
        this.f126725i = parcel.readInt();
        this.f126726j = parcel.readString();
        this.f126727k = parcel.readInt();
        this.f126728l = parcel.readInt();
        int readInt = parcel.readInt();
        if (readInt != -1) {
            this.f126729m = new String[readInt];
            parcel.readStringArray(this.f126729m);
        } else {
            this.f126729m = null;
        }
        int readInt2 = parcel.readInt();
        if (readInt2 != -1) {
            this.f126730n = new String[readInt2];
            parcel.readStringArray(this.f126730n);
        } else {
            this.f126730n = null;
        }
        int readInt3 = parcel.readInt();
        if (readInt3 != -1) {
            this.f126731o = new String[readInt3];
            parcel.readStringArray(this.f126731o);
        } else {
            this.f126731o = null;
        }
        this.f126732p = parcel.readInt();
        this.f126734r = parcel.readString();
        this.f126735s = parcel.readString();
        this.f126736t = parcel.readDouble();
        this.f126737u = parcel.readDouble();
        this.f126738v = parcel.readDouble();
        this.f126739w = parcel.readDouble();
        this.f126740x = parcel.readString();
        this.f126741y = parcel.readString();
        this.f126742z = parcel.readFloat();
        this.f126713A = parcel.readFloat();
        if (parcel.readInt() == 1) {
            z3 = true;
        }
        this.f126714B = z3;
        this.f126715C = C50748i.values()[parcel.readInt()];
        this.f126716D = C50750k.values()[parcel.readInt()];
        this.f126733q = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f126717a);
        parcel.writeInt(this.f126718b);
        parcel.writeInt(this.f126719c);
        parcel.writeInt(this.f126720d ? 1 : 0);
        parcel.writeInt(this.f126721e.ordinal());
        parcel.writeInt(this.f126722f ? 1 : 0);
        parcel.writeInt(this.f126723g);
        parcel.writeInt(this.f126724h);
        parcel.writeInt(this.f126725i);
        parcel.writeString(this.f126726j);
        parcel.writeInt(this.f126727k);
        parcel.writeInt(this.f126728l);
        if (this.f126729m != null) {
            parcel.writeInt(this.f126729m.length);
            parcel.writeStringArray(this.f126729m);
        } else {
            parcel.writeInt(-1);
        }
        if (this.f126730n != null) {
            parcel.writeInt(this.f126730n.length);
            parcel.writeStringArray(this.f126730n);
        } else {
            parcel.writeInt(-1);
        }
        if (this.f126731o != null) {
            parcel.writeInt(this.f126731o.length);
            parcel.writeStringArray(this.f126731o);
        } else {
            parcel.writeInt(-1);
        }
        parcel.writeInt(this.f126732p);
        parcel.writeString(this.f126734r);
        parcel.writeString(this.f126735s);
        parcel.writeDouble(this.f126736t);
        parcel.writeDouble(this.f126737u);
        parcel.writeDouble(this.f126738v);
        parcel.writeDouble(this.f126739w);
        parcel.writeString(this.f126740x);
        parcel.writeString(this.f126741y);
        parcel.writeFloat(this.f126742z);
        parcel.writeFloat(this.f126713A);
        parcel.writeInt(this.f126714B ? 1 : 0);
        parcel.writeInt(this.f126715C.ordinal());
        parcel.writeInt(this.f126716D.ordinal());
        parcel.writeInt(this.f126733q);
    }
}
