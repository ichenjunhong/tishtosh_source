package com.bytedance.android.livesdkapi.host.douyin;

import android.content.Context;
import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.livesdkapi.host.IHostPlugin.C8768a;
import com.bytedance.android.livesdkapi.p456j.C8828a;

public interface IHostPluginForDouyin extends C2952b {
    public static final int LOAD_TYPE_HOST = 1;
    public static final int LOAD_TYPE_OTHER = 2;
    public static final int LOAD_TYPE_PLUGIN = 0;

    void check(Context context, C8828a aVar, String str, C8768a aVar2);

    boolean checkPluginInstalled(String str);

    String getHostPackageName();

    int getPluginAttributeMinVersion(String str);

    boolean isFull();

    boolean loadLibrary(int i, Context context, String str, String str2, ClassLoader classLoader);

    void preload(String str);
}
