package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5703l;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p071d.C1711f;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.cm */
final /* synthetic */ class C6505cm implements C1711f {

    /* renamed from: a */
    private final LinkPKMvpWidget f17814a;

    /* renamed from: b */
    private final User f17815b;

    /* renamed from: c */
    private final C5703l f17816c;

    C6505cm(LinkPKMvpWidget linkPKMvpWidget, User user, C5703l lVar) {
        this.f17814a = linkPKMvpWidget;
        this.f17815b = user;
        this.f17816c = lVar;
    }

    public final Object apply(Object obj) {
        String str;
        LinkPKMvpWidget linkPKMvpWidget = this.f17814a;
        User user = this.f17815b;
        C5703l lVar = this.f17816c;
        User user2 = (User) obj;
        String nickName = user.getNickName();
        String nickName2 = user2.getNickName();
        if (lVar.f14989a != 0) {
            str = linkPKMvpWidget.context.getString(R.string.hs3, new Object[]{nickName, nickName2, lVar.f14990b});
        } else {
            str = linkPKMvpWidget.context.getString(R.string.hs4, new Object[]{nickName, nickName2});
        }
        int indexOf = str.indexOf(nickName);
        int indexOf2 = str.indexOf(nickName2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#ffd064")), indexOf, nickName.length() + indexOf, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#ffd064")), indexOf2, nickName2.length() + indexOf2, 33);
        return spannableStringBuilder;
    }
}
