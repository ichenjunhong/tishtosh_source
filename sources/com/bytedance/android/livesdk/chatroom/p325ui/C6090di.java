package com.bytedance.android.livesdk.chatroom.p325ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.android.live.base.model.C2970d;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.livesdk.C6736d;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.presenter.C5887q;
import com.bytedance.android.livesdk.chatroom.presenter.C5887q.C5888a;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.di */
public class C6090di extends C6736d implements OnClickListener, C5888a {

    /* renamed from: a */
    public static final String f16317a = "di";

    /* renamed from: b */
    boolean f16318b;

    /* renamed from: c */
    User f16319c;

    /* renamed from: d */
    DataCenter f16320d;

    /* renamed from: e */
    List<C2970d> f16321e;

    /* renamed from: f */
    FansClubData f16322f;

    /* renamed from: g */
    C2970d f16323g;

    /* renamed from: h */
    View f16324h;

    /* renamed from: i */
    boolean f16325i;

    /* renamed from: k */
    private C5887q f16326k;

    /* renamed from: l */
    private TextView f16327l;

    /* renamed from: m */
    private RecyclerView f16328m;

    /* renamed from: n */
    private C5920aa f16329n;

    /* renamed from: o */
    private C5921a f16330o = new C6091dj(this);

    /* renamed from: a */
    public final void mo11776a() {
        if (this.f16318b) {
            C4575an.m10981a((int) R.string.f0q);
            dismiss();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f16318b = false;
        this.f16326k.mo8247a();
    }

    /* renamed from: a */
    public final void mo11777a(Throwable th) {
        if (this.f16318b) {
            if (th instanceof C2949a) {
                C4575an.m10987a(((C2949a) th).getPrompt());
                return;
            }
            C4602l.m11046a(getContext(), th);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f16320d != null) {
            this.f16320d.lambda$put$1$DataCenter("cmd_show_user_profile", new UserProfileEvent(this.f16319c));
        }
    }

    public void onActivityCreated(Bundle bundle) {
        Dialog dialog = getDialog();
        dialog.requestWindowFeature(1);
        dialog.setCanceledOnTouchOutside(true);
        super.onActivityCreated(bundle);
        Window window = dialog.getWindow();
        if (window != null) {
            if (!this.f16325i) {
                window.setGravity(8388613);
                window.setLayout(-2, -1);
                window.setBackgroundDrawable(new ColorDrawable(0));
                return;
            }
            window.setGravity(80);
            window.setLayout(-1, -2);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (this.f16325i) {
            i = R.style.xy;
        } else {
            i = R.style.xz;
        }
        setStyle(1, i);
        this.f16318b = true;
        this.f16326k = new C5887q();
        this.f16326k.mo8520a(this);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.cgr) {
            if (this.f16322f == null && this.f16323g != null) {
                this.f16326k.mo11775a(String.valueOf(this.f16323g.f8700a.getId()));
            } else if (this.f16322f != null && this.f16323g == null) {
                this.f16326k.mo11775a("");
            } else if (this.f16322f == null || this.f16323g == null || TextUtils.isEmpty(this.f16322f.clubName) || this.f16322f.clubName.equals(this.f16323g.f8704e.f8667a)) {
                mo11776a();
            } else {
                this.f16326k.mo11775a(String.valueOf(this.f16323g.f8700a.getId()));
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f16327l = (TextView) view.findViewById(R.id.cgr);
        this.f16327l.setOnClickListener(this);
        this.f16328m = (RecyclerView) view.findViewById(R.id.adk);
        this.f16328m.setLayoutManager(new GridLayoutManager(getContext(), 3));
        this.f16329n = new C5920aa(this.f16321e, this.f16322f, this.f16330o);
        this.f16328m.setAdapter(this.f16329n);
        if (!this.f16325i) {
            this.f16324h.post(new C6092dk(this));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f16324h = layoutInflater.inflate(R.layout.akp, viewGroup, false);
        return this.f16324h;
    }
}
