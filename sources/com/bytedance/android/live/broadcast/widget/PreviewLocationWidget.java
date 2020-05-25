package com.bytedance.android.live.broadcast.widget;

import android.app.Activity;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.DialogInterface;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.C1160b.C1161a;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.live.broadcast.preview.StartLiveViewModel;
import com.bytedance.android.live.broadcast.utils.C3637e.C3638a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p272ad.C4526c;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p416t.C8299d;
import com.bytedance.android.livesdk.p416t.C8302f;
import com.bytedance.android.livesdk.p416t.p418b.C8288d;
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

public final class PreviewLocationWidget extends LiveWidget {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f10474a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(PreviewLocationWidget.class), "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;"))};

    /* renamed from: b */
    public boolean f10475b;

    /* renamed from: c */
    public boolean f10476c;

    /* renamed from: d */
    private final C52668f f10477d = C52732g.m112285a(new C3693b(this));

    /* renamed from: e */
    private String f10478e = "";

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewLocationWidget$a */
    static final class C3687a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewLocationWidget f10479a;

        C3687a(PreviewLocationWidget previewLocationWidget) {
            this.f10479a = previewLocationWidget;
        }

        public final void onClick(View view) {
            if (this.f10479a.f10476c) {
                C4575an.m10981a((int) R.string.hs_);
            } else if (!this.f10479a.f10475b) {
                if (C8299d.m16446a(this.f10479a.context, "android.permission.ACCESS_FINE_LOCATION")) {
                    this.f10479a.f10475b = !this.f10479a.f10475b;
                    this.f10479a.mo9064a(this.f10479a.f10475b);
                    return;
                }
                C2952b a = C4116c.m10249a(C4282a.class);
                if (a == null) {
                    C52711k.m112234a();
                }
                long b = ((C4282a) a).user().mo14529b();
                HashMap hashMap = new HashMap();
                hashMap.put("event_belong", CustomActionPushReceiver.f104061f);
                hashMap.put("event_type", "click");
                hashMap.put("event_page", "live_take_page");
                hashMap.put("event_module", "location");
                hashMap.put("user_id", String.valueOf(b));
                C8049c.m15979a().mo14202a("remind_location_click", hashMap, new Object[0]);
                Context context = this.f10479a.context;
                if (context != null) {
                    C8302f.m16453a((Activity) context).mo14483a(C36881.f10480a).mo14485b(C36892.f10481a).mo14484a(new C8288d(this) {

                        /* renamed from: a */
                        final /* synthetic */ C3687a f10482a;

                        {
                            this.f10482a = r1;
                        }

                        /* renamed from: b */
                        public final void mo9069b(String... strArr) {
                            C52711k.m112240b(strArr, "permissions");
                            C2952b a = C4116c.m10249a(C4282a.class);
                            if (a == null) {
                                C52711k.m112234a();
                            }
                            long b = ((C4282a) a).user().mo14529b();
                            HashMap hashMap = new HashMap();
                            hashMap.put("event_belong", CustomActionPushReceiver.f104061f);
                            hashMap.put("event_type", "pv");
                            hashMap.put("event_page", "live_take_page");
                            hashMap.put("enter_from", "live_take_page");
                            hashMap.put("source", "location");
                            hashMap.put("user_id", String.valueOf(b));
                            hashMap.put("is_success", "0");
                            C8049c.m15979a().mo14202a("location_feedback", hashMap, new Object[0]);
                        }

                        /* renamed from: a */
                        public final void mo9068a(String... strArr) {
                            C52711k.m112240b(strArr, "permissions");
                            this.f10482a.f10479a.f10475b = !this.f10482a.f10479a.f10475b;
                            this.f10482a.f10479a.mo9064a(this.f10482a.f10479a.f10475b);
                            C2952b a = C4116c.m10249a(C4282a.class);
                            if (a == null) {
                                C52711k.m112234a();
                            }
                            long b = ((C4282a) a).user().mo14529b();
                            HashMap hashMap = new HashMap();
                            hashMap.put("event_belong", CustomActionPushReceiver.f104061f);
                            hashMap.put("event_type", "pv");
                            hashMap.put("event_page", "live_take_page");
                            hashMap.put("enter_from", "live_take_page");
                            hashMap.put("source", "location");
                            hashMap.put("user_id", String.valueOf(b));
                            hashMap.put("is_success", "1");
                            C8049c.m15979a().mo14202a("location_feedback", hashMap, new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14218f("pv"));
                        }
                    }, "android.permission.ACCESS_FINE_LOCATION");
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.app.Activity");
            } else {
                new C1161a(this.f10479a.context).mo3768b((int) R.string.hs8).mo3759a((int) R.string.hp_, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {

                    /* renamed from: a */
                    final /* synthetic */ C3687a f10483a;

                    {
                        this.f10483a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        Map hashMap = new HashMap();
                        String str = "live_type";
                        Object value = this.f10483a.f10479a.mo9063a().mo8876d().getValue();
                        if (value == null) {
                            C52711k.m112234a();
                        }
                        C52711k.m112236a(value, "startLiveViewModel.liveMode.value!!");
                        hashMap.put(str, C3638a.m9476a((C8710m) value));
                        hashMap.put("button", "keep_on");
                        C8049c.m15979a().mo14202a("location_cancel_page_button_click", hashMap, new Object[0]);
                    }
                }).mo3769b((int) R.string.hp9, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {

                    /* renamed from: a */
                    final /* synthetic */ C3687a f10484a;

                    {
                        this.f10484a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        this.f10484a.f10479a.f10475b = !this.f10484a.f10479a.f10475b;
                        this.f10484a.f10479a.mo9064a(this.f10484a.f10479a.f10475b);
                        Map hashMap = new HashMap();
                        String str = "live_type";
                        Object value = this.f10484a.f10479a.mo9063a().mo8876d().getValue();
                        if (value == null) {
                            C52711k.m112234a();
                        }
                        C52711k.m112236a(value, "startLiveViewModel.liveMode.value!!");
                        hashMap.put(str, C3638a.m9476a((C8710m) value));
                        hashMap.put("button", "off");
                        C8049c.m15979a().mo14202a("location_cancel_page_button_click", hashMap, new Object[0]);
                    }
                }).mo3775c();
                Map hashMap2 = new HashMap();
                String str = "live_type";
                Object value = this.f10479a.mo9063a().mo8876d().getValue();
                if (value == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a(value, "startLiveViewModel.liveMode.value!!");
                hashMap2.put(str, C3638a.m9476a((C8710m) value));
                C8049c.m15979a().mo14202a("location_cancel_page_show", hashMap2, new Object[0]);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewLocationWidget$b */
    static final class C3693b extends C52712l implements C52670a<StartLiveViewModel> {

        /* renamed from: a */
        final /* synthetic */ PreviewLocationWidget f10485a;

        C3693b(PreviewLocationWidget previewLocationWidget) {
            this.f10485a = previewLocationWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context = this.f10485a.context;
            if (context != null) {
                return (StartLiveViewModel) C0214z.m440a((FragmentActivity) context).mo359a(StartLiveViewModel.class);
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: a */
    public final StartLiveViewModel mo9063a() {
        return (StartLiveViewModel) this.f10477d.getValue();
    }

    public final int getLayoutId() {
        return R.layout.bvu;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate() {
        /*
            r6 = this;
            super.onCreate()
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostContext> r0 = com.bytedance.android.livesdkapi.host.IHostContext.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.p245d.C4116c.m10249a(r0)
            java.lang.String r1 = "ServiceManager.getServic…IHostContext::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.bytedance.android.livesdkapi.host.IHostContext r0 = (com.bytedance.android.livesdkapi.host.IHostContext) r0
            com.bytedance.android.livesdkapi.i.m r0 = r0.getCurrentLocation()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002e
            android.content.Context r3 = r6.context
            r4 = 2132550306(0x7f1c22a2, float:2.075394E38)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r0 = r0.f24096a
            r5[r1] = r0
            java.lang.String r0 = r3.getString(r4, r5)
            java.lang.String r3 = "context.getString(R.stri…n_hint_template, it.city)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            r6.f10478e = r0
        L_0x002e:
            java.lang.Class<com.bytedance.android.live.user.a> r0 = com.bytedance.android.live.user.C4282a.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.p245d.C4116c.m10249a(r0)
            com.bytedance.android.live.user.a r0 = (com.bytedance.android.live.user.C4282a) r0
            if (r0 == 0) goto L_0x003b
            r0.user()
        L_0x003b:
            r6.f10475b = r1
            android.content.Context r0 = r6.context
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
            r3[r1] = r4
            boolean r0 = com.bytedance.android.livesdk.p416t.C8299d.m16446a(r0, r3)
            if (r0 == 0) goto L_0x006f
            com.bytedance.android.livesdk.ad.c<java.lang.Integer> r0 = com.bytedance.android.livesdk.p272ad.C4525b.f12313I
            java.lang.String r3 = "LivePluginProperties.LIV…EVIEW_LOCATION_SHOW_STATE"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            java.lang.Object r0 = r0.mo10345a()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L_0x005b
            goto L_0x006f
        L_0x005b:
            int r0 = r0.intValue()
            if (r0 != r2) goto L_0x006f
            boolean r0 = r6.f10476c
            if (r0 != 0) goto L_0x006b
            r6.mo9064a(r2)
            r6.f10475b = r2
            goto L_0x0072
        L_0x006b:
            r6.mo9064a(r1)
            goto L_0x0072
        L_0x006f:
            r6.mo9064a(r1)
        L_0x0072:
            boolean r0 = r6.f10476c
            if (r0 == 0) goto L_0x0083
            android.view.View r0 = r6.contentView
            java.lang.String r1 = "contentView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.setAlpha(r1)
            goto L_0x008f
        L_0x0083:
            android.view.View r0 = r6.contentView
            java.lang.String r1 = "contentView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
        L_0x008f:
            android.view.View r0 = r6.contentView
            com.bytedance.android.live.broadcast.widget.PreviewLocationWidget$a r1 = new com.bytedance.android.live.broadcast.widget.PreviewLocationWidget$a
            r1.<init>(r6)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.widget.PreviewLocationWidget.onCreate():void");
    }

    /* renamed from: a */
    public final void mo9064a(boolean z) {
        if (z) {
            View view = this.contentView;
            C52711k.m112236a((Object) view, "contentView");
            TextView textView = (TextView) view.findViewById(R.id.d61);
            C52711k.m112236a((Object) textView, "contentView.turn_on_location");
            textView.setText(this.f10478e);
            View view2 = this.contentView;
            C52711k.m112236a((Object) view2, "contentView");
            ImageView imageView = (ImageView) view2.findViewById(R.id.ekq);
            C52711k.m112236a((Object) imageView, "contentView.location_state_image");
            Context context = this.context;
            C52711k.m112236a((Object) context, "context");
            imageView.setBackground(context.getResources().getDrawable(R.drawable.e1b));
        } else {
            View view3 = this.contentView;
            C52711k.m112236a((Object) view3, "contentView");
            TextView textView2 = (TextView) view3.findViewById(R.id.d61);
            C52711k.m112236a((Object) textView2, "contentView.turn_on_location");
            Context context2 = this.context;
            C52711k.m112236a((Object) context2, "context");
            textView2.setText(context2.getResources().getString(R.string.hpa));
            View view4 = this.contentView;
            C52711k.m112236a((Object) view4, "contentView");
            ImageView imageView2 = (ImageView) view4.findViewById(R.id.ekq);
            C52711k.m112236a((Object) imageView2, "contentView.location_state_image");
            Context context3 = this.context;
            C52711k.m112236a((Object) context3, "context");
            imageView2.setBackground(context3.getResources().getDrawable(R.drawable.e1c));
        }
        if (z) {
            C4526c<Integer> cVar = C4525b.f12313I;
            C52711k.m112236a((Object) cVar, "LivePluginProperties.LIV…EVIEW_LOCATION_SHOW_STATE");
            cVar.mo10346a(Integer.valueOf(1));
        } else {
            C4526c<Integer> cVar2 = C4525b.f12313I;
            C52711k.m112236a((Object) cVar2, "LivePluginProperties.LIV…EVIEW_LOCATION_SHOW_STATE");
            cVar2.mo10346a(Integer.valueOf(0));
        }
        mo9063a().mo8874b().postValue(Boolean.valueOf(z));
    }
}
