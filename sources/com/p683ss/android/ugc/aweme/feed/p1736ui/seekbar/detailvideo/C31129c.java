package com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.detailvideo;

import android.app.Dialog;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.adaptation.C22453b;
import com.p683ss.android.ugc.aweme.base.livedata.SlideData;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.common.p1596h.C26892b;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.C31121a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.VideoSeekBar;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.detailvideo.DispatchTouchEventLinearLayout.C31126a;
import com.p683ss.android.ugc.aweme.feed.panel.C30597ae;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo.c */
public final class C31129c extends C26892b {

    /* renamed from: g */
    public static final C31130a f81485g = new C31130a(null);

    /* renamed from: a */
    public VideoSeekBar f81486a;

    /* renamed from: b */
    public DispatchTouchEventLinearLayout f81487b;

    /* renamed from: c */
    public C31126a f81488c;

    /* renamed from: d */
    public C31128b f81489d;

    /* renamed from: e */
    public View f81490e;

    /* renamed from: f */
    public boolean f81491f;

    /* renamed from: h */
    private C30597ae f81492h;

    /* renamed from: i */
    private SlideData f81493i;

    /* renamed from: j */
    private C0199s<Float> f81494j;

    /* renamed from: k */
    private boolean f81495k;

    /* renamed from: l */
    private HashMap f81496l;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo.c$a */
    public static final class C31130a {
        private C31130a() {
        }

        public /* synthetic */ C31130a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo.c$b */
    public static final class C31131b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C31129c f81497a;

        public C31131b(C31129c cVar) {
            this.f81497a = cVar;
        }

        public final void run() {
            View view = this.f81497a.f81490e;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo.c$c */
    public static final class C31132c implements OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ C31129c f81498a;

        C31132c(C31129c cVar) {
            this.f81498a = cVar;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            C52711k.m112240b(dialogInterface, "dialog");
            C52711k.m112240b(keyEvent, "event");
            if (!this.f81498a.isAdded()) {
                return false;
            }
            C31126a aVar = this.f81498a.f81488c;
            if (aVar != null) {
                return aVar.mo63949a(keyEvent);
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo.c$d */
    static final class C31133d<T> implements C0199s<Float> {

        /* renamed from: a */
        final /* synthetic */ C31129c f81499a;

        C31133d(C31129c cVar) {
            this.f81499a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Float f = (Float) obj;
            if (f != null) {
                VideoSeekBar videoSeekBar = this.f81499a.f81486a;
                if (videoSeekBar == null) {
                    C52711k.m112237a("mVideoSeekBar");
                }
                videoSeekBar.setTranslationX(((float) C23724k.m58224b(this.f81499a.getContext())) * f.floatValue());
            }
        }
    }

    /* renamed from: j */
    public final boolean mo54846j() {
        if (!super.mo54846j() || getContext() == null) {
            return false;
        }
        return true;
    }

    public final void onDestroy() {
        super.onDestroy();
        C31128b bVar = this.f81489d;
        if (bVar != null) {
            C47718bf.m103291d(bVar);
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        if (this.f81494j != null) {
            SlideData slideData = this.f81493i;
            if (slideData != null) {
                C0198r a = slideData.mo48721a();
                if (a != null) {
                    C0199s<Float> sVar = this.f81494j;
                    if (sVar == null) {
                        C52711k.m112234a();
                    }
                    a.removeObserver(sVar);
                }
            }
        }
        if (this.f81496l != null) {
            this.f81496l.clear();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.a70);
    }

    /* renamed from: a */
    public final void mo63957a(boolean z) {
        if (this.f81490e == null) {
            this.f81495k = z;
            return;
        }
        View view = this.f81490e;
        if (view != null) {
            if (z) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        C52711k.m112236a((Object) dialog, "dialog");
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Window window2 = activity.getWindow();
            if (window2 != null) {
                window2.setSoftInputMode(48);
            }
        }
        getDialog().setOnKeyListener(new C31132c(this));
        getDialog().setCanceledOnTouchOutside(false);
        getDialog().setCancelable(false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            this.f81493i = (SlideData) C0214z.m440a(activity).mo359a(SlideData.class);
            this.f81494j = new C31133d(this);
            if (this.f81494j != null) {
                SlideData slideData = this.f81493i;
                if (slideData != null) {
                    C0198r a = slideData.mo48721a();
                    if (a != null) {
                        FragmentActivity activity2 = getActivity();
                        if (activity2 == null) {
                            C52711k.m112234a();
                        }
                        C0184k kVar = activity2;
                        C0199s<Float> sVar = this.f81494j;
                        if (sVar == null) {
                            C52711k.m112234a();
                        }
                        a.observe(kVar, sVar);
                    }
                }
            }
        }
        if (mo54846j() && C22453b.m55510c()) {
            DispatchTouchEventLinearLayout dispatchTouchEventLinearLayout = this.f81487b;
            if (dispatchTouchEventLinearLayout == null) {
                C52711k.m112237a("mDispatchTouchEventLinearLayout");
            }
            LayoutParams layoutParams = dispatchTouchEventLinearLayout.getLayoutParams();
            layoutParams.height += C23728o.m58241a(11.0d);
            DispatchTouchEventLinearLayout dispatchTouchEventLinearLayout2 = this.f81487b;
            if (dispatchTouchEventLinearLayout2 == null) {
                C52711k.m112237a("mDispatchTouchEventLinearLayout");
            }
            dispatchTouchEventLinearLayout2.setLayoutParams(layoutParams);
        }
        mo63957a(this.f81495k);
    }

    /* renamed from: a */
    public final void mo63956a(int i, float f, int i2) {
        C31128b bVar = this.f81489d;
        if (bVar != null) {
            bVar.mo75375c();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        WindowManager.LayoutParams layoutParams;
        ViewGroup viewGroup2;
        C52711k.m112240b(layoutInflater, "inflater");
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.b8t, viewGroup, false);
        this.f81490e = inflate;
        C52711k.m112236a((Object) inflate, "view");
        VideoSeekBar videoSeekBar = (VideoSeekBar) inflate.findViewById(R.id.dq2);
        C52711k.m112236a((Object) videoSeekBar, "view.video_seek_bar");
        this.f81486a = videoSeekBar;
        DispatchTouchEventLinearLayout dispatchTouchEventLinearLayout = (DispatchTouchEventLinearLayout) inflate.findViewById(R.id.ma);
        C52711k.m112236a((Object) dispatchTouchEventLinearLayout, "view.bottom_space");
        this.f81487b = dispatchTouchEventLinearLayout;
        if (this.f81491f) {
            DispatchTouchEventLinearLayout dispatchTouchEventLinearLayout2 = this.f81487b;
            if (dispatchTouchEventLinearLayout2 == null) {
                C52711k.m112237a("mDispatchTouchEventLinearLayout");
            }
            LayoutParams layoutParams2 = dispatchTouchEventLinearLayout2.getLayoutParams();
            if (layoutParams2 != null) {
                ((MarginLayoutParams) layoutParams2).bottomMargin = (int) C9432q.m18687b(getContext(), 13.0f);
                DispatchTouchEventLinearLayout dispatchTouchEventLinearLayout3 = this.f81487b;
                if (dispatchTouchEventLinearLayout3 == null) {
                    C52711k.m112237a("mDispatchTouchEventLinearLayout");
                }
                dispatchTouchEventLinearLayout3.setLayoutParams(layoutParams2);
            } else {
                throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        Dialog dialog = getDialog();
        C52711k.m112236a((Object) dialog, "dialog");
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        if (window != null) {
            window.setSoftInputMode(34);
        }
        if (window != null) {
            window.addFlags(32);
        }
        if (window != null) {
            layoutParams = window.getAttributes();
        } else {
            layoutParams = null;
        }
        if (window != null) {
            window.setAttributes(layoutParams);
        }
        if (window != null) {
            window.setGravity(80);
        }
        if (window != null) {
            window.setDimAmount(0.0f);
        }
        DispatchTouchEventLinearLayout dispatchTouchEventLinearLayout4 = this.f81487b;
        if (dispatchTouchEventLinearLayout4 == null) {
            C52711k.m112237a("mDispatchTouchEventLinearLayout");
        }
        dispatchTouchEventLinearLayout4.setDispatchTouchEventCallBack(this.f81488c);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            viewGroup2 = (ViewGroup) activity.findViewById(16908290);
        } else {
            viewGroup2 = null;
        }
        View inflate2 = LayoutInflater.from(getActivity()).inflate(R.layout.b8n, null, false);
        if (inflate2 != null) {
            LinearLayout linearLayout = (LinearLayout) inflate2;
            if (viewGroup2 != null) {
                viewGroup2.addView(linearLayout);
            }
            LayoutParams layoutParams3 = linearLayout.getLayoutParams();
            if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                layoutParams3.width = -1;
                layoutParams3.height = -2;
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                layoutParams4.gravity = 80;
                layoutParams4.bottomMargin = (int) C9432q.m18687b((Context) getActivity(), 116.0f);
                linearLayout.setLayoutParams(layoutParams3);
            }
            VideoSeekBar videoSeekBar2 = this.f81486a;
            if (videoSeekBar2 == null) {
                C52711k.m112237a("mVideoSeekBar");
            }
            this.f81489d = new C31128b(videoSeekBar2, linearLayout, this.f81492h);
            C30597ae aeVar = this.f81492h;
            if (aeVar != null) {
                C31128b bVar = this.f81489d;
                if (bVar != null) {
                    bVar.f93345n = aeVar.mo60519ak();
                }
                C31128b bVar2 = this.f81489d;
                if (bVar2 != null) {
                    bVar2.onFullFeedVideoChangeEvent(new C31121a(aeVar.mo60519ak(), aeVar.ay_(), aeVar.mo60502X(), aeVar));
                }
            }
            return inflate;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.LinearLayout");
    }
}
