package com.p683ss.android.ugc.aweme.main.story.feed;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Build.VERSION;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.mvvm.C23562e;
import com.p683ss.android.ugc.aweme.base.mvvm.impl.IViewDefault;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimationImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.base.widget.BaseRecyclerView;
import com.p683ss.android.ugc.aweme.commercialize.p1566f.C25831b;
import com.p683ss.android.ugc.aweme.commercialize.p1566f.C25834e;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.main.story.live.C36732a;
import com.p683ss.android.ugc.aweme.main.story.live.C36741b;
import com.p683ss.android.ugc.aweme.main.story.live.C36744d;
import com.p683ss.android.ugc.aweme.main.story.live.view.C36747b;
import com.p683ss.android.ugc.aweme.setting.C41522ac;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import com.p683ss.android.ugc.aweme.story.C46635b;
import com.p683ss.android.ugc.aweme.story.live.C46641d;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.main.story.feed.StoryFeedPanel */
public class StoryFeedPanel extends IViewDefault<C36727d> implements C0183j, C41522ac {
    public static final int HEIGHT = (C23728o.m58241a(90.0d) + C23724k.m58225c());
    public static final int MIN_DISTANCE = C23728o.m58241a(8.0d);
    private boolean isVisible;
    private int lastX;
    private int lastY;
    private C36732a livePageItemView;
    private C36744d mAvatars;
    private C25834e mCommerceLiveController;
    private String mEnterFrom;
    int mFirstVisiblePos;
    private Rect mFirstVisibleRect = new Rect();
    private String mFrom = "homepage_hot";
    private boolean mIsBig;
    private boolean mIsShowStatusBarHeight = true;
    int mLastVisiblePos = 4;
    private Rect mLastVisibleRect = new Rect();
    private LinearLayoutManager mLinearLayoutManager;
    private BaseRecyclerView mRecyclerView;
    private View mRootView;
    private C36727d mViewModel;
    private AnimationImageView switchView;

    public boolean isVisible() {
        return this.isVisible;
    }

    private int getPanelPaddingTop() {
        return C23728o.m58241a(12.0d) + getRealStatusBarHeight();
    }

    private void initListeners() {
        this.mRecyclerView.mo4801a((C1340m) new C1340m() {

            /* renamed from: a */
            boolean f93849a = true;

            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                boolean z;
                if (i > 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f93849a = z;
                StoryFeedPanel.this.logChangedHeads(this.f93849a);
            }
        });
    }

    public void logOnTabChange() {
        if (this.isVisible) {
            logOnLiveRecommendShow(this.isVisible);
        }
    }

    public void logWithLive() {
        if (this.isVisible) {
            logOnHeadExpand();
            logOnLiveRecommendShow(this.isVisible);
        }
    }

    public void refresh() {
        if (this.mViewModel != null) {
            bind(this.mViewModel);
            logWithLive();
        }
    }

    private int getRealStatusBarHeight() {
        if (!this.mIsShowStatusBarHeight || VERSION.SDK_INT < 19) {
            return 0;
        }
        return C9432q.m18695e(C11010c.m22280a());
    }

    public boolean isLivePageItemViewVisiable() {
        if (this.livePageItemView == null || this.livePageItemView.mo75838c().getVisibility() != 0) {
            return false;
        }
        return true;
    }

    private void logOnHeadExpand() {
        if (!C9376b.m18558a((Collection<T>) this.mViewModel.f93873b)) {
            int l = this.mLinearLayoutManager.mo4751l();
            int i = 0;
            for (C23562e eVar : this.mViewModel.f93873b) {
                if (i >= l) {
                    break;
                } else if (eVar instanceof C36719c) {
                    logShowHeads2Remote((C36719c) eVar, getContext(), i);
                    i++;
                }
            }
        }
    }

    public void onChanged() {
        if (this.livePageItemView != null && (this.mView instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) this.mView;
            viewGroup.removeView(this.livePageItemView.mo75838c());
            this.livePageItemView = C36741b.m82691a(this.mView.getContext(), this.mIsBig);
            View c = this.livePageItemView.mo75838c();
            if (c != null) {
                viewGroup.addView(c, 0);
            }
            this.livePageItemView.mo75835a(this.mAvatars);
            if (this.mCommerceLiveController != null) {
                this.mCommerceLiveController.mo53037a(viewGroup);
            }
        }
    }

    private void initViews() {
        int i;
        int i2;
        if (this.mView != null) {
            if (!this.mIsBig) {
                i = HEIGHT;
            } else if (this.mIsShowStatusBarHeight) {
                if (VERSION.SDK_INT >= 19) {
                    i2 = C9432q.m18695e(C11010c.m22280a());
                } else {
                    i2 = 0;
                }
                i = C23728o.m58241a(105.0d) + i2;
            } else {
                i = C23728o.m58241a(105.0d);
            }
            this.mView.setLayoutParams(new LayoutParams(-1, i));
            this.mView.setPadding(this.mView.getPaddingLeft(), getPanelPaddingTop(), this.mView.getPaddingRight(), this.mView.getPaddingBottom());
            this.mLinearLayoutManager = new WrapLinearLayoutManager(getContext(), 0, false);
            this.mRecyclerView.setLayoutManager(this.mLinearLayoutManager);
            this.mView.setBackgroundDrawable(C23729p.m58252a(Orientation.LEFT_RIGHT, C23723j.m58216a(R.color.a7a), C23723j.m58216a(R.color.a7_)));
        }
    }

    public void setFrom(String str) {
        this.mFrom = str;
    }

    public void bindWithoutRefresh(C36727d dVar) {
        this.mViewModel = dVar;
        dVar.mo48746a(this);
    }

    public void updateEnterFrom(String str) {
        this.mEnterFrom = str;
        this.livePageItemView.mo75836a(str);
    }

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_RESUME)
    public void onResume(C0184k kVar) {
        if (this.mViewModel != null) {
            C1322a a = this.mViewModel.mo75830a(getContext());
            if (a.getItemCount() > 0) {
                a.notifyDataSetChanged();
            }
        }
    }

    public void setLivePageAnimation(boolean z) {
        if (!this.mIsBig) {
            if (!z || !this.isVisible) {
                this.livePageItemView.mo75834a();
            } else {
                this.livePageItemView.mo75837b();
            }
        }
    }

    public void setLivePageItemView(C36744d dVar) {
        if (this.livePageItemView != null) {
            this.mAvatars = dVar;
            this.livePageItemView.mo75835a(this.mAvatars);
            if (this.mCommerceLiveController != null) {
                this.mCommerceLiveController.mo53036a();
            }
        }
    }

    public void setVisible(boolean z) {
        this.isVisible = z;
        if (z) {
            C46641d.m101221b(this.mEnterFrom);
            this.livePageItemView.mo75837b();
            C26890h.m65011a("show_skylight_entrance", (Map<String, String>) new HashMap<String,String>());
            return;
        }
        this.livePageItemView.mo75834a();
    }

    public StoryFeedPanel(Context context) {
        super(context);
        if (C0184k.class.isAssignableFrom(context.getClass())) {
            ((C0184k) context).getLifecycle().mo324a(this);
        }
    }

    public void bind(C36727d dVar) {
        this.mViewModel = dVar;
        dVar.mo48746a(this);
        BaseRecyclerView baseRecyclerView = this.mRecyclerView;
        C1322a a = dVar.mo75830a(getContext());
        if (baseRecyclerView.getAdapter() == null || baseRecyclerView.getAdapter() != a) {
            baseRecyclerView.setAdapter(a);
        } else {
            baseRecyclerView.getAdapter().notifyDataSetChanged();
        }
    }

    private void logOnLiveRecommendShow(boolean z) {
        String str;
        String str2;
        if (this.mViewModel != null && z && this.livePageItemView != null && this.livePageItemView.mo75838c().getVisibility() == 0) {
            String str3 = this.mViewModel.f93876e;
            if (this.mIsBig) {
                C26890h.onEvent(MobClick.obtain().setEventName("show").setLabelName("live_merge").setJsonObject(new C26898j().mo54849a("request_id", str3).mo54849a("page_name", "homepage_follow").mo54849a("position", "toplist").mo54850a()));
                str = "toplist_homepage_follow";
            } else {
                str = this.mViewModel.f93878g;
            }
            String str4 = this.mFrom;
            boolean z2 = this.livePageItemView.mo75838c() instanceof C36747b;
            C26898j a = new C26898j().mo54849a("request_id", str3);
            String str5 = "enter_method";
            if (z2) {
                str2 = "new_type";
            } else {
                str2 = "normal_type";
            }
            C26890h.onEvent(MobClick.obtain().setEventName("live_merge_show").setLabelName(str4).setJsonObject(a.mo54849a(str5, str2).mo54849a("page_name", str4).mo54850a()));
            C46641d.m101218a(str, this.livePageItemView.mo75838c() instanceof C36747b);
        }
    }

    public void logChangedHeads(boolean z) {
        int i;
        int j = this.mLinearLayoutManager.mo4749j();
        int l = this.mLinearLayoutManager.mo4751l();
        if (j != -1 && l != -1) {
            View c = this.mLinearLayoutManager.mo4736c(j);
            c.getLocalVisibleRect(this.mFirstVisibleRect);
            View c2 = this.mLinearLayoutManager.mo4736c(l);
            c2.getGlobalVisibleRect(this.mLastVisibleRect);
            int i2 = 0;
            if (this.mFirstVisibleRect.right > 0) {
                i = this.mFirstVisibleRect.right;
            } else {
                i = 0;
            }
            if (this.mFirstVisibleRect.left > 0) {
                i2 = this.mFirstVisibleRect.left;
            }
            float measuredWidth = (((float) (i - i2)) * 1.0f) / ((float) c.getMeasuredWidth());
            float measuredWidth2 = (((float) (this.mLastVisibleRect.right - this.mLastVisibleRect.left)) * 1.0f) / ((float) c2.getMeasuredWidth());
            if (((double) measuredWidth) < 0.5d) {
                j++;
            }
            if (((double) measuredWidth2) < 0.5d) {
                l--;
            }
            if (!z) {
                if (this.mFirstVisiblePos > j) {
                    int i3 = this.mFirstVisiblePos;
                    for (int i4 = j; i4 < i3; i4++) {
                        logShowHeads2Remote(this.mViewModel.mo75831a(i4), getContext(), i4);
                    }
                    this.mFirstVisiblePos = j;
                }
                if (this.mLastVisiblePos != l) {
                    this.mLastVisiblePos = l;
                    return;
                }
            } else {
                if (this.mLastVisiblePos < l) {
                    int i5 = l + 1;
                    for (int i6 = this.mLastVisiblePos + 1; i6 < i5; i6++) {
                        logShowHeads2Remote(this.mViewModel.mo75831a(i6), getContext(), i6);
                    }
                    this.mLastVisiblePos = l;
                }
                if (this.mFirstVisiblePos == j) {
                    this.mLastVisiblePos = l;
                    return;
                }
            }
            this.mFirstVisiblePos = j;
        }
    }

    public StoryFeedPanel(Context context, AnimationImageView animationImageView) {
        super(context);
        this.switchView = animationImageView;
    }

    public StoryFeedPanel create(Context context, ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(context);
        this.mView = linearLayout;
        linearLayout.setOrientation(0);
        this.livePageItemView = C36741b.m82691a(context, this.mIsBig);
        if (this.livePageItemView.mo75838c() != null) {
            linearLayout.addView(this.livePageItemView.mo75838c(), 0);
        }
        if (!this.mIsBig) {
            this.mCommerceLiveController = new C25831b(context);
            this.mCommerceLiveController.mo53037a(linearLayout);
        }
        C41589c.m91432a().mo85304a((C41522ac) this);
        this.mRecyclerView = new BaseRecyclerView(context) {
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case 0:
                    case 2:
                        getParent().requestDisallowInterceptTouchEvent(true);
                        break;
                    case 1:
                    case 3:
                        getParent().requestDisallowInterceptTouchEvent(false);
                        break;
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            public final boolean onTouchEvent(MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case 1:
                    case 3:
                        getParent().requestDisallowInterceptTouchEvent(false);
                        break;
                    case 2:
                        getParent().requestDisallowInterceptTouchEvent(true);
                        break;
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        linearLayout.addView(this.mRecyclerView, new LayoutParams(-1, -1));
        initListeners();
        initViews();
        viewGroup.addView(this.mView);
        this.mRootView = viewGroup;
        setPanelVisibility(8, true);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        if (r2.equals("story_live") != false) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setPanelVisibility(int r7, boolean r8) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r0 = r6.switchView
            if (r0 == 0) goto L_0x0068
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r0 = r6.switchView
            r1 = 0
            r0.setVisibility(r1)
            if (r7 == 0) goto L_0x0068
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r0 = r6.switchView
            java.lang.String r2 = "story_open"
            r3 = -1
            int r4 = r2.hashCode()
            r5 = -930484690(0xffffffffc889ee2e, float:-282481.44)
            if (r4 == r5) goto L_0x0047
            r5 = 1494270454(0x5910c1f6, float:2.54660368E15)
            if (r4 == r5) goto L_0x003e
            r1 = 1494366036(0x59123754, float:2.57226128E15)
            if (r4 == r1) goto L_0x0034
            r1 = 1710772054(0x65f84f56, float:1.465763E23)
            if (r4 == r1) goto L_0x002a
            goto L_0x0051
        L_0x002a:
            java.lang.String r1 = "story_new"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0051
            r1 = 1
            goto L_0x0052
        L_0x0034:
            java.lang.String r1 = "story_open"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0051
            r1 = 3
            goto L_0x0052
        L_0x003e:
            java.lang.String r4 = "story_live"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0051
            goto L_0x0052
        L_0x0047:
            java.lang.String r1 = "story_close"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0051
            r1 = 2
            goto L_0x0052
        L_0x0051:
            r1 = -1
        L_0x0052:
            switch(r1) {
                case 0: goto L_0x005e;
                case 1: goto L_0x005b;
                case 2: goto L_0x0058;
                default: goto L_0x0055;
            }
        L_0x0055:
            java.lang.String r1 = "live_entrance_on_lottie.json"
            goto L_0x0060
        L_0x0058:
            java.lang.String r1 = "live_entrance_off_lottie.json"
            goto L_0x0060
        L_0x005b:
            java.lang.String r1 = "live_entrance_anim_lottie.json"
            goto L_0x0060
        L_0x005e:
            java.lang.String r1 = "live_anim.json"
        L_0x0060:
            r0.setAnimation(r1)
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r0 = r6.switchView
            r0.mo6654b()
        L_0x0068:
            boolean r0 = r6.mIsBig
            if (r0 != 0) goto L_0x006e
            if (r8 == 0) goto L_0x0073
        L_0x006e:
            android.view.View r8 = r6.mRootView
            r8.setVisibility(r7)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.main.story.feed.StoryFeedPanel.setPanelVisibility(int, boolean):void");
    }

    private void logShowHeads2Remote(C23562e eVar, Context context, int i) {
        String str;
        if (eVar != null) {
            boolean z = eVar instanceof C36719c;
            if (z) {
                JSONObject jSONObject = new JSONObject();
                C36719c cVar = (C36719c) eVar;
                try {
                    jSONObject.put("request_id", cVar.f93853c);
                } catch (JSONException unused) {
                }
                if (cVar.mo75820d() && C46635b.m101190a()) {
                    if (this.mIsBig) {
                        str = "homepage_follow";
                    } else {
                        str = "homepage_hot";
                    }
                    C46641d.m101207a(getContext(), 0, cVar.f93853c, cVar.mo75823g(), cVar.f93855e, str);
                    if (z) {
                        cVar.f93854d = this.mIsBig;
                        C46641d.m101212a(cVar.mo75823g(), cVar.f93855e, cVar.mo75824h(), cVar.f93853c, i, cVar.f93859i.mo75789a().f117676a.type, "", "others_photo");
                    }
                } else if (cVar.mo75821e()) {
                    try {
                        jSONObject.put("order", cVar.mo75819c());
                    } catch (JSONException unused2) {
                    }
                    C26890h.m65008a(context, "head_show", "toplist", cVar.mo75822f(), "0", jSONObject);
                } else {
                    C26890h.m65008a(context, "show", "story_head", cVar.mo75822f(), "0", jSONObject);
                }
            }
        }
    }

    public StoryFeedPanel create(Context context, ViewGroup viewGroup, boolean z, boolean z2) {
        this.mIsBig = z;
        this.mIsShowStatusBarHeight = z2;
        return create(context, viewGroup);
    }
}
