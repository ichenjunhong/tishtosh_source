package com.bytedance.android.livesdk.gift.panel.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.chatroom.event.C5202u;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.widget.AvatarIconView;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.C7565d;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.trill.R;

public class GiftPanelGuestInfoWidget extends LiveWidget implements OnClickListener {

    /* renamed from: a */
    private AvatarIconView f20837a;

    /* renamed from: b */
    private TextView f20838b;

    /* renamed from: c */
    private View f20839c;

    /* renamed from: d */
    private View f20840d;

    /* renamed from: e */
    private GiftDialogViewModel f20841e;

    /* renamed from: f */
    private C7565d f20842f;

    public int getLayoutId() {
        return R.layout.ai7;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f20841e.mo13948a(this);
    }

    public void onCreate() {
        super.onCreate();
        this.f20841e = (GiftDialogViewModel) this.dataCenter.get("data_gift_dialog_view_model");
        this.f20842f = this.f20841e.f20770c;
        this.containerView.setVisibility(0);
        this.f20837a = (AvatarIconView) this.contentView.findViewById(R.id.hi);
        this.f20838b = (TextView) this.contentView.findViewById(R.id.d1r);
        this.f20839c = this.contentView.findViewById(R.id.dn_);
        this.f20840d = this.contentView.findViewById(R.id.dnc);
        if (((Boolean) LiveSettingKeys.LIVE_MT_GUEST_LINK_ENABLE_GUEST_CONTRIBUTION_LIST.mo9431a()) != Boolean.TRUE) {
            this.f20840d.setVisibility(8);
        }
        User user = this.f20841e.f20773f;
        if (user != null) {
            this.f20837a.setAvatar(user.getAvatarThumb());
            if (((Boolean) LiveSettingKeys.LIVE_USERNAME_DISPLAY.mo9431a()).booleanValue()) {
                this.f20838b.setText(C3922z.m9905a((int) R.string.h0w, user.displayId));
            } else {
                this.f20838b.setText(C3922z.m9905a((int) R.string.h0w, user.getNickName()));
            }
        }
        this.f20837a.setOnClickListener(this);
        this.f20839c.setOnClickListener(this);
        this.f20840d.setOnClickListener(this);
        this.f20841e.f20785r.observe(this, new C7614t(this));
        this.f20841e.f20786s.observe(this, new C7615u(this));
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r5 != false) goto L_0x0044;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13959a(boolean r5) {
        /*
            r4 = this;
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$d r0 = r4.f20842f
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$d r1 = com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.C7565d.GUEST
            if (r0 == r1) goto L_0x0007
            return
        L_0x0007:
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = r4.f20841e
            android.arch.lifecycle.r<com.bytedance.android.livesdk.gift.model.a.a> r0 = r0.f20785r
            java.lang.Object r0 = r0.getValue()
            com.bytedance.android.livesdk.gift.model.a.a r0 = (com.bytedance.android.livesdk.gift.model.p379a.C7490a) r0
            r1 = 0
            r2 = 8
            if (r0 == 0) goto L_0x0025
            boolean r0 = r0.mo13906c()
            if (r0 == 0) goto L_0x0025
            android.view.View r5 = r4.f20839c
            r5.setVisibility(r2)
            android.view.View r5 = r4.f20840d
            r0 = r5
            goto L_0x0042
        L_0x0025:
            android.view.View r0 = r4.f20839c
            if (r5 == 0) goto L_0x002b
            r3 = 0
            goto L_0x002d
        L_0x002b:
            r3 = 8
        L_0x002d:
            r0.setVisibility(r3)
            com.bytedance.android.live.core.setting.p<java.lang.Boolean> r0 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_MT_GUEST_LINK_ENABLE_GUEST_CONTRIBUTION_LIST
            java.lang.Object r0 = r0.mo9431a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            if (r0 == r3) goto L_0x003d
            r5 = 0
        L_0x003d:
            android.view.View r0 = r4.f20840d
            if (r5 == 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r1 = 8
        L_0x0044:
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.panel.widget.GiftPanelGuestInfoWidget.mo13959a(boolean):void");
    }

    public void onClick(View view) {
        if (view.getId() == R.id.hi || view.getId() == R.id.dn_) {
            this.f20841e.f20784q.postValue(Boolean.valueOf(true));
            C4495a.m10823a().mo10301a((Object) new UserProfileEvent(this.f20841e.f20773f, "guest_connection"));
            return;
        }
        if (view.getId() == R.id.dnc) {
            C5202u uVar = new C5202u(6);
            User user = this.f20841e.f20773f;
            uVar.f13921c = user.getId();
            uVar.f13922d = user.getSecUid();
            this.dataCenter.lambda$put$1$DataCenter("cmd_interact_state_change", uVar);
        }
    }
}
