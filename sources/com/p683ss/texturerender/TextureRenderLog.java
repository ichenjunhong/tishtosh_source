package com.p683ss.texturerender;

import android.util.Log;

/* renamed from: com.ss.texturerender.TextureRenderLog */
public class TextureRenderLog {
    private static OnLogListener mLogListener;

    /* renamed from: com.ss.texturerender.TextureRenderLog$OnLogListener */
    public interface OnLogListener {
        int log(String str, String str2);
    }

    public static synchronized void setOnLogListener(OnLogListener onLogListener) {
        synchronized (TextureRenderLog.class) {
            mLogListener = onLogListener;
        }
    }

    /* renamed from: d */
    public static int m110623d(String str, String str2) {
        if (mLogListener == null) {
            return Log.d(str, str2);
        }
        return mLogListener.log(str, str2);
    }
}
