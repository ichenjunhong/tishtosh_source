package android.support.p043v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p030v4.graphics.drawable.C0809a;
import android.support.p030v4.p031a.p032a.C0576b;
import android.support.p030v4.view.C1019b;
import android.support.p030v4.view.C1019b.C1021b;
import android.support.p043v7.p044a.p045a.C1124a;
import android.support.p043v7.view.menu.C1264p.C1265a;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;

/* renamed from: android.support.v7.view.menu.j */
public final class C1250j implements C0576b {

    /* renamed from: A */
    private int f4244A;

    /* renamed from: B */
    private View f4245B;

    /* renamed from: C */
    private C1019b f4246C;

    /* renamed from: D */
    private OnActionExpandListener f4247D;

    /* renamed from: E */
    private boolean f4248E;

    /* renamed from: a */
    public final int f4249a;

    /* renamed from: b */
    int f4250b = 4096;

    /* renamed from: c */
    int f4251c = 4096;

    /* renamed from: d */
    C1246h f4252d;

    /* renamed from: e */
    public Runnable f4253e;

    /* renamed from: f */
    public ContextMenuInfo f4254f;

    /* renamed from: g */
    private final int f4255g;

    /* renamed from: h */
    private final int f4256h;

    /* renamed from: i */
    private final int f4257i;

    /* renamed from: j */
    private CharSequence f4258j;

    /* renamed from: k */
    private CharSequence f4259k;

    /* renamed from: l */
    private Intent f4260l;

    /* renamed from: m */
    private char f4261m;

    /* renamed from: n */
    private char f4262n;

    /* renamed from: o */
    private Drawable f4263o;

    /* renamed from: p */
    private int f4264p;

    /* renamed from: q */
    private C1272u f4265q;

    /* renamed from: r */
    private OnMenuItemClickListener f4266r;

    /* renamed from: s */
    private CharSequence f4267s;

    /* renamed from: t */
    private CharSequence f4268t;

    /* renamed from: u */
    private ColorStateList f4269u;

    /* renamed from: v */
    private Mode f4270v;

    /* renamed from: w */
    private boolean f4271w;

    /* renamed from: x */
    private boolean f4272x;

    /* renamed from: y */
    private boolean f4273y;

    /* renamed from: z */
    private int f4274z = 16;

    /* renamed from: a */
    public final C1019b mo1778a() {
        return this.f4246C;
    }

    public final int getAlphabeticModifiers() {
        return this.f4251c;
    }

    public final char getAlphabeticShortcut() {
        return this.f4262n;
    }

    public final CharSequence getContentDescription() {
        return this.f4267s;
    }

    public final int getGroupId() {
        return this.f4256h;
    }

    public final ColorStateList getIconTintList() {
        return this.f4269u;
    }

    public final Mode getIconTintMode() {
        return this.f4270v;
    }

    public final Intent getIntent() {
        return this.f4260l;
    }

    @CapturedViewProperty
    public final int getItemId() {
        return this.f4255g;
    }

    public final ContextMenuInfo getMenuInfo() {
        return this.f4254f;
    }

    public final int getNumericModifiers() {
        return this.f4250b;
    }

    public final char getNumericShortcut() {
        return this.f4261m;
    }

    public final int getOrder() {
        return this.f4257i;
    }

    public final SubMenu getSubMenu() {
        return this.f4265q;
    }

    @CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f4258j;
    }

    public final CharSequence getTooltipText() {
        return this.f4268t;
    }

    public final boolean isActionViewExpanded() {
        return this.f4248E;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final boolean hasSubMenu() {
        if (this.f4265q != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final char mo4166c() {
        if (this.f4252d.mo4129c()) {
            return this.f4262n;
        }
        return this.f4261m;
    }

    /* renamed from: f */
    public final boolean mo4172f() {
        if ((this.f4274z & 32) == 32) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo4173g() {
        if ((this.f4244A & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo4186h() {
        if ((this.f4244A & 2) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo4188i() {
        if ((this.f4244A & 4) == 4) {
            return true;
        }
        return false;
    }

    public final boolean isCheckable() {
        if ((this.f4274z & 1) == 1) {
            return true;
        }
        return false;
    }

    public final boolean isChecked() {
        if ((this.f4274z & 2) == 2) {
            return true;
        }
        return false;
    }

    public final boolean isEnabled() {
        if ((this.f4274z & 16) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        if (this.f4258j != null) {
            return this.f4258j.toString();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo4169d() {
        if (!this.f4252d.mo4135d() || mo4166c() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo4171e() {
        if ((this.f4274z & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean expandActionView() {
        if (!mo4193j()) {
            return false;
        }
        if (this.f4247D == null || this.f4247D.onMenuItemActionExpand(this)) {
            return this.f4252d.mo4130c(this);
        }
        return false;
    }

    public final View getActionView() {
        if (this.f4245B != null) {
            return this.f4245B;
        }
        if (this.f4246C == null) {
            return null;
        }
        this.f4245B = this.f4246C.mo3193a((MenuItem) this);
        return this.f4245B;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence;
        if (this.f4259k != null) {
            charSequence = this.f4259k;
        } else {
            charSequence = this.f4258j;
        }
        if (VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) {
            return charSequence;
        }
        return charSequence.toString();
    }

    /* renamed from: j */
    public final boolean mo4193j() {
        if ((this.f4244A & 8) == 0) {
            return false;
        }
        if (this.f4245B == null && this.f4246C != null) {
            this.f4245B = this.f4246C.mo3193a((MenuItem) this);
        }
        if (this.f4245B != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo4165b() {
        if ((this.f4266r != null && this.f4266r.onMenuItemClick(this)) || this.f4252d.mo4112a(this.f4252d, (MenuItem) this)) {
            return true;
        }
        if (this.f4253e != null) {
            this.f4253e.run();
            return true;
        }
        if (this.f4260l != null) {
            try {
                this.f4252d.f4215a.startActivity(this.f4260l);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        if (this.f4246C == null || !this.f4246C.mo3199d()) {
            return false;
        }
        return true;
    }

    public final boolean collapseActionView() {
        if ((this.f4244A & 8) == 0) {
            return false;
        }
        if (this.f4245B == null) {
            return true;
        }
        if (this.f4247D == null || this.f4247D.onMenuItemActionCollapse(this)) {
            return this.f4252d.mo4136d(this);
        }
        return false;
    }

    public final Drawable getIcon() {
        if (this.f4263o != null) {
            return m3869a(this.f4263o);
        }
        if (this.f4264p == 0) {
            return null;
        }
        Drawable b = C1124a.m3315b(this.f4252d.f4215a, this.f4264p);
        this.f4264p = 0;
        this.f4263o = b;
        return m3869a(b);
    }

    public final boolean isVisible() {
        if (this.f4246C == null || !this.f4246C.mo3197b()) {
            if ((this.f4274z & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.f4274z & 8) != 0 || !this.f4246C.mo3198c()) {
            return false;
        } else {
            return true;
        }
    }

    public final MenuItem setIntent(Intent intent) {
        this.f4260l = intent;
        return this;
    }

    public final MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.f4247D = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f4266r = onMenuItemClickListener;
        return this;
    }

    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    /* renamed from: a */
    public final C0576b setContentDescription(CharSequence charSequence) {
        this.f4267s = charSequence;
        this.f4252d.mo1150a(false);
        return this;
    }

    /* renamed from: b */
    public final C0576b setTooltipText(CharSequence charSequence) {
        this.f4268t = charSequence;
        this.f4252d.mo1150a(false);
        return this;
    }

    /* renamed from: d */
    public final void mo4168d(boolean z) {
        if (z) {
            this.f4274z |= 32;
        } else {
            this.f4274z &= -33;
        }
    }

    /* renamed from: e */
    public final void mo4170e(boolean z) {
        this.f4248E = z;
        this.f4252d.mo1150a(false);
    }

    public final MenuItem setIcon(int i) {
        this.f4263o = null;
        this.f4264p = i;
        this.f4273y = true;
        this.f4252d.mo1150a(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f4269u = colorStateList;
        this.f4271w = true;
        this.f4273y = true;
        this.f4252d.mo1150a(false);
        return this;
    }

    public final MenuItem setIconTintMode(Mode mode) {
        this.f4270v = mode;
        this.f4272x = true;
        this.f4273y = true;
        this.f4252d.mo1150a(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        if (this.f4261m == c) {
            return this;
        }
        this.f4261m = c;
        this.f4252d.mo1150a(false);
        return this;
    }

    public final MenuItem setTitle(int i) {
        return setTitle((CharSequence) this.f4252d.f4215a.getString(i));
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4259k = charSequence;
        this.f4252d.mo1150a(false);
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        if (mo4167c(z)) {
            this.f4252d.mo4109a(this);
        }
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C0576b setActionView(View view) {
        this.f4245B = view;
        this.f4246C = null;
        if (view != null && view.getId() == -1 && this.f4255g > 0) {
            view.setId(this.f4255g);
        }
        this.f4252d.mo4124b(this);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo4164b(boolean z) {
        int i;
        int i2 = this.f4274z;
        int i3 = this.f4274z & -3;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        this.f4274z = i | i3;
        if (i2 != this.f4274z) {
            this.f4252d.mo1150a(false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo4167c(boolean z) {
        int i;
        int i2 = this.f4274z;
        int i3 = this.f4274z & -9;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        this.f4274z = i | i3;
        if (i2 != this.f4274z) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ MenuItem setActionView(int i) {
        Context context = this.f4252d.f4215a;
        setActionView(LayoutInflater.from(context).inflate(i, new LinearLayout(context), false));
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f4262n == c) {
            return this;
        }
        this.f4262n = Character.toLowerCase(c);
        this.f4252d.mo1150a(false);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        int i = this.f4274z;
        this.f4274z = z | (this.f4274z & true) ? 1 : 0;
        if (i != this.f4274z) {
            this.f4252d.mo1150a(false);
        }
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f4274z |= 16;
        } else {
            this.f4274z &= -17;
        }
        this.f4252d.mo1150a(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f4264p = 0;
        this.f4263o = drawable;
        this.f4273y = true;
        this.f4252d.mo1150a(false);
        return this;
    }

    public final void setShowAsAction(int i) {
        switch (i & 3) {
            case 0:
            case 1:
            case 2:
                this.f4244A = i;
                this.f4252d.mo4124b(this);
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f4258j = charSequence;
        this.f4252d.mo1150a(false);
        if (this.f4265q != null) {
            this.f4265q.setHeaderTitle(charSequence);
        }
        return this;
    }

    /* renamed from: a */
    private Drawable m3869a(Drawable drawable) {
        if (drawable != null && this.f4273y && (this.f4271w || this.f4272x)) {
            drawable = C0809a.m2337f(drawable).mutate();
            if (this.f4271w) {
                C0809a.m2327a(drawable, this.f4269u);
            }
            if (this.f4272x) {
                C0809a.m2330a(drawable, this.f4270v);
            }
            this.f4273y = false;
        }
        return drawable;
    }

    /* renamed from: a */
    public final C0576b mo1776a(C1019b bVar) {
        if (this.f4246C != null) {
            C1019b bVar2 = this.f4246C;
            bVar2.f3274c = null;
            bVar2.f3273b = null;
        }
        this.f4245B = null;
        this.f4246C = bVar;
        this.f4252d.mo1150a(true);
        if (this.f4246C != null) {
            this.f4246C.mo3194a((C1021b) new C1021b() {
                /* renamed from: a */
                public final void mo3202a(boolean z) {
                    C1250j.this.f4252d.mo4109a(C1250j.this);
                }
            });
        }
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        boolean z2;
        if ((this.f4274z & 4) != 0) {
            C1246h hVar = this.f4252d;
            int groupId = getGroupId();
            int size = hVar.f4218d.size();
            hVar.mo4137e();
            for (int i = 0; i < size; i++) {
                C1250j jVar = (C1250j) hVar.f4218d.get(i);
                if (jVar.getGroupId() == groupId && jVar.mo4171e() && jVar.isCheckable()) {
                    if (jVar == this) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    jVar.mo4164b(z2);
                }
            }
            hVar.mo4138f();
        } else {
            mo4164b(z);
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final CharSequence mo4161a(C1265a aVar) {
        if (aVar.mo1037a()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    /* renamed from: a */
    public final void mo4162a(C1272u uVar) {
        this.f4265q = uVar;
        uVar.setHeaderTitle(getTitle());
    }

    /* renamed from: a */
    public final void mo4163a(boolean z) {
        int i;
        int i2 = this.f4274z & -5;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        this.f4274z = i | i2;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f4261m = c;
        this.f4262n = Character.toLowerCase(c2);
        this.f4252d.mo1150a(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f4261m == c && this.f4250b == i) {
            return this;
        }
        this.f4261m = c;
        this.f4250b = KeyEvent.normalizeMetaState(i);
        this.f4252d.mo1150a(false);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f4262n == c && this.f4251c == i) {
            return this;
        }
        this.f4262n = Character.toLowerCase(c);
        this.f4251c = KeyEvent.normalizeMetaState(i);
        this.f4252d.mo1150a(false);
        return this;
    }

    /* renamed from: a */
    static void m3871a(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f4261m = c;
        this.f4250b = KeyEvent.normalizeMetaState(i);
        this.f4262n = Character.toLowerCase(c2);
        this.f4251c = KeyEvent.normalizeMetaState(i2);
        this.f4252d.mo1150a(false);
        return this;
    }

    C1250j(C1246h hVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f4252d = hVar;
        this.f4255g = i2;
        this.f4256h = i;
        this.f4257i = i3;
        this.f4249a = i4;
        this.f4258j = charSequence;
        this.f4244A = i5;
    }
}
