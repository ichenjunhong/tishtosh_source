package com.p683ss.android.ugc.aweme.feed.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;
import com.p683ss.android.ugc.network.observer.bean.DetectorParam;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.feed.experiment.DetectorParamSettings */
public final class DetectorParamSettings {
    @C10179b
    private static DetectorParam DETECTOR_PARAM;
    public static final DetectorParamSettings INSTANCE = new DetectorParamSettings();

    private DetectorParamSettings() {
    }

    public final DetectorParam getDETECTOR_PARAM() {
        return DETECTOR_PARAM;
    }

    public static final DetectorParam getParameters() {
        DetectorParam detectorParam;
        try {
            detectorParam = (DetectorParam) C10193n.m20607a().mo18202a(DetectorParamSettings.class, "network_monitor_config", C10181b.m20511a().mo18175c().getNetworkMonitorConfig(), "com.ss.android.ugc.network.observer.bean.DetectorParam", DetectorParam.class);
        } catch (Throwable unused) {
            detectorParam = null;
        }
        if (detectorParam != null) {
            return detectorParam;
        }
        return new DetectorParam(new String[]{"8.8.8.8:443", "35.244.141.111:443", "graph.facebook.com:443"});
    }

    public final void setDETECTOR_PARAM(DetectorParam detectorParam) {
        DETECTOR_PARAM = detectorParam;
    }
}
