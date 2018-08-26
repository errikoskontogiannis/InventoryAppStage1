package com.example.h3nry.inventoryappstage1.data;

import android.provider.BaseColumns;

public final class ProductContract {

    private ProductContract() {}

    public static final class ProductEntry implements BaseColumns {

        public final static String TABLE_NAME = "products";

        public final static String COLUMN_PRODUCT_NAME = "product_name";
        public final static String COLUMN_PRODUCT_PRICE = "price";
        public final static String COLUMN_PRODUCT_QUANTITY = "quantity";
        public final static String COLUMN_PRODUCT_SUPPLIER_NAME = "supplier_name";
        public final static String COLUMN_PRODUCT_SUPPLIER_PHONE_NUMBER = "supplier_phone_number";

    }

}
