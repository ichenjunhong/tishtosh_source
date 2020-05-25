package com.bytedance.android.livesdk.chatroom.p309e;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.message.model.C7878cr;
import com.bytedance.android.livesdk.message.model.C7878cr.C7879a;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.aa */
public final class C5082aa extends C5084b<C7878cr> {

    /* renamed from: i */
    private boolean f13640i;

    /* renamed from: j */
    private C3009i f13641j = TTLiveSDKContext.getHostService().mo10315h().mo14521a();

    /* renamed from: com.bytedance.android.livesdk.chatroom.e.aa$a */
    public static class C5083a {

        /* renamed from: a */
        public String f13642a;

        C5083a(String str) {
            this.f13642a = str;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo10981f() {
        return false;
    }

    /* renamed from: e */
    public final User mo10980e() {
        return ((C7878cr) this.f13643a).f21830a;
    }

    /* renamed from: a */
    private int m11622a() {
        if (this.f13641j == null || ((C7878cr) this.f13643a).f21830a == null) {
            return 0;
        }
        return this.f13640i ? R.color.akj : R.color.akj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final Spannable mo10985m() {
        C7878cr crVar = (C7878cr) this.f13643a;
        StringBuilder sb = new StringBuilder();
        Context context = ((IHostContext) C4116c.m10249a(IHostContext.class)).context();
        if (context != null) {
            if (crVar.f21830a != null) {
                sb.append(crVar.f21830a.getNickName());
            }
            if (crVar.f21831b != null) {
                sb.append(context.getString(R.string.exl, new Object[]{Long.valueOf(crVar.f21831b.f21832a)}));
            }
        }
        return C5113y.m11751a(sb.toString(), (int) R.color.a_y);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo10984l() {
        String str;
        CharSequence charSequence;
        boolean z;
        if (this.f13643a == null) {
            return null;
        }
        Context context = TTLiveSDKContext.getHostService().mo10308a().context();
        if (context == null) {
            return null;
        }
        if (!(this.f13641j == null || ((C7878cr) this.f13643a).f21830a == null)) {
            if (this.f13641j.getId() == ((C7878cr) this.f13643a).f21830a.getId()) {
                z = true;
            } else {
                z = false;
            }
            if (z && ((C7878cr) this.f13643a).f21831b != null) {
                C4495a.m10823a().mo10301a((Object) new C5083a(((C7878cr) this.f13643a).f21831b.f21835d));
            }
        }
        User user = ((C7878cr) this.f13643a).f21830a;
        C7879a aVar = ((C7878cr) this.f13643a).f21831b;
        if (user != null) {
            str = user.getNickName();
        } else {
            str = null;
        }
        if (aVar != null) {
            charSequence = String.valueOf(aVar.f21832a);
        } else {
            charSequence = null;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(charSequence)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(context.getString(R.string.exl, new Object[]{charSequence}));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
        spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(m11622a())), 0, str.length(), 17);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.aki)), str.length(), str.length() + 6, 17);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(m11622a())), str.length() + 6, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public C5082aa(C7878cr crVar) {
        super(crVar);
    }
}
