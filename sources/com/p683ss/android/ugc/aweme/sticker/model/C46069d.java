package com.p683ss.android.ugc.aweme.sticker.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.share.ShareInfo;
import com.p683ss.android.ugc.aweme.base.utils.C23722i;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.model.d */
public final class C46069d implements Serializable {
    @C17952c(mo34828a = "avatar_thumb")
    public UrlModel avatarThumb;
    @C17952c(mo34828a = "children")
    public List<String> children;
    @C17952c(mo34828a = "commerce_sticker")
    public C46067b commerceSticker;
    @C17952c(mo34828a = "desc")
    public String desc;
    @C17952c(mo34828a = "extra")
    public String extra;
    @C17952c(mo34828a = "icon_url")
    public UrlModel iconUrl;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    public String f116246id;
    @C17952c(mo34828a = "is_favorite")
    public boolean isFavorite;
    public boolean mIsSelect;
    @C17952c(mo34828a = "sec_uid")
    public String mSecUid;
    @C17952c(mo34828a = "tags")
    public List<String> mTags;
    @C17952c(mo34828a = "name")
    public String name;
    @C17952c(mo34828a = "owner_id")
    public String ownerId;
    @C17952c(mo34828a = "owner_nickname")
    public String ownerName;
    @C17952c(mo34828a = "share_info")
    public ShareInfo shareInfo = new ShareInfo();
    @C17952c(mo34828a = "user_count")
    public long userCount;
    @C17952c(mo34828a = "vv_count")
    public long viewCount;

    public final int hashCode() {
        return C23722i.m58214a(this.f116246id);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C23722i.m58215a(this.f116246id, ((C46069d) obj).f116246id);
    }
}
