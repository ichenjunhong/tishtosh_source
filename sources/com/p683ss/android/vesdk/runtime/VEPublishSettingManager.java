package com.p683ss.android.vesdk.runtime;

import com.p683ss.android.ttve.nativePort.C20129b;
import com.p683ss.android.vesdk.VEVideoEncodeSettings;

/* renamed from: com.ss.android.vesdk.runtime.VEPublishSettingManager */
public class VEPublishSettingManager {

    /* renamed from: a */
    public VEVideoEncodeSettings f127469a;

    /* renamed from: com.ss.android.vesdk.runtime.VEPublishSettingManager$a */
    enum C50755a {
        INSTANCE;
        

        /* renamed from: b */
        private VEPublishSettingManager f127472b;

        /* renamed from: a */
        public final VEPublishSettingManager mo99438a() {
            return this.f127472b;
        }
    }

    static {
        C20129b.m49685b();
    }

    private VEPublishSettingManager() {
    }

    public native int nativeGetEnableRemuxErrorCode();

    public native boolean nativeIsCanRemuxVideo();

    public native int nativeSetEditorStatus(long j);

    public native int nativeSetVideoEncodeSettings(VEVideoEncodeSettings vEVideoEncodeSettings, long j);

    public native void nativeUpdateVideoEncodeSettings();

    /* renamed from: a */
    public static VEPublishSettingManager m109851a() {
        return C50755a.INSTANCE.mo99438a();
    }
}
