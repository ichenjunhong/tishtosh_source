package com.p2620vk.sdk.api;

import com.p2620vk.sdk.p2621a.C52325c;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.vk.sdk.api.c */
public final class C52352c extends LinkedHashMap<String, Object> implements Serializable {
    private static final long serialVersionUID = -7183150344504033644L;

    public C52352c() {
    }

    public C52352c(Map<String, Object> map) {
        super(map);
    }

    public static C52352c from(Object... objArr) {
        return new C52352c(C52325c.m111794a(objArr));
    }
}
