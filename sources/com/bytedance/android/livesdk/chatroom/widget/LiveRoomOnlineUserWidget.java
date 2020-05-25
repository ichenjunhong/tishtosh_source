package com.bytedance.android.livesdk.chatroom.widget;

import android.arch.lifecycle.C0199s;
import android.support.p043v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3890e;
import com.bytedance.android.livesdk.chatroom.presenter.C5866ck;
import com.bytedance.android.livesdk.chatroom.view.C6237c;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6464az;
import com.bytedance.android.livesdk.message.model.C7835bj;
import com.bytedance.android.livesdk.rank.C8221n;
import com.bytedance.android.livesdk.rank.model.C8219f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.trill.R;
import java.util.List;

public class LiveRoomOnlineUserWidget extends LiveRecyclableWidget implements C0199s<KVData>, C6237c {

    /* renamed from: a */
    Room f18017a;

    /* renamed from: b */
    C8221n f18018b;

    /* renamed from: c */
    boolean f18019c = true;

    /* renamed from: d */
    String f18020d;

    /* renamed from: e */
    boolean f18021e;

    /* renamed from: f */
    AppCompatActivity f18022f;

    /* renamed from: g */
    private TextView f18023g;

    /* renamed from: h */
    private C5866ck f18024h;

    /* renamed from: a */
    public final void mo8500a(Throwable th) {
        C6464az.m13908a(this, th);
    }

    /* renamed from: a */
    public final void mo12296a(List<C8219f> list, List<C8219f> list2) {
    }

    /* renamed from: b */
    public final String mo8502b() {
        return C6464az.m13907a(this);
    }

    public int getLayoutId() {
        return R.layout.asf;
    }

    public void onResume() {
        super.onResume();
        m14007a();
    }

    public void onUnload() {
        this.dataCenter.removeObserver(this);
    }

    /* renamed from: a */
    private void m14007a() {
        if (!(!isViewValid() || this.f18017a == null || this.f18017a.getOwner() == null)) {
            this.f18024h.mo11749a(this.f18017a.getId(), this.f18017a.getOwner().getId(), 18);
        }
    }

    /* renamed from: b */
    private void m14008b(int i) {
        if (isViewValid()) {
            this.f18023g.setText(C3890e.m9835c((long) i));
        }
    }

    /* renamed from: a */
    public final void mo12295a(int i) {
        if (isViewValid()) {
            this.dataCenter.lambda$put$1$DataCenter("data_member_count", Integer.valueOf(i));
            m14008b(i);
        }
    }

    public void onInit(Object... objArr) {
        this.f18023g = (TextView) this.contentView.findViewById(R.id.bun);
        this.f18023g.setOnClickListener(new C6688n(this));
        this.f18024h = new C5866ck();
        this.f18024h.mo8520a((C6237c) this);
    }

    public /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (isViewValid() && kVData != null && !TextUtils.isEmpty(kVData.getKey())) {
            String key = kVData.getKey();
            char c = 65535;
            if (key.hashCode() == -407049065 && key.equals("data_member_message")) {
                c = 0;
            }
            if (c == 0) {
                C7835bj bjVar = (C7835bj) kVData.getData();
                int i = bjVar.f21633a;
                m14008b(i);
                if (i < 15) {
                    m14007a();
                }
                if (bjVar.mo14147a() == 8) {
                    m14007a();
                }
            }
        }
    }

    public void onLoad(Object... objArr) {
        this.f18017a = (Room) this.dataCenter.get("data_room");
        this.dataCenter.observe("data_member_message", this);
        this.f18019c = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
        this.f18020d = (String) this.dataCenter.get("log_enter_live_source");
        this.f18021e = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f18022f = (AppCompatActivity) this.context;
    }
}
