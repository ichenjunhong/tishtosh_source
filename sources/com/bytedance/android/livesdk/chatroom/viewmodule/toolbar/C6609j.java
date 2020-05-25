package com.bytedance.android.livesdk.chatroom.viewmodule.toolbar;

import android.view.View;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d.C6601a;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.j */
final class C6609j implements C6600d {

    /* renamed from: a */
    public DataCenter f17960a;

    /* renamed from: b */
    public Map<C6605h, View> f17961b = new HashMap();

    /* renamed from: c */
    private Map<C6605h, C6601a> f17962c = new HashMap();

    C6609j() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C6601a mo12685b(C6605h hVar) {
        return (C6601a) this.f17962c.get(hVar);
    }

    /* renamed from: a */
    public final boolean mo12669a(C6605h hVar) {
        View view = (View) this.f17961b.get(hVar);
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo12684a(boolean z) {
        for (Entry entry : this.f17961b.entrySet()) {
            if (((View) this.f17961b.get(entry.getKey())) != null) {
                mo12686b((C6605h) entry.getKey(), (View) entry.getValue());
            }
        }
        if (this.f17960a != null) {
            this.f17960a.lambda$put$1$DataCenter("hide_share_lead", Boolean.valueOf(false));
        }
        this.f17961b.clear();
        if (z) {
            this.f17962c.clear();
        }
    }

    /* renamed from: a */
    public final void mo12666a(C6605h hVar, int i) {
        if (hVar != null) {
            C9432q.m18691b((View) this.f17961b.get(hVar), i);
        }
    }

    /* renamed from: a */
    public final void mo12667a(C6605h hVar, C6597a aVar) {
        C6601a aVar2 = (C6601a) this.f17962c.get(hVar);
        if (aVar2 != null) {
            aVar2.mo8420a(aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo12686b(C6605h hVar, View view) {
        C6601a aVar = (C6601a) this.f17962c.get(hVar);
        if (aVar != null) {
            aVar.mo8421b(view, this.f17960a);
            view.setVisibility(8);
            view.setOnClickListener(null);
        }
    }

    /* renamed from: b */
    public final void mo12670b(C6605h hVar, C6601a aVar) {
        View view = (View) this.f17961b.get(hVar);
        if (view != null) {
            mo12686b(hVar, view);
        }
        this.f17962c.remove(hVar);
        if (this.f17960a != null) {
            this.f17960a.lambda$put$1$DataCenter("tool_bar_button_unload", hVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo12683a(C6605h hVar, View view) {
        C6601a aVar = (C6601a) this.f17962c.get(hVar);
        boolean z = false;
        if (aVar != null) {
            view.setVisibility(0);
            view.setOnClickListener(aVar);
            aVar.mo8419a(view, this.f17960a);
        }
        if (hVar == C6605h.TURNTABLE) {
            String str = "ToolbarManager";
            StringBuilder sb = new StringBuilder("TurnTable onConfigReady(), and behavior is valid: ");
            if (aVar != null) {
                z = true;
            }
            sb.append(z);
            C3831a.m9712b(str, sb.toString());
        } else if (hVar == C6605h.GIFT) {
            String str2 = "ToolbarManager";
            StringBuilder sb2 = new StringBuilder("Gift onConfigReady(), and behavior is valid: ");
            if (aVar != null) {
                z = true;
            }
            sb2.append(z);
            C3831a.m9712b(str2, sb2.toString());
        } else {
            if (hVar == C6605h.FAST_GIFT) {
                String str3 = "ToolbarManager";
                StringBuilder sb3 = new StringBuilder("FastGift onConfigReady(), and behavior is valid: ");
                if (aVar != null) {
                    z = true;
                }
                sb3.append(z);
                C3831a.m9712b(str3, sb3.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo12668a(C6605h hVar, C6601a aVar) {
        if (hVar == C6605h.TURNTABLE) {
            C3831a.m9712b("ttlive_gift", "load TurnTable");
        } else if (hVar == C6605h.GIFT) {
            C3831a.m9712b("ttlive_gift", "load Gift icon");
        } else if (hVar == C6605h.FAST_GIFT) {
            C3831a.m9712b("ttlive_gift", "load FastGift icon");
        }
        View view = (View) this.f17961b.get(hVar);
        if (view != null) {
            mo12686b(hVar, view);
        }
        this.f17962c.put(hVar, aVar);
        if (view != null) {
            mo12683a(hVar, view);
        }
        if (this.f17960a != null) {
            this.f17960a.lambda$put$1$DataCenter("tool_bar_button_load", hVar);
        }
    }
}
