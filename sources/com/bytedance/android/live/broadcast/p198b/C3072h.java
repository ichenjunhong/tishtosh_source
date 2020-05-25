package com.bytedance.android.live.broadcast.p198b;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.model.C3460g;
import com.bytedance.android.live.broadcast.p203e.C3187a;
import com.bytedance.android.live.broadcast.p203e.C3191d;
import com.bytedance.android.live.broadcast.p203e.C3192e;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.browser.C3805a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView.C4239a;
import com.bytedance.android.livesdk.C6736d;
import com.bytedance.android.livesdk.browser.p289c.C4704c;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p064c.p065a.C1673aa;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.b.h */
public final class C3072h extends C6736d implements OnClickListener {

    /* renamed from: a */
    public Context f8985a;

    /* renamed from: b */
    public RelativeLayout f8986b;

    /* renamed from: c */
    public TextView f8987c;

    /* renamed from: d */
    public TextView f8988d;

    /* renamed from: e */
    public LinearLayout f8989e;

    /* renamed from: f */
    public LoadingStatusView f8990f;

    /* renamed from: g */
    public List<C3460g> f8991g;

    /* renamed from: h */
    private View f8992h;

    /* renamed from: i */
    private ProgressBar f8993i;

    /* renamed from: k */
    private TextView f8994k;

    /* renamed from: l */
    private TextView f8995l;

    /* renamed from: m */
    private TextView f8996m;

    /* renamed from: n */
    private C3187a f8997n;

    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f8997n != null) {
            C3187a aVar = this.f8997n;
            if (aVar.f9242d != 1) {
                aVar.f9243e = true;
                aVar.mo8533d();
            }
        }
        super.onDismiss(dialogInterface);
    }

    public final void onActivityCreated(Bundle bundle) {
        Dialog dialog = getDialog();
        dialog.requestWindowFeature(1);
        dialog.setCanceledOnTouchOutside(true);
        super.onActivityCreated(bundle);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, -2);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    public final void onClick(View view) {
        int i;
        if (view instanceof HSImageView) {
            if (view.getTag() != null) {
                i = ((Integer) view.getTag()).intValue();
            } else {
                i = -1;
            }
            if (this.f8991g != null && !this.f8991g.isEmpty() && i >= 0 && i < this.f8991g.size()) {
                C3460g gVar = (C3460g) this.f8991g.get(i);
                if (gVar != null && !TextUtils.isEmpty(gVar.f9900a)) {
                    ((C3805a) C4116c.m10249a(C3805a.class)).webViewManager().mo10490a(getContext(), C4704c.m11227b(gVar.f9900a));
                    if (gVar.f9900a.contains("health_score")) {
                        C8049c.m15979a().mo14203a("livesdk_know_health_score_page_show", new C8059j().mo14217e("shield"));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static C3072h m8560a(Context context, C3187a aVar) {
        C3072h hVar = new C3072h();
        hVar.f8985a = context;
        hVar.f8997n = aVar;
        return hVar;
    }

    /* renamed from: a */
    public final void mo8356a(boolean z, CharSequence charSequence) {
        if (z) {
            this.f8996m.setVisibility(0);
            this.f8996m.setText(charSequence);
            return;
        }
        this.f8996m.setVisibility(8);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f8997n != null) {
            C3187a aVar = this.f8997n;
            aVar.f9241c.removeMessages(2);
            aVar.f9242d = 3;
            C3395f.m9156f().mo8742c().mo9020c().getReviewInfo(aVar.f9240b).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C3191d<Object>(aVar), (C1710e<? super Throwable>) new C3192e<Object>(aVar));
        }
    }

    /* renamed from: a */
    private static Spannable m8559a(String str, int i, int i2) {
        SpannableString spannableString = new SpannableString(str);
        AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan((int) C3922z.m9907b(25.0f));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C3922z.m9909b((int) R.color.t1));
        spannableString.setSpan(absoluteSizeSpan, 4, i2, 18);
        spannableString.setSpan(foregroundColorSpan, 4, i2, 18);
        return spannableString;
    }

    /* renamed from: a */
    public final void mo8355a(boolean z, int i, int i2) {
        if (z) {
            this.f8994k.setVisibility(0);
            this.f8994k.setText(m8559a(C3922z.m9905a((int) R.string.es7, Integer.valueOf(i)), 4, String.valueOf(i).length() + 4));
            this.f8995l.setVisibility(0);
            this.f8995l.setText(m8559a(C3922z.m9905a((int) R.string.es8, Integer.valueOf(i2)), 4, String.valueOf(i2).length() + 4));
            return;
        }
        this.f8994k.setVisibility(4);
        this.f8995l.setVisibility(4);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f8992h = layoutInflater.inflate(R.layout.aif, viewGroup, false);
        this.f8986b = (RelativeLayout) this.f8992h.findViewById(R.id.zr);
        this.f8987c = (TextView) this.f8992h.findViewById(R.id.aoc);
        this.f8988d = (TextView) this.f8992h.findViewById(R.id.ao_);
        this.f8993i = (ProgressBar) this.f8992h.findViewById(R.id.ao9);
        this.f8994k = (TextView) this.f8992h.findViewById(R.id.dto);
        this.f8995l = (TextView) this.f8992h.findViewById(R.id.dtp);
        this.f8996m = (TextView) this.f8992h.findViewById(R.id.rm);
        this.f8989e = (LinearLayout) this.f8992h.findViewById(R.id.lx);
        this.f8990f = (LoadingStatusView) this.f8992h.findViewById(R.id.bh5);
        this.f8990f.setBuilder(C4239a.m10480a(getContext()).mo9847a(getResources().getDimensionPixelSize(R.dimen.o4)));
        this.f8990f.setVisibility(0);
        this.f8990f.mo9843b();
        this.f8990f.setVisibility(0);
        this.f8990f.mo9843b();
        return this.f8992h;
    }
}
