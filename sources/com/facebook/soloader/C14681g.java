package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* renamed from: com.facebook.soloader.g */
public final class C14681g implements Closeable {

    /* renamed from: a */
    private final FileOutputStream f38065a;

    /* renamed from: b */
    private final FileLock f38066b;

    public final void close() throws IOException {
        try {
            if (this.f38066b != null) {
                this.f38066b.release();
            }
        } finally {
            this.f38065a.close();
        }
    }

    C14681g(File file) throws IOException {
        this.f38065a = new FileOutputStream(file);
        try {
            FileLock lock = this.f38065a.getChannel().lock();
            if (lock == null) {
            }
            this.f38066b = lock;
        } finally {
            this.f38065a.close();
        }
    }
}
