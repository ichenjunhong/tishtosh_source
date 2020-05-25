package com.bytedance.android.livesdkapi.host.vigo;

import android.content.Context;
import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.livesdkapi.host.IHostPlugin.C8768a;
import com.bytedance.android.livesdkapi.p456j.C8828a;

public interface IHostPluginForVigo extends C2952b {
    void check(Context context, C8828a aVar, String str, C8768a aVar2);

    boolean checkPluginInstalled(String str);

    String getHostPackageName();

    int getPluginAttributeMinVersion(String str);

    boolean isFull();

    boolean loadLibrary(int i, Context context, String str, String str2, ClassLoader classLoader);

    void preload(String str);
}
