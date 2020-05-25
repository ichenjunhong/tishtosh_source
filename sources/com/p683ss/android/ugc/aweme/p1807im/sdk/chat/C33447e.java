package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.C33519b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35219ba;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.e */
public final class C33447e extends C23526a {

    /* renamed from: a */
    BaseChatPanel f86686a;

    /* renamed from: b */
    private View f86687b;

    /* renamed from: c */
    private C33353ab f86688c;

    public final void onDestroy() {
        super.onDestroy();
        getLifecycle().mo325b(this.f86686a);
    }

    public final void onResume() {
        super.onResume();
        C35219ba.m79606a("enter_chat_room");
    }

    /* renamed from: a */
    public final void mo70854a() {
        if (this.f86686a != null) {
            C33519b bVar = this.f86686a.f86391j;
            if (bVar == null) {
                C52711k.m112237a("mInputView");
            }
            bVar.mo70586c();
        }
    }

    /* renamed from: e */
    public final void mo70855e() {
        if (this.f86686a != null) {
            C33519b bVar = this.f86686a.f86391j;
            if (bVar == null) {
                C52711k.m112237a("mInputView");
            }
            bVar.mo70587d();
        }
    }

    public final void onPause() {
        String str;
        super.onPause();
        long currentTimeMillis = System.currentTimeMillis() - C35219ba.m79608c("enter_chat_room").longValue();
        C35219ba.m79607b("enter_chat_room");
        if (currentTimeMillis > FbUploadTokenTime.group0) {
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            sb.append(" start: ");
            if (C35219ba.m79608c("enter_chat_room") != null) {
                sb.append(C35219ba.m79608c("enter_chat_room"));
            } else {
                sb.append(0);
            }
            sb.append(" leave: ");
            sb.append(System.currentTimeMillis());
            sb.append(" duration: ");
            sb.append(currentTimeMillis);
            hashMap.put("tag", sb.toString());
            C35265e.m79731b("leave_chat_duration", hashMap);
        }
        String conversationId = this.f86688c.getConversationId();
        if (this.f86688c.isGroupChat()) {
            str = "group";
        } else {
            str = "private";
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("conversation_id", conversationId);
        hashMap2.put("chat_type", str);
        hashMap2.put("duration", String.valueOf(currentTimeMillis));
        C26890h.m65011a("leave_chat", (Map<String, String>) hashMap2);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        BaseChatPanel baseChatPanel;
        super.onViewCreated(view, bundle);
        C35219ba.m79606a("enterChatRoom");
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f86688c = (C33353ab) arguments.getSerializable("key_session_info");
            if (this.f86688c != null) {
                C33373d dVar = new C33373d(this);
                View view2 = this.f86687b;
                C33353ab abVar = this.f86688c;
                C52711k.m112240b(view2, "view");
                C52711k.m112240b(abVar, "sessionInfo");
                switch (abVar.getChatType()) {
                    case 0:
                    case 1:
                    case 2:
                    case 4:
                        baseChatPanel = new SingleChatPanel(dVar.f86542a, view2, (C33354ac) abVar);
                        break;
                    case 3:
                        baseChatPanel = new GroupChatPanel(dVar.f86542a, view2, (C33677l) abVar);
                        break;
                    default:
                        baseChatPanel = new BaseChatPanel(dVar.f86542a, view2, abVar);
                        break;
                }
                this.f86686a = baseChatPanel;
                getLifecycle().mo324a(this.f86686a);
                C35219ba.m79607b("enterChatRoom");
            }
        }
        if (getActivity() != null) {
            C9432q.m18676a(getContext(), C11010c.m22280a().getResources().getString(R.string.bh1));
            getActivity().finish();
        }
        C35219ba.m79607b("enterChatRoom");
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f86686a != null) {
            this.f86686a.mo70647a(i, i2, intent);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f86687b = layoutInflater.inflate(R.layout.bcl, viewGroup, false);
        return this.f86687b;
    }
}
