package com.quntity;

public enum Unit {
    FEET {
        @Override
        public float convertToBase(float value) {
            return value * 12;
        }
    }, INCH {
        @Override
        public float convertToBase(float value) {
            return value;
        }
    };

    public abstract float convertToBase(float value);
}
