package com.p683ss.android.ugc.aweme.p1807im.service.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.poi.C39054d;
import java.io.Serializable;
import java.text.DecimalFormat;

/* renamed from: com.ss.android.ugc.aweme.im.service.model.b */
public final class C35465b implements Serializable {
    public static final DecimalFormat GPS_FMT = new DecimalFormat("##0.000000");
    @C17952c(mo34828a = "commerce_scene")
    public String commerceScene = "";
    @C17952c(mo34828a = "ext")
    public String ext = "";
    @C17952c(mo34828a = "location")
    public String location = "";
    @C17952c(mo34828a = "object_id")
    public String objectId = "";

    public final void setLoc(C39054d dVar) {
        if (dVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(GPS_FMT.format(dVar.longitude));
            sb.append(",");
            sb.append(GPS_FMT.format(dVar.latitude));
            this.location = sb.toString();
        }
    }
}
