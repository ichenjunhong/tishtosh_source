package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.message.C8851g;
import com.google.gson.p1076a.C17952c;

public class ChatResult {
    @C17952c(mo34828a = "background_image")
    private ImageModel background;
    @C17952c(mo34828a = "content")
    private String content;
    @C17952c(mo34828a = "display_text")
    private C8851g displayText;
    @C17952c(mo34828a = "fullscreen_text_color")
    private String fullScreenTextColor;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    private long f14914id;
    @C17952c(mo34828a = "msg_id")
    private long msgId;
    @C17952c(mo34828a = "user")
    private User user;

    public ImageModel getBackground() {
        return this.background;
    }

    public String getContent() {
        return this.content;
    }

    public C8851g getDisplayText() {
        return this.displayText;
    }

    public String getFullScreenTextColor() {
        return this.fullScreenTextColor;
    }

    public long getId() {
        return this.f14914id;
    }

    public long getMsgId() {
        return this.msgId;
    }

    public User getUser() {
        return this.user;
    }

    public void setBackground(ImageModel imageModel) {
        this.background = imageModel;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setDisplayText(C8851g gVar) {
        this.displayText = gVar;
    }

    public void setFullScreenTextColor(String str) {
        this.fullScreenTextColor = str;
    }

    public void setId(long j) {
        this.f14914id = j;
    }

    public void setMsgId(long j) {
        this.msgId = j;
    }

    public void setUser(User user2) {
        this.user = user2;
    }
}
