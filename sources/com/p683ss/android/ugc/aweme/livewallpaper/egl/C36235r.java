package com.p683ss.android.ugc.aweme.livewallpaper.egl;

import android.opengl.GLES20;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.r */
public class C36235r extends C36232o {

    /* renamed from: c */
    private int f92766c;

    /* renamed from: d */
    private int f92767d;

    /* renamed from: c */
    public final void mo75015c() {
        super.mo75015c();
        if (this.f92766c != 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{this.f92766c}, 0);
            this.f92766c = 0;
        }
        if (this.f92767d != 0) {
            GLES20.glDeleteTextures(1, new int[]{this.f92767d}, 0);
            this.f92767d = 0;
        }
    }

    /* renamed from: a */
    public final boolean mo75014a(int i, int i2) {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        this.f92766c = iArr[0];
        if (!super.mo75014a(i, i2)) {
            return false;
        }
        this.f92767d = C36222i.m81795a(null, i, i2, 6408);
        return true;
    }
}
