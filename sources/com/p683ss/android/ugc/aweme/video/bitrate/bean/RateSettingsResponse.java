package com.p683ss.android.ugc.aweme.video.bitrate.bean;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.video.bitrate.bean.RateSettingsResponse */
public class RateSettingsResponse extends BaseResponse {
    @C17952c(mo34828a = "adaptive_gear_group")
    private C48000b adaptiveGearGroup;
    @C17952c(mo34828a = "auto_bitrate_params")
    private C47999a autoBitrateSet;
    @C17952c(mo34828a = "bandwidth_map")
    private List<BandwidthSet> bandwidthSet;
    @C17952c(mo34828a = "default_gear_group")
    private String defaultGearGroup;
    @C17952c(mo34828a = "definition_gear_group")
    private C48000b definitionGearGroup;
    @C17952c(mo34828a = "flow_gear_group")
    private C48000b flowGearGroup;
    @C17952c(mo34828a = "gear_set")
    private List<GearSet> gearSet;

    public C48000b getAdaptiveGearGroup() {
        return this.adaptiveGearGroup;
    }

    public C47999a getAutoBitrateSet() {
        return this.autoBitrateSet;
    }

    public List<BandwidthSet> getBandwidthSet() {
        return this.bandwidthSet;
    }

    public String getDefaultGearGroup() {
        return this.defaultGearGroup;
    }

    public C48000b getDefinitionGearGroup() {
        return this.definitionGearGroup;
    }

    public C48000b getFlowGearGroup() {
        return this.flowGearGroup;
    }

    public List<GearSet> getGearSet() {
        return this.gearSet;
    }

    public boolean isValid() {
        if (this.adaptiveGearGroup == null || (this.gearSet == null && this.bandwidthSet == null && this.autoBitrateSet == null)) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RateSettingsResponse{flowGearGroup=");
        sb.append(this.flowGearGroup);
        sb.append(", adaptiveGearGroup=");
        sb.append(this.adaptiveGearGroup);
        sb.append(", defaultGearGroup='");
        sb.append(this.defaultGearGroup);
        sb.append('\'');
        sb.append(", definitionGearGroup=");
        sb.append(this.definitionGearGroup);
        sb.append(", gearSet=");
        sb.append(this.gearSet);
        sb.append(", bandwidthSet=");
        sb.append(this.bandwidthSet);
        sb.append(", autoBitrateSet=");
        sb.append(this.autoBitrateSet);
        sb.append('}');
        return sb.toString();
    }

    public void setAdaptiveGearGroup(C48000b bVar) {
        this.adaptiveGearGroup = bVar;
    }

    public void setAutoBitrateSet(C47999a aVar) {
        this.autoBitrateSet = aVar;
    }

    public void setBandwidthSet(List<BandwidthSet> list) {
        this.bandwidthSet = list;
    }

    public void setDefaultGearGroup(String str) {
        this.defaultGearGroup = str;
    }

    public void setDefinitionGearGroup(C48000b bVar) {
        this.definitionGearGroup = bVar;
    }

    public void setFlowGearGroup(C48000b bVar) {
        this.flowGearGroup = bVar;
    }

    public void setGearSet(List<GearSet> list) {
        this.gearSet = list;
    }
}
