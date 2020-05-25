package com.p683ss.android.socialbase.downloader.model;

import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.ss.android.socialbase.downloader.model.b */
public final class C20048b {

    /* renamed from: a */
    public BufferedOutputStream f55088a;

    /* renamed from: b */
    public RandomAccessFile f55089b;

    /* renamed from: c */
    private FileDescriptor f55090c;

    /* renamed from: b */
    public final void mo42095b() throws IOException {
        if (this.f55089b != null) {
            this.f55089b.close();
        }
        this.f55088a.close();
    }

    /* renamed from: a */
    public final void mo42093a() throws IOException {
        if (this.f55088a != null) {
            this.f55088a.flush();
        }
        if (this.f55090c != null) {
            this.f55090c.sync();
        }
    }

    /* renamed from: a */
    public final void mo42094a(long j) throws IOException {
        this.f55089b.setLength(j);
    }

    public C20048b(File file, int i) throws BaseException {
        try {
            this.f55089b = new RandomAccessFile(file, "rw");
            this.f55090c = this.f55089b.getFD();
            if (i > 0) {
                int i2 = 131072;
                if (i < 8192) {
                    i2 = VideoCacheReadBuffersizeExperiment.DEFAULT;
                } else if (i <= 131072) {
                    i2 = i;
                }
                this.f55088a = new BufferedOutputStream(new FileOutputStream(this.f55089b.getFD()), i2);
                return;
            }
            this.f55088a = new BufferedOutputStream(new FileOutputStream(this.f55089b.getFD()));
        } catch (IOException e) {
            throw new BaseException(1039, (Throwable) e);
        }
    }
}
