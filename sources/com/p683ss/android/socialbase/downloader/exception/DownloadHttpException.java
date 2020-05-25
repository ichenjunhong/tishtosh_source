package com.p683ss.android.socialbase.downloader.exception;

/* renamed from: com.ss.android.socialbase.downloader.exception.DownloadHttpException */
public class DownloadHttpException extends BaseException {

    /* renamed from: a */
    private final int f54712a;

    public int getHttpStatusCode() {
        return this.f54712a;
    }

    public DownloadHttpException(int i, int i2, String str) {
        super(i, str);
        this.f54712a = i2;
    }
}
