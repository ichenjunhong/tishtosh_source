package com.bytedance.android.live.broadcast.widget;

import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.preview.StartLiveViewModel;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p272ad.C4526c;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
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

public final class SelectLiveTypeWidget extends LiveWidget {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f10505a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SelectLiveTypeWidget.class), "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;"))};

    /* renamed from: b */
    private final C52668f f10506b = C52732g.m112285a(new C3706c(this));

    /* renamed from: com.bytedance.android.live.broadcast.widget.SelectLiveTypeWidget$a */
    static final class C3704a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SelectLiveTypeWidget f10507a;

        C3704a(SelectLiveTypeWidget selectLiveTypeWidget) {
            this.f10507a = selectLiveTypeWidget;
        }

        public final void onClick(View view) {
            this.f10507a.mo9080a().mo8876d().postValue(C8710m.VIDEO);
            this.f10507a.mo9081a(true);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.SelectLiveTypeWidget$b */
    static final class C3705b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SelectLiveTypeWidget f10508a;

        C3705b(SelectLiveTypeWidget selectLiveTypeWidget) {
            this.f10508a = selectLiveTypeWidget;
        }

        public final void onClick(View view) {
            this.f10508a.mo9080a().mo8876d().postValue(C8710m.THIRD_PARTY);
            this.f10508a.mo9081a(false);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.SelectLiveTypeWidget$c */
    static final class C3706c extends C52712l implements C52670a<StartLiveViewModel> {

        /* renamed from: a */
        final /* synthetic */ SelectLiveTypeWidget f10509a;

        C3706c(SelectLiveTypeWidget selectLiveTypeWidget) {
            this.f10509a = selectLiveTypeWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context = this.f10509a.context;
            if (context != null) {
                return (StartLiveViewModel) C0214z.m440a((FragmentActivity) context).mo359a(StartLiveViewModel.class);
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: a */
    public final StartLiveViewModel mo9080a() {
        return (StartLiveViewModel) this.f10506b.getValue();
    }

    public final int getLayoutId() {
        return R.layout.by8;
    }

    /* renamed from: b */
    private static void m9525b() {
        Map hashMap = new HashMap();
        hashMap.put("event_page", "live_take_page");
        C8049c.m15979a().mo14202a("thirdparty_take_click", hashMap, new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14218f("click"));
    }

    public final void onCreate() {
        boolean z;
        super.onCreate();
        View view = this.contentView;
        C52711k.m112236a((Object) view, "contentView");
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.f6s);
        C52711k.m112236a((Object) linearLayout, "contentView.video_model_block");
        TextView textView = (TextView) linearLayout.findViewById(R.id.f6u);
        C52711k.m112236a((Object) textView, "contentView.video_model_block.video_model_text");
        Context context = getContext();
        C52711k.m112236a((Object) context, "getContext()");
        textView.setText(context.getResources().getText(R.string.gy7));
        ViewGroup viewGroup = this.containerView;
        C52711k.m112236a((Object) viewGroup, "containerView");
        LinearLayout linearLayout2 = (LinearLayout) viewGroup.findViewById(R.id.e_7);
        C52711k.m112236a((Object) linearLayout2, "containerView.game_model_block");
        TextView textView2 = (TextView) linearLayout2.findViewById(R.id.e_6);
        C52711k.m112236a((Object) textView2, "containerView.game_model_block.game_mode_text");
        Context context2 = getContext();
        C52711k.m112236a((Object) context2, "getContext()");
        textView2.setText(context2.getResources().getText(R.string.gy9));
        View view2 = this.contentView;
        C52711k.m112236a((Object) view2, "contentView");
        ((LinearLayout) view2.findViewById(R.id.f6s)).setOnClickListener(new C3704a(this));
        View view3 = this.contentView;
        C52711k.m112236a((Object) view3, "contentView");
        ((LinearLayout) view3.findViewById(R.id.e_7)).setOnClickListener(new C3705b(this));
        C4526c<String> cVar = C4525b.f12314J;
        C52711k.m112236a((Object) cVar, "LivePluginProperties.LIVE_START_LIVE_MODE_NAME");
        Object a = cVar.mo10345a();
        C52711k.m112236a(a, "LivePluginProperties.LIV…TART_LIVE_MODE_NAME.value");
        C8710m valueOf = C8710m.valueOf((String) a);
        if (valueOf == C8710m.VIDEO) {
            z = true;
        } else {
            z = false;
        }
        mo9081a(z);
        mo9080a().mo8876d().postValue(valueOf);
    }

    /* renamed from: a */
    public final void mo9081a(boolean z) {
        if (z) {
            View view = this.contentView;
            C52711k.m112236a((Object) view, "contentView");
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.f6s);
            C52711k.m112236a((Object) linearLayout, "contentView.video_model_block");
            ImageView imageView = (ImageView) linearLayout.findViewById(R.id.f6t);
            C52711k.m112236a((Object) imageView, "contentView.video_model_block.video_model_icon");
            Context context = getContext();
            C52711k.m112236a((Object) context, "getContext()");
            imageView.setBackground(context.getResources().getDrawable(R.drawable.e1e));
            View view2 = this.contentView;
            C52711k.m112236a((Object) view2, "contentView");
            LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(R.id.f6s);
            C52711k.m112236a((Object) linearLayout2, "contentView.video_model_block");
            TextView textView = (TextView) linearLayout2.findViewById(R.id.f6u);
            C52711k.m112236a((Object) textView, "contentView.video_model_block.video_model_text");
            textView.setAlpha(0.9f);
            View view3 = this.contentView;
            C52711k.m112236a((Object) view3, "contentView");
            LinearLayout linearLayout3 = (LinearLayout) view3.findViewById(R.id.e_7);
            C52711k.m112236a((Object) linearLayout3, "contentView.game_model_block");
            ImageView imageView2 = (ImageView) linearLayout3.findViewById(R.id.e_5);
            C52711k.m112236a((Object) imageView2, "contentView.game_model_block.game_mode_icon");
            Context context2 = getContext();
            C52711k.m112236a((Object) context2, "getContext()");
            imageView2.setBackground(context2.getResources().getDrawable(R.drawable.e1_));
            View view4 = this.contentView;
            C52711k.m112236a((Object) view4, "contentView");
            LinearLayout linearLayout4 = (LinearLayout) view4.findViewById(R.id.e_7);
            C52711k.m112236a((Object) linearLayout4, "contentView.game_model_block");
            TextView textView2 = (TextView) linearLayout4.findViewById(R.id.e_6);
            C52711k.m112236a((Object) textView2, "contentView.game_model_block.game_mode_text");
            textView2.setAlpha(0.5f);
            return;
        }
        View view5 = this.contentView;
        C52711k.m112236a((Object) view5, "contentView");
        LinearLayout linearLayout5 = (LinearLayout) view5.findViewById(R.id.f6s);
        C52711k.m112236a((Object) linearLayout5, "contentView.video_model_block");
        ImageView imageView3 = (ImageView) linearLayout5.findViewById(R.id.f6t);
        C52711k.m112236a((Object) imageView3, "contentView.video_model_block.video_model_icon");
        Context context3 = getContext();
        C52711k.m112236a((Object) context3, "getContext()");
        imageView3.setBackground(context3.getResources().getDrawable(R.drawable.e1f));
        View view6 = this.contentView;
        C52711k.m112236a((Object) view6, "contentView");
        LinearLayout linearLayout6 = (LinearLayout) view6.findViewById(R.id.f6s);
        C52711k.m112236a((Object) linearLayout6, "contentView.video_model_block");
        TextView textView3 = (TextView) linearLayout6.findViewById(R.id.f6u);
        C52711k.m112236a((Object) textView3, "contentView.video_model_block.video_model_text");
        textView3.setAlpha(0.5f);
        View view7 = this.contentView;
        C52711k.m112236a((Object) view7, "contentView");
        LinearLayout linearLayout7 = (LinearLayout) view7.findViewById(R.id.e_7);
        C52711k.m112236a((Object) linearLayout7, "contentView.game_model_block");
        ImageView imageView4 = (ImageView) linearLayout7.findViewById(R.id.e_5);
        C52711k.m112236a((Object) imageView4, "contentView.game_model_block.game_mode_icon");
        Context context4 = getContext();
        C52711k.m112236a((Object) context4, "getContext()");
        imageView4.setBackground(context4.getResources().getDrawable(R.drawable.e19));
        View view8 = this.contentView;
        C52711k.m112236a((Object) view8, "contentView");
        LinearLayout linearLayout8 = (LinearLayout) view8.findViewById(R.id.e_7);
        C52711k.m112236a((Object) linearLayout8, "contentView.game_model_block");
        TextView textView4 = (TextView) linearLayout8.findViewById(R.id.e_6);
        C52711k.m112236a((Object) textView4, "contentView.game_model_block.game_mode_text");
        textView4.setAlpha(0.9f);
        m9525b();
    }
}
