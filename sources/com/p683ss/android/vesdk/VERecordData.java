package com.p683ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.p683ss.android.ttve.nativePort.TEVideoUtils;
import com.p683ss.android.vesdk.runtime.C50771d;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.vesdk.VERecordData */
public class VERecordData implements Parcelable {
    public static final Creator<VERecordData> CREATOR = new Creator<VERecordData>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VERecordData[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VERecordData(parcel);
        }
    };

    /* renamed from: a */
    public static final String f126769a = VERecordData.class.getSimpleName();

    /* renamed from: b */
    public List<VERecordSegmentData> f126770b;

    /* renamed from: c */
    public boolean f126771c;

    /* renamed from: d */
    public String f126772d;

    /* renamed from: e */
    public String f126773e;

    /* renamed from: com.ss.android.vesdk.VERecordData$VERecordSegmentData */
    public static final class VERecordSegmentData implements Parcelable {
        public static final Creator<VERecordSegmentData> CREATOR = new Creator<VERecordSegmentData>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new VERecordSegmentData[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new VERecordSegmentData(parcel);
            }
        };

        /* renamed from: a */
        public String f126774a;

        /* renamed from: b */
        public String f126775b;

        /* renamed from: c */
        public long f126776c;

        /* renamed from: d */
        public long f126777d;

        /* renamed from: e */
        public float f126778e;

        /* renamed from: f */
        public long f126779f;

        /* renamed from: g */
        public long f126780g;

        /* renamed from: h */
        public boolean f126781h;

        /* renamed from: i */
        public long f126782i;

        /* renamed from: j */
        public long f126783j;

        public final int describeContents() {
            return 0;
        }

        protected VERecordSegmentData(Parcel parcel) {
            boolean z;
            this.f126774a = parcel.readString();
            this.f126775b = parcel.readString();
            this.f126776c = parcel.readLong();
            this.f126777d = parcel.readLong();
            this.f126778e = parcel.readFloat();
            this.f126779f = parcel.readLong();
            this.f126780g = parcel.readLong();
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f126781h = z;
            this.f126782i = parcel.readLong();
            this.f126783j = parcel.readLong();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f126774a);
            parcel.writeString(this.f126775b);
            parcel.writeLong(this.f126776c);
            parcel.writeLong(this.f126777d);
            parcel.writeFloat(this.f126778e);
            parcel.writeLong(this.f126779f);
            parcel.writeLong(this.f126780g);
            parcel.writeByte(this.f126781h ? (byte) 1 : 0);
            parcel.writeLong(this.f126782i);
            parcel.writeLong(this.f126783j);
        }

        public VERecordSegmentData(String str, long j, String str2, long j2, float f, long j3, long j4, boolean z) {
            this.f126774a = str;
            this.f126775b = str2;
            this.f126776c = j;
            this.f126777d = j2;
            this.f126778e = f;
            this.f126779f = j3;
            this.f126782i = j3;
            this.f126780g = j4;
            this.f126783j = j4;
            this.f126781h = true;
        }
    }

    private VERecordData() {
    }

    public int describeContents() {
        return 0;
    }

    protected VERecordData(Parcel parcel) {
        boolean z;
        this.f126770b = parcel.createTypedArrayList(VERecordSegmentData.CREATOR);
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f126771c = z;
        this.f126772d = parcel.readString();
        this.f126773e = parcel.readString();
    }

    public VERecordData(List<VERecordSegmentData> list, boolean z) {
        this.f126770b = list;
        this.f126771c = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f126770b);
        parcel.writeByte(this.f126771c ? (byte) 1 : 0);
        parcel.writeString(this.f126772d);
        parcel.writeString(this.f126773e);
    }

    /* renamed from: a */
    public final int mo98589a(long j, long j2) {
        long j3 = j;
        long j4 = j2;
        String str = f126769a;
        StringBuilder sb = new StringBuilder("setTimeRange, start: ");
        sb.append(j3);
        sb.append(" end: ");
        sb.append(j4);
        C50792y.m109909a(str, sb.toString());
        if (j4 <= j3) {
            return -100;
        }
        long j5 = 0;
        for (VERecordSegmentData vERecordSegmentData : this.f126770b) {
            long j6 = vERecordSegmentData.f126780g - vERecordSegmentData.f126779f;
            if (j5 < j3 || j5 + j6 > j4) {
                if (j5 + j6 <= j3 || j5 >= j4) {
                    vERecordSegmentData.f126782i = 0;
                    vERecordSegmentData.f126783j = 0;
                    vERecordSegmentData.f126781h = false;
                    j5 += j6;
                    j3 = j;
                } else {
                    long j7 = (j3 - j5) + vERecordSegmentData.f126779f;
                    long j8 = (j4 - j5) + vERecordSegmentData.f126779f;
                    if (j7 <= vERecordSegmentData.f126779f) {
                        j7 = vERecordSegmentData.f126779f;
                    }
                    vERecordSegmentData.f126782i = j7;
                    if (j8 > vERecordSegmentData.f126780g) {
                        j8 = vERecordSegmentData.f126780g;
                    }
                    vERecordSegmentData.f126783j = j8;
                }
            }
            j5 += j6;
            j3 = j;
        }
        return 0;
    }

    /* renamed from: a */
    public static VERecordData m108914a(C50771d dVar, boolean z) {
        String sb;
        long j;
        String a = dVar.mo43564a();
        if (TextUtils.isEmpty(a)) {
            C50792y.m109914d(f126769a, "分段视频路径为空");
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(File.separatorChar);
        if (!a.endsWith(sb2.toString())) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(a);
            sb3.append(File.separatorChar);
            a = sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(a);
        sb4.append("data.txt");
        String sb5 = sb4.toString();
        File file = new File(sb5);
        if (!file.exists()) {
            String str = f126769a;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(sb5);
            sb6.append(" is not exist");
            C50792y.m109914d(str, sb6.toString());
            return null;
        }
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file));
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String readLine = bufferedReader.readLine();
            if (TextUtils.isEmpty(readLine)) {
                C50792y.m109914d(f126769a, "not found count");
                return null;
            }
            int intValue = Integer.valueOf(readLine).intValue();
            String readLine2 = bufferedReader.readLine();
            if (TextUtils.isEmpty(readLine2)) {
                C50792y.m109914d(f126769a, "not found audioLength");
                return null;
            }
            String[] split = readLine2.split("\t");
            String readLine3 = bufferedReader.readLine();
            if (TextUtils.isEmpty(readLine3)) {
                C50792y.m109914d(f126769a, "not found speed");
                return null;
            }
            String[] split2 = readLine3.split("\t");
            String readLine4 = bufferedReader.readLine();
            if (TextUtils.isEmpty(readLine4)) {
                C50792y.m109914d(f126769a, "not found music start time");
                return null;
            }
            String[] split3 = readLine4.split("\t");
            bufferedReader.close();
            inputStreamReader.close();
            if (intValue != 0 && intValue == split.length && intValue == split2.length) {
                VERecordData vERecordData = new VERecordData();
                vERecordData.f126770b = new LinkedList();
                if (split3.length != intValue || !z) {
                    vERecordData.f126771c = false;
                } else {
                    vERecordData.f126771c = true;
                }
                for (int i = 1; i <= intValue; i++) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(a);
                    sb7.append(i);
                    sb7.append("_frag_v");
                    String sb8 = sb7.toString();
                    if (vERecordData.f126771c) {
                        sb = "";
                    } else {
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append(a);
                        sb9.append(i);
                        sb9.append("_frag_a");
                        sb = sb9.toString();
                    }
                    String str2 = sb;
                    if (!vERecordData.f126771c || split3.length <= i) {
                        j = Long.valueOf(split[i - 1]).longValue();
                    } else {
                        j = (Long.valueOf(split3[i]).longValue() - Long.valueOf(split3[i - 1]).longValue()) * 1000;
                    }
                    if (j <= 0) {
                        int[] iArr = new int[10];
                        TEVideoUtils.getVideoFileInfo(sb8, iArr);
                        j = (long) (iArr[3] * 1000);
                        String str3 = f126769a;
                        StringBuilder sb10 = new StringBuilder("audioLength is 0, use file length: ");
                        sb10.append(j);
                        C50792y.m109913c(str3, sb10.toString());
                    }
                    long j2 = j;
                    VERecordSegmentData vERecordSegmentData = new VERecordSegmentData(sb8, j2, str2, j2, Float.valueOf(split2[i - 1]).floatValue(), 0, j2, true);
                    vERecordData.f126770b.add(vERecordSegmentData);
                }
                return vERecordData;
            }
            C50792y.m109914d(f126769a, "读取文件内容出错, 分段信息不匹配");
            return null;
        } catch (Exception unused) {
            C50792y.m109914d(f126769a, "读取文件内容出错");
            return null;
        }
    }
}
