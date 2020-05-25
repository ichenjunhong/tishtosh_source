package com.bytedance.android.livesdkapi.depend.model.live;

import com.google.gson.p1076a.C17952c;

public class RoomAuthStatus {
    @C17952c(mo34828a = "GiftAnchorMt")
    int anchorGiftType;
    @C17952c(mo34828a = "Banner")
    int bannerType;
    @C17952c(mo34828a = "DonationSticker")
    int donationSticker;
    @C17952c(mo34828a = "Chat")
    public boolean enableChat;
    @C17952c(mo34828a = "Danmaku")
    public boolean enableDanmaku;
    @C17952c(mo34828a = "Digg")
    public boolean enableDigg;
    @C17952c(mo34828a = "Gift")
    public boolean enableGift;
    @C17952c(mo34828a = "LuckMoney")
    boolean enableLuckMoney;
    @C17952c(mo34828a = "Props")
    public boolean enableProps;
    @C17952c(mo34828a = "RoomContributor")
    boolean enableRoomContributor;
    @C17952c(mo34828a = "PublicScreen")
    int messageType;

    public boolean isEnableChat() {
        return this.enableChat;
    }

    public boolean isEnableDanmaku() {
        return this.enableDanmaku;
    }

    public boolean isEnableDigg() {
        return this.enableDigg;
    }

    public boolean isEnableGift() {
        return this.enableGift;
    }

    public boolean isEnableLuckMoney() {
        return this.enableLuckMoney;
    }

    public boolean isEnableProps() {
        return this.enableProps;
    }

    public boolean isEnableRoomContributor() {
        return this.enableRoomContributor;
    }

    public boolean isEnableStickerDonation() {
        if (this.donationSticker == 1) {
            return true;
        }
        return false;
    }

    public boolean isAnchorGiftEnable() {
        if (this.anchorGiftType != 2) {
            return true;
        }
        return false;
    }

    public boolean isBannerEnable() {
        if (this.bannerType != 2) {
            return true;
        }
        return false;
    }

    public boolean isMessageEnable() {
        if (this.messageType != 2) {
            return true;
        }
        return false;
    }

    public void setEnableChat(boolean z) {
        this.enableChat = z;
    }

    public void setEnableDanmaku(boolean z) {
        this.enableDanmaku = z;
    }

    public void setEnableDigg(boolean z) {
        this.enableDigg = z;
    }

    public void setEnableGift(boolean z) {
        this.enableGift = z;
    }

    public void setEnableLuckMoney(boolean z) {
        this.enableLuckMoney = z;
    }

    public void setEnableProps(boolean z) {
        this.enableProps = z;
    }

    public void setEnableRoomContributor(boolean z) {
        this.enableRoomContributor = z;
    }
}
