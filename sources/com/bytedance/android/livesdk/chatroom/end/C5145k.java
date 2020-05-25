package com.bytedance.android.livesdk.chatroom.end;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p229f.C3846a;
import com.bytedance.android.livesdk.chatroom.event.C5204w;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.chatroom.end.k */
public class C5145k extends C3846a {

    /* renamed from: A */
    protected String f13796A;

    /* renamed from: x */
    protected Room f13797x;

    /* renamed from: y */
    protected boolean f13798y;

    /* renamed from: z */
    protected boolean f13799z;

    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo11034d() {
        if (!this.f13798y) {
            C8068g.m16014a((Context) getActivity());
        }
        C4495a.m10823a().mo10301a((Object) new C5204w(5));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo11033c() {
        if (this.f13797x != null && this.f13797x.getOwner() != null) {
            User owner = this.f13797x.getOwner();
            HashMap hashMap = new HashMap(1);
            hashMap.put("log_enter_live_source", this.f13796A);
            hashMap.put("sec_user_id", owner.getSecUid());
            C4514j.m10883j().mo10328i().showUserProfile(owner.getId(), null, hashMap);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T extends View> T mo11032a(int i) {
        if (getView() == null) {
            return null;
        }
        return getView().findViewById(i);
    }
}
