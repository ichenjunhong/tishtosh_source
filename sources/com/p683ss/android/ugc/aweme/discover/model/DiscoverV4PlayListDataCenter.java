package com.p683ss.android.ugc.aweme.discover.model;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2647j.C52751c;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter */
public final class DiscoverV4PlayListDataCenter {
    public static final Companion Companion = new Companion(null);
    public static final String DISCOVER_PLAYLIST = DISCOVER_PLAYLIST;
    public static final C52668f INSTANCE$delegate = C52732g.m112286a(C52757k.SYNCHRONIZED, DiscoverV4PlayListDataCenter$Companion$INSTANCE$2.INSTANCE);
    public static final String NEW_TRENDING_PLAYLIST = NEW_TRENDING_PLAYLIST;
    public static final String TRENDING_PLAYLIST = TRENDING_PLAYLIST;
    private final Map<String, Object> dataMap;
    private final List<WeakReference<DiscoverV4DataObserver>> mObservers;
    private final Map<String, Boolean> pageStateMap;

    /* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter$Companion */
    public static final class Companion {
        static final /* synthetic */ C52767h[] $$delegatedProperties = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(Companion.class), "INSTANCE", "getINSTANCE()Lcom/ss/android/ugc/aweme/discover/model/DiscoverV4PlayListDataCenter;"))};

        private Companion() {
        }

        public final String getDISCOVER_PLAYLIST() {
            return DiscoverV4PlayListDataCenter.DISCOVER_PLAYLIST;
        }

        public final DiscoverV4PlayListDataCenter getINSTANCE() {
            return (DiscoverV4PlayListDataCenter) DiscoverV4PlayListDataCenter.INSTANCE$delegate.getValue();
        }

        public final String getNEW_TRENDING_PLAYLIST() {
            return DiscoverV4PlayListDataCenter.NEW_TRENDING_PLAYLIST;
        }

        public final String getTRENDING_PLAYLIST() {
            return DiscoverV4PlayListDataCenter.TRENDING_PLAYLIST;
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter$DiscoverV4DataObserver */
    public interface DiscoverV4DataObserver {
        void onDataChanged(String str);

        void onNeedUpdateData(String str);
    }

    public final void clear() {
        this.mObservers.clear();
        this.dataMap.clear();
        this.pageStateMap.clear();
    }

    private DiscoverV4PlayListDataCenter() {
        this.pageStateMap = new LinkedHashMap();
        this.dataMap = new LinkedHashMap();
        this.mObservers = new ArrayList();
    }

    public final DiscoverV4NewTrendingReponse getNewTrendingData() {
        Object obj = this.dataMap.get(NEW_TRENDING_PLAYLIST);
        if (obj instanceof DiscoverV4NewTrendingReponse) {
            return (DiscoverV4NewTrendingReponse) obj;
        }
        return null;
    }

    public /* synthetic */ DiscoverV4PlayListDataCenter(C52707g gVar) {
        this();
    }

    public final void loadNewTrendingData(DiscoverV4NewTrendingReponse discoverV4NewTrendingReponse) {
        C52711k.m112240b(discoverV4NewTrendingReponse, "data");
        handleNewTrendingLoadData(discoverV4NewTrendingReponse);
        onDataChanged(NEW_TRENDING_PLAYLIST);
    }

    public final void needLoadData(String str) {
        C52711k.m112240b(str, "key");
        onNeedUpdateData(str);
    }

    public final void removeData(String str) {
        C52711k.m112240b(str, "key");
        this.dataMap.remove(str);
    }

    public final DiscoverV4PlayListResponse getData(String str) {
        C52711k.m112240b(str, "key");
        Object obj = this.dataMap.get(str);
        if (obj instanceof DiscoverV4PlayListResponse) {
            return (DiscoverV4PlayListResponse) obj;
        }
        return null;
    }

    public final void refreshNewTrendingData(DiscoverV4NewTrendingReponse discoverV4NewTrendingReponse) {
        C52711k.m112240b(discoverV4NewTrendingReponse, "data");
        this.dataMap.put(NEW_TRENDING_PLAYLIST, discoverV4NewTrendingReponse);
        onDataChanged(NEW_TRENDING_PLAYLIST);
    }

    private final void onDataChanged(String str) {
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference == null || weakReference.get() == null) {
                it.remove();
            } else {
                DiscoverV4DataObserver discoverV4DataObserver = (DiscoverV4DataObserver) weakReference.get();
                if (discoverV4DataObserver != null) {
                    discoverV4DataObserver.onDataChanged(str);
                }
            }
        }
    }

    private final void onNeedUpdateData(String str) {
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference == null || weakReference.get() == null) {
                it.remove();
            } else {
                DiscoverV4DataObserver discoverV4DataObserver = (DiscoverV4DataObserver) weakReference.get();
                if (discoverV4DataObserver != null) {
                    discoverV4DataObserver.onNeedUpdateData(str);
                }
            }
        }
    }

    public final boolean isPageShow(String str) {
        C52711k.m112240b(str, "tabName");
        if (this.pageStateMap.get(str) == null) {
            return false;
        }
        Object obj = this.pageStateMap.get(str);
        if (obj == null) {
            C52711k.m112234a();
        }
        return ((Boolean) obj).booleanValue();
    }

    public final void unRegister(DiscoverV4DataObserver discoverV4DataObserver) {
        DiscoverV4DataObserver discoverV4DataObserver2;
        C52711k.m112240b(discoverV4DataObserver, "observer");
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference != null) {
                discoverV4DataObserver2 = (DiscoverV4DataObserver) weakReference.get();
            } else {
                discoverV4DataObserver2 = null;
            }
            if (C52711k.m112239a((Object) discoverV4DataObserver2, (Object) discoverV4DataObserver)) {
                weakReference.clear();
            } else if (!(weakReference == null || weakReference.get() == null)) {
            }
            it.remove();
        }
    }

    private final void handleNewTrendingLoadData(DiscoverV4NewTrendingReponse discoverV4NewTrendingReponse) {
        List list;
        Object obj = this.dataMap.get(NEW_TRENDING_PLAYLIST);
        if (obj == null) {
            this.dataMap.put(NEW_TRENDING_PLAYLIST, discoverV4NewTrendingReponse);
            return;
        }
        if (obj instanceof DiscoverV4NewTrendingReponse) {
            DiscoverV4NewTrendingReponse discoverV4NewTrendingReponse2 = (DiscoverV4NewTrendingReponse) obj;
            List<Category> list2 = discoverV4NewTrendingReponse2.categoryList;
            if (list2 != null) {
                list = C52575l.m112139e((Collection<? extends T>) list2);
            } else {
                list = null;
            }
            List list3 = list;
            List<Category> list4 = discoverV4NewTrendingReponse.categoryList;
            if (!(list4 == null || list3 == null)) {
                list3.addAll(list4);
            }
            this.dataMap.put(NEW_TRENDING_PLAYLIST, DiscoverV4NewTrendingReponse.copy$default(discoverV4NewTrendingReponse2, discoverV4NewTrendingReponse.nextCursor, discoverV4NewTrendingReponse.hasMore, list3, null, 8, null));
        }
    }

    public final void register(DiscoverV4DataObserver discoverV4DataObserver) {
        DiscoverV4DataObserver discoverV4DataObserver2;
        C52711k.m112240b(discoverV4DataObserver, "observer");
        int size = this.mObservers.size();
        int i = 0;
        while (i < size) {
            if (this.mObservers.get(i) != null) {
                WeakReference weakReference = (WeakReference) this.mObservers.get(i);
                if (weakReference != null) {
                    discoverV4DataObserver2 = (DiscoverV4DataObserver) weakReference.get();
                } else {
                    discoverV4DataObserver2 = null;
                }
                if (discoverV4DataObserver2 != null) {
                    i++;
                }
            }
            this.mObservers.set(i, new WeakReference(discoverV4DataObserver));
            return;
        }
        this.mObservers.add(new WeakReference(discoverV4DataObserver));
    }

    public final void setPageState(String str, boolean z) {
        C52711k.m112240b(str, "tabName");
        this.pageStateMap.put(str, Boolean.valueOf(z));
    }

    public final void loadData(String str, DiscoverV4PlayListResponse discoverV4PlayListResponse) {
        C52711k.m112240b(str, "key");
        C52711k.m112240b(discoverV4PlayListResponse, "data");
        handleLoadData(str, discoverV4PlayListResponse);
        onDataChanged(str);
    }

    public final void refreshData(String str, DiscoverV4PlayListResponse discoverV4PlayListResponse) {
        C52711k.m112240b(str, "key");
        C52711k.m112240b(discoverV4PlayListResponse, "data");
        this.dataMap.put(str, discoverV4PlayListResponse);
        onDataChanged(str);
    }

    private final void handleLoadData(String str, DiscoverV4PlayListResponse discoverV4PlayListResponse) {
        List list;
        Object obj = this.dataMap.get(str);
        if (obj == null) {
            this.dataMap.put(str, discoverV4PlayListResponse);
            return;
        }
        if (obj instanceof DiscoverV4PlayListResponse) {
            DiscoverV4PlayListResponse discoverV4PlayListResponse2 = (DiscoverV4PlayListResponse) obj;
            List<DiscoverPlayListStructV4> list2 = discoverV4PlayListResponse2.cells;
            if (list2 != null) {
                list = C52575l.m112139e((Collection<? extends T>) list2);
            } else {
                list = null;
            }
            List list3 = list;
            List<DiscoverPlayListStructV4> list4 = discoverV4PlayListResponse.cells;
            if (!(list4 == null || list3 == null)) {
                list3.addAll(list4);
            }
            this.dataMap.put(str, DiscoverV4PlayListResponse.copy$default(discoverV4PlayListResponse2, discoverV4PlayListResponse.nextCursor, discoverV4PlayListResponse.hasMore, list3, null, null, 24, null));
        }
    }

    public final void updateData(String str, int i, DiscoverPlayListStructV4 discoverPlayListStructV4) {
        List list;
        boolean z;
        C52711k.m112240b(str, "key");
        C52711k.m112240b(discoverPlayListStructV4, "cell");
        Object obj = this.dataMap.get(str);
        if (obj instanceof DiscoverV4PlayListResponse) {
            DiscoverV4PlayListResponse discoverV4PlayListResponse = (DiscoverV4PlayListResponse) obj;
            List<DiscoverPlayListStructV4> list2 = discoverV4PlayListResponse.cells;
            if (list2 != null) {
                list = C52575l.m112139e((Collection<? extends T>) list2);
            } else {
                list = null;
            }
            List list3 = list;
            if (list3 != null) {
                C52751c a = C52575l.m112095a((Collection) list3);
                if (a.f130995a > i || i > a.f130996b) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    list3.set(i, discoverPlayListStructV4);
                    this.dataMap.put(str, DiscoverV4PlayListResponse.copy$default(discoverV4PlayListResponse, 0, 0, list3, null, null, 27, null));
                }
            }
        }
    }
}
