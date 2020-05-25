package com.bytedance.android.live.broadcast.widget;

import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import com.bytedance.android.live.broadcast.preview.StartLiveViewModel;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p272ad.C4526c;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

public final class PreviewReverseCameraWidget extends LiveWidget {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f10486a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(PreviewReverseCameraWidget.class), "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;"))};

    /* renamed from: b */
    private final C52668f f10487b = C52732g.m112285a(new C3695b(this));

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewReverseCameraWidget$a */
    static final class C3694a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewReverseCameraWidget f10488a;

        C3694a(PreviewReverseCameraWidget previewReverseCameraWidget) {
            this.f10488a = previewReverseCameraWidget;
        }

        public final void onClick(View view) {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 180.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setFillAfter(true);
            rotateAnimation.setDuration(200);
            rotateAnimation.setInterpolator(new AccelerateInterpolator());
            View view2 = this.f10488a.contentView;
            C52711k.m112236a((Object) view2, "contentView");
            ((ImageView) view2.findViewById(R.id.e1a)).startAnimation(rotateAnimation);
            Integer num = (Integer) this.f10488a.mo9072a().mo8877e().getValue();
            if (num == null) {
                num = Integer.valueOf(1);
            }
            C52711k.m112236a((Object) num, "startLiveViewModel.camer…ewModel.CAMERA_TYPE_FRONT");
            int intValue = 1 - num.intValue();
            this.f10488a.mo9072a().mo8877e().postValue(Integer.valueOf(intValue));
            C4526c<Integer> cVar = C4525b.f12433g;
            C52711k.m112236a((Object) cVar, "LivePluginProperties.KEY_LIVE_CAMERA_TYPE");
            cVar.mo10348b(Integer.valueOf(intValue));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewReverseCameraWidget$b */
    static final class C3695b extends C52712l implements C52670a<StartLiveViewModel> {

        /* renamed from: a */
        final /* synthetic */ PreviewReverseCameraWidget f10489a;

        C3695b(PreviewReverseCameraWidget previewReverseCameraWidget) {
            this.f10489a = previewReverseCameraWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context = this.f10489a.context;
            if (context != null) {
                return (StartLiveViewModel) C0214z.m440a((FragmentActivity) context).mo359a(StartLiveViewModel.class);
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: a */
    public final StartLiveViewModel mo9072a() {
        return (StartLiveViewModel) this.f10487b.getValue();
    }

    public final int getLayoutId() {
        return R.layout.by7;
    }

    public final void onCreate() {
        super.onCreate();
        Integer num = (Integer) mo9072a().mo8877e().getValue();
        if (num == null) {
            num = Integer.valueOf(1);
        }
        C52711k.m112236a((Object) num, "startLiveViewModel.camer…ewModel.CAMERA_TYPE_FRONT");
        int intValue = num.intValue();
        C4526c<Integer> cVar = C4525b.f12433g;
        C52711k.m112236a((Object) cVar, "LivePluginProperties.KEY_LIVE_CAMERA_TYPE");
        cVar.mo10348b(Integer.valueOf(intValue));
        this.contentView.setOnClickListener(new C3694a(this));
    }
}
