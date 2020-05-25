package com.bytedance.android.livesdk.live;

import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.p038f.C0777a;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.p325ui.C6025ce;
import com.bytedance.android.livesdk.widget.C8557j;
import com.bytedance.android.livesdkapi.depend.live.C8659j;
import com.bytedance.android.livesdkapi.p450h.C8755f;
import com.bytedance.android.livesdkapi.p450h.C8755f.C8756a;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.live.a */
public class C7742a extends C8557j {

    /* renamed from: a */
    private final C8755f f21286a;

    /* renamed from: b */
    private final C8756a f21287b = new C7744b(this);

    /* renamed from: c */
    private final Map<Long, C8659j> f21288c = new C0777a();

    /* renamed from: a */
    public final void mo14090a() {
        this.f21286a.mo15416b(this.f21287b);
    }

    public int getCount() {
        return this.f21286a.mo13141b();
    }

    /* renamed from: c */
    public final long mo14092c(int i) {
        return m15789a(this.f21286a.mo13138a(i));
    }

    /* renamed from: a */
    public final Fragment mo14089a(int i) {
        C6025ce ceVar = new C6025ce();
        ceVar.mo12049i().setArguments(this.f21286a.mo13138a(i));
        return ceVar.mo12049i();
    }

    /* renamed from: b */
    public final C8659j mo14091b(int i) {
        return (C8659j) this.f21288c.get(Long.valueOf(mo14092c(i)));
    }

    public int getItemPosition(Object obj) {
        int a = this.f21286a.mo13137a(((Fragment) obj).getArguments());
        if (a < 0) {
            return -2;
        }
        return a;
    }

    /* renamed from: a */
    private static long m15789a(Bundle bundle) {
        long j = bundle.getLong("live.intent.extra.item_id_for_view_pager", -1);
        if (j > 0) {
            return j;
        }
        long j2 = bundle.getLong("live.intent.extra.USER_ID", -1);
        if (j2 <= 0) {
            j2 = bundle.getLong("live.intent.extra.ROOM_ID", -1);
        }
        bundle.putLong("live.intent.extra.item_id_for_view_pager", j2);
        return j2;
    }

    public C7742a(C0654k kVar, C8755f fVar) {
        super(kVar);
        this.f21286a = fVar;
        this.f21286a.mo15415a(this.f21287b);
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        C8659j jVar = (C8659j) super.instantiateItem(viewGroup, i);
        this.f21288c.put(Long.valueOf(mo14092c(i)), jVar);
        return jVar;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof C8659j) {
            C8659j jVar = (C8659j) obj;
            jVar.mo12043c();
            this.f21288c.remove(Long.valueOf(m15789a(jVar.mo12049i().getArguments())));
        }
        super.destroyItem(viewGroup, i, obj);
    }
}
