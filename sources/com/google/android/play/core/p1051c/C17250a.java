package com.google.android.play.core.p1051c;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.security.MessageDigest;

/* renamed from: com.google.android.play.core.c.a */
final class C17250a implements C17252ab {

    /* renamed from: a */
    private final FileChannel f48722a;

    /* renamed from: b */
    private final long f48723b;

    /* renamed from: c */
    private final long f48724c;

    public C17250a(FileChannel fileChannel, long j, long j2) {
        this.f48722a = fileChannel;
        this.f48723b = j;
        this.f48724c = j2;
    }

    /* renamed from: a */
    public final long mo33525a() {
        return this.f48724c;
    }

    /* renamed from: a */
    public final void mo33526a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = this.f48722a.map(MapMode.READ_ONLY, this.f48723b + j, (long) i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
