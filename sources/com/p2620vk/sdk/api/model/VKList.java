package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p2620vk.sdk.api.model.C52413a;
import com.p2620vk.sdk.api.model.VKApiModel;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKList */
public class VKList<T extends VKApiModel & Parcelable & C52413a> extends VKApiModel implements Parcelable, List<T> {
    public static Creator<VKList> CREATOR = new Creator<VKList>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKList[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKList(parcel);
        }
    };

    /* renamed from: a */
    static final /* synthetic */ boolean f130739a = (!VKList.class.desiredAssertionStatus());

    /* renamed from: b */
    private ArrayList<T> f130740b = new ArrayList<>();

    /* renamed from: c */
    private int f130741c = -1;

    /* renamed from: com.vk.sdk.api.model.VKList$a */
    public interface C52402a<D> {
        /* renamed from: a */
        D mo109344a(JSONObject jSONObject) throws Exception;
    }

    /* renamed from: com.vk.sdk.api.model.VKList$b */
    public static final class C52403b<D extends VKApiModel> implements C52402a<D> {

        /* renamed from: a */
        private final Class<? extends D> f130742a;

        public C52403b(Class<? extends D> cls) {
            this.f130742a = cls;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public D mo109344a(JSONObject jSONObject) throws Exception {
            try {
                Constructor constructor = this.f130742a.getConstructor(new Class[]{JSONObject.class});
                if (constructor != null) {
                    return (VKApiModel) constructor.newInstance(new Object[]{jSONObject});
                }
            } catch (Exception unused) {
            }
            return ((VKApiModel) this.f130742a.newInstance()).mo109175b(jSONObject);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void clear() {
        this.f130740b.clear();
    }

    public boolean isEmpty() {
        return this.f130740b.isEmpty();
    }

    public Iterator<T> iterator() {
        return this.f130740b.iterator();
    }

    public ListIterator<T> listIterator() {
        return this.f130740b.listIterator();
    }

    public int size() {
        return this.f130740b.size();
    }

    public Object[] toArray() {
        return this.f130740b.toArray();
    }

    public VKList() {
    }

    /* renamed from: a */
    public final boolean add(T t) {
        return this.f130740b.add(t);
    }

    /* renamed from: b */
    public VKApiModel mo109175b(JSONObject jSONObject) throws JSONException {
        throw new JSONException("Operation is not supported while class is generic");
    }

    public boolean contains(Object obj) {
        return this.f130740b.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return this.f130740b.containsAll(collection);
    }

    public int indexOf(Object obj) {
        return this.f130740b.indexOf(obj);
    }

    public int lastIndexOf(Object obj) {
        return this.f130740b.lastIndexOf(obj);
    }

    public boolean remove(Object obj) {
        return this.f130740b.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        return this.f130740b.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return this.f130740b.retainAll(collection);
    }

    public boolean addAll(Collection<? extends T> collection) {
        return this.f130740b.addAll(collection);
    }

    public /* bridge */ /* synthetic */ Object get(int i) {
        return (VKApiModel) this.f130740b.get(i);
    }

    public ListIterator<T> listIterator(int i) {
        return this.f130740b.listIterator(i);
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        return (VKApiModel) this.f130740b.remove(i);
    }

    public <T1> T1[] toArray(T1[] t1Arr) {
        return this.f130740b.toArray(t1Arr);
    }

    public boolean equals(Object obj) {
        if (!getClass().equals(obj.getClass()) || !this.f130740b.equals(obj)) {
            return false;
        }
        return true;
    }

    public VKList(Parcel parcel) {
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.f130740b.add((VKApiModel) parcel.readParcelable(getClass().getClassLoader()));
        }
        this.f130741c = parcel.readInt();
    }

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        this.f130740b.add(i, (VKApiModel) obj);
    }

    public boolean addAll(int i, Collection<? extends T> collection) {
        return this.f130740b.addAll(i, collection);
    }

    public List<T> subList(int i, int i2) {
        return this.f130740b.subList(i, i2);
    }

    /* renamed from: a */
    public final void mo109352a(JSONArray jSONArray, Class<? extends T> cls) {
        mo109351a(jSONArray, (C52402a<? extends T>) new C52403b<Object>(cls));
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return (VKApiModel) this.f130740b.set(i, (VKApiModel) obj);
    }

    public VKList(JSONArray jSONArray, Class<? extends T> cls) {
        mo109352a(jSONArray, cls);
    }

    /* renamed from: a */
    private void m111949a(JSONObject jSONObject, C52402a<? extends T> aVar) {
        if (jSONObject != null) {
            mo109351a(jSONObject.optJSONArray("items"), aVar);
            this.f130741c = jSONObject.optInt("count", this.f130741c);
        }
    }

    /* renamed from: a */
    public final void mo109351a(JSONArray jSONArray, C52402a<? extends T> aVar) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    VKApiModel vKApiModel = (VKApiModel) aVar.mo109344a(jSONArray.getJSONObject(i));
                    if (vKApiModel != null) {
                        this.f130740b.add(vKApiModel);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f130740b.size());
        Iterator it = iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((VKApiModel) it.next(), i);
        }
        parcel.writeInt(this.f130741c);
    }

    public VKList(JSONObject jSONObject, Class<? extends T> cls) {
        mo109353a(jSONObject, cls);
    }

    /* renamed from: a */
    public final void mo109353a(JSONObject jSONObject, Class<? extends T> cls) {
        if (jSONObject.has("response")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("response");
            if (optJSONArray != null) {
                mo109352a(optJSONArray, cls);
            } else {
                mo109353a(jSONObject.optJSONObject("response"), cls);
            }
        } else {
            m111949a(jSONObject, (C52402a<? extends T>) new C52403b<Object>(cls));
        }
    }
}
