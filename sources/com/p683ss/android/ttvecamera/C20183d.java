package com.p683ss.android.ttvecamera;

import com.p683ss.android.ttvecamera.p1228c.C20182c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.d */
public final class C20183d {

    /* renamed from: a */
    static String f55492a = ((String) C20182c.m49820a("android.os.SystemProperties", "get", (Object[]) new String[]{"ro.mediatek.platform"}));

    /* renamed from: b */
    static List<String> f55493b = new ArrayList();

    /* renamed from: c */
    static boolean f55494c;

    static {
        Collections.addAll(f55493b, new String[]{"MT6571", "MT6595", "MT6795", "MT6572", "MT6752", "MT6582", "MT6735", "MT6592", "MT6753", "MT6589", "MT6755", "MT6735m", "MT6737T", "MT6580", "MT6750", "MT6750S", "MT6737", "MT6739", "MT6570", "MT6761"});
    }
}
