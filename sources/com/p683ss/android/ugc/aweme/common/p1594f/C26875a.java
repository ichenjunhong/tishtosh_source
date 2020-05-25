package com.p683ss.android.ugc.aweme.common.p1594f;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26874f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.common.f.a */
public abstract class C26875a<T, K> extends C26832a<K> {
    public int mCount;
    public boolean mIsNewDataEmpty;
    public int mListQueryType = 1;

    public abstract List<T> getItems();

    public abstract boolean isHasMore();

    public boolean isNewDataEmpty() {
        return this.mIsNewDataEmpty;
    }

    /* access modifiers changed from: protected */
    public void loadLatestList(Object... objArr) {
    }

    /* access modifiers changed from: protected */
    public abstract void loadMoreList(Object... objArr);

    /* access modifiers changed from: protected */
    public boolean needCheckEmptyForQueryType() {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract void refreshList(Object... objArr);

    public void setItems(List<T> list) {
    }

    public boolean isDataEmpty() {
        return C9376b.m18558a((Collection<T>) getItems());
    }

    public boolean insertItem(T t) {
        int i;
        List items = getItems();
        if (items == null) {
            i = 0;
        } else {
            i = items.size();
        }
        return insertItem(t, i);
    }

    public boolean deleteItem(T t) {
        List items = getItems();
        if (C9376b.m18558a((Collection<T>) items)) {
            return false;
        }
        int indexOf = items.indexOf(t);
        boolean remove = items.remove(t);
        if (indexOf >= 0) {
            for (C26874f fVar : this.mNotifyListeners) {
                if (fVar != null && (fVar instanceof C26879e)) {
                    ((C26879e) fVar).mo46992a(indexOf);
                }
            }
        }
        return remove;
    }

    public boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        if (!needCheckEmptyForQueryType() || !isDataEmpty()) {
            this.mListQueryType = objArr[0].intValue();
        } else {
            this.mListQueryType = 1;
        }
        int i = this.mListQueryType;
        if (i != 4) {
            switch (i) {
                case 1:
                    refreshList(objArr);
                    break;
                case 2:
                    loadLatestList(objArr);
                    break;
            }
        } else {
            loadMoreList(objArr);
        }
        return true;
    }

    public boolean insertItem(T t, int i) {
        List items = getItems();
        if (C9376b.m18558a((Collection<T>) items)) {
            items = new ArrayList();
        }
        if (i < 0 || i > items.size()) {
            return false;
        }
        items.add(i, t);
        if (items.size() == 1) {
            setItems(items);
        }
        for (C26874f fVar : this.mNotifyListeners) {
            if (fVar != null && (fVar instanceof C26879e)) {
                ((C26879e) fVar).mo46993a(items, i);
            }
        }
        return true;
    }

    public boolean insertItemList(List<T> list, int i) {
        List items = getItems();
        if (C9376b.m18558a((Collection<T>) items)) {
            items = new ArrayList();
        }
        if (i < 0 || i > items.size()) {
            return false;
        }
        items.addAll(i, list);
        if (items.size() == 1) {
            setItems(items);
        }
        for (C26874f fVar : this.mNotifyListeners) {
            if (fVar != null && (fVar instanceof C26879e)) {
                ((C26879e) fVar).mo46993a(items, i);
            }
        }
        return true;
    }
}
