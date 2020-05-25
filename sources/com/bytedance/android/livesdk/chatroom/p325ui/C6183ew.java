package com.bytedance.android.livesdk.chatroom.p325ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.p043v7.widget.GridLayoutManager.C1302b;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.android.live.core.p230g.C3894h;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.chatroom.event.C5164aj;
import com.bytedance.android.livesdk.chatroom.model.C5727ap;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdkapi.depend.model.live.C8721u;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ew */
public final class C6183ew extends Dialog implements C6176b {

    /* renamed from: a */
    public C6173ev f16596a;

    /* renamed from: b */
    private RecyclerView f16597b;

    /* renamed from: c */
    private boolean f16598c;

    /* renamed from: d */
    private C5727ap f16599d;

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        this.f16598c = false;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        this.f16598c = true;
        if (this.f16599d == null) {
            new Throwable("mRoomDecorationList is null ");
            if (this.f16598c) {
                dismiss();
            }
            return;
        }
        C5727ap apVar = this.f16599d;
        if (this.f16598c) {
            if (this.f16596a == null) {
                this.f16596a = new C6173ev(apVar, this);
                SSGridLayoutManager sSGridLayoutManager = new SSGridLayoutManager(getContext(), 3, 1, false);
                sSGridLayoutManager.f4526g = new C1302b() {
                    /* renamed from: a */
                    public final int mo4690a(int i) {
                        switch (C6183ew.this.f16596a.getItemViewType(i)) {
                            case 1:
                            case 2:
                                return 3;
                            case 3:
                            case 4:
                                return 1;
                            default:
                                return 1;
                        }
                    }
                };
                this.f16597b.setLayoutManager(sSGridLayoutManager);
                this.f16597b.setAdapter(this.f16596a);
            }
            C6173ev evVar = this.f16596a;
            evVar.f16584a.clear();
            evVar.mo12216a(apVar);
            evVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo12219a(C8721u uVar) {
        dismiss();
        C4495a.m10823a().mo10301a((Object) new C5164aj(uVar));
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.aj_);
        Window window = getWindow();
        if (window != null) {
            if (C3922z.m9916f()) {
                window.setLayout(-1, -2);
                window.setGravity(80);
            } else {
                window.setLayout(C3922z.m9899a(392.0f), -1);
                window.setGravity(5);
                if (Build.BRAND.toLowerCase().equals("xiaomi") && C3894h.m9842a(getContext())) {
                    View findViewById = findViewById(R.id.yw);
                    ((LayoutParams) findViewById.getLayoutParams()).topMargin = C3922z.m9899a(40.0f);
                    findViewById.requestLayout();
                }
            }
        }
        this.f16597b = (RecyclerView) findViewById(R.id.a3q);
    }

    public C6183ew(Context context, int i, C5727ap apVar) {
        super(context, i);
        this.f16599d = apVar;
    }
}
