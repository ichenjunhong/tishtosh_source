package com.benchmark.p123a;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import android.support.p030v4.content.C0726c;
import com.benchmark.Benchmark;
import com.benchmark.BenchmarkResult;
import com.benchmark.C2605a;
import com.benchmark.C2658l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* renamed from: com.benchmark.a.o */
public final class C2620o implements C2658l {

    /* renamed from: a */
    public static Random f8028a = new Random();

    /* renamed from: b */
    private Context f8029b;

    /* renamed from: c */
    private boolean f8030c;

    /* renamed from: d */
    private Benchmark f8031d;

    /* renamed from: e */
    private String f8032e;

    /* renamed from: c */
    public final void mo7171c() {
        C2605a.m7550a(this.f8032e);
    }

    /* renamed from: b */
    public final int mo7170b() {
        boolean z;
        if (!this.f8030c) {
            if (!"mounted".equals(Environment.getExternalStorageState())) {
                return 10003;
            }
        }
        if (!this.f8030c && C0726c.m2090a(this.f8029b, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            return 10004;
        }
        if (C2605a.m7547a(this.f8030c) >= ((long) (this.f8031d.blockSize * 10 * this.f8031d.blockNum))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 0;
        }
        return 10002;
    }

    /* renamed from: a */
    public final BenchmarkResult mo7173a() {
        String str;
        File externalStorageDirectory;
        long j;
        String str2 = "";
        HashMap hashMap = new HashMap();
        int i = 0;
        try {
            float a = m7597a(this.f8031d.blockSize, this.f8031d.blockNum, true, this.f8032e);
            C2605a.m7550a(this.f8032e);
            float a2 = m7597a(this.f8031d.blockSize, this.f8031d.blockNum, false, this.f8032e);
            float b = m7598b(this.f8031d.blockSize, this.f8031d.blockNum, true, this.f8032e);
            float b2 = m7598b(this.f8031d.blockSize, this.f8031d.blockNum, false, this.f8032e);
            if (this.f8030c) {
                str = "inter_";
            } else {
                str = "exter_";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("random_write");
            hashMap.put(sb.toString(), Float.valueOf(C2605a.m7546a(a)));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("random_read");
            hashMap.put(sb2.toString(), Float.valueOf(C2605a.m7546a(b)));
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append("sequential_write");
            hashMap.put(sb3.toString(), Float.valueOf(C2605a.m7546a(a2)));
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append("sequential_read");
            hashMap.put(sb4.toString(), Float.valueOf(C2605a.m7546a(b2)));
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append("avail_percent");
            String sb6 = sb5.toString();
            boolean z = this.f8030c;
            float a3 = (float) C2605a.m7547a(z);
            if (z) {
                externalStorageDirectory = Environment.getDataDirectory();
            } else {
                externalStorageDirectory = Environment.getExternalStorageDirectory();
            }
            StatFs statFs = new StatFs(externalStorageDirectory.getPath());
            if (VERSION.SDK_INT >= 18) {
                j = statFs.getTotalBytes();
            } else {
                j = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            hashMap.put(sb6, Float.valueOf(C2605a.m7546a(a3 / ((float) j))));
        } catch (Throwable th) {
            i = 10000;
            str2 = C2605a.m7554b(th);
        }
        return new BenchmarkResult(this.f8031d, i, str2, (Map<String, String>) hashMap);
    }

    public C2620o(Context context, Benchmark benchmark, boolean z) {
        this.f8029b = context;
        this.f8031d = benchmark;
        this.f8030c = z;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getCacheDir().getPath());
        sb.append(File.separator);
        sb.append("test.file");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(context.getExternalCacheDir().getPath());
        sb3.append(File.separator);
        sb3.append("test.file");
        String sb4 = sb3.toString();
        if (this.f8030c) {
            sb4 = sb2;
        }
        this.f8032e = sb4;
    }

    /* renamed from: b */
    private static float m7598b(int i, int i2, boolean z, String str) throws IOException {
        int i3;
        long j;
        File file = new File(str);
        byte[] bArr = new byte[i];
        if (z) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            j = System.nanoTime();
            int i4 = 0;
            i3 = 0;
            while (i4 < i2) {
                try {
                    randomAccessFile.seek((long) (f8028a.nextInt(i2 - 1) * i));
                    randomAccessFile.readFully(bArr, 0, i);
                    i3 += i;
                    i4++;
                } catch (IOException e) {
                    throw e;
                } catch (Throwable th) {
                    randomAccessFile.close();
                    throw th;
                }
            }
            randomAccessFile.close();
        } else {
            FileInputStream fileInputStream = new FileInputStream(file);
            j = System.nanoTime();
            int i5 = 0;
            int i6 = 0;
            while (i5 < i2) {
                try {
                    fileInputStream.read(bArr, 0, i);
                    i6 = i3 + i;
                    i5++;
                } catch (IOException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    fileInputStream.close();
                    throw th2;
                }
            }
            fileInputStream.close();
        }
        return (((float) i3) / ((float) (System.nanoTime() - j))) * 1000.0f;
    }

    /* renamed from: a */
    private static float m7597a(int i, int i2, boolean z, String str) throws IOException {
        int i3;
        long j;
        byte[] bArr = new byte[i];
        for (int i4 = 0; i4 < i; i4++) {
            bArr[i4] = -16;
        }
        File file = new File(str);
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            file.createNewFile();
        }
        if (z) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            j = System.nanoTime();
            int i5 = 0;
            i3 = 0;
            while (i5 < i2) {
                try {
                    randomAccessFile.seek((long) (f8028a.nextInt(i2 - 1) * i));
                    randomAccessFile.write(bArr, 0, i);
                    i3 += i;
                    i5++;
                } catch (IOException e) {
                    throw e;
                } catch (Throwable th) {
                    randomAccessFile.close();
                    throw th;
                }
            }
            randomAccessFile.close();
        } else {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            j = System.nanoTime();
            int i6 = 0;
            int i7 = 0;
            while (i6 < i2) {
                try {
                    fileOutputStream.write(bArr, 0, i);
                    i7 = i3 + i;
                    i6++;
                } catch (IOException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    fileOutputStream.close();
                    throw th2;
                }
            }
            fileOutputStream.close();
        }
        return (((float) i3) / ((float) (System.nanoTime() - j))) * 1000.0f;
    }
}
