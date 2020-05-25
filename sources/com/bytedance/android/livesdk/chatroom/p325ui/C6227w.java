package com.bytedance.android.livesdk.chatroom.p325ui;

import android.text.TextPaint;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.C5182ba;
import com.bytedance.android.livesdk.message.C7792f;
import com.bytedance.android.livesdk.p269aa.C4495a;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.w */
public final class C6227w extends C6114dp {

    /* renamed from: a */
    private final int f16711a;

    /* renamed from: b */
    private final User f16712b;

    /* renamed from: c */
    private final boolean f16713c;

    /* renamed from: a */
    public final void mo12150a(View view) {
    }

    public C6227w(User user) {
        this.f16712b = user;
        this.f16711a = -1;
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        if (this.f16713c) {
            textPaint.setColor(this.f16711a);
        }
    }

    public final void onClick(View view) {
        if (this.f16712b != null) {
            C4495a.m10823a().mo10301a((Object) new C5182ba(1, C7792f.m15860a(this.f16712b)));
        }
    }

    public C6227w(User user, int i) {
        this.f16712b = user;
        this.f16711a = i;
        this.f16713c = true;
    }
}
