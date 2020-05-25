package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

final class bim extends Thread {

    /* renamed from: a */
    private final /* synthetic */ AudioTrack f42523a;

    /* renamed from: b */
    private final /* synthetic */ bil f42524b;

    bim(bil bil, AudioTrack audioTrack) {
        this.f42524b = bil;
        this.f42523a = audioTrack;
    }

    public final void run() {
        try {
            this.f42523a.release();
        } finally {
            this.f42524b.f42511o.open();
        }
    }
}
