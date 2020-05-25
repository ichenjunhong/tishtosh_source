package com.bytedance.android.livesdk.chatroom.p309e;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.livesdk.chatroom.event.C5163ai;
import com.bytedance.android.livesdk.message.model.C7833bh;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.o */
public final class C5103o extends C5081a<C7833bh> {
    /* renamed from: a */
    public final ImageModel mo10975a() {
        return null;
    }

    /* renamed from: b */
    public final int mo10977b() {
        return R.drawable.byd;
    }

    /* renamed from: d */
    public final boolean mo10979d() {
        return true;
    }

    /* renamed from: g */
    public final String mo10982g() {
        return "#ff4e33";
    }

    /* renamed from: e */
    public final User mo10980e() {
        return ((C7833bh) this.f13643a).f21606a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo10984l() {
        long j;
        String str;
        String str2;
        Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
        if (Room.isValid(currentRoom)) {
            j = currentRoom.getOwner().getId();
        } else {
            j = 0;
        }
        if (((C7833bh) this.f13643a).f21606a == null) {
            str = null;
        } else if (((C7833bh) this.f13643a).f21606a.getId() == j) {
            str = C3922z.m9903a((int) R.string.e36);
        } else {
            str = ((C7833bh) this.f13643a).f21606a.getNickName();
            if (str == null) {
                str = "";
            }
        }
        int i = ((C7833bh) this.f13643a).f21612g;
        int a = ((int) ((C7833bh) this.f13643a).mo14146a()) / 1000;
        if (((C7833bh) this.f13643a).f21627v || a <= 0) {
            str2 = C3922z.m9905a((int) R.string.f0_, str, Integer.valueOf(i), ((C7833bh) this.f13643a).f21611f);
        } else if (a < 60) {
            str2 = C3922z.m9905a((int) R.string.f09, str, Integer.valueOf(i), ((C7833bh) this.f13643a).f21611f, Integer.valueOf(a));
        } else {
            str2 = C3922z.m9905a((int) R.string.f08, str, Integer.valueOf(i), ((C7833bh) this.f13643a).f21611f, Integer.valueOf(a / 60));
        }
        return new SpannableString(str2);
    }

    public C5103o(C7833bh bhVar) {
        super(bhVar);
    }

    /* renamed from: a */
    public final void mo10976a(Context context, Room room) {
        C5163ai aiVar = new C5163ai(1);
        aiVar.f13843b = this.f13643a;
        C4495a.m10823a().mo10301a((Object) aiVar);
    }
}
