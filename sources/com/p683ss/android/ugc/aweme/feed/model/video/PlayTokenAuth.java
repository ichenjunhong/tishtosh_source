package com.p683ss.android.ugc.aweme.feed.model.video;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.model.video.PlayTokenAuth */
public final class PlayTokenAuth implements Serializable {
    @C17952c(mo34828a = "auth")
    public String auth;
    public int hostIndex;
    @C17952c(mo34828a = "hosts")
    public List<String> hosts;
    @C17952c(mo34828a = "token")
    public String token;
    @C17952c(mo34828a = "vid")
    public String vid;

    public final String getAuth() {
        return this.auth;
    }

    public final int getHostIndex() {
        return this.hostIndex;
    }

    public final List<String> getHosts() {
        return this.hosts;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getVid() {
        return this.vid;
    }

    public final void resetHostIndex() {
        this.hostIndex = 0;
    }

    public final boolean tryUseNextHost() {
        if (this.hosts != null) {
            int i = this.hostIndex;
            List<String> list = this.hosts;
            if (list == null) {
                C52711k.m112234a();
            }
            if (i < list.size() - 1) {
                this.hostIndex++;
                return true;
            }
        }
        return false;
    }

    public final String tryGetHost() {
        if (this.hosts != null) {
            int i = this.hostIndex;
            List<String> list = this.hosts;
            if (list == null) {
                C52711k.m112234a();
            }
            if (i < list.size()) {
                List<String> list2 = this.hosts;
                if (list2 == null) {
                    C52711k.m112234a();
                }
                return (String) list2.get(this.hostIndex);
            }
        }
        return null;
    }

    public final void setAuth(String str) {
        this.auth = str;
    }

    public final void setHostIndex(int i) {
        this.hostIndex = i;
    }

    public final void setHosts(List<String> list) {
        this.hosts = list;
    }

    public final void setToken(String str) {
        this.token = str;
    }

    public final void setVid(String str) {
        this.vid = str;
    }
}
