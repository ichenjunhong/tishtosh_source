package com.p683ss.android.vesdk;

import android.graphics.Bitmap;

/* renamed from: com.ss.android.vesdk.VEMusicBitmapParam */
public class VEMusicBitmapParam {
    public int lineCnt;
    public Bitmap lyricsBitmap;

    public VEMusicBitmapParam(Bitmap bitmap, int i) {
        this.lyricsBitmap = bitmap;
        this.lineCnt = i;
    }
}
