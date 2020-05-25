package com.p683ss.android.ugc.aweme.story.model;

import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.p965e.C14001h;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14234d;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.story.p2337b.C46636a;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.story.model.StoryDetail */
public class StoryDetail implements Cloneable {
    @C17952c(mo34828a = "aweme_list")
    List<Aweme> awemeList;
    @C17952c(mo34828a = "requestId")
    String requestId;
    @C17952c(mo34828a = "status_code")
    int statusCode;

    public List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public JSONObject getRequestIdJsonObject() {
        return C46636a.m101191a(this.requestId);
    }

    public StoryDetail clone() {
        try {
            return (StoryDetail) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Aweme getFirstAweme() {
        if (getAwemeList() == null || getAwemeList().size() <= 0) {
            return null;
        }
        return (Aweme) getAwemeList().get(0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StoryListResponse{statusCode=");
        sb.append(this.statusCode);
        sb.append(", awemeList=");
        sb.append(this.awemeList);
        sb.append('}');
        return sb.toString();
    }

    public boolean needDownloadFirstCover() {
        Aweme firstAweme = getFirstAweme();
        if (!(firstAweme == null || firstAweme.getVideo() == null)) {
            C14229b[] a = C23515d.m57684a(firstAweme.getVideo().getOriginCover(), (C13952d) null, (C14234d) null);
            if (a.length > 0) {
                C14001h c = C13771c.m27875c();
                for (C14229b a2 : a) {
                    if (c.mo26187a(a2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void setAwemeList(List<Aweme> list) {
        this.awemeList = list;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }
}
