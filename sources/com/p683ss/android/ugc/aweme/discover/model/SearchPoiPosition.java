package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchPoiPosition */
public class SearchPoiPosition implements Serializable {
    @C17952c(mo34828a = "position")
    public List<Position> position;
    @C17952c(mo34828a = "target")
    String target;

    public boolean isPoiAddress() {
        return "poi_address".endsWith(this.target);
    }

    public boolean isPoiName() {
        return "poi_name".endsWith(this.target);
    }
}
