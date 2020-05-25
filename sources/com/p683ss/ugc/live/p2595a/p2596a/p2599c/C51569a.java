package com.p683ss.ugc.live.p2595a.p2596a.p2599c;

import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import com.p683ss.ugc.live.p2595a.p2596a.C51568c;
import java.io.File;

/* renamed from: com.ss.ugc.live.a.a.c.a */
public class C51569a extends RuntimeException {

    /* renamed from: a */
    private C51568c f128824a;

    public C51568c getResourceRequest() {
        return this.f128824a;
    }

    public long getId() {
        return this.f128824a.f128817a;
    }

    public String toString() {
        String runtimeException = super.toString();
        Throwable cause = getCause();
        if (cause == null || cause == this) {
            return runtimeException;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(runtimeException);
        sb.append("\n");
        sb.append(cause.toString());
        return sb.toString();
    }

    public String getMessage() {
        long j;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f128824a.toString());
        sb.append("\navailable disk space:");
        String path = Environment.getDataDirectory().getPath();
        if (VERSION.SDK_INT >= 18) {
            StatFs statFs = new StatFs(path);
            j = (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1024;
        } else {
            j = new File(path).getFreeSpace() / 1024;
        }
        sb.append(j);
        sb.append("KB\n");
        sb.append(super.getMessage());
        return sb.toString();
    }

    public C51569a(C51568c cVar) {
        this.f128824a = cVar;
    }

    public C51569a(String str, C51568c cVar) {
        super(str);
        this.f128824a = cVar;
    }

    public C51569a(String str, Throwable th, C51568c cVar) {
        super(str, th);
        this.f128824a = cVar;
    }
}
