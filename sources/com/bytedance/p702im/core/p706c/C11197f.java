package com.bytedance.p702im.core.p706c;

import com.bytedance.p702im.core.internal.utils.C11464c;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.im.core.c.f */
public final class C11197f implements Serializable {
    private String conversationId;
    private Map<String, String> ext;
    private int favor;
    private int mute;
    private int stickTop;
    private long version;

    public final String getConversationId() {
        return this.conversationId;
    }

    public final int getFavor() {
        return this.favor;
    }

    public final int getMute() {
        return this.mute;
    }

    public final int getStickTop() {
        return this.stickTop;
    }

    public final long getVersion() {
        return this.version;
    }

    public final String getExtStr() {
        return C11464c.m23455a(this.ext);
    }

    public final boolean isFavor() {
        if (this.favor == 1) {
            return true;
        }
        return false;
    }

    public final boolean isMute() {
        if (this.mute == 1) {
            return true;
        }
        return false;
    }

    public final boolean isStickTop() {
        if (this.stickTop == 1) {
            return true;
        }
        return false;
    }

    public final synchronized Map<String, String> getExt() {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        return this.ext;
    }

    public final void setConversationId(String str) {
        this.conversationId = str;
    }

    public final void setExt(Map<String, String> map) {
        this.ext = map;
    }

    public final void setFavor(int i) {
        this.favor = i;
    }

    public final void setMute(int i) {
        this.mute = i;
    }

    public final void setStickTop(int i) {
        this.stickTop = i;
    }

    public final void setVersion(long j) {
        this.version = j;
    }

    public final void setExtStr(String str) {
        this.ext = C11464c.m23458a(str);
    }
}
