package dmt.p2652av.video;

import com.p683ss.android.ttve.nativePort.TEVideoUtils;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.p683ss.android.ugc.aweme.utils.C47804db;
import com.p683ss.android.ugc.aweme.utils.C47926h;
import com.p683ss.android.vesdk.VEUtils;

/* renamed from: dmt.av.video.al */
public final class C52928al {
    /* renamed from: a */
    public static int[] m112612a(String str) {
        int[] iArr = new int[10];
        if (TEVideoUtils.getVideoFileInfo(C47926h.m103696a(str, C47804db.VIDEO), iArr) == 0) {
            return iArr;
        }
        return null;
    }

    /* renamed from: b */
    public static VideoFileInfo m112613b(String str) {
        int[] a = m112612a(str);
        if (a == null) {
            return null;
        }
        VideoFileInfo videoFileInfo = new VideoFileInfo(a[0], a[1], (long) a[3], a[7], a[6]);
        return videoFileInfo;
    }

    /* renamed from: c */
    public static int m112614c(String str) {
        int[] iArr = new int[10];
        if (TEVideoUtils.getVideoFileInfo(C47926h.m103696a(str, C47804db.VIDEO), iArr) == 0) {
            return iArr[7];
        }
        return 0;
    }

    /* renamed from: d */
    public static int m112615d(String str) {
        int[] iArr = new int[10];
        if (TEVideoUtils.getVideoFileInfo(C47926h.m103696a(str, C47804db.VIDEO), iArr) == 0) {
            return iArr[6];
        }
        return 0;
    }

    /* renamed from: e */
    public static int m112616e(String str) {
        int[] iArr = new int[10];
        if (VEUtils.getVideoFileInfo(C47926h.m103696a(str, C47804db.VIDEO), iArr) == 0) {
            return iArr[2];
        }
        return 0;
    }
}
