package android.support.p030v4.view.p041a;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;

/* renamed from: android.support.v4.view.a.c */
public final class C1008c {

    /* renamed from: a */
    public final AccessibilityNodeInfo f3230a;

    /* renamed from: b */
    public int f3231b = -1;

    /* renamed from: android.support.v4.view.a.c$a */
    public static class C1009a {

        /* renamed from: A */
        public static final C1009a f3232A;

        /* renamed from: B */
        public static final C1009a f3233B;

        /* renamed from: C */
        public static final C1009a f3234C;

        /* renamed from: D */
        public static final C1009a f3235D;

        /* renamed from: E */
        public static final C1009a f3236E;

        /* renamed from: F */
        public static final C1009a f3237F;

        /* renamed from: G */
        public static final C1009a f3238G;

        /* renamed from: a */
        public static final C1009a f3239a = new C1009a(1, null);

        /* renamed from: b */
        public static final C1009a f3240b = new C1009a(2, null);

        /* renamed from: c */
        public static final C1009a f3241c = new C1009a(4, null);

        /* renamed from: d */
        public static final C1009a f3242d = new C1009a(8, null);

        /* renamed from: e */
        public static final C1009a f3243e = new C1009a(16, null);

        /* renamed from: f */
        public static final C1009a f3244f = new C1009a(32, null);

        /* renamed from: g */
        public static final C1009a f3245g = new C1009a(64, null);

        /* renamed from: h */
        public static final C1009a f3246h = new C1009a(128, null);

        /* renamed from: i */
        public static final C1009a f3247i = new C1009a(UnReadVideoExperiment.BROWSE_RECORD_LIST, null);

        /* renamed from: j */
        public static final C1009a f3248j = new C1009a(UnReadVideoExperiment.LIKE_USER_LIST, null);

        /* renamed from: k */
        public static final C1009a f3249k = new C1009a(PreloadTask.BYTE_UNIT_NUMBER, null);

        /* renamed from: l */
        public static final C1009a f3250l = new C1009a(2048, null);

        /* renamed from: m */
        public static final C1009a f3251m = new C1009a(4096, null);

        /* renamed from: n */
        public static final C1009a f3252n = new C1009a(VideoCacheReadBuffersizeExperiment.DEFAULT, null);

        /* renamed from: o */
        public static final C1009a f3253o = new C1009a(16384, null);

        /* renamed from: p */
        public static final C1009a f3254p = new C1009a(32768, null);

        /* renamed from: q */
        public static final C1009a f3255q = new C1009a(65536, null);

        /* renamed from: r */
        public static final C1009a f3256r = new C1009a(131072, null);

        /* renamed from: s */
        public static final C1009a f3257s = new C1009a(262144, null);

        /* renamed from: t */
        public static final C1009a f3258t = new C1009a(524288, null);

        /* renamed from: u */
        public static final C1009a f3259u = new C1009a(1048576, null);

        /* renamed from: v */
        public static final C1009a f3260v = new C1009a(2097152, null);

        /* renamed from: w */
        public static final C1009a f3261w;

        /* renamed from: x */
        public static final C1009a f3262x;

        /* renamed from: y */
        public static final C1009a f3263y;

        /* renamed from: z */
        public static final C1009a f3264z;

        /* renamed from: H */
        final Object f3265H;

        static {
            Object obj;
            Object obj2;
            Object obj3;
            Object obj4;
            Object obj5;
            Object obj6;
            Object obj7;
            Object obj8;
            Object obj9;
            Object obj10;
            AccessibilityAction accessibilityAction = null;
            if (VERSION.SDK_INT >= 23) {
                obj = AccessibilityAction.ACTION_SHOW_ON_SCREEN;
            } else {
                obj = null;
            }
            f3261w = new C1009a(obj);
            if (VERSION.SDK_INT >= 23) {
                obj2 = AccessibilityAction.ACTION_SCROLL_TO_POSITION;
            } else {
                obj2 = null;
            }
            f3262x = new C1009a(obj2);
            if (VERSION.SDK_INT >= 23) {
                obj3 = AccessibilityAction.ACTION_SCROLL_UP;
            } else {
                obj3 = null;
            }
            f3263y = new C1009a(obj3);
            if (VERSION.SDK_INT >= 23) {
                obj4 = AccessibilityAction.ACTION_SCROLL_LEFT;
            } else {
                obj4 = null;
            }
            f3264z = new C1009a(obj4);
            if (VERSION.SDK_INT >= 23) {
                obj5 = AccessibilityAction.ACTION_SCROLL_DOWN;
            } else {
                obj5 = null;
            }
            f3232A = new C1009a(obj5);
            if (VERSION.SDK_INT >= 23) {
                obj6 = AccessibilityAction.ACTION_SCROLL_RIGHT;
            } else {
                obj6 = null;
            }
            f3233B = new C1009a(obj6);
            if (VERSION.SDK_INT >= 23) {
                obj7 = AccessibilityAction.ACTION_CONTEXT_CLICK;
            } else {
                obj7 = null;
            }
            f3234C = new C1009a(obj7);
            if (VERSION.SDK_INT >= 24) {
                obj8 = AccessibilityAction.ACTION_SET_PROGRESS;
            } else {
                obj8 = null;
            }
            f3235D = new C1009a(obj8);
            if (VERSION.SDK_INT >= 26) {
                obj9 = AccessibilityAction.ACTION_MOVE_WINDOW;
            } else {
                obj9 = null;
            }
            f3236E = new C1009a(obj9);
            if (VERSION.SDK_INT >= 28) {
                obj10 = AccessibilityAction.ACTION_SHOW_TOOLTIP;
            } else {
                obj10 = null;
            }
            f3237F = new C1009a(obj10);
            if (VERSION.SDK_INT >= 28) {
                accessibilityAction = AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            f3238G = new C1009a(accessibilityAction);
        }

        private C1009a(Object obj) {
            this.f3265H = obj;
        }

        private C1009a(int i, CharSequence charSequence) {
            Object obj;
            if (VERSION.SDK_INT >= 21) {
                obj = new AccessibilityAction(i, null);
            } else {
                obj = null;
            }
            this(obj);
        }
    }

    /* renamed from: android.support.v4.view.a.c$b */
    public static class C1010b {

        /* renamed from: a */
        public final Object f3266a;

        public C1010b(Object obj) {
            this.f3266a = obj;
        }
    }

    /* renamed from: android.support.v4.view.a.c$c */
    public static class C1011c {

        /* renamed from: a */
        final Object f3267a;

        private C1011c(Object obj) {
            this.f3267a = obj;
        }

        /* renamed from: a */
        public static C1011c m2925a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            if (VERSION.SDK_INT >= 21) {
                return new C1011c(CollectionItemInfo.obtain(i, i2, i3, i4, z, false));
            }
            if (VERSION.SDK_INT >= 19) {
                return new C1011c(CollectionItemInfo.obtain(i, i2, i3, i4, z));
            }
            return new C1011c(null);
        }
    }

    /* renamed from: a */
    public final boolean mo3136a(C1009a aVar) {
        if (VERSION.SDK_INT >= 21) {
            return this.f3230a.removeAction((AccessibilityAction) aVar.f3265H);
        }
        return false;
    }

    /* renamed from: j */
    public final CharSequence mo3163j() {
        return this.f3230a.getPackageName();
    }

    /* renamed from: k */
    public final CharSequence mo3165k() {
        return this.f3230a.getClassName();
    }

    /* renamed from: l */
    public final CharSequence mo3167l() {
        return this.f3230a.getContentDescription();
    }

    /* renamed from: m */
    public final void mo3168m() {
        this.f3230a.recycle();
    }

    /* renamed from: f */
    public final boolean mo3155f() {
        return this.f3230a.isSelected();
    }

    /* renamed from: g */
    public final boolean mo3157g() {
        return this.f3230a.isClickable();
    }

    /* renamed from: h */
    public final boolean mo3159h() {
        return this.f3230a.isLongClickable();
    }

    public final int hashCode() {
        if (this.f3230a == null) {
            return 0;
        }
        return this.f3230a.hashCode();
    }

    /* renamed from: i */
    public final boolean mo3162i() {
        return this.f3230a.isEnabled();
    }

    /* renamed from: a */
    public final int mo3129a() {
        return this.f3230a.getActions();
    }

    /* renamed from: e */
    public final boolean mo3152e() {
        if (VERSION.SDK_INT >= 16) {
            return this.f3230a.isAccessibilityFocused();
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo3150d() {
        if (VERSION.SDK_INT >= 16) {
            return this.f3230a.isVisibleToUser();
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo3141b() {
        return this.f3230a.isFocusable();
    }

    /* renamed from: c */
    public final boolean mo3146c() {
        return this.f3230a.isFocused();
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo3131a(rect);
        StringBuilder sb2 = new StringBuilder("; boundsInParent: ");
        sb2.append(rect);
        sb.append(sb2.toString());
        mo3142c(rect);
        StringBuilder sb3 = new StringBuilder("; boundsInScreen: ");
        sb3.append(rect);
        sb.append(sb3.toString());
        sb.append("; packageName: ");
        sb.append(mo3163j());
        sb.append("; className: ");
        sb.append(mo3165k());
        sb.append("; text: ");
        sb.append(this.f3230a.getText());
        sb.append("; contentDescription: ");
        sb.append(mo3167l());
        sb.append("; viewId: ");
        if (VERSION.SDK_INT >= 18) {
            str = this.f3230a.getViewIdResourceName();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append("; checkable: ");
        sb.append(this.f3230a.isCheckable());
        sb.append("; checked: ");
        sb.append(this.f3230a.isChecked());
        sb.append("; focusable: ");
        sb.append(mo3141b());
        sb.append("; focused: ");
        sb.append(mo3146c());
        sb.append("; selected: ");
        sb.append(mo3155f());
        sb.append("; clickable: ");
        sb.append(mo3157g());
        sb.append("; longClickable: ");
        sb.append(mo3159h());
        sb.append("; enabled: ");
        sb.append(mo3162i());
        sb.append("; password: ");
        sb.append(this.f3230a.isPassword());
        StringBuilder sb4 = new StringBuilder("; scrollable: ");
        sb4.append(this.f3230a.isScrollable());
        sb.append(sb4.toString());
        sb.append("; [");
        int a = mo3129a();
        while (a != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(a);
            a &= numberOfTrailingZeros ^ -1;
            switch (numberOfTrailingZeros) {
                case 1:
                    str2 = "ACTION_FOCUS";
                    break;
                case 2:
                    str2 = "ACTION_CLEAR_FOCUS";
                    break;
                case 4:
                    str2 = "ACTION_SELECT";
                    break;
                case 8:
                    str2 = "ACTION_CLEAR_SELECTION";
                    break;
                case 16:
                    str2 = "ACTION_CLICK";
                    break;
                case 32:
                    str2 = "ACTION_LONG_CLICK";
                    break;
                case UnReadVideoExperiment.RELATION_LIST /*64*/:
                    str2 = "ACTION_ACCESSIBILITY_FOCUS";
                    break;
                case 128:
                    str2 = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    break;
                case UnReadVideoExperiment.BROWSE_RECORD_LIST /*256*/:
                    str2 = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    break;
                case UnReadVideoExperiment.LIKE_USER_LIST /*512*/:
                    str2 = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    break;
                case PreloadTask.BYTE_UNIT_NUMBER /*1024*/:
                    str2 = "ACTION_NEXT_HTML_ELEMENT";
                    break;
                case 2048:
                    str2 = "ACTION_PREVIOUS_HTML_ELEMENT";
                    break;
                case 4096:
                    str2 = "ACTION_SCROLL_FORWARD";
                    break;
                case VideoCacheReadBuffersizeExperiment.DEFAULT /*8192*/:
                    str2 = "ACTION_SCROLL_BACKWARD";
                    break;
                case 16384:
                    str2 = "ACTION_COPY";
                    break;
                case 32768:
                    str2 = "ACTION_PASTE";
                    break;
                case 65536:
                    str2 = "ACTION_CUT";
                    break;
                case 131072:
                    str2 = "ACTION_SET_SELECTION";
                    break;
                default:
                    str2 = "ACTION_UNKNOWN";
                    break;
            }
            sb.append(str2);
            if (a != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public static C1008c m2886a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C1008c(accessibilityNodeInfo);
    }

    /* renamed from: b */
    public final void mo3137b(Rect rect) {
        this.f3230a.setBoundsInParent(rect);
    }

    /* renamed from: c */
    public final void mo3142c(Rect rect) {
        this.f3230a.getBoundsInScreen(rect);
    }

    /* renamed from: d */
    public final void mo3147d(Rect rect) {
        this.f3230a.setBoundsInScreen(rect);
    }

    /* renamed from: f */
    public final void mo3154f(boolean z) {
        this.f3230a.setSelected(z);
    }

    /* renamed from: g */
    public final void mo3156g(boolean z) {
        this.f3230a.setClickable(z);
    }

    /* renamed from: h */
    public final void mo3158h(boolean z) {
        this.f3230a.setLongClickable(z);
    }

    /* renamed from: i */
    public final void mo3161i(boolean z) {
        this.f3230a.setEnabled(z);
    }

    private C1008c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f3230a = accessibilityNodeInfo;
    }

    /* renamed from: a */
    public static C1008c m2885a(C1008c cVar) {
        return m2886a(AccessibilityNodeInfo.obtain(cVar.f3230a));
    }

    /* renamed from: b */
    public final void mo3138b(View view) {
        this.f3230a.addChild(view);
    }

    /* renamed from: c */
    public final void mo3143c(View view) {
        this.f3230a.setParent(view);
    }

    /* renamed from: d */
    public final void mo3148d(CharSequence charSequence) {
        this.f3230a.setContentDescription(charSequence);
    }

    /* renamed from: e */
    public final void mo3151e(boolean z) {
        if (VERSION.SDK_INT >= 16) {
            this.f3230a.setAccessibilityFocused(z);
        }
    }

    /* renamed from: j */
    public final void mo3164j(boolean z) {
        this.f3230a.setScrollable(z);
    }

    /* renamed from: k */
    public final void mo3166k(boolean z) {
        if (VERSION.SDK_INT >= 19) {
            this.f3230a.setDismissable(z);
        }
    }

    /* renamed from: b */
    public final void mo3139b(CharSequence charSequence) {
        this.f3230a.setClassName(charSequence);
    }

    /* renamed from: c */
    public final void mo3144c(CharSequence charSequence) {
        this.f3230a.setText(charSequence);
    }

    /* renamed from: d */
    public final void mo3149d(boolean z) {
        if (VERSION.SDK_INT >= 16) {
            this.f3230a.setVisibleToUser(z);
        }
    }

    /* renamed from: a */
    public final void mo3130a(int i) {
        this.f3230a.addAction(i);
    }

    /* renamed from: b */
    public final void mo3140b(boolean z) {
        this.f3230a.setFocusable(z);
    }

    /* renamed from: c */
    public final void mo3145c(boolean z) {
        this.f3230a.setFocused(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1008c cVar = (C1008c) obj;
        if (this.f3230a == null) {
            if (cVar.f3230a != null) {
                return false;
            }
        } else if (!this.f3230a.equals(cVar.f3230a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo3131a(Rect rect) {
        this.f3230a.getBoundsInParent(rect);
    }

    /* renamed from: a */
    public final void mo3132a(View view) {
        this.f3230a.setSource(view);
    }

    /* renamed from: a */
    public final void mo3133a(CharSequence charSequence) {
        this.f3230a.setPackageName(charSequence);
    }

    /* renamed from: a */
    public final void mo3134a(Object obj) {
        CollectionItemInfo collectionItemInfo;
        if (VERSION.SDK_INT >= 19) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.f3230a;
            if (obj == null) {
                collectionItemInfo = null;
            } else {
                collectionItemInfo = (CollectionItemInfo) ((C1011c) obj).f3267a;
            }
            accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
        }
    }

    /* renamed from: a */
    public final void mo3135a(boolean z) {
        this.f3230a.setCheckable(z);
    }
}
