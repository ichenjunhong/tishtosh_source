package com.bytedance.android.livesdk.chatroom.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.chatroom.view.C6238d;
import com.bytedance.android.livesdk.chatroom.viewmodule.TopLeftLuckyBoxWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.VoteWidget;
import com.bytedance.android.livesdk.config.C6719c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

public class LiveRoomTopContainerWidget extends LiveRecyclableWidget {

    /* renamed from: a */
    private static final String f18041a = "com.bytedance.android.livesdk.chatroom.widget.LiveRoomTopContainerWidget";

    /* renamed from: b */
    private LinearLayout f18042b;

    /* renamed from: c */
    private List<C6633a> f18043c = new ArrayList();

    /* renamed from: d */
    private int f18044d;

    /* renamed from: e */
    private int f18045e;

    /* renamed from: f */
    private int f18046f;

    /* renamed from: g */
    private boolean f18047g = false;

    /* renamed from: h */
    private LiveWidget f18048h;

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.LiveRoomTopContainerWidget$a */
    class C6633a {

        /* renamed from: a */
        Class f18049a;

        /* renamed from: b */
        int f18050b;

        /* renamed from: c */
        int f18051c;

        /* renamed from: d */
        int f18052d = 0;

        /* renamed from: e */
        int f18053e = 0;

        C6633a(Class cls, int i, int i2, int i3, int i4) {
            this.f18049a = cls;
            this.f18050b = i;
            this.f18051c = i2;
        }
    }

    public int getLayoutId() {
        return R.layout.ao3;
    }

    public void onUnload() {
        if (this.f18043c != null) {
            this.f18043c.clear();
        }
        if (this.f18042b != null) {
            this.f18042b.removeAllViews();
        }
        this.f18048h = null;
    }

    /* renamed from: a */
    public final void mo12736a(ViewGroup viewGroup) {
        if (this.f18048h instanceof TopLeftLuckyBoxWidget) {
            ((TopLeftLuckyBoxWidget) this.f18048h).mo12540a(viewGroup);
        }
    }

    public void onInit(Object... objArr) {
        this.f18042b = (LinearLayout) this.contentView.findViewById(R.id.dv7);
        boolean z = true;
        if (((Integer) LiveSettingKeys.LIVE_OPTIMIZE_STYLE_V1.mo9431a()).intValue() <= 1) {
            z = false;
        }
        this.f18047g = z;
        this.f18044d = (int) C9432q.m18687b(getContext(), 24.0f);
        this.f18045e = (int) C9432q.m18687b(getContext(), 30.0f);
        this.f18046f = (int) C9432q.m18687b(getContext(), 44.0f);
    }

    public void onLoad(Object... objArr) {
        boolean z;
        int i;
        if (this.f18043c == null) {
            this.f18043c = new ArrayList();
        }
        if (this.dataCenter != null) {
            Room room = (Room) this.dataCenter.get("data_room", null);
            if (room != null && !room.isStar()) {
                if (this.dataCenter == null || this.dataCenter.get("data_room") == null) {
                    z = false;
                } else {
                    z = ((Room) this.dataCenter.get("data_room")).isKoiRoom();
                }
                if (!z) {
                    List<C6633a> list = this.f18043c;
                    Class<TopLeftLuckyBoxWidget> cls = TopLeftLuckyBoxWidget.class;
                    if (this.f18047g) {
                        i = 0;
                    } else {
                        i = -14;
                    }
                    C6633a aVar = new C6633a(cls, i, 0, 0, 0);
                    list.add(aVar);
                    if (((C6719c) LiveConfigSettingKeys.LIVE_VOTE_CONFIG.mo9431a()).f18365a > 0 && ((Integer) LiveSettingKeys.LIVE_OPTIMIZE_STYLE_V1.mo9431a()).intValue() == 1 && room != null && !room.isThirdParty && !room.isScreenshot) {
                        List<C6633a> list2 = this.f18043c;
                        C6633a aVar2 = new C6633a(VoteWidget.class, (int) C9432q.m18687b(getContext(), 4.0f), (int) C9432q.m18687b(getContext(), 2.0f), 0, 0);
                        list2.add(aVar2);
                    }
                }
            }
        }
        this.f18042b.removeAllViews();
        enableSubWidgetManager();
        if (!this.f18047g) {
            C6238d dVar = new C6238d(getContext());
            LayoutParams layoutParams = new LayoutParams(this.f18044d, 1);
            dVar.addView(new View(getContext()), new LayoutParams(this.f18045e, 1));
            this.f18042b.addView(dVar, layoutParams);
        } else if (this.f18042b != null) {
            this.f18042b.setPadding((int) C9432q.m18687b(C3922z.m9915e(), 3.0f), 0, 0, 0);
        }
        for (C6633a aVar3 : this.f18043c) {
            C6238d dVar2 = new C6238d(getContext());
            LiveRecyclableWidget load = ((RecyclableWidgetManager) this.subWidgetManager).load((ViewGroup) dVar2, aVar3.f18049a, false, (Object[]) null);
            LayoutParams layoutParams2 = new LayoutParams(-2, -2);
            layoutParams2.rightMargin = aVar3.f18051c;
            layoutParams2.leftMargin = aVar3.f18050b;
            layoutParams2.topMargin = aVar3.f18052d;
            layoutParams2.bottomMargin = aVar3.f18053e;
            layoutParams2.gravity = 1;
            this.f18042b.addView(dVar2, layoutParams2);
            if ((load instanceof TopLeftLuckyBoxWidget) && this.containerView != null) {
                this.f18048h = load;
                mo12736a((ViewGroup) this.containerView.getParent());
            }
        }
    }
}
