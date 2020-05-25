package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.ContentValues;
import android.content.Context;
import android.support.p030v4.widget.C1115o;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.p702im.core.p705b.C11176d;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.framework.services.IFollowService.IFollowCallback;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.UserExtra;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34550g;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1842a.C34381b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1843b.C34385c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34388c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35221bc;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.services.FollowService;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.C53755c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.g */
public final class C33465g {

    /* renamed from: a */
    public int f86730a = 120;

    /* renamed from: b */
    public String f86731b = "";

    /* renamed from: c */
    String f86732c = "";

    /* renamed from: d */
    public int f86733d = 8;

    /* renamed from: e */
    public View f86734e;

    /* renamed from: f */
    public View f86735f;

    /* renamed from: g */
    public TextView f86736g;

    /* renamed from: h */
    public IMUser f86737h;

    /* renamed from: i */
    public String f86738i;

    /* renamed from: j */
    public boolean f86739j;

    /* renamed from: k */
    public int f86740k;

    /* renamed from: l */
    private OnClickListener f86741l;

    /* renamed from: m */
    private View f86742m;

    /* renamed from: a */
    public final void mo70870a(int i) {
        if (i != 1 || !C34004b.m77717a().mo71949f().needFollowToFollowBack()) {
            this.f86736g.setText(R.string.bhd);
            return;
        }
        this.f86736g.setText(R.string.gfm);
        C1115o.m3260b(this.f86736g, 1);
    }

    /* renamed from: b */
    public final void mo70872b(int i) {
        if (this.f86733d != i) {
            this.f86733d = i;
            if (i == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, (float) this.f86730a});
                ofFloat.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        int i = (int) floatValue;
                        C33465g.this.f86740k = i;
                        C33465g.this.f86734e.getLayoutParams().height = i;
                        C33465g.this.f86734e.setAlpha(floatValue / ((float) C33465g.this.f86730a));
                        C33465g.this.f86734e.requestLayout();
                    }
                });
                ofFloat.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationStart(Animator animator) {
                        super.onAnimationStart(animator);
                        C33465g.this.f86734e.setAlpha(0.0f);
                        C33465g.this.f86734e.setVisibility(0);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        C33465g.this.f86740k = C33465g.this.f86730a;
                        C33465g.this.f86734e.setAlpha(1.0f);
                        C33465g.this.f86734e.getLayoutParams().height = C33465g.this.f86730a;
                        C33465g.this.f86734e.requestLayout();
                    }
                });
                ofFloat.start();
                return;
            }
            if (i == 8) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{(float) this.f86730a, 0.0f});
                ofFloat2.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        int i = (int) floatValue;
                        C33465g.this.f86740k = i;
                        C33465g.this.f86734e.getLayoutParams().height = i;
                        C33465g.this.f86734e.setAlpha(floatValue / ((float) C33465g.this.f86730a));
                        C33465g.this.f86734e.requestLayout();
                    }
                });
                ofFloat2.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationStart(Animator animator) {
                        super.onAnimationStart(animator);
                        C33465g.this.f86734e.setAlpha(1.0f);
                        C33465g.this.f86734e.setVisibility(0);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        C33465g.this.f86734e.setAlpha(0.0f);
                        C33465g.this.f86734e.getLayoutParams().height = 0;
                        C33465g.this.f86740k = 0;
                        C33465g.this.f86734e.setVisibility(8);
                    }
                });
                ofFloat2.start();
            }
        }
    }

    /* renamed from: a */
    public final void mo70871a(String str, String str2) {
        if (str != null) {
            this.f86731b = str;
        }
        if (str2 != null) {
            this.f86732c = str2;
        }
        this.f86736g.setText(R.string.bhd);
    }

    public C33465g(View view, IMUser iMUser) {
        this.f86742m = view;
        this.f86730a = (int) C9432q.m18687b(this.f86742m.getContext(), 60.0f);
        this.f86734e = this.f86742m.findViewById(R.id.ai_);
        this.f86736g = (TextView) this.f86734e.findViewById(R.id.ai1);
        this.f86735f = this.f86734e.findViewById(R.id.un);
        if (this.f86741l == null) {
            this.f86741l = new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (view.equals(C33465g.this.f86736g)) {
                        C33465g gVar = C33465g.this;
                        if (gVar.f86731b == null) {
                            gVar.f86731b = "";
                        }
                        if (gVar.f86732c == null) {
                            gVar.f86732c = "";
                        }
                        if (gVar.f86739j) {
                            C35190af.m79442a();
                            String str = gVar.f86738i;
                            HashMap hashMap = new HashMap();
                            hashMap.put("enter_from", "chat");
                            hashMap.put("previous_page", "token");
                            hashMap.put("from_user_id", str);
                            hashMap.put("previous_page_position", "other_places");
                            hashMap.put("enter_method", "follow_button");
                            C26890h.m65011a("follow", (Map<String, String>) hashMap);
                        } else {
                            C35190af.m79442a();
                            String str2 = gVar.f86731b;
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("enter_from", "chat");
                            hashMap2.put("previous_page", "message");
                            hashMap2.put("from_user_id", str2);
                            hashMap2.put("previous_page_position", "other_places");
                            hashMap2.put("enter_method", "follow_button");
                            C26890h.m65011a("follow", (Map<String, String>) hashMap2);
                        }
                        FollowService.createIFollowServicebyMonsterPlugin().sendRequest(gVar.f86731b, gVar.f86732c, 1, new IFollowCallback() {
                            public final void onFollowSuccess() {
                                C18842a.m45934b(new Runnable() {
                                    public final void run() {
                                        C33465g.this.f86736g.setText(R.string.bhh);
                                        C33465g.this.mo70872b(8);
                                        C53755c.m114319a().mo112960d(new C34550g(C33465g.this.f86731b));
                                    }
                                });
                            }

                            public final void onFollowFailed(Exception exc) {
                                Context context = C33465g.this.f86734e.getContext();
                                String string = context.getString(R.string.bh3);
                                if (!C33473h.m76697a(C33465g.this.f86734e.getContext())) {
                                    string = context.getString(R.string.cg1);
                                } else if (exc instanceof C23459a) {
                                    C23459a aVar = (C23459a) exc;
                                    if (!TextUtils.isEmpty(aVar.getErrorMsg())) {
                                        string = aVar.getErrorMsg();
                                    }
                                }
                                C9432q.m18676a(C33465g.this.f86734e.getContext(), string);
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("service", "follow_failed");
                                    jSONObject.put("error", exc.toString());
                                    C11176d.m22636a("chat_room", "follow_failed", jSONObject);
                                } catch (JSONException unused) {
                                }
                            }
                        });
                        return;
                    }
                    if (view.equals(C33465g.this.f86735f)) {
                        UserExtra userExtra = new UserExtra(C33465g.this.f86737h.getUid(), true, false);
                        C34388c.m78316a();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(C34385c.COLUMN_UID.key, userExtra.getUid());
                        contentValues.put(C34385c.COLUMN_IS_DISABLE_SHOW_FOLLOW_BAR.key, Integer.valueOf(userExtra.getIsDisableShowFollowBar() ? 1 : 0));
                        contentValues.put(C34385c.COLUMN_IS_SAY_HELLO_LOGGER.key, Integer.valueOf(userExtra.getIsSayHelloLogger() ? 1 : 0));
                        int i = (C34381b.m78276a().mo72381a("USER_EXTRA", (String) null, contentValues) > 0 ? 1 : (C34381b.m78276a().mo72381a("USER_EXTRA", (String) null, contentValues) == 0 ? 0 : -1));
                        C33465g.this.mo70872b(8);
                    }
                }
            };
        }
        this.f86736g.setOnClickListener(this.f86741l);
        this.f86735f.setOnClickListener(this.f86741l);
        C35221bc.m79614a(this.f86736g);
        this.f86737h = iMUser;
        if (iMUser.getFollowerStatus() == 1 && C34004b.m77717a().mo71949f().needFollowToFollowBack()) {
            this.f86736g.setText(R.string.gfm);
            C1115o.m3260b(this.f86736g, 1);
        }
    }
}
