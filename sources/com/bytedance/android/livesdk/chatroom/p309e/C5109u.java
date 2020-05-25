package com.bytedance.android.livesdk.chatroom.p309e;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.C5185e;
import com.bytedance.android.livesdk.message.model.C7862cc;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.u */
public final class C5109u extends C5081a<C7862cc> {

    /* renamed from: i */
    private static final String[] f13661i = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "cmd_pk_mvp_show_list", "cmd_show_gift_task_info", "cmd_show_steal_tower_info"};

    /* renamed from: j */
    private final boolean f13662j;

    /* renamed from: d */
    public final boolean mo10979d() {
        return this.f13662j;
    }

    /* renamed from: e */
    public final User mo10980e() {
        return null;
    }

    /* renamed from: a */
    public final ImageModel mo10975a() {
        return ((C7862cc) this.f13643a).f21749d;
    }

    /* renamed from: b */
    public final int mo10977b() {
        return ((C7862cc) this.f13643a).f21756k;
    }

    /* renamed from: c */
    public final ImageModel mo10978c() {
        return ((C7862cc) this.f13643a).f21753h;
    }

    /* renamed from: g */
    public final String mo10982g() {
        return ((C7862cc) this.f13643a).f21747b;
    }

    /* renamed from: h */
    public final ImageModel mo10983h() {
        return ((C7862cc) this.f13643a).f21754i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo10984l() {
        CharSequence charSequence = ((C7862cc) this.f13643a).f21755j;
        if (TextUtils.isEmpty(charSequence) || !(charSequence instanceof Spannable)) {
            return new SpannableString(((C7862cc) this.f13643a).f21746a);
        }
        return (Spannable) charSequence;
    }

    public C5109u(C7862cc ccVar) {
        super(ccVar);
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= f13661i.length) {
                break;
            } else if (TextUtils.equals(f13661i[i], ccVar.f21751f)) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        this.f13662j = z;
    }

    /* renamed from: a */
    public final void mo10976a(Context context, Room room) {
        C4495a.m10823a().mo10301a((Object) new C5185e((C7862cc) this.f13643a));
    }
}
