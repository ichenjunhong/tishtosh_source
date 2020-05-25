package com.p683ss.android.ugc.aweme.poi.search;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C0997e;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.p683ss.android.ugc.aweme.location.C36285u;
import com.p683ss.android.ugc.aweme.location.C36285u.C36286a;
import com.p683ss.android.ugc.aweme.poi.p2059b.C39045e;
import com.p683ss.android.ugc.aweme.poi.search.C39227a.C39230a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.search.l */
public class C39241l extends Dialog implements C0997e, TextWatcher, OnClickListener, OnEditorActionListener, C39230a {

    /* renamed from: a */
    TextView f100202a;

    /* renamed from: b */
    ViewPager f100203b;

    /* renamed from: c */
    PopupWindow f100204c;

    /* renamed from: d */
    public C39242a f100205d;

    /* renamed from: e */
    private View f100206e;

    /* renamed from: f */
    private ImmersionBar f100207f;

    /* renamed from: g */
    private ImageView f100208g;

    /* renamed from: h */
    private TextView f100209h;

    /* renamed from: i */
    private ImageView f100210i;

    /* renamed from: j */
    private ViewGroup f100211j;

    /* renamed from: k */
    private ImageView f100212k;

    /* renamed from: l */
    private EditText f100213l;

    /* renamed from: m */
    private DmtTextView f100214m;

    /* renamed from: n */
    private View f100215n;

    /* renamed from: o */
    private C39248r f100216o;

    /* renamed from: p */
    private Context f100217p;

    /* renamed from: q */
    private String f100218q;

    /* renamed from: r */
    private String f100219r;

    /* renamed from: s */
    private boolean f100220s;

    /* renamed from: t */
    private boolean f100221t;

    /* renamed from: u */
    private boolean f100222u;

    /* renamed from: v */
    private boolean f100223v;

    /* renamed from: com.ss.android.ugc.aweme.poi.search.l$a */
    public interface C39242a {
        /* renamed from: a */
        void mo79102a(C39045e eVar);
    }

    /* renamed from: a */
    public final void mo79979a() {
        m87197c();
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C47718bf.m103290c(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C47718bf.m103291d(this);
    }

    public void dismiss() {
        m87197c();
        if (this.f100207f != null) {
            this.f100207f.destroy();
        }
        super.dismiss();
    }

    /* renamed from: c */
    private void m87197c() {
        if (getOwnerActivity() != null) {
            C26894c.m65021a(getOwnerActivity(), this.f100213l);
            this.f100213l.clearFocus();
        }
    }

    /* renamed from: b */
    public final String mo79989b() {
        return this.f100216o.mo80004a(this.f100203b.getCurrentItem()).getPoiSearchRegionType();
    }

    public void show() {
        super.show();
        this.f100213l.getText().clear();
        C36286a.m81925a();
        if (!C36285u.m81919a(getContext())) {
            this.f100216o.mo80004a(this.f100203b.getCurrentItem()).mo79971c();
        } else {
            m87196b(false);
        }
    }

    /* renamed from: a */
    public final void mo79987a(boolean z) {
        this.f100216o.mo80005a(z);
    }

    @C53771m
    public void onEvent(C39045e eVar) {
        if (this.f100205d != null) {
            this.f100205d.mo79102a(eVar);
        }
        dismiss();
    }

    /* renamed from: b */
    private void m87196b(boolean z) {
        this.f100219r = this.f100213l.getText().toString();
        this.f100216o.mo80004a(this.f100203b.getCurrentItem()).mo79969a(z, this.f100219r);
    }

    public void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        if (obj.contains("\n")) {
            C10691a.m21548c(getContext(), (int) R.string.ci5).mo19066a();
            int indexOf = obj.indexOf("\n");
            editable.replace(indexOf, indexOf + 1, "");
        }
    }

    public void onPageSelected(int i) {
        m87196b(true);
        C26890h.m65011a("search_poi_tab_change", C23089d.m56640a().mo47829a("enter_method", "slide").mo47829a("search_region_type", this.f100216o.mo80004a(i).getPoiSearchRegionType()).f61491a);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.c2j) {
            m87196b(true);
            m87197c();
        } else if (id == R.id.c2k) {
            dismiss();
        } else if (id == R.id.nh) {
            this.f100213l.setText("");
            m87196b(true);
        } else if (id == R.id.c2m) {
            m87197c();
        } else if (id == R.id.cax) {
            this.f100219r = this.f100213l.getText().toString();
            this.f100216o.mo80004a(this.f100203b.getCurrentItem()).mo79971c();
            C26890h.m65011a("reset_location", C23089d.m56640a().mo47829a("enter_from", "video_post_page").f61491a);
        } else {
            if (id == R.id.f5r) {
                if (this.f100204c == null) {
                    Context context = this.f100217p;
                    C39243m mVar = new C39243m(this);
                    C52711k.m112240b(context, "context");
                    C52711k.m112240b(mVar, "selectType");
                    this.f100204c = new PopupWindow();
                    this.f100204c.setOnDismissListener(new C39244n(this));
                }
                this.f100204c.showAsDropDown(this.f100211j);
                mo79986a(0.0f, -180.0f);
            }
        }
    }

    public C39241l(Context context, Bundle bundle) {
        this(context, 0, bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo79986a(float f, float f2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f100212k, "rotation", new float[]{f, f2});
        ofFloat.setDuration(0);
        ofFloat.start();
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (3 == i) {
            m87197c();
            m87196b(true);
        }
        return false;
    }

    private C39241l(Context context, int i, Bundle bundle) {
        super(context, R.style.vx);
        this.f100219r = "";
        setContentView(R.layout.bml);
        if (bundle != null) {
            this.f100218q = bundle.getString("candidateloc");
            this.f100220s = bundle.getBoolean("enable_global_search");
            this.f100221t = bundle.getBoolean("is_over_sea");
            this.f100222u = bundle.getBoolean("is_from_live");
            this.f100223v = bundle.getBoolean("is_in_room");
        }
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(34);
        }
        this.f100217p = context;
        this.f100206e = findViewById(R.id.csm);
        this.f100208g = (ImageView) findViewById(R.id.c2k);
        this.f100209h = (TextView) findViewById(R.id.c2o);
        this.f100211j = (ViewGroup) findViewById(R.id.f5r);
        this.f100212k = (ImageView) findViewById(R.id.g_);
        this.f100202a = (TextView) findViewById(R.id.euc);
        this.f100210i = (ImageView) findViewById(R.id.cax);
        this.f100213l = (EditText) findViewById(R.id.c2l);
        this.f100214m = (DmtTextView) findViewById(R.id.c2j);
        this.f100215n = findViewById(R.id.nh);
        this.f100203b = (ViewPager) findViewById(R.id.ds2);
        try {
            this.f100207f = ImmersionBar.with((Activity) this.f100217p, this, C39241l.class.getSimpleName());
            this.f100207f.statusBarColor((int) R.color.a8w).statusBarDarkFont(true).init();
        } catch (Exception unused) {
        }
        if (VERSION.SDK_INT >= 19) {
            this.f100206e.getLayoutParams().height = C11065a.m22390a(this.f100217p);
        }
        this.f100210i.setVisibility(0);
        findViewById(R.id.c2m).setOnClickListener(this);
        this.f100208g.setOnClickListener(this);
        this.f100210i.setOnClickListener(this);
        this.f100214m.setOnClickListener(this);
        this.f100213l.addTextChangedListener(this);
        this.f100213l.setOnEditorActionListener(this);
        this.f100215n.setOnClickListener(this);
        this.f100211j.setOnClickListener(this);
        if (this.f100222u) {
            this.f100209h.setText(R.string.h2h);
            this.f100213l.setHint(R.string.h2i);
        } else {
            this.f100209h.setText(R.string.eo);
            this.f100213l.setHint(R.string.db8);
        }
        if (this.f100220s) {
            this.f100211j.setVisibility(0);
        } else {
            this.f100211j.setVisibility(8);
        }
        C39248r rVar = new C39248r(this.f100217p, this.f100218q, this.f100220s, this, this.f100222u, this.f100223v);
        this.f100216o = rVar;
        this.f100203b.setAdapter(this.f100216o);
        this.f100203b.addOnPageChangeListener(this);
        mo79987a(this.f100222u);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i3 == 1 && !TextUtils.isEmpty(charSequence) && 10 == charSequence.toString().charAt(i)) {
            C10691a.m21548c(getContext(), (int) R.string.ci5).mo19066a();
            this.f100213l.getEditableText().delete(i, i + 1);
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (!C9431p.m18664a(this.f100219r)) {
                m87196b(true);
            }
            this.f100215n.setVisibility(8);
            return;
        }
        this.f100215n.setVisibility(0);
    }
}
