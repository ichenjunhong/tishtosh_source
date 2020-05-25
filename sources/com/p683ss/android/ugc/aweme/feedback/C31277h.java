package com.p683ss.android.ugc.aweme.feedback;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9395d;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.uikit.base.C11087e;
import com.p683ss.android.common.util.C18919f;
import com.p683ss.android.download.p1160a.C19087e;
import com.p683ss.android.p1147d.C18924a;
import com.p683ss.android.p1147d.C18933b;
import com.p683ss.android.p1147d.C18946h;
import com.p683ss.android.p1147d.C18947i;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.feedback.C31274g.C31276b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.feedback.h */
public final class C31277h extends BaseAdapter implements C11087e, C31343t {

    /* renamed from: a */
    List<C31274g> f81970a = new ArrayList();

    /* renamed from: b */
    private LayoutInflater f81971b;

    /* renamed from: c */
    private SimpleDateFormat f81972c;

    /* renamed from: d */
    private C18924a f81973d;

    /* renamed from: e */
    private C18947i f81974e;

    /* renamed from: f */
    private C18919f f81975f;

    /* renamed from: g */
    private Context f81976g;

    /* renamed from: h */
    private ColorFilter f81977h;

    /* renamed from: i */
    private int f81978i;

    /* renamed from: j */
    private int f81979j = 20000;

    /* renamed from: k */
    private boolean f81980k = true;

    /* renamed from: l */
    private boolean f81981l = false;

    /* renamed from: m */
    private C31343t f81982m;

    /* renamed from: n */
    private int f81983n;

    /* renamed from: o */
    private int f81984o;

    /* renamed from: p */
    private int f81985p;

    /* renamed from: q */
    private int f81986q;

    /* renamed from: r */
    private int f81987r;

    /* renamed from: s */
    private int f81988s;

    /* renamed from: t */
    private int f81989t;

    /* renamed from: u */
    private C18933b f81990u;

    /* renamed from: com.ss.android.ugc.aweme.feedback.h$a */
    public static class C31278a {

        /* renamed from: a */
        public ImageView f81991a;

        /* renamed from: b */
        public ImageView f81992b;

        /* renamed from: c */
        public ImageView f81993c;

        /* renamed from: d */
        public TextView f81994d;

        /* renamed from: e */
        public TextView f81995e;

        /* renamed from: f */
        public LinearLayout f81996f;

        /* renamed from: g */
        public View f81997g;

        /* renamed from: h */
        public View f81998h;

        /* renamed from: i */
        public View f81999i;

        /* renamed from: j */
        public View f82000j;

        /* renamed from: k */
        public C31274g f82001k;

        /* renamed from: l */
        public boolean f82002l;

        /* renamed from: m */
        public C31343t f82003m;

        /* renamed from: n */
        OnClickListener f82004n = new OnClickListener() {
            public final void onClick(View view) {
                Bitmap bitmap;
                ClickInstrumentation.onClick(view);
                if (C31278a.this.f82001k != null && C31278a.this.f82003m != null && C31278a.this.f81993c != null) {
                    Drawable drawable = C31278a.this.f81993c.getDrawable();
                    if (drawable instanceof BitmapDrawable) {
                        bitmap = ((BitmapDrawable) drawable).getBitmap();
                    } else {
                        bitmap = null;
                    }
                    C31278a.this.f82003m.mo64171a(C31278a.this.f82001k.f81953f, null, bitmap);
                }
            }
        };

        public C31278a(C31343t tVar) {
            this.f82003m = tVar;
        }
    }

    public final int getCount() {
        return this.f81970a.size();
    }

    /* renamed from: a */
    public final void mo20108a() {
        this.f81981l = true;
        if (this.f81973d != null) {
            this.f81973d.mo38781a();
        }
        if (this.f81974e != null) {
            C18947i iVar = this.f81974e;
            iVar.f52208t = true;
            iVar.f52209u = true;
            iVar.f52196h.mo39009d();
        }
    }

    public final void bj_() {
        this.f81981l = false;
        if (this.f81973d != null) {
            this.f81973d.mo38784b();
        }
        if (this.f81974e != null) {
            C18947i iVar = this.f81974e;
            iVar.f52209u = false;
            iVar.f52196h.mo39008c();
            iVar.f52194f.mo39016a(8);
        }
    }

    public final void bi_() {
        if (this.f81973d != null) {
            this.f81973d.mo38785c();
        }
        if (this.f81974e != null) {
            C18947i iVar = this.f81974e;
            iVar.f52208t = false;
            iVar.f52192d.clear();
            iVar.f52196h.mo39007b();
            C19087e<String, Bitmap> eVar = iVar.f52194f;
            eVar.f52567c.clear();
            eVar.f52565a.f52570b = eVar.f52566b;
            eVar.f52566b.f52569a = eVar.f52565a;
            if (iVar.f52204p != null) {
                iVar.f52204p.mo38773a();
            }
        }
        if (this.f81975f != null) {
            this.f81975f.mo38773a();
        }
    }

    public final Object getItem(int i) {
        if (i < 0 || i >= this.f81970a.size()) {
            return null;
        }
        return this.f81970a.get(i);
    }

    public final long getItemId(int i) {
        if (i < 0 || i >= this.f81970a.size()) {
            return -1;
        }
        return ((C31274g) this.f81970a.get(i)).f81949b;
    }

    public C31277h(Context context, C31343t tVar) {
        Locale locale;
        Context context2 = context;
        this.f81971b = LayoutInflater.from(context);
        this.f81972c = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
        if (I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().isArabicLang(context2)) {
            locale = Locale.US;
        } else {
            locale = I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getCountryLocale();
        }
        this.f81972c = new SimpleDateFormat("yyyy-MM-dd HH:mm", locale);
        this.f81975f = new C18919f();
        this.f81976g = context2;
        this.f81977h = SubmitFeedbackActivity.f81906A;
        this.f81982m = tVar;
        Resources resources = context.getResources();
        boolean z = resources.getBoolean(R.bool.r);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.xy);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.xw);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.xx);
        this.f81990u = new C18933b(context2);
        if (z) {
            C18924a aVar = new C18924a(R.drawable.cpd, this.f81975f, this.f81990u, dimensionPixelSize3 * 2, false, dimensionPixelSize3, true);
            this.f81973d = aVar;
        } else {
            C18924a aVar2 = new C18924a((int) R.drawable.cqr, this.f81975f, this.f81990u, dimensionPixelSize, false, dimensionPixelSize2);
            this.f81973d = aVar2;
        }
        this.f81980k = resources.getBoolean(R.bool.s);
        this.f81978i = resources.getDisplayMetrics().widthPixels - resources.getDimensionPixelOffset(R.dimen.xz);
        C18947i iVar = new C18947i(context, this.f81975f, 4, 4, 4, this.f81990u, this.f81978i, this.f81979j, R.drawable.cpc);
        this.f81974e = iVar;
        this.f81984o = resources.getColor(R.color.a1k);
        this.f81983n = resources.getColor(R.color.a4h);
        this.f81985p = resources.getColor(R.color.n8);
        this.f81986q = resources.getColor(R.color.nj);
        this.f81987r = resources.getColor(R.color.n9);
        this.f81988s = resources.getDimensionPixelOffset(R.dimen.y0);
        this.f81989t = resources.getDimensionPixelOffset(R.dimen.y1);
    }

    /* renamed from: a */
    public final void mo64171a(String str, String str2, Bitmap bitmap) {
        if (this.f81981l) {
            if (bitmap == null) {
                C18947i iVar = this.f81974e;
                String a = C9395d.m18571a(str);
                Bitmap bitmap2 = null;
                if (a != null) {
                    bitmap2 = (Bitmap) iVar.f52194f.mo39014a(a);
                    if (bitmap2 == null && iVar.f52193e != null) {
                        bitmap = (Bitmap) iVar.f52193e.mo39014a(a);
                    }
                }
                bitmap = bitmap2;
            }
            if (this.f81982m != null) {
                this.f81982m.mo64171a(str, str2, bitmap);
            }
        }
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        C31278a aVar;
        int i2;
        int i3;
        int i4;
        ColorFilter colorFilter;
        int i5;
        int i6;
        ColorFilter colorFilter2;
        String str;
        UrlModel urlModel;
        int i7;
        int i8 = i;
        if (view == null) {
            aVar = new C31278a(this);
            view2 = this.f81971b.inflate(R.layout.b44, null);
            aVar.f81992b = (ImageView) view2.findViewById(R.id.i8);
            aVar.f81991a = (ImageView) view2.findViewById(R.id.i2);
            aVar.f81993c = (ImageView) view2.findViewById(R.id.aes);
            aVar.f81994d = (TextView) view2.findViewById(R.id.aeu);
            aVar.f81995e = (TextView) view2.findViewById(R.id.aev);
            aVar.f81996f = (LinearLayout) view2.findViewById(R.id.aet);
            aVar.f81997g = view2.findViewById(R.id.ccl);
            aVar.f81998h = view2.findViewById(R.id.ba4);
            aVar.f81999i = view2.findViewById(R.id.d36);
            aVar.f82000j = view2.findViewById(R.id.m4);
            view2.setTag(aVar);
        } else {
            aVar = (C31278a) view.getTag();
            view2 = view;
        }
        if (i8 == 0) {
            aVar.f81999i.setVisibility(0);
        } else {
            aVar.f81999i.setVisibility(8);
        }
        if (i8 == this.f81970a.size() - 1) {
            aVar.f82000j.setVisibility(0);
        } else {
            aVar.f82000j.setVisibility(8);
        }
        C31274g gVar = (C31274g) this.f81970a.get(i8);
        aVar.f82001k = gVar;
        if (aVar.f81993c != null) {
            aVar.f81993c.setOnClickListener(aVar.f82004n);
        }
        if (gVar.f81959l == null || gVar.f81959l.size() <= 0 || C9431p.m18664a(gVar.f81952e)) {
            aVar.f81994d.setText(gVar.f81952e);
            TextView textView = aVar.f81994d;
            if (C9431p.m18664a(gVar.f81952e)) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            textView.setVisibility(i7);
        } else {
            SpannableString spannableString = new SpannableString(gVar.f81952e);
            int size = gVar.f81959l.size();
            for (int i9 = 0; i9 < size; i9++) {
                C31276b bVar = (C31276b) gVar.f81959l.get(i9);
                C31288q qVar = new C31288q(bVar.f81968c);
                if (bVar != null && bVar.f81966a >= 0 && bVar.f81967b > 0) {
                    spannableString.setSpan(qVar, bVar.f81966a, bVar.f81966a + bVar.f81967b, 34);
                }
            }
            aVar.f81994d.setText(spannableString);
            aVar.f81994d.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (gVar.f81951d <= 0 || i8 == 0) {
            aVar.f81995e.setVisibility(8);
        } else {
            aVar.f81995e.setVisibility(0);
            aVar.f81995e.setText(this.f81972c.format(new Date(gVar.f81951d * 1000)));
        }
        LayoutParams layoutParams = (LayoutParams) aVar.f81995e.getLayoutParams();
        LayoutParams layoutParams2 = (LayoutParams) aVar.f81996f.getLayoutParams();
        LayoutParams layoutParams3 = (LayoutParams) aVar.f81994d.getLayoutParams();
        LayoutParams layoutParams4 = (LayoutParams) aVar.f81993c.getLayoutParams();
        if (aVar.f82002l) {
            i2 = this.f81986q;
        } else {
            i2 = this.f81984o;
        }
        if (aVar.f82002l) {
            i3 = this.f81987r;
        } else {
            i3 = this.f81985p;
        }
        if (aVar.f82002l) {
            i4 = this.f81987r;
        } else {
            i4 = this.f81983n;
        }
        if (gVar.f81957j == 0) {
            aVar.f81996f.setBackgroundResource(R.drawable.cou);
            if (VERSION.SDK_INT >= 19) {
                aVar.f81996f.getBackground().setAutoMirrored(true);
            }
            aVar.f81996f.setGravity(8388613);
            aVar.f81992b.setVisibility(0);
            aVar.f81991a.setVisibility(4);
            aVar.f81994d.setTextColor(i2);
            aVar.f81995e.setTextColor(i4);
            if (this.f81973d != null) {
                User curUser = C20854a.m53167g().getCurUser();
                if (curUser == null) {
                    str = "";
                } else {
                    if (curUser != null) {
                        if (curUser.getAvatarThumb() != null) {
                            urlModel = curUser.getAvatarThumb();
                        } else if (curUser.getAvatarMedium() != null) {
                            urlModel = curUser.getAvatarMedium();
                        } else if (curUser.getAvatarLarger() != null) {
                            C32458a.m75143a((Exception) new IllegalStateException("Your avatar image is too large !"));
                            urlModel = curUser.getAvatarLarger();
                        }
                        if (urlModel != null || urlModel.getUrlList() == null || urlModel.getUrlList().size() == 0) {
                            str = "";
                        } else {
                            str = (String) urlModel.getUrlList().get(0);
                        }
                    }
                    urlModel = null;
                    if (urlModel != null) {
                    }
                    str = "";
                }
                this.f81973d.mo38782a(aVar.f81992b, str);
            }
            aVar.f81997g.setVisibility(8);
            aVar.f81998h.setVisibility(0);
            layoutParams.gravity = 8388613;
            if (layoutParams3 != null) {
                layoutParams3.leftMargin = this.f81989t;
                layoutParams3.rightMargin = this.f81988s;
            }
            if (layoutParams4 != null) {
                layoutParams4.leftMargin = this.f81989t;
                layoutParams4.rightMargin = this.f81988s;
                if (aVar.f81994d.getVisibility() == 8) {
                    layoutParams4.topMargin = C23728o.m58241a(10.0d);
                } else {
                    layoutParams4.topMargin = 0;
                }
            }
            if (layoutParams2 != null) {
                layoutParams2.gravity = 8388613;
            }
        } else {
            aVar.f81996f.setBackgroundResource(R.drawable.cot);
            if (VERSION.SDK_INT >= 19) {
                aVar.f81996f.getBackground().setAutoMirrored(true);
            }
            aVar.f81996f.setGravity(8388611);
            aVar.f81992b.setVisibility(4);
            aVar.f81991a.setVisibility(0);
            aVar.f81994d.setTextColor(i3);
            aVar.f81995e.setTextColor(i4);
            aVar.f81991a.setImageResource(R.drawable.cpd);
            if (this.f81973d != null) {
                this.f81973d.mo38782a(aVar.f81991a, gVar.f81954g);
            }
            aVar.f81997g.setVisibility(0);
            aVar.f81998h.setVisibility(8);
            if (layoutParams3 != null) {
                layoutParams3.leftMargin = this.f81988s;
                layoutParams3.rightMargin = this.f81989t;
            }
            if (layoutParams4 != null) {
                layoutParams4.leftMargin = this.f81988s;
                layoutParams4.rightMargin = this.f81989t;
            }
            if (layoutParams2 != null) {
                layoutParams2.gravity = 8388611;
            }
        }
        aVar.f81996f.requestLayout();
        if (C9431p.m18664a(gVar.f81953f) || gVar.f81955h <= 0 || gVar.f81956i <= 0) {
            colorFilter = null;
            aVar.f81993c.setVisibility(8);
        } else {
            aVar.f81993c.setVisibility(0);
            int i10 = (this.f81978i * gVar.f81956i) / gVar.f81955h;
            ViewGroup.LayoutParams layoutParams5 = aVar.f81993c.getLayoutParams();
            layoutParams5.height = i10;
            layoutParams5.width = this.f81978i;
            aVar.f81993c.setLayoutParams(layoutParams5);
            aVar.f81993c.setImageResource(R.drawable.cpc);
            colorFilter = null;
            this.f81974e.mo38818a(aVar.f81993c, new C18946h(gVar.f81953f, null), false);
        }
        if (aVar.f82002l && this.f81980k) {
            aVar.f82002l = false;
            Resources resources = this.f81976g.getResources();
            if (aVar.f82002l) {
                i5 = R.color.n9;
            } else {
                i5 = R.color.n8;
            }
            if (aVar.f82002l) {
                i6 = R.color.ne;
            } else {
                i6 = R.color.nd;
            }
            if (aVar.f82002l) {
                colorFilter2 = this.f81977h;
            } else {
                colorFilter2 = colorFilter;
            }
            aVar.f81994d.setTextColor(resources.getColor(i5));
            aVar.f81995e.setTextColor(resources.getColor(i6));
            aVar.f81991a.setColorFilter(colorFilter2);
            aVar.f81992b.setColorFilter(colorFilter2);
        }
        return view2;
    }
}
