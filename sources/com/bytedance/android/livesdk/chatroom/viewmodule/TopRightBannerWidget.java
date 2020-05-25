package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p230g.C3909r.C3910a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.setting.C4097p;
import com.bytedance.android.livesdk.banner.InRoomBannerManager;
import com.bytedance.android.livesdk.banner.InRoomBannerManager.C4649b;
import com.bytedance.android.livesdk.browser.p289c.C4697b;
import com.bytedance.android.livesdk.browser.p289c.C4697b.C4702d;
import com.bytedance.android.livesdk.browser.p289c.C4697b.C4703e;
import com.bytedance.android.livesdk.chatroom.model.C5743c;
import com.bytedance.android.livesdk.chatroom.model.C5743c.C5744a;
import com.bytedance.android.livesdk.chatroom.p307c.C5036b;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.message.model.C7816au;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p401b.C8038g;
import com.bytedance.android.livesdk.p399o.p401b.C8042k;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p399o.p402c.C8060k;
import com.bytedance.android.livesdkapi.depend.model.live.C8692a;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.google.gson.C18082l;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p064c.p065a.C2201v;
import p064c.p065a.C2203w;
import p064c.p065a.p071d.C1710e;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

public final class TopRightBannerWidget extends LiveRecyclableWidget implements OnMessageListener {

    /* renamed from: e */
    public static final C6408a f17614e = new C6408a(null);

    /* renamed from: a */
    public LinearLayout f17615a;

    /* renamed from: b */
    Room f17616b;

    /* renamed from: c */
    public ImageView f17617c;

    /* renamed from: d */
    AnimatorSet f17618d;

    /* renamed from: f */
    private C4703e f17619f;

    /* renamed from: g */
    private WebView f17620g;

    /* renamed from: h */
    private IMessageManager f17621h;

    /* renamed from: i */
    private boolean f17622i;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget$a */
    static final class C6408a {
        private C6408a() {
        }

        public /* synthetic */ C6408a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget$b */
    static final class C6409b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8692a f17623a;

        /* renamed from: b */
        final /* synthetic */ TopRightBannerWidget f17624b;

        C6409b(C8692a aVar, TopRightBannerWidget topRightBannerWidget) {
            this.f17623a = aVar;
            this.f17624b = topRightBannerWidget;
        }

        public final void onClick(View view) {
            C5036b.m11520a(this.f17624b.context, this.f17623a);
            this.f17624b.mo12542a(String.valueOf(this.f17623a.f23794a), "live_banner_click");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget$c */
    static final class C6410c<T> implements C1710e<C4649b> {

        /* renamed from: a */
        final /* synthetic */ TopRightBannerWidget f17625a;

        C6410c(TopRightBannerWidget topRightBannerWidget) {
            this.f17625a = topRightBannerWidget;
        }

        public final /* synthetic */ void accept(Object obj) {
            C5743c cVar = ((C4649b) obj).f12702b;
            TopRightBannerWidget topRightBannerWidget = this.f17625a;
            C5744a aVar = cVar.f15098b;
            if (aVar == null) {
                ImageView imageView = topRightBannerWidget.f17617c;
                if (imageView == null) {
                    C52711k.m112237a("mAnimateView");
                }
                imageView.setVisibility(8);
                LinearLayout linearLayout = topRightBannerWidget.f17615a;
                if (linearLayout == null) {
                    C52711k.m112237a("staticContainer");
                }
                linearLayout.setVisibility(8);
                LinearLayout linearLayout2 = topRightBannerWidget.f17615a;
                if (linearLayout2 == null) {
                    C52711k.m112237a("staticContainer");
                }
                linearLayout2.removeAllViews();
                return;
            }
            if (aVar.f15103c != null) {
                C4097p<Integer> pVar = LiveConfigSettingKeys.LIVE_USE_BANNER_ANIMATION;
                C52711k.m112236a((Object) pVar, "LiveConfigSettingKeys.LIVE_USE_BANNER_ANIMATION");
                Integer num = (Integer) pVar.mo9431a();
                if (num != null && num.intValue() == 1) {
                    Room room = topRightBannerWidget.f17616b;
                    if (room == null) {
                        C52711k.m112237a("room");
                    }
                    if (room.getStreamType() == C8710m.VIDEO) {
                        ImageView imageView2 = topRightBannerWidget.f17617c;
                        if (imageView2 == null) {
                            C52711k.m112237a("mAnimateView");
                        }
                        imageView2.setVisibility(0);
                        LinearLayout linearLayout3 = topRightBannerWidget.f17615a;
                        if (linearLayout3 == null) {
                            C52711k.m112237a("staticContainer");
                        }
                        linearLayout3.setVisibility(8);
                        topRightBannerWidget.mo12541a(aVar);
                        ImageView imageView3 = topRightBannerWidget.f17617c;
                        if (imageView3 == null) {
                            C52711k.m112237a("mAnimateView");
                        }
                        C5213c.m11819a(imageView3, aVar.f15103c, (C3910a) new C6411d(topRightBannerWidget));
                        return;
                    }
                }
            }
            topRightBannerWidget.mo12541a(aVar);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget$d */
    public static final class C6411d implements C3910a {

        /* renamed from: a */
        final /* synthetic */ TopRightBannerWidget f17626a;

        /* renamed from: a */
        public final void mo9270a(ImageModel imageModel) {
            C52711k.m112240b(imageModel, "imageModel");
        }

        C6411d(TopRightBannerWidget topRightBannerWidget) {
            this.f17626a = topRightBannerWidget;
        }

        /* renamed from: a */
        public final void mo9272a(ImageModel imageModel, Exception exc) {
            C52711k.m112240b(imageModel, "imageModel");
            C52711k.m112240b(exc, "e");
            TopRightBannerWidget.m13829a(this.f17626a).setVisibility(0);
            TopRightBannerWidget.m13831b(this.f17626a).setVisibility(8);
        }

        /* renamed from: a */
        public final void mo9271a(ImageModel imageModel, int i, int i2, boolean z) {
            C52711k.m112240b(imageModel, "imageModel");
            TopRightBannerWidget topRightBannerWidget = this.f17626a;
            ImageView imageView = topRightBannerWidget.f17617c;
            if (imageView == null) {
                C52711k.m112237a("mAnimateView");
            }
            ViewParent parent = imageView.getParent();
            if (parent != null) {
                int width = ((View) parent).getWidth();
                ImageView imageView2 = topRightBannerWidget.f17617c;
                if (imageView2 == null) {
                    C52711k.m112237a("mAnimateView");
                }
                float width2 = (((float) (width - imageView2.getWidth())) * 0.5f) + ((float) C3922z.m9899a(10.0f));
                ImageView imageView3 = topRightBannerWidget.f17617c;
                if (imageView3 == null) {
                    C52711k.m112237a("mAnimateView");
                }
                float height = (((float) imageView3.getHeight()) * 0.8f) + ((float) C3922z.m9899a(10.0f));
                ImageView imageView4 = topRightBannerWidget.f17617c;
                if (imageView4 == null) {
                    C52711k.m112237a("mAnimateView");
                }
                ViewParent parent2 = imageView4.getParent();
                if (parent2 != null) {
                    float height2 = height - ((float) ((View) parent2).getHeight());
                    TopRightBannerWidget.m13830a((Animator) topRightBannerWidget.f17618d);
                    ImageView imageView5 = topRightBannerWidget.f17617c;
                    if (imageView5 == null) {
                        C52711k.m112237a("mAnimateView");
                    }
                    View view = imageView5;
                    AnimatorListener eVar = new C6412e(topRightBannerWidget);
                    AnimatorSet animatorSet = new AnimatorSet();
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "scaleX", new float[]{0.0f, 1.1f}).setDuration(400), ObjectAnimator.ofFloat(view, "scaleY", new float[]{0.0f, 1.1f}).setDuration(400), ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f}).setDuration(400)});
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    animatorSet3.playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "scaleX", new float[]{1.1f, 1.0f}).setDuration(400), ObjectAnimator.ofFloat(view, "scaleY", new float[]{1.1f, 1.0f}).setDuration(400)});
                    animatorSet.playSequentially(new Animator[]{animatorSet2, animatorSet3});
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "scaleX", new float[]{1.0f, 0.6f}).setDuration(800), ObjectAnimator.ofFloat(view, "scaleY", new float[]{1.0f, 0.6f}).setDuration(800), ObjectAnimator.ofFloat(view, "translationX", new float[]{0.0f, width2}).setDuration(800), ObjectAnimator.ofFloat(view, "translationY", new float[]{0.0f, height2}).setDuration(800)});
                    AnimatorSet animatorSet6 = new AnimatorSet();
                    ObjectAnimator duration = ObjectAnimator.ofFloat(view, "rotation", new float[]{0.0f, 8.0f}).setDuration(120);
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "rotation", new float[]{8.0f, -8.0f}).setDuration(120);
                    ObjectAnimator duration3 = ObjectAnimator.ofFloat(view, "rotation", new float[]{-8.0f, 0.0f}).setDuration(120);
                    animatorSet6.setStartDelay(1000);
                    animatorSet6.playSequentially(new Animator[]{duration, duration2, duration3});
                    AnimatorSet animatorSet7 = new AnimatorSet();
                    animatorSet7.playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "scaleX", new float[]{0.6f, 0.5f}).setDuration(400), ObjectAnimator.ofFloat(view, "scaleY", new float[]{0.6f, 0.5f}).setDuration(400), ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f}).setDuration(400)});
                    animatorSet7.setStartDelay(2200);
                    animatorSet4.playTogether(new Animator[]{animatorSet5, animatorSet6, animatorSet7});
                    AnimatorSet animatorSet8 = new AnimatorSet();
                    animatorSet8.playSequentially(new Animator[]{animatorSet, animatorSet4});
                    animatorSet8.addListener(eVar);
                    topRightBannerWidget.f17618d = animatorSet8;
                    AnimatorSet animatorSet9 = topRightBannerWidget.f17618d;
                    if (animatorSet9 != null) {
                        animatorSet9.start();
                        return;
                    }
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.view.View");
            }
            throw new C52857u("null cannot be cast to non-null type android.view.View");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget$e */
    public static final class C6412e implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ TopRightBannerWidget f17627a;

        public final void onAnimationCancel(Animator animator) {
            C52711k.m112240b(animator, "animation");
        }

        public final void onAnimationRepeat(Animator animator) {
            C52711k.m112240b(animator, "animation");
        }

        public final void onAnimationStart(Animator animator) {
            C52711k.m112240b(animator, "animation");
        }

        C6412e(TopRightBannerWidget topRightBannerWidget) {
            this.f17627a = topRightBannerWidget;
        }

        public final void onAnimationEnd(Animator animator) {
            C52711k.m112240b(animator, "animation");
            TopRightBannerWidget.m13831b(this.f17627a).setVisibility(8);
            TopRightBannerWidget.m13829a(this.f17627a).setVisibility(0);
        }
    }

    public final int getLayoutId() {
        return R.layout.asj;
    }

    public final void onUnload() {
        IMessageManager iMessageManager = this.f17621h;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        LinearLayout linearLayout = this.f17615a;
        if (linearLayout == null) {
            C52711k.m112237a("staticContainer");
        }
        linearLayout.removeView(this.f17620g);
        C4514j.m10883j().mo10322c().mo10494a(this.f17619f);
        m13830a((Animator) this.f17618d);
    }

    /* renamed from: a */
    public static final /* synthetic */ LinearLayout m13829a(TopRightBannerWidget topRightBannerWidget) {
        LinearLayout linearLayout = topRightBannerWidget.f17615a;
        if (linearLayout == null) {
            C52711k.m112237a("staticContainer");
        }
        return linearLayout;
    }

    /* renamed from: b */
    public static final /* synthetic */ ImageView m13831b(TopRightBannerWidget topRightBannerWidget) {
        ImageView imageView = topRightBannerWidget.f17617c;
        if (imageView == null) {
            C52711k.m112237a("mAnimateView");
        }
        return imageView;
    }

    /* renamed from: a */
    static void m13830a(Animator animator) {
        if (animator != null) {
            animator.removeAllListeners();
            animator.end();
        }
    }

    public final void onInit(Object[] objArr) {
        View findViewById = this.contentView.findViewById(R.id.csj);
        C52711k.m112236a((Object) findViewById, "contentView.findViewById(R.id.static_container)");
        this.f17615a = (LinearLayout) findViewById;
        View findViewById2 = this.contentView.findViewById(R.id.axx);
        C52711k.m112236a((Object) findViewById2, "contentView.findViewById(R.id.iv_animation)");
        this.f17617c = (ImageView) findViewById2;
    }

    public final void onLoad(Object[] objArr) {
        Object obj = this.dataCenter.get("data_room", new Room());
        C52711k.m112236a(obj, "dataCenter.get(WidgetConstant.DATA_ROOM, Room())");
        this.f17616b = (Room) obj;
        Object obj2 = this.dataCenter.get("data_is_anchor", Boolean.valueOf(false));
        C52711k.m112236a(obj2, "dataCenter.get(WidgetCon…nt.DATA_IS_ANCHOR, false)");
        this.f17622i = ((Boolean) obj2).booleanValue();
        this.f17621h = (IMessageManager) this.dataCenter.get("data_message_manager");
        IMessageManager iMessageManager = this.f17621h;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C8629a.IN_ROOM_BANNER_MESSAGE.getIntType(), this);
        }
        Long l = null;
        InRoomBannerManager inRoomBannerManager = (InRoomBannerManager) this.dataCenter.get("data_in_room_banner_manager", null);
        if (inRoomBannerManager != null) {
            Room room = (Room) this.dataCenter.get("data_room", null);
            if (room != null) {
                l = Long.valueOf(room.getId());
            }
            C2201v a = inRoomBannerManager.mo10435a(l);
            if (a != null) {
                C4002ac acVar = (C4002ac) a.mo6525a((C2203w<T, ? extends R>) autoDispose());
                if (acVar != null) {
                    acVar.mo9405a((C1710e<? super T>) new C6410c<Object>(this));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo12541a(C5744a aVar) {
        boolean z;
        if (aVar != null) {
            CharSequence charSequence = aVar.f15101a;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                List<C8692a> list = aVar.f15102b;
                if (list != null) {
                    LinearLayout linearLayout = this.f17615a;
                    if (linearLayout == null) {
                        C52711k.m112237a("staticContainer");
                    }
                    linearLayout.removeAllViews();
                    for (C8692a aVar2 : list) {
                        LayoutInflater from = LayoutInflater.from(this.context);
                        LinearLayout linearLayout2 = this.f17615a;
                        if (linearLayout2 == null) {
                            C52711k.m112237a("staticContainer");
                        }
                        View inflate = from.inflate(R.layout.an1, linearLayout2, false);
                        C5213c.m11814a((ImageView) inflate.findViewById(R.id.aqa), aVar2.f23796c);
                        LinearLayout linearLayout3 = this.f17615a;
                        if (linearLayout3 == null) {
                            C52711k.m112237a("staticContainer");
                        }
                        linearLayout3.setVisibility(0);
                        LinearLayout linearLayout4 = this.f17615a;
                        if (linearLayout4 == null) {
                            C52711k.m112237a("staticContainer");
                        }
                        linearLayout4.addView(inflate);
                        inflate.setOnClickListener(new C6409b(aVar2, this));
                        mo12542a(String.valueOf(aVar2.f23794a), "live_banner_show");
                    }
                }
            } else {
                String str = aVar.f15101a;
                C52711k.m112236a((Object) str, "bannerInfo.url");
                C4697b c = C4514j.m10883j().mo10322c();
                Context context = this.context;
                if (context != null) {
                    C4703e a = c.mo10489a((Activity) context, (C4702d) null);
                    this.f17620g = a.f12813a;
                    this.f17619f = a;
                    if (VERSION.SDK_INT <= 19) {
                        WebView webView = this.f17620g;
                        if (webView != null) {
                            webView.setLayerType(1, null);
                        }
                    }
                    WebView webView2 = this.f17620g;
                    if (webView2 != null) {
                        webView2.setBackgroundColor(0);
                    }
                    WebView webView3 = this.f17620g;
                    if (webView3 != null) {
                        webView3.setLayoutParams(new LayoutParams(C3922z.m9899a(64.0f), C3922z.m9899a(64.0f)));
                    }
                    LinearLayout linearLayout5 = this.f17615a;
                    if (linearLayout5 == null) {
                        C52711k.m112237a("staticContainer");
                    }
                    linearLayout5.removeAllViews();
                    LinearLayout linearLayout6 = this.f17615a;
                    if (linearLayout6 == null) {
                        C52711k.m112237a("staticContainer");
                    }
                    linearLayout6.addView(this.f17620g);
                    LinearLayout linearLayout7 = this.f17615a;
                    if (linearLayout7 == null) {
                        C52711k.m112237a("staticContainer");
                    }
                    linearLayout7.setVisibility(0);
                    C4514j.m10883j().mo10322c().mo10495a(this.f17619f, str);
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.app.Activity");
                }
            }
        }
    }

    public final void onMessage(IMessage iMessage) {
        String str;
        if (iMessage instanceof C7816au) {
            C7816au auVar = (C7816au) iMessage;
            if (auVar.f21522b == 2) {
                String a = C4514j.m10883j().mo10320a().mo34886a((C18082l) auVar.f21521a);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", "refresh");
                jSONObject.put("data", a);
                JSONObject jSONObject2 = new JSONObject();
                C8038g a2 = C8049c.m15979a().mo14201a(C8059j.class);
                String str2 = "";
                String str3 = "";
                if (a2 instanceof C8042k) {
                    C8042k kVar = (C8042k) a2;
                    if (kVar.mo14192a().containsKey("enter_from")) {
                        kVar.mo14192a().get("enter_from");
                    }
                    if (kVar.mo14192a().containsKey("source")) {
                        kVar.mo14192a().get("source");
                    }
                    HashMap hashMap = new HashMap();
                    str2 = (String) hashMap.get("enter_from_merge");
                    str3 = (String) hashMap.get("enter_method");
                }
                JSONObject put = jSONObject2.put("enter_from_merge", str2).put("enter_method", str3);
                String str4 = "event_page";
                if (this.f17622i) {
                    str = "live_take_detail";
                } else {
                    str = "live_detail";
                }
                JSONObject put2 = put.put(str4, str);
                String str5 = "room_id";
                Room room = this.f17616b;
                if (room == null) {
                    C52711k.m112237a("room");
                }
                JSONObject put3 = put2.put(str5, String.valueOf(room.getId()));
                String str6 = "anchor_id";
                Room room2 = this.f17616b;
                if (room2 == null) {
                    C52711k.m112237a("room");
                }
                JSONObject put4 = put3.put(str6, String.valueOf(room2.getOwnerUserId()));
                String str7 = "request_id";
                Room room3 = this.f17616b;
                if (room3 == null) {
                    C52711k.m112237a("room");
                }
                JSONObject put5 = put4.put(str7, room3.getRequestId());
                String str8 = "log_pb";
                Room room4 = this.f17616b;
                if (room4 == null) {
                    C52711k.m112237a("room");
                }
                put5.put(str8, room4.getLog_pb());
                jSONObject.put("log", jSONObject2);
                C4703e eVar = this.f17619f;
                if (eVar != null) {
                    eVar.mo10525a("H5_roomStatusChange", jSONObject);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo12542a(String str, String str2) {
        String str3;
        Map hashMap = new HashMap();
        hashMap.put("banner_id", str);
        hashMap.put("request_page", "topright");
        C8049c a = C8049c.m15979a();
        Object[] objArr = new Object[3];
        objArr[0] = Room.class;
        C8059j b = new C8059j().mo14214b("live_function");
        if (this.f17622i) {
            str3 = "live_take_detail";
        } else {
            str3 = "live_detail";
        }
        objArr[1] = b.mo14213a(str3);
        objArr[2] = new C8060k();
        a.mo14202a(str2, hashMap, objArr);
    }
}
