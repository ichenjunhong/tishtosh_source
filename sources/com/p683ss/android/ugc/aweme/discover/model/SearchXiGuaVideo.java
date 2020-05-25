package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchXiGuaVideo */
public final class SearchXiGuaVideo implements Serializable {
    @C17952c(mo34828a = "position")
    private List<? extends Position> position;
    @C17952c(mo34828a = "video_info")
    private XiGuaVideo video;

    public final List<Position> getPosition() {
        return this.position;
    }

    public final XiGuaVideo getVideo() {
        return this.video;
    }

    public final void setPosition(List<? extends Position> list) {
        this.position = list;
    }

    public final void setVideo(XiGuaVideo xiGuaVideo) {
        this.video = xiGuaVideo;
    }
}
