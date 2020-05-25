package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeACLShare */
public final class AwemeACLShare implements Serializable {
    @C17952c(mo34828a = "download_general")
    public ACLCommonShare downloadGeneral;
    @C17952c(mo34828a = "download_mask_panel")
    public ACLCommonShare downloadMaskPanel;
    @C17952c(mo34828a = "download_share_panel")
    public ACLCommonShare downloadSharePanel;

    public final ACLCommonShare getDownloadGeneral() {
        return this.downloadGeneral;
    }

    public final ACLCommonShare getDownloadMaskPanel() {
        return this.downloadMaskPanel;
    }

    public final ACLCommonShare getDownloadSharePanel() {
        return this.downloadSharePanel;
    }

    public final void setDownloadGeneral(ACLCommonShare aCLCommonShare) {
        this.downloadGeneral = aCLCommonShare;
    }

    public final void setDownloadMaskPanel(ACLCommonShare aCLCommonShare) {
        this.downloadMaskPanel = aCLCommonShare;
    }

    public final void setDownloadSharePanel(ACLCommonShare aCLCommonShare) {
        this.downloadSharePanel = aCLCommonShare;
    }
}
