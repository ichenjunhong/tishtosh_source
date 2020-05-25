package android.support.p030v4.app;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.p030v4.view.C1056u;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.app.v */
public abstract class C0692v {
    /* renamed from: a */
    public abstract Object mo562a(Object obj, Object obj2, Object obj3);

    /* renamed from: a */
    public abstract void mo563a(ViewGroup viewGroup, Object obj);

    /* renamed from: a */
    public abstract void mo564a(Object obj, Rect rect);

    /* renamed from: a */
    public abstract void mo565a(Object obj, View view);

    /* renamed from: a */
    public abstract void mo566a(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo567a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: a */
    public abstract void mo568a(Object obj, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo569a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: a */
    public abstract boolean mo570a(Object obj);

    /* renamed from: b */
    public abstract Object mo571b(Object obj);

    /* renamed from: b */
    public abstract Object mo572b(Object obj, Object obj2, Object obj3);

    /* renamed from: b */
    public abstract void mo573b(Object obj, View view);

    /* renamed from: b */
    public abstract void mo574b(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: b */
    public abstract void mo575b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: c */
    public abstract Object mo576c(Object obj);

    /* renamed from: c */
    public abstract void mo577c(Object obj, View view);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2337a(ArrayList<View> arrayList, View view) {
        boolean z;
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (VERSION.SDK_INT >= 21) {
                    z = viewGroup.isTransitionGroup();
                } else {
                    Boolean bool = (Boolean) viewGroup.getTag(R.id.cxj);
                    z = ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C1056u.m3070p(viewGroup) == null) ? false : true;
                }
                if (z) {
                    arrayList.add(viewGroup);
                } else {
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        mo2337a(arrayList, viewGroup.getChildAt(i));
                    }
                }
            } else {
                arrayList.add(view);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2338a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String p = C1056u.m3070p(view);
            if (p != null) {
                map.put(p, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo2338a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m1994a(List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static ArrayList<String> m1991a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
            arrayList2.add(C1056u.m3070p(view));
            C1056u.m3036a(view, (String) null);
        }
        return arrayList2;
    }

    /* renamed from: a */
    protected static void m1992a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* renamed from: a */
    protected static void m1993a(List<View> list, View view) {
        int size = list.size();
        if (!m1995a(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m1995a(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m1995a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2336a(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        final int size = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = (View) arrayList.get(i);
            String p = C1056u.m3070p(view2);
            arrayList4.add(p);
            if (p != null) {
                C1056u.m3036a(view2, (String) null);
                String str = (String) map.get(p);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C1056u.m3036a((View) arrayList2.get(i2), p);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        final ArrayList<View> arrayList5 = arrayList2;
        final ArrayList<String> arrayList6 = arrayList3;
        final ArrayList<View> arrayList7 = arrayList;
        C06931 r0 = new Runnable() {
            public final void run() {
                for (int i = 0; i < size; i++) {
                    C1056u.m3036a((View) arrayList5.get(i), (String) arrayList6.get(i));
                    C1056u.m3036a((View) arrayList7.get(i), (String) arrayList4.get(i));
                }
            }
        };
        C0627ae.m1706a(view, r0);
    }
}
