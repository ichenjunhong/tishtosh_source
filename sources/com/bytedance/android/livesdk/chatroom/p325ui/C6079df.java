package com.bytedance.android.livesdk.chatroom.p325ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.C3012k;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.admin.p274b.C4532c;
import com.bytedance.android.livesdk.admin.p275c.C4533a;
import com.bytedance.android.livesdk.admin.p277e.C4546a;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.p328d.C6737a;
import com.bytedance.android.livesdk.p328d.C6742f;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p422w.C8442a;
import com.bytedance.android.livesdk.p428z.C8585a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.df */
public final class C6079df extends Dialog implements OnClickListener, C4546a, C6742f {

    /* renamed from: a */
    private Room f16278a;

    /* renamed from: b */
    private User f16279b;

    /* renamed from: c */
    private boolean f16280c;

    /* renamed from: d */
    private C6737a f16281d = new C6737a();

    /* renamed from: e */
    private C4533a f16282e = new C4533a(this);

    /* renamed from: f */
    private TextView f16283f;

    /* renamed from: g */
    private TextView f16284g;

    /* renamed from: h */
    private boolean f16285h;

    /* renamed from: i */
    private boolean f16286i;

    /* renamed from: a */
    public final void mo10360a(C4532c cVar, Exception exc) {
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16280c = true;
    }

    public final void onDetachedFromWindow() {
        this.f16280c = false;
        this.f16281d.f18413a = null;
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    public final void mo12005a(boolean z) {
        int i;
        if (this.f16280c) {
            if (this.f16279b.getUserAttr() == null) {
                this.f16279b.setUserAttr(new C3012k());
            }
            this.f16279b.getUserAttr().f8850a = z;
            TextView textView = this.f16284g;
            if (z) {
                i = R.string.ep1;
            } else {
                i = R.string.ep3;
            }
            textView.setText(i);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        setContentView(LayoutInflater.from(getContext()).inflate(R.layout.aiu, null));
        if (window != null) {
            window.setLayout(-1, -2);
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.yw);
        findViewById(R.id.q7).setOnClickListener(this);
        if (this.f16285h || this.f16279b == null || this.f16278a.getOwner().getId() == this.f16279b.getId()) {
            viewGroup.removeViews(5, 5);
            viewGroup.findViewById(R.id.bk3).setOnClickListener(this);
            viewGroup.findViewById(R.id.bp2).setOnClickListener(this);
            viewGroup.findViewById(R.id.b67).setOnClickListener(this);
            viewGroup.findViewById(R.id.bk3).setVisibility(8);
            return;
        }
        viewGroup.removeViews(0, 5);
        this.f16283f = (TextView) viewGroup.findViewById(R.id.bk1);
        this.f16283f.setOnClickListener(this);
        viewGroup.findViewById(R.id.b66).setOnClickListener(this);
        this.f16284g = (TextView) viewGroup.findViewById(R.id.bp1);
        this.f16284g.setOnClickListener(this);
        C3012k userAttr = this.f16279b.getUserAttr();
        if (userAttr != null) {
            TextView textView = this.f16283f;
            if (userAttr.f8851b) {
                i = R.string.ep0;
            } else {
                i = R.string.ep5;
            }
            textView.setText(i);
            TextView textView2 = this.f16284g;
            if (userAttr.f8850a) {
                i2 = R.string.ep1;
            } else {
                i2 = R.string.ep3;
            }
            textView2.setText(i2);
        }
        this.f16283f.setVisibility(8);
    }

    public final void onClick(View view) {
        boolean z;
        boolean z2;
        long j;
        int id = view.getId();
        if (id == R.id.bk1) {
            if (this.f16279b.getUserAttr() == null || !this.f16279b.getUserAttr().f8851b) {
                z2 = true;
            } else {
                z2 = false;
            }
            C4533a aVar = this.f16282e;
            long id2 = this.f16279b.getId();
            long j2 = 0;
            if (this.f16278a == null || this.f16278a.getOwner() == null) {
                j = 0;
            } else {
                j = this.f16278a.getOwner().getId();
            }
            if (this.f16278a != null) {
                j2 = this.f16278a.getId();
            }
            aVar.mo10356a(z2, id2, j, j2);
        } else if (id == R.id.b66) {
            dismiss();
            C8442a aVar2 = new C8442a(getContext(), this.f16278a.getId(), this.f16278a.getOwnerUserId(), this.f16279b.getId());
            aVar2.show();
            C8049c.m15979a().mo14203a("blacklist_click", new C8059j().mo14214b("relation").mo14218f("click").mo14213a("live_detail"));
        } else if (id == R.id.bp1) {
            if (this.f16279b.getUserAttr() == null || !this.f16279b.getUserAttr().f8850a) {
                z = true;
            } else {
                z = false;
            }
            this.f16281d.mo12852a(z, this.f16278a.getId(), this.f16279b.getId(), this.f16279b.getSecUid());
        } else if (id == R.id.bk3) {
            C8585a aVar3 = new C8585a(getContext(), 1, this.f16278a.getId(), this.f16278a.getOwner().getId(), this.f16286i);
            aVar3.show();
            C8068g.m16014a(getContext());
            dismiss();
        } else if (id == R.id.bp2) {
            C8585a aVar4 = new C8585a(getContext(), 2, this.f16278a.getId(), this.f16278a.getOwner().getId(), this.f16286i);
            aVar4.show();
            dismiss();
        } else if (id == R.id.b67) {
            C8585a aVar5 = new C8585a(getContext(), 3, this.f16278a.getId(), this.f16278a.getOwner().getId(), this.f16286i);
            aVar5.show();
            dismiss();
        } else {
            if (id == R.id.q7) {
                dismiss();
                C8068g.m16014a(getContext());
            }
        }
    }

    /* renamed from: a */
    public final void mo10363a(boolean z, Exception exc) {
        if (this.f16280c) {
            C4602l.m11047a(getContext(), (Throwable) exc, (int) R.string.eon);
        }
    }

    /* renamed from: b */
    public final void mo12006b(boolean z, Exception exc) {
        if (this.f16280c) {
            C4602l.m11047a(getContext(), (Throwable) exc, (int) R.string.eon);
        }
    }

    /* renamed from: a */
    public final void mo10362a(boolean z, User user) {
        int i;
        if (this.f16280c) {
            if (this.f16279b.getUserAttr() == null) {
                this.f16279b.setUserAttr(new C3012k());
            }
            this.f16279b.getUserAttr().f8851b = z;
            TextView textView = this.f16283f;
            if (z) {
                i = R.string.ep0;
            } else {
                i = R.string.ep5;
            }
            textView.setText(i);
        }
    }

    public C6079df(Context context, Room room, User user, boolean z, boolean z2) {
        super(context, R.style.y3);
        this.f16278a = room;
        this.f16279b = user;
        this.f16285h = z;
        this.f16286i = z2;
    }
}
