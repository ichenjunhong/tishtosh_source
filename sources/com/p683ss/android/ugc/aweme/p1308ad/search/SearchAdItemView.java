package com.p683ss.android.ugc.aweme.p1308ad.search;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.commercialize.p1545ad.AdRatingView;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p683ss.android.ugc.aweme.p1308ad.p1309a.C22317a;
import com.p683ss.android.ugc.aweme.p1308ad.p1321g.C22414a;
import com.p683ss.android.ugc.aweme.p1308ad.utils.C22435c;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ad.search.SearchAdItemView */
public final class SearchAdItemView extends SearchAdBaseItemView implements OnClickListener {

    /* renamed from: a */
    public static final C22420a f60404a = new C22420a(null);

    /* renamed from: b */
    private final View f60405b;

    /* renamed from: c */
    private boolean f60406c;

    /* renamed from: d */
    private boolean f60407d;

    /* renamed from: e */
    private boolean f60408e;

    /* renamed from: f */
    private boolean f60409f;

    /* renamed from: g */
    private HashMap f60410g;

    /* renamed from: com.ss.android.ugc.aweme.ad.search.SearchAdItemView$a */
    public static final class C22420a {
        private C22420a() {
        }

        public /* synthetic */ C22420a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.search.SearchAdItemView$b */
    static final class C22421b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SearchAdItemView f60411a;

        C22421b(SearchAdItemView searchAdItemView) {
            this.f60411a = searchAdItemView;
        }

        public final void run() {
            SearchAdItemView searchAdItemView = this.f60411a;
            LinearLayout linearLayout = (LinearLayout) searchAdItemView.mo46690a((int) R.id.c8l);
            C52711k.m112236a((Object) linearLayout, "ratingLayout");
            if (linearLayout.getChildCount() >= 2) {
                LinearLayout linearLayout2 = (LinearLayout) searchAdItemView.mo46690a((int) R.id.c8l);
                C52711k.m112236a((Object) linearLayout2, "ratingLayout");
                int childCount = linearLayout2.getChildCount() - 2;
                int i = 0;
                if (childCount >= 0) {
                    int i2 = 0;
                    while (true) {
                        View childAt = ((LinearLayout) searchAdItemView.mo46690a((int) R.id.c8l)).getChildAt(i);
                        C52711k.m112236a((Object) childAt, "ratingLayout.getChildAt(i)");
                        i2 += childAt.getMeasuredWidth();
                        LayoutParams layoutParams = childAt.getLayoutParams();
                        if (layoutParams != null) {
                            if (!(layoutParams instanceof MarginLayoutParams)) {
                                layoutParams = null;
                            }
                            if (layoutParams != null) {
                                if (layoutParams != null) {
                                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                                    i2 += marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                                } else {
                                    throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                }
                            }
                        }
                        if (i == childCount) {
                            i = i2;
                            break;
                        }
                        i++;
                    }
                }
                LinearLayout linearLayout3 = (LinearLayout) searchAdItemView.mo46690a((int) R.id.c8l);
                LinearLayout linearLayout4 = (LinearLayout) searchAdItemView.mo46690a((int) R.id.c8l);
                C52711k.m112236a((Object) linearLayout4, "ratingLayout");
                View childAt2 = linearLayout3.getChildAt(linearLayout4.getChildCount() - 1);
                C52711k.m112236a((Object) childAt2, "ratingLayout.getChildAt(…ingLayout.childCount - 1)");
                LayoutParams layoutParams2 = childAt2.getLayoutParams();
                if (layoutParams2 != null) {
                    if (!(layoutParams2 instanceof MarginLayoutParams)) {
                        layoutParams2 = null;
                    }
                    if (layoutParams2 != null) {
                        if (layoutParams2 != null) {
                            i += ((MarginLayoutParams) layoutParams2).leftMargin;
                        } else {
                            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                    }
                }
                LinearLayout linearLayout5 = (LinearLayout) searchAdItemView.mo46690a((int) R.id.fn);
                C52711k.m112236a((Object) linearLayout5, "appInfoLayout");
                int measuredWidth = linearLayout5.getMeasuredWidth() - i;
                AdRatingView adRatingView = (AdRatingView) searchAdItemView.mo46690a((int) R.id.c8m);
                C52711k.m112236a((Object) adRatingView, "ratingView");
                if (measuredWidth < adRatingView.getMeasuredWidth()) {
                    AdRatingView adRatingView2 = (AdRatingView) searchAdItemView.mo46690a((int) R.id.c8m);
                    C52711k.m112236a((Object) adRatingView2, "ratingView");
                    adRatingView2.setVisibility(8);
                    View a = searchAdItemView.mo46690a((int) R.id.c8k);
                    C52711k.m112236a((Object) a, "ratingDivider");
                    a.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.search.SearchAdItemView$c */
    static final class C22422c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SearchAdItemView f60412a;

        /* renamed from: b */
        final /* synthetic */ String f60413b;

        /* renamed from: c */
        final /* synthetic */ AwemeTextLabelModel f60414c;

        C22422c(SearchAdItemView searchAdItemView, String str, AwemeTextLabelModel awemeTextLabelModel) {
            this.f60412a = searchAdItemView;
            this.f60413b = str;
            this.f60414c = awemeTextLabelModel;
        }

        public final void run() {
            SearchAdItemView searchAdItemView = this.f60412a;
            String str = this.f60413b;
            AwemeTextLabelModel awemeTextLabelModel = this.f60414c;
            C52711k.m112236a((Object) awemeTextLabelModel, "label");
            searchAdItemView.mo46698a(str, awemeTextLabelModel);
        }
    }

    public SearchAdItemView(Context context) {
        this(context, null, 0, false, 14, null);
    }

    public SearchAdItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, 12, null);
    }

    public SearchAdItemView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, false, 8, null);
    }

    /* renamed from: a */
    public final View mo46690a(int i) {
        if (this.f60410g == null) {
            this.f60410g = new HashMap();
        }
        View view = (View) this.f60410g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f60410g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public final void onResume() {
        m55449b();
        m55447a();
    }

    /* renamed from: a */
    private final void m55447a() {
        if (getAwemeRawAd() != null && !this.f60406c) {
            this.f60406c = true;
        }
    }

    /* renamed from: b */
    private final void m55449b() {
        if (getAwemeRawAd() != null && this.f60406c) {
            this.f60406c = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m55449b();
        this.f60407d = false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r3 == null) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAttachedToWindow() {
        /*
            r6 = this;
            super.onAttachedToWindow()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r6.getAwemeRawAd()
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            r6.m55447a()
            boolean r1 = r6.f60407d
            if (r1 != 0) goto L_0x0054
            int r1 = r6.getVisibility()
            if (r1 != 0) goto L_0x0054
            com.ss.android.ugc.aweme.ad.a.a r1 = com.p683ss.android.ugc.aweme.p1308ad.p1309a.C22317a.m55223a()
            java.lang.String r2 = "AdDependManager.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            com.ss.android.ugc.aweme.ad.a.c r1 = r1.f60116c
            android.content.Context r2 = r6.getContext()
            java.lang.Long r3 = r0.getCreativeId()
            if (r3 == 0) goto L_0x0036
            long r3 = r3.longValue()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            if (r3 != 0) goto L_0x0038
        L_0x0036:
            java.lang.String r3 = ""
        L_0x0038:
            java.lang.String r4 = "card"
            java.lang.String r5 = r0.getLogExtra()
            r1.mo46441d(r2, r3, r4, r5)
            java.lang.String r1 = "rawAd"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
            com.ss.android.ugc.aweme.ad.a.a r1 = com.p683ss.android.ugc.aweme.p1308ad.p1309a.C22317a.m55223a()
            java.lang.String r2 = "AdDependManager.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            com.ss.android.ugc.aweme.ad.a.c r1 = r1.f60116c
            r1.mo46436b(r0)
        L_0x0054:
            r0 = 1
            r6.f60407d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1308ad.search.SearchAdItemView.onAttachedToWindow():void");
    }

    public final void setIsStrongStyle(boolean z) {
        this.f60408e = z;
    }

    public final void setDividerVisibility(int i) {
        View a = mo46690a((int) R.id.lm);
        C52711k.m112236a((Object) a, "bottomDivider");
        a.setVisibility(i);
    }

    public final void setTitleVisibility(int i) {
        DmtTextView dmtTextView = (DmtTextView) mo46690a((int) R.id.f0i);
        C52711k.m112236a((Object) dmtTextView, "topTitle");
        dmtTextView.setVisibility(i);
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view != null) {
            AwemeRawAd awemeRawAd = getAwemeRawAd();
            if (awemeRawAd != null) {
                int id = view.getId();
                if (id == R.id.fm) {
                    Context context = getContext();
                    C52711k.m112236a((Object) context, "context");
                    m55448a(context, awemeRawAd, "card_photo");
                } else if (id == R.id.fo) {
                    Context context2 = getContext();
                    C52711k.m112236a((Object) context2, "context");
                    m55448a(context2, awemeRawAd, "card_name");
                } else if (id == R.id.fl || id == R.id.c8l) {
                    Context context3 = getContext();
                    C52711k.m112236a((Object) context3, "context");
                    m55448a(context3, awemeRawAd, "card_title");
                } else if (id == R.id.a7u) {
                    Context context4 = getContext();
                    C52711k.m112236a((Object) context4, "context");
                    m55448a(context4, awemeRawAd, "card");
                } else {
                    if (id == R.id.c65) {
                        C22317a a = C22317a.m55223a();
                        C52711k.m112236a((Object) a, "AdDependManager.inst()");
                        a.f60117d.mo46454a(getContext(), awemeRawAd, "card_download_button", true);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo46691a(AwemeRawAd awemeRawAd) {
        float f;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        C52711k.m112240b(awemeRawAd, "awemeRawAd");
        super.mo46691a(awemeRawAd);
        UrlModel imageUrl = awemeRawAd.getImageUrl();
        if (imageUrl != null) {
            C23515d.m57669a((RemoteImageView) mo46690a((int) R.id.fm), imageUrl);
        }
        String appName = awemeRawAd.getAppName();
        if (appName != null) {
            DmtTextView dmtTextView = (DmtTextView) mo46690a((int) R.id.fo);
            C52711k.m112236a((Object) dmtTextView, "appNameTv");
            dmtTextView.setText(appName);
        }
        try {
            f = awemeRawAd.getAppLike();
        } catch (Exception unused) {
            f = 0.0f;
        }
        CharSequence appInstall = awemeRawAd.getAppInstall();
        boolean z4 = true;
        if (appInstall == null || appInstall.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            DmtTextView dmtTextView2 = (DmtTextView) mo46690a((int) R.id.fp);
            C52711k.m112236a((Object) dmtTextView2, "appPlayCountTv");
            dmtTextView2.setVisibility(8);
        } else {
            DmtTextView dmtTextView3 = (DmtTextView) mo46690a((int) R.id.fp);
            C52711k.m112236a((Object) dmtTextView3, "appPlayCountTv");
            dmtTextView3.setText(awemeRawAd.getAppInstall());
            DmtTextView dmtTextView4 = (DmtTextView) mo46690a((int) R.id.fp);
            C52711k.m112236a((Object) dmtTextView4, "appPlayCountTv");
            dmtTextView4.setVisibility(0);
        }
        if (f > 0.0f) {
            ((AdRatingView) mo46690a((int) R.id.c8m)).setRatingProgress(f);
            AdRatingView adRatingView = (AdRatingView) mo46690a((int) R.id.c8m);
            C52711k.m112236a((Object) adRatingView, "ratingView");
            adRatingView.setVisibility(0);
            AdRatingView adRatingView2 = (AdRatingView) mo46690a((int) R.id.c8m);
            C52711k.m112236a((Object) adRatingView2, "ratingView");
            LayoutParams layoutParams = adRatingView2.getLayoutParams();
            layoutParams.height = ((AdRatingView) mo46690a((int) R.id.c8m)).getRatingUnImage().getIntrinsicHeight();
            AdRatingView adRatingView3 = (AdRatingView) mo46690a((int) R.id.c8m);
            C52711k.m112236a((Object) adRatingView3, "ratingView");
            adRatingView3.setLayoutParams(layoutParams);
        } else {
            AdRatingView adRatingView4 = (AdRatingView) mo46690a((int) R.id.c8m);
            C52711k.m112236a((Object) adRatingView4, "ratingView");
            adRatingView4.setVisibility(8);
        }
        CharSequence appInstall2 = awemeRawAd.getAppInstall();
        if (appInstall2 == null || appInstall2.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || f <= 0.0f) {
            View a = mo46690a((int) R.id.c8k);
            C52711k.m112236a((Object) a, "ratingDivider");
            a.setVisibility(8);
        } else {
            View a2 = mo46690a((int) R.id.c8k);
            C52711k.m112236a((Object) a2, "ratingDivider");
            a2.setVisibility(0);
            ((AdRatingView) mo46690a((int) R.id.c8m)).post(new C22421b(this));
        }
        CharSequence appInstall3 = awemeRawAd.getAppInstall();
        if (appInstall3 == null || appInstall3.length() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 || f > 0.0f) {
            DmtTextView dmtTextView5 = (DmtTextView) mo46690a((int) R.id.fl);
            C52711k.m112236a((Object) dmtTextView5, "appDescTv");
            dmtTextView5.setMaxLines(1);
            LinearLayout linearLayout = (LinearLayout) mo46690a((int) R.id.c8l);
            C52711k.m112236a((Object) linearLayout, "ratingLayout");
            linearLayout.setVisibility(0);
        } else {
            DmtTextView dmtTextView6 = (DmtTextView) mo46690a((int) R.id.fl);
            C52711k.m112236a((Object) dmtTextView6, "appDescTv");
            dmtTextView6.setMaxLines(2);
            LinearLayout linearLayout2 = (LinearLayout) mo46690a((int) R.id.c8l);
            C52711k.m112236a((Object) linearLayout2, "ratingLayout");
            linearLayout2.setVisibility(8);
        }
        String title = awemeRawAd.getTitle();
        if (title == null) {
            title = "";
        }
        AwemeTextLabelModel label = awemeRawAd.getLabel();
        if (label != null) {
            str = label.getLabelName();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str) || this.f60408e) {
            DmtTextView dmtTextView7 = (DmtTextView) mo46690a((int) R.id.fl);
            C52711k.m112236a((Object) dmtTextView7, "appDescTv");
            m55443a(dmtTextView7, title);
        } else {
            ((DmtTextView) mo46690a((int) R.id.fl)).post(new C22422c(this, title, label));
        }
        String buttonText = awemeRawAd.getButtonText();
        CharSequence charSequence = buttonText;
        if (!(charSequence == null || charSequence.length() == 0)) {
            z4 = false;
        }
        if (!z4) {
            ((AdTextProgressButton) mo46690a((int) R.id.c65)).setIdleText(buttonText);
        } else {
            AdTextProgressButton adTextProgressButton = (AdTextProgressButton) mo46690a((int) R.id.c65);
            Context context = getContext();
            C52711k.m112236a((Object) context, "context");
            String string = context.getResources().getString(R.string.bqq);
            C52711k.m112236a((Object) string, "context.resources.getStr…ing.immediately_download)");
            adTextProgressButton.setIdleText(string);
        }
        OnClickListener onClickListener = this;
        ((RemoteImageView) mo46690a((int) R.id.fm)).setOnClickListener(onClickListener);
        ((DmtTextView) mo46690a((int) R.id.fo)).setOnClickListener(onClickListener);
        ((DmtTextView) mo46690a((int) R.id.fl)).setOnClickListener(onClickListener);
        ((LinearLayout) mo46690a((int) R.id.c8l)).setOnClickListener(onClickListener);
        ((AdTextProgressButton) mo46690a((int) R.id.c65)).setOnClickListener(onClickListener);
        ((LinearLayout) mo46690a((int) R.id.a7u)).setOnClickListener(onClickListener);
        m55447a();
    }

    /* renamed from: a */
    public final void mo46698a(String str, AwemeTextLabelModel awemeTextLabelModel) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("  ");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
        C22414a aVar = new C22414a(getContext(), awemeTextLabelModel.getBgColor(), awemeTextLabelModel.getLabelName(), awemeTextLabelModel.getTextColor());
        aVar.f60360a = awemeTextLabelModel.isAdHollowText();
        int length = spannableStringBuilder.length() - 1;
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(aVar, length, length2, 18);
        DmtTextView dmtTextView = (DmtTextView) mo46690a((int) R.id.fl);
        C52711k.m112236a((Object) dmtTextView, "appDescTv");
        Paint paint = dmtTextView.getPaint();
        CharSequence charSequence = spannableStringBuilder;
        DmtTextView dmtTextView2 = (DmtTextView) mo46690a((int) R.id.fl);
        C52711k.m112236a((Object) dmtTextView2, "appDescTv");
        TextPaint paint2 = dmtTextView2.getPaint();
        C52711k.m112236a((Object) paint2, "appDescTv.paint");
        int size = aVar.getSize(paint, charSequence, length, length2, paint2.getFontMetricsInt());
        DmtTextView dmtTextView3 = (DmtTextView) mo46690a((int) R.id.fl);
        C52711k.m112236a((Object) dmtTextView3, "appDescTv");
        TextPaint paint3 = dmtTextView3.getPaint();
        C52711k.m112236a((Object) paint3, "appDescTv.paint");
        LinearLayout linearLayout = (LinearLayout) mo46690a((int) R.id.fn);
        C52711k.m112236a((Object) linearLayout, "appInfoLayout");
        int measuredWidth = linearLayout.getMeasuredWidth();
        DmtTextView dmtTextView4 = (DmtTextView) mo46690a((int) R.id.fl);
        C52711k.m112236a((Object) dmtTextView4, "appDescTv");
        SpannableStringBuilder a = C22435c.m55467a(spannableStringBuilder, paint3, measuredWidth, dmtTextView4.getMaxLines(), 1, size, true);
        DmtTextView dmtTextView5 = (DmtTextView) mo46690a((int) R.id.fl);
        C52711k.m112236a((Object) dmtTextView5, "appDescTv");
        m55443a(dmtTextView5, a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0028, code lost:
        if (r1 == null) goto L_0x002a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m55448a(android.content.Context r4, com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd r5, java.lang.String r6) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.ad.a.a r0 = com.p683ss.android.ugc.aweme.p1308ad.p1309a.C22317a.m55223a()
            java.lang.String r1 = "AdDependManager.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.ad.a.f r0 = r0.f60117d
            r1 = 0
            r0.mo46454a(r4, r5, r6, r1)
            com.ss.android.ugc.aweme.ad.a.a r0 = com.p683ss.android.ugc.aweme.p1308ad.p1309a.C22317a.m55223a()
            java.lang.String r1 = "AdDependManager.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.ad.a.c r0 = r0.f60116c
            java.lang.Long r1 = r5.getCreativeId()
            if (r1 == 0) goto L_0x002a
            long r1 = r1.longValue()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            if (r1 != 0) goto L_0x002c
        L_0x002a:
            java.lang.String r1 = ""
        L_0x002c:
            java.lang.String r2 = r5.getLogExtra()
            r0.mo46435b(r4, r1, r6, r2)
            m55444b(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1308ad.search.SearchAdItemView.m55448a(android.content.Context, com.ss.android.ugc.aweme.feed.model.AwemeRawAd, java.lang.String):void");
    }

    public SearchAdItemView(Context context, AttributeSet attributeSet, int i, boolean z) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f60409f = z;
        setOrientation(1);
        View inflate = LayoutInflater.from(context).inflate(R.layout.bkb, this, true);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(cont…ad_item_view, this, true)");
        this.f60405b = inflate;
        int b = (int) C9432q.m18687b(getContext(), 16.0f);
        int b2 = (int) C9432q.m18687b(getContext(), 22.0f);
        setPadding(b, 0, b, 0);
        if (!this.f60409f) {
            LinearLayout linearLayout = (LinearLayout) mo46690a((int) R.id.a7u);
            C52711k.m112236a((Object) linearLayout, "downloadCard");
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.setMargins(0, 0, 0, b2);
            }
            LinearLayout linearLayout2 = (LinearLayout) mo46690a((int) R.id.a7u);
            C52711k.m112236a((Object) linearLayout2, "downloadCard");
            linearLayout2.setLayoutParams(layoutParams);
        }
    }

    public /* synthetic */ SearchAdItemView(Context context, AttributeSet attributeSet, int i, boolean z, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        this(context, attributeSet, i, z);
    }
}
