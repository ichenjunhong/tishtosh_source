package com.p683ss.android.ugc.aweme.notice.repo;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.TutorialVideoResp */
public final class TutorialVideoResp extends BaseResponse {
    @C17952c(mo34828a = "unread_count")
    private final int count;
    @C17952c(mo34828a = "tutorial_video_info")
    private final TutorialVideoInfo info;

    public static /* synthetic */ TutorialVideoResp copy$default(TutorialVideoResp tutorialVideoResp, TutorialVideoInfo tutorialVideoInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            tutorialVideoInfo = tutorialVideoResp.info;
        }
        if ((i2 & 2) != 0) {
            i = tutorialVideoResp.count;
        }
        return tutorialVideoResp.copy(tutorialVideoInfo, i);
    }

    public final TutorialVideoInfo component1() {
        return this.info;
    }

    public final int component2() {
        return this.count;
    }

    public final TutorialVideoResp copy(TutorialVideoInfo tutorialVideoInfo, int i) {
        C52711k.m112240b(tutorialVideoInfo, "info");
        return new TutorialVideoResp(tutorialVideoInfo, i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TutorialVideoResp) {
                TutorialVideoResp tutorialVideoResp = (TutorialVideoResp) obj;
                if (C52711k.m112239a((Object) this.info, (Object) tutorialVideoResp.info)) {
                    if (this.count == tutorialVideoResp.count) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getCount() {
        return this.count;
    }

    public final TutorialVideoInfo getInfo() {
        return this.info;
    }

    public final int hashCode() {
        TutorialVideoInfo tutorialVideoInfo = this.info;
        return ((tutorialVideoInfo != null ? tutorialVideoInfo.hashCode() : 0) * 31) + this.count;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TutorialVideoResp(info=");
        sb.append(this.info);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(")");
        return sb.toString();
    }

    public TutorialVideoResp(TutorialVideoInfo tutorialVideoInfo, int i) {
        C52711k.m112240b(tutorialVideoInfo, "info");
        this.info = tutorialVideoInfo;
        this.count = i;
    }
}
