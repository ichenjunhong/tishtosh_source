package android.support.p043v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.p030v4.p031a.p032a.C0575a;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;

/* renamed from: android.support.v7.view.menu.r */
class C1267r extends C1235c<C0575a> implements Menu {
    public void close() {
        ((C0575a) this.f4157d).close();
    }

    public boolean hasVisibleItems() {
        return ((C0575a) this.f4157d).hasVisibleItems();
    }

    public int size() {
        return ((C0575a) this.f4157d).size();
    }

    public void clear() {
        if (this.f4155b != null) {
            this.f4155b.clear();
        }
        if (this.f4156c != null) {
            this.f4156c.clear();
        }
        ((C0575a) this.f4157d).clear();
    }

    public void setQwertyMode(boolean z) {
        ((C0575a) this.f4157d).setQwertyMode(z);
    }

    public MenuItem add(int i) {
        return mo4065a(((C0575a) this.f4157d).add(i));
    }

    public SubMenu addSubMenu(int i) {
        return mo4066a(((C0575a) this.f4157d).addSubMenu(i));
    }

    public MenuItem findItem(int i) {
        return mo4065a(((C0575a) this.f4157d).findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo4065a(((C0575a) this.f4157d).getItem(i));
    }

    public void removeGroup(int i) {
        if (this.f4155b != null) {
            Iterator it = this.f4155b.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getGroupId()) {
                    it.remove();
                }
            }
        }
        ((C0575a) this.f4157d).removeGroup(i);
    }

    public void removeItem(int i) {
        if (this.f4155b != null) {
            Iterator it = this.f4155b.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (i == ((MenuItem) it.next()).getItemId()) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        ((C0575a) this.f4157d).removeItem(i);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo4065a(((C0575a) this.f4157d).add(charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo4066a(((C0575a) this.f4157d).addSubMenu(charSequence));
    }

    C1267r(Context context, C0575a aVar) {
        super(context, aVar);
    }

    public void setGroupEnabled(int i, boolean z) {
        ((C0575a) this.f4157d).setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        ((C0575a) this.f4157d).setGroupVisible(i, z);
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((C0575a) this.f4157d).isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return ((C0575a) this.f4157d).performIdentifierAction(i, i2);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((C0575a) this.f4157d).setGroupCheckable(i, z, z2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((C0575a) this.f4157d).performShortcut(i, keyEvent, i2);
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo4065a(((C0575a) this.f4157d).add(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo4066a(((C0575a) this.f4157d).addSubMenu(i, i2, i3, i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo4065a(((C0575a) this.f4157d).add(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo4066a(((C0575a) this.f4157d).addSubMenu(i, i2, i3, charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        MenuItem[] menuItemArr3 = menuItemArr;
        if (menuItemArr3 != null) {
            menuItemArr2 = new MenuItem[menuItemArr3.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = ((C0575a) this.f4157d).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr3[i5] = mo4065a(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }
}
