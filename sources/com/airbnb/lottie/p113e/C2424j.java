package com.airbnb.lottie.p113e;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.p108c.p110b.C2359c;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.e.j */
public final class C2424j implements C2415af<C2359c> {

    /* renamed from: a */
    private int f7531a;

    public C2424j(int i) {
        this.f7531a = i;
    }

    /* renamed from: a */
    private void m7097a(C2359c cVar, List<Float> list) {
        int i;
        C2359c cVar2 = cVar;
        List<Float> list2 = list;
        int i2 = this.f7531a * 4;
        if (list.size() > i2) {
            int size = (list.size() - i2) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i3 = 0;
            while (i2 < list.size()) {
                if (i2 % 2 == 0) {
                    dArr[i3] = (double) ((Float) list2.get(i2)).floatValue();
                } else {
                    dArr2[i3] = (double) ((Float) list2.get(i2)).floatValue();
                    i3++;
                }
                i2++;
            }
            for (int i4 = 0; i4 < cVar.mo6741a(); i4++) {
                int i5 = cVar2.f7331b[i4];
                double d = (double) cVar2.f7330a[i4];
                int i6 = 1;
                while (true) {
                    if (i6 >= dArr.length) {
                        i = (int) (dArr2[dArr2.length - 1] * 255.0d);
                        break;
                    }
                    int i7 = i6 - 1;
                    double d2 = dArr[i7];
                    double d3 = dArr[i6];
                    if (dArr[i6] >= d) {
                        Double.isNaN(d);
                        double d4 = (d - d2) / (d3 - d2);
                        double d5 = dArr2[i7];
                        i = (int) ((d5 + (d4 * (dArr2[i6] - d5))) * 255.0d);
                        break;
                    }
                    i6++;
                }
                cVar2.f7331b[i4] = Color.argb(i, Color.red(i5), Color.green(i5), Color.blue(i5));
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo6783a(JsonReader jsonReader, float f) throws IOException {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jsonReader.beginArray();
        }
        while (jsonReader.hasNext()) {
            arrayList.add(Float.valueOf((float) jsonReader.nextDouble()));
        }
        if (z) {
            jsonReader.endArray();
        }
        if (this.f7531a == -1) {
            this.f7531a = arrayList.size() / 4;
        }
        float[] fArr = new float[this.f7531a];
        int[] iArr = new int[this.f7531a];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f7531a * 4; i3++) {
            int i4 = i3 / 4;
            double floatValue = (double) ((Float) arrayList.get(i3)).floatValue();
            switch (i3 % 4) {
                case 0:
                    fArr[i4] = (float) floatValue;
                    break;
                case 1:
                    Double.isNaN(floatValue);
                    i = (int) (floatValue * 255.0d);
                    break;
                case 2:
                    Double.isNaN(floatValue);
                    i2 = (int) (floatValue * 255.0d);
                    break;
                case 3:
                    Double.isNaN(floatValue);
                    iArr[i4] = Color.argb(NormalGiftView.ALPHA_255, i, i2, (int) (floatValue * 255.0d));
                    break;
            }
        }
        C2359c cVar = new C2359c(fArr, iArr);
        m7097a(cVar, (List<Float>) arrayList);
        return cVar;
    }
}
