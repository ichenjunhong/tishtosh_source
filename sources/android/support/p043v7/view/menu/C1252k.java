package android.support.p043v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p030v4.p031a.p032a.C0576b;
import android.support.p030v4.view.C1019b;
import android.support.p043v7.view.C1220c;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.view.menu.k */
public class C1252k extends C1235c<C0576b> implements MenuItem {

    /* renamed from: e */
    public Method f4276e;

    /* renamed from: android.support.v7.view.menu.k$a */
    class C1253a extends C1019b {

        /* renamed from: d */
        final ActionProvider f4277d;

        /* renamed from: a */
        public final View mo3192a() {
            return this.f4277d.onCreateActionView();
        }

        /* renamed from: d */
        public final boolean mo3199d() {
            return this.f4277d.onPerformDefaultAction();
        }

        /* renamed from: e */
        public final boolean mo3200e() {
            return this.f4277d.hasSubMenu();
        }

        /* renamed from: a */
        public final void mo3195a(SubMenu subMenu) {
            this.f4277d.onPrepareSubMenu(C1252k.this.mo4066a(subMenu));
        }

        public C1253a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f4277d = actionProvider;
        }
    }

    /* renamed from: android.support.v7.view.menu.k$b */
    static class C1254b extends FrameLayout implements C1220c {

        /* renamed from: a */
        final CollapsibleActionView f4279a;

        /* renamed from: a */
        public final void mo3938a() {
            this.f4279a.onActionViewExpanded();
        }

        /* renamed from: b */
        public final void mo3939b() {
            this.f4279a.onActionViewCollapsed();
        }

        C1254b(View view) {
            super(view.getContext());
            this.f4279a = (CollapsibleActionView) view;
            addView(view);
        }
    }

    /* renamed from: android.support.v7.view.menu.k$c */
    class C1255c extends C1236d<OnActionExpandListener> implements OnActionExpandListener {
        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return ((OnActionExpandListener) this.f4157d).onMenuItemActionCollapse(C1252k.this.mo4065a(menuItem));
        }

        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return ((OnActionExpandListener) this.f4157d).onMenuItemActionExpand(C1252k.this.mo4065a(menuItem));
        }

        C1255c(OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }
    }

    /* renamed from: android.support.v7.view.menu.k$d */
    class C1256d extends C1236d<OnMenuItemClickListener> implements OnMenuItemClickListener {
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return ((OnMenuItemClickListener) this.f4157d).onMenuItemClick(C1252k.this.mo4065a(menuItem));
        }

        C1256d(OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }
    }

    public boolean collapseActionView() {
        return ((C0576b) this.f4157d).collapseActionView();
    }

    public boolean expandActionView() {
        return ((C0576b) this.f4157d).expandActionView();
    }

    public int getAlphabeticModifiers() {
        return ((C0576b) this.f4157d).getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return ((C0576b) this.f4157d).getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return ((C0576b) this.f4157d).getContentDescription();
    }

    public int getGroupId() {
        return ((C0576b) this.f4157d).getGroupId();
    }

    public Drawable getIcon() {
        return ((C0576b) this.f4157d).getIcon();
    }

    public ColorStateList getIconTintList() {
        return ((C0576b) this.f4157d).getIconTintList();
    }

    public Mode getIconTintMode() {
        return ((C0576b) this.f4157d).getIconTintMode();
    }

    public Intent getIntent() {
        return ((C0576b) this.f4157d).getIntent();
    }

    public int getItemId() {
        return ((C0576b) this.f4157d).getItemId();
    }

    public ContextMenuInfo getMenuInfo() {
        return ((C0576b) this.f4157d).getMenuInfo();
    }

    public int getNumericModifiers() {
        return ((C0576b) this.f4157d).getNumericModifiers();
    }

    public char getNumericShortcut() {
        return ((C0576b) this.f4157d).getNumericShortcut();
    }

    public int getOrder() {
        return ((C0576b) this.f4157d).getOrder();
    }

    public SubMenu getSubMenu() {
        return mo4066a(((C0576b) this.f4157d).getSubMenu());
    }

    public CharSequence getTitle() {
        return ((C0576b) this.f4157d).getTitle();
    }

    public CharSequence getTitleCondensed() {
        return ((C0576b) this.f4157d).getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return ((C0576b) this.f4157d).getTooltipText();
    }

    public boolean hasSubMenu() {
        return ((C0576b) this.f4157d).hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return ((C0576b) this.f4157d).isActionViewExpanded();
    }

    public boolean isCheckable() {
        return ((C0576b) this.f4157d).isCheckable();
    }

    public boolean isChecked() {
        return ((C0576b) this.f4157d).isChecked();
    }

    public boolean isEnabled() {
        return ((C0576b) this.f4157d).isEnabled();
    }

    public boolean isVisible() {
        return ((C0576b) this.f4157d).isVisible();
    }

    public ActionProvider getActionProvider() {
        C1019b a = ((C0576b) this.f4157d).mo1778a();
        if (a instanceof C1253a) {
            return ((C1253a) a).f4277d;
        }
        return null;
    }

    public View getActionView() {
        View actionView = ((C0576b) this.f4157d).getActionView();
        if (actionView instanceof C1254b) {
            return (View) ((C1254b) actionView).f4279a;
        }
        return actionView;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1253a mo4213a(ActionProvider actionProvider) {
        return new C1253a(this.f4154a, actionProvider);
    }

    public MenuItem setAlphabeticShortcut(char c) {
        ((C0576b) this.f4157d).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        ((C0576b) this.f4157d).setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        ((C0576b) this.f4157d).setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        ((C0576b) this.f4157d).mo1777a(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        ((C0576b) this.f4157d).setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        ((C0576b) this.f4157d).setIcon(i);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((C0576b) this.f4157d).setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        ((C0576b) this.f4157d).setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        ((C0576b) this.f4157d).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        ((C0576b) this.f4157d).setNumericShortcut(c);
        return this;
    }

    public void setShowAsAction(int i) {
        ((C0576b) this.f4157d).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((C0576b) this.f4157d).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        ((C0576b) this.f4157d).setTitle(i);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((C0576b) this.f4157d).setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        ((C0576b) this.f4157d).mo1779b(charSequence);
        return this;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        C1253a aVar;
        C0576b bVar = (C0576b) this.f4157d;
        if (actionProvider != null) {
            aVar = mo4213a(actionProvider);
        } else {
            aVar = null;
        }
        bVar.mo1776a((C1019b) aVar);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        ((C0576b) this.f4157d).setIcon(drawable);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((C0576b) this.f4157d).setTitle(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return ((C0576b) this.f4157d).setVisible(z);
    }

    public MenuItem setActionView(int i) {
        ((C0576b) this.f4157d).setActionView(i);
        View actionView = ((C0576b) this.f4157d).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((C0576b) this.f4157d).setActionView((View) new C1254b(actionView));
        }
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        C1255c cVar;
        C0576b bVar = (C0576b) this.f4157d;
        if (onActionExpandListener != null) {
            cVar = new C1255c(onActionExpandListener);
        } else {
            cVar = null;
        }
        bVar.setOnActionExpandListener(cVar);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        C1256d dVar;
        C0576b bVar = (C0576b) this.f4157d;
        if (onMenuItemClickListener != null) {
            dVar = new C1256d(onMenuItemClickListener);
        } else {
            dVar = null;
        }
        bVar.setOnMenuItemClickListener(dVar);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C1254b(view);
        }
        ((C0576b) this.f4157d).setActionView(view);
        return this;
    }

    C1252k(Context context, C0576b bVar) {
        super(context, bVar);
    }

    public MenuItem setShortcut(char c, char c2) {
        ((C0576b) this.f4157d).setShortcut(c, c2);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        ((C0576b) this.f4157d).setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        ((C0576b) this.f4157d).setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        ((C0576b) this.f4157d).setShortcut(c, c2, i, i2);
        return this;
    }
}
