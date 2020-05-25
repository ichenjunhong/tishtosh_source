package com.p683ss.android.p1192ml;

import com.p683ss.android.p1192ml.process.C19507a;
import com.p683ss.android.p1192ml.process.C19520c;
import com.p683ss.android.p1192ml.process.C19521d;
import com.p683ss.android.p1192ml.process.C19522e;
import com.p683ss.android.p1192ml.process.C19523f;
import com.p683ss.android.p1192ml.process.p1194bl.MLConfigModel;
import java.io.FileInputStream;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.tensorflow.lite.C53806c;
import org.tensorflow.lite.C53806c.C53807a;

/* renamed from: com.ss.android.ml.g */
public final class C19505g implements C19499d {

    /* renamed from: a */
    private C53806c f53857a;

    /* renamed from: b */
    private MappedByteBuffer f53858b;

    /* renamed from: c */
    private float[][] f53859c;

    /* renamed from: d */
    private ByteBuffer f53860d;

    /* renamed from: e */
    private String f53861e;

    /* renamed from: a */
    public final String mo40658a() {
        return this.f53861e;
    }

    /* renamed from: b */
    public final boolean mo40661b() {
        if (this.f53857a != null) {
            return true;
        }
        return false;
    }

    public C19505g(String str) {
        this.f53861e = str;
    }

    /* renamed from: a */
    private void m47770a(ByteBuffer byteBuffer, float[][] fArr) {
        System.nanoTime();
        this.f53857a.mo113440a((Object) byteBuffer, (Object) fArr);
    }

    /* renamed from: a */
    private void m47768a(C19507a aVar, Map<String, Float> map) {
        if (map != null && aVar.getLabels() != null && !aVar.getLabels().isEmpty()) {
            List<String> labels = aVar.getLabels();
            int size = labels.size();
            if (size == 2) {
                map.put(labels.get(0), Float.valueOf(1.0f - this.f53859c[0][0]));
                map.put(labels.get(1), Float.valueOf(this.f53859c[0][0]));
            } else if (size == this.f53859c[0].length) {
                int i = 0;
                for (String put : labels) {
                    int i2 = i + 1;
                    map.put(put, Float.valueOf(this.f53859c[0][i]));
                    i = i2;
                }
            }
        }
    }

    /* renamed from: a */
    private static void m47771a(List<? extends C19520c> list, HashMap<String, Object> hashMap) {
        if (list != null && !list.isEmpty()) {
            System.nanoTime();
            for (C19520c cVar : list) {
                System.nanoTime();
                C19521d dVar = new C19521d(hashMap, cVar);
                String operator = cVar.getOperator();
                C19522e a = C19523f.m47796a().mo40688a(operator);
                if (a != null) {
                    try {
                        a.mo40682a(dVar);
                    } catch (Throwable th) {
                        C19506h.m47780a(th);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(operator);
                    sb.append(" don't support now");
                    throw new RuntimeException(sb.toString());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo40660a(FileInputStream fileInputStream, MLConfigModel mLConfigModel) throws Throwable {
        int i;
        FileChannel channel = fileInputStream.getChannel();
        this.f53858b = channel.map(MapMode.READ_ONLY, channel.position(), channel.size());
        C53807a aVar = new C53807a();
        if (mLConfigModel.numThreads > 0 && mLConfigModel.numThreads <= 20) {
            aVar.f133435a = mLConfigModel.numThreads;
        }
        if (mLConfigModel.enableNNApi) {
            aVar.f133436b = Boolean.valueOf(true);
        }
        this.f53857a = new C53806c(this.f53858b, aVar);
        if (mLConfigModel.afOPModel == null || mLConfigModel.afOPModel.labels == null) {
            i = 1;
        } else {
            i = mLConfigModel.afOPModel.labels.size();
        }
        if (i == 2) {
            i = 1;
        }
        this.f53859c = (float[][]) Array.newInstance(float.class, new int[]{1, i});
        this.f53860d = ByteBuffer.allocateDirect(mLConfigModel.inputFeatureList.size() * 4);
        this.f53860d.order(ByteOrder.nativeOrder());
    }

    /* renamed from: a */
    private static void m47769a(C19507a aVar, float[] fArr, List<String> list) {
        if (aVar != null) {
            System.nanoTime();
            C19521d dVar = new C19521d(fArr, list, aVar);
            String operator = aVar.getOperator();
            C19522e a = C19523f.m47796a().mo40688a(operator);
            if (a != null) {
                try {
                    a.mo40682a(dVar);
                } catch (Throwable th) {
                    C19506h.m47780a(th);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(operator);
                sb.append(" don't support now");
                throw new RuntimeException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public final float mo40657a(Map<String, Object> map, List<? extends C19520c> list, C19507a aVar, List<String> list2) {
        float f;
        this.f53860d.clear();
        this.f53859c[0][0] = 0.0f;
        HashMap hashMap = new HashMap(map);
        m47771a(list, hashMap);
        for (String str : list2) {
            Number number = (Number) hashMap.get(str);
            ByteBuffer byteBuffer = this.f53860d;
            if (number != null) {
                f = number.floatValue();
            } else {
                f = 0.0f;
            }
            byteBuffer.putFloat(f);
        }
        m47770a(this.f53860d, this.f53859c);
        m47769a(aVar, this.f53859c[0], null);
        return this.f53859c[0][0];
    }

    /* renamed from: a */
    public final List<String> mo40659a(Map<String, Object> map, List<? extends C19520c> list, C19507a aVar, List<String> list2, Map<String, Float> map2) {
        float f;
        this.f53860d.clear();
        this.f53859c[0][0] = 0.0f;
        HashMap hashMap = new HashMap(map);
        m47771a(list, hashMap);
        for (String str : list2) {
            Number number = (Number) hashMap.get(str);
            ByteBuffer byteBuffer = this.f53860d;
            if (number != null) {
                f = number.floatValue();
            } else {
                f = 0.0f;
            }
            byteBuffer.putFloat(f);
        }
        m47770a(this.f53860d, this.f53859c);
        ArrayList arrayList = new ArrayList();
        m47769a(aVar, this.f53859c[0], arrayList);
        m47768a(aVar, map2);
        return arrayList;
    }
}
