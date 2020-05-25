package android.support.design.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p019b.C0304o;
import android.support.p043v7.view.menu.C1246h;
import android.support.p043v7.view.menu.C1250j;
import android.support.p043v7.view.menu.C1262o;
import android.support.p043v7.view.menu.C1262o.C1263a;
import android.support.p043v7.view.menu.C1272u;
import android.view.MenuItem;

public final class BottomNavigationPresenter implements C1262o {

    /* renamed from: a */
    public BottomNavigationMenuView f1471a;

    /* renamed from: b */
    public boolean f1472b;

    /* renamed from: c */
    public int f1473c;

    /* renamed from: d */
    private C1246h f1474d;

    static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        int f1475a;

        SavedState() {
        }

        public int describeContents() {
            return 0;
        }

        SavedState(Parcel parcel) {
            this.f1475a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1475a);
        }
    }

    /* renamed from: a */
    public final void mo1084a(C1246h hVar, boolean z) {
    }

    /* renamed from: a */
    public final void mo1085a(C1263a aVar) {
    }

    /* renamed from: a */
    public final boolean mo1087a() {
        return false;
    }

    /* renamed from: a */
    public final boolean mo1088a(C1246h hVar, C1250j jVar) {
        return false;
    }

    /* renamed from: a */
    public final boolean mo1089a(C1272u uVar) {
        return false;
    }

    /* renamed from: b */
    public final int mo1090b() {
        return this.f1473c;
    }

    /* renamed from: b */
    public final boolean mo1091b(C1246h hVar, C1250j jVar) {
        return false;
    }

    /* renamed from: c */
    public final Parcelable mo1092c() {
        SavedState savedState = new SavedState();
        savedState.f1475a = this.f1471a.getSelectedItemId();
        return savedState;
    }

    /* renamed from: a */
    public final void mo1083a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            BottomNavigationMenuView bottomNavigationMenuView = this.f1471a;
            int i = ((SavedState) parcelable).f1475a;
            int size = bottomNavigationMenuView.f1453h.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = bottomNavigationMenuView.f1453h.getItem(i2);
                if (i == item.getItemId()) {
                    bottomNavigationMenuView.f1450e = i;
                    bottomNavigationMenuView.f1451f = i2;
                    item.setChecked(true);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo1086a(boolean z) {
        if (!this.f1472b) {
            if (z) {
                this.f1471a.mo1057a();
                return;
            }
            BottomNavigationMenuView bottomNavigationMenuView = this.f1471a;
            if (bottomNavigationMenuView.f1453h != null && bottomNavigationMenuView.f1449d != null) {
                int size = bottomNavigationMenuView.f1453h.size();
                if (size != bottomNavigationMenuView.f1449d.length) {
                    bottomNavigationMenuView.mo1057a();
                    return;
                }
                int i = bottomNavigationMenuView.f1450e;
                for (int i2 = 0; i2 < size; i2++) {
                    MenuItem item = bottomNavigationMenuView.f1453h.getItem(i2);
                    if (item.isChecked()) {
                        bottomNavigationMenuView.f1450e = item.getItemId();
                        bottomNavigationMenuView.f1451f = i2;
                    }
                }
                if (i != bottomNavigationMenuView.f1450e) {
                    C0304o.m646a(bottomNavigationMenuView, bottomNavigationMenuView.f1446a);
                }
                boolean a = BottomNavigationMenuView.m1057a(bottomNavigationMenuView.f1448c, bottomNavigationMenuView.f1453h.mo4140g().size());
                for (int i3 = 0; i3 < size; i3++) {
                    bottomNavigationMenuView.f1452g.f1472b = true;
                    bottomNavigationMenuView.f1449d[i3].setLabelVisibilityMode(bottomNavigationMenuView.f1448c);
                    bottomNavigationMenuView.f1449d[i3].setShifting(a);
                    bottomNavigationMenuView.f1449d[i3].mo1036a((C1250j) bottomNavigationMenuView.f1453h.getItem(i3), 0);
                    bottomNavigationMenuView.f1452g.f1472b = false;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo1082a(Context context, C1246h hVar) {
        this.f1474d = hVar;
        this.f1471a.mo1058a(this.f1474d);
    }
}
