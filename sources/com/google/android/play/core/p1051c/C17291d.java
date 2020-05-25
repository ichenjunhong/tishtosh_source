package com.google.android.play.core.p1051c;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import com.google.android.play.core.p1053e.C17344i;
import com.google.android.play.core.p1053e.C17353r;
import com.google.android.play.core.p1053e.C17359x;
import com.google.android.play.core.splitcompat.C17386d;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.c.d */
public final class C17291d implements C17344i {

    /* renamed from: a */
    final Context f48768a;

    /* renamed from: b */
    final C17253ac f48769b;

    /* renamed from: c */
    private final C17386d f48770c;

    /* renamed from: d */
    private final Executor f48771d;

    /* renamed from: e */
    private final C17359x f48772e;

    public C17291d(Context context, Executor executor, C17253ac acVar, C17386d dVar, C17359x xVar) {
        this.f48768a = context;
        this.f48770c = dVar;
        this.f48769b = acVar;
        this.f48771d = executor;
        this.f48772e = xVar;
    }

    /* renamed from: a */
    public final void mo33592a(List<Intent> list, C17353r rVar) {
        mo33593b(list, rVar);
    }

    /* renamed from: b */
    public final void mo33593b(List<Intent> list, C17353r rVar) {
        if (C17359x.m42516a()) {
            this.f48771d.execute(new C17293f(this, list, rVar));
            return;
        }
        throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Integer mo33591a(List<Intent> list) {
        FileChannel channel;
        FileLock fileLock;
        try {
            channel = new RandomAccessFile(new File(this.f48770c.mo33703d(), "lock.tmp"), "rw").getChannel();
            Integer num = null;
            try {
                fileLock = channel.tryLock();
            } catch (OverlappingFileLockException unused) {
                fileLock = null;
            }
            if (fileLock != null) {
                num = Integer.valueOf(m42345b(list));
                fileLock.release();
            }
            if (channel != null) {
                channel.close();
            }
            return num;
        } catch (Exception unused2) {
            return Integer.valueOf(-13);
        } catch (Throwable th) {
            C17261ak.m42289a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    private final int m42345b(List<Intent> list) {
        FileOutputStream fileOutputStream;
        try {
            for (Intent intent : list) {
                String stringExtra = intent.getStringExtra("split_id");
                AssetFileDescriptor openAssetFileDescriptor = this.f48768a.getContentResolver().openAssetFileDescriptor(intent.getData(), "r");
                File file = new File(this.f48770c.mo33699b(), C17386d.m42589d(stringExtra));
                if (((file.exists() && file.length() != openAssetFileDescriptor.getLength()) || !file.exists()) && !this.f48770c.mo33695a(stringExtra).exists()) {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(openAssetFileDescriptor.createInputStream());
                    try {
                        fileOutputStream = new FileOutputStream(file);
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = bufferedInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        fileOutputStream.close();
                        bufferedInputStream.close();
                    } catch (Throwable th) {
                        bufferedInputStream.close();
                        throw th;
                    }
                }
            }
            try {
                return !this.f48769b.mo33527a() ? -11 : 0;
            } catch (Exception unused) {
                return -11;
            }
            throw th;
        } catch (Exception unused2) {
            return -13;
        } catch (Throwable th2) {
            C17261ak.m42289a(th, th2);
        }
    }
}
