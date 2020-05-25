package com.p683ss.android.ugc.aweme.discover.model.suggest;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.discover.model.suggest.SugExtraInfo */
public final class SugExtraInfo implements Serializable {
    @C17952c(mo34828a = "is_rich_sug")
    private String _isRichSug = "";
    @C17952c(mo34828a = "rich_sug_user_type")
    private String _richSugUserType = "";
    @C17952c(mo34828a = "rich_sug_avatar_uri")
    private String richSugAvatarUri = "";
    @C17952c(mo34828a = "rich_sug_nickname")
    private String richSugNickname = "";

    public final String getRichSugAvatarUri() {
        return this.richSugAvatarUri;
    }

    public final String getRichSugNickname() {
        return this.richSugNickname;
    }

    public final boolean isRichSug() {
        return C52711k.m112239a((Object) this._isRichSug, (Object) "1");
    }

    public final int getRichSugUserType() {
        String str = this._richSugUserType;
        if (str != null) {
            Integer c = C52830p.m112395c(str);
            if (c != null) {
                return c.intValue();
            }
        }
        return -1;
    }

    public final void setRichSugAvatarUri(String str) {
        this.richSugAvatarUri = str;
    }

    public final void setRichSugNickname(String str) {
        this.richSugNickname = str;
    }
}
