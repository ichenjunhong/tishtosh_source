package com.bytedance.android.live.broadcast.effect;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.android.live.broadcast.effect.C3251f.C3252a;
import com.bytedance.android.live.broadcast.effect.p204a.C3198a.C3199a;
import com.bytedance.android.live.core.p230g.C3894h;
import com.bytedance.android.livesdk.C6736d;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.broadcast.effect.c */
public final class C3236c extends C6736d implements C3199a {

    /* renamed from: a */
    public OnDismissListener f9349a;

    /* renamed from: b */
    private C3252a f9350b;

    /* renamed from: c */
    private C3199a f9351c;

    /* renamed from: d */
    private boolean f9352d;

    /* renamed from: e */
    private boolean f9353e;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.yl);
        setCancelable(true);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f9349a != null) {
            this.f9349a.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    /* renamed from: a */
    public final void mo8488a(int i) {
        C3251f fVar = (C3251f) getChildFragmentManager().mo2224a("beautyFragmentTag");
        if (fVar != null) {
            float a = C3261l.m8929a(C3266p.m8943a().f9434b, i);
            if (a > ((float) fVar.f9389b.getProgress())) {
                fVar.f9389b.setProgress((int) a);
            }
        }
        this.f9351c.mo8488a(i);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                if (this.f9353e) {
                    window.setLayout((int) C9432q.m18687b(getContext(), 391.0f), (int) C9432q.m18687b(getContext(), 152.0f));
                    window.setGravity(85);
                } else if (this.f9352d) {
                    window.setLayout(-1, -2);
                    window.setGravity(80);
                } else {
                    window.setLayout(-1, (int) getContext().getResources().getDimension(R.dimen.s6));
                    window.setGravity(80);
                }
                window.setBackgroundDrawableResource(R.color.a8w);
            }
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(true);
        onCreateDialog.requestWindowFeature(1);
        Window window = onCreateDialog.getWindow();
        boolean z = false;
        this.f9353e = false;
        if (getArguments() != null) {
            this.f9353e = getArguments().getBoolean("bundle_broadcast_landscape", false);
        }
        if (window != null) {
            if (this.f9353e) {
                window.setLayout((int) C9432q.m18687b(getContext(), 391.0f), (int) C9432q.m18687b(getContext(), 152.0f));
                window.setGravity(85);
            } else if (this.f9352d) {
                window.setLayout(-1, -2);
                window.setGravity(80);
            } else {
                window.setLayout(-1, (int) getContext().getResources().getDimension(R.dimen.s6));
                window.setGravity(80);
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

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        C0679r rVar;
        if (this.f9353e) {
            view = layoutInflater.inflate(R.layout.ahz, viewGroup, false);
        } else if (this.f9352d) {
            view = layoutInflater.inflate(R.layout.ahy, viewGroup, false);
        } else {
            view = layoutInflater.inflate(R.layout.ahx, viewGroup, false);
        }
        C0654k childFragmentManager = getChildFragmentManager();
        Fragment a = childFragmentManager.mo2224a("beautyFragmentTag");
        if (a != null) {
            rVar = childFragmentManager.mo2225a().mo2196c(a);
        } else {
            C3252a aVar = this.f9350b;
            boolean z = this.f9352d;
            C3251f fVar = new C3251f();
            fVar.setArguments(new Bundle());
            fVar.f9388a = aVar;
            fVar.f9390c = z;
            rVar = childFragmentManager.mo2225a().mo2176a(R.id.aj_, fVar, "beautyFragmentTag");
        }
        rVar.mo2195c();
        return view;
    }

    /* renamed from: a */
    public static C3236c m8868a(C3252a aVar, C3199a aVar2, boolean z, int i) {
        C3236c cVar = new C3236c();
        Bundle bundle = new Bundle();
        bundle.putBoolean("bundle_full_screen", z);
        bundle.putInt("bundle_from", i);
        cVar.setArguments(bundle);
        cVar.f9350b = aVar;
        cVar.f9351c = aVar2;
        return cVar;
    }

    /* renamed from: a */
    public static C3236c m8869a(C3252a aVar, C3199a aVar2, boolean z, int i, boolean z2) {
        C3236c a = m8868a(aVar, aVar2, true, 0);
        a.f9352d = z2;
        return a;
    }
}
