package com.quntity;

public class Length {

    public static final int ONE_FEET_IN_INCH = 12;
    private final float value;
    private final Unit unit;

    public Length(float value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Length)) return false;

        if ((this.unit == Unit.FEET && ((Length) obj).unit == Unit.INCH) ||
                (this.unit == Unit.INCH && ((Length) obj).unit == Unit.FEET)) {

            if (((Length) obj).value / ONE_FEET_IN_INCH == this.value || this.value / ONE_FEET_IN_INCH == ((Length) obj).value)
                return true;
        }
        return this.value == ((Length) obj).value &&
                this.unit == ((Length) obj).unit;
    }

}
