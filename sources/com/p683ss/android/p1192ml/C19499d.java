package com.p683ss.android.p1192ml;

import com.p683ss.android.p1192ml.process.C19507a;
import com.p683ss.android.p1192ml.process.C19520c;
import com.p683ss.android.p1192ml.process.p1194bl.MLConfigModel;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ml.d */
public interface C19499d {
    /* renamed from: a */
    float mo40657a(Map<String, Object> map, List<? extends C19520c> list, C19507a aVar, List<String> list2);

    /* renamed from: a */
    String mo40658a();

    /* renamed from: a */
    List<String> mo40659a(Map<String, Object> map, List<? extends C19520c> list, C19507a aVar, List<String> list2, Map<String, Float> map2);

    /* renamed from: a */
    void mo40660a(FileInputStream fileInputStream, MLConfigModel mLConfigModel) throws Throwable;

    /* renamed from: b */
    boolean mo40661b();
}
