package com.bytedance.android.live.broadcast.widget;

import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.broadcast.preview.StartLiveEventViewModel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

public final class PreviewCloseWidget extends LiveWidget {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f10427a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(PreviewCloseWidget.class), "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveEventViewModel;"))};

    /* renamed from: b */
    final C52668f f10428b = C52732g.m112285a(new C3660b(this));

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCloseWidget$a */
    static final class C3659a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewCloseWidget f10429a;

        C3659a(PreviewCloseWidget previewCloseWidget) {
            this.f10429a = previewCloseWidget;
        }

        public final void onClick(View view) {
            ((StartLiveEventViewModel) this.f10429a.f10428b.getValue()).mo8867a().postValue(Integer.valueOf(1));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCloseWidget$b */
    static final class C3660b extends C52712l implements C52670a<StartLiveEventViewModel> {

        /* renamed from: a */
        final /* synthetic */ PreviewCloseWidget f10430a;

        C3660b(PreviewCloseWidget previewCloseWidget) {
            this.f10430a = previewCloseWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context = this.f10430a.context;
            if (context != null) {
                return (StartLiveEventViewModel) C0214z.m440a((FragmentActivity) context).mo359a(StartLiveEventViewModel.class);
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    public final int getLayoutId() {
        return R.layout.bvp;
    }

    public final void onCreate() {
        super.onCreate();
        this.containerView.setOnClickListener(new C3659a(this));
    }
}
