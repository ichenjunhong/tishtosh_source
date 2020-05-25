package com.p683ss.android.ugc.aweme.global.config.settings._default;

import com.p683ss.android.ugc.aweme.global.config.settings.pojo.AssociativeEmoticonAll;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.FlipChatSettings.Builder;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings._default.SettingsGroup */
public class SettingsGroup extends AbstractSettingsGroup {
    public void addOptionalObjectDefaultValue() {
        registerDefaultValue(new Builder().main_switch(Boolean.valueOf(false)).show_launch_page_popup(Boolean.valueOf(false)).show_login_icon(Boolean.valueOf(false)).show_msg_cell(Boolean.valueOf(false)).build());
    }

    public void addDefaultValues(IESSettings.Builder builder) {
        builder.close_login_agreement(Integer.valueOf(0));
        builder.anti_addiction_separation(Integer.valueOf(0));
        builder.anti_addiction_day_time(Integer.valueOf(0));
        builder.anti_addiction_night_time(Integer.valueOf(0));
        builder.anti_addiction_toast_time(Integer.valueOf(0));
        builder.with_douplus_entry(Boolean.valueOf(false));
        builder.use_new_splash_view(Boolean.valueOf(false));
        builder.im_associative_emoticon_all(new AssociativeEmoticonAll.Builder().show(Integer.valueOf(0)).sourceMessage("").build());
        builder.ug_sec_link_url("https://link-sg.byteoversea.com/");
    }
}
