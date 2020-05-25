package android.support.p043v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p030v4.view.C1056u;
import android.support.p043v7.view.menu.C1264p.C1265a;
import android.support.p043v7.widget.C1451bb;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView.SelectionBoundsAdjuster;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.view.menu.ListMenuItemView */
public class ListMenuItemView extends LinearLayout implements C1265a, SelectionBoundsAdjuster {

    /* renamed from: a */
    private C1250j f4104a;

    /* renamed from: b */
    private ImageView f4105b;

    /* renamed from: c */
    private RadioButton f4106c;

    /* renamed from: d */
    private TextView f4107d;

    /* renamed from: e */
    private CheckBox f4108e;

    /* renamed from: f */
    private TextView f4109f;

    /* renamed from: g */
    private ImageView f4110g;

    /* renamed from: h */
    private ImageView f4111h;

    /* renamed from: i */
    private LinearLayout f4112i;

    /* renamed from: j */
    private Drawable f4113j;

    /* renamed from: k */
    private int f4114k;

    /* renamed from: l */
    private Context f4115l;

    /* renamed from: m */
    private boolean f4116m;

    /* renamed from: n */
    private Drawable f4117n;

    /* renamed from: o */
    private boolean f4118o;

    /* renamed from: p */
    private int f4119p;

    /* renamed from: q */
    private LayoutInflater f4120q;

    /* renamed from: r */
    private boolean f4121r;

    /* renamed from: a */
    public final boolean mo1037a() {
        return false;
    }

    public C1250j getItemData() {
        return this.f4104a;
    }

    /* renamed from: b */
    private void m3757b() {
        this.f4106c = (RadioButton) getInflater().inflate(R.layout.r, this, false);
        m3755a(this.f4106c);
    }

    /* renamed from: c */
    private void m3758c() {
        this.f4108e = (CheckBox) getInflater().inflate(R.layout.o, this, false);
        m3755a(this.f4108e);
    }

    private LayoutInflater getInflater() {
        if (this.f4120q == null) {
            this.f4120q = LayoutInflater.from(getContext());
        }
        return this.f4120q;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        C1056u.m3030a((View) this, this.f4113j);
        this.f4107d = (TextView) findViewById(R.id.title);
        if (this.f4114k != -1) {
            this.f4107d.setTextAppearance(this.f4115l, this.f4114k);
        }
        this.f4109f = (TextView) findViewById(R.id.co3);
        this.f4110g = (ImageView) findViewById(R.id.cuq);
        if (this.f4110g != null) {
            this.f4110g.setImageDrawable(this.f4117n);
        }
        this.f4111h = (ImageView) findViewById(R.id.amk);
        this.f4112i = (LinearLayout) findViewById(R.id.ze);
    }

    /* renamed from: a */
    private void m3755a(View view) {
        m3756a(view, -1);
    }

    public void setForceShowIcon(boolean z) {
        this.f4121r = z;
        this.f4116m = z;
    }

    private void setSubMenuArrowVisible(boolean z) {
        int i;
        if (this.f4110g != null) {
            ImageView imageView = this.f4110g;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f4104a.mo4171e()) {
            if (this.f4106c == null) {
                m3757b();
            }
            compoundButton = this.f4106c;
        } else {
            if (this.f4108e == null) {
                m3758c();
            }
            compoundButton = this.f4108e;
        }
        compoundButton.setChecked(z);
    }

    public void setGroupDividerEnabled(boolean z) {
        int i;
        if (this.f4111h != null) {
            ImageView imageView = this.f4111h;
            if (this.f4118o || !z) {
                i = 8;
            } else {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        if (this.f4111h != null && this.f4111h.getVisibility() == 0) {
            LayoutParams layoutParams = (LayoutParams) this.f4111h.getLayoutParams();
            rect.top += this.f4111h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f4107d.setText(charSequence);
            if (this.f4107d.getVisibility() != 0) {
                this.f4107d.setVisibility(0);
            }
        } else if (this.f4107d.getVisibility() != 8) {
            this.f4107d.setVisibility(8);
        }
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f4106c != null || this.f4108e != null) {
            if (this.f4104a.mo4171e()) {
                if (this.f4106c == null) {
                    m3757b();
                }
                compoundButton2 = this.f4106c;
                compoundButton = this.f4108e;
            } else {
                if (this.f4108e == null) {
                    m3758c();
                }
                compoundButton2 = this.f4108e;
                compoundButton = this.f4106c;
            }
            if (z) {
                compoundButton2.setChecked(this.f4104a.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (!(compoundButton == null || compoundButton.getVisibility() == 8)) {
                    compoundButton.setVisibility(8);
                }
            } else {
                if (this.f4108e != null) {
                    this.f4108e.setVisibility(8);
                }
                if (this.f4106c != null) {
                    this.f4106c.setVisibility(8);
                }
            }
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z;
        if (this.f4104a.f4252d.f4224j || this.f4121r) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !this.f4116m) {
            return;
        }
        if (this.f4105b != null || drawable != null || this.f4116m) {
            if (this.f4105b == null) {
                this.f4105b = (ImageView) getInflater().inflate(R.layout.p, this, false);
                m3756a((View) this.f4105b, 0);
            }
            if (drawable != null || this.f4116m) {
                ImageView imageView = this.f4105b;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f4105b.getVisibility() != 0) {
                    this.f4105b.setVisibility(0);
                }
            } else {
                this.f4105b.setVisibility(8);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ss);
    }

    /* renamed from: a */
    private void m3756a(View view, int i) {
        if (this.f4112i != null) {
            this.f4112i.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f4105b != null && this.f4116m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) this.f4105b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    public final void mo1036a(C1250j jVar, int i) {
        int i2;
        String str;
        int i3;
        this.f4104a = jVar;
        int i4 = 0;
        this.f4119p = 0;
        if (jVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setTitle(jVar.mo4161a((C1265a) this));
        setCheckable(jVar.isCheckable());
        boolean d = jVar.mo4169d();
        jVar.mo4166c();
        if (!d || !this.f4104a.mo4169d()) {
            i4 = 8;
        }
        if (i4 == 0) {
            TextView textView = this.f4109f;
            C1250j jVar2 = this.f4104a;
            char c = jVar2.mo4166c();
            if (c == 0) {
                str = "";
            } else {
                Resources resources = jVar2.f4252d.f4215a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(jVar2.f4252d.f4215a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.bo));
                }
                if (jVar2.f4252d.mo4129c()) {
                    i3 = jVar2.f4251c;
                } else {
                    i3 = jVar2.f4250b;
                }
                C1250j.m3871a(sb, i3, 65536, resources.getString(R.string.bk));
                C1250j.m3871a(sb, i3, 4096, resources.getString(R.string.bg));
                C1250j.m3871a(sb, i3, 2, resources.getString(R.string.bf));
                C1250j.m3871a(sb, i3, 1, resources.getString(R.string.bl));
                C1250j.m3871a(sb, i3, 4, resources.getString(R.string.bn));
                C1250j.m3871a(sb, i3, 8, resources.getString(R.string.bj));
                if (c == 8) {
                    sb.append(resources.getString(R.string.bh));
                } else if (c == 10) {
                    sb.append(resources.getString(R.string.bi));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(R.string.bm));
                }
                str = sb.toString();
            }
            textView.setText(str);
        }
        if (this.f4109f.getVisibility() != i4) {
            this.f4109f.setVisibility(i4);
        }
        setIcon(jVar.getIcon());
        setEnabled(jVar.isEnabled());
        setSubMenuArrowVisible(jVar.hasSubMenu());
        setContentDescription(jVar.getContentDescription());
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C1451bb a = C1451bb.m5032a(getContext(), attributeSet, new int[]{16842926, 16843052, 16843053, 16843054, 16843055, 16843056, 16843057, R.attr.vv, R.attr.a3q}, i, 0);
        this.f4113j = a.mo5652a(5);
        this.f4114k = a.mo5665g(1, -1);
        this.f4116m = a.mo5654a(7, false);
        this.f4115l = context;
        this.f4117n = a.mo5652a(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.k3, 0);
        this.f4118o = obtainStyledAttributes.hasValue(0);
        a.mo5653a();
        obtainStyledAttributes.recycle();
    }
}
