package com.p683ss.android.ugc.aweme.tools.beauty;

import com.p683ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p683ss.android.ugc.aweme.tools.beauty.p2351c.C46829a;
import com.p683ss.android.ugc.tools.utils.C50203g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.e */
public final class C46871e {
    /* renamed from: a */
    public static final int m101786a(String str) {
        int i;
        if (str == null) {
            return -1;
        }
        try {
            i = Integer.parseInt(str);
        } catch (Throwable th) {
            C50203g.m108359a(th);
            i = -1;
        }
        return i;
    }

    /* renamed from: a */
    public static final boolean m101789a(ComposerBeauty composerBeauty) {
        boolean z;
        C52711k.m112240b(composerBeauty, "$this$isAlbum");
        CharSequence parentId = composerBeauty.getParentId();
        if (parentId == null || parentId.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m101791b(ComposerBeauty composerBeauty) {
        C52711k.m112240b(composerBeauty, "$this$isCollectBeauty");
        if (1 == composerBeauty.getEffect().getEffectType()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m101793c(ComposerBeauty composerBeauty) {
        C52711k.m112240b(composerBeauty, "$this$isCategoryExclusive");
        if (m101789a(composerBeauty) || !composerBeauty.getCategoryExclusive()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m101794d(ComposerBeauty composerBeauty) {
        C52711k.m112240b(composerBeauty, "$this$isExclusive");
        if (m101789a(composerBeauty) || m101793c(composerBeauty)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m101795e(ComposerBeauty composerBeauty) {
        boolean z;
        boolean z2;
        C52711k.m112240b(composerBeauty, "$this$isCanUpdateComposerNode");
        Collection items = composerBeauty.getBeautifyExtra().getItems();
        if (items == null || items.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z || composerBeauty.getExtra().isNone()) {
            CharSequence unzipPath = composerBeauty.getEffect().getUnzipPath();
            if (unzipPath == null || unzipPath.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 || !C46829a.f118310b.mo94074a(composerBeauty) || !composerBeauty.getEnable()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final List<ComposerBeauty> m101788a(List<BeautyCategory> list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (BeautyCategory beautyList : list) {
            for (ComposerBeauty composerBeauty : beautyList.getBeautyList()) {
                if (composerBeauty.isCollectionType()) {
                    List childList = composerBeauty.getChildList();
                    if (childList != null) {
                        Collection collection = childList;
                        if (collection == null || collection.isEmpty()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!(!z)) {
                            childList = null;
                        }
                        if (childList != null) {
                            arrayList.addAll(childList);
                        }
                    }
                } else {
                    arrayList.add(composerBeauty);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final List<ComposerBeauty> m101787a(ComposerBeauty composerBeauty, List<BeautyCategory> list) {
        C52711k.m112240b(composerBeauty, "$this$getExclusiveList");
        if (!m101794d(composerBeauty)) {
            return new ArrayList<>();
        }
        if (m101789a(composerBeauty)) {
            C52711k.m112240b(composerBeauty, "$this$getAlbumExclusiveList");
            ArrayList arrayList = new ArrayList();
            if (m101789a(composerBeauty)) {
                ComposerBeauty b = m101790b(composerBeauty, list);
                if (b != null) {
                    List childList = b.getChildList();
                    if (childList != null) {
                        if (!(!childList.isEmpty())) {
                            childList = null;
                        }
                        if (childList != null) {
                            arrayList.addAll(childList);
                        }
                    }
                }
            }
            return arrayList;
        } else if (m101793c(composerBeauty)) {
            return m101792c(composerBeauty, list);
        } else {
            return new ArrayList<>();
        }
    }

    /* renamed from: c */
    private static List<ComposerBeauty> m101792c(ComposerBeauty composerBeauty, List<BeautyCategory> list) {
        Object obj;
        C52711k.m112240b(composerBeauty, "$this$getCategoryExclusionList");
        ArrayList arrayList = new ArrayList();
        if (!m101793c(composerBeauty) || list == null) {
            return arrayList;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C52711k.m112239a((Object) ((BeautyCategory) obj).getCategoryResponse().getId(), (Object) composerBeauty.getCategoryId())) {
                break;
            }
        }
        BeautyCategory beautyCategory = (BeautyCategory) obj;
        if (beautyCategory != null) {
            arrayList.addAll(beautyCategory.getBeautyList());
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final ComposerBeauty m101790b(ComposerBeauty composerBeauty, List<BeautyCategory> list) {
        boolean z;
        Object obj;
        C52711k.m112240b(composerBeauty, "$this$findBeautyParent");
        if (list != null) {
            CharSequence parentId = composerBeauty.getParentId();
            if (parentId == null || parentId.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                for (BeautyCategory beautyList : list) {
                    Iterable beautyList2 = beautyList.getBeautyList();
                    Collection arrayList = new ArrayList();
                    for (Object next : beautyList2) {
                        if (((ComposerBeauty) next).isCollectionType()) {
                            arrayList.add(next);
                        }
                    }
                    Iterator it = ((List) arrayList).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ComposerBeauty composerBeauty2 = (ComposerBeauty) it.next();
                            List childList = composerBeauty2.getChildList();
                            if (childList != null) {
                                Iterator it2 = childList.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it2.next();
                                    if (C52711k.m112239a((Object) (ComposerBeauty) obj, (Object) composerBeauty)) {
                                        break;
                                    }
                                }
                                if (((ComposerBeauty) obj) != null) {
                                    return composerBeauty2;
                                }
                            }
                        }
                    }
                }
                return null;
            }
        }
        return null;
    }
}
