package com.bytedance.netecho;

import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

public final class NetechoConfig {
    public static final NetechoConfig INSTANCE = new NetechoConfig();
    private static C52671b<? super String, C52860x> loadLibrary = NetechoConfig$loadLibrary$1.INSTANCE;

    private NetechoConfig() {
    }

    public final C52671b<String, C52860x> getLoadLibrary() {
        return loadLibrary;
    }

    public final void setLoadLibrary(C52671b<? super String, C52860x> bVar) {
        C52711k.m112240b(bVar, "<set-?>");
        loadLibrary = bVar;
    }
}
