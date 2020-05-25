package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import android.text.TextUtils;
import com.C2240a;
import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.SystemContent */
public class SystemContent extends BaseContent {
    @C17952c(mo34828a = "fallback_tips")
    String fallbackTips;
    @C17952c(mo34828a = "group_tips")
    String groupNoticeTips;
    @C17952c(mo34828a = "new_template")
    Key[] newTemplate;
    @C17952c(mo34828a = "new_tips")
    String newTips;
    @C17952c(mo34828a = "strong_template")
    Key[] strongTemplate;
    @C17952c(mo34828a = "strong_tips")
    String strongTips;
    @C17952c(mo34828a = "template")
    Key[] template;
    @C17952c(mo34828a = "tips")
    String tips;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.SystemContent$Key */
    public static class Key implements Serializable {
        @C17952c(mo34828a = "action")
        int action;
        @C17952c(mo34828a = "extra")
        Map<String, String> extra;
        @C17952c(mo34828a = "key")
        String key;
        @C17952c(mo34828a = "link")
        String link;
        @C17952c(mo34828a = "name")
        String name;

        public int getAction() {
            return this.action;
        }

        public Map<String, String> getExtra() {
            return this.extra;
        }

        public String getKey() {
            return this.key;
        }

        public String getLink() {
            return this.link;
        }

        public String getName() {
            return this.name;
        }

        public void setAction(int i) {
            this.action = i;
        }

        public void setExtra(Map<String, String> map) {
            this.extra = map;
        }

        public void setKey(String str) {
            this.key = str;
        }

        public void setLink(String str) {
            this.link = str;
        }

        public void setName(String str) {
            this.name = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.SystemContent$LinkTypeExtra */
    public static class LinkTypeExtra {
        public static boolean isSafeWarningLink(Key key) {
            if (key != null) {
                try {
                    if (key.getExtra() != null) {
                        return TextUtils.equals((String) key.extra.get("link_type"), "safe_warning");
                    }
                } catch (Exception unused) {
                    return false;
                }
            }
            return false;
        }
    }

    public String getFallbackTips() {
        return this.fallbackTips;
    }

    public String getGroupNoticeTips() {
        return this.groupNoticeTips;
    }

    public Key[] getNewTemplate() {
        return this.newTemplate;
    }

    public String getNewTips() {
        return this.newTips;
    }

    public Key[] getStrongTemplate() {
        return this.strongTemplate;
    }

    public String getStrongTips() {
        return this.strongTips;
    }

    public Key[] getTemplate() {
        return this.template;
    }

    public String getTips() {
        return this.tips;
    }

    public String getMsgHint() {
        Key[] keyArr;
        if (TextUtils.isEmpty(this.tips)) {
            return this.tips;
        }
        String str = this.tips;
        if (this.template != null) {
            String str2 = str;
            for (Key key : this.template) {
                str2 = str2.replace(C2240a.m6772a("{{%s}}", new Object[]{key.getKey()}), key.getName());
            }
            str = str2;
        }
        return str;
    }

    public void setGroupNoticeTips(String str) {
        this.groupNoticeTips = str;
    }

    public void setTemplate(Key[] keyArr) {
        this.template = keyArr;
    }

    public void setTips(String str) {
        this.tips = str;
    }
}
