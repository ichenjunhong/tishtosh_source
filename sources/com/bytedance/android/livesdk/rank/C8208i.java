package com.bytedance.android.livesdk.rank;

import android.content.Context;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5697f;
import com.bytedance.android.livesdk.chatroom.p325ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.rank.p408a.C8124a;
import com.bytedance.android.livesdk.widget.C8543d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9414h;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.rank.i */
public final class C8208i extends C8543d {

    /* renamed from: a */
    public long f22391a;

    /* renamed from: b */
    private List<C5697f> f22392b;

    /* renamed from: a */
    public final int mo8344a() {
        return R.layout.ail;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.c8f);
        View findViewById = findViewById(R.id.aa2);
        if (C9414h.m18630a(this.f22392b)) {
            recyclerView.setVisibility(8);
            findViewById.setVisibility(0);
        } else {
            recyclerView.setLayoutManager(new SSLinearLayoutManager(getContext()));
            recyclerView.setAdapter(new C8124a(this.f22392b));
        }
        long j = this.f22391a;
        HashMap hashMap = new HashMap();
        hashMap.put("to_user_id", String.valueOf(j));
        C8049c.m15979a().mo14202a("guest_contributions_ranklist_show", hashMap, Room.class);
    }

    public C8208i(Context context, List<C5697f> list) {
        super(context);
        this.f22392b = list;
    }
}
