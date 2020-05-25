package android.support.p043v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.graphics.drawable.C0809a;
import android.support.p030v4.p031a.p032a.C0576b;
import android.support.p030v4.view.C1019b;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.a */
public final class C1233a implements C0576b {

    /* renamed from: a */
    private final int f4122a;

    /* renamed from: b */
    private final int f4123b;

    /* renamed from: c */
    private final int f4124c;

    /* renamed from: d */
    private final int f4125d;

    /* renamed from: e */
    private CharSequence f4126e;

    /* renamed from: f */
    private CharSequence f4127f;

    /* renamed from: g */
    private Intent f4128g;

    /* renamed from: h */
    private char f4129h;

    /* renamed from: i */
    private int f4130i = 4096;

    /* renamed from: j */
    private char f4131j;

    /* renamed from: k */
    private int f4132k = 4096;

    /* renamed from: l */
    private Drawable f4133l;

    /* renamed from: m */
    private int f4134m;

    /* renamed from: n */
    private Context f4135n;

    /* renamed from: o */
    private OnMenuItemClickListener f4136o;

    /* renamed from: p */
    private CharSequence f4137p;

    /* renamed from: q */
    private CharSequence f4138q;

    /* renamed from: r */
    private ColorStateList f4139r;

    /* renamed from: s */
    private Mode f4140s;

    /* renamed from: t */
    private boolean f4141t;

    /* renamed from: u */
    private boolean f4142u;

    /* renamed from: v */
    private int f4143v = 16;

    /* renamed from: a */
    public final C1019b mo1778a() {
        return null;
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final View getActionView() {
        return null;
    }

    public final int getAlphabeticModifiers() {
        return this.f4132k;
    }

    public final char getAlphabeticShortcut() {
        return this.f4131j;
    }

    public final CharSequence getContentDescription() {
        return this.f4137p;
    }

    public final int getGroupId() {
        return this.f4123b;
    }

    public final Drawable getIcon() {
        return this.f4133l;
    }

    public final ColorStateList getIconTintList() {
        return this.f4139r;
    }

    public final Mode getIconTintMode() {
        return this.f4140s;
    }

    public final Intent getIntent() {
        return this.f4128g;
    }

    public final int getItemId() {
        return this.f4122a;
    }

    public final ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f4130i;
    }

    public final char getNumericShortcut() {
        return this.f4129h;
    }

    public final int getOrder() {
        return this.f4125d;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.f4126e;
    }

    public final CharSequence getTooltipText() {
        return this.f4138q;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final void setShowAsAction(int i) {
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final CharSequence getTitleCondensed() {
        if (this.f4127f != null) {
            return this.f4127f;
        }
        return this.f4126e;
    }

    public final boolean isCheckable() {
        if ((this.f4143v & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isChecked() {
        if ((this.f4143v & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isEnabled() {
        if ((this.f4143v & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isVisible() {
        if ((this.f4143v & 8) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m3761b() {
        if (this.f4133l == null) {
            return;
        }
        if (this.f4141t || this.f4142u) {
            this.f4133l = C0809a.m2337f(this.f4133l);
            this.f4133l = this.f4133l.mutate();
            if (this.f4141t) {
                C0809a.m2327a(this.f4133l, this.f4139r);
            }
            if (this.f4142u) {
                C0809a.m2330a(this.f4133l, this.f4140s);
            }
        }
    }

    /* renamed from: a */
    public final C0576b setContentDescription(CharSequence charSequence) {
        this.f4137p = charSequence;
        return this;
    }

    /* renamed from: b */
    public final C0576b setTooltipText(CharSequence charSequence) {
        this.f4138q = charSequence;
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f4128g = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        this.f4129h = c;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f4136o = onMenuItemClickListener;
        return this;
    }

    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f4126e = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4127f = charSequence;
        return this;
    }

    /* renamed from: a */
    public final C0576b mo1776a(C1019b bVar) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        this.f4131j = Character.toLowerCase(c);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.f4143v = z | (this.f4143v & true) ? 1 : 0;
        return this;
    }

    public final MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setChecked(boolean z) {
        int i;
        int i2 = this.f4143v & -3;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        this.f4143v = i | i2;
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        int i;
        int i2 = this.f4143v & -17;
        if (z) {
            i = 16;
        } else {
            i = 0;
        }
        this.f4143v = i | i2;
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f4134m = i;
        this.f4133l = C0726c.m2091a(this.f4135n, i);
        m3761b();
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f4139r = colorStateList;
        this.f4141t = true;
        m3761b();
        return this;
    }

    public final MenuItem setIconTintMode(Mode mode) {
        this.f4140s = mode;
        this.f4142u = true;
        m3761b();
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.f4126e = this.f4135n.getResources().getString(i);
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f4143v & 8;
        if (z) {
            i = 0;
        }
        this.f4143v = i2 | i;
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f4133l = drawable;
        this.f4134m = 0;
        m3761b();
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f4131j = Character.toLowerCase(c);
        this.f4132k = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        this.f4129h = c;
        this.f4130i = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f4129h = c;
        this.f4131j = Character.toLowerCase(c2);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f4129h = c;
        this.f4130i = KeyEvent.normalizeMetaState(i);
        this.f4131j = Character.toLowerCase(c2);
        this.f4132k = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public C1233a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f4135n = context;
        this.f4122a = 16908332;
        this.f4123b = 0;
        this.f4124c = 0;
        this.f4125d = 0;
        this.f4126e = charSequence;
    }
}
