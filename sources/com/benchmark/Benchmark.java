package com.benchmark;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p1076a.C17952c;

public class Benchmark implements Parcelable {
    public static final int BENCHMARK_DECODE_H264 = 7;
    public static final int BENCHMARK_DECODE_H265 = 8;
    public static final int BENCHMARK_DECODE_IMAGE = 2;
    public static final int BENCHMARK_EMBOSS_PROCESS = 15;
    public static final int BENCHMARK_ENCODE_H264 = 9;
    public static final int BENCHMARK_FACEBEAUTY = 3;
    public static final int BENCHMARK_FACEDETECT = 1;
    public static final int BENCHMARK_GAUSSIANBLUR_CPU = 4;
    public static final int BENCHMARK_GAUSSIANBLUR_GPU = 14;
    public static final int BENCHMARK_GL_READ_PIXELS = 20;
    public static final int BENCHMARK_GPU_INFO = 10;
    public static final int BENCHMARK_HARDCODE = 16;
    public static final int BENCHMARK_HARDCODE_V2 = 17;
    public static final int BENCHMARK_HARD_DECODE_BUFFER = 19;
    public static final int BENCHMARK_HARD_DECODE_SURFACE = 18;
    public static final int BENCHMARK_HISTOGRAMEQUALIZATION = 5;
    public static final int BENCHMARK_IO_EXTERNAL = 13;
    public static final int BENCHMARK_IO_INTERNAL = 12;
    public static final int BENCHMARK_MEMCOPY = 6;
    public static final int BENCHMARK_OPENCL_INFO = 11;
    public static final Creator<Benchmark> CREATOR = new Creator<Benchmark>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new Benchmark[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new Benchmark(parcel);
        }
    };
    @C17952c(mo34828a = "block_num")
    public int blockNum;
    @C17952c(mo34828a = "block_size")
    public int blockSize;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    public int f8014id;
    @C17952c(mo34828a = "inner_times")
    public int innerTimes;
    @C17952c(mo34828a = "name")
    public String name;
    @C17952c(mo34828a = "times")
    public int times;
    @C17952c(mo34828a = "when")
    public int when;

    public Benchmark() {
    }

    public int describeContents() {
        return 0;
    }

    protected Benchmark(Parcel parcel) {
        this.f8014id = parcel.readInt();
        this.name = parcel.readString();
        this.when = parcel.readInt();
        this.times = parcel.readInt();
        this.innerTimes = parcel.readInt();
        this.blockSize = parcel.readInt();
        this.blockNum = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8014id);
        parcel.writeString(this.name);
        parcel.writeInt(this.when);
        parcel.writeInt(this.times);
        parcel.writeInt(this.innerTimes);
        parcel.writeInt(this.blockSize);
        parcel.writeInt(this.blockNum);
    }
}
