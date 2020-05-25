package com.p683ss.android.ugc.aweme.comment.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.model.StickerBean */
public final class StickerBean implements Serializable {
    @C17952c(mo34828a = "has_more")
    private boolean hasMore;
    @C17952c(mo34828a = "next_cursor")
    private int nextCursor;
    @C17952c(mo34828a = "sticker_source")
    private int source;
    @C17952c(mo34828a = "sticker_list")
    private List<GifEmoji> stickerList;

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final int getNextCursor() {
        return this.nextCursor;
    }

    public final int getSource() {
        return this.source;
    }

    public final List<GifEmoji> getStickerList() {
        return this.stickerList;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setNextCursor(int i) {
        this.nextCursor = i;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public final void setStickerList(List<GifEmoji> list) {
        this.stickerList = list;
    }
}
