package com.p683ss.video.rtc.base.utils;

import com.google.gson.C17971f;
import com.google.gson.C17978g;

/* renamed from: com.ss.video.rtc.base.utils.JsonUtils */
public class JsonUtils {
    private static final C17971f sGson = new C17978g().mo34900d();

    public static String toJson(Object obj) {
        return sGson.mo34889b(obj);
    }

    public static <T> T fromJson(String str, Class<T> cls) {
        return sGson.mo34884a(str, cls);
    }

    public static <T> T convert(Object obj, Class<T> cls) {
        C17971f fVar = sGson;
        return fVar.mo34884a(fVar.mo34889b(obj), cls);
    }
}
