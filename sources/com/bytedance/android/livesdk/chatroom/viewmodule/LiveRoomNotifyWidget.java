package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.live.room.p254a.C4180a;
import com.bytedance.android.live.uikit.p257c.C4206c;
import com.bytedance.android.live.uikit.rtl.AutoRTLImageView;
import com.bytedance.android.livesdk.chatroom.event.C5197p;
import com.bytedance.android.livesdk.chatroom.event.C5198q;
import com.bytedance.android.livesdk.chatroom.p306bl.C5007d;
import com.bytedance.android.livesdk.chatroom.p309e.C5115z;
import com.bytedance.android.livesdk.i18n.C7676b;
import com.bytedance.android.livesdk.message.model.C7865cf;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.rank.C8123a;
import com.bytedance.android.livesdk.widget.LiveVerticalViewPager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C8851g;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;

public class LiveRoomNotifyWidget extends LiveRecyclableWidget implements C9382a {

    /* renamed from: a */
    public View f17267a;

    /* renamed from: b */
    public AutoRTLImageView f17268b;

    /* renamed from: c */
    public TextView f17269c;

    /* renamed from: d */
    public C9381g f17270d;

    /* renamed from: e */
    public int f17271e;

    /* renamed from: f */
    public AnimatorSet f17272f;

    /* renamed from: g */
    public AnimatorSet f17273g;

    /* renamed from: h */
    public boolean f17274h;

    /* renamed from: i */
    public long f17275i = 2000;

    /* renamed from: j */
    public int f17276j;

    /* renamed from: k */
    public LiveVerticalViewPager f17277k;

    /* renamed from: l */
    private Room f17278l;

    /* renamed from: m */
    private C1689b f17279m;

    /* renamed from: n */
    private C6318a f17280n;

    /* renamed from: o */
    private View f17281o;

    /* renamed from: p */
    private int f17282p = 4;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LiveRoomNotifyWidget$a */
    class C6318a implements OnTouchListener {

        /* renamed from: a */
        int[] f17288a;

        /* renamed from: b */
        ValueAnimator f17289b;

        /* renamed from: c */
        ValueAnimator f17290c;

        /* renamed from: d */
        final /* synthetic */ LiveRoomNotifyWidget f17291d;

        /* renamed from: e */
        private int f17292e;

        /* renamed from: f */
        private int f17293f;

        /* renamed from: g */
        private int f17294g;

        /* renamed from: h */
        private int f17295h;

        /* renamed from: i */
        private float f17296i;

        /* renamed from: j */
        private boolean f17297j;

        /* renamed from: k */
        private VelocityTracker f17298k;

        /* renamed from: l */
        private boolean f17299l;

        /* renamed from: m */
        private int f17300m;

        /* renamed from: n */
        private int f17301n;

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            switch (motionEvent.getAction()) {
                case 0:
                    if (this.f17291d.f17277k != null) {
                        this.f17291d.f17277k.setEnabled(false);
                    }
                    this.f17299l = false;
                    this.f17292e = rawX;
                    this.f17293f = rawY;
                    this.f17294g = this.f17292e;
                    this.f17295h = this.f17293f;
                    this.f17296i = (float) ViewConfiguration.get(this.f17291d.getContext()).getScaledTouchSlop();
                    this.f17297j = true;
                    if (this.f17300m <= 0) {
                        int[] iArr = new int[2];
                        this.f17291d.containerView.getLocationOnScreen(iArr);
                        this.f17300m = iArr[1] >> 1;
                        this.f17301n = ((this.f17291d.f17276j - iArr[1]) - this.f17291d.containerView.getHeight()) - 5;
                        break;
                    }
                    break;
                case 1:
                case 3:
                    if (this.f17298k == null) {
                        this.f17298k = VelocityTracker.obtain();
                    }
                    this.f17298k.addMovement(motionEvent);
                    VelocityTracker velocityTracker = this.f17298k;
                    velocityTracker.computeCurrentVelocity(1000);
                    float yVelocity = velocityTracker.getYVelocity();
                    this.f17291d.containerView.getLocationOnScreen(this.f17288a);
                    if (yVelocity > 1000.0f || this.f17300m > this.f17288a[1]) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f17299l = z;
                    if (!this.f17299l && this.f17297j && ((float) Math.abs(rawX - this.f17292e)) < this.f17296i && ((float) Math.abs(rawY - this.f17293f)) < this.f17296i) {
                        this.f17291d.f17267a.performClick();
                    }
                    if (this.f17291d.f17277k != null) {
                        this.f17291d.f17277k.setEnabled(true);
                    }
                    if (!this.f17299l) {
                        final MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f17291d.containerView.getLayoutParams();
                        this.f17290c = ValueAnimator.ofInt(new int[]{marginLayoutParams.topMargin, this.f17291d.f17276j});
                        this.f17290c.addUpdateListener(new AnimatorUpdateListener() {
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                Object animatedValue = valueAnimator.getAnimatedValue();
                                if ((animatedValue instanceof Integer) && C6318a.this.f17291d.containerView != null) {
                                    marginLayoutParams.topMargin = ((Integer) animatedValue).intValue();
                                    C6318a.this.f17291d.containerView.setLayoutParams(marginLayoutParams);
                                }
                            }
                        });
                        this.f17290c.setInterpolator(new DecelerateInterpolator());
                        this.f17290c.setDuration(400);
                        this.f17290c.start();
                        break;
                    } else {
                        final MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) this.f17291d.containerView.getLayoutParams();
                        this.f17289b = ValueAnimator.ofInt(new int[]{marginLayoutParams2.topMargin, this.f17301n});
                        this.f17289b.setDuration(400);
                        this.f17289b.setInterpolator(new DecelerateInterpolator());
                        this.f17289b.addListener(new AnimatorListenerAdapter() {
                            public final void onAnimationEnd(Animator animator) {
                                super.onAnimationEnd(animator);
                                C9432q.m18691b(C6318a.this.f17291d.f17267a, 8);
                                C9432q.m18680a((View) C6318a.this.f17291d.containerView, -3, C6318a.this.f17291d.f17276j, -3, -3);
                                C5007d.INSTANCE.onMessageFinish();
                            }

                            public final void onAnimationStart(Animator animator) {
                                super.onAnimationStart(animator);
                                if (C6318a.this.f17291d.f17272f != null) {
                                    C6318a.this.f17291d.f17272f.cancel();
                                }
                                if (C6318a.this.f17291d.f17273g != null) {
                                    C6318a.this.f17291d.f17273g.cancel();
                                }
                            }
                        });
                        this.f17289b.addUpdateListener(new AnimatorUpdateListener() {
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                Object animatedValue = valueAnimator.getAnimatedValue();
                                if ((animatedValue instanceof Integer) && C6318a.this.f17291d.containerView != null) {
                                    marginLayoutParams2.topMargin = ((Integer) animatedValue).intValue();
                                    C6318a.this.f17291d.containerView.setLayoutParams(marginLayoutParams2);
                                }
                            }
                        });
                        this.f17289b.start();
                        break;
                    }
                case 2:
                    int i = rawX - this.f17294g;
                    int i2 = rawY - this.f17295h;
                    LayoutParams layoutParams = this.f17291d.containerView.getLayoutParams();
                    if (layoutParams instanceof RelativeLayout.LayoutParams) {
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                        int i3 = layoutParams2.topMargin + i2;
                        if (i3 > this.f17291d.f17276j) {
                            i3 = this.f17291d.f17276j;
                        }
                        layoutParams2.topMargin = i3;
                        this.f17291d.containerView.setLayoutParams(layoutParams2);
                    }
                    int abs = Math.abs(i);
                    int abs2 = Math.abs(i2);
                    if (((float) abs) > this.f17296i || ((float) abs2) > this.f17296i) {
                        this.f17297j = false;
                    }
                    this.f17294g = rawX;
                    this.f17295h = rawY;
                    break;
                default:
                    if (this.f17291d.f17277k != null) {
                        this.f17291d.f17277k.setEnabled(true);
                        break;
                    }
                    break;
            }
            return true;
        }
    }

    public int getLayoutId() {
        return R.layout.ao2;
    }

    public void handleMsg(Message message) {
    }

    public void onUnload() {
        this.contentView.setVisibility(8);
        this.f17270d.removeCallbacksAndMessages(null);
        this.f17272f.cancel();
        this.f17273g.cancel();
        if (this.f17279m != null) {
            this.f17279m.dispose();
        }
        if (this.f17280n != null) {
            C6318a aVar = this.f17280n;
            if (aVar.f17290c != null) {
                aVar.f17290c.cancel();
            }
            if (aVar.f17289b != null) {
                aVar.f17289b.cancel();
            }
        }
    }

    /* renamed from: a */
    private void m13698a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason", "unrecognised schema");
            jSONObject.put("schema", str);
            C8068g.m16014a(this.context);
        } catch (JSONException unused) {
        }
    }

    public void onLoad(Object... objArr) {
        this.f17278l = (Room) this.dataCenter.get("data_room");
        if (!((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue()) {
            LayoutParams layoutParams = this.f17267a.getLayoutParams();
            layoutParams.width = C3922z.m9899a(400.0f);
            this.f17267a.setLayoutParams(layoutParams);
        }
        this.f17279m = new C1689b();
        this.f17279m.mo6181a(C4495a.m10823a().mo10300a(C5198q.class).mo6545f((C1710e<? super T>) new C1710e<C5198q>() {
            public final /* synthetic */ void accept(Object obj) throws Exception {
                C5198q qVar = (C5198q) obj;
                if (qVar != null && qVar.f13912a != null) {
                    C5197p pVar = qVar.f13912a;
                    if (pVar.f13910c == null) {
                        pVar.f13910c = new Bundle();
                    }
                    pVar.f13910c.putInt("back_source", 1);
                    C8123a.m16197b(LiveRoomNotifyWidget.this.dataCenter, pVar.f13910c);
                    C4495a.m10823a().mo10301a((Object) new C5197p(pVar.f13908a, "live_detail", pVar.f13910c));
                }
            }
        }));
        C9432q.m18691b(this.f17281o, 8);
        if (this.dataCenter != null) {
            Room room = (Room) this.dataCenter.get("data_room");
            if (room != null && room.isKoiRoom()) {
                this.f17282p = 25;
                C9432q.m18680a((View) this.containerView, -3, (int) C9432q.m18687b(this.context, (float) this.f17282p), -3, -3);
                if (this.containerView != null && (this.containerView.getLayoutParams() instanceof MarginLayoutParams)) {
                    this.f17276j = ((MarginLayoutParams) this.containerView.getLayoutParams()).topMargin;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo12445a(C7865cf cfVar) {
        long j;
        C7865cf cfVar2 = cfVar;
        if (cfVar2 != null && cfVar2.f21764d != null) {
            String str = cfVar2.f21764d;
            User user = cfVar2.f21766f;
            long j2 = cfVar2.baseMessage.f24133d;
            if (cfVar.supportDisplayText()) {
                C8851g gVar = cfVar2.baseMessage.f24139j;
                String str2 = null;
                String str3 = gVar.f24156b;
                if (!TextUtils.isEmpty(gVar.f24155a)) {
                    str2 = C7676b.m15696a().mo14036a(gVar.f24155a);
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = str3;
                }
                this.f17269c.setText(C5115z.m11758a(str2, gVar));
            } else if (!(cfVar2.f21765e == null || cfVar2.f21765e.f21424c == null)) {
                this.f17269c.setText(cfVar2.f21765e.f21424c.mo11639a());
            }
            try {
                j = Long.parseLong(Uri.parse(str).getQueryParameter("room_id"));
            } catch (NumberFormatException unused) {
                j = 0;
            }
            long j3 = j;
            int i = cfVar2.f21763c;
            String str4 = str;
            User user2 = user;
            long j4 = j3;
            C6527dh dhVar = r0;
            long j5 = j2;
            View view = this.f17267a;
            int i2 = i;
            int i3 = i;
            C7865cf cfVar3 = cfVar;
            C6527dh dhVar2 = new C6527dh(this, str4, user2, j5, i2, cfVar3);
            view.setOnClickListener(dhVar);
            TextView textView = this.f17269c;
            C6528di diVar = new C6528di(this, str4, user2, j5, i3, cfVar3);
            textView.setOnClickListener(diVar);
            if (cfVar2.f21765e != null) {
                this.f17275i = cfVar2.f21765e.f21425d * 1000;
            }
            this.f17272f.start();
            HashMap hashMap = new HashMap();
            hashMap.put("room_id", String.valueOf(j4));
            hashMap.put(CustomActionPushReceiver.f104056a, String.valueOf(i3));
            hashMap.put("enter_from_merge", "live_detail");
            hashMap.put("enter_method", "top_message");
            hashMap.put("top_message_type", "gift");
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("gift_id");
            if (!C9431p.m18664a(queryParameter)) {
                hashMap.put("gift_id", queryParameter);
            }
            String queryParameter2 = parse.getQueryParameter("anchor_id");
            if (!C9431p.m18664a(queryParameter2)) {
                hashMap.put("anchor_id", queryParameter2);
            }
            C8049c.m15979a().mo14202a("live_show", hashMap, new C8059j().mo14214b("live_view").mo14213a("live_detail").mo14215c("top_message").mo14219g("click").mo14218f("core"), Room.class);
            mo12446a(cfVar2, "show");
        }
    }

    public void onInit(Object... objArr) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        this.f17274h = "huawei&honor".contains(Build.BRAND.toLowerCase());
        this.f17267a = this.contentView;
        this.f17268b = (AutoRTLImageView) this.contentView.findViewById(R.id.iz);
        this.f17269c = (TextView) this.contentView.findViewById(R.id.bu3);
        this.f17281o = this.contentView.findViewById(R.id.ccc);
        if (C4206c.m10426a(this.context) && this.f17274h) {
            this.f17269c = (TextView) this.contentView.findViewById(R.id.bu4);
            this.f17269c.setGravity(8388613);
        } else if (!C4206c.m10426a(this.context) && VERSION.SDK_INT >= 17) {
            this.f17269c.setTextDirection(3);
        }
        this.f17271e = C9432q.m18670a(this.context);
        this.f17270d = new C9381g(this);
        if (!C4206c.m10426a(this.context) || this.f17274h) {
            objectAnimator = ObjectAnimator.ofFloat(this.f17267a, "translationX", new float[]{(float) this.f17271e, 0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(this.f17267a, "translationX", new float[]{(float) (-this.f17271e), 0.0f});
        }
        objectAnimator.setDuration(1000);
        if (!C4206c.m10426a(this.context) || this.f17274h) {
            objectAnimator2 = ObjectAnimator.ofFloat(this.f17267a, "translationX", new float[]{0.0f, (float) (-this.f17271e)});
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(this.f17267a, "translationX", new float[]{0.0f, (float) this.f17271e});
        }
        this.f17272f = new AnimatorSet();
        this.f17273g = new AnimatorSet();
        this.f17272f.playSequentially(new Animator[]{objectAnimator});
        this.f17273g.playSequentially(new Animator[]{objectAnimator2});
        this.f17272f.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                LiveRoomNotifyWidget.this.f17267a.setVisibility(0);
            }

            public final void onAnimationEnd(Animator animator) {
                int i;
                long j;
                if (LiveRoomNotifyWidget.this.isViewValid() && LiveRoomNotifyWidget.this.f17270d != null) {
                    boolean z = false;
                    if (LiveRoomNotifyWidget.this.f17269c.getLayout() != null) {
                        i = ((int) LiveRoomNotifyWidget.this.f17269c.getLayout().getLineWidth(0)) - ((LiveRoomNotifyWidget.this.f17269c.getWidth() - LiveRoomNotifyWidget.this.f17269c.getCompoundPaddingRight()) - LiveRoomNotifyWidget.this.f17269c.getCompoundPaddingLeft());
                        if (i > 0) {
                            z = true;
                        }
                    } else {
                        i = 0;
                    }
                    if (!z) {
                        View view = LiveRoomNotifyWidget.this.contentView;
                        C6529dj djVar = new C6529dj(this);
                        if (LiveRoomNotifyWidget.this.f17275i > 0) {
                            j = LiveRoomNotifyWidget.this.f17275i;
                        } else {
                            j = 2000;
                        }
                        view.postDelayed(djVar, j);
                        return;
                    }
                    LiveRoomNotifyWidget.this.contentView.postDelayed(new C6530dk(this, i), 500);
                }
            }
        });
        this.f17273g.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                LiveRoomNotifyWidget.this.f17267a.setVisibility(8);
                C5007d.INSTANCE.onMessageFinish();
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12446a(C7865cf cfVar, String str) {
        HashMap hashMap = new HashMap(7);
        if (this.f17278l != null) {
            hashMap.put("room_id", this.f17278l.getIdStr());
            hashMap.put("anchor_id", String.valueOf(this.f17278l.getOwnerUserId()));
        }
        if (cfVar != null) {
            String str2 = "";
            int i = (int) cfVar.f21762b;
            if (i != 10) {
                switch (i) {
                    case 1:
                        str2 = "gift";
                        break;
                    case 2:
                        str2 = "notice";
                        break;
                    case 3:
                        str2 = "activity";
                        break;
                    case 4:
                        str2 = "fans_club";
                        break;
                    case 5:
                        str2 = "prop";
                        break;
                    case 6:
                        str2 = "warden_buy";
                        break;
                }
            } else {
                str2 = "vehicle";
            }
            hashMap.put(CustomActionPushReceiver.f104056a, str2);
            try {
                Uri parse = Uri.parse(cfVar.f21764d);
                hashMap.put("to_room_id", parse.getQueryParameter("room_id"));
                hashMap.put("to_anchor_id", parse.getQueryParameter("user_id"));
                hashMap.put("present_id", parse.getQueryParameter("gift_id"));
            } catch (Exception unused) {
            }
        }
        hashMap.put("action_type", str);
        C8049c.m15979a().mo14202a("livesdk_top_message", hashMap, new Object[0]);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12447a(String str, User user, long j, int i) {
        String str2;
        boolean z;
        if (TextUtils.isEmpty(str)) {
            m13698a(str);
            return;
        }
        Uri parse = Uri.parse(str);
        if (parse.getQuery() == null) {
            StringBuilder sb = new StringBuilder("enter_from_widget=notify&msg_type=");
            sb.append(i);
            str2 = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("&enter_from_widget=notify&msg_type=");
            sb2.append(i);
            str2 = sb2.toString();
        }
        if (parse == null || TextUtils.isEmpty(parse.getQueryParameter("gift_id"))) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append("&enter_live_source=top_message&enter_from_v3=live_detail&enter_from_module=top_message&top_message_type=gift");
            str2 = sb3.toString();
            ((C4193l) C4116c.m10249a(C4193l.class)).setCrossRoomGift(new C4180a(str2, user, j));
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str2);
        sb4.append("&back_room=false");
        String sb5 = sb4.toString();
        if (!C4514j.m10883j().mo10328i().handle(this.context, sb5)) {
            m13698a(sb5);
        }
    }
}
