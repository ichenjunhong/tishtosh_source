package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.model.PureDataSharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.TextContent */
public class TextContent extends BaseContent {
    @C17952c(mo34828a = "type")
    private int heartType;
    boolean isDefault;
    @C17952c(mo34828a = "text")
    String text;

    public int getHeartType() {
        return this.heartType;
    }

    public boolean isDefault() {
        return this.isDefault;
    }

    public boolean isValid() {
        if (!TextUtils.isEmpty(this.text)) {
            return true;
        }
        return false;
    }

    public SharePackage generateSharePackage() {
        SharePackage a = PureDataSharePackage.m79359a("text");
        a.f106900i.putString("share_text", getText());
        return a;
    }

    public String getMsgHint() {
        if (this.heartType == 1 || this.heartType == 2) {
            return C11010c.m22280a().getString(R.string.bpq);
        }
        return getText();
    }

    public String getText() {
        if (this.heartType == 1 || this.heartType == 2) {
            return C11010c.m22280a().getString(R.string.bpq);
        }
        return this.text;
    }

    public void setDefault(boolean z) {
        this.isDefault = z;
    }

    public void setHeartType(int i) {
        this.heartType = i;
    }

    public void setText(String str) {
        this.text = str;
    }

    public static TextContent obtain(String str) {
        TextContent textContent = new TextContent();
        textContent.setText(str);
        textContent.setType(700);
        return textContent;
    }

    public static TextContent obtain(TextContent textContent) {
        TextContent textContent2 = new TextContent();
        textContent2.setText(textContent.getText());
        textContent2.setType(700);
        textContent2.prevId = textContent.prevId;
        textContent2.rootId = textContent.rootId;
        return textContent2;
    }
}
