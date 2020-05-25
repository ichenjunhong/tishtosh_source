package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.music.model.Music;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.NationalTask */
public final class NationalTask extends BaseResponse {
    @C17952c(mo34828a = "anchor")
    public TaskAnchorInfo anchor;
    @C17952c(mo34828a = "challenge_names")
    public List<String> challengeNames;
    @C17952c(mo34828a = "connect_music")
    public List<? extends Music> connectMusic;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    public String f74686id = "";
    @C17952c(mo34828a = "mentioned_users")
    public List<? extends TaskMentionedUser> mentionedUsers;
    @C17952c(mo34828a = "music_ids")
    public List<String> musicIds;
    @C17952c(mo34828a = "mv_ids")
    public List<String> mvIds;
    @C17952c(mo34828a = "optional_materials")
    public List<Integer> optionalMaterials;
    @C17952c(mo34828a = "sticker_ids")
    public List<String> stickerIds;

    public final void setId(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f74686id = str;
    }
}
