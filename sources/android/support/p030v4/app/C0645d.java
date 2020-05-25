package android.support.p030v4.app;

import android.support.p030v4.p038f.C0784f;
import com.bef.effectsdk.message.MessageCenter;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.d */
final class C0645d extends C0679r implements C0672h {

    /* renamed from: a */
    final C0658m f2310a;

    /* renamed from: b */
    ArrayList<C0646a> f2311b = new ArrayList<>();

    /* renamed from: c */
    int f2312c;

    /* renamed from: d */
    int f2313d;

    /* renamed from: e */
    int f2314e;

    /* renamed from: f */
    int f2315f;

    /* renamed from: g */
    public int f2316g;

    /* renamed from: h */
    public int f2317h;

    /* renamed from: i */
    boolean f2318i;

    /* renamed from: j */
    boolean f2319j = true;

    /* renamed from: k */
    String f2320k;

    /* renamed from: l */
    boolean f2321l;

    /* renamed from: m */
    int f2322m = -1;

    /* renamed from: n */
    int f2323n;

    /* renamed from: o */
    CharSequence f2324o;

    /* renamed from: p */
    int f2325p;

    /* renamed from: q */
    CharSequence f2326q;

    /* renamed from: r */
    ArrayList<String> f2327r;

    /* renamed from: s */
    ArrayList<String> f2328s;

    /* renamed from: t */
    boolean f2329t = false;

    /* renamed from: u */
    ArrayList<Runnable> f2330u;

    /* renamed from: android.support.v4.app.d$a */
    static final class C0646a {

        /* renamed from: a */
        int f2331a;

        /* renamed from: b */
        Fragment f2332b;

        /* renamed from: c */
        int f2333c;

        /* renamed from: d */
        int f2334d;

        /* renamed from: e */
        int f2335e;

        /* renamed from: f */
        int f2336f;

        C0646a() {
        }

        C0646a(int i, Fragment fragment) {
            this.f2331a = i;
            this.f2332b = fragment;
        }
    }

    /* renamed from: g */
    public final String mo2202g() {
        return this.f2320k;
    }

    /* renamed from: a */
    public final void mo2184a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        mo2185a(str, printWriter, true);
    }

    /* renamed from: a */
    public final void mo2185a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2320k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2322m);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2321l);
            if (this.f2316g != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2316g));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f2317h));
            }
            if (!(this.f2312c == 0 && this.f2313d == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2312c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2313d));
            }
            if (!(this.f2314e == 0 && this.f2315f == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2314e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2315f));
            }
            if (!(this.f2323n == 0 && this.f2324o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2323n));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2324o);
            }
            if (!(this.f2325p == 0 && this.f2326q == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2325p));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2326q);
            }
        }
        if (!this.f2311b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("    ");
            int size = this.f2311b.size();
            for (int i = 0; i < size; i++) {
                C0646a aVar = (C0646a) this.f2311b.get(i);
                switch (aVar.f2331a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder("cmd=");
                        sb2.append(aVar.f2331a);
                        str2 = sb2.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f2332b);
                if (z) {
                    if (!(aVar.f2333c == 0 && aVar.f2334d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2333c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2334d));
                    }
                    if (aVar.f2335e != 0 || aVar.f2336f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2335e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2336f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2183a(C0646a aVar) {
        this.f2311b.add(aVar);
        aVar.f2333c = this.f2312c;
        aVar.f2334d = this.f2313d;
        aVar.f2335e = this.f2314e;
        aVar.f2336f = this.f2315f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2181a(int i) {
        if (this.f2318i) {
            int size = this.f2311b.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0646a aVar = (C0646a) this.f2311b.get(i2);
                if (aVar.f2332b != null) {
                    aVar.f2332b.mBackStackNesting += i;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo2180a() {
        if (this.f2330u != null) {
            int size = this.f2330u.size();
            for (int i = 0; i < size; i++) {
                ((Runnable) this.f2330u.get(i)).run();
            }
            this.f2330u = null;
        }
    }

    /* renamed from: a */
    public final boolean mo2188a(ArrayList<C0645d> arrayList, ArrayList<Boolean> arrayList2) {
        arrayList.add(this);
        arrayList2.add(Boolean.valueOf(false));
        if (this.f2318i) {
            C0658m mVar = this.f2310a;
            if (mVar.f2364g == null) {
                mVar.f2364g = new ArrayList<>();
            }
            mVar.f2364g.add(this);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo2187a(ArrayList<C0645d> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f2311b.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            C0646a aVar = (C0646a) this.f2311b.get(i4);
            int i5 = aVar.f2332b != null ? aVar.f2332b.mContainerId : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0645d dVar = (C0645d) arrayList.get(i6);
                    int size2 = dVar.f2311b.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        C0646a aVar2 = (C0646a) dVar.f2311b.get(i7);
                        if ((aVar2.f2332b != null ? aVar2.f2332b.mContainerId : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2186a(boolean z) {
        for (int size = this.f2311b.size() - 1; size >= 0; size--) {
            C0646a aVar = (C0646a) this.f2311b.get(size);
            Fragment fragment = aVar.f2332b;
            if (fragment != null) {
                int i = this.f2316g;
                int i2 = 8194;
                if (i != 4097) {
                    i2 = i != 4099 ? i != 8194 ? 0 : 4097 : MessageCenter.MSG_SDK_TO_CLIENT_END_GAME_REQ;
                }
                fragment.setNextTransition(i2, this.f2317h);
            }
            int i3 = aVar.f2331a;
            if (i3 != 1) {
                switch (i3) {
                    case 3:
                        fragment.setNextAnim(aVar.f2335e);
                        this.f2310a.mo2257a(fragment, false);
                        break;
                    case 4:
                        fragment.setNextAnim(aVar.f2335e);
                        C0658m.m1850g(fragment);
                        break;
                    case 5:
                        fragment.setNextAnim(aVar.f2336f);
                        C0658m.m1848f(fragment);
                        break;
                    case 6:
                        fragment.setNextAnim(aVar.f2335e);
                        this.f2310a.mo2278i(fragment);
                        break;
                    case 7:
                        fragment.setNextAnim(aVar.f2336f);
                        this.f2310a.mo2276h(fragment);
                        break;
                    case 8:
                        this.f2310a.mo2279j(null);
                        break;
                    case 9:
                        this.f2310a.mo2279j(fragment);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("Unknown cmd: ");
                        sb.append(aVar.f2331a);
                        throw new IllegalArgumentException(sb.toString());
                }
            } else {
                fragment.setNextAnim(aVar.f2336f);
                this.f2310a.mo2275e(fragment);
            }
            if (!(this.f2329t || aVar.f2331a == 3 || fragment == null)) {
                this.f2310a.mo2273c(fragment);
            }
        }
        if (!this.f2329t && z) {
            this.f2310a.mo2253a(this.f2310a.f2369l, true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2182a(C0586c cVar) {
        for (int i = 0; i < this.f2311b.size(); i++) {
            C0646a aVar = (C0646a) this.f2311b.get(i);
            if (m1734b(aVar)) {
                aVar.f2332b.setOnStartEnterTransitionListener(cVar);
            }
        }
    }

    /* renamed from: b */
    public final int mo2189b() {
        return m1733b(false);
    }

    /* renamed from: c */
    public final int mo2195c() {
        return m1733b(true);
    }

    /* renamed from: h */
    private C0679r m1735h() {
        if (!this.f2318i) {
            this.f2319j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* renamed from: d */
    public final void mo2198d() {
        m1735h();
        this.f2310a.mo2269b((C0672h) this, false);
    }

    /* renamed from: e */
    public final void mo2200e() {
        m1735h();
        this.f2310a.mo2269b((C0672h) this, true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2322m >= 0) {
            sb.append(" #");
            sb.append(this.f2322m);
        }
        if (this.f2320k != null) {
            sb.append(" ");
            sb.append(this.f2320k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo2201f() {
        int size = this.f2311b.size();
        for (int i = 0; i < size; i++) {
            C0646a aVar = (C0646a) this.f2311b.get(i);
            Fragment fragment = aVar.f2332b;
            if (fragment != null) {
                fragment.setNextTransition(this.f2316g, this.f2317h);
            }
            int i2 = aVar.f2331a;
            if (i2 != 1) {
                switch (i2) {
                    case 3:
                        fragment.setNextAnim(aVar.f2334d);
                        this.f2310a.mo2275e(fragment);
                        break;
                    case 4:
                        fragment.setNextAnim(aVar.f2334d);
                        C0658m.m1848f(fragment);
                        break;
                    case 5:
                        fragment.setNextAnim(aVar.f2333c);
                        C0658m.m1850g(fragment);
                        break;
                    case 6:
                        fragment.setNextAnim(aVar.f2334d);
                        this.f2310a.mo2276h(fragment);
                        break;
                    case 7:
                        fragment.setNextAnim(aVar.f2333c);
                        this.f2310a.mo2278i(fragment);
                        break;
                    case 8:
                        this.f2310a.mo2279j(fragment);
                        break;
                    case 9:
                        this.f2310a.mo2279j(null);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("Unknown cmd: ");
                        sb.append(aVar.f2331a);
                        throw new IllegalArgumentException(sb.toString());
                }
            } else {
                fragment.setNextAnim(aVar.f2333c);
                this.f2310a.mo2257a(fragment, false);
            }
            if (!(this.f2329t || aVar.f2331a == 1 || fragment == null)) {
                this.f2310a.mo2273c(fragment);
            }
        }
        if (!this.f2329t) {
            this.f2310a.mo2253a(this.f2310a.f2369l, true);
        }
    }

    /* renamed from: c */
    public final C0679r mo2196c(Fragment fragment) {
        mo2183a(new C0646a(5, fragment));
        return this;
    }

    /* renamed from: d */
    public final C0679r mo2197d(Fragment fragment) {
        mo2183a(new C0646a(6, fragment));
        return this;
    }

    /* renamed from: e */
    public final C0679r mo2199e(Fragment fragment) {
        mo2183a(new C0646a(7, fragment));
        return this;
    }

    public C0645d(C0658m mVar) {
        this.f2310a = mVar;
    }

    /* renamed from: b */
    static boolean m1734b(C0646a aVar) {
        Fragment fragment = aVar.f2332b;
        if (fragment == null || !fragment.mAdded || fragment.mView == null || fragment.mDetached || fragment.mHidden || !fragment.isPostponed()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private int m1733b(boolean z) {
        if (!this.f2321l) {
            if (C0658m.f2351a) {
                PrintWriter printWriter = new PrintWriter(new C0784f("FragmentManager"));
                mo2184a("  ", (FileDescriptor) null, printWriter, (String[]) null);
                printWriter.close();
            }
            this.f2321l = true;
            if (this.f2318i) {
                this.f2322m = this.f2310a.mo2252a(this);
            } else {
                this.f2322m = -1;
            }
            this.f2310a.mo2260a((C0672h) this, z);
            return this.f2322m;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: a */
    public final C0679r mo2177a(Fragment fragment) {
        mo2183a(new C0646a(3, fragment));
        return this;
    }

    /* renamed from: b */
    public final C0679r mo2193b(Fragment fragment) {
        mo2183a(new C0646a(4, fragment));
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo2194b(int i) {
        int i2;
        int size = this.f2311b.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0646a aVar = (C0646a) this.f2311b.get(i3);
            if (aVar.f2332b != null) {
                i2 = aVar.f2332b.mContainerId;
            } else {
                i2 = 0;
            }
            if (i2 != 0 && i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C0679r mo2179a(String str) {
        if (this.f2319j) {
            this.f2318i = true;
            this.f2320k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    /* renamed from: a */
    public final C0679r mo2173a(int i, int i2) {
        return mo2174a(i, i2, 0, 0);
    }

    /* renamed from: b */
    public final C0679r mo2191b(int i, Fragment fragment) {
        return mo2192b(i, fragment, null);
    }

    /* renamed from: a */
    public final C0679r mo2175a(int i, Fragment fragment) {
        m1732a(i, fragment, (String) null, 1);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Fragment mo2190b(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int i = 0; i < this.f2311b.size(); i++) {
            C0646a aVar = (C0646a) this.f2311b.get(i);
            int i2 = aVar.f2331a;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f2332b;
                            break;
                    }
                }
                arrayList.add(aVar.f2332b);
            }
            arrayList.remove(aVar.f2332b);
        }
        return fragment;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Fragment mo2172a(ArrayList<Fragment> arrayList, Fragment fragment) {
        int i;
        Fragment fragment2 = fragment;
        int i2 = 0;
        while (i < this.f2311b.size()) {
            C0646a aVar = (C0646a) this.f2311b.get(i);
            switch (aVar.f2331a) {
                case 1:
                case 7:
                    arrayList.add(aVar.f2332b);
                    break;
                case 2:
                    Fragment fragment3 = aVar.f2332b;
                    int i3 = fragment3.mContainerId;
                    Fragment fragment4 = fragment2;
                    int i4 = i;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment5 = (Fragment) arrayList.get(size);
                        if (fragment5.mContainerId == i3) {
                            if (fragment5 == fragment3) {
                                z = true;
                            } else {
                                if (fragment5 == fragment4) {
                                    this.f2311b.add(i4, new C0646a(9, fragment5));
                                    i4++;
                                    fragment4 = null;
                                }
                                C0646a aVar2 = new C0646a(3, fragment5);
                                aVar2.f2333c = aVar.f2333c;
                                aVar2.f2335e = aVar.f2335e;
                                aVar2.f2334d = aVar.f2334d;
                                aVar2.f2336f = aVar.f2336f;
                                this.f2311b.add(i4, aVar2);
                                arrayList.remove(fragment5);
                                i4++;
                            }
                        }
                    }
                    if (z) {
                        this.f2311b.remove(i4);
                        i = i4 - 1;
                    } else {
                        aVar.f2331a = 1;
                        arrayList.add(fragment3);
                        i = i4;
                    }
                    fragment2 = fragment4;
                    break;
                case 3:
                case 6:
                    arrayList.remove(aVar.f2332b);
                    if (aVar.f2332b != fragment2) {
                        break;
                    } else {
                        this.f2311b.add(i, new C0646a(9, aVar.f2332b));
                        i++;
                        fragment2 = null;
                        break;
                    }
                case 8:
                    this.f2311b.add(i, new C0646a(9, fragment2));
                    i++;
                    fragment2 = aVar.f2332b;
                    break;
            }
            i2 = i + 1;
        }
        return fragment2;
    }

    /* renamed from: a */
    public final C0679r mo2178a(Fragment fragment, String str) {
        m1732a(0, fragment, str, 1);
        return this;
    }

    /* renamed from: a */
    public final C0679r mo2176a(int i, Fragment fragment, String str) {
        m1732a(i, fragment, str, 1);
        return this;
    }

    /* renamed from: b */
    public final C0679r mo2192b(int i, Fragment fragment, String str) {
        if (i != 0) {
            m1732a(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: a */
    public final C0679r mo2174a(int i, int i2, int i3, int i4) {
        this.f2312c = i;
        this.f2313d = i2;
        this.f2314e = i3;
        this.f2315f = i4;
        return this;
    }

    /* renamed from: a */
    private void m1732a(int i, Fragment fragment, String str, int i2) {
        Class cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(cls.getCanonicalName());
            sb.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(sb.toString());
        }
        fragment.mFragmentManager = this.f2310a;
        if (str != null) {
            if (fragment.mTag == null || str.equals(fragment.mTag)) {
                fragment.mTag = str;
            } else {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(fragment);
                sb2.append(": was ");
                sb2.append(fragment.mTag);
                sb2.append(" now ");
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (i != 0) {
            if (i == -1) {
                StringBuilder sb3 = new StringBuilder("Can't add fragment ");
                sb3.append(fragment);
                sb3.append(" with tag ");
                sb3.append(str);
                sb3.append(" to container view with no id");
                throw new IllegalArgumentException(sb3.toString());
            } else if (fragment.mFragmentId == 0 || fragment.mFragmentId == i) {
                fragment.mFragmentId = i;
                fragment.mContainerId = i;
            } else {
                StringBuilder sb4 = new StringBuilder("Can't change container ID of fragment ");
                sb4.append(fragment);
                sb4.append(": was ");
                sb4.append(fragment.mFragmentId);
                sb4.append(" now ");
                sb4.append(i);
                throw new IllegalStateException(sb4.toString());
            }
        }
        mo2183a(new C0646a(i2, fragment));
    }
}
