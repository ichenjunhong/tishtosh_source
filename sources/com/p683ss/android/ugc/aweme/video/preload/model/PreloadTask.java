package com.p683ss.android.ugc.aweme.video.preload.model;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.video.preload.model.PreloadTask */
public class PreloadTask {
    public static final int BYTE_UNIT_NUMBER = 1024;
    public boolean alreadyPreload;
    @C17952c(mo34828a = "count")
    public int count = 1;
    @C17952c(mo34828a = "offset")
    public int offset;
    @C17952c(mo34828a = "download_progress")
    public int progress = 100;
    @C17952c(mo34828a = "size")
    private int size;

    public PreloadTask() {
    }

    public int getVideoPreloadSize() {
        if (this.size <= 0) {
            return 10485759;
        }
        return this.size * BYTE_UNIT_NUMBER;
    }

    public PreloadTask(int i, int i2) {
        this.count = i;
        this.size = i2;
    }
}
