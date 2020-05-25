package android.support.p043v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p043v7.view.menu.C1245g;
import android.support.p043v7.view.menu.C1246h;
import android.support.p043v7.view.menu.C1250j;
import android.support.p043v7.view.menu.ListMenuItemView;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.ai */
public final class C1418ai extends ListPopupWindow implements C1417ah {

    /* renamed from: b */
    private static Method f5112b;

    /* renamed from: a */
    public C1417ah f5113a;

    /* renamed from: android.support.v7.widget.ai$a */
    public static class C1419a extends C1519z {

        /* renamed from: c */
        final int f5114c;

        /* renamed from: d */
        final int f5115d;

        /* renamed from: e */
        private C1417ah f5116e;

        /* renamed from: f */
        private MenuItem f5117f;

        public final /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public final /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public final /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public final /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public final void setHoverListener(C1417ah ahVar) {
            this.f5116e = ahVar;
        }

        public final /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }

        public final /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public final boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            C1245g gVar;
            if (this.f5116e != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    gVar = (C1245g) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    gVar = (C1245g) adapter;
                }
                C1250j jVar = null;
                if (motionEvent.getAction() != 10) {
                    int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                    if (pointToPosition != -1) {
                        int i2 = pointToPosition - i;
                        if (i2 >= 0 && i2 < gVar.getCount()) {
                            jVar = gVar.getItem(i2);
                        }
                    }
                }
                MenuItem menuItem = this.f5117f;
                if (menuItem != jVar) {
                    C1246h hVar = gVar.f4207a;
                    if (menuItem != null) {
                        this.f5116e.mo4085a(hVar, menuItem);
                    }
                    this.f5117f = jVar;
                    if (jVar != null) {
                        this.f5116e.mo4086b(hVar, jVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo5503a(MotionEvent motionEvent, int i) {
            return super.mo5503a(motionEvent, i);
        }

        public C1419a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f5114c = 22;
                this.f5115d = 21;
                return;
            }
            this.f5114c = 21;
            this.f5115d = 22;
        }

        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f5114c) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f5115d) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C1245g) getAdapter()).f4207a.mo4126b(false);
                return true;
            }
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ int mo5502a(int i, int i2, int i3, int i4, int i5) {
            return super.mo5502a(i, i2, i3, i4, i5);
        }
    }

    static {
        try {
            f5112b = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
        }
    }

    /* renamed from: c */
    public final void mo5501c(boolean z) {
        if (f5112b != null) {
            try {
                f5112b.invoke(this.f4620w, new Object[]{Boolean.valueOf(false)});
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo5500a(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.f4620w.setEnterTransition(null);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C1519z mo4768a(Context context, boolean z) {
        C1419a aVar = new C1419a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    /* renamed from: b */
    public final void mo4086b(C1246h hVar, MenuItem menuItem) {
        if (this.f5113a != null) {
            this.f5113a.mo4086b(hVar, menuItem);
        }
    }

    /* renamed from: a */
    public final void mo4085a(C1246h hVar, MenuItem menuItem) {
        if (this.f5113a != null) {
            this.f5113a.mo4085a(hVar, menuItem);
        }
    }

    public C1418ai(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, null, i, i2);
    }
}
