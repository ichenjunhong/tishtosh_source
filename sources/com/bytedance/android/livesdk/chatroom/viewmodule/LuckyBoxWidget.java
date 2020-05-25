package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.C3014m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.chatroom.p325ui.C6118ds;
import com.bytedance.android.livesdk.chatroom.p325ui.C6138eg;
import com.bytedance.android.livesdk.chatroom.presenter.C5821bf;
import com.bytedance.android.livesdk.chatroom.presenter.C5821bf.C5824b;
import com.bytedance.android.livesdk.chatroom.presenter.C5821bf.C5825c;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6597a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d.C6601a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6605h;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6610k;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.message.model.C7833bh;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4574am;
import com.bytedance.android.livesdk.p282ag.p283a.C4627a;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdk.user.C8337i;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.trill.R;
import java.util.Set;
import p064c.p065a.C1673aa;
import p064c.p065a.C1674ab;
import p064c.p065a.C2203w;
import p064c.p065a.p069b.C1690c;

public class LuckyBoxWidget extends LiveRecyclableWidget implements OnDismissListener, OnClickListener, C5824b {

    /* renamed from: a */
    C5821bf f17362a;

    /* renamed from: b */
    public int f17363b;

    /* renamed from: c */
    protected ViewGroup f17364c;

    /* renamed from: d */
    public FrameLayout f17365d;

    /* renamed from: e */
    public Animator f17366e;

    /* renamed from: f */
    public ObjectAnimator f17367f;

    /* renamed from: g */
    public AnimatorSet f17368g;

    /* renamed from: h */
    private boolean f17369h;

    /* renamed from: i */
    private C1690c f17370i;

    /* renamed from: j */
    private boolean f17371j;

    /* renamed from: k */
    private TextView f17372k;

    /* renamed from: l */
    private HSImageView f17373l;

    /* renamed from: m */
    private HSImageView f17374m;

    /* renamed from: n */
    private TextView f17375n;

    /* renamed from: o */
    private View f17376o;

    /* renamed from: p */
    private AnimatorSet f17377p;

    /* renamed from: q */
    private C6138eg f17378q;

    /* renamed from: r */
    private C6118ds f17379r;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LuckyBoxWidget$a */
    class C6351a implements C6601a {
        /* renamed from: a */
        public final void mo8419a(View view, DataCenter dataCenter) {
        }

        /* renamed from: a */
        public final void mo8420a(C6597a aVar) {
        }

        /* renamed from: b */
        public final void mo8421b(View view, DataCenter dataCenter) {
        }

        private C6351a() {
        }

        public final void onClick(View view) {
            LuckyBoxWidget.this.mo11712a();
        }
    }

    /* renamed from: a */
    public final void mo8500a(Throwable th) {
        C6464az.m13908a(this, th);
    }

    /* renamed from: b */
    public final String mo8502b() {
        return C6464az.m13907a(this);
    }

    public int getLayoutId() {
        C8710m mVar = (C8710m) this.dataCenter.get("data_live_mode");
        if (mVar == null || !mVar.isUsingCamera) {
            return R.layout.aql;
        }
        return R.layout.aqn;
    }

    public void onUnload() {
        this.f17362a.mo8247a();
        if (this.f17378q != null) {
            this.f17378q.dismiss();
        }
        if (this.f17379r != null) {
            this.f17379r.dismiss();
        }
        this.contentView.setVisibility(8);
        m13722a((Animator) this.f17377p);
        m13722a(this.f17366e);
        m13722a((Animator) this.f17367f);
        m13722a((Animator) this.f17368g);
        m13723a(this.f17370i);
        this.f17371j = false;
    }

    /* renamed from: a */
    public final void mo11712a() {
        if (!TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
            ((C4002ac) TTLiveSDKContext.getHostService().mo10315h().mo14516a(this.context, C8337i.m16520a().mo14540a(C3922z.m9903a((int) R.string.e6t)).mo14543c("red_envelope").mo14539a(-1).mo14541a()).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6525a((C2203w<T, ? extends R>) autoDispose())).mo9407a((C1674ab<? super T>) new C8335g<C3009i>() {
                public final /* synthetic */ void onNext(Object obj) {
                    super.onNext((C3009i) obj);
                    LuckyBoxWidget.this.mo11712a();
                }
            });
            return;
        }
        Builder buildUpon = Uri.parse("sslocal://webcast_webview").buildUpon();
        Builder buildUpon2 = Uri.parse((String) LiveConfigSettingKeys.SEND_RED_ENVELOPE_URL.mo9431a()).buildUpon();
        Room room = (Room) this.dataCenter.get("data_room");
        if (room != null) {
            if (room.getOwner() != null) {
                buildUpon2.appendQueryParameter("anchor_id", String.valueOf(room.getOwner().getId()));
            }
            buildUpon2.appendQueryParameter("room_id", String.valueOf(room.getId()));
        }
        buildUpon2.appendQueryParameter("is_first_consume", String.valueOf(C4627a.m11090a(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a())));
        Uri build = buildUpon2.build();
        Set<String> queryParameterNames = build.getQueryParameterNames();
        if (queryParameterNames != null) {
            for (String str : queryParameterNames) {
                buildUpon.appendQueryParameter(str, build.getQueryParameter(str));
            }
        }
        buildUpon.appendQueryParameter("url", build.toString());
        C4514j.m10883j().mo10328i().handle(this.context, buildUpon.build().toString());
    }

    /* renamed from: c */
    public final void mo11715c() {
        C7833bh bhVar;
        m13723a(this.f17370i);
        m13722a((Animator) this.f17377p);
        C5825c d = this.f17362a.mo11706d();
        if (d == null) {
            bhVar = null;
        } else {
            bhVar = d.f15284a;
        }
        if (bhVar == null) {
            this.contentView.setVisibility(8);
            return;
        }
        this.contentView.setVisibility(0);
        int b = this.f17362a.mo11703b();
        if (b > 1) {
            this.f17372k.setText(String.valueOf(b));
            this.f17372k.setVisibility(0);
        } else {
            this.f17372k.setVisibility(8);
        }
        if (bhVar.f21614i) {
            this.f17371j = true;
            if (!bhVar.f21628w) {
                mo11714a(bhVar);
            }
        } else {
            this.f17371j = false;
        }
        if (bhVar.f21606a != null) {
            User user = bhVar.f21606a;
            this.f17373l.setVisibility(0);
            C5213c.m11824b(this.f17373l, user.getAvatarThumb());
            C3014m userHonor = user.getUserHonor();
            if (userHonor == null || userHonor.mo8157l() == null) {
                this.f17374m.setVisibility(8);
            } else {
                this.f17374m.setVisibility(0);
                C5213c.m11820a(this.f17374m, userHonor.mo8157l());
            }
        } else {
            this.f17373l.setVisibility(8);
            this.f17374m.setVisibility(8);
        }
        if (d.f15285b == null) {
            this.f17376o.setVisibility(0);
            this.f17373l.setVisibility(8);
            this.f17374m.setVisibility(8);
            this.f17375n.setVisibility(8);
            m13723a(this.f17370i);
            View findViewById = this.contentView.findViewById(R.id.ki);
            m13722a((Animator) this.f17377p);
            if (this.f17377p == null) {
                this.f17377p = new AnimatorSet();
                Animator loadAnimator = AnimatorInflater.loadAnimator(this.context, R.animator.l);
                Animator clone = loadAnimator.clone();
                loadAnimator.setTarget(findViewById);
                clone.setTarget(findViewById);
                clone.setStartDelay(1000);
                this.f17377p.playSequentially(new Animator[]{loadAnimator, clone});
            }
            this.f17377p.start();
            return;
        }
        this.f17376o.setVisibility(8);
        this.f17375n.setVisibility(0);
        this.f17375n.setText(mo12471a(C5821bf.m12695a(d.f15284a) / 1000));
        this.f17370i = ((C4002ac) d.f15285b.mo6525a((C2203w<T, ? extends R>) autoDispose())).mo9406a(new C6545dz(this), C6547ea.f17875a);
    }

    /* renamed from: a */
    private static void m13723a(C1690c cVar) {
        if (cVar != null) {
            cVar.dispose();
        }
    }

    /* renamed from: a */
    public static void m13722a(Animator animator) {
        if (animator != null) {
            animator.removeAllListeners();
            animator.end();
        }
    }

    public void onClick(View view) {
        if (this.f17379r == null) {
            mo11713a(this.f17362a.mo11706d());
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (dialogInterface instanceof C6118ds) {
            this.f17379r = null;
            return;
        }
        if (dialogInterface instanceof C6138eg) {
            this.f17378q = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo12471a(long j) {
        return C4574am.m10978a(j);
    }

    /* renamed from: a */
    public final void mo11713a(C5825c cVar) {
        if (cVar != null) {
            this.f17379r = new C6118ds(this.context, cVar, this.f17362a, this.dataCenter);
            this.f17379r.setOnDismissListener(this);
            this.f17379r.show();
        }
    }

    public void onLoad(Object... objArr) {
        this.f17364c = (ViewGroup) this.contentView.getParent().getParent();
        this.f17369h = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        C6610k.m13985a().mo12668a(C6605h.RED_ENVELOPE, (C6601a) new C6351a());
        this.f17362a.mo8520a((C5824b) this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12472a(Integer num) throws Exception {
        this.f17375n.setText(mo12471a((long) num.intValue()));
    }

    public void onInit(Object... objArr) {
        this.f17362a = new C5821bf();
        this.f17372k = (TextView) this.contentView.findViewById(R.id.dej);
        this.f17373l = (HSImageView) this.contentView.findViewById(R.id.hi);
        this.f17374m = (HSImageView) this.contentView.findViewById(R.id.baa);
        this.f17375n = (TextView) this.contentView.findViewById(R.id.d8x);
        this.f17376o = this.contentView.findViewById(R.id.cft);
        this.contentView.setOnClickListener(new C6544dy(this));
    }

    /* renamed from: a */
    public void mo11714a(C7833bh bhVar) {
        bhVar.f21628w = true;
        if (this.f17365d != null) {
            m13722a(this.f17366e);
            m13722a((Animator) this.f17367f);
            m13722a((Animator) this.f17368g);
            this.f17364c.removeView(this.f17365d);
            this.f17365d = null;
        }
        this.f17365d = (FrameLayout) LayoutInflater.from(this.context).inflate(R.layout.aqo, this.f17364c, false);
        LayoutParams layoutParams = (LayoutParams) this.f17365d.getLayoutParams();
        layoutParams.addRule(13);
        layoutParams.bottomMargin = C3922z.m9899a(30.0f);
        this.f17365d.setLayoutParams(layoutParams);
        final TextView textView = (TextView) this.f17365d.findViewById(R.id.d9g);
        int length = String.valueOf(bhVar.f21612g).length();
        SpannableString spannableString = new SpannableString(this.context.getString(R.string.ezr, new Object[]{Integer.valueOf(bhVar.f21612g)}));
        spannableString.setSpan(new RelativeSizeSpan(1.67f), 0, length, 33);
        textView.setText(spannableString);
        this.f17364c.addView(this.f17365d);
        final ImageView imageView = (ImageView) this.f17365d.findViewById(R.id.hi);
        final View findViewById = this.f17365d.findViewById(R.id.ho);
        final ImageView imageView2 = (ImageView) this.f17365d.findViewById(R.id.baa);
        if (bhVar.f21606a != null) {
            C5213c.m11824b(imageView, bhVar.f21606a.getAvatarThumb());
            C3014m userHonor = bhVar.f21606a.getUserHonor();
            if (userHonor == null || userHonor.mo8160o() == null) {
                imageView2.setImageDrawable(null);
            } else {
                imageView2.setVisibility(0);
                C5213c.m11826b(imageView2, bhVar.f21606a.getUserHonor().mo8160o(), imageView2.getWidth(), imageView2.getHeight(), 0);
            }
        }
        final View findViewById2 = this.f17365d.findViewById(R.id.cz7);
        m13722a(this.f17366e);
        this.f17366e = AnimatorInflater.loadAnimator(this.context, R.animator.k);
        this.f17366e.setTarget(this.f17365d);
        Animator animator = this.f17366e;
        C63482 r6 = new AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                findViewById2.setVisibility(0);
                LuckyBoxWidget.this.f17366e.removeAllListeners();
                LuckyBoxWidget.m13722a((Animator) LuckyBoxWidget.this.f17367f);
                LuckyBoxWidget.this.f17367f = ObjectAnimator.ofFloat(findViewById2, "translationX", new float[]{0.0f, (float) textView.getWidth()});
                LuckyBoxWidget.this.f17367f.setDuration(520);
                LuckyBoxWidget.this.f17367f.addListener(new AnimatorListener() {
                    public final void onAnimationCancel(Animator animator) {
                    }

                    public final void onAnimationRepeat(Animator animator) {
                    }

                    public final void onAnimationStart(Animator animator) {
                    }

                    public final void onAnimationEnd(Animator animator) {
                        LuckyBoxWidget.this.f17367f.removeAllListeners();
                        findViewById2.setVisibility(8);
                        View findViewById = LuckyBoxWidget.this.contentView.findViewById(R.id.ki);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(LuckyBoxWidget.this.f17365d, "rotation", new float[]{0.0f, 720.0f});
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(LuckyBoxWidget.this.f17365d, "translationX", new float[]{0.0f, ((findViewById.getX() + ((View) LuckyBoxWidget.this.contentView.getParent()).getX()) - LuckyBoxWidget.this.f17365d.getX()) - (((float) LuckyBoxWidget.this.f17365d.getMeasuredWidth()) * 0.4f)});
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(LuckyBoxWidget.this.f17365d, "translationY", new float[]{0.0f, (((findViewById.getY() + ((View) LuckyBoxWidget.this.contentView.getParent()).getY()) - LuckyBoxWidget.this.f17365d.getY()) - (((float) LuckyBoxWidget.this.f17365d.getMeasuredHeight()) * 0.4f)) + ((float) LuckyBoxWidget.this.f17363b)});
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(LuckyBoxWidget.this.f17365d, "scaleX", new float[]{1.0f, 0.2f});
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(LuckyBoxWidget.this.f17365d, "scaleY", new float[]{1.0f, 0.2f});
                        ofFloat.setDuration(520);
                        ofFloat2.setDuration(520);
                        ofFloat2.setDuration(520);
                        ofFloat4.setDuration(520);
                        ofFloat5.setDuration(520);
                        LuckyBoxWidget.this.f17365d.postDelayed(new C6548eb(imageView, imageView2, findViewById, textView), 500);
                        LuckyBoxWidget.m13722a((Animator) LuckyBoxWidget.this.f17368g);
                        LuckyBoxWidget.this.f17368g = new AnimatorSet();
                        LuckyBoxWidget.this.f17368g.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5});
                        LuckyBoxWidget.this.f17368g.setStartDelay(500);
                        LuckyBoxWidget.this.f17368g.addListener(new AnimatorListener() {
                            public final void onAnimationCancel(Animator animator) {
                            }

                            public final void onAnimationRepeat(Animator animator) {
                            }

                            public final void onAnimationStart(Animator animator) {
                            }

                            public final void onAnimationEnd(Animator animator) {
                                LuckyBoxWidget.this.f17368g.removeAllListeners();
                                LuckyBoxWidget.this.f17364c.removeView(LuckyBoxWidget.this.f17365d);
                                LuckyBoxWidget.this.f17365d = null;
                            }
                        });
                        LuckyBoxWidget.this.f17368g.start();
                    }
                });
                LuckyBoxWidget.this.f17367f.start();
            }
        };
        animator.addListener(r6);
        this.f17366e.start();
    }
}
