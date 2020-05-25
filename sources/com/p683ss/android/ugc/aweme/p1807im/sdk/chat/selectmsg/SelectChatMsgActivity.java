package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.selectmsg;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.BaseChatRoomActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33353ab;
import com.p683ss.android.ugc.aweme.p1807im.service.p1901c.C35432b;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import org.greenrobot.eventbus.C53755c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.selectmsg.SelectChatMsgActivity */
public final class SelectChatMsgActivity extends BaseChatRoomActivity {

    /* renamed from: b */
    public static final C33705a f87416b = new C33705a(null);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.selectmsg.SelectChatMsgActivity$a */
    public static final class C33705a {
        private C33705a() {
        }

        public /* synthetic */ C33705a(C52707g gVar) {
            this();
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.selectmsg.SelectChatMsgActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.selectmsg.SelectChatMsgActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.selectmsg.SelectChatMsgActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.ej, R.anim.el);
    }

    /* renamed from: b */
    public final void mo70675b() {
        List list;
        super.mo70675b();
        Intent intent = getIntent();
        C52711k.m112236a((Object) intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String conversationId = this.f86422a.getConversationId();
            C33353ab abVar = this.f86422a;
            HashMap<String, List<C11207p>> hashMap = C33707b.f87417a;
            if (hashMap != null) {
                list = (List) hashMap.get(conversationId);
            } else {
                list = null;
            }
            abVar.setSelectMsgList(list);
            this.f86422a.setSelectMsgType(extras.getInt("select_msg_type", 0));
        }
    }

    public final void onBackPressed() {
        boolean z;
        if (this.f86422a != null) {
            if (this.f86422a.getConversationId().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C35432b bVar = new C35432b();
                bVar.f91103b = this.f86422a.getConversationId();
                C53755c.m114319a().mo112960d(bVar);
            }
        }
        super.onBackPressed();
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.selectmsg.SelectChatMsgActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(R.anim.ek, R.anim.ej);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.selectmsg.SelectChatMsgActivity", "onCreate", false);
    }
}
