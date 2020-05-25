package com.bytedance.android.livesdk.chatroom.p325ui;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.p325ui.LiveProfileManageViewPager.C5914b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.dg */
public final class C6080dg extends Dialog {

    /* renamed from: e */
    public static final C6081a f16287e = new C6081a(null);

    /* renamed from: a */
    public boolean f16288a;

    /* renamed from: b */
    public boolean f16289b;

    /* renamed from: c */
    public final int f16290c;

    /* renamed from: d */
    public final C6082b f16291d;

    /* renamed from: f */
    private View f16292f;

    /* renamed from: g */
    private final OnLayoutChangeListener f16293g;

    /* renamed from: h */
    private final Room f16294h;

    /* renamed from: i */
    private final User f16295i;

    /* renamed from: j */
    private final boolean f16296j;

    /* renamed from: k */
    private final boolean f16297k;

    /* renamed from: l */
    private final boolean f16298l;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dg$a */
    public static final class C6081a {
        private C6081a() {
        }

        public /* synthetic */ C6081a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dg$b */
    public interface C6082b {
        /* renamed from: a */
        void mo12118a();

        /* renamed from: a */
        void mo12119a(int i);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dg$c */
    public static final class C6083c implements OnLayoutChangeListener {

        /* renamed from: a */
        public final float f16299a = 0.75f;

        /* renamed from: b */
        final /* synthetic */ C6080dg f16300b;

        /* renamed from: c */
        private float f16301c = -1.0f;

        C6083c(C6080dg dgVar) {
            this.f16300b = dgVar;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C52711k.m112240b(view, "v");
            if (this.f16300b.f16288a) {
                if (this.f16301c < 0.0f) {
                    this.f16301c = ((float) this.f16300b.f16290c) * this.f16299a;
                }
                if (((float) i4) < this.f16301c) {
                    if (!this.f16300b.f16289b) {
                        this.f16300b.f16289b = true;
                        C5914b mAdapter = ((LiveProfileManageViewPager) this.f16300b.findViewById(R.id.evb)).getMAdapter();
                        if (mAdapter != null) {
                            mAdapter.mo11836a(this.f16300b.f16289b);
                        }
                        ((LiveProfileManageViewPager) this.f16300b.findViewById(R.id.evb)).mo11828a();
                    }
                } else if (this.f16300b.f16289b) {
                    this.f16300b.f16289b = false;
                    C5914b mAdapter2 = ((LiveProfileManageViewPager) this.f16300b.findViewById(R.id.evb)).getMAdapter();
                    if (mAdapter2 != null) {
                        mAdapter2.mo11836a(this.f16300b.f16289b);
                    }
                    ((LiveProfileManageViewPager) this.f16300b.findViewById(R.id.evb)).mo11828a();
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dg$d */
    public static final class C6084d implements C6082b {

        /* renamed from: a */
        final /* synthetic */ C6080dg f16302a;

        /* renamed from: a */
        public final void mo12118a() {
            this.f16302a.dismiss();
        }

        C6084d(C6080dg dgVar) {
            this.f16302a = dgVar;
        }

        /* renamed from: a */
        public final void mo12119a(int i) {
            switch (i) {
                case 0:
                    ((LiveProfileManageViewPager) this.f16302a.findViewById(R.id.evb)).mo11829a(1);
                    return;
                case 1:
                    ((LiveProfileManageViewPager) this.f16302a.findViewById(R.id.evb)).mo11829a(2);
                    return;
                case 2:
                    ((LiveProfileManageViewPager) this.f16302a.findViewById(R.id.evb)).mo11829a(3);
                    return;
                case 3:
                    LiveProfileManageViewPager liveProfileManageViewPager = (LiveProfileManageViewPager) this.f16302a.findViewById(R.id.evb);
                    C5914b bVar = liveProfileManageViewPager.f15520a;
                    if (bVar != null) {
                        liveProfileManageViewPager.setCurrentItem(0, true);
                        liveProfileManageViewPager.mo11830a((View) bVar.f15524a);
                        return;
                    }
                    break;
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dg$e */
    static final class C6085e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6080dg f16303a;

        C6085e(C6080dg dgVar) {
            this.f16303a = dgVar;
        }

        public final void onClick(View view) {
            this.f16303a.dismiss();
        }
    }

    public C6080dg(Context context, Room room, User user, boolean z, boolean z2) {
        this(context, room, user, z, z2, false, 32, null);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16288a = true;
    }

    public final void onDetachedFromWindow() {
        this.f16288a = false;
        super.onDetachedFromWindow();
    }

    public final void dismiss() {
        IBinder iBinder;
        if (this.f16289b) {
            Object systemService = getContext().getSystemService("input_method");
            if (systemService != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                View view = this.f16292f;
                if (view != null) {
                    iBinder = view.getWindowToken();
                } else {
                    iBinder = null;
                }
                inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
            } else {
                throw new C52857u("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            }
        }
        super.dismiss();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        this.f16292f = getLayoutInflater().inflate(R.layout.bw7, null);
        setContentView(this.f16292f);
        if (window != null) {
            window.setLayout(-1, -1);
            window.setSoftInputMode(18);
            window.getDecorView().addOnLayoutChangeListener(this.f16293g);
        }
        findViewById(R.id.eva).setOnClickListener(new C6085e(this));
        LiveProfileManageViewPager liveProfileManageViewPager = (LiveProfileManageViewPager) findViewById(R.id.evb);
        C52711k.m112236a((Object) liveProfileManageViewPager, "setting_view_pager");
        Context context = getContext();
        C52711k.m112236a((Object) context, "context");
        LayoutInflater layoutInflater = getLayoutInflater();
        C52711k.m112236a((Object) layoutInflater, "layoutInflater");
        C5914b bVar = new C5914b(context, layoutInflater, this.f16291d, this.f16294h, this.f16295i, this.f16296j, this.f16298l);
        liveProfileManageViewPager.setAdapter(bVar);
    }

    private C6080dg(Context context, Room room, User user, boolean z, boolean z2, boolean z3) {
        int i;
        C52711k.m112240b(context, "context");
        if (z2) {
            i = R.style.y3;
        } else {
            i = R.style.a8u;
        }
        super(context, i);
        this.f16294h = room;
        this.f16295i = user;
        this.f16296j = z;
        this.f16297k = z2;
        this.f16298l = z3;
        Resources resources = context.getResources();
        C52711k.m112236a((Object) resources, "context.resources");
        this.f16290c = resources.getDisplayMetrics().heightPixels;
        this.f16291d = new C6084d(this);
        this.f16293g = new C6083c(this);
    }

    private /* synthetic */ C6080dg(Context context, Room room, User user, boolean z, boolean z2, boolean z3, int i, C52707g gVar) {
        this(context, room, user, z, z2, true);
    }
}
