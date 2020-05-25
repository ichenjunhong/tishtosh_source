package org.msgpack.type;

import java.util.AbstractMap;
import org.msgpack.C53798c;

abstract class AbstractMapValue extends AbstractMap<Value, Value> implements MapValue {
    AbstractMapValue() {
    }

    public MapValue asMapValue() {
        return this;
    }

    public boolean isArrayValue() {
        return false;
    }

    public boolean isBooleanValue() {
        return false;
    }

    public boolean isFloatValue() {
        return false;
    }

    public boolean isIntegerValue() {
        return false;
    }

    public boolean isMapValue() {
        return true;
    }

    public boolean isNilValue() {
        return false;
    }

    public boolean isRawValue() {
        return false;
    }

    public ArrayValue asArrayValue() {
        throw new C53798c();
    }

    public BooleanValue asBooleanValue() {
        throw new C53798c();
    }

    public FloatValue asFloatValue() {
        throw new C53798c();
    }

    public IntegerValue asIntegerValue() {
        throw new C53798c();
    }

    public RawValue asRawValue() {
        throw new C53798c();
    }
}
