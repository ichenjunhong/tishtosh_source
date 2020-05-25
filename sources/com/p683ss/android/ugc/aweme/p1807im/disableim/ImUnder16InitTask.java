package com.p683ss.android.ugc.aweme.p1807im.disableim;

import android.content.Context;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;

/* renamed from: com.ss.android.ugc.aweme.im.disableim.ImUnder16InitTask */
public final class ImUnder16InitTask implements LegoTask {
    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.SPARSE;
    }

    public final void run(Context context) {
        ImUnder16Manger.f86149b = ImUnder16Manger.f86162o.getBoolean("show_msg_disappear_alert", false);
        ImUnder16Manger.f86150c = ImUnder16Manger.f86162o.getBoolean("is_chat_function_off", false);
        ImUnder16Manger.f86151d = ImUnder16Manger.f86162o.getBoolean("show_msg_privacy_entrance", true);
        ImUnder16Manger.f86155h = ImUnder16Manger.f86162o.getString("download_data_page_url", "");
        ImUnder16Manger.f86156i = ImUnder16Manger.f86162o.getString("msg_disappear_page_url", "");
        ImUnder16Manger.f86157j = ImUnder16Manger.f86162o.getString("alert_title", "");
        ImUnder16Manger.f86158k = ImUnder16Manger.f86162o.getString("alert_content", "");
        ImUnder16Manger.f86159l = ImUnder16Manger.f86162o.getString("chat_cell_title", "");
        ImUnder16Manger.f86160m = ImUnder16Manger.f86162o.getString("chat_cell_content", "");
        ImUnder16Manger.f86152e = ImUnder16Manger.f86162o.getBoolean("show_msg_disappear_chat_cell", false);
        ImUnder16Manger.f86154g = ImUnder16Manger.f86162o.getBoolean("clear_im_chatlist", false);
        ImUnder16Manger.f86153f = ImUnder16Manger.f86162o.getBoolean("redirect_to_msg_disappear_page", false);
        ImUnder16Manger.f86161n = ImUnder16Manger.f86162o.getLong("msg_disappear_chat_cell_server_time", Long.MAX_VALUE);
    }
}
