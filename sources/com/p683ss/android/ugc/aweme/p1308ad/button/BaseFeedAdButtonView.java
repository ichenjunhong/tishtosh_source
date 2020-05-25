package com.p683ss.android.ugc.aweme.p1308ad.button;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.p030v4.content.C0726c;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.p1308ad.utils.C22431a;
import com.p683ss.android.ugc.aweme.p1308ad.view.C22451e;
import com.ss.android.ugc.trill.R;
import p2628d.p2629a.C52568f;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ad.button.BaseFeedAdButtonView */
public abstract class BaseFeedAdButtonView extends FrameLayout implements C22451e {

    /* renamed from: c */
    public static final C22329a f60119c = new C22329a(null);

    /* renamed from: s */
    private static final String f60120s = BaseFeedAdButtonView.class.getSimpleName();

    /* renamed from: a */
    public boolean f60121a;

    /* renamed from: b */
    public final Context f60122b;

    /* renamed from: d */
    private View f60123d;

    /* renamed from: e */
    private TextView f60124e;

    /* renamed from: f */
    private TextView f60125f;

    /* renamed from: g */
    private View f60126g;

    /* renamed from: h */
    private View f60127h;

    /* renamed from: i */
    private ImageView f60128i;

    /* renamed from: j */
    private ObjectAnimator f60129j;

    /* renamed from: k */
    private ObjectAnimator f60130k;

    /* renamed from: l */
    private Runnable f60131l;

    /* renamed from: m */
    private Runnable f60132m;

    /* renamed from: n */
    private C22330b f60133n;

    /* renamed from: o */
    private Aweme f60134o;

    /* renamed from: p */
    private AwemeRawAd f60135p;

    /* renamed from: q */
    private boolean f60136q;

    /* renamed from: r */
    private int f60137r;

    /* renamed from: com.ss.android.ugc.aweme.ad.button.BaseFeedAdButtonView$a */
    public static final class C22329a {
        private C22329a() {
        }

        public /* synthetic */ C22329a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.button.BaseFeedAdButtonView$b */
    public enum C22330b {
        LINK,
        DOWNLOAD_IDLE,
        DOWNLOADING,
        INSTALL,
        INSTALLED
    }

    public BaseFeedAdButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public BaseFeedAdButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public abstract void mo46467a(int i, int i2);

    public final ImageView getArrow$ad_impl_tiktokI18nRelease() {
        return this.f60128i;
    }

    public final C22330b getCurrentStyle() {
        return this.f60133n;
    }

    public final int getDefaultBackgroundColor() {
        return this.f60137r;
    }

    public abstract int getLayoutId$ad_impl_tiktokI18nRelease();

    public final Aweme getMAweme$ad_impl_tiktokI18nRelease() {
        return this.f60134o;
    }

    public final AwemeRawAd getMAwemeRawAd$ad_impl_tiktokI18nRelease() {
        return this.f60135p;
    }

    public abstract void setLabelVisibility$ad_impl_tiktokI18nRelease(int i);

    private final long getShowSeconds() {
        int i;
        if (getInDownloadMode()) {
            return 0;
        }
        AwemeRawAd awemeRawAd = this.f60135p;
        if (awemeRawAd != null) {
            i = awemeRawAd.getShowButtonSeconds();
        } else {
            i = 0;
        }
        return ((long) i) * 1000;
    }

    public final int getBackGroundColor() {
        int i = this.f60137r;
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            return ((ColorDrawable) background).getColor();
        }
        return i;
    }

    public final boolean getInDownloadMode() {
        return C52568f.m112077a((Object[]) new C22330b[]{C22330b.DOWNLOADING, C22330b.INSTALL, C22330b.INSTALLED}, (Object) this.f60133n);
    }

    /* renamed from: b */
    private final void m55269b() {
        ObjectAnimator objectAnimator = this.f60129j;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = this.f60126g;
        if (view != null) {
            view.clearAnimation();
        }
        ObjectAnimator objectAnimator2 = this.f60130k;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        View view2 = this.f60127h;
        if (view2 != null) {
            view2.clearAnimation();
        }
        View view3 = this.f60126g;
        if (view3 != null) {
            view3.setBackgroundDrawable(null);
        }
        View view4 = this.f60127h;
        if (view4 != null) {
            view4.setBackgroundDrawable(null);
        }
    }

    private final long getColorChangeSeconds() {
        int i;
        AwemeRawAd awemeRawAd = this.f60135p;
        if (awemeRawAd == null || awemeRawAd.getAnimationType() != 3) {
            return getShowSeconds();
        }
        long showSeconds = getShowSeconds();
        AwemeRawAd awemeRawAd2 = this.f60135p;
        if (awemeRawAd2 != null) {
            i = awemeRawAd2.getShowButtonColorSeconds();
        } else {
            i = 0;
        }
        return Math.max(showSeconds, ((long) i) * 1000);
    }

    public final String getBgColor() {
        String str;
        boolean z;
        AwemeRawAd awemeRawAd = this.f60135p;
        if (awemeRawAd != null) {
            str = awemeRawAd.getLearnMoreBgColor();
        } else {
            str = null;
        }
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return str;
            }
        }
        return getResources().getString(R.color.ss);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        String str;
        m55269b();
        this.f60121a = false;
        removeCallbacks(this.f60131l);
        removeCallbacks(this.f60132m);
        AwemeRawAd awemeRawAd = this.f60135p;
        if (awemeRawAd != null) {
            str = awemeRawAd.getType();
        } else {
            str = null;
        }
        if (C52711k.m112239a((Object) str, (Object) "app")) {
            AwemeRawAd awemeRawAd2 = this.f60135p;
            if (awemeRawAd2 != null) {
                String downloadUrl = awemeRawAd2.getDownloadUrl();
                if (downloadUrl != null && downloadUrl.length() > 0) {
                }
            }
        }
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    private void m55268a() {
        View view;
        View view2;
        TextView textView;
        TextView textView2;
        if (!this.f60136q) {
            this.f60123d = View.inflate(getContext(), getLayoutId$ad_impl_tiktokI18nRelease(), this);
            View view3 = this.f60123d;
            ImageView imageView = null;
            if (view3 != null) {
                view = view3.findViewById(R.id.a80);
            } else {
                view = null;
            }
            this.f60126g = view;
            View view4 = this.f60123d;
            if (view4 != null) {
                view2 = view4.findViewById(R.id.a81);
            } else {
                view2 = null;
            }
            this.f60127h = view2;
            View view5 = this.f60123d;
            if (view5 != null) {
                textView = (TextView) view5.findViewById(R.id.bho);
            } else {
                textView = null;
            }
            this.f60124e = textView;
            View view6 = this.f60123d;
            if (view6 != null) {
                textView2 = (TextView) view6.findViewById(R.id.bhm);
            } else {
                textView2 = null;
            }
            this.f60125f = textView2;
            View view7 = this.f60123d;
            if (view7 != null) {
                imageView = (ImageView) view7.findViewById(R.id.a7z);
            }
            this.f60128i = imageView;
            C22431a.m55458a(this);
            this.f60136q = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r1.equals("counsel") != false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008c, code lost:
        if (r1.equals("web") != false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0095, code lost:
        if (r1.equals("app") != false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0097, code lost:
        r0 = getContext().getString(com.ss.android.ugc.trill.R.string.dy);
        p2628d.p2639f.p2641b.C52711k.m112236a((java.lang.Object) r0, "context.getString(R.string.ad_web_text_default)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a7, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String getButtonText() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r4.f60135p
            r1 = 0
            if (r0 == 0) goto L_0x000a
            java.lang.String r0 = r0.getButtonText()
            goto L_0x000b
        L_0x000a:
            r0 = r1
        L_0x000b:
            if (r0 == 0) goto L_0x001d
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            r3 = 1
            if (r2 <= 0) goto L_0x0019
            r2 = 1
            goto L_0x001a
        L_0x0019:
            r2 = 0
        L_0x001a:
            if (r2 != r3) goto L_0x001d
            return r0
        L_0x001d:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r4.f60135p
            if (r0 == 0) goto L_0x0025
            java.lang.String r1 = r0.getType()
        L_0x0025:
            if (r1 != 0) goto L_0x0029
            goto L_0x00c1
        L_0x0029:
            int r0 = r1.hashCode()
            switch(r0) {
                case -1354573786: goto L_0x00a8;
                case 96801: goto L_0x008f;
                case 117588: goto L_0x0086;
                case 3083120: goto L_0x006d;
                case 3148996: goto L_0x0054;
                case 957829685: goto L_0x004b;
                case 1893962841: goto L_0x0032;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x00c1
        L_0x0032:
            java.lang.String r0 = "redpacket"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00c1
            android.content.Context r0 = r4.getContext()
            r1 = 2132541695(0x7f1c00ff, float:2.0736474E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "context.getString(R.stri…_red_packet_text_default)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            return r0
        L_0x004b:
            java.lang.String r0 = "counsel"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00c1
            goto L_0x0097
        L_0x0054:
            java.lang.String r0 = "form"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00c1
            android.content.Context r0 = r4.getContext()
            r1 = 2132541678(0x7f1c00ee, float:2.073644E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "context.getString(R.string.ad_form_title_default)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            return r0
        L_0x006d:
            java.lang.String r0 = "dial"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00c1
            android.content.Context r0 = r4.getContext()
            r1 = 2132541691(0x7f1c00fb, float:2.0736466E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "context.getString(R.string.ad_phone_title_default)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            return r0
        L_0x0086:
            java.lang.String r0 = "web"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00c1
            goto L_0x0097
        L_0x008f:
            java.lang.String r0 = "app"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00c1
        L_0x0097:
            android.content.Context r0 = r4.getContext()
            r1 = 2132541698(0x7f1c0102, float:2.073648E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "context.getString(R.string.ad_web_text_default)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            return r0
        L_0x00a8:
            java.lang.String r0 = "coupon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00c1
            android.content.Context r0 = r4.getContext()
            r1 = 2132541675(0x7f1c00eb, float:2.0736433E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "context.getString(R.string.ad_coupon_text_default)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            return r0
        L_0x00c1:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1308ad.button.BaseFeedAdButtonView.getButtonText():java.lang.String");
    }

    public final void setArrow$ad_impl_tiktokI18nRelease(ImageView imageView) {
        this.f60128i = imageView;
    }

    public final void setCurrentStyle(C22330b bVar) {
        this.f60133n = bVar;
    }

    public final void setDefaultBackgroundColor$ad_impl_tiktokI18nRelease(int i) {
        this.f60137r = i;
    }

    public final void setMAweme$ad_impl_tiktokI18nRelease(Aweme aweme) {
        this.f60134o = aweme;
    }

    public final void setMAwemeRawAd$ad_impl_tiktokI18nRelease(AwemeRawAd awemeRawAd) {
        this.f60135p = awemeRawAd;
    }

    public final void setDownloadIdleUI(String str) {
        C52711k.m112240b(str, "text");
        m55268a();
        m55269b();
        this.f60133n = C22330b.DOWNLOAD_IDLE;
        View view = this.f60126g;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.f60127h;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        TextView textView = this.f60125f;
        if (textView != null) {
            textView.setTextColor(C0726c.m2098c(this.f60122b, R.color.aso));
        }
        TextView textView2 = this.f60125f;
        if (textView2 != null) {
            textView2.setText(str);
        }
        TextView textView3 = this.f60124e;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        ImageView imageView = this.f60128i;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    public final void setDownloadPauseUI(String str) {
        C52711k.m112240b(str, "percent");
        m55268a();
        this.f60133n = C22330b.DOWNLOADING;
        mo46467a(this.f60137r, 0);
        View view = this.f60126g;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.f60127h;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        TextView textView = this.f60125f;
        if (textView != null) {
            textView.setVisibility(0);
        }
        TextView textView2 = this.f60125f;
        if (textView2 != null) {
            textView2.setText(str);
        }
        TextView textView3 = this.f60125f;
        if (textView3 != null) {
            textView3.setTextColor(C0726c.m2098c(this.f60122b, R.color.a1o));
        }
        TextView textView4 = this.f60124e;
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
        ImageView imageView = this.f60128i;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public BaseFeedAdButtonView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "mContext");
        super(context, attributeSet, i);
        this.f60122b = context;
    }

    public /* synthetic */ BaseFeedAdButtonView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
