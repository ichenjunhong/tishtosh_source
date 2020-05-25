package com.benchmark;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.Map;

public class BenchmarkResult implements Parcelable {
    public static final Creator<BenchmarkResult> CREATOR = new Creator<BenchmarkResult>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new BenchmarkResult[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new BenchmarkResult(parcel);
        }
    };

    /* renamed from: a */
    public int f8015a;

    /* renamed from: b */
    public String f8016b;

    /* renamed from: c */
    public HashMap<String, String> f8017c;

    /* renamed from: d */
    public long[] f8018d;

    /* renamed from: e */
    public Benchmark f8019e;

    public int describeContents() {
        return 0;
    }

    protected BenchmarkResult(Parcel parcel) {
        this.f8015a = parcel.readInt();
        this.f8016b = parcel.readString();
        this.f8018d = parcel.createLongArray();
        this.f8017c = parcel.readHashMap(HashMap.class.getClassLoader());
        this.f8019e = (Benchmark) parcel.readParcelable(Benchmark.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8015a);
        parcel.writeString(this.f8016b);
        parcel.writeLongArray(this.f8018d);
        parcel.writeMap(this.f8017c);
        parcel.writeParcelable(this.f8019e, i);
    }

    public BenchmarkResult(Benchmark benchmark, int i, String str, Map<String, String> map) {
        this(benchmark, i, str, map, null);
    }

    public BenchmarkResult(Benchmark benchmark, int i, String str, long[] jArr) {
        this(benchmark, i, str, null, jArr);
    }

    public BenchmarkResult(Benchmark benchmark, int i, String str, Map<String, String> map, long[] jArr) {
        this.f8019e = benchmark;
        this.f8015a = i;
        this.f8016b = str;
        this.f8017c = new HashMap<>();
        if (map != null) {
            this.f8017c.putAll(map);
        }
        this.f8018d = jArr;
    }
}
