package com.bytedance.android.live.broadcast.p198b;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p030v4.app.C0649f;
import android.support.p030v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.rxutils.autodispose.C4021e;
import com.bytedance.android.live.uikit.layout.WrapLineFlowLayout;
import com.bytedance.android.livesdk.chatroom.model.C5728aq;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p064c.p065a.C1673aa;
import p064c.p065a.C2203w;

/* renamed from: com.bytedance.android.live.broadcast.b.j */
public final class C3076j extends C0649f implements OnClickListener {

    /* renamed from: a */
    int f9007a = -1;

    /* renamed from: b */
    WrapLineFlowLayout f9008b;

    /* renamed from: c */
    View f9009c;

    /* renamed from: d */
    List<TextView> f9010d = new ArrayList();

    /* renamed from: e */
    int f9011e = -1;

    /* renamed from: f */
    List<C5728aq> f9012f;

    /* renamed from: g */
    public OnDismissListener f9013g;

    /* renamed from: h */
    boolean f9014h = false;

    /* renamed from: com.bytedance.android.live.broadcast.b.j$a */
    public interface C3077a {
        /* renamed from: a */
        void mo8363a(C5728aq aqVar);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f9014h = false;
    }

    public final void onResume() {
        super.onResume();
        mo8361a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8361a() {
        if (this.f9012f != null) {
            this.f9008b.post(new C3080m(this));
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f9013g != null) {
            this.f9013g.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(true);
        onCreateDialog.requestWindowFeature(1);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo9431a()).intValue() == 1) {
                window.setLayout(-1, -2);
            } else {
                window.setLayout(-1, -1);
            }
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setSoftInputMode(3);
            window.clearFlags(2);
        }
        return onCreateDialog;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, 16973841);
        if (getArguments() != null) {
            this.f9007a = getArguments().getInt("INIT_TAG_ID", -1);
        }
        ((C4002ac) C3395f.m9156f().mo8742c().mo9020c().getRoomTags().mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6525a((C2203w<T, ? extends R>) C4021e.m10137a((Fragment) this))).mo9406a(new C3078k(this), C3079l.f9016a);
    }

    public final void onClick(View view) {
        boolean z;
        if (view.getId() == R.id.dw4) {
            for (Fragment fragment : getFragmentManager().mo2238f()) {
                if (fragment instanceof C3077a) {
                    if (this.f9011e != -1) {
                        ((C3077a) fragment).mo8363a((C5728aq) this.f9012f.get(this.f9011e));
                    } else {
                        ((C3077a) fragment).mo8363a(null);
                    }
                }
            }
            dismiss();
        } else if (view.getId() == R.id.by8) {
            dismiss();
        } else {
            boolean z2 = !view.isSelected();
            int intValue = ((Integer) view.getTag()).intValue();
            if (!(intValue == this.f9011e || this.f9011e == -1)) {
                ((TextView) this.f9010d.get(this.f9011e)).setSelected(false);
            }
            view.setSelected(z2);
            if (!z2) {
                intValue = -1;
            }
            this.f9011e = intValue;
            if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo9431a()).intValue() == 0) {
                View view2 = this.f9009c;
                if (this.f9011e != -1) {
                    z = true;
                } else {
                    z = false;
                }
                view2.setEnabled(z);
            }
            if (this.f9011e != -1) {
                HashMap hashMap = new HashMap();
                hashMap.put("room_tag", ((C5728aq) this.f9012f.get(this.f9011e)).f15082b);
                C8049c.m15979a().mo14202a("room_tag_click", hashMap, new C8059j().mo14215c("bottom_tab").mo14214b(CustomActionPushReceiver.f104061f).mo14213a("live_take_page").mo14218f("click"));
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f9014h = true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo9431a()).intValue() == 1) {
            i = R.layout.anj;
        } else {
            i = R.layout.ani;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        this.f9009c = inflate.findViewById(R.id.dw4);
        this.f9009c.setOnClickListener(this);
        if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo9431a()).intValue() == 0) {
            inflate.findViewById(R.id.by8).setOnClickListener(this);
        }
        this.f9008b = (WrapLineFlowLayout) inflate.findViewById(R.id.cxq);
        return inflate;
    }
}
