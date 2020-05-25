package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

final class bnh extends Thread {

    /* renamed from: a */
    private final /* synthetic */ AudioTrack f43077a;

    /* renamed from: b */
    private final /* synthetic */ bng f43078b;

    bnh(bng bng, AudioTrack audioTrack) {
        this.f43078b = bng;
        this.f43077a = audioTrack;
    }

    public final void run() {
        try {
            this.f43077a.flush();
            this.f43077a.release();
        } finally {
            this.f43078b.f43075y.open();
        }
    }
}
