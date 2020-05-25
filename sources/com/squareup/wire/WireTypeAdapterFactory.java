package com.squareup.wire;

import android.util.Pair;
import com.google.gson.C17971f;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.p1077b.C17956a;
import java.util.HashMap;
import java.util.Map;
import okio.ByteString;

public final class WireTypeAdapterFactory implements C18097x {
    private final Map<Class, Pair<Message, WireDeserializeErrorListener>> defaultValue = new HashMap();

    public final void registerDefaultValue(Message message, WireDeserializeErrorListener wireDeserializeErrorListener) {
        this.defaultValue.put(message.getClass(), new Pair(message, wireDeserializeErrorListener));
    }

    public final <T> C18095w<T> create(C17971f fVar, C17956a<T> aVar) {
        Class<? super T> cls = aVar.f49842b;
        if (cls.equals(ByteString.class)) {
            return new ByteStringTypeAdapter();
        }
        Pair pair = (Pair) this.defaultValue.get(cls);
        if (pair != null) {
            DefaultValueMessageTypeAdapter defaultValueMessageTypeAdapter = new DefaultValueMessageTypeAdapter(fVar, aVar, "", (Message) pair.first, (WireDeserializeErrorListener) pair.second);
            return defaultValueMessageTypeAdapter;
        } else if (Message.class.isAssignableFrom(cls)) {
            return new MessageTypeAdapter(fVar, aVar);
        } else {
            return null;
        }
    }
}
