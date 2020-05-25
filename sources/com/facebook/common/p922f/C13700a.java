package com.facebook.common.p922f;

import com.facebook.common.p920d.C13683f;
import java.util.Map;

/* renamed from: com.facebook.common.f.a */
public final class C13700a {

    /* renamed from: a */
    public static final Map<String, String> f35673a = C13683f.m27638of("mkv", "video/x-matroska", "glb", "model/gltf-binary");

    /* renamed from: a */
    public static boolean m27723a(String str) {
        if (str == null || !str.startsWith("video/")) {
            return false;
        }
        return true;
    }
}
