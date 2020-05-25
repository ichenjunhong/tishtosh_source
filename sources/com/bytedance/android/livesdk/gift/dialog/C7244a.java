package com.bytedance.android.livesdk.gift.dialog;

import android.app.Dialog;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3894h;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.C6736d;
import com.bytedance.android.livesdk.chatroom.event.C5171aq;
import com.bytedance.android.livesdk.chatroom.event.C5191k;
import com.bytedance.android.livesdk.gift.C7625r.C7626a;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7289a;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7290b;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel;
import com.bytedance.android.livesdk.gift.model.p379a.C7491b;
import com.bytedance.android.livesdk.gift.panel.widget.C7595ao;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.a */
public final class C7244a extends C6736d {

    /* renamed from: a */
    private Context f19658a;

    /* renamed from: b */
    private boolean f19659b;

    /* renamed from: c */
    private C7595ao f19660c;

    /* renamed from: d */
    private boolean f19661d;

    /* renamed from: e */
    private boolean f19662e;

    /* renamed from: f */
    private DataCenter f19663f;

    /* renamed from: g */
    private boolean f19664g;

    /* renamed from: h */
    private GiftViewModel f19665h;

    /* renamed from: i */
    private User f19666i;

    /* renamed from: k */
    private String f19667k;

    /* renamed from: l */
    private C7626a f19668l;

    public final void onResume() {
        super.onResume();
        if (this.f19665h != null) {
            this.f19665h.mo13530a((C0184k) this, (C0199s<C7290b>) new C7245b<C7290b>(this));
        }
    }

    public final void dismiss() {
        float f;
        if (this.f19663f != null) {
            DataCenter dataCenter = this.f19663f;
            String str = "cmd_gift_dialog_switch";
            Context context = this.f19658a;
            if (this.f19659b) {
                f = 354.0f;
            } else {
                f = 0.0f;
            }
            dataCenter.lambda$put$1$DataCenter(str, new C5191k((int) C9432q.m18687b(context, f), false));
        }
        C4495a.m10823a().mo10301a((Object) new C5171aq(this.f19664g));
        super.dismiss();
    }

    public final void dismissAllowingStateLoss() {
        float f;
        if (this.f19663f != null) {
            DataCenter dataCenter = this.f19663f;
            String str = "cmd_gift_dialog_switch";
            Context context = this.f19658a;
            if (this.f19659b) {
                f = 354.0f;
            } else {
                f = 0.0f;
            }
            dataCenter.lambda$put$1$DataCenter(str, new C5191k((int) C9432q.m18687b(context, f), false));
        }
        C4495a.m10823a().mo10301a((Object) new C5171aq(this.f19664g));
        super.dismissAllowingStateLoss();
    }

    /* renamed from: h */
    public final boolean mo11100h() {
        float f;
        if (this.f19663f != null) {
            DataCenter dataCenter = this.f19663f;
            String str = "cmd_gift_dialog_switch";
            Context context = this.f19658a;
            if (this.f19659b) {
                f = 354.0f;
            } else {
                f = 0.0f;
            }
            dataCenter.lambda$put$1$DataCenter(str, new C5191k((int) C9432q.m18687b(context, f), false));
        }
        C4495a.m10823a().mo10301a((Object) new C5171aq(this.f19664g));
        return super.mo11100h();
    }

    public final void onDestroyView() {
        super.onDestroyView();
        if (this.f19665h != null) {
            GiftViewModel giftViewModel = this.f19665h;
            giftViewModel.f19825b.mo13541a((C7491b) null);
            giftViewModel.f19825b.f19857g = 1;
            giftViewModel.f19825b.f19863m = false;
            giftViewModel.f19825b.f19861k = false;
            this.f19665h.mo13529a((C0184k) this);
        }
    }

    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (this.f19659b) {
            if (this.f19662e) {
                i = R.style.yw;
            } else {
                i = R.style.yv;
            }
            setStyle(1, i);
            return;
        }
        setStyle(1, R.style.a8w);
    }

    public final void onActivityCreated(Bundle bundle) {
        Dialog dialog = getDialog();
        dialog.requestWindowFeature(1);
        dialog.setCanceledOnTouchOutside(true);
        super.onActivityCreated(bundle);
        Window window = getDialog().getWindow();
        if (window != null) {
            if (!this.f19659b || (!this.f19661d && !C3894h.m9842a(getContext()))) {
                window.addFlags(PreloadTask.BYTE_UNIT_NUMBER);
            } else {
                window.clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
            }
            if (this.f19659b) {
                window.setGravity(80);
            } else {
                window.setGravity(8388613);
            }
            window.setSoftInputMode(48);
            if (this.f19662e) {
                window.setLayout(-1, -2);
                LayoutParams attributes = window.getAttributes();
                attributes.width = C3922z.m9910c();
                attributes.height = C3922z.m9908b() - C3922z.m9912d();
                window.setAttributes(attributes);
                return;
            }
            window.setLayout(-1, -1);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        float f;
        super.onViewCreated(view, bundle);
        this.f19664g = false;
        if (this.f19665h == null) {
            dismissAllowingStateLoss();
            return;
        }
        this.f19665h.mo13533a(this.f19663f);
        dismissAllowingStateLoss();
        this.f19665h.mo13536a(new C7289a(0, null));
        this.f19665h.f19831h = this.f19666i;
        this.f19665h.f19832i = this.f19667k;
        this.f19665h.f19833j = this.f19668l;
        if (this.f19660c == C7595ao.PROP) {
            this.f19665h.mo13536a(new C7289a(5, Integer.valueOf(5)));
        } else {
            this.f19665h.mo13536a(new C7289a(5, Integer.valueOf(1)));
        }
        if (this.f19663f != null) {
            DataCenter dataCenter = this.f19663f;
            String str = "cmd_gift_dialog_switch";
            Context context = this.f19658a;
            if (this.f19659b) {
                f = 354.0f;
            } else {
                f = 0.0f;
            }
            dataCenter.lambda$put$1$DataCenter(str, new C5191k((int) C9432q.m18687b(context, f), true));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.bwm, viewGroup, false);
    }

    /* renamed from: a */
    public static C7244a m15026a(Context context, boolean z, C7595ao aoVar, boolean z2, User user, String str, DataCenter dataCenter, C7626a aVar, GiftViewModel giftViewModel) {
        boolean z3;
        C7244a aVar2 = new C7244a();
        aVar2.f19658a = context;
        aVar2.f19659b = z;
        aVar2.f19660c = aoVar;
        aVar2.f19661d = z2;
        if (!z || (!z2 && !C3894h.m9842a(context))) {
            z3 = false;
        } else {
            z3 = true;
        }
        aVar2.f19662e = z3;
        aVar2.f19663f = dataCenter;
        aVar2.f19666i = user;
        aVar2.f19667k = str;
        aVar2.f19668l = aVar;
        aVar2.f19665h = giftViewModel;
        return aVar2;
    }
}
