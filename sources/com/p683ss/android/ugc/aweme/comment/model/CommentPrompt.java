package com.p683ss.android.ugc.aweme.comment.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.model.CommentPrompt */
public final class CommentPrompt implements Serializable {
    @C17952c(mo34828a = "content")
    private final String content;
    @C17952c(mo34828a = "type")
    private final int type;

    public CommentPrompt() {
        this(0, null, 3, null);
    }

    public static /* synthetic */ CommentPrompt copy$default(CommentPrompt commentPrompt, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = commentPrompt.type;
        }
        if ((i2 & 2) != 0) {
            str = commentPrompt.content;
        }
        return commentPrompt.copy(i, str);
    }

    public final int component1() {
        return this.type;
    }

    public final String component2() {
        return this.content;
    }

    public final CommentPrompt copy(int i, String str) {
        C52711k.m112240b(str, C42311c.f106865i);
        return new CommentPrompt(i, str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CommentPrompt) {
                CommentPrompt commentPrompt = (CommentPrompt) obj;
                if (!(this.type == commentPrompt.type) || !C52711k.m112239a((Object) this.content, (Object) commentPrompt.content)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String getContent() {
        return this.content;
    }

    public final int getType() {
        return this.type;
    }

    public final int hashCode() {
        int i = this.type * 31;
        String str = this.content;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentPrompt(type=");
        sb.append(this.type);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(")");
        return sb.toString();
    }

    public CommentPrompt(int i, String str) {
        C52711k.m112240b(str, C42311c.f106865i);
        this.type = i;
        this.content = str;
    }

    public /* synthetic */ CommentPrompt(int i, String str, int i2, C52707g gVar) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            str = "";
        }
        this(i, str);
    }
}
