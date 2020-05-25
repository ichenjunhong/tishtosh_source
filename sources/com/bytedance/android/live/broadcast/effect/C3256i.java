package com.bytedance.android.live.broadcast.effect;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.android.live.broadcast.effect.p204a.C3198a.C3199a;
import com.bytedance.android.live.broadcast.effect.p204a.C3202c;
import com.bytedance.android.live.broadcast.effect.p208d.C3249b;
import com.bytedance.android.live.core.p230g.C3894h;
import com.bytedance.android.livesdk.C6736d;
import com.bytedance.common.utility.C9432q;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.effect.i */
public final class C3256i extends C6736d {

    /* renamed from: a */
    public boolean f9406a;

    /* renamed from: b */
    public C3199a f9407b;

    /* renamed from: c */
    public OnDismissListener f9408c;

    /* renamed from: d */
    public List<FilterModel> f9409d;

    /* renamed from: e */
    private boolean f9410e;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.yl);
        setCancelable(true);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f9408c != null) {
            this.f9408c.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                if (this.f9410e) {
                    window.setLayout((int) C9432q.m18687b(getContext(), 391.0f), (int) C9432q.m18687b(getContext(), 148.0f));
                } else if (this.f9406a) {
                    window.setLayout(-1, -2);
                } else {
                    window.setLayout(-1, (int) getContext().getResources().getDimension(R.dimen.s7));
                }
            }
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(true);
        onCreateDialog.requestWindowFeature(1);
        Window window = onCreateDialog.getWindow();
        boolean z = false;
        this.f9410e = false;
        if (getArguments() != null) {
            this.f9410e = getArguments().getBoolean("bundle_landscape", false);
        }
        if (window != null) {
            if (this.f9410e) {
                window.setGravity(85);
                window.setLayout((int) C9432q.m18687b(getContext(), 391.0f), (int) C9432q.m18687b(getContext(), 148.0f));
            } else if (this.f9406a) {
                window.setGravity(80);
                window.setLayout(-1, -2);
            } else {
                window.setGravity(80);
                window.setLayout(-1, (int) getContext().getResources().getDimension(R.dimen.s7));
            }
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setSoftInputMode(3);
            if (getArguments() != null) {
                z = getArguments().getBoolean("bundle_full_screen", false);
            }
            if (z && !C3894h.m9842a(getActivity())) {
                window.addFlags(PreloadTask.BYTE_UNIT_NUMBER);
            }
            window.clearFlags(2);
        }
        return onCreateDialog;
    }

    /* renamed from: a */
    public static C3256i m8926a(C3199a aVar, List<FilterModel> list, boolean z) {
        C3256i iVar = new C3256i();
        iVar.f9407b = aVar;
        iVar.f9409d = list;
        Bundle bundle = new Bundle();
        bundle.putBoolean("bundle_full_screen", z);
        iVar.setArguments(bundle);
        iVar.f9406a = false;
        return iVar;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        C3202c cVar;
        if (this.f9406a) {
            i = R.layout.ahh;
        } else {
            i = R.layout.ahg;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        List<FilterModel> list = this.f9409d;
        if (list == null && getArguments() != null) {
            list = (List) C2942b.m8369a().mo34885a(getArguments().getString("filterModelJson"), new C17956a<List<FilterModel>>() {
            }.f49843c);
        }
        C0679r a = getChildFragmentManager().mo2225a();
        C3199a aVar = this.f9407b;
        if (list == null) {
            list = new ArrayList<>();
        }
        if (this.f9406a) {
            i2 = R.layout.am7;
        } else {
            i2 = R.layout.am6;
        }
        if (this.f9406a) {
            cVar = new C3202c();
        } else {
            cVar = null;
        }
        a.mo2175a((int) R.id.aj_, (Fragment) C3258j.m8927a(aVar, list, new C3249b(i2, cVar))).mo2195c();
        return inflate;
    }

    /* renamed from: a */
    public static C3256i m8925a(C3199a aVar, String str, boolean z, boolean z2) {
        C3256i iVar = new C3256i();
        iVar.f9407b = aVar;
        Bundle bundle = new Bundle();
        bundle.putString("filterModelJson", str);
        bundle.putBoolean("bundle_full_screen", true);
        iVar.setArguments(bundle);
        iVar.f9406a = true;
        return iVar;
    }
}
