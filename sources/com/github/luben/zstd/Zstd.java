package com.github.luben.zstd;

import com.github.luben.zstd.p996a.C14726a;

public class Zstd {
    static {
        C14726a.load();
    }

    public static native long getErrorCode(long j);

    public static native String getErrorName(long j);

    public static native boolean isError(long j);
}
