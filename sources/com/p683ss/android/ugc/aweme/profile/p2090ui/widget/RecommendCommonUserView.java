package com.p683ss.android.ugc.aweme.profile.p2090ui.widget;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p043v7.widget.C1440au;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1593e.C26872d;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.experiment.RecommendSuperAccountExperiment;
import com.p683ss.android.ugc.aweme.friends.adapter.C32528d;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40438j.C40442a;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40438j.C40443b;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40448l.C40450b;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import com.p683ss.android.ugc.aweme.setting.p2148ui.PrivacyActivity;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendCommonUserView */
public class RecommendCommonUserView extends RelativeLayout implements OnClickListener {

    /* renamed from: a */
    View f103170a;

    /* renamed from: b */
    View f103171b;

    /* renamed from: c */
    View f103172c;

    /* renamed from: d */
    TextView f103173d;

    /* renamed from: e */
    public RecyclerView f103174e;

    /* renamed from: f */
    TextView f103175f;

    /* renamed from: g */
    public C40418a f103176g;

    /* renamed from: h */
    public String f103177h;

    /* renamed from: i */
    public boolean f103178i;

    /* renamed from: j */
    private ViewStub f103179j;

    /* renamed from: k */
    private View f103180k;

    /* renamed from: l */
    private View f103181l;

    /* renamed from: m */
    private View f103182m;

    /* renamed from: n */
    private View f103183n;

    /* renamed from: o */
    private View f103184o;

    /* renamed from: p */
    private View f103185p;

    /* renamed from: q */
    private C40438j f103186q;

    /* renamed from: r */
    private boolean f103187r = true;

    /* renamed from: s */
    private int f103188s;

    /* renamed from: t */
    private List<User> f103189t;

    /* renamed from: u */
    private int f103190u;

    /* renamed from: v */
    private C40433h f103191v = new C40433h(this);

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendCommonUserView$a */
    public interface C40418a {
        /* renamed from: a */
        void mo60649a(String str, boolean z);
    }

    public Map<String, Integer> getPosInApiListMap() {
        return getAdapter().f103243g;
    }

    private C40438j getAdapter() {
        if (this.f103186q == null) {
            this.f103186q = new C40438j();
        }
        return this.f103186q;
    }

    public List<User> getData() {
        if (this.f103189t == null) {
            this.f103189t = new ArrayList();
        }
        return this.f103189t;
    }

    public void setOnLookMoreUserListener(C40418a aVar) {
        this.f103176g = aVar;
    }

    public void setOnItemOperationListener(C40443b bVar) {
        getAdapter().f103238b = bVar;
    }

    public void setOnViewAttachedToWindowListener(C26872d<C40448l> dVar) {
        getAdapter().f103240d = dVar;
    }

    /* renamed from: a */
    private void m89822a(boolean z) {
        this.f103184o.setVisibility(0);
        this.f103183n.setVisibility(8);
    }

    public void setReminderText(int i) {
        if (this.f103173d != null) {
            this.f103173d.setText(i);
        }
    }

    public RecommendCommonUserView(Context context) {
        super(context);
        m89821a(context);
    }

    /* renamed from: a */
    private void m89821a(Context context) {
        this.f103179j = new ViewStub(context);
        this.f103179j.setLayoutResource(R.layout.avh);
        this.f103179j.setInflatedId(R.id.b94);
        addView(this.f103179j);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        ViewParent parent = getParent();
        if (parent != null) {
            if (!(parent instanceof RecyclerView)) {
                z = true;
            } else {
                z = false;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setBackgroundResource(int i) {
        m89823b(getContext());
        findViewById(R.id.b94).setBackgroundResource(i);
    }

    public void setShowLookMore(boolean z) {
        int i;
        m89823b(getContext());
        this.f103187r = z;
        View view = this.f103181l;
        int i2 = 4;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        view.setVisibility(i);
        View view2 = this.f103182m;
        if (z) {
            i2 = 0;
        }
        view2.setVisibility(i2);
        getAdapter().mo54798c(z);
    }

    private void setFindMoreLayout(List<User> list) {
        if (list.size() <= 3) {
            findViewById(R.id.aft).setVisibility(8);
            return;
        }
        AvatarImageView avatarImageView = (AvatarImageView) this.f103171b.findViewById(R.id.afr);
        AvatarImageView avatarImageView2 = (AvatarImageView) this.f103171b.findViewById(R.id.afs);
        C23515d.m57669a((RemoteImageView) (AvatarImageView) this.f103171b.findViewById(R.id.afq), ((User) list.get(3)).getAvatarThumb());
        if (list.size() >= 5) {
            C23515d.m57669a((RemoteImageView) avatarImageView, ((User) list.get(4)).getAvatarThumb());
            if (list.size() >= 6) {
                C23515d.m57669a((RemoteImageView) avatarImageView2, ((User) list.get(5)).getAvatarThumb());
            } else {
                avatarImageView2.setVisibility(8);
            }
        } else {
            avatarImageView.setVisibility(8);
            avatarImageView2.setVisibility(8);
        }
    }

    public void setPageType(int i) {
        this.f103188s = i;
        getAdapter().f103242f = i;
        C40433h hVar = this.f103191v;
        if (i == 1 || i == 2) {
            C41589c.m91432a();
            C41589c.m91434f();
        }
        hVar.f103221a.f103170a.setVisibility(0);
        hVar.f103221a.f103171b.setVisibility(8);
        if (i == 0) {
            hVar.f103221a.f103170a.setVisibility(8);
            hVar.f103221a.f103171b.setVisibility(8);
            hVar.f103221a.f103175f.setVisibility(8);
            hVar.f103221a.f103172c.setVisibility(8);
            hVar.f103221a.f103173d.setText(R.string.czm);
            hVar.f103221a.setShowLookMore(false);
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view.getId() == R.id.bjk && this.f103187r && this.f103176g != null) {
            this.f103176g.mo60649a(this.f103177h, true);
        }
        if (view.getId() == R.id.afv && this.f103176g != null) {
            this.f103176g.mo60649a(this.f103177h, true);
        }
        if (view.getId() == R.id.c4y) {
            HashMap hashMap = new HashMap();
            if (this.f103188s == 1) {
                hashMap.put("enter_from", "homepage_follow");
            } else if (this.f103188s == 2) {
                hashMap.put("enter_from", "homepage_friends");
            } else {
                hashMap.put("enter_from", "others_homepage");
            }
            C26890h.m65011a("click_privacy_tips", (Map<String, String>) hashMap);
            String str = (String) SharePrefCache.inst().getPrivacyReminderH5Url().mo47782d();
            if (str != null) {
                Intent intent = new Intent(getContext(), CrossPlatformActivity.class);
                Bundle bundle = new Bundle();
                bundle.putBoolean("show_load_dialog", true);
                intent.putExtra("hide_nav_bar", false);
                intent.putExtra("use_webview_title", true);
                intent.putExtras(bundle);
                intent.setData(Uri.parse(str));
                getContext().startActivity(intent);
            }
        }
    }

    /* renamed from: b */
    private void m89823b(final Context context) {
        int i;
        if (this.f103180k == null) {
            this.f103180k = this.f103179j.inflate();
            this.f103181l = this.f103180k.findViewById(R.id.bjk);
            this.f103182m = this.f103180k.findViewById(R.id.bjl);
            this.f103171b = this.f103180k.findViewById(R.id.afv);
            this.f103170a = this.f103180k.findViewById(R.id.bjm);
            this.f103174e = (RecyclerView) this.f103180k.findViewById(R.id.caf);
            this.f103174e.setAdapter(getAdapter());
            this.f103185p = this.f103180k.findViewById(R.id.bay);
            this.f103175f = (TextView) this.f103180k.findViewById(R.id.de0);
            this.f103172c = this.f103180k.findViewById(R.id.c4y);
            this.f103173d = (TextView) this.f103180k.findViewById(R.id.def);
            this.f103184o = this.f103180k.findViewById(R.id.drm);
            this.f103183n = this.f103180k.findViewById(R.id.drn);
            int i2 = 0;
            ((C1440au) this.f103174e.getItemAnimator()).f5184m = false;
            getAdapter().f103239c = new C40442a() {
                /* renamed from: a */
                public final void mo82717a() {
                    if (RecommendCommonUserView.this.f103176g != null) {
                        RecommendCommonUserView.this.f103176g.mo60649a(RecommendCommonUserView.this.f103177h, false);
                    }
                }
            };
            getAdapter().f103245i = new C40450b() {
                /* renamed from: a */
                public final void mo82718a(int i) {
                    RecommendCommonUserView.this.f103174e.mo4795a((int) C9432q.m18687b(context, 130.0f), 0);
                }
            };
            this.f103174e.setPadding((int) C9432q.m18687b(this.f103174e.getContext(), 8.0f), 0, 0, 0);
            this.f103174e.setClipToPadding(false);
            this.f103174e.mo4798a((C1331h) new C32528d(0, (int) C9432q.m18687b(context, 4.0f), 0));
            this.f103174e.setLayoutManager(new WrapLinearLayoutManager(context, 0, false));
            this.f103181l.setOnClickListener(this);
            this.f103171b.setOnClickListener(this);
            C41589c.m91432a();
            if (!C41589c.m91439k()) {
                this.f103172c.setVisibility(8);
            } else {
                this.f103172c.setVisibility(0);
                this.f103172c.setOnClickListener(this);
            }
            if (!((Boolean) SharePrefCache.inst().getIsEuropeCountry().mo47782d()).booleanValue() || (RecommendSuperAccountExperiment.m69625b() && !C20854a.m53167g().isLogin())) {
                this.f103175f.setVisibility(8);
            } else {
                this.f103175f.setVisibility(0);
                String string = getContext().getResources().getString(R.string.cwy);
                String a = C2240a.m6772a(getContext().getString(R.string.cwx), new Object[]{string});
                String[] split = a.split(string);
                if (split == null || split.length != 2) {
                    i = 0;
                } else {
                    i2 = split[0].length();
                    i = string.length() + i2;
                }
                SpannableString spannableString = new SpannableString(a);
                spannableString.setSpan(new ClickableSpan() {
                    public final void onClick(View view) {
                        RecommendCommonUserView recommendCommonUserView = RecommendCommonUserView.this;
                        recommendCommonUserView.getContext().startActivity(new Intent(recommendCommonUserView.getContext(), PrivacyActivity.class));
                    }

                    public final void updateDrawState(TextPaint textPaint) {
                        super.updateDrawState(textPaint);
                        textPaint.setColor(RecommendCommonUserView.this.getResources().getColor(R.color.za));
                        textPaint.setUnderlineText(false);
                    }
                }, i2, i, 33);
                this.f103175f.setText(spannableString);
                this.f103175f.setMovementMethod(LinkMovementMethod.getInstance());
            }
            this.f103191v.f103221a.f103171b.setVisibility(8);
        }
    }

    public RecommendCommonUserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m89821a(context);
    }

    /* renamed from: a */
    public final void mo82704a(List<User> list, String str) {
        if (list != null) {
            m89823b(getContext());
            if (list.size() > 0) {
                m89822a(false);
            }
            this.f103177h = str;
            this.f103189t = list;
            getAdapter().mo50303a(this.f103189t);
            getAdapter().f103241e = str;
            if (!this.f103187r || this.f103189t.size() < 10) {
                getAdapter().mo54798c(false);
            } else {
                getAdapter().mo54798c(true);
            }
            if (this.f103188s == 1 || this.f103188s == 2) {
                C41589c.m91432a();
                C41589c.m91434f();
            }
        }
    }

    public RecommendCommonUserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m89821a(context);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f103178i) {
            if (z && getHeight() > 0 && (getLayoutParams() instanceof MarginLayoutParams)) {
                int top = getTop() - ((MarginLayoutParams) getLayoutParams()).topMargin;
                if (this.f103190u == 0) {
                    this.f103190u = top;
                }
                if (top != this.f103190u) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) getLayoutParams();
                    marginLayoutParams.topMargin += this.f103190u - top;
                    post(new C40432g(this));
                    this.f103190u = top;
                }
            } else if (getHeight() == 0) {
                this.f103190u = 0;
            }
        }
        super.onLayout(z, i, i2, i3, i4);
    }
}
