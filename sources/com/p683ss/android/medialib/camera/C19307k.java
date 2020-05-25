package com.p683ss.android.medialib.camera;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.p683ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import com.p683ss.android.vesdk.p2533c.C50658a;

/* renamed from: com.ss.android.medialib.camera.k */
public final class C19307k {

    /* renamed from: a */
    public int f53342a;

    /* renamed from: b */
    public SurfaceTexture f53343b;

    /* renamed from: c */
    public OnFrameAvailableListener f53344c;

    /* renamed from: d */
    public float[] f53345d = new float[16];

    /* renamed from: c */
    public final void mo39803c() {
        this.f53343b.updateTexImage();
    }

    /* renamed from: b */
    public final void mo39802b() {
        if (this.f53343b != null) {
            this.f53343b.release();
            this.f53343b = null;
        }
        if (this.f53342a != 0) {
            GLES20.glDeleteTextures(1, new int[]{this.f53342a}, 0);
            this.f53342a = 0;
        }
    }

    /* renamed from: a */
    public final void mo39801a() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, VideoPreloadSizeExperiment.DEFAULT, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        this.f53342a = iArr[0];
        this.f53343b = new C50658a(this.f53342a);
        this.f53343b.setOnFrameAvailableListener(new OnFrameAvailableListener() {
            public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (C19307k.this.f53344c != null) {
                    C19307k.this.f53344c.onFrameAvailable(surfaceTexture);
                }
            }
        });
    }

    /* renamed from: d */
    public final double mo39804d() {
        long j;
        if (this.f53343b == null) {
            return -1.0d;
        }
        long nanoTime = System.nanoTime();
        long abs = Math.abs(nanoTime - this.f53343b.getTimestamp());
        if (VERSION.SDK_INT >= 17) {
            j = Math.abs(SystemClock.elapsedRealtimeNanos() - this.f53343b.getTimestamp());
        } else {
            j = Long.MAX_VALUE;
        }
        double min = (double) (nanoTime - Math.min(Math.min(abs, j), Math.abs((SystemClock.uptimeMillis() * 1000000) - this.f53343b.getTimestamp())));
        Double.isNaN(min);
        return min / 1000000.0d;
    }
}
