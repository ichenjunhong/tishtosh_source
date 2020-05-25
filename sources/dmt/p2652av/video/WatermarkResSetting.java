package dmt.p2652av.video;

import com.google.gson.p1076a.C17952c;

/* renamed from: dmt.av.video.WatermarkResSetting */
public final class WatermarkResSetting {
    private final int height;
    @C17952c(mo34828a = "min_allow_disk_mb")
    private final int minAllowDiskMB;
    private final int width;

    public final int getHeight() {
        return this.height;
    }

    public final int getMinAllowDiskMB() {
        return this.minAllowDiskMB;
    }

    public final int getWidth() {
        return this.width;
    }

    public WatermarkResSetting(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.minAllowDiskMB = i3;
    }
}
