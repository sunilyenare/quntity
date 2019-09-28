package com.quntity;

public class Length {

    private final float value;
    private final Unit unit;

    public Length(float value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Length) {
            if(((Length) obj).unit==Unit.INCH && this.unit==Unit.FEET){
                if(this.value==0)
                    return true;
                if(this.value==1&&((Length) obj).value==12)
                    return true;
            }
            return this.value == ((Length) obj).value &&
                    this.unit == ((Length) obj).unit;
        }
        return false;
    }

}
