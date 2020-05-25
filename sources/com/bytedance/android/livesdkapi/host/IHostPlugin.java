package com.bytedance.android.livesdkapi.host;

import android.content.Context;
import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.livesdkapi.p456j.C8828a;

public interface IHostPlugin extends C2952b {
    public static final int LOAD_TYPE_HOST = 1;
    public static final int LOAD_TYPE_OTHER = 2;
    public static final int LOAD_TYPE_PLUGIN = 0;

    /* renamed from: com.bytedance.android.livesdkapi.host.IHostPlugin$a */
    public interface C8768a {
        /* renamed from: a */
        void mo8214a(String str);
    }

    void check(Context context, C8828a aVar, String str, C8768a aVar2);

    boolean checkPluginInstalled(String str);

    String getHostModeFilePath();

    String getHostPackageName();

    int getPluginAttributeMinVersion(String str);

    boolean isFull();

    boolean loadLibrary(int i, Context context, String str, String str2, ClassLoader classLoader);

    void preload(String str);
}
