package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.SayHelloContent */
public class SayHelloContent extends BaseContent {
    @C17952c(mo34828a = "stickers")
    private List<C29366a> emoji;
    @C17952c(mo34828a = "hello_text")
    private String helloText;
    @C17952c(mo34828a = "joker_stickers")
    private List<C29366a> jokerEmojis;
    @C17952c(mo34828a = "nickname")
    private String nickname;

    public List<C29366a> getEmoji() {
        return this.emoji;
    }

    public String getHelloText() {
        return this.helloText;
    }

    public List<C29366a> getJokerEmojis() {
        return this.jokerEmojis;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setEmoji(List<C29366a> list) {
        this.emoji = list;
    }

    public void setMsgHint(String str) {
        this.msgHint = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }
}
