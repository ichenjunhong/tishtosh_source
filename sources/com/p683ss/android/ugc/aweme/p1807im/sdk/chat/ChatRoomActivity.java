package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.login.C27962e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35464a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity */
public class ChatRoomActivity extends BaseChatRoomActivity {
    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public static boolean m76449a(Context context) {
        Intent intent = new Intent(context, ChatRoomActivity.class);
        intent.putExtra("back_to_chat_room", true);
        intent.addFlags(268435456);
        context.startActivity(intent);
        return true;
    }

    /* renamed from: a */
    public static boolean m76450a(Context context, IMUser iMUser, int i) {
        return m76452a(context, iMUser, i, null, null);
    }

    /* renamed from: a */
    public static boolean m76454a(Context context, String str, int i, Bundle bundle) {
        return m76446a(context, str, 3, bundle, ChatRoomActivity.class);
    }

    /* renamed from: a */
    public static boolean m76452a(Context context, IMUser iMUser, int i, C35464a aVar, Serializable serializable) {
        return m76453a(context, iMUser, i, "", aVar, serializable);
    }

    /* renamed from: a */
    public static boolean m76453a(Context context, IMUser iMUser, int i, String str, C35464a aVar, Serializable serializable) {
        int i2;
        if (iMUser == null || TextUtils.isEmpty(iMUser.getUid())) {
            C32458a.m75144a("ChatRoomActivity.start user = null");
            return false;
        }
        if (i == 2) {
            i2 = 1;
        } else if (iMUser.getCommerceUserLevel() > 0) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        return m76451a(context, iMUser, i2, i, str, aVar, serializable);
    }

    /* renamed from: a */
    private static boolean m76451a(Context context, IMUser iMUser, int i, int i2, String str, C35464a aVar, Serializable serializable) {
        if (iMUser == null || TextUtils.isEmpty(iMUser.getUid())) {
            C32458a.m75144a("ChatRoomActivity.start user = null");
            return false;
        }
        try {
            Long.parseLong(iMUser.getUid());
            if (!BaseUserService.getBaseUserService_Monster().isLogin()) {
                C27962e.m66716a((Activity) context);
                return false;
            } else if (C34004b.m77717a().mo71949f().isEnableShowTeenageTip()) {
                return false;
            } else {
                Intent intent = new Intent(context, ChatRoomActivity.class);
                intent.putExtra("simple_uesr", iMUser);
                intent.putExtra("key_enter_from", i2);
                intent.putExtra("from_user_id", str);
                intent.putExtra("chat_type", i);
                intent.putExtra("chat_ext", serializable);
                intent.putExtra("im_ad_log", aVar);
                intent.addFlags(268435456);
                context.startActivity(intent);
                return true;
            }
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder("ChatRoomActivity.start uid is invalid: ");
            sb.append(iMUser.getUid());
            C32458a.m75144a(sb.toString());
            return false;
        }
    }
}
