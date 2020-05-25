package com.p683ss.android.ugc.aweme.services;

import com.p683ss.android.ttve.nativePort.C20129b.C20135f;
import p2628d.C52775l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.IPreloadVESoKt */
public final class IPreloadVESoKt {

    /* renamed from: com.ss.android.ugc.aweme.services.IPreloadVESoKt$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C20135f.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[C20135f.NOT_LOAD.ordinal()] = 1;
            $EnumSwitchMapping$0[C20135f.LOADING.ordinal()] = 2;
            $EnumSwitchMapping$0[C20135f.LOADED.ordinal()] = 3;
        }
    }

    public static final int toStatusCode(C20135f fVar) {
        C52711k.m112240b(fVar, "loadStatus");
        switch (WhenMappings.$EnumSwitchMapping$0[fVar.ordinal()]) {
            case 1:
                return -1;
            case 2:
                return 0;
            case 3:
                return 1;
            default:
                throw new C52775l();
        }
    }
}
