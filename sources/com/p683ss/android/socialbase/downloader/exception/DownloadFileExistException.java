package com.p683ss.android.socialbase.downloader.exception;

/* renamed from: com.ss.android.socialbase.downloader.exception.DownloadFileExistException */
public class DownloadFileExistException extends BaseException {

    /* renamed from: a */
    private String f54711a;

    public String getExistTargetFileName() {
        return this.f54711a;
    }

    public DownloadFileExistException(String str) {
        this.f54711a = str;
    }
}
