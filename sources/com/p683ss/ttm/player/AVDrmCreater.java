package com.p683ss.ttm.player;

/* renamed from: com.ss.ttm.player.AVDrmCreater */
public class AVDrmCreater {
    public static synchronized long createDrm(int i) {
        synchronized (AVDrmCreater.class) {
            if (i != 1) {
                return 0;
            }
            long createDrm = createDrm("com.ss.ttm.drm.intertrust.IntertrustDrm");
            return createDrm;
        }
    }

    private static long createDrm(String str) {
        try {
            return Long.valueOf(String.valueOf(Class.forName(str).getMethod("createDrm", new Class[0]).invoke(null, new Object[0]))).longValue();
        } catch (Exception unused) {
            return 0;
        }
    }
}
