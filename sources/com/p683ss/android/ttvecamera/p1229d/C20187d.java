package com.p683ss.android.ttvecamera.p1229d;

import android.content.Context;
import com.p683ss.android.ttvecamera.p1228c.C20182c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.d.d */
public final class C20187d extends C20186c {

    /* renamed from: d */
    private static String f55500d = ((String) C20182c.m49820a("android.os.SystemProperties", "get", (Object[]) new String[]{"ro.mediatek.platform"}));

    /* renamed from: e */
    private static List<String> f55501e = new ArrayList();

    static {
        Collections.addAll(f55501e, new String[]{"MT6571", "MT6595", "MT6795", "MT6572", "MT6752", "MT6582", "MT6735", "MT6592", "MT6753", "MT6589", "MT6755", "MT6735m", "MT6737T", "MT6580", "MT6750", "MT6750S", "MT6737", "MT6739", "MT6570", "MT6761"});
    }

    public C20187d(Context context) {
        super(context);
    }
}
