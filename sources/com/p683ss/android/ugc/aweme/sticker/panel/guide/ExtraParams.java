package com.p683ss.android.ugc.aweme.sticker.panel.guide;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bytedance.common.utility.C9431p;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams */
public class ExtraParams implements Parcelable {
    public static final Creator<ExtraParams> CREATOR = new Creator<ExtraParams>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ExtraParams[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ExtraParams(parcel);
        }
    };
    public static final int GIF_TYPE_HORIZONTAL = 1;
    public static final int GIF_TYPE_VERTICAL = 2;
    public static final int INTERACTION_URL = 1;
    @C17952c(mo34828a = "clickable_open_url")
    private String clickableOpenUrl;
    @C17952c(mo34828a = "clickable_web_url")
    private String clickableWebUrl;
    @C17952c(mo34828a = "gif_type")
    int gifType;
    @C17952c(mo34828a = "interaction_icon")
    String interactionIcon;
    @C17952c(mo34828a = "interaction_text")
    String interactionText;
    @C17952c(mo34828a = "interaction_type")
    int interactionType;
    @C17952c(mo34828a = "interaction_url")
    String interactionUrl;

    public ExtraParams() {
    }

    public int describeContents() {
        return 0;
    }

    public String getClickableOpenUrl() {
        return this.clickableOpenUrl;
    }

    public String getClickableWebUrl() {
        return this.clickableWebUrl;
    }

    public String getInteractionIcon() {
        return this.interactionIcon;
    }

    public String getInteractionText() {
        return this.interactionText;
    }

    public int getInteractionType() {
        return this.interactionType;
    }

    public String getInteractionUrl() {
        return this.interactionUrl;
    }

    public boolean isGifValid() {
        if (1 == this.gifType || 2 == this.gifType) {
            return true;
        }
        return false;
    }

    public boolean isUrlInteractionStickerValid() {
        if (this.interactionType != 1 || C9431p.m18664a(this.interactionText) || (C9431p.m18664a(this.interactionUrl) && C9431p.m18664a(this.clickableOpenUrl) && C9431p.m18664a(this.clickableWebUrl))) {
            return false;
        }
        return true;
    }

    public void setClickableOpenUrl(String str) {
        this.clickableOpenUrl = str;
    }

    public void setClickableWebUrl(String str) {
        this.clickableWebUrl = str;
    }

    public void setInteractionIcon(String str) {
        this.interactionIcon = str;
    }

    public void setInteractionText(String str) {
        this.interactionText = str;
    }

    public void setInteractionType(int i) {
        this.interactionType = i;
    }

    public void setInteractionUrl(String str) {
        this.interactionUrl = str;
    }

    protected ExtraParams(Parcel parcel) {
        this.gifType = parcel.readInt();
        this.interactionType = parcel.readInt();
        this.interactionText = parcel.readString();
        this.interactionIcon = parcel.readString();
        this.interactionUrl = parcel.readString();
        this.clickableOpenUrl = parcel.readString();
        this.clickableWebUrl = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.gifType);
        parcel.writeInt(this.interactionType);
        parcel.writeString(this.interactionText);
        parcel.writeString(this.interactionIcon);
        parcel.writeString(this.interactionUrl);
        parcel.writeString(this.clickableOpenUrl);
        parcel.writeString(this.clickableWebUrl);
    }
}
