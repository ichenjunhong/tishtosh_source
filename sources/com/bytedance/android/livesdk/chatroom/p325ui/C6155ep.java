package com.bytedance.android.livesdk.chatroom.p325ui;

import android.text.TextPaint;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.p309e.C5084b;
import com.bytedance.android.livesdk.message.model.C8001m;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ep */
public final class C6155ep extends C6114dp {

    /* renamed from: a */
    private final int f16509a;

    /* renamed from: b */
    private final User f16510b;

    /* renamed from: c */
    private final boolean f16511c;

    /* renamed from: a */
    public final void mo12150a(View view) {
        if (this.f16511c) {
            onClick(view);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.f16509a);
    }

    public final void onClick(View view) {
        Object obj;
        if (this.f16510b != null) {
            UserProfileEvent userProfileEvent = new UserProfileEvent(this.f16510b.getId());
            userProfileEvent.mSource = UserProfileEvent.SOURCE_COMMENT;
            if (view != null) {
                obj = view.getTag(R.id.d5d);
            } else {
                obj = null;
            }
            if (obj instanceof C5084b) {
                C5084b bVar = (C5084b) obj;
                if (bVar.f13643a != null) {
                    T t = bVar.f13643a;
                    userProfileEvent.msgId = t.getMessageId();
                    if (t instanceof C8001m) {
                        userProfileEvent.content = ((C8001m) t).f21869b;
                    }
                }
            }
            C4495a.m10823a().mo10301a((Object) userProfileEvent);
        }
    }

    public C6155ep(User user, int i, boolean z) {
        this.f16510b = user;
        this.f16509a = i;
        this.f16511c = z;
    }
}
