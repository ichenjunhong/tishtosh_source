package com.p683ss.android.ugc.aweme.services;

import p2628d.C52775l;

/* renamed from: com.ss.android.ugc.aweme.services.PreloadVESoStatus */
public enum PreloadVESoStatus {
    DECOMPRESSING,
    DECOMPRESS_ERROR,
    UNLOAD,
    LOADING,
    LOADED;

    /* renamed from: com.ss.android.ugc.aweme.services.PreloadVESoStatus$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] iArr = new int[PreloadVESoStatus.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[PreloadVESoStatus.DECOMPRESS_ERROR.ordinal()] = 1;
            $EnumSwitchMapping$0[PreloadVESoStatus.DECOMPRESSING.ordinal()] = 2;
            $EnumSwitchMapping$0[PreloadVESoStatus.UNLOAD.ordinal()] = 3;
            $EnumSwitchMapping$0[PreloadVESoStatus.LOADING.ordinal()] = 4;
            $EnumSwitchMapping$0[PreloadVESoStatus.LOADED.ordinal()] = 5;
        }
    }

    public final int toStatusCode() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return -3;
            case 2:
                return -2;
            case 3:
                return -1;
            case 4:
                return 0;
            case 5:
                return 1;
            default:
                throw new C52775l();
        }
    }
}
