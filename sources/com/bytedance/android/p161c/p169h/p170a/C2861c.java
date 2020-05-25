package com.bytedance.android.p161c.p169h.p170a;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.p161c.p163b.C2845a;
import com.bytedance.android.p161c.p167f.C2852b;
import com.bytedance.android.p161c.p169h.C2862b;
import com.bytedance.android.p161c.p169h.C2873h;
import com.bytedance.android.p161c.p172j.C2886h;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;

/* renamed from: com.bytedance.android.c.h.a.c */
public class C2861c {

    /* renamed from: a */
    private RandomAccessFile f8517a;

    /* renamed from: b */
    private FileChannel f8518b;

    /* renamed from: c */
    private MappedByteBuffer f8519c;

    /* renamed from: d */
    private File f8520d;

    /* renamed from: e */
    private Handler f8521e;

    /* renamed from: a */
    public void mo7487a(C2873h hVar) throws IOException {
        StringBuilder sb = new StringBuilder("try to close file ");
        sb.append(this.f8520d.getAbsolutePath());
        C2852b.m8149c("SeekableFileWrite", sb.toString());
        this.f8518b.close();
        this.f8517a.close();
        C2862b.f8522a.execute(new Runnable(this.f8519c, this.f8520d.getAbsolutePath(), hVar) {

            /* renamed from: a */
            final /* synthetic */ MappedByteBuffer f8523a;

            /* renamed from: b */
            final /* synthetic */ String f8524b;

            /* renamed from: c */
            final /* synthetic */ C2873h f8525c;

            public final void run() {
                if (this.f8523a != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        this.f8523a.force();
                    } catch (Throwable th) {
                        StringBuilder sb = new StringBuilder("Exception while force data to disk!Exception is ");
                        sb.append(C2886h.m8189a(th));
                        C2852b.m8150d("DirectBufferCleaner", sb.toString());
                    }
                    StringBuilder sb2 = new StringBuilder("Force data ");
                    sb2.append(this.f8524b);
                    sb2.append(" to disk! And use time: ");
                    sb2.append(System.currentTimeMillis() - currentTimeMillis);
                    C2852b.m8149c("DirectBufferCleaner", sb2.toString());
                    this.f8525c.mo7490a();
                }
            }

            {
                this.f8523a = r1;
                this.f8524b = r2;
                this.f8525c = r3;
            }
        });
    }

    /* renamed from: a */
    public void mo7488a(byte[] bArr, int i, int i2) throws IOException {
        this.f8519c.put(bArr, i, i2);
    }

    public C2861c(File file, long j, long j2, long j3, Handler handler) {
        this.f8520d = file;
        this.f8521e = handler;
        try {
            this.f8517a = new RandomAccessFile(this.f8520d, "rw");
            if (this.f8517a.length() != j2) {
                this.f8517a.setLength(j2);
            }
            this.f8518b = this.f8517a.getChannel();
            this.f8519c = this.f8518b.map(MapMode.READ_WRITE, j, j3);
        } catch (IOException e) {
            Message obtain = Message.obtain(this.f8521e);
            obtain.what = 0;
            obtain.obj = new C2845a(6, "error while init RandomAccessFile", e);
            this.f8521e.sendMessage(obtain);
            if (this.f8517a != null) {
                try {
                    this.f8517a.close();
                } catch (IOException unused) {
                }
            }
        }
    }
}
