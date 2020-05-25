package com.p683ss.android.ugc.aweme.setting.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.setting.model.PopupSetting */
public class PopupSetting extends BaseResponse {
    @C17952c(mo34828a = "count")
    public int count;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    public String f105367id;
    @C17952c(mo34828a = "text")
    public PopupText popupText;
    @C17952c(mo34828a = "show_interval")
    public int showInterval;
    @C17952c(mo34828a = "show_time")
    public int show_time;

    /* renamed from: com.ss.android.ugc.aweme.setting.model.PopupSetting$ButtonActionStruct */
    public static class ButtonActionStruct {
        @C17952c(mo34828a = "action_type")
        public int actionType;
        @C17952c(mo34828a = "target")
        public String target;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.PopupSetting$ButtonStruct */
    public static class ButtonStruct {
        @C17952c(mo34828a = "action")
        public ButtonActionStruct buttonActionStruct;
        @C17952c(mo34828a = "style")
        public StyleType style;
        @C17952c(mo34828a = "text")
        public String text;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.PopupSetting$PopupText */
    public static class PopupText {
        @C17952c(mo34828a = "buttons")
        public List<ButtonStruct> buttons;
        @C17952c(mo34828a = "context")
        public String context;
        @C17952c(mo34828a = "image")
        public UrlStruct image;
        @C17952c(mo34828a = "title")
        public String title;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.PopupSetting$ShowTime */
    public enum ShowTime {
        CREATE_AWEME(1);
        
        private int value;

        private ShowTime(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.PopupSetting$StyleType */
    public enum StyleType {
        STYLE_ACTION(1),
        STYLE_NORMAL(2),
        STYLE_GREY(3);
        
        private int value;

        private StyleType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.PopupSetting$UrlStruct */
    public static class UrlStruct {
        @C17952c(mo34828a = "height")
        public int height;
        @C17952c(mo34828a = "uri")
        public String uri;
        @C17952c(mo34828a = "url_key")
        public String url_key;
        @C17952c(mo34828a = "url_list")
        public String[] url_list;
        @C17952c(mo34828a = "width")
        public int width;
    }

    public String getPopupContent() {
        try {
            return this.popupText.context;
        } catch (Exception unused) {
            return null;
        }
    }

    public String getPopupTitle() {
        try {
            return this.popupText.title;
        } catch (Exception unused) {
            return null;
        }
    }

    public String getNegativeButtonText() {
        try {
            return ((ButtonStruct) this.popupText.buttons.get(1)).text;
        } catch (Exception unused) {
            return null;
        }
    }

    public String getPositiveButtonText() {
        try {
            return ((ButtonStruct) this.popupText.buttons.get(0)).text;
        } catch (Exception unused) {
            return null;
        }
    }

    public String getNegativeActionUrl() {
        try {
            return ((ButtonStruct) this.popupText.buttons.get(1)).buttonActionStruct.target;
        } catch (Exception unused) {
            return null;
        }
    }

    public String getPositiveActionUrl() {
        try {
            return ((ButtonStruct) this.popupText.buttons.get(0)).buttonActionStruct.target;
        } catch (Exception unused) {
            return null;
        }
    }
}
