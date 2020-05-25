package com.p683ss.android.socialbase.downloader.exception;

import com.C2240a;

/* renamed from: com.ss.android.socialbase.downloader.exception.DownloadOutOfSpaceException */
public class DownloadOutOfSpaceException extends BaseException {

    /* renamed from: a */
    private final long f54713a;

    /* renamed from: b */
    private final long f54714b;

    public long getAvaliableSpaceBytes() {
        return this.f54713a;
    }

    public long getRequiredSpaceBytes() {
        return this.f54714b;
    }

    public DownloadOutOfSpaceException(long j, long j2) {
        super(1006, C2240a.m6772a("space is not enough required space is : %s but available space is :%s", new Object[]{String.valueOf(j2), String.valueOf(j)}));
        this.f54713a = j;
        this.f54714b = j2;
    }
}
