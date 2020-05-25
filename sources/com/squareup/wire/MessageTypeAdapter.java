package com.squareup.wire;

import com.google.gson.C17971f;
import com.google.gson.C17980i;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.google.gson.C18095w;
import com.google.gson.p1077b.C17956a;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17960b;
import com.google.gson.p1078c.C17961c;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.WireField.Label;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class MessageTypeAdapter<M extends Message<M, B>, B extends Builder<M, B>> extends C18095w<M> {
    private static final BigInteger POWER_64 = new BigInteger("18446744073709551616");
    private final Map<String, FieldBinding<M, B>> fieldBindings;
    private final C17971f gson;
    private final RuntimeMessageAdapter<M, B> messageAdapter;

    public M read(C17958a aVar) throws IOException {
        if (aVar.mo34843f() == C17960b.NULL) {
            aVar.mo34847k();
            return null;
        }
        C18095w a = this.gson.mo34879a(C18082l.class);
        Builder newBuilder = this.messageAdapter.newBuilder();
        aVar.mo34839c();
        while (aVar.mo34843f() != C17960b.END_OBJECT) {
            FieldBinding fieldBinding = (FieldBinding) this.fieldBindings.get(aVar.mo34844h());
            if (fieldBinding == null) {
                aVar.mo34851o();
            } else {
                fieldBinding.set(newBuilder, parseValue(fieldBinding, (C18082l) a.read(aVar)));
            }
        }
        aVar.mo34841d();
        return newBuilder.build();
    }

    private void emitUint64(Long l, C17961c cVar) throws IOException {
        if (l.longValue() < 0) {
            cVar.mo34860a((Number) POWER_64.add(BigInteger.valueOf(l.longValue())));
        } else {
            cVar.mo34860a((Number) l);
        }
    }

    MessageTypeAdapter(C17971f fVar, C17956a<M> aVar) {
        this.gson = fVar;
        this.messageAdapter = WireFiledWorkaround.create(aVar.f49842b);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (FieldBinding fieldBinding : this.messageAdapter.fieldBindings().values()) {
            linkedHashMap.put(fieldBinding.name, fieldBinding);
        }
        this.fieldBindings = Collections.unmodifiableMap(linkedHashMap);
    }

    public void write(C17961c cVar, M m) throws IOException {
        if (m == null) {
            cVar.mo34870f();
            return;
        }
        cVar.mo34868d();
        for (FieldBinding fieldBinding : this.messageAdapter.fieldBindings().values()) {
            Object obj = fieldBinding.get(m);
            if (obj != null) {
                cVar.mo34861a(fieldBinding.name);
                emitJson(cVar, obj, fieldBinding.singleAdapter(), fieldBinding.label);
            }
        }
        cVar.mo34869e();
    }

    private Object parseValue(FieldBinding<?, ?> fieldBinding, C18082l lVar) {
        if (fieldBinding.label.isRepeated()) {
            if (lVar.mo35008l()) {
                return Collections.emptyList();
            }
            Class<?> cls = fieldBinding.singleAdapter().javaType;
            C17980i n = lVar.mo35010n();
            ArrayList arrayList = new ArrayList(n.mo34901a());
            Iterator it = n.iterator();
            while (it.hasNext()) {
                arrayList.add(this.gson.mo34881a((C18082l) it.next(), cls));
            }
            return arrayList;
        } else if (!fieldBinding.isMap()) {
            return this.gson.mo34881a(lVar, fieldBinding.singleAdapter().javaType);
        } else if (lVar.mo35008l()) {
            return Collections.emptyMap();
        } else {
            Class<?> cls2 = fieldBinding.keyAdapter().javaType;
            Class<?> cls3 = fieldBinding.singleAdapter().javaType;
            C18085o m = lVar.mo35009m();
            LinkedHashMap linkedHashMap = new LinkedHashMap(m.mo35028q());
            for (Entry entry : m.mo35016a()) {
                linkedHashMap.put(this.gson.mo34884a((String) entry.getKey(), cls2), this.gson.mo34881a((C18082l) entry.getValue(), cls3));
            }
            return linkedHashMap;
        }
    }

    private void emitJson(C17961c cVar, Object obj, ProtoAdapter<?> protoAdapter, Label label) throws IOException {
        if (protoAdapter != ProtoAdapter.UINT64) {
            this.gson.mo34888a(obj, (Type) obj.getClass(), cVar);
        } else if (label.isRepeated()) {
            List list = (List) obj;
            cVar.mo34863b();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                emitUint64((Long) list.get(i), cVar);
            }
            cVar.mo34865c();
        } else {
            emitUint64((Long) obj, cVar);
        }
    }
}
